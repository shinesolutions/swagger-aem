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


api.instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetAemProductInfo()
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

var.name <- 'name_example' # character | 

api.instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetBundleInfo(var.name)
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


api.instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetConfigMgr()
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

var.name <- 'name_example' # character | 
var.action <- 'action_example' # character | 

api.instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostBundle(var.name, var.action)
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

var.action <- 'action_example' # character | 

api.instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostJmxRepository(var.action)
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
> SamlConfigurationInfo PostSamlConfiguration(post=var.post, apply=var.apply, delete=var.delete, action=var.action, location=var.location, path=var.path, service.ranking=var.service.ranking, idp.url=var.idp.url, idp.cert.alias=var.idp.cert.alias, idp.http.redirect=var.idp.http.redirect, service.provider.entity.id=var.service.provider.entity.id, assertion.consumer.service.url=var.assertion.consumer.service.url, sp.private.key.alias=var.sp.private.key.alias, key.store.password=var.key.store.password, default.redirect.url=var.default.redirect.url, user.id.attribute=var.user.id.attribute, use.encryption=var.use.encryption, create.user=var.create.user, add.group.memberships=var.add.group.memberships, group.membership.attribute=var.group.membership.attribute, default.groups=var.default.groups, name.id.format=var.name.id.format, synchronize.attributes=var.synchronize.attributes, handle.logout=var.handle.logout, logout.url=var.logout.url, clock.tolerance=var.clock.tolerance, digest.method=var.digest.method, signature.method=var.signature.method, user.intermediate.path=var.user.intermediate.path, propertylist=var.propertylist)



### Example
```R
library(openapi)

var.post <- 'post_example' # character | 
var.apply <- 'apply_example' # character | 
var.delete <- 'delete_example' # character | 
var.action <- 'action_example' # character | 
var.location <- 'location_example' # character | 
var.path <- list("inner_example") # array[character] | 
var.service.ranking <- 56 # integer | 
var.idp.url <- 'idp.url_example' # character | 
var.idp.cert.alias <- 'idp.cert.alias_example' # character | 
var.idp.http.redirect <- 'idp.http.redirect_example' # character | 
var.service.provider.entity.id <- 'service.provider.entity.id_example' # character | 
var.assertion.consumer.service.url <- 'assertion.consumer.service.url_example' # character | 
var.sp.private.key.alias <- 'sp.private.key.alias_example' # character | 
var.key.store.password <- 'key.store.password_example' # character | 
var.default.redirect.url <- 'default.redirect.url_example' # character | 
var.user.id.attribute <- 'user.id.attribute_example' # character | 
var.use.encryption <- 'use.encryption_example' # character | 
var.create.user <- 'create.user_example' # character | 
var.add.group.memberships <- 'add.group.memberships_example' # character | 
var.group.membership.attribute <- 'group.membership.attribute_example' # character | 
var.default.groups <- list("inner_example") # array[character] | 
var.name.id.format <- 'name.id.format_example' # character | 
var.synchronize.attributes <- list("inner_example") # array[character] | 
var.handle.logout <- 'handle.logout_example' # character | 
var.logout.url <- 'logout.url_example' # character | 
var.clock.tolerance <- 56 # integer | 
var.digest.method <- 'digest.method_example' # character | 
var.signature.method <- 'signature.method_example' # character | 
var.user.intermediate.path <- 'user.intermediate.path_example' # character | 
var.propertylist <- list("inner_example") # array[character] | 

api.instance <- ConsoleApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostSamlConfiguration(post=var.post, apply=var.apply, delete=var.delete, action=var.action, location=var.location, path=var.path, service.ranking=var.service.ranking, idp.url=var.idp.url, idp.cert.alias=var.idp.cert.alias, idp.http.redirect=var.idp.http.redirect, service.provider.entity.id=var.service.provider.entity.id, assertion.consumer.service.url=var.assertion.consumer.service.url, sp.private.key.alias=var.sp.private.key.alias, key.store.password=var.key.store.password, default.redirect.url=var.default.redirect.url, user.id.attribute=var.user.id.attribute, use.encryption=var.use.encryption, create.user=var.create.user, add.group.memberships=var.add.group.memberships, group.membership.attribute=var.group.membership.attribute, default.groups=var.default.groups, name.id.format=var.name.id.format, synchronize.attributes=var.synchronize.attributes, handle.logout=var.handle.logout, logout.url=var.logout.url, clock.tolerance=var.clock.tolerance, digest.method=var.digest.method, signature.method=var.signature.method, user.intermediate.path=var.user.intermediate.path, propertylist=var.propertylist)
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
 **service.ranking** | **integer**|  | [optional] 
 **idp.url** | **character**|  | [optional] 
 **idp.cert.alias** | **character**|  | [optional] 
 **idp.http.redirect** | **character**|  | [optional] 
 **service.provider.entity.id** | **character**|  | [optional] 
 **assertion.consumer.service.url** | **character**|  | [optional] 
 **sp.private.key.alias** | **character**|  | [optional] 
 **key.store.password** | **character**|  | [optional] 
 **default.redirect.url** | **character**|  | [optional] 
 **user.id.attribute** | **character**|  | [optional] 
 **use.encryption** | **character**|  | [optional] 
 **create.user** | **character**|  | [optional] 
 **add.group.memberships** | **character**|  | [optional] 
 **group.membership.attribute** | **character**|  | [optional] 
 **default.groups** | list( **character** )|  | [optional] 
 **name.id.format** | **character**|  | [optional] 
 **synchronize.attributes** | list( **character** )|  | [optional] 
 **handle.logout** | **character**|  | [optional] 
 **logout.url** | **character**|  | [optional] 
 **clock.tolerance** | **integer**|  | [optional] 
 **digest.method** | **character**|  | [optional] 
 **signature.method** | **character**|  | [optional] 
 **user.intermediate.path** | **character**|  | [optional] 
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

