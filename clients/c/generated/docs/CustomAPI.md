# CustomAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomAPI_getAemHealthCheck**](CustomAPI.md#CustomAPI_getAemHealthCheck) | **GET** /system/health | 
[**CustomAPI_postConfigAemHealthCheckServlet**](CustomAPI.md#CustomAPI_postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**CustomAPI_postConfigAemPasswordReset**](CustomAPI.md#CustomAPI_postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **CustomAPI_getAemHealthCheck**
```c
char* CustomAPI_getAemHealthCheck(apiClient_t *apiClient, char *tags, int *combineTagsOr);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**tags** | **char \*** |  | [optional] 
**combineTagsOr** | **int \*** |  | [optional] 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomAPI_postConfigAemHealthCheckServlet**
```c
void CustomAPI_postConfigAemHealthCheckServlet(apiClient_t *apiClient, list_t *bundles.ignored, char *bundles.ignored@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bundles.ignored** | **[list_t](char.md) \*** |  | [optional] 
**bundles.ignored@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomAPI_postConfigAemPasswordReset**
```c
void CustomAPI_postConfigAemPasswordReset(apiClient_t *apiClient, list_t *pwdreset.authorizables, char *pwdreset.authorizables@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**pwdreset.authorizables** | **[list_t](char.md) \*** |  | [optional] 
**pwdreset.authorizables@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

