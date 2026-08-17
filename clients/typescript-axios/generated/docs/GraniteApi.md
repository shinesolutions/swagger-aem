# GraniteApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**sslSetup**](#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html | |

# **sslSetup**
> string sslSetup()


### Example

```typescript
import {
    GraniteApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new GraniteApi(configuration);

let keystorePassword: string; // (default to undefined)
let keystorePasswordConfirm: string; // (default to undefined)
let truststorePassword: string; // (default to undefined)
let truststorePasswordConfirm: string; // (default to undefined)
let httpsHostname: string; // (default to undefined)
let httpsPort: string; // (default to undefined)
let privatekeyFile: File; // (optional) (default to undefined)
let certificateFile: File; // (optional) (default to undefined)

const { status, data } = await apiInstance.sslSetup(
    keystorePassword,
    keystorePasswordConfirm,
    truststorePassword,
    truststorePasswordConfirm,
    httpsHostname,
    httpsPort,
    privatekeyFile,
    certificateFile
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **keystorePassword** | [**string**] |  | defaults to undefined|
| **keystorePasswordConfirm** | [**string**] |  | defaults to undefined|
| **truststorePassword** | [**string**] |  | defaults to undefined|
| **truststorePasswordConfirm** | [**string**] |  | defaults to undefined|
| **httpsHostname** | [**string**] |  | defaults to undefined|
| **httpsPort** | [**string**] |  | defaults to undefined|
| **privatekeyFile** | [**File**] |  | (optional) defaults to undefined|
| **certificateFile** | [**File**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

