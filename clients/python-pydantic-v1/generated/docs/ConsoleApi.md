# openapi_client.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_product_info**](ConsoleApi.md#get_aem_product_info) | **GET** /system/console/status-productinfo.json | 
[**get_bundle_info**](ConsoleApi.md#get_bundle_info) | **GET** /system/console/bundles/{name}.json | 
[**get_config_mgr**](ConsoleApi.md#get_config_mgr) | **GET** /system/console/configMgr | 
[**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**post_saml_configuration**](ConsoleApi.md#post_saml_configuration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **get_aem_product_info**
> List[str] get_aem_product_info()





### Example

* Basic Authentication (aemAuth):
```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsoleApi(api_client)

    try:
        api_response = api_instance.get_aem_product_info()
        print("The response of ConsoleApi->get_aem_product_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConsoleApi->get_aem_product_info: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

**List[str]**

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

# **get_bundle_info**
> BundleInfo get_bundle_info(name)





### Example

* Basic Authentication (aemAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.bundle_info import BundleInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsoleApi(api_client)
    name = 'name_example' # str | 

    try:
        api_response = api_instance.get_bundle_info(name)
        print("The response of ConsoleApi->get_bundle_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConsoleApi->get_bundle_info: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved bundle info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_config_mgr**
> str get_config_mgr()





### Example

* Basic Authentication (aemAuth):
```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsoleApi(api_client)

    try:
        api_response = api_instance.get_config_mgr()
        print("The response of ConsoleApi->get_config_mgr:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConsoleApi->get_config_mgr: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

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
**200** | OK |  -  |
**5XX** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_bundle**
> post_bundle(name, action)





### Example

* Basic Authentication (aemAuth):
```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsoleApi(api_client)
    name = 'name_example' # str | 
    action = 'action_example' # str | 

    try:
        api_instance.post_bundle(name, action)
    except Exception as e:
        print("Exception when calling ConsoleApi->post_bundle: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 
 **action** | **str**|  | 

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

# **post_jmx_repository**
> post_jmx_repository(action)





### Example

* Basic Authentication (aemAuth):
```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsoleApi(api_client)
    action = 'action_example' # str | 

    try:
        api_instance.post_jmx_repository(action)
    except Exception as e:
        print("Exception when calling ConsoleApi->post_jmx_repository: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **str**|  | 

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

# **post_saml_configuration**
> SamlConfigurationInfo post_saml_configuration(post=post, apply=apply, delete=delete, action=action, location=location, path=path, service_ranking=service_ranking, idp_url=idp_url, idp_cert_alias=idp_cert_alias, idp_http_redirect=idp_http_redirect, service_provider_entity_id=service_provider_entity_id, assertion_consumer_service_url=assertion_consumer_service_url, sp_private_key_alias=sp_private_key_alias, key_store_password=key_store_password, default_redirect_url=default_redirect_url, user_id_attribute=user_id_attribute, use_encryption=use_encryption, create_user=create_user, add_group_memberships=add_group_memberships, group_membership_attribute=group_membership_attribute, default_groups=default_groups, name_id_format=name_id_format, synchronize_attributes=synchronize_attributes, handle_logout=handle_logout, logout_url=logout_url, clock_tolerance=clock_tolerance, digest_method=digest_method, signature_method=signature_method, user_intermediate_path=user_intermediate_path, propertylist=propertylist)





### Example

* Basic Authentication (aemAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.saml_configuration_info import SamlConfigurationInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: aemAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsoleApi(api_client)
    post = True # bool |  (optional)
    apply = True # bool |  (optional)
    delete = True # bool |  (optional)
    action = 'action_example' # str |  (optional)
    location = 'location_example' # str |  (optional)
    path = ['path_example'] # List[str] |  (optional)
    service_ranking = 56 # int |  (optional)
    idp_url = 'idp_url_example' # str |  (optional)
    idp_cert_alias = 'idp_cert_alias_example' # str |  (optional)
    idp_http_redirect = True # bool |  (optional)
    service_provider_entity_id = 'service_provider_entity_id_example' # str |  (optional)
    assertion_consumer_service_url = 'assertion_consumer_service_url_example' # str |  (optional)
    sp_private_key_alias = 'sp_private_key_alias_example' # str |  (optional)
    key_store_password = 'key_store_password_example' # str |  (optional)
    default_redirect_url = 'default_redirect_url_example' # str |  (optional)
    user_id_attribute = 'user_id_attribute_example' # str |  (optional)
    use_encryption = True # bool |  (optional)
    create_user = True # bool |  (optional)
    add_group_memberships = True # bool |  (optional)
    group_membership_attribute = 'group_membership_attribute_example' # str |  (optional)
    default_groups = ['default_groups_example'] # List[str] |  (optional)
    name_id_format = 'name_id_format_example' # str |  (optional)
    synchronize_attributes = ['synchronize_attributes_example'] # List[str] |  (optional)
    handle_logout = True # bool |  (optional)
    logout_url = 'logout_url_example' # str |  (optional)
    clock_tolerance = 56 # int |  (optional)
    digest_method = 'digest_method_example' # str |  (optional)
    signature_method = 'signature_method_example' # str |  (optional)
    user_intermediate_path = 'user_intermediate_path_example' # str |  (optional)
    propertylist = ['propertylist_example'] # List[str] |  (optional)

    try:
        api_response = api_instance.post_saml_configuration(post=post, apply=apply, delete=delete, action=action, location=location, path=path, service_ranking=service_ranking, idp_url=idp_url, idp_cert_alias=idp_cert_alias, idp_http_redirect=idp_http_redirect, service_provider_entity_id=service_provider_entity_id, assertion_consumer_service_url=assertion_consumer_service_url, sp_private_key_alias=sp_private_key_alias, key_store_password=key_store_password, default_redirect_url=default_redirect_url, user_id_attribute=user_id_attribute, use_encryption=use_encryption, create_user=create_user, add_group_memberships=add_group_memberships, group_membership_attribute=group_membership_attribute, default_groups=default_groups, name_id_format=name_id_format, synchronize_attributes=synchronize_attributes, handle_logout=handle_logout, logout_url=logout_url, clock_tolerance=clock_tolerance, digest_method=digest_method, signature_method=signature_method, user_intermediate_path=user_intermediate_path, propertylist=propertylist)
        print("The response of ConsoleApi->post_saml_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConsoleApi->post_saml_configuration: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **bool**|  | [optional] 
 **apply** | **bool**|  | [optional] 
 **delete** | **bool**|  | [optional] 
 **action** | **str**|  | [optional] 
 **location** | **str**|  | [optional] 
 **path** | [**List[str]**](str.md)|  | [optional] 
 **service_ranking** | **int**|  | [optional] 
 **idp_url** | **str**|  | [optional] 
 **idp_cert_alias** | **str**|  | [optional] 
 **idp_http_redirect** | **bool**|  | [optional] 
 **service_provider_entity_id** | **str**|  | [optional] 
 **assertion_consumer_service_url** | **str**|  | [optional] 
 **sp_private_key_alias** | **str**|  | [optional] 
 **key_store_password** | **str**|  | [optional] 
 **default_redirect_url** | **str**|  | [optional] 
 **user_id_attribute** | **str**|  | [optional] 
 **use_encryption** | **bool**|  | [optional] 
 **create_user** | **bool**|  | [optional] 
 **add_group_memberships** | **bool**|  | [optional] 
 **group_membership_attribute** | **str**|  | [optional] 
 **default_groups** | [**List[str]**](str.md)|  | [optional] 
 **name_id_format** | **str**|  | [optional] 
 **synchronize_attributes** | [**List[str]**](str.md)|  | [optional] 
 **handle_logout** | **bool**|  | [optional] 
 **logout_url** | **str**|  | [optional] 
 **clock_tolerance** | **int**|  | [optional] 
 **digest_method** | **str**|  | [optional] 
 **signature_method** | **str**|  | [optional] 
 **user_intermediate_path** | **str**|  | [optional] 
 **propertylist** | [**List[str]**](str.md)|  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved AEM SAML Configuration |  -  |
**302** | Default response |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

