# swaggeraem.CqApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_cq_actions**](CqApi.md#post_cq_actions) | **POST** /.cqactions.html | 


# **post_cq_actions**
> post_cq_actions(authorizable_id, changelog)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.CqApi()
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
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

