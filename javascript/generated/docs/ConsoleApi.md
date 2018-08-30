# NodeSwaggerAem.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


<a name="postBundle"></a>
# **postBundle**
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
 - **Accept**: text/plain

<a name="postJmxRepository"></a>
# **postJmxRepository**
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
 - **Accept**: text/plain

<a name="postSamlConfiguration"></a>
# **postSamlConfiguration**
> SamlConfigurationInformations postSamlConfiguration(opts)



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
  'path': ["path_example"], // [String] | 
  'serviceRanking': "serviceRanking_example", // String | 
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
  'defaultGroups': ["defaultGroups_example"], // [String] | 
  'nameIdFormat': "nameIdFormat_example", // String | 
  'synchronizeAttributes': ["synchronizeAttributes_example"], // [String] | 
  'handleLogout': true, // Boolean | 
  'logoutUrl': "logoutUrl_example", // String | 
  'clockTolerance': "clockTolerance_example", // String | 
  'digestMethod': "digestMethod_example", // String | 
  'signatureMethod': "signatureMethod_example", // String | 
  'userIntermediatePath': "userIntermediatePath_example", // String | 
  'propertylist': ["propertylist_example"] // [String] | 
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
 **serviceRanking** | **String**|  | [optional] 
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
 **clockTolerance** | **String**|  | [optional] 
 **digestMethod** | **String**|  | [optional] 
 **signatureMethod** | **String**|  | [optional] 
 **userIntermediatePath** | **String**|  | [optional] 
 **propertylist** | [**[String]**](String.md)|  | [optional] 

### Return type

[**SamlConfigurationInformations**](SamlConfigurationInformations.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

