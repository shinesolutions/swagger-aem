# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.keystore_info import KeystoreInfo  # noqa: E501
from openapi_server.models.truststore_info import TruststoreInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSlingController(BaseTestCase):
    """SlingController integration test stubs"""

    def test_delete_agent(self):
        """Test case for delete_agent

        
        """
        response = self.client.open(
            '//etc/replication/agents.{runmode}/{name}'.format(runmode='runmode_example', name='name_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_node(self):
        """Test case for delete_node

        
        """
        response = self.client.open(
            '//{path}/{name}'.format(path='path_example', name='name_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_agent(self):
        """Test case for get_agent

        
        """
        response = self.client.open(
            '//etc/replication/agents.{runmode}/{name}'.format(runmode='runmode_example', name='name_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_agents(self):
        """Test case for get_agents

        
        """
        response = self.client.open(
            '//etc/replication/agents.{runmode}.-1.json'.format(runmode='runmode_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_authorizable_keystore(self):
        """Test case for get_authorizable_keystore

        
        """
        response = self.client.open(
            '//{intermediatePath}/{authorizableId}.ks.json'.format(intermediate_path='intermediate_path_example', authorizable_id='authorizable_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_keystore(self):
        """Test case for get_keystore

        
        """
        response = self.client.open(
            '//{intermediatePath}/{authorizableId}/keystore/store.p12'.format(intermediate_path='intermediate_path_example', authorizable_id='authorizable_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_node(self):
        """Test case for get_node

        
        """
        response = self.client.open(
            '//{path}/{name}'.format(path='path_example', name='name_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_package(self):
        """Test case for get_package

        
        """
        response = self.client.open(
            '//etc/packages/{group}/{name}-{version}.zip'.format(group='group_example', name='name_example', version='version_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_package_filter(self):
        """Test case for get_package_filter

        
        """
        response = self.client.open(
            '//etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json'.format(group='group_example', name='name_example', version='version_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_query(self):
        """Test case for get_query

        
        """
        query_string = [('path', 'path_example'),
                        ('p_limit', 3.4),
                        ('_1_property', '_1_property_example'),
                        ('_1_property_value', '_1_property_value_example')]
        response = self.client.open(
            '//bin/querybuilder.json',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_truststore(self):
        """Test case for get_truststore

        
        """
        response = self.client.open(
            '//etc/truststore/truststore.p12',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_truststore_info(self):
        """Test case for get_truststore_info

        
        """
        response = self.client.open(
            '//libs/granite/security/truststore.json',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_agent(self):
        """Test case for post_agent

        
        """
        query_string = [('jcrcontentcqdistribute', True),
                        ('jcrcontentcqdistribute_type_hint', 'jcrcontentcqdistribute_type_hint_example'),
                        ('jcrcontentcqname', 'jcrcontentcqname_example'),
                        ('jcrcontentcqtemplate', 'jcrcontentcqtemplate_example'),
                        ('jcrcontentenabled', True),
                        ('jcrcontentjcrdescription', 'jcrcontentjcrdescription_example'),
                        ('jcrcontentjcrlast_modified', 'jcrcontentjcrlast_modified_example'),
                        ('jcrcontentjcrlast_modified_by', 'jcrcontentjcrlast_modified_by_example'),
                        ('jcrcontentjcrmixin_types', 'jcrcontentjcrmixin_types_example'),
                        ('jcrcontentjcrtitle', 'jcrcontentjcrtitle_example'),
                        ('jcrcontentlog_level', 'jcrcontentlog_level_example'),
                        ('jcrcontentno_status_update', True),
                        ('jcrcontentno_versioning', True),
                        ('jcrcontentprotocol_connect_timeout', 3.4),
                        ('jcrcontentprotocol_http_connection_closed', True),
                        ('jcrcontentprotocol_http_expired', 'jcrcontentprotocol_http_expired_example'),
                        ('jcrcontentprotocol_http_headers', 'jcrcontentprotocol_http_headers_example'),
                        ('jcrcontentprotocol_http_headers_type_hint', 'jcrcontentprotocol_http_headers_type_hint_example'),
                        ('jcrcontentprotocol_http_method', 'jcrcontentprotocol_http_method_example'),
                        ('jcrcontentprotocol_https_relaxed', True),
                        ('jcrcontentprotocol_interface', 'jcrcontentprotocol_interface_example'),
                        ('jcrcontentprotocol_socket_timeout', 3.4),
                        ('jcrcontentprotocol_version', 'jcrcontentprotocol_version_example'),
                        ('jcrcontentproxy_ntlm_domain', 'jcrcontentproxy_ntlm_domain_example'),
                        ('jcrcontentproxy_ntlm_host', 'jcrcontentproxy_ntlm_host_example'),
                        ('jcrcontentproxy_host', 'jcrcontentproxy_host_example'),
                        ('jcrcontentproxy_password', 'jcrcontentproxy_password_example'),
                        ('jcrcontentproxy_port', 3.4),
                        ('jcrcontentproxy_user', 'jcrcontentproxy_user_example'),
                        ('jcrcontentqueue_batch_max_size', 3.4),
                        ('jcrcontentqueue_batch_mode', 'jcrcontentqueue_batch_mode_example'),
                        ('jcrcontentqueue_batch_wait_time', 3.4),
                        ('jcrcontentretry_delay', 'jcrcontentretry_delay_example'),
                        ('jcrcontentreverse_replication', True),
                        ('jcrcontentserialization_type', 'jcrcontentserialization_type_example'),
                        ('jcrcontentslingresource_type', 'jcrcontentslingresource_type_example'),
                        ('jcrcontentssl', 'jcrcontentssl_example'),
                        ('jcrcontenttransport_ntlm_domain', 'jcrcontenttransport_ntlm_domain_example'),
                        ('jcrcontenttransport_ntlm_host', 'jcrcontenttransport_ntlm_host_example'),
                        ('jcrcontenttransport_password', 'jcrcontenttransport_password_example'),
                        ('jcrcontenttransport_uri', 'jcrcontenttransport_uri_example'),
                        ('jcrcontenttransport_user', 'jcrcontenttransport_user_example'),
                        ('jcrcontenttrigger_distribute', True),
                        ('jcrcontenttrigger_modified', True),
                        ('jcrcontenttrigger_on_off_time', True),
                        ('jcrcontenttrigger_receive', True),
                        ('jcrcontenttrigger_specific', True),
                        ('jcrcontentuser_id', 'jcrcontentuser_id_example'),
                        ('jcrprimary_type', 'jcrprimary_type_example'),
                        ('operation', 'operation_example')]
        response = self.client.open(
            '//etc/replication/agents.{runmode}/{name}'.format(runmode='runmode_example', name='name_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_authorizable_keystore(self):
        """Test case for post_authorizable_keystore

        
        """
        query_string = [('operation', 'operation_example'),
                        ('current_password', 'current_password_example'),
                        ('new_password', 'new_password_example'),
                        ('re_password', 're_password_example'),
                        ('key_password', 'key_password_example'),
                        ('key_store_pass', 'key_store_pass_example'),
                        ('alias', 'alias_example'),
                        ('new_alias', 'new_alias_example'),
                        ('remove_alias', 'remove_alias_example')]
        data = dict(cert_chain=(BytesIO(b'some file data'), 'file.txt'),
                    pk=(BytesIO(b'some file data'), 'file.txt'),
                    key_store=(BytesIO(b'some file data'), 'file.txt'))
        response = self.client.open(
            '//{intermediatePath}/{authorizableId}.ks.html'.format(intermediate_path='intermediate_path_example', authorizable_id='authorizable_id_example'),
            method='POST',
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_authorizables(self):
        """Test case for post_authorizables

        
        """
        query_string = [('authorizable_id', 'authorizable_id_example'),
                        ('intermediate_path', 'intermediate_path_example'),
                        ('create_user', 'create_user_example'),
                        ('create_group', 'create_group_example'),
                        ('reppassword', 'reppassword_example'),
                        ('profilegiven_name', 'profilegiven_name_example')]
        response = self.client.open(
            '//libs/granite/security/post/authorizables',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_adobe_granite_saml_authentication_handler(self):
        """Test case for post_config_adobe_granite_saml_authentication_handler

        
        """
        query_string = [('key_store_password', 'key_store_password_example'),
                        ('key_store_password_type_hint', 'key_store_password_type_hint_example'),
                        ('service_ranking', 56),
                        ('service_ranking_type_hint', 'service_ranking_type_hint_example'),
                        ('idp_http_redirect', True),
                        ('idp_http_redirect_type_hint', 'idp_http_redirect_type_hint_example'),
                        ('create_user', True),
                        ('create_user_type_hint', 'create_user_type_hint_example'),
                        ('default_redirect_url', 'default_redirect_url_example'),
                        ('default_redirect_url_type_hint', 'default_redirect_url_type_hint_example'),
                        ('user_id_attribute', 'user_id_attribute_example'),
                        ('user_id_attribute_type_hint', 'user_id_attribute_type_hint_example'),
                        ('default_groups', 'default_groups_example'),
                        ('default_groups_type_hint', 'default_groups_type_hint_example'),
                        ('idp_cert_alias', 'idp_cert_alias_example'),
                        ('idp_cert_alias_type_hint', 'idp_cert_alias_type_hint_example'),
                        ('add_group_memberships', True),
                        ('add_group_memberships_type_hint', 'add_group_memberships_type_hint_example'),
                        ('path', 'path_example'),
                        ('path_type_hint', 'path_type_hint_example'),
                        ('synchronize_attributes', 'synchronize_attributes_example'),
                        ('synchronize_attributes_type_hint', 'synchronize_attributes_type_hint_example'),
                        ('clock_tolerance', 56),
                        ('clock_tolerance_type_hint', 'clock_tolerance_type_hint_example'),
                        ('group_membership_attribute', 'group_membership_attribute_example'),
                        ('group_membership_attribute_type_hint', 'group_membership_attribute_type_hint_example'),
                        ('idp_url', 'idp_url_example'),
                        ('idp_url_type_hint', 'idp_url_type_hint_example'),
                        ('logout_url', 'logout_url_example'),
                        ('logout_url_type_hint', 'logout_url_type_hint_example'),
                        ('service_provider_entity_id', 'service_provider_entity_id_example'),
                        ('service_provider_entity_id_type_hint', 'service_provider_entity_id_type_hint_example'),
                        ('assertion_consumer_service_url', 'assertion_consumer_service_url_example'),
                        ('assertion_consumer_service_url_type_hint', 'assertion_consumer_service_url_type_hint_example'),
                        ('handle_logout', True),
                        ('handle_logout_type_hint', 'handle_logout_type_hint_example'),
                        ('sp_private_key_alias', 'sp_private_key_alias_example'),
                        ('sp_private_key_alias_type_hint', 'sp_private_key_alias_type_hint_example'),
                        ('use_encryption', True),
                        ('use_encryption_type_hint', 'use_encryption_type_hint_example'),
                        ('name_id_format', 'name_id_format_example'),
                        ('name_id_format_type_hint', 'name_id_format_type_hint_example'),
                        ('digest_method', 'digest_method_example'),
                        ('digest_method_type_hint', 'digest_method_type_hint_example'),
                        ('signature_method', 'signature_method_example'),
                        ('signature_method_type_hint', 'signature_method_type_hint_example'),
                        ('user_intermediate_path', 'user_intermediate_path_example'),
                        ('user_intermediate_path_type_hint', 'user_intermediate_path_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_apache_felix_jetty_based_http_service(self):
        """Test case for post_config_apache_felix_jetty_based_http_service

        
        """
        query_string = [('org_apache_felix_https_nio', True),
                        ('org_apache_felix_https_nio_type_hint', 'org_apache_felix_https_nio_type_hint_example'),
                        ('org_apache_felix_https_keystore', 'org_apache_felix_https_keystore_example'),
                        ('org_apache_felix_https_keystore_type_hint', 'org_apache_felix_https_keystore_type_hint_example'),
                        ('org_apache_felix_https_keystore_password', 'org_apache_felix_https_keystore_password_example'),
                        ('org_apache_felix_https_keystore_password_type_hint', 'org_apache_felix_https_keystore_password_type_hint_example'),
                        ('org_apache_felix_https_keystore_key', 'org_apache_felix_https_keystore_key_example'),
                        ('org_apache_felix_https_keystore_key_type_hint', 'org_apache_felix_https_keystore_key_type_hint_example'),
                        ('org_apache_felix_https_keystore_key_password', 'org_apache_felix_https_keystore_key_password_example'),
                        ('org_apache_felix_https_keystore_key_password_type_hint', 'org_apache_felix_https_keystore_key_password_type_hint_example'),
                        ('org_apache_felix_https_truststore', 'org_apache_felix_https_truststore_example'),
                        ('org_apache_felix_https_truststore_type_hint', 'org_apache_felix_https_truststore_type_hint_example'),
                        ('org_apache_felix_https_truststore_password', 'org_apache_felix_https_truststore_password_example'),
                        ('org_apache_felix_https_truststore_password_type_hint', 'org_apache_felix_https_truststore_password_type_hint_example'),
                        ('org_apache_felix_https_clientcertificate', 'org_apache_felix_https_clientcertificate_example'),
                        ('org_apache_felix_https_clientcertificate_type_hint', 'org_apache_felix_https_clientcertificate_type_hint_example'),
                        ('org_apache_felix_https_enable', True),
                        ('org_apache_felix_https_enable_type_hint', 'org_apache_felix_https_enable_type_hint_example'),
                        ('org_osgi_service_http_port_secure', 'org_osgi_service_http_port_secure_example'),
                        ('org_osgi_service_http_port_secure_type_hint', 'org_osgi_service_http_port_secure_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/org.apache.felix.http',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_apache_http_components_proxy_configuration(self):
        """Test case for post_config_apache_http_components_proxy_configuration

        
        """
        query_string = [('proxy_host', 'proxy_host_example'),
                        ('proxy_host_type_hint', 'proxy_host_type_hint_example'),
                        ('proxy_port', 56),
                        ('proxy_port_type_hint', 'proxy_port_type_hint_example'),
                        ('proxy_exceptions', 'proxy_exceptions_example'),
                        ('proxy_exceptions_type_hint', 'proxy_exceptions_type_hint_example'),
                        ('proxy_enabled', True),
                        ('proxy_enabled_type_hint', 'proxy_enabled_type_hint_example'),
                        ('proxy_user', 'proxy_user_example'),
                        ('proxy_user_type_hint', 'proxy_user_type_hint_example'),
                        ('proxy_password', 'proxy_password_example'),
                        ('proxy_password_type_hint', 'proxy_password_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/org.apache.http.proxyconfigurator.config',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_apache_sling_dav_ex_servlet(self):
        """Test case for post_config_apache_sling_dav_ex_servlet

        
        """
        query_string = [('alias', 'alias_example'),
                        ('alias_type_hint', 'alias_type_hint_example'),
                        ('dav_create_absolute_uri', True),
                        ('dav_create_absolute_uri_type_hint', 'dav_create_absolute_uri_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_apache_sling_get_servlet(self):
        """Test case for post_config_apache_sling_get_servlet

        
        """
        query_string = [('json_maximumresults', 'json_maximumresults_example'),
                        ('json_maximumresults_type_hint', 'json_maximumresults_type_hint_example'),
                        ('enable_html', True),
                        ('enable_html_type_hint', 'enable_html_type_hint_example'),
                        ('enable_txt', True),
                        ('enable_txt_type_hint', 'enable_txt_type_hint_example'),
                        ('enable_xml', True),
                        ('enable_xml_type_hint', 'enable_xml_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_apache_sling_referrer_filter(self):
        """Test case for post_config_apache_sling_referrer_filter

        
        """
        query_string = [('allow_empty', True),
                        ('allow_empty_type_hint', 'allow_empty_type_hint_example'),
                        ('allow_hosts', 'allow_hosts_example'),
                        ('allow_hosts_type_hint', 'allow_hosts_type_hint_example'),
                        ('allow_hosts_regexp', 'allow_hosts_regexp_example'),
                        ('allow_hosts_regexp_type_hint', 'allow_hosts_regexp_type_hint_example'),
                        ('filter_methods', 'filter_methods_example'),
                        ('filter_methods_type_hint', 'filter_methods_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/org.apache.sling.security.impl.ReferrerFilter',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_node(self):
        """Test case for post_node

        
        """
        query_string = [('operation', 'operation_example'),
                        ('delete_authorizable', 'delete_authorizable_example')]
        data = dict(file=(BytesIO(b'some file data'), 'file.txt'))
        response = self.client.open(
            '//{path}/{name}'.format(path='path_example', name='name_example'),
            method='POST',
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_node_rw(self):
        """Test case for post_node_rw

        
        """
        query_string = [('add_members', 'add_members_example')]
        response = self.client.open(
            '//{path}/{name}.rw.html'.format(path='path_example', name='name_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_path(self):
        """Test case for post_path

        
        """
        query_string = [('jcrprimary_type', 'jcrprimary_type_example'),
                        ('name', 'name_example')]
        response = self.client.open(
            '//{path}/'.format(path='path_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_query(self):
        """Test case for post_query

        
        """
        query_string = [('path', 'path_example'),
                        ('p_limit', 3.4),
                        ('_1_property', '_1_property_example'),
                        ('_1_property_value', '_1_property_value_example')]
        response = self.client.open(
            '//bin/querybuilder.json',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_tree_activation(self):
        """Test case for post_tree_activation

        
        """
        query_string = [('ignoredeactivated', True),
                        ('onlymodified', True),
                        ('path', 'path_example')]
        response = self.client.open(
            '//etc/replication/treeactivation.html',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_truststore(self):
        """Test case for post_truststore

        
        """
        query_string = [('operation', 'operation_example'),
                        ('new_password', 'new_password_example'),
                        ('re_password', 're_password_example'),
                        ('key_store_type', 'key_store_type_example'),
                        ('remove_alias', 'remove_alias_example')]
        data = dict(certificate=(BytesIO(b'some file data'), 'file.txt'))
        response = self.client.open(
            '//libs/granite/security/post/truststore',
            method='POST',
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_truststore_pkcs12(self):
        """Test case for post_truststore_pkcs12

        
        """
        data = dict(truststore_p12=(BytesIO(b'some file data'), 'file.txt'))
        response = self.client.open(
            '//etc/truststore',
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
