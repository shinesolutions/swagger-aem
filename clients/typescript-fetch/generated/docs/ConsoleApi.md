# ConsoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAemProductInfo**](ConsoleApi.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json |  |
| [**getBundleInfo**](ConsoleApi.md#getbundleinfo) | **GET** /system/console/bundles/{name}.json |  |
| [**getConfigMgr**](ConsoleApi.md#getconfigmgr) | **GET** /system/console/configMgr |  |
| [**postBundle**](ConsoleApi.md#postbundle) | **POST** /system/console/bundles/{name} |  |
| [**postJmxRepository**](ConsoleApi.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} |  |
| [**postSamlConfiguration**](ConsoleApi.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler |  |



## getAemProductInfo

> Array&lt;string&gt; getAemProductInfo()



### Example

```ts
import {
  Configuration,
  ConsoleApi,
} from '';
import type { GetAemProductInfoRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new ConsoleApi(config);

  try {
    const data = await api.getAemProductInfo();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Array<string>**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getBundleInfo

> BundleInfo getBundleInfo(name)



### Example

```ts
import {
  Configuration,
  ConsoleApi,
} from '';
import type { GetBundleInfoRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new ConsoleApi(config);

  const body = {
    // string
    name: name_example,
  } satisfies GetBundleInfoRequest;

  try {
    const data = await api.getBundleInfo(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | `string` |  | [Defaults to `undefined`] |

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved bundle info |  -  |
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getConfigMgr

> string getConfigMgr()



### Example

```ts
import {
  Configuration,
  ConsoleApi,
} from '';
import type { GetConfigMgrRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new ConsoleApi(config);

  try {
    const data = await api.getConfigMgr();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/xml`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **5XX** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postBundle

> postBundle(name, action)



### Example

```ts
import {
  Configuration,
  ConsoleApi,
} from '';
import type { PostBundleRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new ConsoleApi(config);

  const body = {
    // string
    name: name_example,
    // string
    action: action_example,
  } satisfies PostBundleRequest;

  try {
    const data = await api.postBundle(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | `string` |  | [Defaults to `undefined`] |
| **action** | `string` |  | [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postJmxRepository

> postJmxRepository(action)



### Example

```ts
import {
  Configuration,
  ConsoleApi,
} from '';
import type { PostJmxRepositoryRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new ConsoleApi(config);

  const body = {
    // string
    action: action_example,
  } satisfies PostJmxRepositoryRequest;

  try {
    const data = await api.postJmxRepository(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | `string` |  | [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postSamlConfiguration

> SamlConfigurationInfo postSamlConfiguration(post, apply, _delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Example

```ts
import {
  Configuration,
  ConsoleApi,
} from '';
import type { PostSamlConfigurationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new ConsoleApi(config);

  const body = {
    // boolean (optional)
    post: true,
    // boolean (optional)
    apply: true,
    // boolean (optional)
    _delete: true,
    // string (optional)
    action: action_example,
    // string (optional)
    $location: $location_example,
    // Array<string> (optional)
    path: ...,
    // number (optional)
    serviceRanking: 56,
    // string (optional)
    idpUrl: idpUrl_example,
    // string (optional)
    idpCertAlias: idpCertAlias_example,
    // boolean (optional)
    idpHttpRedirect: true,
    // string (optional)
    serviceProviderEntityId: serviceProviderEntityId_example,
    // string (optional)
    assertionConsumerServiceURL: assertionConsumerServiceURL_example,
    // string (optional)
    spPrivateKeyAlias: spPrivateKeyAlias_example,
    // string (optional)
    keyStorePassword: keyStorePassword_example,
    // string (optional)
    defaultRedirectUrl: defaultRedirectUrl_example,
    // string (optional)
    userIDAttribute: userIDAttribute_example,
    // boolean (optional)
    useEncryption: true,
    // boolean (optional)
    createUser: true,
    // boolean (optional)
    addGroupMemberships: true,
    // string (optional)
    groupMembershipAttribute: groupMembershipAttribute_example,
    // Array<string> (optional)
    defaultGroups: ...,
    // string (optional)
    nameIdFormat: nameIdFormat_example,
    // Array<string> (optional)
    synchronizeAttributes: ...,
    // boolean (optional)
    handleLogout: true,
    // string (optional)
    logoutUrl: logoutUrl_example,
    // number (optional)
    clockTolerance: 56,
    // string (optional)
    digestMethod: digestMethod_example,
    // string (optional)
    signatureMethod: signatureMethod_example,
    // string (optional)
    userIntermediatePath: userIntermediatePath_example,
    // Array<string> (optional)
    propertylist: ...,
  } satisfies PostSamlConfigurationRequest;

  try {
    const data = await api.postSamlConfiguration(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **post** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **apply** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **_delete** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **action** | `string` |  | [Optional] [Defaults to `undefined`] |
| **$location** | `string` |  | [Optional] [Defaults to `undefined`] |
| **path** | `Array<string>` |  | [Optional] |
| **serviceRanking** | `number` |  | [Optional] [Defaults to `undefined`] |
| **idpUrl** | `string` |  | [Optional] [Defaults to `undefined`] |
| **idpCertAlias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **idpHttpRedirect** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **serviceProviderEntityId** | `string` |  | [Optional] [Defaults to `undefined`] |
| **assertionConsumerServiceURL** | `string` |  | [Optional] [Defaults to `undefined`] |
| **spPrivateKeyAlias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **keyStorePassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **defaultRedirectUrl** | `string` |  | [Optional] [Defaults to `undefined`] |
| **userIDAttribute** | `string` |  | [Optional] [Defaults to `undefined`] |
| **useEncryption** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **createUser** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **addGroupMemberships** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **groupMembershipAttribute** | `string` |  | [Optional] [Defaults to `undefined`] |
| **defaultGroups** | `Array<string>` |  | [Optional] |
| **nameIdFormat** | `string` |  | [Optional] [Defaults to `undefined`] |
| **synchronizeAttributes** | `Array<string>` |  | [Optional] |
| **handleLogout** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **logoutUrl** | `string` |  | [Optional] [Defaults to `undefined`] |
| **clockTolerance** | `number` |  | [Optional] [Defaults to `undefined`] |
| **digestMethod** | `string` |  | [Optional] [Defaults to `undefined`] |
| **signatureMethod** | `string` |  | [Optional] [Defaults to `undefined`] |
| **userIntermediatePath** | `string` |  | [Optional] [Defaults to `undefined`] |
| **propertylist** | `Array<string>` |  | [Optional] |

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM SAML Configuration |  -  |
| **302** | Default response |  -  |
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

