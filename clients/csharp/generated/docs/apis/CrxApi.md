# Org.OpenAPITools.Api.CrxApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetCrxdeStatus**](CrxApi.md#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json |  |
| [**GetInstallStatus**](CrxApi.md#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp |  |
| [**GetPackageManagerServlet**](CrxApi.md#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html |  |
| [**PostPackageService**](CrxApi.md#postpackageservice) | **POST** /crx/packmgr/service.jsp |  |
| [**PostPackageServiceJson**](CrxApi.md#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} |  |
| [**PostPackageUpdate**](CrxApi.md#postpackageupdate) | **POST** /crx/packmgr/update.jsp |  |
| [**PostSetPassword**](CrxApi.md#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp |  |

<a id="getcrxdestatus"></a>
# **GetCrxdeStatus**
> string GetCrxdeStatus ()




### Parameters
This endpoint does not need any parameter.
### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CRXDE is enabled |  -  |
| **404** | CRXDE is disabled |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getinstallstatus"></a>
# **GetInstallStatus**
> InstallStatus GetInstallStatus ()




### Parameters
This endpoint does not need any parameter.
### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved CRX package manager install status |  -  |
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getpackagemanagerservlet"></a>
# **GetPackageManagerServlet**
> void GetPackageManagerServlet ()




### Parameters
This endpoint does not need any parameter.
### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Package Manager Servlet is disabled |  -  |
| **405** | Package Manager Servlet is active |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postpackageservice"></a>
# **PostPackageService**
> string PostPackageService (string cmd)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cmd** | **string** |  |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postpackageservicejson"></a>
# **PostPackageServiceJson**
> string PostPackageServiceJson (string path, string cmd, string groupName = null, string packageName = null, string packageVersion = null, string charset = null, bool force = null, bool recursive = null, System.IO.Stream package = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **cmd** | **string** |  |  |
| **groupName** | **string** |  | [optional]  |
| **packageName** | **string** |  | [optional]  |
| **packageVersion** | **string** |  | [optional]  |
| **charset** | **string** |  | [optional]  |
| **force** | **bool** |  | [optional]  |
| **recursive** | **bool** |  | [optional]  |
| **package** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postpackageupdate"></a>
# **PostPackageUpdate**
> string PostPackageUpdate (string groupName, string packageName, string version, string path, string filter = null, string charset = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **groupName** | **string** |  |  |
| **packageName** | **string** |  |  |
| **version** | **string** |  |  |
| **path** | **string** |  |  |
| **filter** | **string** |  | [optional]  |
| **charset** | **string** |  | [optional]  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postsetpassword"></a>
# **PostSetPassword**
> string PostSetPassword (string old, string plain, string verify)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **old** | **string** |  |  |
| **plain** | **string** |  |  |
| **verify** | **string** |  |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

