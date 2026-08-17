# GraniteApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html |  |



## sslSetup

> String sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keystorePassword** | **String**|  | |
| **keystorePasswordConfirm** | **String**|  | |
| **truststorePassword** | **String**|  | |
| **truststorePasswordConfirm** | **String**|  | |
| **httpsHostname** | **String**|  | |
| **httpsPort** | **String**|  | |
| **privatekeyFile** | **File**|  | [optional] |
| **certificateFile** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

