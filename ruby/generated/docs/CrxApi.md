# SwaggerAemClient::CrxApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_package_service**](CrxApi.md#post_package_service) | **POST** /crx/packmgr/service.jsp | 
[**post_package_service_json**](CrxApi.md#post_package_service_json) | **POST** /crx/packmgr/service/.json/{path} | 
[**post_package_update**](CrxApi.md#post_package_update) | **POST** /crx/packmgr/update.jsp | 
[**post_set_password**](CrxApi.md#post_set_password) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **post_package_service**
> String post_package_service(cmd)



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

api_instance = SwaggerAemClient::CrxApi.new

cmd = "cmd_example" # String | 


begin
  result = api_instance.post_package_service(cmd)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CrxApi->post_package_service: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml



# **post_package_service_json**
> String post_package_service_json(path, cmd, opts)



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

api_instance = SwaggerAemClient::CrxApi.new

path = "path_example" # String | 

cmd = "cmd_example" # String | 

opts = { 
  group_name: "group_name_example", # String | 
  package_name: "package_name_example", # String | 
  package_version: "package_version_example", # String | 
  _charset_: "_charset__example", # String | 
  force: true, # BOOLEAN | 
  package: File.new("/path/to/file.txt") # File | 
}

begin
  result = api_instance.post_package_service_json(path, cmd, opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CrxApi->post_package_service_json: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **cmd** | **String**|  | 
 **group_name** | **String**|  | [optional] 
 **package_name** | **String**|  | [optional] 
 **package_version** | **String**|  | [optional] 
 **_charset_** | **String**|  | [optional] 
 **force** | **BOOLEAN**|  | [optional] 
 **package** | **File**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json



# **post_package_update**
> String post_package_update(group_name, package_name, version, path, opts)



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

api_instance = SwaggerAemClient::CrxApi.new

group_name = "group_name_example" # String | 

package_name = "package_name_example" # String | 

version = "version_example" # String | 

path = "path_example" # String | 

opts = { 
  filter: "filter_example", # String | 
  _charset_: "_charset__example" # String | 
}

begin
  result = api_instance.post_package_update(group_name, package_name, version, path, opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CrxApi->post_package_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_name** | **String**|  | 
 **package_name** | **String**|  | 
 **version** | **String**|  | 
 **path** | **String**|  | 
 **filter** | **String**|  | [optional] 
 **_charset_** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **post_set_password**
> post_set_password(old, plain, verify)



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

api_instance = SwaggerAemClient::CrxApi.new

old = "old_example" # String | 

plain = "plain_example" # String | 

verify = "verify_example" # String | 


begin
  api_instance.post_set_password(old, plain, verify)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CrxApi->post_set_password: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **String**|  | 
 **plain** | **String**|  | 
 **verify** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



