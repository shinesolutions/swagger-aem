# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from openapi_server.test import BaseTestCase


class TestGraniteController(BaseTestCase):
    """GraniteController integration test stubs"""

    def test_ssl_setup(self):
        """Test case for ssl_setup

        
        """
        query_string = [('keystore_password', 'keystore_password_example'),
                        ('keystore_password_confirm', 'keystore_password_confirm_example'),
                        ('truststore_password', 'truststore_password_example'),
                        ('truststore_password_confirm', 'truststore_password_confirm_example'),
                        ('https_hostname', 'https_hostname_example'),
                        ('https_port', 'https_port_example')]
        data = dict(privatekey_file='/path/to/file',
                    certificate_file='/path/to/file')
        response = self.client.open(
            '/libs/granite/security/post/sslSetup.html',
            method='POST',
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
