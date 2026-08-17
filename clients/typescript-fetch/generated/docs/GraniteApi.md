# GraniteApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sslSetup**](GraniteApi.md#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html |  |



## sslSetup

> string sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)



### Example

```ts
import {
  Configuration,
  GraniteApi,
} from '';
import type { SslSetupRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new GraniteApi(config);

  const body = {
    // string
    keystorePassword: keystorePassword_example,
    // string
    keystorePasswordConfirm: keystorePasswordConfirm_example,
    // string
    truststorePassword: truststorePassword_example,
    // string
    truststorePasswordConfirm: truststorePasswordConfirm_example,
    // string
    httpsHostname: httpsHostname_example,
    // string
    httpsPort: httpsPort_example,
    // Blob (optional)
    privatekeyFile: BINARY_DATA_HERE,
    // Blob (optional)
    certificateFile: BINARY_DATA_HERE,
  } satisfies SslSetupRequest;

  try {
    const data = await api.sslSetup(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keystorePassword** | `string` |  | [Defaults to `undefined`] |
| **keystorePasswordConfirm** | `string` |  | [Defaults to `undefined`] |
| **truststorePassword** | `string` |  | [Defaults to `undefined`] |
| **truststorePasswordConfirm** | `string` |  | [Defaults to `undefined`] |
| **httpsHostname** | `string` |  | [Defaults to `undefined`] |
| **httpsPort** | `string` |  | [Defaults to `undefined`] |
| **privatekeyFile** | `Blob` |  | [Optional] [Defaults to `undefined`] |
| **certificateFile** | `Blob` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

