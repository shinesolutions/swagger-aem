# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestCqController(BaseTestCase):
    """CqController integration test stubs"""

    def test_get_login_page(self):
        """Test case for get_login_page

        
        """
        response = self.client.open(
            '//libs/granite/core/content/login.html',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_cq_actions(self):
        """Test case for post_cq_actions

        
        """
        query_string = [('authorizable_id', 'authorizable_id_example'),
                        ('changelog', 'changelog_example')]
        response = self.client.open(
            '//.cqactions.html',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
