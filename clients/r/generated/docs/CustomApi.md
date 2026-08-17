# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemHealthCheck**](CustomApi.md#GetAemHealthCheck) | **GET** /system/health | 
[**PostConfigAemHealthCheckServlet**](CustomApi.md#PostConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**PostConfigAemPasswordReset**](CustomApi.md#PostConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **GetAemHealthCheck**
> character GetAemHealthCheck(tags = var.tags, combine_tags_or = var.combine_tags_or)



### Example
```R
library(openapi)

# prepare function argument(s)
var_tags <- "tags_example" # character |  (Optional)
var_combine_tags_or <- "combine_tags_or_example" # character |  (Optional)

api_instance <- CustomApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetAemHealthCheck(tags = var_tags, combine_tags_or = var_combine_tags_ordata_file = "result.txt")
result <- api_instance$GetAemHealthCheck(tags = var_tags, combine_tags_or = var_combine_tags_or)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **character**|  | [optional] 
 **combine_tags_or** | **character**|  | [optional] 

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
> PostConfigAemHealthCheckServlet(bundles_ignored = var.bundles_ignored, bundles_ignored_type_hint = var.bundles_ignored_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_bundles_ignored <- c("inner_example") # array[character] |  (Optional)
var_bundles_ignored_type_hint <- "bundles_ignored_type_hint_example" # character |  (Optional)

api_instance <- CustomApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigAemHealthCheckServlet(bundles_ignored = var_bundles_ignored, bundles_ignored_type_hint = var_bundles_ignored_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundles_ignored** | list( **character** )|  | [optional] 
 **bundles_ignored_type_hint** | **character**|  | [optional] 

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
> PostConfigAemPasswordReset(pwdreset_authorizables = var.pwdreset_authorizables, pwdreset_authorizables_type_hint = var.pwdreset_authorizables_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_pwdreset_authorizables <- c("inner_example") # array[character] |  (Optional)
var_pwdreset_authorizables_type_hint <- "pwdreset_authorizables_type_hint_example" # character |  (Optional)

api_instance <- CustomApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigAemPasswordReset(pwdreset_authorizables = var_pwdreset_authorizables, pwdreset_authorizables_type_hint = var_pwdreset_authorizables_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdreset_authorizables** | list( **character** )|  | [optional] 
 **pwdreset_authorizables_type_hint** | **character**|  | [optional] 

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

