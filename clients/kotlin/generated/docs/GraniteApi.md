# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


<a name="sslSetup"></a>
# **sslSetup**
> kotlin.String sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GraniteApi()
val keystorePassword : kotlin.String = keystorePassword_example // kotlin.String | 
val keystorePasswordConfirm : kotlin.String = keystorePasswordConfirm_example // kotlin.String | 
val truststorePassword : kotlin.String = truststorePassword_example // kotlin.String | 
val truststorePasswordConfirm : kotlin.String = truststorePasswordConfirm_example // kotlin.String | 
val httpsHostname : kotlin.String = httpsHostname_example // kotlin.String | 
val httpsPort : kotlin.String = httpsPort_example // kotlin.String | 
val privatekeyFile : java.io.File = BINARY_DATA_HERE // java.io.File | 
val certificateFile : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GraniteApi#sslSetup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GraniteApi#sslSetup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **kotlin.String**|  |
 **keystorePasswordConfirm** | **kotlin.String**|  |
 **truststorePassword** | **kotlin.String**|  |
 **truststorePasswordConfirm** | **kotlin.String**|  |
 **httpsHostname** | **kotlin.String**|  |
 **httpsPort** | **kotlin.String**|  |
 **privatekeyFile** | **java.io.File**|  | [optional]
 **certificateFile** | **java.io.File**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

