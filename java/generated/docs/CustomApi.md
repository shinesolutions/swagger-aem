# CustomApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config.{runmode}/com.shinesolutions.aem.passwordreset.Activator | 


<a name="getAemHealthCheck"></a>
# **getAemHealthCheck**
> String getAemHealthCheck(tags, combineTagsOr)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.CustomApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

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

<a name="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(runmode, pwdresetAuthorizables, pwdresetAuthorizablesTypeHint)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.CustomApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

CustomApi apiInstance = new CustomApi();
String runmode = "runmode_example"; // String | 
List<String> pwdresetAuthorizables = Arrays.asList("pwdresetAuthorizables_example"); // List<String> | 
String pwdresetAuthorizablesTypeHint = "pwdresetAuthorizablesTypeHint_example"; // String | 
try {
    apiInstance.postConfigAemPasswordReset(runmode, pwdresetAuthorizables, pwdresetAuthorizablesTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomApi#postConfigAemPasswordReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **pwdresetAuthorizables** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **pwdresetAuthorizablesTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

