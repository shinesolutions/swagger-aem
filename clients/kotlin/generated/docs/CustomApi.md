# CustomApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health |  |
| [**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck |  |
| [**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator |  |


<a id="getAemHealthCheck"></a>
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
| **tags** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **combineTagsOr** | **kotlin.Boolean**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure aemAuth statically:
```kotlin
ApiClient.username = ""
ApiClient.password = ""
```
Configure aemAuth dynamically:
```kotlin
apiInstance.userCredentialProvider = { "user" to "pass" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="postConfigAemHealthCheckServlet"></a>
# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomApi()
val bundlesIgnored : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val bundlesIgnoredAtTypeHint : kotlin.String = bundlesIgnoredAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling CustomApi#postConfigAemHealthCheckServlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomApi#postConfigAemHealthCheckServlet")
    e.printStackTrace()
}
```

### Parameters
| **bundlesIgnored** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bundlesIgnoredAtTypeHint** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure aemAuth statically:
```kotlin
ApiClient.username = ""
ApiClient.password = ""
```
Configure aemAuth dynamically:
```kotlin
apiInstance.userCredentialProvider = { "user" to "pass" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomApi()
val pwdresetAuthorizables : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val pwdresetAuthorizablesAtTypeHint : kotlin.String = pwdresetAuthorizablesAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling CustomApi#postConfigAemPasswordReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomApi#postConfigAemPasswordReset")
    e.printStackTrace()
}
```

### Parameters
| **pwdresetAuthorizables** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pwdresetAuthorizablesAtTypeHint** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure aemAuth statically:
```kotlin
ApiClient.username = ""
ApiClient.password = ""
```
Configure aemAuth dynamically:
```kotlin
apiInstance.userCredentialProvider = { "user" to "pass" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

