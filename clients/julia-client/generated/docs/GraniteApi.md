# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](GraniteApi.md#ssl_setup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **ssl_setup**
> `ssl_setup`(_api::`GraniteApi`, `keystore_password`::`String`, `keystore_password_confirm`::`String`, `truststore_password`::`String`, `truststore_password_confirm`::`String`, `https_hostname`::`String`, `https_port`::`String`; `privatekey_file`=nothing, `certificate_file`=nothing, _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `ssl_setup`(_api::`GraniteApi`, response_stream::`Channel`, `keystore_password`::`String`, `keystore_password_confirm`::`String`, `truststore_password`::`String`, `truststore_password_confirm`::`String`, `https_hostname`::`String`, `https_port`::`String`; `privatekey_file`=nothing, `certificate_file`=nothing, _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GraniteApi`** | API context | 
**`keystore_password`** | **`String`** |  |
**`keystore_password_confirm`** | **`String`** |  |
**`truststore_password`** | **`String`** |  |
**`truststore_password_confirm`** | **`String`** |  |
**`https_hostname`** | **`String`** |  |
**`https_port`** | **`String`** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`privatekey_file`** | **`String`** |  | 
 **`certificate_file`** | **`String`** |  | 

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

