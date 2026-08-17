from typing import List, Dict
from aiohttp import web

from openapi_server.models.keystore_info import KeystoreInfo
from openapi_server.models.truststore_info import TruststoreInfo
from openapi_server import util


async def delete_agent(request: web.Request, runmode, name) -> web.Response:
    """delete_agent

    

    :param runmode: 
    :type runmode: str
    :param name: 
    :type name: str

    """
    return web.Response(status=200)


async def delete_node(request: web.Request, path, name) -> web.Response:
    """delete_node

    

    :param path: 
    :type path: str
    :param name: 
    :type name: str

    """
    return web.Response(status=200)


async def get_agent(request: web.Request, runmode, name) -> web.Response:
    """get_agent

    

    :param runmode: 
    :type runmode: str
    :param name: 
    :type name: str

    """
    return web.Response(status=200)


async def get_agents(request: web.Request, runmode) -> web.Response:
    """get_agents

    

    :param runmode: 
    :type runmode: str

    """
    return web.Response(status=200)


async def get_authorizable_keystore(request: web.Request, intermediate_path, authorizable_id) -> web.Response:
    """get_authorizable_keystore

    

    :param intermediate_path: 
    :type intermediate_path: str
    :param authorizable_id: 
    :type authorizable_id: str

    """
    return web.Response(status=200)


async def get_keystore(request: web.Request, intermediate_path, authorizable_id) -> web.Response:
    """get_keystore

    

    :param intermediate_path: 
    :type intermediate_path: str
    :param authorizable_id: 
    :type authorizable_id: str

    """
    return web.Response(status=200)


async def get_node(request: web.Request, path, name) -> web.Response:
    """get_node

    

    :param path: 
    :type path: str
    :param name: 
    :type name: str

    """
    return web.Response(status=200)


async def get_package(request: web.Request, group, name, version) -> web.Response:
    """get_package

    

    :param group: 
    :type group: str
    :param name: 
    :type name: str
    :param version: 
    :type version: str

    """
    return web.Response(status=200)


async def get_package_filter(request: web.Request, group, name, version) -> web.Response:
    """get_package_filter

    

    :param group: 
    :type group: str
    :param name: 
    :type name: str
    :param version: 
    :type version: str

    """
    return web.Response(status=200)


async def get_query(request: web.Request, path, p_limit, _1_property, _1_property_value) -> web.Response:
    """get_query

    

    :param path: 
    :type path: str
    :param p_limit: 
    :type p_limit: 
    :param _1_property: 
    :type _1_property: str
    :param _1_property_value: 
    :type _1_property_value: str

    """
    return web.Response(status=200)


async def get_truststore(request: web.Request, ) -> web.Response:
    """get_truststore

    


    """
    return web.Response(status=200)


async def get_truststore_info(request: web.Request, ) -> web.Response:
    """get_truststore_info

    


    """
    return web.Response(status=200)


