import connexion
import six

from openapi_server.models.keystore_info import KeystoreInfo  # noqa: E501
from openapi_server.models.truststore_info import TruststoreInfo  # noqa: E501
from openapi_server import util


def delete_agent(runmode, name):  # noqa: E501
    """delete_agent

     # noqa: E501

    :param runmode: 
    :type runmode: str
    :param name: 
    :type name: str

    :rtype: None
    """
    return 'do some magic!'


def delete_node(path, name):  # noqa: E501
    """delete_node

     # noqa: E501

    :param path: 
    :type path: str
    :param name: 
    :type name: str

    :rtype: None
    """
    return 'do some magic!'


def get_agent(runmode, name):  # noqa: E501
    """get_agent

     # noqa: E501

    :param runmode: 
    :type runmode: str
    :param name: 
    :type name: str

    :rtype: None
    """
    return 'do some magic!'


def get_agents(runmode):  # noqa: E501
    """get_agents

     # noqa: E501

    :param runmode: 
    :type runmode: str

    :rtype: str
    """
    return 'do some magic!'


def get_authorizable_keystore(intermediate_path, authorizable_id):  # noqa: E501
    """get_authorizable_keystore

     # noqa: E501

    :param intermediate_path: 
    :type intermediate_path: str
    :param authorizable_id: 
    :type authorizable_id: str

    :rtype: KeystoreInfo
    """
    return 'do some magic!'


def get_keystore(intermediate_path, authorizable_id):  # noqa: E501
    """get_keystore

     # noqa: E501

    :param intermediate_path: 
    :type intermediate_path: str
    :param authorizable_id: 
    :type authorizable_id: str

    :rtype: file
    """
    return 'do some magic!'


def get_node(path, name):  # noqa: E501
    """get_node

     # noqa: E501

    :param path: 
    :type path: str
    :param name: 
    :type name: str

    :rtype: None
    """
    return 'do some magic!'


def get_package(group, name, version):  # noqa: E501
    """get_package

     # noqa: E501

    :param group: 
    :type group: str
    :param name: 
    :type name: str
    :param version: 
    :type version: str

    :rtype: file
    """
    return 'do some magic!'


def get_package_filter(group, name, version):  # noqa: E501
    """get_package_filter

     # noqa: E501

    :param group: 
    :type group: str
    :param name: 
    :type name: str
    :param version: 
    :type version: str

    :rtype: str
    """
    return 'do some magic!'


def get_query(path, p_limit, _1_property, _1_property_value):  # noqa: E501
    """get_query

     # noqa: E501

    :param path: 
    :type path: str
    :param p_limit: 
    :type p_limit: float
    :param _1_property: 
    :type _1_property: str
    :param _1_property_value: 
    :type _1_property_value: str

    :rtype: str
    """
    return 'do some magic!'


def get_truststore():  # noqa: E501
    """get_truststore

     # noqa: E501


    :rtype: file
    """
    return 'do some magic!'


def get_truststore_info():  # noqa: E501
    """get_truststore_info

     # noqa: E501


    :rtype: TruststoreInfo
    """
    return 'do some magic!'


