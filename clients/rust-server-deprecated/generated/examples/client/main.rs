#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Claims, Client, ContextWrapperExt, models,
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
use clap::{Command, Arg};

// NOTE: Set environment variable RUST_LOG to the name of the executable (or "cargo run") to activate console logging for all loglevels.
//     See https://docs.rs/env_logger/latest/env_logger/  for more details

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

mod client_auth;
use client_auth::build_token;


// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = Command::new("client")
        .arg(Arg::new("operation")
            .help("Sets the operation to run")
            .value_parser(Vec::<&str>::from([
                "GetAemProductInfo",
                "GetConfigMgr",
                "PostSamlConfiguration",
                "GetBundleInfo",
                "PostBundle",
                "PostJmxRepository",
                "GetLoginPage",
                "PostCqActions",
                "GetCrxdeStatus",
                "GetInstallStatus",
                "GetPackageManagerServlet",
                "PostPackageService",
                "PostPackageUpdate",
                "PostSetPassword",
                "PostPackageServiceJson",
                "GetAemHealthCheck",
                "PostConfigAemHealthCheckServlet",
                "PostConfigAemPasswordReset",
                "SslSetup",
                "GetQuery",
                "GetTruststore",
                "GetTruststoreInfo",
                "PostAuthorizables",
                "PostConfigAdobeGraniteSamlAuthenticationHandler",
                "PostConfigApacheFelixJettyBasedHttpService",
                "PostConfigApacheHttpComponentsProxyConfiguration",
                "PostConfigApacheSlingDavExServlet",
                "PostConfigApacheSlingGetServlet",
                "PostConfigApacheSlingReferrerFilter",
                "PostQuery",
                "PostTreeActivation",
                "PostTruststore",
                "PostTruststorePkcs12",
                "GetAgents",
                "PostConfigProperty",
                "PostPath",
                "DeleteAgent",
                "DeleteNode",
                "GetAgent",
                "GetAuthorizableKeystore",
                "GetKeystore",
                "GetNode",
                "PostAgent",
                "PostAuthorizableKeystore",
                "PostNode",
                "PostNodeRw",
                "GetPackage",
                "GetPackageFilter",
            ]))
            .required(true)
            .index(1))
        .arg(Arg::new("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::new("host")
            .long("host")
            .default_value("localhost")
            .help("Hostname to contact"))
        .arg(Arg::new("port")
            .long("port")
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    // Create Bearer-token with a fixed key (secret) for test purposes.
    // In a real (production) system this Bearer token should be obtained via an external Identity/Authentication-server
    // Ensure that you set the correct algorithm and encodingkey that matches what is used on the server side.
    // See https://github.com/Keats/jsonwebtoken for more information
    let auth_token = build_token(
            Claims {
                sub: "tester@acme.com".to_owned(),
                company: "ACME".to_owned(),
                iss: "my_identity_provider".to_owned(),
                // added a very long expiry time
                aud: "org.acme.Resource_Server".to_string(),
                exp: 10000000000,
                // In this example code all available Scopes are added, so the current Bearer Token gets fully authorization.
                scopes:
                  "".to_owned()
            },
            b"secret").unwrap();

    let auth_data = if !auth_token.is_empty() {
        Some(AuthData::Bearer(auth_token))
    } else {
        // No Bearer-token available, so return None
        None
    };

    let is_https = matches.contains_id("https");
    let base_url = format!("{}://{}:{}",
        if is_https { "https" } else { "http" },
        matches.get_one::<String>("host").unwrap(),
        matches.get_one::<u16>("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, auth_data, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = {
        #[cfg(feature = "client-tls")]
        {
            if is_https {
                // Using HTTPS with native-tls
                let client = Box::new(Client::try_new_https(&base_url)
                    .expect("Failed to create HTTPS client"));
                Box::new(client.with_context(context))
            } else {
                // Using HTTP
                let client = Box::new(Client::try_new_http(&base_url)
                    .expect("Failed to create HTTP client"));
                Box::new(client.with_context(context))
            }
        }

        #[cfg(not(feature = "client-tls"))]
        {
            if is_https {
                panic!("HTTPS requested but TLS support not enabled. \
                        Enable the 'client-tls' feature to use HTTPS.");
            }
            // Using HTTP only
            let client = Box::new(Client::try_new_http(&base_url)
                .expect("Failed to create HTTP client"));
            Box::new(client.with_context(context))
        }
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.get_one::<String>("operation").map(String::as_str) {
        Some("GetAemProductInfo") => {
            let result = rt.block_on(client.get_aem_product_info(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetConfigMgr") => {
            let result = rt.block_on(client.get_config_mgr(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostSamlConfiguration") => {
            let result = rt.block_on(client.post_saml_configuration(
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("action_example".to_string()),
                  Some("dollar_location_example".to_string()),
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
        Some("GetBundleInfo") => {
            let result = rt.block_on(client.get_bundle_info(
                  "name_example".to_string()
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
                  Some("bundles_ignored_at_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigAemPasswordReset") => {
            let result = rt.block_on(client.post_config_aem_password_reset(
                  Some(&Vec::new()),
                  Some("pwdreset_authorizables_at_type_hint_example".to_string())
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
        Some("PostAuthorizables") => {
            let result = rt.block_on(client.post_authorizables(
                  "authorizable_id_example".to_string(),
                  "intermediate_path_example".to_string(),
                  Some("create_user_example".to_string()),
                  Some("create_group_example".to_string()),
                  Some("rep_colon_password_example".to_string()),
                  Some("profile_slash_given_name_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigAdobeGraniteSamlAuthenticationHandler") => {
            let result = rt.block_on(client.post_config_adobe_granite_saml_authentication_handler(
                  Some("key_store_password_example".to_string()),
                  Some("key_store_password_at_type_hint_example".to_string()),
                  Some(56),
                  Some("service_ranking_at_type_hint_example".to_string()),
                  Some(true),
                  Some("idp_http_redirect_at_type_hint_example".to_string()),
                  Some(true),
                  Some("create_user_at_type_hint_example".to_string()),
                  Some("default_redirect_url_example".to_string()),
                  Some("default_redirect_url_at_type_hint_example".to_string()),
                  Some("user_id_attribute_example".to_string()),
                  Some("user_id_attribute_at_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("default_groups_at_type_hint_example".to_string()),
                  Some("idp_cert_alias_example".to_string()),
                  Some("idp_cert_alias_at_type_hint_example".to_string()),
                  Some(true),
                  Some("add_group_memberships_at_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("path_at_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("synchronize_attributes_at_type_hint_example".to_string()),
                  Some(56),
                  Some("clock_tolerance_at_type_hint_example".to_string()),
                  Some("group_membership_attribute_example".to_string()),
                  Some("group_membership_attribute_at_type_hint_example".to_string()),
                  Some("idp_url_example".to_string()),
                  Some("idp_url_at_type_hint_example".to_string()),
                  Some("logout_url_example".to_string()),
                  Some("logout_url_at_type_hint_example".to_string()),
                  Some("service_provider_entity_id_example".to_string()),
                  Some("service_provider_entity_id_at_type_hint_example".to_string()),
                  Some("assertion_consumer_service_url_example".to_string()),
                  Some("assertion_consumer_service_urlat_type_hint_example".to_string()),
                  Some(true),
                  Some("handle_logout_at_type_hint_example".to_string()),
                  Some("sp_private_key_alias_example".to_string()),
                  Some("sp_private_key_alias_at_type_hint_example".to_string()),
                  Some(true),
                  Some("use_encryption_at_type_hint_example".to_string()),
                  Some("name_id_format_example".to_string()),
                  Some("name_id_format_at_type_hint_example".to_string()),
                  Some("digest_method_example".to_string()),
                  Some("digest_method_at_type_hint_example".to_string()),
                  Some("signature_method_example".to_string()),
                  Some("signature_method_at_type_hint_example".to_string()),
                  Some("user_intermediate_path_example".to_string()),
                  Some("user_intermediate_path_at_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheFelixJettyBasedHttpService") => {
            let result = rt.block_on(client.post_config_apache_felix_jetty_based_http_service(
                  Some(true),
                  Some("org_apache_felix_https_nio_at_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_example".to_string()),
                  Some("org_apache_felix_https_keystore_at_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_password_example".to_string()),
                  Some("org_apache_felix_https_keystore_password_at_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_at_type_hint_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_password_example".to_string()),
                  Some("org_apache_felix_https_keystore_key_password_at_type_hint_example".to_string()),
                  Some("org_apache_felix_https_truststore_example".to_string()),
                  Some("org_apache_felix_https_truststore_at_type_hint_example".to_string()),
                  Some("org_apache_felix_https_truststore_password_example".to_string()),
                  Some("org_apache_felix_https_truststore_password_at_type_hint_example".to_string()),
                  Some("org_apache_felix_https_clientcertificate_example".to_string()),
                  Some("org_apache_felix_https_clientcertificate_at_type_hint_example".to_string()),
                  Some(true),
                  Some("org_apache_felix_https_enable_at_type_hint_example".to_string()),
                  Some("org_osgi_service_http_port_secure_example".to_string()),
                  Some("org_osgi_service_http_port_secure_at_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheHttpComponentsProxyConfiguration") => {
            let result = rt.block_on(client.post_config_apache_http_components_proxy_configuration(
                  Some("proxy_host_example".to_string()),
                  Some("proxy_host_at_type_hint_example".to_string()),
                  Some(56),
                  Some("proxy_port_at_type_hint_example".to_string()),
                  Some(&Vec::new()),
                  Some("proxy_exceptions_at_type_hint_example".to_string()),
                  Some(true),
                  Some("proxy_enabled_at_type_hint_example".to_string()),
                  Some("proxy_user_example".to_string()),
                  Some("proxy_user_at_type_hint_example".to_string()),
                  Some("proxy_password_example".to_string()),
                  Some("proxy_password_at_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingDavExServlet") => {
            let result = rt.block_on(client.post_config_apache_sling_dav_ex_servlet(
                  Some("alias_example".to_string()),
                  Some("alias_at_type_hint_example".to_string()),
                  Some(true),
                  Some("dav_create_absolute_uri_at_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingGetServlet") => {
            let result = rt.block_on(client.post_config_apache_sling_get_servlet(
                  Some("json_maximumresults_example".to_string()),
                  Some("json_maximumresults_at_type_hint_example".to_string()),
                  Some(true),
                  Some("enable_html_at_type_hint_example".to_string()),
                  Some(true),
                  Some("enable_txt_at_type_hint_example".to_string()),
                  Some(true),
                  Some("enable_xml_at_type_hint_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingReferrerFilter") => {
            let result = rt.block_on(client.post_config_apache_sling_referrer_filter(
                  Some(true),
                  Some("allow_empty_at_type_hint_example".to_string()),
                  Some("allow_hosts_example".to_string()),
                  Some("allow_hosts_at_type_hint_example".to_string()),
                  Some("allow_hosts_regexp_example".to_string()),
                  Some("allow_hosts_regexp_at_type_hint_example".to_string()),
                  Some("filter_methods_example".to_string()),
                  Some("filter_methods_at_type_hint_example".to_string())
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
                  "path_example".to_string(),
                  "cmd_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostTruststore") => {
            let result = rt.block_on(client.post_truststore(
                  Some("colon_operation_example".to_string()),
                  Some("new_password_example".to_string()),
                  Some("re_password_example".to_string()),
                  Some("key_store_type_example".to_string()),
                  Some("remove_alias_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostTruststorePkcs12") => {
            let result = rt.block_on(client.post_truststore_pkcs12(
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAgents") => {
            let result = rt.block_on(client.get_agents(
                  "runmode_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigProperty") => {
            let result = rt.block_on(client.post_config_property(
                  "config_node_name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostPath") => {
            let result = rt.block_on(client.post_path(
                  "path_example".to_string(),
                  "jcr_colon_primary_type_example".to_string(),
                  "colon_name_example".to_string()
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
        Some("PostAgent") => {
            let result = rt.block_on(client.post_agent(
                  "runmode_example".to_string(),
                  "name_example".to_string(),
                  Some(true),
                  Some("jcr_colon_content_slash_cq_colon_distribute_at_type_hint_example".to_string()),
                  Some("jcr_colon_content_slash_cq_colon_name_example".to_string()),
                  Some("jcr_colon_content_slash_cq_colon_template_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("jcr_colon_content_slash_jcr_colon_description_example".to_string()),
                  Some("jcr_colon_content_slash_jcr_colon_last_modified_example".to_string()),
                  Some("jcr_colon_content_slash_jcr_colon_last_modified_by_example".to_string()),
                  Some("jcr_colon_content_slash_jcr_colon_mixin_types_example".to_string()),
                  Some("jcr_colon_content_slash_jcr_colon_title_example".to_string()),
                  Some("jcr_colon_content_slash_log_level_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(8.14),
                  Some(true),
                  Some("jcr_colon_content_slash_protocol_http_expired_example".to_string()),
                  Some(&Vec::new()),
                  Some("jcr_colon_content_slash_protocol_http_headers_at_type_hint_example".to_string()),
                  Some("jcr_colon_content_slash_protocol_http_method_example".to_string()),
                  Some(true),
                  Some("jcr_colon_content_slash_protocol_interface_example".to_string()),
                  Some(8.14),
                  Some("jcr_colon_content_slash_protocol_version_example".to_string()),
                  Some("jcr_colon_content_slash_proxy_ntlm_domain_example".to_string()),
                  Some("jcr_colon_content_slash_proxy_ntlm_host_example".to_string()),
                  Some("jcr_colon_content_slash_proxy_host_example".to_string()),
                  Some("jcr_colon_content_slash_proxy_password_example".to_string()),
                  Some(8.14),
                  Some("jcr_colon_content_slash_proxy_user_example".to_string()),
                  Some(8.14),
                  Some("jcr_colon_content_slash_queue_batch_mode_example".to_string()),
                  Some(8.14),
                  Some("jcr_colon_content_slash_retry_delay_example".to_string()),
                  Some(true),
                  Some("jcr_colon_content_slash_serialization_type_example".to_string()),
                  Some("jcr_colon_content_slash_sling_colon_resource_type_example".to_string()),
                  Some("jcr_colon_content_slash_ssl_example".to_string()),
                  Some("jcr_colon_content_slash_transport_ntlm_domain_example".to_string()),
                  Some("jcr_colon_content_slash_transport_ntlm_host_example".to_string()),
                  Some("jcr_colon_content_slash_transport_password_example".to_string()),
                  Some("jcr_colon_content_slash_transport_uri_example".to_string()),
                  Some("jcr_colon_content_slash_transport_user_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("jcr_colon_content_slash_user_id_example".to_string()),
                  Some("jcr_colon_primary_type_example".to_string()),
                  Some("colon_operation_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostAuthorizableKeystore") => {
            let result = rt.block_on(client.post_authorizable_keystore(
                  "intermediate_path_example".to_string(),
                  "authorizable_id_example".to_string(),
                  Some("colon_operation_example".to_string()),
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
        Some("PostNode") => {
            let result = rt.block_on(client.post_node(
                  "path_example".to_string(),
                  "name_example".to_string(),
                  Some("colon_operation_example".to_string()),
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
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
