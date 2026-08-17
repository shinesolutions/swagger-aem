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
pub enum GetCrxdeStatusResponse {
    /// CRXDE is enabled
    Status200_CRXDEIsEnabled
    (String)
    ,
    /// CRXDE is disabled
    Status404_CRXDEIsDisabled
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetInstallStatusResponse {
    /// Retrieved CRX package manager install status
    Status200_RetrievedCRXPackageManagerInstallStatus
    (models::InstallStatus)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetPackageManagerServletResponse {
    /// Package Manager Servlet is disabled
    Status404_PackageManagerServletIsDisabled
    (String)
    ,
    /// Package Manager Servlet is active
    Status405_PackageManagerServletIsActive
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostPackageServiceResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostPackageServiceJsonResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostPackageUpdateResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PostSetPasswordResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Crx
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Crx<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// GetCrxdeStatus - GET /crx/server/crx.default/jcr:root/.1.json
    async fn get_crxde_status(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    ) -> Result<GetCrxdeStatusResponse, E>;

    /// GetInstallStatus - GET /crx/packmgr/installstatus.jsp
    async fn get_install_status(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    ) -> Result<GetInstallStatusResponse, E>;

    /// GetPackageManagerServlet - GET /crx/packmgr/service/script.html
    async fn get_package_manager_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    ) -> Result<GetPackageManagerServletResponse, E>;

    /// PostPackageService - POST /crx/packmgr/service.jsp
    async fn post_package_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostPackageServiceQueryParams,
    ) -> Result<PostPackageServiceResponse, E>;

    /// PostPackageServiceJson - POST /crx/packmgr/service/.json/{path}
    async fn post_package_service_json(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PostPackageServiceJsonPathParams,
      query_params: &models::PostPackageServiceJsonQueryParams,
    body: Multipart,
    ) -> Result<PostPackageServiceJsonResponse, E>;

    /// PostPackageUpdate - POST /crx/packmgr/update.jsp
    async fn post_package_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostPackageUpdateQueryParams,
    ) -> Result<PostPackageUpdateResponse, E>;

    /// PostSetPassword - POST /crx/explorer/ui/setpassword.jsp
    async fn post_set_password(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PostSetPasswordQueryParams,
    ) -> Result<PostSetPasswordResponse, E>;
}
