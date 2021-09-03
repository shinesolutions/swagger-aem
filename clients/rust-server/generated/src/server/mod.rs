use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use hyper::{Request, Response, StatusCode, Body, HeaderMap};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::error::Error;
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;
use multipart::server::Multipart;
use multipart::server::save::SaveResult;

#[allow(unused_imports)]
use crate::models;
use crate::header;

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<Body>, crate::ServiceError>>;

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

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/.cqactions.html$",
            r"^/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config$",
            r"^/apps/system/config/com.shinesolutions.aem.passwordreset.Activator$",
            r"^/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck$",
            r"^/apps/system/config/org.apache.felix.http$",
            r"^/apps/system/config/org.apache.http.proxyconfigurator.config$",
            r"^/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet$",
            r"^/apps/system/config/org.apache.sling.security.impl.ReferrerFilter$",
            r"^/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet$",
            r"^/apps/system/config/(?P<configNodeName>[^/?#]*)$",
            r"^/bin/querybuilder.json$",
            r"^/crx/explorer/ui/setpassword.jsp$",
            r"^/crx/packmgr/installstatus.jsp$",
            r"^/crx/packmgr/service.jsp$",
            r"^/crx/packmgr/service/.json/(?P<path>[^/?#]*)$",
            r"^/crx/packmgr/service/script.html$",
            r"^/crx/packmgr/update.jsp$",
            r"^/crx/server/crx.default/jcr:root/.1.json$",
            r"^/etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip$",
            r"^/etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip/jcr:content/vlt:definition/filter.tidy.2.json$",
            r"^/etc/replication/agents.(?P<runmode>[^/?#]*).-1.json$",
            r"^/etc/replication/agents.(?P<runmode>[^/?#]*)/(?P<name>[^/?#]*)$",
            r"^/etc/replication/treeactivation.html$",
            r"^/etc/truststore$",
            r"^/etc/truststore/truststore.p12$",
            r"^/libs/granite/core/content/login.html$",
            r"^/libs/granite/security/post/authorizables$",
            r"^/libs/granite/security/post/sslSetup.html$",
            r"^/libs/granite/security/post/truststore$",
            r"^/libs/granite/security/truststore.json$",
            r"^/system/console/bundles/(?P<name>[^/?#]*)$",
            r"^/system/console/bundles/(?P<name>[^/?#]*).json$",
            r"^/system/console/configMgr$",
            r"^/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler$",
            r"^/system/console/jmx/com.adobe.granite:type=Repository/op/(?P<action>[^/?#]*)$",
            r"^/system/console/status-productinfo.json$",
            r"^/system/health$",
            r"^/(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.html$",
            r"^/(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.json$",
            r"^/(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*)/keystore/store.p12$",
            r"^/(?P<path>[^/?#]*)/$",
            r"^/(?P<path>[^/?#]*)/(?P<name>[^/?#]*)$",
            r"^/(?P<path>[^/?#]*)/(?P<name>[^/?#]*).rw.html$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID__CQACTIONS_HTML: usize = 0;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER_CONFIG: usize = 1;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_AEM_PASSWORDRESET_ACTIVATOR: usize = 2;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_HEALTHCHECK_HC_IMPL_ACTIVEBUNDLEHEALTHCHECK: usize = 3;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_FELIX_HTTP: usize = 4;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_HTTP_PROXYCONFIGURATOR_CONFIG: usize = 5;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_JCR_DAVEX_IMPL_SERVLETS_SLINGDAVEXSERVLET: usize = 6;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SECURITY_IMPL_REFERRERFILTER: usize = 7;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SERVLETS_GET_DEFAULTGETSERVLET: usize = 8;
    pub(crate) static ID_APPS_SYSTEM_CONFIG_CONFIGNODENAME: usize = 9;
    lazy_static! {
        pub static ref REGEX_APPS_SYSTEM_CONFIG_CONFIGNODENAME: regex::Regex =
            regex::Regex::new(r"^/apps/system/config/(?P<configNodeName>[^/?#]*)$")
                .expect("Unable to create regex for APPS_SYSTEM_CONFIG_CONFIGNODENAME");
    }
    pub(crate) static ID_BIN_QUERYBUILDER_JSON: usize = 10;
    pub(crate) static ID_CRX_EXPLORER_UI_SETPASSWORD_JSP: usize = 11;
    pub(crate) static ID_CRX_PACKMGR_INSTALLSTATUS_JSP: usize = 12;
    pub(crate) static ID_CRX_PACKMGR_SERVICE_JSP: usize = 13;
    pub(crate) static ID_CRX_PACKMGR_SERVICE__JSON_PATH: usize = 14;
    lazy_static! {
        pub static ref REGEX_CRX_PACKMGR_SERVICE__JSON_PATH: regex::Regex =
            regex::Regex::new(r"^/crx/packmgr/service/.json/(?P<path>[^/?#]*)$")
                .expect("Unable to create regex for CRX_PACKMGR_SERVICE__JSON_PATH");
    }
    pub(crate) static ID_CRX_PACKMGR_SERVICE_SCRIPT_HTML: usize = 15;
    pub(crate) static ID_CRX_PACKMGR_UPDATE_JSP: usize = 16;
    pub(crate) static ID_CRX_SERVER_CRX_DEFAULT_JCRROOT__1_JSON: usize = 17;
    pub(crate) static ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP: usize = 18;
    lazy_static! {
        pub static ref REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP: regex::Regex =
            regex::Regex::new(r"^/etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip$")
                .expect("Unable to create regex for ETC_PACKAGES_GROUP_NAME_VERSION_ZIP");
    }
    pub(crate) static ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON: usize = 19;
    lazy_static! {
        pub static ref REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON: regex::Regex =
            regex::Regex::new(r"^/etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip/jcr:content/vlt:definition/filter.tidy.2.json$")
                .expect("Unable to create regex for ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON");
    }
    pub(crate) static ID_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON: usize = 20;
    lazy_static! {
        pub static ref REGEX_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON: regex::Regex =
            regex::Regex::new(r"^/etc/replication/agents.(?P<runmode>[^/?#]*).-1.json$")
                .expect("Unable to create regex for ETC_REPLICATION_AGENTS_RUNMODE__1_JSON");
    }
    pub(crate) static ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME: usize = 21;
    lazy_static! {
        pub static ref REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME: regex::Regex =
            regex::Regex::new(r"^/etc/replication/agents.(?P<runmode>[^/?#]*)/(?P<name>[^/?#]*)$")
                .expect("Unable to create regex for ETC_REPLICATION_AGENTS_RUNMODE_NAME");
    }
    pub(crate) static ID_ETC_REPLICATION_TREEACTIVATION_HTML: usize = 22;
    pub(crate) static ID_ETC_TRUSTSTORE: usize = 23;
    pub(crate) static ID_ETC_TRUSTSTORE_TRUSTSTORE_P12: usize = 24;
    pub(crate) static ID_LIBS_GRANITE_CORE_CONTENT_LOGIN_HTML: usize = 25;
    pub(crate) static ID_LIBS_GRANITE_SECURITY_POST_AUTHORIZABLES: usize = 26;
    pub(crate) static ID_LIBS_GRANITE_SECURITY_POST_SSLSETUP_HTML: usize = 27;
    pub(crate) static ID_LIBS_GRANITE_SECURITY_POST_TRUSTSTORE: usize = 28;
    pub(crate) static ID_LIBS_GRANITE_SECURITY_TRUSTSTORE_JSON: usize = 29;
    pub(crate) static ID_SYSTEM_CONSOLE_BUNDLES_NAME: usize = 30;
    lazy_static! {
        pub static ref REGEX_SYSTEM_CONSOLE_BUNDLES_NAME: regex::Regex =
            regex::Regex::new(r"^/system/console/bundles/(?P<name>[^/?#]*)$")
                .expect("Unable to create regex for SYSTEM_CONSOLE_BUNDLES_NAME");
    }
    pub(crate) static ID_SYSTEM_CONSOLE_BUNDLES_NAME_JSON: usize = 31;
    lazy_static! {
        pub static ref REGEX_SYSTEM_CONSOLE_BUNDLES_NAME_JSON: regex::Regex =
            regex::Regex::new(r"^/system/console/bundles/(?P<name>[^/?#]*).json$")
                .expect("Unable to create regex for SYSTEM_CONSOLE_BUNDLES_NAME_JSON");
    }
    pub(crate) static ID_SYSTEM_CONSOLE_CONFIGMGR: usize = 32;
    pub(crate) static ID_SYSTEM_CONSOLE_CONFIGMGR_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER: usize = 33;
    pub(crate) static ID_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION: usize = 34;
    lazy_static! {
        pub static ref REGEX_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION: regex::Regex =
            regex::Regex::new(r"^/system/console/jmx/com.adobe.granite:type=Repository/op/(?P<action>[^/?#]*)$")
                .expect("Unable to create regex for SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION");
    }
    pub(crate) static ID_SYSTEM_CONSOLE_STATUS_PRODUCTINFO_JSON: usize = 35;
    pub(crate) static ID_SYSTEM_HEALTH: usize = 36;
    pub(crate) static ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML: usize = 37;
    lazy_static! {
        pub static ref REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML: regex::Regex =
            regex::Regex::new(r"^/(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.html$")
                .expect("Unable to create regex for INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML");
    }
    pub(crate) static ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON: usize = 38;
    lazy_static! {
        pub static ref REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON: regex::Regex =
            regex::Regex::new(r"^/(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.json$")
                .expect("Unable to create regex for INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON");
    }
    pub(crate) static ID_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12: usize = 39;
    lazy_static! {
        pub static ref REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12: regex::Regex =
            regex::Regex::new(r"^/(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*)/keystore/store.p12$")
                .expect("Unable to create regex for INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12");
    }
    pub(crate) static ID_PATH_: usize = 40;
    lazy_static! {
        pub static ref REGEX_PATH_: regex::Regex =
            regex::Regex::new(r"^/(?P<path>[^/?#]*)/$")
                .expect("Unable to create regex for PATH_");
    }
    pub(crate) static ID_PATH_NAME: usize = 41;
    lazy_static! {
        pub static ref REGEX_PATH_NAME: regex::Regex =
            regex::Regex::new(r"^/(?P<path>[^/?#]*)/(?P<name>[^/?#]*)$")
                .expect("Unable to create regex for PATH_NAME");
    }
    pub(crate) static ID_PATH_NAME_RW_HTML: usize = 42;
    lazy_static! {
        pub static ref REGEX_PATH_NAME_RW_HTML: regex::Regex =
            regex::Regex::new(r"^/(?P<path>[^/?#]*)/(?P<name>[^/?#]*).rw.html$")
                .expect("Unable to create regex for PATH_NAME_RW_HTML");
    }
}

pub struct MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        Poll::Ready(Ok(()))
    }

    fn call(&mut self, target: Target) -> Self::Future {
        futures::future::ok(Service::new(
            self.api_impl.clone(),
        ))
    }
}

fn method_not_allowed() -> Result<Response<Body>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(Body::empty())
            .expect("Unable to create Method Not Allowed response")
    )
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl: api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker.clone(),
        }
    }
}

