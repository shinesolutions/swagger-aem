# SwaggerAemClient::CrxApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_crxde_status**](CrxApi.md#get_crxde_status) | **GET** /crx/server/crx.default/jcr:root/.1.json |  |
| [**get_install_status**](CrxApi.md#get_install_status) | **GET** /crx/packmgr/installstatus.jsp |  |
| [**get_package_manager_servlet**](CrxApi.md#get_package_manager_servlet) | **GET** /crx/packmgr/service/script.html |  |
| [**post_package_service**](CrxApi.md#post_package_service) | **POST** /crx/packmgr/service.jsp |  |
| [**post_package_service_json**](CrxApi.md#post_package_service_json) | **POST** /crx/packmgr/service/.json/{path} |  |
| [**post_package_update**](CrxApi.md#post_package_update) | **POST** /crx/packmgr/update.jsp |  |
| [**post_set_password**](CrxApi.md#post_set_password) | **POST** /crx/explorer/ui/setpassword.jsp |  |


## get_crxde_status

> String get_crxde_status



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

api_instance = SwaggerAemClient::CrxApi.new

begin
  
  result = api_instance.get_crxde_status
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->get_crxde_status: #{e}"
end
```

#### Using the get_crxde_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> get_crxde_status_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.get_crxde_status_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->get_crxde_status_with_http_info: #{e}"
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
- **Accept**: plain/text


## get_install_status

> <InstallStatus> get_install_status



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

api_instance = SwaggerAemClient::CrxApi.new

begin
  
  result = api_instance.get_install_status
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->get_install_status: #{e}"
end
```

#### Using the get_install_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<InstallStatus>, Integer, Hash)> get_install_status_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.get_install_status_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <InstallStatus>
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->get_install_status_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_package_manager_servlet

> get_package_manager_servlet



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

api_instance = SwaggerAemClient::CrxApi.new

begin
  
  api_instance.get_package_manager_servlet
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->get_package_manager_servlet: #{e}"
end
```

#### Using the get_package_manager_servlet_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> get_package_manager_servlet_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.get_package_manager_servlet_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->get_package_manager_servlet_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


## post_package_service

> String post_package_service(cmd)



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

api_instance = SwaggerAemClient::CrxApi.new
cmd = 'cmd_example' # String | 

begin
  
  result = api_instance.post_package_service(cmd)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_package_service: #{e}"
end
```

#### Using the post_package_service_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> post_package_service_with_http_info(cmd)

```ruby
begin
  
  data, status_code, headers = api_instance.post_package_service_with_http_info(cmd)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_package_service_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cmd** | **String** |  |  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml


## post_package_service_json

> String post_package_service_json(path, cmd, opts)



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

api_instance = SwaggerAemClient::CrxApi.new
path = 'path_example' # String | 
cmd = 'cmd_example' # String | 
opts = {
  group_name: 'group_name_example', # String | 
  package_name: 'package_name_example', # String | 
  package_version: 'package_version_example', # String | 
  _charset_: '_charset__example', # String | 
  force: true, # Boolean | 
  recursive: true, # Boolean | 
  package: File.new('/path/to/some/file') # File | 
}

begin
  
  result = api_instance.post_package_service_json(path, cmd, opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_package_service_json: #{e}"
end
```

#### Using the post_package_service_json_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> post_package_service_json_with_http_info(path, cmd, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.post_package_service_json_with_http_info(path, cmd, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_package_service_json_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **path** | **String** |  |  |
| **cmd** | **String** |  |  |
| **group_name** | **String** |  | [optional] |
| **package_name** | **String** |  | [optional] |
| **package_version** | **String** |  | [optional] |
| **_charset_** | **String** |  | [optional] |
| **force** | **Boolean** |  | [optional] |
| **recursive** | **Boolean** |  | [optional] |
| **package** | **File** |  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## post_package_update

> String post_package_update(group_name, package_name, version, path, opts)



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

api_instance = SwaggerAemClient::CrxApi.new
group_name = 'group_name_example' # String | 
package_name = 'package_name_example' # String | 
version = 'version_example' # String | 
path = 'path_example' # String | 
opts = {
  filter: 'filter_example', # String | 
  _charset_: '_charset__example' # String | 
}

begin
  
  result = api_instance.post_package_update(group_name, package_name, version, path, opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_package_update: #{e}"
end
```

#### Using the post_package_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> post_package_update_with_http_info(group_name, package_name, version, path, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.post_package_update_with_http_info(group_name, package_name, version, path, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_package_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **group_name** | **String** |  |  |
| **package_name** | **String** |  |  |
| **version** | **String** |  |  |
| **path** | **String** |  |  |
| **filter** | **String** |  | [optional] |
| **_charset_** | **String** |  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## post_set_password

> String post_set_password(old, plain, verify)



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

api_instance = SwaggerAemClient::CrxApi.new
old = 'old_example' # String | 
plain = 'plain_example' # String | 
verify = 'verify_example' # String | 

begin
  
  result = api_instance.post_set_password(old, plain, verify)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_set_password: #{e}"
end
```

#### Using the post_set_password_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> post_set_password_with_http_info(old, plain, verify)

```ruby
begin
  
  data, status_code, headers = api_instance.post_set_password_with_http_info(old, plain, verify)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue SwaggerAemClient::ApiError => e
  puts "Error when calling CrxApi->post_set_password_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **old** | **String** |  |  |
| **plain** | **String** |  |  |
| **verify** | **String** |  |  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

