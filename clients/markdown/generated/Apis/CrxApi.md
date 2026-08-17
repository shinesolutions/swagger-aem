# CrxApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCrxdeStatus**](CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json |  |
| [**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp |  |
| [**getPackageManagerServlet**](CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html |  |
| [**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp |  |
| [**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} |  |
| [**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp |  |
| [**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp |  |


<a name="getCrxdeStatus"></a>
# **getCrxdeStatus**
> String getCrxdeStatus()



### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: plain/text

<a name="getInstallStatus"></a>
# **getInstallStatus**
> InstallStatus getInstallStatus()



### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](../Models/InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getPackageManagerServlet"></a>
# **getPackageManagerServlet**
> getPackageManagerServlet()



### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

<a name="postPackageService"></a>
# **postPackageService**
> String postPackageService(cmd)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmd** | **String**|  | [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml

<a name="postPackageServiceJson"></a>
# **postPackageServiceJson**
> String postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, \_charset\_, force, recursive, package)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **cmd** | **String**|  | [default to null] |
| **groupName** | **String**|  | [optional] [default to null] |
| **packageName** | **String**|  | [optional] [default to null] |
| **packageVersion** | **String**|  | [optional] [default to null] |
| **\_charset\_** | **String**|  | [optional] [default to null] |
| **force** | **Boolean**|  | [optional] [default to null] |
| **recursive** | **Boolean**|  | [optional] [default to null] |
| **package** | **File**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a name="postPackageUpdate"></a>
# **postPackageUpdate**
> String postPackageUpdate(groupName, packageName, version, path, filter, \_charset\_)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupName** | **String**|  | [default to null] |
| **packageName** | **String**|  | [default to null] |
| **version** | **String**|  | [default to null] |
| **path** | **String**|  | [default to null] |
| **filter** | **String**|  | [optional] [default to null] |
| **\_charset\_** | **String**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="postSetPassword"></a>
# **postSetPassword**
> String postSetPassword(old, plain, verify)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **old** | **String**|  | [default to null] |
| **plain** | **String**|  | [default to null] |
| **verify** | **String**|  | [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

