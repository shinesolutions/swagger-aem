# openapi.api.CrxApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **getCrxdeStatus**
> String getCrxdeStatus()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CrxApi();

try { 
    var result = api_instance.getCrxdeStatus();
    print(result);
} catch (e) {
    print("Exception when calling CrxApi->getCrxdeStatus: $e\n");
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
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInstallStatus**
> InstallStatus getInstallStatus()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CrxApi();

try { 
    var result = api_instance.getInstallStatus();
    print(result);
} catch (e) {
    print("Exception when calling CrxApi->getInstallStatus: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageManagerServlet**
> getPackageManagerServlet()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CrxApi();

try { 
    api_instance.getPackageManagerServlet();
} catch (e) {
    print("Exception when calling CrxApi->getPackageManagerServlet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageService**
> String postPackageService(cmd)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CrxApi();
var cmd = cmd_example; // String | 

try { 
    var result = api_instance.postPackageService(cmd);
    print(result);
} catch (e) {
    print("Exception when calling CrxApi->postPackageService: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageServiceJson**
> String postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CrxApi();
var path = path_example; // String | 
var cmd = cmd_example; // String | 
var groupName = groupName_example; // String | 
var packageName = packageName_example; // String | 
var packageVersion = packageVersion_example; // String | 
var charset = charset_example; // String | 
var force = true; // bool | 
var recursive = true; // bool | 
var package = BINARY_DATA_HERE; // MultipartFile | 

try { 
    var result = api_instance.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package);
    print(result);
} catch (e) {
    print("Exception when calling CrxApi->postPackageServiceJson: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **cmd** | **String**|  | 
 **groupName** | **String**|  | [optional] 
 **packageName** | **String**|  | [optional] 
 **packageVersion** | **String**|  | [optional] 
 **charset** | **String**|  | [optional] 
 **force** | **bool**|  | [optional] 
 **recursive** | **bool**|  | [optional] 
 **package** | **MultipartFile**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageUpdate**
> String postPackageUpdate(groupName, packageName, version, path, filter, charset)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CrxApi();
var groupName = groupName_example; // String | 
var packageName = packageName_example; // String | 
var version = version_example; // String | 
var path = path_example; // String | 
var filter = filter_example; // String | 
var charset = charset_example; // String | 

try { 
    var result = api_instance.postPackageUpdate(groupName, packageName, version, path, filter, charset);
    print(result);
} catch (e) {
    print("Exception when calling CrxApi->postPackageUpdate: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  | 
 **packageName** | **String**|  | 
 **version** | **String**|  | 
 **path** | **String**|  | 
 **filter** | **String**|  | [optional] 
 **charset** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSetPassword**
> String postSetPassword(old, plain, verify)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new CrxApi();
var old = old_example; // String | 
var plain = plain_example; // String | 
var verify = verify_example; // String | 

try { 
    var result = api_instance.postSetPassword(old, plain, verify);
    print(result);
} catch (e) {
    print("Exception when calling CrxApi->postSetPassword: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **String**|  | 
 **plain** | **String**|  | 
 **verify** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

