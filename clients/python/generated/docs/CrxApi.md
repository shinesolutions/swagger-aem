# swaggeraem.CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_crxde_status**](CrxApi.md#get_crxde_status) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**get_install_status**](CrxApi.md#get_install_status) | **GET** /crx/packmgr/installstatus.jsp | 
[**get_package_manager_servlet**](CrxApi.md#get_package_manager_servlet) | **GET** /crx/packmgr/service/script.html | 
[**post_package_service**](CrxApi.md#post_package_service) | **POST** /crx/packmgr/service.jsp | 
[**post_package_service_json**](CrxApi.md#post_package_service_json) | **POST** /crx/packmgr/service/.json/{path} | 
[**post_package_update**](CrxApi.md#post_package_update) | **POST** /crx/packmgr/update.jsp | 
[**post_set_password**](CrxApi.md#post_set_password) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **get_crxde_status**
> str get_crxde_status()



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import crx_api
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
    api_instance = crx_api.CrxApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_crxde_status()
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->get_crxde_status: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CRXDE is enabled |  -  |
**404** | CRXDE is disabled |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_install_status**
> InstallStatus get_install_status()



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import crx_api
from swaggeraem.model.install_status import InstallStatus
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
    api_instance = crx_api.CrxApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_install_status()
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->get_install_status: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved CRX package manager install status |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_manager_servlet**
> get_package_manager_servlet()



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import crx_api
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
    api_instance = crx_api.CrxApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_instance.get_package_manager_servlet()
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->get_package_manager_servlet: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | Package Manager Servlet is disabled |  -  |
**405** | Package Manager Servlet is active |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service**
> str post_package_service(cmd)



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import crx_api
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
    api_instance = crx_api.CrxApi(api_client)
    cmd = "cmd_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.post_package_service(cmd)
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->post_package_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **str**|  |

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service_json**
> str post_package_service_json(path, cmd)



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import crx_api
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
    api_instance = crx_api.CrxApi(api_client)
    path = "path_example" # str | 
    cmd = "cmd_example" # str | 
    group_name = "groupName_example" # str |  (optional)
    package_name = "packageName_example" # str |  (optional)
    package_version = "packageVersion_example" # str |  (optional)
    charset_ = "_charset__example" # str |  (optional)
    force = True # bool |  (optional)
    recursive = True # bool |  (optional)
    package = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.post_package_service_json(path, cmd)
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->post_package_service_json: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_response = api_instance.post_package_service_json(path, cmd, group_name=group_name, package_name=package_name, package_version=package_version, charset_=charset_, force=force, recursive=recursive, package=package)
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->post_package_service_json: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  |
 **cmd** | **str**|  |
 **group_name** | **str**|  | [optional]
 **package_name** | **str**|  | [optional]
 **package_version** | **str**|  | [optional]
 **charset_** | **str**|  | [optional]
 **force** | **bool**|  | [optional]
 **recursive** | **bool**|  | [optional]
 **package** | **file_type**|  | [optional]

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_update**
> str post_package_update(group_name, package_name, version, path)



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import crx_api
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
    api_instance = crx_api.CrxApi(api_client)
    group_name = "groupName_example" # str | 
    package_name = "packageName_example" # str | 
    version = "version_example" # str | 
    path = "path_example" # str | 
    filter = "filter_example" # str |  (optional)
    charset_ = "_charset__example" # str |  (optional)

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.post_package_update(group_name, package_name, version, path)
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->post_package_update: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_response = api_instance.post_package_update(group_name, package_name, version, path, filter=filter, charset_=charset_)
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->post_package_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_name** | **str**|  |
 **package_name** | **str**|  |
 **version** | **str**|  |
 **path** | **str**|  |
 **filter** | **str**|  | [optional]
 **charset_** | **str**|  | [optional]

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

# **post_set_password**
> str post_set_password(old, plain, verify)



### Example

* Basic Authentication (aemAuth):
```python
import time
import swaggeraem
from swaggeraem.api import crx_api
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
    api_instance = crx_api.CrxApi(api_client)
    old = "old_example" # str | 
    plain = "plain_example" # str | 
    verify = "verify_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.post_set_password(old, plain, verify)
        pprint(api_response)
    except swaggeraem.ApiException as e:
        print("Exception when calling CrxApi->post_set_password: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **str**|  |
 **plain** | **str**|  |
 **verify** | **str**|  |

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

