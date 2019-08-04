# openapi.api.CustomApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **getAemHealthCheck**
> String getAemHealthCheck(tags, combineTagsOr)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CustomApi();
var tags = tags_example; // String | 
var combineTagsOr = true; // bool | 

try { 
    var result = api_instance.getAemHealthCheck(tags, combineTagsOr);
    print(result);
} catch (e) {
    print("Exception when calling CustomApi->getAemHealthCheck: $e\n");
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
> postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnored@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CustomApi();
var bundlesIgnored = []; // List<String> | 
var bundlesIgnored@TypeHint = bundlesIgnored@TypeHint_example; // String | 

try { 
    api_instance.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnored@TypeHint);
} catch (e) {
    print("Exception when calling CustomApi->postConfigAemHealthCheckServlet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **bundlesIgnored@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizables@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CustomApi();
var pwdresetAuthorizables = []; // List<String> | 
var pwdresetAuthorizables@TypeHint = pwdresetAuthorizables@TypeHint_example; // String | 

try { 
    api_instance.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizables@TypeHint);
} catch (e) {
    print("Exception when calling CustomApi->postConfigAemPasswordReset: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **pwdresetAuthorizables@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

