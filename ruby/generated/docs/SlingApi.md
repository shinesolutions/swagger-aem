# SwaggerAemClient::SlingApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_agent**](SlingApi.md#delete_agent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**delete_node**](SlingApi.md#delete_node) | **DELETE** /{path}/{name} | 
[**get_agent**](SlingApi.md#get_agent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**get_node**](SlingApi.md#get_node) | **GET** /{path}/{name} | 
[**get_package**](SlingApi.md#get_package) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**get_package_filter**](SlingApi.md#get_package_filter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**post_agent**](SlingApi.md#post_agent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**post_authorizables**](SlingApi.md#post_authorizables) | **POST** /libs/granite/security/post/authorizables | 
[**post_config**](SlingApi.md#post_config) | **POST** /apps/system/config.{runmode}/{name} | 
[**post_node_rw**](SlingApi.md#post_node_rw) | **POST** /{path}/{name}.rw.html | 
[**post_path**](SlingApi.md#post_path) | **POST** /{path}/ | 
[**post_query**](SlingApi.md#post_query) | **POST** /bin/querybuilder.json | 
[**post_tree_activation**](SlingApi.md#post_tree_activation) | **POST** /etc/replication/treeactivation.html | 


# **delete_agent**
> delete_agent(runmode, name)



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

api_instance = SwaggerAemClient::SlingApi.new

runmode = "runmode_example" # String | 

name = "name_example" # String | 


begin
  api_instance.delete_agent(runmode, name)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->delete_agent: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **delete_node**
> delete_node(path, name)



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

api_instance = SwaggerAemClient::SlingApi.new

path = "path_example" # String | 

name = "name_example" # String | 


begin
  api_instance.delete_node(path, name)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->delete_node: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **get_agent**
> get_agent(runmode, name)



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

api_instance = SwaggerAemClient::SlingApi.new

runmode = "runmode_example" # String | 

name = "name_example" # String | 


begin
  api_instance.get_agent(runmode, name)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_agent: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **get_node**
> get_node(path, name)



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

api_instance = SwaggerAemClient::SlingApi.new

path = "path_example" # String | 

name = "name_example" # String | 


begin
  api_instance.get_node(path, name)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_node: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **get_package**
> File get_package(group, name, version)



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

api_instance = SwaggerAemClient::SlingApi.new

group = "group_example" # String | 

name = "name_example" # String | 

version = "version_example" # String | 


begin
  result = api_instance.get_package(group, name, version)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_package: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream



# **get_package_filter**
> String get_package_filter(group, name, version)



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

api_instance = SwaggerAemClient::SlingApi.new

group = "group_example" # String | 

name = "name_example" # String | 

version = "version_example" # String | 


begin
  result = api_instance.get_package_filter(group, name, version)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_package_filter: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **post_agent**
> post_agent(runmode, name, opts)



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

api_instance = SwaggerAemClient::SlingApi.new

runmode = "runmode_example" # String | 

name = "name_example" # String | 

opts = { 
  jcrprimary_type: "jcrprimary_type_example", # String | 
  jcrcontentcqname: "jcrcontentcqname_example", # String | 
  jcrcontentjcrtitle: "jcrcontentjcrtitle_example", # String | 
  jcrcontentjcrdescription: "jcrcontentjcrdescription_example", # String | 
  jcrcontentslingresource_type: "jcrcontentslingresource_type_example", # String | 
  jcrcontenttransport_uri: "jcrcontenttransport_uri_example", # String | 
  jcrcontenttransport_user: "jcrcontenttransport_user_example", # String | 
  jcrcontenttransport_password: "jcrcontenttransport_password_example", # String | 
  jcrcontentlog_level: "jcrcontentlog_level_example", # String | 
  jcrcontentno_versioning: true, # BOOLEAN | 
  jcrcontentprotocol_http_headers: ["jcrcontentprotocol_http_headers_example"], # Array<String> | 
  jcrcontentprotocol_http_headers_type_hint: "jcrcontentprotocol_http_headers_type_hint_example", # String | 
  jcrcontentprotocol_http_method: "jcrcontentprotocol_http_method_example", # String | 
  jcrcontentretry_delay: "jcrcontentretry_delay_example", # String | 
  jcrcontentserialization_type: "jcrcontentserialization_type_example", # String | 
  jcrcontentjcrmixin_types: "jcrcontentjcrmixin_types_example", # String | 
  jcrcontenttrigger_receive: true, # BOOLEAN | 
  jcrcontenttrigger_specific: true, # BOOLEAN | 
  jcrcontentcqtemplate: "jcrcontentcqtemplate_example", # String | 
  jcrcontentenabled: true, # BOOLEAN | 
  jcrcontentreverse_replication: true, # BOOLEAN | 
  operation: "operation_example" # String | 
}

begin
  api_instance.post_agent(runmode, name, opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_agent: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
 **jcrprimary_type** | **String**|  | [optional] 
 **jcrcontentcqname** | **String**|  | [optional] 
 **jcrcontentjcrtitle** | **String**|  | [optional] 
 **jcrcontentjcrdescription** | **String**|  | [optional] 
 **jcrcontentslingresource_type** | **String**|  | [optional] 
 **jcrcontenttransport_uri** | **String**|  | [optional] 
 **jcrcontenttransport_user** | **String**|  | [optional] 
 **jcrcontenttransport_password** | **String**|  | [optional] 
 **jcrcontentlog_level** | **String**|  | [optional] 
 **jcrcontentno_versioning** | **BOOLEAN**|  | [optional] 
 **jcrcontentprotocol_http_headers** | [**Array&lt;String&gt;**](String.md)|  | [optional] 
 **jcrcontentprotocol_http_headers_type_hint** | **String**|  | [optional] 
 **jcrcontentprotocol_http_method** | **String**|  | [optional] 
 **jcrcontentretry_delay** | **String**|  | [optional] 
 **jcrcontentserialization_type** | **String**|  | [optional] 
 **jcrcontentjcrmixin_types** | **String**|  | [optional] 
 **jcrcontenttrigger_receive** | **BOOLEAN**|  | [optional] 
 **jcrcontenttrigger_specific** | **BOOLEAN**|  | [optional] 
 **jcrcontentcqtemplate** | **String**|  | [optional] 
 **jcrcontentenabled** | **BOOLEAN**|  | [optional] 
 **jcrcontentreverse_replication** | **BOOLEAN**|  | [optional] 
 **operation** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **post_authorizables**
> String post_authorizables(authorizable_id, intermediate_path, opts)



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

api_instance = SwaggerAemClient::SlingApi.new

authorizable_id = "authorizable_id_example" # String | 

intermediate_path = "intermediate_path_example" # String | 

opts = { 
  create_user: "create_user_example", # String | 
  create_group: "create_group_example", # String | 
  reppassword: "reppassword_example", # String | 
  profilegiven_name: "profilegiven_name_example" # String | 
}

begin
  result = api_instance.post_authorizables(authorizable_id, intermediate_path, opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_authorizables: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **String**|  | 
 **intermediate_path** | **String**|  | 
 **create_user** | **String**|  | [optional] 
 **create_group** | **String**|  | [optional] 
 **reppassword** | **String**|  | [optional] 
 **profilegiven_name** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html



# **post_config**
> post_config(runmode, name, opts)



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

api_instance = SwaggerAemClient::SlingApi.new

runmode = "runmode_example" # String | 

name = "name_example" # String | 

opts = { 
  org_apache_felix_https_nio: true, # BOOLEAN | 
  org_apache_felix_https_nio_type_hint: "org_apache_felix_https_nio_type_hint_example", # String | 
  org_apache_felix_https_keystore: "org_apache_felix_https_keystore_example", # String | 
  org_apache_felix_https_keystore_type_hint: "org_apache_felix_https_keystore_type_hint_example", # String | 
  org_apache_felix_https_keystore_password: "org_apache_felix_https_keystore_password_example", # String | 
  org_apache_felix_https_keystore_password_type_hint: "org_apache_felix_https_keystore_password_type_hint_example", # String | 
  org_apache_felix_https_keystore_key: "org_apache_felix_https_keystore_key_example", # String | 
  org_apache_felix_https_keystore_key_type_hint: "org_apache_felix_https_keystore_key_type_hint_example", # String | 
  org_apache_felix_https_keystore_key_password: "org_apache_felix_https_keystore_key_password_example", # String | 
  org_apache_felix_https_keystore_key_password_type_hint: "org_apache_felix_https_keystore_key_password_type_hint_example", # String | 
  org_apache_felix_https_truststore: "org_apache_felix_https_truststore_example", # String | 
  org_apache_felix_https_truststore_type_hint: "org_apache_felix_https_truststore_type_hint_example", # String | 
  org_apache_felix_https_truststore_password: "org_apache_felix_https_truststore_password_example", # String | 
  org_apache_felix_https_truststore_password_type_hint: "org_apache_felix_https_truststore_password_type_hint_example", # String | 
  org_apache_felix_https_clientcertificate: "org_apache_felix_https_clientcertificate_example", # String | 
  org_apache_felix_https_clientcertificate_type_hint: "org_apache_felix_https_clientcertificate_type_hint_example", # String | 
  org_apache_felix_https_enable: true, # BOOLEAN | 
  org_apache_felix_https_enable_type_hint: "org_apache_felix_https_enable_type_hint_example", # String | 
  org_osgi_service_http_port_secure: "org_osgi_service_http_port_secure_example", # String | 
  org_osgi_service_http_port_secure_type_hint: "org_osgi_service_http_port_secure_type_hint_example", # String | 
  json_maximumresults: "json_maximumresults_example", # String | 
  json_maximumresults_type_hint: "json_maximumresults_type_hint_example", # String | 
  enable_html: true, # BOOLEAN | 
  enable_html_type_hint: "enable_html_type_hint_example", # String | 
  enable_txt: true, # BOOLEAN | 
  enable_txt_type_hint: "enable_txt_type_hint_example", # String | 
  enable_xml: true, # BOOLEAN | 
  enable_xml_type_hint: "enable_xml_type_hint_example" # String | 
}

begin
  api_instance.post_config(runmode, name, opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
 **org_apache_felix_https_nio** | **BOOLEAN**|  | [optional] 
 **org_apache_felix_https_nio_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_keystore** | **String**|  | [optional] 
 **org_apache_felix_https_keystore_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_keystore_password** | **String**|  | [optional] 
 **org_apache_felix_https_keystore_password_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_keystore_key** | **String**|  | [optional] 
 **org_apache_felix_https_keystore_key_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_keystore_key_password** | **String**|  | [optional] 
 **org_apache_felix_https_keystore_key_password_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_truststore** | **String**|  | [optional] 
 **org_apache_felix_https_truststore_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_truststore_password** | **String**|  | [optional] 
 **org_apache_felix_https_truststore_password_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_clientcertificate** | **String**|  | [optional] 
 **org_apache_felix_https_clientcertificate_type_hint** | **String**|  | [optional] 
 **org_apache_felix_https_enable** | **BOOLEAN**|  | [optional] 
 **org_apache_felix_https_enable_type_hint** | **String**|  | [optional] 
 **org_osgi_service_http_port_secure** | **String**|  | [optional] 
 **org_osgi_service_http_port_secure_type_hint** | **String**|  | [optional] 
 **json_maximumresults** | **String**|  | [optional] 
 **json_maximumresults_type_hint** | **String**|  | [optional] 
 **enable_html** | **BOOLEAN**|  | [optional] 
 **enable_html_type_hint** | **String**|  | [optional] 
 **enable_txt** | **BOOLEAN**|  | [optional] 
 **enable_txt_type_hint** | **String**|  | [optional] 
 **enable_xml** | **BOOLEAN**|  | [optional] 
 **enable_xml_type_hint** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **post_node_rw**
> post_node_rw(path, name, opts)



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

api_instance = SwaggerAemClient::SlingApi.new

path = "path_example" # String | 

name = "name_example" # String | 

opts = { 
  add_members: "add_members_example" # String | 
}

begin
  api_instance.post_node_rw(path, name, opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_node_rw: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **add_members** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **post_path**
> post_path(path, jcrprimary_type, name)



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

api_instance = SwaggerAemClient::SlingApi.new

path = "path_example" # String | 

jcrprimary_type = "jcrprimary_type_example" # String | 

name = "name_example" # String | 


begin
  api_instance.post_path(path, jcrprimary_type, name)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_path: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **jcrprimary_type** | **String**|  | 
 **name** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



# **post_query**
> String post_query(path, p_limit, _1_property, _1_property_value)



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

api_instance = SwaggerAemClient::SlingApi.new

path = "path_example" # String | 

p_limit = 3.4 # Float | 

_1_property = "_1_property_example" # String | 

_1_property_value = "_1_property_value_example" # String | 


begin
  result = api_instance.post_query(path, p_limit, _1_property, _1_property_value)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_query: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **p_limit** | **Float**|  | 
 **_1_property** | **String**|  | 
 **_1_property_value** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **post_tree_activation**
> post_tree_activation(ignoredeactivated, onlymodified, path)



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

api_instance = SwaggerAemClient::SlingApi.new

ignoredeactivated = true # BOOLEAN | 

onlymodified = true # BOOLEAN | 

path = "path_example" # String | 


begin
  api_instance.post_tree_activation(ignoredeactivated, onlymodified, path)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_tree_activation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **BOOLEAN**|  | 
 **onlymodified** | **BOOLEAN**|  | 
 **path** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain



