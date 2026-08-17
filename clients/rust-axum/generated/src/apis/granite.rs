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
pub enum SslSetupResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Granite
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Granite<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// SslSetup - POST /libs/granite/security/post/sslSetup.html
    async fn ssl_setup(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::SslSetupQueryParams,
    body: Multipart,
    ) -> Result<SslSetupResponse, E>;
}
