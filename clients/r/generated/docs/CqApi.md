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


api_instance <- CqApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetLoginPage(data_file = "result.txt")
result <- api_instance$GetLoginPage()
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
> PostCqActions(authorizable_id, changelog)



### Example
```R
library(openapi)

# prepare function argument(s)
var_authorizable_id <- "authorizable_id_example" # character | 
var_changelog <- "changelog_example" # character | 

api_instance <- CqApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostCqActions(var_authorizable_id, var_changelog)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **character**|  | 
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

