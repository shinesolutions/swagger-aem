//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::http1;
use hyper_util::rt::TokioIo;
use hyper::service::{service_fn, Service};
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr: SocketAddr = addr.parse().expect("Failed to parse bind address");
    let listener = TcpListener::bind(&addr).await.unwrap();

    let server = Server::new();

    let service = MakeService::new(server);
    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, addr)) = listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        http1::Builder::new()
                            .serve_connection(TokioIo::new(tls), service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        println!("Listening on http://{}", addr);

        loop {
            // When an incoming TCP connection is received grab a TCP stream for
            // client<->server communication.
            //
            // Note, this is a .await point, this loop will loop forever but is not a busy loop. The
            // .await point allows the Tokio runtime to pull the task off of the thread until the task
            // has work to do. In this case, a connection arrives on the port we are listening on and
            // the task is woken up, at which point the task is then put back on a thread, and is
            // driven forward by the runtime, eventually yielding a TCP stream.
            let (tcp_stream, addr) = listener.accept().await.expect("Failed to accept connection");

            let service = service.call(addr).await.unwrap();
            let io = TokioIo::new(tcp_stream);
            // Spin up a new task in Tokio so we can continue to listen for new TCP connection on the
            // current task without waiting for the processing of the HTTP1 connection we just received
            // to finish
            tokio::task::spawn(async move {
                // Handle the connection from the client using HTTP1 and pass any
                // HTTP requests received on that connection to the `hello` function
                let result = http1::Builder::new()
                    .serve_connection(io, service)
                    .await;
                if let Err(err) = result
                {
                    println!("Error serving connection: {err:?}");
                }
            });
        }
    }
}

