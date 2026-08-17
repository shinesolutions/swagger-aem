# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](GraniteApi.md#ssl_setup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **ssl_setup**
> `ssl_setup`(req::`HTTP.Request`, `keystore_password`::`String`, `keystore_password_confirm`::`String`, `truststore_password`::`String`, `truststore_password_confirm`::`String`, `https_hostname`::`String`, `https_port`::`String`; `privatekey_file`=nothing, `certificate_file`=nothing,) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`keystore_password`** | **`String`**|  |
**`keystore_password_confirm`** | **`String`**|  |
**`truststore_password`** | **`String`**|  |
**`truststore_password_confirm`** | **`String`**|  |
**`https_hostname`** | **`String`**|  |
**`https_port`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`privatekey_file`** | **`Vector{UInt8}`**|  | 
 **`certificate_file`** | **`Vector{UInt8}`**|  | 

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

