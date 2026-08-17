# .SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](SlingApi.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


# **deleteAgent**
> deleteAgent()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiDeleteAgentRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiDeleteAgentRequest = {
  
  runmode: "runmode_example",
  
  name: "name_example",
};

const data = await apiInstance.deleteAgent(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined


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

# **deleteNode**
> deleteNode()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiDeleteNodeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiDeleteNodeRequest = {
  
  path: "path_example",
  
  name: "name_example",
};

const data = await apiInstance.deleteNode(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined


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

# **getAgent**
> getAgent()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetAgentRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetAgentRequest = {
  
  runmode: "runmode_example",
  
  name: "name_example",
};

const data = await apiInstance.getAgent(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined


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

# **getAgents**
> getAgents()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetAgentsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetAgentsRequest = {
  
  runmode: "runmode_example",
};

const data = await apiInstance.getAgents(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | [**string**] |  | defaults to undefined


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

# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetAuthorizableKeystoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetAuthorizableKeystoreRequest = {
  
  intermediatePath: "intermediatePath_example",
  
  authorizableId: "authorizableId_example",
};

const data = await apiInstance.getAuthorizableKeystore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | [**string**] |  | defaults to undefined
 **authorizableId** | [**string**] |  | defaults to undefined


### Return type

**KeystoreInfo**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved Authorizable Keystore info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getKeystore**
> getKeystore()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetKeystoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetKeystoreRequest = {
  
  intermediatePath: "intermediatePath_example",
  
  authorizableId: "authorizableId_example",
};

const data = await apiInstance.getKeystore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | [**string**] |  | defaults to undefined
 **authorizableId** | [**string**] |  | defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getNode**
> getNode()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetNodeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetNodeRequest = {
  
  path: "path_example",
  
  name: "name_example",
};

const data = await apiInstance.getNode(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined


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

# **getPackage**
> getPackage()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetPackageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetPackageRequest = {
  
  group: "group_example",
  
  name: "name_example",
  
  version: "version_example",
};

const data = await apiInstance.getPackage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined
 **version** | [**string**] |  | defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getPackageFilter**
> getPackageFilter()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetPackageFilterRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetPackageFilterRequest = {
  
  group: "group_example",
  
  name: "name_example",
  
  version: "version_example",
};

const data = await apiInstance.getPackageFilter(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined
 **version** | [**string**] |  | defaults to undefined


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

# **getQuery**
> getQuery()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiGetQueryRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiGetQueryRequest = {
  
  path: "path_example",
  
  pLimit: 3.14,
  
  _1property: "1_property_example",
  
  _1propertyValue: "1_property.value_example",
};

const data = await apiInstance.getQuery(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **pLimit** | [**number**] |  | defaults to undefined
 **_1property** | [**string**] |  | defaults to undefined
 **_1propertyValue** | [**string**] |  | defaults to undefined


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

# **getTruststore**
> getTruststore()


### Example


```typescript
import { createConfiguration, SlingApi } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request = {};

const data = await apiInstance.getTruststore(request);
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
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()


### Example


```typescript
import { createConfiguration, SlingApi } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request = {};

const data = await apiInstance.getTruststoreInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**TruststoreInfo**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved AEM Truststore info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postAgent**
> postAgent()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostAgentRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostAgentRequest = {
  
  runmode: "runmode_example",
  
  name: "name_example",
  
  jcrContentCqDistribute: true,
  
  jcrContentCqDistributeTypeHint: "jcr:content/cq:distribute@TypeHint_example",
  
  jcrContentCqName: "jcr:content/cq:name_example",
  
  jcrContentCqTemplate: "jcr:content/cq:template_example",
  
  jcrContentAliasUpdate: true,
  
  jcrContentEnabled: true,
  
  jcrContentJcrDescription: "jcr:content/jcr:description_example",
  
  jcrContentJcrLastModified: "jcr:content/jcr:lastModified_example",
  
  jcrContentJcrLastModifiedBy: "jcr:content/jcr:lastModifiedBy_example",
  
  jcrContentJcrMixinTypes: "jcr:content/jcr:mixinTypes_example",
  
  jcrContentJcrTitle: "jcr:content/jcr:title_example",
  
  jcrContentLogLevel: "jcr:content/logLevel_example",
  
  jcrContentNoStatusUpdate: true,
  
  jcrContentNoVersioning: true,
  
  jcrContentProtocolConnectTimeout: 3.14,
  
  jcrContentProtocolHTTPConnectionClosed: true,
  
  jcrContentProtocolHTTPExpired: "jcr:content/protocolHTTPExpired_example",
  
  jcrContentProtocolHTTPHeaders: [
    "jcr:content/protocolHTTPHeaders_example",
  ],
  
  jcrContentProtocolHTTPHeadersTypeHint: "jcr:content/protocolHTTPHeaders@TypeHint_example",
  
  jcrContentProtocolHTTPMethod: "jcr:content/protocolHTTPMethod_example",
  
  jcrContentProtocolHTTPSRelaxed: true,
  
  jcrContentProtocolInterface: "jcr:content/protocolInterface_example",
  
  jcrContentProtocolSocketTimeout: 3.14,
  
  jcrContentProtocolVersion: "jcr:content/protocolVersion_example",
  
  jcrContentProxyNTLMDomain: "jcr:content/proxyNTLMDomain_example",
  
  jcrContentProxyNTLMHost: "jcr:content/proxyNTLMHost_example",
  
  jcrContentProxyHost: "jcr:content/proxyHost_example",
  
  jcrContentProxyPassword: "jcr:content/proxyPassword_example",
  
  jcrContentProxyPort: 3.14,
  
  jcrContentProxyUser: "jcr:content/proxyUser_example",
  
  jcrContentQueueBatchMaxSize: 3.14,
  
  jcrContentQueueBatchMode: "jcr:content/queueBatchMode_example",
  
  jcrContentQueueBatchWaitTime: 3.14,
  
  jcrContentRetryDelay: "jcr:content/retryDelay_example",
  
  jcrContentReverseReplication: true,
  
  jcrContentSerializationType: "jcr:content/serializationType_example",
  
  jcrContentSlingResourceType: "jcr:content/sling:resourceType_example",
  
  jcrContentSsl: "jcr:content/ssl_example",
  
  jcrContentTransportNTLMDomain: "jcr:content/transportNTLMDomain_example",
  
  jcrContentTransportNTLMHost: "jcr:content/transportNTLMHost_example",
  
  jcrContentTransportPassword: "jcr:content/transportPassword_example",
  
  jcrContentTransportUri: "jcr:content/transportUri_example",
  
  jcrContentTransportUser: "jcr:content/transportUser_example",
  
  jcrContentTriggerDistribute: true,
  
  jcrContentTriggerModified: true,
  
  jcrContentTriggerOnOffTime: true,
  
  jcrContentTriggerReceive: true,
  
  jcrContentTriggerSpecific: true,
  
  jcrContentUserId: "jcr:content/userId_example",
  
  jcrPrimaryType: "jcr:primaryType_example",
  
  operation: ":operation_example",
};

const data = await apiInstance.postAgent(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined
 **jcrContentCqDistribute** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentCqDistributeTypeHint** | [**string**] |  | (optional) defaults to undefined
 **jcrContentCqName** | [**string**] |  | (optional) defaults to undefined
 **jcrContentCqTemplate** | [**string**] |  | (optional) defaults to undefined
 **jcrContentAliasUpdate** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentEnabled** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentJcrDescription** | [**string**] |  | (optional) defaults to undefined
 **jcrContentJcrLastModified** | [**string**] |  | (optional) defaults to undefined
 **jcrContentJcrLastModifiedBy** | [**string**] |  | (optional) defaults to undefined
 **jcrContentJcrMixinTypes** | [**string**] |  | (optional) defaults to undefined
 **jcrContentJcrTitle** | [**string**] |  | (optional) defaults to undefined
 **jcrContentLogLevel** | [**string**] |  | (optional) defaults to undefined
 **jcrContentNoStatusUpdate** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentNoVersioning** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentProtocolConnectTimeout** | [**number**] |  | (optional) defaults to undefined
 **jcrContentProtocolHTTPConnectionClosed** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentProtocolHTTPExpired** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProtocolHTTPHeaders** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **jcrContentProtocolHTTPHeadersTypeHint** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProtocolHTTPMethod** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProtocolHTTPSRelaxed** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentProtocolInterface** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProtocolSocketTimeout** | [**number**] |  | (optional) defaults to undefined
 **jcrContentProtocolVersion** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProxyNTLMDomain** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProxyNTLMHost** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProxyHost** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProxyPassword** | [**string**] |  | (optional) defaults to undefined
 **jcrContentProxyPort** | [**number**] |  | (optional) defaults to undefined
 **jcrContentProxyUser** | [**string**] |  | (optional) defaults to undefined
 **jcrContentQueueBatchMaxSize** | [**number**] |  | (optional) defaults to undefined
 **jcrContentQueueBatchMode** | [**string**] |  | (optional) defaults to undefined
 **jcrContentQueueBatchWaitTime** | [**number**] |  | (optional) defaults to undefined
 **jcrContentRetryDelay** | [**string**] |  | (optional) defaults to undefined
 **jcrContentReverseReplication** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentSerializationType** | [**string**] |  | (optional) defaults to undefined
 **jcrContentSlingResourceType** | [**string**] |  | (optional) defaults to undefined
 **jcrContentSsl** | [**string**] |  | (optional) defaults to undefined
 **jcrContentTransportNTLMDomain** | [**string**] |  | (optional) defaults to undefined
 **jcrContentTransportNTLMHost** | [**string**] |  | (optional) defaults to undefined
 **jcrContentTransportPassword** | [**string**] |  | (optional) defaults to undefined
 **jcrContentTransportUri** | [**string**] |  | (optional) defaults to undefined
 **jcrContentTransportUser** | [**string**] |  | (optional) defaults to undefined
 **jcrContentTriggerDistribute** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentTriggerModified** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentTriggerOnOffTime** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentTriggerReceive** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentTriggerSpecific** | [**boolean**] |  | (optional) defaults to undefined
 **jcrContentUserId** | [**string**] |  | (optional) defaults to undefined
 **jcrPrimaryType** | [**string**] |  | (optional) defaults to undefined
 **operation** | [**string**] |  | (optional) defaults to undefined


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

# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostAuthorizableKeystoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostAuthorizableKeystoreRequest = {
  
  intermediatePath: "intermediatePath_example",
  
  authorizableId: "authorizableId_example",
  
  operation: ":operation_example",
  
  currentPassword: "currentPassword_example",
  
  newPassword: "newPassword_example",
  
  rePassword: "rePassword_example",
  
  keyPassword: "keyPassword_example",
  
  keyStorePass: "keyStorePass_example",
  
  alias: "alias_example",
  
  newAlias: "newAlias_example",
  
  removeAlias: "removeAlias_example",
  
  certChain: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  
  pk: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  
  keyStore: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

const data = await apiInstance.postAuthorizableKeystore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | [**string**] |  | defaults to undefined
 **authorizableId** | [**string**] |  | defaults to undefined
 **operation** | [**string**] |  | (optional) defaults to undefined
 **currentPassword** | [**string**] |  | (optional) defaults to undefined
 **newPassword** | [**string**] |  | (optional) defaults to undefined
 **rePassword** | [**string**] |  | (optional) defaults to undefined
 **keyPassword** | [**string**] |  | (optional) defaults to undefined
 **keyStorePass** | [**string**] |  | (optional) defaults to undefined
 **alias** | [**string**] |  | (optional) defaults to undefined
 **newAlias** | [**string**] |  | (optional) defaults to undefined
 **removeAlias** | [**string**] |  | (optional) defaults to undefined
 **certChain** | [**HttpFile**] |  | (optional) defaults to undefined
 **pk** | [**HttpFile**] |  | (optional) defaults to undefined
 **keyStore** | [**HttpFile**] |  | (optional) defaults to undefined


### Return type

**KeystoreInfo**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved Authorizable Keystore info |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postAuthorizables**
> postAuthorizables()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostAuthorizablesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostAuthorizablesRequest = {
  
  authorizableId: "authorizableId_example",
  
  intermediatePath: "intermediatePath_example",
  
  createUser: "createUser_example",
  
  createGroup: "createGroup_example",
  
  repPassword: "rep:password_example",
  
  profileGivenName: "profile/givenName_example",
};

const data = await apiInstance.postAuthorizables(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | [**string**] |  | defaults to undefined
 **intermediatePath** | [**string**] |  | defaults to undefined
 **createUser** | [**string**] |  | (optional) defaults to undefined
 **createGroup** | [**string**] |  | (optional) defaults to undefined
 **repPassword** | [**string**] |  | (optional) defaults to undefined
 **profileGivenName** | [**string**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostConfigAdobeGraniteSamlAuthenticationHandlerRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostConfigAdobeGraniteSamlAuthenticationHandlerRequest = {
  
  keyStorePassword: "keyStorePassword_example",
  
  keyStorePasswordTypeHint: "keyStorePassword@TypeHint_example",
  
  serviceRanking: 1,
  
  serviceRankingTypeHint: "service.ranking@TypeHint_example",
  
  idpHttpRedirect: true,
  
  idpHttpRedirectTypeHint: "idpHttpRedirect@TypeHint_example",
  
  createUser: true,
  
  createUserTypeHint: "createUser@TypeHint_example",
  
  defaultRedirectUrl: "defaultRedirectUrl_example",
  
  defaultRedirectUrlTypeHint: "defaultRedirectUrl@TypeHint_example",
  
  userIDAttribute: "userIDAttribute_example",
  
  userIDAttributeTypeHint: "userIDAttribute@TypeHint_example",
  
  defaultGroups: [
    "defaultGroups_example",
  ],
  
  defaultGroupsTypeHint: "defaultGroups@TypeHint_example",
  
  idpCertAlias: "idpCertAlias_example",
  
  idpCertAliasTypeHint: "idpCertAlias@TypeHint_example",
  
  addGroupMemberships: true,
  
  addGroupMembershipsTypeHint: "addGroupMemberships@TypeHint_example",
  
  path: [
    "path_example",
  ],
  
  pathTypeHint: "path@TypeHint_example",
  
  synchronizeAttributes: [
    "synchronizeAttributes_example",
  ],
  
  synchronizeAttributesTypeHint: "synchronizeAttributes@TypeHint_example",
  
  clockTolerance: 1,
  
  clockToleranceTypeHint: "clockTolerance@TypeHint_example",
  
  groupMembershipAttribute: "groupMembershipAttribute_example",
  
  groupMembershipAttributeTypeHint: "groupMembershipAttribute@TypeHint_example",
  
  idpUrl: "idpUrl_example",
  
  idpUrlTypeHint: "idpUrl@TypeHint_example",
  
  logoutUrl: "logoutUrl_example",
  
  logoutUrlTypeHint: "logoutUrl@TypeHint_example",
  
  serviceProviderEntityId: "serviceProviderEntityId_example",
  
  serviceProviderEntityIdTypeHint: "serviceProviderEntityId@TypeHint_example",
  
  assertionConsumerServiceURL: "assertionConsumerServiceURL_example",
  
  assertionConsumerServiceURLTypeHint: "assertionConsumerServiceURL@TypeHint_example",
  
  handleLogout: true,
  
  handleLogoutTypeHint: "handleLogout@TypeHint_example",
  
  spPrivateKeyAlias: "spPrivateKeyAlias_example",
  
  spPrivateKeyAliasTypeHint: "spPrivateKeyAlias@TypeHint_example",
  
  useEncryption: true,
  
  useEncryptionTypeHint: "useEncryption@TypeHint_example",
  
  nameIdFormat: "nameIdFormat_example",
  
  nameIdFormatTypeHint: "nameIdFormat@TypeHint_example",
  
  digestMethod: "digestMethod_example",
  
  digestMethodTypeHint: "digestMethod@TypeHint_example",
  
  signatureMethod: "signatureMethod_example",
  
  signatureMethodTypeHint: "signatureMethod@TypeHint_example",
  
  userIntermediatePath: "userIntermediatePath_example",
  
  userIntermediatePathTypeHint: "userIntermediatePath@TypeHint_example",
};

const data = await apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | [**string**] |  | (optional) defaults to undefined
 **keyStorePasswordTypeHint** | [**string**] |  | (optional) defaults to undefined
 **serviceRanking** | [**number**] |  | (optional) defaults to undefined
 **serviceRankingTypeHint** | [**string**] |  | (optional) defaults to undefined
 **idpHttpRedirect** | [**boolean**] |  | (optional) defaults to undefined
 **idpHttpRedirectTypeHint** | [**string**] |  | (optional) defaults to undefined
 **createUser** | [**boolean**] |  | (optional) defaults to undefined
 **createUserTypeHint** | [**string**] |  | (optional) defaults to undefined
 **defaultRedirectUrl** | [**string**] |  | (optional) defaults to undefined
 **defaultRedirectUrlTypeHint** | [**string**] |  | (optional) defaults to undefined
 **userIDAttribute** | [**string**] |  | (optional) defaults to undefined
 **userIDAttributeTypeHint** | [**string**] |  | (optional) defaults to undefined
 **defaultGroups** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **defaultGroupsTypeHint** | [**string**] |  | (optional) defaults to undefined
 **idpCertAlias** | [**string**] |  | (optional) defaults to undefined
 **idpCertAliasTypeHint** | [**string**] |  | (optional) defaults to undefined
 **addGroupMemberships** | [**boolean**] |  | (optional) defaults to undefined
 **addGroupMembershipsTypeHint** | [**string**] |  | (optional) defaults to undefined
 **path** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **pathTypeHint** | [**string**] |  | (optional) defaults to undefined
 **synchronizeAttributes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **synchronizeAttributesTypeHint** | [**string**] |  | (optional) defaults to undefined
 **clockTolerance** | [**number**] |  | (optional) defaults to undefined
 **clockToleranceTypeHint** | [**string**] |  | (optional) defaults to undefined
 **groupMembershipAttribute** | [**string**] |  | (optional) defaults to undefined
 **groupMembershipAttributeTypeHint** | [**string**] |  | (optional) defaults to undefined
 **idpUrl** | [**string**] |  | (optional) defaults to undefined
 **idpUrlTypeHint** | [**string**] |  | (optional) defaults to undefined
 **logoutUrl** | [**string**] |  | (optional) defaults to undefined
 **logoutUrlTypeHint** | [**string**] |  | (optional) defaults to undefined
 **serviceProviderEntityId** | [**string**] |  | (optional) defaults to undefined
 **serviceProviderEntityIdTypeHint** | [**string**] |  | (optional) defaults to undefined
 **assertionConsumerServiceURL** | [**string**] |  | (optional) defaults to undefined
 **assertionConsumerServiceURLTypeHint** | [**string**] |  | (optional) defaults to undefined
 **handleLogout** | [**boolean**] |  | (optional) defaults to undefined
 **handleLogoutTypeHint** | [**string**] |  | (optional) defaults to undefined
 **spPrivateKeyAlias** | [**string**] |  | (optional) defaults to undefined
 **spPrivateKeyAliasTypeHint** | [**string**] |  | (optional) defaults to undefined
 **useEncryption** | [**boolean**] |  | (optional) defaults to undefined
 **useEncryptionTypeHint** | [**string**] |  | (optional) defaults to undefined
 **nameIdFormat** | [**string**] |  | (optional) defaults to undefined
 **nameIdFormatTypeHint** | [**string**] |  | (optional) defaults to undefined
 **digestMethod** | [**string**] |  | (optional) defaults to undefined
 **digestMethodTypeHint** | [**string**] |  | (optional) defaults to undefined
 **signatureMethod** | [**string**] |  | (optional) defaults to undefined
 **signatureMethodTypeHint** | [**string**] |  | (optional) defaults to undefined
 **userIntermediatePath** | [**string**] |  | (optional) defaults to undefined
 **userIntermediatePathTypeHint** | [**string**] |  | (optional) defaults to undefined


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

# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostConfigApacheFelixJettyBasedHttpServiceRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostConfigApacheFelixJettyBasedHttpServiceRequest = {
  
  orgApacheFelixHttpsNio: true,
  
  orgApacheFelixHttpsNioTypeHint: "org.apache.felix.https.nio@TypeHint_example",
  
  orgApacheFelixHttpsKeystore: "org.apache.felix.https.keystore_example",
  
  orgApacheFelixHttpsKeystoreTypeHint: "org.apache.felix.https.keystore@TypeHint_example",
  
  orgApacheFelixHttpsKeystorePassword: "org.apache.felix.https.keystore.password_example",
  
  orgApacheFelixHttpsKeystorePasswordTypeHint: "org.apache.felix.https.keystore.password@TypeHint_example",
  
  orgApacheFelixHttpsKeystoreKey: "org.apache.felix.https.keystore.key_example",
  
  orgApacheFelixHttpsKeystoreKeyTypeHint: "org.apache.felix.https.keystore.key@TypeHint_example",
  
  orgApacheFelixHttpsKeystoreKeyPassword: "org.apache.felix.https.keystore.key.password_example",
  
  orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: "org.apache.felix.https.keystore.key.password@TypeHint_example",
  
  orgApacheFelixHttpsTruststore: "org.apache.felix.https.truststore_example",
  
  orgApacheFelixHttpsTruststoreTypeHint: "org.apache.felix.https.truststore@TypeHint_example",
  
  orgApacheFelixHttpsTruststorePassword: "org.apache.felix.https.truststore.password_example",
  
  orgApacheFelixHttpsTruststorePasswordTypeHint: "org.apache.felix.https.truststore.password@TypeHint_example",
  
  orgApacheFelixHttpsClientcertificate: "org.apache.felix.https.clientcertificate_example",
  
  orgApacheFelixHttpsClientcertificateTypeHint: "org.apache.felix.https.clientcertificate@TypeHint_example",
  
  orgApacheFelixHttpsEnable: true,
  
  orgApacheFelixHttpsEnableTypeHint: "org.apache.felix.https.enable@TypeHint_example",
  
  orgOsgiServiceHttpPortSecure: "org.osgi.service.http.port.secure_example",
  
  orgOsgiServiceHttpPortSecureTypeHint: "org.osgi.service.http.port.secure@TypeHint_example",
};

const data = await apiInstance.postConfigApacheFelixJettyBasedHttpService(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | [**boolean**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsNioTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystore** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystoreTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystorePassword** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystoreKey** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystoreKeyPassword** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsTruststore** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsTruststoreTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsTruststorePassword** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsClientcertificate** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsClientcertificateTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsEnable** | [**boolean**] |  | (optional) defaults to undefined
 **orgApacheFelixHttpsEnableTypeHint** | [**string**] |  | (optional) defaults to undefined
 **orgOsgiServiceHttpPortSecure** | [**string**] |  | (optional) defaults to undefined
 **orgOsgiServiceHttpPortSecureTypeHint** | [**string**] |  | (optional) defaults to undefined


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

# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostConfigApacheHttpComponentsProxyConfigurationRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostConfigApacheHttpComponentsProxyConfigurationRequest = {
  
  proxyHost: "proxy.host_example",
  
  proxyHostTypeHint: "proxy.host@TypeHint_example",
  
  proxyPort: 1,
  
  proxyPortTypeHint: "proxy.port@TypeHint_example",
  
  proxyExceptions: [
    "proxy.exceptions_example",
  ],
  
  proxyExceptionsTypeHint: "proxy.exceptions@TypeHint_example",
  
  proxyEnabled: true,
  
  proxyEnabledTypeHint: "proxy.enabled@TypeHint_example",
  
  proxyUser: "proxy.user_example",
  
  proxyUserTypeHint: "proxy.user@TypeHint_example",
  
  proxyPassword: "proxy.password_example",
  
  proxyPasswordTypeHint: "proxy.password@TypeHint_example",
};

const data = await apiInstance.postConfigApacheHttpComponentsProxyConfiguration(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | [**string**] |  | (optional) defaults to undefined
 **proxyHostTypeHint** | [**string**] |  | (optional) defaults to undefined
 **proxyPort** | [**number**] |  | (optional) defaults to undefined
 **proxyPortTypeHint** | [**string**] |  | (optional) defaults to undefined
 **proxyExceptions** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **proxyExceptionsTypeHint** | [**string**] |  | (optional) defaults to undefined
 **proxyEnabled** | [**boolean**] |  | (optional) defaults to undefined
 **proxyEnabledTypeHint** | [**string**] |  | (optional) defaults to undefined
 **proxyUser** | [**string**] |  | (optional) defaults to undefined
 **proxyUserTypeHint** | [**string**] |  | (optional) defaults to undefined
 **proxyPassword** | [**string**] |  | (optional) defaults to undefined
 **proxyPasswordTypeHint** | [**string**] |  | (optional) defaults to undefined


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

# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostConfigApacheSlingDavExServletRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostConfigApacheSlingDavExServletRequest = {
  
  alias: "alias_example",
  
  aliasTypeHint: "alias@TypeHint_example",
  
  davCreateAbsoluteUri: true,
  
  davCreateAbsoluteUriTypeHint: "dav.create-absolute-uri@TypeHint_example",
};

const data = await apiInstance.postConfigApacheSlingDavExServlet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | [**string**] |  | (optional) defaults to undefined
 **aliasTypeHint** | [**string**] |  | (optional) defaults to undefined
 **davCreateAbsoluteUri** | [**boolean**] |  | (optional) defaults to undefined
 **davCreateAbsoluteUriTypeHint** | [**string**] |  | (optional) defaults to undefined


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

# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostConfigApacheSlingGetServletRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostConfigApacheSlingGetServletRequest = {
  
  jsonMaximumresults: "json.maximumresults_example",
  
  jsonMaximumresultsTypeHint: "json.maximumresults@TypeHint_example",
  
  enableHtml: true,
  
  enableHtmlTypeHint: "enable.html@TypeHint_example",
  
  enableTxt: true,
  
  enableTxtTypeHint: "enable.txt@TypeHint_example",
  
  enableXml: true,
  
  enableXmlTypeHint: "enable.xml@TypeHint_example",
};

const data = await apiInstance.postConfigApacheSlingGetServlet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | [**string**] |  | (optional) defaults to undefined
 **jsonMaximumresultsTypeHint** | [**string**] |  | (optional) defaults to undefined
 **enableHtml** | [**boolean**] |  | (optional) defaults to undefined
 **enableHtmlTypeHint** | [**string**] |  | (optional) defaults to undefined
 **enableTxt** | [**boolean**] |  | (optional) defaults to undefined
 **enableTxtTypeHint** | [**string**] |  | (optional) defaults to undefined
 **enableXml** | [**boolean**] |  | (optional) defaults to undefined
 **enableXmlTypeHint** | [**string**] |  | (optional) defaults to undefined


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

# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostConfigApacheSlingReferrerFilterRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostConfigApacheSlingReferrerFilterRequest = {
  
  allowEmpty: true,
  
  allowEmptyTypeHint: "allow.empty@TypeHint_example",
  
  allowHosts: "allow.hosts_example",
  
  allowHostsTypeHint: "allow.hosts@TypeHint_example",
  
  allowHostsRegexp: "allow.hosts.regexp_example",
  
  allowHostsRegexpTypeHint: "allow.hosts.regexp@TypeHint_example",
  
  filterMethods: "filter.methods_example",
  
  filterMethodsTypeHint: "filter.methods@TypeHint_example",
};

const data = await apiInstance.postConfigApacheSlingReferrerFilter(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | [**boolean**] |  | (optional) defaults to undefined
 **allowEmptyTypeHint** | [**string**] |  | (optional) defaults to undefined
 **allowHosts** | [**string**] |  | (optional) defaults to undefined
 **allowHostsTypeHint** | [**string**] |  | (optional) defaults to undefined
 **allowHostsRegexp** | [**string**] |  | (optional) defaults to undefined
 **allowHostsRegexpTypeHint** | [**string**] |  | (optional) defaults to undefined
 **filterMethods** | [**string**] |  | (optional) defaults to undefined
 **filterMethodsTypeHint** | [**string**] |  | (optional) defaults to undefined


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

# **postConfigProperty**
> postConfigProperty()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostConfigPropertyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostConfigPropertyRequest = {
  
  configNodeName: "configNodeName_example",
};

const data = await apiInstance.postConfigProperty(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | [**string**] |  | defaults to undefined


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

# **postNode**
> postNode()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostNodeRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostNodeRequest = {
  
  path: "path_example",
  
  name: "name_example",
  
  operation: ":operation_example",
  
  deleteAuthorizable: "deleteAuthorizable_example",
  
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

const data = await apiInstance.postNode(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined
 **operation** | [**string**] |  | (optional) defaults to undefined
 **deleteAuthorizable** | [**string**] |  | (optional) defaults to undefined
 **file** | [**HttpFile**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postNodeRw**
> postNodeRw()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostNodeRwRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostNodeRwRequest = {
  
  path: "path_example",
  
  name: "name_example",
  
  addMembers: "addMembers_example",
};

const data = await apiInstance.postNodeRw(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined
 **addMembers** | [**string**] |  | (optional) defaults to undefined


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

# **postPath**
> postPath()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostPathRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostPathRequest = {
  
  path: "path_example",
  
  jcrPrimaryType: "jcr:primaryType_example",
  
  name: ":name_example",
};

const data = await apiInstance.postPath(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **jcrPrimaryType** | [**string**] |  | defaults to undefined
 **name** | [**string**] |  | defaults to undefined


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

# **postQuery**
> postQuery()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostQueryRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostQueryRequest = {
  
  path: "path_example",
  
  pLimit: 3.14,
  
  _1property: "1_property_example",
  
  _1propertyValue: "1_property.value_example",
};

const data = await apiInstance.postQuery(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **pLimit** | [**number**] |  | defaults to undefined
 **_1property** | [**string**] |  | defaults to undefined
 **_1propertyValue** | [**string**] |  | defaults to undefined


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

# **postTreeActivation**
> postTreeActivation()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostTreeActivationRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostTreeActivationRequest = {
  
  ignoredeactivated: true,
  
  onlymodified: true,
  
  path: "path_example",
  
  cmd: "activate",
};

const data = await apiInstance.postTreeActivation(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | [**boolean**] |  | defaults to undefined
 **onlymodified** | [**boolean**] |  | defaults to undefined
 **path** | [**string**] |  | defaults to undefined
 **cmd** | [**string**] |  | defaults to 'activate'


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

# **postTruststore**
> postTruststore()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostTruststoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostTruststoreRequest = {
  
  operation: ":operation_example",
  
  newPassword: "newPassword_example",
  
  rePassword: "rePassword_example",
  
  keyStoreType: "keyStoreType_example",
  
  removeAlias: "removeAlias_example",
  
  certificate: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

const data = await apiInstance.postTruststore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | [**string**] |  | (optional) defaults to undefined
 **newPassword** | [**string**] |  | (optional) defaults to undefined
 **rePassword** | [**string**] |  | (optional) defaults to undefined
 **keyStoreType** | [**string**] |  | (optional) defaults to undefined
 **removeAlias** | [**string**] |  | (optional) defaults to undefined
 **certificate** | [**HttpFile**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postTruststorePKCS12**
> postTruststorePKCS12()


### Example


```typescript
import { createConfiguration, SlingApi } from '';
import type { SlingApiPostTruststorePKCS12Request } from '';

const configuration = createConfiguration();
const apiInstance = new SlingApi(configuration);

const request: SlingApiPostTruststorePKCS12Request = {
  
  truststoreP12: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

const data = await apiInstance.postTruststorePKCS12(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | [**HttpFile**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


