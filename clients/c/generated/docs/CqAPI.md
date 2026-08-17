# CqAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CqAPI_getLoginPage**](CqAPI.md#CqAPI_getLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**CqAPI_postCqActions**](CqAPI.md#CqAPI_postCqActions) | **POST** /.cqactions.html | 


# **CqAPI_getLoginPage**
```c
char* CqAPI_getLoginPage(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

char*



### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CqAPI_postCqActions**
```c
void CqAPI_postCqActions(apiClient_t *apiClient, char *authorizableId, char *changelog);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**authorizableId** | **char \*** |  | 
**changelog** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

