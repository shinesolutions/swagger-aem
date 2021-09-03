# ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 



## getAemProductInfo

> List&lt;String&gt; getAemProductInfo()



### Example

```java
// Import classes:
//import org.openapitools.client.api.ConsoleApi;

ConsoleApi apiInstance = new ConsoleApi();
try {
    List<String> result = apiInstance.getAemProductInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsoleApi#getAemProductInfo");
    e.printStackTrace();
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


## getBundleInfo

> BundleInfo getBundleInfo(name)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ConsoleApi;

ConsoleApi apiInstance = new ConsoleApi();
String name = null; // String | 
try {
    BundleInfo result = apiInstance.getBundleInfo(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsoleApi#getBundleInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [default to null]

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConfigMgr

> String getConfigMgr()



### Example

```java
// Import classes:
//import org.openapitools.client.api.ConsoleApi;

ConsoleApi apiInstance = new ConsoleApi();
try {
    String result = apiInstance.getConfigMgr();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsoleApi#getConfigMgr");
    e.printStackTrace();
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


## postBundle

> postBundle(name, action)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ConsoleApi;

ConsoleApi apiInstance = new ConsoleApi();
String name = null; // String | 
String action = null; // String | 
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
 **name** | **String**|  | [default to null]
 **action** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postJmxRepository

> postJmxRepository(action)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ConsoleApi;

ConsoleApi apiInstance = new ConsoleApi();
String action = null; // String | 
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
 **action** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postSamlConfiguration

> SamlConfigurationInfo postSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ConsoleApi;

ConsoleApi apiInstance = new ConsoleApi();
Boolean post = null; // Boolean | 
Boolean apply = null; // Boolean | 
Boolean delete = null; // Boolean | 
String action = null; // String | 
String location = null; // String | 
List<String> path = null; // List<String> | 
Integer serviceRanking = null; // Integer | 
String idpUrl = null; // String | 
String idpCertAlias = null; // String | 
Boolean idpHttpRedirect = null; // Boolean | 
String serviceProviderEntityId = null; // String | 
String assertionConsumerServiceURL = null; // String | 
String spPrivateKeyAlias = null; // String | 
String keyStorePassword = null; // String | 
String defaultRedirectUrl = null; // String | 
String userIDAttribute = null; // String | 
Boolean useEncryption = null; // Boolean | 
Boolean createUser = null; // Boolean | 
Boolean addGroupMemberships = null; // Boolean | 
String groupMembershipAttribute = null; // String | 
List<String> defaultGroups = null; // List<String> | 
String nameIdFormat = null; // String | 
List<String> synchronizeAttributes = null; // List<String> | 
Boolean handleLogout = null; // Boolean | 
String logoutUrl = null; // String | 
Integer clockTolerance = null; // Integer | 
String digestMethod = null; // String | 
String signatureMethod = null; // String | 
String userIntermediatePath = null; // String | 
List<String> propertylist = null; // List<String> | 
try {
    SamlConfigurationInfo result = apiInstance.postSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsoleApi#postSamlConfiguration");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **Boolean**|  | [optional] [default to null]
 **apply** | **Boolean**|  | [optional] [default to null]
 **delete** | **Boolean**|  | [optional] [default to null]
 **action** | **String**|  | [optional] [default to null]
 **location** | **String**|  | [optional] [default to null]
 **path** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **serviceRanking** | **Integer**|  | [optional] [default to null]
 **idpUrl** | **String**|  | [optional] [default to null]
 **idpCertAlias** | **String**|  | [optional] [default to null]
 **idpHttpRedirect** | **Boolean**|  | [optional] [default to null]
 **serviceProviderEntityId** | **String**|  | [optional] [default to null]
 **assertionConsumerServiceURL** | **String**|  | [optional] [default to null]
 **spPrivateKeyAlias** | **String**|  | [optional] [default to null]
 **keyStorePassword** | **String**|  | [optional] [default to null]
 **defaultRedirectUrl** | **String**|  | [optional] [default to null]
 **userIDAttribute** | **String**|  | [optional] [default to null]
 **useEncryption** | **Boolean**|  | [optional] [default to null]
 **createUser** | **Boolean**|  | [optional] [default to null]
 **addGroupMemberships** | **Boolean**|  | [optional] [default to null]
 **groupMembershipAttribute** | **String**|  | [optional] [default to null]
 **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **nameIdFormat** | **String**|  | [optional] [default to null]
 **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **handleLogout** | **Boolean**|  | [optional] [default to null]
 **logoutUrl** | **String**|  | [optional] [default to null]
 **clockTolerance** | **Integer**|  | [optional] [default to null]
 **digestMethod** | **String**|  | [optional] [default to null]
 **signatureMethod** | **String**|  | [optional] [default to null]
 **userIntermediatePath** | **String**|  | [optional] [default to null]
 **propertylist** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

