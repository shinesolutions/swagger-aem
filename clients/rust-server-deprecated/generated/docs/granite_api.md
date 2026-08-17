# granite_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
**sslSetup**](granite_api.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **sslSetup**
> String sslSetup(ctx, keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **keystore_password** | **String**|  | 
  **keystore_password_confirm** | **String**|  | 
  **truststore_password** | **String**|  | 
  **truststore_password_confirm** | **String**|  | 
  **https_hostname** | **String**|  | 
  **https_port** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore_password** | **String**|  | 
 **keystore_password_confirm** | **String**|  | 
 **truststore_password** | **String**|  | 
 **truststore_password_confirm** | **String**|  | 
 **https_hostname** | **String**|  | 
 **https_port** | **String**|  | 
 **privatekey_file** | **swagger::ByteArray**|  | 
 **certificate_file** | **swagger::ByteArray**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

