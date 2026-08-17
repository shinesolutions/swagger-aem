# SwaggerAemClient::CustomApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_aem_health_check**](CustomApi.md#get_aem_health_check) | **GET** /system/health |  |
| [**post_config_aem_health_check_servlet**](CustomApi.md#post_config_aem_health_check_servlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck |  |
| [**post_config_aem_password_reset**](CustomApi.md#post_config_aem_password_reset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator |  |


## get_aem_health_check

> String get_aem_health_check(opts)



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

api_instance = SwaggerAemClient::CustomApi.new
opts = {
  tags: 'tags_example', # String | 
  combine_tags_or: true # Boolean | 
}

begin
  
  result = api_instance.get_aem_health_check(opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CustomApi->get_aem_health_check: #{e}"
end
```

#### Using the get_aem_health_check_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> get_aem_health_check_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.get_aem_health_check_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CustomApi->get_aem_health_check_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tags** | **String** |  | [optional] |
| **combine_tags_or** | **Boolean** |  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## post_config_aem_health_check_servlet

> post_config_aem_health_check_servlet(opts)



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

api_instance = SwaggerAemClient::CustomApi.new
opts = {
  bundles_ignored: ['inner_example'], # Array<String> | 
  bundles_ignored_type_hint: 'bundles_ignored_type_hint_example' # String | 
}

begin
  
  api_instance.post_config_aem_health_check_servlet(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CustomApi->post_config_aem_health_check_servlet: #{e}"
end
```

#### Using the post_config_aem_health_check_servlet_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> post_config_aem_health_check_servlet_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.post_config_aem_health_check_servlet_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CustomApi->post_config_aem_health_check_servlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bundles_ignored** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **bundles_ignored_type_hint** | **String** |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_config_aem_password_reset

> post_config_aem_password_reset(opts)



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

api_instance = SwaggerAemClient::CustomApi.new
opts = {
  pwdreset_authorizables: ['inner_example'], # Array<String> | 
  pwdreset_authorizables_type_hint: 'pwdreset_authorizables_type_hint_example' # String | 
}

begin
  
  api_instance.post_config_aem_password_reset(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CustomApi->post_config_aem_password_reset: #{e}"
end
```

#### Using the post_config_aem_password_reset_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> post_config_aem_password_reset_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.post_config_aem_password_reset_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CustomApi->post_config_aem_password_reset_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pwdreset_authorizables** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **pwdreset_authorizables_type_hint** | **String** |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

