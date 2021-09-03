#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Client, ContextWrapperExt, models,
                      GetAemProductInfoResponse,
                      GetBundleInfoResponse,
                      GetConfigMgrResponse,
                      PostBundleResponse,
                      PostJmxRepositoryResponse,
                      PostSamlConfigurationResponse,
                      GetLoginPageResponse,
                      PostCqActionsResponse,
                      GetCrxdeStatusResponse,
                      GetInstallStatusResponse,
                      GetPackageManagerServletResponse,
                      PostPackageServiceResponse,
                      PostPackageServiceJsonResponse,
                      PostPackageUpdateResponse,
                      PostSetPasswordResponse,
                      GetAemHealthCheckResponse,
                      PostConfigAemHealthCheckServletResponse,
                      PostConfigAemPasswordResetResponse,
                      SslSetupResponse,
                      DeleteAgentResponse,
                      DeleteNodeResponse,
                      GetAgentResponse,
                      GetAgentsResponse,
                      GetAuthorizableKeystoreResponse,
                      GetKeystoreResponse,
                      GetNodeResponse,
                      GetPackageResponse,
                      GetPackageFilterResponse,
                      GetQueryResponse,
                      GetTruststoreResponse,
                      GetTruststoreInfoResponse,
                      PostAgentResponse,
                      PostAuthorizableKeystoreResponse,
                      PostAuthorizablesResponse,
                      PostConfigAdobeGraniteSamlAuthenticationHandlerResponse,
                      PostConfigApacheFelixJettyBasedHttpServiceResponse,
                      PostConfigApacheHttpComponentsProxyConfigurationResponse,
                      PostConfigApacheSlingDavExServletResponse,
                      PostConfigApacheSlingGetServletResponse,
                      PostConfigApacheSlingReferrerFilterResponse,
                      PostConfigPropertyResponse,
                      PostNodeResponse,
                      PostNodeRwResponse,
                      PostPathResponse,
                      PostQueryResponse,
                      PostTreeActivationResponse,
                      PostTruststoreResponse,
                      PostTruststorePKCS12Response,
                     };
