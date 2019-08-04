#![allow(missing_docs, unused_variables, trivial_casts)]

extern crate swagger_client;
#[allow(unused_extern_crates)]
extern crate futures;
#[allow(unused_extern_crates)]
#[macro_use]
extern crate swagger;
#[allow(unused_extern_crates)]
extern crate uuid;
extern crate clap;
extern crate tokio_core;

use swagger::{ContextBuilder, EmptyContext, XSpanIdString, Has, Push, AuthData};

#[allow(unused_imports)]
use futures::{Future, future, Stream, stream};
use tokio_core::reactor;
#[allow(unused_imports)]
use swagger_client::{ApiNoContext, ContextWrapperExt,
                      ApiError,
                      GetAemProductInfoResponse,
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
                      PostNodeResponse,
                      PostNodeRwResponse,
                      PostPathResponse,
                      PostQueryResponse,
                      PostTreeActivationResponse,
                      PostTruststoreResponse,
                      PostTruststorePKCS12Response
                     };
use clap::{App, Arg};

fn main() {
    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
    "GetAemProductInfo",
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
            .default_value("80")
            .help("Port to contact"))
        .get_matches();

    let mut core = reactor::Core::new().unwrap();
    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());
    let client = if matches.is_present("https") {
        // Using Simple HTTPS
        swagger_client::Client::try_new_https(core.handle(), &base_url, "examples/ca.pem")
            .expect("Failed to create HTTPS client")
    } else {
        // Using HTTP
        swagger_client::Client::try_new_http(core.handle(), &base_url)
            .expect("Failed to create HTTP client")
    };

    let context: make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString) =
        make_context!(ContextBuilder, EmptyContext, None, XSpanIdString(self::uuid::Uuid::new_v4().to_string()));
    let client = client.with_context(context);

    match matches.value_of("operation") {

        Some("GetAemProductInfo") => {
            let result = core.run(client.get_aem_product_info());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetConfigMgr") => {
            let result = core.run(client.get_config_mgr());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostBundle") => {
            let result = core.run(client.post_bundle("name_example".to_string(), "action_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostJmxRepository") => {
            let result = core.run(client.post_jmx_repository("action_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostSamlConfiguration") => {
            let result = core.run(client.post_saml_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("idp_url_example".to_string()), Some("idp_cert_alias_example".to_string()), Some(true), Some("service_provider_entity_id_example".to_string()), Some("assertion_consumer_service_url_example".to_string()), Some("sp_private_key_alias_example".to_string()), Some("key_store_password_example".to_string()), Some("default_redirect_url_example".to_string()), Some("user_id_attribute_example".to_string()), Some(true), Some(true), Some(true), Some("group_membership_attribute_example".to_string()), Some(&Vec::new()), Some("name_id_format_example".to_string()), Some(&Vec::new()), Some(true), Some("logout_url_example".to_string()), Some(56), Some("digest_method_example".to_string()), Some("signature_method_example".to_string()), Some("user_intermediate_path_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetLoginPage") => {
            let result = core.run(client.get_login_page());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostCqActions") => {
            let result = core.run(client.post_cq_actions("authorizable_id_example".to_string(), "changelog_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetCrxdeStatus") => {
            let result = core.run(client.get_crxde_status());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetInstallStatus") => {
            let result = core.run(client.get_install_status());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetPackageManagerServlet") => {
            let result = core.run(client.get_package_manager_servlet());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostPackageService") => {
            let result = core.run(client.post_package_service("cmd_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostPackageServiceJson") => {
            let result = core.run(client.post_package_service_json("path_example".to_string(), "cmd_example".to_string(), Some("group_name_example".to_string()), Some("package_name_example".to_string()), Some("package_version_example".to_string()), Some("_charset__example".to_string()), Some(true), Some(true), Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostPackageUpdate") => {
            let result = core.run(client.post_package_update("group_name_example".to_string(), "package_name_example".to_string(), "version_example".to_string(), "path_example".to_string(), Some("filter_example".to_string()), Some("_charset__example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostSetPassword") => {
            let result = core.run(client.post_set_password("old_example".to_string(), "plain_example".to_string(), "verify_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAemHealthCheck") => {
            let result = core.run(client.get_aem_health_check(Some("tags_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigAemHealthCheckServlet") => {
            let result = core.run(client.post_config_aem_health_check_servlet(Some(&Vec::new()), Some("bundles_ignored_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigAemPasswordReset") => {
            let result = core.run(client.post_config_aem_password_reset(Some(&Vec::new()), Some("pwdreset_authorizables_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("DeleteAgent") => {
            let result = core.run(client.delete_agent("runmode_example".to_string(), "name_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("DeleteNode") => {
            let result = core.run(client.delete_node("path_example".to_string(), "name_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAgent") => {
            let result = core.run(client.get_agent("runmode_example".to_string(), "name_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAgents") => {
            let result = core.run(client.get_agents("runmode_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAuthorizableKeystore") => {
            let result = core.run(client.get_authorizable_keystore("intermediate_path_example".to_string(), "authorizable_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetKeystore") => {
            let result = core.run(client.get_keystore("intermediate_path_example".to_string(), "authorizable_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetNode") => {
            let result = core.run(client.get_node("path_example".to_string(), "name_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetPackage") => {
            let result = core.run(client.get_package("group_example".to_string(), "name_example".to_string(), "version_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetPackageFilter") => {
            let result = core.run(client.get_package_filter("group_example".to_string(), "name_example".to_string(), "version_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetQuery") => {
            let result = core.run(client.get_query("path_example".to_string(), 1.2, "_1_property_example".to_string(), "_1_property_value_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetTruststore") => {
            let result = core.run(client.get_truststore());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetTruststoreInfo") => {
            let result = core.run(client.get_truststore_info());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostAgent") => {
            let result = core.run(client.post_agent("runmode_example".to_string(), "name_example".to_string(), Some(true), Some("jcrcontentcqdistribute_type_hint_example".to_string()), Some("jcrcontentcqname_example".to_string()), Some("jcrcontentcqtemplate_example".to_string()), Some(true), Some("jcrcontentjcrdescription_example".to_string()), Some("jcrcontentjcrlast_modified_example".to_string()), Some("jcrcontentjcrlast_modified_by_example".to_string()), Some("jcrcontentjcrmixin_types_example".to_string()), Some("jcrcontentjcrtitle_example".to_string()), Some("jcrcontentlog_level_example".to_string()), Some(true), Some(true), Some(1.2), Some(true), Some("jcrcontentprotocol_http_expired_example".to_string()), Some(&Vec::new()), Some("jcrcontentprotocol_http_headers_type_hint_example".to_string()), Some("jcrcontentprotocol_http_method_example".to_string()), Some(true), Some("jcrcontentprotocol_interface_example".to_string()), Some(1.2), Some("jcrcontentprotocol_version_example".to_string()), Some("jcrcontentproxy_ntlm_domain_example".to_string()), Some("jcrcontentproxy_ntlm_host_example".to_string()), Some("jcrcontentproxy_host_example".to_string()), Some("jcrcontentproxy_password_example".to_string()), Some(1.2), Some("jcrcontentproxy_user_example".to_string()), Some(1.2), Some("jcrcontentqueue_batch_mode_example".to_string()), Some(1.2), Some("jcrcontentretry_delay_example".to_string()), Some(true), Some("jcrcontentserialization_type_example".to_string()), Some("jcrcontentslingresource_type_example".to_string()), Some("jcrcontentssl_example".to_string()), Some("jcrcontenttransport_ntlm_domain_example".to_string()), Some("jcrcontenttransport_ntlm_host_example".to_string()), Some("jcrcontenttransport_password_example".to_string()), Some("jcrcontenttransport_uri_example".to_string()), Some("jcrcontenttransport_user_example".to_string()), Some(true), Some(true), Some(true), Some(true), Some(true), Some("jcrcontentuser_id_example".to_string()), Some("jcrprimary_type_example".to_string()), Some("operation_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostAuthorizableKeystore") => {
            let result = core.run(client.post_authorizable_keystore("intermediate_path_example".to_string(), "authorizable_id_example".to_string(), Some("operation_example".to_string()), Some("current_password_example".to_string()), Some("new_password_example".to_string()), Some("re_password_example".to_string()), Some("key_password_example".to_string()), Some("key_store_pass_example".to_string()), Some("alias_example".to_string()), Some("new_alias_example".to_string()), Some("remove_alias_example".to_string()), Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))), Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))), Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostAuthorizables") => {
            let result = core.run(client.post_authorizables("authorizable_id_example".to_string(), "intermediate_path_example".to_string(), Some("create_user_example".to_string()), Some("create_group_example".to_string()), Some("reppassword_example".to_string()), Some("profilegiven_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigAdobeGraniteSamlAuthenticationHandler") => {
            let result = core.run(client.post_config_adobe_granite_saml_authentication_handler(Some("key_store_password_example".to_string()), Some("key_store_password_type_hint_example".to_string()), Some(56), Some("service_ranking_type_hint_example".to_string()), Some(true), Some("idp_http_redirect_type_hint_example".to_string()), Some(true), Some("create_user_type_hint_example".to_string()), Some("default_redirect_url_example".to_string()), Some("default_redirect_url_type_hint_example".to_string()), Some("user_id_attribute_example".to_string()), Some("user_id_attribute_type_hint_example".to_string()), Some(&Vec::new()), Some("default_groups_type_hint_example".to_string()), Some("idp_cert_alias_example".to_string()), Some("idp_cert_alias_type_hint_example".to_string()), Some(true), Some("add_group_memberships_type_hint_example".to_string()), Some(&Vec::new()), Some("path_type_hint_example".to_string()), Some(&Vec::new()), Some("synchronize_attributes_type_hint_example".to_string()), Some(56), Some("clock_tolerance_type_hint_example".to_string()), Some("group_membership_attribute_example".to_string()), Some("group_membership_attribute_type_hint_example".to_string()), Some("idp_url_example".to_string()), Some("idp_url_type_hint_example".to_string()), Some("logout_url_example".to_string()), Some("logout_url_type_hint_example".to_string()), Some("service_provider_entity_id_example".to_string()), Some("service_provider_entity_id_type_hint_example".to_string()), Some("assertion_consumer_service_url_example".to_string()), Some("assertion_consumer_service_url_type_hint_example".to_string()), Some(true), Some("handle_logout_type_hint_example".to_string()), Some("sp_private_key_alias_example".to_string()), Some("sp_private_key_alias_type_hint_example".to_string()), Some(true), Some("use_encryption_type_hint_example".to_string()), Some("name_id_format_example".to_string()), Some("name_id_format_type_hint_example".to_string()), Some("digest_method_example".to_string()), Some("digest_method_type_hint_example".to_string()), Some("signature_method_example".to_string()), Some("signature_method_type_hint_example".to_string()), Some("user_intermediate_path_example".to_string()), Some("user_intermediate_path_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigApacheFelixJettyBasedHttpService") => {
            let result = core.run(client.post_config_apache_felix_jetty_based_http_service(Some(true), Some("org_apache_felix_https_nio_type_hint_example".to_string()), Some("org_apache_felix_https_keystore_example".to_string()), Some("org_apache_felix_https_keystore_type_hint_example".to_string()), Some("org_apache_felix_https_keystore_password_example".to_string()), Some("org_apache_felix_https_keystore_password_type_hint_example".to_string()), Some("org_apache_felix_https_keystore_key_example".to_string()), Some("org_apache_felix_https_keystore_key_type_hint_example".to_string()), Some("org_apache_felix_https_keystore_key_password_example".to_string()), Some("org_apache_felix_https_keystore_key_password_type_hint_example".to_string()), Some("org_apache_felix_https_truststore_example".to_string()), Some("org_apache_felix_https_truststore_type_hint_example".to_string()), Some("org_apache_felix_https_truststore_password_example".to_string()), Some("org_apache_felix_https_truststore_password_type_hint_example".to_string()), Some("org_apache_felix_https_clientcertificate_example".to_string()), Some("org_apache_felix_https_clientcertificate_type_hint_example".to_string()), Some(true), Some("org_apache_felix_https_enable_type_hint_example".to_string()), Some("org_osgi_service_http_port_secure_example".to_string()), Some("org_osgi_service_http_port_secure_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigApacheHttpComponentsProxyConfiguration") => {
            let result = core.run(client.post_config_apache_http_components_proxy_configuration(Some("proxy_host_example".to_string()), Some("proxy_host_type_hint_example".to_string()), Some(56), Some("proxy_port_type_hint_example".to_string()), Some(&Vec::new()), Some("proxy_exceptions_type_hint_example".to_string()), Some(true), Some("proxy_enabled_type_hint_example".to_string()), Some("proxy_user_example".to_string()), Some("proxy_user_type_hint_example".to_string()), Some("proxy_password_example".to_string()), Some("proxy_password_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigApacheSlingDavExServlet") => {
            let result = core.run(client.post_config_apache_sling_dav_ex_servlet(Some("alias_example".to_string()), Some("alias_type_hint_example".to_string()), Some(true), Some("dav_create_absolute_uri_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigApacheSlingGetServlet") => {
            let result = core.run(client.post_config_apache_sling_get_servlet(Some("json_maximumresults_example".to_string()), Some("json_maximumresults_type_hint_example".to_string()), Some(true), Some("enable_html_type_hint_example".to_string()), Some(true), Some("enable_txt_type_hint_example".to_string()), Some(true), Some("enable_xml_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostConfigApacheSlingReferrerFilter") => {
            let result = core.run(client.post_config_apache_sling_referrer_filter(Some(true), Some("allow_empty_type_hint_example".to_string()), Some("allow_hosts_example".to_string()), Some("allow_hosts_type_hint_example".to_string()), Some("allow_hosts_regexp_example".to_string()), Some("allow_hosts_regexp_type_hint_example".to_string()), Some("filter_methods_example".to_string()), Some("filter_methods_type_hint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostNode") => {
            let result = core.run(client.post_node("path_example".to_string(), "name_example".to_string(), Some("operation_example".to_string()), Some("delete_authorizable_example".to_string()), Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostNodeRw") => {
            let result = core.run(client.post_node_rw("path_example".to_string(), "name_example".to_string(), Some("add_members_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostPath") => {
            let result = core.run(client.post_path("path_example".to_string(), "jcrprimary_type_example".to_string(), "name_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostQuery") => {
            let result = core.run(client.post_query("path_example".to_string(), 1.2, "_1_property_example".to_string(), "_1_property_value_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostTreeActivation") => {
            let result = core.run(client.post_tree_activation(true, true, "path_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostTruststore") => {
            let result = core.run(client.post_truststore(Some("operation_example".to_string()), Some("new_password_example".to_string()), Some("re_password_example".to_string()), Some("key_store_type_example".to_string()), Some("remove_alias_example".to_string()), Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("PostTruststorePKCS12") => {
            let result = core.run(client.post_truststore_pkcs12(Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        _ => {
            panic!("Invalid operation provided")
        }
    }
}

