use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::CookieJar;
use bytes::Bytes;
use headers::Host;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteAgentResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteNodeResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetAgentResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetAgentsResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetAuthorizableKeystoreResponse {
    /// Retrieved Authorizable Keystore info
    Status200_RetrievedAuthorizableKeystoreInfo
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetKeystoreResponse {
    /// Default response
    Status0_DefaultResponse
    (ByteArray)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetNodeResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetPackageResponse {
    /// Default response
    Status0_DefaultResponse
    (ByteArray)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetPackageFilterResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetQueryResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetTruststoreResponse {
    /// Default response
    Status0_DefaultResponse
    (ByteArray)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetTruststoreInfoResponse {
    /// Retrieved AEM Truststore info
    Status200_RetrievedAEMTruststoreInfo
    (models::TruststoreInfo)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostAgentResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostAuthorizableKeystoreResponse {
    /// Retrieved Authorizable Keystore info
    Status200_RetrievedAuthorizableKeystoreInfo
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostAuthorizablesResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigAdobeGraniteSamlAuthenticationHandlerResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigApacheFelixJettyBasedHttpServiceResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigApacheHttpComponentsProxyConfigurationResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigApacheSlingDavExServletResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigApacheSlingGetServletResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigApacheSlingReferrerFilterResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigPropertyResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostNodeResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostNodeRwResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostPathResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostQueryResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostTreeActivationResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostTruststoreResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostTruststorePkcs12Response {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Sling
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Sling<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// DeleteAgent - DELETE /etc/replication/agents.{runmode}/{name}
    async fn delete_agent(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteAgentPathParams,
    ) -> Result<DeleteAgentResponse, E>;

    /// DeleteNode - DELETE /{path}/{name}
    async fn delete_node(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteNodePathParams,
    ) -> Result<DeleteNodeResponse, E>;

    /// GetAgent - GET /etc/replication/agents.{runmode}/{name}
    async fn get_agent(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetAgentPathParams,
    ) -> Result<GetAgentResponse, E>;

    /// GetAgents - GET /etc/replication/agents.{runmode}.-1.json
    async fn get_agents(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetAgentsPathParams,
    ) -> Result<GetAgentsResponse, E>;

    /// GetAuthorizableKeystore - GET /{intermediatePath}/{authorizableId}.ks.json
    async fn get_authorizable_keystore(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetAuthorizableKeystorePathParams,
    ) -> Result<GetAuthorizableKeystoreResponse, E>;

    /// GetKeystore - GET /{intermediatePath}/{authorizableId}/keystore/store.p12
    async fn get_keystore(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetKeystorePathParams,
    ) -> Result<GetKeystoreResponse, E>;

    /// GetNode - GET /{path}/{name}
    async fn get_node(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetNodePathParams,
    ) -> Result<GetNodeResponse, E>;

    /// GetPackage - GET /etc/packages/{group}/{name}-{version}.zip
    async fn get_package(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetPackagePathParams,
    ) -> Result<GetPackageResponse, E>;

    /// GetPackageFilter - GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json
    async fn get_package_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetPackageFilterPathParams,
    ) -> Result<GetPackageFilterResponse, E>;

    /// GetQuery - GET /bin/querybuilder.json
    async fn get_query(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::GetQueryQueryParams,
    ) -> Result<GetQueryResponse, E>;

    /// GetTruststore - GET /etc/truststore/truststore.p12
    async fn get_truststore(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    ) -> Result<GetTruststoreResponse, E>;

    /// GetTruststoreInfo - GET /libs/granite/security/truststore.json
    async fn get_truststore_info(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    ) -> Result<GetTruststoreInfoResponse, E>;

    /// PostAgent - POST /etc/replication/agents.{runmode}/{name}
    async fn post_agent(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostAgentPathParams,
      query_params: &models::PostAgentQueryParams,
    ) -> Result<PostAgentResponse, E>;

    /// PostAuthorizableKeystore - POST /{intermediatePath}/{authorizableId}.ks.html
    async fn post_authorizable_keystore(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostAuthorizableKeystorePathParams,
      query_params: &models::PostAuthorizableKeystoreQueryParams,
    body: Multipart,
    ) -> Result<PostAuthorizableKeystoreResponse, E>;

    /// PostAuthorizables - POST /libs/granite/security/post/authorizables
    async fn post_authorizables(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostAuthorizablesQueryParams,
    ) -> Result<PostAuthorizablesResponse, E>;

    /// PostConfigAdobeGraniteSamlAuthenticationHandler - POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config
    async fn post_config_adobe_granite_saml_authentication_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams,
    ) -> Result<PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, E>;

    /// PostConfigApacheFelixJettyBasedHttpService - POST /apps/system/config/org.apache.felix.http
    async fn post_config_apache_felix_jetty_based_http_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigApacheFelixJettyBasedHttpServiceQueryParams,
    ) -> Result<PostConfigApacheFelixJettyBasedHttpServiceResponse, E>;

    /// PostConfigApacheHttpComponentsProxyConfiguration - POST /apps/system/config/org.apache.http.proxyconfigurator.config
    async fn post_config_apache_http_components_proxy_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigApacheHttpComponentsProxyConfigurationQueryParams,
    ) -> Result<PostConfigApacheHttpComponentsProxyConfigurationResponse, E>;

    /// PostConfigApacheSlingDavExServlet - POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
    async fn post_config_apache_sling_dav_ex_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigApacheSlingDavExServletQueryParams,
    ) -> Result<PostConfigApacheSlingDavExServletResponse, E>;

    /// PostConfigApacheSlingGetServlet - POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet
    async fn post_config_apache_sling_get_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigApacheSlingGetServletQueryParams,
    ) -> Result<PostConfigApacheSlingGetServletResponse, E>;

    /// PostConfigApacheSlingReferrerFilter - POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter
    async fn post_config_apache_sling_referrer_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigApacheSlingReferrerFilterQueryParams,
    ) -> Result<PostConfigApacheSlingReferrerFilterResponse, E>;

    /// PostConfigProperty - POST /apps/system/config/{configNodeName}
    async fn post_config_property(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostConfigPropertyPathParams,
    ) -> Result<PostConfigPropertyResponse, E>;

    /// PostNode - POST /{path}/{name}
    async fn post_node(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostNodePathParams,
      query_params: &models::PostNodeQueryParams,
    body: Multipart,
    ) -> Result<PostNodeResponse, E>;

    /// PostNodeRw - POST /{path}/{name}.rw.html
    async fn post_node_rw(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostNodeRwPathParams,
      query_params: &models::PostNodeRwQueryParams,
    ) -> Result<PostNodeRwResponse, E>;

    /// PostPath - POST /{path}/
    async fn post_path(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostPathPathParams,
      query_params: &models::PostPathQueryParams,
    ) -> Result<PostPathResponse, E>;

    /// PostQuery - POST /bin/querybuilder.json
    async fn post_query(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostQueryQueryParams,
    ) -> Result<PostQueryResponse, E>;

    /// PostTreeActivation - POST /libs/replication/treeactivation.html
    async fn post_tree_activation(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostTreeActivationQueryParams,
    ) -> Result<PostTreeActivationResponse, E>;

    /// PostTruststore - POST /libs/granite/security/post/truststore
    async fn post_truststore(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostTruststoreQueryParams,
    body: Multipart,
    ) -> Result<PostTruststoreResponse, E>;

    /// PostTruststorePkcs12 - POST /etc/truststore
    async fn post_truststore_pkcs12(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    body: Multipart,
    ) -> Result<PostTruststorePkcs12Response, E>;
}
