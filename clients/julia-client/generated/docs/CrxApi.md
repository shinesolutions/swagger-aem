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
> `get_crxde_status`(_api::`CrxApi`; _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_crxde_status`(_api::`CrxApi`, response_stream::`Channel`; _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_install_status**
> `get_install_status`(_api::`CrxApi`; _mediaType=nothing) -> `InstallStatus`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_install_status`(_api::`CrxApi`, response_stream::`Channel`; _mediaType=nothing) -> `Channel`{ `InstallStatus` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters
This endpoint does not need any parameter.

### Return type

[**`InstallStatus`**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_package_manager_servlet**
> `get_package_manager_servlet`(_api::`CrxApi`; _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_package_manager_servlet`(_api::`CrxApi`, response_stream::`Channel`; _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters
This endpoint does not need any parameter.

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_package_service**
> `post_package_service`(_api::`CrxApi`, `cmd`::`String`; _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_package_service`(_api::`CrxApi`, response_stream::`Channel`, `cmd`::`String`; _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CrxApi`** | API context | 
**`cmd`** | **`String`** |  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_package_service_json**
> `post_package_service_json`(_api::`CrxApi`, `path`::`String`, `cmd`::`String`; `group_name`=nothing, `package_name`=nothing, `package_version`=nothing, `charset`=nothing, `force`=nothing, `recursive`=nothing, `package`=nothing, _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_package_service_json`(_api::`CrxApi`, response_stream::`Channel`, `path`::`String`, `cmd`::`String`; `group_name`=nothing, `package_name`=nothing, `package_version`=nothing, `charset`=nothing, `force`=nothing, `recursive`=nothing, `package`=nothing, _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CrxApi`** | API context | 
**`path`** | **`String`** |  |
**`cmd`** | **`String`** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`group_name`** | **`String`** |  | [default to nothing]
 **`package_name`** | **`String`** |  | [default to nothing]
 **`package_version`** | **`String`** |  | [default to nothing]
 **`charset`** | **`String`** |  | [default to nothing]
 **`force`** | **`Bool`** |  | [default to nothing]
 **`recursive`** | **`Bool`** |  | [default to nothing]
 **`package`** | **`String`** |  | 

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_package_update**
> `post_package_update`(_api::`CrxApi`, `group_name`::`String`, `package_name`::`String`, `version`::`String`, `path`::`String`; `filter`=nothing, `charset`=nothing, _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_package_update`(_api::`CrxApi`, response_stream::`Channel`, `group_name`::`String`, `package_name`::`String`, `version`::`String`, `path`::`String`; `filter`=nothing, `charset`=nothing, _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CrxApi`** | API context | 
**`group_name`** | **`String`** |  |
**`package_name`** | **`String`** |  |
**`version`** | **`String`** |  |
**`path`** | **`String`** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`filter`** | **`String`** |  | [default to nothing]
 **`charset`** | **`String`** |  | [default to nothing]

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_set_password**
> `post_set_password`(_api::`CrxApi`, `old`::`String`, `plain`::`String`, `verify`::`String`; _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_set_password`(_api::`CrxApi`, response_stream::`Channel`, `old`::`String`, `plain`::`String`, `verify`::`String`; _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CrxApi`** | API context | 
**`old`** | **`String`** |  |
**`plain`** | **`String`** |  |
**`verify`** | **`String`** |  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

