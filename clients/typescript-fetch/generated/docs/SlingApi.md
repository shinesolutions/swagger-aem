# SlingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAgent**](SlingApi.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} |  |
| [**deleteNode**](SlingApi.md#deletenode) | **DELETE** /{path}/{name} |  |
| [**getAgent**](SlingApi.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} |  |
| [**getAgents**](SlingApi.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json |  |
| [**getAuthorizableKeystore**](SlingApi.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json |  |
| [**getKeystore**](SlingApi.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 |  |
| [**getNode**](SlingApi.md#getnode) | **GET** /{path}/{name} |  |
| [**getPackage**](SlingApi.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip |  |
| [**getPackageFilter**](SlingApi.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json |  |
| [**getQuery**](SlingApi.md#getquery) | **GET** /bin/querybuilder.json |  |
| [**getTruststore**](SlingApi.md#gettruststore) | **GET** /etc/truststore/truststore.p12 |  |
| [**getTruststoreInfo**](SlingApi.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json |  |
| [**postAgent**](SlingApi.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} |  |
| [**postAuthorizableKeystore**](SlingApi.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html |  |
| [**postAuthorizables**](SlingApi.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables |  |
| [**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config |  |
| [**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http |  |
| [**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config |  |
| [**postConfigApacheSlingDavExServlet**](SlingApi.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet |  |
| [**postConfigApacheSlingGetServlet**](SlingApi.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet |  |
| [**postConfigApacheSlingReferrerFilter**](SlingApi.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter |  |
| [**postConfigProperty**](SlingApi.md#postconfigproperty) | **POST** /apps/system/config/{configNodeName} |  |
| [**postNode**](SlingApi.md#postnode) | **POST** /{path}/{name} |  |
| [**postNodeRw**](SlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html |  |
| [**postPath**](SlingApi.md#postpath) | **POST** /{path}/ |  |
| [**postQuery**](SlingApi.md#postquery) | **POST** /bin/querybuilder.json |  |
| [**postTreeActivation**](SlingApi.md#posttreeactivation) | **POST** /libs/replication/treeactivation.html |  |
| [**postTruststore**](SlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore |  |
| [**postTruststorePKCS12**](SlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore |  |



## deleteAgent

> deleteAgent(runmode, name)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { DeleteAgentRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    runmode: runmode_example,
    // string
    name: name_example,
  } satisfies DeleteAgentRequest;

  try {
    const data = await api.deleteAgent(body);
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
| **runmode** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |

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


## deleteNode

> deleteNode(path, name)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { DeleteNodeRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    path: path_example,
    // string
    name: name_example,
  } satisfies DeleteNodeRequest;

  try {
    const data = await api.deleteNode(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |

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


## getAgent

> getAgent(runmode, name)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetAgentRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    runmode: runmode_example,
    // string
    name: name_example,
  } satisfies GetAgentRequest;

  try {
    const data = await api.getAgent(body);
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
| **runmode** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |

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


## getAgents

> string getAgents(runmode)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetAgentsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    runmode: runmode_example,
  } satisfies GetAgentsRequest;

  try {
    const data = await api.getAgents(body);
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
| **runmode** | `string` |  | [Defaults to `undefined`] |

### Return type

**string**

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


## getAuthorizableKeystore

> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetAuthorizableKeystoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    intermediatePath: intermediatePath_example,
    // string
    authorizableId: authorizableId_example,
  } satisfies GetAuthorizableKeystoreRequest;

  try {
    const data = await api.getAuthorizableKeystore(body);
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
| **intermediatePath** | `string` |  | [Defaults to `undefined`] |
| **authorizableId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getKeystore

> Blob getKeystore(intermediatePath, authorizableId)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetKeystoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    intermediatePath: intermediatePath_example,
    // string
    authorizableId: authorizableId_example,
  } satisfies GetKeystoreRequest;

  try {
    const data = await api.getKeystore(body);
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
| **intermediatePath** | `string` |  | [Defaults to `undefined`] |
| **authorizableId** | `string` |  | [Defaults to `undefined`] |

### Return type

**Blob**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/octet-stream`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getNode

> getNode(path, name)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetNodeRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    path: path_example,
    // string
    name: name_example,
  } satisfies GetNodeRequest;

  try {
    const data = await api.getNode(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |

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


## getPackage

> Blob getPackage(group, name, version)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetPackageRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    group: group_example,
    // string
    name: name_example,
    // string
    version: version_example,
  } satisfies GetPackageRequest;

  try {
    const data = await api.getPackage(body);
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
| **group** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |
| **version** | `string` |  | [Defaults to `undefined`] |

### Return type

**Blob**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/octet-stream`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getPackageFilter

> string getPackageFilter(group, name, version)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetPackageFilterRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    group: group_example,
    // string
    name: name_example,
    // string
    version: version_example,
  } satisfies GetPackageFilterRequest;

  try {
    const data = await api.getPackageFilter(body);
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
| **group** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |
| **version** | `string` |  | [Defaults to `undefined`] |

### Return type

**string**

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


## getQuery

> string getQuery(path, pLimit, _1property, _1propertyValue)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetQueryRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    path: path_example,
    // number
    pLimit: 8.14,
    // string
    _1property: _1property_example,
    // string
    _1propertyValue: _1propertyValue_example,
  } satisfies GetQueryRequest;

  try {
    const data = await api.getQuery(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **pLimit** | `number` |  | [Defaults to `undefined`] |
| **_1property** | `string` |  | [Defaults to `undefined`] |
| **_1propertyValue** | `string` |  | [Defaults to `undefined`] |

### Return type

**string**

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


## getTruststore

> Blob getTruststore()



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetTruststoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  try {
    const data = await api.getTruststore();
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

**Blob**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/octet-stream`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getTruststoreInfo

> TruststoreInfo getTruststoreInfo()



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { GetTruststoreInfoRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  try {
    const data = await api.getTruststoreInfo();
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

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM Truststore info |  -  |
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postAgent

> postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostAgentRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    runmode: runmode_example,
    // string
    name: name_example,
    // boolean (optional)
    jcrContentCqDistribute: true,
    // string (optional)
    jcrContentCqDistributeTypeHint: jcrContentCqDistributeTypeHint_example,
    // string (optional)
    jcrContentCqName: jcrContentCqName_example,
    // string (optional)
    jcrContentCqTemplate: jcrContentCqTemplate_example,
    // boolean (optional)
    jcrContentAliasUpdate: true,
    // boolean (optional)
    jcrContentEnabled: true,
    // string (optional)
    jcrContentJcrDescription: jcrContentJcrDescription_example,
    // string (optional)
    jcrContentJcrLastModified: jcrContentJcrLastModified_example,
    // string (optional)
    jcrContentJcrLastModifiedBy: jcrContentJcrLastModifiedBy_example,
    // string (optional)
    jcrContentJcrMixinTypes: jcrContentJcrMixinTypes_example,
    // string (optional)
    jcrContentJcrTitle: jcrContentJcrTitle_example,
    // string (optional)
    jcrContentLogLevel: jcrContentLogLevel_example,
    // boolean (optional)
    jcrContentNoStatusUpdate: true,
    // boolean (optional)
    jcrContentNoVersioning: true,
    // number (optional)
    jcrContentProtocolConnectTimeout: 8.14,
    // boolean (optional)
    jcrContentProtocolHTTPConnectionClosed: true,
    // string (optional)
    jcrContentProtocolHTTPExpired: jcrContentProtocolHTTPExpired_example,
    // Array<string> (optional)
    jcrContentProtocolHTTPHeaders: ...,
    // string (optional)
    jcrContentProtocolHTTPHeadersTypeHint: jcrContentProtocolHTTPHeadersTypeHint_example,
    // string (optional)
    jcrContentProtocolHTTPMethod: jcrContentProtocolHTTPMethod_example,
    // boolean (optional)
    jcrContentProtocolHTTPSRelaxed: true,
    // string (optional)
    jcrContentProtocolInterface: jcrContentProtocolInterface_example,
    // number (optional)
    jcrContentProtocolSocketTimeout: 8.14,
    // string (optional)
    jcrContentProtocolVersion: jcrContentProtocolVersion_example,
    // string (optional)
    jcrContentProxyNTLMDomain: jcrContentProxyNTLMDomain_example,
    // string (optional)
    jcrContentProxyNTLMHost: jcrContentProxyNTLMHost_example,
    // string (optional)
    jcrContentProxyHost: jcrContentProxyHost_example,
    // string (optional)
    jcrContentProxyPassword: jcrContentProxyPassword_example,
    // number (optional)
    jcrContentProxyPort: 8.14,
    // string (optional)
    jcrContentProxyUser: jcrContentProxyUser_example,
    // number (optional)
    jcrContentQueueBatchMaxSize: 8.14,
    // string (optional)
    jcrContentQueueBatchMode: jcrContentQueueBatchMode_example,
    // number (optional)
    jcrContentQueueBatchWaitTime: 8.14,
    // string (optional)
    jcrContentRetryDelay: jcrContentRetryDelay_example,
    // boolean (optional)
    jcrContentReverseReplication: true,
    // string (optional)
    jcrContentSerializationType: jcrContentSerializationType_example,
    // string (optional)
    jcrContentSlingResourceType: jcrContentSlingResourceType_example,
    // string (optional)
    jcrContentSsl: jcrContentSsl_example,
    // string (optional)
    jcrContentTransportNTLMDomain: jcrContentTransportNTLMDomain_example,
    // string (optional)
    jcrContentTransportNTLMHost: jcrContentTransportNTLMHost_example,
    // string (optional)
    jcrContentTransportPassword: jcrContentTransportPassword_example,
    // string (optional)
    jcrContentTransportUri: jcrContentTransportUri_example,
    // string (optional)
    jcrContentTransportUser: jcrContentTransportUser_example,
    // boolean (optional)
    jcrContentTriggerDistribute: true,
    // boolean (optional)
    jcrContentTriggerModified: true,
    // boolean (optional)
    jcrContentTriggerOnOffTime: true,
    // boolean (optional)
    jcrContentTriggerReceive: true,
    // boolean (optional)
    jcrContentTriggerSpecific: true,
    // string (optional)
    jcrContentUserId: jcrContentUserId_example,
    // string (optional)
    jcrPrimaryType: jcrPrimaryType_example,
    // string (optional)
    operation: operation_example,
  } satisfies PostAgentRequest;

  try {
    const data = await api.postAgent(body);
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
| **runmode** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |
| **jcrContentCqDistribute** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentCqDistributeTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentCqName** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentCqTemplate** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentAliasUpdate** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentEnabled** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentJcrDescription** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentJcrLastModified** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentJcrLastModifiedBy** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentJcrMixinTypes** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentJcrTitle** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentLogLevel** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentNoStatusUpdate** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentNoVersioning** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolConnectTimeout** | `number` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolHTTPConnectionClosed** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolHTTPExpired** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolHTTPHeaders** | `Array<string>` |  | [Optional] |
| **jcrContentProtocolHTTPHeadersTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolHTTPMethod** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolHTTPSRelaxed** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolInterface** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolSocketTimeout** | `number` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProtocolVersion** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProxyNTLMDomain** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProxyNTLMHost** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProxyHost** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProxyPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProxyPort** | `number` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentProxyUser** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentQueueBatchMaxSize** | `number` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentQueueBatchMode** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentQueueBatchWaitTime** | `number` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentRetryDelay** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentReverseReplication** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentSerializationType** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentSlingResourceType** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentSsl** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTransportNTLMDomain** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTransportNTLMHost** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTransportPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTransportUri** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTransportUser** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTriggerDistribute** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTriggerModified** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTriggerOnOffTime** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTriggerReceive** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentTriggerSpecific** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **jcrContentUserId** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jcrPrimaryType** | `string` |  | [Optional] [Defaults to `undefined`] |
| **operation** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postAuthorizableKeystore

> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostAuthorizableKeystoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    intermediatePath: intermediatePath_example,
    // string
    authorizableId: authorizableId_example,
    // string (optional)
    operation: operation_example,
    // string (optional)
    currentPassword: currentPassword_example,
    // string (optional)
    newPassword: newPassword_example,
    // string (optional)
    rePassword: rePassword_example,
    // string (optional)
    keyPassword: keyPassword_example,
    // string (optional)
    keyStorePass: keyStorePass_example,
    // string (optional)
    alias: alias_example,
    // string (optional)
    newAlias: newAlias_example,
    // string (optional)
    removeAlias: removeAlias_example,
    // Blob (optional)
    certChain: BINARY_DATA_HERE,
    // Blob (optional)
    pk: BINARY_DATA_HERE,
    // Blob (optional)
    keyStore: BINARY_DATA_HERE,
  } satisfies PostAuthorizableKeystoreRequest;

  try {
    const data = await api.postAuthorizableKeystore(body);
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
| **intermediatePath** | `string` |  | [Defaults to `undefined`] |
| **authorizableId** | `string` |  | [Defaults to `undefined`] |
| **operation** | `string` |  | [Optional] [Defaults to `undefined`] |
| **currentPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **newPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **rePassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **keyPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **keyStorePass** | `string` |  | [Optional] [Defaults to `undefined`] |
| **alias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **newAlias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **removeAlias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **certChain** | `Blob` |  | [Optional] [Defaults to `undefined`] |
| **pk** | `Blob` |  | [Optional] [Defaults to `undefined`] |
| **keyStore** | `Blob` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postAuthorizables

> string postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostAuthorizablesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    authorizableId: authorizableId_example,
    // string
    intermediatePath: intermediatePath_example,
    // string (optional)
    createUser: createUser_example,
    // string (optional)
    createGroup: createGroup_example,
    // string (optional)
    repPassword: repPassword_example,
    // string (optional)
    profileGivenName: profileGivenName_example,
  } satisfies PostAuthorizablesRequest;

  try {
    const data = await api.postAuthorizables(body);
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
| **authorizableId** | `string` |  | [Defaults to `undefined`] |
| **intermediatePath** | `string` |  | [Defaults to `undefined`] |
| **createUser** | `string` |  | [Optional] [Defaults to `undefined`] |
| **createGroup** | `string` |  | [Optional] [Defaults to `undefined`] |
| **repPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **profileGivenName** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/html`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postConfigAdobeGraniteSamlAuthenticationHandler

> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostConfigAdobeGraniteSamlAuthenticationHandlerRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string (optional)
    keyStorePassword: keyStorePassword_example,
    // string (optional)
    keyStorePasswordTypeHint: keyStorePasswordTypeHint_example,
    // number (optional)
    serviceRanking: 56,
    // string (optional)
    serviceRankingTypeHint: serviceRankingTypeHint_example,
    // boolean (optional)
    idpHttpRedirect: true,
    // string (optional)
    idpHttpRedirectTypeHint: idpHttpRedirectTypeHint_example,
    // boolean (optional)
    createUser: true,
    // string (optional)
    createUserTypeHint: createUserTypeHint_example,
    // string (optional)
    defaultRedirectUrl: defaultRedirectUrl_example,
    // string (optional)
    defaultRedirectUrlTypeHint: defaultRedirectUrlTypeHint_example,
    // string (optional)
    userIDAttribute: userIDAttribute_example,
    // string (optional)
    userIDAttributeTypeHint: userIDAttributeTypeHint_example,
    // Array<string> (optional)
    defaultGroups: ...,
    // string (optional)
    defaultGroupsTypeHint: defaultGroupsTypeHint_example,
    // string (optional)
    idpCertAlias: idpCertAlias_example,
    // string (optional)
    idpCertAliasTypeHint: idpCertAliasTypeHint_example,
    // boolean (optional)
    addGroupMemberships: true,
    // string (optional)
    addGroupMembershipsTypeHint: addGroupMembershipsTypeHint_example,
    // Array<string> (optional)
    path: ...,
    // string (optional)
    pathTypeHint: pathTypeHint_example,
    // Array<string> (optional)
    synchronizeAttributes: ...,
    // string (optional)
    synchronizeAttributesTypeHint: synchronizeAttributesTypeHint_example,
    // number (optional)
    clockTolerance: 56,
    // string (optional)
    clockToleranceTypeHint: clockToleranceTypeHint_example,
    // string (optional)
    groupMembershipAttribute: groupMembershipAttribute_example,
    // string (optional)
    groupMembershipAttributeTypeHint: groupMembershipAttributeTypeHint_example,
    // string (optional)
    idpUrl: idpUrl_example,
    // string (optional)
    idpUrlTypeHint: idpUrlTypeHint_example,
    // string (optional)
    logoutUrl: logoutUrl_example,
    // string (optional)
    logoutUrlTypeHint: logoutUrlTypeHint_example,
    // string (optional)
    serviceProviderEntityId: serviceProviderEntityId_example,
    // string (optional)
    serviceProviderEntityIdTypeHint: serviceProviderEntityIdTypeHint_example,
    // string (optional)
    assertionConsumerServiceURL: assertionConsumerServiceURL_example,
    // string (optional)
    assertionConsumerServiceURLTypeHint: assertionConsumerServiceURLTypeHint_example,
    // boolean (optional)
    handleLogout: true,
    // string (optional)
    handleLogoutTypeHint: handleLogoutTypeHint_example,
    // string (optional)
    spPrivateKeyAlias: spPrivateKeyAlias_example,
    // string (optional)
    spPrivateKeyAliasTypeHint: spPrivateKeyAliasTypeHint_example,
    // boolean (optional)
    useEncryption: true,
    // string (optional)
    useEncryptionTypeHint: useEncryptionTypeHint_example,
    // string (optional)
    nameIdFormat: nameIdFormat_example,
    // string (optional)
    nameIdFormatTypeHint: nameIdFormatTypeHint_example,
    // string (optional)
    digestMethod: digestMethod_example,
    // string (optional)
    digestMethodTypeHint: digestMethodTypeHint_example,
    // string (optional)
    signatureMethod: signatureMethod_example,
    // string (optional)
    signatureMethodTypeHint: signatureMethodTypeHint_example,
    // string (optional)
    userIntermediatePath: userIntermediatePath_example,
    // string (optional)
    userIntermediatePathTypeHint: userIntermediatePathTypeHint_example,
  } satisfies PostConfigAdobeGraniteSamlAuthenticationHandlerRequest;

  try {
    const data = await api.postConfigAdobeGraniteSamlAuthenticationHandler(body);
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
| **keyStorePassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **keyStorePasswordTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **serviceRanking** | `number` |  | [Optional] [Defaults to `undefined`] |
| **serviceRankingTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **idpHttpRedirect** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **idpHttpRedirectTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **createUser** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **createUserTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **defaultRedirectUrl** | `string` |  | [Optional] [Defaults to `undefined`] |
| **defaultRedirectUrlTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **userIDAttribute** | `string` |  | [Optional] [Defaults to `undefined`] |
| **userIDAttributeTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **defaultGroups** | `Array<string>` |  | [Optional] |
| **defaultGroupsTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **idpCertAlias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **idpCertAliasTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **addGroupMemberships** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **addGroupMembershipsTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **path** | `Array<string>` |  | [Optional] |
| **pathTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **synchronizeAttributes** | `Array<string>` |  | [Optional] |
| **synchronizeAttributesTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **clockTolerance** | `number` |  | [Optional] [Defaults to `undefined`] |
| **clockToleranceTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **groupMembershipAttribute** | `string` |  | [Optional] [Defaults to `undefined`] |
| **groupMembershipAttributeTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **idpUrl** | `string` |  | [Optional] [Defaults to `undefined`] |
| **idpUrlTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **logoutUrl** | `string` |  | [Optional] [Defaults to `undefined`] |
| **logoutUrlTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **serviceProviderEntityId** | `string` |  | [Optional] [Defaults to `undefined`] |
| **serviceProviderEntityIdTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **assertionConsumerServiceURL** | `string` |  | [Optional] [Defaults to `undefined`] |
| **assertionConsumerServiceURLTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **handleLogout** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **handleLogoutTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **spPrivateKeyAlias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **spPrivateKeyAliasTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **useEncryption** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **useEncryptionTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **nameIdFormat** | `string` |  | [Optional] [Defaults to `undefined`] |
| **nameIdFormatTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **digestMethod** | `string` |  | [Optional] [Defaults to `undefined`] |
| **digestMethodTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **signatureMethod** | `string` |  | [Optional] [Defaults to `undefined`] |
| **signatureMethodTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **userIntermediatePath** | `string` |  | [Optional] [Defaults to `undefined`] |
| **userIntermediatePathTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postConfigApacheFelixJettyBasedHttpService

> postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostConfigApacheFelixJettyBasedHttpServiceRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // boolean (optional)
    orgApacheFelixHttpsNio: true,
    // string (optional)
    orgApacheFelixHttpsNioTypeHint: orgApacheFelixHttpsNioTypeHint_example,
    // string (optional)
    orgApacheFelixHttpsKeystore: orgApacheFelixHttpsKeystore_example,
    // string (optional)
    orgApacheFelixHttpsKeystoreTypeHint: orgApacheFelixHttpsKeystoreTypeHint_example,
    // string (optional)
    orgApacheFelixHttpsKeystorePassword: orgApacheFelixHttpsKeystorePassword_example,
    // string (optional)
    orgApacheFelixHttpsKeystorePasswordTypeHint: orgApacheFelixHttpsKeystorePasswordTypeHint_example,
    // string (optional)
    orgApacheFelixHttpsKeystoreKey: orgApacheFelixHttpsKeystoreKey_example,
    // string (optional)
    orgApacheFelixHttpsKeystoreKeyTypeHint: orgApacheFelixHttpsKeystoreKeyTypeHint_example,
    // string (optional)
    orgApacheFelixHttpsKeystoreKeyPassword: orgApacheFelixHttpsKeystoreKeyPassword_example,
    // string (optional)
    orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example,
    // string (optional)
    orgApacheFelixHttpsTruststore: orgApacheFelixHttpsTruststore_example,
    // string (optional)
    orgApacheFelixHttpsTruststoreTypeHint: orgApacheFelixHttpsTruststoreTypeHint_example,
    // string (optional)
    orgApacheFelixHttpsTruststorePassword: orgApacheFelixHttpsTruststorePassword_example,
    // string (optional)
    orgApacheFelixHttpsTruststorePasswordTypeHint: orgApacheFelixHttpsTruststorePasswordTypeHint_example,
    // string (optional)
    orgApacheFelixHttpsClientcertificate: orgApacheFelixHttpsClientcertificate_example,
    // string (optional)
    orgApacheFelixHttpsClientcertificateTypeHint: orgApacheFelixHttpsClientcertificateTypeHint_example,
    // boolean (optional)
    orgApacheFelixHttpsEnable: true,
    // string (optional)
    orgApacheFelixHttpsEnableTypeHint: orgApacheFelixHttpsEnableTypeHint_example,
    // string (optional)
    orgOsgiServiceHttpPortSecure: orgOsgiServiceHttpPortSecure_example,
    // string (optional)
    orgOsgiServiceHttpPortSecureTypeHint: orgOsgiServiceHttpPortSecureTypeHint_example,
  } satisfies PostConfigApacheFelixJettyBasedHttpServiceRequest;

  try {
    const data = await api.postConfigApacheFelixJettyBasedHttpService(body);
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
| **orgApacheFelixHttpsNio** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsNioTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystore** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystoreTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystorePassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystorePasswordTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystoreKey** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystoreKeyTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystoreKeyPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsTruststore** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsTruststoreTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsTruststorePassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsTruststorePasswordTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsClientcertificate** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsClientcertificateTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsEnable** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **orgApacheFelixHttpsEnableTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgOsgiServiceHttpPortSecure** | `string` |  | [Optional] [Defaults to `undefined`] |
| **orgOsgiServiceHttpPortSecureTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postConfigApacheHttpComponentsProxyConfiguration

> postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostConfigApacheHttpComponentsProxyConfigurationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string (optional)
    proxyHost: proxyHost_example,
    // string (optional)
    proxyHostTypeHint: proxyHostTypeHint_example,
    // number (optional)
    proxyPort: 56,
    // string (optional)
    proxyPortTypeHint: proxyPortTypeHint_example,
    // Array<string> (optional)
    proxyExceptions: ...,
    // string (optional)
    proxyExceptionsTypeHint: proxyExceptionsTypeHint_example,
    // boolean (optional)
    proxyEnabled: true,
    // string (optional)
    proxyEnabledTypeHint: proxyEnabledTypeHint_example,
    // string (optional)
    proxyUser: proxyUser_example,
    // string (optional)
    proxyUserTypeHint: proxyUserTypeHint_example,
    // string (optional)
    proxyPassword: proxyPassword_example,
    // string (optional)
    proxyPasswordTypeHint: proxyPasswordTypeHint_example,
  } satisfies PostConfigApacheHttpComponentsProxyConfigurationRequest;

  try {
    const data = await api.postConfigApacheHttpComponentsProxyConfiguration(body);
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
| **proxyHost** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyHostTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyPort** | `number` |  | [Optional] [Defaults to `undefined`] |
| **proxyPortTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyExceptions** | `Array<string>` |  | [Optional] |
| **proxyExceptionsTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyEnabled** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **proxyEnabledTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyUser** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyUserTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **proxyPasswordTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postConfigApacheSlingDavExServlet

> postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostConfigApacheSlingDavExServletRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string (optional)
    alias: alias_example,
    // string (optional)
    aliasTypeHint: aliasTypeHint_example,
    // boolean (optional)
    davCreateAbsoluteUri: true,
    // string (optional)
    davCreateAbsoluteUriTypeHint: davCreateAbsoluteUriTypeHint_example,
  } satisfies PostConfigApacheSlingDavExServletRequest;

  try {
    const data = await api.postConfigApacheSlingDavExServlet(body);
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
| **alias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **aliasTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **davCreateAbsoluteUri** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **davCreateAbsoluteUriTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postConfigApacheSlingGetServlet

> postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostConfigApacheSlingGetServletRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string (optional)
    jsonMaximumresults: jsonMaximumresults_example,
    // string (optional)
    jsonMaximumresultsTypeHint: jsonMaximumresultsTypeHint_example,
    // boolean (optional)
    enableHtml: true,
    // string (optional)
    enableHtmlTypeHint: enableHtmlTypeHint_example,
    // boolean (optional)
    enableTxt: true,
    // string (optional)
    enableTxtTypeHint: enableTxtTypeHint_example,
    // boolean (optional)
    enableXml: true,
    // string (optional)
    enableXmlTypeHint: enableXmlTypeHint_example,
  } satisfies PostConfigApacheSlingGetServletRequest;

  try {
    const data = await api.postConfigApacheSlingGetServlet(body);
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
| **jsonMaximumresults** | `string` |  | [Optional] [Defaults to `undefined`] |
| **jsonMaximumresultsTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **enableHtml** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **enableHtmlTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **enableTxt** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **enableTxtTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **enableXml** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **enableXmlTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postConfigApacheSlingReferrerFilter

> postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostConfigApacheSlingReferrerFilterRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // boolean (optional)
    allowEmpty: true,
    // string (optional)
    allowEmptyTypeHint: allowEmptyTypeHint_example,
    // string (optional)
    allowHosts: allowHosts_example,
    // string (optional)
    allowHostsTypeHint: allowHostsTypeHint_example,
    // string (optional)
    allowHostsRegexp: allowHostsRegexp_example,
    // string (optional)
    allowHostsRegexpTypeHint: allowHostsRegexpTypeHint_example,
    // string (optional)
    filterMethods: filterMethods_example,
    // string (optional)
    filterMethodsTypeHint: filterMethodsTypeHint_example,
  } satisfies PostConfigApacheSlingReferrerFilterRequest;

  try {
    const data = await api.postConfigApacheSlingReferrerFilter(body);
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
| **allowEmpty** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **allowEmptyTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **allowHosts** | `string` |  | [Optional] [Defaults to `undefined`] |
| **allowHostsTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **allowHostsRegexp** | `string` |  | [Optional] [Defaults to `undefined`] |
| **allowHostsRegexpTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |
| **filterMethods** | `string` |  | [Optional] [Defaults to `undefined`] |
| **filterMethodsTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postConfigProperty

> postConfigProperty(configNodeName)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostConfigPropertyRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    configNodeName: configNodeName_example,
  } satisfies PostConfigPropertyRequest;

  try {
    const data = await api.postConfigProperty(body);
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
| **configNodeName** | `string` |  | [Defaults to `undefined`] |

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


## postNode

> postNode(path, name, operation, deleteAuthorizable, file)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostNodeRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    path: path_example,
    // string
    name: name_example,
    // string (optional)
    operation: operation_example,
    // string (optional)
    deleteAuthorizable: deleteAuthorizable_example,
    // Blob (optional)
    file: BINARY_DATA_HERE,
  } satisfies PostNodeRequest;

  try {
    const data = await api.postNode(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |
| **operation** | `string` |  | [Optional] [Defaults to `undefined`] |
| **deleteAuthorizable** | `string` |  | [Optional] [Defaults to `undefined`] |
| **file** | `Blob` |  | [Optional] [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postNodeRw

> postNodeRw(path, name, addMembers)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostNodeRwRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    path: path_example,
    // string
    name: name_example,
    // string (optional)
    addMembers: addMembers_example,
  } satisfies PostNodeRwRequest;

  try {
    const data = await api.postNodeRw(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |
| **addMembers** | `string` |  | [Optional] [Defaults to `undefined`] |

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


## postPath

> postPath(path, jcrPrimaryType, name)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostPathRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    path: path_example,
    // string
    jcrPrimaryType: jcrPrimaryType_example,
    // string
    name: name_example,
  } satisfies PostPathRequest;

  try {
    const data = await api.postPath(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **jcrPrimaryType** | `string` |  | [Defaults to `undefined`] |
| **name** | `string` |  | [Defaults to `undefined`] |

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


## postQuery

> string postQuery(path, pLimit, _1property, _1propertyValue)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostQueryRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string
    path: path_example,
    // number
    pLimit: 8.14,
    // string
    _1property: _1property_example,
    // string
    _1propertyValue: _1propertyValue_example,
  } satisfies PostQueryRequest;

  try {
    const data = await api.postQuery(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **pLimit** | `number` |  | [Defaults to `undefined`] |
| **_1property** | `string` |  | [Defaults to `undefined`] |
| **_1propertyValue** | `string` |  | [Defaults to `undefined`] |

### Return type

**string**

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


## postTreeActivation

> postTreeActivation(ignoredeactivated, onlymodified, path, cmd)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostTreeActivationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // boolean
    ignoredeactivated: true,
    // boolean
    onlymodified: true,
    // string
    path: path_example,
    // string
    cmd: cmd_example,
  } satisfies PostTreeActivationRequest;

  try {
    const data = await api.postTreeActivation(body);
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
| **ignoredeactivated** | `boolean` |  | [Defaults to `undefined`] |
| **onlymodified** | `boolean` |  | [Defaults to `undefined`] |
| **path** | `string` |  | [Defaults to `undefined`] |
| **cmd** | `string` |  | [Defaults to `&#39;activate&#39;`] |

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


## postTruststore

> string postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostTruststoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // string (optional)
    operation: operation_example,
    // string (optional)
    newPassword: newPassword_example,
    // string (optional)
    rePassword: rePassword_example,
    // string (optional)
    keyStoreType: keyStoreType_example,
    // string (optional)
    removeAlias: removeAlias_example,
    // Blob (optional)
    certificate: BINARY_DATA_HERE,
  } satisfies PostTruststoreRequest;

  try {
    const data = await api.postTruststore(body);
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
| **operation** | `string` |  | [Optional] [Defaults to `undefined`] |
| **newPassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **rePassword** | `string` |  | [Optional] [Defaults to `undefined`] |
| **keyStoreType** | `string` |  | [Optional] [Defaults to `undefined`] |
| **removeAlias** | `string` |  | [Optional] [Defaults to `undefined`] |
| **certificate** | `Blob` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postTruststorePKCS12

> string postTruststorePKCS12(truststoreP12)



### Example

```ts
import {
  Configuration,
  SlingApi,
} from '';
import type { PostTruststorePKCS12Request } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new SlingApi(config);

  const body = {
    // Blob (optional)
    truststoreP12: BINARY_DATA_HERE,
  } satisfies PostTruststorePKCS12Request;

  try {
    const data = await api.postTruststorePKCS12(body);
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
| **truststoreP12** | `Blob` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

