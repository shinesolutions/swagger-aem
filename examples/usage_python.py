import swaggeraem
from swaggeraem.api import custom_api

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost:4502",
    username = "admin",
    password = "admin"
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_api.CustomApi(api_client)

    try:
        # Get AEM health check
        api_response = api_instance.get_aem_health_check()
        print("The response of CustomApi->get_aem_health_check:\n")
        print(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CustomApi->get_aem_health_check: %s\n" % e)
        raise
