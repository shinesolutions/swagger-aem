import helper
import swaggeraem
from swaggeraem.rest import ApiException
import unittest

class TestClientApiCall(unittest.TestCase):

    def setUp(self):
        swaggeraem.configuration.username = 'someinexistingusername'
        swaggeraem.configuration.password = 'someinexistingpassword'
        client = swaggeraem.ApiClient('http://localhost:4502')
        self.sling = swaggeraem.apis.SlingApi(helper.init_client())

    def test_should_error_when_credential_is_incorrect(self):
        try:
            self.sling.post_tree_activation_with_http_info(True, False, '/etc/designs/geometrixx')
        except ApiException as err:
            self.assertEqual(err.status, 401)
