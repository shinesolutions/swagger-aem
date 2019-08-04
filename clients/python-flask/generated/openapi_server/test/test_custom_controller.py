# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestCustomController(BaseTestCase):
    """CustomController integration test stubs"""

    def test_get_aem_health_check(self):
        """Test case for get_aem_health_check

        
        """
        query_string = [('tags', 'tags_example'),
                        ('combine_tags_or', True)]
        response = self.client.open(
            '//system/health',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_aem_health_check_servlet(self):
        """Test case for post_config_aem_health_check_servlet

        
        """
        query_string = [('bundles_ignored', 'bundles_ignored_example'),
                        ('bundles_ignored_type_hint', 'bundles_ignored_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_config_aem_password_reset(self):
        """Test case for post_config_aem_password_reset

        
        """
        query_string = [('pwdreset_authorizables', 'pwdreset_authorizables_example'),
                        ('pwdreset_authorizables_type_hint', 'pwdreset_authorizables_type_hint_example')]
        response = self.client.open(
            '//apps/system/config/com.shinesolutions.aem.passwordreset.Activator',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
