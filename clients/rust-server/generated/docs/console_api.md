# console_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
**getAemProductInfo**](console_api.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
**getBundleInfo**](console_api.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
**getConfigMgr**](console_api.md#getConfigMgr) | **GET** /system/console/configMgr | 
**postBundle**](console_api.md#postBundle) | **POST** /system/console/bundles/{name} | 
**postJmxRepository**](console_api.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | 
**postSamlConfiguration**](console_api.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **getAemProductInfo**
> Vec<String> getAemProductInfo(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<String>**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBundleInfo**
> models::BundleInfo getBundleInfo(ctx, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **name** | **String**|  | 

### Return type

[**models::BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getConfigMgr**
> String getConfigMgr(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postBundle**
> postBundle(ctx, name, action)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **name** | **String**|  | 
  **action** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postJmxRepository**
> postJmxRepository(ctx, action)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **action** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSamlConfiguration**
> models::SamlConfigurationInfo postSamlConfiguration(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **bool**|  | 
 **apply** | **bool**|  | 
 **delete** | **bool**|  | 
 **action** | **String**|  | 
 **location** | **String**|  | 
 **path** | [**String**](String.md)|  | 
 **service_ranking** | **i32**|  | 
 **idp_url** | **String**|  | 
 **idp_cert_alias** | **String**|  | 
 **idp_http_redirect** | **bool**|  | 
 **service_provider_entity_id** | **String**|  | 
 **assertion_consumer_service_url** | **String**|  | 
 **sp_private_key_alias** | **String**|  | 
 **key_store_password** | **String**|  | 
 **default_redirect_url** | **String**|  | 
 **user_id_attribute** | **String**|  | 
 **use_encryption** | **bool**|  | 
 **create_user** | **bool**|  | 
 **add_group_memberships** | **bool**|  | 
 **group_membership_attribute** | **String**|  | 
 **default_groups** | [**String**](String.md)|  | 
 **name_id_format** | **String**|  | 
 **synchronize_attributes** | [**String**](String.md)|  | 
 **handle_logout** | **bool**|  | 
 **logout_url** | **String**|  | 
 **clock_tolerance** | **i32**|  | 
 **digest_method** | **String**|  | 
 **signature_method** | **String**|  | 
 **user_intermediate_path** | **String**|  | 
 **propertylist** | [**String**](String.md)|  | 

### Return type

[**models::SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

