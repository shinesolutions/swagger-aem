# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


<a name="getAemHealthCheck"></a>
# **getAemHealthCheck**
> String getAemHealthCheck(tags, combineTagsOr)



### Example
```java
// Import classes:
//import org.openapitools.client.api.CustomApi;

CustomApi apiInstance = new CustomApi();
String tags = "tags_example"; // String | 
Boolean combineTagsOr = true; // Boolean | 
try {
    String result = apiInstance.getAemHealthCheck(tags, combineTagsOr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomApi#getAemHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **String**|  | [optional]
 **combineTagsOr** | **Boolean**|  | [optional]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postConfigAemHealthCheckServlet"></a>
# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.CustomApi;

CustomApi apiInstance = new CustomApi();
List<String> bundlesIgnored = Arrays.asList("bundlesIgnored_example"); // List<String> | 
String bundlesIgnoredTypeHint = "bundlesIgnoredTypeHint_example"; // String | 
try {
    apiInstance.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomApi#postConfigAemHealthCheckServlet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **bundlesIgnoredTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.CustomApi;

CustomApi apiInstance = new CustomApi();
List<String> pwdresetAuthorizables = Arrays.asList("pwdresetAuthorizables_example"); // List<String> | 
String pwdresetAuthorizablesTypeHint = "pwdresetAuthorizablesTypeHint_example"; // String | 
try {
    apiInstance.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomApi#postConfigAemPasswordReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **pwdresetAuthorizablesTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

