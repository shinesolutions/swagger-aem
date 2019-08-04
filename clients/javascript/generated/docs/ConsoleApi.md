# NodeSwaggerAem.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


<a name="getAemProductInfo"></a>
# **getAemProductInfo**
> [String] getAemProductInfo()



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.ConsoleApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAemProductInfo(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**[String]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConfigMgr"></a>
# **getConfigMgr**
> String getConfigMgr()



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.ConsoleApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getConfigMgr(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

<a name="postBundle"></a>
# **postBundle**
> postBundle(name, action)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.ConsoleApi();
var name = "name_example"; // String | 
var action = "action_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postBundle(name, action, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | 
 **action** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postJmxRepository"></a>
# **postJmxRepository**
> postJmxRepository(action)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.ConsoleApi();
var action = "action_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postJmxRepository(action, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postSamlConfiguration"></a>
# **postSamlConfiguration**
> SamlConfigurationInfo postSamlConfiguration(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.ConsoleApi();
var opts = {
  'post': true, // Boolean | 
  'apply': true, // Boolean | 
  '_delete': true, // Boolean | 
  'action': "action_example", // String | 
  'location': "location_example", // String | 
  'path': ["inner_example"], // [String] | 
  'serviceRanking': 56, // Number | 
  'idpUrl': "idpUrl_example", // String | 
  'idpCertAlias': "idpCertAlias_example", // String | 
  'idpHttpRedirect': true, // Boolean | 
  'serviceProviderEntityId': "serviceProviderEntityId_example", // String | 
  'assertionConsumerServiceURL': "assertionConsumerServiceURL_example", // String | 
  'spPrivateKeyAlias': "spPrivateKeyAlias_example", // String | 
  'keyStorePassword': "keyStorePassword_example", // String | 
  'defaultRedirectUrl': "defaultRedirectUrl_example", // String | 
  'userIDAttribute': "userIDAttribute_example", // String | 
  'useEncryption': true, // Boolean | 
  'createUser': true, // Boolean | 
  'addGroupMemberships': true, // Boolean | 
  'groupMembershipAttribute': "groupMembershipAttribute_example", // String | 
  'defaultGroups': ["inner_example"], // [String] | 
  'nameIdFormat': "nameIdFormat_example", // String | 
  'synchronizeAttributes': ["inner_example"], // [String] | 
  'handleLogout': true, // Boolean | 
  'logoutUrl': "logoutUrl_example", // String | 
  'clockTolerance': 56, // Number | 
  'digestMethod': "digestMethod_example", // String | 
  'signatureMethod': "signatureMethod_example", // String | 
  'userIntermediatePath': "userIntermediatePath_example", // String | 
  'propertylist': ["inner_example"] // [String] | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSamlConfiguration(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **Boolean**|  | [optional] 
 **apply** | **Boolean**|  | [optional] 
 **_delete** | **Boolean**|  | [optional] 
 **action** | **String**|  | [optional] 
 **location** | **String**|  | [optional] 
 **path** | [**[String]**](String.md)|  | [optional] 
 **serviceRanking** | **Number**|  | [optional] 
 **idpUrl** | **String**|  | [optional] 
 **idpCertAlias** | **String**|  | [optional] 
 **idpHttpRedirect** | **Boolean**|  | [optional] 
 **serviceProviderEntityId** | **String**|  | [optional] 
 **assertionConsumerServiceURL** | **String**|  | [optional] 
 **spPrivateKeyAlias** | **String**|  | [optional] 
 **keyStorePassword** | **String**|  | [optional] 
 **defaultRedirectUrl** | **String**|  | [optional] 
 **userIDAttribute** | **String**|  | [optional] 
 **useEncryption** | **Boolean**|  | [optional] 
 **createUser** | **Boolean**|  | [optional] 
 **addGroupMemberships** | **Boolean**|  | [optional] 
 **groupMembershipAttribute** | **String**|  | [optional] 
 **defaultGroups** | [**[String]**](String.md)|  | [optional] 
 **nameIdFormat** | **String**|  | [optional] 
 **synchronizeAttributes** | [**[String]**](String.md)|  | [optional] 
 **handleLogout** | **Boolean**|  | [optional] 
 **logoutUrl** | **String**|  | [optional] 
 **clockTolerance** | **Number**|  | [optional] 
 **digestMethod** | **String**|  | [optional] 
 **signatureMethod** | **String**|  | [optional] 
 **userIntermediatePath** | **String**|  | [optional] 
 **propertylist** | [**[String]**](String.md)|  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