async def post_agent(request: web.Request, runmode, name, jcr_content_cq_distribute=None, jcr_content_cq_distribute_type_hint=None, jcr_content_cq_name=None, jcr_content_cq_template=None, jcr_content_alias_update=None, jcr_content_enabled=None, jcr_content_jcr_description=None, jcr_content_jcr_last_modified=None, jcr_content_jcr_last_modified_by=None, jcr_content_jcr_mixin_types=None, jcr_content_jcr_title=None, jcr_content_log_level=None, jcr_content_no_status_update=None, jcr_content_no_versioning=None, jcr_content_protocol_connect_timeout=None, jcr_content_protocol_http_connection_closed=None, jcr_content_protocol_http_expired=None, jcr_content_protocol_http_headers=None, jcr_content_protocol_http_headers_type_hint=None, jcr_content_protocol_http_method=None, jcr_content_protocol_https_relaxed=None, jcr_content_protocol_interface=None, jcr_content_protocol_socket_timeout=None, jcr_content_protocol_version=None, jcr_content_proxy_ntlm_domain=None, jcr_content_proxy_ntlm_host=None, jcr_content_proxy_host=None, jcr_content_proxy_password=None, jcr_content_proxy_port=None, jcr_content_proxy_user=None, jcr_content_queue_batch_max_size=None, jcr_content_queue_batch_mode=None, jcr_content_queue_batch_wait_time=None, jcr_content_retry_delay=None, jcr_content_reverse_replication=None, jcr_content_serialization_type=None, jcr_content_sling_resource_type=None, jcr_content_ssl=None, jcr_content_transport_ntlm_domain=None, jcr_content_transport_ntlm_host=None, jcr_content_transport_password=None, jcr_content_transport_uri=None, jcr_content_transport_user=None, jcr_content_trigger_distribute=None, jcr_content_trigger_modified=None, jcr_content_trigger_on_off_time=None, jcr_content_trigger_receive=None, jcr_content_trigger_specific=None, jcr_content_user_id=None, jcr_primary_type=None, operation=None) -> web.Response:
    """post_agent

    

    :param runmode: 
    :type runmode: str
    :param name: 
    :type name: str
    :param jcr_content_cq_distribute: 
    :type jcr_content_cq_distribute: bool
    :param jcr_content_cq_distribute_type_hint: 
    :type jcr_content_cq_distribute_type_hint: str
    :param jcr_content_cq_name: 
    :type jcr_content_cq_name: str
    :param jcr_content_cq_template: 
    :type jcr_content_cq_template: str
    :param jcr_content_alias_update: 
    :type jcr_content_alias_update: bool
    :param jcr_content_enabled: 
    :type jcr_content_enabled: bool
    :param jcr_content_jcr_description: 
    :type jcr_content_jcr_description: str
    :param jcr_content_jcr_last_modified: 
    :type jcr_content_jcr_last_modified: str
    :param jcr_content_jcr_last_modified_by: 
    :type jcr_content_jcr_last_modified_by: str
    :param jcr_content_jcr_mixin_types: 
    :type jcr_content_jcr_mixin_types: str
    :param jcr_content_jcr_title: 
    :type jcr_content_jcr_title: str
    :param jcr_content_log_level: 
    :type jcr_content_log_level: str
    :param jcr_content_no_status_update: 
    :type jcr_content_no_status_update: bool
    :param jcr_content_no_versioning: 
    :type jcr_content_no_versioning: bool
    :param jcr_content_protocol_connect_timeout: 
    :type jcr_content_protocol_connect_timeout: 
    :param jcr_content_protocol_http_connection_closed: 
    :type jcr_content_protocol_http_connection_closed: bool
    :param jcr_content_protocol_http_expired: 
    :type jcr_content_protocol_http_expired: str
    :param jcr_content_protocol_http_headers: 
    :type jcr_content_protocol_http_headers: List[str]
    :param jcr_content_protocol_http_headers_type_hint: 
    :type jcr_content_protocol_http_headers_type_hint: str
    :param jcr_content_protocol_http_method: 
    :type jcr_content_protocol_http_method: str
    :param jcr_content_protocol_https_relaxed: 
    :type jcr_content_protocol_https_relaxed: bool
    :param jcr_content_protocol_interface: 
    :type jcr_content_protocol_interface: str
    :param jcr_content_protocol_socket_timeout: 
    :type jcr_content_protocol_socket_timeout: 
    :param jcr_content_protocol_version: 
    :type jcr_content_protocol_version: str
    :param jcr_content_proxy_ntlm_domain: 
    :type jcr_content_proxy_ntlm_domain: str
    :param jcr_content_proxy_ntlm_host: 
    :type jcr_content_proxy_ntlm_host: str
    :param jcr_content_proxy_host: 
    :type jcr_content_proxy_host: str
    :param jcr_content_proxy_password: 
    :type jcr_content_proxy_password: str
    :param jcr_content_proxy_port: 
    :type jcr_content_proxy_port: 
    :param jcr_content_proxy_user: 
    :type jcr_content_proxy_user: str
    :param jcr_content_queue_batch_max_size: 
    :type jcr_content_queue_batch_max_size: 
    :param jcr_content_queue_batch_mode: 
    :type jcr_content_queue_batch_mode: str
    :param jcr_content_queue_batch_wait_time: 
    :type jcr_content_queue_batch_wait_time: 
    :param jcr_content_retry_delay: 
    :type jcr_content_retry_delay: str
    :param jcr_content_reverse_replication: 
    :type jcr_content_reverse_replication: bool
    :param jcr_content_serialization_type: 
    :type jcr_content_serialization_type: str
    :param jcr_content_sling_resource_type: 
    :type jcr_content_sling_resource_type: str
    :param jcr_content_ssl: 
    :type jcr_content_ssl: str
    :param jcr_content_transport_ntlm_domain: 
    :type jcr_content_transport_ntlm_domain: str
    :param jcr_content_transport_ntlm_host: 
    :type jcr_content_transport_ntlm_host: str
    :param jcr_content_transport_password: 
    :type jcr_content_transport_password: str
    :param jcr_content_transport_uri: 
    :type jcr_content_transport_uri: str
    :param jcr_content_transport_user: 
    :type jcr_content_transport_user: str
    :param jcr_content_trigger_distribute: 
    :type jcr_content_trigger_distribute: bool
    :param jcr_content_trigger_modified: 
    :type jcr_content_trigger_modified: bool
    :param jcr_content_trigger_on_off_time: 
    :type jcr_content_trigger_on_off_time: bool
    :param jcr_content_trigger_receive: 
    :type jcr_content_trigger_receive: bool
    :param jcr_content_trigger_specific: 
    :type jcr_content_trigger_specific: bool
    :param jcr_content_user_id: 
    :type jcr_content_user_id: str
    :param jcr_primary_type: 
    :type jcr_primary_type: str
    :param operation: 
    :type operation: str

    """
    return web.Response(status=200)