use clap::{App, Arg};

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
                "GetAemProductInfo",
                "GetBundleInfo",
                "GetConfigMgr",
                "PostBundle",
                "PostJmxRepository",
                "PostSamlConfiguration",
                "GetLoginPage",
                "PostCqActions",
                "GetCrxdeStatus",
                "GetInstallStatus",
                "GetPackageManagerServlet",
                "PostPackageService",
                "PostPackageServiceJson",
                "PostPackageUpdate",
                "PostSetPassword",
                "GetAemHealthCheck",
                "PostConfigAemHealthCheckServlet",
                "PostConfigAemPasswordReset",
                "SslSetup",
                "DeleteAgent",
                "DeleteNode",
                "GetAgent",
                "GetAgents",
                "GetAuthorizableKeystore",
                "GetKeystore",
                "GetNode",
                "GetPackage",
                "GetPackageFilter",
                "GetQuery",
                "GetTruststore",
                "GetTruststoreInfo",
                "PostAgent",
                "PostAuthorizableKeystore",
                "PostAuthorizables",
                "PostConfigAdobeGraniteSamlAuthenticationHandler",
                "PostConfigApacheFelixJettyBasedHttpService",
                "PostConfigApacheHttpComponentsProxyConfiguration",
                "PostConfigApacheSlingDavExServlet",
                "PostConfigApacheSlingGetServlet",
                "PostConfigApacheSlingReferrerFilter",
                "PostConfigProperty",
                "PostNode",
                "PostNodeRw",
                "PostPath",
                "PostQuery",
                "PostTreeActivation",
                "PostTruststore",
                "PostTruststorePKCS12",
            ])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("localhost")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, None as Option<AuthData>, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = if matches.is_present("https") {
        // Using Simple HTTPS
        let client = Box::new(Client::try_new_https(&base_url)
            .expect("Failed to create HTTPS client"));
        Box::new(client.with_context(context))
    } else {
        // Using HTTP
        let client = Box::new(Client::try_new_http(
            &base_url)
            .expect("Failed to create HTTP client"));
        Box::new(client.with_context(context))
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.value_of("operation") {
        Some("GetAemProductInfo") => {
            let result = rt.block_on(client.get_aem_product_info(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBundleInfo") => {
            let result = rt.block_on(client.get_bundle_info(
                  "name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetConfigMgr") => {
            let result = rt.block_on(client.get_config_mgr(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostBundle") => {
            let result = rt.block_on(client.post_bundle(
                  "name_example".to_string(),
                  "action_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostJmxRepository") => {
            let result = rt.block_on(client.post_jmx_repository(
                  "action_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostSamlConfiguration") => {
            let result = rt.block_on(client.post_saml_configuration(
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("action_example".to_string()),
                  Some("location_example".to_string()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("idp_url_example".to_string()),
                  Some("idp_cert_alias_example".to_string()),
                  Some(true),
                  Some("service_provider_entity_id_example".to_string()),
                  Some("assertion_consumer_service_url_example".to_string()),
                  Some("sp_private_key_alias_example".to_string()),
                  Some("key_store_password_example".to_string()),
                  Some("default_redirect_url_example".to_string()),
                  Some("user_id_attribute_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("group_membership_attribute_example".to_string()),
                  Some(&Vec::new()),
                  Some("name_id_format_example".to_string()),
                  Some(&Vec::new()),
                  Some(true),
                  Some("logout_url_example".to_string()),
                  Some(56),
                  Some("digest_method_example".to_string()),
                  Some("signature_method_example".to_string()),
                  Some("user_intermediate_path_example".to_string()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetLoginPage") => {
            let result = rt.block_on(client.get_login_page(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostCqActions") => {
            let result = rt.block_on(client.post_cq_actions(
                  "authorizable_id_example".to_string(),
                  "changelog_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCrxdeStatus") => {
            let result = rt.block_on(client.get_crxde_status(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetInstallStatus") => {
            let result = rt.block_on(client.get_install_status(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPackageManagerServlet") => {
            let result = rt.block_on(client.get_package_manager_servlet(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostPackageService") => {
            let result = rt.block_on(client.post_package_service(
                  "cmd_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostPackageServiceJson") => {
            let result = rt.block_on(client.post_package_service_json(
                  "path_example".to_string(),
                  "cmd_example".to_string(),
                  Some("group_name_example".to_string()),
                  Some("package_name_example".to_string()),
                  Some("package_version_example".to_string()),
                  Some("_charset__example".to_string()),
                  Some(true),
                  Some(true),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostPackageUpdate") => {
            let result = rt.block_on(client.post_package_update(
                  "group_name_example".to_string(),
                  "package_name_example".to_string(),
                  "version_example".to_string(),
                  "path_example".to_string(),
                  Some("filter_example".to_string()),
                  Some("_charset__example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostSetPassword") => {
            let result = rt.block_on(client.post_set_password(
                  "old_example".to_string(),
                  "plain_example".to_string(),
                  "verify_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAemHealthCheck") => {
            let result = rt.block_on(client.get_aem_health_check(
                  Some("tags_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigAemHealthCheckServlet") => {
            let result = rt.block_on(client.post_config_aem_health_check_servlet(
                  Some(&Vec::new()),
                  Some("bundles_ignored_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigAemPasswordReset") => {
            let result = rt.block_on(client.post_config_aem_password_reset(
                  Some(&Vec::new()),
                  Some("pwdreset_authorizables_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SslSetup") => {
            let result = rt.block_on(client.ssl_setup(
                  "keystore_password_example".to_string(),
                  "keystore_password_confirm_example".to_string(),
                  "truststore_password_example".to_string(),
                  "truststore_password_confirm_example".to_string(),
                  "https_hostname_example".to_string(),
                  "https_port_example".to_string(),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteAgent") => {
            let result = rt.block_on(client.delete_agent(
                  "runmode_example".to_string(),
                  "name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteNode") => {
            let result = rt.block_on(client.delete_node(
                  "path_example".to_string(),
                  "name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAgent") => {
            let result = rt.block_on(client.get_agent(
                  "runmode_example".to_string(),
                  "name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAgents") => {
            let result = rt.block_on(client.get_agents(
                  "runmode_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAuthorizableKeystore") => {
            let result = rt.block_on(client.get_authorizable_keystore(
                  "intermediate_path_example".to_string(),
                  "authorizable_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetKeystore") => {
            let result = rt.block_on(client.get_keystore(
                  "intermediate_path_example".to_string(),
                  "authorizable_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetNode") => {
            let result = rt.block_on(client.get_node(
                  "path_example".to_string(),
                  "name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPackage") => {
            let result = rt.block_on(client.get_package(
                  "group_example".to_string(),
                  "name_example".to_string(),
                  "version_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPackageFilter") => {
            let result = rt.block_on(client.get_package_filter(
                  "group_example".to_string(),
                  "name_example".to_string(),
                  "version_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetQuery") => {
            let result = rt.block_on(client.get_query(
                  "path_example".to_string(),
                  8.14,
                  "param_1_property_example".to_string(),
                  "param_1_property_value_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTruststore") => {
            let result = rt.block_on(client.get_truststore(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTruststoreInfo") => {
            let result = rt.block_on(client.get_truststore_info(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostAgent") => {
            let result = rt.block_on(client.post_agent(
                  "runmode_example".to_string(),
                  "name_example".to_string(),
                  Some(true),
                  Some("jcrcontent_cqdistribute_type_hint_example".to_string()),
                  Some("jcrcontent_cqname_example".to_string()),
                  Some("jcrcontent_cqtemplate_example".to_string()),
                  Some(true),
                  Some("jcrcontent_jcrdescription_example".to_string()),
                  Some("jcrcontent_jcrlast_modified_example".to_string()),
                  Some("jcrcontent_jcrlast_modified_by_example".to_string()),
                  Some("jcrcontent_jcrmixin_types_example".to_string()),
                  Some("jcrcontent_jcrtitle_example".to_string()),
                  Some("jcrcontent_log_level_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(8.14),
                  Some(true),
                  Some("jcrcontent_protocol_http_expired_example".to_string()),
                  Some(&Vec::new()),
                  Some("jcrcontent_protocol_http_headers_type_hint_example".to_string()),
                  Some("jcrcontent_protocol_http_method_example".to_string()),
                  Some(true),
                  Some("jcrcontent_protocol_interface_example".to_string()),
                  Some(8.14),
                  Some("jcrcontent_protocol_version_example".to_string()),
                  Some("jcrcontent_proxy_ntlm_domain_example".to_string()),
                  Some("jcrcontent_proxy_ntlm_host_example".to_string()),
                  Some("jcrcontent_proxy_host_example".to_string()),
                  Some("jcrcontent_proxy_password_example".to_string()),
                  Some(8.14),
                  Some("jcrcontent_proxy_user_example".to_string()),
                  Some(8.14),
                  Some("jcrcontent_queue_batch_mode_example".to_string()),
                  Some(8.14),
                  Some("jcrcontent_retry_delay_example".to_string()),
                  Some(true),
                  Some("jcrcontent_serialization_type_example".to_string()),
                  Some("jcrcontent_slingresource_type_example".to_string()),
                  Some("jcrcontent_ssl_example".to_string()),
                  Some("jcrcontent_transport_ntlm_domain_example".to_string()),
                  Some("jcrcontent_transport_ntlm_host_example".to_string()),
                  Some("jcrcontent_transport_password_example".to_string()),
                  Some("jcrcontent_transport_uri_example".to_string()),
                  Some("jcrcontent_transport_user_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("jcrcontent_user_id_example".to_string()),
                  Some("jcrprimary_type_example".to_string()),
                  Some("operation_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostAuthorizableKeystore") => {
            let result = rt.block_on(client.post_authorizable_keystore(
                  "intermediate_path_example".to_string(),
                  "authorizable_id_example".to_string(),
                  Some("operation_example".to_string()),
                  Some("current_password_example".to_string()),
                  Some("new_password_example".to_string()),
                  Some("re_password_example".to_string()),
                  Some("key_password_example".to_string()),
                  Some("key_store_pass_example".to_string()),
                  Some("alias_example".to_string()),
                  Some("new_alias_example".to_string()),
                  Some("remove_alias_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostAuthorizables") => {
            let result = rt.block_on(client.post_authorizables(
                  "authorizable_id_example".to_string(),
                  "intermediate_path_example".to_string(),
                  Some("create_user_example".to_string()),
                  Some("create_group_example".to_string()),
                  Some("reppassword_example".to_string()),
                  Some("profile_given_name_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigAdobeGraniteSamlAuthenticationHandler") => {
            let result = rt.block_on(client.post_config_adobe_granite_saml_authentication_handler(
                  Some("key_store_password_example".to_string()),
                  Some("key_store_password_type_hint_example".to_string()),
                  Some(56),
                  Some("service_ranking_type_hint_example".to_string()),
                  Some(true),
                  Some("idp_http_redirect_type_hint_example".to_string()),
                  Some(true),
                  Some("create_user_type_hint_example".to_string()),
                  Some("default_redirect_url_example".to_string()),
                  Some("default_redirect_url_type_hint_example".to_string()),
                  Some("user_id_attribute_example".to_string()),
                  Some("user_id_attribute_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("default_groups_type_hint_example".to_string()),
                  Some("idp_cert_alias_example".to_string()),
                  Some("idp_cert_alias_type_hint_example".to_string()),
                  Some(true),
                  Some("add_group_memberships_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("path_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("synchronize_attributes_type_hint_example".to_string()),
                  Some(56),
                  Some("clock_tolerance_type_hint_example".to_string()),
                  Some("group_membership_attribute_example".to_string()),
                  Some("group_membership_attribute_type_hint_example".to_string()),
                  Some("idp_url_example".to_string()),
                  Some("idp_url_type_hint_example".to_string()),
                  Some("logout_url_example".to_string()),
                  Some("logout_url_type_hint_example".to_string()),
                  Some("service_provider_entity_id_example".to_string()),
                  Some("service_provider_entity_id_type_hint_example".to_string()),
                  Some("assertion_consumer_service_url_example".to_string()),
                  Some("assertion_consumer_service_url_type_hint_example".to_string()),
                  Some(true),
                  Some("handle_logout_type_hint_example".to_string()),
                  Some("sp_private_key_alias_example".to_string()),
                  Some("sp_private_key_alias_type_hint_example".to_string()),
                  Some(true),
                  Some("use_encryption_type_hint_example".to_string()),
                  Some("name_id_format_example".to_string()),
                  Some("name_id_format_type_hint_example".to_string()),
                  Some("digest_method_example".to_string()),
                  Some("digest_method_type_hint_example".to_string()),
                  Some("signature_method_example".to_string()),
                  Some("signature_method_type_hint_example".to_string()),
                  Some("user_intermediate_path_example".to_string()),
                  Some("user_intermediate_path_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheFelixJettyBasedHttpService") => {
            let result = rt.block_on(client.post_config_apache_felix_jetty_based_http_service(
                  Some(true),
                  Some("org_apache_felix_https_nio_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_example".to_string()),
                  Some("org_apache_felix_https_keystore_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_password_example".to_string()),
                  Some("org_apache_felix_https_keystore_password_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_password_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_password_type_hint_example".to_string()),
                  Some("org_apache_felix_https_truststore_example".to_string()),
                  Some("org_apache_felix_https_truststore_type_hint_example".to_string()),
                  Some("org_apache_felix_https_truststore_password_example".to_string()),
                  Some("org_apache_felix_https_truststore_password_type_hint_example".to_string()),
                  Some("org_apache_felix_https_clientcertificate_example".to_string()),
                  Some("org_apache_felix_https_clientcertificate_type_hint_example".to_string()),
                  Some(true),
                  Some("org_apache_felix_https_enable_type_hint_example".to_string()),
                  Some("org_osgi_service_http_port_secure_example".to_string()),
                  Some("org_osgi_service_http_port_secure_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheHttpComponentsProxyConfiguration") => {
            let result = rt.block_on(client.post_config_apache_http_components_proxy_configuration(
                  Some("proxy_host_example".to_string()),
                  Some("proxy_host_type_hint_example".to_string()),
                  Some(56),
                  Some("proxy_port_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("proxy_exceptions_type_hint_example".to_string()),
                  Some(true),
                  Some("proxy_enabled_type_hint_example".to_string()),
                  Some("proxy_user_example".to_string()),
                  Some("proxy_user_type_hint_example".to_string()),
                  Some("proxy_password_example".to_string()),
                  Some("proxy_password_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingDavExServlet") => {
            let result = rt.block_on(client.post_config_apache_sling_dav_ex_servlet(
                  Some("alias_example".to_string()),
                  Some("alias_type_hint_example".to_string()),
                  Some(true),
                  Some("dav_create_absolute_uri_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingGetServlet") => {
            let result = rt.block_on(client.post_config_apache_sling_get_servlet(
                  Some("json_maximumresults_example".to_string()),
                  Some("json_maximumresults_type_hint_example".to_string()),
                  Some(true),
                  Some("enable_html_type_hint_example".to_string()),
                  Some(true),
                  Some("enable_txt_type_hint_example".to_string()),
                  Some(true),
                  Some("enable_xml_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingReferrerFilter") => {
            let result = rt.block_on(client.post_config_apache_sling_referrer_filter(
                  Some(true),
                  Some("allow_empty_type_hint_example".to_string()),
                  Some("allow_hosts_example".to_string()),
                  Some("allow_hosts_type_hint_example".to_string()),
                  Some("allow_hosts_regexp_example".to_string()),
                  Some("allow_hosts_regexp_type_hint_example".to_string()),
                  Some("filter_methods_example".to_string()),
                  Some("filter_methods_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigProperty") => {
            let result = rt.block_on(client.post_config_property(
                  "config_node_name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostNode") => {
            let result = rt.block_on(client.post_node(
                  "path_example".to_string(),
                  "name_example".to_string(),
                  Some("operation_example".to_string()),
                  Some("delete_authorizable_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostNodeRw") => {
            let result = rt.block_on(client.post_node_rw(
                  "path_example".to_string(),
                  "name_example".to_string(),
                  Some("add_members_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostPath") => {
            let result = rt.block_on(client.post_path(
                  "path_example".to_string(),
                  "jcrprimary_type_example".to_string(),
                  "name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostQuery") => {
            let result = rt.block_on(client.post_query(
                  "path_example".to_string(),
                  8.14,
                  "param_1_property_example".to_string(),
                  "param_1_property_value_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostTreeActivation") => {
            let result = rt.block_on(client.post_tree_activation(
                  true,
                  true,
                  "path_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostTruststore") => {
            let result = rt.block_on(client.post_truststore(
                  Some("operation_example".to_string()),
                  Some("new_password_example".to_string()),
                  Some("re_password_example".to_string()),
                  Some("key_store_type_example".to_string()),
                  Some("remove_alias_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostTruststorePKCS12") => {
            let result = rt.block_on(client.post_truststore_pkcs12(
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
