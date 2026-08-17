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
pub enum GetAemProductInfoResponse {
    /// Default response
    Status0_DefaultResponse
    (Vec<String>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetBundleInfoResponse {
    /// Retrieved bundle info
    Status200_RetrievedBundleInfo
    (models::BundleInfo)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetConfigMgrResponse {
    /// OK
    Status200_OK
    (String)
    ,
    /// Unexpected error.
    Status5XX_UnexpectedError
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostBundleResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostJmxRepositoryResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostSamlConfigurationResponse {
    /// Retrieved AEM SAML Configuration
    Status200_RetrievedAEMSAMLConfiguration
    (String)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Console
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Console<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// GetAemProductInfo - GET /system/console/status-productinfo.json
    async fn get_aem_product_info(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    ) -> Result<GetAemProductInfoResponse, E>;

    /// GetBundleInfo - GET /system/console/bundles/{name}.json
    async fn get_bundle_info(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetBundleInfoPathParams,
    ) -> Result<GetBundleInfoResponse, E>;

    /// GetConfigMgr - GET /system/console/configMgr
    async fn get_config_mgr(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    ) -> Result<GetConfigMgrResponse, E>;

    /// PostBundle - POST /system/console/bundles/{name}
    async fn post_bundle(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostBundlePathParams,
      query_params: &models::PostBundleQueryParams,
    ) -> Result<PostBundleResponse, E>;

    /// PostJmxRepository - POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}
    async fn post_jmx_repository(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostJmxRepositoryPathParams,
    ) -> Result<PostJmxRepositoryResponse, E>;

    /// PostSamlConfiguration - POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
    async fn post_saml_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostSamlConfigurationQueryParams,
    ) -> Result<PostSamlConfigurationResponse, E>;
}
