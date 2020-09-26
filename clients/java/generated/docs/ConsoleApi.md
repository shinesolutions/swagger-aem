# ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


<a name="getAemProductInfo"></a>
# **getAemProductInfo**
> List&lt;String&gt; getAemProductInfo()



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    ConsoleApi apiInstance = new ConsoleApi(defaultClient);
    try {
      List<String> result = apiInstance.getAemProductInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsoleApi#getAemProductInfo");
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

**List&lt;String&gt;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="getConfigMgr"></a>
# **getConfigMgr**
> String getConfigMgr()



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    ConsoleApi apiInstance = new ConsoleApi(defaultClient);
    try {
      String result = apiInstance.getConfigMgr();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsoleApi#getConfigMgr");
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
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**5XX** | Unexpected error. |  -  |

<a name="postBundle"></a>
# **postBundle**
> postBundle(name, action)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    ConsoleApi apiInstance = new ConsoleApi(defaultClient);
    String name = "name_example"; // String | 
    String action = "action_example"; // String | 
    try {
      apiInstance.postBundle(name, action);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsoleApi#postBundle");
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
 **name** | **String**|  |
 **action** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="postJmxRepository"></a>
# **postJmxRepository**
> postJmxRepository(action)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    ConsoleApi apiInstance = new ConsoleApi(defaultClient);
    String action = "action_example"; // String | 
    try {
      apiInstance.postJmxRepository(action);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsoleApi#postJmxRepository");
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
 **action** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="postSamlConfiguration"></a>
# **postSamlConfiguration**
> SamlConfigurationInfo postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    ConsoleApi apiInstance = new ConsoleApi(defaultClient);
    Boolean post = true; // Boolean | 
    Boolean apply = true; // Boolean | 
    Boolean delete = true; // Boolean | 
    String action = "action_example"; // String | 
    String $location = "$location_example"; // String | 
    List<String> path = Arrays.asList(); // List<String> | 
    Integer serviceRanking = 56; // Integer | 
    String idpUrl = "idpUrl_example"; // String | 
    String idpCertAlias = "idpCertAlias_example"; // String | 
    Boolean idpHttpRedirect = true; // Boolean | 
    String serviceProviderEntityId = "serviceProviderEntityId_example"; // String | 
    String assertionConsumerServiceURL = "assertionConsumerServiceURL_example"; // String | 
    String spPrivateKeyAlias = "spPrivateKeyAlias_example"; // String | 
    String keyStorePassword = "keyStorePassword_example"; // String | 
    String defaultRedirectUrl = "defaultRedirectUrl_example"; // String | 
    String userIDAttribute = "userIDAttribute_example"; // String | 
    Boolean useEncryption = true; // Boolean | 
    Boolean createUser = true; // Boolean | 
    Boolean addGroupMemberships = true; // Boolean | 
    String groupMembershipAttribute = "groupMembershipAttribute_example"; // String | 
    List<String> defaultGroups = Arrays.asList(); // List<String> | 
    String nameIdFormat = "nameIdFormat_example"; // String | 
    List<String> synchronizeAttributes = Arrays.asList(); // List<String> | 
    Boolean handleLogout = true; // Boolean | 
    String logoutUrl = "logoutUrl_example"; // String | 
    Integer clockTolerance = 56; // Integer | 
    String digestMethod = "digestMethod_example"; // String | 
    String signatureMethod = "signatureMethod_example"; // String | 
    String userIntermediatePath = "userIntermediatePath_example"; // String | 
    List<String> propertylist = Arrays.asList(); // List<String> | 
    try {
      SamlConfigurationInfo result = apiInstance.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsoleApi#postSamlConfiguration");
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
 **post** | **Boolean**|  | [optional]
 **apply** | **Boolean**|  | [optional]
 **delete** | **Boolean**|  | [optional]
 **action** | **String**|  | [optional]
 **$location** | **String**|  | [optional]
 **path** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **serviceRanking** | **Integer**|  | [optional]
 **idpUrl** | **String**|  | [optional]
 **idpCertAlias** | **String**|  | [optional]
 **idpHttpRedirect** | **Boolean**|  | [optional]
 **serviceProviderEntityId** | **String**|  | [optional]
 **assertionConsumerServiceURL** | **String**|  | [optional]
 **spPrivateKeyAlias** | **String**|  | [optional]
 **keyStorePassword** | **String**|  | [optional]
 **defaultRedirectUrl** | **String**|  | [optional]
 **userIDAttribute** | **String**|  | [optional]
 **useEncryption** | **Boolean**|  | [optional]
 **createUser** | **Boolean**|  | [optional]
 **addGroupMemberships** | **Boolean**|  | [optional]
 **groupMembershipAttribute** | **String**|  | [optional]
 **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **nameIdFormat** | **String**|  | [optional]
 **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **handleLogout** | **Boolean**|  | [optional]
 **logoutUrl** | **String**|  | [optional]
 **clockTolerance** | **Integer**|  | [optional]
 **digestMethod** | **String**|  | [optional]
 **signatureMethod** | **String**|  | [optional]
 **userIntermediatePath** | **String**|  | [optional]
 **propertylist** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved AEM SAML Configuration |  -  |
**302** | Default response |  -  |
**0** | Default response |  -  |

