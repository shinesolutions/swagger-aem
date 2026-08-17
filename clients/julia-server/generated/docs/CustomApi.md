# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_health_check**](CustomApi.md#get_aem_health_check) | **GET** /system/health | 
[**post_config_aem_health_check_servlet**](CustomApi.md#post_config_aem_health_check_servlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**post_config_aem_password_reset**](CustomApi.md#post_config_aem_password_reset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **get_aem_health_check**
> `get_aem_health_check`(req::`HTTP.Request`; `tags`=nothing, `combine_tags_or`=nothing,) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`tags`** | **`String`**|  | [default to nothing]
 **`combine_tags_or`** | **`Bool`**|  | [default to nothing]

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_health_check_servlet**
> `post_config_aem_health_check_servlet`(req::`HTTP.Request`; `bundles_ignored`=nothing, `bundles_ignored_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bundles_ignored`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`bundles_ignored_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_password_reset**
> `post_config_aem_password_reset`(req::`HTTP.Request`; `pwdreset_authorizables`=nothing, `pwdreset_authorizables_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`pwdreset_authorizables`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`pwdreset_authorizables_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

