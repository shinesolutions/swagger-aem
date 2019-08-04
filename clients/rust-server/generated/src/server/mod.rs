#![allow(unused_extern_crates)]
extern crate serde_ignored;
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate uuid;
extern crate chrono;
extern crate percent_encoding;
extern crate url;


use std::sync::Arc;
use std::marker::PhantomData;
use futures::{Future, future, Stream, stream};
use hyper;
use hyper::{Request, Response, Error, StatusCode};
use hyper::header::{Headers, ContentType};
use self::url::form_urlencoded;
use mimetypes;

use serde_json;


#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;
use std::io;

#[allow(unused_imports)]
use std::collections::BTreeSet;

pub use swagger::auth::Authorization;
use swagger::{ApiError, XSpanId, XSpanIdString, Has, RequestParser};
use swagger::auth::Scopes;

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
#[allow(unused_imports)]
use models;

pub mod context;

header! { (Warning, "Warning") => [String] }

mod paths {
    extern crate regex;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(&[
            r"^//.cqactions.html$",
            r"^//apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config$",
            r"^//apps/system/config/com.shinesolutions.aem.passwordreset.Activator$",
            r"^//apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck$",
            r"^//apps/system/config/org.apache.felix.http$",
            r"^//apps/system/config/org.apache.http.proxyconfigurator.config$",
            r"^//apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet$",
            r"^//apps/system/config/org.apache.sling.security.impl.ReferrerFilter$",
            r"^//apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet$",
            r"^//bin/querybuilder.json$",
            r"^//crx/explorer/ui/setpassword.jsp$",
            r"^//crx/packmgr/installstatus.jsp$",
            r"^//crx/packmgr/service.jsp$",
            r"^//crx/packmgr/service/.json/(?P<path>[^/?#]*)$",
            r"^//crx/packmgr/service/script.html$",
            r"^//crx/packmgr/update.jsp$",
            r"^//crx/server/crx.default/jcr:root/.1.json$",
            r"^//etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip$",
            r"^//etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip/jcr:content/vlt:definition/filter.tidy.2.json$",
            r"^//etc/replication/agents.(?P<runmode>[^/?#]*).-1.json$",
            r"^//etc/replication/agents.(?P<runmode>[^/?#]*)/(?P<name>[^/?#]*)$",
            r"^//etc/replication/treeactivation.html$",
            r"^//etc/truststore$",
            r"^//etc/truststore/truststore.p12$",
            r"^//libs/granite/core/content/login.html$",
            r"^//libs/granite/security/post/authorizables$",
            r"^//libs/granite/security/post/truststore$",
            r"^//libs/granite/security/truststore.json$",
            r"^//system/console/bundles/(?P<name>[^/?#]*)$",
            r"^//system/console/configMgr$",
            r"^//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler$",
            r"^//system/console/jmx/com.adobe.granite:type=Repository/op/(?P<action>[^/?#]*)$",
            r"^//system/console/status-productinfo.json$",
            r"^//system/health$",
            r"^//(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.html$",
            r"^//(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.json$",
            r"^//(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*)/keystore/store.p12$",
            r"^//(?P<path>[^/?#]*)/$",
            r"^//(?P<path>[^/?#]*)/(?P<name>[^/?#]*)$",
            r"^//(?P<path>[^/?#]*)/(?P<name>[^/?#]*).rw.html$"
        ]).unwrap();
    }
    pub static ID__CQACTIONS_HTML: usize = 0;
    pub static ID_APPS_SYSTEM_CONFIG_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER_CONFIG: usize = 1;
    pub static ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_AEM_PASSWORDRESET_ACTIVATOR: usize = 2;
    pub static ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_HEALTHCHECK_HC_IMPL_ACTIVEBUNDLEHEALTHCHECK: usize = 3;
    pub static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_FELIX_HTTP: usize = 4;
    pub static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_HTTP_PROXYCONFIGURATOR_CONFIG: usize = 5;
    pub static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_JCR_DAVEX_IMPL_SERVLETS_SLINGDAVEXSERVLET: usize = 6;
    pub static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SECURITY_IMPL_REFERRERFILTER: usize = 7;
    pub static ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SERVLETS_GET_DEFAULTGETSERVLET: usize = 8;
    pub static ID_BIN_QUERYBUILDER_JSON: usize = 9;
    pub static ID_CRX_EXPLORER_UI_SETPASSWORD_JSP: usize = 10;
    pub static ID_CRX_PACKMGR_INSTALLSTATUS_JSP: usize = 11;
    pub static ID_CRX_PACKMGR_SERVICE_JSP: usize = 12;
    pub static ID_CRX_PACKMGR_SERVICE__JSON_PATH: usize = 13;
    lazy_static! {
        pub static ref REGEX_CRX_PACKMGR_SERVICE__JSON_PATH: regex::Regex = regex::Regex::new(r"^//crx/packmgr/service/.json/(?P<path>[^/?#]*)$").unwrap();
    }
    pub static ID_CRX_PACKMGR_SERVICE_SCRIPT_HTML: usize = 14;
    pub static ID_CRX_PACKMGR_UPDATE_JSP: usize = 15;
    pub static ID_CRX_SERVER_CRX_DEFAULT_JCRROOT__1_JSON: usize = 16;
    pub static ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP: usize = 17;
    lazy_static! {
        pub static ref REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP: regex::Regex = regex::Regex::new(r"^//etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip$").unwrap();
    }
    pub static ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON: usize = 18;
    lazy_static! {
        pub static ref REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON: regex::Regex = regex::Regex::new(r"^//etc/packages/(?P<group>[^/?#]*)/(?P<name>[^/?#]*)-(?P<version>[^/?#]*).zip/jcr:content/vlt:definition/filter.tidy.2.json$").unwrap();
    }
    pub static ID_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON: usize = 19;
    lazy_static! {
        pub static ref REGEX_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON: regex::Regex = regex::Regex::new(r"^//etc/replication/agents.(?P<runmode>[^/?#]*).-1.json$").unwrap();
    }
    pub static ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME: usize = 20;
    lazy_static! {
        pub static ref REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME: regex::Regex = regex::Regex::new(r"^//etc/replication/agents.(?P<runmode>[^/?#]*)/(?P<name>[^/?#]*)$").unwrap();
    }
    pub static ID_ETC_REPLICATION_TREEACTIVATION_HTML: usize = 21;
    pub static ID_ETC_TRUSTSTORE: usize = 22;
    pub static ID_ETC_TRUSTSTORE_TRUSTSTORE_P12: usize = 23;
    pub static ID_LIBS_GRANITE_CORE_CONTENT_LOGIN_HTML: usize = 24;
    pub static ID_LIBS_GRANITE_SECURITY_POST_AUTHORIZABLES: usize = 25;
    pub static ID_LIBS_GRANITE_SECURITY_POST_TRUSTSTORE: usize = 26;
    pub static ID_LIBS_GRANITE_SECURITY_TRUSTSTORE_JSON: usize = 27;
    pub static ID_SYSTEM_CONSOLE_BUNDLES_NAME: usize = 28;
    lazy_static! {
        pub static ref REGEX_SYSTEM_CONSOLE_BUNDLES_NAME: regex::Regex = regex::Regex::new(r"^//system/console/bundles/(?P<name>[^/?#]*)$").unwrap();
    }
    pub static ID_SYSTEM_CONSOLE_CONFIGMGR: usize = 29;
    pub static ID_SYSTEM_CONSOLE_CONFIGMGR_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER: usize = 30;
    pub static ID_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION: usize = 31;
    lazy_static! {
        pub static ref REGEX_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION: regex::Regex = regex::Regex::new(r"^//system/console/jmx/com.adobe.granite:type=Repository/op/(?P<action>[^/?#]*)$").unwrap();
    }
    pub static ID_SYSTEM_CONSOLE_STATUS_PRODUCTINFO_JSON: usize = 32;
    pub static ID_SYSTEM_HEALTH: usize = 33;
    pub static ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML: usize = 34;
    lazy_static! {
        pub static ref REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML: regex::Regex = regex::Regex::new(r"^//(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.html$").unwrap();
    }
    pub static ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON: usize = 35;
    lazy_static! {
        pub static ref REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON: regex::Regex = regex::Regex::new(r"^//(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*).ks.json$").unwrap();
    }
    pub static ID_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12: usize = 36;
    lazy_static! {
        pub static ref REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12: regex::Regex = regex::Regex::new(r"^//(?P<intermediatePath>[^/?#]*)/(?P<authorizableId>[^/?#]*)/keystore/store.p12$").unwrap();
    }
    pub static ID_PATH_: usize = 37;
    lazy_static! {
        pub static ref REGEX_PATH_: regex::Regex = regex::Regex::new(r"^//(?P<path>[^/?#]*)/$").unwrap();
    }
    pub static ID_PATH_NAME: usize = 38;
    lazy_static! {
        pub static ref REGEX_PATH_NAME: regex::Regex = regex::Regex::new(r"^//(?P<path>[^/?#]*)/(?P<name>[^/?#]*)$").unwrap();
    }
    pub static ID_PATH_NAME_RW_HTML: usize = 39;
    lazy_static! {
        pub static ref REGEX_PATH_NAME_RW_HTML: regex::Regex = regex::Regex::new(r"^//(?P<path>[^/?#]*)/(?P<name>[^/?#]*).rw.html$").unwrap();
    }
}

