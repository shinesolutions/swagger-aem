# CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html | 


<a name="getLoginPage"></a>
# **getLoginPage**
> kotlin.String getLoginPage()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CqApi()
try {
    val result : kotlin.String = apiInstance.getLoginPage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CqApi#getLoginPage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CqApi#getLoginPage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postCqActions"></a>
# **postCqActions**
> postCqActions(authorizableId, changelog)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CqApi()
val authorizableId : kotlin.String = authorizableId_example // kotlin.String | 
val changelog : kotlin.String = changelog_example // kotlin.String | 
try {
    apiInstance.postCqActions(authorizableId, changelog)
} catch (e: ClientException) {
    println("4xx response calling CqApi#postCqActions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CqApi#postCqActions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **kotlin.String**|  |
 **changelog** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

