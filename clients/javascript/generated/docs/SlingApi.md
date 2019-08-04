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
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var runmode = "runmode_example"; // String | 
var name = "name_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAgent(runmode, name, callback);
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

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var path = "path_example"; // String | 
var name = "name_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteNode(path, name, callback);
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

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var runmode = "runmode_example"; // String | 
var name = "name_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.getAgent(runmode, name, callback);
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

<a name="getAgents"></a>
# **getAgents**
> String getAgents(runmode)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var runmode = "runmode_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAgents(runmode, callback);
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

<a name="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var intermediatePath = "intermediatePath_example"; // String | 
var authorizableId = "authorizableId_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAuthorizableKeystore(intermediatePath, authorizableId, callback);
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

<a name="getKeystore"></a>
# **getKeystore**
> File getKeystore(intermediatePath, authorizableId)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var intermediatePath = "intermediatePath_example"; // String | 
var authorizableId = "authorizableId_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getKeystore(intermediatePath, authorizableId, callback);
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
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var path = "path_example"; // String | 
var name = "name_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.getNode(path, name, callback);
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

<a name="getPackage"></a>
# **getPackage**
> File getPackage(group, name, version)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var group = "group_example"; // String | 
var name = "name_example"; // String | 
var version = "version_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPackage(group, name, version, callback);
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
> String getPackageFilter(group, name, version)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var group = "group_example"; // String | 
var name = "name_example"; // String | 
var version = "version_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPackageFilter(group, name, version, callback);
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

<a name="getQuery"></a>
# **getQuery**
> String getQuery(path, pLimit, _1property, _1propertyValue)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var path = "path_example"; // String | 
var pLimit = 3.4; // Number | 
var _1property = "_1property_example"; // String | 
var _1propertyValue = "_1propertyValue_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuery(path, pLimit, _1property, _1propertyValue, callback);
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

<a name="getTruststore"></a>
# **getTruststore**
> File getTruststore()



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTruststore(callback);
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

