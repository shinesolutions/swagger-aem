# CUSTOM_API

All URIs are relative to *http://localhost*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**aem_health_check**](CUSTOM_API.md#aem_health_check) | **Get** /system/health | 
[**post_config_aem_health_check_servlet**](CUSTOM_API.md#post_config_aem_health_check_servlet) | **Post** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**post_config_aem_password_reset**](CUSTOM_API.md#post_config_aem_password_reset) | **Post** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **aem_health_check**
> aem_health_check (tags:  detachable STRING_32 ; combine_tags_or:  detachable BOOLEAN ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **STRING_32**|  | [optional] [default to null]
 **combine_tags_or** | **BOOLEAN**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_health_check_servlet**
> post_config_aem_health_check_servlet (bundles_ignored:  detachable LIST [STRING_32] ; bundles_ignored_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundles_ignored** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] [default to null]
 **bundles_ignored_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_password_reset**
> post_config_aem_password_reset (pwdreset_authorizables:  detachable LIST [STRING_32] ; pwdreset_authorizables_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdreset_authorizables** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] [default to null]
 **pwdreset_authorizables_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

