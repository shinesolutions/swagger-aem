# swaggeraem.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_product_info**](ConsoleApi.md#get_aem_product_info) | **GET** /system/console/status-productinfo.json | 
[**get_config_mgr**](ConsoleApi.md#get_config_mgr) | **GET** /system/console/configMgr | 
[**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**post_saml_configuration**](ConsoleApi.md#post_saml_configuration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **get_aem_product_info**
> list[str] get_aem_product_info()



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
api_instance = swaggeraem.ConsoleApi(swaggeraem.ApiClient(configuration))

try:
    api_response = api_instance.get_aem_product_info()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConsoleApi->get_aem_product_info: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**list[str]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_config_mgr**
> str get_config_mgr()



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
api_instance = swaggeraem.ConsoleApi(swaggeraem.ApiClient(configuration))

try:
    api_response = api_instance.get_config_mgr()
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_bundle**
> post_bundle(name, action)



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
api_instance = swaggeraem.ConsoleApi(swaggeraem.ApiClient(configuration))
name = 'name_example' # str | 
action = 'action_example' # str | 

try:
    api_instance.post_bundle(name, action)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_jmx_repository**
> post_jmx_repository(action)



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
api_instance = swaggeraem.ConsoleApi(swaggeraem.ApiClient(configuration))
action = 'action_example' # str | 

try:
    api_instance.post_jmx_repository(action)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_saml_configuration**
> SamlConfigurationInfo post_saml_configuration(post=post, apply=apply, delete=delete, action=action, location=location, path=path, service_ranking=service_ranking, idp_url=idp_url, idp_cert_alias=idp_cert_alias, idp_http_redirect=idp_http_redirect, service_provider_entity_id=service_provider_entity_id, assertion_consumer_service_url=assertion_consumer_service_url, sp_private_key_alias=sp_private_key_alias, key_store_password=key_store_password, default_redirect_url=default_redirect_url, user_id_attribute=user_id_attribute, use_encryption=use_encryption, create_user=create_user, add_group_memberships=add_group_memberships, group_membership_attribute=group_membership_attribute, default_groups=default_groups, name_id_format=name_id_format, synchronize_attributes=synchronize_attributes, handle_logout=handle_logout, logout_url=logout_url, clock_tolerance=clock_tolerance, digest_method=digest_method, signature_method=signature_method, user_intermediate_path=user_intermediate_path, propertylist=propertylist)



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
api_instance = swaggeraem.ConsoleApi(swaggeraem.ApiClient(configuration))
post = True # bool |  (optional)
apply = True # bool |  (optional)
delete = True # bool |  (optional)
action = 'action_example' # str |  (optional)
location = 'location_example' # str |  (optional)
path = ['path_example'] # list[str] |  (optional)
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
default_groups = ['default_groups_example'] # list[str] |  (optional)
name_id_format = 'name_id_format_example' # str |  (optional)
synchronize_attributes = ['synchronize_attributes_example'] # list[str] |  (optional)
handle_logout = True # bool |  (optional)
logout_url = 'logout_url_example' # str |  (optional)
clock_tolerance = 56 # int |  (optional)
digest_method = 'digest_method_example' # str |  (optional)
signature_method = 'signature_method_example' # str |  (optional)
user_intermediate_path = 'user_intermediate_path_example' # str |  (optional)
propertylist = ['propertylist_example'] # list[str] |  (optional)

try:
    api_response = api_instance.post_saml_configuration(post=post, apply=apply, delete=delete, action=action, location=location, path=path, service_ranking=service_ranking, idp_url=idp_url, idp_cert_alias=idp_cert_alias, idp_http_redirect=idp_http_redirect, service_provider_entity_id=service_provider_entity_id, assertion_consumer_service_url=assertion_consumer_service_url, sp_private_key_alias=sp_private_key_alias, key_store_password=key_store_password, default_redirect_url=default_redirect_url, user_id_attribute=user_id_attribute, use_encryption=use_encryption, create_user=create_user, add_group_memberships=add_group_memberships, group_membership_attribute=group_membership_attribute, default_groups=default_groups, name_id_format=name_id_format, synchronize_attributes=synchronize_attributes, handle_logout=handle_logout, logout_url=logout_url, clock_tolerance=clock_tolerance, digest_method=digest_method, signature_method=signature_method, user_intermediate_path=user_intermediate_path, propertylist=propertylist)
    pprint(api_response)
except ApiException as e:
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
 **path** | [**list[str]**](str.md)|  | [optional] 
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
 **default_groups** | [**list[str]**](str.md)|  | [optional] 
 **name_id_format** | **str**|  | [optional] 
 **synchronize_attributes** | [**list[str]**](str.md)|  | [optional] 
 **handle_logout** | **bool**|  | [optional] 
 **logout_url** | **str**|  | [optional] 
 **clock_tolerance** | **int**|  | [optional] 
 **digest_method** | **str**|  | [optional] 
 **signature_method** | **str**|  | [optional] 
 **user_intermediate_path** | **str**|  | [optional] 
 **propertylist** | [**list[str]**](str.md)|  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

