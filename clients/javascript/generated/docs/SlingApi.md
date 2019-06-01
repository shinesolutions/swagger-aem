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
[**getTruststoreInformations**](SlingApi.md#getTruststoreInformations) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


<a name="deleteAgent"></a>
# **deleteAgent**
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
 - **Accept**: text/plain

<a name="deleteNode"></a>
# **deleteNode**
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
 - **Accept**: text/plain

<a name="getAgent"></a>
# **getAgent**
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
 - **Accept**: text/plain

<a name="getAgents"></a>
# **getAgents**
> &#39;String&#39; getAgents(runmode)



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

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
> KeystoreInformations getAuthorizableKeystore(intermediatePath, authorizableId)



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

[**KeystoreInformations**](KeystoreInformations.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getKeystore"></a>
# **getKeystore**
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

<a name="getNode"></a>
# **getNode**
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
 - **Accept**: text/plain

<a name="getPackage"></a>
# **getPackage**
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

<a name="getPackageFilter"></a>
# **getPackageFilter**
> &#39;String&#39; getPackageFilter(group, name, version)



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

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuery"></a>
# **getQuery**
> &#39;String&#39; getQuery(path, pLimit, _1Property, _1PropertyValue)



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

let _1Property = "_1Property_example"; // String | 

let _1PropertyValue = "_1PropertyValue_example"; // String | 


apiInstance.getQuery(path, pLimit, _1Property, _1PropertyValue, (error, data, response) => {
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
 **_1Property** | **String**|  | 
 **_1PropertyValue** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTruststore"></a>
# **getTruststore**
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

<a name="getTruststoreInformations"></a>
# **getTruststoreInformations**
> TruststoreInformations getTruststoreInformations()



### Example
```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.SlingApi();

apiInstance.getTruststoreInformations((error, data, response) => {
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

[**TruststoreInformations**](TruststoreInformations.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAgent"></a>
# **postAgent**
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
  'jcrcontentcqdistribute': true, // Boolean | 
  'jcrcontentcqdistributeTypeHint': "jcrcontentcqdistributeTypeHint_example", // String | 
  'jcrcontentcqname': "jcrcontentcqname_example", // String | 
  'jcrcontentcqtemplate': "jcrcontentcqtemplate_example", // String | 
  'jcrcontentenabled': true, // Boolean | 
  'jcrcontentjcrdescription': "jcrcontentjcrdescription_example", // String | 
  'jcrcontentjcrlastModified': "jcrcontentjcrlastModified_example", // String | 
  'jcrcontentjcrlastModifiedBy': "jcrcontentjcrlastModifiedBy_example", // String | 
  'jcrcontentjcrmixinTypes': "jcrcontentjcrmixinTypes_example", // String | 
  'jcrcontentjcrtitle': "jcrcontentjcrtitle_example", // String | 
  'jcrcontentlogLevel': "jcrcontentlogLevel_example", // String | 
  'jcrcontentnoStatusUpdate': true, // Boolean | 
  'jcrcontentnoVersioning': true, // Boolean | 
  'jcrcontentprotocolConnectTimeout': 3.4, // Number | 
  'jcrcontentprotocolHTTPConnectionClosed': true, // Boolean | 
  'jcrcontentprotocolHTTPExpired': "jcrcontentprotocolHTTPExpired_example", // String | 
  'jcrcontentprotocolHTTPHeaders': ["jcrcontentprotocolHTTPHeaders_example"], // [String] | 
  'jcrcontentprotocolHTTPHeadersTypeHint': "jcrcontentprotocolHTTPHeadersTypeHint_example", // String | 
  'jcrcontentprotocolHTTPMethod': "jcrcontentprotocolHTTPMethod_example", // String | 
  'jcrcontentprotocolHTTPSRelaxed': true, // Boolean | 
  'jcrcontentprotocolInterface': "jcrcontentprotocolInterface_example", // String | 
  'jcrcontentprotocolSocketTimeout': 3.4, // Number | 
  'jcrcontentprotocolVersion': "jcrcontentprotocolVersion_example", // String | 
  'jcrcontentproxyNTLMDomain': "jcrcontentproxyNTLMDomain_example", // String | 
  'jcrcontentproxyNTLMHost': "jcrcontentproxyNTLMHost_example", // String | 
  'jcrcontentproxyHost': "jcrcontentproxyHost_example", // String | 
  'jcrcontentproxyPassword': "jcrcontentproxyPassword_example", // String | 
  'jcrcontentproxyPort': 3.4, // Number | 
  'jcrcontentproxyUser': "jcrcontentproxyUser_example", // String | 
  'jcrcontentqueueBatchMaxSize': 3.4, // Number | 
  'jcrcontentqueueBatchMode': "jcrcontentqueueBatchMode_example", // String | 
  'jcrcontentqueueBatchWaitTime': 3.4, // Number | 
  'jcrcontentretryDelay': "jcrcontentretryDelay_example", // String | 
  'jcrcontentreverseReplication': true, // Boolean | 
  'jcrcontentserializationType': "jcrcontentserializationType_example", // String | 
  'jcrcontentslingresourceType': "jcrcontentslingresourceType_example", // String | 
  'jcrcontentssl': "jcrcontentssl_example", // String | 
  'jcrcontenttransportNTLMDomain': "jcrcontenttransportNTLMDomain_example", // String | 
  'jcrcontenttransportNTLMHost': "jcrcontenttransportNTLMHost_example", // String | 
  'jcrcontenttransportPassword': "jcrcontenttransportPassword_example", // String | 
  'jcrcontenttransportUri': "jcrcontenttransportUri_example", // String | 
  'jcrcontenttransportUser': "jcrcontenttransportUser_example", // String | 
  'jcrcontenttriggerDistribute': true, // Boolean | 
  'jcrcontenttriggerModified': true, // Boolean | 
  'jcrcontenttriggerOnOffTime': true, // Boolean | 
  'jcrcontenttriggerReceive': true, // Boolean | 
  'jcrcontenttriggerSpecific': true, // Boolean | 
  'jcrcontentuserId': "jcrcontentuserId_example", // String | 
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
 **jcrcontentcqdistribute** | **Boolean**|  | [optional] 
 **jcrcontentcqdistributeTypeHint** | **String**|  | [optional] 
 **jcrcontentcqname** | **String**|  | [optional] 
 **jcrcontentcqtemplate** | **String**|  | [optional] 
 **jcrcontentenabled** | **Boolean**|  | [optional] 
 **jcrcontentjcrdescription** | **String**|  | [optional] 
 **jcrcontentjcrlastModified** | **String**|  | [optional] 
 **jcrcontentjcrlastModifiedBy** | **String**|  | [optional] 
 **jcrcontentjcrmixinTypes** | **String**|  | [optional] 
 **jcrcontentjcrtitle** | **String**|  | [optional] 
 **jcrcontentlogLevel** | **String**|  | [optional] 
 **jcrcontentnoStatusUpdate** | **Boolean**|  | [optional] 
 **jcrcontentnoVersioning** | **Boolean**|  | [optional] 
 **jcrcontentprotocolConnectTimeout** | **Number**|  | [optional] 
 **jcrcontentprotocolHTTPConnectionClosed** | **Boolean**|  | [optional] 
 **jcrcontentprotocolHTTPExpired** | **String**|  | [optional] 
 **jcrcontentprotocolHTTPHeaders** | [**[String]**](String.md)|  | [optional] 
 **jcrcontentprotocolHTTPHeadersTypeHint** | **String**|  | [optional] 
 **jcrcontentprotocolHTTPMethod** | **String**|  | [optional] 
 **jcrcontentprotocolHTTPSRelaxed** | **Boolean**|  | [optional] 
 **jcrcontentprotocolInterface** | **String**|  | [optional] 
 **jcrcontentprotocolSocketTimeout** | **Number**|  | [optional] 
 **jcrcontentprotocolVersion** | **String**|  | [optional] 
 **jcrcontentproxyNTLMDomain** | **String**|  | [optional] 
 **jcrcontentproxyNTLMHost** | **String**|  | [optional] 
 **jcrcontentproxyHost** | **String**|  | [optional] 
 **jcrcontentproxyPassword** | **String**|  | [optional] 
 **jcrcontentproxyPort** | **Number**|  | [optional] 
 **jcrcontentproxyUser** | **String**|  | [optional] 
 **jcrcontentqueueBatchMaxSize** | **Number**|  | [optional] 
 **jcrcontentqueueBatchMode** | **String**|  | [optional] 
 **jcrcontentqueueBatchWaitTime** | **Number**|  | [optional] 
 **jcrcontentretryDelay** | **String**|  | [optional] 
 **jcrcontentreverseReplication** | **Boolean**|  | [optional] 
 **jcrcontentserializationType** | **String**|  | [optional] 
 **jcrcontentslingresourceType** | **String**|  | [optional] 
 **jcrcontentssl** | **String**|  | [optional] 
 **jcrcontenttransportNTLMDomain** | **String**|  | [optional] 
 **jcrcontenttransportNTLMHost** | **String**|  | [optional] 
 **jcrcontenttransportPassword** | **String**|  | [optional] 
 **jcrcontenttransportUri** | **String**|  | [optional] 
 **jcrcontenttransportUser** | **String**|  | [optional] 
 **jcrcontenttriggerDistribute** | **Boolean**|  | [optional] 
 **jcrcontenttriggerModified** | **Boolean**|  | [optional] 
 **jcrcontenttriggerOnOffTime** | **Boolean**|  | [optional] 
 **jcrcontenttriggerReceive** | **Boolean**|  | [optional] 
 **jcrcontenttriggerSpecific** | **Boolean**|  | [optional] 
 **jcrcontentuserId** | **String**|  | [optional] 
 **jcrprimaryType** | **String**|  | [optional] 
 **operation** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postAuthorizableKeystore"></a>
# **postAuthorizableKeystore**
> KeystoreInformations postAuthorizableKeystore(intermediatePath, authorizableId, opts)



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
  'operation2': "operation_example", // String | 
  'alias': "alias_example", // String | 
  'newAlias': "newAlias_example", // String | 
  'removeAlias': "removeAlias_example", // String | 
  'certChain': "/path/to/file.txt", // File | 
  'pk': "/path/to/file.txt", // File | 
  'keyStore': "/path/to/file.txt" // File | 
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
 **operation2** | **String**|  | [optional] 
 **alias** | **String**|  | [optional] 
 **newAlias** | **String**|  | [optional] 
 **removeAlias** | **String**|  | [optional] 
 **certChain** | **File**|  | [optional] 
 **pk** | **File**|  | [optional] 
 **keyStore** | **File**|  | [optional] 

### Return type

[**KeystoreInformations**](KeystoreInformations.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> &#39;String&#39; postAuthorizables(authorizableId, intermediatePath, opts)



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
  'profilegivenName': "profilegivenName_example" // String | 
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
 **profilegivenName** | **String**|  | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
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
  'defaultGroups': ["defaultGroups_example"], // [String] | 
  'defaultGroupsTypeHint': "defaultGroupsTypeHint_example", // String | 
  'idpCertAlias': "idpCertAlias_example", // String | 
  'idpCertAliasTypeHint': "idpCertAliasTypeHint_example", // String | 
  'addGroupMemberships': true, // Boolean | 
  'addGroupMembershipsTypeHint': "addGroupMembershipsTypeHint_example", // String | 
  'path': ["path_example"], // [String] | 
  'pathTypeHint': "pathTypeHint_example", // String | 
  'synchronizeAttributes': ["synchronizeAttributes_example"], // [String] | 
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
 - **Accept**: text/plain

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(runmode, opts)



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

apiInstance.postConfigApacheFelixJettyBasedHttpService(runmode, opts, (error, data, response) => {
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
 - **Accept**: text/plain

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(runmode, opts)



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

let opts = { 
  'alias': "alias_example", // String | 
  'aliasTypeHint': "aliasTypeHint_example", // String | 
  'davCreateAbsoluteUri': true, // Boolean | 
  'davCreateAbsoluteUriTypeHint': "davCreateAbsoluteUriTypeHint_example" // String | 
};

apiInstance.postConfigApacheSlingDavExServlet(runmode, opts, (error, data, response) => {
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
 - **Accept**: text/plain

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(runmode, opts)



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

apiInstance.postConfigApacheSlingGetServlet(runmode, opts, (error, data, response) => {
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
 - **Accept**: text/plain

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(runmode, opts)



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

apiInstance.postConfigApacheSlingReferrerFilter(runmode, opts, (error, data, response) => {
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
 - **Accept**: text/plain

<a name="postNode"></a>
# **postNode**
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
  'file': "/path/to/file.txt" // File | 
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
 - **Accept**: text/plain

<a name="postNodeRw"></a>
# **postNodeRw**
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
 - **Accept**: text/plain

<a name="postPath"></a>
# **postPath**
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
 - **Accept**: text/plain

<a name="postQuery"></a>
# **postQuery**
> &#39;String&#39; postQuery(path, pLimit, _1Property, _1PropertyValue)



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

let _1Property = "_1Property_example"; // String | 

let _1PropertyValue = "_1PropertyValue_example"; // String | 


apiInstance.postQuery(path, pLimit, _1Property, _1PropertyValue, (error, data, response) => {
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
 **_1Property** | **String**|  | 
 **_1PropertyValue** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTreeActivation"></a>
# **postTreeActivation**
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
 - **Accept**: text/plain

<a name="postTruststore"></a>
# **postTruststore**
> &#39;String&#39; postTruststore(opts)



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
  'certificate': "/path/to/file.txt" // File | 
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

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
> &#39;String&#39; postTruststorePKCS12(opts)



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
  'truststoreP12': "/path/to/file.txt" // File | 
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

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

