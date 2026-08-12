import unittest
import swaggeraem
from swaggeraem.api import custom_api

class TestHealthCheck(unittest.TestCase):

    def test_get_aem_health_check(self):

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
              assert api_response is not None
          except swaggeraem.ApiException as e:
              self.fail('Exception when calling CustomApi->get_aem_health_check: %s\n' % e)
