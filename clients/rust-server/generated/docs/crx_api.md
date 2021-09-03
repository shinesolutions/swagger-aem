# crx_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
**getCrxdeStatus**](crx_api.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
**getInstallStatus**](crx_api.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
**getPackageManagerServlet**](crx_api.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
**postPackageService**](crx_api.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
**postPackageServiceJson**](crx_api.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
**postPackageUpdate**](crx_api.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
**postSetPassword**](crx_api.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **getCrxdeStatus**
> String getCrxdeStatus(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInstallStatus**
> models::InstallStatus getInstallStatus(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageManagerServlet**
> getPackageManagerServlet(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageService**
> String postPackageService(ctx, cmd)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **cmd** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageServiceJson**
> String postPackageServiceJson(ctx, path, cmd, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **cmd** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **cmd** | **String**|  | 
 **group_name** | **String**|  | 
 **package_name** | **String**|  | 
 **package_version** | **String**|  | 
 **_charset_** | **String**|  | 
 **force** | **bool**|  | 
 **recursive** | **bool**|  | 
 **package** | **swagger::ByteArray**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageUpdate**
> String postPackageUpdate(ctx, group_name, package_name, version, path, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **group_name** | **String**|  | 
  **package_name** | **String**|  | 
  **version** | **String**|  | 
  **path** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_name** | **String**|  | 
 **package_name** | **String**|  | 
 **version** | **String**|  | 
 **path** | **String**|  | 
 **filter** | **String**|  | 
 **_charset_** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSetPassword**
> String postSetPassword(ctx, old, plain, verify)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **old** | **String**|  | 
  **plain** | **String**|  | 
  **verify** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

