# NodeSwaggerAem.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 



## getAemProductInfo

> [String] getAemProductInfo()



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();
apiInstance.getAemProductInfo((error, data, response) => {
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

**[String]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBundleInfo

> BundleInfo getBundleInfo(name)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();
let name = "name_example"; // String | 
apiInstance.getBundleInfo(name, (error, data, response) => {
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
 **name** | **String**|  | 

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConfigMgr

> String getConfigMgr()



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();
apiInstance.getConfigMgr((error, data, response) => {
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

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml


## postBundle

> postBundle(name, action)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();
let name = "name_example"; // String | 
let action = "action_example"; // String | 
apiInstance.postBundle(name, action, (error, data, response) => {
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
 **name** | **String**|  | 
 **action** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postJmxRepository

> postJmxRepository(action)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();
let action = "action_example"; // String | 
apiInstance.postJmxRepository(action, (error, data, response) => {
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
 **action** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postSamlConfiguration

> SamlConfigurationInfo postSamlConfiguration(opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();
let opts = {
  'post': true, // Boolean | 
  'apply': true, // Boolean | 
  '_delete': true, // Boolean | 
  'action': "action_example", // String | 
  'location': "location_example", // String | 
  'path': ["null"], // [String] | 
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
  'defaultGroups': ["null"], // [String] | 
  'nameIdFormat': "nameIdFormat_example", // String | 
  'synchronizeAttributes': ["null"], // [String] | 
  'handleLogout': true, // Boolean | 
  'logoutUrl': "logoutUrl_example", // String | 
  'clockTolerance': 56, // Number | 
  'digestMethod': "digestMethod_example", // String | 
  'signatureMethod': "signatureMethod_example", // String | 
  'userIntermediatePath': "userIntermediatePath_example", // String | 
  'propertylist': ["null"] // [String] | 
};
apiInstance.postSamlConfiguration(opts, (error, data, response) => {
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

