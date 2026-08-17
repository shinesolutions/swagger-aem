# GraniteApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html |  |


<a name="sslSetup"></a>
# **sslSetup**
> String sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keystorePassword** | **String**|  | [default to null] |
| **keystorePasswordConfirm** | **String**|  | [default to null] |
| **truststorePassword** | **String**|  | [default to null] |
| **truststorePasswordConfirm** | **String**|  | [default to null] |
| **httpsHostname** | **String**|  | [default to null] |
| **httpsPort** | **String**|  | [default to null] |
| **privatekeyFile** | **File**|  | [optional] [default to null] |
| **certificateFile** | **File**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

