# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.install_status import InstallStatus  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCrxController(BaseTestCase):
    """CrxController integration test stubs"""

    def test_get_crxde_status(self):
        """Test case for get_crxde_status

        
        """
        response = self.client.open(
            '//crx/server/crx.default/jcr:root/.1.json',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_install_status(self):
        """Test case for get_install_status

        
        """
        response = self.client.open(
            '//crx/packmgr/installstatus.jsp',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_package_manager_servlet(self):
        """Test case for get_package_manager_servlet

        
        """
        response = self.client.open(
            '//crx/packmgr/service/script.html',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_package_service(self):
        """Test case for post_package_service

        
        """
        query_string = [('cmd', 'cmd_example')]
        response = self.client.open(
            '//crx/packmgr/service.jsp',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_package_service_json(self):
        """Test case for post_package_service_json

        
        """
        query_string = [('cmd', 'cmd_example'),
                        ('group_name', 'group_name_example'),
                        ('package_name', 'package_name_example'),
                        ('package_version', 'package_version_example'),
                        ('charset_', 'charset__example'),
                        ('force', True),
                        ('recursive', True)]
        data = dict(package=(BytesIO(b'some file data'), 'file.txt'))
        response = self.client.open(
            '//crx/packmgr/service/.json/{path}'.format(path='path_example'),
            method='POST',
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_package_update(self):
        """Test case for post_package_update

        
        """
        query_string = [('group_name', 'group_name_example'),
                        ('package_name', 'package_name_example'),
                        ('version', 'version_example'),
                        ('path', 'path_example'),
                        ('filter', 'filter_example'),
                        ('charset_', 'charset__example')]
        response = self.client.open(
            '//crx/packmgr/update.jsp',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_set_password(self):
        """Test case for post_set_password

        
        """
        query_string = [('old', 'old_example'),
                        ('plain', 'plain_example'),
                        ('verify', 'verify_example')]
        response = self.client.open(
            '//crx/explorer/ui/setpassword.jsp',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
