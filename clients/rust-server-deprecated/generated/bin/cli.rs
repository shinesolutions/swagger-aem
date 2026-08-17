//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
use clap::Parser;
use dialoguer::Confirm;
use log::{debug, info};
// models may be unused if all inputs are primitive types
#[allow(unused_imports)]
use openapi_client::{
    models, ApiNoContext, Client, ContextWrapperExt,
    GetAemProductInfoResponse,
    GetConfigMgrResponse,
    PostSamlConfigurationResponse,
    GetBundleInfoResponse,
    PostBundleResponse,
    PostJmxRepositoryResponse,
    GetLoginPageResponse,
    PostCqActionsResponse,
    GetCrxdeStatusResponse,
    GetInstallStatusResponse,
    GetPackageManagerServletResponse,
    PostPackageServiceResponse,
    PostPackageUpdateResponse,
    PostSetPasswordResponse,
    PostPackageServiceJsonResponse,
    GetAemHealthCheckResponse,
    PostConfigAemHealthCheckServletResponse,
    PostConfigAemPasswordResetResponse,
    SslSetupResponse,
    GetQueryResponse,
    GetTruststoreResponse,
    GetTruststoreInfoResponse,
    PostAuthorizablesResponse,
    PostConfigAdobeGraniteSamlAuthenticationHandlerResponse,
    PostConfigApacheFelixJettyBasedHttpServiceResponse,
    PostConfigApacheHttpComponentsProxyConfigurationResponse,
    PostConfigApacheSlingDavExServletResponse,
    PostConfigApacheSlingGetServletResponse,
    PostConfigApacheSlingReferrerFilterResponse,
    PostQueryResponse,
    PostTreeActivationResponse,
    PostTruststoreResponse,
    PostTruststorePkcs12Response,
    GetAgentsResponse,
    PostConfigPropertyResponse,
    PostPathResponse,
    DeleteAgentResponse,
    DeleteNodeResponse,
    GetAgentResponse,
    GetAuthorizableKeystoreResponse,
    GetKeystoreResponse,
    GetNodeResponse,
    PostAgentResponse,
    PostAuthorizableKeystoreResponse,
    PostNodeResponse,
    PostNodeRwResponse,
    GetPackageResponse,
    GetPackageFilterResponse,
};
use simple_logger::SimpleLogger;
use swagger::{AuthData, ContextBuilder, EmptyContext, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(
    ContextBuilder,
    EmptyContext,
    Option<AuthData>,
    XSpanIdString
);

#[derive(Parser, Debug)]
#[clap(
    name = "Adobe Experience Manager (AEM) API",
    version = "3.7.1-pre.0",
    about = "CLI access to Adobe Experience Manager (AEM) API"
)]
struct Cli {
    #[clap(subcommand)]
    operation: Operation,

    /// Address or hostname of the server hosting this API, including optional port
    #[clap(short = 'a', long, default_value = "http://localhost")]
    server_address: String,

    /// Path to the client private key if using client-side TLS authentication
    #[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
    #[clap(long, requires_all(&["client_certificate", "server_certificate"]))]
    client_key: Option<String>,

    /// Path to the client's public certificate associated with the private key
    #[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
    #[clap(long, requires_all(&["client_key", "server_certificate"]))]
    client_certificate: Option<String>,

    /// Path to CA certificate used to authenticate the server
    #[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
    #[clap(long)]
    server_certificate: Option<String>,

    /// If set, write output to file instead of stdout
    #[clap(short, long)]
    output_file: Option<String>,

    #[command(flatten)]
    verbosity: clap_verbosity_flag::Verbosity,

    /// Don't ask for any confirmation prompts
    #[allow(dead_code)]
    #[clap(short, long)]
    force: bool,
}

