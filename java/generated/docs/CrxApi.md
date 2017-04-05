# CrxApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


<a name="postPackageService"></a>
# **postPackageService**
> String postPackageService(cmd)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.CrxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

CrxApi apiInstance = new CrxApi();
String cmd = "cmd_example"; // String | 
try {
    String result = apiInstance.postPackageService(cmd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postPackageService");
    e.printStackTrace();
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

<a name="postPackageServiceJson"></a>
# **postPackageServiceJson**
> String postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset_, force, recursive, _package)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.CrxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

CrxApi apiInstance = new CrxApi();
String path = "path_example"; // String | 
String cmd = "cmd_example"; // String | 
String groupName = "groupName_example"; // String | 
String packageName = "packageName_example"; // String | 
String packageVersion = "packageVersion_example"; // String | 
String charset_ = "charset__example"; // String | 
Boolean force = true; // Boolean | 
Boolean recursive = true; // Boolean | 
File _package = new File("/path/to/file.txt"); // File | 
try {
    String result = apiInstance.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset_, force, recursive, _package);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postPackageServiceJson");
    e.printStackTrace();
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
 **charset_** | **String**|  | [optional]
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

<a name="postPackageUpdate"></a>
# **postPackageUpdate**
> String postPackageUpdate(groupName, packageName, version, path, filter, charset_)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.CrxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

CrxApi apiInstance = new CrxApi();
String groupName = "groupName_example"; // String | 
String packageName = "packageName_example"; // String | 
String version = "version_example"; // String | 
String path = "path_example"; // String | 
String filter = "filter_example"; // String | 
String charset_ = "charset__example"; // String | 
try {
    String result = apiInstance.postPackageUpdate(groupName, packageName, version, path, filter, charset_);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postPackageUpdate");
    e.printStackTrace();
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
 **charset_** | **String**|  | [optional]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postSetPassword"></a>
# **postSetPassword**
> postSetPassword(old, plain, verify)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.CrxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

CrxApi apiInstance = new CrxApi();
String old = "old_example"; // String | 
String plain = "plain_example"; // String | 
String verify = "verify_example"; // String | 
try {
    apiInstance.postSetPassword(old, plain, verify);
} catch (ApiException e) {
    System.err.println("Exception when calling CrxApi#postSetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **String**|  |
 **plain** | **String**|  |
 **verify** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

