import helper
import swaggeraem
from swaggeraem.rest import ApiException
import unittest

class TestUser(unittest.TestCase):

    def setUp(self):
        client = helper.init_client()
        self.console = swaggeraem.apis.ConsoleApi(client)
        self.cq = swaggeraem.apis.CqApi(client)
        self.crx = swaggeraem.apis.CrxApi(client)

    # def test_should_succeed_when_(self):
        # response = self.console.post_bundle_with_http_info('com.adobe.cq.social.cq-social-forum', 'stop')
        # self.assertEqual(response[1], 200)

    # def test_should_error_when_(self):
        # try:
        #     self.console.post_bundle_with_http_info('someinexistingbundle', 'stop')
        # except ApiException as err:
        #     self.assertEqual(err.status, 404)
