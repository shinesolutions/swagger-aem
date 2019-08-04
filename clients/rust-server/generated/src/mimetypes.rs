/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for GetAemProductInfo
    lazy_static! {
        pub static ref GET_AEM_PRODUCT_INFO_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetConfigMgr
    lazy_static! {
        pub static ref GET_CONFIG_MGR_OK: Mime = "text/xml".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostSamlConfiguration
    lazy_static! {
        pub static ref POST_SAML_CONFIGURATION_RETRIEVED_AEMSAML_CONFIGURATION: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostSamlConfiguration
    lazy_static! {
        pub static ref POST_SAML_CONFIGURATION_DEFAULT_RESPONSE: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostSamlConfiguration
    lazy_static! {
        pub static ref POST_SAML_CONFIGURATION_DEFAULT_RESPONSE: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetLoginPage
    lazy_static! {
        pub static ref GET_LOGIN_PAGE_DEFAULT_RESPONSE: Mime = "text/html".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetCrxdeStatus
    lazy_static! {
        pub static ref GET_CRXDE_STATUS_CRXDE_IS_ENABLED: Mime = "plain/text".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetCrxdeStatus
    lazy_static! {
        pub static ref GET_CRXDE_STATUS_CRXDE_IS_DISABLED: Mime = "plain/text".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetInstallStatus
    lazy_static! {
        pub static ref GET_INSTALL_STATUS_RETRIEVED_CRX_PACKAGE_MANAGER_INSTALL_STATUS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetInstallStatus
    lazy_static! {
        pub static ref GET_INSTALL_STATUS_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetPackageManagerServlet
    lazy_static! {
        pub static ref GET_PACKAGE_MANAGER_SERVLET_PACKAGE_MANAGER_SERVLET_IS_DISABLED: Mime = "text/html".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetPackageManagerServlet
    lazy_static! {
        pub static ref GET_PACKAGE_MANAGER_SERVLET_PACKAGE_MANAGER_SERVLET_IS_ACTIVE: Mime = "text/html".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostPackageService
    lazy_static! {
        pub static ref POST_PACKAGE_SERVICE_DEFAULT_RESPONSE: Mime = "text/xml".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostPackageServiceJson
    lazy_static! {
        pub static ref POST_PACKAGE_SERVICE_JSON_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostPackageUpdate
    lazy_static! {
        pub static ref POST_PACKAGE_UPDATE_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostSetPassword
    lazy_static! {
        pub static ref POST_SET_PASSWORD_DEFAULT_RESPONSE: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAemHealthCheck
    lazy_static! {
        pub static ref GET_AEM_HEALTH_CHECK_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAgents
    lazy_static! {
        pub static ref GET_AGENTS_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAuthorizableKeystore
    lazy_static! {
        pub static ref GET_AUTHORIZABLE_KEYSTORE_RETRIEVED_AUTHORIZABLE_KEYSTORE_INFO: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAuthorizableKeystore
    lazy_static! {
        pub static ref GET_AUTHORIZABLE_KEYSTORE_DEFAULT_RESPONSE: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetKeystore
    lazy_static! {
        pub static ref GET_KEYSTORE_DEFAULT_RESPONSE: Mime = "application/octet-stream".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetPackage
    lazy_static! {
        pub static ref GET_PACKAGE_DEFAULT_RESPONSE: Mime = "application/octet-stream".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetPackageFilter
    lazy_static! {
        pub static ref GET_PACKAGE_FILTER_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetQuery
    lazy_static! {
        pub static ref GET_QUERY_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetTruststore
    lazy_static! {
        pub static ref GET_TRUSTSTORE_DEFAULT_RESPONSE: Mime = "application/octet-stream".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetTruststoreInfo
    lazy_static! {
        pub static ref GET_TRUSTSTORE_INFO_RETRIEVED_AEM_TRUSTSTORE_INFO: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetTruststoreInfo
    lazy_static! {
        pub static ref GET_TRUSTSTORE_INFO_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostAuthorizableKeystore
    lazy_static! {
        pub static ref POST_AUTHORIZABLE_KEYSTORE_RETRIEVED_AUTHORIZABLE_KEYSTORE_INFO: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostAuthorizableKeystore
    lazy_static! {
        pub static ref POST_AUTHORIZABLE_KEYSTORE_DEFAULT_RESPONSE: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostAuthorizables
    lazy_static! {
        pub static ref POST_AUTHORIZABLES_DEFAULT_RESPONSE: Mime = "text/html".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostQuery
    lazy_static! {
        pub static ref POST_QUERY_DEFAULT_RESPONSE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostTruststore
    lazy_static! {
        pub static ref POST_TRUSTSTORE_DEFAULT_RESPONSE: Mime = "text/plain".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PostTruststorePKCS12
    lazy_static! {
        pub static ref POST_TRUSTSTORE_PKCS12_DEFAULT_RESPONSE: Mime = "text/plain".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;
   /// Create Mime objects for the request content types for PostPackageServiceJson
    lazy_static! {
        pub static ref POST_PACKAGE_SERVICE_JSON: Mime = "multipart/form-data".parse().unwrap();
    }
   /// Create Mime objects for the request content types for PostAuthorizableKeystore
    lazy_static! {
        pub static ref POST_AUTHORIZABLE_KEYSTORE: Mime = "multipart/form-data".parse().unwrap();
    }
   /// Create Mime objects for the request content types for PostNode
    lazy_static! {
        pub static ref POST_NODE: Mime = "multipart/form-data".parse().unwrap();
    }
   /// Create Mime objects for the request content types for PostTruststore
    lazy_static! {
        pub static ref POST_TRUSTSTORE: Mime = "multipart/form-data".parse().unwrap();
    }
   /// Create Mime objects for the request content types for PostTruststorePKCS12
    lazy_static! {
        pub static ref POST_TRUSTSTORE_PKCS12: Mime = "multipart/form-data".parse().unwrap();
    }

}