async def post_authorizable_keystore(request: web.Request, intermediate_path, authorizable_id, operation=None, current_password=None, new_password=None, re_password=None, key_password=None, key_store_pass=None, alias=None, new_alias=None, remove_alias=None, cert_chain=None, pk=None, key_store=None) -> web.Response:
    """post_authorizable_keystore

    

    :param intermediate_path: 
    :type intermediate_path: str
    :param authorizable_id: 
    :type authorizable_id: str
    :param operation: 
    :type operation: str
    :param current_password: 
    :type current_password: str
    :param new_password: 
    :type new_password: str
    :param re_password: 
    :type re_password: str
    :param key_password: 
    :type key_password: str
    :param key_store_pass: 
    :type key_store_pass: str
    :param alias: 
    :type alias: str
    :param new_alias: 
    :type new_alias: str
    :param remove_alias: 
    :type remove_alias: str
    :param cert_chain: 
    :type cert_chain: str
    :param pk: 
    :type pk: str
    :param key_store: 
    :type key_store: str

    """
    return web.Response(status=200)


async def post_authorizables(request: web.Request, authorizable_id, intermediate_path, create_user=None, create_group=None, rep_password=None, profile_given_name=None) -> web.Response:
    """post_authorizables

    

    :param authorizable_id: 
    :type authorizable_id: str
    :param intermediate_path: 
    :type intermediate_path: str
    :param create_user: 
    :type create_user: str
    :param create_group: 
    :type create_group: str
    :param rep_password: 
    :type rep_password: str
    :param profile_given_name: 
    :type profile_given_name: str

    """
    return web.Response(status=200)


