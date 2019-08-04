#![allow(unused_extern_crates)]
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate chrono;
extern crate url;



use hyper;
use hyper::header::{Headers, ContentType};
use hyper::Uri;
use self::url::percent_encoding::{utf8_percent_encode, PATH_SEGMENT_ENCODE_SET, QUERY_ENCODE_SET};
use futures;
use futures::{Future, Stream};
use futures::{future, stream};
use self::tokio_core::reactor::Handle;
use std::borrow::Cow;
use std::io::{Read, Error, ErrorKind};
use std::error;
use std::fmt;
use std::path::Path;
use std::sync::Arc;
use std::str;
use std::str::FromStr;

use mimetypes;

use serde_json;


#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;

use swagger::{ApiError, XSpanId, XSpanIdString, Has, AuthData};

use {Api,
     GetAemProductInfoResponse,
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
     PostNodeResponse,
     PostNodeRwResponse,
     PostPathResponse,
     PostQueryResponse,
     PostTreeActivationResponse,
     PostTruststoreResponse,
     PostTruststorePKCS12Response
     };
use models;

define_encode_set! {
    /// This encode set is used for object IDs
    ///
    /// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
    /// the vertical bar (|) is encoded.
    pub ID_ENCODE_SET = [PATH_SEGMENT_ENCODE_SET] | {'|'}
}

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: &str, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = Uri::from_str(input)?;

    let scheme = uri.scheme().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or_else(|| ClientInitError::MissingHost)?;
    let port = uri.port().map(|x| format!(":{}", x)).unwrap_or_default();
    Ok(format!("{}://{}{}", scheme, host, port))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<F> where
  F: Future<Item=hyper::Response, Error=hyper::Error> + 'static {
    client_service: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
    base_path: String,
}

impl<F> fmt::Debug for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<F> Clone for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn clone(&self) -> Self {
        Client {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone()
        }
    }
}

impl Client<hyper::client::FutureResponse> {

    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    pub fn try_new_http(handle: Handle, base_path: &str) -> Result<Client<hyper::client::FutureResponse>, ClientInitError> {
        let http_connector = swagger::http_connector();
        Self::try_new_with_connector::<hyper::client::HttpConnector>(
            handle,
            base_path,
            Some("http"),
            http_connector,
        )
    }

