# openapi.api.ConsoleApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **getAemProductInfo**
> List<String> getAemProductInfo()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new ConsoleApi();

try { 
    var result = api_instance.getAemProductInfo();
    print(result);
} catch (e) {
    print("Exception when calling ConsoleApi->getAemProductInfo: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<String>**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getConfigMgr**
> String getConfigMgr()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new ConsoleApi();

try { 
    var result = api_instance.getConfigMgr();
    print(result);
} catch (e) {
    print("Exception when calling ConsoleApi->getConfigMgr: $e\n");
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postBundle**
> postBundle(name, action)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new ConsoleApi();
var name = name_example; // String | 
var action = action_example; // String | 

try { 
    api_instance.postBundle(name, action);
} catch (e) {
    print("Exception when calling ConsoleApi->postBundle: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | 
 **action** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postJmxRepository**
> postJmxRepository(action)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new ConsoleApi();
var action = action_example; // String | 

try { 
    api_instance.postJmxRepository(action);
} catch (e) {
    print("Exception when calling ConsoleApi->postJmxRepository: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSamlConfiguration**
> SamlConfigurationInfo postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new ConsoleApi();
var post = true; // bool | 
var apply = true; // bool | 
var delete = true; // bool | 
var action = action_example; // String | 
var $location = $location_example; // String | 
var path = []; // List<String> | 
var serviceRanking = 56; // int | 
var idpUrl = idpUrl_example; // String | 
var idpCertAlias = idpCertAlias_example; // String | 
var idpHttpRedirect = true; // bool | 
var serviceProviderEntityId = serviceProviderEntityId_example; // String | 
var assertionConsumerServiceURL = assertionConsumerServiceURL_example; // String | 
var spPrivateKeyAlias = spPrivateKeyAlias_example; // String | 
var keyStorePassword = keyStorePassword_example; // String | 
var defaultRedirectUrl = defaultRedirectUrl_example; // String | 
var userIDAttribute = userIDAttribute_example; // String | 
var useEncryption = true; // bool | 
var createUser = true; // bool | 
var addGroupMemberships = true; // bool | 
var groupMembershipAttribute = groupMembershipAttribute_example; // String | 
var defaultGroups = []; // List<String> | 
var nameIdFormat = nameIdFormat_example; // String | 
var synchronizeAttributes = []; // List<String> | 
var handleLogout = true; // bool | 
var logoutUrl = logoutUrl_example; // String | 
var clockTolerance = 56; // int | 
var digestMethod = digestMethod_example; // String | 
var signatureMethod = signatureMethod_example; // String | 
var userIntermediatePath = userIntermediatePath_example; // String | 
var propertylist = []; // List<String> | 

try { 
    var result = api_instance.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
    print(result);
} catch (e) {
    print("Exception when calling ConsoleApi->postSamlConfiguration: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **bool**|  | [optional] 
 **apply** | **bool**|  | [optional] 
 **delete** | **bool**|  | [optional] 
 **action** | **String**|  | [optional] 
 **$location** | **String**|  | [optional] 
 **path** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **serviceRanking** | **int**|  | [optional] 
 **idpUrl** | **String**|  | [optional] 
 **idpCertAlias** | **String**|  | [optional] 
 **idpHttpRedirect** | **bool**|  | [optional] 
 **serviceProviderEntityId** | **String**|  | [optional] 
 **assertionConsumerServiceURL** | **String**|  | [optional] 
 **spPrivateKeyAlias** | **String**|  | [optional] 
 **keyStorePassword** | **String**|  | [optional] 
 **defaultRedirectUrl** | **String**|  | [optional] 
 **userIDAttribute** | **String**|  | [optional] 
 **useEncryption** | **bool**|  | [optional] 
 **createUser** | **bool**|  | [optional] 
 **addGroupMemberships** | **bool**|  | [optional] 
 **groupMembershipAttribute** | **String**|  | [optional] 
 **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **nameIdFormat** | **String**|  | [optional] 
 **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **handleLogout** | **bool**|  | [optional] 
 **logoutUrl** | **String**|  | [optional] 
 **clockTolerance** | **int**|  | [optional] 
 **digestMethod** | **String**|  | [optional] 
 **signatureMethod** | **String**|  | [optional] 
 **userIntermediatePath** | **String**|  | [optional] 
 **propertylist** | [**List&lt;String&gt;**](String.md)|  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

