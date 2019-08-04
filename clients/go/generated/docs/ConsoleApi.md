# \ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemProductInfo**](ConsoleApi.md#GetAemProductInfo) | **Get** /system/console/status-productinfo.json | 
[**GetConfigMgr**](ConsoleApi.md#GetConfigMgr) | **Get** /system/console/configMgr | 
[**PostBundle**](ConsoleApi.md#PostBundle) | **Post** /system/console/bundles/{name} | 
[**PostJmxRepository**](ConsoleApi.md#PostJmxRepository) | **Post** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**PostSamlConfiguration**](ConsoleApi.md#PostSamlConfiguration) | **Post** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **GetAemProductInfo**
> []string GetAemProductInfo(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

**[]string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetConfigMgr**
> string GetConfigMgr(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostBundle**
> PostBundle(ctx, name, action)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **name** | **string**|  | 
  **action** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostJmxRepository**
> PostJmxRepository(ctx, action)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **action** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostSamlConfiguration**
> SamlConfigurationInfo PostSamlConfiguration(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostSamlConfigurationOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostSamlConfigurationOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **optional.Bool**|  | 
 **apply** | **optional.Bool**|  | 
 **delete** | **optional.Bool**|  | 
 **action** | **optional.String**|  | 
 **location** | **optional.String**|  | 
 **path** | [**optional.Interface of []string**](string.md)|  | 
 **serviceRanking** | **optional.Int32**|  | 
 **idpUrl** | **optional.String**|  | 
 **idpCertAlias** | **optional.String**|  | 
 **idpHttpRedirect** | **optional.Bool**|  | 
 **serviceProviderEntityId** | **optional.String**|  | 
 **assertionConsumerServiceURL** | **optional.String**|  | 
 **spPrivateKeyAlias** | **optional.String**|  | 
 **keyStorePassword** | **optional.String**|  | 
 **defaultRedirectUrl** | **optional.String**|  | 
 **userIDAttribute** | **optional.String**|  | 
 **useEncryption** | **optional.Bool**|  | 
 **createUser** | **optional.Bool**|  | 
 **addGroupMemberships** | **optional.Bool**|  | 
 **groupMembershipAttribute** | **optional.String**|  | 
 **defaultGroups** | [**optional.Interface of []string**](string.md)|  | 
 **nameIdFormat** | **optional.String**|  | 
 **synchronizeAttributes** | [**optional.Interface of []string**](string.md)|  | 
 **handleLogout** | **optional.Bool**|  | 
 **logoutUrl** | **optional.String**|  | 
 **clockTolerance** | **optional.Int32**|  | 
 **digestMethod** | **optional.String**|  | 
 **signatureMethod** | **optional.String**|  | 
 **userIntermediatePath** | **optional.String**|  | 
 **propertylist** | [**optional.Interface of []string**](string.md)|  | 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

