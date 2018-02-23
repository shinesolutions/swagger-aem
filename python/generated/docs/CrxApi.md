# swaggeraem.CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_install_status**](CrxApi.md#get_install_status) | **GET** /crx/packmgr/installstatus.jsp | 
[**post_package_service**](CrxApi.md#post_package_service) | **POST** /crx/packmgr/service.jsp | 
[**post_package_service_json**](CrxApi.md#post_package_service_json) | **POST** /crx/packmgr/service/.json/{path} | 
[**post_package_update**](CrxApi.md#post_package_update) | **POST** /crx/packmgr/update.jsp | 
[**post_set_password**](CrxApi.md#post_set_password) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **get_install_status**
> InstallStatus get_install_status()



### Example
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.CrxApi(swaggeraem.ApiClient(configuration))

try:
    api_response = api_instance.get_install_status()
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service**
> str post_package_service(cmd)



### Example
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.CrxApi(swaggeraem.ApiClient(configuration))
cmd = 'cmd_example' # str | 

try:
    api_response = api_instance.post_package_service(cmd)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service_json**
> str post_package_service_json(path, cmd, group_name=group_name, package_name=package_name, package_version=package_version, charset_=charset_, force=force, recursive=recursive, package=package)



### Example
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.CrxApi(swaggeraem.ApiClient(configuration))
path = 'path_example' # str | 
cmd = 'cmd_example' # str | 
group_name = 'group_name_example' # str |  (optional)
package_name = 'package_name_example' # str |  (optional)
package_version = 'package_version_example' # str |  (optional)
charset_ = 'charset__example' # str |  (optional)
force = true # bool |  (optional)
recursive = true # bool |  (optional)
package = '/path/to/file.txt' # file |  (optional)

try:
    api_response = api_instance.post_package_service_json(path, cmd, group_name=group_name, package_name=package_name, package_version=package_version, charset_=charset_, force=force, recursive=recursive, package=package)
    pprint(api_response)
except ApiException as e:
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
 **package** | **file**|  | [optional] 

### Return type

**str**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_update**
> str post_package_update(group_name, package_name, version, path, filter=filter, charset_=charset_)



### Example
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.CrxApi(swaggeraem.ApiClient(configuration))
group_name = 'group_name_example' # str | 
package_name = 'package_name_example' # str | 
version = 'version_example' # str | 
path = 'path_example' # str | 
filter = 'filter_example' # str |  (optional)
charset_ = 'charset__example' # str |  (optional)

try:
    api_response = api_instance.post_package_update(group_name, package_name, version, path, filter=filter, charset_=charset_)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_set_password**
> str post_set_password(old, plain, verify)



### Example
```python
from __future__ import print_function
import time
import swaggeraem
from swaggeraem.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: aemAuth
configuration = swaggeraem.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swaggeraem.CrxApi(swaggeraem.ApiClient(configuration))
old = 'old_example' # str | 
plain = 'plain_example' # str | 
verify = 'verify_example' # str | 

try:
    api_response = api_instance.post_set_password(old, plain, verify)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

