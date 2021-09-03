# CrxApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 



## getCrxdeStatus



### Example

```bash
 getCrxdeStatus
```

### Parameters

This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getInstallStatus



### Example

```bash
 getInstallStatus
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPackageManagerServlet



### Example

```bash
 getPackageManagerServlet
```

### Parameters

This endpoint does not need any parameter.

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postPackageService



### Example

```bash
 postPackageService  cmd=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **string** |  | [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postPackageServiceJson



### Example

```bash
 postPackageServiceJson path=value  cmd=value  groupName=value  packageName=value  packageVersion=value  _charset_=value  force=value  recursive=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **cmd** | **string** |  | [default to null]
 **groupName** | **string** |  | [optional] [default to null]
 **packageName** | **string** |  | [optional] [default to null]
 **packageVersion** | **string** |  | [optional] [default to null]
 **charset** | **string** |  | [optional] [default to null]
 **force** | **boolean** |  | [optional] [default to null]
 **recursive** | **boolean** |  | [optional] [default to null]
 **package** | **binary** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postPackageUpdate



### Example

```bash
 postPackageUpdate  groupName=value  packageName=value  version=value  path=value  filter=value  _charset_=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **string** |  | [default to null]
 **packageName** | **string** |  | [default to null]
 **version** | **string** |  | [default to null]
 **path** | **string** |  | [default to null]
 **filter** | **string** |  | [optional] [default to null]
 **charset** | **string** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postSetPassword



### Example

```bash
 postSetPassword  old=value  plain=value  verify=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **string** |  | [default to null]
 **plain** | **string** |  | [default to null]
 **verify** | **string** |  | [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

