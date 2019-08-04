//! Server implementation of swagger_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;

use swagger;
use swagger::{Has, XSpanIdString};

use swagger_client::{Api, ApiError,
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
use swagger_client::models;

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{


    fn get_aem_product_info(&self, context: &C) -> Box<Future<Item=GetAemProductInfoResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_aem_product_info() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_config_mgr(&self, context: &C) -> Box<Future<Item=GetConfigMgrResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_config_mgr() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_bundle(&self, name: String, action: String, context: &C) -> Box<Future<Item=PostBundleResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_bundle(\"{}\", \"{}\") - X-Span-ID: {:?}", name, action, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_jmx_repository(&self, action: String, context: &C) -> Box<Future<Item=PostJmxRepositoryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_jmx_repository(\"{}\") - X-Span-ID: {:?}", action, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_saml_configuration(&self, post: Option<bool>, apply: Option<bool>, delete: Option<bool>, action: Option<String>, location: Option<String>, path: Option<&Vec<String>>, service_ranking: Option<i32>, idp_url: Option<String>, idp_cert_alias: Option<String>, idp_http_redirect: Option<bool>, service_provider_entity_id: Option<String>, assertion_consumer_service_url: Option<String>, sp_private_key_alias: Option<String>, key_store_password: Option<String>, default_redirect_url: Option<String>, user_id_attribute: Option<String>, use_encryption: Option<bool>, create_user: Option<bool>, add_group_memberships: Option<bool>, group_membership_attribute: Option<String>, default_groups: Option<&Vec<String>>, name_id_format: Option<String>, synchronize_attributes: Option<&Vec<String>>, handle_logout: Option<bool>, logout_url: Option<String>, clock_tolerance: Option<i32>, digest_method: Option<String>, signature_method: Option<String>, user_intermediate_path: Option<String>, propertylist: Option<&Vec<String>>, context: &C) -> Box<Future<Item=PostSamlConfigurationResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_saml_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, location, path, service_ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path, propertylist, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_login_page(&self, context: &C) -> Box<Future<Item=GetLoginPageResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_login_page() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_cq_actions(&self, authorizable_id: String, changelog: String, context: &C) -> Box<Future<Item=PostCqActionsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_cq_actions(\"{}\", \"{}\") - X-Span-ID: {:?}", authorizable_id, changelog, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_crxde_status(&self, context: &C) -> Box<Future<Item=GetCrxdeStatusResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_crxde_status() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_install_status(&self, context: &C) -> Box<Future<Item=GetInstallStatusResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_install_status() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_package_manager_servlet(&self, context: &C) -> Box<Future<Item=GetPackageManagerServletResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_package_manager_servlet() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_package_service(&self, cmd: String, context: &C) -> Box<Future<Item=PostPackageServiceResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_package_service(\"{}\") - X-Span-ID: {:?}", cmd, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_package_service_json(&self, path: String, cmd: String, group_name: Option<String>, package_name: Option<String>, package_version: Option<String>, _charset_: Option<String>, force: Option<bool>, recursive: Option<bool>, package: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostPackageServiceJsonResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_package_service_json(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", path, cmd, group_name, package_name, package_version, _charset_, force, recursive, package, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_package_update(&self, group_name: String, package_name: String, version: String, path: String, filter: Option<String>, _charset_: Option<String>, context: &C) -> Box<Future<Item=PostPackageUpdateResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_package_update(\"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", group_name, package_name, version, path, filter, _charset_, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_set_password(&self, old: String, plain: String, verify: String, context: &C) -> Box<Future<Item=PostSetPasswordResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_set_password(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", old, plain, verify, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_aem_health_check(&self, tags: Option<String>, combine_tags_or: Option<bool>, context: &C) -> Box<Future<Item=GetAemHealthCheckResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_aem_health_check({:?}, {:?}) - X-Span-ID: {:?}", tags, combine_tags_or, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_aem_health_check_servlet(&self, bundles_ignored: Option<&Vec<String>>, bundles_ignored_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigAemHealthCheckServletResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_aem_health_check_servlet({:?}, {:?}) - X-Span-ID: {:?}", bundles_ignored, bundles_ignored_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_aem_password_reset(&self, pwdreset_authorizables: Option<&Vec<String>>, pwdreset_authorizables_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigAemPasswordResetResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_aem_password_reset({:?}, {:?}) - X-Span-ID: {:?}", pwdreset_authorizables, pwdreset_authorizables_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn delete_agent(&self, runmode: String, name: String, context: &C) -> Box<Future<Item=DeleteAgentResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_agent(\"{}\", \"{}\") - X-Span-ID: {:?}", runmode, name, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn delete_node(&self, path: String, name: String, context: &C) -> Box<Future<Item=DeleteNodeResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_node(\"{}\", \"{}\") - X-Span-ID: {:?}", path, name, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_agent(&self, runmode: String, name: String, context: &C) -> Box<Future<Item=GetAgentResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_agent(\"{}\", \"{}\") - X-Span-ID: {:?}", runmode, name, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_agents(&self, runmode: String, context: &C) -> Box<Future<Item=GetAgentsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_agents(\"{}\") - X-Span-ID: {:?}", runmode, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_authorizable_keystore(&self, intermediate_path: String, authorizable_id: String, context: &C) -> Box<Future<Item=GetAuthorizableKeystoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_authorizable_keystore(\"{}\", \"{}\") - X-Span-ID: {:?}", intermediate_path, authorizable_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_keystore(&self, intermediate_path: String, authorizable_id: String, context: &C) -> Box<Future<Item=GetKeystoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_keystore(\"{}\", \"{}\") - X-Span-ID: {:?}", intermediate_path, authorizable_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_node(&self, path: String, name: String, context: &C) -> Box<Future<Item=GetNodeResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_node(\"{}\", \"{}\") - X-Span-ID: {:?}", path, name, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_package(&self, group: String, name: String, version: String, context: &C) -> Box<Future<Item=GetPackageResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_package(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", group, name, version, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_package_filter(&self, group: String, name: String, version: String, context: &C) -> Box<Future<Item=GetPackageFilterResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_package_filter(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", group, name, version, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_query(&self, path: String, p_limit: f64, _1_property: String, _1_property_value: String, context: &C) -> Box<Future<Item=GetQueryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_query(\"{}\", {}, \"{}\", \"{}\") - X-Span-ID: {:?}", path, p_limit, _1_property, _1_property_value, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_truststore(&self, context: &C) -> Box<Future<Item=GetTruststoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_truststore() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn get_truststore_info(&self, context: &C) -> Box<Future<Item=GetTruststoreInfoResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_truststore_info() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_agent(&self, runmode: String, name: String, jcrcontentcqdistribute: Option<bool>, jcrcontentcqdistribute_type_hint: Option<String>, jcrcontentcqname: Option<String>, jcrcontentcqtemplate: Option<String>, jcrcontentenabled: Option<bool>, jcrcontentjcrdescription: Option<String>, jcrcontentjcrlast_modified: Option<String>, jcrcontentjcrlast_modified_by: Option<String>, jcrcontentjcrmixin_types: Option<String>, jcrcontentjcrtitle: Option<String>, jcrcontentlog_level: Option<String>, jcrcontentno_status_update: Option<bool>, jcrcontentno_versioning: Option<bool>, jcrcontentprotocol_connect_timeout: Option<f64>, jcrcontentprotocol_http_connection_closed: Option<bool>, jcrcontentprotocol_http_expired: Option<String>, jcrcontentprotocol_http_headers: Option<&Vec<String>>, jcrcontentprotocol_http_headers_type_hint: Option<String>, jcrcontentprotocol_http_method: Option<String>, jcrcontentprotocol_https_relaxed: Option<bool>, jcrcontentprotocol_interface: Option<String>, jcrcontentprotocol_socket_timeout: Option<f64>, jcrcontentprotocol_version: Option<String>, jcrcontentproxy_ntlm_domain: Option<String>, jcrcontentproxy_ntlm_host: Option<String>, jcrcontentproxy_host: Option<String>, jcrcontentproxy_password: Option<String>, jcrcontentproxy_port: Option<f64>, jcrcontentproxy_user: Option<String>, jcrcontentqueue_batch_max_size: Option<f64>, jcrcontentqueue_batch_mode: Option<String>, jcrcontentqueue_batch_wait_time: Option<f64>, jcrcontentretry_delay: Option<String>, jcrcontentreverse_replication: Option<bool>, jcrcontentserialization_type: Option<String>, jcrcontentslingresource_type: Option<String>, jcrcontentssl: Option<String>, jcrcontenttransport_ntlm_domain: Option<String>, jcrcontenttransport_ntlm_host: Option<String>, jcrcontenttransport_password: Option<String>, jcrcontenttransport_uri: Option<String>, jcrcontenttransport_user: Option<String>, jcrcontenttrigger_distribute: Option<bool>, jcrcontenttrigger_modified: Option<bool>, jcrcontenttrigger_on_off_time: Option<bool>, jcrcontenttrigger_receive: Option<bool>, jcrcontenttrigger_specific: Option<bool>, jcrcontentuser_id: Option<String>, jcrprimary_type: Option<String>, operation: Option<String>, context: &C) -> Box<Future<Item=PostAgentResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_agent(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", runmode, name, jcrcontentcqdistribute, jcrcontentcqdistribute_type_hint, jcrcontentcqname, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentjcrdescription, jcrcontentjcrlast_modified, jcrcontentjcrlast_modified_by, jcrcontentjcrmixin_types, jcrcontentjcrtitle, jcrcontentlog_level, jcrcontentno_status_update, jcrcontentno_versioning, jcrcontentprotocol_connect_timeout, jcrcontentprotocol_http_connection_closed, jcrcontentprotocol_http_expired, jcrcontentprotocol_http_headers, jcrcontentprotocol_http_headers_type_hint, jcrcontentprotocol_http_method, jcrcontentprotocol_https_relaxed, jcrcontentprotocol_interface, jcrcontentprotocol_socket_timeout, jcrcontentprotocol_version, jcrcontentproxy_ntlm_domain, jcrcontentproxy_ntlm_host, jcrcontentproxy_host, jcrcontentproxy_password, jcrcontentproxy_port, jcrcontentproxy_user, jcrcontentqueue_batch_max_size, jcrcontentqueue_batch_mode, jcrcontentqueue_batch_wait_time, jcrcontentretry_delay, jcrcontentreverse_replication, jcrcontentserialization_type, jcrcontentslingresource_type, jcrcontentssl, jcrcontenttransport_ntlm_domain, jcrcontenttransport_ntlm_host, jcrcontenttransport_password, jcrcontenttransport_uri, jcrcontenttransport_user, jcrcontenttrigger_distribute, jcrcontenttrigger_modified, jcrcontenttrigger_on_off_time, jcrcontenttrigger_receive, jcrcontenttrigger_specific, jcrcontentuser_id, jcrprimary_type, operation, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_authorizable_keystore(&self, intermediate_path: String, authorizable_id: String, operation: Option<String>, current_password: Option<String>, new_password: Option<String>, re_password: Option<String>, key_password: Option<String>, key_store_pass: Option<String>, alias: Option<String>, new_alias: Option<String>, remove_alias: Option<String>, cert_chain: Option<swagger::ByteArray>, pk: Option<swagger::ByteArray>, key_store: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostAuthorizableKeystoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_authorizable_keystore(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", intermediate_path, authorizable_id, operation, current_password, new_password, re_password, key_password, key_store_pass, alias, new_alias, remove_alias, cert_chain, pk, key_store, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_authorizables(&self, authorizable_id: String, intermediate_path: String, create_user: Option<String>, create_group: Option<String>, reppassword: Option<String>, profilegiven_name: Option<String>, context: &C) -> Box<Future<Item=PostAuthorizablesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_authorizables(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", authorizable_id, intermediate_path, create_user, create_group, reppassword, profilegiven_name, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_adobe_granite_saml_authentication_handler(&self, key_store_password: Option<String>, key_store_password_type_hint: Option<String>, service_ranking: Option<i32>, service_ranking_type_hint: Option<String>, idp_http_redirect: Option<bool>, idp_http_redirect_type_hint: Option<String>, create_user: Option<bool>, create_user_type_hint: Option<String>, default_redirect_url: Option<String>, default_redirect_url_type_hint: Option<String>, user_id_attribute: Option<String>, user_id_attribute_type_hint: Option<String>, default_groups: Option<&Vec<String>>, default_groups_type_hint: Option<String>, idp_cert_alias: Option<String>, idp_cert_alias_type_hint: Option<String>, add_group_memberships: Option<bool>, add_group_memberships_type_hint: Option<String>, path: Option<&Vec<String>>, path_type_hint: Option<String>, synchronize_attributes: Option<&Vec<String>>, synchronize_attributes_type_hint: Option<String>, clock_tolerance: Option<i32>, clock_tolerance_type_hint: Option<String>, group_membership_attribute: Option<String>, group_membership_attribute_type_hint: Option<String>, idp_url: Option<String>, idp_url_type_hint: Option<String>, logout_url: Option<String>, logout_url_type_hint: Option<String>, service_provider_entity_id: Option<String>, service_provider_entity_id_type_hint: Option<String>, assertion_consumer_service_url: Option<String>, assertion_consumer_service_url_type_hint: Option<String>, handle_logout: Option<bool>, handle_logout_type_hint: Option<String>, sp_private_key_alias: Option<String>, sp_private_key_alias_type_hint: Option<String>, use_encryption: Option<bool>, use_encryption_type_hint: Option<String>, name_id_format: Option<String>, name_id_format_type_hint: Option<String>, digest_method: Option<String>, digest_method_type_hint: Option<String>, signature_method: Option<String>, signature_method_type_hint: Option<String>, user_intermediate_path: Option<String>, user_intermediate_path_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigAdobeGraniteSamlAuthenticationHandlerResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_adobe_granite_saml_authentication_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", key_store_password, key_store_password_type_hint, service_ranking, service_ranking_type_hint, idp_http_redirect, idp_http_redirect_type_hint, create_user, create_user_type_hint, default_redirect_url, default_redirect_url_type_hint, user_id_attribute, user_id_attribute_type_hint, default_groups, default_groups_type_hint, idp_cert_alias, idp_cert_alias_type_hint, add_group_memberships, add_group_memberships_type_hint, path, path_type_hint, synchronize_attributes, synchronize_attributes_type_hint, clock_tolerance, clock_tolerance_type_hint, group_membership_attribute, group_membership_attribute_type_hint, idp_url, idp_url_type_hint, logout_url, logout_url_type_hint, service_provider_entity_id, service_provider_entity_id_type_hint, assertion_consumer_service_url, assertion_consumer_service_url_type_hint, handle_logout, handle_logout_type_hint, sp_private_key_alias, sp_private_key_alias_type_hint, use_encryption, use_encryption_type_hint, name_id_format, name_id_format_type_hint, digest_method, digest_method_type_hint, signature_method, signature_method_type_hint, user_intermediate_path, user_intermediate_path_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_apache_felix_jetty_based_http_service(&self, org_apache_felix_https_nio: Option<bool>, org_apache_felix_https_nio_type_hint: Option<String>, org_apache_felix_https_keystore: Option<String>, org_apache_felix_https_keystore_type_hint: Option<String>, org_apache_felix_https_keystore_password: Option<String>, org_apache_felix_https_keystore_password_type_hint: Option<String>, org_apache_felix_https_keystore_key: Option<String>, org_apache_felix_https_keystore_key_type_hint: Option<String>, org_apache_felix_https_keystore_key_password: Option<String>, org_apache_felix_https_keystore_key_password_type_hint: Option<String>, org_apache_felix_https_truststore: Option<String>, org_apache_felix_https_truststore_type_hint: Option<String>, org_apache_felix_https_truststore_password: Option<String>, org_apache_felix_https_truststore_password_type_hint: Option<String>, org_apache_felix_https_clientcertificate: Option<String>, org_apache_felix_https_clientcertificate_type_hint: Option<String>, org_apache_felix_https_enable: Option<bool>, org_apache_felix_https_enable_type_hint: Option<String>, org_osgi_service_http_port_secure: Option<String>, org_osgi_service_http_port_secure_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheFelixJettyBasedHttpServiceResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_apache_felix_jetty_based_http_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_apache_http_components_proxy_configuration(&self, proxy_host: Option<String>, proxy_host_type_hint: Option<String>, proxy_port: Option<i32>, proxy_port_type_hint: Option<String>, proxy_exceptions: Option<&Vec<String>>, proxy_exceptions_type_hint: Option<String>, proxy_enabled: Option<bool>, proxy_enabled_type_hint: Option<String>, proxy_user: Option<String>, proxy_user_type_hint: Option<String>, proxy_password: Option<String>, proxy_password_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheHttpComponentsProxyConfigurationResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_apache_http_components_proxy_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", proxy_host, proxy_host_type_hint, proxy_port, proxy_port_type_hint, proxy_exceptions, proxy_exceptions_type_hint, proxy_enabled, proxy_enabled_type_hint, proxy_user, proxy_user_type_hint, proxy_password, proxy_password_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_apache_sling_dav_ex_servlet(&self, alias: Option<String>, alias_type_hint: Option<String>, dav_create_absolute_uri: Option<bool>, dav_create_absolute_uri_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheSlingDavExServletResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_apache_sling_dav_ex_servlet({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", alias, alias_type_hint, dav_create_absolute_uri, dav_create_absolute_uri_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_apache_sling_get_servlet(&self, json_maximumresults: Option<String>, json_maximumresults_type_hint: Option<String>, enable_html: Option<bool>, enable_html_type_hint: Option<String>, enable_txt: Option<bool>, enable_txt_type_hint: Option<String>, enable_xml: Option<bool>, enable_xml_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheSlingGetServletResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_apache_sling_get_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", json_maximumresults, json_maximumresults_type_hint, enable_html, enable_html_type_hint, enable_txt, enable_txt_type_hint, enable_xml, enable_xml_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_config_apache_sling_referrer_filter(&self, allow_empty: Option<bool>, allow_empty_type_hint: Option<String>, allow_hosts: Option<String>, allow_hosts_type_hint: Option<String>, allow_hosts_regexp: Option<String>, allow_hosts_regexp_type_hint: Option<String>, filter_methods: Option<String>, filter_methods_type_hint: Option<String>, context: &C) -> Box<Future<Item=PostConfigApacheSlingReferrerFilterResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_config_apache_sling_referrer_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", allow_empty, allow_empty_type_hint, allow_hosts, allow_hosts_type_hint, allow_hosts_regexp, allow_hosts_regexp_type_hint, filter_methods, filter_methods_type_hint, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_node(&self, path: String, name: String, operation: Option<String>, delete_authorizable: Option<String>, file: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostNodeResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_node(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", path, name, operation, delete_authorizable, file, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_node_rw(&self, path: String, name: String, add_members: Option<String>, context: &C) -> Box<Future<Item=PostNodeRwResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_node_rw(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", path, name, add_members, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_path(&self, path: String, jcrprimary_type: String, name: String, context: &C) -> Box<Future<Item=PostPathResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_path(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", path, jcrprimary_type, name, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_query(&self, path: String, p_limit: f64, _1_property: String, _1_property_value: String, context: &C) -> Box<Future<Item=PostQueryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_query(\"{}\", {}, \"{}\", \"{}\") - X-Span-ID: {:?}", path, p_limit, _1_property, _1_property_value, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_tree_activation(&self, ignoredeactivated: bool, onlymodified: bool, path: String, context: &C) -> Box<Future<Item=PostTreeActivationResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_tree_activation({}, {}, \"{}\") - X-Span-ID: {:?}", ignoredeactivated, onlymodified, path, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_truststore(&self, operation: Option<String>, new_password: Option<String>, re_password: Option<String>, key_store_type: Option<String>, remove_alias: Option<String>, certificate: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostTruststoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("post_truststore({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", operation, new_password, re_password, key_store_type, remove_alias, certificate, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }


    fn post_truststore_pkcs12(&self, truststore_p12: Option<swagger::ByteArray>, context: &C) -> Box<Future<Item=PostTruststorePKCS12Response, Error=ApiError>> {
        let context = context.clone();
        println!("post_truststore_pkcs12({:?}) - X-Span-ID: {:?}", truststore_p12, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
