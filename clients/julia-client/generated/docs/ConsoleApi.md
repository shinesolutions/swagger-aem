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
> `get_aem_product_info`(_api::`ConsoleApi`; _mediaType=nothing) -> `Vector{String}`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_aem_product_info`(_api::`ConsoleApi`, response_stream::`Channel`; _mediaType=nothing) -> `Channel`{ `Vector{String}` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`Vector{String}`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_bundle_info**
> `get_bundle_info`(_api::`ConsoleApi`, `name`::`String`; _mediaType=nothing) -> `BundleInfo`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_bundle_info`(_api::`ConsoleApi`, response_stream::`Channel`, `name`::`String`; _mediaType=nothing) -> `Channel`{ `BundleInfo` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConsoleApi`** | API context | 
**`name`** | **`String`** |  |

### Return type

[**`BundleInfo`**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_config_mgr**
> `get_config_mgr`(_api::`ConsoleApi`; _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_config_mgr`(_api::`ConsoleApi`, response_stream::`Channel`; _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_bundle**
> `post_bundle`(_api::`ConsoleApi`, `name`::`String`, `action`::`String`; _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_bundle`(_api::`ConsoleApi`, response_stream::`Channel`, `name`::`String`, `action`::`String`; _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConsoleApi`** | API context | 
**`name`** | **`String`** |  |
**`action`** | **`String`** |  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_jmx_repository**
> `post_jmx_repository`(_api::`ConsoleApi`, `action`::`String`; _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_jmx_repository`(_api::`ConsoleApi`, response_stream::`Channel`, `action`::`String`; _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConsoleApi`** | API context | 
**`action`** | **`String`** |  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_saml_configuration**
> `post_saml_configuration`(_api::`ConsoleApi`; `post`=nothing, `apply`=nothing, `delete`=nothing, `action`=nothing, `location`=nothing, `path`=nothing, `service_ranking`=nothing, `idp_url`=nothing, `idp_cert_alias`=nothing, `idp_http_redirect`=nothing, `service_provider_entity_id`=nothing, `assertion_consumer_service_u_r_l`=nothing, `sp_private_key_alias`=nothing, `key_store_password`=nothing, `default_redirect_url`=nothing, `user_i_d_attribute`=nothing, `use_encryption`=nothing, `create_user`=nothing, `add_group_memberships`=nothing, `group_membership_attribute`=nothing, `default_groups`=nothing, `name_id_format`=nothing, `synchronize_attributes`=nothing, `handle_logout`=nothing, `logout_url`=nothing, `clock_tolerance`=nothing, `digest_method`=nothing, `signature_method`=nothing, `user_intermediate_path`=nothing, `propertylist`=nothing, _mediaType=nothing) -> `SamlConfigurationInfo`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_saml_configuration`(_api::`ConsoleApi`, response_stream::`Channel`; `post`=nothing, `apply`=nothing, `delete`=nothing, `action`=nothing, `location`=nothing, `path`=nothing, `service_ranking`=nothing, `idp_url`=nothing, `idp_cert_alias`=nothing, `idp_http_redirect`=nothing, `service_provider_entity_id`=nothing, `assertion_consumer_service_u_r_l`=nothing, `sp_private_key_alias`=nothing, `key_store_password`=nothing, `default_redirect_url`=nothing, `user_i_d_attribute`=nothing, `use_encryption`=nothing, `create_user`=nothing, `add_group_memberships`=nothing, `group_membership_attribute`=nothing, `default_groups`=nothing, `name_id_format`=nothing, `synchronize_attributes`=nothing, `handle_logout`=nothing, `logout_url`=nothing, `clock_tolerance`=nothing, `digest_method`=nothing, `signature_method`=nothing, `user_intermediate_path`=nothing, `propertylist`=nothing, _mediaType=nothing) -> `Channel`{ `SamlConfigurationInfo` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConsoleApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`post`** | **`Bool`** |  | [default to nothing]
 **`apply`** | **`Bool`** |  | [default to nothing]
 **`delete`** | **`Bool`** |  | [default to nothing]
 **`action`** | **`String`** |  | [default to nothing]
 **`location`** | **`String`** |  | [default to nothing]
 **`path`** | [**`Vector{String}`**](String.md) |  | [default to nothing]
 **`service_ranking`** | **`Int64`** |  | [default to nothing]
 **`idp_url`** | **`String`** |  | [default to nothing]
 **`idp_cert_alias`** | **`String`** |  | [default to nothing]
 **`idp_http_redirect`** | **`Bool`** |  | [default to nothing]
 **`service_provider_entity_id`** | **`String`** |  | [default to nothing]
 **`assertion_consumer_service_u_r_l`** | **`String`** |  | [default to nothing]
 **`sp_private_key_alias`** | **`String`** |  | [default to nothing]
 **`key_store_password`** | **`String`** |  | [default to nothing]
 **`default_redirect_url`** | **`String`** |  | [default to nothing]
 **`user_i_d_attribute`** | **`String`** |  | [default to nothing]
 **`use_encryption`** | **`Bool`** |  | [default to nothing]
 **`create_user`** | **`Bool`** |  | [default to nothing]
 **`add_group_memberships`** | **`Bool`** |  | [default to nothing]
 **`group_membership_attribute`** | **`String`** |  | [default to nothing]
 **`default_groups`** | [**`Vector{String}`**](String.md) |  | [default to nothing]
 **`name_id_format`** | **`String`** |  | [default to nothing]
 **`synchronize_attributes`** | [**`Vector{String}`**](String.md) |  | [default to nothing]
 **`handle_logout`** | **`Bool`** |  | [default to nothing]
 **`logout_url`** | **`String`** |  | [default to nothing]
 **`clock_tolerance`** | **`Int64`** |  | [default to nothing]
 **`digest_method`** | **`String`** |  | [default to nothing]
 **`signature_method`** | **`String`** |  | [default to nothing]
 **`user_intermediate_path`** | **`String`** |  | [default to nothing]
 **`propertylist`** | [**`Vector{String}`**](String.md) |  | [default to nothing]

### Return type

[**`SamlConfigurationInfo`**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