#[derive(Copy)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Clone for Server<C> {
    fn clone(&self) -> Self {
        Self {
            marker: PhantomData,
        }
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use openapi_client::{
    Api,
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
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    async fn get_aem_product_info(
        &self,
        context: &C) -> Result<GetAemProductInfoResponse, ApiError>
    {
        info!("get_aem_product_info() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_config_mgr(
        &self,
        context: &C) -> Result<GetConfigMgrResponse, ApiError>
    {
        info!("get_config_mgr() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_saml_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
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
        context: &C) -> Result<PostSamlConfigurationResponse, ApiError>
    {
        info!("post_saml_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, path, service_ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path, propertylist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_bundle_info(
        &self,
        name: String,
        context: &C) -> Result<GetBundleInfoResponse, ApiError>
    {
        info!("get_bundle_info(\"{}\") - X-Span-ID: {:?}", name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_bundle(
        &self,
        name: String,
        action: String,
        context: &C) -> Result<PostBundleResponse, ApiError>
    {
        info!("post_bundle(\"{}\", \"{}\") - X-Span-ID: {:?}", name, action, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_jmx_repository(
        &self,
        action: String,
        context: &C) -> Result<PostJmxRepositoryResponse, ApiError>
    {
        info!("post_jmx_repository(\"{}\") - X-Span-ID: {:?}", action, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_login_page(
        &self,
        context: &C) -> Result<GetLoginPageResponse, ApiError>
    {
        info!("get_login_page() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_cq_actions(
        &self,
        authorizable_id: String,
        changelog: String,
        context: &C) -> Result<PostCqActionsResponse, ApiError>
    {
        info!("post_cq_actions(\"{}\", \"{}\") - X-Span-ID: {:?}", authorizable_id, changelog, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_crxde_status(
        &self,
        context: &C) -> Result<GetCrxdeStatusResponse, ApiError>
    {
        info!("get_crxde_status() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_install_status(
        &self,
        context: &C) -> Result<GetInstallStatusResponse, ApiError>
    {
        info!("get_install_status() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_package_manager_servlet(
        &self,
        context: &C) -> Result<GetPackageManagerServletResponse, ApiError>
    {
        info!("get_package_manager_servlet() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_package_service(
        &self,
        cmd: String,
        context: &C) -> Result<PostPackageServiceResponse, ApiError>
    {
        info!("post_package_service(\"{}\") - X-Span-ID: {:?}", cmd, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_package_update(
        &self,
        group_name: String,
        package_name: String,
        version: String,
        path: String,
        filter: Option<String>,
        _charset_: Option<String>,
        context: &C) -> Result<PostPackageUpdateResponse, ApiError>
    {
        info!("post_package_update(\"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", group_name, package_name, version, path, filter, _charset_, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_set_password(
        &self,
        old: String,
        plain: String,
        verify: String,
        context: &C) -> Result<PostSetPasswordResponse, ApiError>
    {
        info!("post_set_password(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", old, plain, verify, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        context: &C) -> Result<PostPackageServiceJsonResponse, ApiError>
    {
        info!("post_package_service_json(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", path, cmd, group_name, package_name, package_version, _charset_, force, recursive, package, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_aem_health_check(
        &self,
        tags: Option<String>,
        combine_tags_or: Option<bool>,
        context: &C) -> Result<GetAemHealthCheckResponse, ApiError>
    {
        info!("get_aem_health_check({:?}, {:?}) - X-Span-ID: {:?}", tags, combine_tags_or, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_aem_health_check_servlet(
        &self,
        bundles_ignored: Option<&Vec<String>>,
        bundles_ignored_at_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAemHealthCheckServletResponse, ApiError>
    {
        info!("post_config_aem_health_check_servlet({:?}, {:?}) - X-Span-ID: {:?}", bundles_ignored, bundles_ignored_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_aem_password_reset(
        &self,
        pwdreset_authorizables: Option<&Vec<String>>,
        pwdreset_authorizables_at_type_hint: Option<String>,
        context: &C) -> Result<PostConfigAemPasswordResetResponse, ApiError>
    {
        info!("post_config_aem_password_reset({:?}, {:?}) - X-Span-ID: {:?}", pwdreset_authorizables, pwdreset_authorizables_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        context: &C) -> Result<SslSetupResponse, ApiError>
    {
        info!("ssl_setup(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file, certificate_file, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        context: &C) -> Result<GetQueryResponse, ApiError>
    {
        info!("get_query(\"{}\", {}, \"{}\", \"{}\") - X-Span-ID: {:?}", path, p_limit, param_1_property, param_1_property_value, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_truststore(
        &self,
        context: &C) -> Result<GetTruststoreResponse, ApiError>
    {
        info!("get_truststore() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_truststore_info(
        &self,
        context: &C) -> Result<GetTruststoreInfoResponse, ApiError>
    {
        info!("get_truststore_info() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_authorizables(
        &self,
        authorizable_id: String,
        intermediate_path: String,
        create_user: Option<String>,
        create_group: Option<String>,
        rep_colon_password: Option<String>,
        profile_slash_given_name: Option<String>,
        context: &C) -> Result<PostAuthorizablesResponse, ApiError>
    {
        info!("post_authorizables(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", authorizable_id, intermediate_path, create_user, create_group, rep_colon_password, profile_slash_given_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_adobe_granite_saml_authentication_handler(
        &self,
        key_store_password: Option<String>,
        key_store_password_at_type_hint: Option<String>,
        service_ranking: Option<i32>,
        service_ranking_at_type_hint: Option<String>,
        idp_http_redirect: Option<bool>,
        idp_http_redirect_at_type_hint: Option<String>,
        create_user: Option<bool>,
        create_user_at_type_hint: Option<String>,
        default_redirect_url: Option<String>,
        default_redirect_url_at_type_hint: Option<String>,
        user_id_attribute: Option<String>,
        user_id_attribute_at_type_hint: Option<String>,
        default_groups: Option<&Vec<String>>,
        default_groups_at_type_hint: Option<String>,
        idp_cert_alias: Option<String>,
        idp_cert_alias_at_type_hint: Option<String>,
        add_group_memberships: Option<bool>,
        add_group_memberships_at_type_hint: Option<String>,
        path: Option<&Vec<String>>,
        path_at_type_hint: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
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
        handle_logout: Option<bool>,
        handle_logout_at_type_hint: Option<String>,
        sp_private_key_alias: Option<String>,
        sp_private_key_alias_at_type_hint: Option<String>,
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
        context: &C) -> Result<PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, ApiError>
    {
        info!("post_config_adobe_granite_saml_authentication_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", key_store_password, key_store_password_at_type_hint, service_ranking, service_ranking_at_type_hint, idp_http_redirect, idp_http_redirect_at_type_hint, create_user, create_user_at_type_hint, default_redirect_url, default_redirect_url_at_type_hint, user_id_attribute, user_id_attribute_at_type_hint, default_groups, default_groups_at_type_hint, idp_cert_alias, idp_cert_alias_at_type_hint, add_group_memberships, add_group_memberships_at_type_hint, path, path_at_type_hint, synchronize_attributes, synchronize_attributes_at_type_hint, clock_tolerance, clock_tolerance_at_type_hint, group_membership_attribute, group_membership_attribute_at_type_hint, idp_url, idp_url_at_type_hint, logout_url, logout_url_at_type_hint, service_provider_entity_id, service_provider_entity_id_at_type_hint, assertion_consumer_service_url, assertion_consumer_service_urlat_type_hint, handle_logout, handle_logout_at_type_hint, sp_private_key_alias, sp_private_key_alias_at_type_hint, use_encryption, use_encryption_at_type_hint, name_id_format, name_id_format_at_type_hint, digest_method, digest_method_at_type_hint, signature_method, signature_method_at_type_hint, user_intermediate_path, user_intermediate_path_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_apache_felix_jetty_based_http_service(
        &self,
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
        org_apache_felix_https_enable: Option<bool>,
        org_apache_felix_https_enable_at_type_hint: Option<String>,
        org_osgi_service_http_port_secure: Option<String>,
        org_osgi_service_http_port_secure_at_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheFelixJettyBasedHttpServiceResponse, ApiError>
    {
        info!("post_config_apache_felix_jetty_based_http_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", org_apache_felix_https_nio, org_apache_felix_https_nio_at_type_hint, org_apache_felix_https_keystore, org_apache_felix_https_keystore_at_type_hint, org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_at_type_hint, org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_at_type_hint, org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_at_type_hint, org_apache_felix_https_truststore, org_apache_felix_https_truststore_at_type_hint, org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_at_type_hint, org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_at_type_hint, org_apache_felix_https_enable, org_apache_felix_https_enable_at_type_hint, org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_apache_http_components_proxy_configuration(
        &self,
        proxy_host: Option<String>,
        proxy_host_at_type_hint: Option<String>,
        proxy_port: Option<i32>,
        proxy_port_at_type_hint: Option<String>,
        proxy_exceptions: Option<&Vec<String>>,
        proxy_exceptions_at_type_hint: Option<String>,
        proxy_enabled: Option<bool>,
        proxy_enabled_at_type_hint: Option<String>,
        proxy_user: Option<String>,
        proxy_user_at_type_hint: Option<String>,
        proxy_password: Option<String>,
        proxy_password_at_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheHttpComponentsProxyConfigurationResponse, ApiError>
    {
        info!("post_config_apache_http_components_proxy_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", proxy_host, proxy_host_at_type_hint, proxy_port, proxy_port_at_type_hint, proxy_exceptions, proxy_exceptions_at_type_hint, proxy_enabled, proxy_enabled_at_type_hint, proxy_user, proxy_user_at_type_hint, proxy_password, proxy_password_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_apache_sling_dav_ex_servlet(
        &self,
        alias: Option<String>,
        alias_at_type_hint: Option<String>,
        dav_create_absolute_uri: Option<bool>,
        dav_create_absolute_uri_at_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingDavExServletResponse, ApiError>
    {
        info!("post_config_apache_sling_dav_ex_servlet({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", alias, alias_at_type_hint, dav_create_absolute_uri, dav_create_absolute_uri_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_apache_sling_get_servlet(
        &self,
        json_maximumresults: Option<String>,
        json_maximumresults_at_type_hint: Option<String>,
        enable_html: Option<bool>,
        enable_html_at_type_hint: Option<String>,
        enable_txt: Option<bool>,
        enable_txt_at_type_hint: Option<String>,
        enable_xml: Option<bool>,
        enable_xml_at_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingGetServletResponse, ApiError>
    {
        info!("post_config_apache_sling_get_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", json_maximumresults, json_maximumresults_at_type_hint, enable_html, enable_html_at_type_hint, enable_txt, enable_txt_at_type_hint, enable_xml, enable_xml_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_apache_sling_referrer_filter(
        &self,
        allow_empty: Option<bool>,
        allow_empty_at_type_hint: Option<String>,
        allow_hosts: Option<String>,
        allow_hosts_at_type_hint: Option<String>,
        allow_hosts_regexp: Option<String>,
        allow_hosts_regexp_at_type_hint: Option<String>,
        filter_methods: Option<String>,
        filter_methods_at_type_hint: Option<String>,
        context: &C) -> Result<PostConfigApacheSlingReferrerFilterResponse, ApiError>
    {
        info!("post_config_apache_sling_referrer_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", allow_empty, allow_empty_at_type_hint, allow_hosts, allow_hosts_at_type_hint, allow_hosts_regexp, allow_hosts_regexp_at_type_hint, filter_methods, filter_methods_at_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_query(
        &self,
        path: String,
        p_limit: f64,
        param_1_property: String,
        param_1_property_value: String,
        context: &C) -> Result<PostQueryResponse, ApiError>
    {
        info!("post_query(\"{}\", {}, \"{}\", \"{}\") - X-Span-ID: {:?}", path, p_limit, param_1_property, param_1_property_value, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_tree_activation(
        &self,
        ignoredeactivated: bool,
        onlymodified: bool,
        path: String,
        cmd: String,
        context: &C) -> Result<PostTreeActivationResponse, ApiError>
    {
        info!("post_tree_activation({}, {}, \"{}\", \"{}\") - X-Span-ID: {:?}", ignoredeactivated, onlymodified, path, cmd, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_truststore(
        &self,
        colon_operation: Option<String>,
        new_password: Option<String>,
        re_password: Option<String>,
        key_store_type: Option<String>,
        remove_alias: Option<String>,
        certificate: Option<swagger::ByteArray>,
        context: &C) -> Result<PostTruststoreResponse, ApiError>
    {
        info!("post_truststore({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", colon_operation, new_password, re_password, key_store_type, remove_alias, certificate, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_truststore_pkcs12(
        &self,
        truststore_p12: Option<swagger::ByteArray>,
        context: &C) -> Result<PostTruststorePkcs12Response, ApiError>
    {
        info!("post_truststore_pkcs12({:?}) - X-Span-ID: {:?}", truststore_p12, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_agents(
        &self,
        runmode: String,
        context: &C) -> Result<GetAgentsResponse, ApiError>
    {
        info!("get_agents(\"{}\") - X-Span-ID: {:?}", runmode, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_config_property(
        &self,
        config_node_name: String,
        context: &C) -> Result<PostConfigPropertyResponse, ApiError>
    {
        info!("post_config_property(\"{}\") - X-Span-ID: {:?}", config_node_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_path(
        &self,
        path: String,
        jcr_colon_primary_type: String,
        colon_name: String,
        context: &C) -> Result<PostPathResponse, ApiError>
    {
        info!("post_path(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", path, jcr_colon_primary_type, colon_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn delete_agent(
        &self,
        runmode: String,
        name: String,
        context: &C) -> Result<DeleteAgentResponse, ApiError>
    {
        info!("delete_agent(\"{}\", \"{}\") - X-Span-ID: {:?}", runmode, name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn delete_node(
        &self,
        path: String,
        name: String,
        context: &C) -> Result<DeleteNodeResponse, ApiError>
    {
        info!("delete_node(\"{}\", \"{}\") - X-Span-ID: {:?}", path, name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_agent(
        &self,
        runmode: String,
        name: String,
        context: &C) -> Result<GetAgentResponse, ApiError>
    {
        info!("get_agent(\"{}\", \"{}\") - X-Span-ID: {:?}", runmode, name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_authorizable_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        context: &C) -> Result<GetAuthorizableKeystoreResponse, ApiError>
    {
        info!("get_authorizable_keystore(\"{}\", \"{}\") - X-Span-ID: {:?}", intermediate_path, authorizable_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_keystore(
        &self,
        intermediate_path: String,
        authorizable_id: String,
        context: &C) -> Result<GetKeystoreResponse, ApiError>
    {
        info!("get_keystore(\"{}\", \"{}\") - X-Span-ID: {:?}", intermediate_path, authorizable_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_node(
        &self,
        path: String,
        name: String,
        context: &C) -> Result<GetNodeResponse, ApiError>
    {
        info!("get_node(\"{}\", \"{}\") - X-Span-ID: {:?}", path, name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_agent(
        &self,
        runmode: String,
        name: String,
        jcr_colon_content_slash_cq_colon_distribute: Option<bool>,
        jcr_colon_content_slash_cq_colon_distribute_at_type_hint: Option<String>,
        jcr_colon_content_slash_cq_colon_name: Option<String>,
        jcr_colon_content_slash_cq_colon_template: Option<String>,
        jcr_colon_content_slash_alias_update: Option<bool>,
        jcr_colon_content_slash_enabled: Option<bool>,
        jcr_colon_content_slash_jcr_colon_description: Option<String>,
        jcr_colon_content_slash_jcr_colon_last_modified: Option<String>,
        jcr_colon_content_slash_jcr_colon_last_modified_by: Option<String>,
        jcr_colon_content_slash_jcr_colon_mixin_types: Option<String>,
        jcr_colon_content_slash_jcr_colon_title: Option<String>,
        jcr_colon_content_slash_log_level: Option<String>,
        jcr_colon_content_slash_no_status_update: Option<bool>,
        jcr_colon_content_slash_no_versioning: Option<bool>,
        jcr_colon_content_slash_protocol_connect_timeout: Option<f64>,
        jcr_colon_content_slash_protocol_http_connection_closed: Option<bool>,
        jcr_colon_content_slash_protocol_http_expired: Option<String>,
        jcr_colon_content_slash_protocol_http_headers: Option<&Vec<String>>,
        jcr_colon_content_slash_protocol_http_headers_at_type_hint: Option<String>,
        jcr_colon_content_slash_protocol_http_method: Option<String>,
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
        jcr_colon_content_slash_reverse_replication: Option<bool>,
        jcr_colon_content_slash_serialization_type: Option<String>,
        jcr_colon_content_slash_sling_colon_resource_type: Option<String>,
        jcr_colon_content_slash_ssl: Option<String>,
        jcr_colon_content_slash_transport_ntlm_domain: Option<String>,
        jcr_colon_content_slash_transport_ntlm_host: Option<String>,
        jcr_colon_content_slash_transport_password: Option<String>,
        jcr_colon_content_slash_transport_uri: Option<String>,
        jcr_colon_content_slash_transport_user: Option<String>,
        jcr_colon_content_slash_trigger_distribute: Option<bool>,
        jcr_colon_content_slash_trigger_modified: Option<bool>,
        jcr_colon_content_slash_trigger_on_off_time: Option<bool>,
        jcr_colon_content_slash_trigger_receive: Option<bool>,
        jcr_colon_content_slash_trigger_specific: Option<bool>,
        jcr_colon_content_slash_user_id: Option<String>,
        jcr_colon_primary_type: Option<String>,
        colon_operation: Option<String>,
        context: &C) -> Result<PostAgentResponse, ApiError>
    {
        info!("post_agent(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", runmode, name, jcr_colon_content_slash_cq_colon_distribute, jcr_colon_content_slash_cq_colon_distribute_at_type_hint, jcr_colon_content_slash_cq_colon_name, jcr_colon_content_slash_cq_colon_template, jcr_colon_content_slash_alias_update, jcr_colon_content_slash_enabled, jcr_colon_content_slash_jcr_colon_description, jcr_colon_content_slash_jcr_colon_last_modified, jcr_colon_content_slash_jcr_colon_last_modified_by, jcr_colon_content_slash_jcr_colon_mixin_types, jcr_colon_content_slash_jcr_colon_title, jcr_colon_content_slash_log_level, jcr_colon_content_slash_no_status_update, jcr_colon_content_slash_no_versioning, jcr_colon_content_slash_protocol_connect_timeout, jcr_colon_content_slash_protocol_http_connection_closed, jcr_colon_content_slash_protocol_http_expired, jcr_colon_content_slash_protocol_http_headers, jcr_colon_content_slash_protocol_http_headers_at_type_hint, jcr_colon_content_slash_protocol_http_method, jcr_colon_content_slash_protocol_https_relaxed, jcr_colon_content_slash_protocol_interface, jcr_colon_content_slash_protocol_socket_timeout, jcr_colon_content_slash_protocol_version, jcr_colon_content_slash_proxy_ntlm_domain, jcr_colon_content_slash_proxy_ntlm_host, jcr_colon_content_slash_proxy_host, jcr_colon_content_slash_proxy_password, jcr_colon_content_slash_proxy_port, jcr_colon_content_slash_proxy_user, jcr_colon_content_slash_queue_batch_max_size, jcr_colon_content_slash_queue_batch_mode, jcr_colon_content_slash_queue_batch_wait_time, jcr_colon_content_slash_retry_delay, jcr_colon_content_slash_reverse_replication, jcr_colon_content_slash_serialization_type, jcr_colon_content_slash_sling_colon_resource_type, jcr_colon_content_slash_ssl, jcr_colon_content_slash_transport_ntlm_domain, jcr_colon_content_slash_transport_ntlm_host, jcr_colon_content_slash_transport_password, jcr_colon_content_slash_transport_uri, jcr_colon_content_slash_transport_user, jcr_colon_content_slash_trigger_distribute, jcr_colon_content_slash_trigger_modified, jcr_colon_content_slash_trigger_on_off_time, jcr_colon_content_slash_trigger_receive, jcr_colon_content_slash_trigger_specific, jcr_colon_content_slash_user_id, jcr_colon_primary_type, colon_operation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_authorizable_keystore(
        &self,
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
        cert_chain: Option<swagger::ByteArray>,
        pk: Option<swagger::ByteArray>,
        key_store: Option<swagger::ByteArray>,
        context: &C) -> Result<PostAuthorizableKeystoreResponse, ApiError>
    {
        info!("post_authorizable_keystore(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", intermediate_path, authorizable_id, colon_operation, current_password, new_password, re_password, key_password, key_store_pass, alias, new_alias, remove_alias, cert_chain, pk, key_store, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_node(
        &self,
        path: String,
        name: String,
        colon_operation: Option<String>,
        delete_authorizable: Option<String>,
        file: Option<swagger::ByteArray>,
        context: &C) -> Result<PostNodeResponse, ApiError>
    {
        info!("post_node(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", path, name, colon_operation, delete_authorizable, file, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn post_node_rw(
        &self,
        path: String,
        name: String,
        add_members: Option<String>,
        context: &C) -> Result<PostNodeRwResponse, ApiError>
    {
        info!("post_node_rw(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", path, name, add_members, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_package(
        &self,
        group: String,
        name: String,
        version: String,
        context: &C) -> Result<GetPackageResponse, ApiError>
    {
        info!("get_package(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", group, name, version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn get_package_filter(
        &self,
        group: String,
        name: String,
        version: String,
        context: &C) -> Result<GetPackageFilterResponse, ApiError>
    {
        info!("get_package_filter(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", group, name, version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
