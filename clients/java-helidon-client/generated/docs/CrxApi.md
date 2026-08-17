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



## getCrxdeStatus

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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CRXDE is enabled |  -  |
| **404** | CRXDE is disabled |  -  |


## getInstallStatus

> InstallStatus getInstallStatus()



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
| **200** | Default response |  -  |


## getPackageManagerServlet

> void getPackageManagerServlet()



### Parameters

This endpoint does not need any parameter.

### Return type

[**void**](Void.md)

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


## postPackageService

> String postPackageService(cmd)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmd** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postPackageServiceJson

> String postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **cmd** | **String**|  | |
| **groupName** | **String**|  | [optional] |
| **packageName** | **String**|  | [optional] |
| **packageVersion** | **String**|  | [optional] |
| **charset** | **String**|  | [optional] |
| **force** | **Boolean**|  | [optional] |
| **recursive** | **Boolean**|  | [optional] |
| **_package** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postPackageUpdate

> String postPackageUpdate(groupName, packageName, version, path, filter, charset)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupName** | **String**|  | |
| **packageName** | **String**|  | |
| **version** | **String**|  | |
| **path** | **String**|  | |
| **filter** | **String**|  | [optional] |
| **charset** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postSetPassword

> String postSetPassword(old, plain, verify)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **old** | **String**|  | |
| **plain** | **String**|  | |
| **verify** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

