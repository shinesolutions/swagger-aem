# NodeSwaggerAem.SlingApi

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
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 



## deleteAgent

> deleteAgent(runmode, name)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let runmode = "runmode_example"; // String | 
let name = "name_example"; // String | 
apiInstance.deleteAgent(runmode, name, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## deleteNode

> deleteNode(path, name)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let path = "path_example"; // String | 
let name = "name_example"; // String | 
apiInstance.deleteNode(path, name, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getAgent

> getAgent(runmode, name)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let runmode = "runmode_example"; // String | 
let name = "name_example"; // String | 
apiInstance.getAgent(runmode, name, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getAgents

> String getAgents(runmode)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let runmode = "runmode_example"; // String | 
apiInstance.getAgents(runmode, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAuthorizableKeystore

> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let intermediatePath = "intermediatePath_example"; // String | 
let authorizableId = "authorizableId_example"; // String | 
apiInstance.getAuthorizableKeystore(intermediatePath, authorizableId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## getKeystore

> File getKeystore(intermediatePath, authorizableId)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let intermediatePath = "intermediatePath_example"; // String | 
let authorizableId = "authorizableId_example"; // String | 
apiInstance.getKeystore(intermediatePath, authorizableId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## getNode

> getNode(path, name)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let path = "path_example"; // String | 
let name = "name_example"; // String | 
apiInstance.getNode(path, name, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getPackage

> File getPackage(group, name, version)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let group = "group_example"; // String | 
let name = "name_example"; // String | 
let version = "version_example"; // String | 
apiInstance.getPackage(group, name, version, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## getPackageFilter

> String getPackageFilter(group, name, version)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let group = "group_example"; // String | 
let name = "name_example"; // String | 
let version = "version_example"; // String | 
apiInstance.getPackageFilter(group, name, version, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getQuery

> String getQuery(path, pLimit, _1property, _1propertyValue)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let path = "path_example"; // String | 
let pLimit = 3.4; // Number | 
let _1property = "_1property_example"; // String | 
let _1propertyValue = "_1propertyValue_example"; // String | 
apiInstance.getQuery(path, pLimit, _1property, _1propertyValue, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pLimit** | **Number**|  | 
 **_1property** | **String**|  | 
 **_1propertyValue** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTruststore

> File getTruststore()



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
apiInstance.getTruststore((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## getTruststoreInfo

> TruststoreInfo getTruststoreInfo()



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
apiInstance.getTruststoreInfo((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postAgent

> postAgent(runmode, name, opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let runmode = "runmode_example"; // String | 
let name = "name_example"; // String | 
let opts = {
  'jcrcontentCqdistribute': true, // Boolean | 
  'jcrcontentCqdistributeTypeHint': "jcrcontentCqdistributeTypeHint_example", // String | 
  'jcrcontentCqname': "jcrcontentCqname_example", // String | 
  'jcrcontentCqtemplate': "jcrcontentCqtemplate_example", // String | 
  'jcrcontentEnabled': true, // Boolean | 
  'jcrcontentJcrdescription': "jcrcontentJcrdescription_example", // String | 
  'jcrcontentJcrlastModified': "jcrcontentJcrlastModified_example", // String | 
  'jcrcontentJcrlastModifiedBy': "jcrcontentJcrlastModifiedBy_example", // String | 
  'jcrcontentJcrmixinTypes': "jcrcontentJcrmixinTypes_example", // String | 
  'jcrcontentJcrtitle': "jcrcontentJcrtitle_example", // String | 
  'jcrcontentLogLevel': "jcrcontentLogLevel_example", // String | 
  'jcrcontentNoStatusUpdate': true, // Boolean | 
  'jcrcontentNoVersioning': true, // Boolean | 
  'jcrcontentProtocolConnectTimeout': 3.4, // Number | 
  'jcrcontentProtocolHTTPConnectionClosed': true, // Boolean | 
  'jcrcontentProtocolHTTPExpired': "jcrcontentProtocolHTTPExpired_example", // String | 
  'jcrcontentProtocolHTTPHeaders': ["null"], // [String] | 
  'jcrcontentProtocolHTTPHeadersTypeHint': "jcrcontentProtocolHTTPHeadersTypeHint_example", // String | 
  'jcrcontentProtocolHTTPMethod': "jcrcontentProtocolHTTPMethod_example", // String | 
  'jcrcontentProtocolHTTPSRelaxed': true, // Boolean | 
  'jcrcontentProtocolInterface': "jcrcontentProtocolInterface_example", // String | 
  'jcrcontentProtocolSocketTimeout': 3.4, // Number | 
  'jcrcontentProtocolVersion': "jcrcontentProtocolVersion_example", // String | 
  'jcrcontentProxyNTLMDomain': "jcrcontentProxyNTLMDomain_example", // String | 
  'jcrcontentProxyNTLMHost': "jcrcontentProxyNTLMHost_example", // String | 
  'jcrcontentProxyHost': "jcrcontentProxyHost_example", // String | 
  'jcrcontentProxyPassword': "jcrcontentProxyPassword_example", // String | 
  'jcrcontentProxyPort': 3.4, // Number | 
  'jcrcontentProxyUser': "jcrcontentProxyUser_example", // String | 
  'jcrcontentQueueBatchMaxSize': 3.4, // Number | 
  'jcrcontentQueueBatchMode': "jcrcontentQueueBatchMode_example", // String | 
  'jcrcontentQueueBatchWaitTime': 3.4, // Number | 
  'jcrcontentRetryDelay': "jcrcontentRetryDelay_example", // String | 
  'jcrcontentReverseReplication': true, // Boolean | 
  'jcrcontentSerializationType': "jcrcontentSerializationType_example", // String | 
  'jcrcontentSlingresourceType': "jcrcontentSlingresourceType_example", // String | 
  'jcrcontentSsl': "jcrcontentSsl_example", // String | 
  'jcrcontentTransportNTLMDomain': "jcrcontentTransportNTLMDomain_example", // String | 
  'jcrcontentTransportNTLMHost': "jcrcontentTransportNTLMHost_example", // String | 
  'jcrcontentTransportPassword': "jcrcontentTransportPassword_example", // String | 
  'jcrcontentTransportUri': "jcrcontentTransportUri_example", // String | 
  'jcrcontentTransportUser': "jcrcontentTransportUser_example", // String | 
  'jcrcontentTriggerDistribute': true, // Boolean | 
  'jcrcontentTriggerModified': true, // Boolean | 
  'jcrcontentTriggerOnOffTime': true, // Boolean | 
  'jcrcontentTriggerReceive': true, // Boolean | 
  'jcrcontentTriggerSpecific': true, // Boolean | 
  'jcrcontentUserId': "jcrcontentUserId_example", // String | 
  'jcrprimaryType': "jcrprimaryType_example", // String | 
  'operation': "operation_example" // String | 
};
apiInstance.postAgent(runmode, name, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
 **jcrcontentCqdistribute** | **Boolean**|  | [optional] 
 **jcrcontentCqdistributeTypeHint** | **String**|  | [optional] 
 **jcrcontentCqname** | **String**|  | [optional] 
 **jcrcontentCqtemplate** | **String**|  | [optional] 
 **jcrcontentEnabled** | **Boolean**|  | [optional] 
 **jcrcontentJcrdescription** | **String**|  | [optional] 
 **jcrcontentJcrlastModified** | **String**|  | [optional] 
 **jcrcontentJcrlastModifiedBy** | **String**|  | [optional] 
 **jcrcontentJcrmixinTypes** | **String**|  | [optional] 
 **jcrcontentJcrtitle** | **String**|  | [optional] 
 **jcrcontentLogLevel** | **String**|  | [optional] 
 **jcrcontentNoStatusUpdate** | **Boolean**|  | [optional] 
 **jcrcontentNoVersioning** | **Boolean**|  | [optional] 
 **jcrcontentProtocolConnectTimeout** | **Number**|  | [optional] 
 **jcrcontentProtocolHTTPConnectionClosed** | **Boolean**|  | [optional] 
 **jcrcontentProtocolHTTPExpired** | **String**|  | [optional] 
 **jcrcontentProtocolHTTPHeaders** | [**[String]**](String.md)|  | [optional] 
 **jcrcontentProtocolHTTPHeadersTypeHint** | **String**|  | [optional] 
 **jcrcontentProtocolHTTPMethod** | **String**|  | [optional] 
 **jcrcontentProtocolHTTPSRelaxed** | **Boolean**|  | [optional] 
 **jcrcontentProtocolInterface** | **String**|  | [optional] 
 **jcrcontentProtocolSocketTimeout** | **Number**|  | [optional] 
 **jcrcontentProtocolVersion** | **String**|  | [optional] 
 **jcrcontentProxyNTLMDomain** | **String**|  | [optional] 
 **jcrcontentProxyNTLMHost** | **String**|  | [optional] 
 **jcrcontentProxyHost** | **String**|  | [optional] 
 **jcrcontentProxyPassword** | **String**|  | [optional] 
 **jcrcontentProxyPort** | **Number**|  | [optional] 
 **jcrcontentProxyUser** | **String**|  | [optional] 
 **jcrcontentQueueBatchMaxSize** | **Number**|  | [optional] 
 **jcrcontentQueueBatchMode** | **String**|  | [optional] 
 **jcrcontentQueueBatchWaitTime** | **Number**|  | [optional] 
 **jcrcontentRetryDelay** | **String**|  | [optional] 
 **jcrcontentReverseReplication** | **Boolean**|  | [optional] 
 **jcrcontentSerializationType** | **String**|  | [optional] 
 **jcrcontentSlingresourceType** | **String**|  | [optional] 
 **jcrcontentSsl** | **String**|  | [optional] 
 **jcrcontentTransportNTLMDomain** | **String**|  | [optional] 
 **jcrcontentTransportNTLMHost** | **String**|  | [optional] 
 **jcrcontentTransportPassword** | **String**|  | [optional] 
 **jcrcontentTransportUri** | **String**|  | [optional] 
 **jcrcontentTransportUser** | **String**|  | [optional] 
 **jcrcontentTriggerDistribute** | **Boolean**|  | [optional] 
 **jcrcontentTriggerModified** | **Boolean**|  | [optional] 
 **jcrcontentTriggerOnOffTime** | **Boolean**|  | [optional] 
 **jcrcontentTriggerReceive** | **Boolean**|  | [optional] 
 **jcrcontentTriggerSpecific** | **Boolean**|  | [optional] 
 **jcrcontentUserId** | **String**|  | [optional] 
 **jcrprimaryType** | **String**|  | [optional] 
 **operation** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postAuthorizableKeystore

> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let intermediatePath = "intermediatePath_example"; // String | 
let authorizableId = "authorizableId_example"; // String | 
let opts = {
  'operation': "operation_example", // String | 
  'currentPassword': "currentPassword_example", // String | 
  'newPassword': "newPassword_example", // String | 
  'rePassword': "rePassword_example", // String | 
  'keyPassword': "keyPassword_example", // String | 
  'keyStorePass': "keyStorePass_example", // String | 
  'alias': "alias_example", // String | 
  'newAlias': "newAlias_example", // String | 
  'removeAlias': "removeAlias_example", // String | 
  'certChain': "/path/to/file", // File | 
  'pk': "/path/to/file", // File | 
  'keyStore': "/path/to/file" // File | 
};
apiInstance.postAuthorizableKeystore(intermediatePath, authorizableId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 
 **operation** | **String**|  | [optional] 
 **currentPassword** | **String**|  | [optional] 
 **newPassword** | **String**|  | [optional] 
 **rePassword** | **String**|  | [optional] 
 **keyPassword** | **String**|  | [optional] 
 **keyStorePass** | **String**|  | [optional] 
 **alias** | **String**|  | [optional] 
 **newAlias** | **String**|  | [optional] 
 **removeAlias** | **String**|  | [optional] 
 **certChain** | **File**|  | [optional] 
 **pk** | **File**|  | [optional] 
 **keyStore** | **File**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


## postAuthorizables

> String postAuthorizables(authorizableId, intermediatePath, opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let authorizableId = "authorizableId_example"; // String | 
let intermediatePath = "intermediatePath_example"; // String | 
let opts = {
  'createUser': "createUser_example", // String | 
  'createGroup': "createGroup_example", // String | 
  'reppassword': "reppassword_example", // String | 
  'profileGivenName': "profileGivenName_example" // String | 
};
apiInstance.postAuthorizables(authorizableId, intermediatePath, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  | 
 **intermediatePath** | **String**|  | 
 **createUser** | **String**|  | [optional] 
 **createGroup** | **String**|  | [optional] 
 **reppassword** | **String**|  | [optional] 
 **profileGivenName** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


## postConfigAdobeGraniteSamlAuthenticationHandler

> postConfigAdobeGraniteSamlAuthenticationHandler(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'keyStorePassword': "keyStorePassword_example", // String | 
  'keyStorePasswordTypeHint': "keyStorePasswordTypeHint_example", // String | 
  'serviceRanking': 56, // Number | 
  'serviceRankingTypeHint': "serviceRankingTypeHint_example", // String | 
  'idpHttpRedirect': true, // Boolean | 
  'idpHttpRedirectTypeHint': "idpHttpRedirectTypeHint_example", // String | 
  'createUser': true, // Boolean | 
  'createUserTypeHint': "createUserTypeHint_example", // String | 
  'defaultRedirectUrl': "defaultRedirectUrl_example", // String | 
  'defaultRedirectUrlTypeHint': "defaultRedirectUrlTypeHint_example", // String | 
  'userIDAttribute': "userIDAttribute_example", // String | 
  'userIDAttributeTypeHint': "userIDAttributeTypeHint_example", // String | 
  'defaultGroups': ["null"], // [String] | 
  'defaultGroupsTypeHint': "defaultGroupsTypeHint_example", // String | 
  'idpCertAlias': "idpCertAlias_example", // String | 
  'idpCertAliasTypeHint': "idpCertAliasTypeHint_example", // String | 
  'addGroupMemberships': true, // Boolean | 
  'addGroupMembershipsTypeHint': "addGroupMembershipsTypeHint_example", // String | 
  'path': ["null"], // [String] | 
  'pathTypeHint': "pathTypeHint_example", // String | 
  'synchronizeAttributes': ["null"], // [String] | 
  'synchronizeAttributesTypeHint': "synchronizeAttributesTypeHint_example", // String | 
  'clockTolerance': 56, // Number | 
  'clockToleranceTypeHint': "clockToleranceTypeHint_example", // String | 
  'groupMembershipAttribute': "groupMembershipAttribute_example", // String | 
  'groupMembershipAttributeTypeHint': "groupMembershipAttributeTypeHint_example", // String | 
  'idpUrl': "idpUrl_example", // String | 
  'idpUrlTypeHint': "idpUrlTypeHint_example", // String | 
  'logoutUrl': "logoutUrl_example", // String | 
  'logoutUrlTypeHint': "logoutUrlTypeHint_example", // String | 
  'serviceProviderEntityId': "serviceProviderEntityId_example", // String | 
  'serviceProviderEntityIdTypeHint': "serviceProviderEntityIdTypeHint_example", // String | 
  'assertionConsumerServiceURL': "assertionConsumerServiceURL_example", // String | 
  'assertionConsumerServiceURLTypeHint': "assertionConsumerServiceURLTypeHint_example", // String | 
  'handleLogout': true, // Boolean | 
  'handleLogoutTypeHint': "handleLogoutTypeHint_example", // String | 
  'spPrivateKeyAlias': "spPrivateKeyAlias_example", // String | 
  'spPrivateKeyAliasTypeHint': "spPrivateKeyAliasTypeHint_example", // String | 
  'useEncryption': true, // Boolean | 
  'useEncryptionTypeHint': "useEncryptionTypeHint_example", // String | 
  'nameIdFormat': "nameIdFormat_example", // String | 
  'nameIdFormatTypeHint': "nameIdFormatTypeHint_example", // String | 
  'digestMethod': "digestMethod_example", // String | 
  'digestMethodTypeHint': "digestMethodTypeHint_example", // String | 
  'signatureMethod': "signatureMethod_example", // String | 
  'signatureMethodTypeHint': "signatureMethodTypeHint_example", // String | 
  'userIntermediatePath': "userIntermediatePath_example", // String | 
  'userIntermediatePathTypeHint': "userIntermediatePathTypeHint_example" // String | 
};
apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **String**|  | [optional] 
 **keyStorePasswordTypeHint** | **String**|  | [optional] 
 **serviceRanking** | **Number**|  | [optional] 
 **serviceRankingTypeHint** | **String**|  | [optional] 
 **idpHttpRedirect** | **Boolean**|  | [optional] 
 **idpHttpRedirectTypeHint** | **String**|  | [optional] 
 **createUser** | **Boolean**|  | [optional] 
 **createUserTypeHint** | **String**|  | [optional] 
 **defaultRedirectUrl** | **String**|  | [optional] 
 **defaultRedirectUrlTypeHint** | **String**|  | [optional] 
 **userIDAttribute** | **String**|  | [optional] 
 **userIDAttributeTypeHint** | **String**|  | [optional] 
 **defaultGroups** | [**[String]**](String.md)|  | [optional] 
 **defaultGroupsTypeHint** | **String**|  | [optional] 
 **idpCertAlias** | **String**|  | [optional] 
 **idpCertAliasTypeHint** | **String**|  | [optional] 
 **addGroupMemberships** | **Boolean**|  | [optional] 
 **addGroupMembershipsTypeHint** | **String**|  | [optional] 
 **path** | [**[String]**](String.md)|  | [optional] 
 **pathTypeHint** | **String**|  | [optional] 
 **synchronizeAttributes** | [**[String]**](String.md)|  | [optional] 
 **synchronizeAttributesTypeHint** | **String**|  | [optional] 
 **clockTolerance** | **Number**|  | [optional] 
 **clockToleranceTypeHint** | **String**|  | [optional] 
 **groupMembershipAttribute** | **String**|  | [optional] 
 **groupMembershipAttributeTypeHint** | **String**|  | [optional] 
 **idpUrl** | **String**|  | [optional] 
 **idpUrlTypeHint** | **String**|  | [optional] 
 **logoutUrl** | **String**|  | [optional] 
 **logoutUrlTypeHint** | **String**|  | [optional] 
 **serviceProviderEntityId** | **String**|  | [optional] 
 **serviceProviderEntityIdTypeHint** | **String**|  | [optional] 
 **assertionConsumerServiceURL** | **String**|  | [optional] 
 **assertionConsumerServiceURLTypeHint** | **String**|  | [optional] 
 **handleLogout** | **Boolean**|  | [optional] 
 **handleLogoutTypeHint** | **String**|  | [optional] 
 **spPrivateKeyAlias** | **String**|  | [optional] 
 **spPrivateKeyAliasTypeHint** | **String**|  | [optional] 
 **useEncryption** | **Boolean**|  | [optional] 
 **useEncryptionTypeHint** | **String**|  | [optional] 
 **nameIdFormat** | **String**|  | [optional] 
 **nameIdFormatTypeHint** | **String**|  | [optional] 
 **digestMethod** | **String**|  | [optional] 
 **digestMethodTypeHint** | **String**|  | [optional] 
 **signatureMethod** | **String**|  | [optional] 
 **signatureMethodTypeHint** | **String**|  | [optional] 
 **userIntermediatePath** | **String**|  | [optional] 
 **userIntermediatePathTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheFelixJettyBasedHttpService

> postConfigApacheFelixJettyBasedHttpService(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'orgApacheFelixHttpsNio': true, // Boolean | 
  'orgApacheFelixHttpsNioTypeHint': "orgApacheFelixHttpsNioTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystore': "orgApacheFelixHttpsKeystore_example", // String | 
  'orgApacheFelixHttpsKeystoreTypeHint': "orgApacheFelixHttpsKeystoreTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystorePassword': "orgApacheFelixHttpsKeystorePassword_example", // String | 
  'orgApacheFelixHttpsKeystorePasswordTypeHint': "orgApacheFelixHttpsKeystorePasswordTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystoreKey': "orgApacheFelixHttpsKeystoreKey_example", // String | 
  'orgApacheFelixHttpsKeystoreKeyTypeHint': "orgApacheFelixHttpsKeystoreKeyTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystoreKeyPassword': "orgApacheFelixHttpsKeystoreKeyPassword_example", // String | 
  'orgApacheFelixHttpsKeystoreKeyPasswordTypeHint': "orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example", // String | 
  'orgApacheFelixHttpsTruststore': "orgApacheFelixHttpsTruststore_example", // String | 
  'orgApacheFelixHttpsTruststoreTypeHint': "orgApacheFelixHttpsTruststoreTypeHint_example", // String | 
  'orgApacheFelixHttpsTruststorePassword': "orgApacheFelixHttpsTruststorePassword_example", // String | 
  'orgApacheFelixHttpsTruststorePasswordTypeHint': "orgApacheFelixHttpsTruststorePasswordTypeHint_example", // String | 
  'orgApacheFelixHttpsClientcertificate': "orgApacheFelixHttpsClientcertificate_example", // String | 
  'orgApacheFelixHttpsClientcertificateTypeHint': "orgApacheFelixHttpsClientcertificateTypeHint_example", // String | 
  'orgApacheFelixHttpsEnable': true, // Boolean | 
  'orgApacheFelixHttpsEnableTypeHint': "orgApacheFelixHttpsEnableTypeHint_example", // String | 
  'orgOsgiServiceHttpPortSecure': "orgOsgiServiceHttpPortSecure_example", // String | 
  'orgOsgiServiceHttpPortSecureTypeHint': "orgOsgiServiceHttpPortSecureTypeHint_example" // String | 
};
apiInstance.postConfigApacheFelixJettyBasedHttpService(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **Boolean**|  | [optional] 
 **orgApacheFelixHttpsNioTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystore** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystorePassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKey** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststore** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststoreTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststorePassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsClientcertificate** | **String**|  | [optional] 
 **orgApacheFelixHttpsClientcertificateTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsEnable** | **Boolean**|  | [optional] 
 **orgApacheFelixHttpsEnableTypeHint** | **String**|  | [optional] 
 **orgOsgiServiceHttpPortSecure** | **String**|  | [optional] 
 **orgOsgiServiceHttpPortSecureTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheHttpComponentsProxyConfiguration

> postConfigApacheHttpComponentsProxyConfiguration(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'proxyHost': "proxyHost_example", // String | 
  'proxyHostTypeHint': "proxyHostTypeHint_example", // String | 
  'proxyPort': 56, // Number | 
  'proxyPortTypeHint': "proxyPortTypeHint_example", // String | 
  'proxyExceptions': ["null"], // [String] | 
  'proxyExceptionsTypeHint': "proxyExceptionsTypeHint_example", // String | 
  'proxyEnabled': true, // Boolean | 
  'proxyEnabledTypeHint': "proxyEnabledTypeHint_example", // String | 
  'proxyUser': "proxyUser_example", // String | 
  'proxyUserTypeHint': "proxyUserTypeHint_example", // String | 
  'proxyPassword': "proxyPassword_example", // String | 
  'proxyPasswordTypeHint': "proxyPasswordTypeHint_example" // String | 
};
apiInstance.postConfigApacheHttpComponentsProxyConfiguration(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **String**|  | [optional] 
 **proxyHostTypeHint** | **String**|  | [optional] 
 **proxyPort** | **Number**|  | [optional] 
 **proxyPortTypeHint** | **String**|  | [optional] 
 **proxyExceptions** | [**[String]**](String.md)|  | [optional] 
 **proxyExceptionsTypeHint** | **String**|  | [optional] 
 **proxyEnabled** | **Boolean**|  | [optional] 
 **proxyEnabledTypeHint** | **String**|  | [optional] 
 **proxyUser** | **String**|  | [optional] 
 **proxyUserTypeHint** | **String**|  | [optional] 
 **proxyPassword** | **String**|  | [optional] 
 **proxyPasswordTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheSlingDavExServlet

> postConfigApacheSlingDavExServlet(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'alias': "alias_example", // String | 
  'aliasTypeHint': "aliasTypeHint_example", // String | 
  'davCreateAbsoluteUri': true, // Boolean | 
  'davCreateAbsoluteUriTypeHint': "davCreateAbsoluteUriTypeHint_example" // String | 
};
apiInstance.postConfigApacheSlingDavExServlet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**|  | [optional] 
 **aliasTypeHint** | **String**|  | [optional] 
 **davCreateAbsoluteUri** | **Boolean**|  | [optional] 
 **davCreateAbsoluteUriTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheSlingGetServlet

> postConfigApacheSlingGetServlet(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'jsonMaximumresults': "jsonMaximumresults_example", // String | 
  'jsonMaximumresultsTypeHint': "jsonMaximumresultsTypeHint_example", // String | 
  'enableHtml': true, // Boolean | 
  'enableHtmlTypeHint': "enableHtmlTypeHint_example", // String | 
  'enableTxt': true, // Boolean | 
  'enableTxtTypeHint': "enableTxtTypeHint_example", // String | 
  'enableXml': true, // Boolean | 
  'enableXmlTypeHint': "enableXmlTypeHint_example" // String | 
};
apiInstance.postConfigApacheSlingGetServlet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **String**|  | [optional] 
 **jsonMaximumresultsTypeHint** | **String**|  | [optional] 
 **enableHtml** | **Boolean**|  | [optional] 
 **enableHtmlTypeHint** | **String**|  | [optional] 
 **enableTxt** | **Boolean**|  | [optional] 
 **enableTxtTypeHint** | **String**|  | [optional] 
 **enableXml** | **Boolean**|  | [optional] 
 **enableXmlTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheSlingReferrerFilter

> postConfigApacheSlingReferrerFilter(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'allowEmpty': true, // Boolean | 
  'allowEmptyTypeHint': "allowEmptyTypeHint_example", // String | 
  'allowHosts': "allowHosts_example", // String | 
  'allowHostsTypeHint': "allowHostsTypeHint_example", // String | 
  'allowHostsRegexp': "allowHostsRegexp_example", // String | 
  'allowHostsRegexpTypeHint': "allowHostsRegexpTypeHint_example", // String | 
  'filterMethods': "filterMethods_example", // String | 
  'filterMethodsTypeHint': "filterMethodsTypeHint_example" // String | 
};
apiInstance.postConfigApacheSlingReferrerFilter(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **Boolean**|  | [optional] 
 **allowEmptyTypeHint** | **String**|  | [optional] 
 **allowHosts** | **String**|  | [optional] 
 **allowHostsTypeHint** | **String**|  | [optional] 
 **allowHostsRegexp** | **String**|  | [optional] 
 **allowHostsRegexpTypeHint** | **String**|  | [optional] 
 **filterMethods** | **String**|  | [optional] 
 **filterMethodsTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigProperty

> postConfigProperty(configNodeName)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let configNodeName = "configNodeName_example"; // String | 
apiInstance.postConfigProperty(configNodeName, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postNode

> postNode(path, name, opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let path = "path_example"; // String | 
let name = "name_example"; // String | 
let opts = {
  'operation': "operation_example", // String | 
  'deleteAuthorizable': "deleteAuthorizable_example", // String | 
  'file': "/path/to/file" // File | 
};
apiInstance.postNode(path, name, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **operation** | **String**|  | [optional] 
 **deleteAuthorizable** | **String**|  | [optional] 
 **file** | **File**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


## postNodeRw

> postNodeRw(path, name, opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let path = "path_example"; // String | 
let name = "name_example"; // String | 
let opts = {
  'addMembers': "addMembers_example" // String | 
};
apiInstance.postNodeRw(path, name, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **addMembers** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postPath

> postPath(path, jcrprimaryType, name)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let path = "path_example"; // String | 
let jcrprimaryType = "jcrprimaryType_example"; // String | 
let name = "name_example"; // String | 
apiInstance.postPath(path, jcrprimaryType, name, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **jcrprimaryType** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postQuery

> String postQuery(path, pLimit, _1property, _1propertyValue)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let path = "path_example"; // String | 
let pLimit = 3.4; // Number | 
let _1property = "_1property_example"; // String | 
let _1propertyValue = "_1propertyValue_example"; // String | 
apiInstance.postQuery(path, pLimit, _1property, _1propertyValue, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pLimit** | **Number**|  | 
 **_1property** | **String**|  | 
 **_1propertyValue** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postTreeActivation

> postTreeActivation(ignoredeactivated, onlymodified, path)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let ignoredeactivated = true; // Boolean | 
let onlymodified = true; // Boolean | 
let path = "path_example"; // String | 
apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **Boolean**|  | 
 **onlymodified** | **Boolean**|  | 
 **path** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postTruststore

> String postTruststore(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'operation': "operation_example", // String | 
  'newPassword': "newPassword_example", // String | 
  'rePassword': "rePassword_example", // String | 
  'keyStoreType': "keyStoreType_example", // String | 
  'removeAlias': "removeAlias_example", // String | 
  'certificate': "/path/to/file" // File | 
};
apiInstance.postTruststore(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **String**|  | [optional] 
 **newPassword** | **String**|  | [optional] 
 **rePassword** | **String**|  | [optional] 
 **keyStoreType** | **String**|  | [optional] 
 **removeAlias** | **String**|  | [optional] 
 **certificate** | **File**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


## postTruststorePKCS12

> String postTruststorePKCS12(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();
let opts = {
  'truststoreP12': "/path/to/file" // File | 
};
apiInstance.postTruststorePKCS12(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **File**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

