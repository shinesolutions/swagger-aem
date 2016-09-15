import helper
import swaggeraem
from swaggeraem.rest import ApiException
import unittest

class TestBundleStop(unittest.TestCase):

    def setUp(self):
        client = helper.init_client()
        self.console = swaggeraem.apis.ConsoleApi(client)

    def test_should_succeed_when_bundle_exists(self):
        response = self.console.post_bundle_with_http_info('com.adobe.cq.social.cq-social-forum', 'stop')
        self.assertEqual(response[1], 200)

    def test_should_error_when_bundle_does_not_exist(self):
        try:
            self.console.post_bundle_with_http_info('someinexistingbundle', 'stop')
        except ApiException as err:
            self.assertEqual(err.status, 404)

class TestBundleStart(unittest.TestCase):

    def setUp(self):
        self.console = swaggeraem.apis.ConsoleApi(helper.init_client())

    def test_should_succeed_when_bundle_exists(self):
        response = self.console.post_bundle_with_http_info('com.adobe.cq.social.cq-social-forum', 'start')
        self.assertEqual(response[1], 200)

    def test_should_error_when_bundle_does_not_exist(self):
        try:
            self.console.post_bundle_with_http_info('someinexistingbundle', 'start')
        except ApiException as err:
            self.assertEqual(err.status, 404)
