# CqApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLoginPage**](CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html |  |
| [**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html |  |



## getLoginPage

> String getLoginPage()



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CqApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CqApi apiInstance = new CqApi(defaultClient);
        try {
            String result = apiInstance.getLoginPage();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CqApi#getLoginPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postCqActions

> void postCqActions(authorizableId, changelog)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CqApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        CqApi apiInstance = new CqApi(defaultClient);
        String authorizableId = "authorizableId_example"; // String | 
        String changelog = "changelog_example"; // String | 
        try {
            void result = apiInstance.postCqActions(authorizableId, changelog);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CqApi#postCqActions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | **String**|  | |
| **changelog** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