#[derive(Parser, Debug)]
enum Operation {
    GetAemProductInfo {
    },
    GetConfigMgr {
    },
    PostSamlConfiguration {
        #[clap(short, long)]
        post: Option<bool>,
        #[clap(long)]
        apply: Option<bool>,
        #[clap(short, long)]
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        path: Option<Vec<String>>,
        service_ranking: Option<i32>,
        idp_url: Option<String>,
        idp_cert_alias: Option<String>,
        #[clap(short, long)]
        idp_http_redirect: Option<bool>,
        service_provider_entity_id: Option<String>,
        assertion_consumer_service_url: Option<String>,
        sp_private_key_alias: Option<String>,
        key_store_password: Option<String>,
        default_redirect_url: Option<String>,
        user_id_attribute: Option<String>,
        #[clap(short, long)]
        use_encryption: Option<bool>,
        #[clap(short, long)]
        create_user: Option<bool>,
        #[clap(long)]
        add_group_memberships: Option<bool>,
        group_membership_attribute: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        default_groups: Option<Vec<String>>,
        name_id_format: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        synchronize_attributes: Option<Vec<String>>,
        #[clap(short, long)]
        handle_logout: Option<bool>,
        logout_url: Option<String>,
        clock_tolerance: Option<i32>,
        digest_method: Option<String>,
        signature_method: Option<String>,
        user_intermediate_path: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        propertylist: Option<Vec<String>>,
    },
    GetBundleInfo {
        name: String,
    },
    PostBundle {
        name: String,
        action: String,
    },
    PostJmxRepository {
        action: String,
    },
    GetLoginPage {
    },
    PostCqActions {
        authorizable_id: String,
        changelog: String,
    },
    GetCrxdeStatus {
    },
    GetInstallStatus {
    },
    GetPackageManagerServlet {
    },
    PostPackageService {
        cmd: String,
    },
    PostPackageUpdate {
        group_name: String,
        package_name: String,
        version: String,
        path: String,
        filter: Option<String>,
        _charset_: Option<String>,
    },
    PostSetPassword {
        old: String,
        plain: String,
        verify: String,
    },
    PostPackageServiceJson {
        path: String,
        cmd: String,
        group_name: Option<String>,
        package_name: Option<String>,
        package_version: Option<String>,
        _charset_: Option<String>,
        #[clap(long)]
        force: Option<bool>,
        #[clap(short, long)]
        recursive: Option<bool>,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        package: Option<swagger::ByteArray>,
    },
    GetAemHealthCheck {
        tags: Option<String>,
        #[clap(short, long)]
        combine_tags_or: Option<bool>,
    },
    PostConfigAemHealthCheckServlet {
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        bundles_ignored: Option<Vec<String>>,
        bundles_ignored_at_type_hint: Option<String>,
    },
    PostConfigAemPasswordReset {
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        pwdreset_authorizables: Option<Vec<String>>,
        pwdreset_authorizables_at_type_hint: Option<String>,
    },
    SslSetup {
        keystore_password: String,
        keystore_password_confirm: String,
        truststore_password: String,
        truststore_password_confirm: String,
        https_hostname: String,
        https_port: String,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        privatekey_file: Option<swagger::ByteArray>,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        certificate_file: Option<swagger::ByteArray>,
    },
    GetQuery {
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
    },
    GetTruststore {
    },
    GetTruststoreInfo {
    },
    PostAuthorizables {
        authorizable_id: String,
        intermediate_path: String,
        create_user: Option<String>,
        create_group: Option<String>,
        rep_colon_password: Option<String>,
        profile_slash_given_name: Option<String>,
    },
    PostConfigAdobeGraniteSamlAuthenticationHandler {
        key_store_password: Option<String>,
        key_store_password_at_type_hint: Option<String>,
        service_ranking: Option<i32>,
        service_ranking_at_type_hint: Option<String>,
        #[clap(short, long)]
        idp_http_redirect: Option<bool>,
        idp_http_redirect_at_type_hint: Option<String>,
        #[clap(short, long)]
        create_user: Option<bool>,
        create_user_at_type_hint: Option<String>,
        default_redirect_url: Option<String>,
        default_redirect_url_at_type_hint: Option<String>,
        user_id_attribute: Option<String>,
        user_id_attribute_at_type_hint: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        default_groups: Option<Vec<String>>,
        default_groups_at_type_hint: Option<String>,
        idp_cert_alias: Option<String>,
        idp_cert_alias_at_type_hint: Option<String>,
        #[clap(long)]
        add_group_memberships: Option<bool>,
        add_group_memberships_at_type_hint: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        path: Option<Vec<String>>,
        path_at_type_hint: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        synchronize_attributes: Option<Vec<String>>,
        synchronize_attributes_at_type_hint: Option<String>,
        clock_tolerance: Option<i32>,
        clock_tolerance_at_type_hint: Option<String>,
        group_membership_attribute: Option<String>,
        group_membership_attribute_at_type_hint: Option<String>,
        idp_url: Option<String>,
        idp_url_at_type_hint: Option<String>,
        logout_url: Option<String>,
        logout_url_at_type_hint: Option<String>,
        service_provider_entity_id: Option<String>,
        service_provider_entity_id_at_type_hint: Option<String>,
        assertion_consumer_service_url: Option<String>,
        assertion_consumer_service_urlat_type_hint: Option<String>,
        #[clap(short, long)]
        handle_logout: Option<bool>,
        handle_logout_at_type_hint: Option<String>,
        sp_private_key_alias: Option<String>,
        sp_private_key_alias_at_type_hint: Option<String>,
        #[clap(short, long)]
        use_encryption: Option<bool>,
        use_encryption_at_type_hint: Option<String>,
        name_id_format: Option<String>,
        name_id_format_at_type_hint: Option<String>,
        digest_method: Option<String>,
        digest_method_at_type_hint: Option<String>,
        signature_method: Option<String>,
        signature_method_at_type_hint: Option<String>,
        user_intermediate_path: Option<String>,
        user_intermediate_path_at_type_hint: Option<String>,
    },
    PostConfigApacheFelixJettyBasedHttpService {
        #[clap(long)]
        org_apache_felix_https_nio: Option<bool>,
        org_apache_felix_https_nio_at_type_hint: Option<String>,
        org_apache_felix_https_keystore: Option<String>,
        org_apache_felix_https_keystore_at_type_hint: Option<String>,
        org_apache_felix_https_keystore_password: Option<String>,
        org_apache_felix_https_keystore_password_at_type_hint: Option<String>,
        org_apache_felix_https_keystore_key: Option<String>,
        org_apache_felix_https_keystore_key_at_type_hint: Option<String>,
        org_apache_felix_https_keystore_key_password: Option<String>,
        org_apache_felix_https_keystore_key_password_at_type_hint: Option<String>,
        org_apache_felix_https_truststore: Option<String>,
        org_apache_felix_https_truststore_at_type_hint: Option<String>,
        org_apache_felix_https_truststore_password: Option<String>,
        org_apache_felix_https_truststore_password_at_type_hint: Option<String>,
        org_apache_felix_https_clientcertificate: Option<String>,
        org_apache_felix_https_clientcertificate_at_type_hint: Option<String>,
        #[clap(long)]
        org_apache_felix_https_enable: Option<bool>,
        org_apache_felix_https_enable_at_type_hint: Option<String>,
        org_osgi_service_http_port_secure: Option<String>,
        org_osgi_service_http_port_secure_at_type_hint: Option<String>,
    },
    PostConfigApacheHttpComponentsProxyConfiguration {
        proxy_host: Option<String>,
        proxy_host_at_type_hint: Option<String>,
        proxy_port: Option<i32>,
        proxy_port_at_type_hint: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        proxy_exceptions: Option<Vec<String>>,
        proxy_exceptions_at_type_hint: Option<String>,
        #[clap(short, long)]
        proxy_enabled: Option<bool>,
        proxy_enabled_at_type_hint: Option<String>,
        proxy_user: Option<String>,
        proxy_user_at_type_hint: Option<String>,
        proxy_password: Option<String>,
        proxy_password_at_type_hint: Option<String>,
    },
    PostConfigApacheSlingDavExServlet {
        alias: Option<String>,
        alias_at_type_hint: Option<String>,
        #[clap(short, long)]
        dav_create_absolute_uri: Option<bool>,
        dav_create_absolute_uri_at_type_hint: Option<String>,
    },
    PostConfigApacheSlingGetServlet {
        json_maximumresults: Option<String>,
        json_maximumresults_at_type_hint: Option<String>,
        #[clap(long)]
        enable_html: Option<bool>,
        enable_html_at_type_hint: Option<String>,
        #[clap(long)]
        enable_txt: Option<bool>,
        enable_txt_at_type_hint: Option<String>,
        #[clap(long)]
        enable_xml: Option<bool>,
        enable_xml_at_type_hint: Option<String>,
    },
    PostConfigApacheSlingReferrerFilter {
        #[clap(long)]
        allow_empty: Option<bool>,
        allow_empty_at_type_hint: Option<String>,
        allow_hosts: Option<String>,
        allow_hosts_at_type_hint: Option<String>,
        allow_hosts_regexp: Option<String>,
        allow_hosts_regexp_at_type_hint: Option<String>,
        filter_methods: Option<String>,
        filter_methods_at_type_hint: Option<String>,
    },
    PostQuery {
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
    },
    PostTreeActivation {
        #[clap(short, long)]
        ignoredeactivated: bool,
        #[clap(long)]
        onlymodified: bool,
        path: String,
        cmd: String,
    },
    PostTruststore {
        colon_operation: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_store_type: Option<String>,
        remove_alias: Option<String>,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        certificate: Option<swagger::ByteArray>,
    },
    PostTruststorePkcs12 {
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        truststore_p12: Option<swagger::ByteArray>,
    },
    GetAgents {
        runmode: String,
    },
    PostConfigProperty {
        config_node_name: String,
    },
    PostPath {
        path: String,
        jcr_colon_primary_type: String,
        colon_name: String,
    },
    DeleteAgent {
        runmode: String,
        name: String,
    },
    DeleteNode {
        path: String,
        name: String,
    },
    GetAgent {
        runmode: String,
        name: String,
    },
    GetAuthorizableKeystore {
        intermediate_path: String,
        authorizable_id: String,
    },
    GetKeystore {
        intermediate_path: String,
        authorizable_id: String,
    },
    GetNode {
        path: String,
        name: String,
    },
    PostAgent {
        runmode: String,
        name: String,
        #[clap(long)]
        jcr_colon_content_slash_cq_colon_distribute: Option<bool>,
        jcr_colon_content_slash_cq_colon_distribute_at_type_hint: Option<String>,
        jcr_colon_content_slash_cq_colon_name: Option<String>,
        jcr_colon_content_slash_cq_colon_template: Option<String>,
        #[clap(long)]
        jcr_colon_content_slash_alias_update: Option<bool>,
        #[clap(long)]
        jcr_colon_content_slash_enabled: Option<bool>,
        jcr_colon_content_slash_jcr_colon_description: Option<String>,
        jcr_colon_content_slash_jcr_colon_last_modified: Option<String>,
        jcr_colon_content_slash_jcr_colon_last_modified_by: Option<String>,
        jcr_colon_content_slash_jcr_colon_mixin_types: Option<String>,
        jcr_colon_content_slash_jcr_colon_title: Option<String>,
        jcr_colon_content_slash_log_level: Option<String>,
        #[clap(long)]
        jcr_colon_content_slash_no_status_update: Option<bool>,
        #[clap(long)]
        jcr_colon_content_slash_no_versioning: Option<bool>,
        jcr_colon_content_slash_protocol_connect_timeout: Option<f64>,
        #[clap(long)]
        jcr_colon_content_slash_protocol_http_connection_closed: Option<bool>,
        jcr_colon_content_slash_protocol_http_expired: Option<String>,
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        jcr_colon_content_slash_protocol_http_headers: Option<Vec<String>>,
        jcr_colon_content_slash_protocol_http_headers_at_type_hint: Option<String>,
        jcr_colon_content_slash_protocol_http_method: Option<String>,
        #[clap(long)]
        jcr_colon_content_slash_protocol_https_relaxed: Option<bool>,
        jcr_colon_content_slash_protocol_interface: Option<String>,
        jcr_colon_content_slash_protocol_socket_timeout: Option<f64>,
        jcr_colon_content_slash_protocol_version: Option<String>,
        jcr_colon_content_slash_proxy_ntlm_domain: Option<String>,
        jcr_colon_content_slash_proxy_ntlm_host: Option<String>,
        jcr_colon_content_slash_proxy_host: Option<String>,
        jcr_colon_content_slash_proxy_password: Option<String>,
        jcr_colon_content_slash_proxy_port: Option<f64>,
        jcr_colon_content_slash_proxy_user: Option<String>,
        jcr_colon_content_slash_queue_batch_max_size: Option<f64>,
        jcr_colon_content_slash_queue_batch_mode: Option<String>,
        jcr_colon_content_slash_queue_batch_wait_time: Option<f64>,
        jcr_colon_content_slash_retry_delay: Option<String>,
        #[clap(long)]
        jcr_colon_content_slash_reverse_replication: Option<bool>,
        jcr_colon_content_slash_serialization_type: Option<String>,
        jcr_colon_content_slash_sling_colon_resource_type: Option<String>,
        jcr_colon_content_slash_ssl: Option<String>,
        jcr_colon_content_slash_transport_ntlm_domain: Option<String>,
        jcr_colon_content_slash_transport_ntlm_host: Option<String>,
        jcr_colon_content_slash_transport_password: Option<String>,
        jcr_colon_content_slash_transport_uri: Option<String>,
        jcr_colon_content_slash_transport_user: Option<String>,
        #[clap(long)]
        jcr_colon_content_slash_trigger_distribute: Option<bool>,
        #[clap(long)]
        jcr_colon_content_slash_trigger_modified: Option<bool>,
        #[clap(long)]
        jcr_colon_content_slash_trigger_on_off_time: Option<bool>,
        #[clap(long)]
        jcr_colon_content_slash_trigger_receive: Option<bool>,
        #[clap(long)]
        jcr_colon_content_slash_trigger_specific: Option<bool>,
        jcr_colon_content_slash_user_id: Option<String>,
        jcr_colon_primary_type: Option<String>,
        colon_operation: Option<String>,
    },
    PostAuthorizableKeystore {
        intermediate_path: String,
        authorizable_id: String,
        colon_operation: Option<String>,
        current_password: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_password: Option<String>,
        key_store_pass: Option<String>,
        alias: Option<String>,
        new_alias: Option<String>,
        remove_alias: Option<String>,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        cert_chain: Option<swagger::ByteArray>,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        pk: Option<swagger::ByteArray>,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        key_store: Option<swagger::ByteArray>,
    },
    PostNode {
        path: String,
        name: String,
        colon_operation: Option<String>,
        delete_authorizable: Option<String>,
        #[clap(value_parser = parse_json::<swagger::ByteArray>)]
        file: Option<swagger::ByteArray>,
    },
    PostNodeRw {
        path: String,
        name: String,
        add_members: Option<String>,
    },
    GetPackage {
        group: String,
        name: String,
        version: String,
    },
    GetPackageFilter {
        group: String,
        name: String,
        version: String,
    },
}

