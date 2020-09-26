# swaggeraem.SlingApi

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
[**post_tree_activation**](SlingApi.md#post_tree_activation) | **POST** /etc/replication/treeactivation.html | 
[**post_truststore**](SlingApi.md#post_truststore) | **POST** /libs/granite/security/post/truststore | 
[**post_truststore_pkcs12**](SlingApi.md#post_truststore_pkcs12) | **POST** /etc/truststore | 


# **delete_agent**
> delete_agent(runmode, name)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> delete_node(path, name)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agent**
> get_agent(runmode, name)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agents**
> str get_agents(runmode)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    runmode = 'runmode_example' # str | 

    try:
        api_response = api_instance.get_agents(runmode)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->get_agents: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_authorizable_keystore**
> KeystoreInfo get_authorizable_keystore(intermediate_path, authorizable_id)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    intermediate_path = 'intermediate_path_example' # str | 
authorizable_id = 'authorizable_id_example' # str | 

    try:
        api_response = api_instance.get_authorizable_keystore(intermediate_path, authorizable_id)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->get_authorizable_keystore: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **str**|  | 
 **authorizable_id** | **str**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved Authorizable Keystore info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_keystore**
> file get_keystore(intermediate_path, authorizable_id)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    intermediate_path = 'intermediate_path_example' # str | 
authorizable_id = 'authorizable_id_example' # str | 

    try:
        api_response = api_instance.get_keystore(intermediate_path, authorizable_id)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->get_keystore: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **str**|  | 
 **authorizable_id** | **str**|  | 

### Return type

**file**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node**
> get_node(path, name)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package**
> file get_package(group, name, version)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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

**file**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_filter**
> str get_package_filter(group, name, version)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_query**
> str get_query(path, p_limit, _1_property, _1_property_value)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    path = 'path_example' # str | 
p_limit = 3.4 # float | 
_1_property = '_1_property_example' # str | 
_1_property_value = '_1_property_value_example' # str | 

    try:
        api_response = api_instance.get_query(path, p_limit, _1_property, _1_property_value)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->get_query: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore**
> file get_truststore()



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    
    try:
        api_response = api_instance.get_truststore()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->get_truststore: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**file**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore_info**
> TruststoreInfo get_truststore_info()



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    
    try:
        api_response = api_instance.get_truststore_info()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->get_truststore_info: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved AEM Truststore info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_agent**
> post_agent(runmode, name, jcrcontent_cqdistribute=jcrcontent_cqdistribute, jcrcontent_cqdistribute_type_hint=jcrcontent_cqdistribute_type_hint, jcrcontent_cqname=jcrcontent_cqname, jcrcontent_cqtemplate=jcrcontent_cqtemplate, jcrcontent_enabled=jcrcontent_enabled, jcrcontent_jcrdescription=jcrcontent_jcrdescription, jcrcontent_jcrlast_modified=jcrcontent_jcrlast_modified, jcrcontent_jcrlast_modified_by=jcrcontent_jcrlast_modified_by, jcrcontent_jcrmixin_types=jcrcontent_jcrmixin_types, jcrcontent_jcrtitle=jcrcontent_jcrtitle, jcrcontent_log_level=jcrcontent_log_level, jcrcontent_no_status_update=jcrcontent_no_status_update, jcrcontent_no_versioning=jcrcontent_no_versioning, jcrcontent_protocol_connect_timeout=jcrcontent_protocol_connect_timeout, jcrcontent_protocol_http_connection_closed=jcrcontent_protocol_http_connection_closed, jcrcontent_protocol_http_expired=jcrcontent_protocol_http_expired, jcrcontent_protocol_http_headers=jcrcontent_protocol_http_headers, jcrcontent_protocol_http_headers_type_hint=jcrcontent_protocol_http_headers_type_hint, jcrcontent_protocol_http_method=jcrcontent_protocol_http_method, jcrcontent_protocol_https_relaxed=jcrcontent_protocol_https_relaxed, jcrcontent_protocol_interface=jcrcontent_protocol_interface, jcrcontent_protocol_socket_timeout=jcrcontent_protocol_socket_timeout, jcrcontent_protocol_version=jcrcontent_protocol_version, jcrcontent_proxy_ntlm_domain=jcrcontent_proxy_ntlm_domain, jcrcontent_proxy_ntlm_host=jcrcontent_proxy_ntlm_host, jcrcontent_proxy_host=jcrcontent_proxy_host, jcrcontent_proxy_password=jcrcontent_proxy_password, jcrcontent_proxy_port=jcrcontent_proxy_port, jcrcontent_proxy_user=jcrcontent_proxy_user, jcrcontent_queue_batch_max_size=jcrcontent_queue_batch_max_size, jcrcontent_queue_batch_mode=jcrcontent_queue_batch_mode, jcrcontent_queue_batch_wait_time=jcrcontent_queue_batch_wait_time, jcrcontent_retry_delay=jcrcontent_retry_delay, jcrcontent_reverse_replication=jcrcontent_reverse_replication, jcrcontent_serialization_type=jcrcontent_serialization_type, jcrcontent_slingresource_type=jcrcontent_slingresource_type, jcrcontent_ssl=jcrcontent_ssl, jcrcontent_transport_ntlm_domain=jcrcontent_transport_ntlm_domain, jcrcontent_transport_ntlm_host=jcrcontent_transport_ntlm_host, jcrcontent_transport_password=jcrcontent_transport_password, jcrcontent_transport_uri=jcrcontent_transport_uri, jcrcontent_transport_user=jcrcontent_transport_user, jcrcontent_trigger_distribute=jcrcontent_trigger_distribute, jcrcontent_trigger_modified=jcrcontent_trigger_modified, jcrcontent_trigger_on_off_time=jcrcontent_trigger_on_off_time, jcrcontent_trigger_receive=jcrcontent_trigger_receive, jcrcontent_trigger_specific=jcrcontent_trigger_specific, jcrcontent_user_id=jcrcontent_user_id, jcrprimary_type=jcrprimary_type, operation=operation)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    runmode = 'runmode_example' # str | 
name = 'name_example' # str | 
jcrcontent_cqdistribute = True # bool |  (optional)
jcrcontent_cqdistribute_type_hint = 'jcrcontent_cqdistribute_type_hint_example' # str |  (optional)
jcrcontent_cqname = 'jcrcontent_cqname_example' # str |  (optional)
jcrcontent_cqtemplate = 'jcrcontent_cqtemplate_example' # str |  (optional)
jcrcontent_enabled = True # bool |  (optional)
jcrcontent_jcrdescription = 'jcrcontent_jcrdescription_example' # str |  (optional)
jcrcontent_jcrlast_modified = 'jcrcontent_jcrlast_modified_example' # str |  (optional)
jcrcontent_jcrlast_modified_by = 'jcrcontent_jcrlast_modified_by_example' # str |  (optional)
jcrcontent_jcrmixin_types = 'jcrcontent_jcrmixin_types_example' # str |  (optional)
jcrcontent_jcrtitle = 'jcrcontent_jcrtitle_example' # str |  (optional)
jcrcontent_log_level = 'jcrcontent_log_level_example' # str |  (optional)
jcrcontent_no_status_update = True # bool |  (optional)
jcrcontent_no_versioning = True # bool |  (optional)
jcrcontent_protocol_connect_timeout = 3.4 # float |  (optional)
jcrcontent_protocol_http_connection_closed = True # bool |  (optional)
jcrcontent_protocol_http_expired = 'jcrcontent_protocol_http_expired_example' # str |  (optional)
jcrcontent_protocol_http_headers = ['jcrcontent_protocol_http_headers_example'] # list[str] |  (optional)
jcrcontent_protocol_http_headers_type_hint = 'jcrcontent_protocol_http_headers_type_hint_example' # str |  (optional)
jcrcontent_protocol_http_method = 'jcrcontent_protocol_http_method_example' # str |  (optional)
jcrcontent_protocol_https_relaxed = True # bool |  (optional)
jcrcontent_protocol_interface = 'jcrcontent_protocol_interface_example' # str |  (optional)
jcrcontent_protocol_socket_timeout = 3.4 # float |  (optional)
jcrcontent_protocol_version = 'jcrcontent_protocol_version_example' # str |  (optional)
jcrcontent_proxy_ntlm_domain = 'jcrcontent_proxy_ntlm_domain_example' # str |  (optional)
jcrcontent_proxy_ntlm_host = 'jcrcontent_proxy_ntlm_host_example' # str |  (optional)
jcrcontent_proxy_host = 'jcrcontent_proxy_host_example' # str |  (optional)
jcrcontent_proxy_password = 'jcrcontent_proxy_password_example' # str |  (optional)
jcrcontent_proxy_port = 3.4 # float |  (optional)
jcrcontent_proxy_user = 'jcrcontent_proxy_user_example' # str |  (optional)
jcrcontent_queue_batch_max_size = 3.4 # float |  (optional)
jcrcontent_queue_batch_mode = 'jcrcontent_queue_batch_mode_example' # str |  (optional)
jcrcontent_queue_batch_wait_time = 3.4 # float |  (optional)
jcrcontent_retry_delay = 'jcrcontent_retry_delay_example' # str |  (optional)
jcrcontent_reverse_replication = True # bool |  (optional)
jcrcontent_serialization_type = 'jcrcontent_serialization_type_example' # str |  (optional)
jcrcontent_slingresource_type = 'jcrcontent_slingresource_type_example' # str |  (optional)
jcrcontent_ssl = 'jcrcontent_ssl_example' # str |  (optional)
jcrcontent_transport_ntlm_domain = 'jcrcontent_transport_ntlm_domain_example' # str |  (optional)
jcrcontent_transport_ntlm_host = 'jcrcontent_transport_ntlm_host_example' # str |  (optional)
jcrcontent_transport_password = 'jcrcontent_transport_password_example' # str |  (optional)
jcrcontent_transport_uri = 'jcrcontent_transport_uri_example' # str |  (optional)
jcrcontent_transport_user = 'jcrcontent_transport_user_example' # str |  (optional)
jcrcontent_trigger_distribute = True # bool |  (optional)
jcrcontent_trigger_modified = True # bool |  (optional)
jcrcontent_trigger_on_off_time = True # bool |  (optional)
jcrcontent_trigger_receive = True # bool |  (optional)
jcrcontent_trigger_specific = True # bool |  (optional)
jcrcontent_user_id = 'jcrcontent_user_id_example' # str |  (optional)
jcrprimary_type = 'jcrprimary_type_example' # str |  (optional)
operation = 'operation_example' # str |  (optional)

    try:
        api_instance.post_agent(runmode, name, jcrcontent_cqdistribute=jcrcontent_cqdistribute, jcrcontent_cqdistribute_type_hint=jcrcontent_cqdistribute_type_hint, jcrcontent_cqname=jcrcontent_cqname, jcrcontent_cqtemplate=jcrcontent_cqtemplate, jcrcontent_enabled=jcrcontent_enabled, jcrcontent_jcrdescription=jcrcontent_jcrdescription, jcrcontent_jcrlast_modified=jcrcontent_jcrlast_modified, jcrcontent_jcrlast_modified_by=jcrcontent_jcrlast_modified_by, jcrcontent_jcrmixin_types=jcrcontent_jcrmixin_types, jcrcontent_jcrtitle=jcrcontent_jcrtitle, jcrcontent_log_level=jcrcontent_log_level, jcrcontent_no_status_update=jcrcontent_no_status_update, jcrcontent_no_versioning=jcrcontent_no_versioning, jcrcontent_protocol_connect_timeout=jcrcontent_protocol_connect_timeout, jcrcontent_protocol_http_connection_closed=jcrcontent_protocol_http_connection_closed, jcrcontent_protocol_http_expired=jcrcontent_protocol_http_expired, jcrcontent_protocol_http_headers=jcrcontent_protocol_http_headers, jcrcontent_protocol_http_headers_type_hint=jcrcontent_protocol_http_headers_type_hint, jcrcontent_protocol_http_method=jcrcontent_protocol_http_method, jcrcontent_protocol_https_relaxed=jcrcontent_protocol_https_relaxed, jcrcontent_protocol_interface=jcrcontent_protocol_interface, jcrcontent_protocol_socket_timeout=jcrcontent_protocol_socket_timeout, jcrcontent_protocol_version=jcrcontent_protocol_version, jcrcontent_proxy_ntlm_domain=jcrcontent_proxy_ntlm_domain, jcrcontent_proxy_ntlm_host=jcrcontent_proxy_ntlm_host, jcrcontent_proxy_host=jcrcontent_proxy_host, jcrcontent_proxy_password=jcrcontent_proxy_password, jcrcontent_proxy_port=jcrcontent_proxy_port, jcrcontent_proxy_user=jcrcontent_proxy_user, jcrcontent_queue_batch_max_size=jcrcontent_queue_batch_max_size, jcrcontent_queue_batch_mode=jcrcontent_queue_batch_mode, jcrcontent_queue_batch_wait_time=jcrcontent_queue_batch_wait_time, jcrcontent_retry_delay=jcrcontent_retry_delay, jcrcontent_reverse_replication=jcrcontent_reverse_replication, jcrcontent_serialization_type=jcrcontent_serialization_type, jcrcontent_slingresource_type=jcrcontent_slingresource_type, jcrcontent_ssl=jcrcontent_ssl, jcrcontent_transport_ntlm_domain=jcrcontent_transport_ntlm_domain, jcrcontent_transport_ntlm_host=jcrcontent_transport_ntlm_host, jcrcontent_transport_password=jcrcontent_transport_password, jcrcontent_transport_uri=jcrcontent_transport_uri, jcrcontent_transport_user=jcrcontent_transport_user, jcrcontent_trigger_distribute=jcrcontent_trigger_distribute, jcrcontent_trigger_modified=jcrcontent_trigger_modified, jcrcontent_trigger_on_off_time=jcrcontent_trigger_on_off_time, jcrcontent_trigger_receive=jcrcontent_trigger_receive, jcrcontent_trigger_specific=jcrcontent_trigger_specific, jcrcontent_user_id=jcrcontent_user_id, jcrprimary_type=jcrprimary_type, operation=operation)
    except ApiException as e:
        print("Exception when calling SlingApi->post_agent: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **str**|  | 
 **name** | **str**|  | 
 **jcrcontent_cqdistribute** | **bool**|  | [optional] 
 **jcrcontent_cqdistribute_type_hint** | **str**|  | [optional] 
 **jcrcontent_cqname** | **str**|  | [optional] 
 **jcrcontent_cqtemplate** | **str**|  | [optional] 
 **jcrcontent_enabled** | **bool**|  | [optional] 
 **jcrcontent_jcrdescription** | **str**|  | [optional] 
 **jcrcontent_jcrlast_modified** | **str**|  | [optional] 
 **jcrcontent_jcrlast_modified_by** | **str**|  | [optional] 
 **jcrcontent_jcrmixin_types** | **str**|  | [optional] 
 **jcrcontent_jcrtitle** | **str**|  | [optional] 
 **jcrcontent_log_level** | **str**|  | [optional] 
 **jcrcontent_no_status_update** | **bool**|  | [optional] 
 **jcrcontent_no_versioning** | **bool**|  | [optional] 
 **jcrcontent_protocol_connect_timeout** | **float**|  | [optional] 
 **jcrcontent_protocol_http_connection_closed** | **bool**|  | [optional] 
 **jcrcontent_protocol_http_expired** | **str**|  | [optional] 
 **jcrcontent_protocol_http_headers** | [**list[str]**](str.md)|  | [optional] 
 **jcrcontent_protocol_http_headers_type_hint** | **str**|  | [optional] 
 **jcrcontent_protocol_http_method** | **str**|  | [optional] 
 **jcrcontent_protocol_https_relaxed** | **bool**|  | [optional] 
 **jcrcontent_protocol_interface** | **str**|  | [optional] 
 **jcrcontent_protocol_socket_timeout** | **float**|  | [optional] 
 **jcrcontent_protocol_version** | **str**|  | [optional] 
 **jcrcontent_proxy_ntlm_domain** | **str**|  | [optional] 
 **jcrcontent_proxy_ntlm_host** | **str**|  | [optional] 
 **jcrcontent_proxy_host** | **str**|  | [optional] 
 **jcrcontent_proxy_password** | **str**|  | [optional] 
 **jcrcontent_proxy_port** | **float**|  | [optional] 
 **jcrcontent_proxy_user** | **str**|  | [optional] 
 **jcrcontent_queue_batch_max_size** | **float**|  | [optional] 
 **jcrcontent_queue_batch_mode** | **str**|  | [optional] 
 **jcrcontent_queue_batch_wait_time** | **float**|  | [optional] 
 **jcrcontent_retry_delay** | **str**|  | [optional] 
 **jcrcontent_reverse_replication** | **bool**|  | [optional] 
 **jcrcontent_serialization_type** | **str**|  | [optional] 
 **jcrcontent_slingresource_type** | **str**|  | [optional] 
 **jcrcontent_ssl** | **str**|  | [optional] 
 **jcrcontent_transport_ntlm_domain** | **str**|  | [optional] 
 **jcrcontent_transport_ntlm_host** | **str**|  | [optional] 
 **jcrcontent_transport_password** | **str**|  | [optional] 
 **jcrcontent_transport_uri** | **str**|  | [optional] 
 **jcrcontent_transport_user** | **str**|  | [optional] 
 **jcrcontent_trigger_distribute** | **bool**|  | [optional] 
 **jcrcontent_trigger_modified** | **bool**|  | [optional] 
 **jcrcontent_trigger_on_off_time** | **bool**|  | [optional] 
 **jcrcontent_trigger_receive** | **bool**|  | [optional] 
 **jcrcontent_trigger_specific** | **bool**|  | [optional] 
 **jcrcontent_user_id** | **str**|  | [optional] 
 **jcrprimary_type** | **str**|  | [optional] 
 **operation** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizable_keystore**
> KeystoreInfo post_authorizable_keystore(intermediate_path, authorizable_id, operation=operation, current_password=current_password, new_password=new_password, re_password=re_password, key_password=key_password, key_store_pass=key_store_pass, alias=alias, new_alias=new_alias, remove_alias=remove_alias, cert_chain=cert_chain, pk=pk, key_store=key_store)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    intermediate_path = 'intermediate_path_example' # str | 
authorizable_id = 'authorizable_id_example' # str | 
operation = 'operation_example' # str |  (optional)
current_password = 'current_password_example' # str |  (optional)
new_password = 'new_password_example' # str |  (optional)
re_password = 're_password_example' # str |  (optional)
key_password = 'key_password_example' # str |  (optional)
key_store_pass = 'key_store_pass_example' # str |  (optional)
alias = 'alias_example' # str |  (optional)
new_alias = 'new_alias_example' # str |  (optional)
remove_alias = 'remove_alias_example' # str |  (optional)
cert_chain = '/path/to/file' # file |  (optional)
pk = '/path/to/file' # file |  (optional)
key_store = '/path/to/file' # file |  (optional)

    try:
        api_response = api_instance.post_authorizable_keystore(intermediate_path, authorizable_id, operation=operation, current_password=current_password, new_password=new_password, re_password=re_password, key_password=key_password, key_store_pass=key_store_pass, alias=alias, new_alias=new_alias, remove_alias=remove_alias, cert_chain=cert_chain, pk=pk, key_store=key_store)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->post_authorizable_keystore: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **str**|  | 
 **authorizable_id** | **str**|  | 
 **operation** | **str**|  | [optional] 
 **current_password** | **str**|  | [optional] 
 **new_password** | **str**|  | [optional] 
 **re_password** | **str**|  | [optional] 
 **key_password** | **str**|  | [optional] 
 **key_store_pass** | **str**|  | [optional] 
 **alias** | **str**|  | [optional] 
 **new_alias** | **str**|  | [optional] 
 **remove_alias** | **str**|  | [optional] 
 **cert_chain** | **file**|  | [optional] 
 **pk** | **file**|  | [optional] 
 **key_store** | **file**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved Authorizable Keystore info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizables**
> str post_authorizables(authorizable_id, intermediate_path, create_user=create_user, create_group=create_group, reppassword=reppassword, profile_given_name=profile_given_name)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    authorizable_id = 'authorizable_id_example' # str | 
intermediate_path = 'intermediate_path_example' # str | 
create_user = 'create_user_example' # str |  (optional)
create_group = 'create_group_example' # str |  (optional)
reppassword = 'reppassword_example' # str |  (optional)
profile_given_name = 'profile_given_name_example' # str |  (optional)

    try:
        api_response = api_instance.post_authorizables(authorizable_id, intermediate_path, create_user=create_user, create_group=create_group, reppassword=reppassword, profile_given_name=profile_given_name)
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
 **profile_given_name** | **str**|  | [optional] 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_adobe_granite_saml_authentication_handler**
> post_config_adobe_granite_saml_authentication_handler(key_store_password=key_store_password, key_store_password_type_hint=key_store_password_type_hint, service_ranking=service_ranking, service_ranking_type_hint=service_ranking_type_hint, idp_http_redirect=idp_http_redirect, idp_http_redirect_type_hint=idp_http_redirect_type_hint, create_user=create_user, create_user_type_hint=create_user_type_hint, default_redirect_url=default_redirect_url, default_redirect_url_type_hint=default_redirect_url_type_hint, user_id_attribute=user_id_attribute, user_id_attribute_type_hint=user_id_attribute_type_hint, default_groups=default_groups, default_groups_type_hint=default_groups_type_hint, idp_cert_alias=idp_cert_alias, idp_cert_alias_type_hint=idp_cert_alias_type_hint, add_group_memberships=add_group_memberships, add_group_memberships_type_hint=add_group_memberships_type_hint, path=path, path_type_hint=path_type_hint, synchronize_attributes=synchronize_attributes, synchronize_attributes_type_hint=synchronize_attributes_type_hint, clock_tolerance=clock_tolerance, clock_tolerance_type_hint=clock_tolerance_type_hint, group_membership_attribute=group_membership_attribute, group_membership_attribute_type_hint=group_membership_attribute_type_hint, idp_url=idp_url, idp_url_type_hint=idp_url_type_hint, logout_url=logout_url, logout_url_type_hint=logout_url_type_hint, service_provider_entity_id=service_provider_entity_id, service_provider_entity_id_type_hint=service_provider_entity_id_type_hint, assertion_consumer_service_url=assertion_consumer_service_url, assertion_consumer_service_url_type_hint=assertion_consumer_service_url_type_hint, handle_logout=handle_logout, handle_logout_type_hint=handle_logout_type_hint, sp_private_key_alias=sp_private_key_alias, sp_private_key_alias_type_hint=sp_private_key_alias_type_hint, use_encryption=use_encryption, use_encryption_type_hint=use_encryption_type_hint, name_id_format=name_id_format, name_id_format_type_hint=name_id_format_type_hint, digest_method=digest_method, digest_method_type_hint=digest_method_type_hint, signature_method=signature_method, signature_method_type_hint=signature_method_type_hint, user_intermediate_path=user_intermediate_path, user_intermediate_path_type_hint=user_intermediate_path_type_hint)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    key_store_password = 'key_store_password_example' # str |  (optional)
key_store_password_type_hint = 'key_store_password_type_hint_example' # str |  (optional)
service_ranking = 56 # int |  (optional)
service_ranking_type_hint = 'service_ranking_type_hint_example' # str |  (optional)
idp_http_redirect = True # bool |  (optional)
idp_http_redirect_type_hint = 'idp_http_redirect_type_hint_example' # str |  (optional)
create_user = True # bool |  (optional)
create_user_type_hint = 'create_user_type_hint_example' # str |  (optional)
default_redirect_url = 'default_redirect_url_example' # str |  (optional)
default_redirect_url_type_hint = 'default_redirect_url_type_hint_example' # str |  (optional)
user_id_attribute = 'user_id_attribute_example' # str |  (optional)
user_id_attribute_type_hint = 'user_id_attribute_type_hint_example' # str |  (optional)
default_groups = ['default_groups_example'] # list[str] |  (optional)
default_groups_type_hint = 'default_groups_type_hint_example' # str |  (optional)
idp_cert_alias = 'idp_cert_alias_example' # str |  (optional)
idp_cert_alias_type_hint = 'idp_cert_alias_type_hint_example' # str |  (optional)
add_group_memberships = True # bool |  (optional)
add_group_memberships_type_hint = 'add_group_memberships_type_hint_example' # str |  (optional)
path = ['path_example'] # list[str] |  (optional)
path_type_hint = 'path_type_hint_example' # str |  (optional)
synchronize_attributes = ['synchronize_attributes_example'] # list[str] |  (optional)
synchronize_attributes_type_hint = 'synchronize_attributes_type_hint_example' # str |  (optional)
clock_tolerance = 56 # int |  (optional)
clock_tolerance_type_hint = 'clock_tolerance_type_hint_example' # str |  (optional)
group_membership_attribute = 'group_membership_attribute_example' # str |  (optional)
group_membership_attribute_type_hint = 'group_membership_attribute_type_hint_example' # str |  (optional)
idp_url = 'idp_url_example' # str |  (optional)
idp_url_type_hint = 'idp_url_type_hint_example' # str |  (optional)
logout_url = 'logout_url_example' # str |  (optional)
logout_url_type_hint = 'logout_url_type_hint_example' # str |  (optional)
service_provider_entity_id = 'service_provider_entity_id_example' # str |  (optional)
service_provider_entity_id_type_hint = 'service_provider_entity_id_type_hint_example' # str |  (optional)
assertion_consumer_service_url = 'assertion_consumer_service_url_example' # str |  (optional)
assertion_consumer_service_url_type_hint = 'assertion_consumer_service_url_type_hint_example' # str |  (optional)
handle_logout = True # bool |  (optional)
handle_logout_type_hint = 'handle_logout_type_hint_example' # str |  (optional)
sp_private_key_alias = 'sp_private_key_alias_example' # str |  (optional)
sp_private_key_alias_type_hint = 'sp_private_key_alias_type_hint_example' # str |  (optional)
use_encryption = True # bool |  (optional)
use_encryption_type_hint = 'use_encryption_type_hint_example' # str |  (optional)
name_id_format = 'name_id_format_example' # str |  (optional)
name_id_format_type_hint = 'name_id_format_type_hint_example' # str |  (optional)
digest_method = 'digest_method_example' # str |  (optional)
digest_method_type_hint = 'digest_method_type_hint_example' # str |  (optional)
signature_method = 'signature_method_example' # str |  (optional)
signature_method_type_hint = 'signature_method_type_hint_example' # str |  (optional)
user_intermediate_path = 'user_intermediate_path_example' # str |  (optional)
user_intermediate_path_type_hint = 'user_intermediate_path_type_hint_example' # str |  (optional)

    try:
        api_instance.post_config_adobe_granite_saml_authentication_handler(key_store_password=key_store_password, key_store_password_type_hint=key_store_password_type_hint, service_ranking=service_ranking, service_ranking_type_hint=service_ranking_type_hint, idp_http_redirect=idp_http_redirect, idp_http_redirect_type_hint=idp_http_redirect_type_hint, create_user=create_user, create_user_type_hint=create_user_type_hint, default_redirect_url=default_redirect_url, default_redirect_url_type_hint=default_redirect_url_type_hint, user_id_attribute=user_id_attribute, user_id_attribute_type_hint=user_id_attribute_type_hint, default_groups=default_groups, default_groups_type_hint=default_groups_type_hint, idp_cert_alias=idp_cert_alias, idp_cert_alias_type_hint=idp_cert_alias_type_hint, add_group_memberships=add_group_memberships, add_group_memberships_type_hint=add_group_memberships_type_hint, path=path, path_type_hint=path_type_hint, synchronize_attributes=synchronize_attributes, synchronize_attributes_type_hint=synchronize_attributes_type_hint, clock_tolerance=clock_tolerance, clock_tolerance_type_hint=clock_tolerance_type_hint, group_membership_attribute=group_membership_attribute, group_membership_attribute_type_hint=group_membership_attribute_type_hint, idp_url=idp_url, idp_url_type_hint=idp_url_type_hint, logout_url=logout_url, logout_url_type_hint=logout_url_type_hint, service_provider_entity_id=service_provider_entity_id, service_provider_entity_id_type_hint=service_provider_entity_id_type_hint, assertion_consumer_service_url=assertion_consumer_service_url, assertion_consumer_service_url_type_hint=assertion_consumer_service_url_type_hint, handle_logout=handle_logout, handle_logout_type_hint=handle_logout_type_hint, sp_private_key_alias=sp_private_key_alias, sp_private_key_alias_type_hint=sp_private_key_alias_type_hint, use_encryption=use_encryption, use_encryption_type_hint=use_encryption_type_hint, name_id_format=name_id_format, name_id_format_type_hint=name_id_format_type_hint, digest_method=digest_method, digest_method_type_hint=digest_method_type_hint, signature_method=signature_method, signature_method_type_hint=signature_method_type_hint, user_intermediate_path=user_intermediate_path, user_intermediate_path_type_hint=user_intermediate_path_type_hint)
    except ApiException as e:
        print("Exception when calling SlingApi->post_config_adobe_granite_saml_authentication_handler: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_store_password** | **str**|  | [optional] 
 **key_store_password_type_hint** | **str**|  | [optional] 
 **service_ranking** | **int**|  | [optional] 
 **service_ranking_type_hint** | **str**|  | [optional] 
 **idp_http_redirect** | **bool**|  | [optional] 
 **idp_http_redirect_type_hint** | **str**|  | [optional] 
 **create_user** | **bool**|  | [optional] 
 **create_user_type_hint** | **str**|  | [optional] 
 **default_redirect_url** | **str**|  | [optional] 
 **default_redirect_url_type_hint** | **str**|  | [optional] 
 **user_id_attribute** | **str**|  | [optional] 
 **user_id_attribute_type_hint** | **str**|  | [optional] 
 **default_groups** | [**list[str]**](str.md)|  | [optional] 
 **default_groups_type_hint** | **str**|  | [optional] 
 **idp_cert_alias** | **str**|  | [optional] 
 **idp_cert_alias_type_hint** | **str**|  | [optional] 
 **add_group_memberships** | **bool**|  | [optional] 
 **add_group_memberships_type_hint** | **str**|  | [optional] 
 **path** | [**list[str]**](str.md)|  | [optional] 
 **path_type_hint** | **str**|  | [optional] 
 **synchronize_attributes** | [**list[str]**](str.md)|  | [optional] 
 **synchronize_attributes_type_hint** | **str**|  | [optional] 
 **clock_tolerance** | **int**|  | [optional] 
 **clock_tolerance_type_hint** | **str**|  | [optional] 
 **group_membership_attribute** | **str**|  | [optional] 
 **group_membership_attribute_type_hint** | **str**|  | [optional] 
 **idp_url** | **str**|  | [optional] 
 **idp_url_type_hint** | **str**|  | [optional] 
 **logout_url** | **str**|  | [optional] 
 **logout_url_type_hint** | **str**|  | [optional] 
 **service_provider_entity_id** | **str**|  | [optional] 
 **service_provider_entity_id_type_hint** | **str**|  | [optional] 
 **assertion_consumer_service_url** | **str**|  | [optional] 
 **assertion_consumer_service_url_type_hint** | **str**|  | [optional] 
 **handle_logout** | **bool**|  | [optional] 
 **handle_logout_type_hint** | **str**|  | [optional] 
 **sp_private_key_alias** | **str**|  | [optional] 
 **sp_private_key_alias_type_hint** | **str**|  | [optional] 
 **use_encryption** | **bool**|  | [optional] 
 **use_encryption_type_hint** | **str**|  | [optional] 
 **name_id_format** | **str**|  | [optional] 
 **name_id_format_type_hint** | **str**|  | [optional] 
 **digest_method** | **str**|  | [optional] 
 **digest_method_type_hint** | **str**|  | [optional] 
 **signature_method** | **str**|  | [optional] 
 **signature_method_type_hint** | **str**|  | [optional] 
 **user_intermediate_path** | **str**|  | [optional] 
 **user_intermediate_path_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_felix_jetty_based_http_service**
> post_config_apache_felix_jetty_based_http_service(org_apache_felix_https_nio=org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint=org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore=org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint=org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password=org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint=org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key=org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint=org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password=org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint=org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore=org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint=org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password=org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint=org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate=org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint=org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable=org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint=org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure=org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint=org_osgi_service_http_port_secure_type_hint)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    org_apache_felix_https_nio = True # bool |  (optional)
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
org_apache_felix_https_enable = True # bool |  (optional)
org_apache_felix_https_enable_type_hint = 'org_apache_felix_https_enable_type_hint_example' # str |  (optional)
org_osgi_service_http_port_secure = 'org_osgi_service_http_port_secure_example' # str |  (optional)
org_osgi_service_http_port_secure_type_hint = 'org_osgi_service_http_port_secure_type_hint_example' # str |  (optional)

    try:
        api_instance.post_config_apache_felix_jetty_based_http_service(org_apache_felix_https_nio=org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint=org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore=org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint=org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password=org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint=org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key=org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint=org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password=org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint=org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore=org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint=org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password=org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint=org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate=org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint=org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable=org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint=org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure=org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint=org_osgi_service_http_port_secure_type_hint)
    except ApiException as e:
        print("Exception when calling SlingApi->post_config_apache_felix_jetty_based_http_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
 **org_apache_felix_https_enable** | **bool**|  | [optional] 
 **org_apache_felix_https_enable_type_hint** | **str**|  | [optional] 
 **org_osgi_service_http_port_secure** | **str**|  | [optional] 
 **org_osgi_service_http_port_secure_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_http_components_proxy_configuration**
> post_config_apache_http_components_proxy_configuration(proxy_host=proxy_host, proxy_host_type_hint=proxy_host_type_hint, proxy_port=proxy_port, proxy_port_type_hint=proxy_port_type_hint, proxy_exceptions=proxy_exceptions, proxy_exceptions_type_hint=proxy_exceptions_type_hint, proxy_enabled=proxy_enabled, proxy_enabled_type_hint=proxy_enabled_type_hint, proxy_user=proxy_user, proxy_user_type_hint=proxy_user_type_hint, proxy_password=proxy_password, proxy_password_type_hint=proxy_password_type_hint)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    proxy_host = 'proxy_host_example' # str |  (optional)
proxy_host_type_hint = 'proxy_host_type_hint_example' # str |  (optional)
proxy_port = 56 # int |  (optional)
proxy_port_type_hint = 'proxy_port_type_hint_example' # str |  (optional)
proxy_exceptions = ['proxy_exceptions_example'] # list[str] |  (optional)
proxy_exceptions_type_hint = 'proxy_exceptions_type_hint_example' # str |  (optional)
proxy_enabled = True # bool |  (optional)
proxy_enabled_type_hint = 'proxy_enabled_type_hint_example' # str |  (optional)
proxy_user = 'proxy_user_example' # str |  (optional)
proxy_user_type_hint = 'proxy_user_type_hint_example' # str |  (optional)
proxy_password = 'proxy_password_example' # str |  (optional)
proxy_password_type_hint = 'proxy_password_type_hint_example' # str |  (optional)

    try:
        api_instance.post_config_apache_http_components_proxy_configuration(proxy_host=proxy_host, proxy_host_type_hint=proxy_host_type_hint, proxy_port=proxy_port, proxy_port_type_hint=proxy_port_type_hint, proxy_exceptions=proxy_exceptions, proxy_exceptions_type_hint=proxy_exceptions_type_hint, proxy_enabled=proxy_enabled, proxy_enabled_type_hint=proxy_enabled_type_hint, proxy_user=proxy_user, proxy_user_type_hint=proxy_user_type_hint, proxy_password=proxy_password, proxy_password_type_hint=proxy_password_type_hint)
    except ApiException as e:
        print("Exception when calling SlingApi->post_config_apache_http_components_proxy_configuration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy_host** | **str**|  | [optional] 
 **proxy_host_type_hint** | **str**|  | [optional] 
 **proxy_port** | **int**|  | [optional] 
 **proxy_port_type_hint** | **str**|  | [optional] 
 **proxy_exceptions** | [**list[str]**](str.md)|  | [optional] 
 **proxy_exceptions_type_hint** | **str**|  | [optional] 
 **proxy_enabled** | **bool**|  | [optional] 
 **proxy_enabled_type_hint** | **str**|  | [optional] 
 **proxy_user** | **str**|  | [optional] 
 **proxy_user_type_hint** | **str**|  | [optional] 
 **proxy_password** | **str**|  | [optional] 
 **proxy_password_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_dav_ex_servlet**
> post_config_apache_sling_dav_ex_servlet(alias=alias, alias_type_hint=alias_type_hint, dav_create_absolute_uri=dav_create_absolute_uri, dav_create_absolute_uri_type_hint=dav_create_absolute_uri_type_hint)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    alias = 'alias_example' # str |  (optional)
alias_type_hint = 'alias_type_hint_example' # str |  (optional)
dav_create_absolute_uri = True # bool |  (optional)
dav_create_absolute_uri_type_hint = 'dav_create_absolute_uri_type_hint_example' # str |  (optional)

    try:
        api_instance.post_config_apache_sling_dav_ex_servlet(alias=alias, alias_type_hint=alias_type_hint, dav_create_absolute_uri=dav_create_absolute_uri, dav_create_absolute_uri_type_hint=dav_create_absolute_uri_type_hint)
    except ApiException as e:
        print("Exception when calling SlingApi->post_config_apache_sling_dav_ex_servlet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **str**|  | [optional] 
 **alias_type_hint** | **str**|  | [optional] 
 **dav_create_absolute_uri** | **bool**|  | [optional] 
 **dav_create_absolute_uri_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_get_servlet**
> post_config_apache_sling_get_servlet(json_maximumresults=json_maximumresults, json_maximumresults_type_hint=json_maximumresults_type_hint, enable_html=enable_html, enable_html_type_hint=enable_html_type_hint, enable_txt=enable_txt, enable_txt_type_hint=enable_txt_type_hint, enable_xml=enable_xml, enable_xml_type_hint=enable_xml_type_hint)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    json_maximumresults = 'json_maximumresults_example' # str |  (optional)
json_maximumresults_type_hint = 'json_maximumresults_type_hint_example' # str |  (optional)
enable_html = True # bool |  (optional)
enable_html_type_hint = 'enable_html_type_hint_example' # str |  (optional)
enable_txt = True # bool |  (optional)
enable_txt_type_hint = 'enable_txt_type_hint_example' # str |  (optional)
enable_xml = True # bool |  (optional)
enable_xml_type_hint = 'enable_xml_type_hint_example' # str |  (optional)

    try:
        api_instance.post_config_apache_sling_get_servlet(json_maximumresults=json_maximumresults, json_maximumresults_type_hint=json_maximumresults_type_hint, enable_html=enable_html, enable_html_type_hint=enable_html_type_hint, enable_txt=enable_txt, enable_txt_type_hint=enable_txt_type_hint, enable_xml=enable_xml, enable_xml_type_hint=enable_xml_type_hint)
    except ApiException as e:
        print("Exception when calling SlingApi->post_config_apache_sling_get_servlet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_maximumresults** | **str**|  | [optional] 
 **json_maximumresults_type_hint** | **str**|  | [optional] 
 **enable_html** | **bool**|  | [optional] 
 **enable_html_type_hint** | **str**|  | [optional] 
 **enable_txt** | **bool**|  | [optional] 
 **enable_txt_type_hint** | **str**|  | [optional] 
 **enable_xml** | **bool**|  | [optional] 
 **enable_xml_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_referrer_filter**
> post_config_apache_sling_referrer_filter(allow_empty=allow_empty, allow_empty_type_hint=allow_empty_type_hint, allow_hosts=allow_hosts, allow_hosts_type_hint=allow_hosts_type_hint, allow_hosts_regexp=allow_hosts_regexp, allow_hosts_regexp_type_hint=allow_hosts_regexp_type_hint, filter_methods=filter_methods, filter_methods_type_hint=filter_methods_type_hint)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    allow_empty = True # bool |  (optional)
allow_empty_type_hint = 'allow_empty_type_hint_example' # str |  (optional)
allow_hosts = 'allow_hosts_example' # str |  (optional)
allow_hosts_type_hint = 'allow_hosts_type_hint_example' # str |  (optional)
allow_hosts_regexp = 'allow_hosts_regexp_example' # str |  (optional)
allow_hosts_regexp_type_hint = 'allow_hosts_regexp_type_hint_example' # str |  (optional)
filter_methods = 'filter_methods_example' # str |  (optional)
filter_methods_type_hint = 'filter_methods_type_hint_example' # str |  (optional)

    try:
        api_instance.post_config_apache_sling_referrer_filter(allow_empty=allow_empty, allow_empty_type_hint=allow_empty_type_hint, allow_hosts=allow_hosts, allow_hosts_type_hint=allow_hosts_type_hint, allow_hosts_regexp=allow_hosts_regexp, allow_hosts_regexp_type_hint=allow_hosts_regexp_type_hint, filter_methods=filter_methods, filter_methods_type_hint=filter_methods_type_hint)
    except ApiException as e:
        print("Exception when calling SlingApi->post_config_apache_sling_referrer_filter: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow_empty** | **bool**|  | [optional] 
 **allow_empty_type_hint** | **str**|  | [optional] 
 **allow_hosts** | **str**|  | [optional] 
 **allow_hosts_type_hint** | **str**|  | [optional] 
 **allow_hosts_regexp** | **str**|  | [optional] 
 **allow_hosts_regexp_type_hint** | **str**|  | [optional] 
 **filter_methods** | **str**|  | [optional] 
 **filter_methods_type_hint** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_property**
> post_config_property(config_node_name)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    config_node_name = 'config_node_name_example' # str | 

    try:
        api_instance.post_config_property(config_node_name)
    except ApiException as e:
        print("Exception when calling SlingApi->post_config_property: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_node_name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node**
> post_node(path, name, operation=operation, delete_authorizable=delete_authorizable, file=file)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    path = 'path_example' # str | 
name = 'name_example' # str | 
operation = 'operation_example' # str |  (optional)
delete_authorizable = 'delete_authorizable_example' # str |  (optional)
file = '/path/to/file' # file |  (optional)

    try:
        api_instance.post_node(path, name, operation=operation, delete_authorizable=delete_authorizable, file=file)
    except ApiException as e:
        print("Exception when calling SlingApi->post_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 
 **name** | **str**|  | 
 **operation** | **str**|  | [optional] 
 **delete_authorizable** | **str**|  | [optional] 
 **file** | **file**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node_rw**
> post_node_rw(path, name, add_members=add_members)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_path**
> post_path(path, jcrprimary_type, name)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_query**
> str post_query(path, p_limit, _1_property, _1_property_value)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_tree_activation**
> post_tree_activation(ignoredeactivated, onlymodified, path)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    ignoredeactivated = True # bool | 
onlymodified = True # bool | 
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore**
> str post_truststore(operation=operation, new_password=new_password, re_password=re_password, key_store_type=key_store_type, remove_alias=remove_alias, certificate=certificate)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    operation = 'operation_example' # str |  (optional)
new_password = 'new_password_example' # str |  (optional)
re_password = 're_password_example' # str |  (optional)
key_store_type = 'key_store_type_example' # str |  (optional)
remove_alias = 'remove_alias_example' # str |  (optional)
certificate = '/path/to/file' # file |  (optional)

    try:
        api_response = api_instance.post_truststore(operation=operation, new_password=new_password, re_password=re_password, key_store_type=key_store_type, remove_alias=remove_alias, certificate=certificate)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->post_truststore: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **str**|  | [optional] 
 **new_password** | **str**|  | [optional] 
 **re_password** | **str**|  | [optional] 
 **key_store_type** | **str**|  | [optional] 
 **remove_alias** | **str**|  | [optional] 
 **certificate** | **file**|  | [optional] 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore_pkcs12**
> str post_truststore_pkcs12(truststore_p12=truststore_p12)



### Example

* Basic Authentication (aemAuth):
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraem.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

# Enter a context with an instance of the API client
with swaggeraem.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swaggeraem.SlingApi(api_client)
    truststore_p12 = '/path/to/file' # file |  (optional)

    try:
        api_response = api_instance.post_truststore_pkcs12(truststore_p12=truststore_p12)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling SlingApi->post_truststore_pkcs12: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore_p12** | **file**|  | [optional] 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

