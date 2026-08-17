use std::collections::HashMap;

use axum::{body::Body, extract::*, response::Response, routing::*};
use axum_extra::{
    TypedHeader,
    extract::{CookieJar, Query as QueryExtra},
};
use bytes::Bytes;
use headers::Host;
use http::{HeaderMap, HeaderName, HeaderValue, Method, StatusCode, header::CONTENT_TYPE};
use tracing::error;
use validator::{Validate, ValidationErrors};

#[allow(unused_imports)]
use crate::{apis, models};
use crate::{header, types::*};
#[allow(unused_imports)]
use crate::{
    models::check_xss_map, models::check_xss_map_nested, models::check_xss_map_string,
    models::check_xss_string, models::check_xss_vec_string,
};


/// Setup API Server.
pub fn new<I, A, E, C>(api_impl: I) -> Router
where
    I: AsRef<A> + Clone + Send + Sync + 'static,
    A: apis::console::Console<E, Claims = C> + apis::cq::Cq<E, Claims = C> + apis::crx::Crx<E, Claims = C> + apis::custom::Custom<E, Claims = C> + apis::granite::Granite<E, Claims = C> + apis::sling::Sling<E, Claims = C> + apis::ApiAuthBasic<Claims = C> + Send + Sync + 'static,
    E: std::fmt::Debug + Send + Sync + 'static,
    C: Send + Sync + 'static,
{
    // build our application with a route
    Router::new()
        .route("/.cqactions.html",
            post(post_cq_actions::<I, A, E, C>)
        )
        .route("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config",
            post(post_config_adobe_granite_saml_authentication_handler::<I, A, E, C>)
        )
        .route("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator",
            post(post_config_aem_password_reset::<I, A, E, C>)
        )
        .route("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck",
            post(post_config_aem_health_check_servlet::<I, A, E, C>)
        )
        .route("/apps/system/config/org.apache.felix.http",
            post(post_config_apache_felix_jetty_based_http_service::<I, A, E, C>)
        )
        .route("/apps/system/config/org.apache.http.proxyconfigurator.config",
            post(post_config_apache_http_components_proxy_configuration::<I, A, E, C>)
        )
        .route("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
            post(post_config_apache_sling_dav_ex_servlet::<I, A, E, C>)
        )
        .route("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter",
            post(post_config_apache_sling_referrer_filter::<I, A, E, C>)
        )
        .route("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet",
            post(post_config_apache_sling_get_servlet::<I, A, E, C>)
        )
        .route("/apps/system/config/{config_node_name}",
            post(post_config_property::<I, A, E, C>)
        )
        .route("/bin/querybuilder.json",
            get(get_query::<I, A, E, C>).post(post_query::<I, A, E, C>)
        )
        .route("/crx/explorer/ui/setpassword.jsp",
            post(post_set_password::<I, A, E, C>)
        )
        .route("/crx/packmgr/installstatus.jsp",
            get(get_install_status::<I, A, E, C>)
        )
        .route("/crx/packmgr/service.jsp",
            post(post_package_service::<I, A, E, C>)
        )
        .route("/crx/packmgr/service/.json/{path}",
            post(post_package_service_json::<I, A, E, C>)
        )
        .route("/crx/packmgr/service/script.html",
            get(get_package_manager_servlet::<I, A, E, C>)
        )
        .route("/crx/packmgr/update.jsp",
            post(post_package_update::<I, A, E, C>)
        )
        .route("/crx/server/crx.default/jcr:root/.1.json",
            get(get_crxde_status::<I, A, E, C>)
        )
        .route("/etc/packages/{group}/{name}-{version}.zip",
            get(get_package::<I, A, E, C>)
        )
        .route("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json",
            get(get_package_filter::<I, A, E, C>)
        )
        .route("/etc/replication/agents.{runmode}.-1.json",
            get(get_agents::<I, A, E, C>)
        )
        .route("/etc/replication/agents.{runmode}/{name}",
            delete(delete_agent::<I, A, E, C>).get(get_agent::<I, A, E, C>).post(post_agent::<I, A, E, C>)
        )
        .route("/etc/truststore",
            post(post_truststore_pkcs12::<I, A, E, C>)
        )
        .route("/etc/truststore/truststore.p12",
            get(get_truststore::<I, A, E, C>)
        )
        .route("/libs/granite/core/content/login.html",
            get(get_login_page::<I, A, E, C>)
        )
        .route("/libs/granite/security/post/authorizables",
            post(post_authorizables::<I, A, E, C>)
        )
        .route("/libs/granite/security/post/sslSetup.html",
            post(ssl_setup::<I, A, E, C>)
        )
        .route("/libs/granite/security/post/truststore",
            post(post_truststore::<I, A, E, C>)
        )
        .route("/libs/granite/security/truststore.json",
            get(get_truststore_info::<I, A, E, C>)
        )
        .route("/libs/replication/treeactivation.html",
            post(post_tree_activation::<I, A, E, C>)
        )
        .route("/system/console/bundles/{name}",
            post(post_bundle::<I, A, E, C>)
        )
        .route("/system/console/bundles/{name}.json",
            get(get_bundle_info::<I, A, E, C>)
        )
        .route("/system/console/configMgr",
            get(get_config_mgr::<I, A, E, C>)
        )
        .route("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
            post(post_saml_configuration::<I, A, E, C>)
        )
        .route("/system/console/jmx/com.adobe.granite:type=Repository/op/{action}",
            post(post_jmx_repository::<I, A, E, C>)
        )
        .route("/system/console/status-productinfo.json",
            get(get_aem_product_info::<I, A, E, C>)
        )
        .route("/system/health",
            get(get_aem_health_check::<I, A, E, C>)
        )
        .route("/{intermediate_path}/{authorizable_id}.ks.html",
            post(post_authorizable_keystore::<I, A, E, C>)
        )
        .route("/{intermediate_path}/{authorizable_id}.ks.json",
            get(get_authorizable_keystore::<I, A, E, C>)
        )
        .route("/{intermediate_path}/{authorizable_id}/keystore/store.p12",
            get(get_keystore::<I, A, E, C>)
        )
        .route("/{path}/",
            post(post_path::<I, A, E, C>)
        )
        .route("/{path}/{name}",
            delete(delete_node::<I, A, E, C>).get(get_node::<I, A, E, C>).post(post_node::<I, A, E, C>)
        )
        .route("/{path}/{name}.rw.html",
            post(post_node_rw::<I, A, E, C>)
        )
        .with_state(api_impl)
}


