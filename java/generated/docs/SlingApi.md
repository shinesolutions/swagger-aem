# SlingApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config.{runmode}/org.apache.felix.http | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config.{runmode}/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config.{runmode}/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config.{runmode}/org.apache.sling.security.impl.ReferrerFilter | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(runmode, name)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.deleteAgent(runmode, name);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#deleteAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.deleteNode(path, name);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.getAgent(runmode, name);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAgents"></a>
# **getAgents**
> String getAgents(runmode)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
try {
    String result = apiInstance.getAgents(runmode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getAgents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> getNode(path, name)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.getNode(path, name);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getPackage"></a>
# **getPackage**
> File getPackage(group, name, version)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String group = "group_example"; // String | 
String name = "name_example"; // String | 
String version = "version_example"; // String | 
try {
    File result = apiInstance.getPackage(group, name, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  |
 **name** | **String**|  |
 **version** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getPackageFilter"></a>
# **getPackageFilter**
> String getPackageFilter(group, name, version)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String group = "group_example"; // String | 
String name = "name_example"; // String | 
String version = "version_example"; // String | 
try {
    String result = apiInstance.getPackageFilter(group, name, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getPackageFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  |
 **name** | **String**|  |
 **version** | **String**|  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, jcrprimaryType, jcrcontentcqname, jcrcontentjcrtitle, jcrcontentjcrdescription, jcrcontentslingresourceType, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttransportPassword, jcrcontentlogLevel, jcrcontentnoVersioning, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentretryDelay, jcrcontentserializationType, jcrcontentjcrmixinTypes, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentreverseReplication, operation)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
String name = "name_example"; // String | 
String jcrprimaryType = "jcrprimaryType_example"; // String | 
String jcrcontentcqname = "jcrcontentcqname_example"; // String | 
String jcrcontentjcrtitle = "jcrcontentjcrtitle_example"; // String | 
String jcrcontentjcrdescription = "jcrcontentjcrdescription_example"; // String | 
String jcrcontentslingresourceType = "jcrcontentslingresourceType_example"; // String | 
String jcrcontenttransportUri = "jcrcontenttransportUri_example"; // String | 
String jcrcontenttransportUser = "jcrcontenttransportUser_example"; // String | 
String jcrcontenttransportPassword = "jcrcontenttransportPassword_example"; // String | 
String jcrcontentlogLevel = "jcrcontentlogLevel_example"; // String | 
Boolean jcrcontentnoVersioning = true; // Boolean | 
List<String> jcrcontentprotocolHTTPHeaders = Arrays.asList("jcrcontentprotocolHTTPHeaders_example"); // List<String> | 
String jcrcontentprotocolHTTPHeadersTypeHint = "jcrcontentprotocolHTTPHeadersTypeHint_example"; // String | 
String jcrcontentprotocolHTTPMethod = "jcrcontentprotocolHTTPMethod_example"; // String | 
String jcrcontentretryDelay = "jcrcontentretryDelay_example"; // String | 
String jcrcontentserializationType = "jcrcontentserializationType_example"; // String | 
String jcrcontentjcrmixinTypes = "jcrcontentjcrmixinTypes_example"; // String | 
Boolean jcrcontenttriggerReceive = true; // Boolean | 
Boolean jcrcontenttriggerSpecific = true; // Boolean | 
String jcrcontentcqtemplate = "jcrcontentcqtemplate_example"; // String | 
Boolean jcrcontentenabled = true; // Boolean | 
Boolean jcrcontentreverseReplication = true; // Boolean | 
String operation = "operation_example"; // String | 
try {
    apiInstance.postAgent(runmode, name, jcrprimaryType, jcrcontentcqname, jcrcontentjcrtitle, jcrcontentjcrdescription, jcrcontentslingresourceType, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttransportPassword, jcrcontentlogLevel, jcrcontentnoVersioning, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentretryDelay, jcrcontentserializationType, jcrcontentjcrmixinTypes, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentreverseReplication, operation);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **name** | **String**|  |
 **jcrprimaryType** | **String**|  | [optional]
 **jcrcontentcqname** | **String**|  | [optional]
 **jcrcontentjcrtitle** | **String**|  | [optional]
 **jcrcontentjcrdescription** | **String**|  | [optional]
 **jcrcontentslingresourceType** | **String**|  | [optional]
 **jcrcontenttransportUri** | **String**|  | [optional]
 **jcrcontenttransportUser** | **String**|  | [optional]
 **jcrcontenttransportPassword** | **String**|  | [optional]
 **jcrcontentlogLevel** | **String**|  | [optional]
 **jcrcontentnoVersioning** | **Boolean**|  | [optional]
 **jcrcontentprotocolHTTPHeaders** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **jcrcontentprotocolHTTPHeadersTypeHint** | **String**|  | [optional]
 **jcrcontentprotocolHTTPMethod** | **String**|  | [optional]
 **jcrcontentretryDelay** | **String**|  | [optional]
 **jcrcontentserializationType** | **String**|  | [optional]
 **jcrcontentjcrmixinTypes** | **String**|  | [optional]
 **jcrcontenttriggerReceive** | **Boolean**|  | [optional]
 **jcrcontenttriggerSpecific** | **Boolean**|  | [optional]
 **jcrcontentcqtemplate** | **String**|  | [optional]
 **jcrcontentenabled** | **Boolean**|  | [optional]
 **jcrcontentreverseReplication** | **Boolean**|  | [optional]
 **operation** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profilegivenName)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String authorizableId = "authorizableId_example"; // String | 
String intermediatePath = "intermediatePath_example"; // String | 
String createUser = "createUser_example"; // String | 
String createGroup = "createGroup_example"; // String | 
String reppassword = "reppassword_example"; // String | 
String profilegivenName = "profilegivenName_example"; // String | 
try {
    String result = apiInstance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profilegivenName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postAuthorizables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  |
 **intermediatePath** | **String**|  |
 **createUser** | **String**|  | [optional]
 **createGroup** | **String**|  | [optional]
 **reppassword** | **String**|  | [optional]
 **profilegivenName** | **String**|  | [optional]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(runmode, orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
Boolean orgApacheFelixHttpsNio = true; // Boolean | 
String orgApacheFelixHttpsNioTypeHint = "orgApacheFelixHttpsNioTypeHint_example"; // String | 
String orgApacheFelixHttpsKeystore = "orgApacheFelixHttpsKeystore_example"; // String | 
String orgApacheFelixHttpsKeystoreTypeHint = "orgApacheFelixHttpsKeystoreTypeHint_example"; // String | 
String orgApacheFelixHttpsKeystorePassword = "orgApacheFelixHttpsKeystorePassword_example"; // String | 
String orgApacheFelixHttpsKeystorePasswordTypeHint = "orgApacheFelixHttpsKeystorePasswordTypeHint_example"; // String | 
String orgApacheFelixHttpsKeystoreKey = "orgApacheFelixHttpsKeystoreKey_example"; // String | 
String orgApacheFelixHttpsKeystoreKeyTypeHint = "orgApacheFelixHttpsKeystoreKeyTypeHint_example"; // String | 
String orgApacheFelixHttpsKeystoreKeyPassword = "orgApacheFelixHttpsKeystoreKeyPassword_example"; // String | 
String orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = "orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example"; // String | 
String orgApacheFelixHttpsTruststore = "orgApacheFelixHttpsTruststore_example"; // String | 
String orgApacheFelixHttpsTruststoreTypeHint = "orgApacheFelixHttpsTruststoreTypeHint_example"; // String | 
String orgApacheFelixHttpsTruststorePassword = "orgApacheFelixHttpsTruststorePassword_example"; // String | 
String orgApacheFelixHttpsTruststorePasswordTypeHint = "orgApacheFelixHttpsTruststorePasswordTypeHint_example"; // String | 
String orgApacheFelixHttpsClientcertificate = "orgApacheFelixHttpsClientcertificate_example"; // String | 
String orgApacheFelixHttpsClientcertificateTypeHint = "orgApacheFelixHttpsClientcertificateTypeHint_example"; // String | 
Boolean orgApacheFelixHttpsEnable = true; // Boolean | 
String orgApacheFelixHttpsEnableTypeHint = "orgApacheFelixHttpsEnableTypeHint_example"; // String | 
String orgOsgiServiceHttpPortSecure = "orgOsgiServiceHttpPortSecure_example"; // String | 
String orgOsgiServiceHttpPortSecureTypeHint = "orgOsgiServiceHttpPortSecureTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheFelixJettyBasedHttpService(runmode, orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheFelixJettyBasedHttpService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **orgApacheFelixHttpsNio** | **Boolean**|  | [optional]
 **orgApacheFelixHttpsNioTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystore** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystoreTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystorePassword** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKey** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsTruststore** | **String**|  | [optional]
 **orgApacheFelixHttpsTruststoreTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsTruststorePassword** | **String**|  | [optional]
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsClientcertificate** | **String**|  | [optional]
 **orgApacheFelixHttpsClientcertificateTypeHint** | **String**|  | [optional]
 **orgApacheFelixHttpsEnable** | **Boolean**|  | [optional]
 **orgApacheFelixHttpsEnableTypeHint** | **String**|  | [optional]
 **orgOsgiServiceHttpPortSecure** | **String**|  | [optional]
 **orgOsgiServiceHttpPortSecureTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(runmode, alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
String alias = "alias_example"; // String | 
String aliasTypeHint = "aliasTypeHint_example"; // String | 
Boolean davCreateAbsoluteUri = true; // Boolean | 
String davCreateAbsoluteUriTypeHint = "davCreateAbsoluteUriTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheSlingDavExServlet(runmode, alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheSlingDavExServlet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **alias** | **String**|  | [optional]
 **aliasTypeHint** | **String**|  | [optional]
 **davCreateAbsoluteUri** | **Boolean**|  | [optional]
 **davCreateAbsoluteUriTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(runmode, jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
String jsonMaximumresults = "jsonMaximumresults_example"; // String | 
String jsonMaximumresultsTypeHint = "jsonMaximumresultsTypeHint_example"; // String | 
Boolean enableHtml = true; // Boolean | 
String enableHtmlTypeHint = "enableHtmlTypeHint_example"; // String | 
Boolean enableTxt = true; // Boolean | 
String enableTxtTypeHint = "enableTxtTypeHint_example"; // String | 
Boolean enableXml = true; // Boolean | 
String enableXmlTypeHint = "enableXmlTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheSlingGetServlet(runmode, jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheSlingGetServlet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **jsonMaximumresults** | **String**|  | [optional]
 **jsonMaximumresultsTypeHint** | **String**|  | [optional]
 **enableHtml** | **Boolean**|  | [optional]
 **enableHtmlTypeHint** | **String**|  | [optional]
 **enableTxt** | **Boolean**|  | [optional]
 **enableTxtTypeHint** | **String**|  | [optional]
 **enableXml** | **Boolean**|  | [optional]
 **enableXmlTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(runmode, allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
Boolean allowEmpty = true; // Boolean | 
String allowEmptyTypeHint = "allowEmptyTypeHint_example"; // String | 
String allowHosts = "allowHosts_example"; // String | 
String allowHostsTypeHint = "allowHostsTypeHint_example"; // String | 
String allowHostsRegexp = "allowHostsRegexp_example"; // String | 
String allowHostsRegexpTypeHint = "allowHostsRegexpTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheSlingReferrerFilter(runmode, allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheSlingReferrerFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **allowEmpty** | **Boolean**|  | [optional]
 **allowEmptyTypeHint** | **String**|  | [optional]
 **allowHosts** | **String**|  | [optional]
 **allowHostsTypeHint** | **String**|  | [optional]
 **allowHostsRegexp** | **String**|  | [optional]
 **allowHostsRegexpTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, addMembers)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
String name = "name_example"; // String | 
String addMembers = "addMembers_example"; // String | 
try {
    apiInstance.postNodeRw(path, name, addMembers);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postNodeRw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |
 **addMembers** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postPath"></a>
# **postPath**
> postPath(path, jcrprimaryType, name)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
String jcrprimaryType = "jcrprimaryType_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.postPath(path, jcrprimaryType, name);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **jcrprimaryType** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postQuery"></a>
# **postQuery**
> String postQuery(path, pLimit, _1Property, _1PropertyValue)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
BigDecimal pLimit = new BigDecimal(); // BigDecimal | 
String _1Property = "_1Property_example"; // String | 
String _1PropertyValue = "_1PropertyValue_example"; // String | 
try {
    String result = apiInstance.postQuery(path, pLimit, _1Property, _1PropertyValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **pLimit** | **BigDecimal**|  |
 **_1Property** | **String**|  |
 **_1PropertyValue** | **String**|  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTreeActivation"></a>
# **postTreeActivation**
> postTreeActivation(ignoredeactivated, onlymodified, path)



### Example
```java
// Import classes:
//import com.shinesolutions.swaggeraem4j.ApiClient;
//import com.shinesolutions.swaggeraem4j.ApiException;
//import com.shinesolutions.swaggeraem4j.Configuration;
//import com.shinesolutions.swaggeraem4j.auth.*;
//import com.shinesolutions.swaggeraem4j.api.SlingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: aemAuth
HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
aemAuth.setUsername("YOUR USERNAME");
aemAuth.setPassword("YOUR PASSWORD");

SlingApi apiInstance = new SlingApi();
Boolean ignoredeactivated = true; // Boolean | 
Boolean onlymodified = true; // Boolean | 
String path = "path_example"; // String | 
try {
    apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postTreeActivation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **Boolean**|  |
 **onlymodified** | **Boolean**|  |
 **path** | **String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

