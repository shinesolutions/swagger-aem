# \CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCrxdeStatus**](CrxApi.md#GetCrxdeStatus) | **Get** /crx/server/crx.default/jcr:root/.1.json | 
[**GetInstallStatus**](CrxApi.md#GetInstallStatus) | **Get** /crx/packmgr/installstatus.jsp | 
[**GetPackageManagerServlet**](CrxApi.md#GetPackageManagerServlet) | **Get** /crx/packmgr/service/script.html | 
[**PostPackageService**](CrxApi.md#PostPackageService) | **Post** /crx/packmgr/service.jsp | 
[**PostPackageServiceJson**](CrxApi.md#PostPackageServiceJson) | **Post** /crx/packmgr/service/.json/{path} | 
[**PostPackageUpdate**](CrxApi.md#PostPackageUpdate) | **Post** /crx/packmgr/update.jsp | 
[**PostSetPassword**](CrxApi.md#PostSetPassword) | **Post** /crx/explorer/ui/setpassword.jsp | 


# **GetCrxdeStatus**
> string GetCrxdeStatus(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetInstallStatus**
> InstallStatus GetInstallStatus(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPackageManagerServlet**
> GetPackageManagerServlet(ctx, )


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

# **PostPackageService**
> string PostPackageService(ctx, cmd)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **cmd** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostPackageServiceJson**
> string PostPackageServiceJson(ctx, path, cmd, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **cmd** | **string**|  | 
 **optional** | ***PostPackageServiceJsonOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostPackageServiceJsonOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **groupName** | **optional.String**|  | 
 **packageName** | **optional.String**|  | 
 **packageVersion** | **optional.String**|  | 
 **charset** | **optional.String**|  | 
 **force** | **optional.Bool**|  | 
 **recursive** | **optional.Bool**|  | 
 **package_** | **optional.Interface of *os.File****optional.*os.File**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostPackageUpdate**
> string PostPackageUpdate(ctx, groupName, packageName, version, path, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **groupName** | **string**|  | 
  **packageName** | **string**|  | 
  **version** | **string**|  | 
  **path** | **string**|  | 
 **optional** | ***PostPackageUpdateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostPackageUpdateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **filter** | **optional.String**|  | 
 **charset** | **optional.String**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostSetPassword**
> string PostSetPassword(ctx, old, plain, verify)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **old** | **string**|  | 
  **plain** | **string**|  | 
  **verify** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

