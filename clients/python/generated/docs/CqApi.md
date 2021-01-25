# swaggeraem.CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_login_page**](CqApi.md#get_login_page) | **GET** /libs/granite/core/content/login.html | 
[**post_cq_actions**](CqApi.md#post_cq_actions) | **POST** /.cqactions.html | 


# **get_login_page**
> str get_login_page()



### Example

```python
import time
import swaggeraem
from swaggeraem.api import cq_api
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with swaggeraem.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = cq_api.CqApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_login_page()
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CqApi->get_login_page: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_cq_actions**
> post_cq_actions(authorizable_id, changelog)



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import cq_api
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cq_api.CqApi(api_client)
    authorizable_id = "authorizableId_example" # str | 
    changelog = "changelog_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        api_instance.post_cq_actions(authorizable_id, changelog)
    except swaggeraem.ApiException as e:
        print("Exception when calling CqApi->post_cq_actions: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **str**|  |
 **changelog** | **str**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

