# swaggeraem.SlingApi

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
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
runmode = 'runmode_example' # str | 
name = 'name_example' # str | 

try: 
    api_instance.delete_agent(runmode, name)
except ApiException as e:
    print("Exception when calling SlingApi->delete_agent: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 
 **name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> delete_node(path, name)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
path = 'path_example' # str | 
name = 'name_example' # str | 

try: 
    api_instance.delete_node(path, name)
except ApiException as e:
    print("Exception when calling SlingApi->delete_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 
 **name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agent**
> get_agent(runmode, name)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
runmode = 'runmode_example' # str | 
name = 'name_example' # str | 

try: 
    api_instance.get_agent(runmode, name)
except ApiException as e:
    print("Exception when calling SlingApi->get_agent: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 
 **name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node**
> get_node(path, name)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
path = 'path_example' # str | 
name = 'name_example' # str | 

try: 
    api_instance.get_node(path, name)
except ApiException as e:
    print("Exception when calling SlingApi->get_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 
 **name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package**
> file get_package(group, name, version)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
group = 'group_example' # str | 
name = 'name_example' # str | 
version = 'version_example' # str | 

try: 
    api_response = api_instance.get_package(group, name, version)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SlingApi->get_package: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**|  | 
 **name** | **str**|  | 
 **version** | **str**|  | 

### Return type

[**file**](file.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_filter**
> str get_package_filter(group, name, version)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
group = 'group_example' # str | 
name = 'name_example' # str | 
version = 'version_example' # str | 

try: 
    api_response = api_instance.get_package_filter(group, name, version)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SlingApi->get_package_filter: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**|  | 
 **name** | **str**|  | 
 **version** | **str**|  | 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_agent**
> post_agent(runmode, name, jcrprimary_type=jcrprimary_type, jcrcontentcqname=jcrcontentcqname, jcrcontentjcrtitle=jcrcontentjcrtitle, jcrcontentjcrdescription=jcrcontentjcrdescription, jcrcontentslingresource_type=jcrcontentslingresource_type, jcrcontenttransport_uri=jcrcontenttransport_uri, jcrcontenttransport_user=jcrcontenttransport_user, jcrcontenttransport_password=jcrcontenttransport_password, jcrcontentlog_level=jcrcontentlog_level, jcrcontentno_versioning=jcrcontentno_versioning, jcrcontentprotocol_http_headers=jcrcontentprotocol_http_headers, jcrcontentprotocol_http_headers_type_hint=jcrcontentprotocol_http_headers_type_hint, jcrcontentprotocol_http_method=jcrcontentprotocol_http_method, jcrcontentretry_delay=jcrcontentretry_delay, jcrcontentserialization_type=jcrcontentserialization_type, jcrcontentjcrmixin_types=jcrcontentjcrmixin_types, jcrcontenttrigger_receive=jcrcontenttrigger_receive, jcrcontenttrigger_specific=jcrcontenttrigger_specific, jcrcontentcqtemplate=jcrcontentcqtemplate, jcrcontentenabled=jcrcontentenabled, jcrcontentreverse_replication=jcrcontentreverse_replication, operation=operation)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
runmode = 'runmode_example' # str | 
name = 'name_example' # str | 
jcrprimary_type = 'jcrprimary_type_example' # str |  (optional)
jcrcontentcqname = 'jcrcontentcqname_example' # str |  (optional)
jcrcontentjcrtitle = 'jcrcontentjcrtitle_example' # str |  (optional)
jcrcontentjcrdescription = 'jcrcontentjcrdescription_example' # str |  (optional)
jcrcontentslingresource_type = 'jcrcontentslingresource_type_example' # str |  (optional)
jcrcontenttransport_uri = 'jcrcontenttransport_uri_example' # str |  (optional)
jcrcontenttransport_user = 'jcrcontenttransport_user_example' # str |  (optional)
jcrcontenttransport_password = 'jcrcontenttransport_password_example' # str |  (optional)
jcrcontentlog_level = 'jcrcontentlog_level_example' # str |  (optional)
jcrcontentno_versioning = true # bool |  (optional)
jcrcontentprotocol_http_headers = ['jcrcontentprotocol_http_headers_example'] # list[str] |  (optional)
jcrcontentprotocol_http_headers_type_hint = 'jcrcontentprotocol_http_headers_type_hint_example' # str |  (optional)
jcrcontentprotocol_http_method = 'jcrcontentprotocol_http_method_example' # str |  (optional)
jcrcontentretry_delay = 'jcrcontentretry_delay_example' # str |  (optional)
jcrcontentserialization_type = 'jcrcontentserialization_type_example' # str |  (optional)
jcrcontentjcrmixin_types = 'jcrcontentjcrmixin_types_example' # str |  (optional)
jcrcontenttrigger_receive = true # bool |  (optional)
jcrcontenttrigger_specific = true # bool |  (optional)
jcrcontentcqtemplate = 'jcrcontentcqtemplate_example' # str |  (optional)
jcrcontentenabled = true # bool |  (optional)
jcrcontentreverse_replication = true # bool |  (optional)
operation = 'operation_example' # str |  (optional)

try: 
    api_instance.post_agent(runmode, name, jcrprimary_type=jcrprimary_type, jcrcontentcqname=jcrcontentcqname, jcrcontentjcrtitle=jcrcontentjcrtitle, jcrcontentjcrdescription=jcrcontentjcrdescription, jcrcontentslingresource_type=jcrcontentslingresource_type, jcrcontenttransport_uri=jcrcontenttransport_uri, jcrcontenttransport_user=jcrcontenttransport_user, jcrcontenttransport_password=jcrcontenttransport_password, jcrcontentlog_level=jcrcontentlog_level, jcrcontentno_versioning=jcrcontentno_versioning, jcrcontentprotocol_http_headers=jcrcontentprotocol_http_headers, jcrcontentprotocol_http_headers_type_hint=jcrcontentprotocol_http_headers_type_hint, jcrcontentprotocol_http_method=jcrcontentprotocol_http_method, jcrcontentretry_delay=jcrcontentretry_delay, jcrcontentserialization_type=jcrcontentserialization_type, jcrcontentjcrmixin_types=jcrcontentjcrmixin_types, jcrcontenttrigger_receive=jcrcontenttrigger_receive, jcrcontenttrigger_specific=jcrcontenttrigger_specific, jcrcontentcqtemplate=jcrcontentcqtemplate, jcrcontentenabled=jcrcontentenabled, jcrcontentreverse_replication=jcrcontentreverse_replication, operation=operation)
except ApiException as e:
    print("Exception when calling SlingApi->post_agent: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 
 **name** | **str**|  | 
 **jcrprimary_type** | **str**|  | [optional] 
 **jcrcontentcqname** | **str**|  | [optional] 
 **jcrcontentjcrtitle** | **str**|  | [optional] 
 **jcrcontentjcrdescription** | **str**|  | [optional] 
 **jcrcontentslingresource_type** | **str**|  | [optional] 
 **jcrcontenttransport_uri** | **str**|  | [optional] 
 **jcrcontenttransport_user** | **str**|  | [optional] 
 **jcrcontenttransport_password** | **str**|  | [optional] 
 **jcrcontentlog_level** | **str**|  | [optional] 
 **jcrcontentno_versioning** | **bool**|  | [optional] 
 **jcrcontentprotocol_http_headers** | [**list[str]**](str.md)|  | [optional] 
 **jcrcontentprotocol_http_headers_type_hint** | **str**|  | [optional] 
 **jcrcontentprotocol_http_method** | **str**|  | [optional] 
 **jcrcontentretry_delay** | **str**|  | [optional] 
 **jcrcontentserialization_type** | **str**|  | [optional] 
 **jcrcontentjcrmixin_types** | **str**|  | [optional] 
 **jcrcontenttrigger_receive** | **bool**|  | [optional] 
 **jcrcontenttrigger_specific** | **bool**|  | [optional] 
 **jcrcontentcqtemplate** | **str**|  | [optional] 
 **jcrcontentenabled** | **bool**|  | [optional] 
 **jcrcontentreverse_replication** | **bool**|  | [optional] 
 **operation** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizables**
> str post_authorizables(authorizable_id, intermediate_path, create_user=create_user, create_group=create_group, reppassword=reppassword, profilegiven_name=profilegiven_name)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
authorizable_id = 'authorizable_id_example' # str | 
intermediate_path = 'intermediate_path_example' # str | 
create_user = 'create_user_example' # str |  (optional)
create_group = 'create_group_example' # str |  (optional)
reppassword = 'reppassword_example' # str |  (optional)
profilegiven_name = 'profilegiven_name_example' # str |  (optional)

try: 
    api_response = api_instance.post_authorizables(authorizable_id, intermediate_path, create_user=create_user, create_group=create_group, reppassword=reppassword, profilegiven_name=profilegiven_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SlingApi->post_authorizables: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **str**|  | 
 **intermediate_path** | **str**|  | 
 **create_user** | **str**|  | [optional] 
 **create_group** | **str**|  | [optional] 
 **reppassword** | **str**|  | [optional] 
 **profilegiven_name** | **str**|  | [optional] 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config**
> post_config(runmode, name, org_apache_felix_https_nio=org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint=org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore=org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint=org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password=org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint=org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key=org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint=org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password=org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint=org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore=org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint=org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password=org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint=org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate=org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint=org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable=org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint=org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure=org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint=org_osgi_service_http_port_secure_type_hint)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
runmode = 'runmode_example' # str | 
name = 'name_example' # str | 
org_apache_felix_https_nio = true # bool |  (optional)
org_apache_felix_https_nio_type_hint = 'org_apache_felix_https_nio_type_hint_example' # str |  (optional)
org_apache_felix_https_keystore = 'org_apache_felix_https_keystore_example' # str |  (optional)
org_apache_felix_https_keystore_type_hint = 'org_apache_felix_https_keystore_type_hint_example' # str |  (optional)
org_apache_felix_https_keystore_password = 'org_apache_felix_https_keystore_password_example' # str |  (optional)
org_apache_felix_https_keystore_password_type_hint = 'org_apache_felix_https_keystore_password_type_hint_example' # str |  (optional)
org_apache_felix_https_keystore_key = 'org_apache_felix_https_keystore_key_example' # str |  (optional)
org_apache_felix_https_keystore_key_type_hint = 'org_apache_felix_https_keystore_key_type_hint_example' # str |  (optional)
org_apache_felix_https_keystore_key_password = 'org_apache_felix_https_keystore_key_password_example' # str |  (optional)
org_apache_felix_https_keystore_key_password_type_hint = 'org_apache_felix_https_keystore_key_password_type_hint_example' # str |  (optional)
org_apache_felix_https_truststore = 'org_apache_felix_https_truststore_example' # str |  (optional)
org_apache_felix_https_truststore_type_hint = 'org_apache_felix_https_truststore_type_hint_example' # str |  (optional)
org_apache_felix_https_truststore_password = 'org_apache_felix_https_truststore_password_example' # str |  (optional)
org_apache_felix_https_truststore_password_type_hint = 'org_apache_felix_https_truststore_password_type_hint_example' # str |  (optional)
org_apache_felix_https_clientcertificate = 'org_apache_felix_https_clientcertificate_example' # str |  (optional)
org_apache_felix_https_clientcertificate_type_hint = 'org_apache_felix_https_clientcertificate_type_hint_example' # str |  (optional)
org_apache_felix_https_enable = 'org_apache_felix_https_enable_example' # str |  (optional)
org_apache_felix_https_enable_type_hint = 'org_apache_felix_https_enable_type_hint_example' # str |  (optional)
org_osgi_service_http_port_secure = 'org_osgi_service_http_port_secure_example' # str |  (optional)
org_osgi_service_http_port_secure_type_hint = 'org_osgi_service_http_port_secure_type_hint_example' # str |  (optional)

try: 
    api_instance.post_config(runmode, name, org_apache_felix_https_nio=org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint=org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore=org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint=org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password=org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint=org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key=org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint=org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password=org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint=org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore=org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint=org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password=org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint=org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate=org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint=org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable=org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint=org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure=org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint=org_osgi_service_http_port_secure_type_hint)
except ApiException as e:
    print("Exception when calling SlingApi->post_config: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 
 **name** | **str**|  | 
 **org_apache_felix_https_nio** | **bool**|  | [optional] 
 **org_apache_felix_https_nio_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_keystore** | **str**|  | [optional] 
 **org_apache_felix_https_keystore_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_keystore_password** | **str**|  | [optional] 
 **org_apache_felix_https_keystore_password_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_keystore_key** | **str**|  | [optional] 
 **org_apache_felix_https_keystore_key_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_keystore_key_password** | **str**|  | [optional] 
 **org_apache_felix_https_keystore_key_password_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_truststore** | **str**|  | [optional] 
 **org_apache_felix_https_truststore_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_truststore_password** | **str**|  | [optional] 
 **org_apache_felix_https_truststore_password_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_clientcertificate** | **str**|  | [optional] 
 **org_apache_felix_https_clientcertificate_type_hint** | **str**|  | [optional] 
 **org_apache_felix_https_enable** | **str**|  | [optional] 
 **org_apache_felix_https_enable_type_hint** | **str**|  | [optional] 
 **org_osgi_service_http_port_secure** | **str**|  | [optional] 
 **org_osgi_service_http_port_secure_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node_rw**
> post_node_rw(path, name, add_members=add_members)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
path = 'path_example' # str | 
name = 'name_example' # str | 
add_members = 'add_members_example' # str |  (optional)

try: 
    api_instance.post_node_rw(path, name, add_members=add_members)
except ApiException as e:
    print("Exception when calling SlingApi->post_node_rw: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 
 **name** | **str**|  | 
 **add_members** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_path**
> post_path(path, jcrprimary_type, name)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
path = 'path_example' # str | 
jcrprimary_type = 'jcrprimary_type_example' # str | 
name = 'name_example' # str | 

try: 
    api_instance.post_path(path, jcrprimary_type, name)
except ApiException as e:
    print("Exception when calling SlingApi->post_path: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 
 **jcrprimary_type** | **str**|  | 
 **name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_query**
> str post_query(path, p_limit, _1_property, _1_property_value)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
path = 'path_example' # str | 
p_limit = 3.4 # float | 
_1_property = '_1_property_example' # str | 
_1_property_value = '_1_property_value_example' # str | 

try: 
    api_response = api_instance.post_query(path, p_limit, _1_property, _1_property_value)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SlingApi->post_query: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 
 **p_limit** | **float**|  | 
 **_1_property** | **str**|  | 
 **_1_property_value** | **str**|  | 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_tree_activation**
> post_tree_activation(ignoredeactivated, onlymodified, path)



### Example 
```python
from __future__ import print_statement
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
swaggeraem.configuration.username = 'YOUR_USERNAME'
swaggeraem.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.SlingApi()
ignoredeactivated = true # bool | 
onlymodified = true # bool | 
path = 'path_example' # str | 

try: 
    api_instance.post_tree_activation(ignoredeactivated, onlymodified, path)
except ApiException as e:
    print("Exception when calling SlingApi->post_tree_activation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **bool**|  | 
 **onlymodified** | **bool**|  | 
 **path** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

