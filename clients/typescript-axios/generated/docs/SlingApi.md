# SlingApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**deleteAgent**](#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | |
|[**deleteNode**](#deletenode) | **DELETE** /{path}/{name} | |
|[**getAgent**](#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | |
|[**getAgents**](#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | |
|[**getAuthorizableKeystore**](#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | |
|[**getKeystore**](#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | |
|[**getNode**](#getnode) | **GET** /{path}/{name} | |
|[**getPackage**](#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | |
|[**getPackageFilter**](#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | |
|[**getQuery**](#getquery) | **GET** /bin/querybuilder.json | |
|[**getTruststore**](#gettruststore) | **GET** /etc/truststore/truststore.p12 | |
|[**getTruststoreInfo**](#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | |
|[**postAgent**](#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | |
|[**postAuthorizableKeystore**](#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | |
|[**postAuthorizables**](#postauthorizables) | **POST** /libs/granite/security/post/authorizables | |
|[**postConfigAdobeGraniteSamlAuthenticationHandler**](#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | |
|[**postConfigApacheFelixJettyBasedHttpService**](#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | |
|[**postConfigApacheHttpComponentsProxyConfiguration**](#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | |
|[**postConfigApacheSlingDavExServlet**](#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | |
|[**postConfigApacheSlingGetServlet**](#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | |
|[**postConfigApacheSlingReferrerFilter**](#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | |
|[**postConfigProperty**](#postconfigproperty) | **POST** /apps/system/config/{configNodeName} | |
|[**postNode**](#postnode) | **POST** /{path}/{name} | |
|[**postNodeRw**](#postnoderw) | **POST** /{path}/{name}.rw.html | |
|[**postPath**](#postpath) | **POST** /{path}/ | |
|[**postQuery**](#postquery) | **POST** /bin/querybuilder.json | |
|[**postTreeActivation**](#posttreeactivation) | **POST** /libs/replication/treeactivation.html | |
|[**postTruststore**](#posttruststore) | **POST** /libs/granite/security/post/truststore | |
|[**postTruststorePKCS12**](#posttruststorepkcs12) | **POST** /etc/truststore | |

# **deleteAgent**
> deleteAgent()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let runmode: string; // (default to undefined)
let name: string; // (default to undefined)

const { status, data } = await apiInstance.deleteAgent(
    runmode,
    name
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **runmode** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|


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

# **deleteNode**
> deleteNode()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let path: string; // (default to undefined)
let name: string; // (default to undefined)

const { status, data } = await apiInstance.deleteNode(
    path,
    name
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|


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

# **getAgent**
> getAgent()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let runmode: string; // (default to undefined)
let name: string; // (default to undefined)

const { status, data } = await apiInstance.getAgent(
    runmode,
    name
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **runmode** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|


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

# **getAgents**
> string getAgents()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let runmode: string; // (default to undefined)

const { status, data } = await apiInstance.getAgents(
    runmode
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **runmode** | [**string**] |  | defaults to undefined|


### Return type

**string**

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

# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let intermediatePath: string; // (default to undefined)
let authorizableId: string; // (default to undefined)

const { status, data } = await apiInstance.getAuthorizableKeystore(
    intermediatePath,
    authorizableId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | [**string**] |  | defaults to undefined|
| **authorizableId** | [**string**] |  | defaults to undefined|


### Return type

**KeystoreInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Retrieved Authorizable Keystore info |  -  |
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getKeystore**
> File getKeystore()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let intermediatePath: string; // (default to undefined)
let authorizableId: string; // (default to undefined)

const { status, data } = await apiInstance.getKeystore(
    intermediatePath,
    authorizableId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | [**string**] |  | defaults to undefined|
| **authorizableId** | [**string**] |  | defaults to undefined|


### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNode**
> getNode()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let path: string; // (default to undefined)
let name: string; // (default to undefined)

const { status, data } = await apiInstance.getNode(
    path,
    name
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|


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

# **getPackage**
> File getPackage()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let group: string; // (default to undefined)
let name: string; // (default to undefined)
let version: string; // (default to undefined)

const { status, data } = await apiInstance.getPackage(
    group,
    name,
    version
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **group** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|
| **version** | [**string**] |  | defaults to undefined|


### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageFilter**
> string getPackageFilter()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let group: string; // (default to undefined)
let name: string; // (default to undefined)
let version: string; // (default to undefined)

const { status, data } = await apiInstance.getPackageFilter(
    group,
    name,
    version
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **group** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|
| **version** | [**string**] |  | defaults to undefined|


### Return type

**string**

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

# **getQuery**
> string getQuery()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let path: string; // (default to undefined)
let pLimit: number; // (default to undefined)
let _1property: string; // (default to undefined)
let _1propertyValue: string; // (default to undefined)

const { status, data } = await apiInstance.getQuery(
    path,
    pLimit,
    _1property,
    _1propertyValue
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **pLimit** | [**number**] |  | defaults to undefined|
| **_1property** | [**string**] |  | defaults to undefined|
| **_1propertyValue** | [**string**] |  | defaults to undefined|


### Return type

**string**

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

# **getTruststore**
> File getTruststore()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

const { status, data } = await apiInstance.getTruststore();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

const { status, data } = await apiInstance.getTruststoreInfo();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**TruststoreInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Retrieved AEM Truststore info |  -  |
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAgent**
> postAgent()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let runmode: string; // (default to undefined)
let name: string; // (default to undefined)
let jcrContentCqDistribute: boolean; // (optional) (default to undefined)
let jcrContentCqDistributeTypeHint: string; // (optional) (default to undefined)
let jcrContentCqName: string; // (optional) (default to undefined)
let jcrContentCqTemplate: string; // (optional) (default to undefined)
let jcrContentAliasUpdate: boolean; // (optional) (default to undefined)
let jcrContentEnabled: boolean; // (optional) (default to undefined)
let jcrContentJcrDescription: string; // (optional) (default to undefined)
let jcrContentJcrLastModified: string; // (optional) (default to undefined)
let jcrContentJcrLastModifiedBy: string; // (optional) (default to undefined)
let jcrContentJcrMixinTypes: string; // (optional) (default to undefined)
let jcrContentJcrTitle: string; // (optional) (default to undefined)
let jcrContentLogLevel: string; // (optional) (default to undefined)
let jcrContentNoStatusUpdate: boolean; // (optional) (default to undefined)
let jcrContentNoVersioning: boolean; // (optional) (default to undefined)
let jcrContentProtocolConnectTimeout: number; // (optional) (default to undefined)
let jcrContentProtocolHTTPConnectionClosed: boolean; // (optional) (default to undefined)
let jcrContentProtocolHTTPExpired: string; // (optional) (default to undefined)
let jcrContentProtocolHTTPHeaders: Array<string>; // (optional) (default to undefined)
let jcrContentProtocolHTTPHeadersTypeHint: string; // (optional) (default to undefined)
let jcrContentProtocolHTTPMethod: string; // (optional) (default to undefined)
let jcrContentProtocolHTTPSRelaxed: boolean; // (optional) (default to undefined)
let jcrContentProtocolInterface: string; // (optional) (default to undefined)
let jcrContentProtocolSocketTimeout: number; // (optional) (default to undefined)
let jcrContentProtocolVersion: string; // (optional) (default to undefined)
let jcrContentProxyNTLMDomain: string; // (optional) (default to undefined)
let jcrContentProxyNTLMHost: string; // (optional) (default to undefined)
let jcrContentProxyHost: string; // (optional) (default to undefined)
let jcrContentProxyPassword: string; // (optional) (default to undefined)
let jcrContentProxyPort: number; // (optional) (default to undefined)
let jcrContentProxyUser: string; // (optional) (default to undefined)
let jcrContentQueueBatchMaxSize: number; // (optional) (default to undefined)
let jcrContentQueueBatchMode: string; // (optional) (default to undefined)
let jcrContentQueueBatchWaitTime: number; // (optional) (default to undefined)
let jcrContentRetryDelay: string; // (optional) (default to undefined)
let jcrContentReverseReplication: boolean; // (optional) (default to undefined)
let jcrContentSerializationType: string; // (optional) (default to undefined)
let jcrContentSlingResourceType: string; // (optional) (default to undefined)
let jcrContentSsl: string; // (optional) (default to undefined)
let jcrContentTransportNTLMDomain: string; // (optional) (default to undefined)
let jcrContentTransportNTLMHost: string; // (optional) (default to undefined)
let jcrContentTransportPassword: string; // (optional) (default to undefined)
let jcrContentTransportUri: string; // (optional) (default to undefined)
let jcrContentTransportUser: string; // (optional) (default to undefined)
let jcrContentTriggerDistribute: boolean; // (optional) (default to undefined)
let jcrContentTriggerModified: boolean; // (optional) (default to undefined)
let jcrContentTriggerOnOffTime: boolean; // (optional) (default to undefined)
let jcrContentTriggerReceive: boolean; // (optional) (default to undefined)
let jcrContentTriggerSpecific: boolean; // (optional) (default to undefined)
let jcrContentUserId: string; // (optional) (default to undefined)
let jcrPrimaryType: string; // (optional) (default to undefined)
let operation: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postAgent(
    runmode,
    name,
    jcrContentCqDistribute,
    jcrContentCqDistributeTypeHint,
    jcrContentCqName,
    jcrContentCqTemplate,
    jcrContentAliasUpdate,
    jcrContentEnabled,
    jcrContentJcrDescription,
    jcrContentJcrLastModified,
    jcrContentJcrLastModifiedBy,
    jcrContentJcrMixinTypes,
    jcrContentJcrTitle,
    jcrContentLogLevel,
    jcrContentNoStatusUpdate,
    jcrContentNoVersioning,
    jcrContentProtocolConnectTimeout,
    jcrContentProtocolHTTPConnectionClosed,
    jcrContentProtocolHTTPExpired,
    jcrContentProtocolHTTPHeaders,
    jcrContentProtocolHTTPHeadersTypeHint,
    jcrContentProtocolHTTPMethod,
    jcrContentProtocolHTTPSRelaxed,
    jcrContentProtocolInterface,
    jcrContentProtocolSocketTimeout,
    jcrContentProtocolVersion,
    jcrContentProxyNTLMDomain,
    jcrContentProxyNTLMHost,
    jcrContentProxyHost,
    jcrContentProxyPassword,
    jcrContentProxyPort,
    jcrContentProxyUser,
    jcrContentQueueBatchMaxSize,
    jcrContentQueueBatchMode,
    jcrContentQueueBatchWaitTime,
    jcrContentRetryDelay,
    jcrContentReverseReplication,
    jcrContentSerializationType,
    jcrContentSlingResourceType,
    jcrContentSsl,
    jcrContentTransportNTLMDomain,
    jcrContentTransportNTLMHost,
    jcrContentTransportPassword,
    jcrContentTransportUri,
    jcrContentTransportUser,
    jcrContentTriggerDistribute,
    jcrContentTriggerModified,
    jcrContentTriggerOnOffTime,
    jcrContentTriggerReceive,
    jcrContentTriggerSpecific,
    jcrContentUserId,
    jcrPrimaryType,
    operation
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **runmode** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|
| **jcrContentCqDistribute** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentCqDistributeTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentCqName** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentCqTemplate** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentAliasUpdate** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentEnabled** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentJcrDescription** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentJcrLastModified** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentJcrLastModifiedBy** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentJcrMixinTypes** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentJcrTitle** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentLogLevel** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentNoStatusUpdate** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentNoVersioning** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentProtocolConnectTimeout** | [**number**] |  | (optional) defaults to undefined|
| **jcrContentProtocolHTTPConnectionClosed** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentProtocolHTTPExpired** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProtocolHTTPHeaders** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **jcrContentProtocolHTTPHeadersTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProtocolHTTPMethod** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProtocolHTTPSRelaxed** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentProtocolInterface** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProtocolSocketTimeout** | [**number**] |  | (optional) defaults to undefined|
| **jcrContentProtocolVersion** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProxyNTLMDomain** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProxyNTLMHost** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProxyHost** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProxyPassword** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentProxyPort** | [**number**] |  | (optional) defaults to undefined|
| **jcrContentProxyUser** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentQueueBatchMaxSize** | [**number**] |  | (optional) defaults to undefined|
| **jcrContentQueueBatchMode** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentQueueBatchWaitTime** | [**number**] |  | (optional) defaults to undefined|
| **jcrContentRetryDelay** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentReverseReplication** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentSerializationType** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentSlingResourceType** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentSsl** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentTransportNTLMDomain** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentTransportNTLMHost** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentTransportPassword** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentTransportUri** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentTransportUser** | [**string**] |  | (optional) defaults to undefined|
| **jcrContentTriggerDistribute** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentTriggerModified** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentTriggerOnOffTime** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentTriggerReceive** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentTriggerSpecific** | [**boolean**] |  | (optional) defaults to undefined|
| **jcrContentUserId** | [**string**] |  | (optional) defaults to undefined|
| **jcrPrimaryType** | [**string**] |  | (optional) defaults to undefined|
| **operation** | [**string**] |  | (optional) defaults to undefined|


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

# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let intermediatePath: string; // (default to undefined)
let authorizableId: string; // (default to undefined)
let operation: string; // (optional) (default to undefined)
let currentPassword: string; // (optional) (default to undefined)
let newPassword: string; // (optional) (default to undefined)
let rePassword: string; // (optional) (default to undefined)
let keyPassword: string; // (optional) (default to undefined)
let keyStorePass: string; // (optional) (default to undefined)
let alias: string; // (optional) (default to undefined)
let newAlias: string; // (optional) (default to undefined)
let removeAlias: string; // (optional) (default to undefined)
let certChain: File; // (optional) (default to undefined)
let pk: File; // (optional) (default to undefined)
let keyStore: File; // (optional) (default to undefined)

const { status, data } = await apiInstance.postAuthorizableKeystore(
    intermediatePath,
    authorizableId,
    operation,
    currentPassword,
    newPassword,
    rePassword,
    keyPassword,
    keyStorePass,
    alias,
    newAlias,
    removeAlias,
    certChain,
    pk,
    keyStore
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | [**string**] |  | defaults to undefined|
| **authorizableId** | [**string**] |  | defaults to undefined|
| **operation** | [**string**] |  | (optional) defaults to undefined|
| **currentPassword** | [**string**] |  | (optional) defaults to undefined|
| **newPassword** | [**string**] |  | (optional) defaults to undefined|
| **rePassword** | [**string**] |  | (optional) defaults to undefined|
| **keyPassword** | [**string**] |  | (optional) defaults to undefined|
| **keyStorePass** | [**string**] |  | (optional) defaults to undefined|
| **alias** | [**string**] |  | (optional) defaults to undefined|
| **newAlias** | [**string**] |  | (optional) defaults to undefined|
| **removeAlias** | [**string**] |  | (optional) defaults to undefined|
| **certChain** | [**File**] |  | (optional) defaults to undefined|
| **pk** | [**File**] |  | (optional) defaults to undefined|
| **keyStore** | [**File**] |  | (optional) defaults to undefined|


### Return type

**KeystoreInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Retrieved Authorizable Keystore info |  -  |
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizables**
> string postAuthorizables()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let authorizableId: string; // (default to undefined)
let intermediatePath: string; // (default to undefined)
let createUser: string; // (optional) (default to undefined)
let createGroup: string; // (optional) (default to undefined)
let repPassword: string; // (optional) (default to undefined)
let profileGivenName: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postAuthorizables(
    authorizableId,
    intermediatePath,
    createUser,
    createGroup,
    repPassword,
    profileGivenName
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | [**string**] |  | defaults to undefined|
| **intermediatePath** | [**string**] |  | defaults to undefined|
| **createUser** | [**string**] |  | (optional) defaults to undefined|
| **createGroup** | [**string**] |  | (optional) defaults to undefined|
| **repPassword** | [**string**] |  | (optional) defaults to undefined|
| **profileGivenName** | [**string**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let keyStorePassword: string; // (optional) (default to undefined)
let keyStorePasswordTypeHint: string; // (optional) (default to undefined)
let serviceRanking: number; // (optional) (default to undefined)
let serviceRankingTypeHint: string; // (optional) (default to undefined)
let idpHttpRedirect: boolean; // (optional) (default to undefined)
let idpHttpRedirectTypeHint: string; // (optional) (default to undefined)
let createUser: boolean; // (optional) (default to undefined)
let createUserTypeHint: string; // (optional) (default to undefined)
let defaultRedirectUrl: string; // (optional) (default to undefined)
let defaultRedirectUrlTypeHint: string; // (optional) (default to undefined)
let userIDAttribute: string; // (optional) (default to undefined)
let userIDAttributeTypeHint: string; // (optional) (default to undefined)
let defaultGroups: Array<string>; // (optional) (default to undefined)
let defaultGroupsTypeHint: string; // (optional) (default to undefined)
let idpCertAlias: string; // (optional) (default to undefined)
let idpCertAliasTypeHint: string; // (optional) (default to undefined)
let addGroupMemberships: boolean; // (optional) (default to undefined)
let addGroupMembershipsTypeHint: string; // (optional) (default to undefined)
let path: Array<string>; // (optional) (default to undefined)
let pathTypeHint: string; // (optional) (default to undefined)
let synchronizeAttributes: Array<string>; // (optional) (default to undefined)
let synchronizeAttributesTypeHint: string; // (optional) (default to undefined)
let clockTolerance: number; // (optional) (default to undefined)
let clockToleranceTypeHint: string; // (optional) (default to undefined)
let groupMembershipAttribute: string; // (optional) (default to undefined)
let groupMembershipAttributeTypeHint: string; // (optional) (default to undefined)
let idpUrl: string; // (optional) (default to undefined)
let idpUrlTypeHint: string; // (optional) (default to undefined)
let logoutUrl: string; // (optional) (default to undefined)
let logoutUrlTypeHint: string; // (optional) (default to undefined)
let serviceProviderEntityId: string; // (optional) (default to undefined)
let serviceProviderEntityIdTypeHint: string; // (optional) (default to undefined)
let assertionConsumerServiceURL: string; // (optional) (default to undefined)
let assertionConsumerServiceURLTypeHint: string; // (optional) (default to undefined)
let handleLogout: boolean; // (optional) (default to undefined)
let handleLogoutTypeHint: string; // (optional) (default to undefined)
let spPrivateKeyAlias: string; // (optional) (default to undefined)
let spPrivateKeyAliasTypeHint: string; // (optional) (default to undefined)
let useEncryption: boolean; // (optional) (default to undefined)
let useEncryptionTypeHint: string; // (optional) (default to undefined)
let nameIdFormat: string; // (optional) (default to undefined)
let nameIdFormatTypeHint: string; // (optional) (default to undefined)
let digestMethod: string; // (optional) (default to undefined)
let digestMethodTypeHint: string; // (optional) (default to undefined)
let signatureMethod: string; // (optional) (default to undefined)
let signatureMethodTypeHint: string; // (optional) (default to undefined)
let userIntermediatePath: string; // (optional) (default to undefined)
let userIntermediatePathTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(
    keyStorePassword,
    keyStorePasswordTypeHint,
    serviceRanking,
    serviceRankingTypeHint,
    idpHttpRedirect,
    idpHttpRedirectTypeHint,
    createUser,
    createUserTypeHint,
    defaultRedirectUrl,
    defaultRedirectUrlTypeHint,
    userIDAttribute,
    userIDAttributeTypeHint,
    defaultGroups,
    defaultGroupsTypeHint,
    idpCertAlias,
    idpCertAliasTypeHint,
    addGroupMemberships,
    addGroupMembershipsTypeHint,
    path,
    pathTypeHint,
    synchronizeAttributes,
    synchronizeAttributesTypeHint,
    clockTolerance,
    clockToleranceTypeHint,
    groupMembershipAttribute,
    groupMembershipAttributeTypeHint,
    idpUrl,
    idpUrlTypeHint,
    logoutUrl,
    logoutUrlTypeHint,
    serviceProviderEntityId,
    serviceProviderEntityIdTypeHint,
    assertionConsumerServiceURL,
    assertionConsumerServiceURLTypeHint,
    handleLogout,
    handleLogoutTypeHint,
    spPrivateKeyAlias,
    spPrivateKeyAliasTypeHint,
    useEncryption,
    useEncryptionTypeHint,
    nameIdFormat,
    nameIdFormatTypeHint,
    digestMethod,
    digestMethodTypeHint,
    signatureMethod,
    signatureMethodTypeHint,
    userIntermediatePath,
    userIntermediatePathTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **keyStorePassword** | [**string**] |  | (optional) defaults to undefined|
| **keyStorePasswordTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **serviceRanking** | [**number**] |  | (optional) defaults to undefined|
| **serviceRankingTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **idpHttpRedirect** | [**boolean**] |  | (optional) defaults to undefined|
| **idpHttpRedirectTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **createUser** | [**boolean**] |  | (optional) defaults to undefined|
| **createUserTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **defaultRedirectUrl** | [**string**] |  | (optional) defaults to undefined|
| **defaultRedirectUrlTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **userIDAttribute** | [**string**] |  | (optional) defaults to undefined|
| **userIDAttributeTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **defaultGroups** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **defaultGroupsTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **idpCertAlias** | [**string**] |  | (optional) defaults to undefined|
| **idpCertAliasTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **addGroupMemberships** | [**boolean**] |  | (optional) defaults to undefined|
| **addGroupMembershipsTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **path** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **pathTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **synchronizeAttributes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **synchronizeAttributesTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **clockTolerance** | [**number**] |  | (optional) defaults to undefined|
| **clockToleranceTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **groupMembershipAttribute** | [**string**] |  | (optional) defaults to undefined|
| **groupMembershipAttributeTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **idpUrl** | [**string**] |  | (optional) defaults to undefined|
| **idpUrlTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **logoutUrl** | [**string**] |  | (optional) defaults to undefined|
| **logoutUrlTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **serviceProviderEntityId** | [**string**] |  | (optional) defaults to undefined|
| **serviceProviderEntityIdTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **assertionConsumerServiceURL** | [**string**] |  | (optional) defaults to undefined|
| **assertionConsumerServiceURLTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **handleLogout** | [**boolean**] |  | (optional) defaults to undefined|
| **handleLogoutTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **spPrivateKeyAlias** | [**string**] |  | (optional) defaults to undefined|
| **spPrivateKeyAliasTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **useEncryption** | [**boolean**] |  | (optional) defaults to undefined|
| **useEncryptionTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **nameIdFormat** | [**string**] |  | (optional) defaults to undefined|
| **nameIdFormatTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **digestMethod** | [**string**] |  | (optional) defaults to undefined|
| **digestMethodTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **signatureMethod** | [**string**] |  | (optional) defaults to undefined|
| **signatureMethodTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **userIntermediatePath** | [**string**] |  | (optional) defaults to undefined|
| **userIntermediatePathTypeHint** | [**string**] |  | (optional) defaults to undefined|


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

# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let orgApacheFelixHttpsNio: boolean; // (optional) (default to undefined)
let orgApacheFelixHttpsNioTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystore: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystoreTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystorePassword: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystorePasswordTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystoreKey: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystoreKeyTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystoreKeyPassword: string; // (optional) (default to undefined)
let orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsTruststore: string; // (optional) (default to undefined)
let orgApacheFelixHttpsTruststoreTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsTruststorePassword: string; // (optional) (default to undefined)
let orgApacheFelixHttpsTruststorePasswordTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsClientcertificate: string; // (optional) (default to undefined)
let orgApacheFelixHttpsClientcertificateTypeHint: string; // (optional) (default to undefined)
let orgApacheFelixHttpsEnable: boolean; // (optional) (default to undefined)
let orgApacheFelixHttpsEnableTypeHint: string; // (optional) (default to undefined)
let orgOsgiServiceHttpPortSecure: string; // (optional) (default to undefined)
let orgOsgiServiceHttpPortSecureTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigApacheFelixJettyBasedHttpService(
    orgApacheFelixHttpsNio,
    orgApacheFelixHttpsNioTypeHint,
    orgApacheFelixHttpsKeystore,
    orgApacheFelixHttpsKeystoreTypeHint,
    orgApacheFelixHttpsKeystorePassword,
    orgApacheFelixHttpsKeystorePasswordTypeHint,
    orgApacheFelixHttpsKeystoreKey,
    orgApacheFelixHttpsKeystoreKeyTypeHint,
    orgApacheFelixHttpsKeystoreKeyPassword,
    orgApacheFelixHttpsKeystoreKeyPasswordTypeHint,
    orgApacheFelixHttpsTruststore,
    orgApacheFelixHttpsTruststoreTypeHint,
    orgApacheFelixHttpsTruststorePassword,
    orgApacheFelixHttpsTruststorePasswordTypeHint,
    orgApacheFelixHttpsClientcertificate,
    orgApacheFelixHttpsClientcertificateTypeHint,
    orgApacheFelixHttpsEnable,
    orgApacheFelixHttpsEnableTypeHint,
    orgOsgiServiceHttpPortSecure,
    orgOsgiServiceHttpPortSecureTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **orgApacheFelixHttpsNio** | [**boolean**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsNioTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystore** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystoreTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystorePassword** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystorePasswordTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystoreKey** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystoreKeyTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystoreKeyPassword** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsTruststore** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsTruststoreTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsTruststorePassword** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsTruststorePasswordTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsClientcertificate** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsClientcertificateTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsEnable** | [**boolean**] |  | (optional) defaults to undefined|
| **orgApacheFelixHttpsEnableTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **orgOsgiServiceHttpPortSecure** | [**string**] |  | (optional) defaults to undefined|
| **orgOsgiServiceHttpPortSecureTypeHint** | [**string**] |  | (optional) defaults to undefined|


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

# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let proxyHost: string; // (optional) (default to undefined)
let proxyHostTypeHint: string; // (optional) (default to undefined)
let proxyPort: number; // (optional) (default to undefined)
let proxyPortTypeHint: string; // (optional) (default to undefined)
let proxyExceptions: Array<string>; // (optional) (default to undefined)
let proxyExceptionsTypeHint: string; // (optional) (default to undefined)
let proxyEnabled: boolean; // (optional) (default to undefined)
let proxyEnabledTypeHint: string; // (optional) (default to undefined)
let proxyUser: string; // (optional) (default to undefined)
let proxyUserTypeHint: string; // (optional) (default to undefined)
let proxyPassword: string; // (optional) (default to undefined)
let proxyPasswordTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigApacheHttpComponentsProxyConfiguration(
    proxyHost,
    proxyHostTypeHint,
    proxyPort,
    proxyPortTypeHint,
    proxyExceptions,
    proxyExceptionsTypeHint,
    proxyEnabled,
    proxyEnabledTypeHint,
    proxyUser,
    proxyUserTypeHint,
    proxyPassword,
    proxyPasswordTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **proxyHost** | [**string**] |  | (optional) defaults to undefined|
| **proxyHostTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **proxyPort** | [**number**] |  | (optional) defaults to undefined|
| **proxyPortTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **proxyExceptions** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **proxyExceptionsTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **proxyEnabled** | [**boolean**] |  | (optional) defaults to undefined|
| **proxyEnabledTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **proxyUser** | [**string**] |  | (optional) defaults to undefined|
| **proxyUserTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **proxyPassword** | [**string**] |  | (optional) defaults to undefined|
| **proxyPasswordTypeHint** | [**string**] |  | (optional) defaults to undefined|


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

# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let alias: string; // (optional) (default to undefined)
let aliasTypeHint: string; // (optional) (default to undefined)
let davCreateAbsoluteUri: boolean; // (optional) (default to undefined)
let davCreateAbsoluteUriTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigApacheSlingDavExServlet(
    alias,
    aliasTypeHint,
    davCreateAbsoluteUri,
    davCreateAbsoluteUriTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **alias** | [**string**] |  | (optional) defaults to undefined|
| **aliasTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **davCreateAbsoluteUri** | [**boolean**] |  | (optional) defaults to undefined|
| **davCreateAbsoluteUriTypeHint** | [**string**] |  | (optional) defaults to undefined|


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

# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let jsonMaximumresults: string; // (optional) (default to undefined)
let jsonMaximumresultsTypeHint: string; // (optional) (default to undefined)
let enableHtml: boolean; // (optional) (default to undefined)
let enableHtmlTypeHint: string; // (optional) (default to undefined)
let enableTxt: boolean; // (optional) (default to undefined)
let enableTxtTypeHint: string; // (optional) (default to undefined)
let enableXml: boolean; // (optional) (default to undefined)
let enableXmlTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigApacheSlingGetServlet(
    jsonMaximumresults,
    jsonMaximumresultsTypeHint,
    enableHtml,
    enableHtmlTypeHint,
    enableTxt,
    enableTxtTypeHint,
    enableXml,
    enableXmlTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **jsonMaximumresults** | [**string**] |  | (optional) defaults to undefined|
| **jsonMaximumresultsTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **enableHtml** | [**boolean**] |  | (optional) defaults to undefined|
| **enableHtmlTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **enableTxt** | [**boolean**] |  | (optional) defaults to undefined|
| **enableTxtTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **enableXml** | [**boolean**] |  | (optional) defaults to undefined|
| **enableXmlTypeHint** | [**string**] |  | (optional) defaults to undefined|


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

# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let allowEmpty: boolean; // (optional) (default to undefined)
let allowEmptyTypeHint: string; // (optional) (default to undefined)
let allowHosts: string; // (optional) (default to undefined)
let allowHostsTypeHint: string; // (optional) (default to undefined)
let allowHostsRegexp: string; // (optional) (default to undefined)
let allowHostsRegexpTypeHint: string; // (optional) (default to undefined)
let filterMethods: string; // (optional) (default to undefined)
let filterMethodsTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigApacheSlingReferrerFilter(
    allowEmpty,
    allowEmptyTypeHint,
    allowHosts,
    allowHostsTypeHint,
    allowHostsRegexp,
    allowHostsRegexpTypeHint,
    filterMethods,
    filterMethodsTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **allowEmpty** | [**boolean**] |  | (optional) defaults to undefined|
| **allowEmptyTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **allowHosts** | [**string**] |  | (optional) defaults to undefined|
| **allowHostsTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **allowHostsRegexp** | [**string**] |  | (optional) defaults to undefined|
| **allowHostsRegexpTypeHint** | [**string**] |  | (optional) defaults to undefined|
| **filterMethods** | [**string**] |  | (optional) defaults to undefined|
| **filterMethodsTypeHint** | [**string**] |  | (optional) defaults to undefined|


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

# **postConfigProperty**
> postConfigProperty()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let configNodeName: string; // (default to undefined)

const { status, data } = await apiInstance.postConfigProperty(
    configNodeName
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **configNodeName** | [**string**] |  | defaults to undefined|


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

# **postNode**
> postNode()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let path: string; // (default to undefined)
let name: string; // (default to undefined)
let operation: string; // (optional) (default to undefined)
let deleteAuthorizable: string; // (optional) (default to undefined)
let file: File; // (optional) (default to undefined)

const { status, data } = await apiInstance.postNode(
    path,
    name,
    operation,
    deleteAuthorizable,
    file
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|
| **operation** | [**string**] |  | (optional) defaults to undefined|
| **deleteAuthorizable** | [**string**] |  | (optional) defaults to undefined|
| **file** | [**File**] |  | (optional) defaults to undefined|


### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNodeRw**
> postNodeRw()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let path: string; // (default to undefined)
let name: string; // (default to undefined)
let addMembers: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postNodeRw(
    path,
    name,
    addMembers
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|
| **addMembers** | [**string**] |  | (optional) defaults to undefined|


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

# **postPath**
> postPath()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let path: string; // (default to undefined)
let jcrPrimaryType: string; // (default to undefined)
let name: string; // (default to undefined)

const { status, data } = await apiInstance.postPath(
    path,
    jcrPrimaryType,
    name
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **jcrPrimaryType** | [**string**] |  | defaults to undefined|
| **name** | [**string**] |  | defaults to undefined|


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

# **postQuery**
> string postQuery()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let path: string; // (default to undefined)
let pLimit: number; // (default to undefined)
let _1property: string; // (default to undefined)
let _1propertyValue: string; // (default to undefined)

const { status, data } = await apiInstance.postQuery(
    path,
    pLimit,
    _1property,
    _1propertyValue
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **pLimit** | [**number**] |  | defaults to undefined|
| **_1property** | [**string**] |  | defaults to undefined|
| **_1propertyValue** | [**string**] |  | defaults to undefined|


### Return type

**string**

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

# **postTreeActivation**
> postTreeActivation()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let ignoredeactivated: boolean; // (default to undefined)
let onlymodified: boolean; // (default to undefined)
let path: string; // (default to undefined)
let cmd: string; // (default to 'activate')

const { status, data } = await apiInstance.postTreeActivation(
    ignoredeactivated,
    onlymodified,
    path,
    cmd
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **ignoredeactivated** | [**boolean**] |  | defaults to undefined|
| **onlymodified** | [**boolean**] |  | defaults to undefined|
| **path** | [**string**] |  | defaults to undefined|
| **cmd** | [**string**] |  | defaults to 'activate'|


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

# **postTruststore**
> string postTruststore()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let operation: string; // (optional) (default to undefined)
let newPassword: string; // (optional) (default to undefined)
let rePassword: string; // (optional) (default to undefined)
let keyStoreType: string; // (optional) (default to undefined)
let removeAlias: string; // (optional) (default to undefined)
let certificate: File; // (optional) (default to undefined)

const { status, data } = await apiInstance.postTruststore(
    operation,
    newPassword,
    rePassword,
    keyStoreType,
    removeAlias,
    certificate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **operation** | [**string**] |  | (optional) defaults to undefined|
| **newPassword** | [**string**] |  | (optional) defaults to undefined|
| **rePassword** | [**string**] |  | (optional) defaults to undefined|
| **keyStoreType** | [**string**] |  | (optional) defaults to undefined|
| **removeAlias** | [**string**] |  | (optional) defaults to undefined|
| **certificate** | [**File**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststorePKCS12**
> string postTruststorePKCS12()


### Example

```typescript
import {
    SlingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SlingApi(configuration);

let truststoreP12: File; // (optional) (default to undefined)

const { status, data } = await apiInstance.postTruststorePKCS12(
    truststoreP12
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **truststoreP12** | [**File**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

