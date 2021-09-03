# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 



## getAemHealthCheck

> String getAemHealthCheck(tags, combineTagsOr)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomApi;

CustomApi apiInstance = new CustomApi();
String tags = null; // String | 
Boolean combineTagsOr = null; // Boolean | 
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
 **tags** | **String**|  | [optional] [default to null]
 **combineTagsOr** | **Boolean**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postConfigAemHealthCheckServlet

> postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomApi;

CustomApi apiInstance = new CustomApi();
List<String> bundlesIgnored = null; // List<String> | 
String bundlesIgnoredTypeHint = null; // String | 
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
 **bundlesIgnored** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **bundlesIgnoredTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigAemPasswordReset

> postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomApi;

CustomApi apiInstance = new CustomApi();
List<String> pwdresetAuthorizables = null; // List<String> | 
String pwdresetAuthorizablesTypeHint = null; // String | 
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
 **pwdresetAuthorizables** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **pwdresetAuthorizablesTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

