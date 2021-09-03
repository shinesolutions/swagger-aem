# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 



## sslSetup

> String sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)



### Example

```java
// Import classes:
//import org.openapitools.client.api.GraniteApi;

GraniteApi apiInstance = new GraniteApi();
String keystorePassword = null; // String | 
String keystorePasswordConfirm = null; // String | 
String truststorePassword = null; // String | 
String truststorePasswordConfirm = null; // String | 
String httpsHostname = null; // String | 
String httpsPort = null; // String | 
File privatekeyFile = null; // File | 
File certificateFile = null; // File | 
try {
    String result = apiInstance.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GraniteApi#sslSetup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **String**|  | [default to null]
 **keystorePasswordConfirm** | **String**|  | [default to null]
 **truststorePassword** | **String**|  | [default to null]
 **truststorePasswordConfirm** | **String**|  | [default to null]
 **httpsHostname** | **String**|  | [default to null]
 **httpsPort** | **String**|  | [default to null]
 **privatekeyFile** | **File**|  | [optional] [default to null]
 **certificateFile** | **File**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

