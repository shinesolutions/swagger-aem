# .GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **sslSetup**
> sslSetup()


### Example


```typescript
import { createConfiguration, GraniteApi } from '';
import type { GraniteApiSslSetupRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GraniteApi(configuration);

const request: GraniteApiSslSetupRequest = {
  
  keystorePassword: "keystorePassword_example",
  
  keystorePasswordConfirm: "keystorePasswordConfirm_example",
  
  truststorePassword: "truststorePassword_example",
  
  truststorePasswordConfirm: "truststorePasswordConfirm_example",
  
  httpsHostname: "httpsHostname_example",
  
  httpsPort: "httpsPort_example",
  
  privatekeyFile: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  
  certificateFile: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

const data = await apiInstance.sslSetup(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | [**string**] |  | defaults to undefined
 **keystorePasswordConfirm** | [**string**] |  | defaults to undefined
 **truststorePassword** | [**string**] |  | defaults to undefined
 **truststorePasswordConfirm** | [**string**] |  | defaults to undefined
 **httpsHostname** | [**string**] |  | defaults to undefined
 **httpsPort** | [**string**] |  | defaults to undefined
 **privatekeyFile** | [**HttpFile**] |  | (optional) defaults to undefined
 **certificateFile** | [**HttpFile**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


