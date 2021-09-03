# CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCrxdeStatus**](CrxApi.md#GetCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**GetInstallStatus**](CrxApi.md#GetInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**GetPackageManagerServlet**](CrxApi.md#GetPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**PostPackageService**](CrxApi.md#PostPackageService) | **POST** /crx/packmgr/service.jsp | 
[**PostPackageServiceJson**](CrxApi.md#PostPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**PostPackageUpdate**](CrxApi.md#PostPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**PostSetPassword**](CrxApi.md#PostSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **GetCrxdeStatus**
> character GetCrxdeStatus()



### Example
```R
library(openapi)


api.instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetCrxdeStatus()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CRXDE is enabled |  -  |
| **404** | CRXDE is disabled |  -  |

# **GetInstallStatus**
> InstallStatus GetInstallStatus()



### Example
```R
library(openapi)


api.instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetInstallStatus()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved CRX package manager install status |  -  |
| **0** | Default response |  -  |

# **GetPackageManagerServlet**
> GetPackageManagerServlet()



### Example
```R
library(openapi)


api.instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$GetPackageManagerServlet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Package Manager Servlet is disabled |  -  |
| **405** | Package Manager Servlet is active |  -  |

# **PostPackageService**
> character PostPackageService(cmd)



### Example
```R
library(openapi)

var.cmd <- 'cmd_example' # character | 

api.instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostPackageService(var.cmd)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostPackageServiceJson**
> character PostPackageServiceJson(path, cmd, group.name=var.group.name, package.name=var.package.name, package.version=var.package.version, .charset.=var..charset., force=var.force, recursive=var.recursive, package=var.package)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.cmd <- 'cmd_example' # character | 
var.group.name <- 'group.name_example' # character | 
var.package.name <- 'package.name_example' # character | 
var.package.version <- 'package.version_example' # character | 
var..charset. <- '.charset._example' # character | 
var.force <- 'force_example' # character | 
var.recursive <- 'recursive_example' # character | 
var.package <- File.new('/path/to/file') # data.frame | 

api.instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostPackageServiceJson(var.path, var.cmd, group.name=var.group.name, package.name=var.package.name, package.version=var.package.version, .charset.=var..charset., force=var.force, recursive=var.recursive, package=var.package)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **cmd** | **character**|  | 
 **group.name** | **character**|  | [optional] 
 **package.name** | **character**|  | [optional] 
 **package.version** | **character**|  | [optional] 
 **.charset.** | **character**|  | [optional] 
 **force** | **character**|  | [optional] 
 **recursive** | **character**|  | [optional] 
 **package** | **data.frame**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostPackageUpdate**
> character PostPackageUpdate(group.name, package.name, version, path, filter=var.filter, .charset.=var..charset.)



### Example
```R
library(openapi)

var.group.name <- 'group.name_example' # character | 
var.package.name <- 'package.name_example' # character | 
var.version <- 'version_example' # character | 
var.path <- 'path_example' # character | 
var.filter <- 'filter_example' # character | 
var..charset. <- '.charset._example' # character | 

api.instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostPackageUpdate(var.group.name, var.package.name, var.version, var.path, filter=var.filter, .charset.=var..charset.)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group.name** | **character**|  | 
 **package.name** | **character**|  | 
 **version** | **character**|  | 
 **path** | **character**|  | 
 **filter** | **character**|  | [optional] 
 **.charset.** | **character**|  | [optional] 

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

# **PostSetPassword**
> character PostSetPassword(old, plain, verify)



### Example
```R
library(openapi)

var.old <- 'old_example' # character | 
var.plain <- 'plain_example' # character | 
var.verify <- 'verify_example' # character | 

api.instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostSetPassword(var.old, var.plain, var.verify)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **character**|  | 
 **plain** | **character**|  | 
 **verify** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