pub struct NewService<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static
{
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> NewService<T, C> {
        NewService{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::NewService for NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Instance = Service<T, C>;

    fn new_service(&self) -> Result<Self::Instance, io::Error> {
        Ok(Service::new(self.api_impl.clone()))
    }
}

pub struct Service<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static {
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> Service<T, C> {
        Service{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::Service for Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Future = Box<Future<Item=Response, Error=Error>>;

    fn call(&self, (req, mut context): Self::Request) -> Self::Future {
        let api_impl = self.api_impl.clone();
        let (method, uri, _, headers, body) = req.deconstruct();
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        // This match statement is duplicated below in `parse_operation_id()`.
        // Please update both places if changing how this code is autogenerated.
        match &method {

            // GetAemProductInfo - GET /system/console/status-productinfo.json
            &hyper::Method::Get if path.matched(paths::ID_SYSTEM_CONSOLE_STATUS_PRODUCTINFO_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                Box::new(api_impl.get_aem_product_info(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAemProductInfoResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_AEM_PRODUCT_INFO_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetConfigMgr - GET /system/console/configMgr
            &hyper::Method::Get if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                Box::new(api_impl.get_config_mgr(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetConfigMgrResponse::OK

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_CONFIG_MGR_OK.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetConfigMgrResponse::UnexpectedError


                                                => {
                                                    response.set_status(StatusCode::try_from(5XX).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostBundle - POST /system/console/bundles/{name}
            &hyper::Method::Post if path.matched(paths::ID_SYSTEM_CONSOLE_BUNDLES_NAME) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_SYSTEM_CONSOLE_BUNDLES_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE SYSTEM_CONSOLE_BUNDLES_NAME in set but failed match against \"{}\"", path, paths::REGEX_SYSTEM_CONSOLE_BUNDLES_NAME.as_str())
                    );

                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_action = query_params.iter().filter(|e| e.0 == "action").map(|e| e.1.to_owned())

                    .nth(0);
                let param_action = match param_action {
                    Some(param_action) => match param_action.parse::<String>() {
                        Ok(param_action) => param_action,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter action - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter action"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_bundle(param_name, param_action, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostBundleResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostJmxRepository - POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}
            &hyper::Method::Post if path.matched(paths::ID_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION in set but failed match against \"{}\"", path, paths::REGEX_SYSTEM_CONSOLE_JMX_COM_ADOBE_GRANITETYPEREPOSITORY_OP_ACTION.as_str())
                    );

                let param_action = match percent_encoding::percent_decode(path_params["action"].as_bytes()).decode_utf8() {
                    Ok(param_action) => match param_action.parse::<String>() {
                        Ok(param_action) => param_action,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter action: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["action"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.post_jmx_repository(param_action, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostJmxRepositoryResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostSamlConfiguration - POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
            &hyper::Method::Post if path.matched(paths::ID_SYSTEM_CONSOLE_CONFIGMGR_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_post = query_params.iter().filter(|e| e.0 == "post").map(|e| e.1.to_owned())

                    .nth(0);

                let param_post = param_post.and_then(|param_post| param_post.parse::<>().ok());
                let param_apply = query_params.iter().filter(|e| e.0 == "apply").map(|e| e.1.to_owned())

                    .nth(0);

                let param_apply = param_apply.and_then(|param_apply| param_apply.parse::<>().ok());
                let param_delete = query_params.iter().filter(|e| e.0 == "delete").map(|e| e.1.to_owned())

                    .nth(0);

                let param_delete = param_delete.and_then(|param_delete| param_delete.parse::<>().ok());
                let param_action = query_params.iter().filter(|e| e.0 == "action").map(|e| e.1.to_owned())

                    .nth(0);

                let param_action = param_action.and_then(|param_action| param_action.parse::<>().ok());
                let param_location = query_params.iter().filter(|e| e.0 == "$location").map(|e| e.1.to_owned())

                    .nth(0);

                let param_location = param_location.and_then(|param_location| param_location.parse::<>().ok());
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .filter_map(|param_path| param_path.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_path = if !param_path.is_empty() {
                    Some(param_path)
                } else {
                    None
                };
                let param_service_ranking = query_params.iter().filter(|e| e.0 == "service.ranking").map(|e| e.1.to_owned())

                    .nth(0);

                let param_service_ranking = param_service_ranking.and_then(|param_service_ranking| param_service_ranking.parse::<>().ok());
                let param_idp_url = query_params.iter().filter(|e| e.0 == "idpUrl").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_url = param_idp_url.and_then(|param_idp_url| param_idp_url.parse::<>().ok());
                let param_idp_cert_alias = query_params.iter().filter(|e| e.0 == "idpCertAlias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_cert_alias = param_idp_cert_alias.and_then(|param_idp_cert_alias| param_idp_cert_alias.parse::<>().ok());
                let param_idp_http_redirect = query_params.iter().filter(|e| e.0 == "idpHttpRedirect").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_http_redirect = param_idp_http_redirect.and_then(|param_idp_http_redirect| param_idp_http_redirect.parse::<>().ok());
                let param_service_provider_entity_id = query_params.iter().filter(|e| e.0 == "serviceProviderEntityId").map(|e| e.1.to_owned())

                    .nth(0);

                let param_service_provider_entity_id = param_service_provider_entity_id.and_then(|param_service_provider_entity_id| param_service_provider_entity_id.parse::<>().ok());
                let param_assertion_consumer_service_url = query_params.iter().filter(|e| e.0 == "assertionConsumerServiceURL").map(|e| e.1.to_owned())

                    .nth(0);

                let param_assertion_consumer_service_url = param_assertion_consumer_service_url.and_then(|param_assertion_consumer_service_url| param_assertion_consumer_service_url.parse::<>().ok());
                let param_sp_private_key_alias = query_params.iter().filter(|e| e.0 == "spPrivateKeyAlias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_sp_private_key_alias = param_sp_private_key_alias.and_then(|param_sp_private_key_alias| param_sp_private_key_alias.parse::<>().ok());
                let param_key_store_password = query_params.iter().filter(|e| e.0 == "keyStorePassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_key_store_password = param_key_store_password.and_then(|param_key_store_password| param_key_store_password.parse::<>().ok());
                let param_default_redirect_url = query_params.iter().filter(|e| e.0 == "defaultRedirectUrl").map(|e| e.1.to_owned())

                    .nth(0);

                let param_default_redirect_url = param_default_redirect_url.and_then(|param_default_redirect_url| param_default_redirect_url.parse::<>().ok());
                let param_user_id_attribute = query_params.iter().filter(|e| e.0 == "userIDAttribute").map(|e| e.1.to_owned())

                    .nth(0);

                let param_user_id_attribute = param_user_id_attribute.and_then(|param_user_id_attribute| param_user_id_attribute.parse::<>().ok());
                let param_use_encryption = query_params.iter().filter(|e| e.0 == "useEncryption").map(|e| e.1.to_owned())

                    .nth(0);

                let param_use_encryption = param_use_encryption.and_then(|param_use_encryption| param_use_encryption.parse::<>().ok());
                let param_create_user = query_params.iter().filter(|e| e.0 == "createUser").map(|e| e.1.to_owned())

                    .nth(0);

                let param_create_user = param_create_user.and_then(|param_create_user| param_create_user.parse::<>().ok());
                let param_add_group_memberships = query_params.iter().filter(|e| e.0 == "addGroupMemberships").map(|e| e.1.to_owned())

                    .nth(0);

                let param_add_group_memberships = param_add_group_memberships.and_then(|param_add_group_memberships| param_add_group_memberships.parse::<>().ok());
                let param_group_membership_attribute = query_params.iter().filter(|e| e.0 == "groupMembershipAttribute").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_membership_attribute = param_group_membership_attribute.and_then(|param_group_membership_attribute| param_group_membership_attribute.parse::<>().ok());
                let param_default_groups = query_params.iter().filter(|e| e.0 == "defaultGroups").map(|e| e.1.to_owned())
                    .filter_map(|param_default_groups| param_default_groups.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_default_groups = if !param_default_groups.is_empty() {
                    Some(param_default_groups)
                } else {
                    None
                };
                let param_name_id_format = query_params.iter().filter(|e| e.0 == "nameIdFormat").map(|e| e.1.to_owned())

                    .nth(0);

                let param_name_id_format = param_name_id_format.and_then(|param_name_id_format| param_name_id_format.parse::<>().ok());
                let param_synchronize_attributes = query_params.iter().filter(|e| e.0 == "synchronizeAttributes").map(|e| e.1.to_owned())
                    .filter_map(|param_synchronize_attributes| param_synchronize_attributes.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_synchronize_attributes = if !param_synchronize_attributes.is_empty() {
                    Some(param_synchronize_attributes)
                } else {
                    None
                };
                let param_handle_logout = query_params.iter().filter(|e| e.0 == "handleLogout").map(|e| e.1.to_owned())

                    .nth(0);

                let param_handle_logout = param_handle_logout.and_then(|param_handle_logout| param_handle_logout.parse::<>().ok());
                let param_logout_url = query_params.iter().filter(|e| e.0 == "logoutUrl").map(|e| e.1.to_owned())

                    .nth(0);

                let param_logout_url = param_logout_url.and_then(|param_logout_url| param_logout_url.parse::<>().ok());
                let param_clock_tolerance = query_params.iter().filter(|e| e.0 == "clockTolerance").map(|e| e.1.to_owned())

                    .nth(0);

                let param_clock_tolerance = param_clock_tolerance.and_then(|param_clock_tolerance| param_clock_tolerance.parse::<>().ok());
                let param_digest_method = query_params.iter().filter(|e| e.0 == "digestMethod").map(|e| e.1.to_owned())

                    .nth(0);

                let param_digest_method = param_digest_method.and_then(|param_digest_method| param_digest_method.parse::<>().ok());
                let param_signature_method = query_params.iter().filter(|e| e.0 == "signatureMethod").map(|e| e.1.to_owned())

                    .nth(0);

                let param_signature_method = param_signature_method.and_then(|param_signature_method| param_signature_method.parse::<>().ok());
                let param_user_intermediate_path = query_params.iter().filter(|e| e.0 == "userIntermediatePath").map(|e| e.1.to_owned())

                    .nth(0);

                let param_user_intermediate_path = param_user_intermediate_path.and_then(|param_user_intermediate_path| param_user_intermediate_path.parse::<>().ok());
                let param_propertylist = query_params.iter().filter(|e| e.0 == "propertylist").map(|e| e.1.to_owned())
                    .filter_map(|param_propertylist| param_propertylist.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_propertylist = if !param_propertylist.is_empty() {
                    Some(param_propertylist)
                } else {
                    None
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_saml_configuration(param_post, param_apply, param_delete, param_action, param_location, param_path.as_ref(), param_service_ranking, param_idp_url, param_idp_cert_alias, param_idp_http_redirect, param_service_provider_entity_id, param_assertion_consumer_service_url, param_sp_private_key_alias, param_key_store_password, param_default_redirect_url, param_user_id_attribute, param_use_encryption, param_create_user, param_add_group_memberships, param_group_membership_attribute, param_default_groups.as_ref(), param_name_id_format, param_synchronize_attributes.as_ref(), param_handle_logout, param_logout_url, param_clock_tolerance, param_digest_method, param_signature_method, param_user_intermediate_path, param_propertylist.as_ref(), &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostSamlConfigurationResponse::RetrievedAEMSAMLConfiguration

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_SAML_CONFIGURATION_RETRIEVED_AEMSAML_CONFIGURATION.clone()));


                                                    response.set_body(body);
                                                },
                                                PostSamlConfigurationResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(302).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_SAML_CONFIGURATION_DEFAULT_RESPONSE.clone()));


                                                    response.set_body(body);
                                                },
                                                PostSamlConfigurationResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_SAML_CONFIGURATION_DEFAULT_RESPONSE.clone()));


                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetLoginPage - GET /libs/granite/core/content/login.html
            &hyper::Method::Get if path.matched(paths::ID_LIBS_GRANITE_CORE_CONTENT_LOGIN_HTML) => {







                Box::new({
                        {{

                                Box::new(api_impl.get_login_page(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetLoginPageResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_LOGIN_PAGE_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostCqActions - POST /.cqactions.html
            &hyper::Method::Post if path.matched(paths::ID__CQACTIONS_HTML) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_authorizable_id = query_params.iter().filter(|e| e.0 == "authorizableId").map(|e| e.1.to_owned())

                    .nth(0);
                let param_authorizable_id = match param_authorizable_id {
                    Some(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter authorizableId - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter authorizableId"))),
                };
                let param_changelog = query_params.iter().filter(|e| e.0 == "changelog").map(|e| e.1.to_owned())

                    .nth(0);
                let param_changelog = match param_changelog {
                    Some(param_changelog) => match param_changelog.parse::<String>() {
                        Ok(param_changelog) => param_changelog,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter changelog - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter changelog"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_cq_actions(param_authorizable_id, param_changelog, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostCqActionsResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetCrxdeStatus - GET /crx/server/crx.default/jcr:root/.1.json
            &hyper::Method::Get if path.matched(paths::ID_CRX_SERVER_CRX_DEFAULT_JCRROOT__1_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                Box::new(api_impl.get_crxde_status(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetCrxdeStatusResponse::CRXDEIsEnabled

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_CRXDE_STATUS_CRXDE_IS_ENABLED.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetCrxdeStatusResponse::CRXDEIsDisabled

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_CRXDE_STATUS_CRXDE_IS_DISABLED.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetInstallStatus - GET /crx/packmgr/installstatus.jsp
            &hyper::Method::Get if path.matched(paths::ID_CRX_PACKMGR_INSTALLSTATUS_JSP) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                Box::new(api_impl.get_install_status(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetInstallStatusResponse::RetrievedCRXPackageManagerInstallStatus

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_INSTALL_STATUS_RETRIEVED_CRX_PACKAGE_MANAGER_INSTALL_STATUS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetInstallStatusResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_INSTALL_STATUS_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetPackageManagerServlet - GET /crx/packmgr/service/script.html
            &hyper::Method::Get if path.matched(paths::ID_CRX_PACKMGR_SERVICE_SCRIPT_HTML) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                Box::new(api_impl.get_package_manager_servlet(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPackageManagerServletResponse::PackageManagerServletIsDisabled

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PACKAGE_MANAGER_SERVLET_PACKAGE_MANAGER_SERVLET_IS_DISABLED.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetPackageManagerServletResponse::PackageManagerServletIsActive

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(405).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PACKAGE_MANAGER_SERVLET_PACKAGE_MANAGER_SERVLET_IS_ACTIVE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostPackageService - POST /crx/packmgr/service.jsp
            &hyper::Method::Post if path.matched(paths::ID_CRX_PACKMGR_SERVICE_JSP) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_cmd = query_params.iter().filter(|e| e.0 == "cmd").map(|e| e.1.to_owned())

                    .nth(0);
                let param_cmd = match param_cmd {
                    Some(param_cmd) => match param_cmd.parse::<String>() {
                        Ok(param_cmd) => param_cmd,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter cmd - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter cmd"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_package_service(param_cmd, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPackageServiceResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_PACKAGE_SERVICE_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostPackageServiceJson - POST /crx/packmgr/service/.json/{path}
            &hyper::Method::Post if path.matched(paths::ID_CRX_PACKMGR_SERVICE__JSON_PATH) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_CRX_PACKMGR_SERVICE__JSON_PATH
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CRX_PACKMGR_SERVICE__JSON_PATH in set but failed match against \"{}\"", path, paths::REGEX_CRX_PACKMGR_SERVICE__JSON_PATH.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter path: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_cmd = query_params.iter().filter(|e| e.0 == "cmd").map(|e| e.1.to_owned())

                    .nth(0);
                let param_cmd = match param_cmd {
                    Some(param_cmd) => match param_cmd.parse::<String>() {
                        Ok(param_cmd) => param_cmd,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter cmd - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter cmd"))),
                };
                let param_group_name = query_params.iter().filter(|e| e.0 == "groupName").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_name = param_group_name.and_then(|param_group_name| param_group_name.parse::<>().ok());
                let param_package_name = query_params.iter().filter(|e| e.0 == "packageName").map(|e| e.1.to_owned())

                    .nth(0);

                let param_package_name = param_package_name.and_then(|param_package_name| param_package_name.parse::<>().ok());
                let param_package_version = query_params.iter().filter(|e| e.0 == "packageVersion").map(|e| e.1.to_owned())

                    .nth(0);

                let param_package_version = param_package_version.and_then(|param_package_version| param_package_version.parse::<>().ok());
                let param__charset_ = query_params.iter().filter(|e| e.0 == "_charset_").map(|e| e.1.to_owned())

                    .nth(0);

                let param__charset_ = param__charset_.and_then(|param__charset_| param__charset_.parse::<>().ok());
                let param_force = query_params.iter().filter(|e| e.0 == "force").map(|e| e.1.to_owned())

                    .nth(0);

                let param_force = param_force.and_then(|param_force| param_force.parse::<>().ok());
                let param_recursive = query_params.iter().filter(|e| e.0 == "recursive").map(|e| e.1.to_owned())

                    .nth(0);

                let param_recursive = param_recursive.and_then(|param_recursive| param_recursive.parse::<>().ok());



                Box::new({
                        {{

                                // Form parameters
                                let param_package = Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")));

                                Box::new(api_impl.post_package_service_json(param_path, param_cmd, param_group_name, param_package_name, param_package_version, param__charset_, param_force, param_recursive, param_package, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPackageServiceJsonResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_PACKAGE_SERVICE_JSON_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostPackageUpdate - POST /crx/packmgr/update.jsp
            &hyper::Method::Post if path.matched(paths::ID_CRX_PACKMGR_UPDATE_JSP) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_group_name = query_params.iter().filter(|e| e.0 == "groupName").map(|e| e.1.to_owned())

                    .nth(0);
                let param_group_name = match param_group_name {
                    Some(param_group_name) => match param_group_name.parse::<String>() {
                        Ok(param_group_name) => param_group_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter groupName - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter groupName"))),
                };
                let param_package_name = query_params.iter().filter(|e| e.0 == "packageName").map(|e| e.1.to_owned())

                    .nth(0);
                let param_package_name = match param_package_name {
                    Some(param_package_name) => match param_package_name.parse::<String>() {
                        Ok(param_package_name) => param_package_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter packageName - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter packageName"))),
                };
                let param_version = query_params.iter().filter(|e| e.0 == "version").map(|e| e.1.to_owned())

                    .nth(0);
                let param_version = match param_version {
                    Some(param_version) => match param_version.parse::<String>() {
                        Ok(param_version) => param_version,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter version - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter version"))),
                };
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())

                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter path"))),
                };
                let param_filter = query_params.iter().filter(|e| e.0 == "filter").map(|e| e.1.to_owned())

                    .nth(0);

                let param_filter = param_filter.and_then(|param_filter| param_filter.parse::<>().ok());
                let param__charset_ = query_params.iter().filter(|e| e.0 == "_charset_").map(|e| e.1.to_owned())

                    .nth(0);

                let param__charset_ = param__charset_.and_then(|param__charset_| param__charset_.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_package_update(param_group_name, param_package_name, param_version, param_path, param_filter, param__charset_, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPackageUpdateResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_PACKAGE_UPDATE_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostSetPassword - POST /crx/explorer/ui/setpassword.jsp
            &hyper::Method::Post if path.matched(paths::ID_CRX_EXPLORER_UI_SETPASSWORD_JSP) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_old = query_params.iter().filter(|e| e.0 == "old").map(|e| e.1.to_owned())

                    .nth(0);
                let param_old = match param_old {
                    Some(param_old) => match param_old.parse::<String>() {
                        Ok(param_old) => param_old,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter old - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter old"))),
                };
                let param_plain = query_params.iter().filter(|e| e.0 == "plain").map(|e| e.1.to_owned())

                    .nth(0);
                let param_plain = match param_plain {
                    Some(param_plain) => match param_plain.parse::<String>() {
                        Ok(param_plain) => param_plain,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter plain - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter plain"))),
                };
                let param_verify = query_params.iter().filter(|e| e.0 == "verify").map(|e| e.1.to_owned())

                    .nth(0);
                let param_verify = match param_verify {
                    Some(param_verify) => match param_verify.parse::<String>() {
                        Ok(param_verify) => param_verify,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter verify - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter verify"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_set_password(param_old, param_plain, param_verify, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostSetPasswordResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_SET_PASSWORD_DEFAULT_RESPONSE.clone()));


                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAemHealthCheck - GET /system/health
            &hyper::Method::Get if path.matched(paths::ID_SYSTEM_HEALTH) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_tags = query_params.iter().filter(|e| e.0 == "tags").map(|e| e.1.to_owned())

                    .nth(0);

                let param_tags = param_tags.and_then(|param_tags| param_tags.parse::<>().ok());
                let param_combine_tags_or = query_params.iter().filter(|e| e.0 == "combineTagsOr").map(|e| e.1.to_owned())

                    .nth(0);

                let param_combine_tags_or = param_combine_tags_or.and_then(|param_combine_tags_or| param_combine_tags_or.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_aem_health_check(param_tags, param_combine_tags_or, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAemHealthCheckResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_AEM_HEALTH_CHECK_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigAemHealthCheckServlet - POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_HEALTHCHECK_HC_IMPL_ACTIVEBUNDLEHEALTHCHECK) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bundles_ignored = query_params.iter().filter(|e| e.0 == "bundles.ignored").map(|e| e.1.to_owned())
                    .filter_map(|param_bundles_ignored| param_bundles_ignored.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_bundles_ignored = if !param_bundles_ignored.is_empty() {
                    Some(param_bundles_ignored)
                } else {
                    None
                };
                let param_bundles_ignored_type_hint = query_params.iter().filter(|e| e.0 == "bundles.ignored@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_bundles_ignored_type_hint = param_bundles_ignored_type_hint.and_then(|param_bundles_ignored_type_hint| param_bundles_ignored_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_aem_health_check_servlet(param_bundles_ignored.as_ref(), param_bundles_ignored_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigAemHealthCheckServletResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigAemPasswordReset - POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_SHINESOLUTIONS_AEM_PASSWORDRESET_ACTIVATOR) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_pwdreset_authorizables = query_params.iter().filter(|e| e.0 == "pwdreset.authorizables").map(|e| e.1.to_owned())
                    .filter_map(|param_pwdreset_authorizables| param_pwdreset_authorizables.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_pwdreset_authorizables = if !param_pwdreset_authorizables.is_empty() {
                    Some(param_pwdreset_authorizables)
                } else {
                    None
                };
                let param_pwdreset_authorizables_type_hint = query_params.iter().filter(|e| e.0 == "pwdreset.authorizables@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_pwdreset_authorizables_type_hint = param_pwdreset_authorizables_type_hint.and_then(|param_pwdreset_authorizables_type_hint| param_pwdreset_authorizables_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_aem_password_reset(param_pwdreset_authorizables.as_ref(), param_pwdreset_authorizables_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigAemPasswordResetResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // DeleteAgent - DELETE /etc/replication/agents.{runmode}/{name}
            &hyper::Method::Delete if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE_NAME in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter runmode: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.delete_agent(param_runmode, param_name, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteAgentResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // DeleteNode - DELETE /{path}/{name}
            &hyper::Method::Delete if path.matched(paths::ID_PATH_NAME) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter path: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.delete_node(param_path, param_name, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteNodeResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAgent - GET /etc/replication/agents.{runmode}/{name}
            &hyper::Method::Get if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE_NAME in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter runmode: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_agent(param_runmode, param_name, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAgentResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAgents - GET /etc/replication/agents.{runmode}.-1.json
            &hyper::Method::Get if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE__1_JSON in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE__1_JSON.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter runmode: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_agents(param_runmode, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAgentsResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_AGENTS_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAuthorizableKeystore - GET /{intermediatePath}/{authorizableId}.ks.json
            &hyper::Method::Get if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON in set but failed match against \"{}\"", path, paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_JSON.as_str())
                    );

                let param_intermediate_path = match percent_encoding::percent_decode(path_params["intermediatePath"].as_bytes()).decode_utf8() {
                    Ok(param_intermediate_path) => match param_intermediate_path.parse::<String>() {
                        Ok(param_intermediate_path) => param_intermediate_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter intermediatePath: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["intermediatePath"]))))
                };
                let param_authorizable_id = match percent_encoding::percent_decode(path_params["authorizableId"].as_bytes()).decode_utf8() {
                    Ok(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter authorizableId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["authorizableId"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_authorizable_keystore(param_intermediate_path, param_authorizable_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_AUTHORIZABLE_KEYSTORE_RETRIEVED_AUTHORIZABLE_KEYSTORE_INFO.clone()));


                                                    response.set_body(body);
                                                },
                                                GetAuthorizableKeystoreResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_AUTHORIZABLE_KEYSTORE_DEFAULT_RESPONSE.clone()));


                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetKeystore - GET /{intermediatePath}/{authorizableId}/keystore/store.p12
            &hyper::Method::Get if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12 in set but failed match against \"{}\"", path, paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KEYSTORE_STORE_P12.as_str())
                    );

                let param_intermediate_path = match percent_encoding::percent_decode(path_params["intermediatePath"].as_bytes()).decode_utf8() {
                    Ok(param_intermediate_path) => match param_intermediate_path.parse::<String>() {
                        Ok(param_intermediate_path) => param_intermediate_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter intermediatePath: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["intermediatePath"]))))
                };
                let param_authorizable_id = match percent_encoding::percent_decode(path_params["authorizableId"].as_bytes()).decode_utf8() {
                    Ok(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter authorizableId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["authorizableId"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_keystore(param_intermediate_path, param_authorizable_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetKeystoreResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_KEYSTORE_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetNode - GET /{path}/{name}
            &hyper::Method::Get if path.matched(paths::ID_PATH_NAME) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter path: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_node(param_path, param_name, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetNodeResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetPackage - GET /etc/packages/{group}/{name}-{version}.zip
            &hyper::Method::Get if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_PACKAGES_GROUP_NAME_VERSION_ZIP in set but failed match against \"{}\"", path, paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP.as_str())
                    );

                let param_group = match percent_encoding::percent_decode(path_params["group"].as_bytes()).decode_utf8() {
                    Ok(param_group) => match param_group.parse::<String>() {
                        Ok(param_group) => param_group,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter group: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["group"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };
                let param_version = match percent_encoding::percent_decode(path_params["version"].as_bytes()).decode_utf8() {
                    Ok(param_version) => match param_version.parse::<String>() {
                        Ok(param_version) => param_version,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter version: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["version"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_package(param_group, param_name, param_version, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPackageResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PACKAGE_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetPackageFilter - GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json
            &hyper::Method::Get if path.matched(paths::ID_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON in set but failed match against \"{}\"", path, paths::REGEX_ETC_PACKAGES_GROUP_NAME_VERSION_ZIP_JCRCONTENT_VLTDEFINITION_FILTER_TIDY_2_JSON.as_str())
                    );

                let param_group = match percent_encoding::percent_decode(path_params["group"].as_bytes()).decode_utf8() {
                    Ok(param_group) => match param_group.parse::<String>() {
                        Ok(param_group) => param_group,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter group: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["group"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };
                let param_version = match percent_encoding::percent_decode(path_params["version"].as_bytes()).decode_utf8() {
                    Ok(param_version) => match param_version.parse::<String>() {
                        Ok(param_version) => param_version,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter version: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["version"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_package_filter(param_group, param_name, param_version, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPackageFilterResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PACKAGE_FILTER_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetQuery - GET /bin/querybuilder.json
            &hyper::Method::Get if path.matched(paths::ID_BIN_QUERYBUILDER_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())

                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter path"))),
                };
                let param_p_limit = query_params.iter().filter(|e| e.0 == "p.limit").map(|e| e.1.to_owned())

                    .nth(0);
                let param_p_limit = match param_p_limit {
                    Some(param_p_limit) => match param_p_limit.parse::<f64>() {
                        Ok(param_p_limit) => param_p_limit,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter p.limit - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter p.limit"))),
                };
                let param__1_property = query_params.iter().filter(|e| e.0 == "1_property").map(|e| e.1.to_owned())

                    .nth(0);
                let param__1_property = match param__1_property {
                    Some(param__1_property) => match param__1_property.parse::<String>() {
                        Ok(param__1_property) => param__1_property,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter 1_property - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter 1_property"))),
                };
                let param__1_property_value = query_params.iter().filter(|e| e.0 == "1_property.value").map(|e| e.1.to_owned())

                    .nth(0);
                let param__1_property_value = match param__1_property_value {
                    Some(param__1_property_value) => match param__1_property_value.parse::<String>() {
                        Ok(param__1_property_value) => param__1_property_value,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter 1_property.value - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter 1_property.value"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_query(param_path, param_p_limit, param__1_property, param__1_property_value, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetQueryResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_QUERY_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetTruststore - GET /etc/truststore/truststore.p12
            &hyper::Method::Get if path.matched(paths::ID_ETC_TRUSTSTORE_TRUSTSTORE_P12) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                Box::new(api_impl.get_truststore(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetTruststoreResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_TRUSTSTORE_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetTruststoreInfo - GET /libs/granite/security/truststore.json
            &hyper::Method::Get if path.matched(paths::ID_LIBS_GRANITE_SECURITY_TRUSTSTORE_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                Box::new(api_impl.get_truststore_info(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetTruststoreInfoResponse::RetrievedAEMTruststoreInfo

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_TRUSTSTORE_INFO_RETRIEVED_AEM_TRUSTSTORE_INFO.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetTruststoreInfoResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_TRUSTSTORE_INFO_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostAgent - POST /etc/replication/agents.{runmode}/{name}
            &hyper::Method::Post if path.matched(paths::ID_ETC_REPLICATION_AGENTS_RUNMODE_NAME) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ETC_REPLICATION_AGENTS_RUNMODE_NAME in set but failed match against \"{}\"", path, paths::REGEX_ETC_REPLICATION_AGENTS_RUNMODE_NAME.as_str())
                    );

                let param_runmode = match percent_encoding::percent_decode(path_params["runmode"].as_bytes()).decode_utf8() {
                    Ok(param_runmode) => match param_runmode.parse::<String>() {
                        Ok(param_runmode) => param_runmode,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter runmode: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["runmode"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_jcrcontentcqdistribute = query_params.iter().filter(|e| e.0 == "jcr:content/cq:distribute").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentcqdistribute = param_jcrcontentcqdistribute.and_then(|param_jcrcontentcqdistribute| param_jcrcontentcqdistribute.parse::<>().ok());
                let param_jcrcontentcqdistribute_type_hint = query_params.iter().filter(|e| e.0 == "jcr:content/cq:distribute@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentcqdistribute_type_hint = param_jcrcontentcqdistribute_type_hint.and_then(|param_jcrcontentcqdistribute_type_hint| param_jcrcontentcqdistribute_type_hint.parse::<>().ok());
                let param_jcrcontentcqname = query_params.iter().filter(|e| e.0 == "jcr:content/cq:name").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentcqname = param_jcrcontentcqname.and_then(|param_jcrcontentcqname| param_jcrcontentcqname.parse::<>().ok());
                let param_jcrcontentcqtemplate = query_params.iter().filter(|e| e.0 == "jcr:content/cq:template").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentcqtemplate = param_jcrcontentcqtemplate.and_then(|param_jcrcontentcqtemplate| param_jcrcontentcqtemplate.parse::<>().ok());
                let param_jcrcontentenabled = query_params.iter().filter(|e| e.0 == "jcr:content/enabled").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentenabled = param_jcrcontentenabled.and_then(|param_jcrcontentenabled| param_jcrcontentenabled.parse::<>().ok());
                let param_jcrcontentjcrdescription = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:description").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentjcrdescription = param_jcrcontentjcrdescription.and_then(|param_jcrcontentjcrdescription| param_jcrcontentjcrdescription.parse::<>().ok());
                let param_jcrcontentjcrlast_modified = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:lastModified").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentjcrlast_modified = param_jcrcontentjcrlast_modified.and_then(|param_jcrcontentjcrlast_modified| param_jcrcontentjcrlast_modified.parse::<>().ok());
                let param_jcrcontentjcrlast_modified_by = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:lastModifiedBy").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentjcrlast_modified_by = param_jcrcontentjcrlast_modified_by.and_then(|param_jcrcontentjcrlast_modified_by| param_jcrcontentjcrlast_modified_by.parse::<>().ok());
                let param_jcrcontentjcrmixin_types = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:mixinTypes").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentjcrmixin_types = param_jcrcontentjcrmixin_types.and_then(|param_jcrcontentjcrmixin_types| param_jcrcontentjcrmixin_types.parse::<>().ok());
                let param_jcrcontentjcrtitle = query_params.iter().filter(|e| e.0 == "jcr:content/jcr:title").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentjcrtitle = param_jcrcontentjcrtitle.and_then(|param_jcrcontentjcrtitle| param_jcrcontentjcrtitle.parse::<>().ok());
                let param_jcrcontentlog_level = query_params.iter().filter(|e| e.0 == "jcr:content/logLevel").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentlog_level = param_jcrcontentlog_level.and_then(|param_jcrcontentlog_level| param_jcrcontentlog_level.parse::<>().ok());
                let param_jcrcontentno_status_update = query_params.iter().filter(|e| e.0 == "jcr:content/noStatusUpdate").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentno_status_update = param_jcrcontentno_status_update.and_then(|param_jcrcontentno_status_update| param_jcrcontentno_status_update.parse::<>().ok());
                let param_jcrcontentno_versioning = query_params.iter().filter(|e| e.0 == "jcr:content/noVersioning").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentno_versioning = param_jcrcontentno_versioning.and_then(|param_jcrcontentno_versioning| param_jcrcontentno_versioning.parse::<>().ok());
                let param_jcrcontentprotocol_connect_timeout = query_params.iter().filter(|e| e.0 == "jcr:content/protocolConnectTimeout").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_connect_timeout = param_jcrcontentprotocol_connect_timeout.and_then(|param_jcrcontentprotocol_connect_timeout| param_jcrcontentprotocol_connect_timeout.parse::<>().ok());
                let param_jcrcontentprotocol_http_connection_closed = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPConnectionClosed").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_http_connection_closed = param_jcrcontentprotocol_http_connection_closed.and_then(|param_jcrcontentprotocol_http_connection_closed| param_jcrcontentprotocol_http_connection_closed.parse::<>().ok());
                let param_jcrcontentprotocol_http_expired = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPExpired").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_http_expired = param_jcrcontentprotocol_http_expired.and_then(|param_jcrcontentprotocol_http_expired| param_jcrcontentprotocol_http_expired.parse::<>().ok());
                let param_jcrcontentprotocol_http_headers = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPHeaders").map(|e| e.1.to_owned())
                    .filter_map(|param_jcrcontentprotocol_http_headers| param_jcrcontentprotocol_http_headers.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_jcrcontentprotocol_http_headers = if !param_jcrcontentprotocol_http_headers.is_empty() {
                    Some(param_jcrcontentprotocol_http_headers)
                } else {
                    None
                };
                let param_jcrcontentprotocol_http_headers_type_hint = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPHeaders@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_http_headers_type_hint = param_jcrcontentprotocol_http_headers_type_hint.and_then(|param_jcrcontentprotocol_http_headers_type_hint| param_jcrcontentprotocol_http_headers_type_hint.parse::<>().ok());
                let param_jcrcontentprotocol_http_method = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPMethod").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_http_method = param_jcrcontentprotocol_http_method.and_then(|param_jcrcontentprotocol_http_method| param_jcrcontentprotocol_http_method.parse::<>().ok());
                let param_jcrcontentprotocol_https_relaxed = query_params.iter().filter(|e| e.0 == "jcr:content/protocolHTTPSRelaxed").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_https_relaxed = param_jcrcontentprotocol_https_relaxed.and_then(|param_jcrcontentprotocol_https_relaxed| param_jcrcontentprotocol_https_relaxed.parse::<>().ok());
                let param_jcrcontentprotocol_interface = query_params.iter().filter(|e| e.0 == "jcr:content/protocolInterface").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_interface = param_jcrcontentprotocol_interface.and_then(|param_jcrcontentprotocol_interface| param_jcrcontentprotocol_interface.parse::<>().ok());
                let param_jcrcontentprotocol_socket_timeout = query_params.iter().filter(|e| e.0 == "jcr:content/protocolSocketTimeout").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_socket_timeout = param_jcrcontentprotocol_socket_timeout.and_then(|param_jcrcontentprotocol_socket_timeout| param_jcrcontentprotocol_socket_timeout.parse::<>().ok());
                let param_jcrcontentprotocol_version = query_params.iter().filter(|e| e.0 == "jcr:content/protocolVersion").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentprotocol_version = param_jcrcontentprotocol_version.and_then(|param_jcrcontentprotocol_version| param_jcrcontentprotocol_version.parse::<>().ok());
                let param_jcrcontentproxy_ntlm_domain = query_params.iter().filter(|e| e.0 == "jcr:content/proxyNTLMDomain").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentproxy_ntlm_domain = param_jcrcontentproxy_ntlm_domain.and_then(|param_jcrcontentproxy_ntlm_domain| param_jcrcontentproxy_ntlm_domain.parse::<>().ok());
                let param_jcrcontentproxy_ntlm_host = query_params.iter().filter(|e| e.0 == "jcr:content/proxyNTLMHost").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentproxy_ntlm_host = param_jcrcontentproxy_ntlm_host.and_then(|param_jcrcontentproxy_ntlm_host| param_jcrcontentproxy_ntlm_host.parse::<>().ok());
                let param_jcrcontentproxy_host = query_params.iter().filter(|e| e.0 == "jcr:content/proxyHost").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentproxy_host = param_jcrcontentproxy_host.and_then(|param_jcrcontentproxy_host| param_jcrcontentproxy_host.parse::<>().ok());
                let param_jcrcontentproxy_password = query_params.iter().filter(|e| e.0 == "jcr:content/proxyPassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentproxy_password = param_jcrcontentproxy_password.and_then(|param_jcrcontentproxy_password| param_jcrcontentproxy_password.parse::<>().ok());
                let param_jcrcontentproxy_port = query_params.iter().filter(|e| e.0 == "jcr:content/proxyPort").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentproxy_port = param_jcrcontentproxy_port.and_then(|param_jcrcontentproxy_port| param_jcrcontentproxy_port.parse::<>().ok());
                let param_jcrcontentproxy_user = query_params.iter().filter(|e| e.0 == "jcr:content/proxyUser").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentproxy_user = param_jcrcontentproxy_user.and_then(|param_jcrcontentproxy_user| param_jcrcontentproxy_user.parse::<>().ok());
                let param_jcrcontentqueue_batch_max_size = query_params.iter().filter(|e| e.0 == "jcr:content/queueBatchMaxSize").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentqueue_batch_max_size = param_jcrcontentqueue_batch_max_size.and_then(|param_jcrcontentqueue_batch_max_size| param_jcrcontentqueue_batch_max_size.parse::<>().ok());
                let param_jcrcontentqueue_batch_mode = query_params.iter().filter(|e| e.0 == "jcr:content/queueBatchMode").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentqueue_batch_mode = param_jcrcontentqueue_batch_mode.and_then(|param_jcrcontentqueue_batch_mode| param_jcrcontentqueue_batch_mode.parse::<>().ok());
                let param_jcrcontentqueue_batch_wait_time = query_params.iter().filter(|e| e.0 == "jcr:content/queueBatchWaitTime").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentqueue_batch_wait_time = param_jcrcontentqueue_batch_wait_time.and_then(|param_jcrcontentqueue_batch_wait_time| param_jcrcontentqueue_batch_wait_time.parse::<>().ok());
                let param_jcrcontentretry_delay = query_params.iter().filter(|e| e.0 == "jcr:content/retryDelay").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentretry_delay = param_jcrcontentretry_delay.and_then(|param_jcrcontentretry_delay| param_jcrcontentretry_delay.parse::<>().ok());
                let param_jcrcontentreverse_replication = query_params.iter().filter(|e| e.0 == "jcr:content/reverseReplication").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentreverse_replication = param_jcrcontentreverse_replication.and_then(|param_jcrcontentreverse_replication| param_jcrcontentreverse_replication.parse::<>().ok());
                let param_jcrcontentserialization_type = query_params.iter().filter(|e| e.0 == "jcr:content/serializationType").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentserialization_type = param_jcrcontentserialization_type.and_then(|param_jcrcontentserialization_type| param_jcrcontentserialization_type.parse::<>().ok());
                let param_jcrcontentslingresource_type = query_params.iter().filter(|e| e.0 == "jcr:content/sling:resourceType").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentslingresource_type = param_jcrcontentslingresource_type.and_then(|param_jcrcontentslingresource_type| param_jcrcontentslingresource_type.parse::<>().ok());
                let param_jcrcontentssl = query_params.iter().filter(|e| e.0 == "jcr:content/ssl").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentssl = param_jcrcontentssl.and_then(|param_jcrcontentssl| param_jcrcontentssl.parse::<>().ok());
                let param_jcrcontenttransport_ntlm_domain = query_params.iter().filter(|e| e.0 == "jcr:content/transportNTLMDomain").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttransport_ntlm_domain = param_jcrcontenttransport_ntlm_domain.and_then(|param_jcrcontenttransport_ntlm_domain| param_jcrcontenttransport_ntlm_domain.parse::<>().ok());
                let param_jcrcontenttransport_ntlm_host = query_params.iter().filter(|e| e.0 == "jcr:content/transportNTLMHost").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttransport_ntlm_host = param_jcrcontenttransport_ntlm_host.and_then(|param_jcrcontenttransport_ntlm_host| param_jcrcontenttransport_ntlm_host.parse::<>().ok());
                let param_jcrcontenttransport_password = query_params.iter().filter(|e| e.0 == "jcr:content/transportPassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttransport_password = param_jcrcontenttransport_password.and_then(|param_jcrcontenttransport_password| param_jcrcontenttransport_password.parse::<>().ok());
                let param_jcrcontenttransport_uri = query_params.iter().filter(|e| e.0 == "jcr:content/transportUri").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttransport_uri = param_jcrcontenttransport_uri.and_then(|param_jcrcontenttransport_uri| param_jcrcontenttransport_uri.parse::<>().ok());
                let param_jcrcontenttransport_user = query_params.iter().filter(|e| e.0 == "jcr:content/transportUser").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttransport_user = param_jcrcontenttransport_user.and_then(|param_jcrcontenttransport_user| param_jcrcontenttransport_user.parse::<>().ok());
                let param_jcrcontenttrigger_distribute = query_params.iter().filter(|e| e.0 == "jcr:content/triggerDistribute").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttrigger_distribute = param_jcrcontenttrigger_distribute.and_then(|param_jcrcontenttrigger_distribute| param_jcrcontenttrigger_distribute.parse::<>().ok());
                let param_jcrcontenttrigger_modified = query_params.iter().filter(|e| e.0 == "jcr:content/triggerModified").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttrigger_modified = param_jcrcontenttrigger_modified.and_then(|param_jcrcontenttrigger_modified| param_jcrcontenttrigger_modified.parse::<>().ok());
                let param_jcrcontenttrigger_on_off_time = query_params.iter().filter(|e| e.0 == "jcr:content/triggerOnOffTime").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttrigger_on_off_time = param_jcrcontenttrigger_on_off_time.and_then(|param_jcrcontenttrigger_on_off_time| param_jcrcontenttrigger_on_off_time.parse::<>().ok());
                let param_jcrcontenttrigger_receive = query_params.iter().filter(|e| e.0 == "jcr:content/triggerReceive").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttrigger_receive = param_jcrcontenttrigger_receive.and_then(|param_jcrcontenttrigger_receive| param_jcrcontenttrigger_receive.parse::<>().ok());
                let param_jcrcontenttrigger_specific = query_params.iter().filter(|e| e.0 == "jcr:content/triggerSpecific").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontenttrigger_specific = param_jcrcontenttrigger_specific.and_then(|param_jcrcontenttrigger_specific| param_jcrcontenttrigger_specific.parse::<>().ok());
                let param_jcrcontentuser_id = query_params.iter().filter(|e| e.0 == "jcr:content/userId").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrcontentuser_id = param_jcrcontentuser_id.and_then(|param_jcrcontentuser_id| param_jcrcontentuser_id.parse::<>().ok());
                let param_jcrprimary_type = query_params.iter().filter(|e| e.0 == "jcr:primaryType").map(|e| e.1.to_owned())

                    .nth(0);

                let param_jcrprimary_type = param_jcrprimary_type.and_then(|param_jcrprimary_type| param_jcrprimary_type.parse::<>().ok());
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())

                    .nth(0);

                let param_operation = param_operation.and_then(|param_operation| param_operation.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_agent(param_runmode, param_name, param_jcrcontentcqdistribute, param_jcrcontentcqdistribute_type_hint, param_jcrcontentcqname, param_jcrcontentcqtemplate, param_jcrcontentenabled, param_jcrcontentjcrdescription, param_jcrcontentjcrlast_modified, param_jcrcontentjcrlast_modified_by, param_jcrcontentjcrmixin_types, param_jcrcontentjcrtitle, param_jcrcontentlog_level, param_jcrcontentno_status_update, param_jcrcontentno_versioning, param_jcrcontentprotocol_connect_timeout, param_jcrcontentprotocol_http_connection_closed, param_jcrcontentprotocol_http_expired, param_jcrcontentprotocol_http_headers.as_ref(), param_jcrcontentprotocol_http_headers_type_hint, param_jcrcontentprotocol_http_method, param_jcrcontentprotocol_https_relaxed, param_jcrcontentprotocol_interface, param_jcrcontentprotocol_socket_timeout, param_jcrcontentprotocol_version, param_jcrcontentproxy_ntlm_domain, param_jcrcontentproxy_ntlm_host, param_jcrcontentproxy_host, param_jcrcontentproxy_password, param_jcrcontentproxy_port, param_jcrcontentproxy_user, param_jcrcontentqueue_batch_max_size, param_jcrcontentqueue_batch_mode, param_jcrcontentqueue_batch_wait_time, param_jcrcontentretry_delay, param_jcrcontentreverse_replication, param_jcrcontentserialization_type, param_jcrcontentslingresource_type, param_jcrcontentssl, param_jcrcontenttransport_ntlm_domain, param_jcrcontenttransport_ntlm_host, param_jcrcontenttransport_password, param_jcrcontenttransport_uri, param_jcrcontenttransport_user, param_jcrcontenttrigger_distribute, param_jcrcontenttrigger_modified, param_jcrcontenttrigger_on_off_time, param_jcrcontenttrigger_receive, param_jcrcontenttrigger_specific, param_jcrcontentuser_id, param_jcrprimary_type, param_operation, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostAgentResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostAuthorizableKeystore - POST /{intermediatePath}/{authorizableId}.ks.html
            &hyper::Method::Post if path.matched(paths::ID_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML in set but failed match against \"{}\"", path, paths::REGEX_INTERMEDIATEPATH_AUTHORIZABLEID_KS_HTML.as_str())
                    );

                let param_intermediate_path = match percent_encoding::percent_decode(path_params["intermediatePath"].as_bytes()).decode_utf8() {
                    Ok(param_intermediate_path) => match param_intermediate_path.parse::<String>() {
                        Ok(param_intermediate_path) => param_intermediate_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter intermediatePath: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["intermediatePath"]))))
                };
                let param_authorizable_id = match percent_encoding::percent_decode(path_params["authorizableId"].as_bytes()).decode_utf8() {
                    Ok(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter authorizableId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["authorizableId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())

                    .nth(0);

                let param_operation = param_operation.and_then(|param_operation| param_operation.parse::<>().ok());
                let param_current_password = query_params.iter().filter(|e| e.0 == "currentPassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_current_password = param_current_password.and_then(|param_current_password| param_current_password.parse::<>().ok());
                let param_new_password = query_params.iter().filter(|e| e.0 == "newPassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_new_password = param_new_password.and_then(|param_new_password| param_new_password.parse::<>().ok());
                let param_re_password = query_params.iter().filter(|e| e.0 == "rePassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_re_password = param_re_password.and_then(|param_re_password| param_re_password.parse::<>().ok());
                let param_key_password = query_params.iter().filter(|e| e.0 == "keyPassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_key_password = param_key_password.and_then(|param_key_password| param_key_password.parse::<>().ok());
                let param_key_store_pass = query_params.iter().filter(|e| e.0 == "keyStorePass").map(|e| e.1.to_owned())

                    .nth(0);

                let param_key_store_pass = param_key_store_pass.and_then(|param_key_store_pass| param_key_store_pass.parse::<>().ok());
                let param_alias = query_params.iter().filter(|e| e.0 == "alias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_alias = param_alias.and_then(|param_alias| param_alias.parse::<>().ok());
                let param_new_alias = query_params.iter().filter(|e| e.0 == "newAlias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_new_alias = param_new_alias.and_then(|param_new_alias| param_new_alias.parse::<>().ok());
                let param_remove_alias = query_params.iter().filter(|e| e.0 == "removeAlias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_remove_alias = param_remove_alias.and_then(|param_remove_alias| param_remove_alias.parse::<>().ok());



                Box::new({
                        {{

                                // Form parameters
                                let param_cert_chain = Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")));
                                let param_pk = Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")));
                                let param_key_store = Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")));

                                Box::new(api_impl.post_authorizable_keystore(param_intermediate_path, param_authorizable_id, param_operation, param_current_password, param_new_password, param_re_password, param_key_password, param_key_store_pass, param_alias, param_new_alias, param_remove_alias, param_cert_chain, param_pk, param_key_store, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_AUTHORIZABLE_KEYSTORE_RETRIEVED_AUTHORIZABLE_KEYSTORE_INFO.clone()));


                                                    response.set_body(body);
                                                },
                                                PostAuthorizableKeystoreResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_AUTHORIZABLE_KEYSTORE_DEFAULT_RESPONSE.clone()));


                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostAuthorizables - POST /libs/granite/security/post/authorizables
            &hyper::Method::Post if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_AUTHORIZABLES) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_authorizable_id = query_params.iter().filter(|e| e.0 == "authorizableId").map(|e| e.1.to_owned())

                    .nth(0);
                let param_authorizable_id = match param_authorizable_id {
                    Some(param_authorizable_id) => match param_authorizable_id.parse::<String>() {
                        Ok(param_authorizable_id) => param_authorizable_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter authorizableId - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter authorizableId"))),
                };
                let param_intermediate_path = query_params.iter().filter(|e| e.0 == "intermediatePath").map(|e| e.1.to_owned())

                    .nth(0);
                let param_intermediate_path = match param_intermediate_path {
                    Some(param_intermediate_path) => match param_intermediate_path.parse::<String>() {
                        Ok(param_intermediate_path) => param_intermediate_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter intermediatePath - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter intermediatePath"))),
                };
                let param_create_user = query_params.iter().filter(|e| e.0 == "createUser").map(|e| e.1.to_owned())

                    .nth(0);

                let param_create_user = param_create_user.and_then(|param_create_user| param_create_user.parse::<>().ok());
                let param_create_group = query_params.iter().filter(|e| e.0 == "createGroup").map(|e| e.1.to_owned())

                    .nth(0);

                let param_create_group = param_create_group.and_then(|param_create_group| param_create_group.parse::<>().ok());
                let param_reppassword = query_params.iter().filter(|e| e.0 == "rep:password").map(|e| e.1.to_owned())

                    .nth(0);

                let param_reppassword = param_reppassword.and_then(|param_reppassword| param_reppassword.parse::<>().ok());
                let param_profilegiven_name = query_params.iter().filter(|e| e.0 == "profile/givenName").map(|e| e.1.to_owned())

                    .nth(0);

                let param_profilegiven_name = param_profilegiven_name.and_then(|param_profilegiven_name| param_profilegiven_name.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_authorizables(param_authorizable_id, param_intermediate_path, param_create_user, param_create_group, param_reppassword, param_profilegiven_name, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostAuthorizablesResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_AUTHORIZABLES_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigAdobeGraniteSamlAuthenticationHandler - POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_COM_ADOBE_GRANITE_AUTH_SAML_SAMLAUTHENTICATIONHANDLER_CONFIG) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_key_store_password = query_params.iter().filter(|e| e.0 == "keyStorePassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_key_store_password = param_key_store_password.and_then(|param_key_store_password| param_key_store_password.parse::<>().ok());
                let param_key_store_password_type_hint = query_params.iter().filter(|e| e.0 == "keyStorePassword@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_key_store_password_type_hint = param_key_store_password_type_hint.and_then(|param_key_store_password_type_hint| param_key_store_password_type_hint.parse::<>().ok());
                let param_service_ranking = query_params.iter().filter(|e| e.0 == "service.ranking").map(|e| e.1.to_owned())

                    .nth(0);

                let param_service_ranking = param_service_ranking.and_then(|param_service_ranking| param_service_ranking.parse::<>().ok());
                let param_service_ranking_type_hint = query_params.iter().filter(|e| e.0 == "service.ranking@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_service_ranking_type_hint = param_service_ranking_type_hint.and_then(|param_service_ranking_type_hint| param_service_ranking_type_hint.parse::<>().ok());
                let param_idp_http_redirect = query_params.iter().filter(|e| e.0 == "idpHttpRedirect").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_http_redirect = param_idp_http_redirect.and_then(|param_idp_http_redirect| param_idp_http_redirect.parse::<>().ok());
                let param_idp_http_redirect_type_hint = query_params.iter().filter(|e| e.0 == "idpHttpRedirect@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_http_redirect_type_hint = param_idp_http_redirect_type_hint.and_then(|param_idp_http_redirect_type_hint| param_idp_http_redirect_type_hint.parse::<>().ok());
                let param_create_user = query_params.iter().filter(|e| e.0 == "createUser").map(|e| e.1.to_owned())

                    .nth(0);

                let param_create_user = param_create_user.and_then(|param_create_user| param_create_user.parse::<>().ok());
                let param_create_user_type_hint = query_params.iter().filter(|e| e.0 == "createUser@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_create_user_type_hint = param_create_user_type_hint.and_then(|param_create_user_type_hint| param_create_user_type_hint.parse::<>().ok());
                let param_default_redirect_url = query_params.iter().filter(|e| e.0 == "defaultRedirectUrl").map(|e| e.1.to_owned())

                    .nth(0);

                let param_default_redirect_url = param_default_redirect_url.and_then(|param_default_redirect_url| param_default_redirect_url.parse::<>().ok());
                let param_default_redirect_url_type_hint = query_params.iter().filter(|e| e.0 == "defaultRedirectUrl@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_default_redirect_url_type_hint = param_default_redirect_url_type_hint.and_then(|param_default_redirect_url_type_hint| param_default_redirect_url_type_hint.parse::<>().ok());
                let param_user_id_attribute = query_params.iter().filter(|e| e.0 == "userIDAttribute").map(|e| e.1.to_owned())

                    .nth(0);

                let param_user_id_attribute = param_user_id_attribute.and_then(|param_user_id_attribute| param_user_id_attribute.parse::<>().ok());
                let param_user_id_attribute_type_hint = query_params.iter().filter(|e| e.0 == "userIDAttribute@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_user_id_attribute_type_hint = param_user_id_attribute_type_hint.and_then(|param_user_id_attribute_type_hint| param_user_id_attribute_type_hint.parse::<>().ok());
                let param_default_groups = query_params.iter().filter(|e| e.0 == "defaultGroups").map(|e| e.1.to_owned())
                    .filter_map(|param_default_groups| param_default_groups.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_default_groups = if !param_default_groups.is_empty() {
                    Some(param_default_groups)
                } else {
                    None
                };
                let param_default_groups_type_hint = query_params.iter().filter(|e| e.0 == "defaultGroups@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_default_groups_type_hint = param_default_groups_type_hint.and_then(|param_default_groups_type_hint| param_default_groups_type_hint.parse::<>().ok());
                let param_idp_cert_alias = query_params.iter().filter(|e| e.0 == "idpCertAlias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_cert_alias = param_idp_cert_alias.and_then(|param_idp_cert_alias| param_idp_cert_alias.parse::<>().ok());
                let param_idp_cert_alias_type_hint = query_params.iter().filter(|e| e.0 == "idpCertAlias@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_cert_alias_type_hint = param_idp_cert_alias_type_hint.and_then(|param_idp_cert_alias_type_hint| param_idp_cert_alias_type_hint.parse::<>().ok());
                let param_add_group_memberships = query_params.iter().filter(|e| e.0 == "addGroupMemberships").map(|e| e.1.to_owned())

                    .nth(0);

                let param_add_group_memberships = param_add_group_memberships.and_then(|param_add_group_memberships| param_add_group_memberships.parse::<>().ok());
                let param_add_group_memberships_type_hint = query_params.iter().filter(|e| e.0 == "addGroupMemberships@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_add_group_memberships_type_hint = param_add_group_memberships_type_hint.and_then(|param_add_group_memberships_type_hint| param_add_group_memberships_type_hint.parse::<>().ok());
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())
                    .filter_map(|param_path| param_path.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_path = if !param_path.is_empty() {
                    Some(param_path)
                } else {
                    None
                };
                let param_path_type_hint = query_params.iter().filter(|e| e.0 == "path@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_path_type_hint = param_path_type_hint.and_then(|param_path_type_hint| param_path_type_hint.parse::<>().ok());
                let param_synchronize_attributes = query_params.iter().filter(|e| e.0 == "synchronizeAttributes").map(|e| e.1.to_owned())
                    .filter_map(|param_synchronize_attributes| param_synchronize_attributes.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_synchronize_attributes = if !param_synchronize_attributes.is_empty() {
                    Some(param_synchronize_attributes)
                } else {
                    None
                };
                let param_synchronize_attributes_type_hint = query_params.iter().filter(|e| e.0 == "synchronizeAttributes@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_synchronize_attributes_type_hint = param_synchronize_attributes_type_hint.and_then(|param_synchronize_attributes_type_hint| param_synchronize_attributes_type_hint.parse::<>().ok());
                let param_clock_tolerance = query_params.iter().filter(|e| e.0 == "clockTolerance").map(|e| e.1.to_owned())

                    .nth(0);

                let param_clock_tolerance = param_clock_tolerance.and_then(|param_clock_tolerance| param_clock_tolerance.parse::<>().ok());
                let param_clock_tolerance_type_hint = query_params.iter().filter(|e| e.0 == "clockTolerance@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_clock_tolerance_type_hint = param_clock_tolerance_type_hint.and_then(|param_clock_tolerance_type_hint| param_clock_tolerance_type_hint.parse::<>().ok());
                let param_group_membership_attribute = query_params.iter().filter(|e| e.0 == "groupMembershipAttribute").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_membership_attribute = param_group_membership_attribute.and_then(|param_group_membership_attribute| param_group_membership_attribute.parse::<>().ok());
                let param_group_membership_attribute_type_hint = query_params.iter().filter(|e| e.0 == "groupMembershipAttribute@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_membership_attribute_type_hint = param_group_membership_attribute_type_hint.and_then(|param_group_membership_attribute_type_hint| param_group_membership_attribute_type_hint.parse::<>().ok());
                let param_idp_url = query_params.iter().filter(|e| e.0 == "idpUrl").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_url = param_idp_url.and_then(|param_idp_url| param_idp_url.parse::<>().ok());
                let param_idp_url_type_hint = query_params.iter().filter(|e| e.0 == "idpUrl@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_idp_url_type_hint = param_idp_url_type_hint.and_then(|param_idp_url_type_hint| param_idp_url_type_hint.parse::<>().ok());
                let param_logout_url = query_params.iter().filter(|e| e.0 == "logoutUrl").map(|e| e.1.to_owned())

                    .nth(0);

                let param_logout_url = param_logout_url.and_then(|param_logout_url| param_logout_url.parse::<>().ok());
                let param_logout_url_type_hint = query_params.iter().filter(|e| e.0 == "logoutUrl@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_logout_url_type_hint = param_logout_url_type_hint.and_then(|param_logout_url_type_hint| param_logout_url_type_hint.parse::<>().ok());
                let param_service_provider_entity_id = query_params.iter().filter(|e| e.0 == "serviceProviderEntityId").map(|e| e.1.to_owned())

                    .nth(0);

                let param_service_provider_entity_id = param_service_provider_entity_id.and_then(|param_service_provider_entity_id| param_service_provider_entity_id.parse::<>().ok());
                let param_service_provider_entity_id_type_hint = query_params.iter().filter(|e| e.0 == "serviceProviderEntityId@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_service_provider_entity_id_type_hint = param_service_provider_entity_id_type_hint.and_then(|param_service_provider_entity_id_type_hint| param_service_provider_entity_id_type_hint.parse::<>().ok());
                let param_assertion_consumer_service_url = query_params.iter().filter(|e| e.0 == "assertionConsumerServiceURL").map(|e| e.1.to_owned())

                    .nth(0);

                let param_assertion_consumer_service_url = param_assertion_consumer_service_url.and_then(|param_assertion_consumer_service_url| param_assertion_consumer_service_url.parse::<>().ok());
                let param_assertion_consumer_service_url_type_hint = query_params.iter().filter(|e| e.0 == "assertionConsumerServiceURL@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_assertion_consumer_service_url_type_hint = param_assertion_consumer_service_url_type_hint.and_then(|param_assertion_consumer_service_url_type_hint| param_assertion_consumer_service_url_type_hint.parse::<>().ok());
                let param_handle_logout = query_params.iter().filter(|e| e.0 == "handleLogout").map(|e| e.1.to_owned())

                    .nth(0);

                let param_handle_logout = param_handle_logout.and_then(|param_handle_logout| param_handle_logout.parse::<>().ok());
                let param_handle_logout_type_hint = query_params.iter().filter(|e| e.0 == "handleLogout@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_handle_logout_type_hint = param_handle_logout_type_hint.and_then(|param_handle_logout_type_hint| param_handle_logout_type_hint.parse::<>().ok());
                let param_sp_private_key_alias = query_params.iter().filter(|e| e.0 == "spPrivateKeyAlias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_sp_private_key_alias = param_sp_private_key_alias.and_then(|param_sp_private_key_alias| param_sp_private_key_alias.parse::<>().ok());
                let param_sp_private_key_alias_type_hint = query_params.iter().filter(|e| e.0 == "spPrivateKeyAlias@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_sp_private_key_alias_type_hint = param_sp_private_key_alias_type_hint.and_then(|param_sp_private_key_alias_type_hint| param_sp_private_key_alias_type_hint.parse::<>().ok());
                let param_use_encryption = query_params.iter().filter(|e| e.0 == "useEncryption").map(|e| e.1.to_owned())

                    .nth(0);

                let param_use_encryption = param_use_encryption.and_then(|param_use_encryption| param_use_encryption.parse::<>().ok());
                let param_use_encryption_type_hint = query_params.iter().filter(|e| e.0 == "useEncryption@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_use_encryption_type_hint = param_use_encryption_type_hint.and_then(|param_use_encryption_type_hint| param_use_encryption_type_hint.parse::<>().ok());
                let param_name_id_format = query_params.iter().filter(|e| e.0 == "nameIdFormat").map(|e| e.1.to_owned())

                    .nth(0);

                let param_name_id_format = param_name_id_format.and_then(|param_name_id_format| param_name_id_format.parse::<>().ok());
                let param_name_id_format_type_hint = query_params.iter().filter(|e| e.0 == "nameIdFormat@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_name_id_format_type_hint = param_name_id_format_type_hint.and_then(|param_name_id_format_type_hint| param_name_id_format_type_hint.parse::<>().ok());
                let param_digest_method = query_params.iter().filter(|e| e.0 == "digestMethod").map(|e| e.1.to_owned())

                    .nth(0);

                let param_digest_method = param_digest_method.and_then(|param_digest_method| param_digest_method.parse::<>().ok());
                let param_digest_method_type_hint = query_params.iter().filter(|e| e.0 == "digestMethod@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_digest_method_type_hint = param_digest_method_type_hint.and_then(|param_digest_method_type_hint| param_digest_method_type_hint.parse::<>().ok());
                let param_signature_method = query_params.iter().filter(|e| e.0 == "signatureMethod").map(|e| e.1.to_owned())

                    .nth(0);

                let param_signature_method = param_signature_method.and_then(|param_signature_method| param_signature_method.parse::<>().ok());
                let param_signature_method_type_hint = query_params.iter().filter(|e| e.0 == "signatureMethod@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_signature_method_type_hint = param_signature_method_type_hint.and_then(|param_signature_method_type_hint| param_signature_method_type_hint.parse::<>().ok());
                let param_user_intermediate_path = query_params.iter().filter(|e| e.0 == "userIntermediatePath").map(|e| e.1.to_owned())

                    .nth(0);

                let param_user_intermediate_path = param_user_intermediate_path.and_then(|param_user_intermediate_path| param_user_intermediate_path.parse::<>().ok());
                let param_user_intermediate_path_type_hint = query_params.iter().filter(|e| e.0 == "userIntermediatePath@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_user_intermediate_path_type_hint = param_user_intermediate_path_type_hint.and_then(|param_user_intermediate_path_type_hint| param_user_intermediate_path_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_adobe_granite_saml_authentication_handler(param_key_store_password, param_key_store_password_type_hint, param_service_ranking, param_service_ranking_type_hint, param_idp_http_redirect, param_idp_http_redirect_type_hint, param_create_user, param_create_user_type_hint, param_default_redirect_url, param_default_redirect_url_type_hint, param_user_id_attribute, param_user_id_attribute_type_hint, param_default_groups.as_ref(), param_default_groups_type_hint, param_idp_cert_alias, param_idp_cert_alias_type_hint, param_add_group_memberships, param_add_group_memberships_type_hint, param_path.as_ref(), param_path_type_hint, param_synchronize_attributes.as_ref(), param_synchronize_attributes_type_hint, param_clock_tolerance, param_clock_tolerance_type_hint, param_group_membership_attribute, param_group_membership_attribute_type_hint, param_idp_url, param_idp_url_type_hint, param_logout_url, param_logout_url_type_hint, param_service_provider_entity_id, param_service_provider_entity_id_type_hint, param_assertion_consumer_service_url, param_assertion_consumer_service_url_type_hint, param_handle_logout, param_handle_logout_type_hint, param_sp_private_key_alias, param_sp_private_key_alias_type_hint, param_use_encryption, param_use_encryption_type_hint, param_name_id_format, param_name_id_format_type_hint, param_digest_method, param_digest_method_type_hint, param_signature_method, param_signature_method_type_hint, param_user_intermediate_path, param_user_intermediate_path_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigAdobeGraniteSamlAuthenticationHandlerResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigApacheFelixJettyBasedHttpService - POST /apps/system/config/org.apache.felix.http
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_FELIX_HTTP) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_org_apache_felix_https_nio = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.nio").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_nio = param_org_apache_felix_https_nio.and_then(|param_org_apache_felix_https_nio| param_org_apache_felix_https_nio.parse::<>().ok());
                let param_org_apache_felix_https_nio_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.nio@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_nio_type_hint = param_org_apache_felix_https_nio_type_hint.and_then(|param_org_apache_felix_https_nio_type_hint| param_org_apache_felix_https_nio_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_keystore = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore = param_org_apache_felix_https_keystore.and_then(|param_org_apache_felix_https_keystore| param_org_apache_felix_https_keystore.parse::<>().ok());
                let param_org_apache_felix_https_keystore_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore_type_hint = param_org_apache_felix_https_keystore_type_hint.and_then(|param_org_apache_felix_https_keystore_type_hint| param_org_apache_felix_https_keystore_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_keystore_password = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.password").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore_password = param_org_apache_felix_https_keystore_password.and_then(|param_org_apache_felix_https_keystore_password| param_org_apache_felix_https_keystore_password.parse::<>().ok());
                let param_org_apache_felix_https_keystore_password_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.password@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore_password_type_hint = param_org_apache_felix_https_keystore_password_type_hint.and_then(|param_org_apache_felix_https_keystore_password_type_hint| param_org_apache_felix_https_keystore_password_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_keystore_key = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore_key = param_org_apache_felix_https_keystore_key.and_then(|param_org_apache_felix_https_keystore_key| param_org_apache_felix_https_keystore_key.parse::<>().ok());
                let param_org_apache_felix_https_keystore_key_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore_key_type_hint = param_org_apache_felix_https_keystore_key_type_hint.and_then(|param_org_apache_felix_https_keystore_key_type_hint| param_org_apache_felix_https_keystore_key_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_keystore_key_password = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key.password").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore_key_password = param_org_apache_felix_https_keystore_key_password.and_then(|param_org_apache_felix_https_keystore_key_password| param_org_apache_felix_https_keystore_key_password.parse::<>().ok());
                let param_org_apache_felix_https_keystore_key_password_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.keystore.key.password@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_keystore_key_password_type_hint = param_org_apache_felix_https_keystore_key_password_type_hint.and_then(|param_org_apache_felix_https_keystore_key_password_type_hint| param_org_apache_felix_https_keystore_key_password_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_truststore = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_truststore = param_org_apache_felix_https_truststore.and_then(|param_org_apache_felix_https_truststore| param_org_apache_felix_https_truststore.parse::<>().ok());
                let param_org_apache_felix_https_truststore_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_truststore_type_hint = param_org_apache_felix_https_truststore_type_hint.and_then(|param_org_apache_felix_https_truststore_type_hint| param_org_apache_felix_https_truststore_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_truststore_password = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore.password").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_truststore_password = param_org_apache_felix_https_truststore_password.and_then(|param_org_apache_felix_https_truststore_password| param_org_apache_felix_https_truststore_password.parse::<>().ok());
                let param_org_apache_felix_https_truststore_password_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.truststore.password@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_truststore_password_type_hint = param_org_apache_felix_https_truststore_password_type_hint.and_then(|param_org_apache_felix_https_truststore_password_type_hint| param_org_apache_felix_https_truststore_password_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_clientcertificate = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.clientcertificate").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_clientcertificate = param_org_apache_felix_https_clientcertificate.and_then(|param_org_apache_felix_https_clientcertificate| param_org_apache_felix_https_clientcertificate.parse::<>().ok());
                let param_org_apache_felix_https_clientcertificate_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.clientcertificate@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_clientcertificate_type_hint = param_org_apache_felix_https_clientcertificate_type_hint.and_then(|param_org_apache_felix_https_clientcertificate_type_hint| param_org_apache_felix_https_clientcertificate_type_hint.parse::<>().ok());
                let param_org_apache_felix_https_enable = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.enable").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_enable = param_org_apache_felix_https_enable.and_then(|param_org_apache_felix_https_enable| param_org_apache_felix_https_enable.parse::<>().ok());
                let param_org_apache_felix_https_enable_type_hint = query_params.iter().filter(|e| e.0 == "org.apache.felix.https.enable@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_apache_felix_https_enable_type_hint = param_org_apache_felix_https_enable_type_hint.and_then(|param_org_apache_felix_https_enable_type_hint| param_org_apache_felix_https_enable_type_hint.parse::<>().ok());
                let param_org_osgi_service_http_port_secure = query_params.iter().filter(|e| e.0 == "org.osgi.service.http.port.secure").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_osgi_service_http_port_secure = param_org_osgi_service_http_port_secure.and_then(|param_org_osgi_service_http_port_secure| param_org_osgi_service_http_port_secure.parse::<>().ok());
                let param_org_osgi_service_http_port_secure_type_hint = query_params.iter().filter(|e| e.0 == "org.osgi.service.http.port.secure@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_org_osgi_service_http_port_secure_type_hint = param_org_osgi_service_http_port_secure_type_hint.and_then(|param_org_osgi_service_http_port_secure_type_hint| param_org_osgi_service_http_port_secure_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_apache_felix_jetty_based_http_service(param_org_apache_felix_https_nio, param_org_apache_felix_https_nio_type_hint, param_org_apache_felix_https_keystore, param_org_apache_felix_https_keystore_type_hint, param_org_apache_felix_https_keystore_password, param_org_apache_felix_https_keystore_password_type_hint, param_org_apache_felix_https_keystore_key, param_org_apache_felix_https_keystore_key_type_hint, param_org_apache_felix_https_keystore_key_password, param_org_apache_felix_https_keystore_key_password_type_hint, param_org_apache_felix_https_truststore, param_org_apache_felix_https_truststore_type_hint, param_org_apache_felix_https_truststore_password, param_org_apache_felix_https_truststore_password_type_hint, param_org_apache_felix_https_clientcertificate, param_org_apache_felix_https_clientcertificate_type_hint, param_org_apache_felix_https_enable, param_org_apache_felix_https_enable_type_hint, param_org_osgi_service_http_port_secure, param_org_osgi_service_http_port_secure_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheFelixJettyBasedHttpServiceResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigApacheHttpComponentsProxyConfiguration - POST /apps/system/config/org.apache.http.proxyconfigurator.config
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_HTTP_PROXYCONFIGURATOR_CONFIG) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_proxy_host = query_params.iter().filter(|e| e.0 == "proxy.host").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_host = param_proxy_host.and_then(|param_proxy_host| param_proxy_host.parse::<>().ok());
                let param_proxy_host_type_hint = query_params.iter().filter(|e| e.0 == "proxy.host@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_host_type_hint = param_proxy_host_type_hint.and_then(|param_proxy_host_type_hint| param_proxy_host_type_hint.parse::<>().ok());
                let param_proxy_port = query_params.iter().filter(|e| e.0 == "proxy.port").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_port = param_proxy_port.and_then(|param_proxy_port| param_proxy_port.parse::<>().ok());
                let param_proxy_port_type_hint = query_params.iter().filter(|e| e.0 == "proxy.port@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_port_type_hint = param_proxy_port_type_hint.and_then(|param_proxy_port_type_hint| param_proxy_port_type_hint.parse::<>().ok());
                let param_proxy_exceptions = query_params.iter().filter(|e| e.0 == "proxy.exceptions").map(|e| e.1.to_owned())
                    .filter_map(|param_proxy_exceptions| param_proxy_exceptions.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_proxy_exceptions = if !param_proxy_exceptions.is_empty() {
                    Some(param_proxy_exceptions)
                } else {
                    None
                };
                let param_proxy_exceptions_type_hint = query_params.iter().filter(|e| e.0 == "proxy.exceptions@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_exceptions_type_hint = param_proxy_exceptions_type_hint.and_then(|param_proxy_exceptions_type_hint| param_proxy_exceptions_type_hint.parse::<>().ok());
                let param_proxy_enabled = query_params.iter().filter(|e| e.0 == "proxy.enabled").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_enabled = param_proxy_enabled.and_then(|param_proxy_enabled| param_proxy_enabled.parse::<>().ok());
                let param_proxy_enabled_type_hint = query_params.iter().filter(|e| e.0 == "proxy.enabled@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_enabled_type_hint = param_proxy_enabled_type_hint.and_then(|param_proxy_enabled_type_hint| param_proxy_enabled_type_hint.parse::<>().ok());
                let param_proxy_user = query_params.iter().filter(|e| e.0 == "proxy.user").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_user = param_proxy_user.and_then(|param_proxy_user| param_proxy_user.parse::<>().ok());
                let param_proxy_user_type_hint = query_params.iter().filter(|e| e.0 == "proxy.user@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_user_type_hint = param_proxy_user_type_hint.and_then(|param_proxy_user_type_hint| param_proxy_user_type_hint.parse::<>().ok());
                let param_proxy_password = query_params.iter().filter(|e| e.0 == "proxy.password").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_password = param_proxy_password.and_then(|param_proxy_password| param_proxy_password.parse::<>().ok());
                let param_proxy_password_type_hint = query_params.iter().filter(|e| e.0 == "proxy.password@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_proxy_password_type_hint = param_proxy_password_type_hint.and_then(|param_proxy_password_type_hint| param_proxy_password_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_apache_http_components_proxy_configuration(param_proxy_host, param_proxy_host_type_hint, param_proxy_port, param_proxy_port_type_hint, param_proxy_exceptions.as_ref(), param_proxy_exceptions_type_hint, param_proxy_enabled, param_proxy_enabled_type_hint, param_proxy_user, param_proxy_user_type_hint, param_proxy_password, param_proxy_password_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheHttpComponentsProxyConfigurationResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigApacheSlingDavExServlet - POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_JCR_DAVEX_IMPL_SERVLETS_SLINGDAVEXSERVLET) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_alias = query_params.iter().filter(|e| e.0 == "alias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_alias = param_alias.and_then(|param_alias| param_alias.parse::<>().ok());
                let param_alias_type_hint = query_params.iter().filter(|e| e.0 == "alias@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_alias_type_hint = param_alias_type_hint.and_then(|param_alias_type_hint| param_alias_type_hint.parse::<>().ok());
                let param_dav_create_absolute_uri = query_params.iter().filter(|e| e.0 == "dav.create-absolute-uri").map(|e| e.1.to_owned())

                    .nth(0);

                let param_dav_create_absolute_uri = param_dav_create_absolute_uri.and_then(|param_dav_create_absolute_uri| param_dav_create_absolute_uri.parse::<>().ok());
                let param_dav_create_absolute_uri_type_hint = query_params.iter().filter(|e| e.0 == "dav.create-absolute-uri@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_dav_create_absolute_uri_type_hint = param_dav_create_absolute_uri_type_hint.and_then(|param_dav_create_absolute_uri_type_hint| param_dav_create_absolute_uri_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_apache_sling_dav_ex_servlet(param_alias, param_alias_type_hint, param_dav_create_absolute_uri, param_dav_create_absolute_uri_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheSlingDavExServletResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigApacheSlingGetServlet - POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SERVLETS_GET_DEFAULTGETSERVLET) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_json_maximumresults = query_params.iter().filter(|e| e.0 == "json.maximumresults").map(|e| e.1.to_owned())

                    .nth(0);

                let param_json_maximumresults = param_json_maximumresults.and_then(|param_json_maximumresults| param_json_maximumresults.parse::<>().ok());
                let param_json_maximumresults_type_hint = query_params.iter().filter(|e| e.0 == "json.maximumresults@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_json_maximumresults_type_hint = param_json_maximumresults_type_hint.and_then(|param_json_maximumresults_type_hint| param_json_maximumresults_type_hint.parse::<>().ok());
                let param_enable_html = query_params.iter().filter(|e| e.0 == "enable.html").map(|e| e.1.to_owned())

                    .nth(0);

                let param_enable_html = param_enable_html.and_then(|param_enable_html| param_enable_html.parse::<>().ok());
                let param_enable_html_type_hint = query_params.iter().filter(|e| e.0 == "enable.html@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_enable_html_type_hint = param_enable_html_type_hint.and_then(|param_enable_html_type_hint| param_enable_html_type_hint.parse::<>().ok());
                let param_enable_txt = query_params.iter().filter(|e| e.0 == "enable.txt").map(|e| e.1.to_owned())

                    .nth(0);

                let param_enable_txt = param_enable_txt.and_then(|param_enable_txt| param_enable_txt.parse::<>().ok());
                let param_enable_txt_type_hint = query_params.iter().filter(|e| e.0 == "enable.txt@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_enable_txt_type_hint = param_enable_txt_type_hint.and_then(|param_enable_txt_type_hint| param_enable_txt_type_hint.parse::<>().ok());
                let param_enable_xml = query_params.iter().filter(|e| e.0 == "enable.xml").map(|e| e.1.to_owned())

                    .nth(0);

                let param_enable_xml = param_enable_xml.and_then(|param_enable_xml| param_enable_xml.parse::<>().ok());
                let param_enable_xml_type_hint = query_params.iter().filter(|e| e.0 == "enable.xml@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_enable_xml_type_hint = param_enable_xml_type_hint.and_then(|param_enable_xml_type_hint| param_enable_xml_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_apache_sling_get_servlet(param_json_maximumresults, param_json_maximumresults_type_hint, param_enable_html, param_enable_html_type_hint, param_enable_txt, param_enable_txt_type_hint, param_enable_xml, param_enable_xml_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheSlingGetServletResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostConfigApacheSlingReferrerFilter - POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter
            &hyper::Method::Post if path.matched(paths::ID_APPS_SYSTEM_CONFIG_ORG_APACHE_SLING_SECURITY_IMPL_REFERRERFILTER) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_allow_empty = query_params.iter().filter(|e| e.0 == "allow.empty").map(|e| e.1.to_owned())

                    .nth(0);

                let param_allow_empty = param_allow_empty.and_then(|param_allow_empty| param_allow_empty.parse::<>().ok());
                let param_allow_empty_type_hint = query_params.iter().filter(|e| e.0 == "allow.empty@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_allow_empty_type_hint = param_allow_empty_type_hint.and_then(|param_allow_empty_type_hint| param_allow_empty_type_hint.parse::<>().ok());
                let param_allow_hosts = query_params.iter().filter(|e| e.0 == "allow.hosts").map(|e| e.1.to_owned())

                    .nth(0);

                let param_allow_hosts = param_allow_hosts.and_then(|param_allow_hosts| param_allow_hosts.parse::<>().ok());
                let param_allow_hosts_type_hint = query_params.iter().filter(|e| e.0 == "allow.hosts@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_allow_hosts_type_hint = param_allow_hosts_type_hint.and_then(|param_allow_hosts_type_hint| param_allow_hosts_type_hint.parse::<>().ok());
                let param_allow_hosts_regexp = query_params.iter().filter(|e| e.0 == "allow.hosts.regexp").map(|e| e.1.to_owned())

                    .nth(0);

                let param_allow_hosts_regexp = param_allow_hosts_regexp.and_then(|param_allow_hosts_regexp| param_allow_hosts_regexp.parse::<>().ok());
                let param_allow_hosts_regexp_type_hint = query_params.iter().filter(|e| e.0 == "allow.hosts.regexp@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_allow_hosts_regexp_type_hint = param_allow_hosts_regexp_type_hint.and_then(|param_allow_hosts_regexp_type_hint| param_allow_hosts_regexp_type_hint.parse::<>().ok());
                let param_filter_methods = query_params.iter().filter(|e| e.0 == "filter.methods").map(|e| e.1.to_owned())

                    .nth(0);

                let param_filter_methods = param_filter_methods.and_then(|param_filter_methods| param_filter_methods.parse::<>().ok());
                let param_filter_methods_type_hint = query_params.iter().filter(|e| e.0 == "filter.methods@TypeHint").map(|e| e.1.to_owned())

                    .nth(0);

                let param_filter_methods_type_hint = param_filter_methods_type_hint.and_then(|param_filter_methods_type_hint| param_filter_methods_type_hint.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_config_apache_sling_referrer_filter(param_allow_empty, param_allow_empty_type_hint, param_allow_hosts, param_allow_hosts_type_hint, param_allow_hosts_regexp, param_allow_hosts_regexp_type_hint, param_filter_methods, param_filter_methods_type_hint, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostConfigApacheSlingReferrerFilterResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostNode - POST /{path}/{name}
            &hyper::Method::Post if path.matched(paths::ID_PATH_NAME) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter path: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())

                    .nth(0);

                let param_operation = param_operation.and_then(|param_operation| param_operation.parse::<>().ok());
                let param_delete_authorizable = query_params.iter().filter(|e| e.0 == "deleteAuthorizable").map(|e| e.1.to_owned())

                    .nth(0);

                let param_delete_authorizable = param_delete_authorizable.and_then(|param_delete_authorizable| param_delete_authorizable.parse::<>().ok());



                Box::new({
                        {{

                                // Form parameters
                                let param_file = Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")));

                                Box::new(api_impl.post_node(param_path, param_name, param_operation, param_delete_authorizable, param_file, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostNodeResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostNodeRw - POST /{path}/{name}.rw.html
            &hyper::Method::Post if path.matched(paths::ID_PATH_NAME_RW_HTML) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_NAME_RW_HTML
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_NAME_RW_HTML in set but failed match against \"{}\"", path, paths::REGEX_PATH_NAME_RW_HTML.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter path: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"]))))
                };
                let param_name = match percent_encoding::percent_decode(path_params["name"].as_bytes()).decode_utf8() {
                    Ok(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter name: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["name"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_add_members = query_params.iter().filter(|e| e.0 == "addMembers").map(|e| e.1.to_owned())

                    .nth(0);

                let param_add_members = param_add_members.and_then(|param_add_members| param_add_members.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.post_node_rw(param_path, param_name, param_add_members, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostNodeRwResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostPath - POST /{path}/
            &hyper::Method::Post if path.matched(paths::ID_PATH_) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_PATH_
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PATH_ in set but failed match against \"{}\"", path, paths::REGEX_PATH_.as_str())
                    );

                let param_path = match percent_encoding::percent_decode(path_params["path"].as_bytes()).decode_utf8() {
                    Ok(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter path: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["path"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_jcrprimary_type = query_params.iter().filter(|e| e.0 == "jcr:primaryType").map(|e| e.1.to_owned())

                    .nth(0);
                let param_jcrprimary_type = match param_jcrprimary_type {
                    Some(param_jcrprimary_type) => match param_jcrprimary_type.parse::<String>() {
                        Ok(param_jcrprimary_type) => param_jcrprimary_type,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter jcr:primaryType - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter jcr:primaryType"))),
                };
                let param_name = query_params.iter().filter(|e| e.0 == ":name").map(|e| e.1.to_owned())

                    .nth(0);
                let param_name = match param_name {
                    Some(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter :name - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter :name"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_path(param_path, param_jcrprimary_type, param_name, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostPathResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostQuery - POST /bin/querybuilder.json
            &hyper::Method::Post if path.matched(paths::ID_BIN_QUERYBUILDER_JSON) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())

                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter path"))),
                };
                let param_p_limit = query_params.iter().filter(|e| e.0 == "p.limit").map(|e| e.1.to_owned())

                    .nth(0);
                let param_p_limit = match param_p_limit {
                    Some(param_p_limit) => match param_p_limit.parse::<f64>() {
                        Ok(param_p_limit) => param_p_limit,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter p.limit - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter p.limit"))),
                };
                let param__1_property = query_params.iter().filter(|e| e.0 == "1_property").map(|e| e.1.to_owned())

                    .nth(0);
                let param__1_property = match param__1_property {
                    Some(param__1_property) => match param__1_property.parse::<String>() {
                        Ok(param__1_property) => param__1_property,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter 1_property - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter 1_property"))),
                };
                let param__1_property_value = query_params.iter().filter(|e| e.0 == "1_property.value").map(|e| e.1.to_owned())

                    .nth(0);
                let param__1_property_value = match param__1_property_value {
                    Some(param__1_property_value) => match param__1_property_value.parse::<String>() {
                        Ok(param__1_property_value) => param__1_property_value,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter 1_property.value - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter 1_property.value"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_query(param_path, param_p_limit, param__1_property, param__1_property_value, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostQueryResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_QUERY_DEFAULT_RESPONSE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostTreeActivation - POST /etc/replication/treeactivation.html
            &hyper::Method::Post if path.matched(paths::ID_ETC_REPLICATION_TREEACTIVATION_HTML) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_ignoredeactivated = query_params.iter().filter(|e| e.0 == "ignoredeactivated").map(|e| e.1.to_owned())

                    .nth(0);
                let param_ignoredeactivated = match param_ignoredeactivated {
                    Some(param_ignoredeactivated) => match param_ignoredeactivated.parse::<bool>() {
                        Ok(param_ignoredeactivated) => param_ignoredeactivated,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter ignoredeactivated - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter ignoredeactivated"))),
                };
                let param_onlymodified = query_params.iter().filter(|e| e.0 == "onlymodified").map(|e| e.1.to_owned())

                    .nth(0);
                let param_onlymodified = match param_onlymodified {
                    Some(param_onlymodified) => match param_onlymodified.parse::<bool>() {
                        Ok(param_onlymodified) => param_onlymodified,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter onlymodified - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter onlymodified"))),
                };
                let param_path = query_params.iter().filter(|e| e.0 == "path").map(|e| e.1.to_owned())

                    .nth(0);
                let param_path = match param_path {
                    Some(param_path) => match param_path.parse::<String>() {
                        Ok(param_path) => param_path,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter path - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter path"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.post_tree_activation(param_ignoredeactivated, param_onlymodified, param_path, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostTreeActivationResponse::DefaultResponse


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostTruststore - POST /libs/granite/security/post/truststore
            &hyper::Method::Post if path.matched(paths::ID_LIBS_GRANITE_SECURITY_POST_TRUSTSTORE) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_operation = query_params.iter().filter(|e| e.0 == ":operation").map(|e| e.1.to_owned())

                    .nth(0);

                let param_operation = param_operation.and_then(|param_operation| param_operation.parse::<>().ok());
                let param_new_password = query_params.iter().filter(|e| e.0 == "newPassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_new_password = param_new_password.and_then(|param_new_password| param_new_password.parse::<>().ok());
                let param_re_password = query_params.iter().filter(|e| e.0 == "rePassword").map(|e| e.1.to_owned())

                    .nth(0);

                let param_re_password = param_re_password.and_then(|param_re_password| param_re_password.parse::<>().ok());
                let param_key_store_type = query_params.iter().filter(|e| e.0 == "keyStoreType").map(|e| e.1.to_owned())

                    .nth(0);

                let param_key_store_type = param_key_store_type.and_then(|param_key_store_type| param_key_store_type.parse::<>().ok());
                let param_remove_alias = query_params.iter().filter(|e| e.0 == "removeAlias").map(|e| e.1.to_owned())

                    .nth(0);

                let param_remove_alias = param_remove_alias.and_then(|param_remove_alias| param_remove_alias.parse::<>().ok());



                Box::new({
                        {{

                                // Form parameters
                                let param_certificate = Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")));

                                Box::new(api_impl.post_truststore(param_operation, param_new_password, param_re_password, param_key_store_type, param_remove_alias, param_certificate, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostTruststoreResponse::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_TRUSTSTORE_DEFAULT_RESPONSE.clone()));


                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // PostTruststorePKCS12 - POST /etc/truststore
            &hyper::Method::Post if path.matched(paths::ID_ETC_TRUSTSTORE) => {
                {
                    let authorization = match (&context as &Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Box::new(future::ok(Response::new()
                                                .with_status(StatusCode::Forbidden)
                                                .with_body("Unauthenticated"))),
                    };

                }







                Box::new({
                        {{

                                // Form parameters
                                let param_truststore_p12 = Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")));

                                Box::new(api_impl.post_truststore_pkcs12(param_truststore_p12, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PostTruststorePKCS12Response::DefaultResponse

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::POST_TRUSTSTORE_PKCS12_DEFAULT_RESPONSE.clone()));


                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            _ => Box::new(future::ok(Response::new().with_status(StatusCode::NotFound))) as Box<Future<Item=Response, Error=Error>>,
        }
    }
}

impl<T, C> Clone for Service<T, C>
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker.clone(),
        }
    }
}
