# SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(runmode, name)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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
 - **Accept**: Not defined

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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
 - **Accept**: Not defined

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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
 - **Accept**: Not defined

<a name="getAgents"></a>
# **getAgents**
> String getAgents(runmode)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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

<a name="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String intermediatePath = "intermediatePath_example"; // String | 
String authorizableId = "authorizableId_example"; // String | 
try {
    KeystoreInfo result = apiInstance.getAuthorizableKeystore(intermediatePath, authorizableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getAuthorizableKeystore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  |
 **authorizableId** | **String**|  |

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getKeystore"></a>
# **getKeystore**
> File getKeystore(intermediatePath, authorizableId)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String intermediatePath = "intermediatePath_example"; // String | 
String authorizableId = "authorizableId_example"; // String | 
try {
    File result = apiInstance.getKeystore(intermediatePath, authorizableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getKeystore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  |
 **authorizableId** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getNode"></a>
# **getNode**
> getNode(path, name)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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
 - **Accept**: Not defined

<a name="getPackage"></a>
# **getPackage**
> File getPackage(group, name, version)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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
//import org.openapitools.client.api.SlingApi;

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

<a name="getQuery"></a>
# **getQuery**
> String getQuery(path, pLimit, _1property, _1propertyValue)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
BigDecimal pLimit = new BigDecimal(); // BigDecimal | 
String _1property = "_1property_example"; // String | 
String _1propertyValue = "_1propertyValue_example"; // String | 
try {
    String result = apiInstance.getQuery(path, pLimit, _1property, _1propertyValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **pLimit** | **BigDecimal**|  |
 **_1property** | **String**|  |
 **_1propertyValue** | **String**|  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTruststore"></a>
# **getTruststore**
> File getTruststore()



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
try {
    File result = apiInstance.getTruststore();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getTruststore");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getTruststoreInfo"></a>
# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
try {
    TruststoreInfo result = apiInstance.getTruststoreInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#getTruststoreInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, jcrcontentcqdistribute, jcrcontentcqdistributeTypeHint, jcrcontentcqname, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentjcrdescription, jcrcontentjcrlastModified, jcrcontentjcrlastModifiedBy, jcrcontentjcrmixinTypes, jcrcontentjcrtitle, jcrcontentlogLevel, jcrcontentnoStatusUpdate, jcrcontentnoVersioning, jcrcontentprotocolConnectTimeout, jcrcontentprotocolHTTPConnectionClosed, jcrcontentprotocolHTTPExpired, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentprotocolHTTPSRelaxed, jcrcontentprotocolInterface, jcrcontentprotocolSocketTimeout, jcrcontentprotocolVersion, jcrcontentproxyNTLMDomain, jcrcontentproxyNTLMHost, jcrcontentproxyHost, jcrcontentproxyPassword, jcrcontentproxyPort, jcrcontentproxyUser, jcrcontentqueueBatchMaxSize, jcrcontentqueueBatchMode, jcrcontentqueueBatchWaitTime, jcrcontentretryDelay, jcrcontentreverseReplication, jcrcontentserializationType, jcrcontentslingresourceType, jcrcontentssl, jcrcontenttransportNTLMDomain, jcrcontenttransportNTLMHost, jcrcontenttransportPassword, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttriggerDistribute, jcrcontenttriggerModified, jcrcontenttriggerOnOffTime, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentuserId, jcrprimaryType, operation)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String runmode = "runmode_example"; // String | 
String name = "name_example"; // String | 
Boolean jcrcontentcqdistribute = true; // Boolean | 
String jcrcontentcqdistributeTypeHint = "jcrcontentcqdistributeTypeHint_example"; // String | 
String jcrcontentcqname = "jcrcontentcqname_example"; // String | 
String jcrcontentcqtemplate = "jcrcontentcqtemplate_example"; // String | 
Boolean jcrcontentenabled = true; // Boolean | 
String jcrcontentjcrdescription = "jcrcontentjcrdescription_example"; // String | 
String jcrcontentjcrlastModified = "jcrcontentjcrlastModified_example"; // String | 
String jcrcontentjcrlastModifiedBy = "jcrcontentjcrlastModifiedBy_example"; // String | 
String jcrcontentjcrmixinTypes = "jcrcontentjcrmixinTypes_example"; // String | 
String jcrcontentjcrtitle = "jcrcontentjcrtitle_example"; // String | 
String jcrcontentlogLevel = "jcrcontentlogLevel_example"; // String | 
Boolean jcrcontentnoStatusUpdate = true; // Boolean | 
Boolean jcrcontentnoVersioning = true; // Boolean | 
BigDecimal jcrcontentprotocolConnectTimeout = new BigDecimal(); // BigDecimal | 
Boolean jcrcontentprotocolHTTPConnectionClosed = true; // Boolean | 
String jcrcontentprotocolHTTPExpired = "jcrcontentprotocolHTTPExpired_example"; // String | 
List<String> jcrcontentprotocolHTTPHeaders = Arrays.asList("jcrcontentprotocolHTTPHeaders_example"); // List<String> | 
String jcrcontentprotocolHTTPHeadersTypeHint = "jcrcontentprotocolHTTPHeadersTypeHint_example"; // String | 
String jcrcontentprotocolHTTPMethod = "jcrcontentprotocolHTTPMethod_example"; // String | 
Boolean jcrcontentprotocolHTTPSRelaxed = true; // Boolean | 
String jcrcontentprotocolInterface = "jcrcontentprotocolInterface_example"; // String | 
BigDecimal jcrcontentprotocolSocketTimeout = new BigDecimal(); // BigDecimal | 
String jcrcontentprotocolVersion = "jcrcontentprotocolVersion_example"; // String | 
String jcrcontentproxyNTLMDomain = "jcrcontentproxyNTLMDomain_example"; // String | 
String jcrcontentproxyNTLMHost = "jcrcontentproxyNTLMHost_example"; // String | 
String jcrcontentproxyHost = "jcrcontentproxyHost_example"; // String | 
String jcrcontentproxyPassword = "jcrcontentproxyPassword_example"; // String | 
BigDecimal jcrcontentproxyPort = new BigDecimal(); // BigDecimal | 
String jcrcontentproxyUser = "jcrcontentproxyUser_example"; // String | 
BigDecimal jcrcontentqueueBatchMaxSize = new BigDecimal(); // BigDecimal | 
String jcrcontentqueueBatchMode = "jcrcontentqueueBatchMode_example"; // String | 
BigDecimal jcrcontentqueueBatchWaitTime = new BigDecimal(); // BigDecimal | 
String jcrcontentretryDelay = "jcrcontentretryDelay_example"; // String | 
Boolean jcrcontentreverseReplication = true; // Boolean | 
String jcrcontentserializationType = "jcrcontentserializationType_example"; // String | 
String jcrcontentslingresourceType = "jcrcontentslingresourceType_example"; // String | 
String jcrcontentssl = "jcrcontentssl_example"; // String | 
String jcrcontenttransportNTLMDomain = "jcrcontenttransportNTLMDomain_example"; // String | 
String jcrcontenttransportNTLMHost = "jcrcontenttransportNTLMHost_example"; // String | 
String jcrcontenttransportPassword = "jcrcontenttransportPassword_example"; // String | 
String jcrcontenttransportUri = "jcrcontenttransportUri_example"; // String | 
String jcrcontenttransportUser = "jcrcontenttransportUser_example"; // String | 
Boolean jcrcontenttriggerDistribute = true; // Boolean | 
Boolean jcrcontenttriggerModified = true; // Boolean | 
Boolean jcrcontenttriggerOnOffTime = true; // Boolean | 
Boolean jcrcontenttriggerReceive = true; // Boolean | 
Boolean jcrcontenttriggerSpecific = true; // Boolean | 
String jcrcontentuserId = "jcrcontentuserId_example"; // String | 
String jcrprimaryType = "jcrprimaryType_example"; // String | 
String operation = "operation_example"; // String | 
try {
    apiInstance.postAgent(runmode, name, jcrcontentcqdistribute, jcrcontentcqdistributeTypeHint, jcrcontentcqname, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentjcrdescription, jcrcontentjcrlastModified, jcrcontentjcrlastModifiedBy, jcrcontentjcrmixinTypes, jcrcontentjcrtitle, jcrcontentlogLevel, jcrcontentnoStatusUpdate, jcrcontentnoVersioning, jcrcontentprotocolConnectTimeout, jcrcontentprotocolHTTPConnectionClosed, jcrcontentprotocolHTTPExpired, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentprotocolHTTPSRelaxed, jcrcontentprotocolInterface, jcrcontentprotocolSocketTimeout, jcrcontentprotocolVersion, jcrcontentproxyNTLMDomain, jcrcontentproxyNTLMHost, jcrcontentproxyHost, jcrcontentproxyPassword, jcrcontentproxyPort, jcrcontentproxyUser, jcrcontentqueueBatchMaxSize, jcrcontentqueueBatchMode, jcrcontentqueueBatchWaitTime, jcrcontentretryDelay, jcrcontentreverseReplication, jcrcontentserializationType, jcrcontentslingresourceType, jcrcontentssl, jcrcontenttransportNTLMDomain, jcrcontenttransportNTLMHost, jcrcontenttransportPassword, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttriggerDistribute, jcrcontenttriggerModified, jcrcontenttriggerOnOffTime, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentuserId, jcrprimaryType, operation);
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
 **jcrcontentcqdistribute** | **Boolean**|  | [optional]
 **jcrcontentcqdistributeTypeHint** | **String**|  | [optional]
 **jcrcontentcqname** | **String**|  | [optional]
 **jcrcontentcqtemplate** | **String**|  | [optional]
 **jcrcontentenabled** | **Boolean**|  | [optional]
 **jcrcontentjcrdescription** | **String**|  | [optional]
 **jcrcontentjcrlastModified** | **String**|  | [optional]
 **jcrcontentjcrlastModifiedBy** | **String**|  | [optional]
 **jcrcontentjcrmixinTypes** | **String**|  | [optional]
 **jcrcontentjcrtitle** | **String**|  | [optional]
 **jcrcontentlogLevel** | **String**|  | [optional]
 **jcrcontentnoStatusUpdate** | **Boolean**|  | [optional]
 **jcrcontentnoVersioning** | **Boolean**|  | [optional]
 **jcrcontentprotocolConnectTimeout** | **BigDecimal**|  | [optional]
 **jcrcontentprotocolHTTPConnectionClosed** | **Boolean**|  | [optional]
 **jcrcontentprotocolHTTPExpired** | **String**|  | [optional]
 **jcrcontentprotocolHTTPHeaders** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **jcrcontentprotocolHTTPHeadersTypeHint** | **String**|  | [optional]
 **jcrcontentprotocolHTTPMethod** | **String**|  | [optional]
 **jcrcontentprotocolHTTPSRelaxed** | **Boolean**|  | [optional]
 **jcrcontentprotocolInterface** | **String**|  | [optional]
 **jcrcontentprotocolSocketTimeout** | **BigDecimal**|  | [optional]
 **jcrcontentprotocolVersion** | **String**|  | [optional]
 **jcrcontentproxyNTLMDomain** | **String**|  | [optional]
 **jcrcontentproxyNTLMHost** | **String**|  | [optional]
 **jcrcontentproxyHost** | **String**|  | [optional]
 **jcrcontentproxyPassword** | **String**|  | [optional]
 **jcrcontentproxyPort** | **BigDecimal**|  | [optional]
 **jcrcontentproxyUser** | **String**|  | [optional]
 **jcrcontentqueueBatchMaxSize** | **BigDecimal**|  | [optional]
 **jcrcontentqueueBatchMode** | **String**|  | [optional]
 **jcrcontentqueueBatchWaitTime** | **BigDecimal**|  | [optional]
 **jcrcontentretryDelay** | **String**|  | [optional]
 **jcrcontentreverseReplication** | **Boolean**|  | [optional]
 **jcrcontentserializationType** | **String**|  | [optional]
 **jcrcontentslingresourceType** | **String**|  | [optional]
 **jcrcontentssl** | **String**|  | [optional]
 **jcrcontenttransportNTLMDomain** | **String**|  | [optional]
 **jcrcontenttransportNTLMHost** | **String**|  | [optional]
 **jcrcontenttransportPassword** | **String**|  | [optional]
 **jcrcontenttransportUri** | **String**|  | [optional]
 **jcrcontenttransportUser** | **String**|  | [optional]
 **jcrcontenttriggerDistribute** | **Boolean**|  | [optional]
 **jcrcontenttriggerModified** | **Boolean**|  | [optional]
 **jcrcontenttriggerOnOffTime** | **Boolean**|  | [optional]
 **jcrcontenttriggerReceive** | **Boolean**|  | [optional]
 **jcrcontenttriggerSpecific** | **Boolean**|  | [optional]
 **jcrcontentuserId** | **String**|  | [optional]
 **jcrprimaryType** | **String**|  | [optional]
 **operation** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postAuthorizableKeystore"></a>
# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String intermediatePath = "intermediatePath_example"; // String | 
String authorizableId = "authorizableId_example"; // String | 
String operation = "operation_example"; // String | 
String currentPassword = "currentPassword_example"; // String | 
String newPassword = "newPassword_example"; // String | 
String rePassword = "rePassword_example"; // String | 
String keyPassword = "keyPassword_example"; // String | 
String keyStorePass = "keyStorePass_example"; // String | 
String alias = "alias_example"; // String | 
String newAlias = "newAlias_example"; // String | 
String removeAlias = "removeAlias_example"; // String | 
File certChain = null; // File | 
File pk = null; // File | 
File keyStore = null; // File | 
try {
    KeystoreInfo result = apiInstance.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postAuthorizableKeystore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  |
 **authorizableId** | **String**|  |
 **operation** | **String**|  | [optional]
 **currentPassword** | **String**|  | [optional]
 **newPassword** | **String**|  | [optional]
 **rePassword** | **String**|  | [optional]
 **keyPassword** | **String**|  | [optional]
 **keyStorePass** | **String**|  | [optional]
 **alias** | **String**|  | [optional]
 **newAlias** | **String**|  | [optional]
 **removeAlias** | **String**|  | [optional]
 **certChain** | **File**|  | [optional] [default to null]
 **pk** | **File**|  | [optional] [default to null]
 **keyStore** | **File**|  | [optional] [default to null]

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profilegivenName)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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

<a name="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String keyStorePassword = "keyStorePassword_example"; // String | 
String keyStorePasswordTypeHint = "keyStorePasswordTypeHint_example"; // String | 
Integer serviceRanking = 56; // Integer | 
String serviceRankingTypeHint = "serviceRankingTypeHint_example"; // String | 
Boolean idpHttpRedirect = true; // Boolean | 
String idpHttpRedirectTypeHint = "idpHttpRedirectTypeHint_example"; // String | 
Boolean createUser = true; // Boolean | 
String createUserTypeHint = "createUserTypeHint_example"; // String | 
String defaultRedirectUrl = "defaultRedirectUrl_example"; // String | 
String defaultRedirectUrlTypeHint = "defaultRedirectUrlTypeHint_example"; // String | 
String userIDAttribute = "userIDAttribute_example"; // String | 
String userIDAttributeTypeHint = "userIDAttributeTypeHint_example"; // String | 
List<String> defaultGroups = Arrays.asList("defaultGroups_example"); // List<String> | 
String defaultGroupsTypeHint = "defaultGroupsTypeHint_example"; // String | 
String idpCertAlias = "idpCertAlias_example"; // String | 
String idpCertAliasTypeHint = "idpCertAliasTypeHint_example"; // String | 
Boolean addGroupMemberships = true; // Boolean | 
String addGroupMembershipsTypeHint = "addGroupMembershipsTypeHint_example"; // String | 
List<String> path = Arrays.asList("path_example"); // List<String> | 
String pathTypeHint = "pathTypeHint_example"; // String | 
List<String> synchronizeAttributes = Arrays.asList("synchronizeAttributes_example"); // List<String> | 
String synchronizeAttributesTypeHint = "synchronizeAttributesTypeHint_example"; // String | 
Integer clockTolerance = 56; // Integer | 
String clockToleranceTypeHint = "clockToleranceTypeHint_example"; // String | 
String groupMembershipAttribute = "groupMembershipAttribute_example"; // String | 
String groupMembershipAttributeTypeHint = "groupMembershipAttributeTypeHint_example"; // String | 
String idpUrl = "idpUrl_example"; // String | 
String idpUrlTypeHint = "idpUrlTypeHint_example"; // String | 
String logoutUrl = "logoutUrl_example"; // String | 
String logoutUrlTypeHint = "logoutUrlTypeHint_example"; // String | 
String serviceProviderEntityId = "serviceProviderEntityId_example"; // String | 
String serviceProviderEntityIdTypeHint = "serviceProviderEntityIdTypeHint_example"; // String | 
String assertionConsumerServiceURL = "assertionConsumerServiceURL_example"; // String | 
String assertionConsumerServiceURLTypeHint = "assertionConsumerServiceURLTypeHint_example"; // String | 
Boolean handleLogout = true; // Boolean | 
String handleLogoutTypeHint = "handleLogoutTypeHint_example"; // String | 
String spPrivateKeyAlias = "spPrivateKeyAlias_example"; // String | 
String spPrivateKeyAliasTypeHint = "spPrivateKeyAliasTypeHint_example"; // String | 
Boolean useEncryption = true; // Boolean | 
String useEncryptionTypeHint = "useEncryptionTypeHint_example"; // String | 
String nameIdFormat = "nameIdFormat_example"; // String | 
String nameIdFormatTypeHint = "nameIdFormatTypeHint_example"; // String | 
String digestMethod = "digestMethod_example"; // String | 
String digestMethodTypeHint = "digestMethodTypeHint_example"; // String | 
String signatureMethod = "signatureMethod_example"; // String | 
String signatureMethodTypeHint = "signatureMethodTypeHint_example"; // String | 
String userIntermediatePath = "userIntermediatePath_example"; // String | 
String userIntermediatePathTypeHint = "userIntermediatePathTypeHint_example"; // String | 
try {
    apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigAdobeGraniteSamlAuthenticationHandler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **String**|  | [optional]
 **keyStorePasswordTypeHint** | **String**|  | [optional]
 **serviceRanking** | **Integer**|  | [optional]
 **serviceRankingTypeHint** | **String**|  | [optional]
 **idpHttpRedirect** | **Boolean**|  | [optional]
 **idpHttpRedirectTypeHint** | **String**|  | [optional]
 **createUser** | **Boolean**|  | [optional]
 **createUserTypeHint** | **String**|  | [optional]
 **defaultRedirectUrl** | **String**|  | [optional]
 **defaultRedirectUrlTypeHint** | **String**|  | [optional]
 **userIDAttribute** | **String**|  | [optional]
 **userIDAttributeTypeHint** | **String**|  | [optional]
 **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **defaultGroupsTypeHint** | **String**|  | [optional]
 **idpCertAlias** | **String**|  | [optional]
 **idpCertAliasTypeHint** | **String**|  | [optional]
 **addGroupMemberships** | **Boolean**|  | [optional]
 **addGroupMembershipsTypeHint** | **String**|  | [optional]
 **path** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **pathTypeHint** | **String**|  | [optional]
 **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **synchronizeAttributesTypeHint** | **String**|  | [optional]
 **clockTolerance** | **Integer**|  | [optional]
 **clockToleranceTypeHint** | **String**|  | [optional]
 **groupMembershipAttribute** | **String**|  | [optional]
 **groupMembershipAttributeTypeHint** | **String**|  | [optional]
 **idpUrl** | **String**|  | [optional]
 **idpUrlTypeHint** | **String**|  | [optional]
 **logoutUrl** | **String**|  | [optional]
 **logoutUrlTypeHint** | **String**|  | [optional]
 **serviceProviderEntityId** | **String**|  | [optional]
 **serviceProviderEntityIdTypeHint** | **String**|  | [optional]
 **assertionConsumerServiceURL** | **String**|  | [optional]
 **assertionConsumerServiceURLTypeHint** | **String**|  | [optional]
 **handleLogout** | **Boolean**|  | [optional]
 **handleLogoutTypeHint** | **String**|  | [optional]
 **spPrivateKeyAlias** | **String**|  | [optional]
 **spPrivateKeyAliasTypeHint** | **String**|  | [optional]
 **useEncryption** | **Boolean**|  | [optional]
 **useEncryptionTypeHint** | **String**|  | [optional]
 **nameIdFormat** | **String**|  | [optional]
 **nameIdFormatTypeHint** | **String**|  | [optional]
 **digestMethod** | **String**|  | [optional]
 **digestMethodTypeHint** | **String**|  | [optional]
 **signatureMethod** | **String**|  | [optional]
 **signatureMethodTypeHint** | **String**|  | [optional]
 **userIntermediatePath** | **String**|  | [optional]
 **userIntermediatePathTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
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
    apiInstance.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheFelixJettyBasedHttpService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
 - **Accept**: Not defined

<a name="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String proxyHost = "proxyHost_example"; // String | 
String proxyHostTypeHint = "proxyHostTypeHint_example"; // String | 
Integer proxyPort = 56; // Integer | 
String proxyPortTypeHint = "proxyPortTypeHint_example"; // String | 
List<String> proxyExceptions = Arrays.asList("proxyExceptions_example"); // List<String> | 
String proxyExceptionsTypeHint = "proxyExceptionsTypeHint_example"; // String | 
Boolean proxyEnabled = true; // Boolean | 
String proxyEnabledTypeHint = "proxyEnabledTypeHint_example"; // String | 
String proxyUser = "proxyUser_example"; // String | 
String proxyUserTypeHint = "proxyUserTypeHint_example"; // String | 
String proxyPassword = "proxyPassword_example"; // String | 
String proxyPasswordTypeHint = "proxyPasswordTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheHttpComponentsProxyConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **String**|  | [optional]
 **proxyHostTypeHint** | **String**|  | [optional]
 **proxyPort** | **Integer**|  | [optional]
 **proxyPortTypeHint** | **String**|  | [optional]
 **proxyExceptions** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **proxyExceptionsTypeHint** | **String**|  | [optional]
 **proxyEnabled** | **Boolean**|  | [optional]
 **proxyEnabledTypeHint** | **String**|  | [optional]
 **proxyUser** | **String**|  | [optional]
 **proxyUserTypeHint** | **String**|  | [optional]
 **proxyPassword** | **String**|  | [optional]
 **proxyPasswordTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String alias = "alias_example"; // String | 
String aliasTypeHint = "aliasTypeHint_example"; // String | 
Boolean davCreateAbsoluteUri = true; // Boolean | 
String davCreateAbsoluteUriTypeHint = "davCreateAbsoluteUriTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheSlingDavExServlet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
 - **Accept**: Not defined

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String jsonMaximumresults = "jsonMaximumresults_example"; // String | 
String jsonMaximumresultsTypeHint = "jsonMaximumresultsTypeHint_example"; // String | 
Boolean enableHtml = true; // Boolean | 
String enableHtmlTypeHint = "enableHtmlTypeHint_example"; // String | 
Boolean enableTxt = true; // Boolean | 
String enableTxtTypeHint = "enableTxtTypeHint_example"; // String | 
Boolean enableXml = true; // Boolean | 
String enableXmlTypeHint = "enableXmlTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheSlingGetServlet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
 - **Accept**: Not defined

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
Boolean allowEmpty = true; // Boolean | 
String allowEmptyTypeHint = "allowEmptyTypeHint_example"; // String | 
String allowHosts = "allowHosts_example"; // String | 
String allowHostsTypeHint = "allowHostsTypeHint_example"; // String | 
String allowHostsRegexp = "allowHostsRegexp_example"; // String | 
String allowHostsRegexpTypeHint = "allowHostsRegexpTypeHint_example"; // String | 
String filterMethods = "filterMethods_example"; // String | 
String filterMethodsTypeHint = "filterMethodsTypeHint_example"; // String | 
try {
    apiInstance.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigApacheSlingReferrerFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **Boolean**|  | [optional]
 **allowEmptyTypeHint** | **String**|  | [optional]
 **allowHosts** | **String**|  | [optional]
 **allowHostsTypeHint** | **String**|  | [optional]
 **allowHostsRegexp** | **String**|  | [optional]
 **allowHostsRegexpTypeHint** | **String**|  | [optional]
 **filterMethods** | **String**|  | [optional]
 **filterMethodsTypeHint** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postNode"></a>
# **postNode**
> postNode(path, name, operation, deleteAuthorizable, file)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
String name = "name_example"; // String | 
String operation = "operation_example"; // String | 
String deleteAuthorizable = "deleteAuthorizable_example"; // String | 
File file = null; // File | 
try {
    apiInstance.postNode(path, name, operation, deleteAuthorizable, file);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |
 **operation** | **String**|  | [optional]
 **deleteAuthorizable** | **String**|  | [optional]
 **file** | **File**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, addMembers)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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
 - **Accept**: Not defined

<a name="postPath"></a>
# **postPath**
> postPath(path, jcrprimaryType, name)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

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
 - **Accept**: Not defined

<a name="postQuery"></a>
# **postQuery**
> String postQuery(path, pLimit, _1property, _1propertyValue)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = "path_example"; // String | 
BigDecimal pLimit = new BigDecimal(); // BigDecimal | 
String _1property = "_1property_example"; // String | 
String _1propertyValue = "_1propertyValue_example"; // String | 
try {
    String result = apiInstance.postQuery(path, pLimit, _1property, _1propertyValue);
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
 **_1property** | **String**|  |
 **_1propertyValue** | **String**|  |

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
//import org.openapitools.client.api.SlingApi;

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
 - **Accept**: Not defined

<a name="postTruststore"></a>
# **postTruststore**
> String postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String operation = "operation_example"; // String | 
String newPassword = "newPassword_example"; // String | 
String rePassword = "rePassword_example"; // String | 
String keyStoreType = "keyStoreType_example"; // String | 
String removeAlias = "removeAlias_example"; // String | 
File certificate = null; // File | 
try {
    String result = apiInstance.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postTruststore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **String**|  | [optional]
 **newPassword** | **String**|  | [optional]
 **rePassword** | **String**|  | [optional]
 **keyStoreType** | **String**|  | [optional]
 **removeAlias** | **String**|  | [optional]
 **certificate** | **File**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
> String postTruststorePKCS12(truststoreP12)



### Example
```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
File truststoreP12 = null; // File | 
try {
    String result = apiInstance.postTruststorePKCS12(truststoreP12);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postTruststorePKCS12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **File**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