async def post_config_adobe_granite_saml_authentication_handler(request: web.Request, key_store_password=None, key_store_password_type_hint=None, service_ranking=None, service_ranking_type_hint=None, idp_http_redirect=None, idp_http_redirect_type_hint=None, create_user=None, create_user_type_hint=None, default_redirect_url=None, default_redirect_url_type_hint=None, user_id_attribute=None, user_id_attribute_type_hint=None, default_groups=None, default_groups_type_hint=None, idp_cert_alias=None, idp_cert_alias_type_hint=None, add_group_memberships=None, add_group_memberships_type_hint=None, path=None, path_type_hint=None, synchronize_attributes=None, synchronize_attributes_type_hint=None, clock_tolerance=None, clock_tolerance_type_hint=None, group_membership_attribute=None, group_membership_attribute_type_hint=None, idp_url=None, idp_url_type_hint=None, logout_url=None, logout_url_type_hint=None, service_provider_entity_id=None, service_provider_entity_id_type_hint=None, assertion_consumer_service_url=None, assertion_consumer_service_url_type_hint=None, handle_logout=None, handle_logout_type_hint=None, sp_private_key_alias=None, sp_private_key_alias_type_hint=None, use_encryption=None, use_encryption_type_hint=None, name_id_format=None, name_id_format_type_hint=None, digest_method=None, digest_method_type_hint=None, signature_method=None, signature_method_type_hint=None, user_intermediate_path=None, user_intermediate_path_type_hint=None) -> web.Response:
    """post_config_adobe_granite_saml_authentication_handler

    

    :param key_store_password: 
    :type key_store_password: str
    :param key_store_password_type_hint: 
    :type key_store_password_type_hint: str
    :param service_ranking: 
    :type service_ranking: int
    :param service_ranking_type_hint: 
    :type service_ranking_type_hint: str
    :param idp_http_redirect: 
    :type idp_http_redirect: bool
    :param idp_http_redirect_type_hint: 
    :type idp_http_redirect_type_hint: str
    :param create_user: 
    :type create_user: bool
    :param create_user_type_hint: 
    :type create_user_type_hint: str
    :param default_redirect_url: 
    :type default_redirect_url: str
    :param default_redirect_url_type_hint: 
    :type default_redirect_url_type_hint: str
    :param user_id_attribute: 
    :type user_id_attribute: str
    :param user_id_attribute_type_hint: 
    :type user_id_attribute_type_hint: str
    :param default_groups: 
    :type default_groups: List[str]
    :param default_groups_type_hint: 
    :type default_groups_type_hint: str
    :param idp_cert_alias: 
    :type idp_cert_alias: str
    :param idp_cert_alias_type_hint: 
    :type idp_cert_alias_type_hint: str
    :param add_group_memberships: 
    :type add_group_memberships: bool
    :param add_group_memberships_type_hint: 
    :type add_group_memberships_type_hint: str
    :param path: 
    :type path: List[str]
    :param path_type_hint: 
    :type path_type_hint: str
    :param synchronize_attributes: 
    :type synchronize_attributes: List[str]
    :param synchronize_attributes_type_hint: 
    :type synchronize_attributes_type_hint: str
    :param clock_tolerance: 
    :type clock_tolerance: int
    :param clock_tolerance_type_hint: 
    :type clock_tolerance_type_hint: str
    :param group_membership_attribute: 
    :type group_membership_attribute: str
    :param group_membership_attribute_type_hint: 
    :type group_membership_attribute_type_hint: str
    :param idp_url: 
    :type idp_url: str
    :param idp_url_type_hint: 
    :type idp_url_type_hint: str
    :param logout_url: 
    :type logout_url: str
    :param logout_url_type_hint: 
    :type logout_url_type_hint: str
    :param service_provider_entity_id: 
    :type service_provider_entity_id: str
    :param service_provider_entity_id_type_hint: 
    :type service_provider_entity_id_type_hint: str
    :param assertion_consumer_service_url: 
    :type assertion_consumer_service_url: str
    :param assertion_consumer_service_url_type_hint: 
    :type assertion_consumer_service_url_type_hint: str
    :param handle_logout: 
    :type handle_logout: bool
    :param handle_logout_type_hint: 
    :type handle_logout_type_hint: str
    :param sp_private_key_alias: 
    :type sp_private_key_alias: str
    :param sp_private_key_alias_type_hint: 
    :type sp_private_key_alias_type_hint: str
    :param use_encryption: 
    :type use_encryption: bool
    :param use_encryption_type_hint: 
    :type use_encryption_type_hint: str
    :param name_id_format: 
    :type name_id_format: str
    :param name_id_format_type_hint: 
    :type name_id_format_type_hint: str
    :param digest_method: 
    :type digest_method: str
    :param digest_method_type_hint: 
    :type digest_method_type_hint: str
    :param signature_method: 
    :type signature_method: str
    :param signature_method_type_hint: 
    :type signature_method_type_hint: str
    :param user_intermediate_path: 
    :type user_intermediate_path: str
    :param user_intermediate_path_type_hint: 
    :type user_intermediate_path_type_hint: str

    """
    return web.Response(status=200)


