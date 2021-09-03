# CrxApi

All URIs are relative to *http://localhost*

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

> String getCrxdeStatus()



### Example

```java
// Import classes:
//import org.openapitools.client.api.CrxApi;

CrxApi apiInstance = new CrxApi();
try {
    String result = apiInstance.getCrxdeStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#getCrxdeStatus");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: plain/text


## getInstallStatus

> InstallStatus getInstallStatus()



### Example

```java
// Import classes:
//import org.openapitools.client.api.CrxApi;

CrxApi apiInstance = new CrxApi();
try {
    InstallStatus result = apiInstance.getInstallStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#getInstallStatus");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPackageManagerServlet

> getPackageManagerServlet()



### Example

```java
// Import classes:
//import org.openapitools.client.api.CrxApi;

CrxApi apiInstance = new CrxApi();
try {
    apiInstance.getPackageManagerServlet();
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#getPackageManagerServlet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


## postPackageService

> String postPackageService(cmd)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CrxApi;

CrxApi apiInstance = new CrxApi();
String cmd = null; // String | 
try {
    String result = apiInstance.postPackageService(cmd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postPackageService");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **String**|  | [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml


## postPackageServiceJson

> String postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CrxApi;

CrxApi apiInstance = new CrxApi();
String path = null; // String | 
String cmd = null; // String | 
String groupName = null; // String | 
String packageName = null; // String | 
String packageVersion = null; // String | 
String charset = null; // String | 
Boolean force = null; // Boolean | 
Boolean recursive = null; // Boolean | 
File _package = null; // File | 
try {
    String result = apiInstance.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postPackageServiceJson");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | [default to null]
 **cmd** | **String**|  | [default to null]
 **groupName** | **String**|  | [optional] [default to null]
 **packageName** | **String**|  | [optional] [default to null]
 **packageVersion** | **String**|  | [optional] [default to null]
 **charset** | **String**|  | [optional] [default to null]
 **force** | **Boolean**|  | [optional] [default to null]
 **recursive** | **Boolean**|  | [optional] [default to null]
 **_package** | **File**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## postPackageUpdate

> String postPackageUpdate(groupName, packageName, version, path, filter, charset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CrxApi;

CrxApi apiInstance = new CrxApi();
String groupName = null; // String | 
String packageName = null; // String | 
String version = null; // String | 
String path = null; // String | 
String filter = null; // String | 
String charset = null; // String | 
try {
    String result = apiInstance.postPackageUpdate(groupName, packageName, version, path, filter, charset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postPackageUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  | [default to null]
 **packageName** | **String**|  | [default to null]
 **version** | **String**|  | [default to null]
 **path** | **String**|  | [default to null]
 **filter** | **String**|  | [optional] [default to null]
 **charset** | **String**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postSetPassword

> String postSetPassword(old, plain, verify)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CrxApi;

CrxApi apiInstance = new CrxApi();
String old = null; // String | 
String plain = null; // String | 
String verify = null; // String | 
try {
    String result = apiInstance.postSetPassword(old, plain, verify);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postSetPassword");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **String**|  | [default to null]
 **plain** | **String**|  | [default to null]
 **verify** | **String**|  | [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

