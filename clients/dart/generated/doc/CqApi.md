# openapi.api.CqApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](CqApi.md#getloginpage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](CqApi.md#postcqactions) | **POST** /.cqactions.html | 


# **getLoginPage**
> String getLoginPage()



### Example 
```dart
import 'package:openapi/api.dart';

final api_instance = CqApi();

try { 
    final result = api_instance.getLoginPage();
    print(result);
} catch (e) {
    print('Exception when calling CqApi->getLoginPage: $e\n');
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postCqActions**
> postCqActions(authorizableId, changelog)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = CqApi();
final authorizableId = authorizableId_example; // String | 
final changelog = changelog_example; // String | 

try { 
    api_instance.postCqActions(authorizableId, changelog);
} catch (e) {
    print('Exception when calling CqApi->postCqActions: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  | 
 **changelog** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

