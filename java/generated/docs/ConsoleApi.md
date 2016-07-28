# ConsoleApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 


<a name="postBundle"></a>
# **postBundle**
> postBundle(name, action)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

ConsoleApi apiInstance = new ConsoleApi();
String name = "name_example"; // String | 
String action = "action_example"; // String | 
try {
    apiInstance.postBundle(name, action);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsoleApi#postBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **action** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postJmxRepository"></a>
# **postJmxRepository**
> postJmxRepository(action)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

ConsoleApi apiInstance = new ConsoleApi();
String action = "action_example"; // String | 
try {
    apiInstance.postJmxRepository(action);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsoleApi#postJmxRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

