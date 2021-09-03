#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};

type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &'static str = "";
pub const API_VERSION: &'static str = "3.5.0-pre.0";

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetAemProductInfoResponse {
    /// Default response
    DefaultResponse
    (Vec<String>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetBundleInfoResponse {
    /// Retrieved bundle info
    RetrievedBundleInfo
    (models::BundleInfo)
    ,
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetConfigMgrResponse {
    /// OK
    OK
    (String)
    ,
    /// Unexpected error.
    UnexpectedError
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostBundleResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostJmxRepositoryResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PostSamlConfigurationResponse {
    /// Retrieved AEM SAML Configuration
    RetrievedAEMSAMLConfiguration
    (String)
    ,
    /// Default response
    DefaultResponse
    (String)
    ,
    /// Default response
    DefaultResponse_2
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetLoginPageResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostCqActionsResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetCrxdeStatusResponse {
    /// CRXDE is enabled
    CRXDEIsEnabled
    (String)
    ,
    /// CRXDE is disabled
    CRXDEIsDisabled
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetInstallStatusResponse {
    /// Retrieved CRX package manager install status
    RetrievedCRXPackageManagerInstallStatus
    (models::InstallStatus)
    ,
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetPackageManagerServletResponse {
    /// Package Manager Servlet is disabled
    PackageManagerServletIsDisabled
    (String)
    ,
    /// Package Manager Servlet is active
    PackageManagerServletIsActive
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostPackageServiceResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostPackageServiceJsonResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostPackageUpdateResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostSetPasswordResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetAemHealthCheckResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigAemHealthCheckServletResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigAemPasswordResetResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum SslSetupResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteAgentResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteNodeResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetAgentResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetAgentsResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetAuthorizableKeystoreResponse {
    /// Retrieved Authorizable Keystore info
    RetrievedAuthorizableKeystoreInfo
    (String)
    ,
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetKeystoreResponse {
    /// Default response
    DefaultResponse
    (swagger::ByteArray)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetNodeResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetPackageResponse {
    /// Default response
    DefaultResponse
    (swagger::ByteArray)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetPackageFilterResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetQueryResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetTruststoreResponse {
    /// Default response
    DefaultResponse
    (swagger::ByteArray)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetTruststoreInfoResponse {
    /// Retrieved AEM Truststore info
    RetrievedAEMTruststoreInfo
    (models::TruststoreInfo)
    ,
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostAgentResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PostAuthorizableKeystoreResponse {
    /// Retrieved Authorizable Keystore info
    RetrievedAuthorizableKeystoreInfo
    (String)
    ,
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostAuthorizablesResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigAdobeGraniteSamlAuthenticationHandlerResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigApacheFelixJettyBasedHttpServiceResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigApacheHttpComponentsProxyConfigurationResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigApacheSlingDavExServletResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigApacheSlingGetServletResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigApacheSlingReferrerFilterResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostConfigPropertyResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostNodeResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostNodeRwResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostPathResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostQueryResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostTreeActivationResponse {
    /// Default response
    DefaultResponse
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostTruststoreResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PostTruststorePKCS12Response {
    /// Default response
    DefaultResponse
    (String)
}

/// API
#[async_trait]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    async fn get_aem_product_info(
        &self,
        context: &C) -> Result<GetAemProductInfoResponse, ApiError>;

    async fn get_bundle_info(
        &self,
        name: String,
        context: &C) -> Result<GetBundleInfoResponse, ApiError>;

    async fn get_config_mgr(
        &self,
        context: &C) -> Result<GetConfigMgrResponse, ApiError>;

    async fn post_bundle(
        &self,
        name: String,
        action: String,
        context: &C) -> Result<PostBundleResponse, ApiError>;

    async fn post_jmx_repository(
        &self,
        action: String,
        context: &C) -> Result<PostJmxRepositoryResponse, ApiError>;

    async fn post_saml_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        location: Option<String>,
        path: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        idp_url: Option<String>,
        idp_cert_alias: Option<String>,
        idp_http_redirect: Option<bool>,
        service_provider_entity_id: Option<String>,
        assertion_consumer_service_url: Option<String>,
        sp_private_key_alias: Option<String>,
        key_store_password: Option<String>,
        default_redirect_url: Option<String>,
        user_id_attribute: Option<String>,
        use_encryption: Option<bool>,
        create_user: Option<bool>,
        add_group_memberships: Option<bool>,
        group_membership_attribute: Option<String>,
        default_groups: Option<&Vec<String>>,
        name_id_format: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
        handle_logout: Option<bool>,
        logout_url: Option<String>,
        clock_tolerance: Option<i32>,
        digest_method: Option<String>,
        signature_method: Option<String>,
        user_intermediate_path: Option<String>,
        propertylist: Option<&Vec<String>>,
        context: &C) -> Result<PostSamlConfigurationResponse, ApiError>;

    async fn get_login_page(
        &self,
        context: &C) -> Result<GetLoginPageResponse, ApiError>;

    async fn post_cq_actions(
        &self,
        authorizable_id: String,
        changelog: String,
        context: &C) -> Result<PostCqActionsResponse, ApiError>;

    async fn get_crxde_status(
        &self,
        context: &C) -> Result<GetCrxdeStatusResponse, ApiError>;

    async fn get_install_status(
        &self,
        context: &C) -> Result<GetInstallStatusResponse, ApiError>;

    async fn get_package_manager_servlet(
        &self,
        context: &C) -> Result<GetPackageManagerServletResponse, ApiError>;

    async fn post_package_service(
        &self,
        cmd: String,
        context: &C) -> Result<PostPackageServiceResponse, ApiError>;

    async fn post_package_service_json(
        &self,
        path: String,
        cmd: String,
        group_name: Option<String>,
        package_name: Option<String>,
        package_version: Option<String>,
        _charset_: Option<String>,
        force: Option<bool>,
        recursive: Option<bool>,
        package: Option<swagger::ByteArray>,
        context: &C) -> Result<PostPackageServiceJsonResponse, ApiError>;

    async fn post_package_update(
        &self,
        group_name: String,
        package_name: String,
        version: String,
        path: String,
        filter: Option<String>,
        _charset_: Option<String>,
        context: &C) -> Result<PostPackageUpdateResponse, ApiError>;

    async fn post_set_password(
        &self,
        old: String,
        plain: String,
        verify: String,
        context: &C) -> Result<PostSetPasswordResponse, ApiError>;

    async fn get_aem_health_check(
        &self,
        tags: Option<String>,
        combine_tags_or: Option<bool>,
        context: &C) -> Result<GetAemHealthCheckResponse, ApiError>;

    async fn post_config_aem_health_check_servlet(
        &self,
        bundles_ignored: Option<&Vec<String>>,
        bundles_ignored_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAemHealthCheckServletResponse, ApiError>;

    async fn post_config_aem_password_reset(
        &self,
        pwdreset_authorizables: Option<&Vec<String>>,
        pwdreset_authorizables_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAemPasswordResetResponse, ApiError>;

    async fn ssl_setup(
        &self,
        keystore_password: String,
        keystore_password_confirm: String,
        truststore_password: String,
        truststore_password_confirm: String,
        https_hostname: String,
        https_port: String,
        privatekey_file: Option<swagger::ByteArray>,
        certificate_file: Option<swagger::ByteArray>,
        context: &C) -> Result<SslSetupResponse, ApiError>;

    async fn delete_agent(
        &self,
        runmode: String,
        name: String,
        context: &C) -> Result<DeleteAgentResponse, ApiError>;

    async fn delete_node(
        &self,
        path: String,
        name: String,
        context: &C) -> Result<DeleteNodeResponse, ApiError>;

    async fn get_agent(
        &self,
        runmode: String,
        name: String,
        context: &C) -> Result<GetAgentResponse, ApiError>;

    async fn get_agents(
        &self,
        runmode: String,
        context: &C) -> Result<GetAgentsResponse, ApiError>;

    async fn get_authorizable_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        context: &C) -> Result<GetAuthorizableKeystoreResponse, ApiError>;

    async fn get_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        context: &C) -> Result<GetKeystoreResponse, ApiError>;

    async fn get_node(
        &self,
        path: String,
        name: String,
        context: &C) -> Result<GetNodeResponse, ApiError>;

    async fn get_package(
        &self,
        group: String,
        name: String,
        version: String,
        context: &C) -> Result<GetPackageResponse, ApiError>;

    async fn get_package_filter(
        &self,
        group: String,
        name: String,
        version: String,
        context: &C) -> Result<GetPackageFilterResponse, ApiError>;

    async fn get_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        context: &C) -> Result<GetQueryResponse, ApiError>;

    async fn get_truststore(
        &self,
        context: &C) -> Result<GetTruststoreResponse, ApiError>;

    async fn get_truststore_info(
        &self,
        context: &C) -> Result<GetTruststoreInfoResponse, ApiError>;

    async fn post_agent(
        &self,
        runmode: String,
        name: String,
        jcrcontent_cqdistribute: Option<bool>,
        jcrcontent_cqdistribute_type_hint: Option<String>,
        jcrcontent_cqname: Option<String>,
        jcrcontent_cqtemplate: Option<String>,
        jcrcontent_enabled: Option<bool>,
        jcrcontent_jcrdescription: Option<String>,
        jcrcontent_jcrlast_modified: Option<String>,
        jcrcontent_jcrlast_modified_by: Option<String>,
        jcrcontent_jcrmixin_types: Option<String>,
        jcrcontent_jcrtitle: Option<String>,
        jcrcontent_log_level: Option<String>,
        jcrcontent_no_status_update: Option<bool>,
        jcrcontent_no_versioning: Option<bool>,
        jcrcontent_protocol_connect_timeout: Option<f64>,
        jcrcontent_protocol_http_connection_closed: Option<bool>,
        jcrcontent_protocol_http_expired: Option<String>,
        jcrcontent_protocol_http_headers: Option<&Vec<String>>,
        jcrcontent_protocol_http_headers_type_hint: Option<String>,
        jcrcontent_protocol_http_method: Option<String>,
        jcrcontent_protocol_https_relaxed: Option<bool>,
        jcrcontent_protocol_interface: Option<String>,
        jcrcontent_protocol_socket_timeout: Option<f64>,
        jcrcontent_protocol_version: Option<String>,
        jcrcontent_proxy_ntlm_domain: Option<String>,
        jcrcontent_proxy_ntlm_host: Option<String>,
        jcrcontent_proxy_host: Option<String>,
        jcrcontent_proxy_password: Option<String>,
        jcrcontent_proxy_port: Option<f64>,
        jcrcontent_proxy_user: Option<String>,
        jcrcontent_queue_batch_max_size: Option<f64>,
        jcrcontent_queue_batch_mode: Option<String>,
        jcrcontent_queue_batch_wait_time: Option<f64>,
        jcrcontent_retry_delay: Option<String>,
        jcrcontent_reverse_replication: Option<bool>,
        jcrcontent_serialization_type: Option<String>,
        jcrcontent_slingresource_type: Option<String>,
        jcrcontent_ssl: Option<String>,
        jcrcontent_transport_ntlm_domain: Option<String>,
        jcrcontent_transport_ntlm_host: Option<String>,
        jcrcontent_transport_password: Option<String>,
        jcrcontent_transport_uri: Option<String>,
        jcrcontent_transport_user: Option<String>,
        jcrcontent_trigger_distribute: Option<bool>,
        jcrcontent_trigger_modified: Option<bool>,
        jcrcontent_trigger_on_off_time: Option<bool>,
        jcrcontent_trigger_receive: Option<bool>,
        jcrcontent_trigger_specific: Option<bool>,
        jcrcontent_user_id: Option<String>,
        jcrprimary_type: Option<String>,
        operation: Option<String>,
        context: &C) -> Result<PostAgentResponse, ApiError>;

    async fn post_authorizable_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        operation: Option<String>,
        current_password: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_password: Option<String>,
        key_store_pass: Option<String>,
        alias: Option<String>,
        new_alias: Option<String>,
        remove_alias: Option<String>,
        cert_chain: Option<swagger::ByteArray>,
        pk: Option<swagger::ByteArray>,
        key_store: Option<swagger::ByteArray>,
        context: &C) -> Result<PostAuthorizableKeystoreResponse, ApiError>;

    async fn post_authorizables(
        &self,
        authorizable_id: String,
        intermediate_path: String,
        create_user: Option<String>,
        create_group: Option<String>,
        reppassword: Option<String>,
        profile_given_name: Option<String>,
        context: &C) -> Result<PostAuthorizablesResponse, ApiError>;

    async fn post_config_adobe_granite_saml_authentication_handler(
        &self,
        key_store_password: Option<String>,
        key_store_password_type_hint: Option<String>,
        service_ranking: Option<i32>,
        service_ranking_type_hint: Option<String>,
        idp_http_redirect: Option<bool>,
        idp_http_redirect_type_hint: Option<String>,
        create_user: Option<bool>,
        create_user_type_hint: Option<String>,
        default_redirect_url: Option<String>,
        default_redirect_url_type_hint: Option<String>,
        user_id_attribute: Option<String>,
        user_id_attribute_type_hint: Option<String>,
        default_groups: Option<&Vec<String>>,
        default_groups_type_hint: Option<String>,
        idp_cert_alias: Option<String>,
        idp_cert_alias_type_hint: Option<String>,
        add_group_memberships: Option<bool>,
        add_group_memberships_type_hint: Option<String>,
        path: Option<&Vec<String>>,
        path_type_hint: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
        synchronize_attributes_type_hint: Option<String>,
        clock_tolerance: Option<i32>,
        clock_tolerance_type_hint: Option<String>,
        group_membership_attribute: Option<String>,
        group_membership_attribute_type_hint: Option<String>,
        idp_url: Option<String>,
        idp_url_type_hint: Option<String>,
        logout_url: Option<String>,
        logout_url_type_hint: Option<String>,
        service_provider_entity_id: Option<String>,
        service_provider_entity_id_type_hint: Option<String>,
        assertion_consumer_service_url: Option<String>,
        assertion_consumer_service_url_type_hint: Option<String>,
        handle_logout: Option<bool>,
        handle_logout_type_hint: Option<String>,
        sp_private_key_alias: Option<String>,
        sp_private_key_alias_type_hint: Option<String>,
        use_encryption: Option<bool>,
        use_encryption_type_hint: Option<String>,
        name_id_format: Option<String>,
        name_id_format_type_hint: Option<String>,
        digest_method: Option<String>,
        digest_method_type_hint: Option<String>,
        signature_method: Option<String>,
        signature_method_type_hint: Option<String>,
        user_intermediate_path: Option<String>,
        user_intermediate_path_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, ApiError>;

    async fn post_config_apache_felix_jetty_based_http_service(
        &self,
        org_apache_felix_https_nio: Option<bool>,
        org_apache_felix_https_nio_type_hint: Option<String>,
        org_apache_felix_https_keystore: Option<String>,
        org_apache_felix_https_keystore_type_hint: Option<String>,
        org_apache_felix_https_keystore_password: Option<String>,
        org_apache_felix_https_keystore_password_type_hint: Option<String>,
        org_apache_felix_https_keystore_key: Option<String>,
        org_apache_felix_https_keystore_key_type_hint: Option<String>,
        org_apache_felix_https_keystore_key_password: Option<String>,
        org_apache_felix_https_keystore_key_password_type_hint: Option<String>,
        org_apache_felix_https_truststore: Option<String>,
        org_apache_felix_https_truststore_type_hint: Option<String>,
        org_apache_felix_https_truststore_password: Option<String>,
        org_apache_felix_https_truststore_password_type_hint: Option<String>,
        org_apache_felix_https_clientcertificate: Option<String>,
        org_apache_felix_https_clientcertificate_type_hint: Option<String>,
        org_apache_felix_https_enable: Option<bool>,
        org_apache_felix_https_enable_type_hint: Option<String>,
        org_osgi_service_http_port_secure: Option<String>,
        org_osgi_service_http_port_secure_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheFelixJettyBasedHttpServiceResponse, ApiError>;

    async fn post_config_apache_http_components_proxy_configuration(
        &self,
        proxy_host: Option<String>,
        proxy_host_type_hint: Option<String>,
        proxy_port: Option<i32>,
        proxy_port_type_hint: Option<String>,
        proxy_exceptions: Option<&Vec<String>>,
        proxy_exceptions_type_hint: Option<String>,
        proxy_enabled: Option<bool>,
        proxy_enabled_type_hint: Option<String>,
        proxy_user: Option<String>,
        proxy_user_type_hint: Option<String>,
        proxy_password: Option<String>,
        proxy_password_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheHttpComponentsProxyConfigurationResponse, ApiError>;

    async fn post_config_apache_sling_dav_ex_servlet(
        &self,
        alias: Option<String>,
        alias_type_hint: Option<String>,
        dav_create_absolute_uri: Option<bool>,
        dav_create_absolute_uri_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingDavExServletResponse, ApiError>;

    async fn post_config_apache_sling_get_servlet(
        &self,
        json_maximumresults: Option<String>,
        json_maximumresults_type_hint: Option<String>,
        enable_html: Option<bool>,
        enable_html_type_hint: Option<String>,
        enable_txt: Option<bool>,
        enable_txt_type_hint: Option<String>,
        enable_xml: Option<bool>,
        enable_xml_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingGetServletResponse, ApiError>;

    async fn post_config_apache_sling_referrer_filter(
        &self,
        allow_empty: Option<bool>,
        allow_empty_type_hint: Option<String>,
        allow_hosts: Option<String>,
        allow_hosts_type_hint: Option<String>,
        allow_hosts_regexp: Option<String>,
        allow_hosts_regexp_type_hint: Option<String>,
        filter_methods: Option<String>,
        filter_methods_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingReferrerFilterResponse, ApiError>;

    async fn post_config_property(
        &self,
        config_node_name: String,
        context: &C) -> Result<PostConfigPropertyResponse, ApiError>;

    async fn post_node(
        &self,
        path: String,
        name: String,
        operation: Option<String>,
        delete_authorizable: Option<String>,
        file: Option<swagger::ByteArray>,
        context: &C) -> Result<PostNodeResponse, ApiError>;

    async fn post_node_rw(
        &self,
        path: String,
        name: String,
        add_members: Option<String>,
        context: &C) -> Result<PostNodeRwResponse, ApiError>;

    async fn post_path(
        &self,
        path: String,
        jcrprimary_type: String,
        name: String,
        context: &C) -> Result<PostPathResponse, ApiError>;

    async fn post_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        context: &C) -> Result<PostQueryResponse, ApiError>;

    async fn post_tree_activation(
        &self,
        ignoredeactivated: bool,
        onlymodified: bool,
        path: String,
        context: &C) -> Result<PostTreeActivationResponse, ApiError>;

    async fn post_truststore(
        &self,
        operation: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_store_type: Option<String>,
        remove_alias: Option<String>,
        certificate: Option<swagger::ByteArray>,
        context: &C) -> Result<PostTruststoreResponse, ApiError>;

    async fn post_truststore_pkcs12(
        &self,
        truststore_p12: Option<swagger::ByteArray>,
        context: &C) -> Result<PostTruststorePKCS12Response, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    async fn get_aem_product_info(
        &self,
        ) -> Result<GetAemProductInfoResponse, ApiError>;

    async fn get_bundle_info(
        &self,
        name: String,
        ) -> Result<GetBundleInfoResponse, ApiError>;

    async fn get_config_mgr(
        &self,
        ) -> Result<GetConfigMgrResponse, ApiError>;

    async fn post_bundle(
        &self,
        name: String,
        action: String,
        ) -> Result<PostBundleResponse, ApiError>;

    async fn post_jmx_repository(
        &self,
        action: String,
        ) -> Result<PostJmxRepositoryResponse, ApiError>;

    async fn post_saml_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        location: Option<String>,
        path: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        idp_url: Option<String>,
        idp_cert_alias: Option<String>,
        idp_http_redirect: Option<bool>,
        service_provider_entity_id: Option<String>,
        assertion_consumer_service_url: Option<String>,
        sp_private_key_alias: Option<String>,
        key_store_password: Option<String>,
        default_redirect_url: Option<String>,
        user_id_attribute: Option<String>,
        use_encryption: Option<bool>,
        create_user: Option<bool>,
        add_group_memberships: Option<bool>,
        group_membership_attribute: Option<String>,
        default_groups: Option<&Vec<String>>,
        name_id_format: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
        handle_logout: Option<bool>,
        logout_url: Option<String>,
        clock_tolerance: Option<i32>,
        digest_method: Option<String>,
        signature_method: Option<String>,
        user_intermediate_path: Option<String>,
        propertylist: Option<&Vec<String>>,
        ) -> Result<PostSamlConfigurationResponse, ApiError>;

    async fn get_login_page(
        &self,
        ) -> Result<GetLoginPageResponse, ApiError>;

    async fn post_cq_actions(
        &self,
        authorizable_id: String,
        changelog: String,
        ) -> Result<PostCqActionsResponse, ApiError>;

    async fn get_crxde_status(
        &self,
        ) -> Result<GetCrxdeStatusResponse, ApiError>;

    async fn get_install_status(
        &self,
        ) -> Result<GetInstallStatusResponse, ApiError>;

    async fn get_package_manager_servlet(
        &self,
        ) -> Result<GetPackageManagerServletResponse, ApiError>;

    async fn post_package_service(
        &self,
        cmd: String,
        ) -> Result<PostPackageServiceResponse, ApiError>;

    async fn post_package_service_json(
        &self,
        path: String,
        cmd: String,
        group_name: Option<String>,
        package_name: Option<String>,
        package_version: Option<String>,
        _charset_: Option<String>,
        force: Option<bool>,
        recursive: Option<bool>,
        package: Option<swagger::ByteArray>,
        ) -> Result<PostPackageServiceJsonResponse, ApiError>;

    async fn post_package_update(
        &self,
        group_name: String,
        package_name: String,
        version: String,
        path: String,
        filter: Option<String>,
        _charset_: Option<String>,
        ) -> Result<PostPackageUpdateResponse, ApiError>;

    async fn post_set_password(
        &self,
        old: String,
        plain: String,
        verify: String,
        ) -> Result<PostSetPasswordResponse, ApiError>;

    async fn get_aem_health_check(
        &self,
        tags: Option<String>,
        combine_tags_or: Option<bool>,
        ) -> Result<GetAemHealthCheckResponse, ApiError>;

    async fn post_config_aem_health_check_servlet(
        &self,
        bundles_ignored: Option<&Vec<String>>,
        bundles_ignored_type_hint: Option<String>,
        ) -> Result<PostConfigAemHealthCheckServletResponse, ApiError>;

    async fn post_config_aem_password_reset(
        &self,
        pwdreset_authorizables: Option<&Vec<String>>,
        pwdreset_authorizables_type_hint: Option<String>,
        ) -> Result<PostConfigAemPasswordResetResponse, ApiError>;

    async fn ssl_setup(
        &self,
        keystore_password: String,
        keystore_password_confirm: String,
        truststore_password: String,
        truststore_password_confirm: String,
        https_hostname: String,
        https_port: String,
        privatekey_file: Option<swagger::ByteArray>,
        certificate_file: Option<swagger::ByteArray>,
        ) -> Result<SslSetupResponse, ApiError>;

    async fn delete_agent(
        &self,
        runmode: String,
        name: String,
        ) -> Result<DeleteAgentResponse, ApiError>;

    async fn delete_node(
        &self,
        path: String,
        name: String,
        ) -> Result<DeleteNodeResponse, ApiError>;

    async fn get_agent(
        &self,
        runmode: String,
        name: String,
        ) -> Result<GetAgentResponse, ApiError>;

    async fn get_agents(
        &self,
        runmode: String,
        ) -> Result<GetAgentsResponse, ApiError>;

    async fn get_authorizable_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        ) -> Result<GetAuthorizableKeystoreResponse, ApiError>;

    async fn get_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        ) -> Result<GetKeystoreResponse, ApiError>;

    async fn get_node(
        &self,
        path: String,
        name: String,
        ) -> Result<GetNodeResponse, ApiError>;

    async fn get_package(
        &self,
        group: String,
        name: String,
        version: String,
        ) -> Result<GetPackageResponse, ApiError>;

    async fn get_package_filter(
        &self,
        group: String,
        name: String,
        version: String,
        ) -> Result<GetPackageFilterResponse, ApiError>;

    async fn get_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        ) -> Result<GetQueryResponse, ApiError>;

    async fn get_truststore(
        &self,
        ) -> Result<GetTruststoreResponse, ApiError>;

    async fn get_truststore_info(
        &self,
        ) -> Result<GetTruststoreInfoResponse, ApiError>;

    async fn post_agent(
        &self,
        runmode: String,
        name: String,
        jcrcontent_cqdistribute: Option<bool>,
        jcrcontent_cqdistribute_type_hint: Option<String>,
        jcrcontent_cqname: Option<String>,
        jcrcontent_cqtemplate: Option<String>,
        jcrcontent_enabled: Option<bool>,
        jcrcontent_jcrdescription: Option<String>,
        jcrcontent_jcrlast_modified: Option<String>,
        jcrcontent_jcrlast_modified_by: Option<String>,
        jcrcontent_jcrmixin_types: Option<String>,
        jcrcontent_jcrtitle: Option<String>,
        jcrcontent_log_level: Option<String>,
        jcrcontent_no_status_update: Option<bool>,
        jcrcontent_no_versioning: Option<bool>,
        jcrcontent_protocol_connect_timeout: Option<f64>,
        jcrcontent_protocol_http_connection_closed: Option<bool>,
        jcrcontent_protocol_http_expired: Option<String>,
        jcrcontent_protocol_http_headers: Option<&Vec<String>>,
        jcrcontent_protocol_http_headers_type_hint: Option<String>,
        jcrcontent_protocol_http_method: Option<String>,
        jcrcontent_protocol_https_relaxed: Option<bool>,
        jcrcontent_protocol_interface: Option<String>,
        jcrcontent_protocol_socket_timeout: Option<f64>,
        jcrcontent_protocol_version: Option<String>,
        jcrcontent_proxy_ntlm_domain: Option<String>,
        jcrcontent_proxy_ntlm_host: Option<String>,
        jcrcontent_proxy_host: Option<String>,
        jcrcontent_proxy_password: Option<String>,
        jcrcontent_proxy_port: Option<f64>,
        jcrcontent_proxy_user: Option<String>,
        jcrcontent_queue_batch_max_size: Option<f64>,
        jcrcontent_queue_batch_mode: Option<String>,
        jcrcontent_queue_batch_wait_time: Option<f64>,
        jcrcontent_retry_delay: Option<String>,
        jcrcontent_reverse_replication: Option<bool>,
        jcrcontent_serialization_type: Option<String>,
        jcrcontent_slingresource_type: Option<String>,
        jcrcontent_ssl: Option<String>,
        jcrcontent_transport_ntlm_domain: Option<String>,
        jcrcontent_transport_ntlm_host: Option<String>,
        jcrcontent_transport_password: Option<String>,
        jcrcontent_transport_uri: Option<String>,
        jcrcontent_transport_user: Option<String>,
        jcrcontent_trigger_distribute: Option<bool>,
        jcrcontent_trigger_modified: Option<bool>,
        jcrcontent_trigger_on_off_time: Option<bool>,
        jcrcontent_trigger_receive: Option<bool>,
        jcrcontent_trigger_specific: Option<bool>,
        jcrcontent_user_id: Option<String>,
        jcrprimary_type: Option<String>,
        operation: Option<String>,
        ) -> Result<PostAgentResponse, ApiError>;

    async fn post_authorizable_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        operation: Option<String>,
        current_password: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_password: Option<String>,
        key_store_pass: Option<String>,
        alias: Option<String>,
        new_alias: Option<String>,
        remove_alias: Option<String>,
        cert_chain: Option<swagger::ByteArray>,
        pk: Option<swagger::ByteArray>,
        key_store: Option<swagger::ByteArray>,
        ) -> Result<PostAuthorizableKeystoreResponse, ApiError>;

    async fn post_authorizables(
        &self,
        authorizable_id: String,
        intermediate_path: String,
        create_user: Option<String>,
        create_group: Option<String>,
        reppassword: Option<String>,
        profile_given_name: Option<String>,
        ) -> Result<PostAuthorizablesResponse, ApiError>;

    async fn post_config_adobe_granite_saml_authentication_handler(
        &self,
        key_store_password: Option<String>,
        key_store_password_type_hint: Option<String>,
        service_ranking: Option<i32>,
        service_ranking_type_hint: Option<String>,
        idp_http_redirect: Option<bool>,
        idp_http_redirect_type_hint: Option<String>,
        create_user: Option<bool>,
        create_user_type_hint: Option<String>,
        default_redirect_url: Option<String>,
        default_redirect_url_type_hint: Option<String>,
        user_id_attribute: Option<String>,
        user_id_attribute_type_hint: Option<String>,
        default_groups: Option<&Vec<String>>,
        default_groups_type_hint: Option<String>,
        idp_cert_alias: Option<String>,
        idp_cert_alias_type_hint: Option<String>,
        add_group_memberships: Option<bool>,
        add_group_memberships_type_hint: Option<String>,
        path: Option<&Vec<String>>,
        path_type_hint: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
        synchronize_attributes_type_hint: Option<String>,
        clock_tolerance: Option<i32>,
        clock_tolerance_type_hint: Option<String>,
        group_membership_attribute: Option<String>,
        group_membership_attribute_type_hint: Option<String>,
        idp_url: Option<String>,
        idp_url_type_hint: Option<String>,
        logout_url: Option<String>,
        logout_url_type_hint: Option<String>,
        service_provider_entity_id: Option<String>,
        service_provider_entity_id_type_hint: Option<String>,
        assertion_consumer_service_url: Option<String>,
        assertion_consumer_service_url_type_hint: Option<String>,
        handle_logout: Option<bool>,
        handle_logout_type_hint: Option<String>,
        sp_private_key_alias: Option<String>,
        sp_private_key_alias_type_hint: Option<String>,
        use_encryption: Option<bool>,
        use_encryption_type_hint: Option<String>,
        name_id_format: Option<String>,
        name_id_format_type_hint: Option<String>,
        digest_method: Option<String>,
        digest_method_type_hint: Option<String>,
        signature_method: Option<String>,
        signature_method_type_hint: Option<String>,
        user_intermediate_path: Option<String>,
        user_intermediate_path_type_hint: Option<String>,
        ) -> Result<PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, ApiError>;

    async fn post_config_apache_felix_jetty_based_http_service(
        &self,
        org_apache_felix_https_nio: Option<bool>,
        org_apache_felix_https_nio_type_hint: Option<String>,
        org_apache_felix_https_keystore: Option<String>,
        org_apache_felix_https_keystore_type_hint: Option<String>,
        org_apache_felix_https_keystore_password: Option<String>,
        org_apache_felix_https_keystore_password_type_hint: Option<String>,
        org_apache_felix_https_keystore_key: Option<String>,
        org_apache_felix_https_keystore_key_type_hint: Option<String>,
        org_apache_felix_https_keystore_key_password: Option<String>,
        org_apache_felix_https_keystore_key_password_type_hint: Option<String>,
        org_apache_felix_https_truststore: Option<String>,
        org_apache_felix_https_truststore_type_hint: Option<String>,
        org_apache_felix_https_truststore_password: Option<String>,
        org_apache_felix_https_truststore_password_type_hint: Option<String>,
        org_apache_felix_https_clientcertificate: Option<String>,
        org_apache_felix_https_clientcertificate_type_hint: Option<String>,
        org_apache_felix_https_enable: Option<bool>,
        org_apache_felix_https_enable_type_hint: Option<String>,
        org_osgi_service_http_port_secure: Option<String>,
        org_osgi_service_http_port_secure_type_hint: Option<String>,
        ) -> Result<PostConfigApacheFelixJettyBasedHttpServiceResponse, ApiError>;

    async fn post_config_apache_http_components_proxy_configuration(
        &self,
        proxy_host: Option<String>,
        proxy_host_type_hint: Option<String>,
        proxy_port: Option<i32>,
        proxy_port_type_hint: Option<String>,
        proxy_exceptions: Option<&Vec<String>>,
        proxy_exceptions_type_hint: Option<String>,
        proxy_enabled: Option<bool>,
        proxy_enabled_type_hint: Option<String>,
        proxy_user: Option<String>,
        proxy_user_type_hint: Option<String>,
        proxy_password: Option<String>,
        proxy_password_type_hint: Option<String>,
        ) -> Result<PostConfigApacheHttpComponentsProxyConfigurationResponse, ApiError>;

    async fn post_config_apache_sling_dav_ex_servlet(
        &self,
        alias: Option<String>,
        alias_type_hint: Option<String>,
        dav_create_absolute_uri: Option<bool>,
        dav_create_absolute_uri_type_hint: Option<String>,
        ) -> Result<PostConfigApacheSlingDavExServletResponse, ApiError>;

    async fn post_config_apache_sling_get_servlet(
        &self,
        json_maximumresults: Option<String>,
        json_maximumresults_type_hint: Option<String>,
        enable_html: Option<bool>,
        enable_html_type_hint: Option<String>,
        enable_txt: Option<bool>,
        enable_txt_type_hint: Option<String>,
        enable_xml: Option<bool>,
        enable_xml_type_hint: Option<String>,
        ) -> Result<PostConfigApacheSlingGetServletResponse, ApiError>;

    async fn post_config_apache_sling_referrer_filter(
        &self,
        allow_empty: Option<bool>,
        allow_empty_type_hint: Option<String>,
        allow_hosts: Option<String>,
        allow_hosts_type_hint: Option<String>,
        allow_hosts_regexp: Option<String>,
        allow_hosts_regexp_type_hint: Option<String>,
        filter_methods: Option<String>,
        filter_methods_type_hint: Option<String>,
        ) -> Result<PostConfigApacheSlingReferrerFilterResponse, ApiError>;

    async fn post_config_property(
        &self,
        config_node_name: String,
        ) -> Result<PostConfigPropertyResponse, ApiError>;

    async fn post_node(
        &self,
        path: String,
        name: String,
        operation: Option<String>,
        delete_authorizable: Option<String>,
        file: Option<swagger::ByteArray>,
        ) -> Result<PostNodeResponse, ApiError>;

    async fn post_node_rw(
        &self,
        path: String,
        name: String,
        add_members: Option<String>,
        ) -> Result<PostNodeRwResponse, ApiError>;

    async fn post_path(
        &self,
        path: String,
        jcrprimary_type: String,
        name: String,
        ) -> Result<PostPathResponse, ApiError>;

    async fn post_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        ) -> Result<PostQueryResponse, ApiError>;

    async fn post_tree_activation(
        &self,
        ignoredeactivated: bool,
        onlymodified: bool,
        path: String,
        ) -> Result<PostTreeActivationResponse, ApiError>;

    async fn post_truststore(
        &self,
        operation: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_store_type: Option<String>,
        remove_alias: Option<String>,
        certificate: Option<swagger::ByteArray>,
        ) -> Result<PostTruststoreResponse, ApiError>;

    async fn post_truststore_pkcs12(
        &self,
        truststore_p12: Option<swagger::ByteArray>,
        ) -> Result<PostTruststorePKCS12Response, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self: Self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    async fn get_aem_product_info(
        &self,
        ) -> Result<GetAemProductInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_aem_product_info(&context).await
    }

    async fn get_bundle_info(
        &self,
        name: String,
        ) -> Result<GetBundleInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_bundle_info(name, &context).await
    }

    async fn get_config_mgr(
        &self,
        ) -> Result<GetConfigMgrResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_config_mgr(&context).await
    }

    async fn post_bundle(
        &self,
        name: String,
        action: String,
        ) -> Result<PostBundleResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_bundle(name, action, &context).await
    }

    async fn post_jmx_repository(
        &self,
        action: String,
        ) -> Result<PostJmxRepositoryResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_jmx_repository(action, &context).await
    }

    async fn post_saml_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        location: Option<String>,
        path: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        idp_url: Option<String>,
        idp_cert_alias: Option<String>,
        idp_http_redirect: Option<bool>,
        service_provider_entity_id: Option<String>,
        assertion_consumer_service_url: Option<String>,
        sp_private_key_alias: Option<String>,
        key_store_password: Option<String>,
        default_redirect_url: Option<String>,
        user_id_attribute: Option<String>,
        use_encryption: Option<bool>,
        create_user: Option<bool>,
        add_group_memberships: Option<bool>,
        group_membership_attribute: Option<String>,
        default_groups: Option<&Vec<String>>,
        name_id_format: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
        handle_logout: Option<bool>,
        logout_url: Option<String>,
        clock_tolerance: Option<i32>,
        digest_method: Option<String>,
        signature_method: Option<String>,
        user_intermediate_path: Option<String>,
        propertylist: Option<&Vec<String>>,
        ) -> Result<PostSamlConfigurationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_saml_configuration(post, apply, delete, action, location, path, service_ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path, propertylist, &context).await
    }

    async fn get_login_page(
        &self,
        ) -> Result<GetLoginPageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_login_page(&context).await
    }

    async fn post_cq_actions(
        &self,
        authorizable_id: String,
        changelog: String,
        ) -> Result<PostCqActionsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_cq_actions(authorizable_id, changelog, &context).await
    }

    async fn get_crxde_status(
        &self,
        ) -> Result<GetCrxdeStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_crxde_status(&context).await
    }

    async fn get_install_status(
        &self,
        ) -> Result<GetInstallStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_install_status(&context).await
    }

    async fn get_package_manager_servlet(
        &self,
        ) -> Result<GetPackageManagerServletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_package_manager_servlet(&context).await
    }

    async fn post_package_service(
        &self,
        cmd: String,
        ) -> Result<PostPackageServiceResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_package_service(cmd, &context).await
    }

    async fn post_package_service_json(
        &self,
        path: String,
        cmd: String,
        group_name: Option<String>,
        package_name: Option<String>,
        package_version: Option<String>,
        _charset_: Option<String>,
        force: Option<bool>,
        recursive: Option<bool>,
        package: Option<swagger::ByteArray>,
        ) -> Result<PostPackageServiceJsonResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_package_service_json(path, cmd, group_name, package_name, package_version, _charset_, force, recursive, package, &context).await
    }

    async fn post_package_update(
        &self,
        group_name: String,
        package_name: String,
        version: String,
        path: String,
        filter: Option<String>,
        _charset_: Option<String>,
        ) -> Result<PostPackageUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_package_update(group_name, package_name, version, path, filter, _charset_, &context).await
    }

    async fn post_set_password(
        &self,
        old: String,
        plain: String,
        verify: String,
        ) -> Result<PostSetPasswordResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_set_password(old, plain, verify, &context).await
    }

    async fn get_aem_health_check(
        &self,
        tags: Option<String>,
        combine_tags_or: Option<bool>,
        ) -> Result<GetAemHealthCheckResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_aem_health_check(tags, combine_tags_or, &context).await
    }

    async fn post_config_aem_health_check_servlet(
        &self,
        bundles_ignored: Option<&Vec<String>>,
        bundles_ignored_type_hint: Option<String>,
        ) -> Result<PostConfigAemHealthCheckServletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_aem_health_check_servlet(bundles_ignored, bundles_ignored_type_hint, &context).await
    }

    async fn post_config_aem_password_reset(
        &self,
        pwdreset_authorizables: Option<&Vec<String>>,
        pwdreset_authorizables_type_hint: Option<String>,
        ) -> Result<PostConfigAemPasswordResetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_aem_password_reset(pwdreset_authorizables, pwdreset_authorizables_type_hint, &context).await
    }

    async fn ssl_setup(
        &self,
        keystore_password: String,
        keystore_password_confirm: String,
        truststore_password: String,
        truststore_password_confirm: String,
        https_hostname: String,
        https_port: String,
        privatekey_file: Option<swagger::ByteArray>,
        certificate_file: Option<swagger::ByteArray>,
        ) -> Result<SslSetupResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssl_setup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file, certificate_file, &context).await
    }

    async fn delete_agent(
        &self,
        runmode: String,
        name: String,
        ) -> Result<DeleteAgentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_agent(runmode, name, &context).await
    }

    async fn delete_node(
        &self,
        path: String,
        name: String,
        ) -> Result<DeleteNodeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_node(path, name, &context).await
    }

    async fn get_agent(
        &self,
        runmode: String,
        name: String,
        ) -> Result<GetAgentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_agent(runmode, name, &context).await
    }

    async fn get_agents(
        &self,
        runmode: String,
        ) -> Result<GetAgentsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_agents(runmode, &context).await
    }

    async fn get_authorizable_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        ) -> Result<GetAuthorizableKeystoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_authorizable_keystore(intermediate_path, authorizable_id, &context).await
    }

    async fn get_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        ) -> Result<GetKeystoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_keystore(intermediate_path, authorizable_id, &context).await
    }

    async fn get_node(
        &self,
        path: String,
        name: String,
        ) -> Result<GetNodeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_node(path, name, &context).await
    }

    async fn get_package(
        &self,
        group: String,
        name: String,
        version: String,
        ) -> Result<GetPackageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_package(group, name, version, &context).await
    }

    async fn get_package_filter(
        &self,
        group: String,
        name: String,
        version: String,
        ) -> Result<GetPackageFilterResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_package_filter(group, name, version, &context).await
    }

    async fn get_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        ) -> Result<GetQueryResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_query(path, p_limit, param_1_property, param_1_property_value, &context).await
    }

    async fn get_truststore(
        &self,
        ) -> Result<GetTruststoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_truststore(&context).await
    }

    async fn get_truststore_info(
        &self,
        ) -> Result<GetTruststoreInfoResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_truststore_info(&context).await
    }

    async fn post_agent(
        &self,
        runmode: String,
        name: String,
        jcrcontent_cqdistribute: Option<bool>,
        jcrcontent_cqdistribute_type_hint: Option<String>,
        jcrcontent_cqname: Option<String>,
        jcrcontent_cqtemplate: Option<String>,
        jcrcontent_enabled: Option<bool>,
        jcrcontent_jcrdescription: Option<String>,
        jcrcontent_jcrlast_modified: Option<String>,
        jcrcontent_jcrlast_modified_by: Option<String>,
        jcrcontent_jcrmixin_types: Option<String>,
        jcrcontent_jcrtitle: Option<String>,
        jcrcontent_log_level: Option<String>,
        jcrcontent_no_status_update: Option<bool>,
        jcrcontent_no_versioning: Option<bool>,
        jcrcontent_protocol_connect_timeout: Option<f64>,
        jcrcontent_protocol_http_connection_closed: Option<bool>,
        jcrcontent_protocol_http_expired: Option<String>,
        jcrcontent_protocol_http_headers: Option<&Vec<String>>,
        jcrcontent_protocol_http_headers_type_hint: Option<String>,
        jcrcontent_protocol_http_method: Option<String>,
        jcrcontent_protocol_https_relaxed: Option<bool>,
        jcrcontent_protocol_interface: Option<String>,
        jcrcontent_protocol_socket_timeout: Option<f64>,
        jcrcontent_protocol_version: Option<String>,
        jcrcontent_proxy_ntlm_domain: Option<String>,
        jcrcontent_proxy_ntlm_host: Option<String>,
        jcrcontent_proxy_host: Option<String>,
        jcrcontent_proxy_password: Option<String>,
        jcrcontent_proxy_port: Option<f64>,
        jcrcontent_proxy_user: Option<String>,
        jcrcontent_queue_batch_max_size: Option<f64>,
        jcrcontent_queue_batch_mode: Option<String>,
        jcrcontent_queue_batch_wait_time: Option<f64>,
        jcrcontent_retry_delay: Option<String>,
        jcrcontent_reverse_replication: Option<bool>,
        jcrcontent_serialization_type: Option<String>,
        jcrcontent_slingresource_type: Option<String>,
        jcrcontent_ssl: Option<String>,
        jcrcontent_transport_ntlm_domain: Option<String>,
        jcrcontent_transport_ntlm_host: Option<String>,
        jcrcontent_transport_password: Option<String>,
        jcrcontent_transport_uri: Option<String>,
        jcrcontent_transport_user: Option<String>,
        jcrcontent_trigger_distribute: Option<bool>,
        jcrcontent_trigger_modified: Option<bool>,
        jcrcontent_trigger_on_off_time: Option<bool>,
        jcrcontent_trigger_receive: Option<bool>,
        jcrcontent_trigger_specific: Option<bool>,
        jcrcontent_user_id: Option<String>,
        jcrprimary_type: Option<String>,
        operation: Option<String>,
        ) -> Result<PostAgentResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_agent(runmode, name, jcrcontent_cqdistribute, jcrcontent_cqdistribute_type_hint, jcrcontent_cqname, jcrcontent_cqtemplate, jcrcontent_enabled, jcrcontent_jcrdescription, jcrcontent_jcrlast_modified, jcrcontent_jcrlast_modified_by, jcrcontent_jcrmixin_types, jcrcontent_jcrtitle, jcrcontent_log_level, jcrcontent_no_status_update, jcrcontent_no_versioning, jcrcontent_protocol_connect_timeout, jcrcontent_protocol_http_connection_closed, jcrcontent_protocol_http_expired, jcrcontent_protocol_http_headers, jcrcontent_protocol_http_headers_type_hint, jcrcontent_protocol_http_method, jcrcontent_protocol_https_relaxed, jcrcontent_protocol_interface, jcrcontent_protocol_socket_timeout, jcrcontent_protocol_version, jcrcontent_proxy_ntlm_domain, jcrcontent_proxy_ntlm_host, jcrcontent_proxy_host, jcrcontent_proxy_password, jcrcontent_proxy_port, jcrcontent_proxy_user, jcrcontent_queue_batch_max_size, jcrcontent_queue_batch_mode, jcrcontent_queue_batch_wait_time, jcrcontent_retry_delay, jcrcontent_reverse_replication, jcrcontent_serialization_type, jcrcontent_slingresource_type, jcrcontent_ssl, jcrcontent_transport_ntlm_domain, jcrcontent_transport_ntlm_host, jcrcontent_transport_password, jcrcontent_transport_uri, jcrcontent_transport_user, jcrcontent_trigger_distribute, jcrcontent_trigger_modified, jcrcontent_trigger_on_off_time, jcrcontent_trigger_receive, jcrcontent_trigger_specific, jcrcontent_user_id, jcrprimary_type, operation, &context).await
    }

    async fn post_authorizable_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        operation: Option<String>,
        current_password: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_password: Option<String>,
        key_store_pass: Option<String>,
        alias: Option<String>,
        new_alias: Option<String>,
        remove_alias: Option<String>,
        cert_chain: Option<swagger::ByteArray>,
        pk: Option<swagger::ByteArray>,
        key_store: Option<swagger::ByteArray>,
        ) -> Result<PostAuthorizableKeystoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_authorizable_keystore(intermediate_path, authorizable_id, operation, current_password, new_password, re_password, key_password, key_store_pass, alias, new_alias, remove_alias, cert_chain, pk, key_store, &context).await
    }

    async fn post_authorizables(
        &self,
        authorizable_id: String,
        intermediate_path: String,
        create_user: Option<String>,
        create_group: Option<String>,
        reppassword: Option<String>,
        profile_given_name: Option<String>,
        ) -> Result<PostAuthorizablesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_authorizables(authorizable_id, intermediate_path, create_user, create_group, reppassword, profile_given_name, &context).await
    }

    async fn post_config_adobe_granite_saml_authentication_handler(
        &self,
        key_store_password: Option<String>,
        key_store_password_type_hint: Option<String>,
        service_ranking: Option<i32>,
        service_ranking_type_hint: Option<String>,
        idp_http_redirect: Option<bool>,
        idp_http_redirect_type_hint: Option<String>,
        create_user: Option<bool>,
        create_user_type_hint: Option<String>,
        default_redirect_url: Option<String>,
        default_redirect_url_type_hint: Option<String>,
        user_id_attribute: Option<String>,
        user_id_attribute_type_hint: Option<String>,
        default_groups: Option<&Vec<String>>,
        default_groups_type_hint: Option<String>,
        idp_cert_alias: Option<String>,
        idp_cert_alias_type_hint: Option<String>,
        add_group_memberships: Option<bool>,
        add_group_memberships_type_hint: Option<String>,
        path: Option<&Vec<String>>,
        path_type_hint: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
        synchronize_attributes_type_hint: Option<String>,
        clock_tolerance: Option<i32>,
        clock_tolerance_type_hint: Option<String>,
        group_membership_attribute: Option<String>,
        group_membership_attribute_type_hint: Option<String>,
        idp_url: Option<String>,
        idp_url_type_hint: Option<String>,
        logout_url: Option<String>,
        logout_url_type_hint: Option<String>,
        service_provider_entity_id: Option<String>,
        service_provider_entity_id_type_hint: Option<String>,
        assertion_consumer_service_url: Option<String>,
        assertion_consumer_service_url_type_hint: Option<String>,
        handle_logout: Option<bool>,
        handle_logout_type_hint: Option<String>,
        sp_private_key_alias: Option<String>,
        sp_private_key_alias_type_hint: Option<String>,
        use_encryption: Option<bool>,
        use_encryption_type_hint: Option<String>,
        name_id_format: Option<String>,
        name_id_format_type_hint: Option<String>,
        digest_method: Option<String>,
        digest_method_type_hint: Option<String>,
        signature_method: Option<String>,
        signature_method_type_hint: Option<String>,
        user_intermediate_path: Option<String>,
        user_intermediate_path_type_hint: Option<String>,
        ) -> Result<PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_adobe_granite_saml_authentication_handler(key_store_password, key_store_password_type_hint, service_ranking, service_ranking_type_hint, idp_http_redirect, idp_http_redirect_type_hint, create_user, create_user_type_hint, default_redirect_url, default_redirect_url_type_hint, user_id_attribute, user_id_attribute_type_hint, default_groups, default_groups_type_hint, idp_cert_alias, idp_cert_alias_type_hint, add_group_memberships, add_group_memberships_type_hint, path, path_type_hint, synchronize_attributes, synchronize_attributes_type_hint, clock_tolerance, clock_tolerance_type_hint, group_membership_attribute, group_membership_attribute_type_hint, idp_url, idp_url_type_hint, logout_url, logout_url_type_hint, service_provider_entity_id, service_provider_entity_id_type_hint, assertion_consumer_service_url, assertion_consumer_service_url_type_hint, handle_logout, handle_logout_type_hint, sp_private_key_alias, sp_private_key_alias_type_hint, use_encryption, use_encryption_type_hint, name_id_format, name_id_format_type_hint, digest_method, digest_method_type_hint, signature_method, signature_method_type_hint, user_intermediate_path, user_intermediate_path_type_hint, &context).await
    }

    async fn post_config_apache_felix_jetty_based_http_service(
        &self,
        org_apache_felix_https_nio: Option<bool>,
        org_apache_felix_https_nio_type_hint: Option<String>,
        org_apache_felix_https_keystore: Option<String>,
        org_apache_felix_https_keystore_type_hint: Option<String>,
        org_apache_felix_https_keystore_password: Option<String>,
        org_apache_felix_https_keystore_password_type_hint: Option<String>,
        org_apache_felix_https_keystore_key: Option<String>,
        org_apache_felix_https_keystore_key_type_hint: Option<String>,
        org_apache_felix_https_keystore_key_password: Option<String>,
        org_apache_felix_https_keystore_key_password_type_hint: Option<String>,
        org_apache_felix_https_truststore: Option<String>,
        org_apache_felix_https_truststore_type_hint: Option<String>,
        org_apache_felix_https_truststore_password: Option<String>,
        org_apache_felix_https_truststore_password_type_hint: Option<String>,
        org_apache_felix_https_clientcertificate: Option<String>,
        org_apache_felix_https_clientcertificate_type_hint: Option<String>,
        org_apache_felix_https_enable: Option<bool>,
        org_apache_felix_https_enable_type_hint: Option<String>,
        org_osgi_service_http_port_secure: Option<String>,
        org_osgi_service_http_port_secure_type_hint: Option<String>,
        ) -> Result<PostConfigApacheFelixJettyBasedHttpServiceResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_apache_felix_jetty_based_http_service(org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint, &context).await
    }

    async fn post_config_apache_http_components_proxy_configuration(
        &self,
        proxy_host: Option<String>,
        proxy_host_type_hint: Option<String>,
        proxy_port: Option<i32>,
        proxy_port_type_hint: Option<String>,
        proxy_exceptions: Option<&Vec<String>>,
        proxy_exceptions_type_hint: Option<String>,
        proxy_enabled: Option<bool>,
        proxy_enabled_type_hint: Option<String>,
        proxy_user: Option<String>,
        proxy_user_type_hint: Option<String>,
        proxy_password: Option<String>,
        proxy_password_type_hint: Option<String>,
        ) -> Result<PostConfigApacheHttpComponentsProxyConfigurationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_apache_http_components_proxy_configuration(proxy_host, proxy_host_type_hint, proxy_port, proxy_port_type_hint, proxy_exceptions, proxy_exceptions_type_hint, proxy_enabled, proxy_enabled_type_hint, proxy_user, proxy_user_type_hint, proxy_password, proxy_password_type_hint, &context).await
    }

    async fn post_config_apache_sling_dav_ex_servlet(
        &self,
        alias: Option<String>,
        alias_type_hint: Option<String>,
        dav_create_absolute_uri: Option<bool>,
        dav_create_absolute_uri_type_hint: Option<String>,
        ) -> Result<PostConfigApacheSlingDavExServletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_apache_sling_dav_ex_servlet(alias, alias_type_hint, dav_create_absolute_uri, dav_create_absolute_uri_type_hint, &context).await
    }

    async fn post_config_apache_sling_get_servlet(
        &self,
        json_maximumresults: Option<String>,
        json_maximumresults_type_hint: Option<String>,
        enable_html: Option<bool>,
        enable_html_type_hint: Option<String>,
        enable_txt: Option<bool>,
        enable_txt_type_hint: Option<String>,
        enable_xml: Option<bool>,
        enable_xml_type_hint: Option<String>,
        ) -> Result<PostConfigApacheSlingGetServletResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_apache_sling_get_servlet(json_maximumresults, json_maximumresults_type_hint, enable_html, enable_html_type_hint, enable_txt, enable_txt_type_hint, enable_xml, enable_xml_type_hint, &context).await
    }

    async fn post_config_apache_sling_referrer_filter(
        &self,
        allow_empty: Option<bool>,
        allow_empty_type_hint: Option<String>,
        allow_hosts: Option<String>,
        allow_hosts_type_hint: Option<String>,
        allow_hosts_regexp: Option<String>,
        allow_hosts_regexp_type_hint: Option<String>,
        filter_methods: Option<String>,
        filter_methods_type_hint: Option<String>,
        ) -> Result<PostConfigApacheSlingReferrerFilterResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_apache_sling_referrer_filter(allow_empty, allow_empty_type_hint, allow_hosts, allow_hosts_type_hint, allow_hosts_regexp, allow_hosts_regexp_type_hint, filter_methods, filter_methods_type_hint, &context).await
    }

    async fn post_config_property(
        &self,
        config_node_name: String,
        ) -> Result<PostConfigPropertyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_config_property(config_node_name, &context).await
    }

    async fn post_node(
        &self,
        path: String,
        name: String,
        operation: Option<String>,
        delete_authorizable: Option<String>,
        file: Option<swagger::ByteArray>,
        ) -> Result<PostNodeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_node(path, name, operation, delete_authorizable, file, &context).await
    }

    async fn post_node_rw(
        &self,
        path: String,
        name: String,
        add_members: Option<String>,
        ) -> Result<PostNodeRwResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_node_rw(path, name, add_members, &context).await
    }

    async fn post_path(
        &self,
        path: String,
        jcrprimary_type: String,
        name: String,
        ) -> Result<PostPathResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_path(path, jcrprimary_type, name, &context).await
    }

    async fn post_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        ) -> Result<PostQueryResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_query(path, p_limit, param_1_property, param_1_property_value, &context).await
    }

    async fn post_tree_activation(
        &self,
        ignoredeactivated: bool,
        onlymodified: bool,
        path: String,
        ) -> Result<PostTreeActivationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_tree_activation(ignoredeactivated, onlymodified, path, &context).await
    }

    async fn post_truststore(
        &self,
        operation: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_store_type: Option<String>,
        remove_alias: Option<String>,
        certificate: Option<swagger::ByteArray>,
        ) -> Result<PostTruststoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().post_truststore(operation, new_password, re_password, key_store_type, remove_alias, certificate, &context).await
    }

    async fn post_truststore_pkcs12(
        &self,
        truststore_p12: Option<swagger::ByteArray>,
        ) -> Result<PostTruststorePKCS12Response, ApiError>
    {
        let context = self.context().clone();
        self.api().post_truststore_pkcs12(truststore_p12, &context).await
    }

}


#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
