# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_health_check**](CustomApi.md#get_aem_health_check) | **GET** /system/health | 
[**post_config_aem_health_check_servlet**](CustomApi.md#post_config_aem_health_check_servlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**post_config_aem_password_reset**](CustomApi.md#post_config_aem_password_reset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **get_aem_health_check**
> `get_aem_health_check`(_api::`CustomApi`; `tags`=nothing, `combine_tags_or`=nothing, _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_aem_health_check`(_api::`CustomApi`, response_stream::`Channel`; `tags`=nothing, `combine_tags_or`=nothing, _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CustomApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`tags`** | **`String`** |  | [default to nothing]
 **`combine_tags_or`** | **`Bool`** |  | [default to nothing]

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_config_aem_health_check_servlet**
> `post_config_aem_health_check_servlet`(_api::`CustomApi`; `bundles_ignored`=nothing, `bundles_ignored_type_hint`=nothing, _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_config_aem_health_check_servlet`(_api::`CustomApi`, response_stream::`Channel`; `bundles_ignored`=nothing, `bundles_ignored_type_hint`=nothing, _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CustomApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bundles_ignored`** | [**`Vector{String}`**](String.md) |  | [default to nothing]
 **`bundles_ignored_type_hint`** | **`String`** |  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_config_aem_password_reset**
> `post_config_aem_password_reset`(_api::`CustomApi`; `pwdreset_authorizables`=nothing, `pwdreset_authorizables_type_hint`=nothing, _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_config_aem_password_reset`(_api::`CustomApi`, response_stream::`Channel`; `pwdreset_authorizables`=nothing, `pwdreset_authorizables_type_hint`=nothing, _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CustomApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`pwdreset_authorizables`** | [**`Vector{String}`**](String.md) |  | [default to nothing]
 **`pwdreset_authorizables_type_hint`** | **`String`** |  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

