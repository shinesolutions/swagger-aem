# CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html | 



## getLoginPage

> String getLoginPage()



### Example

```java
// Import classes:
//import org.openapitools.client.api.CqApi;

CqApi apiInstance = new CqApi();
try {
    String result = apiInstance.getLoginPage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CqApi#getLoginPage");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


## postCqActions

> postCqActions(authorizableId, changelog)



### Example

```java
// Import classes:
//import org.openapitools.client.api.CqApi;

CqApi apiInstance = new CqApi();
String authorizableId = null; // String | 
String changelog = null; // String | 
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
 **authorizableId** | **String**|  | [default to null]
 **changelog** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

