# GRANITE_API

All URIs are relative to *http://localhost*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](GRANITE_API.md#ssl_setup) | **Post** /libs/granite/security/post/sslSetup.html | 


# **ssl_setup**
> ssl_setup (keystore_password: STRING_32 ; keystore_password_confirm: STRING_32 ; truststore_password: STRING_32 ; truststore_password_confirm: STRING_32 ; https_hostname: STRING_32 ; https_port: STRING_32 ; privatekey_file:  detachable FILE ; certificate_file:  detachable FILE ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore_password** | **STRING_32**|  | [default to null]
 **keystore_password_confirm** | **STRING_32**|  | [default to null]
 **truststore_password** | **STRING_32**|  | [default to null]
 **truststore_password_confirm** | **STRING_32**|  | [default to null]
 **https_hostname** | **STRING_32**|  | [default to null]
 **https_port** | **STRING_32**|  | [default to null]
 **privatekey_file** | **FILE**|  | [optional] [default to null]
 **certificate_file** | **FILE**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

