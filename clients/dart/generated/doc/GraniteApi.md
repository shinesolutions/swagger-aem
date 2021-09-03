# openapi.api.GraniteApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **sslSetup**
> String sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = GraniteApi();
final keystorePassword = keystorePassword_example; // String | 
final keystorePasswordConfirm = keystorePasswordConfirm_example; // String | 
final truststorePassword = truststorePassword_example; // String | 
final truststorePasswordConfirm = truststorePasswordConfirm_example; // String | 
final httpsHostname = httpsHostname_example; // String | 
final httpsPort = httpsPort_example; // String | 
final privatekeyFile = BINARY_DATA_HERE; // MultipartFile | 
final certificateFile = BINARY_DATA_HERE; // MultipartFile | 

try { 
    final result = api_instance.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile);
    print(result);
} catch (e) {
    print('Exception when calling GraniteApi->sslSetup: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **String**|  | 
 **keystorePasswordConfirm** | **String**|  | 
 **truststorePassword** | **String**|  | 
 **truststorePasswordConfirm** | **String**|  | 
 **httpsHostname** | **String**|  | 
 **httpsPort** | **String**|  | 
 **privatekeyFile** | **MultipartFile**|  | [optional] 
 **certificateFile** | **MultipartFile**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

