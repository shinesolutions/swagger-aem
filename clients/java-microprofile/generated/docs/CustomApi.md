# CustomApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health |  |
| [**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck |  |
| [**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator |  |



## getAemHealthCheck

> String getAemHealthCheck(tags, combineTagsOr)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CustomApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        CustomApi apiInstance = new CustomApi(defaultClient);
        String tags = "tags_example"; // String | 
        Boolean combineTagsOr = true; // Boolean | 
        try {
            String result = apiInstance.getAemHealthCheck(tags, combineTagsOr);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomApi#getAemHealthCheck");
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
| **tags** | **String**|  | [optional] |
| **combineTagsOr** | **Boolean**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigAemHealthCheckServlet

> void postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CustomApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        CustomApi apiInstance = new CustomApi(defaultClient);
        List<String> bundlesIgnored = Arrays.asList(); // List<String> | 
        String bundlesIgnoredAtTypeHint = "bundlesIgnoredAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomApi#postConfigAemHealthCheckServlet");
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
| **bundlesIgnored** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **bundlesIgnoredAtTypeHint** | **String**|  | [optional] |

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


## postConfigAemPasswordReset

> void postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CustomApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        CustomApi apiInstance = new CustomApi(defaultClient);
        List<String> pwdresetAuthorizables = Arrays.asList(); // List<String> | 
        String pwdresetAuthorizablesAtTypeHint = "pwdresetAuthorizablesAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomApi#postConfigAemPasswordReset");
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
| **pwdresetAuthorizables** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pwdresetAuthorizablesAtTypeHint** | **String**|  | [optional] |

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

