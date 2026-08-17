# SwaggerAemClient::ConsoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_aem_product_info**](ConsoleApi.md#get_aem_product_info) | **GET** /system/console/status-productinfo.json |  |
| [**get_bundle_info**](ConsoleApi.md#get_bundle_info) | **GET** /system/console/bundles/{name}.json |  |
| [**get_config_mgr**](ConsoleApi.md#get_config_mgr) | **GET** /system/console/configMgr |  |
| [**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} |  |
| [**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} |  |
| [**post_saml_configuration**](ConsoleApi.md#post_saml_configuration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler |  |


## get_aem_product_info

> Array&lt;String&gt; get_aem_product_info



### Examples

```ruby
require 'time'
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::ConsoleApi.new

begin
  
  result = api_instance.get_aem_product_info
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->get_aem_product_info: #{e}"
end
```

#### Using the get_aem_product_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;String&gt;, Integer, Hash)> get_aem_product_info_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.get_aem_product_info_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;String&gt;
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->get_aem_product_info_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Array&lt;String&gt;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_bundle_info

> <BundleInfo> get_bundle_info(name)



### Examples

```ruby
require 'time'
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::ConsoleApi.new
name = 'name_example' # String | 

begin
  
  result = api_instance.get_bundle_info(name)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->get_bundle_info: #{e}"
end
```

#### Using the get_bundle_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BundleInfo>, Integer, Hash)> get_bundle_info_with_http_info(name)

```ruby
begin
  
  data, status_code, headers = api_instance.get_bundle_info_with_http_info(name)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BundleInfo>
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->get_bundle_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** |  |  |

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_config_mgr

> String get_config_mgr



### Examples

```ruby
require 'time'
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::ConsoleApi.new

begin
  
  result = api_instance.get_config_mgr
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->get_config_mgr: #{e}"
end
```

#### Using the get_config_mgr_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> get_config_mgr_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.get_config_mgr_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->get_config_mgr_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml


## post_bundle

> post_bundle(name, action)



### Examples

```ruby
require 'time'
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::ConsoleApi.new
name = 'name_example' # String | 
action = 'action_example' # String | 

begin
  
  api_instance.post_bundle(name, action)
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->post_bundle: #{e}"
end
```

#### Using the post_bundle_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> post_bundle_with_http_info(name, action)

```ruby
begin
  
  data, status_code, headers = api_instance.post_bundle_with_http_info(name, action)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->post_bundle_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** |  |  |
| **action** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_jmx_repository

> post_jmx_repository(action)



### Examples

```ruby
require 'time'
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::ConsoleApi.new
action = 'action_example' # String | 

begin
  
  api_instance.post_jmx_repository(action)
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->post_jmx_repository: #{e}"
end
```

#### Using the post_jmx_repository_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> post_jmx_repository_with_http_info(action)

```ruby
begin
  
  data, status_code, headers = api_instance.post_jmx_repository_with_http_info(action)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->post_jmx_repository_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_saml_configuration

> <SamlConfigurationInfo> post_saml_configuration(opts)



### Examples

```ruby
require 'time'
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::ConsoleApi.new
opts = {
  post: true, # Boolean | 
  apply: true, # Boolean | 
  delete: true, # Boolean | 
  action: 'action_example', # String | 
  location: 'location_example', # String | 
  path: ['inner_example'], # Array<String> | 
  service_ranking: 56, # Integer | 
  idp_url: 'idp_url_example', # String | 
  idp_cert_alias: 'idp_cert_alias_example', # String | 
  idp_http_redirect: true, # Boolean | 
  service_provider_entity_id: 'service_provider_entity_id_example', # String | 
  assertion_consumer_service_url: 'assertion_consumer_service_url_example', # String | 
  sp_private_key_alias: 'sp_private_key_alias_example', # String | 
  key_store_password: 'key_store_password_example', # String | 
  default_redirect_url: 'default_redirect_url_example', # String | 
  user_id_attribute: 'user_id_attribute_example', # String | 
  use_encryption: true, # Boolean | 
  create_user: true, # Boolean | 
  add_group_memberships: true, # Boolean | 
  group_membership_attribute: 'group_membership_attribute_example', # String | 
  default_groups: ['inner_example'], # Array<String> | 
  name_id_format: 'name_id_format_example', # String | 
  synchronize_attributes: ['inner_example'], # Array<String> | 
  handle_logout: true, # Boolean | 
  logout_url: 'logout_url_example', # String | 
  clock_tolerance: 56, # Integer | 
  digest_method: 'digest_method_example', # String | 
  signature_method: 'signature_method_example', # String | 
  user_intermediate_path: 'user_intermediate_path_example', # String | 
  propertylist: ['inner_example'] # Array<String> | 
}

begin
  
  result = api_instance.post_saml_configuration(opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->post_saml_configuration: #{e}"
end
```

#### Using the post_saml_configuration_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SamlConfigurationInfo>, Integer, Hash)> post_saml_configuration_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.post_saml_configuration_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SamlConfigurationInfo>
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling ConsoleApi->post_saml_configuration_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **post** | **Boolean** |  | [optional] |
| **apply** | **Boolean** |  | [optional] |
| **delete** | **Boolean** |  | [optional] |
| **action** | **String** |  | [optional] |
| **location** | **String** |  | [optional] |
| **path** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **service_ranking** | **Integer** |  | [optional] |
| **idp_url** | **String** |  | [optional] |
| **idp_cert_alias** | **String** |  | [optional] |
| **idp_http_redirect** | **Boolean** |  | [optional] |
| **service_provider_entity_id** | **String** |  | [optional] |
| **assertion_consumer_service_url** | **String** |  | [optional] |
| **sp_private_key_alias** | **String** |  | [optional] |
| **key_store_password** | **String** |  | [optional] |
| **default_redirect_url** | **String** |  | [optional] |
| **user_id_attribute** | **String** |  | [optional] |
| **use_encryption** | **Boolean** |  | [optional] |
| **create_user** | **Boolean** |  | [optional] |
| **add_group_memberships** | **Boolean** |  | [optional] |
| **group_membership_attribute** | **String** |  | [optional] |
| **default_groups** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **name_id_format** | **String** |  | [optional] |
| **synchronize_attributes** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **handle_logout** | **Boolean** |  | [optional] |
| **logout_url** | **String** |  | [optional] |
| **clock_tolerance** | **Integer** |  | [optional] |
| **digest_method** | **String** |  | [optional] |
| **signature_method** | **String** |  | [optional] |
| **user_intermediate_path** | **String** |  | [optional] |
| **propertylist** | [**Array&lt;String&gt;**](String.md) |  | [optional] |

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

