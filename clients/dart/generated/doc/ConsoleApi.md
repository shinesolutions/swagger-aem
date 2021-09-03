# openapi.api.ConsoleApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleApi.md#getbundleinfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleApi.md#getconfigmgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postbundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **getAemProductInfo**
> List<String> getAemProductInfo()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = ConsoleApi();

try { 
    final result = api_instance.getAemProductInfo();
    print(result);
} catch (e) {
    print('Exception when calling ConsoleApi->getAemProductInfo: $e\n');
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

# **getBundleInfo**
> BundleInfo getBundleInfo(name)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = ConsoleApi();
final name = name_example; // String | 

try { 
    final result = api_instance.getBundleInfo(name);
    print(result);
} catch (e) {
    print('Exception when calling ConsoleApi->getBundleInfo: $e\n');
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getConfigMgr**
> String getConfigMgr()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = ConsoleApi();

try { 
    final result = api_instance.getConfigMgr();
    print(result);
} catch (e) {
    print('Exception when calling ConsoleApi->getConfigMgr: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = ConsoleApi();
final name = name_example; // String | 
final action = action_example; // String | 

try { 
    api_instance.postBundle(name, action);
} catch (e) {
    print('Exception when calling ConsoleApi->postBundle: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = ConsoleApi();
final action = action_example; // String | 

try { 
    api_instance.postJmxRepository(action);
} catch (e) {
    print('Exception when calling ConsoleApi->postJmxRepository: $e\n');
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
> SamlConfigurationInfo postSamlConfiguration(post, apply, delete, action, dollarLocation, path, servicePeriodRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = ConsoleApi();
final post = true; // bool | 
final apply = true; // bool | 
final delete = true; // bool | 
final action = action_example; // String | 
final dollarLocation = dollarLocation_example; // String | 
final path = []; // List<String> | 
final servicePeriodRanking = 56; // int | 
final idpUrl = idpUrl_example; // String | 
final idpCertAlias = idpCertAlias_example; // String | 
final idpHttpRedirect = true; // bool | 
final serviceProviderEntityId = serviceProviderEntityId_example; // String | 
final assertionConsumerServiceURL = assertionConsumerServiceURL_example; // String | 
final spPrivateKeyAlias = spPrivateKeyAlias_example; // String | 
final keyStorePassword = keyStorePassword_example; // String | 
final defaultRedirectUrl = defaultRedirectUrl_example; // String | 
final userIDAttribute = userIDAttribute_example; // String | 
final useEncryption = true; // bool | 
final createUser = true; // bool | 
final addGroupMemberships = true; // bool | 
final groupMembershipAttribute = groupMembershipAttribute_example; // String | 
final defaultGroups = []; // List<String> | 
final nameIdFormat = nameIdFormat_example; // String | 
final synchronizeAttributes = []; // List<String> | 
final handleLogout = true; // bool | 
final logoutUrl = logoutUrl_example; // String | 
final clockTolerance = 56; // int | 
final digestMethod = digestMethod_example; // String | 
final signatureMethod = signatureMethod_example; // String | 
final userIntermediatePath = userIntermediatePath_example; // String | 
final propertylist = []; // List<String> | 

try { 
    final result = api_instance.postSamlConfiguration(post, apply, delete, action, dollarLocation, path, servicePeriodRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
    print(result);
} catch (e) {
    print('Exception when calling ConsoleApi->postSamlConfiguration: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **bool**|  | [optional] 
 **apply** | **bool**|  | [optional] 
 **delete** | **bool**|  | [optional] 
 **action** | **String**|  | [optional] 
 **dollarLocation** | **String**|  | [optional] 
 **path** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **servicePeriodRanking** | **int**|  | [optional] 
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
 **defaultGroups** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **nameIdFormat** | **String**|  | [optional] 
 **synchronizeAttributes** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **handleLogout** | **bool**|  | [optional] 
 **logoutUrl** | **String**|  | [optional] 
 **clockTolerance** | **int**|  | [optional] 
 **digestMethod** | **String**|  | [optional] 
 **signatureMethod** | **String**|  | [optional] 
 **userIntermediatePath** | **String**|  | [optional] 
 **propertylist** | [**List<String>**](String.md)|  | [optional] [default to const []]

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

