# CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_crxde_status**](CrxApi.md#get_crxde_status) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**get_install_status**](CrxApi.md#get_install_status) | **GET** /crx/packmgr/installstatus.jsp | 
[**get_package_manager_servlet**](CrxApi.md#get_package_manager_servlet) | **GET** /crx/packmgr/service/script.html | 
[**post_package_service**](CrxApi.md#post_package_service) | **POST** /crx/packmgr/service.jsp | 
[**post_package_service_json**](CrxApi.md#post_package_service_json) | **POST** /crx/packmgr/service/.json/{path} | 
[**post_package_update**](CrxApi.md#post_package_update) | **POST** /crx/packmgr/update.jsp | 
[**post_set_password**](CrxApi.md#post_set_password) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **get_crxde_status**
> `get_crxde_status`(req::`HTTP.Request`;) -> `String`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_install_status**
> `get_install_status`(req::`HTTP.Request`;) -> `InstallStatus`



### Required Parameters
This endpoint does not need any parameter.

### Return type

[**`InstallStatus`**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_manager_servlet**
> `get_package_manager_servlet`(req::`HTTP.Request`;) -> `Nothing`



### Required Parameters
This endpoint does not need any parameter.

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service**
> `post_package_service`(req::`HTTP.Request`, `cmd`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`cmd`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service_json**
> `post_package_service_json`(req::`HTTP.Request`, `path`::`String`, `cmd`::`String`; `group_name`=nothing, `package_name`=nothing, `package_version`=nothing, `charset`=nothing, `force`=nothing, `recursive`=nothing, `package`=nothing,) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`cmd`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`group_name`** | **`String`**|  | [default to nothing]
 **`package_name`** | **`String`**|  | [default to nothing]
 **`package_version`** | **`String`**|  | [default to nothing]
 **`charset`** | **`String`**|  | [default to nothing]
 **`force`** | **`Bool`**|  | [default to nothing]
 **`recursive`** | **`Bool`**|  | [default to nothing]
 **`package`** | **`Vector{UInt8}`**|  | 

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_update**
> `post_package_update`(req::`HTTP.Request`, `group_name`::`String`, `package_name`::`String`, `version`::`String`, `path`::`String`; `filter`=nothing, `charset`=nothing,) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`group_name`** | **`String`**|  |
**`package_name`** | **`String`**|  |
**`version`** | **`String`**|  |
**`path`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`filter`** | **`String`**|  | [default to nothing]
 **`charset`** | **`String`**|  | [default to nothing]

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_set_password**
> `post_set_password`(req::`HTTP.Request`, `old`::`String`, `plain`::`String`, `verify`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`old`** | **`String`**|  |
**`plain`** | **`String`**|  |
**`verify`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

