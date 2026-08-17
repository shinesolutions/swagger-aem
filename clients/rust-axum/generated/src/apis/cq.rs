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
pub enum GetLoginPageResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostCqActionsResponse {
    /// Default response
    Status0_DefaultResponse
}




/// Cq
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Cq<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// GetLoginPage - GET /libs/granite/core/content/login.html
    async fn get_login_page(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
    ) -> Result<GetLoginPageResponse, E>;

    /// PostCqActions - POST /.cqactions.html
    async fn post_cq_actions(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostCqActionsQueryParams,
    ) -> Result<PostCqActionsResponse, E>;
}
