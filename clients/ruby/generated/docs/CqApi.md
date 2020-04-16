# SwaggerAemClient::CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_login_page**](CqApi.md#get_login_page) | **GET** /libs/granite/core/content/login.html | 
[**post_cq_actions**](CqApi.md#post_cq_actions) | **POST** /.cqactions.html | 



## get_login_page

> String get_login_page



### Example

```ruby
# load the gem
require 'swagger_aem'

api_instance = SwaggerAemClient::CqApi.new

begin
  result = api_instance.get_login_page
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CqApi->get_login_page: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


## post_cq_actions

> post_cq_actions(authorizable_id, changelog)



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

api_instance = SwaggerAemClient::CqApi.new
authorizable_id = 'authorizable_id_example' # String | 
changelog = 'changelog_example' # String | 

begin
  api_instance.post_cq_actions(authorizable_id, changelog)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CqApi->post_cq_actions: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **String**|  | 
 **changelog** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

