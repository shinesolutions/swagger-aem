# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


<a name="getAemHealthCheck"></a>
# **getAemHealthCheck**
> kotlin.String getAemHealthCheck(tags, combineTagsOr)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomApi()
val tags : kotlin.String = tags_example // kotlin.String | 
val combineTagsOr : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.String = apiInstance.getAemHealthCheck(tags, combineTagsOr)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomApi#getAemHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomApi#getAemHealthCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **kotlin.String**|  | [optional]
 **combineTagsOr** | **kotlin.Boolean**|  | [optional]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postConfigAemHealthCheckServlet"></a>
# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet(bundlesPeriodignored, bundlesPeriodignoredAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomApi()
val bundlesPeriodignored : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val bundlesPeriodignoredAtTypeHint : kotlin.String = bundlesPeriodignoredAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigAemHealthCheckServlet(bundlesPeriodignored, bundlesPeriodignoredAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling CustomApi#postConfigAemHealthCheckServlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomApi#postConfigAemHealthCheckServlet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesPeriodignored** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **bundlesPeriodignoredAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomApi()
val pwdresetPeriodauthorizables : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val pwdresetPeriodauthorizablesAtTypeHint : kotlin.String = pwdresetPeriodauthorizablesAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigAemPasswordReset(pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling CustomApi#postConfigAemPasswordReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomApi#postConfigAemPasswordReset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetPeriodauthorizables** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **pwdresetPeriodauthorizablesAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