// On Linux/Unix with OpenSSL (client-tls feature), support certificate pinning and mutual TLS
#[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    if args.client_certificate.is_some() {
        debug!("Using mutual TLS");
        let client = Client::try_new_https_mutual(
            &args.server_address,
            args.server_certificate.clone().unwrap(),
            args.client_key.clone().unwrap(),
            args.client_certificate.clone().unwrap(),
        )
        .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else if args.server_certificate.is_some() {
        debug!("Using TLS with pinned server certificate");
        let client =
            Client::try_new_https_pinned(&args.server_address, args.server_certificate.clone().unwrap())
                .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else {
        debug!("Using client without certificates");
        let client =
            Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
        Ok(Box::new(client.with_context(context)))
    }
}

// On macOS/Windows/iOS or without client-tls feature, use simple client (no cert pinning/mutual TLS)
#[cfg(any(
    not(feature = "client-tls"),
    all(feature = "client-tls", any(target_os = "macos", target_os = "windows", target_os = "ios"))
))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    // Client::try_new() automatically detects the URL scheme (http:// or https://)
    // and creates the appropriate client.
    // Note: Certificate pinning and mutual TLS are only available on Linux/Unix with OpenSSL
    let client =
        Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
    Ok(Box::new(client.with_context(context)))
}

#[tokio::main]
async fn main() -> Result<()> {
    let args = Cli::parse();
    if let Some(log_level) = args.verbosity.log_level() {
        SimpleLogger::new().with_level(log_level.to_level_filter()).init()?;
    }

    debug!("Arguments: {:?}", &args);

    let auth_data: Option<AuthData> = None;

    #[allow(trivial_casts)]
    let context = swagger::make_context!(
        ContextBuilder,
        EmptyContext,
        auth_data,
        XSpanIdString::default()
    );

    let client = create_client(&args, context)?;

    let result = match args.operation {
        Operation::GetAemProductInfo {
        } => {
            info!("Performing a GetAemProductInfo request");

            let result = client.get_aem_product_info(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAemProductInfoResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetConfigMgr {
        } => {
            info!("Performing a GetConfigMgr request");

            let result = client.get_config_mgr(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetConfigMgrResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetConfigMgrResponse::UnexpectedError
                => "UnexpectedError\n".to_string()
                    ,
            }
        }
        Operation::PostSamlConfiguration {
            post,
            apply,
            delete,
            action,
            dollar_location,
            path,
            service_ranking,
            idp_url,
            idp_cert_alias,
            idp_http_redirect,
            service_provider_entity_id,
            assertion_consumer_service_url,
            sp_private_key_alias,
            key_store_password,
            default_redirect_url,
            user_id_attribute,
            use_encryption,
            create_user,
            add_group_memberships,
            group_membership_attribute,
            default_groups,
            name_id_format,
            synchronize_attributes,
            handle_logout,
            logout_url,
            clock_tolerance,
            digest_method,
            signature_method,
            user_intermediate_path,
            propertylist,
        } => {
            info!("Performing a PostSamlConfiguration request");

            let result = client.post_saml_configuration(
                post,
                apply,
                delete,
                action,
                dollar_location,
                path.as_ref(),
                service_ranking,
                idp_url,
                idp_cert_alias,
                idp_http_redirect,
                service_provider_entity_id,
                assertion_consumer_service_url,
                sp_private_key_alias,
                key_store_password,
                default_redirect_url,
                user_id_attribute,
                use_encryption,
                create_user,
                add_group_memberships,
                group_membership_attribute,
                default_groups.as_ref(),
                name_id_format,
                synchronize_attributes.as_ref(),
                handle_logout,
                logout_url,
                clock_tolerance,
                digest_method,
                signature_method,
                user_intermediate_path,
                propertylist.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostSamlConfigurationResponse::RetrievedAEMSAMLConfiguration
                (body)
                => "RetrievedAEMSAMLConfiguration\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PostSamlConfigurationResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PostSamlConfigurationResponse::DefaultResponse_2
                (body)
                => "DefaultResponse_2\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetBundleInfo {
            name,
        } => {
            info!("Performing a GetBundleInfo request on {:?}", (
                &name
            ));

            let result = client.get_bundle_info(
                name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetBundleInfoResponse::RetrievedBundleInfo
                (body)
                => "RetrievedBundleInfo\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetBundleInfoResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostBundle {
            name,
            action,
        } => {
            info!("Performing a PostBundle request on {:?}", (
                &name
            ));

            let result = client.post_bundle(
                name,
                action,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostBundleResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostJmxRepository {
            action,
        } => {
            info!("Performing a PostJmxRepository request on {:?}", (
                &action
            ));

            let result = client.post_jmx_repository(
                action,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostJmxRepositoryResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::GetLoginPage {
        } => {
            info!("Performing a GetLoginPage request");

            let result = client.get_login_page(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetLoginPageResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostCqActions {
            authorizable_id,
            changelog,
        } => {
            info!("Performing a PostCqActions request");

            let result = client.post_cq_actions(
                authorizable_id,
                changelog,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostCqActionsResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::GetCrxdeStatus {
        } => {
            info!("Performing a GetCrxdeStatus request");

            let result = client.get_crxde_status(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetCrxdeStatusResponse::CRXDEIsEnabled
                (body)
                => "CRXDEIsEnabled\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCrxdeStatusResponse::CRXDEIsDisabled
                (body)
                => "CRXDEIsDisabled\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetInstallStatus {
        } => {
            info!("Performing a GetInstallStatus request");

            let result = client.get_install_status(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetInstallStatusResponse::RetrievedCRXPackageManagerInstallStatus
                (body)
                => "RetrievedCRXPackageManagerInstallStatus\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetInstallStatusResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetPackageManagerServlet {
        } => {
            info!("Performing a GetPackageManagerServlet request");

            let result = client.get_package_manager_servlet(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetPackageManagerServletResponse::PackageManagerServletIsDisabled
                (body)
                => "PackageManagerServletIsDisabled\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetPackageManagerServletResponse::PackageManagerServletIsActive
                (body)
                => "PackageManagerServletIsActive\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostPackageService {
            cmd,
        } => {
            info!("Performing a PostPackageService request");

            let result = client.post_package_service(
                cmd,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostPackageServiceResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostPackageUpdate {
            group_name,
            package_name,
            version,
            path,
            filter,
            _charset_,
        } => {
            info!("Performing a PostPackageUpdate request");

            let result = client.post_package_update(
                group_name,
                package_name,
                version,
                path,
                filter,
                _charset_,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostPackageUpdateResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostSetPassword {
            old,
            plain,
            verify,
        } => {
            info!("Performing a PostSetPassword request");

            let result = client.post_set_password(
                old,
                plain,
                verify,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostSetPasswordResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostPackageServiceJson {
            path,
            cmd,
            group_name,
            package_name,
            package_version,
            _charset_,
            force,
            recursive,
            package,
        } => {
            info!("Performing a PostPackageServiceJson request on {:?}", (
                &path
            ));

            let result = client.post_package_service_json(
                path,
                cmd,
                group_name,
                package_name,
                package_version,
                _charset_,
                force,
                recursive,
                package,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostPackageServiceJsonResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetAemHealthCheck {
            tags,
            combine_tags_or,
        } => {
            info!("Performing a GetAemHealthCheck request");

            let result = client.get_aem_health_check(
                tags,
                combine_tags_or,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAemHealthCheckResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostConfigAemHealthCheckServlet {
            bundles_ignored,
            bundles_ignored_at_type_hint,
        } => {
            info!("Performing a PostConfigAemHealthCheckServlet request");

            let result = client.post_config_aem_health_check_servlet(
                bundles_ignored.as_ref(),
                bundles_ignored_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigAemHealthCheckServletResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostConfigAemPasswordReset {
            pwdreset_authorizables,
            pwdreset_authorizables_at_type_hint,
        } => {
            info!("Performing a PostConfigAemPasswordReset request");

            let result = client.post_config_aem_password_reset(
                pwdreset_authorizables.as_ref(),
                pwdreset_authorizables_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigAemPasswordResetResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::SslSetup {
            keystore_password,
            keystore_password_confirm,
            truststore_password,
            truststore_password_confirm,
            https_hostname,
            https_port,
            privatekey_file,
            certificate_file,
        } => {
            info!("Performing a SslSetup request");

            let result = client.ssl_setup(
                keystore_password,
                keystore_password_confirm,
                truststore_password,
                truststore_password_confirm,
                https_hostname,
                https_port,
                privatekey_file,
                certificate_file,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SslSetupResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetQuery {
            path,
            p_limit,
            param_1_property,
            param_1_property_value,
        } => {
            info!("Performing a GetQuery request");

            let result = client.get_query(
                path,
                p_limit,
                param_1_property,
                param_1_property_value,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetQueryResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetTruststore {
        } => {
            info!("Performing a GetTruststore request");

            let result = client.get_truststore(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetTruststoreResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetTruststoreInfo {
        } => {
            info!("Performing a GetTruststoreInfo request");

            let result = client.get_truststore_info(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetTruststoreInfoResponse::RetrievedAEMTruststoreInfo
                (body)
                => "RetrievedAEMTruststoreInfo\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetTruststoreInfoResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostAuthorizables {
            authorizable_id,
            intermediate_path,
            create_user,
            create_group,
            rep_colon_password,
            profile_slash_given_name,
        } => {
            info!("Performing a PostAuthorizables request");

            let result = client.post_authorizables(
                authorizable_id,
                intermediate_path,
                create_user,
                create_group,
                rep_colon_password,
                profile_slash_given_name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostAuthorizablesResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostConfigAdobeGraniteSamlAuthenticationHandler {
            key_store_password,
            key_store_password_at_type_hint,
            service_ranking,
            service_ranking_at_type_hint,
            idp_http_redirect,
            idp_http_redirect_at_type_hint,
            create_user,
            create_user_at_type_hint,
            default_redirect_url,
            default_redirect_url_at_type_hint,
            user_id_attribute,
            user_id_attribute_at_type_hint,
            default_groups,
            default_groups_at_type_hint,
            idp_cert_alias,
            idp_cert_alias_at_type_hint,
            add_group_memberships,
            add_group_memberships_at_type_hint,
            path,
            path_at_type_hint,
            synchronize_attributes,
            synchronize_attributes_at_type_hint,
            clock_tolerance,
            clock_tolerance_at_type_hint,
            group_membership_attribute,
            group_membership_attribute_at_type_hint,
            idp_url,
            idp_url_at_type_hint,
            logout_url,
            logout_url_at_type_hint,
            service_provider_entity_id,
            service_provider_entity_id_at_type_hint,
            assertion_consumer_service_url,
            assertion_consumer_service_urlat_type_hint,
            handle_logout,
            handle_logout_at_type_hint,
            sp_private_key_alias,
            sp_private_key_alias_at_type_hint,
            use_encryption,
            use_encryption_at_type_hint,
            name_id_format,
            name_id_format_at_type_hint,
            digest_method,
            digest_method_at_type_hint,
            signature_method,
            signature_method_at_type_hint,
            user_intermediate_path,
            user_intermediate_path_at_type_hint,
        } => {
            info!("Performing a PostConfigAdobeGraniteSamlAuthenticationHandler request");

            let result = client.post_config_adobe_granite_saml_authentication_handler(
                key_store_password,
                key_store_password_at_type_hint,
                service_ranking,
                service_ranking_at_type_hint,
                idp_http_redirect,
                idp_http_redirect_at_type_hint,
                create_user,
                create_user_at_type_hint,
                default_redirect_url,
                default_redirect_url_at_type_hint,
                user_id_attribute,
                user_id_attribute_at_type_hint,
                default_groups.as_ref(),
                default_groups_at_type_hint,
                idp_cert_alias,
                idp_cert_alias_at_type_hint,
                add_group_memberships,
                add_group_memberships_at_type_hint,
                path.as_ref(),
                path_at_type_hint,
                synchronize_attributes.as_ref(),
                synchronize_attributes_at_type_hint,
                clock_tolerance,
                clock_tolerance_at_type_hint,
                group_membership_attribute,
                group_membership_attribute_at_type_hint,
                idp_url,
                idp_url_at_type_hint,
                logout_url,
                logout_url_at_type_hint,
                service_provider_entity_id,
                service_provider_entity_id_at_type_hint,
                assertion_consumer_service_url,
                assertion_consumer_service_urlat_type_hint,
                handle_logout,
                handle_logout_at_type_hint,
                sp_private_key_alias,
                sp_private_key_alias_at_type_hint,
                use_encryption,
                use_encryption_at_type_hint,
                name_id_format,
                name_id_format_at_type_hint,
                digest_method,
                digest_method_at_type_hint,
                signature_method,
                signature_method_at_type_hint,
                user_intermediate_path,
                user_intermediate_path_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigAdobeGraniteSamlAuthenticationHandlerResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostConfigApacheFelixJettyBasedHttpService {
            org_apache_felix_https_nio,
            org_apache_felix_https_nio_at_type_hint,
            org_apache_felix_https_keystore,
            org_apache_felix_https_keystore_at_type_hint,
            org_apache_felix_https_keystore_password,
            org_apache_felix_https_keystore_password_at_type_hint,
            org_apache_felix_https_keystore_key,
            org_apache_felix_https_keystore_key_at_type_hint,
            org_apache_felix_https_keystore_key_password,
            org_apache_felix_https_keystore_key_password_at_type_hint,
            org_apache_felix_https_truststore,
            org_apache_felix_https_truststore_at_type_hint,
            org_apache_felix_https_truststore_password,
            org_apache_felix_https_truststore_password_at_type_hint,
            org_apache_felix_https_clientcertificate,
            org_apache_felix_https_clientcertificate_at_type_hint,
            org_apache_felix_https_enable,
            org_apache_felix_https_enable_at_type_hint,
            org_osgi_service_http_port_secure,
            org_osgi_service_http_port_secure_at_type_hint,
        } => {
            info!("Performing a PostConfigApacheFelixJettyBasedHttpService request");

            let result = client.post_config_apache_felix_jetty_based_http_service(
                org_apache_felix_https_nio,
                org_apache_felix_https_nio_at_type_hint,
                org_apache_felix_https_keystore,
                org_apache_felix_https_keystore_at_type_hint,
                org_apache_felix_https_keystore_password,
                org_apache_felix_https_keystore_password_at_type_hint,
                org_apache_felix_https_keystore_key,
                org_apache_felix_https_keystore_key_at_type_hint,
                org_apache_felix_https_keystore_key_password,
                org_apache_felix_https_keystore_key_password_at_type_hint,
                org_apache_felix_https_truststore,
                org_apache_felix_https_truststore_at_type_hint,
                org_apache_felix_https_truststore_password,
                org_apache_felix_https_truststore_password_at_type_hint,
                org_apache_felix_https_clientcertificate,
                org_apache_felix_https_clientcertificate_at_type_hint,
                org_apache_felix_https_enable,
                org_apache_felix_https_enable_at_type_hint,
                org_osgi_service_http_port_secure,
                org_osgi_service_http_port_secure_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigApacheFelixJettyBasedHttpServiceResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostConfigApacheHttpComponentsProxyConfiguration {
            proxy_host,
            proxy_host_at_type_hint,
            proxy_port,
            proxy_port_at_type_hint,
            proxy_exceptions,
            proxy_exceptions_at_type_hint,
            proxy_enabled,
            proxy_enabled_at_type_hint,
            proxy_user,
            proxy_user_at_type_hint,
            proxy_password,
            proxy_password_at_type_hint,
        } => {
            info!("Performing a PostConfigApacheHttpComponentsProxyConfiguration request");

            let result = client.post_config_apache_http_components_proxy_configuration(
                proxy_host,
                proxy_host_at_type_hint,
                proxy_port,
                proxy_port_at_type_hint,
                proxy_exceptions.as_ref(),
                proxy_exceptions_at_type_hint,
                proxy_enabled,
                proxy_enabled_at_type_hint,
                proxy_user,
                proxy_user_at_type_hint,
                proxy_password,
                proxy_password_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigApacheHttpComponentsProxyConfigurationResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostConfigApacheSlingDavExServlet {
            alias,
            alias_at_type_hint,
            dav_create_absolute_uri,
            dav_create_absolute_uri_at_type_hint,
        } => {
            info!("Performing a PostConfigApacheSlingDavExServlet request");

            let result = client.post_config_apache_sling_dav_ex_servlet(
                alias,
                alias_at_type_hint,
                dav_create_absolute_uri,
                dav_create_absolute_uri_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigApacheSlingDavExServletResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostConfigApacheSlingGetServlet {
            json_maximumresults,
            json_maximumresults_at_type_hint,
            enable_html,
            enable_html_at_type_hint,
            enable_txt,
            enable_txt_at_type_hint,
            enable_xml,
            enable_xml_at_type_hint,
        } => {
            info!("Performing a PostConfigApacheSlingGetServlet request");

            let result = client.post_config_apache_sling_get_servlet(
                json_maximumresults,
                json_maximumresults_at_type_hint,
                enable_html,
                enable_html_at_type_hint,
                enable_txt,
                enable_txt_at_type_hint,
                enable_xml,
                enable_xml_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigApacheSlingGetServletResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostConfigApacheSlingReferrerFilter {
            allow_empty,
            allow_empty_at_type_hint,
            allow_hosts,
            allow_hosts_at_type_hint,
            allow_hosts_regexp,
            allow_hosts_regexp_at_type_hint,
            filter_methods,
            filter_methods_at_type_hint,
        } => {
            info!("Performing a PostConfigApacheSlingReferrerFilter request");

            let result = client.post_config_apache_sling_referrer_filter(
                allow_empty,
                allow_empty_at_type_hint,
                allow_hosts,
                allow_hosts_at_type_hint,
                allow_hosts_regexp,
                allow_hosts_regexp_at_type_hint,
                filter_methods,
                filter_methods_at_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigApacheSlingReferrerFilterResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostQuery {
            path,
            p_limit,
            param_1_property,
            param_1_property_value,
        } => {
            info!("Performing a PostQuery request");

            let result = client.post_query(
                path,
                p_limit,
                param_1_property,
                param_1_property_value,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostQueryResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostTreeActivation {
            ignoredeactivated,
            onlymodified,
            path,
            cmd,
        } => {
            info!("Performing a PostTreeActivation request");

            let result = client.post_tree_activation(
                ignoredeactivated,
                onlymodified,
                path,
                cmd,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostTreeActivationResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostTruststore {
            colon_operation,
            new_password,
            re_password,
            key_store_type,
            remove_alias,
            certificate,
        } => {
            info!("Performing a PostTruststore request");

            let result = client.post_truststore(
                colon_operation,
                new_password,
                re_password,
                key_store_type,
                remove_alias,
                certificate,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostTruststoreResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostTruststorePkcs12 {
            truststore_p12,
        } => {
            info!("Performing a PostTruststorePkcs12 request");

            let result = client.post_truststore_pkcs12(
                truststore_p12,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostTruststorePkcs12Response::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetAgents {
            runmode,
        } => {
            info!("Performing a GetAgents request on {:?}", (
                &runmode
            ));

            let result = client.get_agents(
                runmode,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAgentsResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostConfigProperty {
            config_node_name,
        } => {
            info!("Performing a PostConfigProperty request on {:?}", (
                &config_node_name
            ));

            let result = client.post_config_property(
                config_node_name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostConfigPropertyResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostPath {
            path,
            jcr_colon_primary_type,
            colon_name,
        } => {
            info!("Performing a PostPath request on {:?}", (
                &path
            ));

            let result = client.post_path(
                path,
                jcr_colon_primary_type,
                colon_name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostPathResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::DeleteAgent {
            runmode,
            name,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteAgent request on {:?}", (
                &runmode,
                &name
            ));

            let result = client.delete_agent(
                runmode,
                name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteAgentResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::DeleteNode {
            path,
            name,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteNode request on {:?}", (
                &path,
                &name
            ));

            let result = client.delete_node(
                path,
                name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteNodeResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::GetAgent {
            runmode,
            name,
        } => {
            info!("Performing a GetAgent request on {:?}", (
                &runmode,
                &name
            ));

            let result = client.get_agent(
                runmode,
                name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAgentResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::GetAuthorizableKeystore {
            intermediate_path,
            authorizable_id,
        } => {
            info!("Performing a GetAuthorizableKeystore request on {:?}", (
                &intermediate_path,
                &authorizable_id
            ));

            let result = client.get_authorizable_keystore(
                intermediate_path,
                authorizable_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo
                (body)
                => "RetrievedAuthorizableKeystoreInfo\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetAuthorizableKeystoreResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetKeystore {
            intermediate_path,
            authorizable_id,
        } => {
            info!("Performing a GetKeystore request on {:?}", (
                &intermediate_path,
                &authorizable_id
            ));

            let result = client.get_keystore(
                intermediate_path,
                authorizable_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetKeystoreResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetNode {
            path,
            name,
        } => {
            info!("Performing a GetNode request on {:?}", (
                &path,
                &name
            ));

            let result = client.get_node(
                path,
                name,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetNodeResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostAgent {
            runmode,
            name,
            jcr_colon_content_slash_cq_colon_distribute,
            jcr_colon_content_slash_cq_colon_distribute_at_type_hint,
            jcr_colon_content_slash_cq_colon_name,
            jcr_colon_content_slash_cq_colon_template,
            jcr_colon_content_slash_alias_update,
            jcr_colon_content_slash_enabled,
            jcr_colon_content_slash_jcr_colon_description,
            jcr_colon_content_slash_jcr_colon_last_modified,
            jcr_colon_content_slash_jcr_colon_last_modified_by,
            jcr_colon_content_slash_jcr_colon_mixin_types,
            jcr_colon_content_slash_jcr_colon_title,
            jcr_colon_content_slash_log_level,
            jcr_colon_content_slash_no_status_update,
            jcr_colon_content_slash_no_versioning,
            jcr_colon_content_slash_protocol_connect_timeout,
            jcr_colon_content_slash_protocol_http_connection_closed,
            jcr_colon_content_slash_protocol_http_expired,
            jcr_colon_content_slash_protocol_http_headers,
            jcr_colon_content_slash_protocol_http_headers_at_type_hint,
            jcr_colon_content_slash_protocol_http_method,
            jcr_colon_content_slash_protocol_https_relaxed,
            jcr_colon_content_slash_protocol_interface,
            jcr_colon_content_slash_protocol_socket_timeout,
            jcr_colon_content_slash_protocol_version,
            jcr_colon_content_slash_proxy_ntlm_domain,
            jcr_colon_content_slash_proxy_ntlm_host,
            jcr_colon_content_slash_proxy_host,
            jcr_colon_content_slash_proxy_password,
            jcr_colon_content_slash_proxy_port,
            jcr_colon_content_slash_proxy_user,
            jcr_colon_content_slash_queue_batch_max_size,
            jcr_colon_content_slash_queue_batch_mode,
            jcr_colon_content_slash_queue_batch_wait_time,
            jcr_colon_content_slash_retry_delay,
            jcr_colon_content_slash_reverse_replication,
            jcr_colon_content_slash_serialization_type,
            jcr_colon_content_slash_sling_colon_resource_type,
            jcr_colon_content_slash_ssl,
            jcr_colon_content_slash_transport_ntlm_domain,
            jcr_colon_content_slash_transport_ntlm_host,
            jcr_colon_content_slash_transport_password,
            jcr_colon_content_slash_transport_uri,
            jcr_colon_content_slash_transport_user,
            jcr_colon_content_slash_trigger_distribute,
            jcr_colon_content_slash_trigger_modified,
            jcr_colon_content_slash_trigger_on_off_time,
            jcr_colon_content_slash_trigger_receive,
            jcr_colon_content_slash_trigger_specific,
            jcr_colon_content_slash_user_id,
            jcr_colon_primary_type,
            colon_operation,
        } => {
            info!("Performing a PostAgent request on {:?}", (
                &runmode,
                &name
            ));

            let result = client.post_agent(
                runmode,
                name,
                jcr_colon_content_slash_cq_colon_distribute,
                jcr_colon_content_slash_cq_colon_distribute_at_type_hint,
                jcr_colon_content_slash_cq_colon_name,
                jcr_colon_content_slash_cq_colon_template,
                jcr_colon_content_slash_alias_update,
                jcr_colon_content_slash_enabled,
                jcr_colon_content_slash_jcr_colon_description,
                jcr_colon_content_slash_jcr_colon_last_modified,
                jcr_colon_content_slash_jcr_colon_last_modified_by,
                jcr_colon_content_slash_jcr_colon_mixin_types,
                jcr_colon_content_slash_jcr_colon_title,
                jcr_colon_content_slash_log_level,
                jcr_colon_content_slash_no_status_update,
                jcr_colon_content_slash_no_versioning,
                jcr_colon_content_slash_protocol_connect_timeout,
                jcr_colon_content_slash_protocol_http_connection_closed,
                jcr_colon_content_slash_protocol_http_expired,
                jcr_colon_content_slash_protocol_http_headers.as_ref(),
                jcr_colon_content_slash_protocol_http_headers_at_type_hint,
                jcr_colon_content_slash_protocol_http_method,
                jcr_colon_content_slash_protocol_https_relaxed,
                jcr_colon_content_slash_protocol_interface,
                jcr_colon_content_slash_protocol_socket_timeout,
                jcr_colon_content_slash_protocol_version,
                jcr_colon_content_slash_proxy_ntlm_domain,
                jcr_colon_content_slash_proxy_ntlm_host,
                jcr_colon_content_slash_proxy_host,
                jcr_colon_content_slash_proxy_password,
                jcr_colon_content_slash_proxy_port,
                jcr_colon_content_slash_proxy_user,
                jcr_colon_content_slash_queue_batch_max_size,
                jcr_colon_content_slash_queue_batch_mode,
                jcr_colon_content_slash_queue_batch_wait_time,
                jcr_colon_content_slash_retry_delay,
                jcr_colon_content_slash_reverse_replication,
                jcr_colon_content_slash_serialization_type,
                jcr_colon_content_slash_sling_colon_resource_type,
                jcr_colon_content_slash_ssl,
                jcr_colon_content_slash_transport_ntlm_domain,
                jcr_colon_content_slash_transport_ntlm_host,
                jcr_colon_content_slash_transport_password,
                jcr_colon_content_slash_transport_uri,
                jcr_colon_content_slash_transport_user,
                jcr_colon_content_slash_trigger_distribute,
                jcr_colon_content_slash_trigger_modified,
                jcr_colon_content_slash_trigger_on_off_time,
                jcr_colon_content_slash_trigger_receive,
                jcr_colon_content_slash_trigger_specific,
                jcr_colon_content_slash_user_id,
                jcr_colon_primary_type,
                colon_operation,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostAgentResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostAuthorizableKeystore {
            intermediate_path,
            authorizable_id,
            colon_operation,
            current_password,
            new_password,
            re_password,
            key_password,
            key_store_pass,
            alias,
            new_alias,
            remove_alias,
            cert_chain,
            pk,
            key_store,
        } => {
            info!("Performing a PostAuthorizableKeystore request on {:?}", (
                &intermediate_path,
                &authorizable_id
            ));

            let result = client.post_authorizable_keystore(
                intermediate_path,
                authorizable_id,
                colon_operation,
                current_password,
                new_password,
                re_password,
                key_password,
                key_store_pass,
                alias,
                new_alias,
                remove_alias,
                cert_chain,
                pk,
                key_store,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostAuthorizableKeystoreResponse::RetrievedAuthorizableKeystoreInfo
                (body)
                => "RetrievedAuthorizableKeystoreInfo\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PostAuthorizableKeystoreResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PostNode {
            path,
            name,
            colon_operation,
            delete_authorizable,
            file,
        } => {
            info!("Performing a PostNode request on {:?}", (
                &path,
                &name
            ));

            let result = client.post_node(
                path,
                name,
                colon_operation,
                delete_authorizable,
                file,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostNodeResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::PostNodeRw {
            path,
            name,
            add_members,
        } => {
            info!("Performing a PostNodeRw request on {:?}", (
                &path,
                &name
            ));

            let result = client.post_node_rw(
                path,
                name,
                add_members,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PostNodeRwResponse::DefaultResponse
                => "DefaultResponse\n".to_string()
                    ,
            }
        }
        Operation::GetPackage {
            group,
            name,
            version,
        } => {
            info!("Performing a GetPackage request on {:?}", (
                &group,
                &name,
                &version
            ));

            let result = client.get_package(
                group,
                name,
                version,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetPackageResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetPackageFilter {
            group,
            name,
            version,
        } => {
            info!("Performing a GetPackageFilter request on {:?}", (
                &group,
                &name,
                &version
            ));

            let result = client.get_package_filter(
                group,
                name,
                version,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetPackageFilterResponse::DefaultResponse
                (body)
                => "DefaultResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
    };

    if let Some(output_file) = args.output_file {
        std::fs::write(output_file, result)?
    } else {
        println!("{}", result);
    }
    Ok(())
}

fn prompt(force: bool, text: &str) -> Result<()> {
    if force || Confirm::new().with_prompt(text).interact()? {
        Ok(())
    } else {
        Err(anyhow!("Aborting"))
    }
}

// May be unused if all inputs are primitive types
#[allow(dead_code)]
fn parse_json<T: serde::de::DeserializeOwned>(json_string: &str) -> Result<T> {
    serde_json::from_str(json_string).map_err(|err| anyhow!("Error parsing input: {}", err))
}
