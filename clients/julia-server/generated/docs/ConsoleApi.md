# ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_product_info**](ConsoleApi.md#get_aem_product_info) | **GET** /system/console/status-productinfo.json | 
[**get_bundle_info**](ConsoleApi.md#get_bundle_info) | **GET** /system/console/bundles/{name}.json | 
[**get_config_mgr**](ConsoleApi.md#get_config_mgr) | **GET** /system/console/configMgr | 
[**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**post_saml_configuration**](ConsoleApi.md#post_saml_configuration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **get_aem_product_info**
> `get_aem_product_info`(req::`HTTP.Request`;) -> `Vector{String}`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`Vector{String}`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bundle_info**
> `get_bundle_info`(req::`HTTP.Request`, `name`::`String`;) -> `BundleInfo`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`name`** | **`String`**|  |

### Return type

[**`BundleInfo`**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_config_mgr**
> `get_config_mgr`(req::`HTTP.Request`;) -> `String`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_bundle**
> `post_bundle`(req::`HTTP.Request`, `name`::`String`, `action`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`name`** | **`String`**|  |
**`action`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_jmx_repository**
> `post_jmx_repository`(req::`HTTP.Request`, `action`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`action`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_saml_configuration**
> `post_saml_configuration`(req::`HTTP.Request`; `post`=nothing, `apply`=nothing, `delete`=nothing, `action`=nothing, `location`=nothing, `path`=nothing, `service_ranking`=nothing, `idp_url`=nothing, `idp_cert_alias`=nothing, `idp_http_redirect`=nothing, `service_provider_entity_id`=nothing, `assertion_consumer_service_u_r_l`=nothing, `sp_private_key_alias`=nothing, `key_store_password`=nothing, `default_redirect_url`=nothing, `user_i_d_attribute`=nothing, `use_encryption`=nothing, `create_user`=nothing, `add_group_memberships`=nothing, `group_membership_attribute`=nothing, `default_groups`=nothing, `name_id_format`=nothing, `synchronize_attributes`=nothing, `handle_logout`=nothing, `logout_url`=nothing, `clock_tolerance`=nothing, `digest_method`=nothing, `signature_method`=nothing, `user_intermediate_path`=nothing, `propertylist`=nothing,) -> `SamlConfigurationInfo`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`post`** | **`Bool`**|  | [default to nothing]
 **`apply`** | **`Bool`**|  | [default to nothing]
 **`delete`** | **`Bool`**|  | [default to nothing]
 **`action`** | **`String`**|  | [default to nothing]
 **`location`** | **`String`**|  | [default to nothing]
 **`path`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`service_ranking`** | **`Int64`**|  | [default to nothing]
 **`idp_url`** | **`String`**|  | [default to nothing]
 **`idp_cert_alias`** | **`String`**|  | [default to nothing]
 **`idp_http_redirect`** | **`Bool`**|  | [default to nothing]
 **`service_provider_entity_id`** | **`String`**|  | [default to nothing]
 **`assertion_consumer_service_u_r_l`** | **`String`**|  | [default to nothing]
 **`sp_private_key_alias`** | **`String`**|  | [default to nothing]
 **`key_store_password`** | **`String`**|  | [default to nothing]
 **`default_redirect_url`** | **`String`**|  | [default to nothing]
 **`user_i_d_attribute`** | **`String`**|  | [default to nothing]
 **`use_encryption`** | **`Bool`**|  | [default to nothing]
 **`create_user`** | **`Bool`**|  | [default to nothing]
 **`add_group_memberships`** | **`Bool`**|  | [default to nothing]
 **`group_membership_attribute`** | **`String`**|  | [default to nothing]
 **`default_groups`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`name_id_format`** | **`String`**|  | [default to nothing]
 **`synchronize_attributes`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`handle_logout`** | **`Bool`**|  | [default to nothing]
 **`logout_url`** | **`String`**|  | [default to nothing]
 **`clock_tolerance`** | **`Int64`**|  | [default to nothing]
 **`digest_method`** | **`String`**|  | [default to nothing]
 **`signature_method`** | **`String`**|  | [default to nothing]
 **`user_intermediate_path`** | **`String`**|  | [default to nothing]
 **`propertylist`** | [**`Vector{String}`**](String.md)|  | [default to nothing]

### Return type

[**`SamlConfigurationInfo`**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

