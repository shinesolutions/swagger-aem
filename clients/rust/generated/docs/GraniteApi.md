# \GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](GraniteApi.md#ssl_setup) | **POST** /libs/granite/security/post/sslSetup.html | 



## ssl_setup

> String ssl_setup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file, certificate_file)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**keystore_password** | **String** |  | [required] |
**keystore_password_confirm** | **String** |  | [required] |
**truststore_password** | **String** |  | [required] |
**truststore_password_confirm** | **String** |  | [required] |
**https_hostname** | **String** |  | [required] |
**https_port** | **String** |  | [required] |
**privatekey_file** | Option<**std::path::PathBuf**> |  |  |
**certificate_file** | Option<**std::path::PathBuf**> |  |  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

