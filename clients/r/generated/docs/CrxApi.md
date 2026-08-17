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


api_instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetCrxdeStatus(data_file = "result.txt")
result <- api_instance$GetCrxdeStatus()
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


api_instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetInstallStatus(data_file = "result.txt")
result <- api_instance$GetInstallStatus()
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


api_instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$GetPackageManagerServlet()
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

# prepare function argument(s)
var_cmd <- "cmd_example" # character | 

api_instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostPackageService(var_cmddata_file = "result.txt")
result <- api_instance$PostPackageService(var_cmd)
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
> character PostPackageServiceJson(path, cmd, group_name = var.group_name, package_name = var.package_name, package_version = var.package_version, _charset_ = var._charset_, force = var.force, recursive = var.recursive, package = var.package)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_cmd <- "cmd_example" # character | 
var_group_name <- "group_name_example" # character |  (Optional)
var_package_name <- "package_name_example" # character |  (Optional)
var_package_version <- "package_version_example" # character |  (Optional)
var__charset_ <- "_charset__example" # character |  (Optional)
var_force <- "force_example" # character |  (Optional)
var_recursive <- "recursive_example" # character |  (Optional)
var_package <- File.new('/path/to/file') # data.frame |  (Optional)

api_instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostPackageServiceJson(var_path, var_cmd, group_name = var_group_name, package_name = var_package_name, package_version = var_package_version, _charset_ = var__charset_, force = var_force, recursive = var_recursive, package = var_packagedata_file = "result.txt")
result <- api_instance$PostPackageServiceJson(var_path, var_cmd, group_name = var_group_name, package_name = var_package_name, package_version = var_package_version, _charset_ = var__charset_, force = var_force, recursive = var_recursive, package = var_package)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **cmd** | **character**|  | 
 **group_name** | **character**|  | [optional] 
 **package_name** | **character**|  | [optional] 
 **package_version** | **character**|  | [optional] 
 **_charset_** | **character**|  | [optional] 
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
> character PostPackageUpdate(group_name, package_name, version, path, filter = var.filter, _charset_ = var._charset_)



### Example
```R
library(openapi)

# prepare function argument(s)
var_group_name <- "group_name_example" # character | 
var_package_name <- "package_name_example" # character | 
var_version <- "version_example" # character | 
var_path <- "path_example" # character | 
var_filter <- "filter_example" # character |  (Optional)
var__charset_ <- "_charset__example" # character |  (Optional)

api_instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostPackageUpdate(var_group_name, var_package_name, var_version, var_path, filter = var_filter, _charset_ = var__charset_data_file = "result.txt")
result <- api_instance$PostPackageUpdate(var_group_name, var_package_name, var_version, var_path, filter = var_filter, _charset_ = var__charset_)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_name** | **character**|  | 
 **package_name** | **character**|  | 
 **version** | **character**|  | 
 **path** | **character**|  | 
 **filter** | **character**|  | [optional] 
 **_charset_** | **character**|  | [optional] 

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

# prepare function argument(s)
var_old <- "old_example" # character | 
var_plain <- "plain_example" # character | 
var_verify <- "verify_example" # character | 

api_instance <- CrxApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostSetPassword(var_old, var_plain, var_verifydata_file = "result.txt")
result <- api_instance$PostSetPassword(var_old, var_plain, var_verify)
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