    /// Create a client with a TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    pub fn try_new_https<CA>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = swagger::https_connector(ca_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    pub fn try_new_https_mutual<CA, K, C>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: C,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        C: AsRef<Path>,
    {
        let https_connector =
            swagger::https_mutual_connector(ca_certificate, client_key, client_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with
    /// `swagger::{http_connector, https_connector, https_mutual_connector}`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector_fn` - Function which returns an implementation of `hyper::client::Connect`
    pub fn try_new_with_connector<C>(
        handle: Handle,
        base_path: &str,
        protocol: Option<&'static str>,
        connector_fn: Box<Fn(&Handle) -> C + Send + Sync>,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        C: hyper::client::Connect + hyper::client::Service,
    {
        let connector = connector_fn(&handle);
        let client_service = Box::new(hyper::Client::configure().connector(connector).build(
            &handle,
        ));

        Ok(Client {
            client_service: Arc::new(client_service),
            base_path: into_base_path(base_path, protocol)?,
        })
    }

    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client.
    ///
    /// One should avoid relying on this function if possible, since it adds a dependency on the underlying transport
    /// implementation, which it would be better to abstract away. Therefore, using this function may lead to a loss of
    /// code generality, which may make it harder to move the application to a serverless environment, for example.
    ///
    /// The reason for this function's existence is to support legacy test code, which did mocking at the hyper layer.
    /// This is not a recommended way to write new tests. If other reasons are found for using this function, they
    /// should be mentioned here.
    #[deprecated(note="Use try_new_with_client_service instead")]
    pub fn try_new_with_hyper_client(
        hyper_client: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=hyper::client::FutureResponse>>>,
        handle: Handle,
        base_path: &str
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    {
        Ok(Client {
            client_service: hyper_client,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F> Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client Service.
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(client_service: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
                                       handle: Handle,
                                       base_path: &str)
                                    -> Result<Client<F>, ClientInitError>
    {
        Ok(Client {
            client_service: client_service,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F, C> Api<C> for Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static,
    C: Has<XSpanIdString> + Has<Option<AuthData>>{

    fn get_aem_product_info(&self, context: &C) -> Box<Future<Item=GetAemProductInfoResponse, Error=ApiError>> {


        let uri = format!(
            "{}//system/console/status-productinfo.json",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<String>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAemProductInfoResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_config_mgr(&self, context: &C) -> Box<Future<Item=GetConfigMgrResponse, Error=ApiError>> {


        let uri = format!(
            "{}//system/console/configMgr",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetConfigMgrResponse::OK(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                5XX => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetConfigMgrResponse::UnexpectedError
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_bundle(&self, param_name: String, param_action: String, context: &C) -> Box<Future<Item=PostBundleResponse, Error=ApiError>> {

        // Query parameters
        let query_action = format!("action={action}&", action=param_action.to_string());


        let uri = format!(
            "{}//system/console/bundles/{name}?{action}",
            self.base_path, name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET),
            action=utf8_percent_encode(&query_action, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostBundleResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_jmx_repository(&self, param_action: String, context: &C) -> Box<Future<Item=PostJmxRepositoryResponse, Error=ApiError>> {


        let uri = format!(
            "{}//system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}",
            self.base_path, action=utf8_percent_encode(&param_action.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostJmxRepositoryResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_saml_configuration(&self, param_post: Option<bool>, param_apply: Option<bool>, param_delete: Option<bool>, param_action: Option<String>, param_location: Option<String>, param_path: Option<&Vec<String>>, param_service_ranking: Option<i32>, param_idp_url: Option<String>, param_idp_cert_alias: Option<String>, param_idp_http_redirect: Option<bool>, param_service_provider_entity_id: Option<String>, param_assertion_consumer_service_url: Option<String>, param_sp_private_key_alias: Option<String>, param_key_store_password: Option<String>, param_default_redirect_url: Option<String>, param_user_id_attribute: Option<String>, param_use_encryption: Option<bool>, param_create_user: Option<bool>, param_add_group_memberships: Option<bool>, param_group_membership_attribute: Option<String>, param_default_groups: Option<&Vec<String>>, param_name_id_format: Option<String>, param_synchronize_attributes: Option<&Vec<String>>, param_handle_logout: Option<bool>, param_logout_url: Option<String>, param_clock_tolerance: Option<i32>, param_digest_method: Option<String>, param_signature_method: Option<String>, param_user_intermediate_path: Option<String>, param_propertylist: Option<&Vec<String>>, context: &C) -> Box<Future<Item=PostSamlConfigurationResponse, Error=ApiError>> {

        // Query parameters
        let query_post = param_post.map_or_else(String::new, |query| format!("post={post}&", post=query.to_string()));
        let query_apply = param_apply.map_or_else(String::new, |query| format!("apply={apply}&", apply=query.to_string()));
        let query_delete = param_delete.map_or_else(String::new, |query| format!("delete={delete}&", delete=query.to_string()));
        let query_action = param_action.map_or_else(String::new, |query| format!("action={action}&", action=query.to_string()));
        let query_location = param_location.map_or_else(String::new, |query| format!("$location={location}&", location=query.to_string()));
        let query_path = param_path.map_or_else(String::new, |query| format!("path={path}&", path=query.join(",")));
        let query_service_ranking = param_service_ranking.map_or_else(String::new, |query| format!("service.ranking={service_ranking}&", service_ranking=query.to_string()));
        let query_idp_url = param_idp_url.map_or_else(String::new, |query| format!("idpUrl={idp_url}&", idp_url=query.to_string()));
        let query_idp_cert_alias = param_idp_cert_alias.map_or_else(String::new, |query| format!("idpCertAlias={idp_cert_alias}&", idp_cert_alias=query.to_string()));
        let query_idp_http_redirect = param_idp_http_redirect.map_or_else(String::new, |query| format!("idpHttpRedirect={idp_http_redirect}&", idp_http_redirect=query.to_string()));
        let query_service_provider_entity_id = param_service_provider_entity_id.map_or_else(String::new, |query| format!("serviceProviderEntityId={service_provider_entity_id}&", service_provider_entity_id=query.to_string()));
        let query_assertion_consumer_service_url = param_assertion_consumer_service_url.map_or_else(String::new, |query| format!("assertionConsumerServiceURL={assertion_consumer_service_url}&", assertion_consumer_service_url=query.to_string()));
        let query_sp_private_key_alias = param_sp_private_key_alias.map_or_else(String::new, |query| format!("spPrivateKeyAlias={sp_private_key_alias}&", sp_private_key_alias=query.to_string()));
        let query_key_store_password = param_key_store_password.map_or_else(String::new, |query| format!("keyStorePassword={key_store_password}&", key_store_password=query.to_string()));
        let query_default_redirect_url = param_default_redirect_url.map_or_else(String::new, |query| format!("defaultRedirectUrl={default_redirect_url}&", default_redirect_url=query.to_string()));
        let query_user_id_attribute = param_user_id_attribute.map_or_else(String::new, |query| format!("userIDAttribute={user_id_attribute}&", user_id_attribute=query.to_string()));
        let query_use_encryption = param_use_encryption.map_or_else(String::new, |query| format!("useEncryption={use_encryption}&", use_encryption=query.to_string()));
        let query_create_user = param_create_user.map_or_else(String::new, |query| format!("createUser={create_user}&", create_user=query.to_string()));
        let query_add_group_memberships = param_add_group_memberships.map_or_else(String::new, |query| format!("addGroupMemberships={add_group_memberships}&", add_group_memberships=query.to_string()));
        let query_group_membership_attribute = param_group_membership_attribute.map_or_else(String::new, |query| format!("groupMembershipAttribute={group_membership_attribute}&", group_membership_attribute=query.to_string()));
        let query_default_groups = param_default_groups.map_or_else(String::new, |query| format!("defaultGroups={default_groups}&", default_groups=query.join(",")));
        let query_name_id_format = param_name_id_format.map_or_else(String::new, |query| format!("nameIdFormat={name_id_format}&", name_id_format=query.to_string()));
        let query_synchronize_attributes = param_synchronize_attributes.map_or_else(String::new, |query| format!("synchronizeAttributes={synchronize_attributes}&", synchronize_attributes=query.join(",")));
        let query_handle_logout = param_handle_logout.map_or_else(String::new, |query| format!("handleLogout={handle_logout}&", handle_logout=query.to_string()));
        let query_logout_url = param_logout_url.map_or_else(String::new, |query| format!("logoutUrl={logout_url}&", logout_url=query.to_string()));
        let query_clock_tolerance = param_clock_tolerance.map_or_else(String::new, |query| format!("clockTolerance={clock_tolerance}&", clock_tolerance=query.to_string()));
        let query_digest_method = param_digest_method.map_or_else(String::new, |query| format!("digestMethod={digest_method}&", digest_method=query.to_string()));
        let query_signature_method = param_signature_method.map_or_else(String::new, |query| format!("signatureMethod={signature_method}&", signature_method=query.to_string()));
        let query_user_intermediate_path = param_user_intermediate_path.map_or_else(String::new, |query| format!("userIntermediatePath={user_intermediate_path}&", user_intermediate_path=query.to_string()));
        let query_propertylist = param_propertylist.map_or_else(String::new, |query| format!("propertylist={propertylist}&", propertylist=query.join(",")));


        let uri = format!(
            "{}//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler?{post}{apply}{delete}{action}{location}{path}{service_ranking}{idp_url}{idp_cert_alias}{idp_http_redirect}{service_provider_entity_id}{assertion_consumer_service_url}{sp_private_key_alias}{key_store_password}{default_redirect_url}{user_id_attribute}{use_encryption}{create_user}{add_group_memberships}{group_membership_attribute}{default_groups}{name_id_format}{synchronize_attributes}{handle_logout}{logout_url}{clock_tolerance}{digest_method}{signature_method}{user_intermediate_path}{propertylist}",
            self.base_path,
            post=utf8_percent_encode(&query_post, QUERY_ENCODE_SET),
            apply=utf8_percent_encode(&query_apply, QUERY_ENCODE_SET),
            delete=utf8_percent_encode(&query_delete, QUERY_ENCODE_SET),
            action=utf8_percent_encode(&query_action, QUERY_ENCODE_SET),
            location=utf8_percent_encode(&query_location, QUERY_ENCODE_SET),
            path=utf8_percent_encode(&query_path, QUERY_ENCODE_SET),
            service_ranking=utf8_percent_encode(&query_service_ranking, QUERY_ENCODE_SET),
            idp_url=utf8_percent_encode(&query_idp_url, QUERY_ENCODE_SET),
            idp_cert_alias=utf8_percent_encode(&query_idp_cert_alias, QUERY_ENCODE_SET),
            idp_http_redirect=utf8_percent_encode(&query_idp_http_redirect, QUERY_ENCODE_SET),
            service_provider_entity_id=utf8_percent_encode(&query_service_provider_entity_id, QUERY_ENCODE_SET),
            assertion_consumer_service_url=utf8_percent_encode(&query_assertion_consumer_service_url, QUERY_ENCODE_SET),
            sp_private_key_alias=utf8_percent_encode(&query_sp_private_key_alias, QUERY_ENCODE_SET),
            key_store_password=utf8_percent_encode(&query_key_store_password, QUERY_ENCODE_SET),
            default_redirect_url=utf8_percent_encode(&query_default_redirect_url, QUERY_ENCODE_SET),
            user_id_attribute=utf8_percent_encode(&query_user_id_attribute, QUERY_ENCODE_SET),
            use_encryption=utf8_percent_encode(&query_use_encryption, QUERY_ENCODE_SET),
            create_user=utf8_percent_encode(&query_create_user, QUERY_ENCODE_SET),
            add_group_memberships=utf8_percent_encode(&query_add_group_memberships, QUERY_ENCODE_SET),
            group_membership_attribute=utf8_percent_encode(&query_group_membership_attribute, QUERY_ENCODE_SET),
            default_groups=utf8_percent_encode(&query_default_groups, QUERY_ENCODE_SET),
            name_id_format=utf8_percent_encode(&query_name_id_format, QUERY_ENCODE_SET),
            synchronize_attributes=utf8_percent_encode(&query_synchronize_attributes, QUERY_ENCODE_SET),
            handle_logout=utf8_percent_encode(&query_handle_logout, QUERY_ENCODE_SET),
            logout_url=utf8_percent_encode(&query_logout_url, QUERY_ENCODE_SET),
            clock_tolerance=utf8_percent_encode(&query_clock_tolerance, QUERY_ENCODE_SET),
            digest_method=utf8_percent_encode(&query_digest_method, QUERY_ENCODE_SET),
            signature_method=utf8_percent_encode(&query_signature_method, QUERY_ENCODE_SET),
            user_intermediate_path=utf8_percent_encode(&query_user_intermediate_path, QUERY_ENCODE_SET),
            propertylist=utf8_percent_encode(&query_propertylist, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostSamlConfigurationResponse::RetrievedAEMSAMLConfiguration(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                302 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostSamlConfigurationResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostSamlConfigurationResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_login_page(&self, context: &C) -> Box<Future<Item=GetLoginPageResponse, Error=ApiError>> {


        let uri = format!(
            "{}//libs/granite/core/content/login.html",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetLoginPageResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_cq_actions(&self, param_authorizable_id: String, param_changelog: String, context: &C) -> Box<Future<Item=PostCqActionsResponse, Error=ApiError>> {

        // Query parameters
        let query_authorizable_id = format!("authorizableId={authorizable_id}&", authorizable_id=param_authorizable_id.to_string());
        let query_changelog = format!("changelog={changelog}&", changelog=param_changelog.to_string());


        let uri = format!(
            "{}//.cqactions.html?{authorizable_id}{changelog}",
            self.base_path,
            authorizable_id=utf8_percent_encode(&query_authorizable_id, QUERY_ENCODE_SET),
            changelog=utf8_percent_encode(&query_changelog, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostCqActionsResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_crxde_status(&self, context: &C) -> Box<Future<Item=GetCrxdeStatusResponse, Error=ApiError>> {


        let uri = format!(
            "{}//crx/server/crx.default/jcr:root/.1.json",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetCrxdeStatusResponse::CRXDEIsEnabled(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetCrxdeStatusResponse::CRXDEIsDisabled(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_install_status(&self, context: &C) -> Box<Future<Item=GetInstallStatusResponse, Error=ApiError>> {


        let uri = format!(
            "{}//crx/packmgr/installstatus.jsp",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InstallStatus>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetInstallStatusResponse::RetrievedCRXPackageManagerInstallStatus(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetInstallStatusResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_package_manager_servlet(&self, context: &C) -> Box<Future<Item=GetPackageManagerServletResponse, Error=ApiError>> {


        let uri = format!(
            "{}//crx/packmgr/service/script.html",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                404 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetPackageManagerServletResponse::PackageManagerServletIsDisabled(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                405 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetPackageManagerServletResponse::PackageManagerServletIsActive(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_package_service(&self, param_cmd: String, context: &C) -> Box<Future<Item=PostPackageServiceResponse, Error=ApiError>> {

        // Query parameters
        let query_cmd = format!("cmd={cmd}&", cmd=param_cmd.to_string());


        let uri = format!(
            "{}//crx/packmgr/service.jsp?{cmd}",
            self.base_path,
            cmd=utf8_percent_encode(&query_cmd, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            PostPackageServiceResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_package_service_json(&self, param_path: String, param_cmd: String, param_group_name: Option<String>, param_package_name: Option<String>, param_package_version: Option<String>, param__charset_: Option<String>, param_force: Option<bool>, param_recursive: Option<bool>, param_package: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostPackageServiceJsonResponse, Error=ApiError>> {

        // Query parameters
        let query_cmd = format!("cmd={cmd}&", cmd=param_cmd.to_string());
        let query_group_name = param_group_name.map_or_else(String::new, |query| format!("groupName={group_name}&", group_name=query.to_string()));
        let query_package_name = param_package_name.map_or_else(String::new, |query| format!("packageName={package_name}&", package_name=query.to_string()));
        let query_package_version = param_package_version.map_or_else(String::new, |query| format!("packageVersion={package_version}&", package_version=query.to_string()));
        let query__charset_ = param__charset_.map_or_else(String::new, |query| format!("_charset_={_charset_}&", _charset_=query.to_string()));
        let query_force = param_force.map_or_else(String::new, |query| format!("force={force}&", force=query.to_string()));
        let query_recursive = param_recursive.map_or_else(String::new, |query| format!("recursive={recursive}&", recursive=query.to_string()));


        let uri = format!(
            "{}//crx/packmgr/service/.json/{path}?{cmd}{group_name}{package_name}{package_version}{_charset_}{force}{recursive}",
            self.base_path, path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET),
            cmd=utf8_percent_encode(&query_cmd, QUERY_ENCODE_SET),
            group_name=utf8_percent_encode(&query_group_name, QUERY_ENCODE_SET),
            package_name=utf8_percent_encode(&query_package_name, QUERY_ENCODE_SET),
            package_version=utf8_percent_encode(&query_package_version, QUERY_ENCODE_SET),
            _charset_=utf8_percent_encode(&query__charset_, QUERY_ENCODE_SET),
            force=utf8_percent_encode(&query_force, QUERY_ENCODE_SET),
            recursive=utf8_percent_encode(&query_recursive, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);

        let params = &[
            ("package", param_package.map(|param| format!("{:?}", param))),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        request.headers_mut().set(ContentType(mimetypes::requests::POST_PACKAGE_SERVICE_JSON.clone()));
        request.set_body(body.into_bytes());

        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            PostPackageServiceJsonResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_package_update(&self, param_group_name: String, param_package_name: String, param_version: String, param_path: String, param_filter: Option<String>, param__charset_: Option<String>, context: &C) -> Box<Future<Item=PostPackageUpdateResponse, Error=ApiError>> {

        // Query parameters
        let query_group_name = format!("groupName={group_name}&", group_name=param_group_name.to_string());
        let query_package_name = format!("packageName={package_name}&", package_name=param_package_name.to_string());
        let query_version = format!("version={version}&", version=param_version.to_string());
        let query_path = format!("path={path}&", path=param_path.to_string());
        let query_filter = param_filter.map_or_else(String::new, |query| format!("filter={filter}&", filter=query.to_string()));
        let query__charset_ = param__charset_.map_or_else(String::new, |query| format!("_charset_={_charset_}&", _charset_=query.to_string()));


        let uri = format!(
            "{}//crx/packmgr/update.jsp?{group_name}{package_name}{version}{path}{filter}{_charset_}",
            self.base_path,
            group_name=utf8_percent_encode(&query_group_name, QUERY_ENCODE_SET),
            package_name=utf8_percent_encode(&query_package_name, QUERY_ENCODE_SET),
            version=utf8_percent_encode(&query_version, QUERY_ENCODE_SET),
            path=utf8_percent_encode(&query_path, QUERY_ENCODE_SET),
            filter=utf8_percent_encode(&query_filter, QUERY_ENCODE_SET),
            _charset_=utf8_percent_encode(&query__charset_, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            PostPackageUpdateResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_set_password(&self, param_old: String, param_plain: String, param_verify: String, context: &C) -> Box<Future<Item=PostSetPasswordResponse, Error=ApiError>> {

        // Query parameters
        let query_old = format!("old={old}&", old=param_old.to_string());
        let query_plain = format!("plain={plain}&", plain=param_plain.to_string());
        let query_verify = format!("verify={verify}&", verify=param_verify.to_string());


        let uri = format!(
            "{}//crx/explorer/ui/setpassword.jsp?{old}{plain}{verify}",
            self.base_path,
            old=utf8_percent_encode(&query_old, QUERY_ENCODE_SET),
            plain=utf8_percent_encode(&query_plain, QUERY_ENCODE_SET),
            verify=utf8_percent_encode(&query_verify, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostSetPasswordResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_aem_health_check(&self, param_tags: Option<String>, param_combine_tags_or: Option<bool>, context: &C) -> Box<Future<Item=GetAemHealthCheckResponse, Error=ApiError>> {

        // Query parameters
        let query_tags = param_tags.map_or_else(String::new, |query| format!("tags={tags}&", tags=query.to_string()));
        let query_combine_tags_or = param_combine_tags_or.map_or_else(String::new, |query| format!("combineTagsOr={combine_tags_or}&", combine_tags_or=query.to_string()));


        let uri = format!(
            "{}//system/health?{tags}{combine_tags_or}",
            self.base_path,
            tags=utf8_percent_encode(&query_tags, QUERY_ENCODE_SET),
            combine_tags_or=utf8_percent_encode(&query_combine_tags_or, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAemHealthCheckResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_aem_health_check_servlet(&self, param_bundles_ignored: Option<&Vec<String>>, param_bundles_ignored_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigAemHealthCheckServletResponse, Error=ApiError>> {

        // Query parameters
        let query_bundles_ignored = param_bundles_ignored.map_or_else(String::new, |query| format!("bundles.ignored={bundles_ignored}&", bundles_ignored=query.join(",")));
        let query_bundles_ignored_type_hint = param_bundles_ignored_type_hint.map_or_else(String::new, |query| format!("bundles.ignored@TypeHint={bundles_ignored_type_hint}&", bundles_ignored_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck?{bundles_ignored}{bundles_ignored_type_hint}",
            self.base_path,
            bundles_ignored=utf8_percent_encode(&query_bundles_ignored, QUERY_ENCODE_SET),
            bundles_ignored_type_hint=utf8_percent_encode(&query_bundles_ignored_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigAemHealthCheckServletResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_aem_password_reset(&self, param_pwdreset_authorizables: Option<&Vec<String>>, param_pwdreset_authorizables_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigAemPasswordResetResponse, Error=ApiError>> {

        // Query parameters
        let query_pwdreset_authorizables = param_pwdreset_authorizables.map_or_else(String::new, |query| format!("pwdreset.authorizables={pwdreset_authorizables}&", pwdreset_authorizables=query.join(",")));
        let query_pwdreset_authorizables_type_hint = param_pwdreset_authorizables_type_hint.map_or_else(String::new, |query| format!("pwdreset.authorizables@TypeHint={pwdreset_authorizables_type_hint}&", pwdreset_authorizables_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/com.shinesolutions.aem.passwordreset.Activator?{pwdreset_authorizables}{pwdreset_authorizables_type_hint}",
            self.base_path,
            pwdreset_authorizables=utf8_percent_encode(&query_pwdreset_authorizables, QUERY_ENCODE_SET),
            pwdreset_authorizables_type_hint=utf8_percent_encode(&query_pwdreset_authorizables_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigAemPasswordResetResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_agent(&self, param_runmode: String, param_name: String, context: &C) -> Box<Future<Item=DeleteAgentResponse, Error=ApiError>> {


        let uri = format!(
            "{}//etc/replication/agents.{runmode}/{name}",
            self.base_path, runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteAgentResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_node(&self, param_path: String, param_name: String, context: &C) -> Box<Future<Item=DeleteNodeResponse, Error=ApiError>> {


        let uri = format!(
            "{}//{path}/{name}",
            self.base_path, path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteNodeResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_agent(&self, param_runmode: String, param_name: String, context: &C) -> Box<Future<Item=GetAgentResponse, Error=ApiError>> {


        let uri = format!(
            "{}//etc/replication/agents.{runmode}/{name}",
            self.base_path, runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetAgentResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_agents(&self, param_runmode: String, context: &C) -> Box<Future<Item=GetAgentsResponse, Error=ApiError>> {


        let uri = format!(
            "{}//etc/replication/agents.{runmode}.-1.json",
            self.base_path, runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAgentsResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_authorizable_keystore(&self, param_intermediate_path: String, param_authorizable_id: String, context: &C) -> Box<Future<Item=GetAuthorizableKeystoreResponse, Error=ApiError>> {


        let uri = format!(
            "{}//{intermediatePath}/{authorizableId}.ks.json",
            self.base_path, intermediatePath=utf8_percent_encode(&param_intermediate_path.to_string(), ID_ENCODE_SET), authorizableId=utf8_percent_encode(&param_authorizable_id.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            GetAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            GetAuthorizableKeystoreResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_keystore(&self, param_intermediate_path: String, param_authorizable_id: String, context: &C) -> Box<Future<Item=GetKeystoreResponse, Error=ApiError>> {


        let uri = format!(
            "{}//{intermediatePath}/{authorizableId}/keystore/store.p12",
            self.base_path, intermediatePath=utf8_percent_encode(&param_intermediate_path.to_string(), ID_ENCODE_SET), authorizableId=utf8_percent_encode(&param_authorizable_id.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<swagger::ByteArray>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetKeystoreResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_node(&self, param_path: String, param_name: String, context: &C) -> Box<Future<Item=GetNodeResponse, Error=ApiError>> {


        let uri = format!(
            "{}//{path}/{name}",
            self.base_path, path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetNodeResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_package(&self, param_group: String, param_name: String, param_version: String, context: &C) -> Box<Future<Item=GetPackageResponse, Error=ApiError>> {


        let uri = format!(
            "{}//etc/packages/{group}/{name}-{version}.zip",
            self.base_path, group=utf8_percent_encode(&param_group.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET), version=utf8_percent_encode(&param_version.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<swagger::ByteArray>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetPackageResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_package_filter(&self, param_group: String, param_name: String, param_version: String, context: &C) -> Box<Future<Item=GetPackageFilterResponse, Error=ApiError>> {


        let uri = format!(
            "{}//etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json",
            self.base_path, group=utf8_percent_encode(&param_group.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET), version=utf8_percent_encode(&param_version.to_string(), ID_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetPackageFilterResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_query(&self, param_path: String, param_p_limit: f64, param__1_property: String, param__1_property_value: String, context: &C) -> Box<Future<Item=GetQueryResponse, Error=ApiError>> {

        // Query parameters
        let query_path = format!("path={path}&", path=param_path.to_string());
        let query_p_limit = format!("p.limit={p_limit}&", p_limit=param_p_limit.to_string());
        let query__1_property = format!("1_property={_1_property}&", _1_property=param__1_property.to_string());
        let query__1_property_value = format!("1_property.value={_1_property_value}&", _1_property_value=param__1_property_value.to_string());


        let uri = format!(
            "{}//bin/querybuilder.json?{path}{p_limit}{_1_property}{_1_property_value}",
            self.base_path,
            path=utf8_percent_encode(&query_path, QUERY_ENCODE_SET),
            p_limit=utf8_percent_encode(&query_p_limit, QUERY_ENCODE_SET),
            _1_property=utf8_percent_encode(&query__1_property, QUERY_ENCODE_SET),
            _1_property_value=utf8_percent_encode(&query__1_property_value, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetQueryResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_truststore(&self, context: &C) -> Box<Future<Item=GetTruststoreResponse, Error=ApiError>> {


        let uri = format!(
            "{}//etc/truststore/truststore.p12",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<swagger::ByteArray>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetTruststoreResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_truststore_info(&self, context: &C) -> Box<Future<Item=GetTruststoreInfoResponse, Error=ApiError>> {


        let uri = format!(
            "{}//libs/granite/security/truststore.json",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::TruststoreInfo>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetTruststoreInfoResponse::RetrievedAEMTruststoreInfo(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetTruststoreInfoResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_agent(&self, param_runmode: String, param_name: String, param_jcrcontentcqdistribute: Option<bool>, param_jcrcontentcqdistribute_type_hint: Option<String>, param_jcrcontentcqname: Option<String>, param_jcrcontentcqtemplate: Option<String>, param_jcrcontentenabled: Option<bool>, param_jcrcontentjcrdescription: Option<String>, param_jcrcontentjcrlast_modified: Option<String>, param_jcrcontentjcrlast_modified_by: Option<String>, param_jcrcontentjcrmixin_types: Option<String>, param_jcrcontentjcrtitle: Option<String>, param_jcrcontentlog_level: Option<String>, param_jcrcontentno_status_update: Option<bool>, param_jcrcontentno_versioning: Option<bool>, param_jcrcontentprotocol_connect_timeout: Option<f64>, param_jcrcontentprotocol_http_connection_closed: Option<bool>, param_jcrcontentprotocol_http_expired: Option<String>, param_jcrcontentprotocol_http_headers: Option<&Vec<String>>, param_jcrcontentprotocol_http_headers_type_hint: Option<String>, param_jcrcontentprotocol_http_method: Option<String>, param_jcrcontentprotocol_https_relaxed: Option<bool>, param_jcrcontentprotocol_interface: Option<String>, param_jcrcontentprotocol_socket_timeout: Option<f64>, param_jcrcontentprotocol_version: Option<String>, param_jcrcontentproxy_ntlm_domain: Option<String>, param_jcrcontentproxy_ntlm_host: Option<String>, param_jcrcontentproxy_host: Option<String>, param_jcrcontentproxy_password: Option<String>, param_jcrcontentproxy_port: Option<f64>, param_jcrcontentproxy_user: Option<String>, param_jcrcontentqueue_batch_max_size: Option<f64>, param_jcrcontentqueue_batch_mode: Option<String>, param_jcrcontentqueue_batch_wait_time: Option<f64>, param_jcrcontentretry_delay: Option<String>, param_jcrcontentreverse_replication: Option<bool>, param_jcrcontentserialization_type: Option<String>, param_jcrcontentslingresource_type: Option<String>, param_jcrcontentssl: Option<String>, param_jcrcontenttransport_ntlm_domain: Option<String>, param_jcrcontenttransport_ntlm_host: Option<String>, param_jcrcontenttransport_password: Option<String>, param_jcrcontenttransport_uri: Option<String>, param_jcrcontenttransport_user: Option<String>, param_jcrcontenttrigger_distribute: Option<bool>, param_jcrcontenttrigger_modified: Option<bool>, param_jcrcontenttrigger_on_off_time: Option<bool>, param_jcrcontenttrigger_receive: Option<bool>, param_jcrcontenttrigger_specific: Option<bool>, param_jcrcontentuser_id: Option<String>, param_jcrprimary_type: Option<String>, param_operation: Option<String>, context: &C) -> Box<Future<Item=PostAgentResponse, Error=ApiError>> {

        // Query parameters
        let query_jcrcontentcqdistribute = param_jcrcontentcqdistribute.map_or_else(String::new, |query| format!("jcr:content/cq:distribute={jcrcontentcqdistribute}&", jcrcontentcqdistribute=query.to_string()));
        let query_jcrcontentcqdistribute_type_hint = param_jcrcontentcqdistribute_type_hint.map_or_else(String::new, |query| format!("jcr:content/cq:distribute@TypeHint={jcrcontentcqdistribute_type_hint}&", jcrcontentcqdistribute_type_hint=query.to_string()));
        let query_jcrcontentcqname = param_jcrcontentcqname.map_or_else(String::new, |query| format!("jcr:content/cq:name={jcrcontentcqname}&", jcrcontentcqname=query.to_string()));
        let query_jcrcontentcqtemplate = param_jcrcontentcqtemplate.map_or_else(String::new, |query| format!("jcr:content/cq:template={jcrcontentcqtemplate}&", jcrcontentcqtemplate=query.to_string()));
        let query_jcrcontentenabled = param_jcrcontentenabled.map_or_else(String::new, |query| format!("jcr:content/enabled={jcrcontentenabled}&", jcrcontentenabled=query.to_string()));
        let query_jcrcontentjcrdescription = param_jcrcontentjcrdescription.map_or_else(String::new, |query| format!("jcr:content/jcr:description={jcrcontentjcrdescription}&", jcrcontentjcrdescription=query.to_string()));
        let query_jcrcontentjcrlast_modified = param_jcrcontentjcrlast_modified.map_or_else(String::new, |query| format!("jcr:content/jcr:lastModified={jcrcontentjcrlast_modified}&", jcrcontentjcrlast_modified=query.to_string()));
        let query_jcrcontentjcrlast_modified_by = param_jcrcontentjcrlast_modified_by.map_or_else(String::new, |query| format!("jcr:content/jcr:lastModifiedBy={jcrcontentjcrlast_modified_by}&", jcrcontentjcrlast_modified_by=query.to_string()));
        let query_jcrcontentjcrmixin_types = param_jcrcontentjcrmixin_types.map_or_else(String::new, |query| format!("jcr:content/jcr:mixinTypes={jcrcontentjcrmixin_types}&", jcrcontentjcrmixin_types=query.to_string()));
        let query_jcrcontentjcrtitle = param_jcrcontentjcrtitle.map_or_else(String::new, |query| format!("jcr:content/jcr:title={jcrcontentjcrtitle}&", jcrcontentjcrtitle=query.to_string()));
        let query_jcrcontentlog_level = param_jcrcontentlog_level.map_or_else(String::new, |query| format!("jcr:content/logLevel={jcrcontentlog_level}&", jcrcontentlog_level=query.to_string()));
        let query_jcrcontentno_status_update = param_jcrcontentno_status_update.map_or_else(String::new, |query| format!("jcr:content/noStatusUpdate={jcrcontentno_status_update}&", jcrcontentno_status_update=query.to_string()));
        let query_jcrcontentno_versioning = param_jcrcontentno_versioning.map_or_else(String::new, |query| format!("jcr:content/noVersioning={jcrcontentno_versioning}&", jcrcontentno_versioning=query.to_string()));
        let query_jcrcontentprotocol_connect_timeout = param_jcrcontentprotocol_connect_timeout.map_or_else(String::new, |query| format!("jcr:content/protocolConnectTimeout={jcrcontentprotocol_connect_timeout}&", jcrcontentprotocol_connect_timeout=query.to_string()));
        let query_jcrcontentprotocol_http_connection_closed = param_jcrcontentprotocol_http_connection_closed.map_or_else(String::new, |query| format!("jcr:content/protocolHTTPConnectionClosed={jcrcontentprotocol_http_connection_closed}&", jcrcontentprotocol_http_connection_closed=query.to_string()));
        let query_jcrcontentprotocol_http_expired = param_jcrcontentprotocol_http_expired.map_or_else(String::new, |query| format!("jcr:content/protocolHTTPExpired={jcrcontentprotocol_http_expired}&", jcrcontentprotocol_http_expired=query.to_string()));
        let query_jcrcontentprotocol_http_headers = param_jcrcontentprotocol_http_headers.map_or_else(String::new, |query| format!("jcr:content/protocolHTTPHeaders={jcrcontentprotocol_http_headers}&", jcrcontentprotocol_http_headers=query.join(",")));
        let query_jcrcontentprotocol_http_headers_type_hint = param_jcrcontentprotocol_http_headers_type_hint.map_or_else(String::new, |query| format!("jcr:content/protocolHTTPHeaders@TypeHint={jcrcontentprotocol_http_headers_type_hint}&", jcrcontentprotocol_http_headers_type_hint=query.to_string()));
        let query_jcrcontentprotocol_http_method = param_jcrcontentprotocol_http_method.map_or_else(String::new, |query| format!("jcr:content/protocolHTTPMethod={jcrcontentprotocol_http_method}&", jcrcontentprotocol_http_method=query.to_string()));
        let query_jcrcontentprotocol_https_relaxed = param_jcrcontentprotocol_https_relaxed.map_or_else(String::new, |query| format!("jcr:content/protocolHTTPSRelaxed={jcrcontentprotocol_https_relaxed}&", jcrcontentprotocol_https_relaxed=query.to_string()));
        let query_jcrcontentprotocol_interface = param_jcrcontentprotocol_interface.map_or_else(String::new, |query| format!("jcr:content/protocolInterface={jcrcontentprotocol_interface}&", jcrcontentprotocol_interface=query.to_string()));
        let query_jcrcontentprotocol_socket_timeout = param_jcrcontentprotocol_socket_timeout.map_or_else(String::new, |query| format!("jcr:content/protocolSocketTimeout={jcrcontentprotocol_socket_timeout}&", jcrcontentprotocol_socket_timeout=query.to_string()));
        let query_jcrcontentprotocol_version = param_jcrcontentprotocol_version.map_or_else(String::new, |query| format!("jcr:content/protocolVersion={jcrcontentprotocol_version}&", jcrcontentprotocol_version=query.to_string()));
        let query_jcrcontentproxy_ntlm_domain = param_jcrcontentproxy_ntlm_domain.map_or_else(String::new, |query| format!("jcr:content/proxyNTLMDomain={jcrcontentproxy_ntlm_domain}&", jcrcontentproxy_ntlm_domain=query.to_string()));
        let query_jcrcontentproxy_ntlm_host = param_jcrcontentproxy_ntlm_host.map_or_else(String::new, |query| format!("jcr:content/proxyNTLMHost={jcrcontentproxy_ntlm_host}&", jcrcontentproxy_ntlm_host=query.to_string()));
        let query_jcrcontentproxy_host = param_jcrcontentproxy_host.map_or_else(String::new, |query| format!("jcr:content/proxyHost={jcrcontentproxy_host}&", jcrcontentproxy_host=query.to_string()));
        let query_jcrcontentproxy_password = param_jcrcontentproxy_password.map_or_else(String::new, |query| format!("jcr:content/proxyPassword={jcrcontentproxy_password}&", jcrcontentproxy_password=query.to_string()));
        let query_jcrcontentproxy_port = param_jcrcontentproxy_port.map_or_else(String::new, |query| format!("jcr:content/proxyPort={jcrcontentproxy_port}&", jcrcontentproxy_port=query.to_string()));
        let query_jcrcontentproxy_user = param_jcrcontentproxy_user.map_or_else(String::new, |query| format!("jcr:content/proxyUser={jcrcontentproxy_user}&", jcrcontentproxy_user=query.to_string()));
        let query_jcrcontentqueue_batch_max_size = param_jcrcontentqueue_batch_max_size.map_or_else(String::new, |query| format!("jcr:content/queueBatchMaxSize={jcrcontentqueue_batch_max_size}&", jcrcontentqueue_batch_max_size=query.to_string()));
        let query_jcrcontentqueue_batch_mode = param_jcrcontentqueue_batch_mode.map_or_else(String::new, |query| format!("jcr:content/queueBatchMode={jcrcontentqueue_batch_mode}&", jcrcontentqueue_batch_mode=query.to_string()));
        let query_jcrcontentqueue_batch_wait_time = param_jcrcontentqueue_batch_wait_time.map_or_else(String::new, |query| format!("jcr:content/queueBatchWaitTime={jcrcontentqueue_batch_wait_time}&", jcrcontentqueue_batch_wait_time=query.to_string()));
        let query_jcrcontentretry_delay = param_jcrcontentretry_delay.map_or_else(String::new, |query| format!("jcr:content/retryDelay={jcrcontentretry_delay}&", jcrcontentretry_delay=query.to_string()));
        let query_jcrcontentreverse_replication = param_jcrcontentreverse_replication.map_or_else(String::new, |query| format!("jcr:content/reverseReplication={jcrcontentreverse_replication}&", jcrcontentreverse_replication=query.to_string()));
        let query_jcrcontentserialization_type = param_jcrcontentserialization_type.map_or_else(String::new, |query| format!("jcr:content/serializationType={jcrcontentserialization_type}&", jcrcontentserialization_type=query.to_string()));
        let query_jcrcontentslingresource_type = param_jcrcontentslingresource_type.map_or_else(String::new, |query| format!("jcr:content/sling:resourceType={jcrcontentslingresource_type}&", jcrcontentslingresource_type=query.to_string()));
        let query_jcrcontentssl = param_jcrcontentssl.map_or_else(String::new, |query| format!("jcr:content/ssl={jcrcontentssl}&", jcrcontentssl=query.to_string()));
        let query_jcrcontenttransport_ntlm_domain = param_jcrcontenttransport_ntlm_domain.map_or_else(String::new, |query| format!("jcr:content/transportNTLMDomain={jcrcontenttransport_ntlm_domain}&", jcrcontenttransport_ntlm_domain=query.to_string()));
        let query_jcrcontenttransport_ntlm_host = param_jcrcontenttransport_ntlm_host.map_or_else(String::new, |query| format!("jcr:content/transportNTLMHost={jcrcontenttransport_ntlm_host}&", jcrcontenttransport_ntlm_host=query.to_string()));
        let query_jcrcontenttransport_password = param_jcrcontenttransport_password.map_or_else(String::new, |query| format!("jcr:content/transportPassword={jcrcontenttransport_password}&", jcrcontenttransport_password=query.to_string()));
        let query_jcrcontenttransport_uri = param_jcrcontenttransport_uri.map_or_else(String::new, |query| format!("jcr:content/transportUri={jcrcontenttransport_uri}&", jcrcontenttransport_uri=query.to_string()));
        let query_jcrcontenttransport_user = param_jcrcontenttransport_user.map_or_else(String::new, |query| format!("jcr:content/transportUser={jcrcontenttransport_user}&", jcrcontenttransport_user=query.to_string()));
        let query_jcrcontenttrigger_distribute = param_jcrcontenttrigger_distribute.map_or_else(String::new, |query| format!("jcr:content/triggerDistribute={jcrcontenttrigger_distribute}&", jcrcontenttrigger_distribute=query.to_string()));
        let query_jcrcontenttrigger_modified = param_jcrcontenttrigger_modified.map_or_else(String::new, |query| format!("jcr:content/triggerModified={jcrcontenttrigger_modified}&", jcrcontenttrigger_modified=query.to_string()));
        let query_jcrcontenttrigger_on_off_time = param_jcrcontenttrigger_on_off_time.map_or_else(String::new, |query| format!("jcr:content/triggerOnOffTime={jcrcontenttrigger_on_off_time}&", jcrcontenttrigger_on_off_time=query.to_string()));
        let query_jcrcontenttrigger_receive = param_jcrcontenttrigger_receive.map_or_else(String::new, |query| format!("jcr:content/triggerReceive={jcrcontenttrigger_receive}&", jcrcontenttrigger_receive=query.to_string()));
        let query_jcrcontenttrigger_specific = param_jcrcontenttrigger_specific.map_or_else(String::new, |query| format!("jcr:content/triggerSpecific={jcrcontenttrigger_specific}&", jcrcontenttrigger_specific=query.to_string()));
        let query_jcrcontentuser_id = param_jcrcontentuser_id.map_or_else(String::new, |query| format!("jcr:content/userId={jcrcontentuser_id}&", jcrcontentuser_id=query.to_string()));
        let query_jcrprimary_type = param_jcrprimary_type.map_or_else(String::new, |query| format!("jcr:primaryType={jcrprimary_type}&", jcrprimary_type=query.to_string()));
        let query_operation = param_operation.map_or_else(String::new, |query| format!(":operation={operation}&", operation=query.to_string()));


        let uri = format!(
            "{}//etc/replication/agents.{runmode}/{name}?{jcrcontentcqdistribute}{jcrcontentcqdistribute_type_hint}{jcrcontentcqname}{jcrcontentcqtemplate}{jcrcontentenabled}{jcrcontentjcrdescription}{jcrcontentjcrlast_modified}{jcrcontentjcrlast_modified_by}{jcrcontentjcrmixin_types}{jcrcontentjcrtitle}{jcrcontentlog_level}{jcrcontentno_status_update}{jcrcontentno_versioning}{jcrcontentprotocol_connect_timeout}{jcrcontentprotocol_http_connection_closed}{jcrcontentprotocol_http_expired}{jcrcontentprotocol_http_headers}{jcrcontentprotocol_http_headers_type_hint}{jcrcontentprotocol_http_method}{jcrcontentprotocol_https_relaxed}{jcrcontentprotocol_interface}{jcrcontentprotocol_socket_timeout}{jcrcontentprotocol_version}{jcrcontentproxy_ntlm_domain}{jcrcontentproxy_ntlm_host}{jcrcontentproxy_host}{jcrcontentproxy_password}{jcrcontentproxy_port}{jcrcontentproxy_user}{jcrcontentqueue_batch_max_size}{jcrcontentqueue_batch_mode}{jcrcontentqueue_batch_wait_time}{jcrcontentretry_delay}{jcrcontentreverse_replication}{jcrcontentserialization_type}{jcrcontentslingresource_type}{jcrcontentssl}{jcrcontenttransport_ntlm_domain}{jcrcontenttransport_ntlm_host}{jcrcontenttransport_password}{jcrcontenttransport_uri}{jcrcontenttransport_user}{jcrcontenttrigger_distribute}{jcrcontenttrigger_modified}{jcrcontenttrigger_on_off_time}{jcrcontenttrigger_receive}{jcrcontenttrigger_specific}{jcrcontentuser_id}{jcrprimary_type}{operation}",
            self.base_path, runmode=utf8_percent_encode(&param_runmode.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET),
            jcrcontentcqdistribute=utf8_percent_encode(&query_jcrcontentcqdistribute, QUERY_ENCODE_SET),
            jcrcontentcqdistribute_type_hint=utf8_percent_encode(&query_jcrcontentcqdistribute_type_hint, QUERY_ENCODE_SET),
            jcrcontentcqname=utf8_percent_encode(&query_jcrcontentcqname, QUERY_ENCODE_SET),
            jcrcontentcqtemplate=utf8_percent_encode(&query_jcrcontentcqtemplate, QUERY_ENCODE_SET),
            jcrcontentenabled=utf8_percent_encode(&query_jcrcontentenabled, QUERY_ENCODE_SET),
            jcrcontentjcrdescription=utf8_percent_encode(&query_jcrcontentjcrdescription, QUERY_ENCODE_SET),
            jcrcontentjcrlast_modified=utf8_percent_encode(&query_jcrcontentjcrlast_modified, QUERY_ENCODE_SET),
            jcrcontentjcrlast_modified_by=utf8_percent_encode(&query_jcrcontentjcrlast_modified_by, QUERY_ENCODE_SET),
            jcrcontentjcrmixin_types=utf8_percent_encode(&query_jcrcontentjcrmixin_types, QUERY_ENCODE_SET),
            jcrcontentjcrtitle=utf8_percent_encode(&query_jcrcontentjcrtitle, QUERY_ENCODE_SET),
            jcrcontentlog_level=utf8_percent_encode(&query_jcrcontentlog_level, QUERY_ENCODE_SET),
            jcrcontentno_status_update=utf8_percent_encode(&query_jcrcontentno_status_update, QUERY_ENCODE_SET),
            jcrcontentno_versioning=utf8_percent_encode(&query_jcrcontentno_versioning, QUERY_ENCODE_SET),
            jcrcontentprotocol_connect_timeout=utf8_percent_encode(&query_jcrcontentprotocol_connect_timeout, QUERY_ENCODE_SET),
            jcrcontentprotocol_http_connection_closed=utf8_percent_encode(&query_jcrcontentprotocol_http_connection_closed, QUERY_ENCODE_SET),
            jcrcontentprotocol_http_expired=utf8_percent_encode(&query_jcrcontentprotocol_http_expired, QUERY_ENCODE_SET),
            jcrcontentprotocol_http_headers=utf8_percent_encode(&query_jcrcontentprotocol_http_headers, QUERY_ENCODE_SET),
            jcrcontentprotocol_http_headers_type_hint=utf8_percent_encode(&query_jcrcontentprotocol_http_headers_type_hint, QUERY_ENCODE_SET),
            jcrcontentprotocol_http_method=utf8_percent_encode(&query_jcrcontentprotocol_http_method, QUERY_ENCODE_SET),
            jcrcontentprotocol_https_relaxed=utf8_percent_encode(&query_jcrcontentprotocol_https_relaxed, QUERY_ENCODE_SET),
            jcrcontentprotocol_interface=utf8_percent_encode(&query_jcrcontentprotocol_interface, QUERY_ENCODE_SET),
            jcrcontentprotocol_socket_timeout=utf8_percent_encode(&query_jcrcontentprotocol_socket_timeout, QUERY_ENCODE_SET),
            jcrcontentprotocol_version=utf8_percent_encode(&query_jcrcontentprotocol_version, QUERY_ENCODE_SET),
            jcrcontentproxy_ntlm_domain=utf8_percent_encode(&query_jcrcontentproxy_ntlm_domain, QUERY_ENCODE_SET),
            jcrcontentproxy_ntlm_host=utf8_percent_encode(&query_jcrcontentproxy_ntlm_host, QUERY_ENCODE_SET),
            jcrcontentproxy_host=utf8_percent_encode(&query_jcrcontentproxy_host, QUERY_ENCODE_SET),
            jcrcontentproxy_password=utf8_percent_encode(&query_jcrcontentproxy_password, QUERY_ENCODE_SET),
            jcrcontentproxy_port=utf8_percent_encode(&query_jcrcontentproxy_port, QUERY_ENCODE_SET),
            jcrcontentproxy_user=utf8_percent_encode(&query_jcrcontentproxy_user, QUERY_ENCODE_SET),
            jcrcontentqueue_batch_max_size=utf8_percent_encode(&query_jcrcontentqueue_batch_max_size, QUERY_ENCODE_SET),
            jcrcontentqueue_batch_mode=utf8_percent_encode(&query_jcrcontentqueue_batch_mode, QUERY_ENCODE_SET),
            jcrcontentqueue_batch_wait_time=utf8_percent_encode(&query_jcrcontentqueue_batch_wait_time, QUERY_ENCODE_SET),
            jcrcontentretry_delay=utf8_percent_encode(&query_jcrcontentretry_delay, QUERY_ENCODE_SET),
            jcrcontentreverse_replication=utf8_percent_encode(&query_jcrcontentreverse_replication, QUERY_ENCODE_SET),
            jcrcontentserialization_type=utf8_percent_encode(&query_jcrcontentserialization_type, QUERY_ENCODE_SET),
            jcrcontentslingresource_type=utf8_percent_encode(&query_jcrcontentslingresource_type, QUERY_ENCODE_SET),
            jcrcontentssl=utf8_percent_encode(&query_jcrcontentssl, QUERY_ENCODE_SET),
            jcrcontenttransport_ntlm_domain=utf8_percent_encode(&query_jcrcontenttransport_ntlm_domain, QUERY_ENCODE_SET),
            jcrcontenttransport_ntlm_host=utf8_percent_encode(&query_jcrcontenttransport_ntlm_host, QUERY_ENCODE_SET),
            jcrcontenttransport_password=utf8_percent_encode(&query_jcrcontenttransport_password, QUERY_ENCODE_SET),
            jcrcontenttransport_uri=utf8_percent_encode(&query_jcrcontenttransport_uri, QUERY_ENCODE_SET),
            jcrcontenttransport_user=utf8_percent_encode(&query_jcrcontenttransport_user, QUERY_ENCODE_SET),
            jcrcontenttrigger_distribute=utf8_percent_encode(&query_jcrcontenttrigger_distribute, QUERY_ENCODE_SET),
            jcrcontenttrigger_modified=utf8_percent_encode(&query_jcrcontenttrigger_modified, QUERY_ENCODE_SET),
            jcrcontenttrigger_on_off_time=utf8_percent_encode(&query_jcrcontenttrigger_on_off_time, QUERY_ENCODE_SET),
            jcrcontenttrigger_receive=utf8_percent_encode(&query_jcrcontenttrigger_receive, QUERY_ENCODE_SET),
            jcrcontenttrigger_specific=utf8_percent_encode(&query_jcrcontenttrigger_specific, QUERY_ENCODE_SET),
            jcrcontentuser_id=utf8_percent_encode(&query_jcrcontentuser_id, QUERY_ENCODE_SET),
            jcrprimary_type=utf8_percent_encode(&query_jcrprimary_type, QUERY_ENCODE_SET),
            operation=utf8_percent_encode(&query_operation, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostAgentResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_authorizable_keystore(&self, param_intermediate_path: String, param_authorizable_id: String, param_operation: Option<String>, param_current_password: Option<String>, param_new_password: Option<String>, param_re_password: Option<String>, param_key_password: Option<String>, param_key_store_pass: Option<String>, param_alias: Option<String>, param_new_alias: Option<String>, param_remove_alias: Option<String>, param_cert_chain: Option<swagger::ByteArray>, param_pk: Option<swagger::ByteArray>, param_key_store: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostAuthorizableKeystoreResponse, Error=ApiError>> {

        // Query parameters
        let query_operation = param_operation.map_or_else(String::new, |query| format!(":operation={operation}&", operation=query.to_string()));
        let query_current_password = param_current_password.map_or_else(String::new, |query| format!("currentPassword={current_password}&", current_password=query.to_string()));
        let query_new_password = param_new_password.map_or_else(String::new, |query| format!("newPassword={new_password}&", new_password=query.to_string()));
        let query_re_password = param_re_password.map_or_else(String::new, |query| format!("rePassword={re_password}&", re_password=query.to_string()));
        let query_key_password = param_key_password.map_or_else(String::new, |query| format!("keyPassword={key_password}&", key_password=query.to_string()));
        let query_key_store_pass = param_key_store_pass.map_or_else(String::new, |query| format!("keyStorePass={key_store_pass}&", key_store_pass=query.to_string()));
        let query_alias = param_alias.map_or_else(String::new, |query| format!("alias={alias}&", alias=query.to_string()));
        let query_new_alias = param_new_alias.map_or_else(String::new, |query| format!("newAlias={new_alias}&", new_alias=query.to_string()));
        let query_remove_alias = param_remove_alias.map_or_else(String::new, |query| format!("removeAlias={remove_alias}&", remove_alias=query.to_string()));


        let uri = format!(
            "{}//{intermediatePath}/{authorizableId}.ks.html?{operation}{current_password}{new_password}{re_password}{key_password}{key_store_pass}{alias}{new_alias}{remove_alias}",
            self.base_path, intermediatePath=utf8_percent_encode(&param_intermediate_path.to_string(), ID_ENCODE_SET), authorizableId=utf8_percent_encode(&param_authorizable_id.to_string(), ID_ENCODE_SET),
            operation=utf8_percent_encode(&query_operation, QUERY_ENCODE_SET),
            current_password=utf8_percent_encode(&query_current_password, QUERY_ENCODE_SET),
            new_password=utf8_percent_encode(&query_new_password, QUERY_ENCODE_SET),
            re_password=utf8_percent_encode(&query_re_password, QUERY_ENCODE_SET),
            key_password=utf8_percent_encode(&query_key_password, QUERY_ENCODE_SET),
            key_store_pass=utf8_percent_encode(&query_key_store_pass, QUERY_ENCODE_SET),
            alias=utf8_percent_encode(&query_alias, QUERY_ENCODE_SET),
            new_alias=utf8_percent_encode(&query_new_alias, QUERY_ENCODE_SET),
            remove_alias=utf8_percent_encode(&query_remove_alias, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);

        let params = &[
            ("cert-chain", param_cert_chain.map(|param| format!("{:?}", param))),
            ("pk", param_pk.map(|param| format!("{:?}", param))),
            ("keyStore", param_key_store.map(|param| format!("{:?}", param))),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        request.headers_mut().set(ContentType(mimetypes::requests::POST_AUTHORIZABLE_KEYSTORE.clone()));
        request.set_body(body.into_bytes());

        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostAuthorizableKeystoreResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_authorizables(&self, param_authorizable_id: String, param_intermediate_path: String, param_create_user: Option<String>, param_create_group: Option<String>, param_reppassword: Option<String>, param_profilegiven_name: Option<String>, context: &C) -> Box<Future<Item=PostAuthorizablesResponse, Error=ApiError>> {

        // Query parameters
        let query_authorizable_id = format!("authorizableId={authorizable_id}&", authorizable_id=param_authorizable_id.to_string());
        let query_intermediate_path = format!("intermediatePath={intermediate_path}&", intermediate_path=param_intermediate_path.to_string());
        let query_create_user = param_create_user.map_or_else(String::new, |query| format!("createUser={create_user}&", create_user=query.to_string()));
        let query_create_group = param_create_group.map_or_else(String::new, |query| format!("createGroup={create_group}&", create_group=query.to_string()));
        let query_reppassword = param_reppassword.map_or_else(String::new, |query| format!("rep:password={reppassword}&", reppassword=query.to_string()));
        let query_profilegiven_name = param_profilegiven_name.map_or_else(String::new, |query| format!("profile/givenName={profilegiven_name}&", profilegiven_name=query.to_string()));


        let uri = format!(
            "{}//libs/granite/security/post/authorizables?{authorizable_id}{intermediate_path}{create_user}{create_group}{reppassword}{profilegiven_name}",
            self.base_path,
            authorizable_id=utf8_percent_encode(&query_authorizable_id, QUERY_ENCODE_SET),
            intermediate_path=utf8_percent_encode(&query_intermediate_path, QUERY_ENCODE_SET),
            create_user=utf8_percent_encode(&query_create_user, QUERY_ENCODE_SET),
            create_group=utf8_percent_encode(&query_create_group, QUERY_ENCODE_SET),
            reppassword=utf8_percent_encode(&query_reppassword, QUERY_ENCODE_SET),
            profilegiven_name=utf8_percent_encode(&query_profilegiven_name, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            PostAuthorizablesResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_adobe_granite_saml_authentication_handler(&self, param_key_store_password: Option<String>, param_key_store_password_type_hint: Option<String>, param_service_ranking: Option<i32>, param_service_ranking_type_hint: Option<String>, param_idp_http_redirect: Option<bool>, param_idp_http_redirect_type_hint: Option<String>, param_create_user: Option<bool>, param_create_user_type_hint: Option<String>, param_default_redirect_url: Option<String>, param_default_redirect_url_type_hint: Option<String>, param_user_id_attribute: Option<String>, param_user_id_attribute_type_hint: Option<String>, param_default_groups: Option<&Vec<String>>, param_default_groups_type_hint: Option<String>, param_idp_cert_alias: Option<String>, param_idp_cert_alias_type_hint: Option<String>, param_add_group_memberships: Option<bool>, param_add_group_memberships_type_hint: Option<String>, param_path: Option<&Vec<String>>, param_path_type_hint: Option<String>, param_synchronize_attributes: Option<&Vec<String>>, param_synchronize_attributes_type_hint: Option<String>, param_clock_tolerance: Option<i32>, param_clock_tolerance_type_hint: Option<String>, param_group_membership_attribute: Option<String>, param_group_membership_attribute_type_hint: Option<String>, param_idp_url: Option<String>, param_idp_url_type_hint: Option<String>, param_logout_url: Option<String>, param_logout_url_type_hint: Option<String>, param_service_provider_entity_id: Option<String>, param_service_provider_entity_id_type_hint: Option<String>, param_assertion_consumer_service_url: Option<String>, param_assertion_consumer_service_url_type_hint: Option<String>, param_handle_logout: Option<bool>, param_handle_logout_type_hint: Option<String>, param_sp_private_key_alias: Option<String>, param_sp_private_key_alias_type_hint: Option<String>, param_use_encryption: Option<bool>, param_use_encryption_type_hint: Option<String>, param_name_id_format: Option<String>, param_name_id_format_type_hint: Option<String>, param_digest_method: Option<String>, param_digest_method_type_hint: Option<String>, param_signature_method: Option<String>, param_signature_method_type_hint: Option<String>, param_user_intermediate_path: Option<String>, param_user_intermediate_path_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, Error=ApiError>> {

        // Query parameters
        let query_key_store_password = param_key_store_password.map_or_else(String::new, |query| format!("keyStorePassword={key_store_password}&", key_store_password=query.to_string()));
        let query_key_store_password_type_hint = param_key_store_password_type_hint.map_or_else(String::new, |query| format!("keyStorePassword@TypeHint={key_store_password_type_hint}&", key_store_password_type_hint=query.to_string()));
        let query_service_ranking = param_service_ranking.map_or_else(String::new, |query| format!("service.ranking={service_ranking}&", service_ranking=query.to_string()));
        let query_service_ranking_type_hint = param_service_ranking_type_hint.map_or_else(String::new, |query| format!("service.ranking@TypeHint={service_ranking_type_hint}&", service_ranking_type_hint=query.to_string()));
        let query_idp_http_redirect = param_idp_http_redirect.map_or_else(String::new, |query| format!("idpHttpRedirect={idp_http_redirect}&", idp_http_redirect=query.to_string()));
        let query_idp_http_redirect_type_hint = param_idp_http_redirect_type_hint.map_or_else(String::new, |query| format!("idpHttpRedirect@TypeHint={idp_http_redirect_type_hint}&", idp_http_redirect_type_hint=query.to_string()));
        let query_create_user = param_create_user.map_or_else(String::new, |query| format!("createUser={create_user}&", create_user=query.to_string()));
        let query_create_user_type_hint = param_create_user_type_hint.map_or_else(String::new, |query| format!("createUser@TypeHint={create_user_type_hint}&", create_user_type_hint=query.to_string()));
        let query_default_redirect_url = param_default_redirect_url.map_or_else(String::new, |query| format!("defaultRedirectUrl={default_redirect_url}&", default_redirect_url=query.to_string()));
        let query_default_redirect_url_type_hint = param_default_redirect_url_type_hint.map_or_else(String::new, |query| format!("defaultRedirectUrl@TypeHint={default_redirect_url_type_hint}&", default_redirect_url_type_hint=query.to_string()));
        let query_user_id_attribute = param_user_id_attribute.map_or_else(String::new, |query| format!("userIDAttribute={user_id_attribute}&", user_id_attribute=query.to_string()));
        let query_user_id_attribute_type_hint = param_user_id_attribute_type_hint.map_or_else(String::new, |query| format!("userIDAttribute@TypeHint={user_id_attribute_type_hint}&", user_id_attribute_type_hint=query.to_string()));
        let query_default_groups = param_default_groups.map_or_else(String::new, |query| format!("defaultGroups={default_groups}&", default_groups=query.join(",")));
        let query_default_groups_type_hint = param_default_groups_type_hint.map_or_else(String::new, |query| format!("defaultGroups@TypeHint={default_groups_type_hint}&", default_groups_type_hint=query.to_string()));
        let query_idp_cert_alias = param_idp_cert_alias.map_or_else(String::new, |query| format!("idpCertAlias={idp_cert_alias}&", idp_cert_alias=query.to_string()));
        let query_idp_cert_alias_type_hint = param_idp_cert_alias_type_hint.map_or_else(String::new, |query| format!("idpCertAlias@TypeHint={idp_cert_alias_type_hint}&", idp_cert_alias_type_hint=query.to_string()));
        let query_add_group_memberships = param_add_group_memberships.map_or_else(String::new, |query| format!("addGroupMemberships={add_group_memberships}&", add_group_memberships=query.to_string()));
        let query_add_group_memberships_type_hint = param_add_group_memberships_type_hint.map_or_else(String::new, |query| format!("addGroupMemberships@TypeHint={add_group_memberships_type_hint}&", add_group_memberships_type_hint=query.to_string()));
        let query_path = param_path.map_or_else(String::new, |query| format!("path={path}&", path=query.join(",")));
        let query_path_type_hint = param_path_type_hint.map_or_else(String::new, |query| format!("path@TypeHint={path_type_hint}&", path_type_hint=query.to_string()));
        let query_synchronize_attributes = param_synchronize_attributes.map_or_else(String::new, |query| format!("synchronizeAttributes={synchronize_attributes}&", synchronize_attributes=query.join(",")));
        let query_synchronize_attributes_type_hint = param_synchronize_attributes_type_hint.map_or_else(String::new, |query| format!("synchronizeAttributes@TypeHint={synchronize_attributes_type_hint}&", synchronize_attributes_type_hint=query.to_string()));
        let query_clock_tolerance = param_clock_tolerance.map_or_else(String::new, |query| format!("clockTolerance={clock_tolerance}&", clock_tolerance=query.to_string()));
        let query_clock_tolerance_type_hint = param_clock_tolerance_type_hint.map_or_else(String::new, |query| format!("clockTolerance@TypeHint={clock_tolerance_type_hint}&", clock_tolerance_type_hint=query.to_string()));
        let query_group_membership_attribute = param_group_membership_attribute.map_or_else(String::new, |query| format!("groupMembershipAttribute={group_membership_attribute}&", group_membership_attribute=query.to_string()));
        let query_group_membership_attribute_type_hint = param_group_membership_attribute_type_hint.map_or_else(String::new, |query| format!("groupMembershipAttribute@TypeHint={group_membership_attribute_type_hint}&", group_membership_attribute_type_hint=query.to_string()));
        let query_idp_url = param_idp_url.map_or_else(String::new, |query| format!("idpUrl={idp_url}&", idp_url=query.to_string()));
        let query_idp_url_type_hint = param_idp_url_type_hint.map_or_else(String::new, |query| format!("idpUrl@TypeHint={idp_url_type_hint}&", idp_url_type_hint=query.to_string()));
        let query_logout_url = param_logout_url.map_or_else(String::new, |query| format!("logoutUrl={logout_url}&", logout_url=query.to_string()));
        let query_logout_url_type_hint = param_logout_url_type_hint.map_or_else(String::new, |query| format!("logoutUrl@TypeHint={logout_url_type_hint}&", logout_url_type_hint=query.to_string()));
        let query_service_provider_entity_id = param_service_provider_entity_id.map_or_else(String::new, |query| format!("serviceProviderEntityId={service_provider_entity_id}&", service_provider_entity_id=query.to_string()));
        let query_service_provider_entity_id_type_hint = param_service_provider_entity_id_type_hint.map_or_else(String::new, |query| format!("serviceProviderEntityId@TypeHint={service_provider_entity_id_type_hint}&", service_provider_entity_id_type_hint=query.to_string()));
        let query_assertion_consumer_service_url = param_assertion_consumer_service_url.map_or_else(String::new, |query| format!("assertionConsumerServiceURL={assertion_consumer_service_url}&", assertion_consumer_service_url=query.to_string()));
        let query_assertion_consumer_service_url_type_hint = param_assertion_consumer_service_url_type_hint.map_or_else(String::new, |query| format!("assertionConsumerServiceURL@TypeHint={assertion_consumer_service_url_type_hint}&", assertion_consumer_service_url_type_hint=query.to_string()));
        let query_handle_logout = param_handle_logout.map_or_else(String::new, |query| format!("handleLogout={handle_logout}&", handle_logout=query.to_string()));
        let query_handle_logout_type_hint = param_handle_logout_type_hint.map_or_else(String::new, |query| format!("handleLogout@TypeHint={handle_logout_type_hint}&", handle_logout_type_hint=query.to_string()));
        let query_sp_private_key_alias = param_sp_private_key_alias.map_or_else(String::new, |query| format!("spPrivateKeyAlias={sp_private_key_alias}&", sp_private_key_alias=query.to_string()));
        let query_sp_private_key_alias_type_hint = param_sp_private_key_alias_type_hint.map_or_else(String::new, |query| format!("spPrivateKeyAlias@TypeHint={sp_private_key_alias_type_hint}&", sp_private_key_alias_type_hint=query.to_string()));
        let query_use_encryption = param_use_encryption.map_or_else(String::new, |query| format!("useEncryption={use_encryption}&", use_encryption=query.to_string()));
        let query_use_encryption_type_hint = param_use_encryption_type_hint.map_or_else(String::new, |query| format!("useEncryption@TypeHint={use_encryption_type_hint}&", use_encryption_type_hint=query.to_string()));
        let query_name_id_format = param_name_id_format.map_or_else(String::new, |query| format!("nameIdFormat={name_id_format}&", name_id_format=query.to_string()));
        let query_name_id_format_type_hint = param_name_id_format_type_hint.map_or_else(String::new, |query| format!("nameIdFormat@TypeHint={name_id_format_type_hint}&", name_id_format_type_hint=query.to_string()));
        let query_digest_method = param_digest_method.map_or_else(String::new, |query| format!("digestMethod={digest_method}&", digest_method=query.to_string()));
        let query_digest_method_type_hint = param_digest_method_type_hint.map_or_else(String::new, |query| format!("digestMethod@TypeHint={digest_method_type_hint}&", digest_method_type_hint=query.to_string()));
        let query_signature_method = param_signature_method.map_or_else(String::new, |query| format!("signatureMethod={signature_method}&", signature_method=query.to_string()));
        let query_signature_method_type_hint = param_signature_method_type_hint.map_or_else(String::new, |query| format!("signatureMethod@TypeHint={signature_method_type_hint}&", signature_method_type_hint=query.to_string()));
        let query_user_intermediate_path = param_user_intermediate_path.map_or_else(String::new, |query| format!("userIntermediatePath={user_intermediate_path}&", user_intermediate_path=query.to_string()));
        let query_user_intermediate_path_type_hint = param_user_intermediate_path_type_hint.map_or_else(String::new, |query| format!("userIntermediatePath@TypeHint={user_intermediate_path_type_hint}&", user_intermediate_path_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config?{key_store_password}{key_store_password_type_hint}{service_ranking}{service_ranking_type_hint}{idp_http_redirect}{idp_http_redirect_type_hint}{create_user}{create_user_type_hint}{default_redirect_url}{default_redirect_url_type_hint}{user_id_attribute}{user_id_attribute_type_hint}{default_groups}{default_groups_type_hint}{idp_cert_alias}{idp_cert_alias_type_hint}{add_group_memberships}{add_group_memberships_type_hint}{path}{path_type_hint}{synchronize_attributes}{synchronize_attributes_type_hint}{clock_tolerance}{clock_tolerance_type_hint}{group_membership_attribute}{group_membership_attribute_type_hint}{idp_url}{idp_url_type_hint}{logout_url}{logout_url_type_hint}{service_provider_entity_id}{service_provider_entity_id_type_hint}{assertion_consumer_service_url}{assertion_consumer_service_url_type_hint}{handle_logout}{handle_logout_type_hint}{sp_private_key_alias}{sp_private_key_alias_type_hint}{use_encryption}{use_encryption_type_hint}{name_id_format}{name_id_format_type_hint}{digest_method}{digest_method_type_hint}{signature_method}{signature_method_type_hint}{user_intermediate_path}{user_intermediate_path_type_hint}",
            self.base_path,
            key_store_password=utf8_percent_encode(&query_key_store_password, QUERY_ENCODE_SET),
            key_store_password_type_hint=utf8_percent_encode(&query_key_store_password_type_hint, QUERY_ENCODE_SET),
            service_ranking=utf8_percent_encode(&query_service_ranking, QUERY_ENCODE_SET),
            service_ranking_type_hint=utf8_percent_encode(&query_service_ranking_type_hint, QUERY_ENCODE_SET),
            idp_http_redirect=utf8_percent_encode(&query_idp_http_redirect, QUERY_ENCODE_SET),
            idp_http_redirect_type_hint=utf8_percent_encode(&query_idp_http_redirect_type_hint, QUERY_ENCODE_SET),
            create_user=utf8_percent_encode(&query_create_user, QUERY_ENCODE_SET),
            create_user_type_hint=utf8_percent_encode(&query_create_user_type_hint, QUERY_ENCODE_SET),
            default_redirect_url=utf8_percent_encode(&query_default_redirect_url, QUERY_ENCODE_SET),
            default_redirect_url_type_hint=utf8_percent_encode(&query_default_redirect_url_type_hint, QUERY_ENCODE_SET),
            user_id_attribute=utf8_percent_encode(&query_user_id_attribute, QUERY_ENCODE_SET),
            user_id_attribute_type_hint=utf8_percent_encode(&query_user_id_attribute_type_hint, QUERY_ENCODE_SET),
            default_groups=utf8_percent_encode(&query_default_groups, QUERY_ENCODE_SET),
            default_groups_type_hint=utf8_percent_encode(&query_default_groups_type_hint, QUERY_ENCODE_SET),
            idp_cert_alias=utf8_percent_encode(&query_idp_cert_alias, QUERY_ENCODE_SET),
            idp_cert_alias_type_hint=utf8_percent_encode(&query_idp_cert_alias_type_hint, QUERY_ENCODE_SET),
            add_group_memberships=utf8_percent_encode(&query_add_group_memberships, QUERY_ENCODE_SET),
            add_group_memberships_type_hint=utf8_percent_encode(&query_add_group_memberships_type_hint, QUERY_ENCODE_SET),
            path=utf8_percent_encode(&query_path, QUERY_ENCODE_SET),
            path_type_hint=utf8_percent_encode(&query_path_type_hint, QUERY_ENCODE_SET),
            synchronize_attributes=utf8_percent_encode(&query_synchronize_attributes, QUERY_ENCODE_SET),
            synchronize_attributes_type_hint=utf8_percent_encode(&query_synchronize_attributes_type_hint, QUERY_ENCODE_SET),
            clock_tolerance=utf8_percent_encode(&query_clock_tolerance, QUERY_ENCODE_SET),
            clock_tolerance_type_hint=utf8_percent_encode(&query_clock_tolerance_type_hint, QUERY_ENCODE_SET),
            group_membership_attribute=utf8_percent_encode(&query_group_membership_attribute, QUERY_ENCODE_SET),
            group_membership_attribute_type_hint=utf8_percent_encode(&query_group_membership_attribute_type_hint, QUERY_ENCODE_SET),
            idp_url=utf8_percent_encode(&query_idp_url, QUERY_ENCODE_SET),
            idp_url_type_hint=utf8_percent_encode(&query_idp_url_type_hint, QUERY_ENCODE_SET),
            logout_url=utf8_percent_encode(&query_logout_url, QUERY_ENCODE_SET),
            logout_url_type_hint=utf8_percent_encode(&query_logout_url_type_hint, QUERY_ENCODE_SET),
            service_provider_entity_id=utf8_percent_encode(&query_service_provider_entity_id, QUERY_ENCODE_SET),
            service_provider_entity_id_type_hint=utf8_percent_encode(&query_service_provider_entity_id_type_hint, QUERY_ENCODE_SET),
            assertion_consumer_service_url=utf8_percent_encode(&query_assertion_consumer_service_url, QUERY_ENCODE_SET),
            assertion_consumer_service_url_type_hint=utf8_percent_encode(&query_assertion_consumer_service_url_type_hint, QUERY_ENCODE_SET),
            handle_logout=utf8_percent_encode(&query_handle_logout, QUERY_ENCODE_SET),
            handle_logout_type_hint=utf8_percent_encode(&query_handle_logout_type_hint, QUERY_ENCODE_SET),
            sp_private_key_alias=utf8_percent_encode(&query_sp_private_key_alias, QUERY_ENCODE_SET),
            sp_private_key_alias_type_hint=utf8_percent_encode(&query_sp_private_key_alias_type_hint, QUERY_ENCODE_SET),
            use_encryption=utf8_percent_encode(&query_use_encryption, QUERY_ENCODE_SET),
            use_encryption_type_hint=utf8_percent_encode(&query_use_encryption_type_hint, QUERY_ENCODE_SET),
            name_id_format=utf8_percent_encode(&query_name_id_format, QUERY_ENCODE_SET),
            name_id_format_type_hint=utf8_percent_encode(&query_name_id_format_type_hint, QUERY_ENCODE_SET),
            digest_method=utf8_percent_encode(&query_digest_method, QUERY_ENCODE_SET),
            digest_method_type_hint=utf8_percent_encode(&query_digest_method_type_hint, QUERY_ENCODE_SET),
            signature_method=utf8_percent_encode(&query_signature_method, QUERY_ENCODE_SET),
            signature_method_type_hint=utf8_percent_encode(&query_signature_method_type_hint, QUERY_ENCODE_SET),
            user_intermediate_path=utf8_percent_encode(&query_user_intermediate_path, QUERY_ENCODE_SET),
            user_intermediate_path_type_hint=utf8_percent_encode(&query_user_intermediate_path_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigAdobeGraniteSamlAuthenticationHandlerResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_apache_felix_jetty_based_http_service(&self, param_org_apache_felix_https_nio: Option<bool>, param_org_apache_felix_https_nio_type_hint: Option<String>, param_org_apache_felix_https_keystore: Option<String>, param_org_apache_felix_https_keystore_type_hint: Option<String>, param_org_apache_felix_https_keystore_password: Option<String>, param_org_apache_felix_https_keystore_password_type_hint: Option<String>, param_org_apache_felix_https_keystore_key: Option<String>, param_org_apache_felix_https_keystore_key_type_hint: Option<String>, param_org_apache_felix_https_keystore_key_password: Option<String>, param_org_apache_felix_https_keystore_key_password_type_hint: Option<String>, param_org_apache_felix_https_truststore: Option<String>, param_org_apache_felix_https_truststore_type_hint: Option<String>, param_org_apache_felix_https_truststore_password: Option<String>, param_org_apache_felix_https_truststore_password_type_hint: Option<String>, param_org_apache_felix_https_clientcertificate: Option<String>, param_org_apache_felix_https_clientcertificate_type_hint: Option<String>, param_org_apache_felix_https_enable: Option<bool>, param_org_apache_felix_https_enable_type_hint: Option<String>, param_org_osgi_service_http_port_secure: Option<String>, param_org_osgi_service_http_port_secure_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheFelixJettyBasedHttpServiceResponse, Error=ApiError>> {

        // Query parameters
        let query_org_apache_felix_https_nio = param_org_apache_felix_https_nio.map_or_else(String::new, |query| format!("org.apache.felix.https.nio={org_apache_felix_https_nio}&", org_apache_felix_https_nio=query.to_string()));
        let query_org_apache_felix_https_nio_type_hint = param_org_apache_felix_https_nio_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.nio@TypeHint={org_apache_felix_https_nio_type_hint}&", org_apache_felix_https_nio_type_hint=query.to_string()));
        let query_org_apache_felix_https_keystore = param_org_apache_felix_https_keystore.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore={org_apache_felix_https_keystore}&", org_apache_felix_https_keystore=query.to_string()));
        let query_org_apache_felix_https_keystore_type_hint = param_org_apache_felix_https_keystore_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore@TypeHint={org_apache_felix_https_keystore_type_hint}&", org_apache_felix_https_keystore_type_hint=query.to_string()));
        let query_org_apache_felix_https_keystore_password = param_org_apache_felix_https_keystore_password.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore.password={org_apache_felix_https_keystore_password}&", org_apache_felix_https_keystore_password=query.to_string()));
        let query_org_apache_felix_https_keystore_password_type_hint = param_org_apache_felix_https_keystore_password_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore.password@TypeHint={org_apache_felix_https_keystore_password_type_hint}&", org_apache_felix_https_keystore_password_type_hint=query.to_string()));
        let query_org_apache_felix_https_keystore_key = param_org_apache_felix_https_keystore_key.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore.key={org_apache_felix_https_keystore_key}&", org_apache_felix_https_keystore_key=query.to_string()));
        let query_org_apache_felix_https_keystore_key_type_hint = param_org_apache_felix_https_keystore_key_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore.key@TypeHint={org_apache_felix_https_keystore_key_type_hint}&", org_apache_felix_https_keystore_key_type_hint=query.to_string()));
        let query_org_apache_felix_https_keystore_key_password = param_org_apache_felix_https_keystore_key_password.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore.key.password={org_apache_felix_https_keystore_key_password}&", org_apache_felix_https_keystore_key_password=query.to_string()));
        let query_org_apache_felix_https_keystore_key_password_type_hint = param_org_apache_felix_https_keystore_key_password_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.keystore.key.password@TypeHint={org_apache_felix_https_keystore_key_password_type_hint}&", org_apache_felix_https_keystore_key_password_type_hint=query.to_string()));
        let query_org_apache_felix_https_truststore = param_org_apache_felix_https_truststore.map_or_else(String::new, |query| format!("org.apache.felix.https.truststore={org_apache_felix_https_truststore}&", org_apache_felix_https_truststore=query.to_string()));
        let query_org_apache_felix_https_truststore_type_hint = param_org_apache_felix_https_truststore_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.truststore@TypeHint={org_apache_felix_https_truststore_type_hint}&", org_apache_felix_https_truststore_type_hint=query.to_string()));
        let query_org_apache_felix_https_truststore_password = param_org_apache_felix_https_truststore_password.map_or_else(String::new, |query| format!("org.apache.felix.https.truststore.password={org_apache_felix_https_truststore_password}&", org_apache_felix_https_truststore_password=query.to_string()));
        let query_org_apache_felix_https_truststore_password_type_hint = param_org_apache_felix_https_truststore_password_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.truststore.password@TypeHint={org_apache_felix_https_truststore_password_type_hint}&", org_apache_felix_https_truststore_password_type_hint=query.to_string()));
        let query_org_apache_felix_https_clientcertificate = param_org_apache_felix_https_clientcertificate.map_or_else(String::new, |query| format!("org.apache.felix.https.clientcertificate={org_apache_felix_https_clientcertificate}&", org_apache_felix_https_clientcertificate=query.to_string()));
        let query_org_apache_felix_https_clientcertificate_type_hint = param_org_apache_felix_https_clientcertificate_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.clientcertificate@TypeHint={org_apache_felix_https_clientcertificate_type_hint}&", org_apache_felix_https_clientcertificate_type_hint=query.to_string()));
        let query_org_apache_felix_https_enable = param_org_apache_felix_https_enable.map_or_else(String::new, |query| format!("org.apache.felix.https.enable={org_apache_felix_https_enable}&", org_apache_felix_https_enable=query.to_string()));
        let query_org_apache_felix_https_enable_type_hint = param_org_apache_felix_https_enable_type_hint.map_or_else(String::new, |query| format!("org.apache.felix.https.enable@TypeHint={org_apache_felix_https_enable_type_hint}&", org_apache_felix_https_enable_type_hint=query.to_string()));
        let query_org_osgi_service_http_port_secure = param_org_osgi_service_http_port_secure.map_or_else(String::new, |query| format!("org.osgi.service.http.port.secure={org_osgi_service_http_port_secure}&", org_osgi_service_http_port_secure=query.to_string()));
        let query_org_osgi_service_http_port_secure_type_hint = param_org_osgi_service_http_port_secure_type_hint.map_or_else(String::new, |query| format!("org.osgi.service.http.port.secure@TypeHint={org_osgi_service_http_port_secure_type_hint}&", org_osgi_service_http_port_secure_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/org.apache.felix.http?{org_apache_felix_https_nio}{org_apache_felix_https_nio_type_hint}{org_apache_felix_https_keystore}{org_apache_felix_https_keystore_type_hint}{org_apache_felix_https_keystore_password}{org_apache_felix_https_keystore_password_type_hint}{org_apache_felix_https_keystore_key}{org_apache_felix_https_keystore_key_type_hint}{org_apache_felix_https_keystore_key_password}{org_apache_felix_https_keystore_key_password_type_hint}{org_apache_felix_https_truststore}{org_apache_felix_https_truststore_type_hint}{org_apache_felix_https_truststore_password}{org_apache_felix_https_truststore_password_type_hint}{org_apache_felix_https_clientcertificate}{org_apache_felix_https_clientcertificate_type_hint}{org_apache_felix_https_enable}{org_apache_felix_https_enable_type_hint}{org_osgi_service_http_port_secure}{org_osgi_service_http_port_secure_type_hint}",
            self.base_path,
            org_apache_felix_https_nio=utf8_percent_encode(&query_org_apache_felix_https_nio, QUERY_ENCODE_SET),
            org_apache_felix_https_nio_type_hint=utf8_percent_encode(&query_org_apache_felix_https_nio_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore=utf8_percent_encode(&query_org_apache_felix_https_keystore, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore_type_hint=utf8_percent_encode(&query_org_apache_felix_https_keystore_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore_password=utf8_percent_encode(&query_org_apache_felix_https_keystore_password, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore_password_type_hint=utf8_percent_encode(&query_org_apache_felix_https_keystore_password_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore_key=utf8_percent_encode(&query_org_apache_felix_https_keystore_key, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore_key_type_hint=utf8_percent_encode(&query_org_apache_felix_https_keystore_key_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore_key_password=utf8_percent_encode(&query_org_apache_felix_https_keystore_key_password, QUERY_ENCODE_SET),
            org_apache_felix_https_keystore_key_password_type_hint=utf8_percent_encode(&query_org_apache_felix_https_keystore_key_password_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_truststore=utf8_percent_encode(&query_org_apache_felix_https_truststore, QUERY_ENCODE_SET),
            org_apache_felix_https_truststore_type_hint=utf8_percent_encode(&query_org_apache_felix_https_truststore_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_truststore_password=utf8_percent_encode(&query_org_apache_felix_https_truststore_password, QUERY_ENCODE_SET),
            org_apache_felix_https_truststore_password_type_hint=utf8_percent_encode(&query_org_apache_felix_https_truststore_password_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_clientcertificate=utf8_percent_encode(&query_org_apache_felix_https_clientcertificate, QUERY_ENCODE_SET),
            org_apache_felix_https_clientcertificate_type_hint=utf8_percent_encode(&query_org_apache_felix_https_clientcertificate_type_hint, QUERY_ENCODE_SET),
            org_apache_felix_https_enable=utf8_percent_encode(&query_org_apache_felix_https_enable, QUERY_ENCODE_SET),
            org_apache_felix_https_enable_type_hint=utf8_percent_encode(&query_org_apache_felix_https_enable_type_hint, QUERY_ENCODE_SET),
            org_osgi_service_http_port_secure=utf8_percent_encode(&query_org_osgi_service_http_port_secure, QUERY_ENCODE_SET),
            org_osgi_service_http_port_secure_type_hint=utf8_percent_encode(&query_org_osgi_service_http_port_secure_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigApacheFelixJettyBasedHttpServiceResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_apache_http_components_proxy_configuration(&self, param_proxy_host: Option<String>, param_proxy_host_type_hint: Option<String>, param_proxy_port: Option<i32>, param_proxy_port_type_hint: Option<String>, param_proxy_exceptions: Option<&Vec<String>>, param_proxy_exceptions_type_hint: Option<String>, param_proxy_enabled: Option<bool>, param_proxy_enabled_type_hint: Option<String>, param_proxy_user: Option<String>, param_proxy_user_type_hint: Option<String>, param_proxy_password: Option<String>, param_proxy_password_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheHttpComponentsProxyConfigurationResponse, Error=ApiError>> {

        // Query parameters
        let query_proxy_host = param_proxy_host.map_or_else(String::new, |query| format!("proxy.host={proxy_host}&", proxy_host=query.to_string()));
        let query_proxy_host_type_hint = param_proxy_host_type_hint.map_or_else(String::new, |query| format!("proxy.host@TypeHint={proxy_host_type_hint}&", proxy_host_type_hint=query.to_string()));
        let query_proxy_port = param_proxy_port.map_or_else(String::new, |query| format!("proxy.port={proxy_port}&", proxy_port=query.to_string()));
        let query_proxy_port_type_hint = param_proxy_port_type_hint.map_or_else(String::new, |query| format!("proxy.port@TypeHint={proxy_port_type_hint}&", proxy_port_type_hint=query.to_string()));
        let query_proxy_exceptions = param_proxy_exceptions.map_or_else(String::new, |query| format!("proxy.exceptions={proxy_exceptions}&", proxy_exceptions=query.join(",")));
        let query_proxy_exceptions_type_hint = param_proxy_exceptions_type_hint.map_or_else(String::new, |query| format!("proxy.exceptions@TypeHint={proxy_exceptions_type_hint}&", proxy_exceptions_type_hint=query.to_string()));
        let query_proxy_enabled = param_proxy_enabled.map_or_else(String::new, |query| format!("proxy.enabled={proxy_enabled}&", proxy_enabled=query.to_string()));
        let query_proxy_enabled_type_hint = param_proxy_enabled_type_hint.map_or_else(String::new, |query| format!("proxy.enabled@TypeHint={proxy_enabled_type_hint}&", proxy_enabled_type_hint=query.to_string()));
        let query_proxy_user = param_proxy_user.map_or_else(String::new, |query| format!("proxy.user={proxy_user}&", proxy_user=query.to_string()));
        let query_proxy_user_type_hint = param_proxy_user_type_hint.map_or_else(String::new, |query| format!("proxy.user@TypeHint={proxy_user_type_hint}&", proxy_user_type_hint=query.to_string()));
        let query_proxy_password = param_proxy_password.map_or_else(String::new, |query| format!("proxy.password={proxy_password}&", proxy_password=query.to_string()));
        let query_proxy_password_type_hint = param_proxy_password_type_hint.map_or_else(String::new, |query| format!("proxy.password@TypeHint={proxy_password_type_hint}&", proxy_password_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/org.apache.http.proxyconfigurator.config?{proxy_host}{proxy_host_type_hint}{proxy_port}{proxy_port_type_hint}{proxy_exceptions}{proxy_exceptions_type_hint}{proxy_enabled}{proxy_enabled_type_hint}{proxy_user}{proxy_user_type_hint}{proxy_password}{proxy_password_type_hint}",
            self.base_path,
            proxy_host=utf8_percent_encode(&query_proxy_host, QUERY_ENCODE_SET),
            proxy_host_type_hint=utf8_percent_encode(&query_proxy_host_type_hint, QUERY_ENCODE_SET),
            proxy_port=utf8_percent_encode(&query_proxy_port, QUERY_ENCODE_SET),
            proxy_port_type_hint=utf8_percent_encode(&query_proxy_port_type_hint, QUERY_ENCODE_SET),
            proxy_exceptions=utf8_percent_encode(&query_proxy_exceptions, QUERY_ENCODE_SET),
            proxy_exceptions_type_hint=utf8_percent_encode(&query_proxy_exceptions_type_hint, QUERY_ENCODE_SET),
            proxy_enabled=utf8_percent_encode(&query_proxy_enabled, QUERY_ENCODE_SET),
            proxy_enabled_type_hint=utf8_percent_encode(&query_proxy_enabled_type_hint, QUERY_ENCODE_SET),
            proxy_user=utf8_percent_encode(&query_proxy_user, QUERY_ENCODE_SET),
            proxy_user_type_hint=utf8_percent_encode(&query_proxy_user_type_hint, QUERY_ENCODE_SET),
            proxy_password=utf8_percent_encode(&query_proxy_password, QUERY_ENCODE_SET),
            proxy_password_type_hint=utf8_percent_encode(&query_proxy_password_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigApacheHttpComponentsProxyConfigurationResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_apache_sling_dav_ex_servlet(&self, param_alias: Option<String>, param_alias_type_hint: Option<String>, param_dav_create_absolute_uri: Option<bool>, param_dav_create_absolute_uri_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheSlingDavExServletResponse, Error=ApiError>> {

        // Query parameters
        let query_alias = param_alias.map_or_else(String::new, |query| format!("alias={alias}&", alias=query.to_string()));
        let query_alias_type_hint = param_alias_type_hint.map_or_else(String::new, |query| format!("alias@TypeHint={alias_type_hint}&", alias_type_hint=query.to_string()));
        let query_dav_create_absolute_uri = param_dav_create_absolute_uri.map_or_else(String::new, |query| format!("dav.create-absolute-uri={dav_create_absolute_uri}&", dav_create_absolute_uri=query.to_string()));
        let query_dav_create_absolute_uri_type_hint = param_dav_create_absolute_uri_type_hint.map_or_else(String::new, |query| format!("dav.create-absolute-uri@TypeHint={dav_create_absolute_uri_type_hint}&", dav_create_absolute_uri_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet?{alias}{alias_type_hint}{dav_create_absolute_uri}{dav_create_absolute_uri_type_hint}",
            self.base_path,
            alias=utf8_percent_encode(&query_alias, QUERY_ENCODE_SET),
            alias_type_hint=utf8_percent_encode(&query_alias_type_hint, QUERY_ENCODE_SET),
            dav_create_absolute_uri=utf8_percent_encode(&query_dav_create_absolute_uri, QUERY_ENCODE_SET),
            dav_create_absolute_uri_type_hint=utf8_percent_encode(&query_dav_create_absolute_uri_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigApacheSlingDavExServletResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_apache_sling_get_servlet(&self, param_json_maximumresults: Option<String>, param_json_maximumresults_type_hint: Option<String>, param_enable_html: Option<bool>, param_enable_html_type_hint: Option<String>, param_enable_txt: Option<bool>, param_enable_txt_type_hint: Option<String>, param_enable_xml: Option<bool>, param_enable_xml_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheSlingGetServletResponse, Error=ApiError>> {

        // Query parameters
        let query_json_maximumresults = param_json_maximumresults.map_or_else(String::new, |query| format!("json.maximumresults={json_maximumresults}&", json_maximumresults=query.to_string()));
        let query_json_maximumresults_type_hint = param_json_maximumresults_type_hint.map_or_else(String::new, |query| format!("json.maximumresults@TypeHint={json_maximumresults_type_hint}&", json_maximumresults_type_hint=query.to_string()));
        let query_enable_html = param_enable_html.map_or_else(String::new, |query| format!("enable.html={enable_html}&", enable_html=query.to_string()));
        let query_enable_html_type_hint = param_enable_html_type_hint.map_or_else(String::new, |query| format!("enable.html@TypeHint={enable_html_type_hint}&", enable_html_type_hint=query.to_string()));
        let query_enable_txt = param_enable_txt.map_or_else(String::new, |query| format!("enable.txt={enable_txt}&", enable_txt=query.to_string()));
        let query_enable_txt_type_hint = param_enable_txt_type_hint.map_or_else(String::new, |query| format!("enable.txt@TypeHint={enable_txt_type_hint}&", enable_txt_type_hint=query.to_string()));
        let query_enable_xml = param_enable_xml.map_or_else(String::new, |query| format!("enable.xml={enable_xml}&", enable_xml=query.to_string()));
        let query_enable_xml_type_hint = param_enable_xml_type_hint.map_or_else(String::new, |query| format!("enable.xml@TypeHint={enable_xml_type_hint}&", enable_xml_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet?{json_maximumresults}{json_maximumresults_type_hint}{enable_html}{enable_html_type_hint}{enable_txt}{enable_txt_type_hint}{enable_xml}{enable_xml_type_hint}",
            self.base_path,
            json_maximumresults=utf8_percent_encode(&query_json_maximumresults, QUERY_ENCODE_SET),
            json_maximumresults_type_hint=utf8_percent_encode(&query_json_maximumresults_type_hint, QUERY_ENCODE_SET),
            enable_html=utf8_percent_encode(&query_enable_html, QUERY_ENCODE_SET),
            enable_html_type_hint=utf8_percent_encode(&query_enable_html_type_hint, QUERY_ENCODE_SET),
            enable_txt=utf8_percent_encode(&query_enable_txt, QUERY_ENCODE_SET),
            enable_txt_type_hint=utf8_percent_encode(&query_enable_txt_type_hint, QUERY_ENCODE_SET),
            enable_xml=utf8_percent_encode(&query_enable_xml, QUERY_ENCODE_SET),
            enable_xml_type_hint=utf8_percent_encode(&query_enable_xml_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigApacheSlingGetServletResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_config_apache_sling_referrer_filter(&self, param_allow_empty: Option<bool>, param_allow_empty_type_hint: Option<String>, param_allow_hosts: Option<String>, param_allow_hosts_type_hint: Option<String>, param_allow_hosts_regexp: Option<String>, param_allow_hosts_regexp_type_hint: Option<String>, param_filter_methods: Option<String>, param_filter_methods_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheSlingReferrerFilterResponse, Error=ApiError>> {

        // Query parameters
        let query_allow_empty = param_allow_empty.map_or_else(String::new, |query| format!("allow.empty={allow_empty}&", allow_empty=query.to_string()));
        let query_allow_empty_type_hint = param_allow_empty_type_hint.map_or_else(String::new, |query| format!("allow.empty@TypeHint={allow_empty_type_hint}&", allow_empty_type_hint=query.to_string()));
        let query_allow_hosts = param_allow_hosts.map_or_else(String::new, |query| format!("allow.hosts={allow_hosts}&", allow_hosts=query.to_string()));
        let query_allow_hosts_type_hint = param_allow_hosts_type_hint.map_or_else(String::new, |query| format!("allow.hosts@TypeHint={allow_hosts_type_hint}&", allow_hosts_type_hint=query.to_string()));
        let query_allow_hosts_regexp = param_allow_hosts_regexp.map_or_else(String::new, |query| format!("allow.hosts.regexp={allow_hosts_regexp}&", allow_hosts_regexp=query.to_string()));
        let query_allow_hosts_regexp_type_hint = param_allow_hosts_regexp_type_hint.map_or_else(String::new, |query| format!("allow.hosts.regexp@TypeHint={allow_hosts_regexp_type_hint}&", allow_hosts_regexp_type_hint=query.to_string()));
        let query_filter_methods = param_filter_methods.map_or_else(String::new, |query| format!("filter.methods={filter_methods}&", filter_methods=query.to_string()));
        let query_filter_methods_type_hint = param_filter_methods_type_hint.map_or_else(String::new, |query| format!("filter.methods@TypeHint={filter_methods_type_hint}&", filter_methods_type_hint=query.to_string()));


        let uri = format!(
            "{}//apps/system/config/org.apache.sling.security.impl.ReferrerFilter?{allow_empty}{allow_empty_type_hint}{allow_hosts}{allow_hosts_type_hint}{allow_hosts_regexp}{allow_hosts_regexp_type_hint}{filter_methods}{filter_methods_type_hint}",
            self.base_path,
            allow_empty=utf8_percent_encode(&query_allow_empty, QUERY_ENCODE_SET),
            allow_empty_type_hint=utf8_percent_encode(&query_allow_empty_type_hint, QUERY_ENCODE_SET),
            allow_hosts=utf8_percent_encode(&query_allow_hosts, QUERY_ENCODE_SET),
            allow_hosts_type_hint=utf8_percent_encode(&query_allow_hosts_type_hint, QUERY_ENCODE_SET),
            allow_hosts_regexp=utf8_percent_encode(&query_allow_hosts_regexp, QUERY_ENCODE_SET),
            allow_hosts_regexp_type_hint=utf8_percent_encode(&query_allow_hosts_regexp_type_hint, QUERY_ENCODE_SET),
            filter_methods=utf8_percent_encode(&query_filter_methods, QUERY_ENCODE_SET),
            filter_methods_type_hint=utf8_percent_encode(&query_filter_methods_type_hint, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostConfigApacheSlingReferrerFilterResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_node(&self, param_path: String, param_name: String, param_operation: Option<String>, param_delete_authorizable: Option<String>, param_file: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostNodeResponse, Error=ApiError>> {

        // Query parameters
        let query_operation = param_operation.map_or_else(String::new, |query| format!(":operation={operation}&", operation=query.to_string()));
        let query_delete_authorizable = param_delete_authorizable.map_or_else(String::new, |query| format!("deleteAuthorizable={delete_authorizable}&", delete_authorizable=query.to_string()));


        let uri = format!(
            "{}//{path}/{name}?{operation}{delete_authorizable}",
            self.base_path, path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET),
            operation=utf8_percent_encode(&query_operation, QUERY_ENCODE_SET),
            delete_authorizable=utf8_percent_encode(&query_delete_authorizable, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);

        let params = &[
            ("file", param_file.map(|param| format!("{:?}", param))),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        request.headers_mut().set(ContentType(mimetypes::requests::POST_NODE.clone()));
        request.set_body(body.into_bytes());

        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostNodeResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_node_rw(&self, param_path: String, param_name: String, param_add_members: Option<String>, context: &C) -> Box<Future<Item=PostNodeRwResponse, Error=ApiError>> {

        // Query parameters
        let query_add_members = param_add_members.map_or_else(String::new, |query| format!("addMembers={add_members}&", add_members=query.to_string()));


        let uri = format!(
            "{}//{path}/{name}.rw.html?{add_members}",
            self.base_path, path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET), name=utf8_percent_encode(&param_name.to_string(), ID_ENCODE_SET),
            add_members=utf8_percent_encode(&query_add_members, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostNodeRwResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_path(&self, param_path: String, param_jcrprimary_type: String, param_name: String, context: &C) -> Box<Future<Item=PostPathResponse, Error=ApiError>> {

        // Query parameters
        let query_jcrprimary_type = format!("jcr:primaryType={jcrprimary_type}&", jcrprimary_type=param_jcrprimary_type.to_string());
        let query_name = format!(":name={name}&", name=param_name.to_string());


        let uri = format!(
            "{}//{path}/?{jcrprimary_type}{name}",
            self.base_path, path=utf8_percent_encode(&param_path.to_string(), ID_ENCODE_SET),
            jcrprimary_type=utf8_percent_encode(&query_jcrprimary_type, QUERY_ENCODE_SET),
            name=utf8_percent_encode(&query_name, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostPathResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_query(&self, param_path: String, param_p_limit: f64, param__1_property: String, param__1_property_value: String, context: &C) -> Box<Future<Item=PostQueryResponse, Error=ApiError>> {

        // Query parameters
        let query_path = format!("path={path}&", path=param_path.to_string());
        let query_p_limit = format!("p.limit={p_limit}&", p_limit=param_p_limit.to_string());
        let query__1_property = format!("1_property={_1_property}&", _1_property=param__1_property.to_string());
        let query__1_property_value = format!("1_property.value={_1_property_value}&", _1_property_value=param__1_property_value.to_string());


        let uri = format!(
            "{}//bin/querybuilder.json?{path}{p_limit}{_1_property}{_1_property_value}",
            self.base_path,
            path=utf8_percent_encode(&query_path, QUERY_ENCODE_SET),
            p_limit=utf8_percent_encode(&query_p_limit, QUERY_ENCODE_SET),
            _1_property=utf8_percent_encode(&query__1_property, QUERY_ENCODE_SET),
            _1_property_value=utf8_percent_encode(&query__1_property_value, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            PostQueryResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_tree_activation(&self, param_ignoredeactivated: bool, param_onlymodified: bool, param_path: String, context: &C) -> Box<Future<Item=PostTreeActivationResponse, Error=ApiError>> {

        // Query parameters
        let query_ignoredeactivated = format!("ignoredeactivated={ignoredeactivated}&", ignoredeactivated=param_ignoredeactivated.to_string());
        let query_onlymodified = format!("onlymodified={onlymodified}&", onlymodified=param_onlymodified.to_string());
        let query_path = format!("path={path}&", path=param_path.to_string());


        let uri = format!(
            "{}//etc/replication/treeactivation.html?{ignoredeactivated}{onlymodified}{path}",
            self.base_path,
            ignoredeactivated=utf8_percent_encode(&query_ignoredeactivated, QUERY_ENCODE_SET),
            onlymodified=utf8_percent_encode(&query_onlymodified, QUERY_ENCODE_SET),
            path=utf8_percent_encode(&query_path, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PostTreeActivationResponse::DefaultResponse
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_truststore(&self, param_operation: Option<String>, param_new_password: Option<String>, param_re_password: Option<String>, param_key_store_type: Option<String>, param_remove_alias: Option<String>, param_certificate: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostTruststoreResponse, Error=ApiError>> {

        // Query parameters
        let query_operation = param_operation.map_or_else(String::new, |query| format!(":operation={operation}&", operation=query.to_string()));
        let query_new_password = param_new_password.map_or_else(String::new, |query| format!("newPassword={new_password}&", new_password=query.to_string()));
        let query_re_password = param_re_password.map_or_else(String::new, |query| format!("rePassword={re_password}&", re_password=query.to_string()));
        let query_key_store_type = param_key_store_type.map_or_else(String::new, |query| format!("keyStoreType={key_store_type}&", key_store_type=query.to_string()));
        let query_remove_alias = param_remove_alias.map_or_else(String::new, |query| format!("removeAlias={remove_alias}&", remove_alias=query.to_string()));


        let uri = format!(
            "{}//libs/granite/security/post/truststore?{operation}{new_password}{re_password}{key_store_type}{remove_alias}",
            self.base_path,
            operation=utf8_percent_encode(&query_operation, QUERY_ENCODE_SET),
            new_password=utf8_percent_encode(&query_new_password, QUERY_ENCODE_SET),
            re_password=utf8_percent_encode(&query_re_password, QUERY_ENCODE_SET),
            key_store_type=utf8_percent_encode(&query_key_store_type, QUERY_ENCODE_SET),
            remove_alias=utf8_percent_encode(&query_remove_alias, QUERY_ENCODE_SET)
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);

        let params = &[
            ("certificate", param_certificate.map(|param| format!("{:?}", param))),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        request.headers_mut().set(ContentType(mimetypes::requests::POST_TRUSTSTORE.clone()));
        request.set_body(body.into_bytes());

        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostTruststoreResponse::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn post_truststore_pkcs12(&self, param_truststore_p12: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostTruststorePKCS12Response, Error=ApiError>> {


        let uri = format!(
            "{}//etc/truststore",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);

        let params = &[
            ("truststore.p12", param_truststore_p12.map(|param| format!("{:?}", param))),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        request.headers_mut().set(ContentType(mimetypes::requests::POST_TRUSTSTORE_PKCS12.clone()));
        request.set_body(body.into_bytes());

        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));
        (context as &Has<Option<AuthData>>).get().as_ref().map(|auth_data| {
            if let &AuthData::Basic(ref basic_header) = auth_data {
                request.headers_mut().set(hyper::header::Authorization(
                    basic_header.clone(),
                ))
            }
        });

        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 Ok(body.to_string())

                                             ))
                        .map(move |body|
                            PostTruststorePKCS12Response::DefaultResponse(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

}

#[derive(Debug)]
pub enum ClientInitError {
    InvalidScheme,
    InvalidUri(hyper::error::UriError),
    MissingHost,
    SslError(openssl::error::ErrorStack)
}

impl From<hyper::error::UriError> for ClientInitError {
    fn from(err: hyper::error::UriError) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl From<openssl::error::ErrorStack> for ClientInitError {
    fn from(err: openssl::error::ErrorStack) -> ClientInitError {
        ClientInitError::SslError(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        (self as &fmt::Debug).fmt(f)
    }
}

impl error::Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}
