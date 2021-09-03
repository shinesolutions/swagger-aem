use async_trait::async_trait;
use futures::{Stream, future, future::BoxFuture, stream, future::TryFutureExt, future::FutureExt, stream::StreamExt};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use hyper::{Body, Request, Response, service::Service, Uri};
use percent_encoding::{utf8_percent_encode, AsciiSet};
use std::borrow::Cow;
use std::convert::TryInto;
use std::io::{ErrorKind, Read};
use std::error::Error;
use std::future::Future;
use std::fmt;
use std::marker::PhantomData;
use std::path::Path;
use std::sync::{Arc, Mutex};
use std::str;
use std::str::FromStr;
use std::string::ToString;
use std::task::{Context, Poll};
use swagger::{ApiError, AuthData, BodyExt, Connector, DropContextService, Has, XSpanIdString};
use url::form_urlencoded;

use mime::Mime;
use std::io::Cursor;
use multipart::client::lazy::Multipart;

use crate::models;
use crate::header;

/// https://url.spec.whatwg.org/#fragment-percent-encode-set
#[allow(dead_code)]
const FRAGMENT_ENCODE_SET: &AsciiSet = &percent_encoding::CONTROLS
    .add(b' ').add(b'"').add(b'<').add(b'>').add(b'`');

/// This encode set is used for object IDs
///
/// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
/// the vertical bar (|) is encoded.
#[allow(dead_code)]
const ID_ENCODE_SET: &AsciiSet = &FRAGMENT_ENCODE_SET.add(b'|');

use crate::{Api,
     GetAemProductInfoResponse,
     GetBundleInfoResponse,
     GetConfigMgrResponse,
     PostBundleResponse,
     PostJmxRepositoryResponse,
     PostSamlConfigurationResponse,
     GetLoginPageResponse,
     PostCqActionsResponse,
     GetCrxdeStatusResponse,
     GetInstallStatusResponse,
     GetPackageManagerServletResponse,
     PostPackageServiceResponse,
     PostPackageServiceJsonResponse,
     PostPackageUpdateResponse,
     PostSetPasswordResponse,
     GetAemHealthCheckResponse,
     PostConfigAemHealthCheckServletResponse,
     PostConfigAemPasswordResetResponse,
     SslSetupResponse,
     DeleteAgentResponse,
     DeleteNodeResponse,
     GetAgentResponse,
     GetAgentsResponse,
     GetAuthorizableKeystoreResponse,
     GetKeystoreResponse,
     GetNodeResponse,
     GetPackageResponse,
     GetPackageFilterResponse,
     GetQueryResponse,
     GetTruststoreResponse,
     GetTruststoreInfoResponse,
     PostAgentResponse,
     PostAuthorizableKeystoreResponse,
     PostAuthorizablesResponse,
     PostConfigAdobeGraniteSamlAuthenticationHandlerResponse,
     PostConfigApacheFelixJettyBasedHttpServiceResponse,
     PostConfigApacheHttpComponentsProxyConfigurationResponse,
     PostConfigApacheSlingDavExServletResponse,
     PostConfigApacheSlingGetServletResponse,
     PostConfigApacheSlingReferrerFilterResponse,
     PostConfigPropertyResponse,
     PostNodeResponse,
     PostNodeRwResponse,
     PostPathResponse,
     PostQueryResponse,
     PostTreeActivationResponse,
     PostTruststoreResponse,
     PostTruststorePKCS12Response
     };

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: impl TryInto<Uri, Error=hyper::http::uri::InvalidUri>, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = input.try_into()?;

    let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or_else(|| ClientInitError::MissingHost)?;
    let port = uri.port_u16().map(|x| format!(":{}", x)).unwrap_or_default();
    Ok(format!("{}://{}{}{}", scheme, host, port, uri.path().trim_end_matches('/')))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Inner service
    client_service: S,

    /// Base path of the API
    base_path: String,

    /// Marker
    marker: PhantomData<fn(C)>,
}

impl<S, C> fmt::Debug for Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<S, C> Clone for Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Self {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone(),
            marker: PhantomData,
        }
    }
}

impl<Connector, C> Client<DropContextService<hyper::client::Client<Connector, Body>, C>, C> where
    Connector: hyper::client::connect::Connect + Clone + Send + Sync + 'static,
    C: Clone + Send + Sync + 'static,
{
    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with `swagger::Connector::builder()`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `base_path` - base path of the client API, i.e. "http://www.my-api-implementation.com"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector` - Implementation of `hyper::client::Connect` to use for the client
    pub fn try_new_with_connector(
        base_path: &str,
        protocol: Option<&'static str>,
        connector: Connector,
    ) -> Result<Self, ClientInitError>
    {
        let client_service = hyper::client::Client::builder().build(connector);
        let client_service = DropContextService::new(client_service);

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, protocol)?,
            marker: PhantomData,
        })
    }
}

#[derive(Debug, Clone)]
pub enum HyperClient {
    Http(hyper::client::Client<hyper::client::HttpConnector, Body>),
    Https(hyper::client::Client<HttpsConnector, Body>),
}

impl Service<Request<Body>> for HyperClient {
    type Response = Response<Body>;
    type Error = hyper::Error;
    type Future = hyper::client::ResponseFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
       match self {
          HyperClient::Http(client) => client.poll_ready(cx),
          HyperClient::Https(client) => client.poll_ready(cx),
       }
    }

    fn call(&mut self, req: Request<Body>) -> Self::Future {
       match self {
          HyperClient::Http(client) => client.call(req),
          HyperClient::Https(client) => client.call(req)
       }
    }
}

impl<C> Client<DropContextService<HyperClient, C>, C> where
    C: Clone + Send + Sync + 'static,
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "http://www.my-api-implementation.com"
    pub fn try_new(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let uri = Uri::from_str(base_path)?;

        let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;
        let scheme = scheme.to_ascii_lowercase();

        let connector = Connector::builder();

        let client_service = match scheme.as_str() {
            "http" => {
                HyperClient::Http(hyper::client::Client::builder().build(connector.build()))
            },
            "https" => {
                let connector = connector.https()
                   .build()
                   .map_err(|e| ClientInitError::SslError(e))?;
                HyperClient::Https(hyper::client::Client::builder().build(connector))
            },
            _ => {
                return Err(ClientInitError::InvalidScheme);
            }
        };

        let client_service = DropContextService::new(client_service);

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

impl<C> Client<DropContextService<hyper::client::Client<hyper::client::HttpConnector, Body>, C>, C> where
    C: Clone + Send + Sync + 'static
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "http://www.my-api-implementation.com"
    pub fn try_new_http(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let http_connector = Connector::builder().build();

        Self::try_new_with_connector(base_path, Some("http"), http_connector)
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
type HttpsConnector = hyper_tls::HttpsConnector<hyper::client::HttpConnector>;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
type HttpsConnector = hyper_openssl::HttpsConnector<hyper::client::HttpConnector>;

impl<C> Client<DropContextService<hyper::client::Client<HttpsConnector, Body>, C>, C> where
    C: Clone + Send + Sync + 'static
{
    /// Create a client with a TLS connection to the server
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "https://www.my-api-implementation.com"
    pub fn try_new_https(base_path: &str) -> Result<Self, ClientInitError>
    {
        let https_connector = Connector::builder()
            .https()
            .build()
            .map_err(|e| ClientInitError::SslError(e))?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a TLS connection to the server using a pinned certificate
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "https://www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_pinned<CA>(
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .build()
            .map_err(|e| ClientInitError::SslError(e))?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "https://www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_mutual<CA, K, D>(
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: D,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        D: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .client_authentication(client_key, client_certificate)
            .build()
            .map_err(|e| ClientInitError::SslError(e))?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }
}

impl<S, C> Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper::service::Service` /
    /// `tower::Service`
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(
        client_service: S,
        base_path: &str,
    ) -> Result<Self, ClientInitError>
    {
        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

/// Error type failing to create a Client
#[derive(Debug)]
pub enum ClientInitError {
    /// Invalid URL Scheme
    InvalidScheme,

    /// Invalid URI
    InvalidUri(hyper::http::uri::InvalidUri),

    /// Missing Hostname
    MissingHost,

    /// SSL Connection Error
    #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
    SslError(native_tls::Error),

    /// SSL Connection Error
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    SslError(openssl::error::ErrorStack),
}

impl From<hyper::http::uri::InvalidUri> for ClientInitError {
    fn from(err: hyper::http::uri::InvalidUri) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        let s: &dyn fmt::Debug = self;
        s.fmt(f)
    }
}

impl Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}

