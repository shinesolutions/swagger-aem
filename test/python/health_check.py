import unittest
from unittest.mock import patch
import urllib3
import swaggeraem
from swaggeraem.api import custom_api

class TestHealthCheck(unittest.TestCase):

    @patch.object(urllib3.PoolManager, 'request')
    def test_get_aem_health_check(self, mock_request):

      # Stub the underlying HTTP call so no real AEM server is needed
      mock_request.return_value = urllib3.HTTPResponse(
          body=b'"OK"',
          status=200,
          headers={'Content-Type': 'application/json'}
      )

      configuration = swaggeraem.Configuration(
          host = "http://localhost:4502",
          username = "admin",
          password = "admin"
      )

      with swaggeraem.ApiClient(configuration) as api_client:

          api_instance = custom_api.CustomApi(api_client)

          try:
              api_response = api_instance.get_aem_health_check()
              print("The response of CustomApi->get_aem_health_check:\n")
              print(api_response)
              assert api_response == 'OK'
              method, url = mock_request.call_args[0]
              assert method == 'GET'
              assert url.endswith('/system/health')
          except swaggeraem.ApiException as e:
              self.fail('Exception when calling CustomApi->get_aem_health_check: %s\n' % e)
