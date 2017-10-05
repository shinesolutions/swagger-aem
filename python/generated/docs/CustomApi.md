# swaggeraem.CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_health_check**](CustomApi.md#get_aem_health_check) | **GET** /system/health | 
[**post_config_aem_health_check_servlet**](CustomApi.md#post_config_aem_health_check_servlet) | **POST** /apps/system/config.{runmode}/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**post_config_aem_password_reset**](CustomApi.md#post_config_aem_password_reset) | **POST** /apps/system/config.{runmode}/com.shinesolutions.aem.passwordreset.Activator | 


# **get_aem_health_check**
> str get_aem_health_check(tags=tags, combine_tags_or=combine_tags_or)



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
api_instance = swaggeraem.CustomApi(swaggeraem.ApiClient(configuration))
tags = 'tags_example' # str |  (optional)
combine_tags_or = true # bool |  (optional)

try: 
    api_response = api_instance.get_aem_health_check(tags=tags, combine_tags_or=combine_tags_or)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomApi->get_aem_health_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **str**|  | [optional] 
 **combine_tags_or** | **bool**|  | [optional] 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_health_check_servlet**
> post_config_aem_health_check_servlet(runmode, bundles_ignored=bundles_ignored, bundles_ignored_type_hint=bundles_ignored_type_hint)



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
api_instance = swaggeraem.CustomApi(swaggeraem.ApiClient(configuration))
runmode = 'runmode_example' # str | 
bundles_ignored = ['bundles_ignored_example'] # list[str] |  (optional)
bundles_ignored_type_hint = 'bundles_ignored_type_hint_example' # str |  (optional)

try: 
    api_instance.post_config_aem_health_check_servlet(runmode, bundles_ignored=bundles_ignored, bundles_ignored_type_hint=bundles_ignored_type_hint)
except ApiException as e:
    print("Exception when calling CustomApi->post_config_aem_health_check_servlet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 
 **bundles_ignored** | [**list[str]**](str.md)|  | [optional] 
 **bundles_ignored_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_password_reset**
> post_config_aem_password_reset(runmode, pwdreset_authorizables=pwdreset_authorizables, pwdreset_authorizables_type_hint=pwdreset_authorizables_type_hint)



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
api_instance = swaggeraem.CustomApi(swaggeraem.ApiClient(configuration))
runmode = 'runmode_example' # str | 
pwdreset_authorizables = ['pwdreset_authorizables_example'] # list[str] |  (optional)
pwdreset_authorizables_type_hint = 'pwdreset_authorizables_type_hint_example' # str |  (optional)

try: 
    api_instance.post_config_aem_password_reset(runmode, pwdreset_authorizables=pwdreset_authorizables, pwdreset_authorizables_type_hint=pwdreset_authorizables_type_hint)
except ApiException as e:
    print("Exception when calling CustomApi->post_config_aem_password_reset: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 
 **pwdreset_authorizables** | [**list[str]**](str.md)|  | [optional] 
 **pwdreset_authorizables_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

