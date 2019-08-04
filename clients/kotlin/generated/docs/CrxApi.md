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


<a name="getCrxdeStatus"></a>
# **getCrxdeStatus**
> kotlin.String getCrxdeStatus()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrxApi()
try {
    val result : kotlin.String = apiInstance.getCrxdeStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrxApi#getCrxdeStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrxApi#getCrxdeStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

<a name="getInstallStatus"></a>
# **getInstallStatus**
> InstallStatus getInstallStatus()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrxApi()
try {
    val result : InstallStatus = apiInstance.getInstallStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrxApi#getInstallStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrxApi#getInstallStatus")
    e.printStackTrace()
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

<a name="getPackageManagerServlet"></a>
# **getPackageManagerServlet**
> getPackageManagerServlet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrxApi()
try {
    apiInstance.getPackageManagerServlet()
} catch (e: ClientException) {
    println("4xx response calling CrxApi#getPackageManagerServlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrxApi#getPackageManagerServlet")
    e.printStackTrace()
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

<a name="postPackageService"></a>
# **postPackageService**
> kotlin.String postPackageService(cmd)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrxApi()
val cmd : kotlin.String = cmd_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postPackageService(cmd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrxApi#postPackageService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrxApi#postPackageService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

<a name="postPackageServiceJson"></a>
# **postPackageServiceJson**
> kotlin.String postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, `package`)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrxApi()
val path : kotlin.String = path_example // kotlin.String | 
val cmd : kotlin.String = cmd_example // kotlin.String | 
val groupName : kotlin.String = groupName_example // kotlin.String | 
val packageName : kotlin.String = packageName_example // kotlin.String | 
val packageVersion : kotlin.String = packageVersion_example // kotlin.String | 
val charset : kotlin.String = charset_example // kotlin.String | 
val force : kotlin.Boolean = true // kotlin.Boolean | 
val recursive : kotlin.Boolean = true // kotlin.Boolean | 
val `package` : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, `package`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrxApi#postPackageServiceJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrxApi#postPackageServiceJson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **cmd** | **kotlin.String**|  |
 **groupName** | **kotlin.String**|  | [optional]
 **packageName** | **kotlin.String**|  | [optional]
 **packageVersion** | **kotlin.String**|  | [optional]
 **charset** | **kotlin.String**|  | [optional]
 **force** | **kotlin.Boolean**|  | [optional]
 **recursive** | **kotlin.Boolean**|  | [optional]
 **&#x60;package&#x60;** | **java.io.File**|  | [optional] [default to null]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postPackageUpdate"></a>
# **postPackageUpdate**
> kotlin.String postPackageUpdate(groupName, packageName, version, path, filter, charset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrxApi()
val groupName : kotlin.String = groupName_example // kotlin.String | 
val packageName : kotlin.String = packageName_example // kotlin.String | 
val version : kotlin.String = version_example // kotlin.String | 
val path : kotlin.String = path_example // kotlin.String | 
val filter : kotlin.String = filter_example // kotlin.String | 
val charset : kotlin.String = charset_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postPackageUpdate(groupName, packageName, version, path, filter, charset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrxApi#postPackageUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrxApi#postPackageUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **kotlin.String**|  |
 **packageName** | **kotlin.String**|  |
 **version** | **kotlin.String**|  |
 **path** | **kotlin.String**|  |
 **filter** | **kotlin.String**|  | [optional]
 **charset** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postSetPassword"></a>
# **postSetPassword**
> kotlin.String postSetPassword(old, plain, verify)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrxApi()
val old : kotlin.String = old_example // kotlin.String | 
val plain : kotlin.String = plain_example // kotlin.String | 
val verify : kotlin.String = verify_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postSetPassword(old, plain, verify)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrxApi#postSetPassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrxApi#postSetPassword")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **kotlin.String**|  |
 **plain** | **kotlin.String**|  |
 **verify** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