async def post_config_apache_felix_jetty_based_http_service(request: web.Request, org_apache_felix_https_nio=None, org_apache_felix_https_nio_type_hint=None, org_apache_felix_https_keystore=None, org_apache_felix_https_keystore_type_hint=None, org_apache_felix_https_keystore_password=None, org_apache_felix_https_keystore_password_type_hint=None, org_apache_felix_https_keystore_key=None, org_apache_felix_https_keystore_key_type_hint=None, org_apache_felix_https_keystore_key_password=None, org_apache_felix_https_keystore_key_password_type_hint=None, org_apache_felix_https_truststore=None, org_apache_felix_https_truststore_type_hint=None, org_apache_felix_https_truststore_password=None, org_apache_felix_https_truststore_password_type_hint=None, org_apache_felix_https_clientcertificate=None, org_apache_felix_https_clientcertificate_type_hint=None, org_apache_felix_https_enable=None, org_apache_felix_https_enable_type_hint=None, org_osgi_service_http_port_secure=None, org_osgi_service_http_port_secure_type_hint=None) -> web.Response:
    """post_config_apache_felix_jetty_based_http_service

    

    :param org_apache_felix_https_nio: 
    :type org_apache_felix_https_nio: bool
    :param org_apache_felix_https_nio_type_hint: 
    :type org_apache_felix_https_nio_type_hint: str
    :param org_apache_felix_https_keystore: 
    :type org_apache_felix_https_keystore: str
    :param org_apache_felix_https_keystore_type_hint: 
    :type org_apache_felix_https_keystore_type_hint: str
    :param org_apache_felix_https_keystore_password: 
    :type org_apache_felix_https_keystore_password: str
    :param org_apache_felix_https_keystore_password_type_hint: 
    :type org_apache_felix_https_keystore_password_type_hint: str
    :param org_apache_felix_https_keystore_key: 
    :type org_apache_felix_https_keystore_key: str
    :param org_apache_felix_https_keystore_key_type_hint: 
    :type org_apache_felix_https_keystore_key_type_hint: str
    :param org_apache_felix_https_keystore_key_password: 
    :type org_apache_felix_https_keystore_key_password: str
    :param org_apache_felix_https_keystore_key_password_type_hint: 
    :type org_apache_felix_https_keystore_key_password_type_hint: str
    :param org_apache_felix_https_truststore: 
    :type org_apache_felix_https_truststore: str
    :param org_apache_felix_https_truststore_type_hint: 
    :type org_apache_felix_https_truststore_type_hint: str
    :param org_apache_felix_https_truststore_password: 
    :type org_apache_felix_https_truststore_password: str
    :param org_apache_felix_https_truststore_password_type_hint: 
    :type org_apache_felix_https_truststore_password_type_hint: str
    :param org_apache_felix_https_clientcertificate: 
    :type org_apache_felix_https_clientcertificate: str
    :param org_apache_felix_https_clientcertificate_type_hint: 
    :type org_apache_felix_https_clientcertificate_type_hint: str
    :param org_apache_felix_https_enable: 
    :type org_apache_felix_https_enable: bool
    :param org_apache_felix_https_enable_type_hint: 
    :type org_apache_felix_https_enable_type_hint: str
    :param org_osgi_service_http_port_secure: 
    :type org_osgi_service_http_port_secure: str
    :param org_osgi_service_http_port_secure_type_hint: 
    :type org_osgi_service_http_port_secure_type_hint: str

    """
    return web.Response(status=200)


async def post_config_apache_http_components_proxy_configuration(request: web.Request, proxy_host=None, proxy_host_type_hint=None, proxy_port=None, proxy_port_type_hint=None, proxy_exceptions=None, proxy_exceptions_type_hint=None, proxy_enabled=None, proxy_enabled_type_hint=None, proxy_user=None, proxy_user_type_hint=None, proxy_password=None, proxy_password_type_hint=None) -> web.Response:
    """post_config_apache_http_components_proxy_configuration

    

    :param proxy_host: 
    :type proxy_host: str
    :param proxy_host_type_hint: 
    :type proxy_host_type_hint: str
    :param proxy_port: 
    :type proxy_port: int
    :param proxy_port_type_hint: 
    :type proxy_port_type_hint: str
    :param proxy_exceptions: 
    :type proxy_exceptions: List[str]
    :param proxy_exceptions_type_hint: 
    :type proxy_exceptions_type_hint: str
    :param proxy_enabled: 
    :type proxy_enabled: bool
    :param proxy_enabled_type_hint: 
    :type proxy_enabled_type_hint: str
    :param proxy_user: 
    :type proxy_user: str
    :param proxy_user_type_hint: 
    :type proxy_user_type_hint: str
    :param proxy_password: 
    :type proxy_password: str
    :param proxy_password_type_hint: 
    :type proxy_password_type_hint: str

    """
    return web.Response(status=200)


async def post_config_apache_sling_dav_ex_servlet(request: web.Request, alias=None, alias_type_hint=None, dav_create_absolute_uri=None, dav_create_absolute_uri_type_hint=None) -> web.Response:
    """post_config_apache_sling_dav_ex_servlet

    

    :param alias: 
    :type alias: str
    :param alias_type_hint: 
    :type alias_type_hint: str
    :param dav_create_absolute_uri: 
    :type dav_create_absolute_uri: bool
    :param dav_create_absolute_uri_type_hint: 
    :type dav_create_absolute_uri_type_hint: str

    """
    return web.Response(status=200)