#[async_trait]
impl<S, C> Api<C> for Client<S, C> where
    S: Service<
       (Request<Body>, C),
       Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Has<XSpanIdString> + Has<Option<AuthData>> + Clone + Send + Sync + 'static,
{
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), crate::ServiceError>> {
        match self.client_service.clone().poll_ready(cx) {
            Poll::Ready(Err(e)) => Poll::Ready(Err(e.into())),
            Poll::Ready(Ok(o)) => Poll::Ready(Ok(o)),
            Poll::Pending => Poll::Pending,
        }
    }

    async fn get_aem_product_info(
        &self,
        context: &C) -> Result<GetAemProductInfoResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/system/console/status-productinfo.json",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<String>>(body)?;
                Ok(GetAemProductInfoResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_bundle_info(
        &self,
        param_name: String,
        context: &C) -> Result<GetBundleInfoResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/system/console/bundles/{name}.json",
            self.base_path
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BundleInfo>(body)?;
                Ok(GetBundleInfoResponse::RetrievedBundleInfo
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(GetBundleInfoResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_config_mgr(
        &self,
        context: &C) -> Result<GetConfigMgrResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/system/console/configMgr",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                // ToDo: this will move to swagger-rs and become a standard From conversion trait
                // once https://github.com/RReverser/serde-xml-rs/pull/45 is accepted upstream
                let body = serde_xml_rs::from_str::<String>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {}", e)))?;
                Ok(GetConfigMgrResponse::OK
                    (body)
                )
            }
            5XX => {
                let body = response.into_body();
                Ok(
                    GetConfigMgrResponse::UnexpectedError
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_bundle(
        &self,
        param_name: String,
        param_action: String,
        context: &C) -> Result<PostBundleResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/system/console/bundles/{name}",
            self.base_path
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("action",
                    &param_action.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostBundleResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_jmx_repository(
        &self,
        param_action: String,
        context: &C) -> Result<PostJmxRepositoryResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}",
            self.base_path
            ,action=utf8_percent_encode(&param_action.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostJmxRepositoryResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_saml_configuration(
        &self,
        param_post: Option<bool>,
        param_apply: Option<bool>,
        param_delete: Option<bool>,
        param_action: Option<String>,
        param_location: Option<String>,
        param_path: Option<&Vec<String>>,
        param_service_ranking: Option<i32>,
        param_idp_url: Option<String>,
        param_idp_cert_alias: Option<String>,
        param_idp_http_redirect: Option<bool>,
        param_service_provider_entity_id: Option<String>,
        param_assertion_consumer_service_url: Option<String>,
        param_sp_private_key_alias: Option<String>,
        param_key_store_password: Option<String>,
        param_default_redirect_url: Option<String>,
        param_user_id_attribute: Option<String>,
        param_use_encryption: Option<bool>,
        param_create_user: Option<bool>,
        param_add_group_memberships: Option<bool>,
        param_group_membership_attribute: Option<String>,
        param_default_groups: Option<&Vec<String>>,
        param_name_id_format: Option<String>,
        param_synchronize_attributes: Option<&Vec<String>>,
        param_handle_logout: Option<bool>,
        param_logout_url: Option<String>,
        param_clock_tolerance: Option<i32>,
        param_digest_method: Option<String>,
        param_signature_method: Option<String>,
        param_user_intermediate_path: Option<String>,
        param_propertylist: Option<&Vec<String>>,
        context: &C) -> Result<PostSamlConfigurationResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_post) = param_post {
                query_string.append_pair("post",
                    &param_post.to_string());
            }
            if let Some(param_apply) = param_apply {
                query_string.append_pair("apply",
                    &param_apply.to_string());
            }
            if let Some(param_delete) = param_delete {
                query_string.append_pair("delete",
                    &param_delete.to_string());
            }
            if let Some(param_action) = param_action {
                query_string.append_pair("action",
                    &param_action.to_string());
            }
            if let Some(param_location) = param_location {
                query_string.append_pair("$location",
                    &param_location.to_string());
            }
            if let Some(param_path) = param_path {
                query_string.append_pair("path",
                    &param_path.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_service_ranking) = param_service_ranking {
                query_string.append_pair("service.ranking",
                    &param_service_ranking.to_string());
            }
            if let Some(param_idp_url) = param_idp_url {
                query_string.append_pair("idpUrl",
                    &param_idp_url.to_string());
            }
            if let Some(param_idp_cert_alias) = param_idp_cert_alias {
                query_string.append_pair("idpCertAlias",
                    &param_idp_cert_alias.to_string());
            }
            if let Some(param_idp_http_redirect) = param_idp_http_redirect {
                query_string.append_pair("idpHttpRedirect",
                    &param_idp_http_redirect.to_string());
            }
            if let Some(param_service_provider_entity_id) = param_service_provider_entity_id {
                query_string.append_pair("serviceProviderEntityId",
                    &param_service_provider_entity_id.to_string());
            }
            if let Some(param_assertion_consumer_service_url) = param_assertion_consumer_service_url {
                query_string.append_pair("assertionConsumerServiceURL",
                    &param_assertion_consumer_service_url.to_string());
            }
            if let Some(param_sp_private_key_alias) = param_sp_private_key_alias {
                query_string.append_pair("spPrivateKeyAlias",
                    &param_sp_private_key_alias.to_string());
            }
            if let Some(param_key_store_password) = param_key_store_password {
                query_string.append_pair("keyStorePassword",
                    &param_key_store_password.to_string());
            }
            if let Some(param_default_redirect_url) = param_default_redirect_url {
                query_string.append_pair("defaultRedirectUrl",
                    &param_default_redirect_url.to_string());
            }
            if let Some(param_user_id_attribute) = param_user_id_attribute {
                query_string.append_pair("userIDAttribute",
                    &param_user_id_attribute.to_string());
            }
            if let Some(param_use_encryption) = param_use_encryption {
                query_string.append_pair("useEncryption",
                    &param_use_encryption.to_string());
            }
            if let Some(param_create_user) = param_create_user {
                query_string.append_pair("createUser",
                    &param_create_user.to_string());
            }
            if let Some(param_add_group_memberships) = param_add_group_memberships {
                query_string.append_pair("addGroupMemberships",
                    &param_add_group_memberships.to_string());
            }
            if let Some(param_group_membership_attribute) = param_group_membership_attribute {
                query_string.append_pair("groupMembershipAttribute",
                    &param_group_membership_attribute.to_string());
            }
            if let Some(param_default_groups) = param_default_groups {
                query_string.append_pair("defaultGroups",
                    &param_default_groups.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_name_id_format) = param_name_id_format {
                query_string.append_pair("nameIdFormat",
                    &param_name_id_format.to_string());
            }
            if let Some(param_synchronize_attributes) = param_synchronize_attributes {
                query_string.append_pair("synchronizeAttributes",
                    &param_synchronize_attributes.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_handle_logout) = param_handle_logout {
                query_string.append_pair("handleLogout",
                    &param_handle_logout.to_string());
            }
            if let Some(param_logout_url) = param_logout_url {
                query_string.append_pair("logoutUrl",
                    &param_logout_url.to_string());
            }
            if let Some(param_clock_tolerance) = param_clock_tolerance {
                query_string.append_pair("clockTolerance",
                    &param_clock_tolerance.to_string());
            }
            if let Some(param_digest_method) = param_digest_method {
                query_string.append_pair("digestMethod",
                    &param_digest_method.to_string());
            }
            if let Some(param_signature_method) = param_signature_method {
                query_string.append_pair("signatureMethod",
                    &param_signature_method.to_string());
            }
            if let Some(param_user_intermediate_path) = param_user_intermediate_path {
                query_string.append_pair("userIntermediatePath",
                    &param_user_intermediate_path.to_string());
            }
            if let Some(param_propertylist) = param_propertylist {
                query_string.append_pair("propertylist",
                    &param_propertylist.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostSamlConfigurationResponse::RetrievedAEMSAMLConfiguration
                    (body)
                )
            }
            302 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostSamlConfigurationResponse::DefaultResponse
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostSamlConfigurationResponse::DefaultResponse_2
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_login_page(
        &self,
        context: &C) -> Result<GetLoginPageResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/libs/granite/core/content/login.html",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(GetLoginPageResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_cq_actions(
        &self,
        param_authorizable_id: String,
        param_changelog: String,
        context: &C) -> Result<PostCqActionsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/.cqactions.html",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("authorizableId",
                    &param_authorizable_id.to_string());
                query_string.append_pair("changelog",
                    &param_changelog.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostCqActionsResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_crxde_status(
        &self,
        context: &C) -> Result<GetCrxdeStatusResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/crx/server/crx.default/jcr:root/.1.json",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(GetCrxdeStatusResponse::CRXDEIsEnabled
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(GetCrxdeStatusResponse::CRXDEIsDisabled
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_install_status(
        &self,
        context: &C) -> Result<GetInstallStatusResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/crx/packmgr/installstatus.jsp",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::InstallStatus>(body)?;
                Ok(GetInstallStatusResponse::RetrievedCRXPackageManagerInstallStatus
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(GetInstallStatusResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_package_manager_servlet(
        &self,
        context: &C) -> Result<GetPackageManagerServletResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/crx/packmgr/service/script.html",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(GetPackageManagerServletResponse::PackageManagerServletIsDisabled
                    (body)
                )
            }
            405 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(GetPackageManagerServletResponse::PackageManagerServletIsActive
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_package_service(
        &self,
        param_cmd: String,
        context: &C) -> Result<PostPackageServiceResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/crx/packmgr/service.jsp",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("cmd",
                    &param_cmd.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                // ToDo: this will move to swagger-rs and become a standard From conversion trait
                // once https://github.com/RReverser/serde-xml-rs/pull/45 is accepted upstream
                let body = serde_xml_rs::from_str::<String>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {}", e)))?;
                Ok(PostPackageServiceResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_package_service_json(
        &self,
        param_path: String,
        param_cmd: String,
        param_group_name: Option<String>,
        param_package_name: Option<String>,
        param_package_version: Option<String>,
        param__charset_: Option<String>,
        param_force: Option<bool>,
        param_recursive: Option<bool>,
        param_package: Option<swagger::ByteArray>,
        context: &C) -> Result<PostPackageServiceJsonResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/crx/packmgr/service/.json/{path}",
            self.base_path
            ,path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("cmd",
                    &param_cmd.to_string());
            if let Some(param_group_name) = param_group_name {
                query_string.append_pair("groupName",
                    &param_group_name.to_string());
            }
            if let Some(param_package_name) = param_package_name {
                query_string.append_pair("packageName",
                    &param_package_name.to_string());
            }
            if let Some(param_package_version) = param_package_version {
                query_string.append_pair("packageVersion",
                    &param_package_version.to_string());
            }
            if let Some(param__charset_) = param__charset_ {
                query_string.append_pair("_charset_",
                    &param__charset_.to_string());
            }
            if let Some(param_force) = param_force {
                query_string.append_pair("force",
                    &param_force.to_string());
            }
            if let Some(param_recursive) = param_recursive {
                query_string.append_pair("recursive",
                    &param_recursive.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let (body_string, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let package_str = match serde_json::to_string(&param_package) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize package to string: {}", e))),
            };

            let package_vec = package_str.as_bytes().to_vec();
            let package_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let package_cursor = Cursor::new(package_vec);

            multipart.add_stream("package",  package_cursor,  None as Option<&str>, Some(package_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {}", err))),
            };

            let mut body_string = String::new();

            match fields.read_to_string(&mut body_string) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {}", err))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={}", boundary);

            (body_string, multipart_header)
        };

        *request.body_mut() = Body::from(body_string);

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", multipart_header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(PostPackageServiceJsonResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_package_update(
        &self,
        param_group_name: String,
        param_package_name: String,
        param_version: String,
        param_path: String,
        param_filter: Option<String>,
        param__charset_: Option<String>,
        context: &C) -> Result<PostPackageUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/crx/packmgr/update.jsp",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("groupName",
                    &param_group_name.to_string());
                query_string.append_pair("packageName",
                    &param_package_name.to_string());
                query_string.append_pair("version",
                    &param_version.to_string());
                query_string.append_pair("path",
                    &param_path.to_string());
            if let Some(param_filter) = param_filter {
                query_string.append_pair("filter",
                    &param_filter.to_string());
            }
            if let Some(param__charset_) = param__charset_ {
                query_string.append_pair("_charset_",
                    &param__charset_.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(PostPackageUpdateResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_set_password(
        &self,
        param_old: String,
        param_plain: String,
        param_verify: String,
        context: &C) -> Result<PostSetPasswordResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/crx/explorer/ui/setpassword.jsp",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("old",
                    &param_old.to_string());
                query_string.append_pair("plain",
                    &param_plain.to_string());
                query_string.append_pair("verify",
                    &param_verify.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostSetPasswordResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_aem_health_check(
        &self,
        param_tags: Option<String>,
        param_combine_tags_or: Option<bool>,
        context: &C) -> Result<GetAemHealthCheckResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/system/health",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_tags) = param_tags {
                query_string.append_pair("tags",
                    &param_tags.to_string());
            }
            if let Some(param_combine_tags_or) = param_combine_tags_or {
                query_string.append_pair("combineTagsOr",
                    &param_combine_tags_or.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(GetAemHealthCheckResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_aem_health_check_servlet(
        &self,
        param_bundles_ignored: Option<&Vec<String>>,
        param_bundles_ignored_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAemHealthCheckServletResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bundles_ignored) = param_bundles_ignored {
                query_string.append_pair("bundles.ignored",
                    &param_bundles_ignored.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_bundles_ignored_type_hint) = param_bundles_ignored_type_hint {
                query_string.append_pair("bundles.ignored@TypeHint",
                    &param_bundles_ignored_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigAemHealthCheckServletResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_aem_password_reset(
        &self,
        param_pwdreset_authorizables: Option<&Vec<String>>,
        param_pwdreset_authorizables_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAemPasswordResetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/com.shinesolutions.aem.passwordreset.Activator",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_pwdreset_authorizables) = param_pwdreset_authorizables {
                query_string.append_pair("pwdreset.authorizables",
                    &param_pwdreset_authorizables.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_pwdreset_authorizables_type_hint) = param_pwdreset_authorizables_type_hint {
                query_string.append_pair("pwdreset.authorizables@TypeHint",
                    &param_pwdreset_authorizables_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigAemPasswordResetResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn ssl_setup(
        &self,
        param_keystore_password: String,
        param_keystore_password_confirm: String,
        param_truststore_password: String,
        param_truststore_password_confirm: String,
        param_https_hostname: String,
        param_https_port: String,
        param_privatekey_file: Option<swagger::ByteArray>,
        param_certificate_file: Option<swagger::ByteArray>,
        context: &C) -> Result<SslSetupResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/libs/granite/security/post/sslSetup.html",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("keystorePassword",
                    &param_keystore_password.to_string());
                query_string.append_pair("keystorePasswordConfirm",
                    &param_keystore_password_confirm.to_string());
                query_string.append_pair("truststorePassword",
                    &param_truststore_password.to_string());
                query_string.append_pair("truststorePasswordConfirm",
                    &param_truststore_password_confirm.to_string());
                query_string.append_pair("httpsHostname",
                    &param_https_hostname.to_string());
                query_string.append_pair("httpsPort",
                    &param_https_port.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let (body_string, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let privatekey_file_str = match serde_json::to_string(&param_privatekey_file) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize privatekey_file to string: {}", e))),
            };

            let privatekey_file_vec = privatekey_file_str.as_bytes().to_vec();
            let privatekey_file_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let privatekey_file_cursor = Cursor::new(privatekey_file_vec);

            multipart.add_stream("privatekey_file",  privatekey_file_cursor,  None as Option<&str>, Some(privatekey_file_mime));


            let certificate_file_str = match serde_json::to_string(&param_certificate_file) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize certificate_file to string: {}", e))),
            };

            let certificate_file_vec = certificate_file_str.as_bytes().to_vec();
            let certificate_file_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let certificate_file_cursor = Cursor::new(certificate_file_vec);

            multipart.add_stream("certificate_file",  certificate_file_cursor,  None as Option<&str>, Some(certificate_file_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {}", err))),
            };

            let mut body_string = String::new();

            match fields.read_to_string(&mut body_string) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {}", err))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={}", boundary);

            (body_string, multipart_header)
        };

        *request.body_mut() = Body::from(body_string);

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", multipart_header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(SslSetupResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn delete_agent(
        &self,
        param_runmode: String,
        param_name: String,
        context: &C) -> Result<DeleteAgentResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/replication/agents.{runmode}/{name}",
            self.base_path
            ,runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    DeleteAgentResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn delete_node(
        &self,
        param_path: String,
        param_name: String,
        context: &C) -> Result<DeleteNodeResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{path}/{name}",
            self.base_path
            ,path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    DeleteNodeResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_agent(
        &self,
        param_runmode: String,
        param_name: String,
        context: &C) -> Result<GetAgentResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/replication/agents.{runmode}/{name}",
            self.base_path
            ,runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    GetAgentResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_agents(
        &self,
        param_runmode: String,
        context: &C) -> Result<GetAgentsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/replication/agents.{runmode}.-1.json",
            self.base_path
            ,runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(GetAgentsResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_authorizable_keystore(
        &self,
        param_intermediate_path: String,
        param_authorizable_id: String,
        context: &C) -> Result<GetAuthorizableKeystoreResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{intermediate_path}/{authorizable_id}.ks.json",
            self.base_path
            ,intermediate_path=utf8_percent_encode(&param_intermediate_path.to_string(), ID_ENCODE_SET)
            ,authorizable_id=utf8_percent_encode(&param_authorizable_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(GetAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(GetAuthorizableKeystoreResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_keystore(
        &self,
        param_intermediate_path: String,
        param_authorizable_id: String,
        context: &C) -> Result<GetKeystoreResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{intermediate_path}/{authorizable_id}/keystore/store.p12",
            self.base_path
            ,intermediate_path=utf8_percent_encode(&param_intermediate_path.to_string(), ID_ENCODE_SET)
            ,authorizable_id=utf8_percent_encode(&param_authorizable_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = swagger::ByteArray(body.to_vec());
                Ok(GetKeystoreResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_node(
        &self,
        param_path: String,
        param_name: String,
        context: &C) -> Result<GetNodeResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{path}/{name}",
            self.base_path
            ,path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    GetNodeResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_package(
        &self,
        param_group: String,
        param_name: String,
        param_version: String,
        context: &C) -> Result<GetPackageResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/packages/{group}/{name}-{version}.zip",
            self.base_path
            ,group=utf8_percent_encode(&param_group.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
            ,version=utf8_percent_encode(&param_version.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = swagger::ByteArray(body.to_vec());
                Ok(GetPackageResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_package_filter(
        &self,
        param_group: String,
        param_name: String,
        param_version: String,
        context: &C) -> Result<GetPackageFilterResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json",
            self.base_path
            ,group=utf8_percent_encode(&param_group.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
            ,version=utf8_percent_encode(&param_version.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(GetPackageFilterResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_query(
        &self,
        param_path: String,
        param_p_limit: f64,
        param_param_1_property: String,
        param_param_1_property_value: String,
        context: &C) -> Result<GetQueryResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/bin/querybuilder.json",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("path",
                    &param_path.to_string());
                query_string.append_pair("p.limit",
                    &param_p_limit.to_string());
                query_string.append_pair("1_property",
                    &param_param_1_property.to_string());
                query_string.append_pair("1_property.value",
                    &param_param_1_property_value.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(GetQueryResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_truststore(
        &self,
        context: &C) -> Result<GetTruststoreResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/truststore/truststore.p12",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = swagger::ByteArray(body.to_vec());
                Ok(GetTruststoreResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn get_truststore_info(
        &self,
        context: &C) -> Result<GetTruststoreInfoResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/libs/granite/security/truststore.json",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::TruststoreInfo>(body)?;
                Ok(GetTruststoreInfoResponse::RetrievedAEMTruststoreInfo
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(GetTruststoreInfoResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_agent(
        &self,
        param_runmode: String,
        param_name: String,
        param_jcrcontent_cqdistribute: Option<bool>,
        param_jcrcontent_cqdistribute_type_hint: Option<String>,
        param_jcrcontent_cqname: Option<String>,
        param_jcrcontent_cqtemplate: Option<String>,
        param_jcrcontent_enabled: Option<bool>,
        param_jcrcontent_jcrdescription: Option<String>,
        param_jcrcontent_jcrlast_modified: Option<String>,
        param_jcrcontent_jcrlast_modified_by: Option<String>,
        param_jcrcontent_jcrmixin_types: Option<String>,
        param_jcrcontent_jcrtitle: Option<String>,
        param_jcrcontent_log_level: Option<String>,
        param_jcrcontent_no_status_update: Option<bool>,
        param_jcrcontent_no_versioning: Option<bool>,
        param_jcrcontent_protocol_connect_timeout: Option<f64>,
        param_jcrcontent_protocol_http_connection_closed: Option<bool>,
        param_jcrcontent_protocol_http_expired: Option<String>,
        param_jcrcontent_protocol_http_headers: Option<&Vec<String>>,
        param_jcrcontent_protocol_http_headers_type_hint: Option<String>,
        param_jcrcontent_protocol_http_method: Option<String>,
        param_jcrcontent_protocol_https_relaxed: Option<bool>,
        param_jcrcontent_protocol_interface: Option<String>,
        param_jcrcontent_protocol_socket_timeout: Option<f64>,
        param_jcrcontent_protocol_version: Option<String>,
        param_jcrcontent_proxy_ntlm_domain: Option<String>,
        param_jcrcontent_proxy_ntlm_host: Option<String>,
        param_jcrcontent_proxy_host: Option<String>,
        param_jcrcontent_proxy_password: Option<String>,
        param_jcrcontent_proxy_port: Option<f64>,
        param_jcrcontent_proxy_user: Option<String>,
        param_jcrcontent_queue_batch_max_size: Option<f64>,
        param_jcrcontent_queue_batch_mode: Option<String>,
        param_jcrcontent_queue_batch_wait_time: Option<f64>,
        param_jcrcontent_retry_delay: Option<String>,
        param_jcrcontent_reverse_replication: Option<bool>,
        param_jcrcontent_serialization_type: Option<String>,
        param_jcrcontent_slingresource_type: Option<String>,
        param_jcrcontent_ssl: Option<String>,
        param_jcrcontent_transport_ntlm_domain: Option<String>,
        param_jcrcontent_transport_ntlm_host: Option<String>,
        param_jcrcontent_transport_password: Option<String>,
        param_jcrcontent_transport_uri: Option<String>,
        param_jcrcontent_transport_user: Option<String>,
        param_jcrcontent_trigger_distribute: Option<bool>,
        param_jcrcontent_trigger_modified: Option<bool>,
        param_jcrcontent_trigger_on_off_time: Option<bool>,
        param_jcrcontent_trigger_receive: Option<bool>,
        param_jcrcontent_trigger_specific: Option<bool>,
        param_jcrcontent_user_id: Option<String>,
        param_jcrprimary_type: Option<String>,
        param_operation: Option<String>,
        context: &C) -> Result<PostAgentResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/replication/agents.{runmode}/{name}",
            self.base_path
            ,runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_jcrcontent_cqdistribute) = param_jcrcontent_cqdistribute {
                query_string.append_pair("jcr:content/cq:distribute",
                    &param_jcrcontent_cqdistribute.to_string());
            }
            if let Some(param_jcrcontent_cqdistribute_type_hint) = param_jcrcontent_cqdistribute_type_hint {
                query_string.append_pair("jcr:content/cq:distribute@TypeHint",
                    &param_jcrcontent_cqdistribute_type_hint.to_string());
            }
            if let Some(param_jcrcontent_cqname) = param_jcrcontent_cqname {
                query_string.append_pair("jcr:content/cq:name",
                    &param_jcrcontent_cqname.to_string());
            }
            if let Some(param_jcrcontent_cqtemplate) = param_jcrcontent_cqtemplate {
                query_string.append_pair("jcr:content/cq:template",
                    &param_jcrcontent_cqtemplate.to_string());
            }
            if let Some(param_jcrcontent_enabled) = param_jcrcontent_enabled {
                query_string.append_pair("jcr:content/enabled",
                    &param_jcrcontent_enabled.to_string());
            }
            if let Some(param_jcrcontent_jcrdescription) = param_jcrcontent_jcrdescription {
                query_string.append_pair("jcr:content/jcr:description",
                    &param_jcrcontent_jcrdescription.to_string());
            }
            if let Some(param_jcrcontent_jcrlast_modified) = param_jcrcontent_jcrlast_modified {
                query_string.append_pair("jcr:content/jcr:lastModified",
                    &param_jcrcontent_jcrlast_modified.to_string());
            }
            if let Some(param_jcrcontent_jcrlast_modified_by) = param_jcrcontent_jcrlast_modified_by {
                query_string.append_pair("jcr:content/jcr:lastModifiedBy",
                    &param_jcrcontent_jcrlast_modified_by.to_string());
            }
            if let Some(param_jcrcontent_jcrmixin_types) = param_jcrcontent_jcrmixin_types {
                query_string.append_pair("jcr:content/jcr:mixinTypes",
                    &param_jcrcontent_jcrmixin_types.to_string());
            }
            if let Some(param_jcrcontent_jcrtitle) = param_jcrcontent_jcrtitle {
                query_string.append_pair("jcr:content/jcr:title",
                    &param_jcrcontent_jcrtitle.to_string());
            }
            if let Some(param_jcrcontent_log_level) = param_jcrcontent_log_level {
                query_string.append_pair("jcr:content/logLevel",
                    &param_jcrcontent_log_level.to_string());
            }
            if let Some(param_jcrcontent_no_status_update) = param_jcrcontent_no_status_update {
                query_string.append_pair("jcr:content/noStatusUpdate",
                    &param_jcrcontent_no_status_update.to_string());
            }
            if let Some(param_jcrcontent_no_versioning) = param_jcrcontent_no_versioning {
                query_string.append_pair("jcr:content/noVersioning",
                    &param_jcrcontent_no_versioning.to_string());
            }
            if let Some(param_jcrcontent_protocol_connect_timeout) = param_jcrcontent_protocol_connect_timeout {
                query_string.append_pair("jcr:content/protocolConnectTimeout",
                    &param_jcrcontent_protocol_connect_timeout.to_string());
            }
            if let Some(param_jcrcontent_protocol_http_connection_closed) = param_jcrcontent_protocol_http_connection_closed {
                query_string.append_pair("jcr:content/protocolHTTPConnectionClosed",
                    &param_jcrcontent_protocol_http_connection_closed.to_string());
            }
            if let Some(param_jcrcontent_protocol_http_expired) = param_jcrcontent_protocol_http_expired {
                query_string.append_pair("jcr:content/protocolHTTPExpired",
                    &param_jcrcontent_protocol_http_expired.to_string());
            }
            if let Some(param_jcrcontent_protocol_http_headers) = param_jcrcontent_protocol_http_headers {
                query_string.append_pair("jcr:content/protocolHTTPHeaders",
                    &param_jcrcontent_protocol_http_headers.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_jcrcontent_protocol_http_headers_type_hint) = param_jcrcontent_protocol_http_headers_type_hint {
                query_string.append_pair("jcr:content/protocolHTTPHeaders@TypeHint",
                    &param_jcrcontent_protocol_http_headers_type_hint.to_string());
            }
            if let Some(param_jcrcontent_protocol_http_method) = param_jcrcontent_protocol_http_method {
                query_string.append_pair("jcr:content/protocolHTTPMethod",
                    &param_jcrcontent_protocol_http_method.to_string());
            }
            if let Some(param_jcrcontent_protocol_https_relaxed) = param_jcrcontent_protocol_https_relaxed {
                query_string.append_pair("jcr:content/protocolHTTPSRelaxed",
                    &param_jcrcontent_protocol_https_relaxed.to_string());
            }
            if let Some(param_jcrcontent_protocol_interface) = param_jcrcontent_protocol_interface {
                query_string.append_pair("jcr:content/protocolInterface",
                    &param_jcrcontent_protocol_interface.to_string());
            }
            if let Some(param_jcrcontent_protocol_socket_timeout) = param_jcrcontent_protocol_socket_timeout {
                query_string.append_pair("jcr:content/protocolSocketTimeout",
                    &param_jcrcontent_protocol_socket_timeout.to_string());
            }
            if let Some(param_jcrcontent_protocol_version) = param_jcrcontent_protocol_version {
                query_string.append_pair("jcr:content/protocolVersion",
                    &param_jcrcontent_protocol_version.to_string());
            }
            if let Some(param_jcrcontent_proxy_ntlm_domain) = param_jcrcontent_proxy_ntlm_domain {
                query_string.append_pair("jcr:content/proxyNTLMDomain",
                    &param_jcrcontent_proxy_ntlm_domain.to_string());
            }
            if let Some(param_jcrcontent_proxy_ntlm_host) = param_jcrcontent_proxy_ntlm_host {
                query_string.append_pair("jcr:content/proxyNTLMHost",
                    &param_jcrcontent_proxy_ntlm_host.to_string());
            }
            if let Some(param_jcrcontent_proxy_host) = param_jcrcontent_proxy_host {
                query_string.append_pair("jcr:content/proxyHost",
                    &param_jcrcontent_proxy_host.to_string());
            }
            if let Some(param_jcrcontent_proxy_password) = param_jcrcontent_proxy_password {
                query_string.append_pair("jcr:content/proxyPassword",
                    &param_jcrcontent_proxy_password.to_string());
            }
            if let Some(param_jcrcontent_proxy_port) = param_jcrcontent_proxy_port {
                query_string.append_pair("jcr:content/proxyPort",
                    &param_jcrcontent_proxy_port.to_string());
            }
            if let Some(param_jcrcontent_proxy_user) = param_jcrcontent_proxy_user {
                query_string.append_pair("jcr:content/proxyUser",
                    &param_jcrcontent_proxy_user.to_string());
            }
            if let Some(param_jcrcontent_queue_batch_max_size) = param_jcrcontent_queue_batch_max_size {
                query_string.append_pair("jcr:content/queueBatchMaxSize",
                    &param_jcrcontent_queue_batch_max_size.to_string());
            }
            if let Some(param_jcrcontent_queue_batch_mode) = param_jcrcontent_queue_batch_mode {
                query_string.append_pair("jcr:content/queueBatchMode",
                    &param_jcrcontent_queue_batch_mode.to_string());
            }
            if let Some(param_jcrcontent_queue_batch_wait_time) = param_jcrcontent_queue_batch_wait_time {
                query_string.append_pair("jcr:content/queueBatchWaitTime",
                    &param_jcrcontent_queue_batch_wait_time.to_string());
            }
            if let Some(param_jcrcontent_retry_delay) = param_jcrcontent_retry_delay {
                query_string.append_pair("jcr:content/retryDelay",
                    &param_jcrcontent_retry_delay.to_string());
            }
            if let Some(param_jcrcontent_reverse_replication) = param_jcrcontent_reverse_replication {
                query_string.append_pair("jcr:content/reverseReplication",
                    &param_jcrcontent_reverse_replication.to_string());
            }
            if let Some(param_jcrcontent_serialization_type) = param_jcrcontent_serialization_type {
                query_string.append_pair("jcr:content/serializationType",
                    &param_jcrcontent_serialization_type.to_string());
            }
            if let Some(param_jcrcontent_slingresource_type) = param_jcrcontent_slingresource_type {
                query_string.append_pair("jcr:content/sling:resourceType",
                    &param_jcrcontent_slingresource_type.to_string());
            }
            if let Some(param_jcrcontent_ssl) = param_jcrcontent_ssl {
                query_string.append_pair("jcr:content/ssl",
                    &param_jcrcontent_ssl.to_string());
            }
            if let Some(param_jcrcontent_transport_ntlm_domain) = param_jcrcontent_transport_ntlm_domain {
                query_string.append_pair("jcr:content/transportNTLMDomain",
                    &param_jcrcontent_transport_ntlm_domain.to_string());
            }
            if let Some(param_jcrcontent_transport_ntlm_host) = param_jcrcontent_transport_ntlm_host {
                query_string.append_pair("jcr:content/transportNTLMHost",
                    &param_jcrcontent_transport_ntlm_host.to_string());
            }
            if let Some(param_jcrcontent_transport_password) = param_jcrcontent_transport_password {
                query_string.append_pair("jcr:content/transportPassword",
                    &param_jcrcontent_transport_password.to_string());
            }
            if let Some(param_jcrcontent_transport_uri) = param_jcrcontent_transport_uri {
                query_string.append_pair("jcr:content/transportUri",
                    &param_jcrcontent_transport_uri.to_string());
            }
            if let Some(param_jcrcontent_transport_user) = param_jcrcontent_transport_user {
                query_string.append_pair("jcr:content/transportUser",
                    &param_jcrcontent_transport_user.to_string());
            }
            if let Some(param_jcrcontent_trigger_distribute) = param_jcrcontent_trigger_distribute {
                query_string.append_pair("jcr:content/triggerDistribute",
                    &param_jcrcontent_trigger_distribute.to_string());
            }
            if let Some(param_jcrcontent_trigger_modified) = param_jcrcontent_trigger_modified {
                query_string.append_pair("jcr:content/triggerModified",
                    &param_jcrcontent_trigger_modified.to_string());
            }
            if let Some(param_jcrcontent_trigger_on_off_time) = param_jcrcontent_trigger_on_off_time {
                query_string.append_pair("jcr:content/triggerOnOffTime",
                    &param_jcrcontent_trigger_on_off_time.to_string());
            }
            if let Some(param_jcrcontent_trigger_receive) = param_jcrcontent_trigger_receive {
                query_string.append_pair("jcr:content/triggerReceive",
                    &param_jcrcontent_trigger_receive.to_string());
            }
            if let Some(param_jcrcontent_trigger_specific) = param_jcrcontent_trigger_specific {
                query_string.append_pair("jcr:content/triggerSpecific",
                    &param_jcrcontent_trigger_specific.to_string());
            }
            if let Some(param_jcrcontent_user_id) = param_jcrcontent_user_id {
                query_string.append_pair("jcr:content/userId",
                    &param_jcrcontent_user_id.to_string());
            }
            if let Some(param_jcrprimary_type) = param_jcrprimary_type {
                query_string.append_pair("jcr:primaryType",
                    &param_jcrprimary_type.to_string());
            }
            if let Some(param_operation) = param_operation {
                query_string.append_pair(":operation",
                    &param_operation.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostAgentResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_authorizable_keystore(
        &self,
        param_intermediate_path: String,
        param_authorizable_id: String,
        param_operation: Option<String>,
        param_current_password: Option<String>,
        param_new_password: Option<String>,
        param_re_password: Option<String>,
        param_key_password: Option<String>,
        param_key_store_pass: Option<String>,
        param_alias: Option<String>,
        param_new_alias: Option<String>,
        param_remove_alias: Option<String>,
        param_cert_chain: Option<swagger::ByteArray>,
        param_pk: Option<swagger::ByteArray>,
        param_key_store: Option<swagger::ByteArray>,
        context: &C) -> Result<PostAuthorizableKeystoreResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{intermediate_path}/{authorizable_id}.ks.html",
            self.base_path
            ,intermediate_path=utf8_percent_encode(&param_intermediate_path.to_string(), ID_ENCODE_SET)
            ,authorizable_id=utf8_percent_encode(&param_authorizable_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_operation) = param_operation {
                query_string.append_pair(":operation",
                    &param_operation.to_string());
            }
            if let Some(param_current_password) = param_current_password {
                query_string.append_pair("currentPassword",
                    &param_current_password.to_string());
            }
            if let Some(param_new_password) = param_new_password {
                query_string.append_pair("newPassword",
                    &param_new_password.to_string());
            }
            if let Some(param_re_password) = param_re_password {
                query_string.append_pair("rePassword",
                    &param_re_password.to_string());
            }
            if let Some(param_key_password) = param_key_password {
                query_string.append_pair("keyPassword",
                    &param_key_password.to_string());
            }
            if let Some(param_key_store_pass) = param_key_store_pass {
                query_string.append_pair("keyStorePass",
                    &param_key_store_pass.to_string());
            }
            if let Some(param_alias) = param_alias {
                query_string.append_pair("alias",
                    &param_alias.to_string());
            }
            if let Some(param_new_alias) = param_new_alias {
                query_string.append_pair("newAlias",
                    &param_new_alias.to_string());
            }
            if let Some(param_remove_alias) = param_remove_alias {
                query_string.append_pair("removeAlias",
                    &param_remove_alias.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let (body_string, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let cert_chain_str = match serde_json::to_string(&param_cert_chain) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize cert_chain to string: {}", e))),
            };

            let cert_chain_vec = cert_chain_str.as_bytes().to_vec();
            let cert_chain_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let cert_chain_cursor = Cursor::new(cert_chain_vec);

            multipart.add_stream("cert_chain",  cert_chain_cursor,  None as Option<&str>, Some(cert_chain_mime));


            let pk_str = match serde_json::to_string(&param_pk) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize pk to string: {}", e))),
            };

            let pk_vec = pk_str.as_bytes().to_vec();
            let pk_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let pk_cursor = Cursor::new(pk_vec);

            multipart.add_stream("pk",  pk_cursor,  None as Option<&str>, Some(pk_mime));


            let key_store_str = match serde_json::to_string(&param_key_store) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize key_store to string: {}", e))),
            };

            let key_store_vec = key_store_str.as_bytes().to_vec();
            let key_store_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let key_store_cursor = Cursor::new(key_store_vec);

            multipart.add_stream("key_store",  key_store_cursor,  None as Option<&str>, Some(key_store_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {}", err))),
            };

            let mut body_string = String::new();

            match fields.read_to_string(&mut body_string) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {}", err))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={}", boundary);

            (body_string, multipart_header)
        };

        *request.body_mut() = Body::from(body_string);

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", multipart_header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostAuthorizableKeystoreResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_authorizables(
        &self,
        param_authorizable_id: String,
        param_intermediate_path: String,
        param_create_user: Option<String>,
        param_create_group: Option<String>,
        param_reppassword: Option<String>,
        param_profile_given_name: Option<String>,
        context: &C) -> Result<PostAuthorizablesResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/libs/granite/security/post/authorizables",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("authorizableId",
                    &param_authorizable_id.to_string());
                query_string.append_pair("intermediatePath",
                    &param_intermediate_path.to_string());
            if let Some(param_create_user) = param_create_user {
                query_string.append_pair("createUser",
                    &param_create_user.to_string());
            }
            if let Some(param_create_group) = param_create_group {
                query_string.append_pair("createGroup",
                    &param_create_group.to_string());
            }
            if let Some(param_reppassword) = param_reppassword {
                query_string.append_pair("rep:password",
                    &param_reppassword.to_string());
            }
            if let Some(param_profile_given_name) = param_profile_given_name {
                query_string.append_pair("profile/givenName",
                    &param_profile_given_name.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostAuthorizablesResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_adobe_granite_saml_authentication_handler(
        &self,
        param_key_store_password: Option<String>,
        param_key_store_password_type_hint: Option<String>,
        param_service_ranking: Option<i32>,
        param_service_ranking_type_hint: Option<String>,
        param_idp_http_redirect: Option<bool>,
        param_idp_http_redirect_type_hint: Option<String>,
        param_create_user: Option<bool>,
        param_create_user_type_hint: Option<String>,
        param_default_redirect_url: Option<String>,
        param_default_redirect_url_type_hint: Option<String>,
        param_user_id_attribute: Option<String>,
        param_user_id_attribute_type_hint: Option<String>,
        param_default_groups: Option<&Vec<String>>,
        param_default_groups_type_hint: Option<String>,
        param_idp_cert_alias: Option<String>,
        param_idp_cert_alias_type_hint: Option<String>,
        param_add_group_memberships: Option<bool>,
        param_add_group_memberships_type_hint: Option<String>,
        param_path: Option<&Vec<String>>,
        param_path_type_hint: Option<String>,
        param_synchronize_attributes: Option<&Vec<String>>,
        param_synchronize_attributes_type_hint: Option<String>,
        param_clock_tolerance: Option<i32>,
        param_clock_tolerance_type_hint: Option<String>,
        param_group_membership_attribute: Option<String>,
        param_group_membership_attribute_type_hint: Option<String>,
        param_idp_url: Option<String>,
        param_idp_url_type_hint: Option<String>,
        param_logout_url: Option<String>,
        param_logout_url_type_hint: Option<String>,
        param_service_provider_entity_id: Option<String>,
        param_service_provider_entity_id_type_hint: Option<String>,
        param_assertion_consumer_service_url: Option<String>,
        param_assertion_consumer_service_url_type_hint: Option<String>,
        param_handle_logout: Option<bool>,
        param_handle_logout_type_hint: Option<String>,
        param_sp_private_key_alias: Option<String>,
        param_sp_private_key_alias_type_hint: Option<String>,
        param_use_encryption: Option<bool>,
        param_use_encryption_type_hint: Option<String>,
        param_name_id_format: Option<String>,
        param_name_id_format_type_hint: Option<String>,
        param_digest_method: Option<String>,
        param_digest_method_type_hint: Option<String>,
        param_signature_method: Option<String>,
        param_signature_method_type_hint: Option<String>,
        param_user_intermediate_path: Option<String>,
        param_user_intermediate_path_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_key_store_password) = param_key_store_password {
                query_string.append_pair("keyStorePassword",
                    &param_key_store_password.to_string());
            }
            if let Some(param_key_store_password_type_hint) = param_key_store_password_type_hint {
                query_string.append_pair("keyStorePassword@TypeHint",
                    &param_key_store_password_type_hint.to_string());
            }
            if let Some(param_service_ranking) = param_service_ranking {
                query_string.append_pair("service.ranking",
                    &param_service_ranking.to_string());
            }
            if let Some(param_service_ranking_type_hint) = param_service_ranking_type_hint {
                query_string.append_pair("service.ranking@TypeHint",
                    &param_service_ranking_type_hint.to_string());
            }
            if let Some(param_idp_http_redirect) = param_idp_http_redirect {
                query_string.append_pair("idpHttpRedirect",
                    &param_idp_http_redirect.to_string());
            }
            if let Some(param_idp_http_redirect_type_hint) = param_idp_http_redirect_type_hint {
                query_string.append_pair("idpHttpRedirect@TypeHint",
                    &param_idp_http_redirect_type_hint.to_string());
            }
            if let Some(param_create_user) = param_create_user {
                query_string.append_pair("createUser",
                    &param_create_user.to_string());
            }
            if let Some(param_create_user_type_hint) = param_create_user_type_hint {
                query_string.append_pair("createUser@TypeHint",
                    &param_create_user_type_hint.to_string());
            }
            if let Some(param_default_redirect_url) = param_default_redirect_url {
                query_string.append_pair("defaultRedirectUrl",
                    &param_default_redirect_url.to_string());
            }
            if let Some(param_default_redirect_url_type_hint) = param_default_redirect_url_type_hint {
                query_string.append_pair("defaultRedirectUrl@TypeHint",
                    &param_default_redirect_url_type_hint.to_string());
            }
            if let Some(param_user_id_attribute) = param_user_id_attribute {
                query_string.append_pair("userIDAttribute",
                    &param_user_id_attribute.to_string());
            }
            if let Some(param_user_id_attribute_type_hint) = param_user_id_attribute_type_hint {
                query_string.append_pair("userIDAttribute@TypeHint",
                    &param_user_id_attribute_type_hint.to_string());
            }
            if let Some(param_default_groups) = param_default_groups {
                query_string.append_pair("defaultGroups",
                    &param_default_groups.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_default_groups_type_hint) = param_default_groups_type_hint {
                query_string.append_pair("defaultGroups@TypeHint",
                    &param_default_groups_type_hint.to_string());
            }
            if let Some(param_idp_cert_alias) = param_idp_cert_alias {
                query_string.append_pair("idpCertAlias",
                    &param_idp_cert_alias.to_string());
            }
            if let Some(param_idp_cert_alias_type_hint) = param_idp_cert_alias_type_hint {
                query_string.append_pair("idpCertAlias@TypeHint",
                    &param_idp_cert_alias_type_hint.to_string());
            }
            if let Some(param_add_group_memberships) = param_add_group_memberships {
                query_string.append_pair("addGroupMemberships",
                    &param_add_group_memberships.to_string());
            }
            if let Some(param_add_group_memberships_type_hint) = param_add_group_memberships_type_hint {
                query_string.append_pair("addGroupMemberships@TypeHint",
                    &param_add_group_memberships_type_hint.to_string());
            }
            if let Some(param_path) = param_path {
                query_string.append_pair("path",
                    &param_path.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_path_type_hint) = param_path_type_hint {
                query_string.append_pair("path@TypeHint",
                    &param_path_type_hint.to_string());
            }
            if let Some(param_synchronize_attributes) = param_synchronize_attributes {
                query_string.append_pair("synchronizeAttributes",
                    &param_synchronize_attributes.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_synchronize_attributes_type_hint) = param_synchronize_attributes_type_hint {
                query_string.append_pair("synchronizeAttributes@TypeHint",
                    &param_synchronize_attributes_type_hint.to_string());
            }
            if let Some(param_clock_tolerance) = param_clock_tolerance {
                query_string.append_pair("clockTolerance",
                    &param_clock_tolerance.to_string());
            }
            if let Some(param_clock_tolerance_type_hint) = param_clock_tolerance_type_hint {
                query_string.append_pair("clockTolerance@TypeHint",
                    &param_clock_tolerance_type_hint.to_string());
            }
            if let Some(param_group_membership_attribute) = param_group_membership_attribute {
                query_string.append_pair("groupMembershipAttribute",
                    &param_group_membership_attribute.to_string());
            }
            if let Some(param_group_membership_attribute_type_hint) = param_group_membership_attribute_type_hint {
                query_string.append_pair("groupMembershipAttribute@TypeHint",
                    &param_group_membership_attribute_type_hint.to_string());
            }
            if let Some(param_idp_url) = param_idp_url {
                query_string.append_pair("idpUrl",
                    &param_idp_url.to_string());
            }
            if let Some(param_idp_url_type_hint) = param_idp_url_type_hint {
                query_string.append_pair("idpUrl@TypeHint",
                    &param_idp_url_type_hint.to_string());
            }
            if let Some(param_logout_url) = param_logout_url {
                query_string.append_pair("logoutUrl",
                    &param_logout_url.to_string());
            }
            if let Some(param_logout_url_type_hint) = param_logout_url_type_hint {
                query_string.append_pair("logoutUrl@TypeHint",
                    &param_logout_url_type_hint.to_string());
            }
            if let Some(param_service_provider_entity_id) = param_service_provider_entity_id {
                query_string.append_pair("serviceProviderEntityId",
                    &param_service_provider_entity_id.to_string());
            }
            if let Some(param_service_provider_entity_id_type_hint) = param_service_provider_entity_id_type_hint {
                query_string.append_pair("serviceProviderEntityId@TypeHint",
                    &param_service_provider_entity_id_type_hint.to_string());
            }
            if let Some(param_assertion_consumer_service_url) = param_assertion_consumer_service_url {
                query_string.append_pair("assertionConsumerServiceURL",
                    &param_assertion_consumer_service_url.to_string());
            }
            if let Some(param_assertion_consumer_service_url_type_hint) = param_assertion_consumer_service_url_type_hint {
                query_string.append_pair("assertionConsumerServiceURL@TypeHint",
                    &param_assertion_consumer_service_url_type_hint.to_string());
            }
            if let Some(param_handle_logout) = param_handle_logout {
                query_string.append_pair("handleLogout",
                    &param_handle_logout.to_string());
            }
            if let Some(param_handle_logout_type_hint) = param_handle_logout_type_hint {
                query_string.append_pair("handleLogout@TypeHint",
                    &param_handle_logout_type_hint.to_string());
            }
            if let Some(param_sp_private_key_alias) = param_sp_private_key_alias {
                query_string.append_pair("spPrivateKeyAlias",
                    &param_sp_private_key_alias.to_string());
            }
            if let Some(param_sp_private_key_alias_type_hint) = param_sp_private_key_alias_type_hint {
                query_string.append_pair("spPrivateKeyAlias@TypeHint",
                    &param_sp_private_key_alias_type_hint.to_string());
            }
            if let Some(param_use_encryption) = param_use_encryption {
                query_string.append_pair("useEncryption",
                    &param_use_encryption.to_string());
            }
            if let Some(param_use_encryption_type_hint) = param_use_encryption_type_hint {
                query_string.append_pair("useEncryption@TypeHint",
                    &param_use_encryption_type_hint.to_string());
            }
            if let Some(param_name_id_format) = param_name_id_format {
                query_string.append_pair("nameIdFormat",
                    &param_name_id_format.to_string());
            }
            if let Some(param_name_id_format_type_hint) = param_name_id_format_type_hint {
                query_string.append_pair("nameIdFormat@TypeHint",
                    &param_name_id_format_type_hint.to_string());
            }
            if let Some(param_digest_method) = param_digest_method {
                query_string.append_pair("digestMethod",
                    &param_digest_method.to_string());
            }
            if let Some(param_digest_method_type_hint) = param_digest_method_type_hint {
                query_string.append_pair("digestMethod@TypeHint",
                    &param_digest_method_type_hint.to_string());
            }
            if let Some(param_signature_method) = param_signature_method {
                query_string.append_pair("signatureMethod",
                    &param_signature_method.to_string());
            }
            if let Some(param_signature_method_type_hint) = param_signature_method_type_hint {
                query_string.append_pair("signatureMethod@TypeHint",
                    &param_signature_method_type_hint.to_string());
            }
            if let Some(param_user_intermediate_path) = param_user_intermediate_path {
                query_string.append_pair("userIntermediatePath",
                    &param_user_intermediate_path.to_string());
            }
            if let Some(param_user_intermediate_path_type_hint) = param_user_intermediate_path_type_hint {
                query_string.append_pair("userIntermediatePath@TypeHint",
                    &param_user_intermediate_path_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigAdobeGraniteSamlAuthenticationHandlerResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_apache_felix_jetty_based_http_service(
        &self,
        param_org_apache_felix_https_nio: Option<bool>,
        param_org_apache_felix_https_nio_type_hint: Option<String>,
        param_org_apache_felix_https_keystore: Option<String>,
        param_org_apache_felix_https_keystore_type_hint: Option<String>,
        param_org_apache_felix_https_keystore_password: Option<String>,
        param_org_apache_felix_https_keystore_password_type_hint: Option<String>,
        param_org_apache_felix_https_keystore_key: Option<String>,
        param_org_apache_felix_https_keystore_key_type_hint: Option<String>,
        param_org_apache_felix_https_keystore_key_password: Option<String>,
        param_org_apache_felix_https_keystore_key_password_type_hint: Option<String>,
        param_org_apache_felix_https_truststore: Option<String>,
        param_org_apache_felix_https_truststore_type_hint: Option<String>,
        param_org_apache_felix_https_truststore_password: Option<String>,
        param_org_apache_felix_https_truststore_password_type_hint: Option<String>,
        param_org_apache_felix_https_clientcertificate: Option<String>,
        param_org_apache_felix_https_clientcertificate_type_hint: Option<String>,
        param_org_apache_felix_https_enable: Option<bool>,
        param_org_apache_felix_https_enable_type_hint: Option<String>,
        param_org_osgi_service_http_port_secure: Option<String>,
        param_org_osgi_service_http_port_secure_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheFelixJettyBasedHttpServiceResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/org.apache.felix.http",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_org_apache_felix_https_nio) = param_org_apache_felix_https_nio {
                query_string.append_pair("org.apache.felix.https.nio",
                    &param_org_apache_felix_https_nio.to_string());
            }
            if let Some(param_org_apache_felix_https_nio_type_hint) = param_org_apache_felix_https_nio_type_hint {
                query_string.append_pair("org.apache.felix.https.nio@TypeHint",
                    &param_org_apache_felix_https_nio_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore) = param_org_apache_felix_https_keystore {
                query_string.append_pair("org.apache.felix.https.keystore",
                    &param_org_apache_felix_https_keystore.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore_type_hint) = param_org_apache_felix_https_keystore_type_hint {
                query_string.append_pair("org.apache.felix.https.keystore@TypeHint",
                    &param_org_apache_felix_https_keystore_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore_password) = param_org_apache_felix_https_keystore_password {
                query_string.append_pair("org.apache.felix.https.keystore.password",
                    &param_org_apache_felix_https_keystore_password.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore_password_type_hint) = param_org_apache_felix_https_keystore_password_type_hint {
                query_string.append_pair("org.apache.felix.https.keystore.password@TypeHint",
                    &param_org_apache_felix_https_keystore_password_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore_key) = param_org_apache_felix_https_keystore_key {
                query_string.append_pair("org.apache.felix.https.keystore.key",
                    &param_org_apache_felix_https_keystore_key.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore_key_type_hint) = param_org_apache_felix_https_keystore_key_type_hint {
                query_string.append_pair("org.apache.felix.https.keystore.key@TypeHint",
                    &param_org_apache_felix_https_keystore_key_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore_key_password) = param_org_apache_felix_https_keystore_key_password {
                query_string.append_pair("org.apache.felix.https.keystore.key.password",
                    &param_org_apache_felix_https_keystore_key_password.to_string());
            }
            if let Some(param_org_apache_felix_https_keystore_key_password_type_hint) = param_org_apache_felix_https_keystore_key_password_type_hint {
                query_string.append_pair("org.apache.felix.https.keystore.key.password@TypeHint",
                    &param_org_apache_felix_https_keystore_key_password_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_truststore) = param_org_apache_felix_https_truststore {
                query_string.append_pair("org.apache.felix.https.truststore",
                    &param_org_apache_felix_https_truststore.to_string());
            }
            if let Some(param_org_apache_felix_https_truststore_type_hint) = param_org_apache_felix_https_truststore_type_hint {
                query_string.append_pair("org.apache.felix.https.truststore@TypeHint",
                    &param_org_apache_felix_https_truststore_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_truststore_password) = param_org_apache_felix_https_truststore_password {
                query_string.append_pair("org.apache.felix.https.truststore.password",
                    &param_org_apache_felix_https_truststore_password.to_string());
            }
            if let Some(param_org_apache_felix_https_truststore_password_type_hint) = param_org_apache_felix_https_truststore_password_type_hint {
                query_string.append_pair("org.apache.felix.https.truststore.password@TypeHint",
                    &param_org_apache_felix_https_truststore_password_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_clientcertificate) = param_org_apache_felix_https_clientcertificate {
                query_string.append_pair("org.apache.felix.https.clientcertificate",
                    &param_org_apache_felix_https_clientcertificate.to_string());
            }
            if let Some(param_org_apache_felix_https_clientcertificate_type_hint) = param_org_apache_felix_https_clientcertificate_type_hint {
                query_string.append_pair("org.apache.felix.https.clientcertificate@TypeHint",
                    &param_org_apache_felix_https_clientcertificate_type_hint.to_string());
            }
            if let Some(param_org_apache_felix_https_enable) = param_org_apache_felix_https_enable {
                query_string.append_pair("org.apache.felix.https.enable",
                    &param_org_apache_felix_https_enable.to_string());
            }
            if let Some(param_org_apache_felix_https_enable_type_hint) = param_org_apache_felix_https_enable_type_hint {
                query_string.append_pair("org.apache.felix.https.enable@TypeHint",
                    &param_org_apache_felix_https_enable_type_hint.to_string());
            }
            if let Some(param_org_osgi_service_http_port_secure) = param_org_osgi_service_http_port_secure {
                query_string.append_pair("org.osgi.service.http.port.secure",
                    &param_org_osgi_service_http_port_secure.to_string());
            }
            if let Some(param_org_osgi_service_http_port_secure_type_hint) = param_org_osgi_service_http_port_secure_type_hint {
                query_string.append_pair("org.osgi.service.http.port.secure@TypeHint",
                    &param_org_osgi_service_http_port_secure_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigApacheFelixJettyBasedHttpServiceResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_apache_http_components_proxy_configuration(
        &self,
        param_proxy_host: Option<String>,
        param_proxy_host_type_hint: Option<String>,
        param_proxy_port: Option<i32>,
        param_proxy_port_type_hint: Option<String>,
        param_proxy_exceptions: Option<&Vec<String>>,
        param_proxy_exceptions_type_hint: Option<String>,
        param_proxy_enabled: Option<bool>,
        param_proxy_enabled_type_hint: Option<String>,
        param_proxy_user: Option<String>,
        param_proxy_user_type_hint: Option<String>,
        param_proxy_password: Option<String>,
        param_proxy_password_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheHttpComponentsProxyConfigurationResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/org.apache.http.proxyconfigurator.config",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_proxy_host) = param_proxy_host {
                query_string.append_pair("proxy.host",
                    &param_proxy_host.to_string());
            }
            if let Some(param_proxy_host_type_hint) = param_proxy_host_type_hint {
                query_string.append_pair("proxy.host@TypeHint",
                    &param_proxy_host_type_hint.to_string());
            }
            if let Some(param_proxy_port) = param_proxy_port {
                query_string.append_pair("proxy.port",
                    &param_proxy_port.to_string());
            }
            if let Some(param_proxy_port_type_hint) = param_proxy_port_type_hint {
                query_string.append_pair("proxy.port@TypeHint",
                    &param_proxy_port_type_hint.to_string());
            }
            if let Some(param_proxy_exceptions) = param_proxy_exceptions {
                query_string.append_pair("proxy.exceptions",
                    &param_proxy_exceptions.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_proxy_exceptions_type_hint) = param_proxy_exceptions_type_hint {
                query_string.append_pair("proxy.exceptions@TypeHint",
                    &param_proxy_exceptions_type_hint.to_string());
            }
            if let Some(param_proxy_enabled) = param_proxy_enabled {
                query_string.append_pair("proxy.enabled",
                    &param_proxy_enabled.to_string());
            }
            if let Some(param_proxy_enabled_type_hint) = param_proxy_enabled_type_hint {
                query_string.append_pair("proxy.enabled@TypeHint",
                    &param_proxy_enabled_type_hint.to_string());
            }
            if let Some(param_proxy_user) = param_proxy_user {
                query_string.append_pair("proxy.user",
                    &param_proxy_user.to_string());
            }
            if let Some(param_proxy_user_type_hint) = param_proxy_user_type_hint {
                query_string.append_pair("proxy.user@TypeHint",
                    &param_proxy_user_type_hint.to_string());
            }
            if let Some(param_proxy_password) = param_proxy_password {
                query_string.append_pair("proxy.password",
                    &param_proxy_password.to_string());
            }
            if let Some(param_proxy_password_type_hint) = param_proxy_password_type_hint {
                query_string.append_pair("proxy.password@TypeHint",
                    &param_proxy_password_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigApacheHttpComponentsProxyConfigurationResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_apache_sling_dav_ex_servlet(
        &self,
        param_alias: Option<String>,
        param_alias_type_hint: Option<String>,
        param_dav_create_absolute_uri: Option<bool>,
        param_dav_create_absolute_uri_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingDavExServletResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_alias) = param_alias {
                query_string.append_pair("alias",
                    &param_alias.to_string());
            }
            if let Some(param_alias_type_hint) = param_alias_type_hint {
                query_string.append_pair("alias@TypeHint",
                    &param_alias_type_hint.to_string());
            }
            if let Some(param_dav_create_absolute_uri) = param_dav_create_absolute_uri {
                query_string.append_pair("dav.create-absolute-uri",
                    &param_dav_create_absolute_uri.to_string());
            }
            if let Some(param_dav_create_absolute_uri_type_hint) = param_dav_create_absolute_uri_type_hint {
                query_string.append_pair("dav.create-absolute-uri@TypeHint",
                    &param_dav_create_absolute_uri_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigApacheSlingDavExServletResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_apache_sling_get_servlet(
        &self,
        param_json_maximumresults: Option<String>,
        param_json_maximumresults_type_hint: Option<String>,
        param_enable_html: Option<bool>,
        param_enable_html_type_hint: Option<String>,
        param_enable_txt: Option<bool>,
        param_enable_txt_type_hint: Option<String>,
        param_enable_xml: Option<bool>,
        param_enable_xml_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingGetServletResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_json_maximumresults) = param_json_maximumresults {
                query_string.append_pair("json.maximumresults",
                    &param_json_maximumresults.to_string());
            }
            if let Some(param_json_maximumresults_type_hint) = param_json_maximumresults_type_hint {
                query_string.append_pair("json.maximumresults@TypeHint",
                    &param_json_maximumresults_type_hint.to_string());
            }
            if let Some(param_enable_html) = param_enable_html {
                query_string.append_pair("enable.html",
                    &param_enable_html.to_string());
            }
            if let Some(param_enable_html_type_hint) = param_enable_html_type_hint {
                query_string.append_pair("enable.html@TypeHint",
                    &param_enable_html_type_hint.to_string());
            }
            if let Some(param_enable_txt) = param_enable_txt {
                query_string.append_pair("enable.txt",
                    &param_enable_txt.to_string());
            }
            if let Some(param_enable_txt_type_hint) = param_enable_txt_type_hint {
                query_string.append_pair("enable.txt@TypeHint",
                    &param_enable_txt_type_hint.to_string());
            }
            if let Some(param_enable_xml) = param_enable_xml {
                query_string.append_pair("enable.xml",
                    &param_enable_xml.to_string());
            }
            if let Some(param_enable_xml_type_hint) = param_enable_xml_type_hint {
                query_string.append_pair("enable.xml@TypeHint",
                    &param_enable_xml_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigApacheSlingGetServletResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_apache_sling_referrer_filter(
        &self,
        param_allow_empty: Option<bool>,
        param_allow_empty_type_hint: Option<String>,
        param_allow_hosts: Option<String>,
        param_allow_hosts_type_hint: Option<String>,
        param_allow_hosts_regexp: Option<String>,
        param_allow_hosts_regexp_type_hint: Option<String>,
        param_filter_methods: Option<String>,
        param_filter_methods_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingReferrerFilterResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/org.apache.sling.security.impl.ReferrerFilter",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_allow_empty) = param_allow_empty {
                query_string.append_pair("allow.empty",
                    &param_allow_empty.to_string());
            }
            if let Some(param_allow_empty_type_hint) = param_allow_empty_type_hint {
                query_string.append_pair("allow.empty@TypeHint",
                    &param_allow_empty_type_hint.to_string());
            }
            if let Some(param_allow_hosts) = param_allow_hosts {
                query_string.append_pair("allow.hosts",
                    &param_allow_hosts.to_string());
            }
            if let Some(param_allow_hosts_type_hint) = param_allow_hosts_type_hint {
                query_string.append_pair("allow.hosts@TypeHint",
                    &param_allow_hosts_type_hint.to_string());
            }
            if let Some(param_allow_hosts_regexp) = param_allow_hosts_regexp {
                query_string.append_pair("allow.hosts.regexp",
                    &param_allow_hosts_regexp.to_string());
            }
            if let Some(param_allow_hosts_regexp_type_hint) = param_allow_hosts_regexp_type_hint {
                query_string.append_pair("allow.hosts.regexp@TypeHint",
                    &param_allow_hosts_regexp_type_hint.to_string());
            }
            if let Some(param_filter_methods) = param_filter_methods {
                query_string.append_pair("filter.methods",
                    &param_filter_methods.to_string());
            }
            if let Some(param_filter_methods_type_hint) = param_filter_methods_type_hint {
                query_string.append_pair("filter.methods@TypeHint",
                    &param_filter_methods_type_hint.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigApacheSlingReferrerFilterResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_config_property(
        &self,
        param_config_node_name: String,
        context: &C) -> Result<PostConfigPropertyResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/apps/system/config/{config_node_name}",
            self.base_path
            ,config_node_name=utf8_percent_encode(&param_config_node_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostConfigPropertyResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_node(
        &self,
        param_path: String,
        param_name: String,
        param_operation: Option<String>,
        param_delete_authorizable: Option<String>,
        param_file: Option<swagger::ByteArray>,
        context: &C) -> Result<PostNodeResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{path}/{name}",
            self.base_path
            ,path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_operation) = param_operation {
                query_string.append_pair(":operation",
                    &param_operation.to_string());
            }
            if let Some(param_delete_authorizable) = param_delete_authorizable {
                query_string.append_pair("deleteAuthorizable",
                    &param_delete_authorizable.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let (body_string, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let file_str = match serde_json::to_string(&param_file) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize file to string: {}", e))),
            };

            let file_vec = file_str.as_bytes().to_vec();
            let file_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let file_cursor = Cursor::new(file_vec);

            multipart.add_stream("file",  file_cursor,  None as Option<&str>, Some(file_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {}", err))),
            };

            let mut body_string = String::new();

            match fields.read_to_string(&mut body_string) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {}", err))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={}", boundary);

            (body_string, multipart_header)
        };

        *request.body_mut() = Body::from(body_string);

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", multipart_header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostNodeResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_node_rw(
        &self,
        param_path: String,
        param_name: String,
        param_add_members: Option<String>,
        context: &C) -> Result<PostNodeRwResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{path}/{name}.rw.html",
            self.base_path
            ,path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET)
            ,name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_add_members) = param_add_members {
                query_string.append_pair("addMembers",
                    &param_add_members.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostNodeRwResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_path(
        &self,
        param_path: String,
        param_jcrprimary_type: String,
        param_name: String,
        context: &C) -> Result<PostPathResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/{path}/",
            self.base_path
            ,path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("jcr:primaryType",
                    &param_jcrprimary_type.to_string());
                query_string.append_pair(":name",
                    &param_name.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostPathResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_query(
        &self,
        param_path: String,
        param_p_limit: f64,
        param_param_1_property: String,
        param_param_1_property_value: String,
        context: &C) -> Result<PostQueryResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/bin/querybuilder.json",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("path",
                    &param_path.to_string());
                query_string.append_pair("p.limit",
                    &param_p_limit.to_string());
                query_string.append_pair("1_property",
                    &param_param_1_property.to_string());
                query_string.append_pair("1_property.value",
                    &param_param_1_property_value.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body)?;
                Ok(PostQueryResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_tree_activation(
        &self,
        param_ignoredeactivated: bool,
        param_onlymodified: bool,
        param_path: String,
        context: &C) -> Result<PostTreeActivationResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/replication/treeactivation.html",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("ignoredeactivated",
                    &param_ignoredeactivated.to_string());
                query_string.append_pair("onlymodified",
                    &param_onlymodified.to_string());
                query_string.append_pair("path",
                    &param_path.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                Ok(
                    PostTreeActivationResponse::DefaultResponse
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_truststore(
        &self,
        param_operation: Option<String>,
        param_new_password: Option<String>,
        param_re_password: Option<String>,
        param_key_store_type: Option<String>,
        param_remove_alias: Option<String>,
        param_certificate: Option<swagger::ByteArray>,
        context: &C) -> Result<PostTruststoreResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/libs/granite/security/post/truststore",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_operation) = param_operation {
                query_string.append_pair(":operation",
                    &param_operation.to_string());
            }
            if let Some(param_new_password) = param_new_password {
                query_string.append_pair("newPassword",
                    &param_new_password.to_string());
            }
            if let Some(param_re_password) = param_re_password {
                query_string.append_pair("rePassword",
                    &param_re_password.to_string());
            }
            if let Some(param_key_store_type) = param_key_store_type {
                query_string.append_pair("keyStoreType",
                    &param_key_store_type.to_string());
            }
            if let Some(param_remove_alias) = param_remove_alias {
                query_string.append_pair("removeAlias",
                    &param_remove_alias.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let (body_string, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let certificate_str = match serde_json::to_string(&param_certificate) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize certificate to string: {}", e))),
            };

            let certificate_vec = certificate_str.as_bytes().to_vec();
            let certificate_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let certificate_cursor = Cursor::new(certificate_vec);

            multipart.add_stream("certificate",  certificate_cursor,  None as Option<&str>, Some(certificate_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {}", err))),
            };

            let mut body_string = String::new();

            match fields.read_to_string(&mut body_string) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {}", err))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={}", boundary);

            (body_string, multipart_header)
        };

        *request.body_mut() = Body::from(body_string);

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", multipart_header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostTruststoreResponse::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn post_truststore_pkcs12(
        &self,
        param_truststore_p12: Option<swagger::ByteArray>,
        context: &C) -> Result<PostTruststorePKCS12Response, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/etc/truststore",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let (body_string, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let truststore_p12_str = match serde_json::to_string(&param_truststore_p12) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize truststore_p12 to string: {}", e))),
            };

            let truststore_p12_vec = truststore_p12_str.as_bytes().to_vec();
            let truststore_p12_mime = mime_0_2::Mime::from_str("application/json").expect("impossible to fail to parse");
            let truststore_p12_cursor = Cursor::new(truststore_p12_vec);

            multipart.add_stream("truststore_p12",  truststore_p12_cursor,  None as Option<&str>, Some(truststore_p12_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {}", err))),
            };

            let mut body_string = String::new();

            match fields.read_to_string(&mut body_string) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {}", err))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={}", boundary);

            (body_string, multipart_header)
        };

        *request.body_mut() = Body::from(body_string);

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", multipart_header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Basic(ref basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = body.to_string();
                Ok(PostTruststorePKCS12Response::DefaultResponse
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

}
