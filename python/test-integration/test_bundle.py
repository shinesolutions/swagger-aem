import helper
import swaggeraem
import unittest

class TestBundleStop(unittest.TestCase):

    def setUp(self):
        self.console = swaggeraem.apis.ConsoleApi(helper.init_client())

    def test_should_succeed_when_bundle_exists(self):
        response = self.console.post_bundle_with_http_info('com.adobe.cq.social.cq-social-forum', 'stop')
        self.assertEqual(response[1], 200)

class TestBundleStart(unittest.TestCase):

    def setUp(self):
        self.console = swaggeraem.apis.ConsoleApi(helper.init_client())

    def test_should_succeed_when_bundle_exists(self):
        response = self.console.post_bundle_with_http_info('com.adobe.cq.social.cq-social-forum', 'start')
        self.assertEqual(response[1], 200)
