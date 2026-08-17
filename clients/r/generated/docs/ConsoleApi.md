# ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemProductInfo**](ConsoleApi.md#GetAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**GetBundleInfo**](ConsoleApi.md#GetBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**GetConfigMgr**](ConsoleApi.md#GetConfigMgr) | **GET** /system/console/configMgr | 
[**PostBundle**](ConsoleApi.md#PostBundle) | **POST** /system/console/bundles/{name} | 
[**PostJmxRepository**](ConsoleApi.md#PostJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**PostSamlConfiguration**](ConsoleApi.md#PostSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **GetAemProductInfo**
> array[character] GetAemProductInfo()



### Example
```R
library(openapi)


api_instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetAemProductInfo(data_file = "result.txt")
result <- api_instance$GetAemProductInfo()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**array[character]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetBundleInfo**
> BundleInfo GetBundleInfo(name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_name <- "name_example" # character | 

api_instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetBundleInfo(var_namedata_file = "result.txt")
result <- api_instance$GetBundleInfo(var_name)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **character**|  | 

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
| **200** | Retrieved bundle info |  -  |
| **0** | Default response |  -  |

# **GetConfigMgr**
> character GetConfigMgr()



### Example
```R
library(openapi)


api_instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetConfigMgr(data_file = "result.txt")
result <- api_instance$GetConfigMgr()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **5XX** | Unexpected error. |  -  |

# **PostBundle**
> PostBundle(name, action)



### Example
```R
library(openapi)

# prepare function argument(s)
var_name <- "name_example" # character | 
var_action <- "action_example" # character | 

api_instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostBundle(var_name, var_action)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **character**|  | 
 **action** | **character**|  | 

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
| **0** | Default response |  -  |

# **PostJmxRepository**
> PostJmxRepository(action)



### Example
```R
library(openapi)

# prepare function argument(s)
var_action <- "action_example" # character | 

api_instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostJmxRepository(var_action)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **character**|  | 

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
| **0** | Default response |  -  |

# **PostSamlConfiguration**
> SamlConfigurationInfo PostSamlConfiguration(post = var.post, apply = var.apply, delete = var.delete, action = var.action, location = var.location, path = var.path, service_ranking = var.service_ranking, idp_url = var.idp_url, idp_cert_alias = var.idp_cert_alias, idp_http_redirect = var.idp_http_redirect, service_provider_entity_id = var.service_provider_entity_id, assertion_consumer_service_url = var.assertion_consumer_service_url, sp_private_key_alias = var.sp_private_key_alias, key_store_password = var.key_store_password, default_redirect_url = var.default_redirect_url, user_id_attribute = var.user_id_attribute, use_encryption = var.use_encryption, create_user = var.create_user, add_group_memberships = var.add_group_memberships, group_membership_attribute = var.group_membership_attribute, default_groups = var.default_groups, name_id_format = var.name_id_format, synchronize_attributes = var.synchronize_attributes, handle_logout = var.handle_logout, logout_url = var.logout_url, clock_tolerance = var.clock_tolerance, digest_method = var.digest_method, signature_method = var.signature_method, user_intermediate_path = var.user_intermediate_path, propertylist = var.propertylist)



### Example
```R
library(openapi)

# prepare function argument(s)
var_post <- "post_example" # character |  (Optional)
var_apply <- "apply_example" # character |  (Optional)
var_delete <- "delete_example" # character |  (Optional)
var_action <- "action_example" # character |  (Optional)
var_location <- "location_example" # character |  (Optional)
var_path <- c("inner_example") # array[character] |  (Optional)
var_service_ranking <- 56 # integer |  (Optional)
var_idp_url <- "idp_url_example" # character |  (Optional)
var_idp_cert_alias <- "idp_cert_alias_example" # character |  (Optional)
var_idp_http_redirect <- "idp_http_redirect_example" # character |  (Optional)
var_service_provider_entity_id <- "service_provider_entity_id_example" # character |  (Optional)
var_assertion_consumer_service_url <- "assertion_consumer_service_url_example" # character |  (Optional)
var_sp_private_key_alias <- "sp_private_key_alias_example" # character |  (Optional)
var_key_store_password <- "key_store_password_example" # character |  (Optional)
var_default_redirect_url <- "default_redirect_url_example" # character |  (Optional)
var_user_id_attribute <- "user_id_attribute_example" # character |  (Optional)
var_use_encryption <- "use_encryption_example" # character |  (Optional)
var_create_user <- "create_user_example" # character |  (Optional)
var_add_group_memberships <- "add_group_memberships_example" # character |  (Optional)
var_group_membership_attribute <- "group_membership_attribute_example" # character |  (Optional)
var_default_groups <- c("inner_example") # array[character] |  (Optional)
var_name_id_format <- "name_id_format_example" # character |  (Optional)
var_synchronize_attributes <- c("inner_example") # array[character] |  (Optional)
var_handle_logout <- "handle_logout_example" # character |  (Optional)
var_logout_url <- "logout_url_example" # character |  (Optional)
var_clock_tolerance <- 56 # integer |  (Optional)
var_digest_method <- "digest_method_example" # character |  (Optional)
var_signature_method <- "signature_method_example" # character |  (Optional)
var_user_intermediate_path <- "user_intermediate_path_example" # character |  (Optional)
var_propertylist <- c("inner_example") # array[character] |  (Optional)

api_instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostSamlConfiguration(post = var_post, apply = var_apply, delete = var_delete, action = var_action, location = var_location, path = var_path, service_ranking = var_service_ranking, idp_url = var_idp_url, idp_cert_alias = var_idp_cert_alias, idp_http_redirect = var_idp_http_redirect, service_provider_entity_id = var_service_provider_entity_id, assertion_consumer_service_url = var_assertion_consumer_service_url, sp_private_key_alias = var_sp_private_key_alias, key_store_password = var_key_store_password, default_redirect_url = var_default_redirect_url, user_id_attribute = var_user_id_attribute, use_encryption = var_use_encryption, create_user = var_create_user, add_group_memberships = var_add_group_memberships, group_membership_attribute = var_group_membership_attribute, default_groups = var_default_groups, name_id_format = var_name_id_format, synchronize_attributes = var_synchronize_attributes, handle_logout = var_handle_logout, logout_url = var_logout_url, clock_tolerance = var_clock_tolerance, digest_method = var_digest_method, signature_method = var_signature_method, user_intermediate_path = var_user_intermediate_path, propertylist = var_propertylistdata_file = "result.txt")
result <- api_instance$PostSamlConfiguration(post = var_post, apply = var_apply, delete = var_delete, action = var_action, location = var_location, path = var_path, service_ranking = var_service_ranking, idp_url = var_idp_url, idp_cert_alias = var_idp_cert_alias, idp_http_redirect = var_idp_http_redirect, service_provider_entity_id = var_service_provider_entity_id, assertion_consumer_service_url = var_assertion_consumer_service_url, sp_private_key_alias = var_sp_private_key_alias, key_store_password = var_key_store_password, default_redirect_url = var_default_redirect_url, user_id_attribute = var_user_id_attribute, use_encryption = var_use_encryption, create_user = var_create_user, add_group_memberships = var_add_group_memberships, group_membership_attribute = var_group_membership_attribute, default_groups = var_default_groups, name_id_format = var_name_id_format, synchronize_attributes = var_synchronize_attributes, handle_logout = var_handle_logout, logout_url = var_logout_url, clock_tolerance = var_clock_tolerance, digest_method = var_digest_method, signature_method = var_signature_method, user_intermediate_path = var_user_intermediate_path, propertylist = var_propertylist)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **character**|  | [optional] 
 **apply** | **character**|  | [optional] 
 **delete** | **character**|  | [optional] 
 **action** | **character**|  | [optional] 
 **location** | **character**|  | [optional] 
 **path** | list( **character** )|  | [optional] 
 **service_ranking** | **integer**|  | [optional] 
 **idp_url** | **character**|  | [optional] 
 **idp_cert_alias** | **character**|  | [optional] 
 **idp_http_redirect** | **character**|  | [optional] 
 **service_provider_entity_id** | **character**|  | [optional] 
 **assertion_consumer_service_url** | **character**|  | [optional] 
 **sp_private_key_alias** | **character**|  | [optional] 
 **key_store_password** | **character**|  | [optional] 
 **default_redirect_url** | **character**|  | [optional] 
 **user_id_attribute** | **character**|  | [optional] 
 **use_encryption** | **character**|  | [optional] 
 **create_user** | **character**|  | [optional] 
 **add_group_memberships** | **character**|  | [optional] 
 **group_membership_attribute** | **character**|  | [optional] 
 **default_groups** | list( **character** )|  | [optional] 
 **name_id_format** | **character**|  | [optional] 
 **synchronize_attributes** | list( **character** )|  | [optional] 
 **handle_logout** | **character**|  | [optional] 
 **logout_url** | **character**|  | [optional] 
 **clock_tolerance** | **integer**|  | [optional] 
 **digest_method** | **character**|  | [optional] 
 **signature_method** | **character**|  | [optional] 
 **user_intermediate_path** | **character**|  | [optional] 
 **propertylist** | list( **character** )|  | [optional] 

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
| **200** | Retrieved AEM SAML Configuration |  -  |
| **302** | Default response |  -  |
| **0** | Default response |  -  |

