# CONSOLE_API

All URIs are relative to *http://localhost*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**aem_product_info**](CONSOLE_API.md#aem_product_info) | **Get** /system/console/status-productinfo.json | 
[**config_mgr**](CONSOLE_API.md#config_mgr) | **Get** /system/console/configMgr | 
[**post_bundle**](CONSOLE_API.md#post_bundle) | **Post** /system/console/bundles/{name} | 
[**post_jmx_repository**](CONSOLE_API.md#post_jmx_repository) | **Post** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**post_saml_configuration**](CONSOLE_API.md#post_saml_configuration) | **Post** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **aem_product_info**
> aem_product_info : detachable LIST [STRING_32]
	




### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [STRING_32]**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_mgr**
> config_mgr : detachable STRING_32
	




### Parameters
This endpoint does not need any parameter.

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_bundle**
> post_bundle (name: STRING_32 ; action: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **STRING_32**|  | 
 **action** | **STRING_32**|  | 

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_jmx_repository**
> post_jmx_repository (action: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **STRING_32**|  | 

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_saml_configuration**
> post_saml_configuration (post:  detachable BOOLEAN ; apply:  detachable BOOLEAN ; delete:  detachable BOOLEAN ; action:  detachable STRING_32 ; location:  detachable STRING_32 ; path:  detachable LIST [STRING_32] ; service_ranking:  detachable INTEGER_32 ; idp_url:  detachable STRING_32 ; idp_cert_alias:  detachable STRING_32 ; idp_http_redirect:  detachable BOOLEAN ; service_provider_entity_id:  detachable STRING_32 ; assertion_consumer_service_ur_l:  detachable STRING_32 ; sp_private_key_alias:  detachable STRING_32 ; key_store_password:  detachable STRING_32 ; default_redirect_url:  detachable STRING_32 ; user_id_attribute:  detachable STRING_32 ; use_encryption:  detachable BOOLEAN ; create_user:  detachable BOOLEAN ; add_group_memberships:  detachable BOOLEAN ; group_membership_attribute:  detachable STRING_32 ; default_groups:  detachable LIST [STRING_32] ; name_id_format:  detachable STRING_32 ; synchronize_attributes:  detachable LIST [STRING_32] ; handle_logout:  detachable BOOLEAN ; logout_url:  detachable STRING_32 ; clock_tolerance:  detachable INTEGER_32 ; digest_method:  detachable STRING_32 ; signature_method:  detachable STRING_32 ; user_intermediate_path:  detachable STRING_32 ; propertylist:  detachable LIST [STRING_32] ): detachable SAML_CONFIGURATION_INFO
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **BOOLEAN**|  | [optional] 
 **apply** | **BOOLEAN**|  | [optional] 
 **delete** | **BOOLEAN**|  | [optional] 
 **action** | **STRING_32**|  | [optional] 
 **location** | **STRING_32**|  | [optional] 
 **path** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] 
 **service_ranking** | **INTEGER_32**|  | [optional] 
 **idp_url** | **STRING_32**|  | [optional] 
 **idp_cert_alias** | **STRING_32**|  | [optional] 
 **idp_http_redirect** | **BOOLEAN**|  | [optional] 
 **service_provider_entity_id** | **STRING_32**|  | [optional] 
 **assertion_consumer_service_ur_l** | **STRING_32**|  | [optional] 
 **sp_private_key_alias** | **STRING_32**|  | [optional] 
 **key_store_password** | **STRING_32**|  | [optional] 
 **default_redirect_url** | **STRING_32**|  | [optional] 
 **user_id_attribute** | **STRING_32**|  | [optional] 
 **use_encryption** | **BOOLEAN**|  | [optional] 
 **create_user** | **BOOLEAN**|  | [optional] 
 **add_group_memberships** | **BOOLEAN**|  | [optional] 
 **group_membership_attribute** | **STRING_32**|  | [optional] 
 **default_groups** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] 
 **name_id_format** | **STRING_32**|  | [optional] 
 **synchronize_attributes** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] 
 **handle_logout** | **BOOLEAN**|  | [optional] 
 **logout_url** | **STRING_32**|  | [optional] 
 **clock_tolerance** | **INTEGER_32**|  | [optional] 
 **digest_method** | **STRING_32**|  | [optional] 
 **signature_method** | **STRING_32**|  | [optional] 
 **user_intermediate_path** | **STRING_32**|  | [optional] 
 **propertylist** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] 

### Return type

[**SAML_CONFIGURATION_INFO**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