def post_agent(runmode, name, jcrcontentcqdistribute=None, jcrcontentcqdistribute_type_hint=None, jcrcontentcqname=None, jcrcontentcqtemplate=None, jcrcontentenabled=None, jcrcontentjcrdescription=None, jcrcontentjcrlast_modified=None, jcrcontentjcrlast_modified_by=None, jcrcontentjcrmixin_types=None, jcrcontentjcrtitle=None, jcrcontentlog_level=None, jcrcontentno_status_update=None, jcrcontentno_versioning=None, jcrcontentprotocol_connect_timeout=None, jcrcontentprotocol_http_connection_closed=None, jcrcontentprotocol_http_expired=None, jcrcontentprotocol_http_headers=None, jcrcontentprotocol_http_headers_type_hint=None, jcrcontentprotocol_http_method=None, jcrcontentprotocol_https_relaxed=None, jcrcontentprotocol_interface=None, jcrcontentprotocol_socket_timeout=None, jcrcontentprotocol_version=None, jcrcontentproxy_ntlm_domain=None, jcrcontentproxy_ntlm_host=None, jcrcontentproxy_host=None, jcrcontentproxy_password=None, jcrcontentproxy_port=None, jcrcontentproxy_user=None, jcrcontentqueue_batch_max_size=None, jcrcontentqueue_batch_mode=None, jcrcontentqueue_batch_wait_time=None, jcrcontentretry_delay=None, jcrcontentreverse_replication=None, jcrcontentserialization_type=None, jcrcontentslingresource_type=None, jcrcontentssl=None, jcrcontenttransport_ntlm_domain=None, jcrcontenttransport_ntlm_host=None, jcrcontenttransport_password=None, jcrcontenttransport_uri=None, jcrcontenttransport_user=None, jcrcontenttrigger_distribute=None, jcrcontenttrigger_modified=None, jcrcontenttrigger_on_off_time=None, jcrcontenttrigger_receive=None, jcrcontenttrigger_specific=None, jcrcontentuser_id=None, jcrprimary_type=None, operation=None):  # noqa: E501
    """post_agent

     # noqa: E501

    :param runmode: 
    :type runmode: str
    :param name: 
    :type name: str
    :param jcrcontentcqdistribute: 
    :type jcrcontentcqdistribute: bool
    :param jcrcontentcqdistribute_type_hint: 
    :type jcrcontentcqdistribute_type_hint: str
    :param jcrcontentcqname: 
    :type jcrcontentcqname: str
    :param jcrcontentcqtemplate: 
    :type jcrcontentcqtemplate: str
    :param jcrcontentenabled: 
    :type jcrcontentenabled: bool
    :param jcrcontentjcrdescription: 
    :type jcrcontentjcrdescription: str
    :param jcrcontentjcrlast_modified: 
    :type jcrcontentjcrlast_modified: str
    :param jcrcontentjcrlast_modified_by: 
    :type jcrcontentjcrlast_modified_by: str
    :param jcrcontentjcrmixin_types: 
    :type jcrcontentjcrmixin_types: str
    :param jcrcontentjcrtitle: 
    :type jcrcontentjcrtitle: str
    :param jcrcontentlog_level: 
    :type jcrcontentlog_level: str
    :param jcrcontentno_status_update: 
    :type jcrcontentno_status_update: bool
    :param jcrcontentno_versioning: 
    :type jcrcontentno_versioning: bool
    :param jcrcontentprotocol_connect_timeout: 
    :type jcrcontentprotocol_connect_timeout: float
    :param jcrcontentprotocol_http_connection_closed: 
    :type jcrcontentprotocol_http_connection_closed: bool
    :param jcrcontentprotocol_http_expired: 
    :type jcrcontentprotocol_http_expired: str
    :param jcrcontentprotocol_http_headers: 
    :type jcrcontentprotocol_http_headers: List[str]
    :param jcrcontentprotocol_http_headers_type_hint: 
    :type jcrcontentprotocol_http_headers_type_hint: str
    :param jcrcontentprotocol_http_method: 
    :type jcrcontentprotocol_http_method: str
    :param jcrcontentprotocol_https_relaxed: 
    :type jcrcontentprotocol_https_relaxed: bool
    :param jcrcontentprotocol_interface: 
    :type jcrcontentprotocol_interface: str
    :param jcrcontentprotocol_socket_timeout: 
    :type jcrcontentprotocol_socket_timeout: float
    :param jcrcontentprotocol_version: 
    :type jcrcontentprotocol_version: str
    :param jcrcontentproxy_ntlm_domain: 
    :type jcrcontentproxy_ntlm_domain: str
    :param jcrcontentproxy_ntlm_host: 
    :type jcrcontentproxy_ntlm_host: str
    :param jcrcontentproxy_host: 
    :type jcrcontentproxy_host: str
    :param jcrcontentproxy_password: 
    :type jcrcontentproxy_password: str
    :param jcrcontentproxy_port: 
    :type jcrcontentproxy_port: float
    :param jcrcontentproxy_user: 
    :type jcrcontentproxy_user: str
    :param jcrcontentqueue_batch_max_size: 
    :type jcrcontentqueue_batch_max_size: float
    :param jcrcontentqueue_batch_mode: 
    :type jcrcontentqueue_batch_mode: str
    :param jcrcontentqueue_batch_wait_time: 
    :type jcrcontentqueue_batch_wait_time: float
    :param jcrcontentretry_delay: 
    :type jcrcontentretry_delay: str
    :param jcrcontentreverse_replication: 
    :type jcrcontentreverse_replication: bool
    :param jcrcontentserialization_type: 
    :type jcrcontentserialization_type: str
    :param jcrcontentslingresource_type: 
    :type jcrcontentslingresource_type: str
    :param jcrcontentssl: 
    :type jcrcontentssl: str
    :param jcrcontenttransport_ntlm_domain: 
    :type jcrcontenttransport_ntlm_domain: str
    :param jcrcontenttransport_ntlm_host: 
    :type jcrcontenttransport_ntlm_host: str
    :param jcrcontenttransport_password: 
    :type jcrcontenttransport_password: str
    :param jcrcontenttransport_uri: 
    :type jcrcontenttransport_uri: str
    :param jcrcontenttransport_user: 
    :type jcrcontenttransport_user: str
    :param jcrcontenttrigger_distribute: 
    :type jcrcontenttrigger_distribute: bool
    :param jcrcontenttrigger_modified: 
    :type jcrcontenttrigger_modified: bool
    :param jcrcontenttrigger_on_off_time: 
    :type jcrcontenttrigger_on_off_time: bool
    :param jcrcontenttrigger_receive: 
    :type jcrcontenttrigger_receive: bool
    :param jcrcontenttrigger_specific: 
    :type jcrcontenttrigger_specific: bool
    :param jcrcontentuser_id: 
    :type jcrcontentuser_id: str
    :param jcrprimary_type: 
    :type jcrprimary_type: str
    :param operation: 
    :type operation: str

    :rtype: None
    """
    return 'do some magic!'


