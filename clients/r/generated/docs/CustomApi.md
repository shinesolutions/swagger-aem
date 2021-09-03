# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemHealthCheck**](CustomApi.md#GetAemHealthCheck) | **GET** /system/health | 
[**PostConfigAemHealthCheckServlet**](CustomApi.md#PostConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**PostConfigAemPasswordReset**](CustomApi.md#PostConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **GetAemHealthCheck**
> character GetAemHealthCheck(tags=var.tags, combine.tags.or=var.combine.tags.or)



### Example
```R
library(openapi)

var.tags <- 'tags_example' # character | 
var.combine.tags.or <- 'combine.tags.or_example' # character | 

api.instance <- CustomApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetAemHealthCheck(tags=var.tags, combine.tags.or=var.combine.tags.or)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **character**|  | [optional] 
 **combine.tags.or** | **character**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigAemHealthCheckServlet**
> PostConfigAemHealthCheckServlet(bundles.ignored=var.bundles.ignored, bundles.ignored.type.hint=var.bundles.ignored.type.hint)



### Example
```R
library(openapi)

var.bundles.ignored <- list("inner_example") # array[character] | 
var.bundles.ignored.type.hint <- 'bundles.ignored.type.hint_example' # character | 

api.instance <- CustomApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigAemHealthCheckServlet(bundles.ignored=var.bundles.ignored, bundles.ignored.type.hint=var.bundles.ignored.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundles.ignored** | list( **character** )|  | [optional] 
 **bundles.ignored.type.hint** | **character**|  | [optional] 

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
| **0** | Default response |  -  |

# **PostConfigAemPasswordReset**
> PostConfigAemPasswordReset(pwdreset.authorizables=var.pwdreset.authorizables, pwdreset.authorizables.type.hint=var.pwdreset.authorizables.type.hint)



### Example
```R
library(openapi)

var.pwdreset.authorizables <- list("inner_example") # array[character] | 
var.pwdreset.authorizables.type.hint <- 'pwdreset.authorizables.type.hint_example' # character | 

api.instance <- CustomApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigAemPasswordReset(pwdreset.authorizables=var.pwdreset.authorizables, pwdreset.authorizables.type.hint=var.pwdreset.authorizables.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdreset.authorizables** | list( **character** )|  | [optional] 
 **pwdreset.authorizables.type.hint** | **character**|  | [optional] 

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
| **0** | Default response |  -  |

