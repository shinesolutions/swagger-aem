# openapi.api.CustomApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getaemhealthcheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **getAemHealthCheck**
> String getAemHealthCheck(tags, combineTagsOr)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = CustomApi();
final tags = tags_example; // String | 
final combineTagsOr = true; // bool | 

try { 
    final result = api_instance.getAemHealthCheck(tags, combineTagsOr);
    print(result);
} catch (e) {
    print('Exception when calling CustomApi->getAemHealthCheck: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **String**|  | [optional] 
 **combineTagsOr** | **bool**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet(bundlesPeriodIgnored, bundlesPeriodIgnoredAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = CustomApi();
final bundlesPeriodIgnored = []; // List<String> | 
final bundlesPeriodIgnoredAtTypeHint = bundlesPeriodIgnoredAtTypeHint_example; // String | 

try { 
    api_instance.postConfigAemHealthCheckServlet(bundlesPeriodIgnored, bundlesPeriodIgnoredAtTypeHint);
} catch (e) {
    print('Exception when calling CustomApi->postConfigAemHealthCheckServlet: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesPeriodIgnored** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **bundlesPeriodIgnoredAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(pwdresetPeriodAuthorizables, pwdresetPeriodAuthorizablesAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = CustomApi();
final pwdresetPeriodAuthorizables = []; // List<String> | 
final pwdresetPeriodAuthorizablesAtTypeHint = pwdresetPeriodAuthorizablesAtTypeHint_example; // String | 

try { 
    api_instance.postConfigAemPasswordReset(pwdresetPeriodAuthorizables, pwdresetPeriodAuthorizablesAtTypeHint);
} catch (e) {
    print('Exception when calling CustomApi->postConfigAemPasswordReset: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetPeriodAuthorizables** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **pwdresetPeriodAuthorizablesAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

