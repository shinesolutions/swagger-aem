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
pub enum GetAemHealthCheckResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigAemHealthCheckServletResponse {
    /// Default response
    Status0_DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostConfigAemPasswordResetResponse {
    /// Default response
    Status0_DefaultResponse
}




/// Custom
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Custom<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// GetAemHealthCheck - GET /system/health
    async fn get_aem_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::GetAemHealthCheckQueryParams,
    ) -> Result<GetAemHealthCheckResponse, E>;

    /// PostConfigAemHealthCheckServlet - POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck
    async fn post_config_aem_health_check_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigAemHealthCheckServletQueryParams,
    ) -> Result<PostConfigAemHealthCheckServletResponse, E>;

    /// PostConfigAemPasswordReset - POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator
    async fn post_config_aem_password_reset(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostConfigAemPasswordResetQueryParams,
    ) -> Result<PostConfigAemPasswordResetResponse, E>;
}
