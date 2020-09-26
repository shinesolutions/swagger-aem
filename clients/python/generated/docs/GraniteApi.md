# swaggeraem.GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](GraniteApi.md#ssl_setup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **ssl_setup**
> str ssl_setup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file=privatekey_file, certificate_file=certificate_file)



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
    api_instance = swaggeraem.GraniteApi(api_client)
    keystore_password = 'keystore_password_example' # str | 
keystore_password_confirm = 'keystore_password_confirm_example' # str | 
truststore_password = 'truststore_password_example' # str | 
truststore_password_confirm = 'truststore_password_confirm_example' # str | 
https_hostname = 'https_hostname_example' # str | 
https_port = 'https_port_example' # str | 
privatekey_file = '/path/to/file' # file |  (optional)
certificate_file = '/path/to/file' # file |  (optional)

    try:
        api_response = api_instance.ssl_setup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file=privatekey_file, certificate_file=certificate_file)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling GraniteApi->ssl_setup: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore_password** | **str**|  | 
 **keystore_password_confirm** | **str**|  | 
 **truststore_password** | **str**|  | 
 **truststore_password_confirm** | **str**|  | 
 **https_hostname** | **str**|  | 
 **https_port** | **str**|  | 
 **privatekey_file** | **file**|  | [optional] 
 **certificate_file** | **file**|  | [optional] 

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

