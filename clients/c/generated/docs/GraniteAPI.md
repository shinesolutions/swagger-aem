# GraniteAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GraniteAPI_sslSetup**](GraniteAPI.md#GraniteAPI_sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **GraniteAPI_sslSetup**
```c
char* GraniteAPI_sslSetup(apiClient_t *apiClient, char *keystorePassword, char *keystorePasswordConfirm, char *truststorePassword, char *truststorePasswordConfirm, char *httpsHostname, char *httpsPort, binary_t* privatekeyFile, binary_t* certificateFile);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**keystorePassword** | **char \*** |  | 
**keystorePasswordConfirm** | **char \*** |  | 
**truststorePassword** | **char \*** |  | 
**truststorePasswordConfirm** | **char \*** |  | 
**httpsHostname** | **char \*** |  | 
**httpsPort** | **char \*** |  | 
**privatekeyFile** | **binary_t*** |  | [optional] 
**certificateFile** | **binary_t*** |  | [optional] 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

