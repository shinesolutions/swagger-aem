# ConsoleApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getAemProductInfo**](#getaemproductinfo) | **GET** /system/console/status-productinfo.json | |
|[**getBundleInfo**](#getbundleinfo) | **GET** /system/console/bundles/{name}.json | |
|[**getConfigMgr**](#getconfigmgr) | **GET** /system/console/configMgr | |
|[**postBundle**](#postbundle) | **POST** /system/console/bundles/{name} | |
|[**postJmxRepository**](#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | |
|[**postSamlConfiguration**](#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | |

# **getAemProductInfo**
> Array<string> getAemProductInfo()


### Example

```typescript
import {
    ConsoleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConsoleApi(configuration);

const { status, data } = await apiInstance.getAemProductInfo();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**Array<string>**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBundleInfo**
> BundleInfo getBundleInfo()


### Example

```typescript
import {
    ConsoleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConsoleApi(configuration);

let name: string; // (default to undefined)

const { status, data } = await apiInstance.getBundleInfo(
    name
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **name** | [**string**] |  | defaults to undefined|


### Return type

**BundleInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Retrieved bundle info |  -  |
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getConfigMgr**
> string getConfigMgr()


### Example

```typescript
import {
    ConsoleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConsoleApi(configuration);

const { status, data } = await apiInstance.getConfigMgr();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |
|**5XX** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postBundle**
> postBundle()


### Example

```typescript
import {
    ConsoleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConsoleApi(configuration);

let name: string; // (default to undefined)
let action: string; // (default to undefined)

const { status, data } = await apiInstance.postBundle(
    name,
    action
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **name** | [**string**] |  | defaults to undefined|
| **action** | [**string**] |  | defaults to undefined|


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
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postJmxRepository**
> postJmxRepository()


### Example

```typescript
import {
    ConsoleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConsoleApi(configuration);

let action: string; // (default to undefined)

const { status, data } = await apiInstance.postJmxRepository(
    action
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **action** | [**string**] |  | defaults to undefined|


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
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSamlConfiguration**
> SamlConfigurationInfo postSamlConfiguration()


### Example

```typescript
import {
    ConsoleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConsoleApi(configuration);

let post: boolean; // (optional) (default to undefined)
let apply: boolean; // (optional) (default to undefined)
let _delete: boolean; // (optional) (default to undefined)
let action: string; // (optional) (default to undefined)
let $location: string; // (optional) (default to undefined)
let path: Array<string>; // (optional) (default to undefined)
let serviceRanking: number; // (optional) (default to undefined)
let idpUrl: string; // (optional) (default to undefined)
let idpCertAlias: string; // (optional) (default to undefined)
let idpHttpRedirect: boolean; // (optional) (default to undefined)
let serviceProviderEntityId: string; // (optional) (default to undefined)
let assertionConsumerServiceURL: string; // (optional) (default to undefined)
let spPrivateKeyAlias: string; // (optional) (default to undefined)
let keyStorePassword: string; // (optional) (default to undefined)
let defaultRedirectUrl: string; // (optional) (default to undefined)
let userIDAttribute: string; // (optional) (default to undefined)
let useEncryption: boolean; // (optional) (default to undefined)
let createUser: boolean; // (optional) (default to undefined)
let addGroupMemberships: boolean; // (optional) (default to undefined)
let groupMembershipAttribute: string; // (optional) (default to undefined)
let defaultGroups: Array<string>; // (optional) (default to undefined)
let nameIdFormat: string; // (optional) (default to undefined)
let synchronizeAttributes: Array<string>; // (optional) (default to undefined)
let handleLogout: boolean; // (optional) (default to undefined)
let logoutUrl: string; // (optional) (default to undefined)
let clockTolerance: number; // (optional) (default to undefined)
let digestMethod: string; // (optional) (default to undefined)
let signatureMethod: string; // (optional) (default to undefined)
let userIntermediatePath: string; // (optional) (default to undefined)
let propertylist: Array<string>; // (optional) (default to undefined)

const { status, data } = await apiInstance.postSamlConfiguration(
    post,
    apply,
    _delete,
    action,
    $location,
    path,
    serviceRanking,
    idpUrl,
    idpCertAlias,
    idpHttpRedirect,
    serviceProviderEntityId,
    assertionConsumerServiceURL,
    spPrivateKeyAlias,
    keyStorePassword,
    defaultRedirectUrl,
    userIDAttribute,
    useEncryption,
    createUser,
    addGroupMemberships,
    groupMembershipAttribute,
    defaultGroups,
    nameIdFormat,
    synchronizeAttributes,
    handleLogout,
    logoutUrl,
    clockTolerance,
    digestMethod,
    signatureMethod,
    userIntermediatePath,
    propertylist
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **post** | [**boolean**] |  | (optional) defaults to undefined|
| **apply** | [**boolean**] |  | (optional) defaults to undefined|
| **_delete** | [**boolean**] |  | (optional) defaults to undefined|
| **action** | [**string**] |  | (optional) defaults to undefined|
| **$location** | [**string**] |  | (optional) defaults to undefined|
| **path** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **serviceRanking** | [**number**] |  | (optional) defaults to undefined|
| **idpUrl** | [**string**] |  | (optional) defaults to undefined|
| **idpCertAlias** | [**string**] |  | (optional) defaults to undefined|
| **idpHttpRedirect** | [**boolean**] |  | (optional) defaults to undefined|
| **serviceProviderEntityId** | [**string**] |  | (optional) defaults to undefined|
| **assertionConsumerServiceURL** | [**string**] |  | (optional) defaults to undefined|
| **spPrivateKeyAlias** | [**string**] |  | (optional) defaults to undefined|
| **keyStorePassword** | [**string**] |  | (optional) defaults to undefined|
| **defaultRedirectUrl** | [**string**] |  | (optional) defaults to undefined|
| **userIDAttribute** | [**string**] |  | (optional) defaults to undefined|
| **useEncryption** | [**boolean**] |  | (optional) defaults to undefined|
| **createUser** | [**boolean**] |  | (optional) defaults to undefined|
| **addGroupMemberships** | [**boolean**] |  | (optional) defaults to undefined|
| **groupMembershipAttribute** | [**string**] |  | (optional) defaults to undefined|
| **defaultGroups** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **nameIdFormat** | [**string**] |  | (optional) defaults to undefined|
| **synchronizeAttributes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **handleLogout** | [**boolean**] |  | (optional) defaults to undefined|
| **logoutUrl** | [**string**] |  | (optional) defaults to undefined|
| **clockTolerance** | [**number**] |  | (optional) defaults to undefined|
| **digestMethod** | [**string**] |  | (optional) defaults to undefined|
| **signatureMethod** | [**string**] |  | (optional) defaults to undefined|
| **userIntermediatePath** | [**string**] |  | (optional) defaults to undefined|
| **propertylist** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|


### Return type

**SamlConfigurationInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Retrieved AEM SAML Configuration |  -  |
|**302** | Default response |  -  |
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

