# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import StrictBool, StrictBytes, StrictFloat, StrictInt, StrictStr  # noqa: F401
from typing import Any, List, Optional, Tuple, Union  # noqa: F401
from openapi_server.models.keystore_info import KeystoreInfo  # noqa: F401
from openapi_server.models.truststore_info import TruststoreInfo  # noqa: F401
from fastapi import File, UploadFile  # noqa: F401


def test_post_path(client: TestClient):
    """Test case for post_path

    
    """
    params = [("jcr_primary_type", 'jcr_primary_type_example'),     ("name", 'name_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/{path}/".format(path='path_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_node(client: TestClient):
    """Test case for get_node

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/{path}/{name}".format(path='path_example', name='name_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_node(client: TestClient):
    """Test case for post_node

    
    """
    params = [("operation", 'operation_example'),     ("delete_authorizable", 'delete_authorizable_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "file": None
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/{path}/{name}".format(path='path_example', name='name_example'),
    #    headers=headers,
    #    data=data,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_node(client: TestClient):
    """Test case for delete_node

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/{path}/{name}".format(path='path_example', name='name_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_node_rw(client: TestClient):
    """Test case for post_node_rw

    
    """
    params = [("add_members", 'add_members_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/{path}/{name}.rw.html".format(path='path_example', name='name_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_property(client: TestClient):
    """Test case for post_config_property

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/{configNodeName}".format(configNodeName='config_node_name_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_apache_felix_jetty_based_http_service(client: TestClient):
    """Test case for post_config_apache_felix_jetty_based_http_service

    
    """
    params = [("org_apache_felix_https_nio", True),     ("org_apache_felix_https_nio_type_hint", 'org_apache_felix_https_nio_type_hint_example'),     ("org_apache_felix_https_keystore", 'org_apache_felix_https_keystore_example'),     ("org_apache_felix_https_keystore_type_hint", 'org_apache_felix_https_keystore_type_hint_example'),     ("org_apache_felix_https_keystore_password", 'org_apache_felix_https_keystore_password_example'),     ("org_apache_felix_https_keystore_password_type_hint", 'org_apache_felix_https_keystore_password_type_hint_example'),     ("org_apache_felix_https_keystore_key", 'org_apache_felix_https_keystore_key_example'),     ("org_apache_felix_https_keystore_key_type_hint", 'org_apache_felix_https_keystore_key_type_hint_example'),     ("org_apache_felix_https_keystore_key_password", 'org_apache_felix_https_keystore_key_password_example'),     ("org_apache_felix_https_keystore_key_password_type_hint", 'org_apache_felix_https_keystore_key_password_type_hint_example'),     ("org_apache_felix_https_truststore", 'org_apache_felix_https_truststore_example'),     ("org_apache_felix_https_truststore_type_hint", 'org_apache_felix_https_truststore_type_hint_example'),     ("org_apache_felix_https_truststore_password", 'org_apache_felix_https_truststore_password_example'),     ("org_apache_felix_https_truststore_password_type_hint", 'org_apache_felix_https_truststore_password_type_hint_example'),     ("org_apache_felix_https_clientcertificate", 'org_apache_felix_https_clientcertificate_example'),     ("org_apache_felix_https_clientcertificate_type_hint", 'org_apache_felix_https_clientcertificate_type_hint_example'),     ("org_apache_felix_https_enable", True),     ("org_apache_felix_https_enable_type_hint", 'org_apache_felix_https_enable_type_hint_example'),     ("org_osgi_service_http_port_secure", 'org_osgi_service_http_port_secure_example'),     ("org_osgi_service_http_port_secure_type_hint", 'org_osgi_service_http_port_secure_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/org.apache.felix.http",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_apache_sling_get_servlet(client: TestClient):
    """Test case for post_config_apache_sling_get_servlet

    
    """
    params = [("json_maximumresults", 'json_maximumresults_example'),     ("json_maximumresults_type_hint", 'json_maximumresults_type_hint_example'),     ("enable_html", True),     ("enable_html_type_hint", 'enable_html_type_hint_example'),     ("enable_txt", True),     ("enable_txt_type_hint", 'enable_txt_type_hint_example'),     ("enable_xml", True),     ("enable_xml_type_hint", 'enable_xml_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_apache_sling_referrer_filter(client: TestClient):
    """Test case for post_config_apache_sling_referrer_filter

    
    """
    params = [("allow_empty", True),     ("allow_empty_type_hint", 'allow_empty_type_hint_example'),     ("allow_hosts", 'allow_hosts_example'),     ("allow_hosts_type_hint", 'allow_hosts_type_hint_example'),     ("allow_hosts_regexp", 'allow_hosts_regexp_example'),     ("allow_hosts_regexp_type_hint", 'allow_hosts_regexp_type_hint_example'),     ("filter_methods", 'filter_methods_example'),     ("filter_methods_type_hint", 'filter_methods_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_apache_sling_dav_ex_servlet(client: TestClient):
    """Test case for post_config_apache_sling_dav_ex_servlet

    
    """
    params = [("alias", 'alias_example'),     ("alias_type_hint", 'alias_type_hint_example'),     ("dav_create_absolute_uri", True),     ("dav_create_absolute_uri_type_hint", 'dav_create_absolute_uri_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_query(client: TestClient):
    """Test case for get_query

    
    """
    params = [("path", 'path_example'),     ("p_limit", 3.4),     ("var_1_property", 'var_1_property_example'),     ("var_1_property_value", 'var_1_property_value_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/bin/querybuilder.json",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_query(client: TestClient):
    """Test case for post_query

    
    """
    params = [("path", 'path_example'),     ("p_limit", 3.4),     ("var_1_property", 'var_1_property_example'),     ("var_1_property_value", 'var_1_property_value_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/bin/querybuilder.json",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_package(client: TestClient):
    """Test case for get_package

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/etc/packages/{group}/{name}-{version}.zip".format(group='group_example', name='name_example', version='version_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_package_filter(client: TestClient):
    """Test case for get_package_filter

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".format(group='group_example', name='name_example', version='version_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_agents(client: TestClient):
    """Test case for get_agents

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/etc/replication/agents.{runmode}.-1.json".format(runmode='runmode_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_agent(client: TestClient):
    """Test case for get_agent

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/etc/replication/agents.{runmode}/{name}".format(runmode='runmode_example', name='name_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_agent(client: TestClient):
    """Test case for post_agent

    
    """
    params = [("jcr_content_cq_distribute", True),     ("jcr_content_cq_distribute_type_hint", 'jcr_content_cq_distribute_type_hint_example'),     ("jcr_content_cq_name", 'jcr_content_cq_name_example'),     ("jcr_content_cq_template", 'jcr_content_cq_template_example'),     ("jcr_content_alias_update", True),     ("jcr_content_enabled", True),     ("jcr_content_jcr_description", 'jcr_content_jcr_description_example'),     ("jcr_content_jcr_last_modified", 'jcr_content_jcr_last_modified_example'),     ("jcr_content_jcr_last_modified_by", 'jcr_content_jcr_last_modified_by_example'),     ("jcr_content_jcr_mixin_types", 'jcr_content_jcr_mixin_types_example'),     ("jcr_content_jcr_title", 'jcr_content_jcr_title_example'),     ("jcr_content_log_level", 'jcr_content_log_level_example'),     ("jcr_content_no_status_update", True),     ("jcr_content_no_versioning", True),     ("jcr_content_protocol_connect_timeout", 3.4),     ("jcr_content_protocol_http_connection_closed", True),     ("jcr_content_protocol_http_expired", 'jcr_content_protocol_http_expired_example'),     ("jcr_content_protocol_http_headers", ['jcr_content_protocol_http_headers_example']),     ("jcr_content_protocol_http_headers_type_hint", 'jcr_content_protocol_http_headers_type_hint_example'),     ("jcr_content_protocol_http_method", 'jcr_content_protocol_http_method_example'),     ("jcr_content_protocol_https_relaxed", True),     ("jcr_content_protocol_interface", 'jcr_content_protocol_interface_example'),     ("jcr_content_protocol_socket_timeout", 3.4),     ("jcr_content_protocol_version", 'jcr_content_protocol_version_example'),     ("jcr_content_proxy_ntlm_domain", 'jcr_content_proxy_ntlm_domain_example'),     ("jcr_content_proxy_ntlm_host", 'jcr_content_proxy_ntlm_host_example'),     ("jcr_content_proxy_host", 'jcr_content_proxy_host_example'),     ("jcr_content_proxy_password", 'jcr_content_proxy_password_example'),     ("jcr_content_proxy_port", 3.4),     ("jcr_content_proxy_user", 'jcr_content_proxy_user_example'),     ("jcr_content_queue_batch_max_size", 3.4),     ("jcr_content_queue_batch_mode", 'jcr_content_queue_batch_mode_example'),     ("jcr_content_queue_batch_wait_time", 3.4),     ("jcr_content_retry_delay", 'jcr_content_retry_delay_example'),     ("jcr_content_reverse_replication", True),     ("jcr_content_serialization_type", 'jcr_content_serialization_type_example'),     ("jcr_content_sling_resource_type", 'jcr_content_sling_resource_type_example'),     ("jcr_content_ssl", 'jcr_content_ssl_example'),     ("jcr_content_transport_ntlm_domain", 'jcr_content_transport_ntlm_domain_example'),     ("jcr_content_transport_ntlm_host", 'jcr_content_transport_ntlm_host_example'),     ("jcr_content_transport_password", 'jcr_content_transport_password_example'),     ("jcr_content_transport_uri", 'jcr_content_transport_uri_example'),     ("jcr_content_transport_user", 'jcr_content_transport_user_example'),     ("jcr_content_trigger_distribute", True),     ("jcr_content_trigger_modified", True),     ("jcr_content_trigger_on_off_time", True),     ("jcr_content_trigger_receive", True),     ("jcr_content_trigger_specific", True),     ("jcr_content_user_id", 'jcr_content_user_id_example'),     ("jcr_primary_type", 'jcr_primary_type_example'),     ("operation", 'operation_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/etc/replication/agents.{runmode}/{name}".format(runmode='runmode_example', name='name_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_agent(client: TestClient):
    """Test case for delete_agent

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/etc/replication/agents.{runmode}/{name}".format(runmode='runmode_example', name='name_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_tree_activation(client: TestClient):
    """Test case for post_tree_activation

    
    """
    params = [("ignoredeactivated", True),     ("onlymodified", True),     ("path", 'path_example'),     ("cmd", 'activate')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/libs/replication/treeactivation.html",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_authorizables(client: TestClient):
    """Test case for post_authorizables

    
    """
    params = [("authorizable_id", 'authorizable_id_example'),     ("intermediate_path", 'intermediate_path_example'),     ("create_user", 'create_user_example'),     ("create_group", 'create_group_example'),     ("rep_password", 'rep_password_example'),     ("profile_given_name", 'profile_given_name_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/libs/granite/security/post/authorizables",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_adobe_granite_saml_authentication_handler(client: TestClient):
    """Test case for post_config_adobe_granite_saml_authentication_handler

    
    """
    params = [("key_store_password", 'key_store_password_example'),     ("key_store_password_type_hint", 'key_store_password_type_hint_example'),     ("service_ranking", 56),     ("service_ranking_type_hint", 'service_ranking_type_hint_example'),     ("idp_http_redirect", True),     ("idp_http_redirect_type_hint", 'idp_http_redirect_type_hint_example'),     ("create_user", True),     ("create_user_type_hint", 'create_user_type_hint_example'),     ("default_redirect_url", 'default_redirect_url_example'),     ("default_redirect_url_type_hint", 'default_redirect_url_type_hint_example'),     ("user_id_attribute", 'user_id_attribute_example'),     ("user_id_attribute_type_hint", 'user_id_attribute_type_hint_example'),     ("default_groups", ['default_groups_example']),     ("default_groups_type_hint", 'default_groups_type_hint_example'),     ("idp_cert_alias", 'idp_cert_alias_example'),     ("idp_cert_alias_type_hint", 'idp_cert_alias_type_hint_example'),     ("add_group_memberships", True),     ("add_group_memberships_type_hint", 'add_group_memberships_type_hint_example'),     ("path", ['path_example']),     ("path_type_hint", 'path_type_hint_example'),     ("synchronize_attributes", ['synchronize_attributes_example']),     ("synchronize_attributes_type_hint", 'synchronize_attributes_type_hint_example'),     ("clock_tolerance", 56),     ("clock_tolerance_type_hint", 'clock_tolerance_type_hint_example'),     ("group_membership_attribute", 'group_membership_attribute_example'),     ("group_membership_attribute_type_hint", 'group_membership_attribute_type_hint_example'),     ("idp_url", 'idp_url_example'),     ("idp_url_type_hint", 'idp_url_type_hint_example'),     ("logout_url", 'logout_url_example'),     ("logout_url_type_hint", 'logout_url_type_hint_example'),     ("service_provider_entity_id", 'service_provider_entity_id_example'),     ("service_provider_entity_id_type_hint", 'service_provider_entity_id_type_hint_example'),     ("assertion_consumer_service_url", 'assertion_consumer_service_url_example'),     ("assertion_consumer_service_url_type_hint", 'assertion_consumer_service_url_type_hint_example'),     ("handle_logout", True),     ("handle_logout_type_hint", 'handle_logout_type_hint_example'),     ("sp_private_key_alias", 'sp_private_key_alias_example'),     ("sp_private_key_alias_type_hint", 'sp_private_key_alias_type_hint_example'),     ("use_encryption", True),     ("use_encryption_type_hint", 'use_encryption_type_hint_example'),     ("name_id_format", 'name_id_format_example'),     ("name_id_format_type_hint", 'name_id_format_type_hint_example'),     ("digest_method", 'digest_method_example'),     ("digest_method_type_hint", 'digest_method_type_hint_example'),     ("signature_method", 'signature_method_example'),     ("signature_method_type_hint", 'signature_method_type_hint_example'),     ("user_intermediate_path", 'user_intermediate_path_example'),     ("user_intermediate_path_type_hint", 'user_intermediate_path_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_apache_http_components_proxy_configuration(client: TestClient):
    """Test case for post_config_apache_http_components_proxy_configuration

    
    """
    params = [("proxy_host", 'proxy_host_example'),     ("proxy_host_type_hint", 'proxy_host_type_hint_example'),     ("proxy_port", 56),     ("proxy_port_type_hint", 'proxy_port_type_hint_example'),     ("proxy_exceptions", ['proxy_exceptions_example']),     ("proxy_exceptions_type_hint", 'proxy_exceptions_type_hint_example'),     ("proxy_enabled", True),     ("proxy_enabled_type_hint", 'proxy_enabled_type_hint_example'),     ("proxy_user", 'proxy_user_example'),     ("proxy_user_type_hint", 'proxy_user_type_hint_example'),     ("proxy_password", 'proxy_password_example'),     ("proxy_password_type_hint", 'proxy_password_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/org.apache.http.proxyconfigurator.config",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_truststore(client: TestClient):
    """Test case for post_truststore

    
    """
    params = [("operation", 'operation_example'),     ("new_password", 'new_password_example'),     ("re_password", 're_password_example'),     ("key_store_type", 'key_store_type_example'),     ("remove_alias", 'remove_alias_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "certificate": None
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/libs/granite/security/post/truststore",
    #    headers=headers,
    #    data=data,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_truststore_info(client: TestClient):
    """Test case for get_truststore_info

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/libs/granite/security/truststore.json",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_truststore(client: TestClient):
    """Test case for get_truststore

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/etc/truststore/truststore.p12",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_truststore_pkcs12(client: TestClient):
    """Test case for post_truststore_pkcs12

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "truststore_p12": None
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/etc/truststore",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_authorizable_keystore(client: TestClient):
    """Test case for post_authorizable_keystore

    
    """
    params = [("operation", 'operation_example'),     ("current_password", 'current_password_example'),     ("new_password", 'new_password_example'),     ("re_password", 're_password_example'),     ("key_password", 'key_password_example'),     ("key_store_pass", 'key_store_pass_example'),     ("alias", 'alias_example'),     ("new_alias", 'new_alias_example'),     ("remove_alias", 'remove_alias_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "cert_chain": None,
        "pk": None,
        "key_store": None
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/{intermediatePath}/{authorizableId}.ks.html".format(intermediatePath='intermediate_path_example', authorizableId='authorizable_id_example'),
    #    headers=headers,
    #    data=data,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_authorizable_keystore(client: TestClient):
    """Test case for get_authorizable_keystore

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/{intermediatePath}/{authorizableId}.ks.json".format(intermediatePath='intermediate_path_example', authorizableId='authorizable_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_keystore(client: TestClient):
    """Test case for get_keystore

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/{intermediatePath}/{authorizableId}/keystore/store.p12".format(intermediatePath='intermediate_path_example', authorizableId='authorizable_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

