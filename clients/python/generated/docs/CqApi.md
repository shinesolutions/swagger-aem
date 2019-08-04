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
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swaggeraem.CqApi()

try:
    api_response = api_instance.get_login_page()
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_cq_actions**
> post_cq_actions(authorizable_id, changelog)



### Example
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.CqApi(swaggeraem.ApiClient(configuration))
authorizable_id = 'authorizable_id_example' # str | 
changelog = 'changelog_example' # str | 

try:
    api_instance.post_cq_actions(authorizable_id, changelog)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

