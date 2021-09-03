# GraniteApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 



## sslSetup



### Example

```bash
 sslSetup  keystorePassword=value  keystorePasswordConfirm=value  truststorePassword=value  truststorePasswordConfirm=value  httpsHostname=value  httpsPort=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **string** |  | [default to null]
 **keystorePasswordConfirm** | **string** |  | [default to null]
 **truststorePassword** | **string** |  | [default to null]
 **truststorePasswordConfirm** | **string** |  | [default to null]
 **httpsHostname** | **string** |  | [default to null]
 **httpsPort** | **string** |  | [default to null]
 **privatekeyFile** | **binary** |  | [optional] [default to null]
 **certificateFile** | **binary** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

