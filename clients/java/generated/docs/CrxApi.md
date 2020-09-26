# CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


<a name="getCrxdeStatus"></a>
# **getCrxdeStatus**
> String getCrxdeStatus()



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.CrxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    CrxApi apiInstance = new CrxApi(defaultClient);
    try {
      String result = apiInstance.getCrxdeStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrxApi#getCrxdeStatus");
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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CRXDE is enabled |  -  |
**404** | CRXDE is disabled |  -  |

<a name="getInstallStatus"></a>
# **getInstallStatus**
> InstallStatus getInstallStatus()



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.CrxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    CrxApi apiInstance = new CrxApi(defaultClient);
    try {
      InstallStatus result = apiInstance.getInstallStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrxApi#getInstallStatus");
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

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved CRX package manager install status |  -  |
**0** | Default response |  -  |

<a name="getPackageManagerServlet"></a>
# **getPackageManagerServlet**
> getPackageManagerServlet()



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.CrxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    CrxApi apiInstance = new CrxApi(defaultClient);
    try {
      apiInstance.getPackageManagerServlet();
    } catch (ApiException e) {
      System.err.println("Exception when calling CrxApi#getPackageManagerServlet");
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

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | Package Manager Servlet is disabled |  -  |
**405** | Package Manager Servlet is active |  -  |

<a name="postPackageService"></a>
# **postPackageService**
> String postPackageService(cmd)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.CrxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    CrxApi apiInstance = new CrxApi(defaultClient);
    String cmd = "cmd_example"; // String | 
    try {
      String result = apiInstance.postPackageService(cmd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrxApi#postPackageService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **String**|  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="postPackageServiceJson"></a>
# **postPackageServiceJson**
> String postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.CrxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    CrxApi apiInstance = new CrxApi(defaultClient);
    String path = "path_example"; // String | 
    String cmd = "cmd_example"; // String | 
    String groupName = "groupName_example"; // String | 
    String packageName = "packageName_example"; // String | 
    String packageVersion = "packageVersion_example"; // String | 
    String charset = "charset_example"; // String | 
    Boolean force = true; // Boolean | 
    Boolean recursive = true; // Boolean | 
    File _package = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrxApi#postPackageServiceJson");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **cmd** | **String**|  |
 **groupName** | **String**|  | [optional]
 **packageName** | **String**|  | [optional]
 **packageVersion** | **String**|  | [optional]
 **charset** | **String**|  | [optional]
 **force** | **Boolean**|  | [optional]
 **recursive** | **Boolean**|  | [optional]
 **_package** | **File**|  | [optional]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="postPackageUpdate"></a>
# **postPackageUpdate**
> String postPackageUpdate(groupName, packageName, version, path, filter, charset)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.CrxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    CrxApi apiInstance = new CrxApi(defaultClient);
    String groupName = "groupName_example"; // String | 
    String packageName = "packageName_example"; // String | 
    String version = "version_example"; // String | 
    String path = "path_example"; // String | 
    String filter = "filter_example"; // String | 
    String charset = "charset_example"; // String | 
    try {
      String result = apiInstance.postPackageUpdate(groupName, packageName, version, path, filter, charset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrxApi#postPackageUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |
 **packageName** | **String**|  |
 **version** | **String**|  |
 **path** | **String**|  |
 **filter** | **String**|  | [optional]
 **charset** | **String**|  | [optional]

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
**0** | Default response |  -  |

<a name="postSetPassword"></a>
# **postSetPassword**
> String postSetPassword(old, plain, verify)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.CrxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    CrxApi apiInstance = new CrxApi(defaultClient);
    String old = "old_example"; // String | 
    String plain = "plain_example"; // String | 
    String verify = "verify_example"; // String | 
    try {
      String result = apiInstance.postSetPassword(old, plain, verify);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrxApi#postSetPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **String**|  |
 **plain** | **String**|  |
 **verify** | **String**|  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

