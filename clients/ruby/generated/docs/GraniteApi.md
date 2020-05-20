# SwaggerAemClient::GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](GraniteApi.md#ssl_setup) | **POST** /libs/granite/security/post/sslSetup.html | 



## ssl_setup

> String ssl_setup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, opts)



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

api_instance = SwaggerAemClient::GraniteApi.new
keystore_password = 'keystore_password_example' # String | 
keystore_password_confirm = 'keystore_password_confirm_example' # String | 
truststore_password = 'truststore_password_example' # String | 
truststore_password_confirm = 'truststore_password_confirm_example' # String | 
https_hostname = 'https_hostname_example' # String | 
https_port = 'https_port_example' # String | 
opts = {
  privatekey_file: File.new('/path/to/file'), # File | 
  certificate_file: File.new('/path/to/file') # File | 
}

begin
  result = api_instance.ssl_setup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling GraniteApi->ssl_setup: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore_password** | **String**|  | 
 **keystore_password_confirm** | **String**|  | 
 **truststore_password** | **String**|  | 
 **truststore_password_confirm** | **String**|  | 
 **https_hostname** | **String**|  | 
 **https_port** | **String**|  | 
 **privatekey_file** | **File**|  | [optional] 
 **certificate_file** | **File**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

