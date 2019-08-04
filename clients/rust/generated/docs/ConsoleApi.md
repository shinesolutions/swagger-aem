# \ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_product_info**](ConsoleApi.md#get_aem_product_info) | **Get** /system/console/status-productinfo.json | 
[**get_config_mgr**](ConsoleApi.md#get_config_mgr) | **Get** /system/console/configMgr | 
[**post_bundle**](ConsoleApi.md#post_bundle) | **Post** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **Post** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**post_saml_configuration**](ConsoleApi.md#post_saml_configuration) | **Post** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **get_aem_product_info**
> Vec<String> get_aem_product_info(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

**Vec<String>**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_config_mgr**
> String get_config_mgr(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_bundle**
> post_bundle(ctx, name, action)


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

# **post_jmx_repository**
> post_jmx_repository(ctx, action)


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

# **post_saml_configuration**
> ::models::SamlConfigurationInfo post_saml_configuration(ctx, optional)


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
 **path** | [**Vec&lt;String&gt;**](String.md)|  | 
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
 **default_groups** | [**Vec&lt;String&gt;**](String.md)|  | 
 **name_id_format** | **String**|  | 
 **synchronize_attributes** | [**Vec&lt;String&gt;**](String.md)|  | 
 **handle_logout** | **bool**|  | 
 **logout_url** | **String**|  | 
 **clock_tolerance** | **i32**|  | 
 **digest_method** | **String**|  | 
 **signature_method** | **String**|  | 
 **user_intermediate_path** | **String**|  | 
 **propertylist** | [**Vec&lt;String&gt;**](String.md)|  | 

### Return type

[**::models::SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

