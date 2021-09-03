# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestGraniteController(BaseTestCase):
    """GraniteController integration test stubs"""

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_ssl_setup(self):
        """Test case for ssl_setup

        
        """
        query_string = [('keystorePassword', 'keystore_password_example'),
                        ('keystorePasswordConfirm', 'keystore_password_confirm_example'),
                        ('truststorePassword', 'truststore_password_example'),
                        ('truststorePasswordConfirm', 'truststore_password_confirm_example'),
                        ('httpsHostname', 'https_hostname_example'),
                        ('httpsPort', 'https_port_example')]
        headers = { 
            'Accept': 'text/plain',
            'Content-Type': 'multipart/form-data',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        data = dict(privatekey_file='/path/to/file',
                    certificate_file='/path/to/file')
        response = self.client.open(
            '/libs/granite/security/post/sslSetup.html',
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