def post_authorizable_keystore(intermediate_path, authorizable_id, operation=None, current_password=None, new_password=None, re_password=None, key_password=None, key_store_pass=None, alias=None, new_alias=None, remove_alias=None, cert_chain=None, pk=None, key_store=None):  # noqa: E501
    """post_authorizable_keystore

     # noqa: E501

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

    :rtype: KeystoreInfo
    """
    return 'do some magic!'


def post_authorizables(authorizable_id, intermediate_path, create_user=None, create_group=None, reppassword=None, profilegiven_name=None):  # noqa: E501
    """post_authorizables

     # noqa: E501

    :param authorizable_id: 
    :type authorizable_id: str
    :param intermediate_path: 
    :type intermediate_path: str
    :param create_user: 
    :type create_user: str
    :param create_group: 
    :type create_group: str
    :param reppassword: 
    :type reppassword: str
    :param profilegiven_name: 
    :type profilegiven_name: str

    :rtype: str
    """
    return 'do some magic!'


def post_config_adobe_granite_saml_authentication_handler(key_store_password=None, key_store_password_type_hint=None, service_ranking=None, service_ranking_type_hint=None, idp_http_redirect=None, idp_http_redirect_type_hint=None, create_user=None, create_user_type_hint=None, default_redirect_url=None, default_redirect_url_type_hint=None, user_id_attribute=None, user_id_attribute_type_hint=None, default_groups=None, default_groups_type_hint=None, idp_cert_alias=None, idp_cert_alias_type_hint=None, add_group_memberships=None, add_group_memberships_type_hint=None, path=None, path_type_hint=None, synchronize_attributes=None, synchronize_attributes_type_hint=None, clock_tolerance=None, clock_tolerance_type_hint=None, group_membership_attribute=None, group_membership_attribute_type_hint=None, idp_url=None, idp_url_type_hint=None, logout_url=None, logout_url_type_hint=None, service_provider_entity_id=None, service_provider_entity_id_type_hint=None, assertion_consumer_service_url=None, assertion_consumer_service_url_type_hint=None, handle_logout=None, handle_logout_type_hint=None, sp_private_key_alias=None, sp_private_key_alias_type_hint=None, use_encryption=None, use_encryption_type_hint=None, name_id_format=None, name_id_format_type_hint=None, digest_method=None, digest_method_type_hint=None, signature_method=None, signature_method_type_hint=None, user_intermediate_path=None, user_intermediate_path_type_hint=None):  # noqa: E501
    """post_config_adobe_granite_saml_authentication_handler

     # noqa: E501

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

    :rtype: None
    """
    return 'do some magic!'


def post_config_apache_felix_jetty_based_http_service(org_apache_felix_https_nio=None, org_apache_felix_https_nio_type_hint=None, org_apache_felix_https_keystore=None, org_apache_felix_https_keystore_type_hint=None, org_apache_felix_https_keystore_password=None, org_apache_felix_https_keystore_password_type_hint=None, org_apache_felix_https_keystore_key=None, org_apache_felix_https_keystore_key_type_hint=None, org_apache_felix_https_keystore_key_password=None, org_apache_felix_https_keystore_key_password_type_hint=None, org_apache_felix_https_truststore=None, org_apache_felix_https_truststore_type_hint=None, org_apache_felix_https_truststore_password=None, org_apache_felix_https_truststore_password_type_hint=None, org_apache_felix_https_clientcertificate=None, org_apache_felix_https_clientcertificate_type_hint=None, org_apache_felix_https_enable=None, org_apache_felix_https_enable_type_hint=None, org_osgi_service_http_port_secure=None, org_osgi_service_http_port_secure_type_hint=None):  # noqa: E501
    """post_config_apache_felix_jetty_based_http_service

     # noqa: E501

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

    :rtype: None
    """
    return 'do some magic!'


