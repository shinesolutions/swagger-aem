# NodeSwaggerAem.SlingApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfig**](SlingApi.md#postConfig) | **POST** /apps/system/config.{runmode}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(runmode, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

<a name="getNode"></a>
# **getNode**
> getNode(path, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

<a name="getPackage"></a>
# **getPackage**
> File getPackage(group, name, version)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
> &#39;String&#39; getPackageFilter(group, name, version)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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

**&#39;String&#39;**

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
var defaultClient = NodeSwaggerAem.ApiClient.default;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var name = "name_example"; // String | 

var opts = { 
  'jcrprimaryType': "jcrprimaryType_example", // String | 
  'jcrcontentcqname': "jcrcontentcqname_example", // String | 
  'jcrcontentjcrtitle': "jcrcontentjcrtitle_example", // String | 
  'jcrcontentjcrdescription': "jcrcontentjcrdescription_example", // String | 
  'jcrcontentslingresourceType': "jcrcontentslingresourceType_example", // String | 
  'jcrcontenttransportUri': "jcrcontenttransportUri_example", // String | 
  'jcrcontenttransportUser': "jcrcontenttransportUser_example", // String | 
  'jcrcontenttransportPassword': "jcrcontenttransportPassword_example", // String | 
  'jcrcontentlogLevel': "jcrcontentlogLevel_example", // String | 
  'jcrcontentnoVersioning': true, // Boolean | 
  'jcrcontentprotocolHTTPHeaders': ["jcrcontentprotocolHTTPHeaders_example"], // [String] | 
  'jcrcontentprotocolHTTPHeadersTypeHint': "jcrcontentprotocolHTTPHeadersTypeHint_example", // String | 
  'jcrcontentprotocolHTTPMethod': "jcrcontentprotocolHTTPMethod_example", // String | 
  'jcrcontentretryDelay': "jcrcontentretryDelay_example", // String | 
  'jcrcontentserializationType': "jcrcontentserializationType_example", // String | 
  'jcrcontentjcrmixinTypes': "jcrcontentjcrmixinTypes_example", // String | 
  'jcrcontenttriggerReceive': true, // Boolean | 
  'jcrcontenttriggerSpecific': true, // Boolean | 
  'jcrcontentcqtemplate': "jcrcontentcqtemplate_example", // String | 
  'jcrcontentenabled': true, // Boolean | 
  'jcrcontentreverseReplication': true, // Boolean | 
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
 **jcrprimaryType** | **String**|  | [optional] 
 **jcrcontentcqname** | **String**|  | [optional] 
 **jcrcontentjcrtitle** | **String**|  | [optional] 
 **jcrcontentjcrdescription** | **String**|  | [optional] 
 **jcrcontentslingresourceType** | **String**|  | [optional] 
 **jcrcontenttransportUri** | **String**|  | [optional] 
 **jcrcontenttransportUser** | **String**|  | [optional] 
 **jcrcontenttransportPassword** | **String**|  | [optional] 
 **jcrcontentlogLevel** | **String**|  | [optional] 
 **jcrcontentnoVersioning** | **Boolean**|  | [optional] 
 **jcrcontentprotocolHTTPHeaders** | [**[String]**](String.md)|  | [optional] 
 **jcrcontentprotocolHTTPHeadersTypeHint** | **String**|  | [optional] 
 **jcrcontentprotocolHTTPMethod** | **String**|  | [optional] 
 **jcrcontentretryDelay** | **String**|  | [optional] 
 **jcrcontentserializationType** | **String**|  | [optional] 
 **jcrcontentjcrmixinTypes** | **String**|  | [optional] 
 **jcrcontenttriggerReceive** | **Boolean**|  | [optional] 
 **jcrcontenttriggerSpecific** | **Boolean**|  | [optional] 
 **jcrcontentcqtemplate** | **String**|  | [optional] 
 **jcrcontentenabled** | **Boolean**|  | [optional] 
 **jcrcontentreverseReplication** | **Boolean**|  | [optional] 
 **operation** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> &#39;String&#39; postAuthorizables(authorizableId, intermediatePath, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postConfig"></a>
# **postConfig**
> postConfig(runmode, name, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var name = "name_example"; // String | 

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
  'orgApacheFelixHttpsEnable': "orgApacheFelixHttpsEnable_example", // String | 
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
apiInstance.postConfig(runmode, name, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
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
 **orgApacheFelixHttpsEnable** | **String**|  | [optional] 
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

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

<a name="postPath"></a>
# **postPath**
> postPath(path, jcrprimaryType, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

<a name="postQuery"></a>
# **postQuery**
> &#39;String&#39; postQuery(path, pLimit, _1Property, _1PropertyValue)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var path = "path_example"; // String | 

var pLimit = 3.4; // Number | 

var _1Property = "_1Property_example"; // String | 

var _1PropertyValue = "_1PropertyValue_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postQuery(path, pLimit, _1Property, _1PropertyValue, callback);
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
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