#[tracing::instrument(skip_all)]
fn get_aem_product_info_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetAemProductInfo - GET /system/console/status-productinfo.json
#[tracing::instrument(skip_all)]
async fn get_aem_product_info<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::console::Console<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_aem_product_info_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_aem_product_info(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::console::GetAemProductInfoResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_bundle_info_validation(
  path_params: models::GetBundleInfoPathParams,
) -> std::result::Result<(
  models::GetBundleInfoPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetBundleInfo - GET /system/console/bundles/{name}.json
#[tracing::instrument(skip_all)]
async fn get_bundle_info<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetBundleInfoPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::console::Console<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_bundle_info_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_bundle_info(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::console::GetBundleInfoResponse::Status200_RetrievedBundleInfo
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::console::GetBundleInfoResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_config_mgr_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetConfigMgr - GET /system/console/configMgr
#[tracing::instrument(skip_all)]
async fn get_config_mgr<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::console::Console<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_config_mgr_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_config_mgr(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::console::GetConfigMgrResponse::Status200_OK
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::console::GetConfigMgrResponse::Status5XX_UnexpectedError
                                                => {
                                                let mut response = Response::builder();
                                                  response.status::<u16>(body.code.parse().unwrap());  // 5XX
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_bundle_validation(
  path_params: models::PostBundlePathParams,
  query_params: models::PostBundleQueryParams,
) -> std::result::Result<(
  models::PostBundlePathParams,
  models::PostBundleQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// PostBundle - POST /system/console/bundles/{name}
#[tracing::instrument(skip_all)]
async fn post_bundle<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostBundlePathParams>,
  QueryExtra(query_params): QueryExtra<models::PostBundleQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::console::Console<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_bundle_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_bundle(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::console::PostBundleResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_jmx_repository_validation(
  path_params: models::PostJmxRepositoryPathParams,
) -> std::result::Result<(
  models::PostJmxRepositoryPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PostJmxRepository - POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}
#[tracing::instrument(skip_all)]
async fn post_jmx_repository<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostJmxRepositoryPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::console::Console<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_jmx_repository_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_jmx_repository(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::console::PostJmxRepositoryResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_saml_configuration_validation(
  query_params: models::PostSamlConfigurationQueryParams,
) -> std::result::Result<(
  models::PostSamlConfigurationQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostSamlConfiguration - POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
#[tracing::instrument(skip_all)]
async fn post_saml_configuration<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostSamlConfigurationQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::console::Console<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_saml_configuration_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_saml_configuration(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::console::PostSamlConfigurationResponse::Status200_RetrievedAEMSAMLConfiguration
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::console::PostSamlConfigurationResponse::Status302_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(302);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::console::PostSamlConfigurationResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_login_page_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetLoginPage - GET /libs/granite/core/content/login.html
#[tracing::instrument(skip_all)]
async fn get_login_page<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::cq::Cq<E, Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {




      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_login_page_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_login_page(
      
      &method,
      &host,
      &cookies,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::cq::GetLoginPageResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/html"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_cq_actions_validation(
  query_params: models::PostCqActionsQueryParams,
) -> std::result::Result<(
  models::PostCqActionsQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostCqActions - POST /.cqactions.html
#[tracing::instrument(skip_all)]
async fn post_cq_actions<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostCqActionsQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::cq::Cq<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_cq_actions_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_cq_actions(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::cq::PostCqActionsResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_crxde_status_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetCrxdeStatus - GET /crx/server/crx.default/jcr:root/.1.json
#[tracing::instrument(skip_all)]
async fn get_crxde_status<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::crx::Crx<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_crxde_status_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_crxde_status(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::crx::GetCrxdeStatusResponse::Status200_CRXDEIsEnabled
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("plain/text"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::crx::GetCrxdeStatusResponse::Status404_CRXDEIsDisabled
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(404);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("plain/text"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_install_status_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetInstallStatus - GET /crx/packmgr/installstatus.jsp
#[tracing::instrument(skip_all)]
async fn get_install_status<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::crx::Crx<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_install_status_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_install_status(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::crx::GetInstallStatusResponse::Status200_RetrievedCRXPackageManagerInstallStatus
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::crx::GetInstallStatusResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_package_manager_servlet_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetPackageManagerServlet - GET /crx/packmgr/service/script.html
#[tracing::instrument(skip_all)]
async fn get_package_manager_servlet<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::crx::Crx<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_package_manager_servlet_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_package_manager_servlet(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::crx::GetPackageManagerServletResponse::Status404_PackageManagerServletIsDisabled
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(404);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/html"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::crx::GetPackageManagerServletResponse::Status405_PackageManagerServletIsActive
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(405);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/html"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_package_service_validation(
  query_params: models::PostPackageServiceQueryParams,
) -> std::result::Result<(
  models::PostPackageServiceQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostPackageService - POST /crx/packmgr/service.jsp
#[tracing::instrument(skip_all)]
async fn post_package_service<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostPackageServiceQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::crx::Crx<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_package_service_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_package_service(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::crx::PostPackageServiceResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_package_service_json_validation(
  path_params: models::PostPackageServiceJsonPathParams,
  query_params: models::PostPackageServiceJsonQueryParams,
) -> std::result::Result<(
  models::PostPackageServiceJsonPathParams,
  models::PostPackageServiceJsonQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// PostPackageServiceJson - POST /crx/packmgr/service/.json/{path}
#[tracing::instrument(skip_all)]
async fn post_package_service_json<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostPackageServiceJsonPathParams>,
  QueryExtra(query_params): QueryExtra<models::PostPackageServiceJsonQueryParams>,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::crx::Crx<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_package_service_json_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_package_service_json(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
          body,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::crx::PostPackageServiceJsonResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_package_update_validation(
  query_params: models::PostPackageUpdateQueryParams,
) -> std::result::Result<(
  models::PostPackageUpdateQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostPackageUpdate - POST /crx/packmgr/update.jsp
#[tracing::instrument(skip_all)]
async fn post_package_update<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostPackageUpdateQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::crx::Crx<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_package_update_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_package_update(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::crx::PostPackageUpdateResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_set_password_validation(
  query_params: models::PostSetPasswordQueryParams,
) -> std::result::Result<(
  models::PostSetPasswordQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostSetPassword - POST /crx/explorer/ui/setpassword.jsp
#[tracing::instrument(skip_all)]
async fn post_set_password<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostSetPasswordQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::crx::Crx<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_set_password_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_set_password(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::crx::PostSetPasswordResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_aem_health_check_validation(
  query_params: models::GetAemHealthCheckQueryParams,
) -> std::result::Result<(
  models::GetAemHealthCheckQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// GetAemHealthCheck - GET /system/health
#[tracing::instrument(skip_all)]
async fn get_aem_health_check<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::GetAemHealthCheckQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::custom::Custom<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_aem_health_check_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_aem_health_check(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::custom::GetAemHealthCheckResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_aem_health_check_servlet_validation(
  query_params: models::PostConfigAemHealthCheckServletQueryParams,
) -> std::result::Result<(
  models::PostConfigAemHealthCheckServletQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigAemHealthCheckServlet - POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck
#[tracing::instrument(skip_all)]
async fn post_config_aem_health_check_servlet<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigAemHealthCheckServletQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::custom::Custom<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_aem_health_check_servlet_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_aem_health_check_servlet(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::custom::PostConfigAemHealthCheckServletResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_aem_password_reset_validation(
  query_params: models::PostConfigAemPasswordResetQueryParams,
) -> std::result::Result<(
  models::PostConfigAemPasswordResetQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigAemPasswordReset - POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator
#[tracing::instrument(skip_all)]
async fn post_config_aem_password_reset<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigAemPasswordResetQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::custom::Custom<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_aem_password_reset_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_aem_password_reset(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::custom::PostConfigAemPasswordResetResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn ssl_setup_validation(
  query_params: models::SslSetupQueryParams,
) -> std::result::Result<(
  models::SslSetupQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// SslSetup - POST /libs/granite/security/post/sslSetup.html
#[tracing::instrument(skip_all)]
async fn ssl_setup<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::SslSetupQueryParams>,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::granite::Granite<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    ssl_setup_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().ssl_setup(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
          body,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::granite::SslSetupResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_agent_validation(
  path_params: models::DeleteAgentPathParams,
) -> std::result::Result<(
  models::DeleteAgentPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteAgent - DELETE /etc/replication/agents.{runmode}/{name}
#[tracing::instrument(skip_all)]
async fn delete_agent<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteAgentPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_agent_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().delete_agent(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::DeleteAgentResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn delete_node_validation(
  path_params: models::DeleteNodePathParams,
) -> std::result::Result<(
  models::DeleteNodePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// DeleteNode - DELETE /{path}/{name}
#[tracing::instrument(skip_all)]
async fn delete_node<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::DeleteNodePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    delete_node_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().delete_node(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::DeleteNodeResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_agent_validation(
  path_params: models::GetAgentPathParams,
) -> std::result::Result<(
  models::GetAgentPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetAgent - GET /etc/replication/agents.{runmode}/{name}
#[tracing::instrument(skip_all)]
async fn get_agent<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetAgentPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_agent_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_agent(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetAgentResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_agents_validation(
  path_params: models::GetAgentsPathParams,
) -> std::result::Result<(
  models::GetAgentsPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetAgents - GET /etc/replication/agents.{runmode}.-1.json
#[tracing::instrument(skip_all)]
async fn get_agents<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetAgentsPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_agents_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_agents(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetAgentsResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_authorizable_keystore_validation(
  path_params: models::GetAuthorizableKeystorePathParams,
) -> std::result::Result<(
  models::GetAuthorizableKeystorePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetAuthorizableKeystore - GET /{intermediatePath}/{authorizableId}.ks.json
#[tracing::instrument(skip_all)]
async fn get_authorizable_keystore<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetAuthorizableKeystorePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_authorizable_keystore_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_authorizable_keystore(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetAuthorizableKeystoreResponse::Status200_RetrievedAuthorizableKeystoreInfo
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::sling::GetAuthorizableKeystoreResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_keystore_validation(
  path_params: models::GetKeystorePathParams,
) -> std::result::Result<(
  models::GetKeystorePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetKeystore - GET /{intermediatePath}/{authorizableId}/keystore/store.p12
#[tracing::instrument(skip_all)]
async fn get_keystore<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetKeystorePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_keystore_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_keystore(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetKeystoreResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/octet-stream"));
                                                  }

                                                  let body_content = body.0;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_node_validation(
  path_params: models::GetNodePathParams,
) -> std::result::Result<(
  models::GetNodePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetNode - GET /{path}/{name}
#[tracing::instrument(skip_all)]
async fn get_node<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetNodePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_node_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_node(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetNodeResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_package_validation(
  path_params: models::GetPackagePathParams,
) -> std::result::Result<(
  models::GetPackagePathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetPackage - GET /etc/packages/{group}/{name}-{version}.zip
#[tracing::instrument(skip_all)]
async fn get_package<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetPackagePathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_package_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_package(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetPackageResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/octet-stream"));
                                                  }

                                                  let body_content = body.0;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_package_filter_validation(
  path_params: models::GetPackageFilterPathParams,
) -> std::result::Result<(
  models::GetPackageFilterPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// GetPackageFilter - GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json
#[tracing::instrument(skip_all)]
async fn get_package_filter<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::GetPackageFilterPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_package_filter_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_package_filter(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetPackageFilterResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_query_validation(
  query_params: models::GetQueryQueryParams,
) -> std::result::Result<(
  models::GetQueryQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// GetQuery - GET /bin/querybuilder.json
#[tracing::instrument(skip_all)]
async fn get_query<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::GetQueryQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_query_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_query(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetQueryResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_truststore_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetTruststore - GET /etc/truststore/truststore.p12
#[tracing::instrument(skip_all)]
async fn get_truststore<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_truststore_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_truststore(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetTruststoreResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/octet-stream"));
                                                  }

                                                  let body_content = body.0;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn get_truststore_info_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// GetTruststoreInfo - GET /libs/granite/security/truststore.json
#[tracing::instrument(skip_all)]
async fn get_truststore_info<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    get_truststore_info_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().get_truststore_info(
      
      &method,
      &host,
      &cookies,
        &claims,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::GetTruststoreInfoResponse::Status200_RetrievedAEMTruststoreInfo
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::sling::GetTruststoreInfoResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_agent_validation(
  path_params: models::PostAgentPathParams,
  query_params: models::PostAgentQueryParams,
) -> std::result::Result<(
  models::PostAgentPathParams,
  models::PostAgentQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// PostAgent - POST /etc/replication/agents.{runmode}/{name}
#[tracing::instrument(skip_all)]
async fn post_agent<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostAgentPathParams>,
  QueryExtra(query_params): QueryExtra<models::PostAgentQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_agent_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_agent(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostAgentResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_authorizable_keystore_validation(
  path_params: models::PostAuthorizableKeystorePathParams,
  query_params: models::PostAuthorizableKeystoreQueryParams,
) -> std::result::Result<(
  models::PostAuthorizableKeystorePathParams,
  models::PostAuthorizableKeystoreQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// PostAuthorizableKeystore - POST /{intermediatePath}/{authorizableId}.ks.html
#[tracing::instrument(skip_all)]
async fn post_authorizable_keystore<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostAuthorizableKeystorePathParams>,
  QueryExtra(query_params): QueryExtra<models::PostAuthorizableKeystoreQueryParams>,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_authorizable_keystore_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_authorizable_keystore(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
          body,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostAuthorizableKeystoreResponse::Status200_RetrievedAuthorizableKeystoreInfo
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                                apis::sling::PostAuthorizableKeystoreResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_authorizables_validation(
  query_params: models::PostAuthorizablesQueryParams,
) -> std::result::Result<(
  models::PostAuthorizablesQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostAuthorizables - POST /libs/granite/security/post/authorizables
#[tracing::instrument(skip_all)]
async fn post_authorizables<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostAuthorizablesQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_authorizables_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_authorizables(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostAuthorizablesResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/html"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_adobe_granite_saml_authentication_handler_validation(
  query_params: models::PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams,
) -> std::result::Result<(
  models::PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigAdobeGraniteSamlAuthenticationHandler - POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config
#[tracing::instrument(skip_all)]
async fn post_config_adobe_granite_saml_authentication_handler<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_adobe_granite_saml_authentication_handler_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_adobe_granite_saml_authentication_handler(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostConfigAdobeGraniteSamlAuthenticationHandlerResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_apache_felix_jetty_based_http_service_validation(
  query_params: models::PostConfigApacheFelixJettyBasedHttpServiceQueryParams,
) -> std::result::Result<(
  models::PostConfigApacheFelixJettyBasedHttpServiceQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigApacheFelixJettyBasedHttpService - POST /apps/system/config/org.apache.felix.http
#[tracing::instrument(skip_all)]
async fn post_config_apache_felix_jetty_based_http_service<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigApacheFelixJettyBasedHttpServiceQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_apache_felix_jetty_based_http_service_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_apache_felix_jetty_based_http_service(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostConfigApacheFelixJettyBasedHttpServiceResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_apache_http_components_proxy_configuration_validation(
  query_params: models::PostConfigApacheHttpComponentsProxyConfigurationQueryParams,
) -> std::result::Result<(
  models::PostConfigApacheHttpComponentsProxyConfigurationQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigApacheHttpComponentsProxyConfiguration - POST /apps/system/config/org.apache.http.proxyconfigurator.config
#[tracing::instrument(skip_all)]
async fn post_config_apache_http_components_proxy_configuration<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigApacheHttpComponentsProxyConfigurationQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_apache_http_components_proxy_configuration_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_apache_http_components_proxy_configuration(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostConfigApacheHttpComponentsProxyConfigurationResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_apache_sling_dav_ex_servlet_validation(
  query_params: models::PostConfigApacheSlingDavExServletQueryParams,
) -> std::result::Result<(
  models::PostConfigApacheSlingDavExServletQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigApacheSlingDavExServlet - POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
#[tracing::instrument(skip_all)]
async fn post_config_apache_sling_dav_ex_servlet<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigApacheSlingDavExServletQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_apache_sling_dav_ex_servlet_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_apache_sling_dav_ex_servlet(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostConfigApacheSlingDavExServletResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_apache_sling_get_servlet_validation(
  query_params: models::PostConfigApacheSlingGetServletQueryParams,
) -> std::result::Result<(
  models::PostConfigApacheSlingGetServletQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigApacheSlingGetServlet - POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet
#[tracing::instrument(skip_all)]
async fn post_config_apache_sling_get_servlet<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigApacheSlingGetServletQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_apache_sling_get_servlet_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_apache_sling_get_servlet(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostConfigApacheSlingGetServletResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_apache_sling_referrer_filter_validation(
  query_params: models::PostConfigApacheSlingReferrerFilterQueryParams,
) -> std::result::Result<(
  models::PostConfigApacheSlingReferrerFilterQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostConfigApacheSlingReferrerFilter - POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter
#[tracing::instrument(skip_all)]
async fn post_config_apache_sling_referrer_filter<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostConfigApacheSlingReferrerFilterQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_apache_sling_referrer_filter_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_apache_sling_referrer_filter(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostConfigApacheSlingReferrerFilterResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_config_property_validation(
  path_params: models::PostConfigPropertyPathParams,
) -> std::result::Result<(
  models::PostConfigPropertyPathParams,
), ValidationErrors>
{
  path_params.validate()?;

Ok((
  path_params,
))
}
/// PostConfigProperty - POST /apps/system/config/{configNodeName}
#[tracing::instrument(skip_all)]
async fn post_config_property<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostConfigPropertyPathParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_config_property_validation(
        path_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_config_property(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostConfigPropertyResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_node_validation(
  path_params: models::PostNodePathParams,
  query_params: models::PostNodeQueryParams,
) -> std::result::Result<(
  models::PostNodePathParams,
  models::PostNodeQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// PostNode - POST /{path}/{name}
#[tracing::instrument(skip_all)]
async fn post_node<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostNodePathParams>,
  QueryExtra(query_params): QueryExtra<models::PostNodeQueryParams>,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_node_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_node(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
          body,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostNodeResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_node_rw_validation(
  path_params: models::PostNodeRwPathParams,
  query_params: models::PostNodeRwQueryParams,
) -> std::result::Result<(
  models::PostNodeRwPathParams,
  models::PostNodeRwQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// PostNodeRw - POST /{path}/{name}.rw.html
#[tracing::instrument(skip_all)]
async fn post_node_rw<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostNodeRwPathParams>,
  QueryExtra(query_params): QueryExtra<models::PostNodeRwQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_node_rw_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_node_rw(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostNodeRwResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_path_validation(
  path_params: models::PostPathPathParams,
  query_params: models::PostPathQueryParams,
) -> std::result::Result<(
  models::PostPathPathParams,
  models::PostPathQueryParams,
), ValidationErrors>
{
  path_params.validate()?;
  query_params.validate()?;

Ok((
  path_params,
  query_params,
))
}
/// PostPath - POST /{path}/
#[tracing::instrument(skip_all)]
async fn post_path<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  Path(path_params): Path<models::PostPathPathParams>,
  QueryExtra(query_params): QueryExtra<models::PostPathQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_path_validation(
        path_params,
        query_params,
    )
  ).await.unwrap();

  let Ok((
    path_params,
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_path(
      
      &method,
      &host,
      &cookies,
        &claims,
        &path_params,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostPathResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_query_validation(
  query_params: models::PostQueryQueryParams,
) -> std::result::Result<(
  models::PostQueryQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostQuery - POST /bin/querybuilder.json
#[tracing::instrument(skip_all)]
async fn post_query<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostQueryQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_query_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_query(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostQueryResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("application/json"));
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_tree_activation_validation(
  query_params: models::PostTreeActivationQueryParams,
) -> std::result::Result<(
  models::PostTreeActivationQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostTreeActivation - POST /libs/replication/treeactivation.html
#[tracing::instrument(skip_all)]
async fn post_tree_activation<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostTreeActivationQueryParams>,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_tree_activation_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_tree_activation(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostTreeActivationResponse::Status0_DefaultResponse
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  response.body(Body::empty())
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_truststore_validation(
  query_params: models::PostTruststoreQueryParams,
) -> std::result::Result<(
  models::PostTruststoreQueryParams,
), ValidationErrors>
{
  query_params.validate()?;

Ok((
  query_params,
))
}
/// PostTruststore - POST /libs/granite/security/post/truststore
#[tracing::instrument(skip_all)]
async fn post_truststore<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
  QueryExtra(query_params): QueryExtra<models::PostTruststoreQueryParams>,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_truststore_validation(
        query_params,
    )
  ).await.unwrap();

  let Ok((
    query_params,
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_truststore(
      
      &method,
      &host,
      &cookies,
        &claims,
        &query_params,
          body,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostTruststoreResponse::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[tracing::instrument(skip_all)]
fn post_truststore_pkcs12_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}
/// PostTruststorePkcs12 - POST /etc/truststore
#[tracing::instrument(skip_all)]
async fn post_truststore_pkcs12<I, A, E, C>(
  method: Method,
  TypedHeader(host): TypedHeader<Host>,
  cookies: CookieJar,
  headers: HeaderMap,
 State(api_impl): State<I>,
  body: Multipart,
) -> Result<Response, StatusCode>
where
    I: AsRef<A> + Send + Sync,
    A: apis::sling::Sling<E, Claims = C>+ apis::ApiAuthBasic<Claims = C> + Send + Sync,
    E: std::fmt::Debug + Send + Sync + 'static,
        {


    // Authentication
    let claims_in_auth_header = api_impl.as_ref().extract_claims_from_auth_header(apis::BasicAuthKind::Basic, &headers, "authorization").await;
    let claims = None
             .or(claims_in_auth_header)
          ;
    let Some(claims) = claims else {
        return response_with_status_code_only(StatusCode::UNAUTHORIZED);
    };


      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move ||
    post_truststore_pkcs12_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST);
  };



  let result = api_impl.as_ref().post_truststore_pkcs12(
      
      &method,
      &host,
      &cookies,
        &claims,
          body,
  ).await;

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                apis::sling::PostTruststorePkcs12Response::Status0_DefaultResponse
                                                    (body)
                                                => {
                                                let mut response = Response::builder();
                                                  let mut response = response.status(0);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                  }

                                                  let body_content = body;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(why) => {
                                                    // Application code returned an error. This should not happen, as the implementation should
                                                    // return a valid response.
                                                    return api_impl.as_ref().handle_error(&method, &host, &cookies, why).await;
                                            },
                                        };


                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}


#[allow(dead_code)]
#[inline]
fn response_with_status_code_only(code: StatusCode) -> Result<Response, StatusCode> {
   Response::builder()
          .status(code)
          .body(Body::empty())
          .map_err(|_| code)
}
