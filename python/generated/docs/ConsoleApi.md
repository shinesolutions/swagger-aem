# swaggeraem.ConsoleApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 


# **post_bundle**
> post_bundle(name, action)



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
api_instance = swaggeraem.ConsoleApi()
name = 'name_example' # str | 
action = 'action_example' # str | 

try: 
    api_instance.post_bundle(name, action)
except ApiException as e:
    print("Exception when calling ConsoleApi->post_bundle: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 
 **action** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_jmx_repository**
> post_jmx_repository(action)



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
api_instance = swaggeraem.ConsoleApi()
action = 'action_example' # str | 

try: 
    api_instance.post_jmx_repository(action)
except ApiException as e:
    print("Exception when calling ConsoleApi->post_jmx_repository: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

