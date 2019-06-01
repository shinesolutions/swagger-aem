# ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


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

<a name="postSamlConfiguration"></a>
# **postSamlConfiguration**
> SamlConfigurationInformations postSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



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
Boolean post = true; // Boolean | 
Boolean apply = true; // Boolean | 
Boolean delete = true; // Boolean | 
String action = "action_example"; // String | 
String location = "location_example"; // String | 
List<String> path = Arrays.asList("path_example"); // List<String> | 
String serviceRanking = "serviceRanking_example"; // String | 
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
List<String> defaultGroups = Arrays.asList("defaultGroups_example"); // List<String> | 
String nameIdFormat = "nameIdFormat_example"; // String | 
List<String> synchronizeAttributes = Arrays.asList("synchronizeAttributes_example"); // List<String> | 
Boolean handleLogout = true; // Boolean | 
String logoutUrl = "logoutUrl_example"; // String | 
String clockTolerance = "clockTolerance_example"; // String | 
String digestMethod = "digestMethod_example"; // String | 
String signatureMethod = "signatureMethod_example"; // String | 
String userIntermediatePath = "userIntermediatePath_example"; // String | 
List<String> propertylist = Arrays.asList("propertylist_example"); // List<String> | 
try {
    SamlConfigurationInformations result = apiInstance.postSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsoleApi#postSamlConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **Boolean**|  | [optional]
 **apply** | **Boolean**|  | [optional]
 **delete** | **Boolean**|  | [optional]
 **action** | **String**|  | [optional]
 **location** | **String**|  | [optional]
 **path** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **serviceRanking** | **String**|  | [optional]
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
 **clockTolerance** | **String**|  | [optional]
 **digestMethod** | **String**|  | [optional]
 **signatureMethod** | **String**|  | [optional]
 **userIntermediatePath** | **String**|  | [optional]
 **propertylist** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**SamlConfigurationInformations**](SamlConfigurationInformations.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

