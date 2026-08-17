# GraniteAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteAPI.md#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **sslSetup**
```swift
    open class func sslSetup(keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: URL? = nil, certificateFile: URL? = nil, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let keystorePassword = "keystorePassword_example" // String | 
let keystorePasswordConfirm = "keystorePasswordConfirm_example" // String | 
let truststorePassword = "truststorePassword_example" // String | 
let truststorePasswordConfirm = "truststorePasswordConfirm_example" // String | 
let httpsHostname = "httpsHostname_example" // String | 
let httpsPort = "httpsPort_example" // String | 
let privatekeyFile = URL(string: "https://example.com")! // URL |  (optional)
let certificateFile = URL(string: "https://example.com")! // URL |  (optional)

GraniteAPI.sslSetup(keystorePassword: keystorePassword, keystorePasswordConfirm: keystorePasswordConfirm, truststorePassword: truststorePassword, truststorePasswordConfirm: truststorePasswordConfirm, httpsHostname: httpsHostname, httpsPort: httpsPort, privatekeyFile: privatekeyFile, certificateFile: certificateFile) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **String** |  | 
 **keystorePasswordConfirm** | **String** |  | 
 **truststorePassword** | **String** |  | 
 **truststorePasswordConfirm** | **String** |  | 
 **httpsHostname** | **String** |  | 
 **httpsPort** | **String** |  | 
 **privatekeyFile** | **URL** |  | [optional] 
 **certificateFile** | **URL** |  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

