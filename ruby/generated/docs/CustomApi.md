# SwaggerAemClient::CustomApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_health_check**](CustomApi.md#get_aem_health_check) | **GET** /system/health | 
[**post_config_aem_password_reset**](CustomApi.md#post_config_aem_password_reset) | **POST** /apps/system/config.{runmode}/com.shinesolutions.aem.passwordreset.Activator | 


# **get_aem_health_check**
> String get_aem_health_check(opts)



### Example
```ruby
# load the gem
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::CustomApi.new

opts = { 
  tags: "tags_example", # String | 
  combine_tags_or: true # BOOLEAN | 
}

begin
  result = api_instance.get_aem_health_check(opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CustomApi->get_aem_health_check: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **String**|  | [optional] 
 **combine_tags_or** | **BOOLEAN**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **post_config_aem_password_reset**
> post_config_aem_password_reset(runmode, opts)



### Example
```ruby
# load the gem
require 'swagger_aem'
# setup authorization
SwaggerAemClient.configure do |config|
  # Configure HTTP basic authorization: aemAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerAemClient::CustomApi.new

runmode = "runmode_example" # String | 

opts = { 
  passwordreset_authorizables: "passwordreset_authorizables_example" # String | 
}

begin
  api_instance.post_config_aem_password_reset(runmode, opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CustomApi->post_config_aem_password_reset: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **passwordreset_authorizables** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



