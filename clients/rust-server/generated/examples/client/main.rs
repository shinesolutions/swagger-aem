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
                "GetLoginPage",
                "GetCrxdeStatus",
                "GetInstallStatus",
                "GetPackageManagerServlet",
                "GetAemHealthCheck",
                "PostConfigAemHealthCheckServlet",
                "PostConfigAemPasswordReset",
                "GetTruststore",
                "GetTruststoreInfo",
                "PostConfigAdobeGraniteSamlAuthenticationHandler",
                "PostConfigApacheFelixJettyBasedHttpService",
                "PostConfigApacheHttpComponentsProxyConfiguration",
                "PostConfigApacheSlingDavExServlet",
                "PostConfigApacheSlingGetServlet",
                "PostConfigApacheSlingReferrerFilter",
                "PostTruststore",
                "PostTruststorePkcs12",
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
                  None,
                  None,
                  Some(&Vec::new()),
                  Some(0),
                  None,
                  None,
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(true),
                  Some(true),
                  Some(true),
                  None,
                  Some(&Vec::new()),
                  None,
                  Some(&Vec::new()),
                  Some(true),
                  None,
                  Some(0),
                  None,
                  None,
                  None,
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetBundleInfo") => {
            let result = rt.block_on(client.get_bundle_info(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostBundle") => {
            let result = rt.block_on(client.post_bundle(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostJmxRepository") => {
            let result = rt.block_on(client.post_jmx_repository(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetLoginPage") => {
            let result = rt.block_on(client.get_login_page(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("PostCqActions") => {
            let result = rt.block_on(client.post_cq_actions(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
        /* Disabled because there's no example.
        Some("PostPackageService") => {
            let result = rt.block_on(client.post_package_service(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostPackageUpdate") => {
            let result = rt.block_on(client.post_package_update(
                  ???,
                  ???,
                  ???,
                  ???,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostSetPassword") => {
            let result = rt.block_on(client.post_set_password(
                  ???,
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostPackageServiceJson") => {
            let result = rt.block_on(client.post_package_service_json(
                  ???,
                  ???,
                  None,
                  None,
                  None,
                  None,
                  Some(true),
                  Some(true),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetAemHealthCheck") => {
            let result = rt.block_on(client.get_aem_health_check(
                  None,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigAemHealthCheckServlet") => {
            let result = rt.block_on(client.post_config_aem_health_check_servlet(
                  Some(&Vec::new()),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigAemPasswordReset") => {
            let result = rt.block_on(client.post_config_aem_password_reset(
                  Some(&Vec::new()),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SslSetup") => {
            let result = rt.block_on(client.ssl_setup(
                  ???,
                  ???,
                  ???,
                  ???,
                  ???,
                  ???,
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetQuery") => {
            let result = rt.block_on(client.get_query(
                  ???,
                  0,
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
        /* Disabled because there's no example.
        Some("PostAuthorizables") => {
            let result = rt.block_on(client.post_authorizables(
                  ???,
                  ???,
                  None,
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("PostConfigAdobeGraniteSamlAuthenticationHandler") => {
            let result = rt.block_on(client.post_config_adobe_granite_saml_authentication_handler(
                  None,
                  None,
                  Some(0),
                  None,
                  Some(true),
                  None,
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(&Vec::new()),
                  None,
                  None,
                  None,
                  Some(true),
                  None,
                  Some(&Vec::new()),
                  None,
                  Some(&Vec::new()),
                  None,
                  Some(0),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(true),
                  None,
                  None,
                  None,
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheFelixJettyBasedHttpService") => {
            let result = rt.block_on(client.post_config_apache_felix_jetty_based_http_service(
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(true),
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheHttpComponentsProxyConfiguration") => {
            let result = rt.block_on(client.post_config_apache_http_components_proxy_configuration(
                  None,
                  None,
                  Some(0),
                  None,
                  Some(&Vec::new()),
                  None,
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingDavExServlet") => {
            let result = rt.block_on(client.post_config_apache_sling_dav_ex_servlet(
                  None,
                  None,
                  Some(true),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingGetServlet") => {
            let result = rt.block_on(client.post_config_apache_sling_get_servlet(
                  None,
                  None,
                  Some(true),
                  None,
                  Some(true),
                  None,
                  Some(true),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostConfigApacheSlingReferrerFilter") => {
            let result = rt.block_on(client.post_config_apache_sling_referrer_filter(
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("PostQuery") => {
            let result = rt.block_on(client.post_query(
                  ???,
                  0,
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostTreeActivation") => {
            let result = rt.block_on(client.post_tree_activation(
                  true,
                  true,
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("PostTruststore") => {
            let result = rt.block_on(client.post_truststore(
                  None,
                  None,
                  None,
                  None,
                  None,
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
        /* Disabled because there's no example.
        Some("GetAgents") => {
            let result = rt.block_on(client.get_agents(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostConfigProperty") => {
            let result = rt.block_on(client.post_config_property(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostPath") => {
            let result = rt.block_on(client.post_path(
                  ???,
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteAgent") => {
            let result = rt.block_on(client.delete_agent(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteNode") => {
            let result = rt.block_on(client.delete_node(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetAgent") => {
            let result = rt.block_on(client.get_agent(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetAuthorizableKeystore") => {
            let result = rt.block_on(client.get_authorizable_keystore(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetKeystore") => {
            let result = rt.block_on(client.get_keystore(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetNode") => {
            let result = rt.block_on(client.get_node(
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostAgent") => {
            let result = rt.block_on(client.post_agent(
                  ???,
                  ???,
                  Some(true),
                  None,
                  None,
                  None,
                  Some(true),
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(true),
                  Some(true),
                  Some(0),
                  Some(true),
                  None,
                  Some(&Vec::new()),
                  None,
                  None,
                  Some(true),
                  None,
                  Some(0),
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(0),
                  None,
                  Some(0),
                  None,
                  Some(0),
                  None,
                  Some(true),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostAuthorizableKeystore") => {
            let result = rt.block_on(client.post_authorizable_keystore(
                  ???,
                  ???,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostNode") => {
            let result = rt.block_on(client.post_node(
                  ???,
                  ???,
                  None,
                  None,
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PostNodeRw") => {
            let result = rt.block_on(client.post_node_rw(
                  ???,
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetPackage") => {
            let result = rt.block_on(client.get_package(
                  ???,
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetPackageFilter") => {
            let result = rt.block_on(client.get_package_filter(
                  ???,
                  ???,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
