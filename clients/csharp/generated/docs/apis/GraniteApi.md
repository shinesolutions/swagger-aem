# Org.OpenAPITools.Api.GraniteApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SslSetup**](GraniteApi.md#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html |  |

<a id="sslsetup"></a>
# **SslSetup**
> string SslSetup (string keystorePassword, string keystorePasswordConfirm, string truststorePassword, string truststorePasswordConfirm, string httpsHostname, string httpsPort, System.IO.Stream privatekeyFile = null, System.IO.Stream certificateFile = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **keystorePassword** | **string** |  |  |
| **keystorePasswordConfirm** | **string** |  |  |
| **truststorePassword** | **string** |  |  |
| **truststorePasswordConfirm** | **string** |  |  |
| **httpsHostname** | **string** |  |  |
| **httpsPort** | **string** |  |  |
| **privatekeyFile** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |
| **certificateFile** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |

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
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

