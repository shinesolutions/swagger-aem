# SwaggerAemClient::SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_agent**](SlingApi.md#delete_agent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**delete_node**](SlingApi.md#delete_node) | **DELETE** /{path}/{name} | 
[**get_agent**](SlingApi.md#get_agent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**get_agents**](SlingApi.md#get_agents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**get_authorizable_keystore**](SlingApi.md#get_authorizable_keystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**get_keystore**](SlingApi.md#get_keystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**get_node**](SlingApi.md#get_node) | **GET** /{path}/{name} | 
[**get_package**](SlingApi.md#get_package) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**get_package_filter**](SlingApi.md#get_package_filter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**get_query**](SlingApi.md#get_query) | **GET** /bin/querybuilder.json | 
[**get_truststore**](SlingApi.md#get_truststore) | **GET** /etc/truststore/truststore.p12 | 
[**get_truststore_info**](SlingApi.md#get_truststore_info) | **GET** /libs/granite/security/truststore.json | 
[**post_agent**](SlingApi.md#post_agent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**post_authorizable_keystore**](SlingApi.md#post_authorizable_keystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**post_authorizables**](SlingApi.md#post_authorizables) | **POST** /libs/granite/security/post/authorizables | 
[**post_config_adobe_granite_saml_authentication_handler**](SlingApi.md#post_config_adobe_granite_saml_authentication_handler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**post_config_apache_felix_jetty_based_http_service**](SlingApi.md#post_config_apache_felix_jetty_based_http_service) | **POST** /apps/system/config/org.apache.felix.http | 
[**post_config_apache_http_components_proxy_configuration**](SlingApi.md#post_config_apache_http_components_proxy_configuration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**post_config_apache_sling_dav_ex_servlet**](SlingApi.md#post_config_apache_sling_dav_ex_servlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**post_config_apache_sling_get_servlet**](SlingApi.md#post_config_apache_sling_get_servlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**post_config_apache_sling_referrer_filter**](SlingApi.md#post_config_apache_sling_referrer_filter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**post_config_property**](SlingApi.md#post_config_property) | **POST** /apps/system/config/{configNodeName} | 
[**post_node**](SlingApi.md#post_node) | **POST** /{path}/{name} | 
[**post_node_rw**](SlingApi.md#post_node_rw) | **POST** /{path}/{name}.rw.html | 
[**post_path**](SlingApi.md#post_path) | **POST** /{path}/ | 
[**post_query**](SlingApi.md#post_query) | **POST** /bin/querybuilder.json | 
[**post_tree_activation**](SlingApi.md#post_tree_activation) | **POST** /libs/replication/treeactivation.html | 
[**post_truststore**](SlingApi.md#post_truststore) | **POST** /libs/granite/security/post/truststore | 
[**post_truststore_pkcs12**](SlingApi.md#post_truststore_pkcs12) | **POST** /etc/truststore | 



## delete_agent

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
runmode = 'runmode_example' # String | 
name = 'name_example' # String | 

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
- **Accept**: Not defined


## delete_node

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
path = 'path_example' # String | 
name = 'name_example' # String | 

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
- **Accept**: Not defined


## get_agent

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
runmode = 'runmode_example' # String | 
name = 'name_example' # String | 

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
- **Accept**: Not defined


## get_agents

> String get_agents(runmode)



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
runmode = 'runmode_example' # String | 

begin
  result = api_instance.get_agents(runmode)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_agents: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_authorizable_keystore

> KeystoreInfo get_authorizable_keystore(intermediate_path, authorizable_id)



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
intermediate_path = 'intermediate_path_example' # String | 
authorizable_id = 'authorizable_id_example' # String | 

begin
  result = api_instance.get_authorizable_keystore(intermediate_path, authorizable_id)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_authorizable_keystore: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **String**|  | 
 **authorizable_id** | **String**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## get_keystore

> File get_keystore(intermediate_path, authorizable_id)



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
intermediate_path = 'intermediate_path_example' # String | 
authorizable_id = 'authorizable_id_example' # String | 

begin
  result = api_instance.get_keystore(intermediate_path, authorizable_id)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_keystore: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **String**|  | 
 **authorizable_id** | **String**|  | 

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## get_node

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
path = 'path_example' # String | 
name = 'name_example' # String | 

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
- **Accept**: Not defined


## get_package

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
group = 'group_example' # String | 
name = 'name_example' # String | 
version = 'version_example' # String | 

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


## get_package_filter

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
group = 'group_example' # String | 
name = 'name_example' # String | 
version = 'version_example' # String | 

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


## get_query

> String get_query(path, p_limit, _1_property, _1_property_value)



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
path = 'path_example' # String | 
p_limit = 3.4 # Float | 
_1_property = '_1_property_example' # String | 
_1_property_value = '_1_property_value_example' # String | 

begin
  result = api_instance.get_query(path, p_limit, _1_property, _1_property_value)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_query: #{e}"
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


## get_truststore

> File get_truststore



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

begin
  result = api_instance.get_truststore
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_truststore: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## get_truststore_info

> TruststoreInfo get_truststore_info



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

begin
  result = api_instance.get_truststore_info
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->get_truststore_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## post_agent

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
runmode = 'runmode_example' # String | 
name = 'name_example' # String | 
opts = {
  jcrcontent_cqdistribute: true, # Boolean | 
  jcrcontent_cqdistribute_type_hint: 'jcrcontent_cqdistribute_type_hint_example', # String | 
  jcrcontent_cqname: 'jcrcontent_cqname_example', # String | 
  jcrcontent_cqtemplate: 'jcrcontent_cqtemplate_example', # String | 
  jcrcontent_enabled: true, # Boolean | 
  jcrcontent_jcrdescription: 'jcrcontent_jcrdescription_example', # String | 
  jcrcontent_jcrlast_modified: 'jcrcontent_jcrlast_modified_example', # String | 
  jcrcontent_jcrlast_modified_by: 'jcrcontent_jcrlast_modified_by_example', # String | 
  jcrcontent_jcrmixin_types: 'jcrcontent_jcrmixin_types_example', # String | 
  jcrcontent_jcrtitle: 'jcrcontent_jcrtitle_example', # String | 
  jcrcontent_log_level: 'jcrcontent_log_level_example', # String | 
  jcrcontent_no_status_update: true, # Boolean | 
  jcrcontent_no_versioning: true, # Boolean | 
  jcrcontent_protocol_connect_timeout: 3.4, # Float | 
  jcrcontent_protocol_http_connection_closed: true, # Boolean | 
  jcrcontent_protocol_http_expired: 'jcrcontent_protocol_http_expired_example', # String | 
  jcrcontent_protocol_http_headers: ['jcrcontent_protocol_http_headers_example'], # Array<String> | 
  jcrcontent_protocol_http_headers_type_hint: 'jcrcontent_protocol_http_headers_type_hint_example', # String | 
  jcrcontent_protocol_http_method: 'jcrcontent_protocol_http_method_example', # String | 
  jcrcontent_protocol_https_relaxed: true, # Boolean | 
  jcrcontent_protocol_interface: 'jcrcontent_protocol_interface_example', # String | 
  jcrcontent_protocol_socket_timeout: 3.4, # Float | 
  jcrcontent_protocol_version: 'jcrcontent_protocol_version_example', # String | 
  jcrcontent_proxy_ntlm_domain: 'jcrcontent_proxy_ntlm_domain_example', # String | 
  jcrcontent_proxy_ntlm_host: 'jcrcontent_proxy_ntlm_host_example', # String | 
  jcrcontent_proxy_host: 'jcrcontent_proxy_host_example', # String | 
  jcrcontent_proxy_password: 'jcrcontent_proxy_password_example', # String | 
  jcrcontent_proxy_port: 3.4, # Float | 
  jcrcontent_proxy_user: 'jcrcontent_proxy_user_example', # String | 
  jcrcontent_queue_batch_max_size: 3.4, # Float | 
  jcrcontent_queue_batch_mode: 'jcrcontent_queue_batch_mode_example', # String | 
  jcrcontent_queue_batch_wait_time: 3.4, # Float | 
  jcrcontent_retry_delay: 'jcrcontent_retry_delay_example', # String | 
  jcrcontent_reverse_replication: true, # Boolean | 
  jcrcontent_serialization_type: 'jcrcontent_serialization_type_example', # String | 
  jcrcontent_slingresource_type: 'jcrcontent_slingresource_type_example', # String | 
  jcrcontent_ssl: 'jcrcontent_ssl_example', # String | 
  jcrcontent_transport_ntlm_domain: 'jcrcontent_transport_ntlm_domain_example', # String | 
  jcrcontent_transport_ntlm_host: 'jcrcontent_transport_ntlm_host_example', # String | 
  jcrcontent_transport_password: 'jcrcontent_transport_password_example', # String | 
  jcrcontent_transport_uri: 'jcrcontent_transport_uri_example', # String | 
  jcrcontent_transport_user: 'jcrcontent_transport_user_example', # String | 
  jcrcontent_trigger_distribute: true, # Boolean | 
  jcrcontent_trigger_modified: true, # Boolean | 
  jcrcontent_trigger_on_off_time: true, # Boolean | 
  jcrcontent_trigger_receive: true, # Boolean | 
  jcrcontent_trigger_specific: true, # Boolean | 
  jcrcontent_user_id: 'jcrcontent_user_id_example', # String | 
  jcrprimary_type: 'jcrprimary_type_example', # String | 
  operation: 'operation_example' # String | 
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
 **jcrcontent_cqdistribute** | **Boolean**|  | [optional] 
 **jcrcontent_cqdistribute_type_hint** | **String**|  | [optional] 
 **jcrcontent_cqname** | **String**|  | [optional] 
 **jcrcontent_cqtemplate** | **String**|  | [optional] 
 **jcrcontent_enabled** | **Boolean**|  | [optional] 
 **jcrcontent_jcrdescription** | **String**|  | [optional] 
 **jcrcontent_jcrlast_modified** | **String**|  | [optional] 
 **jcrcontent_jcrlast_modified_by** | **String**|  | [optional] 
 **jcrcontent_jcrmixin_types** | **String**|  | [optional] 
 **jcrcontent_jcrtitle** | **String**|  | [optional] 
 **jcrcontent_log_level** | **String**|  | [optional] 
 **jcrcontent_no_status_update** | **Boolean**|  | [optional] 
 **jcrcontent_no_versioning** | **Boolean**|  | [optional] 
 **jcrcontent_protocol_connect_timeout** | **Float**|  | [optional] 
 **jcrcontent_protocol_http_connection_closed** | **Boolean**|  | [optional] 
 **jcrcontent_protocol_http_expired** | **String**|  | [optional] 
 **jcrcontent_protocol_http_headers** | [**Array&lt;String&gt;**](String.md)|  | [optional] 
 **jcrcontent_protocol_http_headers_type_hint** | **String**|  | [optional] 
 **jcrcontent_protocol_http_method** | **String**|  | [optional] 
 **jcrcontent_protocol_https_relaxed** | **Boolean**|  | [optional] 
 **jcrcontent_protocol_interface** | **String**|  | [optional] 
 **jcrcontent_protocol_socket_timeout** | **Float**|  | [optional] 
 **jcrcontent_protocol_version** | **String**|  | [optional] 
 **jcrcontent_proxy_ntlm_domain** | **String**|  | [optional] 
 **jcrcontent_proxy_ntlm_host** | **String**|  | [optional] 
 **jcrcontent_proxy_host** | **String**|  | [optional] 
 **jcrcontent_proxy_password** | **String**|  | [optional] 
 **jcrcontent_proxy_port** | **Float**|  | [optional] 
 **jcrcontent_proxy_user** | **String**|  | [optional] 
 **jcrcontent_queue_batch_max_size** | **Float**|  | [optional] 
 **jcrcontent_queue_batch_mode** | **String**|  | [optional] 
 **jcrcontent_queue_batch_wait_time** | **Float**|  | [optional] 
 **jcrcontent_retry_delay** | **String**|  | [optional] 
 **jcrcontent_reverse_replication** | **Boolean**|  | [optional] 
 **jcrcontent_serialization_type** | **String**|  | [optional] 
 **jcrcontent_slingresource_type** | **String**|  | [optional] 
 **jcrcontent_ssl** | **String**|  | [optional] 
 **jcrcontent_transport_ntlm_domain** | **String**|  | [optional] 
 **jcrcontent_transport_ntlm_host** | **String**|  | [optional] 
 **jcrcontent_transport_password** | **String**|  | [optional] 
 **jcrcontent_transport_uri** | **String**|  | [optional] 
 **jcrcontent_transport_user** | **String**|  | [optional] 
 **jcrcontent_trigger_distribute** | **Boolean**|  | [optional] 
 **jcrcontent_trigger_modified** | **Boolean**|  | [optional] 
 **jcrcontent_trigger_on_off_time** | **Boolean**|  | [optional] 
 **jcrcontent_trigger_receive** | **Boolean**|  | [optional] 
 **jcrcontent_trigger_specific** | **Boolean**|  | [optional] 
 **jcrcontent_user_id** | **String**|  | [optional] 
 **jcrprimary_type** | **String**|  | [optional] 
 **operation** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_authorizable_keystore

> KeystoreInfo post_authorizable_keystore(intermediate_path, authorizable_id, opts)



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
intermediate_path = 'intermediate_path_example' # String | 
authorizable_id = 'authorizable_id_example' # String | 
opts = {
  operation: 'operation_example', # String | 
  current_password: 'current_password_example', # String | 
  new_password: 'new_password_example', # String | 
  re_password: 're_password_example', # String | 
  key_password: 'key_password_example', # String | 
  key_store_pass: 'key_store_pass_example', # String | 
  _alias: '_alias_example', # String | 
  new_alias: 'new_alias_example', # String | 
  remove_alias: 'remove_alias_example', # String | 
  cert_chain: File.new('/path/to/file'), # File | 
  pk: File.new('/path/to/file'), # File | 
  key_store: File.new('/path/to/file') # File | 
}

begin
  result = api_instance.post_authorizable_keystore(intermediate_path, authorizable_id, opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_authorizable_keystore: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **String**|  | 
 **authorizable_id** | **String**|  | 
 **operation** | **String**|  | [optional] 
 **current_password** | **String**|  | [optional] 
 **new_password** | **String**|  | [optional] 
 **re_password** | **String**|  | [optional] 
 **key_password** | **String**|  | [optional] 
 **key_store_pass** | **String**|  | [optional] 
 **_alias** | **String**|  | [optional] 
 **new_alias** | **String**|  | [optional] 
 **remove_alias** | **String**|  | [optional] 
 **cert_chain** | **File**|  | [optional] 
 **pk** | **File**|  | [optional] 
 **key_store** | **File**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


## post_authorizables

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
authorizable_id = 'authorizable_id_example' # String | 
intermediate_path = 'intermediate_path_example' # String | 
opts = {
  create_user: 'create_user_example', # String | 
  create_group: 'create_group_example', # String | 
  reppassword: 'reppassword_example', # String | 
  profile_given_name: 'profile_given_name_example' # String | 
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
 **profile_given_name** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


## post_config_adobe_granite_saml_authentication_handler

> post_config_adobe_granite_saml_authentication_handler(opts)



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
opts = {
  key_store_password: 'key_store_password_example', # String | 
  key_store_password_type_hint: 'key_store_password_type_hint_example', # String | 
  service_ranking: 56, # Integer | 
  service_ranking_type_hint: 'service_ranking_type_hint_example', # String | 
  idp_http_redirect: true, # Boolean | 
  idp_http_redirect_type_hint: 'idp_http_redirect_type_hint_example', # String | 
  create_user: true, # Boolean | 
  create_user_type_hint: 'create_user_type_hint_example', # String | 
  default_redirect_url: 'default_redirect_url_example', # String | 
  default_redirect_url_type_hint: 'default_redirect_url_type_hint_example', # String | 
  user_id_attribute: 'user_id_attribute_example', # String | 
  user_id_attribute_type_hint: 'user_id_attribute_type_hint_example', # String | 
  default_groups: ['default_groups_example'], # Array<String> | 
  default_groups_type_hint: 'default_groups_type_hint_example', # String | 
  idp_cert_alias: 'idp_cert_alias_example', # String | 
  idp_cert_alias_type_hint: 'idp_cert_alias_type_hint_example', # String | 
  add_group_memberships: true, # Boolean | 
  add_group_memberships_type_hint: 'add_group_memberships_type_hint_example', # String | 
  path: ['path_example'], # Array<String> | 
  path_type_hint: 'path_type_hint_example', # String | 
  synchronize_attributes: ['synchronize_attributes_example'], # Array<String> | 
  synchronize_attributes_type_hint: 'synchronize_attributes_type_hint_example', # String | 
  clock_tolerance: 56, # Integer | 
  clock_tolerance_type_hint: 'clock_tolerance_type_hint_example', # String | 
  group_membership_attribute: 'group_membership_attribute_example', # String | 
  group_membership_attribute_type_hint: 'group_membership_attribute_type_hint_example', # String | 
  idp_url: 'idp_url_example', # String | 
  idp_url_type_hint: 'idp_url_type_hint_example', # String | 
  logout_url: 'logout_url_example', # String | 
  logout_url_type_hint: 'logout_url_type_hint_example', # String | 
  service_provider_entity_id: 'service_provider_entity_id_example', # String | 
  service_provider_entity_id_type_hint: 'service_provider_entity_id_type_hint_example', # String | 
  assertion_consumer_service_url: 'assertion_consumer_service_url_example', # String | 
  assertion_consumer_service_url_type_hint: 'assertion_consumer_service_url_type_hint_example', # String | 
  handle_logout: true, # Boolean | 
  handle_logout_type_hint: 'handle_logout_type_hint_example', # String | 
  sp_private_key_alias: 'sp_private_key_alias_example', # String | 
  sp_private_key_alias_type_hint: 'sp_private_key_alias_type_hint_example', # String | 
  use_encryption: true, # Boolean | 
  use_encryption_type_hint: 'use_encryption_type_hint_example', # String | 
  name_id_format: 'name_id_format_example', # String | 
  name_id_format_type_hint: 'name_id_format_type_hint_example', # String | 
  digest_method: 'digest_method_example', # String | 
  digest_method_type_hint: 'digest_method_type_hint_example', # String | 
  signature_method: 'signature_method_example', # String | 
  signature_method_type_hint: 'signature_method_type_hint_example', # String | 
  user_intermediate_path: 'user_intermediate_path_example', # String | 
  user_intermediate_path_type_hint: 'user_intermediate_path_type_hint_example' # String | 
}

begin
  api_instance.post_config_adobe_granite_saml_authentication_handler(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config_adobe_granite_saml_authentication_handler: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_store_password** | **String**|  | [optional] 
 **key_store_password_type_hint** | **String**|  | [optional] 
 **service_ranking** | **Integer**|  | [optional] 
 **service_ranking_type_hint** | **String**|  | [optional] 
 **idp_http_redirect** | **Boolean**|  | [optional] 
 **idp_http_redirect_type_hint** | **String**|  | [optional] 
 **create_user** | **Boolean**|  | [optional] 
 **create_user_type_hint** | **String**|  | [optional] 
 **default_redirect_url** | **String**|  | [optional] 
 **default_redirect_url_type_hint** | **String**|  | [optional] 
 **user_id_attribute** | **String**|  | [optional] 
 **user_id_attribute_type_hint** | **String**|  | [optional] 
 **default_groups** | [**Array&lt;String&gt;**](String.md)|  | [optional] 
 **default_groups_type_hint** | **String**|  | [optional] 
 **idp_cert_alias** | **String**|  | [optional] 
 **idp_cert_alias_type_hint** | **String**|  | [optional] 
 **add_group_memberships** | **Boolean**|  | [optional] 
 **add_group_memberships_type_hint** | **String**|  | [optional] 
 **path** | [**Array&lt;String&gt;**](String.md)|  | [optional] 
 **path_type_hint** | **String**|  | [optional] 
 **synchronize_attributes** | [**Array&lt;String&gt;**](String.md)|  | [optional] 
 **synchronize_attributes_type_hint** | **String**|  | [optional] 
 **clock_tolerance** | **Integer**|  | [optional] 
 **clock_tolerance_type_hint** | **String**|  | [optional] 
 **group_membership_attribute** | **String**|  | [optional] 
 **group_membership_attribute_type_hint** | **String**|  | [optional] 
 **idp_url** | **String**|  | [optional] 
 **idp_url_type_hint** | **String**|  | [optional] 
 **logout_url** | **String**|  | [optional] 
 **logout_url_type_hint** | **String**|  | [optional] 
 **service_provider_entity_id** | **String**|  | [optional] 
 **service_provider_entity_id_type_hint** | **String**|  | [optional] 
 **assertion_consumer_service_url** | **String**|  | [optional] 
 **assertion_consumer_service_url_type_hint** | **String**|  | [optional] 
 **handle_logout** | **Boolean**|  | [optional] 
 **handle_logout_type_hint** | **String**|  | [optional] 
 **sp_private_key_alias** | **String**|  | [optional] 
 **sp_private_key_alias_type_hint** | **String**|  | [optional] 
 **use_encryption** | **Boolean**|  | [optional] 
 **use_encryption_type_hint** | **String**|  | [optional] 
 **name_id_format** | **String**|  | [optional] 
 **name_id_format_type_hint** | **String**|  | [optional] 
 **digest_method** | **String**|  | [optional] 
 **digest_method_type_hint** | **String**|  | [optional] 
 **signature_method** | **String**|  | [optional] 
 **signature_method_type_hint** | **String**|  | [optional] 
 **user_intermediate_path** | **String**|  | [optional] 
 **user_intermediate_path_type_hint** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_config_apache_felix_jetty_based_http_service

> post_config_apache_felix_jetty_based_http_service(opts)



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
opts = {
  org_apache_felix_https_nio: true, # Boolean | 
  org_apache_felix_https_nio_type_hint: 'org_apache_felix_https_nio_type_hint_example', # String | 
  org_apache_felix_https_keystore: 'org_apache_felix_https_keystore_example', # String | 
  org_apache_felix_https_keystore_type_hint: 'org_apache_felix_https_keystore_type_hint_example', # String | 
  org_apache_felix_https_keystore_password: 'org_apache_felix_https_keystore_password_example', # String | 
  org_apache_felix_https_keystore_password_type_hint: 'org_apache_felix_https_keystore_password_type_hint_example', # String | 
  org_apache_felix_https_keystore_key: 'org_apache_felix_https_keystore_key_example', # String | 
  org_apache_felix_https_keystore_key_type_hint: 'org_apache_felix_https_keystore_key_type_hint_example', # String | 
  org_apache_felix_https_keystore_key_password: 'org_apache_felix_https_keystore_key_password_example', # String | 
  org_apache_felix_https_keystore_key_password_type_hint: 'org_apache_felix_https_keystore_key_password_type_hint_example', # String | 
  org_apache_felix_https_truststore: 'org_apache_felix_https_truststore_example', # String | 
  org_apache_felix_https_truststore_type_hint: 'org_apache_felix_https_truststore_type_hint_example', # String | 
  org_apache_felix_https_truststore_password: 'org_apache_felix_https_truststore_password_example', # String | 
  org_apache_felix_https_truststore_password_type_hint: 'org_apache_felix_https_truststore_password_type_hint_example', # String | 
  org_apache_felix_https_clientcertificate: 'org_apache_felix_https_clientcertificate_example', # String | 
  org_apache_felix_https_clientcertificate_type_hint: 'org_apache_felix_https_clientcertificate_type_hint_example', # String | 
  org_apache_felix_https_enable: true, # Boolean | 
  org_apache_felix_https_enable_type_hint: 'org_apache_felix_https_enable_type_hint_example', # String | 
  org_osgi_service_http_port_secure: 'org_osgi_service_http_port_secure_example', # String | 
  org_osgi_service_http_port_secure_type_hint: 'org_osgi_service_http_port_secure_type_hint_example' # String | 
}

begin
  api_instance.post_config_apache_felix_jetty_based_http_service(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config_apache_felix_jetty_based_http_service: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org_apache_felix_https_nio** | **Boolean**|  | [optional] 
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
 **org_apache_felix_https_enable** | **Boolean**|  | [optional] 
 **org_apache_felix_https_enable_type_hint** | **String**|  | [optional] 
 **org_osgi_service_http_port_secure** | **String**|  | [optional] 
 **org_osgi_service_http_port_secure_type_hint** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_config_apache_http_components_proxy_configuration

> post_config_apache_http_components_proxy_configuration(opts)



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
opts = {
  proxy_host: 'proxy_host_example', # String | 
  proxy_host_type_hint: 'proxy_host_type_hint_example', # String | 
  proxy_port: 56, # Integer | 
  proxy_port_type_hint: 'proxy_port_type_hint_example', # String | 
  proxy_exceptions: ['proxy_exceptions_example'], # Array<String> | 
  proxy_exceptions_type_hint: 'proxy_exceptions_type_hint_example', # String | 
  proxy_enabled: true, # Boolean | 
  proxy_enabled_type_hint: 'proxy_enabled_type_hint_example', # String | 
  proxy_user: 'proxy_user_example', # String | 
  proxy_user_type_hint: 'proxy_user_type_hint_example', # String | 
  proxy_password: 'proxy_password_example', # String | 
  proxy_password_type_hint: 'proxy_password_type_hint_example' # String | 
}

begin
  api_instance.post_config_apache_http_components_proxy_configuration(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config_apache_http_components_proxy_configuration: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy_host** | **String**|  | [optional] 
 **proxy_host_type_hint** | **String**|  | [optional] 
 **proxy_port** | **Integer**|  | [optional] 
 **proxy_port_type_hint** | **String**|  | [optional] 
 **proxy_exceptions** | [**Array&lt;String&gt;**](String.md)|  | [optional] 
 **proxy_exceptions_type_hint** | **String**|  | [optional] 
 **proxy_enabled** | **Boolean**|  | [optional] 
 **proxy_enabled_type_hint** | **String**|  | [optional] 
 **proxy_user** | **String**|  | [optional] 
 **proxy_user_type_hint** | **String**|  | [optional] 
 **proxy_password** | **String**|  | [optional] 
 **proxy_password_type_hint** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_config_apache_sling_dav_ex_servlet

> post_config_apache_sling_dav_ex_servlet(opts)



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
opts = {
  _alias: '_alias_example', # String | 
  alias_type_hint: 'alias_type_hint_example', # String | 
  dav_create_absolute_uri: true, # Boolean | 
  dav_create_absolute_uri_type_hint: 'dav_create_absolute_uri_type_hint_example' # String | 
}

begin
  api_instance.post_config_apache_sling_dav_ex_servlet(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config_apache_sling_dav_ex_servlet: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_alias** | **String**|  | [optional] 
 **alias_type_hint** | **String**|  | [optional] 
 **dav_create_absolute_uri** | **Boolean**|  | [optional] 
 **dav_create_absolute_uri_type_hint** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_config_apache_sling_get_servlet

> post_config_apache_sling_get_servlet(opts)



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
opts = {
  json_maximumresults: 'json_maximumresults_example', # String | 
  json_maximumresults_type_hint: 'json_maximumresults_type_hint_example', # String | 
  enable_html: true, # Boolean | 
  enable_html_type_hint: 'enable_html_type_hint_example', # String | 
  enable_txt: true, # Boolean | 
  enable_txt_type_hint: 'enable_txt_type_hint_example', # String | 
  enable_xml: true, # Boolean | 
  enable_xml_type_hint: 'enable_xml_type_hint_example' # String | 
}

begin
  api_instance.post_config_apache_sling_get_servlet(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config_apache_sling_get_servlet: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_maximumresults** | **String**|  | [optional] 
 **json_maximumresults_type_hint** | **String**|  | [optional] 
 **enable_html** | **Boolean**|  | [optional] 
 **enable_html_type_hint** | **String**|  | [optional] 
 **enable_txt** | **Boolean**|  | [optional] 
 **enable_txt_type_hint** | **String**|  | [optional] 
 **enable_xml** | **Boolean**|  | [optional] 
 **enable_xml_type_hint** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_config_apache_sling_referrer_filter

> post_config_apache_sling_referrer_filter(opts)



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
opts = {
  allow_empty: true, # Boolean | 
  allow_empty_type_hint: 'allow_empty_type_hint_example', # String | 
  allow_hosts: 'allow_hosts_example', # String | 
  allow_hosts_type_hint: 'allow_hosts_type_hint_example', # String | 
  allow_hosts_regexp: 'allow_hosts_regexp_example', # String | 
  allow_hosts_regexp_type_hint: 'allow_hosts_regexp_type_hint_example', # String | 
  filter_methods: 'filter_methods_example', # String | 
  filter_methods_type_hint: 'filter_methods_type_hint_example' # String | 
}

begin
  api_instance.post_config_apache_sling_referrer_filter(opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config_apache_sling_referrer_filter: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow_empty** | **Boolean**|  | [optional] 
 **allow_empty_type_hint** | **String**|  | [optional] 
 **allow_hosts** | **String**|  | [optional] 
 **allow_hosts_type_hint** | **String**|  | [optional] 
 **allow_hosts_regexp** | **String**|  | [optional] 
 **allow_hosts_regexp_type_hint** | **String**|  | [optional] 
 **filter_methods** | **String**|  | [optional] 
 **filter_methods_type_hint** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_config_property

> post_config_property(config_node_name)



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
config_node_name = 'config_node_name_example' # String | 

begin
  api_instance.post_config_property(config_node_name)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_config_property: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_node_name** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_node

> post_node(path, name, opts)



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
path = 'path_example' # String | 
name = 'name_example' # String | 
opts = {
  operation: 'operation_example', # String | 
  delete_authorizable: 'delete_authorizable_example', # String | 
  file: File.new('/path/to/file') # File | 
}

begin
  api_instance.post_node(path, name, opts)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_node: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **operation** | **String**|  | [optional] 
 **delete_authorizable** | **String**|  | [optional] 
 **file** | **File**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


## post_node_rw

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
path = 'path_example' # String | 
name = 'name_example' # String | 
opts = {
  add_members: 'add_members_example' # String | 
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
- **Accept**: Not defined


## post_path

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
path = 'path_example' # String | 
jcrprimary_type = 'jcrprimary_type_example' # String | 
name = 'name_example' # String | 

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
- **Accept**: Not defined


## post_query

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
path = 'path_example' # String | 
p_limit = 3.4 # Float | 
_1_property = '_1_property_example' # String | 
_1_property_value = '_1_property_value_example' # String | 

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


## post_tree_activation

> post_tree_activation(ignoredeactivated, onlymodified, path, cmd)



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
ignoredeactivated = true # Boolean | 
onlymodified = true # Boolean | 
path = 'path_example' # String | 
cmd = 'activate' # String | 

begin
  api_instance.post_tree_activation(ignoredeactivated, onlymodified, path, cmd)
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_tree_activation: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **Boolean**|  | 
 **onlymodified** | **Boolean**|  | 
 **path** | **String**|  | 
 **cmd** | **String**|  | [default to &#39;activate&#39;]

### Return type

nil (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## post_truststore

> String post_truststore(opts)



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
opts = {
  operation: 'operation_example', # String | 
  new_password: 'new_password_example', # String | 
  re_password: 're_password_example', # String | 
  key_store_type: 'key_store_type_example', # String | 
  remove_alias: 'remove_alias_example', # String | 
  certificate: File.new('/path/to/file') # File | 
}

begin
  result = api_instance.post_truststore(opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_truststore: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **String**|  | [optional] 
 **new_password** | **String**|  | [optional] 
 **re_password** | **String**|  | [optional] 
 **key_store_type** | **String**|  | [optional] 
 **remove_alias** | **String**|  | [optional] 
 **certificate** | **File**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


## post_truststore_pkcs12

> String post_truststore_pkcs12(opts)



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
opts = {
  truststore_p12: File.new('/path/to/file') # File | 
}

begin
  result = api_instance.post_truststore_pkcs12(opts)
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling SlingApi->post_truststore_pkcs12: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore_p12** | **File**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

