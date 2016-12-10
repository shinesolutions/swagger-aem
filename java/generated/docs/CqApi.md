# CqApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html | 


<a name="postCqActions"></a>
# **postCqActions**
> postCqActions(authorizableId, changelog)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.CqApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

CqApi apiInstance = new CqApi();
String authorizableId = "authorizableId_example"; // String | 
String changelog = "changelog_example"; // String | 
try {
    apiInstance.postCqActions(authorizableId, changelog);
} catch (ApiException e) {
    System.err.println("Exception when calling CqApi#postCqActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  |
 **changelog** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

