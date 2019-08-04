# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.saml_configuration_info import SamlConfigurationInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConsoleController(BaseTestCase):
    """ConsoleController integration test stubs"""

    def test_get_aem_product_info(self):
        """Test case for get_aem_product_info

        
        """
        response = self.client.open(
            '//system/console/status-productinfo.json',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_config_mgr(self):
        """Test case for get_config_mgr

        
        """
        response = self.client.open(
            '//system/console/configMgr',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_bundle(self):
        """Test case for post_bundle

        
        """
        query_string = [('action', 'action_example')]
        response = self.client.open(
            '//system/console/bundles/{name}'.format(name='name_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_jmx_repository(self):
        """Test case for post_jmx_repository

        
        """
        response = self.client.open(
            '//system/console/jmx/com.adobe.granite:type=Repository/op/{action}'.format(action='action_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_saml_configuration(self):
        """Test case for post_saml_configuration

        
        """
        query_string = [('post', True),
                        ('apply', True),
                        ('delete', True),
                        ('action', 'action_example'),
                        ('location', 'location_example'),
                        ('path', 'path_example'),
                        ('service_ranking', 56),
                        ('idp_url', 'idp_url_example'),
                        ('idp_cert_alias', 'idp_cert_alias_example'),
                        ('idp_http_redirect', True),
                        ('service_provider_entity_id', 'service_provider_entity_id_example'),
                        ('assertion_consumer_service_url', 'assertion_consumer_service_url_example'),
                        ('sp_private_key_alias', 'sp_private_key_alias_example'),
                        ('key_store_password', 'key_store_password_example'),
                        ('default_redirect_url', 'default_redirect_url_example'),
                        ('user_id_attribute', 'user_id_attribute_example'),
                        ('use_encryption', True),
                        ('create_user', True),
                        ('add_group_memberships', True),
                        ('group_membership_attribute', 'group_membership_attribute_example'),
                        ('default_groups', 'default_groups_example'),
                        ('name_id_format', 'name_id_format_example'),
                        ('synchronize_attributes', 'synchronize_attributes_example'),
                        ('handle_logout', True),
                        ('logout_url', 'logout_url_example'),
                        ('clock_tolerance', 56),
                        ('digest_method', 'digest_method_example'),
                        ('signature_method', 'signature_method_example'),
                        ('user_intermediate_path', 'user_intermediate_path_example'),
                        ('propertylist', 'propertylist_example')]
        response = self.client.open(
            '//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
