# SwaggerAemClient::ConsoleApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | 


# **post_bundle**
> post_bundle(name, action)



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

api_instance = SwaggerAemClient::ConsoleApi.new

name = "name_example" # String | 

action = "action_example" # String | 


begin
  api_instance.post_bundle(name, action)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling ConsoleApi->post_bundle: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | 
 **action** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **post_jmx_repository**
> post_jmx_repository(action)



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

api_instance = SwaggerAemClient::ConsoleApi.new

action = "action_example" # String | 


begin
  api_instance.post_jmx_repository(action)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling ConsoleApi->post_jmx_repository: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



