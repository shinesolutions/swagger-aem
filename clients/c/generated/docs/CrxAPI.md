# CrxAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CrxAPI_getCrxdeStatus**](CrxAPI.md#CrxAPI_getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**CrxAPI_getInstallStatus**](CrxAPI.md#CrxAPI_getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**CrxAPI_getPackageManagerServlet**](CrxAPI.md#CrxAPI_getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**CrxAPI_postPackageService**](CrxAPI.md#CrxAPI_postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**CrxAPI_postPackageServiceJson**](CrxAPI.md#CrxAPI_postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**CrxAPI_postPackageUpdate**](CrxAPI.md#CrxAPI_postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**CrxAPI_postSetPassword**](CrxAPI.md#CrxAPI_postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **CrxAPI_getCrxdeStatus**
```c
char* CrxAPI_getCrxdeStatus(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CrxAPI_getInstallStatus**
```c
install_status_t* CrxAPI_getInstallStatus(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[install_status_t](install_status.md) *


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CrxAPI_getPackageManagerServlet**
```c
void CrxAPI_getPackageManagerServlet(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CrxAPI_postPackageService**
```c
char* CrxAPI_postPackageService(apiClient_t *apiClient, char *cmd);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**cmd** | **char \*** |  | 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CrxAPI_postPackageServiceJson**
```c
char* CrxAPI_postPackageServiceJson(apiClient_t *apiClient, char *path, char *cmd, char *groupName, char *packageName, char *packageVersion, char *_charset_, int *force, int *recursive, binary_t* package);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**cmd** | **char \*** |  | 
**groupName** | **char \*** |  | [optional] 
**packageName** | **char \*** |  | [optional] 
**packageVersion** | **char \*** |  | [optional] 
**_charset_** | **char \*** |  | [optional] 
**force** | **int \*** |  | [optional] 
**recursive** | **int \*** |  | [optional] 
**package** | **binary_t*** |  | [optional] 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CrxAPI_postPackageUpdate**
```c
char* CrxAPI_postPackageUpdate(apiClient_t *apiClient, char *groupName, char *packageName, char *version, char *path, char *filter, char *_charset_);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**groupName** | **char \*** |  | 
**packageName** | **char \*** |  | 
**version** | **char \*** |  | 
**path** | **char \*** |  | 
**filter** | **char \*** |  | [optional] 
**_charset_** | **char \*** |  | [optional] 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CrxAPI_postSetPassword**
```c
char* CrxAPI_postSetPassword(apiClient_t *apiClient, char *old, char *plain, char *verify);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**old** | **char \*** |  | 
**plain** | **char \*** |  | 
**verify** | **char \*** |  | 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