impl<T, C> hyper::service::Service<(Request<Body>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Response<Body>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
        self.api_impl.poll_ready(cx)
    }

    fn call(&mut self, req: (Request<Body>, C)) -> Self::Future { async fn run<T, C>(mut api_impl: T, req: (Request<Body>, C)) -> Result<Response<Body>, crate::ServiceError> where
        T: Api<C> + Clone + Send + 'static,
        C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
    {
        let (request, context) = req;
        let (parts, body) = request.into_parts();
        let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        match &method {

            // GetAemProductInfo - GET /system/console/status-productinfo.json
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_CONSOLE_STATUS_PRODUCTINFO_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.get_aem_product_info(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAemProductInfoResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_AEM_PRODUCT_INFO_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetBundleInfo - GET /system/console/bundles/{name}.json
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_CONSOLE_BUNDLES_NAME_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_SYSTEM_CONSOLE_BUNDLES_NAME_JSON
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE SYSTEM_CONSOLE_BUNDLES_NAME_JSON in set but failed match against \"{}\"", path, paths::REGEX_SYSTEM_CONSOLE_BUNDLES_NAME_JSON.as_str())
                    );

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_bundle_info(
                                            param_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetBundleInfoResponse::RetrievedBundleInfo
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_BUNDLE_INFO_RETRIEVED_BUNDLE_INFO"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetBundleInfoResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_BUNDLE_INFO_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetConfigMgr - GET /system/console/configMgr
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.get_config_mgr(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetConfigMgrResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/xml")
                                                            .expect("Unable to create Content-Type header for GET_CONFIG_MGR_OK"));
                                                    let body = serde_xml_rs::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetConfigMgrResponse::UnexpectedError
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(5XX).expect("Unable to turn 5XX into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostBundle - POST /system/console/bundles/{name}
            &hyper::Method::POST if path.matched(paths::ID_SYSTEM_CONSOLE_BUNDLES_NAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_SYSTEM_CONSOLE_BUNDLES_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE SYSTEM_CONSOLE_BUNDLES_NAME in set but failed match against \"{}\"", path, paths::REGEX_SYSTEM_CONSOLE_BUNDLES_NAME.as_str())
                    );

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_action = query_params.iter().filter(|e| e.0 == "action").map(|e| e.1.to_owned())
                    .nth(0);
                let param_action = match param_action {
                    Some(param_action) => {
                        let param_action =
                            <String as std::str::FromStr>::from_str
                                (&param_action);
                        match param_action {
                            Ok(param_action) => Some(param_action),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter action - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter action")),
                        }
                    },
                    None => None,
                };
                let param_action = match param_action {
                    Some(param_action) => param_action,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter action"))
                        .expect("Unable to create Bad Request response for missing query parameter action")),
                };

                                let result = api_impl.post_bundle(
                                            param_name,
                                            param_action,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostBundleResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostJmxRepository - POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}
            &hyper::Method::POST if path.matched(paths::ID_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION in set but failed match against \"{}\"", path, paths::REGEX_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION.as_str())
                    );

                let param_action = match percent_encoding::percent_decode(path_params["action"].as_bytes()).decode_utf8() {
                    Ok(param_action) => match param_action.parse::<String>() {
                        Ok(param_action) => param_action,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter action: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["action"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.post_jmx_repository(
                                            param_action,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostJmxRepositoryResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostSamlConfiguration - POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
            &hyper::Method::POST if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_post = query_params.iter().filter(|e| e.0 == "post").map(|e| e.1.to_owned())
                    .nth(0);
                let param_post = match param_post {
                    Some(param_post) => {
                        let param_post =
                            <bool as std::str::FromStr>::from_str
                                (&param_post);
                        match param_post {
                            Ok(param_post) => Some(param_post),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter post - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter post")),
                        }
                    },
                    None => None,
                };
                let param_apply = query_params.iter().filter(|e| e.0 == "apply").map(|e| e.1.to_owned())
                    .nth(0);
                let param_apply = match param_apply {
                    Some(param_apply) => {
                        let param_apply =
                            <bool as std::str::FromStr>::from_str
                                (&param_apply);
                        match param_apply {
                            Ok(param_apply) => Some(param_apply),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter apply - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter apply")),
                        }
                    },
                    None => None,
                };
                let param_delete = query_params.iter().filter(|e| e.0 == "delete").map(|e| e.1.to_owned())
                    .nth(0);
                let param_delete = match param_delete {
                    Some(param_delete) => {
                        let param_delete =
                            <bool as std::str::FromStr>::from_str
                                (&param_delete);
                        match param_delete {
                            Ok(param_delete) => Some(param_delete),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter delete - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter delete")),
                        }
                    },
                    None => None,
                };
                let param_action = query_params.iter().filter(|e| e.0 == "action").map(|e| e.1.to_owned())
                    .nth(0);
                let param_action = match param_action {
                    Some(param_action) => {
                        let param_action =
                            <String as std::str::FromStr>::from_str
                                (&param_action);
                        match param_action {
                            Ok(param_action) => Some(param_action),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter action - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter action")),
                        }
                    },
                    None => None,
                };
                let param_location = query_params.iter().filter(|e| e.0 == "$location").map(|e| e.1.to_owned())
                    .nth(0);
                let param_location = match param_location {
                    Some(param_location) => {
                        let param_location =
                            <String as std::str::FromStr>::from_str
                                (&param_location);
                        match param_location {
                            Ok(param_location) => Some(param_location),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter $location - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter $location")),
                        }
                    },
                    None => None,
                };
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .filter_map(|param_path| param_path.parse().ok())
                    .collect::<Vec<_>>();
                let param_path = if !param_path.is_empty() {
                    Some(param_path)
                } else {
                    None
                };
                let param_service_ranking = query_params.iter().filter(|e| e.0 == "service.ranking").map(|e| e.1.to_owned())
                    .nth(0);
                let param_service_ranking = match param_service_ranking {
                    Some(param_service_ranking) => {
                        let param_service_ranking =
                            <i32 as std::str::FromStr>::from_str
                                (&param_service_ranking);
                        match param_service_ranking {
                            Ok(param_service_ranking) => Some(param_service_ranking),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter service.ranking - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter service.ranking")),
                        }
                    },
                    None => None,
                };
                let param_idp_url = query_params.iter().filter(|e| e.0 == "idpUrl").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_url = match param_idp_url {
                    Some(param_idp_url) => {
                        let param_idp_url =
                            <String as std::str::FromStr>::from_str
                                (&param_idp_url);
                        match param_idp_url {
                            Ok(param_idp_url) => Some(param_idp_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpUrl - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpUrl")),
                        }
                    },
                    None => None,
                };
                let param_idp_cert_alias = query_params.iter().filter(|e| e.0 == "idpCertAlias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_cert_alias = match param_idp_cert_alias {
                    Some(param_idp_cert_alias) => {
                        let param_idp_cert_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_idp_cert_alias);
                        match param_idp_cert_alias {
                            Ok(param_idp_cert_alias) => Some(param_idp_cert_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpCertAlias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpCertAlias")),
                        }
                    },
                    None => None,
                };
                let param_idp_http_redirect = query_params.iter().filter(|e| e.0 == "idpHttpRedirect").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_http_redirect = match param_idp_http_redirect {
                    Some(param_idp_http_redirect) => {
                        let param_idp_http_redirect =
                            <bool as std::str::FromStr>::from_str
                                (&param_idp_http_redirect);
                        match param_idp_http_redirect {
                            Ok(param_idp_http_redirect) => Some(param_idp_http_redirect),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpHttpRedirect - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpHttpRedirect")),
                        }
                    },
                    None => None,
                };
                let param_service_provider_entity_id = query_params.iter().filter(|e| e.0 == "serviceProviderEntityId").map(|e| e.1.to_owned())
                    .nth(0);
                let param_service_provider_entity_id = match param_service_provider_entity_id {
                    Some(param_service_provider_entity_id) => {
                        let param_service_provider_entity_id =
                            <String as std::str::FromStr>::from_str
                                (&param_service_provider_entity_id);
                        match param_service_provider_entity_id {
                            Ok(param_service_provider_entity_id) => Some(param_service_provider_entity_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter serviceProviderEntityId - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter serviceProviderEntityId")),
                        }
                    },
                    None => None,
                };
                let param_assertion_consumer_service_url = query_params.iter().filter(|e| e.0 == "assertionConsumerServiceURL").map(|e| e.1.to_owned())
                    .nth(0);
                let param_assertion_consumer_service_url = match param_assertion_consumer_service_url {
                    Some(param_assertion_consumer_service_url) => {
                        let param_assertion_consumer_service_url =
                            <String as std::str::FromStr>::from_str
                                (&param_assertion_consumer_service_url);
                        match param_assertion_consumer_service_url {
                            Ok(param_assertion_consumer_service_url) => Some(param_assertion_consumer_service_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter assertionConsumerServiceURL - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter assertionConsumerServiceURL")),
                        }
                    },
                    None => None,
                };
                let param_sp_private_key_alias = query_params.iter().filter(|e| e.0 == "spPrivateKeyAlias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_sp_private_key_alias = match param_sp_private_key_alias {
                    Some(param_sp_private_key_alias) => {
                        let param_sp_private_key_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_sp_private_key_alias);
                        match param_sp_private_key_alias {
                            Ok(param_sp_private_key_alias) => Some(param_sp_private_key_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter spPrivateKeyAlias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter spPrivateKeyAlias")),
                        }
                    },
                    None => None,
                };
                let param_key_store_password = query_params.iter().filter(|e| e.0 == "keyStorePassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_key_store_password = match param_key_store_password {
                    Some(param_key_store_password) => {
                        let param_key_store_password =
                            <String as std::str::FromStr>::from_str
                                (&param_key_store_password);
                        match param_key_store_password {
                            Ok(param_key_store_password) => Some(param_key_store_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keyStorePassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keyStorePassword")),
                        }
                    },
                    None => None,
                };
                let param_default_redirect_url = query_params.iter().filter(|e| e.0 == "defaultRedirectUrl").map(|e| e.1.to_owned())
                    .nth(0);
                let param_default_redirect_url = match param_default_redirect_url {
                    Some(param_default_redirect_url) => {
                        let param_default_redirect_url =
                            <String as std::str::FromStr>::from_str
                                (&param_default_redirect_url);
                        match param_default_redirect_url {
                            Ok(param_default_redirect_url) => Some(param_default_redirect_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter defaultRedirectUrl - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter defaultRedirectUrl")),
                        }
                    },
                    None => None,
                };
                let param_user_id_attribute = query_params.iter().filter(|e| e.0 == "userIDAttribute").map(|e| e.1.to_owned())
                    .nth(0);
                let param_user_id_attribute = match param_user_id_attribute {
                    Some(param_user_id_attribute) => {
                        let param_user_id_attribute =
                            <String as std::str::FromStr>::from_str
                                (&param_user_id_attribute);
                        match param_user_id_attribute {
                            Ok(param_user_id_attribute) => Some(param_user_id_attribute),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter userIDAttribute - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter userIDAttribute")),
                        }
                    },
                    None => None,
                };
                let param_use_encryption = query_params.iter().filter(|e| e.0 == "useEncryption").map(|e| e.1.to_owned())
                    .nth(0);
                let param_use_encryption = match param_use_encryption {
                    Some(param_use_encryption) => {
                        let param_use_encryption =
                            <bool as std::str::FromStr>::from_str
                                (&param_use_encryption);
                        match param_use_encryption {
                            Ok(param_use_encryption) => Some(param_use_encryption),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter useEncryption - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter useEncryption")),
                        }
                    },
                    None => None,
                };
                let param_create_user = query_params.iter().filter(|e| e.0 == "createUser").map(|e| e.1.to_owned())
                    .nth(0);
                let param_create_user = match param_create_user {
                    Some(param_create_user) => {
                        let param_create_user =
                            <bool as std::str::FromStr>::from_str
                                (&param_create_user);
                        match param_create_user {
                            Ok(param_create_user) => Some(param_create_user),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter createUser - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter createUser")),
                        }
                    },
                    None => None,
                };
                let param_add_group_memberships = query_params.iter().filter(|e| e.0 == "addGroupMemberships").map(|e| e.1.to_owned())
                    .nth(0);
                let param_add_group_memberships = match param_add_group_memberships {
                    Some(param_add_group_memberships) => {
                        let param_add_group_memberships =
                            <bool as std::str::FromStr>::from_str
                                (&param_add_group_memberships);
                        match param_add_group_memberships {
                            Ok(param_add_group_memberships) => Some(param_add_group_memberships),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter addGroupMemberships - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter addGroupMemberships")),
                        }
                    },
                    None => None,
                };
                let param_group_membership_attribute = query_params.iter().filter(|e| e.0 == "groupMembershipAttribute").map(|e| e.1.to_owned())
                    .nth(0);
                let param_group_membership_attribute = match param_group_membership_attribute {
                    Some(param_group_membership_attribute) => {
                        let param_group_membership_attribute =
                            <String as std::str::FromStr>::from_str
                                (&param_group_membership_attribute);
                        match param_group_membership_attribute {
                            Ok(param_group_membership_attribute) => Some(param_group_membership_attribute),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter groupMembershipAttribute - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter groupMembershipAttribute")),
                        }
                    },
                    None => None,
                };
                let param_default_groups = query_params.iter().filter(|e| e.0 == "defaultGroups").map(|e| e.1.to_owned())
                    .filter_map(|param_default_groups| param_default_groups.parse().ok())
                    .collect::<Vec<_>>();
                let param_default_groups = if !param_default_groups.is_empty() {
                    Some(param_default_groups)
                } else {
                    None
                };
                let param_name_id_format = query_params.iter().filter(|e| e.0 == "nameIdFormat").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name_id_format = match param_name_id_format {
                    Some(param_name_id_format) => {
                        let param_name_id_format =
                            <String as std::str::FromStr>::from_str
                                (&param_name_id_format);
                        match param_name_id_format {
                            Ok(param_name_id_format) => Some(param_name_id_format),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter nameIdFormat - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter nameIdFormat")),
                        }
                    },
                    None => None,
                };
                let param_synchronize_attributes = query_params.iter().filter(|e| e.0 == "synchronizeAttributes").map(|e| e.1.to_owned())
                    .filter_map(|param_synchronize_attributes| param_synchronize_attributes.parse().ok())
                    .collect::<Vec<_>>();
                let param_synchronize_attributes = if !param_synchronize_attributes.is_empty() {
                    Some(param_synchronize_attributes)
                } else {
                    None
                };
                let param_handle_logout = query_params.iter().filter(|e| e.0 == "handleLogout").map(|e| e.1.to_owned())
                    .nth(0);
                let param_handle_logout = match param_handle_logout {
                    Some(param_handle_logout) => {
                        let param_handle_logout =
                            <bool as std::str::FromStr>::from_str
                                (&param_handle_logout);
                        match param_handle_logout {
                            Ok(param_handle_logout) => Some(param_handle_logout),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter handleLogout - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter handleLogout")),
                        }
                    },
                    None => None,
                };
                let param_logout_url = query_params.iter().filter(|e| e.0 == "logoutUrl").map(|e| e.1.to_owned())
                    .nth(0);
                let param_logout_url = match param_logout_url {
                    Some(param_logout_url) => {
                        let param_logout_url =
                            <String as std::str::FromStr>::from_str
                                (&param_logout_url);
                        match param_logout_url {
                            Ok(param_logout_url) => Some(param_logout_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter logoutUrl - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter logoutUrl")),
                        }
                    },
                    None => None,
                };
                let param_clock_tolerance = query_params.iter().filter(|e| e.0 == "clockTolerance").map(|e| e.1.to_owned())
                    .nth(0);
                let param_clock_tolerance = match param_clock_tolerance {
                    Some(param_clock_tolerance) => {
                        let param_clock_tolerance =
                            <i32 as std::str::FromStr>::from_str
                                (&param_clock_tolerance);
                        match param_clock_tolerance {
                            Ok(param_clock_tolerance) => Some(param_clock_tolerance),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter clockTolerance - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter clockTolerance")),
                        }
                    },
                    None => None,
                };
                let param_digest_method = query_params.iter().filter(|e| e.0 == "digestMethod").map(|e| e.1.to_owned())
                    .nth(0);
                let param_digest_method = match param_digest_method {
                    Some(param_digest_method) => {
                        let param_digest_method =
                            <String as std::str::FromStr>::from_str
                                (&param_digest_method);
                        match param_digest_method {
                            Ok(param_digest_method) => Some(param_digest_method),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter digestMethod - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter digestMethod")),
                        }
                    },
                    None => None,
                };
                let param_signature_method = query_params.iter().filter(|e| e.0 == "signatureMethod").map(|e| e.1.to_owned())
                    .nth(0);
                let param_signature_method = match param_signature_method {
                    Some(param_signature_method) => {
                        let param_signature_method =
                            <String as std::str::FromStr>::from_str
                                (&param_signature_method);
                        match param_signature_method {
                            Ok(param_signature_method) => Some(param_signature_method),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter signatureMethod - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter signatureMethod")),
                        }
                    },
                    None => None,
                };
                let param_user_intermediate_path = query_params.iter().filter(|e| e.0 == "userIntermediatePath").map(|e| e.1.to_owned())
                    .nth(0);
                let param_user_intermediate_path = match param_user_intermediate_path {
                    Some(param_user_intermediate_path) => {
                        let param_user_intermediate_path =
                            <String as std::str::FromStr>::from_str
                                (&param_user_intermediate_path);
                        match param_user_intermediate_path {
                            Ok(param_user_intermediate_path) => Some(param_user_intermediate_path),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter userIntermediatePath - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter userIntermediatePath")),
                        }
                    },
                    None => None,
                };
                let param_propertylist = query_params.iter().filter(|e| e.0 == "propertylist").map(|e| e.1.to_owned())
                    .filter_map(|param_propertylist| param_propertylist.parse().ok())
                    .collect::<Vec<_>>();
                let param_propertylist = if !param_propertylist.is_empty() {
                    Some(param_propertylist)
                } else {
                    None
                };

                                let result = api_impl.post_saml_configuration(
                                            param_post,
                                            param_apply,
                                            param_delete,
                                            param_action,
                                            param_location,
                                            param_path.as_ref(),
                                            param_service_ranking,
                                            param_idp_url,
                                            param_idp_cert_alias,
                                            param_idp_http_redirect,
                                            param_service_provider_entity_id,
                                            param_assertion_consumer_service_url,
                                            param_sp_private_key_alias,
                                            param_key_store_password,
                                            param_default_redirect_url,
                                            param_user_id_attribute,
                                            param_use_encryption,
                                            param_create_user,
                                            param_add_group_memberships,
                                            param_group_membership_attribute,
                                            param_default_groups.as_ref(),
                                            param_name_id_format,
                                            param_synchronize_attributes.as_ref(),
                                            param_handle_logout,
                                            param_logout_url,
                                            param_clock_tolerance,
                                            param_digest_method,
                                            param_signature_method,
                                            param_user_intermediate_path,
                                            param_propertylist.as_ref(),
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostSamlConfigurationResponse::RetrievedAEMSAMLConfiguration
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_SAML_CONFIGURATION_RETRIEVED_AEMSAML_CONFIGURATION"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PostSamlConfigurationResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(302).expect("Unable to turn 302 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_SAML_CONFIGURATION_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PostSamlConfigurationResponse::DefaultResponse_2
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_SAML_CONFIGURATION_DEFAULT_RESPONSE_2"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetLoginPage - GET /libs/granite/core/content/login.html
            &hyper::Method::GET if path.matched(paths::ID_LIBS_GRANITE_CORE_CONTENT_LOGIN_HTML) => {
                                let result = api_impl.get_login_page(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetLoginPageResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/html")
                                                            .expect("Unable to create Content-Type header for GET_LOGIN_PAGE_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostCqActions - POST /.cqactions.html
            &hyper::Method::POST if path.matched(paths::ID__CQACTIONS_HTML) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_authorizable_id = query_params.iter().filter(|e| e.0 == "authorizableId").map(|e| e.1.to_owned())
                    .nth(0);
                let param_authorizable_id = match param_authorizable_id {
                    Some(param_authorizable_id) => {
                        let param_authorizable_id =
                            <String as std::str::FromStr>::from_str
                                (&param_authorizable_id);
                        match param_authorizable_id {
                            Ok(param_authorizable_id) => Some(param_authorizable_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter authorizableId - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter authorizableId")),
                        }
                    },
                    None => None,
                };
                let param_authorizable_id = match param_authorizable_id {
                    Some(param_authorizable_id) => param_authorizable_id,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter authorizableId"))
                        .expect("Unable to create Bad Request response for missing query parameter authorizableId")),
                };
                let param_changelog = query_params.iter().filter(|e| e.0 == "changelog").map(|e| e.1.to_owned())
                    .nth(0);
                let param_changelog = match param_changelog {
                    Some(param_changelog) => {
                        let param_changelog =
                            <String as std::str::FromStr>::from_str
                                (&param_changelog);
                        match param_changelog {
                            Ok(param_changelog) => Some(param_changelog),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter changelog - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter changelog")),
                        }
                    },
                    None => None,
                };
                let param_changelog = match param_changelog {
                    Some(param_changelog) => param_changelog,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter changelog"))
                        .expect("Unable to create Bad Request response for missing query parameter changelog")),
                };

                                let result = api_impl.post_cq_actions(
                                            param_authorizable_id,
                                            param_changelog,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostCqActionsResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetCrxdeStatus - GET /crx/server/crx.default/jcr:root/.1.json
            &hyper::Method::GET if path.matched(paths::ID_CRX_SERVER_CRX_DEFAULT_JCRROOT__1_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.get_crxde_status(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetCrxdeStatusResponse::CRXDEIsEnabled
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("plain/text")
                                                            .expect("Unable to create Content-Type header for GET_CRXDE_STATUS_CRXDEIS_ENABLED"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetCrxdeStatusResponse::CRXDEIsDisabled
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("plain/text")
                                                            .expect("Unable to create Content-Type header for GET_CRXDE_STATUS_CRXDEIS_DISABLED"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetInstallStatus - GET /crx/packmgr/installstatus.jsp
            &hyper::Method::GET if path.matched(paths::ID_CRX_PACKMGR_INSTALLSTATUS_JSP) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.get_install_status(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetInstallStatusResponse::RetrievedCRXPackageManagerInstallStatus
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_INSTALL_STATUS_RETRIEVED_CRX_PACKAGE_MANAGER_INSTALL_STATUS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetInstallStatusResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_INSTALL_STATUS_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetPackageManagerServlet - GET /crx/packmgr/service/script.html
            &hyper::Method::GET if path.matched(paths::ID_CRX_PACKMGR_SERVICE_SCRIPT_HTML) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.get_package_manager_servlet(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPackageManagerServletResponse::PackageManagerServletIsDisabled
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/html")
                                                            .expect("Unable to create Content-Type header for GET_PACKAGE_MANAGER_SERVLET_PACKAGE_MANAGER_SERVLET_IS_DISABLED"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetPackageManagerServletResponse::PackageManagerServletIsActive
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(405).expect("Unable to turn 405 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/html")
                                                            .expect("Unable to create Content-Type header for GET_PACKAGE_MANAGER_SERVLET_PACKAGE_MANAGER_SERVLET_IS_ACTIVE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostPackageService - POST /crx/packmgr/service.jsp
            &hyper::Method::POST if path.matched(paths::ID_CRX_PACKMGR_SERVICE_JSP) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_cmd = query_params.iter().filter(|e| e.0 == "cmd").map(|e| e.1.to_owned())
                    .nth(0);
                let param_cmd = match param_cmd {
                    Some(param_cmd) => {
                        let param_cmd =
                            <String as std::str::FromStr>::from_str
                                (&param_cmd);
                        match param_cmd {
                            Ok(param_cmd) => Some(param_cmd),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter cmd - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter cmd")),
                        }
                    },
                    None => None,
                };
                let param_cmd = match param_cmd {
                    Some(param_cmd) => param_cmd,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter cmd"))
                        .expect("Unable to create Bad Request response for missing query parameter cmd")),
                };

                                let result = api_impl.post_package_service(
                                            param_cmd,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPackageServiceResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/xml")
                                                            .expect("Unable to create Content-Type header for POST_PACKAGE_SERVICE_DEFAULT_RESPONSE"));
                                                    let body = serde_xml_rs::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostPackageServiceJson - POST /crx/packmgr/service/.json/{path}
            &hyper::Method::POST if path.matched(paths::ID_CRX_PACKMGR_SERVICE__JSON_PATH) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CRX_PACKMGR_SERVICE__JSON_PATH
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CRX_PACKMGR_SERVICE__JSON_PATH in set but failed match against \"{}\"", path, paths::REGEX_CRX_PACKMGR_SERVICE__JSON_PATH.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter path: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_cmd = query_params.iter().filter(|e| e.0 == "cmd").map(|e| e.1.to_owned())
                    .nth(0);
                let param_cmd = match param_cmd {
                    Some(param_cmd) => {
                        let param_cmd =
                            <String as std::str::FromStr>::from_str
                                (&param_cmd);
                        match param_cmd {
                            Ok(param_cmd) => Some(param_cmd),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter cmd - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter cmd")),
                        }
                    },
                    None => None,
                };
                let param_cmd = match param_cmd {
                    Some(param_cmd) => param_cmd,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter cmd"))
                        .expect("Unable to create Bad Request response for missing query parameter cmd")),
                };
                let param_group_name = query_params.iter().filter(|e| e.0 == "groupName").map(|e| e.1.to_owned())
                    .nth(0);
                let param_group_name = match param_group_name {
                    Some(param_group_name) => {
                        let param_group_name =
                            <String as std::str::FromStr>::from_str
                                (&param_group_name);
                        match param_group_name {
                            Ok(param_group_name) => Some(param_group_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter groupName - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter groupName")),
                        }
                    },
                    None => None,
                };
                let param_package_name = query_params.iter().filter(|e| e.0 == "packageName").map(|e| e.1.to_owned())
                    .nth(0);
                let param_package_name = match param_package_name {
                    Some(param_package_name) => {
                        let param_package_name =
                            <String as std::str::FromStr>::from_str
                                (&param_package_name);
                        match param_package_name {
                            Ok(param_package_name) => Some(param_package_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter packageName - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter packageName")),
                        }
                    },
                    None => None,
                };
                let param_package_version = query_params.iter().filter(|e| e.0 == "packageVersion").map(|e| e.1.to_owned())
                    .nth(0);
                let param_package_version = match param_package_version {
                    Some(param_package_version) => {
                        let param_package_version =
                            <String as std::str::FromStr>::from_str
                                (&param_package_version);
                        match param_package_version {
                            Ok(param_package_version) => Some(param_package_version),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter packageVersion - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter packageVersion")),
                        }
                    },
                    None => None,
                };
                let param__charset_ = query_params.iter().filter(|e| e.0 == "_charset_").map(|e| e.1.to_owned())
                    .nth(0);
                let param__charset_ = match param__charset_ {
                    Some(param__charset_) => {
                        let param__charset_ =
                            <String as std::str::FromStr>::from_str
                                (&param__charset_);
                        match param__charset_ {
                            Ok(param__charset_) => Some(param__charset_),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter _charset_ - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter _charset_")),
                        }
                    },
                    None => None,
                };
                let param_force = query_params.iter().filter(|e| e.0 == "force").map(|e| e.1.to_owned())
                    .nth(0);
                let param_force = match param_force {
                    Some(param_force) => {
                        let param_force =
                            <bool as std::str::FromStr>::from_str
                                (&param_force);
                        match param_force {
                            Ok(param_force) => Some(param_force),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter force - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter force")),
                        }
                    },
                    None => None,
                };
                let param_recursive = query_params.iter().filter(|e| e.0 == "recursive").map(|e| e.1.to_owned())
                    .nth(0);
                let param_recursive = match param_recursive {
                    Some(param_recursive) => {
                        let param_recursive =
                            <bool as std::str::FromStr>::from_str
                                (&param_recursive);
                        match param_recursive {
                            Ok(param_recursive) => Some(param_recursive),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter recursive - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter recursive")),
                        }
                    },
                    None => None,
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_package = entries.fields.remove("package");
                                let param_package = match field_package {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for package");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let package_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("package data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter package"))
                                            }
                                        };
                                        package_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.post_package_service_json(
                                            param_path,
                                            param_cmd,
                                            param_group_name,
                                            param_package_name,
                                            param_package_version,
                                            param__charset_,
                                            param_force,
                                            param_recursive,
                                            param_package,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPackageServiceJsonResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for POST_PACKAGE_SERVICE_JSON_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // PostPackageUpdate - POST /crx/packmgr/update.jsp
            &hyper::Method::POST if path.matched(paths::ID_CRX_PACKMGR_UPDATE_JSP) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_group_name = query_params.iter().filter(|e| e.0 == "groupName").map(|e| e.1.to_owned())
                    .nth(0);
                let param_group_name = match param_group_name {
                    Some(param_group_name) => {
                        let param_group_name =
                            <String as std::str::FromStr>::from_str
                                (&param_group_name);
                        match param_group_name {
                            Ok(param_group_name) => Some(param_group_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter groupName - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter groupName")),
                        }
                    },
                    None => None,
                };
                let param_group_name = match param_group_name {
                    Some(param_group_name) => param_group_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter groupName"))
                        .expect("Unable to create Bad Request response for missing query parameter groupName")),
                };
                let param_package_name = query_params.iter().filter(|e| e.0 == "packageName").map(|e| e.1.to_owned())
                    .nth(0);
                let param_package_name = match param_package_name {
                    Some(param_package_name) => {
                        let param_package_name =
                            <String as std::str::FromStr>::from_str
                                (&param_package_name);
                        match param_package_name {
                            Ok(param_package_name) => Some(param_package_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter packageName - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter packageName")),
                        }
                    },
                    None => None,
                };
                let param_package_name = match param_package_name {
                    Some(param_package_name) => param_package_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter packageName"))
                        .expect("Unable to create Bad Request response for missing query parameter packageName")),
                };
                let param_version = query_params.iter().filter(|e| e.0 == "version").map(|e| e.1.to_owned())
                    .nth(0);
                let param_version = match param_version {
                    Some(param_version) => {
                        let param_version =
                            <String as std::str::FromStr>::from_str
                                (&param_version);
                        match param_version {
                            Ok(param_version) => Some(param_version),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter version - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter version")),
                        }
                    },
                    None => None,
                };
                let param_version = match param_version {
                    Some(param_version) => param_version,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter version"))
                        .expect("Unable to create Bad Request response for missing query parameter version")),
                };
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => {
                        let param_path =
                            <String as std::str::FromStr>::from_str
                                (&param_path);
                        match param_path {
                            Ok(param_path) => Some(param_path),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter path")),
                        }
                    },
                    None => None,
                };
                let param_path = match param_path {
                    Some(param_path) => param_path,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter path"))
                        .expect("Unable to create Bad Request response for missing query parameter path")),
                };
                let param_filter = query_params.iter().filter(|e| e.0 == "filter").map(|e| e.1.to_owned())
                    .nth(0);
                let param_filter = match param_filter {
                    Some(param_filter) => {
                        let param_filter =
                            <String as std::str::FromStr>::from_str
                                (&param_filter);
                        match param_filter {
                            Ok(param_filter) => Some(param_filter),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter filter - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter filter")),
                        }
                    },
                    None => None,
                };
                let param__charset_ = query_params.iter().filter(|e| e.0 == "_charset_").map(|e| e.1.to_owned())
                    .nth(0);
                let param__charset_ = match param__charset_ {
                    Some(param__charset_) => {
                        let param__charset_ =
                            <String as std::str::FromStr>::from_str
                                (&param__charset_);
                        match param__charset_ {
                            Ok(param__charset_) => Some(param__charset_),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter _charset_ - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter _charset_")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_package_update(
                                            param_group_name,
                                            param_package_name,
                                            param_version,
                                            param_path,
                                            param_filter,
                                            param__charset_,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPackageUpdateResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for POST_PACKAGE_UPDATE_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostSetPassword - POST /crx/explorer/ui/setpassword.jsp
            &hyper::Method::POST if path.matched(paths::ID_CRX_EXPLORER_UI_SETPASSWORD_JSP) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_old = query_params.iter().filter(|e| e.0 == "old").map(|e| e.1.to_owned())
                    .nth(0);
                let param_old = match param_old {
                    Some(param_old) => {
                        let param_old =
                            <String as std::str::FromStr>::from_str
                                (&param_old);
                        match param_old {
                            Ok(param_old) => Some(param_old),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter old - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter old")),
                        }
                    },
                    None => None,
                };
                let param_old = match param_old {
                    Some(param_old) => param_old,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter old"))
                        .expect("Unable to create Bad Request response for missing query parameter old")),
                };
                let param_plain = query_params.iter().filter(|e| e.0 == "plain").map(|e| e.1.to_owned())
                    .nth(0);
                let param_plain = match param_plain {
                    Some(param_plain) => {
                        let param_plain =
                            <String as std::str::FromStr>::from_str
                                (&param_plain);
                        match param_plain {
                            Ok(param_plain) => Some(param_plain),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter plain - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter plain")),
                        }
                    },
                    None => None,
                };
                let param_plain = match param_plain {
                    Some(param_plain) => param_plain,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter plain"))
                        .expect("Unable to create Bad Request response for missing query parameter plain")),
                };
                let param_verify = query_params.iter().filter(|e| e.0 == "verify").map(|e| e.1.to_owned())
                    .nth(0);
                let param_verify = match param_verify {
                    Some(param_verify) => {
                        let param_verify =
                            <String as std::str::FromStr>::from_str
                                (&param_verify);
                        match param_verify {
                            Ok(param_verify) => Some(param_verify),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter verify - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter verify")),
                        }
                    },
                    None => None,
                };
                let param_verify = match param_verify {
                    Some(param_verify) => param_verify,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter verify"))
                        .expect("Unable to create Bad Request response for missing query parameter verify")),
                };

                                let result = api_impl.post_set_password(
                                            param_old,
                                            param_plain,
                                            param_verify,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostSetPasswordResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_SET_PASSWORD_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetAemHealthCheck - GET /system/health
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_HEALTH) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_tags = query_params.iter().filter(|e| e.0 == "tags").map(|e| e.1.to_owned())
                    .nth(0);
                let param_tags = match param_tags {
                    Some(param_tags) => {
                        let param_tags =
                            <String as std::str::FromStr>::from_str
                                (&param_tags);
                        match param_tags {
                            Ok(param_tags) => Some(param_tags),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter tags - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter tags")),
                        }
                    },
                    None => None,
                };
                let param_combine_tags_or = query_params.iter().filter(|e| e.0 == "combineTagsOr").map(|e| e.1.to_owned())
                    .nth(0);
                let param_combine_tags_or = match param_combine_tags_or {
                    Some(param_combine_tags_or) => {
                        let param_combine_tags_or =
                            <bool as std::str::FromStr>::from_str
                                (&param_combine_tags_or);
                        match param_combine_tags_or {
                            Ok(param_combine_tags_or) => Some(param_combine_tags_or),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter combineTagsOr - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter combineTagsOr")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_aem_health_check(
                                            param_tags,
                                            param_combine_tags_or,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAemHealthCheckResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_AEM_HEALTH_CHECK_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigAemHealthCheckServlet - POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_HEALTHCHECK_HC_IMPL_ACTIVEBUNDLEHEALTHCHECK) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bundles_ignored = query_params.iter().filter(|e| e.0 == "bundles.ignored").map(|e| e.1.to_owned())
                    .filter_map(|param_bundles_ignored| param_bundles_ignored.parse().ok())
                    .collect::<Vec<_>>();
                let param_bundles_ignored = if !param_bundles_ignored.is_empty() {
                    Some(param_bundles_ignored)
                } else {
                    None
                };
                let param_bundles_ignored_type_hint = query_params.iter().filter(|e| e.0 == "bundles.ignored@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bundles_ignored_type_hint = match param_bundles_ignored_type_hint {
                    Some(param_bundles_ignored_type_hint) => {
                        let param_bundles_ignored_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_bundles_ignored_type_hint);
                        match param_bundles_ignored_type_hint {
                            Ok(param_bundles_ignored_type_hint) => Some(param_bundles_ignored_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bundles.ignored@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bundles.ignored@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_aem_health_check_servlet(
                                            param_bundles_ignored.as_ref(),
                                            param_bundles_ignored_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigAemHealthCheckServletResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigAemPasswordReset - POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_AEM_PASSWORDRESET_ACTIVATOR) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_pwdreset_authorizables = query_params.iter().filter(|e| e.0 == "pwdreset.authorizables").map(|e| e.1.to_owned())
                    .filter_map(|param_pwdreset_authorizables| param_pwdreset_authorizables.parse().ok())
                    .collect::<Vec<_>>();
                let param_pwdreset_authorizables = if !param_pwdreset_authorizables.is_empty() {
                    Some(param_pwdreset_authorizables)
                } else {
                    None
                };
                let param_pwdreset_authorizables_type_hint = query_params.iter().filter(|e| e.0 == "pwdreset.authorizables@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_pwdreset_authorizables_type_hint = match param_pwdreset_authorizables_type_hint {
                    Some(param_pwdreset_authorizables_type_hint) => {
                        let param_pwdreset_authorizables_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_pwdreset_authorizables_type_hint);
                        match param_pwdreset_authorizables_type_hint {
                            Ok(param_pwdreset_authorizables_type_hint) => Some(param_pwdreset_authorizables_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter pwdreset.authorizables@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter pwdreset.authorizables@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_aem_password_reset(
                                            param_pwdreset_authorizables.as_ref(),
                                            param_pwdreset_authorizables_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigAemPasswordResetResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // SslSetup - POST /libs/granite/security/post/sslSetup.html
            &hyper::Method::POST if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_SSLSETUP_HTML) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_keystore_password = query_params.iter().filter(|e| e.0 == "keystorePassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_keystore_password = match param_keystore_password {
                    Some(param_keystore_password) => {
                        let param_keystore_password =
                            <String as std::str::FromStr>::from_str
                                (&param_keystore_password);
                        match param_keystore_password {
                            Ok(param_keystore_password) => Some(param_keystore_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keystorePassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keystorePassword")),
                        }
                    },
                    None => None,
                };
                let param_keystore_password = match param_keystore_password {
                    Some(param_keystore_password) => param_keystore_password,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter keystorePassword"))
                        .expect("Unable to create Bad Request response for missing query parameter keystorePassword")),
                };
                let param_keystore_password_confirm = query_params.iter().filter(|e| e.0 == "keystorePasswordConfirm").map(|e| e.1.to_owned())
                    .nth(0);
                let param_keystore_password_confirm = match param_keystore_password_confirm {
                    Some(param_keystore_password_confirm) => {
                        let param_keystore_password_confirm =
                            <String as std::str::FromStr>::from_str
                                (&param_keystore_password_confirm);
                        match param_keystore_password_confirm {
                            Ok(param_keystore_password_confirm) => Some(param_keystore_password_confirm),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keystorePasswordConfirm - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keystorePasswordConfirm")),
                        }
                    },
                    None => None,
                };
                let param_keystore_password_confirm = match param_keystore_password_confirm {
                    Some(param_keystore_password_confirm) => param_keystore_password_confirm,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter keystorePasswordConfirm"))
                        .expect("Unable to create Bad Request response for missing query parameter keystorePasswordConfirm")),
                };
                let param_truststore_password = query_params.iter().filter(|e| e.0 == "truststorePassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_truststore_password = match param_truststore_password {
                    Some(param_truststore_password) => {
                        let param_truststore_password =
                            <String as std::str::FromStr>::from_str
                                (&param_truststore_password);
                        match param_truststore_password {
                            Ok(param_truststore_password) => Some(param_truststore_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter truststorePassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter truststorePassword")),
                        }
                    },
                    None => None,
                };
                let param_truststore_password = match param_truststore_password {
                    Some(param_truststore_password) => param_truststore_password,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter truststorePassword"))
                        .expect("Unable to create Bad Request response for missing query parameter truststorePassword")),
                };
                let param_truststore_password_confirm = query_params.iter().filter(|e| e.0 == "truststorePasswordConfirm").map(|e| e.1.to_owned())
                    .nth(0);
                let param_truststore_password_confirm = match param_truststore_password_confirm {
                    Some(param_truststore_password_confirm) => {
                        let param_truststore_password_confirm =
                            <String as std::str::FromStr>::from_str
                                (&param_truststore_password_confirm);
                        match param_truststore_password_confirm {
                            Ok(param_truststore_password_confirm) => Some(param_truststore_password_confirm),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter truststorePasswordConfirm - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter truststorePasswordConfirm")),
                        }
                    },
                    None => None,
                };
                let param_truststore_password_confirm = match param_truststore_password_confirm {
                    Some(param_truststore_password_confirm) => param_truststore_password_confirm,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter truststorePasswordConfirm"))
                        .expect("Unable to create Bad Request response for missing query parameter truststorePasswordConfirm")),
                };
                let param_https_hostname = query_params.iter().filter(|e| e.0 == "httpsHostname").map(|e| e.1.to_owned())
                    .nth(0);
                let param_https_hostname = match param_https_hostname {
                    Some(param_https_hostname) => {
                        let param_https_hostname =
                            <String as std::str::FromStr>::from_str
                                (&param_https_hostname);
                        match param_https_hostname {
                            Ok(param_https_hostname) => Some(param_https_hostname),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter httpsHostname - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter httpsHostname")),
                        }
                    },
                    None => None,
                };
                let param_https_hostname = match param_https_hostname {
                    Some(param_https_hostname) => param_https_hostname,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter httpsHostname"))
                        .expect("Unable to create Bad Request response for missing query parameter httpsHostname")),
                };
                let param_https_port = query_params.iter().filter(|e| e.0 == "httpsPort").map(|e| e.1.to_owned())
                    .nth(0);
                let param_https_port = match param_https_port {
                    Some(param_https_port) => {
                        let param_https_port =
                            <String as std::str::FromStr>::from_str
                                (&param_https_port);
                        match param_https_port {
                            Ok(param_https_port) => Some(param_https_port),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter httpsPort - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter httpsPort")),
                        }
                    },
                    None => None,
                };
                let param_https_port = match param_https_port {
                    Some(param_https_port) => param_https_port,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter httpsPort"))
                        .expect("Unable to create Bad Request response for missing query parameter httpsPort")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_privatekey_file = entries.fields.remove("privatekey_file");
                                let param_privatekey_file = match field_privatekey_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for privatekey_file");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let privatekey_file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("privatekey_file data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter privatekey_file"))
                                            }
                                        };
                                        privatekey_file_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_certificate_file = entries.fields.remove("certificate_file");
                                let param_certificate_file = match field_certificate_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for certificate_file");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let certificate_file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("certificate_file data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter certificate_file"))
                                            }
                                        };
                                        certificate_file_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.ssl_setup(
                                            param_keystore_password,
                                            param_keystore_password_confirm,
                                            param_truststore_password,
                                            param_truststore_password_confirm,
                                            param_https_hostname,
                                            param_https_port,
                                            param_privatekey_file,
                                            param_certificate_file,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                SslSetupResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for SSL_SETUP_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // DeleteAgent - DELETE /etc/replication/agents.{runmode}/{name}
            &hyper::Method::DELETE if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE_NAME in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter runmode: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_agent(
                                            param_runmode,
                                            param_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteAgentResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteNode - DELETE /{path}/{name}
            &hyper::Method::DELETE if path.matched(paths::ID_PATH_NAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter path: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_node(
                                            param_path,
                                            param_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteNodeResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetAgent - GET /etc/replication/agents.{runmode}/{name}
            &hyper::Method::GET if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE_NAME in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter runmode: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_agent(
                                            param_runmode,
                                            param_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAgentResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetAgents - GET /etc/replication/agents.{runmode}.-1.json
            &hyper::Method::GET if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE__1_JSON in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter runmode: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_agents(
                                            param_runmode,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAgentsResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_AGENTS_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetAuthorizableKeystore - GET /{intermediatePath}/{authorizableId}.ks.json
            &hyper::Method::GET if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON in set but failed match against \"{}\"", path, paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON.as_str())
                    );

                let param_intermediate_path = match percent_encoding::percent_decode(path_params["intermediatePath"].as_bytes()).decode_utf8() {
                    Ok(param_intermediate_path) => match param_intermediate_path.parse::<String>() {
                        Ok(param_intermediate_path) => param_intermediate_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter intermediatePath: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["intermediatePath"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_authorizable_id = match percent_encoding::percent_decode(path_params["authorizableId"].as_bytes()).decode_utf8() {
                    Ok(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter authorizableId: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["authorizableId"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_authorizable_keystore(
                                            param_intermediate_path,
                                            param_authorizable_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GET_AUTHORIZABLE_KEYSTORE_RETRIEVED_AUTHORIZABLE_KEYSTORE_INFO"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetAuthorizableKeystoreResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for GET_AUTHORIZABLE_KEYSTORE_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetKeystore - GET /{intermediatePath}/{authorizableId}/keystore/store.p12
            &hyper::Method::GET if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12 in set but failed match against \"{}\"", path, paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12.as_str())
                    );

                let param_intermediate_path = match percent_encoding::percent_decode(path_params["intermediatePath"].as_bytes()).decode_utf8() {
                    Ok(param_intermediate_path) => match param_intermediate_path.parse::<String>() {
                        Ok(param_intermediate_path) => param_intermediate_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter intermediatePath: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["intermediatePath"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_authorizable_id = match percent_encoding::percent_decode(path_params["authorizableId"].as_bytes()).decode_utf8() {
                    Ok(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter authorizableId: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["authorizableId"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_keystore(
                                            param_intermediate_path,
                                            param_authorizable_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetKeystoreResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/octet-stream")
                                                            .expect("Unable to create Content-Type header for GET_KEYSTORE_DEFAULT_RESPONSE"));
                                                    let body = body.0;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetNode - GET /{path}/{name}
            &hyper::Method::GET if path.matched(paths::ID_PATH_NAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter path: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_node(
                                            param_path,
                                            param_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetNodeResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetPackage - GET /etc/packages/{group}/{name}-{version}.zip
            &hyper::Method::GET if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_PACKAGES_GROUP_NAME_VERSION_ZIP in set but failed match against \"{}\"", path, paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP.as_str())
                    );

                let param_group = match percent_encoding::percent_decode(path_params["group"].as_bytes()).decode_utf8() {
                    Ok(param_group) => match param_group.parse::<String>() {
                        Ok(param_group) => param_group,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter group: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["group"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_version = match percent_encoding::percent_decode(path_params["version"].as_bytes()).decode_utf8() {
                    Ok(param_version) => match param_version.parse::<String>() {
                        Ok(param_version) => param_version,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter version: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["version"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_package(
                                            param_group,
                                            param_name,
                                            param_version,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPackageResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/octet-stream")
                                                            .expect("Unable to create Content-Type header for GET_PACKAGE_DEFAULT_RESPONSE"));
                                                    let body = body.0;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetPackageFilter - GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json
            &hyper::Method::GET if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON in set but failed match against \"{}\"", path, paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON.as_str())
                    );

                let param_group = match percent_encoding::percent_decode(path_params["group"].as_bytes()).decode_utf8() {
                    Ok(param_group) => match param_group.parse::<String>() {
                        Ok(param_group) => param_group,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter group: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["group"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_version = match percent_encoding::percent_decode(path_params["version"].as_bytes()).decode_utf8() {
                    Ok(param_version) => match param_version.parse::<String>() {
                        Ok(param_version) => param_version,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter version: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["version"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_package_filter(
                                            param_group,
                                            param_name,
                                            param_version,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPackageFilterResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_PACKAGE_FILTER_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetQuery - GET /bin/querybuilder.json
            &hyper::Method::GET if path.matched(paths::ID_BIN_QUERYBUILDER_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => {
                        let param_path =
                            <String as std::str::FromStr>::from_str
                                (&param_path);
                        match param_path {
                            Ok(param_path) => Some(param_path),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter path")),
                        }
                    },
                    None => None,
                };
                let param_path = match param_path {
                    Some(param_path) => param_path,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter path"))
                        .expect("Unable to create Bad Request response for missing query parameter path")),
                };
                let param_p_limit = query_params.iter().filter(|e| e.0 == "p.limit").map(|e| e.1.to_owned())
                    .nth(0);
                let param_p_limit = match param_p_limit {
                    Some(param_p_limit) => {
                        let param_p_limit =
                            <f64 as std::str::FromStr>::from_str
                                (&param_p_limit);
                        match param_p_limit {
                            Ok(param_p_limit) => Some(param_p_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter p.limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter p.limit")),
                        }
                    },
                    None => None,
                };
                let param_p_limit = match param_p_limit {
                    Some(param_p_limit) => param_p_limit,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter p.limit"))
                        .expect("Unable to create Bad Request response for missing query parameter p.limit")),
                };
                let param_param_1_property = query_params.iter().filter(|e| e.0 == "1_property").map(|e| e.1.to_owned())
                    .nth(0);
                let param_param_1_property = match param_param_1_property {
                    Some(param_param_1_property) => {
                        let param_param_1_property =
                            <String as std::str::FromStr>::from_str
                                (&param_param_1_property);
                        match param_param_1_property {
                            Ok(param_param_1_property) => Some(param_param_1_property),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter 1_property - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter 1_property")),
                        }
                    },
                    None => None,
                };
                let param_param_1_property = match param_param_1_property {
                    Some(param_param_1_property) => param_param_1_property,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter 1_property"))
                        .expect("Unable to create Bad Request response for missing query parameter 1_property")),
                };
                let param_param_1_property_value = query_params.iter().filter(|e| e.0 == "1_property.value").map(|e| e.1.to_owned())
                    .nth(0);
                let param_param_1_property_value = match param_param_1_property_value {
                    Some(param_param_1_property_value) => {
                        let param_param_1_property_value =
                            <String as std::str::FromStr>::from_str
                                (&param_param_1_property_value);
                        match param_param_1_property_value {
                            Ok(param_param_1_property_value) => Some(param_param_1_property_value),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter 1_property.value - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter 1_property.value")),
                        }
                    },
                    None => None,
                };
                let param_param_1_property_value = match param_param_1_property_value {
                    Some(param_param_1_property_value) => param_param_1_property_value,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter 1_property.value"))
                        .expect("Unable to create Bad Request response for missing query parameter 1_property.value")),
                };

                                let result = api_impl.get_query(
                                            param_path,
                                            param_p_limit,
                                            param_param_1_property,
                                            param_param_1_property_value,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetQueryResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_QUERY_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetTruststore - GET /etc/truststore/truststore.p12
            &hyper::Method::GET if path.matched(paths::ID_ETC_TRUSTSTORE_TRUSTSTORE_P12) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.get_truststore(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetTruststoreResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/octet-stream")
                                                            .expect("Unable to create Content-Type header for GET_TRUSTSTORE_DEFAULT_RESPONSE"));
                                                    let body = body.0;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetTruststoreInfo - GET /libs/granite/security/truststore.json
            &hyper::Method::GET if path.matched(paths::ID_LIBS_GRANITE_SECURITY_TRUSTSTORE_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                                let result = api_impl.get_truststore_info(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetTruststoreInfoResponse::RetrievedAEMTruststoreInfo
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_TRUSTSTORE_INFO_RETRIEVED_AEM_TRUSTSTORE_INFO"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                GetTruststoreInfoResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_TRUSTSTORE_INFO_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostAgent - POST /etc/replication/agents.{runmode}/{name}
            &hyper::Method::POST if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE_NAME in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter runmode: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_jcrcontent_cqdistribute = query_params.iter().filter(|e| e.0 == "jcr:content/cq:distribute").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_cqdistribute = match param_jcrcontent_cqdistribute {
                    Some(param_jcrcontent_cqdistribute) => {
                        let param_jcrcontent_cqdistribute =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_cqdistribute);
                        match param_jcrcontent_cqdistribute {
                            Ok(param_jcrcontent_cqdistribute) => Some(param_jcrcontent_cqdistribute),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/cq:distribute - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/cq:distribute")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_cqdistribute_type_hint = query_params.iter().filter(|e| e.0 == "jcr:content/cq:distribute@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_cqdistribute_type_hint = match param_jcrcontent_cqdistribute_type_hint {
                    Some(param_jcrcontent_cqdistribute_type_hint) => {
                        let param_jcrcontent_cqdistribute_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_cqdistribute_type_hint);
                        match param_jcrcontent_cqdistribute_type_hint {
                            Ok(param_jcrcontent_cqdistribute_type_hint) => Some(param_jcrcontent_cqdistribute_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/cq:distribute@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/cq:distribute@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_cqname = query_params.iter().filter(|e| e.0 == "jcr:content/cq:name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_cqname = match param_jcrcontent_cqname {
                    Some(param_jcrcontent_cqname) => {
                        let param_jcrcontent_cqname =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_cqname);
                        match param_jcrcontent_cqname {
                            Ok(param_jcrcontent_cqname) => Some(param_jcrcontent_cqname),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/cq:name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/cq:name")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_cqtemplate = query_params.iter().filter(|e| e.0 == "jcr:content/cq:template").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_cqtemplate = match param_jcrcontent_cqtemplate {
                    Some(param_jcrcontent_cqtemplate) => {
                        let param_jcrcontent_cqtemplate =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_cqtemplate);
                        match param_jcrcontent_cqtemplate {
                            Ok(param_jcrcontent_cqtemplate) => Some(param_jcrcontent_cqtemplate),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/cq:template - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/cq:template")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_enabled = query_params.iter().filter(|e| e.0 == "jcr:content/enabled").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_enabled = match param_jcrcontent_enabled {
                    Some(param_jcrcontent_enabled) => {
                        let param_jcrcontent_enabled =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_enabled);
                        match param_jcrcontent_enabled {
                            Ok(param_jcrcontent_enabled) => Some(param_jcrcontent_enabled),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/enabled - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/enabled")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_jcrdescription = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:description").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_jcrdescription = match param_jcrcontent_jcrdescription {
                    Some(param_jcrcontent_jcrdescription) => {
                        let param_jcrcontent_jcrdescription =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_jcrdescription);
                        match param_jcrcontent_jcrdescription {
                            Ok(param_jcrcontent_jcrdescription) => Some(param_jcrcontent_jcrdescription),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/jcr:description - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/jcr:description")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_jcrlast_modified = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:lastModified").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_jcrlast_modified = match param_jcrcontent_jcrlast_modified {
                    Some(param_jcrcontent_jcrlast_modified) => {
                        let param_jcrcontent_jcrlast_modified =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_jcrlast_modified);
                        match param_jcrcontent_jcrlast_modified {
                            Ok(param_jcrcontent_jcrlast_modified) => Some(param_jcrcontent_jcrlast_modified),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/jcr:lastModified - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/jcr:lastModified")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_jcrlast_modified_by = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:lastModifiedBy").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_jcrlast_modified_by = match param_jcrcontent_jcrlast_modified_by {
                    Some(param_jcrcontent_jcrlast_modified_by) => {
                        let param_jcrcontent_jcrlast_modified_by =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_jcrlast_modified_by);
                        match param_jcrcontent_jcrlast_modified_by {
                            Ok(param_jcrcontent_jcrlast_modified_by) => Some(param_jcrcontent_jcrlast_modified_by),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/jcr:lastModifiedBy - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/jcr:lastModifiedBy")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_jcrmixin_types = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:mixinTypes").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_jcrmixin_types = match param_jcrcontent_jcrmixin_types {
                    Some(param_jcrcontent_jcrmixin_types) => {
                        let param_jcrcontent_jcrmixin_types =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_jcrmixin_types);
                        match param_jcrcontent_jcrmixin_types {
                            Ok(param_jcrcontent_jcrmixin_types) => Some(param_jcrcontent_jcrmixin_types),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/jcr:mixinTypes - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/jcr:mixinTypes")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_jcrtitle = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:title").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_jcrtitle = match param_jcrcontent_jcrtitle {
                    Some(param_jcrcontent_jcrtitle) => {
                        let param_jcrcontent_jcrtitle =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_jcrtitle);
                        match param_jcrcontent_jcrtitle {
                            Ok(param_jcrcontent_jcrtitle) => Some(param_jcrcontent_jcrtitle),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/jcr:title - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/jcr:title")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_log_level = query_params.iter().filter(|e| e.0 == "jcr:content/logLevel").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_log_level = match param_jcrcontent_log_level {
                    Some(param_jcrcontent_log_level) => {
                        let param_jcrcontent_log_level =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_log_level);
                        match param_jcrcontent_log_level {
                            Ok(param_jcrcontent_log_level) => Some(param_jcrcontent_log_level),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/logLevel - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/logLevel")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_no_status_update = query_params.iter().filter(|e| e.0 == "jcr:content/noStatusUpdate").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_no_status_update = match param_jcrcontent_no_status_update {
                    Some(param_jcrcontent_no_status_update) => {
                        let param_jcrcontent_no_status_update =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_no_status_update);
                        match param_jcrcontent_no_status_update {
                            Ok(param_jcrcontent_no_status_update) => Some(param_jcrcontent_no_status_update),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/noStatusUpdate - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/noStatusUpdate")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_no_versioning = query_params.iter().filter(|e| e.0 == "jcr:content/noVersioning").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_no_versioning = match param_jcrcontent_no_versioning {
                    Some(param_jcrcontent_no_versioning) => {
                        let param_jcrcontent_no_versioning =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_no_versioning);
                        match param_jcrcontent_no_versioning {
                            Ok(param_jcrcontent_no_versioning) => Some(param_jcrcontent_no_versioning),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/noVersioning - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/noVersioning")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_connect_timeout = query_params.iter().filter(|e| e.0 == "jcr:content/protocolConnectTimeout").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_connect_timeout = match param_jcrcontent_protocol_connect_timeout {
                    Some(param_jcrcontent_protocol_connect_timeout) => {
                        let param_jcrcontent_protocol_connect_timeout =
                            <f64 as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_connect_timeout);
                        match param_jcrcontent_protocol_connect_timeout {
                            Ok(param_jcrcontent_protocol_connect_timeout) => Some(param_jcrcontent_protocol_connect_timeout),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolConnectTimeout - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolConnectTimeout")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_http_connection_closed = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPConnectionClosed").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_http_connection_closed = match param_jcrcontent_protocol_http_connection_closed {
                    Some(param_jcrcontent_protocol_http_connection_closed) => {
                        let param_jcrcontent_protocol_http_connection_closed =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_http_connection_closed);
                        match param_jcrcontent_protocol_http_connection_closed {
                            Ok(param_jcrcontent_protocol_http_connection_closed) => Some(param_jcrcontent_protocol_http_connection_closed),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolHTTPConnectionClosed - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolHTTPConnectionClosed")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_http_expired = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPExpired").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_http_expired = match param_jcrcontent_protocol_http_expired {
                    Some(param_jcrcontent_protocol_http_expired) => {
                        let param_jcrcontent_protocol_http_expired =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_http_expired);
                        match param_jcrcontent_protocol_http_expired {
                            Ok(param_jcrcontent_protocol_http_expired) => Some(param_jcrcontent_protocol_http_expired),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolHTTPExpired - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolHTTPExpired")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_http_headers = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPHeaders").map(|e| e.1.to_owned())
                    .filter_map(|param_jcrcontent_protocol_http_headers| param_jcrcontent_protocol_http_headers.parse().ok())
                    .collect::<Vec<_>>();
                let param_jcrcontent_protocol_http_headers = if !param_jcrcontent_protocol_http_headers.is_empty() {
                    Some(param_jcrcontent_protocol_http_headers)
                } else {
                    None
                };
                let param_jcrcontent_protocol_http_headers_type_hint = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPHeaders@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_http_headers_type_hint = match param_jcrcontent_protocol_http_headers_type_hint {
                    Some(param_jcrcontent_protocol_http_headers_type_hint) => {
                        let param_jcrcontent_protocol_http_headers_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_http_headers_type_hint);
                        match param_jcrcontent_protocol_http_headers_type_hint {
                            Ok(param_jcrcontent_protocol_http_headers_type_hint) => Some(param_jcrcontent_protocol_http_headers_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolHTTPHeaders@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolHTTPHeaders@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_http_method = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPMethod").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_http_method = match param_jcrcontent_protocol_http_method {
                    Some(param_jcrcontent_protocol_http_method) => {
                        let param_jcrcontent_protocol_http_method =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_http_method);
                        match param_jcrcontent_protocol_http_method {
                            Ok(param_jcrcontent_protocol_http_method) => Some(param_jcrcontent_protocol_http_method),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolHTTPMethod - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolHTTPMethod")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_https_relaxed = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPSRelaxed").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_https_relaxed = match param_jcrcontent_protocol_https_relaxed {
                    Some(param_jcrcontent_protocol_https_relaxed) => {
                        let param_jcrcontent_protocol_https_relaxed =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_https_relaxed);
                        match param_jcrcontent_protocol_https_relaxed {
                            Ok(param_jcrcontent_protocol_https_relaxed) => Some(param_jcrcontent_protocol_https_relaxed),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolHTTPSRelaxed - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolHTTPSRelaxed")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_interface = query_params.iter().filter(|e| e.0 == "jcr:content/protocolInterface").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_interface = match param_jcrcontent_protocol_interface {
                    Some(param_jcrcontent_protocol_interface) => {
                        let param_jcrcontent_protocol_interface =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_interface);
                        match param_jcrcontent_protocol_interface {
                            Ok(param_jcrcontent_protocol_interface) => Some(param_jcrcontent_protocol_interface),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolInterface - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolInterface")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_socket_timeout = query_params.iter().filter(|e| e.0 == "jcr:content/protocolSocketTimeout").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_socket_timeout = match param_jcrcontent_protocol_socket_timeout {
                    Some(param_jcrcontent_protocol_socket_timeout) => {
                        let param_jcrcontent_protocol_socket_timeout =
                            <f64 as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_socket_timeout);
                        match param_jcrcontent_protocol_socket_timeout {
                            Ok(param_jcrcontent_protocol_socket_timeout) => Some(param_jcrcontent_protocol_socket_timeout),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolSocketTimeout - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolSocketTimeout")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_protocol_version = query_params.iter().filter(|e| e.0 == "jcr:content/protocolVersion").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_protocol_version = match param_jcrcontent_protocol_version {
                    Some(param_jcrcontent_protocol_version) => {
                        let param_jcrcontent_protocol_version =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_protocol_version);
                        match param_jcrcontent_protocol_version {
                            Ok(param_jcrcontent_protocol_version) => Some(param_jcrcontent_protocol_version),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/protocolVersion - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/protocolVersion")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_proxy_ntlm_domain = query_params.iter().filter(|e| e.0 == "jcr:content/proxyNTLMDomain").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_proxy_ntlm_domain = match param_jcrcontent_proxy_ntlm_domain {
                    Some(param_jcrcontent_proxy_ntlm_domain) => {
                        let param_jcrcontent_proxy_ntlm_domain =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_proxy_ntlm_domain);
                        match param_jcrcontent_proxy_ntlm_domain {
                            Ok(param_jcrcontent_proxy_ntlm_domain) => Some(param_jcrcontent_proxy_ntlm_domain),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/proxyNTLMDomain - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/proxyNTLMDomain")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_proxy_ntlm_host = query_params.iter().filter(|e| e.0 == "jcr:content/proxyNTLMHost").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_proxy_ntlm_host = match param_jcrcontent_proxy_ntlm_host {
                    Some(param_jcrcontent_proxy_ntlm_host) => {
                        let param_jcrcontent_proxy_ntlm_host =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_proxy_ntlm_host);
                        match param_jcrcontent_proxy_ntlm_host {
                            Ok(param_jcrcontent_proxy_ntlm_host) => Some(param_jcrcontent_proxy_ntlm_host),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/proxyNTLMHost - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/proxyNTLMHost")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_proxy_host = query_params.iter().filter(|e| e.0 == "jcr:content/proxyHost").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_proxy_host = match param_jcrcontent_proxy_host {
                    Some(param_jcrcontent_proxy_host) => {
                        let param_jcrcontent_proxy_host =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_proxy_host);
                        match param_jcrcontent_proxy_host {
                            Ok(param_jcrcontent_proxy_host) => Some(param_jcrcontent_proxy_host),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/proxyHost - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/proxyHost")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_proxy_password = query_params.iter().filter(|e| e.0 == "jcr:content/proxyPassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_proxy_password = match param_jcrcontent_proxy_password {
                    Some(param_jcrcontent_proxy_password) => {
                        let param_jcrcontent_proxy_password =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_proxy_password);
                        match param_jcrcontent_proxy_password {
                            Ok(param_jcrcontent_proxy_password) => Some(param_jcrcontent_proxy_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/proxyPassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/proxyPassword")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_proxy_port = query_params.iter().filter(|e| e.0 == "jcr:content/proxyPort").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_proxy_port = match param_jcrcontent_proxy_port {
                    Some(param_jcrcontent_proxy_port) => {
                        let param_jcrcontent_proxy_port =
                            <f64 as std::str::FromStr>::from_str
                                (&param_jcrcontent_proxy_port);
                        match param_jcrcontent_proxy_port {
                            Ok(param_jcrcontent_proxy_port) => Some(param_jcrcontent_proxy_port),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/proxyPort - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/proxyPort")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_proxy_user = query_params.iter().filter(|e| e.0 == "jcr:content/proxyUser").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_proxy_user = match param_jcrcontent_proxy_user {
                    Some(param_jcrcontent_proxy_user) => {
                        let param_jcrcontent_proxy_user =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_proxy_user);
                        match param_jcrcontent_proxy_user {
                            Ok(param_jcrcontent_proxy_user) => Some(param_jcrcontent_proxy_user),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/proxyUser - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/proxyUser")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_queue_batch_max_size = query_params.iter().filter(|e| e.0 == "jcr:content/queueBatchMaxSize").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_queue_batch_max_size = match param_jcrcontent_queue_batch_max_size {
                    Some(param_jcrcontent_queue_batch_max_size) => {
                        let param_jcrcontent_queue_batch_max_size =
                            <f64 as std::str::FromStr>::from_str
                                (&param_jcrcontent_queue_batch_max_size);
                        match param_jcrcontent_queue_batch_max_size {
                            Ok(param_jcrcontent_queue_batch_max_size) => Some(param_jcrcontent_queue_batch_max_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/queueBatchMaxSize - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/queueBatchMaxSize")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_queue_batch_mode = query_params.iter().filter(|e| e.0 == "jcr:content/queueBatchMode").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_queue_batch_mode = match param_jcrcontent_queue_batch_mode {
                    Some(param_jcrcontent_queue_batch_mode) => {
                        let param_jcrcontent_queue_batch_mode =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_queue_batch_mode);
                        match param_jcrcontent_queue_batch_mode {
                            Ok(param_jcrcontent_queue_batch_mode) => Some(param_jcrcontent_queue_batch_mode),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/queueBatchMode - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/queueBatchMode")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_queue_batch_wait_time = query_params.iter().filter(|e| e.0 == "jcr:content/queueBatchWaitTime").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_queue_batch_wait_time = match param_jcrcontent_queue_batch_wait_time {
                    Some(param_jcrcontent_queue_batch_wait_time) => {
                        let param_jcrcontent_queue_batch_wait_time =
                            <f64 as std::str::FromStr>::from_str
                                (&param_jcrcontent_queue_batch_wait_time);
                        match param_jcrcontent_queue_batch_wait_time {
                            Ok(param_jcrcontent_queue_batch_wait_time) => Some(param_jcrcontent_queue_batch_wait_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/queueBatchWaitTime - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/queueBatchWaitTime")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_retry_delay = query_params.iter().filter(|e| e.0 == "jcr:content/retryDelay").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_retry_delay = match param_jcrcontent_retry_delay {
                    Some(param_jcrcontent_retry_delay) => {
                        let param_jcrcontent_retry_delay =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_retry_delay);
                        match param_jcrcontent_retry_delay {
                            Ok(param_jcrcontent_retry_delay) => Some(param_jcrcontent_retry_delay),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/retryDelay - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/retryDelay")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_reverse_replication = query_params.iter().filter(|e| e.0 == "jcr:content/reverseReplication").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_reverse_replication = match param_jcrcontent_reverse_replication {
                    Some(param_jcrcontent_reverse_replication) => {
                        let param_jcrcontent_reverse_replication =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_reverse_replication);
                        match param_jcrcontent_reverse_replication {
                            Ok(param_jcrcontent_reverse_replication) => Some(param_jcrcontent_reverse_replication),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/reverseReplication - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/reverseReplication")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_serialization_type = query_params.iter().filter(|e| e.0 == "jcr:content/serializationType").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_serialization_type = match param_jcrcontent_serialization_type {
                    Some(param_jcrcontent_serialization_type) => {
                        let param_jcrcontent_serialization_type =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_serialization_type);
                        match param_jcrcontent_serialization_type {
                            Ok(param_jcrcontent_serialization_type) => Some(param_jcrcontent_serialization_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/serializationType - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/serializationType")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_slingresource_type = query_params.iter().filter(|e| e.0 == "jcr:content/sling:resourceType").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_slingresource_type = match param_jcrcontent_slingresource_type {
                    Some(param_jcrcontent_slingresource_type) => {
                        let param_jcrcontent_slingresource_type =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_slingresource_type);
                        match param_jcrcontent_slingresource_type {
                            Ok(param_jcrcontent_slingresource_type) => Some(param_jcrcontent_slingresource_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/sling:resourceType - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/sling:resourceType")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_ssl = query_params.iter().filter(|e| e.0 == "jcr:content/ssl").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_ssl = match param_jcrcontent_ssl {
                    Some(param_jcrcontent_ssl) => {
                        let param_jcrcontent_ssl =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_ssl);
                        match param_jcrcontent_ssl {
                            Ok(param_jcrcontent_ssl) => Some(param_jcrcontent_ssl),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/ssl - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/ssl")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_transport_ntlm_domain = query_params.iter().filter(|e| e.0 == "jcr:content/transportNTLMDomain").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_transport_ntlm_domain = match param_jcrcontent_transport_ntlm_domain {
                    Some(param_jcrcontent_transport_ntlm_domain) => {
                        let param_jcrcontent_transport_ntlm_domain =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_transport_ntlm_domain);
                        match param_jcrcontent_transport_ntlm_domain {
                            Ok(param_jcrcontent_transport_ntlm_domain) => Some(param_jcrcontent_transport_ntlm_domain),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/transportNTLMDomain - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/transportNTLMDomain")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_transport_ntlm_host = query_params.iter().filter(|e| e.0 == "jcr:content/transportNTLMHost").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_transport_ntlm_host = match param_jcrcontent_transport_ntlm_host {
                    Some(param_jcrcontent_transport_ntlm_host) => {
                        let param_jcrcontent_transport_ntlm_host =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_transport_ntlm_host);
                        match param_jcrcontent_transport_ntlm_host {
                            Ok(param_jcrcontent_transport_ntlm_host) => Some(param_jcrcontent_transport_ntlm_host),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/transportNTLMHost - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/transportNTLMHost")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_transport_password = query_params.iter().filter(|e| e.0 == "jcr:content/transportPassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_transport_password = match param_jcrcontent_transport_password {
                    Some(param_jcrcontent_transport_password) => {
                        let param_jcrcontent_transport_password =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_transport_password);
                        match param_jcrcontent_transport_password {
                            Ok(param_jcrcontent_transport_password) => Some(param_jcrcontent_transport_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/transportPassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/transportPassword")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_transport_uri = query_params.iter().filter(|e| e.0 == "jcr:content/transportUri").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_transport_uri = match param_jcrcontent_transport_uri {
                    Some(param_jcrcontent_transport_uri) => {
                        let param_jcrcontent_transport_uri =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_transport_uri);
                        match param_jcrcontent_transport_uri {
                            Ok(param_jcrcontent_transport_uri) => Some(param_jcrcontent_transport_uri),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/transportUri - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/transportUri")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_transport_user = query_params.iter().filter(|e| e.0 == "jcr:content/transportUser").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_transport_user = match param_jcrcontent_transport_user {
                    Some(param_jcrcontent_transport_user) => {
                        let param_jcrcontent_transport_user =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_transport_user);
                        match param_jcrcontent_transport_user {
                            Ok(param_jcrcontent_transport_user) => Some(param_jcrcontent_transport_user),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/transportUser - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/transportUser")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_trigger_distribute = query_params.iter().filter(|e| e.0 == "jcr:content/triggerDistribute").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_trigger_distribute = match param_jcrcontent_trigger_distribute {
                    Some(param_jcrcontent_trigger_distribute) => {
                        let param_jcrcontent_trigger_distribute =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_trigger_distribute);
                        match param_jcrcontent_trigger_distribute {
                            Ok(param_jcrcontent_trigger_distribute) => Some(param_jcrcontent_trigger_distribute),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/triggerDistribute - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/triggerDistribute")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_trigger_modified = query_params.iter().filter(|e| e.0 == "jcr:content/triggerModified").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_trigger_modified = match param_jcrcontent_trigger_modified {
                    Some(param_jcrcontent_trigger_modified) => {
                        let param_jcrcontent_trigger_modified =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_trigger_modified);
                        match param_jcrcontent_trigger_modified {
                            Ok(param_jcrcontent_trigger_modified) => Some(param_jcrcontent_trigger_modified),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/triggerModified - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/triggerModified")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_trigger_on_off_time = query_params.iter().filter(|e| e.0 == "jcr:content/triggerOnOffTime").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_trigger_on_off_time = match param_jcrcontent_trigger_on_off_time {
                    Some(param_jcrcontent_trigger_on_off_time) => {
                        let param_jcrcontent_trigger_on_off_time =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_trigger_on_off_time);
                        match param_jcrcontent_trigger_on_off_time {
                            Ok(param_jcrcontent_trigger_on_off_time) => Some(param_jcrcontent_trigger_on_off_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/triggerOnOffTime - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/triggerOnOffTime")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_trigger_receive = query_params.iter().filter(|e| e.0 == "jcr:content/triggerReceive").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_trigger_receive = match param_jcrcontent_trigger_receive {
                    Some(param_jcrcontent_trigger_receive) => {
                        let param_jcrcontent_trigger_receive =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_trigger_receive);
                        match param_jcrcontent_trigger_receive {
                            Ok(param_jcrcontent_trigger_receive) => Some(param_jcrcontent_trigger_receive),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/triggerReceive - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/triggerReceive")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_trigger_specific = query_params.iter().filter(|e| e.0 == "jcr:content/triggerSpecific").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_trigger_specific = match param_jcrcontent_trigger_specific {
                    Some(param_jcrcontent_trigger_specific) => {
                        let param_jcrcontent_trigger_specific =
                            <bool as std::str::FromStr>::from_str
                                (&param_jcrcontent_trigger_specific);
                        match param_jcrcontent_trigger_specific {
                            Ok(param_jcrcontent_trigger_specific) => Some(param_jcrcontent_trigger_specific),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/triggerSpecific - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/triggerSpecific")),
                        }
                    },
                    None => None,
                };
                let param_jcrcontent_user_id = query_params.iter().filter(|e| e.0 == "jcr:content/userId").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrcontent_user_id = match param_jcrcontent_user_id {
                    Some(param_jcrcontent_user_id) => {
                        let param_jcrcontent_user_id =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrcontent_user_id);
                        match param_jcrcontent_user_id {
                            Ok(param_jcrcontent_user_id) => Some(param_jcrcontent_user_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:content/userId - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:content/userId")),
                        }
                    },
                    None => None,
                };
                let param_jcrprimary_type = query_params.iter().filter(|e| e.0 == "jcr:primaryType").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrprimary_type = match param_jcrprimary_type {
                    Some(param_jcrprimary_type) => {
                        let param_jcrprimary_type =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrprimary_type);
                        match param_jcrprimary_type {
                            Ok(param_jcrprimary_type) => Some(param_jcrprimary_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:primaryType - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:primaryType")),
                        }
                    },
                    None => None,
                };
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())
                    .nth(0);
                let param_operation = match param_operation {
                    Some(param_operation) => {
                        let param_operation =
                            <String as std::str::FromStr>::from_str
                                (&param_operation);
                        match param_operation {
                            Ok(param_operation) => Some(param_operation),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter :operation - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter :operation")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_agent(
                                            param_runmode,
                                            param_name,
                                            param_jcrcontent_cqdistribute,
                                            param_jcrcontent_cqdistribute_type_hint,
                                            param_jcrcontent_cqname,
                                            param_jcrcontent_cqtemplate,
                                            param_jcrcontent_enabled,
                                            param_jcrcontent_jcrdescription,
                                            param_jcrcontent_jcrlast_modified,
                                            param_jcrcontent_jcrlast_modified_by,
                                            param_jcrcontent_jcrmixin_types,
                                            param_jcrcontent_jcrtitle,
                                            param_jcrcontent_log_level,
                                            param_jcrcontent_no_status_update,
                                            param_jcrcontent_no_versioning,
                                            param_jcrcontent_protocol_connect_timeout,
                                            param_jcrcontent_protocol_http_connection_closed,
                                            param_jcrcontent_protocol_http_expired,
                                            param_jcrcontent_protocol_http_headers.as_ref(),
                                            param_jcrcontent_protocol_http_headers_type_hint,
                                            param_jcrcontent_protocol_http_method,
                                            param_jcrcontent_protocol_https_relaxed,
                                            param_jcrcontent_protocol_interface,
                                            param_jcrcontent_protocol_socket_timeout,
                                            param_jcrcontent_protocol_version,
                                            param_jcrcontent_proxy_ntlm_domain,
                                            param_jcrcontent_proxy_ntlm_host,
                                            param_jcrcontent_proxy_host,
                                            param_jcrcontent_proxy_password,
                                            param_jcrcontent_proxy_port,
                                            param_jcrcontent_proxy_user,
                                            param_jcrcontent_queue_batch_max_size,
                                            param_jcrcontent_queue_batch_mode,
                                            param_jcrcontent_queue_batch_wait_time,
                                            param_jcrcontent_retry_delay,
                                            param_jcrcontent_reverse_replication,
                                            param_jcrcontent_serialization_type,
                                            param_jcrcontent_slingresource_type,
                                            param_jcrcontent_ssl,
                                            param_jcrcontent_transport_ntlm_domain,
                                            param_jcrcontent_transport_ntlm_host,
                                            param_jcrcontent_transport_password,
                                            param_jcrcontent_transport_uri,
                                            param_jcrcontent_transport_user,
                                            param_jcrcontent_trigger_distribute,
                                            param_jcrcontent_trigger_modified,
                                            param_jcrcontent_trigger_on_off_time,
                                            param_jcrcontent_trigger_receive,
                                            param_jcrcontent_trigger_specific,
                                            param_jcrcontent_user_id,
                                            param_jcrprimary_type,
                                            param_operation,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostAgentResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostAuthorizableKeystore - POST /{intermediatePath}/{authorizableId}.ks.html
            &hyper::Method::POST if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML in set but failed match against \"{}\"", path, paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML.as_str())
                    );

                let param_intermediate_path = match percent_encoding::percent_decode(path_params["intermediatePath"].as_bytes()).decode_utf8() {
                    Ok(param_intermediate_path) => match param_intermediate_path.parse::<String>() {
                        Ok(param_intermediate_path) => param_intermediate_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter intermediatePath: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["intermediatePath"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_authorizable_id = match percent_encoding::percent_decode(path_params["authorizableId"].as_bytes()).decode_utf8() {
                    Ok(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter authorizableId: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["authorizableId"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())
                    .nth(0);
                let param_operation = match param_operation {
                    Some(param_operation) => {
                        let param_operation =
                            <String as std::str::FromStr>::from_str
                                (&param_operation);
                        match param_operation {
                            Ok(param_operation) => Some(param_operation),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter :operation - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter :operation")),
                        }
                    },
                    None => None,
                };
                let param_current_password = query_params.iter().filter(|e| e.0 == "currentPassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_current_password = match param_current_password {
                    Some(param_current_password) => {
                        let param_current_password =
                            <String as std::str::FromStr>::from_str
                                (&param_current_password);
                        match param_current_password {
                            Ok(param_current_password) => Some(param_current_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter currentPassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter currentPassword")),
                        }
                    },
                    None => None,
                };
                let param_new_password = query_params.iter().filter(|e| e.0 == "newPassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_new_password = match param_new_password {
                    Some(param_new_password) => {
                        let param_new_password =
                            <String as std::str::FromStr>::from_str
                                (&param_new_password);
                        match param_new_password {
                            Ok(param_new_password) => Some(param_new_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter newPassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter newPassword")),
                        }
                    },
                    None => None,
                };
                let param_re_password = query_params.iter().filter(|e| e.0 == "rePassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_re_password = match param_re_password {
                    Some(param_re_password) => {
                        let param_re_password =
                            <String as std::str::FromStr>::from_str
                                (&param_re_password);
                        match param_re_password {
                            Ok(param_re_password) => Some(param_re_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter rePassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter rePassword")),
                        }
                    },
                    None => None,
                };
                let param_key_password = query_params.iter().filter(|e| e.0 == "keyPassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_key_password = match param_key_password {
                    Some(param_key_password) => {
                        let param_key_password =
                            <String as std::str::FromStr>::from_str
                                (&param_key_password);
                        match param_key_password {
                            Ok(param_key_password) => Some(param_key_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keyPassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keyPassword")),
                        }
                    },
                    None => None,
                };
                let param_key_store_pass = query_params.iter().filter(|e| e.0 == "keyStorePass").map(|e| e.1.to_owned())
                    .nth(0);
                let param_key_store_pass = match param_key_store_pass {
                    Some(param_key_store_pass) => {
                        let param_key_store_pass =
                            <String as std::str::FromStr>::from_str
                                (&param_key_store_pass);
                        match param_key_store_pass {
                            Ok(param_key_store_pass) => Some(param_key_store_pass),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keyStorePass - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keyStorePass")),
                        }
                    },
                    None => None,
                };
                let param_alias = query_params.iter().filter(|e| e.0 == "alias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_alias = match param_alias {
                    Some(param_alias) => {
                        let param_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_alias);
                        match param_alias {
                            Ok(param_alias) => Some(param_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter alias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter alias")),
                        }
                    },
                    None => None,
                };
                let param_new_alias = query_params.iter().filter(|e| e.0 == "newAlias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_new_alias = match param_new_alias {
                    Some(param_new_alias) => {
                        let param_new_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_new_alias);
                        match param_new_alias {
                            Ok(param_new_alias) => Some(param_new_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter newAlias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter newAlias")),
                        }
                    },
                    None => None,
                };
                let param_remove_alias = query_params.iter().filter(|e| e.0 == "removeAlias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_remove_alias = match param_remove_alias {
                    Some(param_remove_alias) => {
                        let param_remove_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_remove_alias);
                        match param_remove_alias {
                            Ok(param_remove_alias) => Some(param_remove_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter removeAlias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter removeAlias")),
                        }
                    },
                    None => None,
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_cert_chain = entries.fields.remove("cert_chain");
                                let param_cert_chain = match field_cert_chain {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for cert_chain");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let cert_chain_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("cert_chain data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter cert_chain"))
                                            }
                                        };
                                        cert_chain_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_pk = entries.fields.remove("pk");
                                let param_pk = match field_pk {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for pk");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let pk_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("pk data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter pk"))
                                            }
                                        };
                                        pk_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_key_store = entries.fields.remove("key_store");
                                let param_key_store = match field_key_store {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for key_store");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let key_store_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("key_store data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter key_store"))
                                            }
                                        };
                                        key_store_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.post_authorizable_keystore(
                                            param_intermediate_path,
                                            param_authorizable_id,
                                            param_operation,
                                            param_current_password,
                                            param_new_password,
                                            param_re_password,
                                            param_key_password,
                                            param_key_store_pass,
                                            param_alias,
                                            param_new_alias,
                                            param_remove_alias,
                                            param_cert_chain,
                                            param_pk,
                                            param_key_store,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_AUTHORIZABLE_KEYSTORE_RETRIEVED_AUTHORIZABLE_KEYSTORE_INFO"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PostAuthorizableKeystoreResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_AUTHORIZABLE_KEYSTORE_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // PostAuthorizables - POST /libs/granite/security/post/authorizables
            &hyper::Method::POST if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_AUTHORIZABLES) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_authorizable_id = query_params.iter().filter(|e| e.0 == "authorizableId").map(|e| e.1.to_owned())
                    .nth(0);
                let param_authorizable_id = match param_authorizable_id {
                    Some(param_authorizable_id) => {
                        let param_authorizable_id =
                            <String as std::str::FromStr>::from_str
                                (&param_authorizable_id);
                        match param_authorizable_id {
                            Ok(param_authorizable_id) => Some(param_authorizable_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter authorizableId - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter authorizableId")),
                        }
                    },
                    None => None,
                };
                let param_authorizable_id = match param_authorizable_id {
                    Some(param_authorizable_id) => param_authorizable_id,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter authorizableId"))
                        .expect("Unable to create Bad Request response for missing query parameter authorizableId")),
                };
                let param_intermediate_path = query_params.iter().filter(|e| e.0 == "intermediatePath").map(|e| e.1.to_owned())
                    .nth(0);
                let param_intermediate_path = match param_intermediate_path {
                    Some(param_intermediate_path) => {
                        let param_intermediate_path =
                            <String as std::str::FromStr>::from_str
                                (&param_intermediate_path);
                        match param_intermediate_path {
                            Ok(param_intermediate_path) => Some(param_intermediate_path),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter intermediatePath - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter intermediatePath")),
                        }
                    },
                    None => None,
                };
                let param_intermediate_path = match param_intermediate_path {
                    Some(param_intermediate_path) => param_intermediate_path,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter intermediatePath"))
                        .expect("Unable to create Bad Request response for missing query parameter intermediatePath")),
                };
                let param_create_user = query_params.iter().filter(|e| e.0 == "createUser").map(|e| e.1.to_owned())
                    .nth(0);
                let param_create_user = match param_create_user {
                    Some(param_create_user) => {
                        let param_create_user =
                            <String as std::str::FromStr>::from_str
                                (&param_create_user);
                        match param_create_user {
                            Ok(param_create_user) => Some(param_create_user),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter createUser - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter createUser")),
                        }
                    },
                    None => None,
                };
                let param_create_group = query_params.iter().filter(|e| e.0 == "createGroup").map(|e| e.1.to_owned())
                    .nth(0);
                let param_create_group = match param_create_group {
                    Some(param_create_group) => {
                        let param_create_group =
                            <String as std::str::FromStr>::from_str
                                (&param_create_group);
                        match param_create_group {
                            Ok(param_create_group) => Some(param_create_group),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter createGroup - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter createGroup")),
                        }
                    },
                    None => None,
                };
                let param_reppassword = query_params.iter().filter(|e| e.0 == "rep:password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_reppassword = match param_reppassword {
                    Some(param_reppassword) => {
                        let param_reppassword =
                            <String as std::str::FromStr>::from_str
                                (&param_reppassword);
                        match param_reppassword {
                            Ok(param_reppassword) => Some(param_reppassword),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter rep:password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter rep:password")),
                        }
                    },
                    None => None,
                };
                let param_profile_given_name = query_params.iter().filter(|e| e.0 == "profile/givenName").map(|e| e.1.to_owned())
                    .nth(0);
                let param_profile_given_name = match param_profile_given_name {
                    Some(param_profile_given_name) => {
                        let param_profile_given_name =
                            <String as std::str::FromStr>::from_str
                                (&param_profile_given_name);
                        match param_profile_given_name {
                            Ok(param_profile_given_name) => Some(param_profile_given_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter profile/givenName - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter profile/givenName")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_authorizables(
                                            param_authorizable_id,
                                            param_intermediate_path,
                                            param_create_user,
                                            param_create_group,
                                            param_reppassword,
                                            param_profile_given_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostAuthorizablesResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/html")
                                                            .expect("Unable to create Content-Type header for POST_AUTHORIZABLES_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigAdobeGraniteSamlAuthenticationHandler - POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER_CONFIG) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_key_store_password = query_params.iter().filter(|e| e.0 == "keyStorePassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_key_store_password = match param_key_store_password {
                    Some(param_key_store_password) => {
                        let param_key_store_password =
                            <String as std::str::FromStr>::from_str
                                (&param_key_store_password);
                        match param_key_store_password {
                            Ok(param_key_store_password) => Some(param_key_store_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keyStorePassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keyStorePassword")),
                        }
                    },
                    None => None,
                };
                let param_key_store_password_type_hint = query_params.iter().filter(|e| e.0 == "keyStorePassword@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_key_store_password_type_hint = match param_key_store_password_type_hint {
                    Some(param_key_store_password_type_hint) => {
                        let param_key_store_password_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_key_store_password_type_hint);
                        match param_key_store_password_type_hint {
                            Ok(param_key_store_password_type_hint) => Some(param_key_store_password_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keyStorePassword@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keyStorePassword@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_service_ranking = query_params.iter().filter(|e| e.0 == "service.ranking").map(|e| e.1.to_owned())
                    .nth(0);
                let param_service_ranking = match param_service_ranking {
                    Some(param_service_ranking) => {
                        let param_service_ranking =
                            <i32 as std::str::FromStr>::from_str
                                (&param_service_ranking);
                        match param_service_ranking {
                            Ok(param_service_ranking) => Some(param_service_ranking),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter service.ranking - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter service.ranking")),
                        }
                    },
                    None => None,
                };
                let param_service_ranking_type_hint = query_params.iter().filter(|e| e.0 == "service.ranking@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_service_ranking_type_hint = match param_service_ranking_type_hint {
                    Some(param_service_ranking_type_hint) => {
                        let param_service_ranking_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_service_ranking_type_hint);
                        match param_service_ranking_type_hint {
                            Ok(param_service_ranking_type_hint) => Some(param_service_ranking_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter service.ranking@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter service.ranking@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_idp_http_redirect = query_params.iter().filter(|e| e.0 == "idpHttpRedirect").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_http_redirect = match param_idp_http_redirect {
                    Some(param_idp_http_redirect) => {
                        let param_idp_http_redirect =
                            <bool as std::str::FromStr>::from_str
                                (&param_idp_http_redirect);
                        match param_idp_http_redirect {
                            Ok(param_idp_http_redirect) => Some(param_idp_http_redirect),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpHttpRedirect - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpHttpRedirect")),
                        }
                    },
                    None => None,
                };
                let param_idp_http_redirect_type_hint = query_params.iter().filter(|e| e.0 == "idpHttpRedirect@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_http_redirect_type_hint = match param_idp_http_redirect_type_hint {
                    Some(param_idp_http_redirect_type_hint) => {
                        let param_idp_http_redirect_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_idp_http_redirect_type_hint);
                        match param_idp_http_redirect_type_hint {
                            Ok(param_idp_http_redirect_type_hint) => Some(param_idp_http_redirect_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpHttpRedirect@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpHttpRedirect@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_create_user = query_params.iter().filter(|e| e.0 == "createUser").map(|e| e.1.to_owned())
                    .nth(0);
                let param_create_user = match param_create_user {
                    Some(param_create_user) => {
                        let param_create_user =
                            <bool as std::str::FromStr>::from_str
                                (&param_create_user);
                        match param_create_user {
                            Ok(param_create_user) => Some(param_create_user),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter createUser - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter createUser")),
                        }
                    },
                    None => None,
                };
                let param_create_user_type_hint = query_params.iter().filter(|e| e.0 == "createUser@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_create_user_type_hint = match param_create_user_type_hint {
                    Some(param_create_user_type_hint) => {
                        let param_create_user_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_create_user_type_hint);
                        match param_create_user_type_hint {
                            Ok(param_create_user_type_hint) => Some(param_create_user_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter createUser@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter createUser@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_default_redirect_url = query_params.iter().filter(|e| e.0 == "defaultRedirectUrl").map(|e| e.1.to_owned())
                    .nth(0);
                let param_default_redirect_url = match param_default_redirect_url {
                    Some(param_default_redirect_url) => {
                        let param_default_redirect_url =
                            <String as std::str::FromStr>::from_str
                                (&param_default_redirect_url);
                        match param_default_redirect_url {
                            Ok(param_default_redirect_url) => Some(param_default_redirect_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter defaultRedirectUrl - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter defaultRedirectUrl")),
                        }
                    },
                    None => None,
                };
                let param_default_redirect_url_type_hint = query_params.iter().filter(|e| e.0 == "defaultRedirectUrl@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_default_redirect_url_type_hint = match param_default_redirect_url_type_hint {
                    Some(param_default_redirect_url_type_hint) => {
                        let param_default_redirect_url_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_default_redirect_url_type_hint);
                        match param_default_redirect_url_type_hint {
                            Ok(param_default_redirect_url_type_hint) => Some(param_default_redirect_url_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter defaultRedirectUrl@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter defaultRedirectUrl@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_user_id_attribute = query_params.iter().filter(|e| e.0 == "userIDAttribute").map(|e| e.1.to_owned())
                    .nth(0);
                let param_user_id_attribute = match param_user_id_attribute {
                    Some(param_user_id_attribute) => {
                        let param_user_id_attribute =
                            <String as std::str::FromStr>::from_str
                                (&param_user_id_attribute);
                        match param_user_id_attribute {
                            Ok(param_user_id_attribute) => Some(param_user_id_attribute),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter userIDAttribute - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter userIDAttribute")),
                        }
                    },
                    None => None,
                };
                let param_user_id_attribute_type_hint = query_params.iter().filter(|e| e.0 == "userIDAttribute@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_user_id_attribute_type_hint = match param_user_id_attribute_type_hint {
                    Some(param_user_id_attribute_type_hint) => {
                        let param_user_id_attribute_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_user_id_attribute_type_hint);
                        match param_user_id_attribute_type_hint {
                            Ok(param_user_id_attribute_type_hint) => Some(param_user_id_attribute_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter userIDAttribute@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter userIDAttribute@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_default_groups = query_params.iter().filter(|e| e.0 == "defaultGroups").map(|e| e.1.to_owned())
                    .filter_map(|param_default_groups| param_default_groups.parse().ok())
                    .collect::<Vec<_>>();
                let param_default_groups = if !param_default_groups.is_empty() {
                    Some(param_default_groups)
                } else {
                    None
                };
                let param_default_groups_type_hint = query_params.iter().filter(|e| e.0 == "defaultGroups@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_default_groups_type_hint = match param_default_groups_type_hint {
                    Some(param_default_groups_type_hint) => {
                        let param_default_groups_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_default_groups_type_hint);
                        match param_default_groups_type_hint {
                            Ok(param_default_groups_type_hint) => Some(param_default_groups_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter defaultGroups@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter defaultGroups@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_idp_cert_alias = query_params.iter().filter(|e| e.0 == "idpCertAlias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_cert_alias = match param_idp_cert_alias {
                    Some(param_idp_cert_alias) => {
                        let param_idp_cert_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_idp_cert_alias);
                        match param_idp_cert_alias {
                            Ok(param_idp_cert_alias) => Some(param_idp_cert_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpCertAlias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpCertAlias")),
                        }
                    },
                    None => None,
                };
                let param_idp_cert_alias_type_hint = query_params.iter().filter(|e| e.0 == "idpCertAlias@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_cert_alias_type_hint = match param_idp_cert_alias_type_hint {
                    Some(param_idp_cert_alias_type_hint) => {
                        let param_idp_cert_alias_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_idp_cert_alias_type_hint);
                        match param_idp_cert_alias_type_hint {
                            Ok(param_idp_cert_alias_type_hint) => Some(param_idp_cert_alias_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpCertAlias@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpCertAlias@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_add_group_memberships = query_params.iter().filter(|e| e.0 == "addGroupMemberships").map(|e| e.1.to_owned())
                    .nth(0);
                let param_add_group_memberships = match param_add_group_memberships {
                    Some(param_add_group_memberships) => {
                        let param_add_group_memberships =
                            <bool as std::str::FromStr>::from_str
                                (&param_add_group_memberships);
                        match param_add_group_memberships {
                            Ok(param_add_group_memberships) => Some(param_add_group_memberships),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter addGroupMemberships - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter addGroupMemberships")),
                        }
                    },
                    None => None,
                };
                let param_add_group_memberships_type_hint = query_params.iter().filter(|e| e.0 == "addGroupMemberships@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_add_group_memberships_type_hint = match param_add_group_memberships_type_hint {
                    Some(param_add_group_memberships_type_hint) => {
                        let param_add_group_memberships_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_add_group_memberships_type_hint);
                        match param_add_group_memberships_type_hint {
                            Ok(param_add_group_memberships_type_hint) => Some(param_add_group_memberships_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter addGroupMemberships@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter addGroupMemberships@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .filter_map(|param_path| param_path.parse().ok())
                    .collect::<Vec<_>>();
                let param_path = if !param_path.is_empty() {
                    Some(param_path)
                } else {
                    None
                };
                let param_path_type_hint = query_params.iter().filter(|e| e.0 == "path@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_path_type_hint = match param_path_type_hint {
                    Some(param_path_type_hint) => {
                        let param_path_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_path_type_hint);
                        match param_path_type_hint {
                            Ok(param_path_type_hint) => Some(param_path_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter path@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter path@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_synchronize_attributes = query_params.iter().filter(|e| e.0 == "synchronizeAttributes").map(|e| e.1.to_owned())
                    .filter_map(|param_synchronize_attributes| param_synchronize_attributes.parse().ok())
                    .collect::<Vec<_>>();
                let param_synchronize_attributes = if !param_synchronize_attributes.is_empty() {
                    Some(param_synchronize_attributes)
                } else {
                    None
                };
                let param_synchronize_attributes_type_hint = query_params.iter().filter(|e| e.0 == "synchronizeAttributes@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_synchronize_attributes_type_hint = match param_synchronize_attributes_type_hint {
                    Some(param_synchronize_attributes_type_hint) => {
                        let param_synchronize_attributes_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_synchronize_attributes_type_hint);
                        match param_synchronize_attributes_type_hint {
                            Ok(param_synchronize_attributes_type_hint) => Some(param_synchronize_attributes_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter synchronizeAttributes@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter synchronizeAttributes@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_clock_tolerance = query_params.iter().filter(|e| e.0 == "clockTolerance").map(|e| e.1.to_owned())
                    .nth(0);
                let param_clock_tolerance = match param_clock_tolerance {
                    Some(param_clock_tolerance) => {
                        let param_clock_tolerance =
                            <i32 as std::str::FromStr>::from_str
                                (&param_clock_tolerance);
                        match param_clock_tolerance {
                            Ok(param_clock_tolerance) => Some(param_clock_tolerance),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter clockTolerance - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter clockTolerance")),
                        }
                    },
                    None => None,
                };
                let param_clock_tolerance_type_hint = query_params.iter().filter(|e| e.0 == "clockTolerance@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_clock_tolerance_type_hint = match param_clock_tolerance_type_hint {
                    Some(param_clock_tolerance_type_hint) => {
                        let param_clock_tolerance_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_clock_tolerance_type_hint);
                        match param_clock_tolerance_type_hint {
                            Ok(param_clock_tolerance_type_hint) => Some(param_clock_tolerance_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter clockTolerance@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter clockTolerance@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_group_membership_attribute = query_params.iter().filter(|e| e.0 == "groupMembershipAttribute").map(|e| e.1.to_owned())
                    .nth(0);
                let param_group_membership_attribute = match param_group_membership_attribute {
                    Some(param_group_membership_attribute) => {
                        let param_group_membership_attribute =
                            <String as std::str::FromStr>::from_str
                                (&param_group_membership_attribute);
                        match param_group_membership_attribute {
                            Ok(param_group_membership_attribute) => Some(param_group_membership_attribute),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter groupMembershipAttribute - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter groupMembershipAttribute")),
                        }
                    },
                    None => None,
                };
                let param_group_membership_attribute_type_hint = query_params.iter().filter(|e| e.0 == "groupMembershipAttribute@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_group_membership_attribute_type_hint = match param_group_membership_attribute_type_hint {
                    Some(param_group_membership_attribute_type_hint) => {
                        let param_group_membership_attribute_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_group_membership_attribute_type_hint);
                        match param_group_membership_attribute_type_hint {
                            Ok(param_group_membership_attribute_type_hint) => Some(param_group_membership_attribute_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter groupMembershipAttribute@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter groupMembershipAttribute@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_idp_url = query_params.iter().filter(|e| e.0 == "idpUrl").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_url = match param_idp_url {
                    Some(param_idp_url) => {
                        let param_idp_url =
                            <String as std::str::FromStr>::from_str
                                (&param_idp_url);
                        match param_idp_url {
                            Ok(param_idp_url) => Some(param_idp_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpUrl - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpUrl")),
                        }
                    },
                    None => None,
                };
                let param_idp_url_type_hint = query_params.iter().filter(|e| e.0 == "idpUrl@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_idp_url_type_hint = match param_idp_url_type_hint {
                    Some(param_idp_url_type_hint) => {
                        let param_idp_url_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_idp_url_type_hint);
                        match param_idp_url_type_hint {
                            Ok(param_idp_url_type_hint) => Some(param_idp_url_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter idpUrl@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter idpUrl@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_logout_url = query_params.iter().filter(|e| e.0 == "logoutUrl").map(|e| e.1.to_owned())
                    .nth(0);
                let param_logout_url = match param_logout_url {
                    Some(param_logout_url) => {
                        let param_logout_url =
                            <String as std::str::FromStr>::from_str
                                (&param_logout_url);
                        match param_logout_url {
                            Ok(param_logout_url) => Some(param_logout_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter logoutUrl - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter logoutUrl")),
                        }
                    },
                    None => None,
                };
                let param_logout_url_type_hint = query_params.iter().filter(|e| e.0 == "logoutUrl@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_logout_url_type_hint = match param_logout_url_type_hint {
                    Some(param_logout_url_type_hint) => {
                        let param_logout_url_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_logout_url_type_hint);
                        match param_logout_url_type_hint {
                            Ok(param_logout_url_type_hint) => Some(param_logout_url_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter logoutUrl@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter logoutUrl@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_service_provider_entity_id = query_params.iter().filter(|e| e.0 == "serviceProviderEntityId").map(|e| e.1.to_owned())
                    .nth(0);
                let param_service_provider_entity_id = match param_service_provider_entity_id {
                    Some(param_service_provider_entity_id) => {
                        let param_service_provider_entity_id =
                            <String as std::str::FromStr>::from_str
                                (&param_service_provider_entity_id);
                        match param_service_provider_entity_id {
                            Ok(param_service_provider_entity_id) => Some(param_service_provider_entity_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter serviceProviderEntityId - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter serviceProviderEntityId")),
                        }
                    },
                    None => None,
                };
                let param_service_provider_entity_id_type_hint = query_params.iter().filter(|e| e.0 == "serviceProviderEntityId@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_service_provider_entity_id_type_hint = match param_service_provider_entity_id_type_hint {
                    Some(param_service_provider_entity_id_type_hint) => {
                        let param_service_provider_entity_id_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_service_provider_entity_id_type_hint);
                        match param_service_provider_entity_id_type_hint {
                            Ok(param_service_provider_entity_id_type_hint) => Some(param_service_provider_entity_id_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter serviceProviderEntityId@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter serviceProviderEntityId@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_assertion_consumer_service_url = query_params.iter().filter(|e| e.0 == "assertionConsumerServiceURL").map(|e| e.1.to_owned())
                    .nth(0);
                let param_assertion_consumer_service_url = match param_assertion_consumer_service_url {
                    Some(param_assertion_consumer_service_url) => {
                        let param_assertion_consumer_service_url =
                            <String as std::str::FromStr>::from_str
                                (&param_assertion_consumer_service_url);
                        match param_assertion_consumer_service_url {
                            Ok(param_assertion_consumer_service_url) => Some(param_assertion_consumer_service_url),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter assertionConsumerServiceURL - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter assertionConsumerServiceURL")),
                        }
                    },
                    None => None,
                };
                let param_assertion_consumer_service_url_type_hint = query_params.iter().filter(|e| e.0 == "assertionConsumerServiceURL@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_assertion_consumer_service_url_type_hint = match param_assertion_consumer_service_url_type_hint {
                    Some(param_assertion_consumer_service_url_type_hint) => {
                        let param_assertion_consumer_service_url_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_assertion_consumer_service_url_type_hint);
                        match param_assertion_consumer_service_url_type_hint {
                            Ok(param_assertion_consumer_service_url_type_hint) => Some(param_assertion_consumer_service_url_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter assertionConsumerServiceURL@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter assertionConsumerServiceURL@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_handle_logout = query_params.iter().filter(|e| e.0 == "handleLogout").map(|e| e.1.to_owned())
                    .nth(0);
                let param_handle_logout = match param_handle_logout {
                    Some(param_handle_logout) => {
                        let param_handle_logout =
                            <bool as std::str::FromStr>::from_str
                                (&param_handle_logout);
                        match param_handle_logout {
                            Ok(param_handle_logout) => Some(param_handle_logout),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter handleLogout - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter handleLogout")),
                        }
                    },
                    None => None,
                };
                let param_handle_logout_type_hint = query_params.iter().filter(|e| e.0 == "handleLogout@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_handle_logout_type_hint = match param_handle_logout_type_hint {
                    Some(param_handle_logout_type_hint) => {
                        let param_handle_logout_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_handle_logout_type_hint);
                        match param_handle_logout_type_hint {
                            Ok(param_handle_logout_type_hint) => Some(param_handle_logout_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter handleLogout@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter handleLogout@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_sp_private_key_alias = query_params.iter().filter(|e| e.0 == "spPrivateKeyAlias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_sp_private_key_alias = match param_sp_private_key_alias {
                    Some(param_sp_private_key_alias) => {
                        let param_sp_private_key_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_sp_private_key_alias);
                        match param_sp_private_key_alias {
                            Ok(param_sp_private_key_alias) => Some(param_sp_private_key_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter spPrivateKeyAlias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter spPrivateKeyAlias")),
                        }
                    },
                    None => None,
                };
                let param_sp_private_key_alias_type_hint = query_params.iter().filter(|e| e.0 == "spPrivateKeyAlias@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_sp_private_key_alias_type_hint = match param_sp_private_key_alias_type_hint {
                    Some(param_sp_private_key_alias_type_hint) => {
                        let param_sp_private_key_alias_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_sp_private_key_alias_type_hint);
                        match param_sp_private_key_alias_type_hint {
                            Ok(param_sp_private_key_alias_type_hint) => Some(param_sp_private_key_alias_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter spPrivateKeyAlias@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter spPrivateKeyAlias@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_use_encryption = query_params.iter().filter(|e| e.0 == "useEncryption").map(|e| e.1.to_owned())
                    .nth(0);
                let param_use_encryption = match param_use_encryption {
                    Some(param_use_encryption) => {
                        let param_use_encryption =
                            <bool as std::str::FromStr>::from_str
                                (&param_use_encryption);
                        match param_use_encryption {
                            Ok(param_use_encryption) => Some(param_use_encryption),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter useEncryption - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter useEncryption")),
                        }
                    },
                    None => None,
                };
                let param_use_encryption_type_hint = query_params.iter().filter(|e| e.0 == "useEncryption@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_use_encryption_type_hint = match param_use_encryption_type_hint {
                    Some(param_use_encryption_type_hint) => {
                        let param_use_encryption_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_use_encryption_type_hint);
                        match param_use_encryption_type_hint {
                            Ok(param_use_encryption_type_hint) => Some(param_use_encryption_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter useEncryption@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter useEncryption@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_name_id_format = query_params.iter().filter(|e| e.0 == "nameIdFormat").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name_id_format = match param_name_id_format {
                    Some(param_name_id_format) => {
                        let param_name_id_format =
                            <String as std::str::FromStr>::from_str
                                (&param_name_id_format);
                        match param_name_id_format {
                            Ok(param_name_id_format) => Some(param_name_id_format),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter nameIdFormat - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter nameIdFormat")),
                        }
                    },
                    None => None,
                };
                let param_name_id_format_type_hint = query_params.iter().filter(|e| e.0 == "nameIdFormat@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name_id_format_type_hint = match param_name_id_format_type_hint {
                    Some(param_name_id_format_type_hint) => {
                        let param_name_id_format_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_name_id_format_type_hint);
                        match param_name_id_format_type_hint {
                            Ok(param_name_id_format_type_hint) => Some(param_name_id_format_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter nameIdFormat@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter nameIdFormat@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_digest_method = query_params.iter().filter(|e| e.0 == "digestMethod").map(|e| e.1.to_owned())
                    .nth(0);
                let param_digest_method = match param_digest_method {
                    Some(param_digest_method) => {
                        let param_digest_method =
                            <String as std::str::FromStr>::from_str
                                (&param_digest_method);
                        match param_digest_method {
                            Ok(param_digest_method) => Some(param_digest_method),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter digestMethod - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter digestMethod")),
                        }
                    },
                    None => None,
                };
                let param_digest_method_type_hint = query_params.iter().filter(|e| e.0 == "digestMethod@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_digest_method_type_hint = match param_digest_method_type_hint {
                    Some(param_digest_method_type_hint) => {
                        let param_digest_method_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_digest_method_type_hint);
                        match param_digest_method_type_hint {
                            Ok(param_digest_method_type_hint) => Some(param_digest_method_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter digestMethod@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter digestMethod@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_signature_method = query_params.iter().filter(|e| e.0 == "signatureMethod").map(|e| e.1.to_owned())
                    .nth(0);
                let param_signature_method = match param_signature_method {
                    Some(param_signature_method) => {
                        let param_signature_method =
                            <String as std::str::FromStr>::from_str
                                (&param_signature_method);
                        match param_signature_method {
                            Ok(param_signature_method) => Some(param_signature_method),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter signatureMethod - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter signatureMethod")),
                        }
                    },
                    None => None,
                };
                let param_signature_method_type_hint = query_params.iter().filter(|e| e.0 == "signatureMethod@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_signature_method_type_hint = match param_signature_method_type_hint {
                    Some(param_signature_method_type_hint) => {
                        let param_signature_method_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_signature_method_type_hint);
                        match param_signature_method_type_hint {
                            Ok(param_signature_method_type_hint) => Some(param_signature_method_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter signatureMethod@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter signatureMethod@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_user_intermediate_path = query_params.iter().filter(|e| e.0 == "userIntermediatePath").map(|e| e.1.to_owned())
                    .nth(0);
                let param_user_intermediate_path = match param_user_intermediate_path {
                    Some(param_user_intermediate_path) => {
                        let param_user_intermediate_path =
                            <String as std::str::FromStr>::from_str
                                (&param_user_intermediate_path);
                        match param_user_intermediate_path {
                            Ok(param_user_intermediate_path) => Some(param_user_intermediate_path),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter userIntermediatePath - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter userIntermediatePath")),
                        }
                    },
                    None => None,
                };
                let param_user_intermediate_path_type_hint = query_params.iter().filter(|e| e.0 == "userIntermediatePath@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_user_intermediate_path_type_hint = match param_user_intermediate_path_type_hint {
                    Some(param_user_intermediate_path_type_hint) => {
                        let param_user_intermediate_path_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_user_intermediate_path_type_hint);
                        match param_user_intermediate_path_type_hint {
                            Ok(param_user_intermediate_path_type_hint) => Some(param_user_intermediate_path_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter userIntermediatePath@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter userIntermediatePath@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_adobe_granite_saml_authentication_handler(
                                            param_key_store_password,
                                            param_key_store_password_type_hint,
                                            param_service_ranking,
                                            param_service_ranking_type_hint,
                                            param_idp_http_redirect,
                                            param_idp_http_redirect_type_hint,
                                            param_create_user,
                                            param_create_user_type_hint,
                                            param_default_redirect_url,
                                            param_default_redirect_url_type_hint,
                                            param_user_id_attribute,
                                            param_user_id_attribute_type_hint,
                                            param_default_groups.as_ref(),
                                            param_default_groups_type_hint,
                                            param_idp_cert_alias,
                                            param_idp_cert_alias_type_hint,
                                            param_add_group_memberships,
                                            param_add_group_memberships_type_hint,
                                            param_path.as_ref(),
                                            param_path_type_hint,
                                            param_synchronize_attributes.as_ref(),
                                            param_synchronize_attributes_type_hint,
                                            param_clock_tolerance,
                                            param_clock_tolerance_type_hint,
                                            param_group_membership_attribute,
                                            param_group_membership_attribute_type_hint,
                                            param_idp_url,
                                            param_idp_url_type_hint,
                                            param_logout_url,
                                            param_logout_url_type_hint,
                                            param_service_provider_entity_id,
                                            param_service_provider_entity_id_type_hint,
                                            param_assertion_consumer_service_url,
                                            param_assertion_consumer_service_url_type_hint,
                                            param_handle_logout,
                                            param_handle_logout_type_hint,
                                            param_sp_private_key_alias,
                                            param_sp_private_key_alias_type_hint,
                                            param_use_encryption,
                                            param_use_encryption_type_hint,
                                            param_name_id_format,
                                            param_name_id_format_type_hint,
                                            param_digest_method,
                                            param_digest_method_type_hint,
                                            param_signature_method,
                                            param_signature_method_type_hint,
                                            param_user_intermediate_path,
                                            param_user_intermediate_path_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigAdobeGraniteSamlAuthenticationHandlerResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigApacheFelixJettyBasedHttpService - POST /apps/system/config/org.apache.felix.http
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_FELIX_HTTP) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_org_apache_felix_https_nio = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.nio").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_nio = match param_org_apache_felix_https_nio {
                    Some(param_org_apache_felix_https_nio) => {
                        let param_org_apache_felix_https_nio =
                            <bool as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_nio);
                        match param_org_apache_felix_https_nio {
                            Ok(param_org_apache_felix_https_nio) => Some(param_org_apache_felix_https_nio),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.nio - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.nio")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_nio_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.nio@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_nio_type_hint = match param_org_apache_felix_https_nio_type_hint {
                    Some(param_org_apache_felix_https_nio_type_hint) => {
                        let param_org_apache_felix_https_nio_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_nio_type_hint);
                        match param_org_apache_felix_https_nio_type_hint {
                            Ok(param_org_apache_felix_https_nio_type_hint) => Some(param_org_apache_felix_https_nio_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.nio@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.nio@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore = match param_org_apache_felix_https_keystore {
                    Some(param_org_apache_felix_https_keystore) => {
                        let param_org_apache_felix_https_keystore =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore);
                        match param_org_apache_felix_https_keystore {
                            Ok(param_org_apache_felix_https_keystore) => Some(param_org_apache_felix_https_keystore),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore_type_hint = match param_org_apache_felix_https_keystore_type_hint {
                    Some(param_org_apache_felix_https_keystore_type_hint) => {
                        let param_org_apache_felix_https_keystore_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore_type_hint);
                        match param_org_apache_felix_https_keystore_type_hint {
                            Ok(param_org_apache_felix_https_keystore_type_hint) => Some(param_org_apache_felix_https_keystore_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore_password = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore_password = match param_org_apache_felix_https_keystore_password {
                    Some(param_org_apache_felix_https_keystore_password) => {
                        let param_org_apache_felix_https_keystore_password =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore_password);
                        match param_org_apache_felix_https_keystore_password {
                            Ok(param_org_apache_felix_https_keystore_password) => Some(param_org_apache_felix_https_keystore_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore.password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore.password")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore_password_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.password@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore_password_type_hint = match param_org_apache_felix_https_keystore_password_type_hint {
                    Some(param_org_apache_felix_https_keystore_password_type_hint) => {
                        let param_org_apache_felix_https_keystore_password_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore_password_type_hint);
                        match param_org_apache_felix_https_keystore_password_type_hint {
                            Ok(param_org_apache_felix_https_keystore_password_type_hint) => Some(param_org_apache_felix_https_keystore_password_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore.password@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore.password@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore_key = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore_key = match param_org_apache_felix_https_keystore_key {
                    Some(param_org_apache_felix_https_keystore_key) => {
                        let param_org_apache_felix_https_keystore_key =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore_key);
                        match param_org_apache_felix_https_keystore_key {
                            Ok(param_org_apache_felix_https_keystore_key) => Some(param_org_apache_felix_https_keystore_key),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore.key - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore.key")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore_key_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore_key_type_hint = match param_org_apache_felix_https_keystore_key_type_hint {
                    Some(param_org_apache_felix_https_keystore_key_type_hint) => {
                        let param_org_apache_felix_https_keystore_key_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore_key_type_hint);
                        match param_org_apache_felix_https_keystore_key_type_hint {
                            Ok(param_org_apache_felix_https_keystore_key_type_hint) => Some(param_org_apache_felix_https_keystore_key_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore.key@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore.key@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore_key_password = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key.password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore_key_password = match param_org_apache_felix_https_keystore_key_password {
                    Some(param_org_apache_felix_https_keystore_key_password) => {
                        let param_org_apache_felix_https_keystore_key_password =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore_key_password);
                        match param_org_apache_felix_https_keystore_key_password {
                            Ok(param_org_apache_felix_https_keystore_key_password) => Some(param_org_apache_felix_https_keystore_key_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore.key.password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore.key.password")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_keystore_key_password_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key.password@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_keystore_key_password_type_hint = match param_org_apache_felix_https_keystore_key_password_type_hint {
                    Some(param_org_apache_felix_https_keystore_key_password_type_hint) => {
                        let param_org_apache_felix_https_keystore_key_password_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_keystore_key_password_type_hint);
                        match param_org_apache_felix_https_keystore_key_password_type_hint {
                            Ok(param_org_apache_felix_https_keystore_key_password_type_hint) => Some(param_org_apache_felix_https_keystore_key_password_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.keystore.key.password@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.keystore.key.password@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_truststore = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_truststore = match param_org_apache_felix_https_truststore {
                    Some(param_org_apache_felix_https_truststore) => {
                        let param_org_apache_felix_https_truststore =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_truststore);
                        match param_org_apache_felix_https_truststore {
                            Ok(param_org_apache_felix_https_truststore) => Some(param_org_apache_felix_https_truststore),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.truststore - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.truststore")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_truststore_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_truststore_type_hint = match param_org_apache_felix_https_truststore_type_hint {
                    Some(param_org_apache_felix_https_truststore_type_hint) => {
                        let param_org_apache_felix_https_truststore_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_truststore_type_hint);
                        match param_org_apache_felix_https_truststore_type_hint {
                            Ok(param_org_apache_felix_https_truststore_type_hint) => Some(param_org_apache_felix_https_truststore_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.truststore@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.truststore@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_truststore_password = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore.password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_truststore_password = match param_org_apache_felix_https_truststore_password {
                    Some(param_org_apache_felix_https_truststore_password) => {
                        let param_org_apache_felix_https_truststore_password =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_truststore_password);
                        match param_org_apache_felix_https_truststore_password {
                            Ok(param_org_apache_felix_https_truststore_password) => Some(param_org_apache_felix_https_truststore_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.truststore.password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.truststore.password")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_truststore_password_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore.password@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_truststore_password_type_hint = match param_org_apache_felix_https_truststore_password_type_hint {
                    Some(param_org_apache_felix_https_truststore_password_type_hint) => {
                        let param_org_apache_felix_https_truststore_password_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_truststore_password_type_hint);
                        match param_org_apache_felix_https_truststore_password_type_hint {
                            Ok(param_org_apache_felix_https_truststore_password_type_hint) => Some(param_org_apache_felix_https_truststore_password_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.truststore.password@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.truststore.password@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_clientcertificate = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.clientcertificate").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_clientcertificate = match param_org_apache_felix_https_clientcertificate {
                    Some(param_org_apache_felix_https_clientcertificate) => {
                        let param_org_apache_felix_https_clientcertificate =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_clientcertificate);
                        match param_org_apache_felix_https_clientcertificate {
                            Ok(param_org_apache_felix_https_clientcertificate) => Some(param_org_apache_felix_https_clientcertificate),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.clientcertificate - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.clientcertificate")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_clientcertificate_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.clientcertificate@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_clientcertificate_type_hint = match param_org_apache_felix_https_clientcertificate_type_hint {
                    Some(param_org_apache_felix_https_clientcertificate_type_hint) => {
                        let param_org_apache_felix_https_clientcertificate_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_clientcertificate_type_hint);
                        match param_org_apache_felix_https_clientcertificate_type_hint {
                            Ok(param_org_apache_felix_https_clientcertificate_type_hint) => Some(param_org_apache_felix_https_clientcertificate_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.clientcertificate@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.clientcertificate@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_enable = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.enable").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_enable = match param_org_apache_felix_https_enable {
                    Some(param_org_apache_felix_https_enable) => {
                        let param_org_apache_felix_https_enable =
                            <bool as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_enable);
                        match param_org_apache_felix_https_enable {
                            Ok(param_org_apache_felix_https_enable) => Some(param_org_apache_felix_https_enable),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.enable - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.enable")),
                        }
                    },
                    None => None,
                };
                let param_org_apache_felix_https_enable_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.enable@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_apache_felix_https_enable_type_hint = match param_org_apache_felix_https_enable_type_hint {
                    Some(param_org_apache_felix_https_enable_type_hint) => {
                        let param_org_apache_felix_https_enable_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_apache_felix_https_enable_type_hint);
                        match param_org_apache_felix_https_enable_type_hint {
                            Ok(param_org_apache_felix_https_enable_type_hint) => Some(param_org_apache_felix_https_enable_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.apache.felix.https.enable@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.apache.felix.https.enable@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_org_osgi_service_http_port_secure = query_params.iter().filter(|e| e.0 == "org.osgi.service.http.port.secure").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_osgi_service_http_port_secure = match param_org_osgi_service_http_port_secure {
                    Some(param_org_osgi_service_http_port_secure) => {
                        let param_org_osgi_service_http_port_secure =
                            <String as std::str::FromStr>::from_str
                                (&param_org_osgi_service_http_port_secure);
                        match param_org_osgi_service_http_port_secure {
                            Ok(param_org_osgi_service_http_port_secure) => Some(param_org_osgi_service_http_port_secure),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.osgi.service.http.port.secure - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.osgi.service.http.port.secure")),
                        }
                    },
                    None => None,
                };
                let param_org_osgi_service_http_port_secure_type_hint = query_params.iter().filter(|e| e.0 == "org.osgi.service.http.port.secure@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_org_osgi_service_http_port_secure_type_hint = match param_org_osgi_service_http_port_secure_type_hint {
                    Some(param_org_osgi_service_http_port_secure_type_hint) => {
                        let param_org_osgi_service_http_port_secure_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_org_osgi_service_http_port_secure_type_hint);
                        match param_org_osgi_service_http_port_secure_type_hint {
                            Ok(param_org_osgi_service_http_port_secure_type_hint) => Some(param_org_osgi_service_http_port_secure_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter org.osgi.service.http.port.secure@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter org.osgi.service.http.port.secure@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_apache_felix_jetty_based_http_service(
                                            param_org_apache_felix_https_nio,
                                            param_org_apache_felix_https_nio_type_hint,
                                            param_org_apache_felix_https_keystore,
                                            param_org_apache_felix_https_keystore_type_hint,
                                            param_org_apache_felix_https_keystore_password,
                                            param_org_apache_felix_https_keystore_password_type_hint,
                                            param_org_apache_felix_https_keystore_key,
                                            param_org_apache_felix_https_keystore_key_type_hint,
                                            param_org_apache_felix_https_keystore_key_password,
                                            param_org_apache_felix_https_keystore_key_password_type_hint,
                                            param_org_apache_felix_https_truststore,
                                            param_org_apache_felix_https_truststore_type_hint,
                                            param_org_apache_felix_https_truststore_password,
                                            param_org_apache_felix_https_truststore_password_type_hint,
                                            param_org_apache_felix_https_clientcertificate,
                                            param_org_apache_felix_https_clientcertificate_type_hint,
                                            param_org_apache_felix_https_enable,
                                            param_org_apache_felix_https_enable_type_hint,
                                            param_org_osgi_service_http_port_secure,
                                            param_org_osgi_service_http_port_secure_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheFelixJettyBasedHttpServiceResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigApacheHttpComponentsProxyConfiguration - POST /apps/system/config/org.apache.http.proxyconfigurator.config
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_HTTP_PROXYCONFIGURATOR_CONFIG) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_proxy_host = query_params.iter().filter(|e| e.0 == "proxy.host").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_host = match param_proxy_host {
                    Some(param_proxy_host) => {
                        let param_proxy_host =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_host);
                        match param_proxy_host {
                            Ok(param_proxy_host) => Some(param_proxy_host),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.host - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.host")),
                        }
                    },
                    None => None,
                };
                let param_proxy_host_type_hint = query_params.iter().filter(|e| e.0 == "proxy.host@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_host_type_hint = match param_proxy_host_type_hint {
                    Some(param_proxy_host_type_hint) => {
                        let param_proxy_host_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_host_type_hint);
                        match param_proxy_host_type_hint {
                            Ok(param_proxy_host_type_hint) => Some(param_proxy_host_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.host@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.host@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_proxy_port = query_params.iter().filter(|e| e.0 == "proxy.port").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_port = match param_proxy_port {
                    Some(param_proxy_port) => {
                        let param_proxy_port =
                            <i32 as std::str::FromStr>::from_str
                                (&param_proxy_port);
                        match param_proxy_port {
                            Ok(param_proxy_port) => Some(param_proxy_port),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.port - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.port")),
                        }
                    },
                    None => None,
                };
                let param_proxy_port_type_hint = query_params.iter().filter(|e| e.0 == "proxy.port@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_port_type_hint = match param_proxy_port_type_hint {
                    Some(param_proxy_port_type_hint) => {
                        let param_proxy_port_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_port_type_hint);
                        match param_proxy_port_type_hint {
                            Ok(param_proxy_port_type_hint) => Some(param_proxy_port_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.port@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.port@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_proxy_exceptions = query_params.iter().filter(|e| e.0 == "proxy.exceptions").map(|e| e.1.to_owned())
                    .filter_map(|param_proxy_exceptions| param_proxy_exceptions.parse().ok())
                    .collect::<Vec<_>>();
                let param_proxy_exceptions = if !param_proxy_exceptions.is_empty() {
                    Some(param_proxy_exceptions)
                } else {
                    None
                };
                let param_proxy_exceptions_type_hint = query_params.iter().filter(|e| e.0 == "proxy.exceptions@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_exceptions_type_hint = match param_proxy_exceptions_type_hint {
                    Some(param_proxy_exceptions_type_hint) => {
                        let param_proxy_exceptions_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_exceptions_type_hint);
                        match param_proxy_exceptions_type_hint {
                            Ok(param_proxy_exceptions_type_hint) => Some(param_proxy_exceptions_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.exceptions@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.exceptions@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_proxy_enabled = query_params.iter().filter(|e| e.0 == "proxy.enabled").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_enabled = match param_proxy_enabled {
                    Some(param_proxy_enabled) => {
                        let param_proxy_enabled =
                            <bool as std::str::FromStr>::from_str
                                (&param_proxy_enabled);
                        match param_proxy_enabled {
                            Ok(param_proxy_enabled) => Some(param_proxy_enabled),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.enabled - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.enabled")),
                        }
                    },
                    None => None,
                };
                let param_proxy_enabled_type_hint = query_params.iter().filter(|e| e.0 == "proxy.enabled@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_enabled_type_hint = match param_proxy_enabled_type_hint {
                    Some(param_proxy_enabled_type_hint) => {
                        let param_proxy_enabled_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_enabled_type_hint);
                        match param_proxy_enabled_type_hint {
                            Ok(param_proxy_enabled_type_hint) => Some(param_proxy_enabled_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.enabled@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.enabled@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_proxy_user = query_params.iter().filter(|e| e.0 == "proxy.user").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_user = match param_proxy_user {
                    Some(param_proxy_user) => {
                        let param_proxy_user =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_user);
                        match param_proxy_user {
                            Ok(param_proxy_user) => Some(param_proxy_user),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.user - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.user")),
                        }
                    },
                    None => None,
                };
                let param_proxy_user_type_hint = query_params.iter().filter(|e| e.0 == "proxy.user@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_user_type_hint = match param_proxy_user_type_hint {
                    Some(param_proxy_user_type_hint) => {
                        let param_proxy_user_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_user_type_hint);
                        match param_proxy_user_type_hint {
                            Ok(param_proxy_user_type_hint) => Some(param_proxy_user_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.user@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.user@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_proxy_password = query_params.iter().filter(|e| e.0 == "proxy.password").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_password = match param_proxy_password {
                    Some(param_proxy_password) => {
                        let param_proxy_password =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_password);
                        match param_proxy_password {
                            Ok(param_proxy_password) => Some(param_proxy_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.password - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.password")),
                        }
                    },
                    None => None,
                };
                let param_proxy_password_type_hint = query_params.iter().filter(|e| e.0 == "proxy.password@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_proxy_password_type_hint = match param_proxy_password_type_hint {
                    Some(param_proxy_password_type_hint) => {
                        let param_proxy_password_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_proxy_password_type_hint);
                        match param_proxy_password_type_hint {
                            Ok(param_proxy_password_type_hint) => Some(param_proxy_password_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter proxy.password@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter proxy.password@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_apache_http_components_proxy_configuration(
                                            param_proxy_host,
                                            param_proxy_host_type_hint,
                                            param_proxy_port,
                                            param_proxy_port_type_hint,
                                            param_proxy_exceptions.as_ref(),
                                            param_proxy_exceptions_type_hint,
                                            param_proxy_enabled,
                                            param_proxy_enabled_type_hint,
                                            param_proxy_user,
                                            param_proxy_user_type_hint,
                                            param_proxy_password,
                                            param_proxy_password_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheHttpComponentsProxyConfigurationResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigApacheSlingDavExServlet - POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_JCR_DAVEX_IMPL_SERVLETS_SLINGDAVEXSERVLET) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_alias = query_params.iter().filter(|e| e.0 == "alias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_alias = match param_alias {
                    Some(param_alias) => {
                        let param_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_alias);
                        match param_alias {
                            Ok(param_alias) => Some(param_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter alias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter alias")),
                        }
                    },
                    None => None,
                };
                let param_alias_type_hint = query_params.iter().filter(|e| e.0 == "alias@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_alias_type_hint = match param_alias_type_hint {
                    Some(param_alias_type_hint) => {
                        let param_alias_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_alias_type_hint);
                        match param_alias_type_hint {
                            Ok(param_alias_type_hint) => Some(param_alias_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter alias@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter alias@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_dav_create_absolute_uri = query_params.iter().filter(|e| e.0 == "dav.create-absolute-uri").map(|e| e.1.to_owned())
                    .nth(0);
                let param_dav_create_absolute_uri = match param_dav_create_absolute_uri {
                    Some(param_dav_create_absolute_uri) => {
                        let param_dav_create_absolute_uri =
                            <bool as std::str::FromStr>::from_str
                                (&param_dav_create_absolute_uri);
                        match param_dav_create_absolute_uri {
                            Ok(param_dav_create_absolute_uri) => Some(param_dav_create_absolute_uri),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter dav.create-absolute-uri - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter dav.create-absolute-uri")),
                        }
                    },
                    None => None,
                };
                let param_dav_create_absolute_uri_type_hint = query_params.iter().filter(|e| e.0 == "dav.create-absolute-uri@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_dav_create_absolute_uri_type_hint = match param_dav_create_absolute_uri_type_hint {
                    Some(param_dav_create_absolute_uri_type_hint) => {
                        let param_dav_create_absolute_uri_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_dav_create_absolute_uri_type_hint);
                        match param_dav_create_absolute_uri_type_hint {
                            Ok(param_dav_create_absolute_uri_type_hint) => Some(param_dav_create_absolute_uri_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter dav.create-absolute-uri@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter dav.create-absolute-uri@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_apache_sling_dav_ex_servlet(
                                            param_alias,
                                            param_alias_type_hint,
                                            param_dav_create_absolute_uri,
                                            param_dav_create_absolute_uri_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheSlingDavExServletResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigApacheSlingGetServlet - POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SERVLETS_GET_DEFAULTGETSERVLET) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_json_maximumresults = query_params.iter().filter(|e| e.0 == "json.maximumresults").map(|e| e.1.to_owned())
                    .nth(0);
                let param_json_maximumresults = match param_json_maximumresults {
                    Some(param_json_maximumresults) => {
                        let param_json_maximumresults =
                            <String as std::str::FromStr>::from_str
                                (&param_json_maximumresults);
                        match param_json_maximumresults {
                            Ok(param_json_maximumresults) => Some(param_json_maximumresults),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter json.maximumresults - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter json.maximumresults")),
                        }
                    },
                    None => None,
                };
                let param_json_maximumresults_type_hint = query_params.iter().filter(|e| e.0 == "json.maximumresults@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_json_maximumresults_type_hint = match param_json_maximumresults_type_hint {
                    Some(param_json_maximumresults_type_hint) => {
                        let param_json_maximumresults_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_json_maximumresults_type_hint);
                        match param_json_maximumresults_type_hint {
                            Ok(param_json_maximumresults_type_hint) => Some(param_json_maximumresults_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter json.maximumresults@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter json.maximumresults@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_enable_html = query_params.iter().filter(|e| e.0 == "enable.html").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_html = match param_enable_html {
                    Some(param_enable_html) => {
                        let param_enable_html =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_html);
                        match param_enable_html {
                            Ok(param_enable_html) => Some(param_enable_html),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable.html - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable.html")),
                        }
                    },
                    None => None,
                };
                let param_enable_html_type_hint = query_params.iter().filter(|e| e.0 == "enable.html@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_html_type_hint = match param_enable_html_type_hint {
                    Some(param_enable_html_type_hint) => {
                        let param_enable_html_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_enable_html_type_hint);
                        match param_enable_html_type_hint {
                            Ok(param_enable_html_type_hint) => Some(param_enable_html_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable.html@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable.html@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_enable_txt = query_params.iter().filter(|e| e.0 == "enable.txt").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_txt = match param_enable_txt {
                    Some(param_enable_txt) => {
                        let param_enable_txt =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_txt);
                        match param_enable_txt {
                            Ok(param_enable_txt) => Some(param_enable_txt),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable.txt - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable.txt")),
                        }
                    },
                    None => None,
                };
                let param_enable_txt_type_hint = query_params.iter().filter(|e| e.0 == "enable.txt@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_txt_type_hint = match param_enable_txt_type_hint {
                    Some(param_enable_txt_type_hint) => {
                        let param_enable_txt_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_enable_txt_type_hint);
                        match param_enable_txt_type_hint {
                            Ok(param_enable_txt_type_hint) => Some(param_enable_txt_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable.txt@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable.txt@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_enable_xml = query_params.iter().filter(|e| e.0 == "enable.xml").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_xml = match param_enable_xml {
                    Some(param_enable_xml) => {
                        let param_enable_xml =
                            <bool as std::str::FromStr>::from_str
                                (&param_enable_xml);
                        match param_enable_xml {
                            Ok(param_enable_xml) => Some(param_enable_xml),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable.xml - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable.xml")),
                        }
                    },
                    None => None,
                };
                let param_enable_xml_type_hint = query_params.iter().filter(|e| e.0 == "enable.xml@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_enable_xml_type_hint = match param_enable_xml_type_hint {
                    Some(param_enable_xml_type_hint) => {
                        let param_enable_xml_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_enable_xml_type_hint);
                        match param_enable_xml_type_hint {
                            Ok(param_enable_xml_type_hint) => Some(param_enable_xml_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter enable.xml@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter enable.xml@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_apache_sling_get_servlet(
                                            param_json_maximumresults,
                                            param_json_maximumresults_type_hint,
                                            param_enable_html,
                                            param_enable_html_type_hint,
                                            param_enable_txt,
                                            param_enable_txt_type_hint,
                                            param_enable_xml,
                                            param_enable_xml_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheSlingGetServletResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigApacheSlingReferrerFilter - POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SECURITY_IMPL_REFERRERFILTER) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_allow_empty = query_params.iter().filter(|e| e.0 == "allow.empty").map(|e| e.1.to_owned())
                    .nth(0);
                let param_allow_empty = match param_allow_empty {
                    Some(param_allow_empty) => {
                        let param_allow_empty =
                            <bool as std::str::FromStr>::from_str
                                (&param_allow_empty);
                        match param_allow_empty {
                            Ok(param_allow_empty) => Some(param_allow_empty),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter allow.empty - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter allow.empty")),
                        }
                    },
                    None => None,
                };
                let param_allow_empty_type_hint = query_params.iter().filter(|e| e.0 == "allow.empty@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_allow_empty_type_hint = match param_allow_empty_type_hint {
                    Some(param_allow_empty_type_hint) => {
                        let param_allow_empty_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_allow_empty_type_hint);
                        match param_allow_empty_type_hint {
                            Ok(param_allow_empty_type_hint) => Some(param_allow_empty_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter allow.empty@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter allow.empty@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_allow_hosts = query_params.iter().filter(|e| e.0 == "allow.hosts").map(|e| e.1.to_owned())
                    .nth(0);
                let param_allow_hosts = match param_allow_hosts {
                    Some(param_allow_hosts) => {
                        let param_allow_hosts =
                            <String as std::str::FromStr>::from_str
                                (&param_allow_hosts);
                        match param_allow_hosts {
                            Ok(param_allow_hosts) => Some(param_allow_hosts),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter allow.hosts - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter allow.hosts")),
                        }
                    },
                    None => None,
                };
                let param_allow_hosts_type_hint = query_params.iter().filter(|e| e.0 == "allow.hosts@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_allow_hosts_type_hint = match param_allow_hosts_type_hint {
                    Some(param_allow_hosts_type_hint) => {
                        let param_allow_hosts_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_allow_hosts_type_hint);
                        match param_allow_hosts_type_hint {
                            Ok(param_allow_hosts_type_hint) => Some(param_allow_hosts_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter allow.hosts@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter allow.hosts@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_allow_hosts_regexp = query_params.iter().filter(|e| e.0 == "allow.hosts.regexp").map(|e| e.1.to_owned())
                    .nth(0);
                let param_allow_hosts_regexp = match param_allow_hosts_regexp {
                    Some(param_allow_hosts_regexp) => {
                        let param_allow_hosts_regexp =
                            <String as std::str::FromStr>::from_str
                                (&param_allow_hosts_regexp);
                        match param_allow_hosts_regexp {
                            Ok(param_allow_hosts_regexp) => Some(param_allow_hosts_regexp),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter allow.hosts.regexp - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter allow.hosts.regexp")),
                        }
                    },
                    None => None,
                };
                let param_allow_hosts_regexp_type_hint = query_params.iter().filter(|e| e.0 == "allow.hosts.regexp@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_allow_hosts_regexp_type_hint = match param_allow_hosts_regexp_type_hint {
                    Some(param_allow_hosts_regexp_type_hint) => {
                        let param_allow_hosts_regexp_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_allow_hosts_regexp_type_hint);
                        match param_allow_hosts_regexp_type_hint {
                            Ok(param_allow_hosts_regexp_type_hint) => Some(param_allow_hosts_regexp_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter allow.hosts.regexp@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter allow.hosts.regexp@TypeHint")),
                        }
                    },
                    None => None,
                };
                let param_filter_methods = query_params.iter().filter(|e| e.0 == "filter.methods").map(|e| e.1.to_owned())
                    .nth(0);
                let param_filter_methods = match param_filter_methods {
                    Some(param_filter_methods) => {
                        let param_filter_methods =
                            <String as std::str::FromStr>::from_str
                                (&param_filter_methods);
                        match param_filter_methods {
                            Ok(param_filter_methods) => Some(param_filter_methods),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter filter.methods - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter filter.methods")),
                        }
                    },
                    None => None,
                };
                let param_filter_methods_type_hint = query_params.iter().filter(|e| e.0 == "filter.methods@TypeHint").map(|e| e.1.to_owned())
                    .nth(0);
                let param_filter_methods_type_hint = match param_filter_methods_type_hint {
                    Some(param_filter_methods_type_hint) => {
                        let param_filter_methods_type_hint =
                            <String as std::str::FromStr>::from_str
                                (&param_filter_methods_type_hint);
                        match param_filter_methods_type_hint {
                            Ok(param_filter_methods_type_hint) => Some(param_filter_methods_type_hint),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter filter.methods@TypeHint - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter filter.methods@TypeHint")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_config_apache_sling_referrer_filter(
                                            param_allow_empty,
                                            param_allow_empty_type_hint,
                                            param_allow_hosts,
                                            param_allow_hosts_type_hint,
                                            param_allow_hosts_regexp,
                                            param_allow_hosts_regexp_type_hint,
                                            param_filter_methods,
                                            param_filter_methods_type_hint,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheSlingReferrerFilterResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostConfigProperty - POST /apps/system/config/{configNodeName}
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_CONFIGNODENAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_APPS_SYSTEM_CONFIG_CONFIGNODENAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE APPS_SYSTEM_CONFIG_CONFIGNODENAME in set but failed match against \"{}\"", path, paths::REGEX_APPS_SYSTEM_CONFIG_CONFIGNODENAME.as_str())
                    );

                let param_config_node_name = match percent_encoding::percent_decode(path_params["configNodeName"].as_bytes()).decode_utf8() {
                    Ok(param_config_node_name) => match param_config_node_name.parse::<String>() {
                        Ok(param_config_node_name) => param_config_node_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter configNodeName: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["configNodeName"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.post_config_property(
                                            param_config_node_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigPropertyResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostNode - POST /{path}/{name}
            &hyper::Method::POST if path.matched(paths::ID_PATH_NAME) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter path: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())
                    .nth(0);
                let param_operation = match param_operation {
                    Some(param_operation) => {
                        let param_operation =
                            <String as std::str::FromStr>::from_str
                                (&param_operation);
                        match param_operation {
                            Ok(param_operation) => Some(param_operation),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter :operation - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter :operation")),
                        }
                    },
                    None => None,
                };
                let param_delete_authorizable = query_params.iter().filter(|e| e.0 == "deleteAuthorizable").map(|e| e.1.to_owned())
                    .nth(0);
                let param_delete_authorizable = match param_delete_authorizable {
                    Some(param_delete_authorizable) => {
                        let param_delete_authorizable =
                            <String as std::str::FromStr>::from_str
                                (&param_delete_authorizable);
                        match param_delete_authorizable {
                            Ok(param_delete_authorizable) => Some(param_delete_authorizable),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter deleteAuthorizable - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter deleteAuthorizable")),
                        }
                    },
                    None => None,
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_file = entries.fields.remove("file");
                                let param_file = match field_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for file");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("file data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter file"))
                                            }
                                        };
                                        file_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.post_node(
                                            param_path,
                                            param_name,
                                            param_operation,
                                            param_delete_authorizable,
                                            param_file,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostNodeResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // PostNodeRw - POST /{path}/{name}.rw.html
            &hyper::Method::POST if path.matched(paths::ID_PATH_NAME_RW_HTML) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME_RW_HTML
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME_RW_HTML in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME_RW_HTML.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter path: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter name: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_add_members = query_params.iter().filter(|e| e.0 == "addMembers").map(|e| e.1.to_owned())
                    .nth(0);
                let param_add_members = match param_add_members {
                    Some(param_add_members) => {
                        let param_add_members =
                            <String as std::str::FromStr>::from_str
                                (&param_add_members);
                        match param_add_members {
                            Ok(param_add_members) => Some(param_add_members),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter addMembers - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter addMembers")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.post_node_rw(
                                            param_path,
                                            param_name,
                                            param_add_members,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostNodeRwResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostPath - POST /{path}/
            &hyper::Method::POST if path.matched(paths::ID_PATH_) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_ in set but failed match against \"{}\"", path, paths::REGEX_PATH_.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter path: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_jcrprimary_type = query_params.iter().filter(|e| e.0 == "jcr:primaryType").map(|e| e.1.to_owned())
                    .nth(0);
                let param_jcrprimary_type = match param_jcrprimary_type {
                    Some(param_jcrprimary_type) => {
                        let param_jcrprimary_type =
                            <String as std::str::FromStr>::from_str
                                (&param_jcrprimary_type);
                        match param_jcrprimary_type {
                            Ok(param_jcrprimary_type) => Some(param_jcrprimary_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter jcr:primaryType - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter jcr:primaryType")),
                        }
                    },
                    None => None,
                };
                let param_jcrprimary_type = match param_jcrprimary_type {
                    Some(param_jcrprimary_type) => param_jcrprimary_type,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter jcr:primaryType"))
                        .expect("Unable to create Bad Request response for missing query parameter jcr:primaryType")),
                };
                let param_name = query_params.iter().filter(|e| e.0 == ":name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name = match param_name {
                    Some(param_name) => {
                        let param_name =
                            <String as std::str::FromStr>::from_str
                                (&param_name);
                        match param_name {
                            Ok(param_name) => Some(param_name),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter :name - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter :name")),
                        }
                    },
                    None => None,
                };
                let param_name = match param_name {
                    Some(param_name) => param_name,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter :name"))
                        .expect("Unable to create Bad Request response for missing query parameter :name")),
                };

                                let result = api_impl.post_path(
                                            param_path,
                                            param_jcrprimary_type,
                                            param_name,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPathResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostQuery - POST /bin/querybuilder.json
            &hyper::Method::POST if path.matched(paths::ID_BIN_QUERYBUILDER_JSON) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => {
                        let param_path =
                            <String as std::str::FromStr>::from_str
                                (&param_path);
                        match param_path {
                            Ok(param_path) => Some(param_path),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter path")),
                        }
                    },
                    None => None,
                };
                let param_path = match param_path {
                    Some(param_path) => param_path,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter path"))
                        .expect("Unable to create Bad Request response for missing query parameter path")),
                };
                let param_p_limit = query_params.iter().filter(|e| e.0 == "p.limit").map(|e| e.1.to_owned())
                    .nth(0);
                let param_p_limit = match param_p_limit {
                    Some(param_p_limit) => {
                        let param_p_limit =
                            <f64 as std::str::FromStr>::from_str
                                (&param_p_limit);
                        match param_p_limit {
                            Ok(param_p_limit) => Some(param_p_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter p.limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter p.limit")),
                        }
                    },
                    None => None,
                };
                let param_p_limit = match param_p_limit {
                    Some(param_p_limit) => param_p_limit,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter p.limit"))
                        .expect("Unable to create Bad Request response for missing query parameter p.limit")),
                };
                let param_param_1_property = query_params.iter().filter(|e| e.0 == "1_property").map(|e| e.1.to_owned())
                    .nth(0);
                let param_param_1_property = match param_param_1_property {
                    Some(param_param_1_property) => {
                        let param_param_1_property =
                            <String as std::str::FromStr>::from_str
                                (&param_param_1_property);
                        match param_param_1_property {
                            Ok(param_param_1_property) => Some(param_param_1_property),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter 1_property - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter 1_property")),
                        }
                    },
                    None => None,
                };
                let param_param_1_property = match param_param_1_property {
                    Some(param_param_1_property) => param_param_1_property,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter 1_property"))
                        .expect("Unable to create Bad Request response for missing query parameter 1_property")),
                };
                let param_param_1_property_value = query_params.iter().filter(|e| e.0 == "1_property.value").map(|e| e.1.to_owned())
                    .nth(0);
                let param_param_1_property_value = match param_param_1_property_value {
                    Some(param_param_1_property_value) => {
                        let param_param_1_property_value =
                            <String as std::str::FromStr>::from_str
                                (&param_param_1_property_value);
                        match param_param_1_property_value {
                            Ok(param_param_1_property_value) => Some(param_param_1_property_value),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter 1_property.value - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter 1_property.value")),
                        }
                    },
                    None => None,
                };
                let param_param_1_property_value = match param_param_1_property_value {
                    Some(param_param_1_property_value) => param_param_1_property_value,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter 1_property.value"))
                        .expect("Unable to create Bad Request response for missing query parameter 1_property.value")),
                };

                                let result = api_impl.post_query(
                                            param_path,
                                            param_p_limit,
                                            param_param_1_property,
                                            param_param_1_property_value,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostQueryResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for POST_QUERY_DEFAULT_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostTreeActivation - POST /etc/replication/treeactivation.html
            &hyper::Method::POST if path.matched(paths::ID_ETC_REPLICATION_TREEACTIVATION_HTML) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_ignoredeactivated = query_params.iter().filter(|e| e.0 == "ignoredeactivated").map(|e| e.1.to_owned())
                    .nth(0);
                let param_ignoredeactivated = match param_ignoredeactivated {
                    Some(param_ignoredeactivated) => {
                        let param_ignoredeactivated =
                            <bool as std::str::FromStr>::from_str
                                (&param_ignoredeactivated);
                        match param_ignoredeactivated {
                            Ok(param_ignoredeactivated) => Some(param_ignoredeactivated),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter ignoredeactivated - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter ignoredeactivated")),
                        }
                    },
                    None => None,
                };
                let param_ignoredeactivated = match param_ignoredeactivated {
                    Some(param_ignoredeactivated) => param_ignoredeactivated,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter ignoredeactivated"))
                        .expect("Unable to create Bad Request response for missing query parameter ignoredeactivated")),
                };
                let param_onlymodified = query_params.iter().filter(|e| e.0 == "onlymodified").map(|e| e.1.to_owned())
                    .nth(0);
                let param_onlymodified = match param_onlymodified {
                    Some(param_onlymodified) => {
                        let param_onlymodified =
                            <bool as std::str::FromStr>::from_str
                                (&param_onlymodified);
                        match param_onlymodified {
                            Ok(param_onlymodified) => Some(param_onlymodified),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter onlymodified - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter onlymodified")),
                        }
                    },
                    None => None,
                };
                let param_onlymodified = match param_onlymodified {
                    Some(param_onlymodified) => param_onlymodified,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter onlymodified"))
                        .expect("Unable to create Bad Request response for missing query parameter onlymodified")),
                };
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => {
                        let param_path =
                            <String as std::str::FromStr>::from_str
                                (&param_path);
                        match param_path {
                            Ok(param_path) => Some(param_path),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter path")),
                        }
                    },
                    None => None,
                };
                let param_path = match param_path {
                    Some(param_path) => param_path,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter path"))
                        .expect("Unable to create Bad Request response for missing query parameter path")),
                };

                                let result = api_impl.post_tree_activation(
                                            param_ignoredeactivated,
                                            param_onlymodified,
                                            param_path,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostTreeActivationResponse::DefaultResponse
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PostTruststore - POST /libs/granite/security/post/truststore
            &hyper::Method::POST if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_TRUSTSTORE) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())
                    .nth(0);
                let param_operation = match param_operation {
                    Some(param_operation) => {
                        let param_operation =
                            <String as std::str::FromStr>::from_str
                                (&param_operation);
                        match param_operation {
                            Ok(param_operation) => Some(param_operation),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter :operation - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter :operation")),
                        }
                    },
                    None => None,
                };
                let param_new_password = query_params.iter().filter(|e| e.0 == "newPassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_new_password = match param_new_password {
                    Some(param_new_password) => {
                        let param_new_password =
                            <String as std::str::FromStr>::from_str
                                (&param_new_password);
                        match param_new_password {
                            Ok(param_new_password) => Some(param_new_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter newPassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter newPassword")),
                        }
                    },
                    None => None,
                };
                let param_re_password = query_params.iter().filter(|e| e.0 == "rePassword").map(|e| e.1.to_owned())
                    .nth(0);
                let param_re_password = match param_re_password {
                    Some(param_re_password) => {
                        let param_re_password =
                            <String as std::str::FromStr>::from_str
                                (&param_re_password);
                        match param_re_password {
                            Ok(param_re_password) => Some(param_re_password),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter rePassword - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter rePassword")),
                        }
                    },
                    None => None,
                };
                let param_key_store_type = query_params.iter().filter(|e| e.0 == "keyStoreType").map(|e| e.1.to_owned())
                    .nth(0);
                let param_key_store_type = match param_key_store_type {
                    Some(param_key_store_type) => {
                        let param_key_store_type =
                            <String as std::str::FromStr>::from_str
                                (&param_key_store_type);
                        match param_key_store_type {
                            Ok(param_key_store_type) => Some(param_key_store_type),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter keyStoreType - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter keyStoreType")),
                        }
                    },
                    None => None,
                };
                let param_remove_alias = query_params.iter().filter(|e| e.0 == "removeAlias").map(|e| e.1.to_owned())
                    .nth(0);
                let param_remove_alias = match param_remove_alias {
                    Some(param_remove_alias) => {
                        let param_remove_alias =
                            <String as std::str::FromStr>::from_str
                                (&param_remove_alias);
                        match param_remove_alias {
                            Ok(param_remove_alias) => Some(param_remove_alias),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter removeAlias - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter removeAlias")),
                        }
                    },
                    None => None,
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_certificate = entries.fields.remove("certificate");
                                let param_certificate = match field_certificate {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for certificate");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let certificate_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("certificate data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter certificate"))
                                            }
                                        };
                                        certificate_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.post_truststore(
                                            param_operation,
                                            param_new_password,
                                            param_re_password,
                                            param_key_store_type,
                                            param_remove_alias,
                                            param_certificate,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostTruststoreResponse::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_TRUSTSTORE_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // PostTruststorePKCS12 - POST /etc/truststore
            &hyper::Method::POST if path.matched(paths::ID_ETC_TRUSTSTORE) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Unable to process all message parts")))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_truststore_p12 = entries.fields.remove("truststore_p12");
                                let param_truststore_p12 = match field_truststore_p12 {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for truststore_p12");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let truststore_p12_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("truststore_p12 data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter truststore_p12"))
                                            }
                                        };
                                        truststore_p12_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.post_truststore_pkcs12(
                                            param_truststore_p12,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostTruststorePKCS12Response::DefaultResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("text/plain")
                                                            .expect("Unable to create Content-Type header for POST_TRUSTSTORE_PKCS12_DEFAULT_RESPONSE"));
                                                    let body = body;
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read multipart body")))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            _ if path.matched(paths::ID__CQACTIONS_HTML) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER_CONFIG) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_AEM_PASSWORDRESET_ACTIVATOR) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_HEALTHCHECK_HC_IMPL_ACTIVEBUNDLEHEALTHCHECK) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_FELIX_HTTP) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_HTTP_PROXYCONFIGURATOR_CONFIG) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_JCR_DAVEX_IMPL_SERVLETS_SLINGDAVEXSERVLET) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SECURITY_IMPL_REFERRERFILTER) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SERVLETS_GET_DEFAULTGETSERVLET) => method_not_allowed(),
            _ if path.matched(paths::ID_APPS_SYSTEM_CONFIG_CONFIGNODENAME) => method_not_allowed(),
            _ if path.matched(paths::ID_BIN_QUERYBUILDER_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_CRX_EXPLORER_UI_SETPASSWORD_JSP) => method_not_allowed(),
            _ if path.matched(paths::ID_CRX_PACKMGR_INSTALLSTATUS_JSP) => method_not_allowed(),
            _ if path.matched(paths::ID_CRX_PACKMGR_SERVICE_JSP) => method_not_allowed(),
            _ if path.matched(paths::ID_CRX_PACKMGR_SERVICE__JSON_PATH) => method_not_allowed(),
            _ if path.matched(paths::ID_CRX_PACKMGR_SERVICE_SCRIPT_HTML) => method_not_allowed(),
            _ if path.matched(paths::ID_CRX_PACKMGR_UPDATE_JSP) => method_not_allowed(),
            _ if path.matched(paths::ID_CRX_SERVER_CRX_DEFAULT_JCRROOT__1_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP) => method_not_allowed(),
            _ if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => method_not_allowed(),
            _ if path.matched(paths::ID_ETC_REPLICATION_TREEACTIVATION_HTML) => method_not_allowed(),
            _ if path.matched(paths::ID_ETC_TRUSTSTORE) => method_not_allowed(),
            _ if path.matched(paths::ID_ETC_TRUSTSTORE_TRUSTSTORE_P12) => method_not_allowed(),
            _ if path.matched(paths::ID_LIBS_GRANITE_CORE_CONTENT_LOGIN_HTML) => method_not_allowed(),
            _ if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_AUTHORIZABLES) => method_not_allowed(),
            _ if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_SSLSETUP_HTML) => method_not_allowed(),
            _ if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_TRUSTSTORE) => method_not_allowed(),
            _ if path.matched(paths::ID_LIBS_GRANITE_SECURITY_TRUSTSTORE_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_SYSTEM_CONSOLE_BUNDLES_NAME) => method_not_allowed(),
            _ if path.matched(paths::ID_SYSTEM_CONSOLE_BUNDLES_NAME_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR) => method_not_allowed(),
            _ if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER) => method_not_allowed(),
            _ if path.matched(paths::ID_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION) => method_not_allowed(),
            _ if path.matched(paths::ID_SYSTEM_CONSOLE_STATUS_PRODUCTINFO_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_SYSTEM_HEALTH) => method_not_allowed(),
            _ if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML) => method_not_allowed(),
            _ if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12) => method_not_allowed(),
            _ if path.matched(paths::ID_PATH_) => method_not_allowed(),
            _ if path.matched(paths::ID_PATH_NAME) => method_not_allowed(),
            _ if path.matched(paths::ID_PATH_NAME_RW_HTML) => method_not_allowed(),
            _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                    .body(Body::empty())
                    .expect("Unable to create Not Found response"))
        }
    } Box::pin(run(self.api_impl.clone(), req)) }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Result<&'static str, ()> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match request.method() {
            // GetAemProductInfo - GET /system/console/status-productinfo.json
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_CONSOLE_STATUS_PRODUCTINFO_JSON) => Ok("GetAemProductInfo"),
            // GetBundleInfo - GET /system/console/bundles/{name}.json
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_CONSOLE_BUNDLES_NAME_JSON) => Ok("GetBundleInfo"),
            // GetConfigMgr - GET /system/console/configMgr
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR) => Ok("GetConfigMgr"),
            // PostBundle - POST /system/console/bundles/{name}
            &hyper::Method::POST if path.matched(paths::ID_SYSTEM_CONSOLE_BUNDLES_NAME) => Ok("PostBundle"),
            // PostJmxRepository - POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}
            &hyper::Method::POST if path.matched(paths::ID_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION) => Ok("PostJmxRepository"),
            // PostSamlConfiguration - POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
            &hyper::Method::POST if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER) => Ok("PostSamlConfiguration"),
            // GetLoginPage - GET /libs/granite/core/content/login.html
            &hyper::Method::GET if path.matched(paths::ID_LIBS_GRANITE_CORE_CONTENT_LOGIN_HTML) => Ok("GetLoginPage"),
            // PostCqActions - POST /.cqactions.html
            &hyper::Method::POST if path.matched(paths::ID__CQACTIONS_HTML) => Ok("PostCqActions"),
            // GetCrxdeStatus - GET /crx/server/crx.default/jcr:root/.1.json
            &hyper::Method::GET if path.matched(paths::ID_CRX_SERVER_CRX_DEFAULT_JCRROOT__1_JSON) => Ok("GetCrxdeStatus"),
            // GetInstallStatus - GET /crx/packmgr/installstatus.jsp
            &hyper::Method::GET if path.matched(paths::ID_CRX_PACKMGR_INSTALLSTATUS_JSP) => Ok("GetInstallStatus"),
            // GetPackageManagerServlet - GET /crx/packmgr/service/script.html
            &hyper::Method::GET if path.matched(paths::ID_CRX_PACKMGR_SERVICE_SCRIPT_HTML) => Ok("GetPackageManagerServlet"),
            // PostPackageService - POST /crx/packmgr/service.jsp
            &hyper::Method::POST if path.matched(paths::ID_CRX_PACKMGR_SERVICE_JSP) => Ok("PostPackageService"),
            // PostPackageServiceJson - POST /crx/packmgr/service/.json/{path}
            &hyper::Method::POST if path.matched(paths::ID_CRX_PACKMGR_SERVICE__JSON_PATH) => Ok("PostPackageServiceJson"),
            // PostPackageUpdate - POST /crx/packmgr/update.jsp
            &hyper::Method::POST if path.matched(paths::ID_CRX_PACKMGR_UPDATE_JSP) => Ok("PostPackageUpdate"),
            // PostSetPassword - POST /crx/explorer/ui/setpassword.jsp
            &hyper::Method::POST if path.matched(paths::ID_CRX_EXPLORER_UI_SETPASSWORD_JSP) => Ok("PostSetPassword"),
            // GetAemHealthCheck - GET /system/health
            &hyper::Method::GET if path.matched(paths::ID_SYSTEM_HEALTH) => Ok("GetAemHealthCheck"),
            // PostConfigAemHealthCheckServlet - POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_HEALTHCHECK_HC_IMPL_ACTIVEBUNDLEHEALTHCHECK) => Ok("PostConfigAemHealthCheckServlet"),
            // PostConfigAemPasswordReset - POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_AEM_PASSWORDRESET_ACTIVATOR) => Ok("PostConfigAemPasswordReset"),
            // SslSetup - POST /libs/granite/security/post/sslSetup.html
            &hyper::Method::POST if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_SSLSETUP_HTML) => Ok("SslSetup"),
            // DeleteAgent - DELETE /etc/replication/agents.{runmode}/{name}
            &hyper::Method::DELETE if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => Ok("DeleteAgent"),
            // DeleteNode - DELETE /{path}/{name}
            &hyper::Method::DELETE if path.matched(paths::ID_PATH_NAME) => Ok("DeleteNode"),
            // GetAgent - GET /etc/replication/agents.{runmode}/{name}
            &hyper::Method::GET if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => Ok("GetAgent"),
            // GetAgents - GET /etc/replication/agents.{runmode}.-1.json
            &hyper::Method::GET if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON) => Ok("GetAgents"),
            // GetAuthorizableKeystore - GET /{intermediatePath}/{authorizableId}.ks.json
            &hyper::Method::GET if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON) => Ok("GetAuthorizableKeystore"),
            // GetKeystore - GET /{intermediatePath}/{authorizableId}/keystore/store.p12
            &hyper::Method::GET if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12) => Ok("GetKeystore"),
            // GetNode - GET /{path}/{name}
            &hyper::Method::GET if path.matched(paths::ID_PATH_NAME) => Ok("GetNode"),
            // GetPackage - GET /etc/packages/{group}/{name}-{version}.zip
            &hyper::Method::GET if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP) => Ok("GetPackage"),
            // GetPackageFilter - GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json
            &hyper::Method::GET if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON) => Ok("GetPackageFilter"),
            // GetQuery - GET /bin/querybuilder.json
            &hyper::Method::GET if path.matched(paths::ID_BIN_QUERYBUILDER_JSON) => Ok("GetQuery"),
            // GetTruststore - GET /etc/truststore/truststore.p12
            &hyper::Method::GET if path.matched(paths::ID_ETC_TRUSTSTORE_TRUSTSTORE_P12) => Ok("GetTruststore"),
            // GetTruststoreInfo - GET /libs/granite/security/truststore.json
            &hyper::Method::GET if path.matched(paths::ID_LIBS_GRANITE_SECURITY_TRUSTSTORE_JSON) => Ok("GetTruststoreInfo"),
            // PostAgent - POST /etc/replication/agents.{runmode}/{name}
            &hyper::Method::POST if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => Ok("PostAgent"),
            // PostAuthorizableKeystore - POST /{intermediatePath}/{authorizableId}.ks.html
            &hyper::Method::POST if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML) => Ok("PostAuthorizableKeystore"),
            // PostAuthorizables - POST /libs/granite/security/post/authorizables
            &hyper::Method::POST if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_AUTHORIZABLES) => Ok("PostAuthorizables"),
            // PostConfigAdobeGraniteSamlAuthenticationHandler - POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER_CONFIG) => Ok("PostConfigAdobeGraniteSamlAuthenticationHandler"),
            // PostConfigApacheFelixJettyBasedHttpService - POST /apps/system/config/org.apache.felix.http
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_FELIX_HTTP) => Ok("PostConfigApacheFelixJettyBasedHttpService"),
            // PostConfigApacheHttpComponentsProxyConfiguration - POST /apps/system/config/org.apache.http.proxyconfigurator.config
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_HTTP_PROXYCONFIGURATOR_CONFIG) => Ok("PostConfigApacheHttpComponentsProxyConfiguration"),
            // PostConfigApacheSlingDavExServlet - POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_JCR_DAVEX_IMPL_SERVLETS_SLINGDAVEXSERVLET) => Ok("PostConfigApacheSlingDavExServlet"),
            // PostConfigApacheSlingGetServlet - POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SERVLETS_GET_DEFAULTGETSERVLET) => Ok("PostConfigApacheSlingGetServlet"),
            // PostConfigApacheSlingReferrerFilter - POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SECURITY_IMPL_REFERRERFILTER) => Ok("PostConfigApacheSlingReferrerFilter"),
            // PostConfigProperty - POST /apps/system/config/{configNodeName}
            &hyper::Method::POST if path.matched(paths::ID_APPS_SYSTEM_CONFIG_CONFIGNODENAME) => Ok("PostConfigProperty"),
            // PostNode - POST /{path}/{name}
            &hyper::Method::POST if path.matched(paths::ID_PATH_NAME) => Ok("PostNode"),
            // PostNodeRw - POST /{path}/{name}.rw.html
            &hyper::Method::POST if path.matched(paths::ID_PATH_NAME_RW_HTML) => Ok("PostNodeRw"),
            // PostPath - POST /{path}/
            &hyper::Method::POST if path.matched(paths::ID_PATH_) => Ok("PostPath"),
            // PostQuery - POST /bin/querybuilder.json
            &hyper::Method::POST if path.matched(paths::ID_BIN_QUERYBUILDER_JSON) => Ok("PostQuery"),
            // PostTreeActivation - POST /etc/replication/treeactivation.html
            &hyper::Method::POST if path.matched(paths::ID_ETC_REPLICATION_TREEACTIVATION_HTML) => Ok("PostTreeActivation"),
            // PostTruststore - POST /libs/granite/security/post/truststore
            &hyper::Method::POST if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_TRUSTSTORE) => Ok("PostTruststore"),
            // PostTruststorePKCS12 - POST /etc/truststore
            &hyper::Method::POST if path.matched(paths::ID_ETC_TRUSTSTORE) => Ok("PostTruststorePKCS12"),
            _ => Err(()),
        }
    }
}