<a name="getTruststoreInfo"></a>
# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTruststoreInfo(callback);
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

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var runmode = "runmode_example"; // String | 
var name = "name_example"; // String | 
var opts = {
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
  'jcrcontentprotocolHTTPHeaders': ["inner_example"], // [String] | 
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
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postAgent(runmode, name, opts, callback);
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
 - **Accept**: Not defined

<a name="postAuthorizableKeystore"></a>
# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var intermediatePath = "intermediatePath_example"; // String | 
var authorizableId = "authorizableId_example"; // String | 
var opts = {
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
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAuthorizableKeystore(intermediatePath, authorizableId, opts, callback);
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

<a name="postAuthorizables"></a>
# **postAuthorizables**
> String postAuthorizables(authorizableId, intermediatePath, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var authorizableId = "authorizableId_example"; // String | 
var intermediatePath = "intermediatePath_example"; // String | 
var opts = {
  'createUser': "createUser_example", // String | 
  'createGroup': "createGroup_example", // String | 
  'reppassword': "reppassword_example", // String | 
  'profilegivenName': "profilegivenName_example" // String | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAuthorizables(authorizableId, intermediatePath, opts, callback);
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

**String**

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
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
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
  'defaultGroups': ["inner_example"], // [String] | 
  'defaultGroupsTypeHint': "defaultGroupsTypeHint_example", // String | 
  'idpCertAlias': "idpCertAlias_example", // String | 
  'idpCertAliasTypeHint': "idpCertAliasTypeHint_example", // String | 
  'addGroupMemberships': true, // Boolean | 
  'addGroupMembershipsTypeHint': "addGroupMembershipsTypeHint_example", // String | 
  'path': ["inner_example"], // [String] | 
  'pathTypeHint': "pathTypeHint_example", // String | 
  'synchronizeAttributes': ["inner_example"], // [String] | 
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
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(opts, callback);
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

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
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
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheFelixJettyBasedHttpService(opts, callback);
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

<a name="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
  'proxyHost': "proxyHost_example", // String | 
  'proxyHostTypeHint': "proxyHostTypeHint_example", // String | 
  'proxyPort': 56, // Number | 
  'proxyPortTypeHint': "proxyPortTypeHint_example", // String | 
  'proxyExceptions': ["inner_example"], // [String] | 
  'proxyExceptionsTypeHint': "proxyExceptionsTypeHint_example", // String | 
  'proxyEnabled': true, // Boolean | 
  'proxyEnabledTypeHint': "proxyEnabledTypeHint_example", // String | 
  'proxyUser': "proxyUser_example", // String | 
  'proxyUserTypeHint': "proxyUserTypeHint_example", // String | 
  'proxyPassword': "proxyPassword_example", // String | 
  'proxyPasswordTypeHint': "proxyPasswordTypeHint_example" // String | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheHttpComponentsProxyConfiguration(opts, callback);
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

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
  'alias': "alias_example", // String | 
  'aliasTypeHint': "aliasTypeHint_example", // String | 
  'davCreateAbsoluteUri': true, // Boolean | 
  'davCreateAbsoluteUriTypeHint': "davCreateAbsoluteUriTypeHint_example" // String | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheSlingDavExServlet(opts, callback);
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

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
  'jsonMaximumresults': "jsonMaximumresults_example", // String | 
  'jsonMaximumresultsTypeHint': "jsonMaximumresultsTypeHint_example", // String | 
  'enableHtml': true, // Boolean | 
  'enableHtmlTypeHint': "enableHtmlTypeHint_example", // String | 
  'enableTxt': true, // Boolean | 
  'enableTxtTypeHint': "enableTxtTypeHint_example", // String | 
  'enableXml': true, // Boolean | 
  'enableXmlTypeHint': "enableXmlTypeHint_example" // String | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheSlingGetServlet(opts, callback);
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

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
  'allowEmpty': true, // Boolean | 
  'allowEmptyTypeHint': "allowEmptyTypeHint_example", // String | 
  'allowHosts': "allowHosts_example", // String | 
  'allowHostsTypeHint': "allowHostsTypeHint_example", // String | 
  'allowHostsRegexp': "allowHostsRegexp_example", // String | 
  'allowHostsRegexpTypeHint': "allowHostsRegexpTypeHint_example", // String | 
  'filterMethods': "filterMethods_example", // String | 
  'filterMethodsTypeHint': "filterMethodsTypeHint_example" // String | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheSlingReferrerFilter(opts, callback);
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

<a name="postNode"></a>
# **postNode**
> postNode(path, name, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var path = "path_example"; // String | 
var name = "name_example"; // String | 
var opts = {
  'operation': "operation_example", // String | 
  'deleteAuthorizable': "deleteAuthorizable_example", // String | 
  'file': "/path/to/file" // File | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postNode(path, name, opts, callback);
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

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var path = "path_example"; // String | 
var name = "name_example"; // String | 
var opts = {
  'addMembers': "addMembers_example" // String | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postNodeRw(path, name, opts, callback);
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

<a name="postPath"></a>
# **postPath**
> postPath(path, jcrprimaryType, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var path = "path_example"; // String | 
var jcrprimaryType = "jcrprimaryType_example"; // String | 
var name = "name_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postPath(path, jcrprimaryType, name, callback);
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

<a name="postQuery"></a>
# **postQuery**
> String postQuery(path, pLimit, _1property, _1propertyValue)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var path = "path_example"; // String | 
var pLimit = 3.4; // Number | 
var _1property = "_1property_example"; // String | 
var _1propertyValue = "_1propertyValue_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postQuery(path, pLimit, _1property, _1propertyValue, callback);
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

<a name="postTreeActivation"></a>
# **postTreeActivation**
> postTreeActivation(ignoredeactivated, onlymodified, path)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var ignoredeactivated = true; // Boolean | 
var onlymodified = true; // Boolean | 
var path = "path_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path, callback);
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

<a name="postTruststore"></a>
# **postTruststore**
> String postTruststore(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
  'operation': "operation_example", // String | 
  'newPassword': "newPassword_example", // String | 
  'rePassword': "rePassword_example", // String | 
  'keyStoreType': "keyStoreType_example", // String | 
  'removeAlias': "removeAlias_example", // String | 
  'certificate': "/path/to/file" // File | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTruststore(opts, callback);
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

<a name="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
> String postTruststorePKCS12(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();
var opts = {
  'truststoreP12': "/path/to/file" // File | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTruststorePKCS12(opts, callback);
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