def post_config_apache_http_components_proxy_configuration(proxy_host=None, proxy_host_type_hint=None, proxy_port=None, proxy_port_type_hint=None, proxy_exceptions=None, proxy_exceptions_type_hint=None, proxy_enabled=None, proxy_enabled_type_hint=None, proxy_user=None, proxy_user_type_hint=None, proxy_password=None, proxy_password_type_hint=None):  # noqa: E501
    """post_config_apache_http_components_proxy_configuration

     # noqa: E501

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

    :rtype: None
    """
    return 'do some magic!'


def post_config_apache_sling_dav_ex_servlet(alias=None, alias_type_hint=None, dav_create_absolute_uri=None, dav_create_absolute_uri_type_hint=None):  # noqa: E501
    """post_config_apache_sling_dav_ex_servlet

     # noqa: E501

    :param alias: 
    :type alias: str
    :param alias_type_hint: 
    :type alias_type_hint: str
    :param dav_create_absolute_uri: 
    :type dav_create_absolute_uri: bool
    :param dav_create_absolute_uri_type_hint: 
    :type dav_create_absolute_uri_type_hint: str

    :rtype: None
    """
    return 'do some magic!'


def post_config_apache_sling_get_servlet(json_maximumresults=None, json_maximumresults_type_hint=None, enable_html=None, enable_html_type_hint=None, enable_txt=None, enable_txt_type_hint=None, enable_xml=None, enable_xml_type_hint=None):  # noqa: E501
    """post_config_apache_sling_get_servlet

     # noqa: E501

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

    :rtype: None
    """
    return 'do some magic!'


def post_config_apache_sling_referrer_filter(allow_empty=None, allow_empty_type_hint=None, allow_hosts=None, allow_hosts_type_hint=None, allow_hosts_regexp=None, allow_hosts_regexp_type_hint=None, filter_methods=None, filter_methods_type_hint=None):  # noqa: E501
    """post_config_apache_sling_referrer_filter

     # noqa: E501

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

    :rtype: None
    """
    return 'do some magic!'


def post_node(path, name, operation=None, delete_authorizable=None, file=None):  # noqa: E501
    """post_node

     # noqa: E501

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

    :rtype: None
    """
    return 'do some magic!'


def post_node_rw(path, name, add_members=None):  # noqa: E501
    """post_node_rw

     # noqa: E501

    :param path: 
    :type path: str
    :param name: 
    :type name: str
    :param add_members: 
    :type add_members: str

    :rtype: None
    """
    return 'do some magic!'


def post_path(path, jcrprimary_type, name):  # noqa: E501
    """post_path

     # noqa: E501

    :param path: 
    :type path: str
    :param jcrprimary_type: 
    :type jcrprimary_type: str
    :param name: 
    :type name: str

    :rtype: None
    """
    return 'do some magic!'


def post_query(path, p_limit, _1_property, _1_property_value):  # noqa: E501
    """post_query

     # noqa: E501

    :param path: 
    :type path: str
    :param p_limit: 
    :type p_limit: float
    :param _1_property: 
    :type _1_property: str
    :param _1_property_value: 
    :type _1_property_value: str

    :rtype: str
    """
    return 'do some magic!'


def post_tree_activation(ignoredeactivated, onlymodified, path):  # noqa: E501
    """post_tree_activation

     # noqa: E501

    :param ignoredeactivated: 
    :type ignoredeactivated: bool
    :param onlymodified: 
    :type onlymodified: bool
    :param path: 
    :type path: str

    :rtype: None
    """
    return 'do some magic!'


def post_truststore(operation=None, new_password=None, re_password=None, key_store_type=None, remove_alias=None, certificate=None):  # noqa: E501
    """post_truststore

     # noqa: E501

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

    :rtype: str
    """
    return 'do some magic!'


def post_truststore_pkcs12(truststore_p12=None):  # noqa: E501
    """post_truststore_pkcs12

     # noqa: E501

    :param truststore_p12: 
    :type truststore_p12: str

    :rtype: str
    """
    return 'do some magic!'
