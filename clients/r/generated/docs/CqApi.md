# CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLoginPage**](CqApi.md#GetLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**PostCqActions**](CqApi.md#PostCqActions) | **POST** /.cqactions.html | 


# **GetLoginPage**
> character GetLoginPage()



### Example
```R
library(openapi)


api.instance <- CqApi$new()
result <- api.instance$GetLoginPage()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**character**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostCqActions**
> PostCqActions(authorizable.id, changelog)



### Example
```R
library(openapi)

var.authorizable.id <- 'authorizable.id_example' # character | 
var.changelog <- 'changelog_example' # character | 

api.instance <- CqApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostCqActions(var.authorizable.id, var.changelog)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable.id** | **character**|  | 
 **changelog** | **character**|  | 

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

