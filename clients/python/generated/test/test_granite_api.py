# coding: utf-8

"""
    Adobe Experience Manager (AEM) API

    Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API  # noqa: E501

    The version of the OpenAPI document: 3.4.0-pre.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import swaggeraem
from swaggeraem.api.granite_api import GraniteApi  # noqa: E501
from swaggeraem.rest import ApiException


class TestGraniteApi(unittest.TestCase):
    """GraniteApi unit test stubs"""

    def setUp(self):
        self.api = swaggeraem.api.granite_api.GraniteApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_ssl_setup(self):
        """Test case for ssl_setup

        """
        pass


if __name__ == '__main__':
    unittest.main()
