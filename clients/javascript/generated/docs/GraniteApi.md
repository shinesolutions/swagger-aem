# NodeSwaggerAem.GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 



## sslSetup

> String sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, opts)



### Example

```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;
// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.GraniteApi();
let keystorePassword = "keystorePassword_example"; // String | 
let keystorePasswordConfirm = "keystorePasswordConfirm_example"; // String | 
let truststorePassword = "truststorePassword_example"; // String | 
let truststorePasswordConfirm = "truststorePasswordConfirm_example"; // String | 
let httpsHostname = "httpsHostname_example"; // String | 
let httpsPort = "httpsPort_example"; // String | 
let opts = {
  'privatekeyFile': "/path/to/file", // File | 
  'certificateFile': "/path/to/file" // File | 
};
apiInstance.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
 **privatekeyFile** | **File**|  | [optional] 
 **certificateFile** | **File**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

