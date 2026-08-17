# .ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **getAemProductInfo**
> getAemProductInfo()


### Example


```typescript
import { createConfiguration, ConsoleApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConsoleApi(configuration);

const request = {};

const data = await apiInstance.getAemProductInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getBundleInfo**
> BundleInfo getBundleInfo()


### Example


```typescript
import { createConfiguration, ConsoleApi } from '';
import type { ConsoleApiGetBundleInfoRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConsoleApi(configuration);

const request: ConsoleApiGetBundleInfoRequest = {
  
  name: "name_example",
};

const data = await apiInstance.getBundleInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**string**] |  | defaults to undefined


### Return type

**BundleInfo**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved bundle info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getConfigMgr**
> string getConfigMgr()


### Example


```typescript
import { createConfiguration, ConsoleApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConsoleApi(configuration);

const request = {};

const data = await apiInstance.getConfigMgr(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**string**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**5XX** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postBundle**
> postBundle()


### Example


```typescript
import { createConfiguration, ConsoleApi } from '';
import type { ConsoleApiPostBundleRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConsoleApi(configuration);

const request: ConsoleApiPostBundleRequest = {
  
  name: "name_example",
  
  action: "action_example",
};

const data = await apiInstance.postBundle(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**string**] |  | defaults to undefined
 **action** | [**string**] |  | defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postJmxRepository**
> postJmxRepository()


### Example


```typescript
import { createConfiguration, ConsoleApi } from '';
import type { ConsoleApiPostJmxRepositoryRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConsoleApi(configuration);

const request: ConsoleApiPostJmxRepositoryRequest = {
  
  action: "action_example",
};

const data = await apiInstance.postJmxRepository(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | [**string**] |  | defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postSamlConfiguration**
> SamlConfigurationInfo postSamlConfiguration()


### Example


```typescript
import { createConfiguration, ConsoleApi } from '';
import type { ConsoleApiPostSamlConfigurationRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConsoleApi(configuration);

const request: ConsoleApiPostSamlConfigurationRequest = {
  
  post: true,
  
  apply: true,
  
  _delete: true,
  
  action: "action_example",
  
  location: "$location_example",
  
  path: [
    "path_example",
  ],
  
  serviceRanking: 1,
  
  idpUrl: "idpUrl_example",
  
  idpCertAlias: "idpCertAlias_example",
  
  idpHttpRedirect: true,
  
  serviceProviderEntityId: "serviceProviderEntityId_example",
  
  assertionConsumerServiceURL: "assertionConsumerServiceURL_example",
  
  spPrivateKeyAlias: "spPrivateKeyAlias_example",
  
  keyStorePassword: "keyStorePassword_example",
  
  defaultRedirectUrl: "defaultRedirectUrl_example",
  
  userIDAttribute: "userIDAttribute_example",
  
  useEncryption: true,
  
  createUser: true,
  
  addGroupMemberships: true,
  
  groupMembershipAttribute: "groupMembershipAttribute_example",
  
  defaultGroups: [
    "defaultGroups_example",
  ],
  
  nameIdFormat: "nameIdFormat_example",
  
  synchronizeAttributes: [
    "synchronizeAttributes_example",
  ],
  
  handleLogout: true,
  
  logoutUrl: "logoutUrl_example",
  
  clockTolerance: 1,
  
  digestMethod: "digestMethod_example",
  
  signatureMethod: "signatureMethod_example",
  
  userIntermediatePath: "userIntermediatePath_example",
  
  propertylist: [
    "propertylist_example",
  ],
};

const data = await apiInstance.postSamlConfiguration(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | [**boolean**] |  | (optional) defaults to undefined
 **apply** | [**boolean**] |  | (optional) defaults to undefined
 **_delete** | [**boolean**] |  | (optional) defaults to undefined
 **action** | [**string**] |  | (optional) defaults to undefined
 **location** | [**string**] |  | (optional) defaults to undefined
 **path** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **serviceRanking** | [**number**] |  | (optional) defaults to undefined
 **idpUrl** | [**string**] |  | (optional) defaults to undefined
 **idpCertAlias** | [**string**] |  | (optional) defaults to undefined
 **idpHttpRedirect** | [**boolean**] |  | (optional) defaults to undefined
 **serviceProviderEntityId** | [**string**] |  | (optional) defaults to undefined
 **assertionConsumerServiceURL** | [**string**] |  | (optional) defaults to undefined
 **spPrivateKeyAlias** | [**string**] |  | (optional) defaults to undefined
 **keyStorePassword** | [**string**] |  | (optional) defaults to undefined
 **defaultRedirectUrl** | [**string**] |  | (optional) defaults to undefined
 **userIDAttribute** | [**string**] |  | (optional) defaults to undefined
 **useEncryption** | [**boolean**] |  | (optional) defaults to undefined
 **createUser** | [**boolean**] |  | (optional) defaults to undefined
 **addGroupMemberships** | [**boolean**] |  | (optional) defaults to undefined
 **groupMembershipAttribute** | [**string**] |  | (optional) defaults to undefined
 **defaultGroups** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **nameIdFormat** | [**string**] |  | (optional) defaults to undefined
 **synchronizeAttributes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **handleLogout** | [**boolean**] |  | (optional) defaults to undefined
 **logoutUrl** | [**string**] |  | (optional) defaults to undefined
 **clockTolerance** | [**number**] |  | (optional) defaults to undefined
 **digestMethod** | [**string**] |  | (optional) defaults to undefined
 **signatureMethod** | [**string**] |  | (optional) defaults to undefined
 **userIntermediatePath** | [**string**] |  | (optional) defaults to undefined
 **propertylist** | **Array&lt;string&gt;** |  | (optional) defaults to undefined


### Return type

**SamlConfigurationInfo**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved AEM SAML Configuration |  -  |
**302** | Default response |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