async def post_config_apache_sling_get_servlet(request: web.Request, json_maximumresults=None, json_maximumresults_type_hint=None, enable_html=None, enable_html_type_hint=None, enable_txt=None, enable_txt_type_hint=None, enable_xml=None, enable_xml_type_hint=None) -> web.Response:
    """post_config_apache_sling_get_servlet

    

    :param json_maximumresults: 
    :type json_maximumresults: str
    :param json_maximumresults_type_hint: 
    :type json_maximumresults_type_hint: str
    :param enable_html: 
    :type enable_html: bool
    :param enable_html_type_hint: 
    :type enable_html_type_hint: str
    :param enable_txt: 
    :type enable_txt: bool
    :param enable_txt_type_hint: 
    :type enable_txt_type_hint: str
    :param enable_xml: 
    :type enable_xml: bool
    :param enable_xml_type_hint: 
    :type enable_xml_type_hint: str

    """
    return web.Response(status=200)


async def post_config_apache_sling_referrer_filter(request: web.Request, allow_empty=None, allow_empty_type_hint=None, allow_hosts=None, allow_hosts_type_hint=None, allow_hosts_regexp=None, allow_hosts_regexp_type_hint=None, filter_methods=None, filter_methods_type_hint=None) -> web.Response:
    """post_config_apache_sling_referrer_filter

    

    :param allow_empty: 
    :type allow_empty: bool
    :param allow_empty_type_hint: 
    :type allow_empty_type_hint: str
    :param allow_hosts: 
    :type allow_hosts: str
    :param allow_hosts_type_hint: 
    :type allow_hosts_type_hint: str
    :param allow_hosts_regexp: 
    :type allow_hosts_regexp: str
    :param allow_hosts_regexp_type_hint: 
    :type allow_hosts_regexp_type_hint: str
    :param filter_methods: 
    :type filter_methods: str
    :param filter_methods_type_hint: 
    :type filter_methods_type_hint: str

    """
    return web.Response(status=200)


async def post_config_property(request: web.Request, config_node_name) -> web.Response:
    """post_config_property

    

    :param config_node_name: 
    :type config_node_name: str

    """
    return web.Response(status=200)


async def post_node(request: web.Request, path, name, operation=None, delete_authorizable=None, file=None) -> web.Response:
    """post_node

    

    :param path: 
    :type path: str
    :param name: 
    :type name: str
    :param operation: 
    :type operation: str
    :param delete_authorizable: 
    :type delete_authorizable: str
    :param file: 
    :type file: str

    """
    return web.Response(status=200)


async def post_node_rw(request: web.Request, path, name, add_members=None) -> web.Response:
    """post_node_rw

    

    :param path: 
    :type path: str
    :param name: 
    :type name: str
    :param add_members: 
    :type add_members: str

    """
    return web.Response(status=200)


async def post_path(request: web.Request, path, jcr_primary_type, name) -> web.Response:
    """post_path

    

    :param path: 
    :type path: str
    :param jcr_primary_type: 
    :type jcr_primary_type: str
    :param name: 
    :type name: str

    """
    return web.Response(status=200)


async def post_query(request: web.Request, path, p_limit, _1_property, _1_property_value) -> web.Response:
    """post_query

    

    :param path: 
    :type path: str
    :param p_limit: 
    :type p_limit: 
    :param _1_property: 
    :type _1_property: str
    :param _1_property_value: 
    :type _1_property_value: str

    """
    return web.Response(status=200)


async def post_tree_activation(request: web.Request, ignoredeactivated, onlymodified, path, cmd) -> web.Response:
    """post_tree_activation

    

    :param ignoredeactivated: 
    :type ignoredeactivated: bool
    :param onlymodified: 
    :type onlymodified: bool
    :param path: 
    :type path: str
    :param cmd: 
    :type cmd: str

    """
    return web.Response(status=200)


async def post_truststore(request: web.Request, operation=None, new_password=None, re_password=None, key_store_type=None, remove_alias=None, certificate=None) -> web.Response:
    """post_truststore

    

    :param operation: 
    :type operation: str
    :param new_password: 
    :type new_password: str
    :param re_password: 
    :type re_password: str
    :param key_store_type: 
    :type key_store_type: str
    :param remove_alias: 
    :type remove_alias: str
    :param certificate: 
    :type certificate: str

    """
    return web.Response(status=200)


async def post_truststore_pkcs12(request: web.Request, truststore_p12=None) -> web.Response:
    """post_truststore_pkcs12

    

    :param truststore_p12: 
    :type truststore_p12: str

    """
    return web.Response(status=200)
