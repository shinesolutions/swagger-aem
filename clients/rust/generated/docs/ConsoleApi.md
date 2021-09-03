# \ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_product_info**](ConsoleApi.md#get_aem_product_info) | **GET** /system/console/status-productinfo.json | 
[**get_bundle_info**](ConsoleApi.md#get_bundle_info) | **GET** /system/console/bundles/{name}.json | 
[**get_config_mgr**](ConsoleApi.md#get_config_mgr) | **GET** /system/console/configMgr | 
[**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | 
[**post_saml_configuration**](ConsoleApi.md#post_saml_configuration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 



## get_aem_product_info

> Vec<String> get_aem_product_info()


### Parameters

This endpoint does not need any parameter.

### Return type

**Vec<String>**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_bundle_info

> crate::models::BundleInfo get_bundle_info(name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**name** | **String** |  | [required] |

### Return type

[**crate::models::BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_config_mgr

> String get_config_mgr()


### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_bundle

> post_bundle(name, action)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**name** | **String** |  | [required] |
**action** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_jmx_repository

> post_jmx_repository(action)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**action** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_saml_configuration

> crate::models::SamlConfigurationInfo post_saml_configuration(post, apply, delete, action, location, path, service_ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path, propertylist)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**post** | Option<**bool**> |  |  |
**apply** | Option<**bool**> |  |  |
**delete** | Option<**bool**> |  |  |
**action** | Option<**String**> |  |  |
**location** | Option<**String**> |  |  |
**path** | Option<[**Vec<String>**](String.md)> |  |  |
**service_ranking** | Option<**i32**> |  |  |
**idp_url** | Option<**String**> |  |  |
**idp_cert_alias** | Option<**String**> |  |  |
**idp_http_redirect** | Option<**bool**> |  |  |
**service_provider_entity_id** | Option<**String**> |  |  |
**assertion_consumer_service_url** | Option<**String**> |  |  |
**sp_private_key_alias** | Option<**String**> |  |  |
**key_store_password** | Option<**String**> |  |  |
**default_redirect_url** | Option<**String**> |  |  |
**user_id_attribute** | Option<**String**> |  |  |
**use_encryption** | Option<**bool**> |  |  |
**create_user** | Option<**bool**> |  |  |
**add_group_memberships** | Option<**bool**> |  |  |
**group_membership_attribute** | Option<**String**> |  |  |
**default_groups** | Option<[**Vec<String>**](String.md)> |  |  |
**name_id_format** | Option<**String**> |  |  |
**synchronize_attributes** | Option<[**Vec<String>**](String.md)> |  |  |
**handle_logout** | Option<**bool**> |  |  |
**logout_url** | Option<**String**> |  |  |
**clock_tolerance** | Option<**i32**> |  |  |
**digest_method** | Option<**String**> |  |  |
**signature_method** | Option<**String**> |  |  |
**user_intermediate_path** | Option<**String**> |  |  |
**propertylist** | Option<[**Vec<String>**](String.md)> |  |  |

### Return type

[**crate::models::SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

