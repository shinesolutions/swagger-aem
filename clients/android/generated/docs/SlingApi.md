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
[**postConfigProperty**](SlingApi.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 



## deleteAgent

> deleteAgent(runmode, name)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String runmode = null; // String | 
String name = null; // String | 
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
 **runmode** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## deleteNode

> deleteNode(path, name)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = null; // String | 
String name = null; // String | 
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
 **path** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getAgent

> getAgent(runmode, name)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String runmode = null; // String | 
String name = null; // String | 
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
 **runmode** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getAgents

> String getAgents(runmode)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String runmode = null; // String | 
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
 **runmode** | **String**|  | [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAuthorizableKeystore

> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String intermediatePath = null; // String | 
String authorizableId = null; // String | 
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
 **intermediatePath** | **String**|  | [default to null]
 **authorizableId** | **String**|  | [default to null]

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## getKeystore

> File getKeystore(intermediatePath, authorizableId)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String intermediatePath = null; // String | 
String authorizableId = null; // String | 
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
 **intermediatePath** | **String**|  | [default to null]
 **authorizableId** | **String**|  | [default to null]

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## getNode

> getNode(path, name)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = null; // String | 
String name = null; // String | 
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
 **path** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getPackage

> File getPackage(group, name, version)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String group = null; // String | 
String name = null; // String | 
String version = null; // String | 
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
 **group** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]
 **version** | **String**|  | [default to null]

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## getPackageFilter

> String getPackageFilter(group, name, version)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String group = null; // String | 
String name = null; // String | 
String version = null; // String | 
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
 **group** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]
 **version** | **String**|  | [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getQuery

> String getQuery(path, pLimit, _1property, _1propertyValue)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = null; // String | 
BigDecimal pLimit = null; // BigDecimal | 
String _1property = null; // String | 
String _1propertyValue = null; // String | 
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
 **path** | **String**|  | [default to null]
 **pLimit** | **BigDecimal**|  | [default to null]
 **_1property** | **String**|  | [default to null]
 **_1propertyValue** | **String**|  | [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTruststore

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


## getTruststoreInfo

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


## postAgent

> postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String runmode = null; // String | 
String name = null; // String | 
Boolean jcrContentCqDistribute = null; // Boolean | 
String jcrContentCqDistributeTypeHint = null; // String | 
String jcrContentCqName = null; // String | 
String jcrContentCqTemplate = null; // String | 
Boolean jcrContentAliasUpdate = null; // Boolean | 
Boolean jcrContentEnabled = null; // Boolean | 
String jcrContentJcrDescription = null; // String | 
String jcrContentJcrLastModified = null; // String | 
String jcrContentJcrLastModifiedBy = null; // String | 
String jcrContentJcrMixinTypes = null; // String | 
String jcrContentJcrTitle = null; // String | 
String jcrContentLogLevel = null; // String | 
Boolean jcrContentNoStatusUpdate = null; // Boolean | 
Boolean jcrContentNoVersioning = null; // Boolean | 
BigDecimal jcrContentProtocolConnectTimeout = null; // BigDecimal | 
Boolean jcrContentProtocolHTTPConnectionClosed = null; // Boolean | 
String jcrContentProtocolHTTPExpired = null; // String | 
List<String> jcrContentProtocolHTTPHeaders = null; // List<String> | 
String jcrContentProtocolHTTPHeadersTypeHint = null; // String | 
String jcrContentProtocolHTTPMethod = null; // String | 
Boolean jcrContentProtocolHTTPSRelaxed = null; // Boolean | 
String jcrContentProtocolInterface = null; // String | 
BigDecimal jcrContentProtocolSocketTimeout = null; // BigDecimal | 
String jcrContentProtocolVersion = null; // String | 
String jcrContentProxyNTLMDomain = null; // String | 
String jcrContentProxyNTLMHost = null; // String | 
String jcrContentProxyHost = null; // String | 
String jcrContentProxyPassword = null; // String | 
BigDecimal jcrContentProxyPort = null; // BigDecimal | 
String jcrContentProxyUser = null; // String | 
BigDecimal jcrContentQueueBatchMaxSize = null; // BigDecimal | 
String jcrContentQueueBatchMode = null; // String | 
BigDecimal jcrContentQueueBatchWaitTime = null; // BigDecimal | 
String jcrContentRetryDelay = null; // String | 
Boolean jcrContentReverseReplication = null; // Boolean | 
String jcrContentSerializationType = null; // String | 
String jcrContentSlingResourceType = null; // String | 
String jcrContentSsl = null; // String | 
String jcrContentTransportNTLMDomain = null; // String | 
String jcrContentTransportNTLMHost = null; // String | 
String jcrContentTransportPassword = null; // String | 
String jcrContentTransportUri = null; // String | 
String jcrContentTransportUser = null; // String | 
Boolean jcrContentTriggerDistribute = null; // Boolean | 
Boolean jcrContentTriggerModified = null; // Boolean | 
Boolean jcrContentTriggerOnOffTime = null; // Boolean | 
Boolean jcrContentTriggerReceive = null; // Boolean | 
Boolean jcrContentTriggerSpecific = null; // Boolean | 
String jcrContentUserId = null; // String | 
String jcrPrimaryType = null; // String | 
String operation = null; // String | 
try {
    apiInstance.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postAgent");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]
 **jcrContentCqDistribute** | **Boolean**|  | [optional] [default to null]
 **jcrContentCqDistributeTypeHint** | **String**|  | [optional] [default to null]
 **jcrContentCqName** | **String**|  | [optional] [default to null]
 **jcrContentCqTemplate** | **String**|  | [optional] [default to null]
 **jcrContentAliasUpdate** | **Boolean**|  | [optional] [default to null]
 **jcrContentEnabled** | **Boolean**|  | [optional] [default to null]
 **jcrContentJcrDescription** | **String**|  | [optional] [default to null]
 **jcrContentJcrLastModified** | **String**|  | [optional] [default to null]
 **jcrContentJcrLastModifiedBy** | **String**|  | [optional] [default to null]
 **jcrContentJcrMixinTypes** | **String**|  | [optional] [default to null]
 **jcrContentJcrTitle** | **String**|  | [optional] [default to null]
 **jcrContentLogLevel** | **String**|  | [optional] [default to null]
 **jcrContentNoStatusUpdate** | **Boolean**|  | [optional] [default to null]
 **jcrContentNoVersioning** | **Boolean**|  | [optional] [default to null]
 **jcrContentProtocolConnectTimeout** | **BigDecimal**|  | [optional] [default to null]
 **jcrContentProtocolHTTPConnectionClosed** | **Boolean**|  | [optional] [default to null]
 **jcrContentProtocolHTTPExpired** | **String**|  | [optional] [default to null]
 **jcrContentProtocolHTTPHeaders** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **jcrContentProtocolHTTPHeadersTypeHint** | **String**|  | [optional] [default to null]
 **jcrContentProtocolHTTPMethod** | **String**|  | [optional] [default to null]
 **jcrContentProtocolHTTPSRelaxed** | **Boolean**|  | [optional] [default to null]
 **jcrContentProtocolInterface** | **String**|  | [optional] [default to null]
 **jcrContentProtocolSocketTimeout** | **BigDecimal**|  | [optional] [default to null]
 **jcrContentProtocolVersion** | **String**|  | [optional] [default to null]
 **jcrContentProxyNTLMDomain** | **String**|  | [optional] [default to null]
 **jcrContentProxyNTLMHost** | **String**|  | [optional] [default to null]
 **jcrContentProxyHost** | **String**|  | [optional] [default to null]
 **jcrContentProxyPassword** | **String**|  | [optional] [default to null]
 **jcrContentProxyPort** | **BigDecimal**|  | [optional] [default to null]
 **jcrContentProxyUser** | **String**|  | [optional] [default to null]
 **jcrContentQueueBatchMaxSize** | **BigDecimal**|  | [optional] [default to null]
 **jcrContentQueueBatchMode** | **String**|  | [optional] [default to null]
 **jcrContentQueueBatchWaitTime** | **BigDecimal**|  | [optional] [default to null]
 **jcrContentRetryDelay** | **String**|  | [optional] [default to null]
 **jcrContentReverseReplication** | **Boolean**|  | [optional] [default to null]
 **jcrContentSerializationType** | **String**|  | [optional] [default to null]
 **jcrContentSlingResourceType** | **String**|  | [optional] [default to null]
 **jcrContentSsl** | **String**|  | [optional] [default to null]
 **jcrContentTransportNTLMDomain** | **String**|  | [optional] [default to null]
 **jcrContentTransportNTLMHost** | **String**|  | [optional] [default to null]
 **jcrContentTransportPassword** | **String**|  | [optional] [default to null]
 **jcrContentTransportUri** | **String**|  | [optional] [default to null]
 **jcrContentTransportUser** | **String**|  | [optional] [default to null]
 **jcrContentTriggerDistribute** | **Boolean**|  | [optional] [default to null]
 **jcrContentTriggerModified** | **Boolean**|  | [optional] [default to null]
 **jcrContentTriggerOnOffTime** | **Boolean**|  | [optional] [default to null]
 **jcrContentTriggerReceive** | **Boolean**|  | [optional] [default to null]
 **jcrContentTriggerSpecific** | **Boolean**|  | [optional] [default to null]
 **jcrContentUserId** | **String**|  | [optional] [default to null]
 **jcrPrimaryType** | **String**|  | [optional] [default to null]
 **operation** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postAuthorizableKeystore

> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String intermediatePath = null; // String | 
String authorizableId = null; // String | 
String operation = null; // String | 
String currentPassword = null; // String | 
String newPassword = null; // String | 
String rePassword = null; // String | 
String keyPassword = null; // String | 
String keyStorePass = null; // String | 
String alias = null; // String | 
String newAlias = null; // String | 
String removeAlias = null; // String | 
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
 **intermediatePath** | **String**|  | [default to null]
 **authorizableId** | **String**|  | [default to null]
 **operation** | **String**|  | [optional] [default to null]
 **currentPassword** | **String**|  | [optional] [default to null]
 **newPassword** | **String**|  | [optional] [default to null]
 **rePassword** | **String**|  | [optional] [default to null]
 **keyPassword** | **String**|  | [optional] [default to null]
 **keyStorePass** | **String**|  | [optional] [default to null]
 **alias** | **String**|  | [optional] [default to null]
 **newAlias** | **String**|  | [optional] [default to null]
 **removeAlias** | **String**|  | [optional] [default to null]
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


## postAuthorizables

> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String authorizableId = null; // String | 
String intermediatePath = null; // String | 
String createUser = null; // String | 
String createGroup = null; // String | 
String repPassword = null; // String | 
String profileGivenName = null; // String | 
try {
    String result = apiInstance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postAuthorizables");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  | [default to null]
 **intermediatePath** | **String**|  | [default to null]
 **createUser** | **String**|  | [optional] [default to null]
 **createGroup** | **String**|  | [optional] [default to null]
 **repPassword** | **String**|  | [optional] [default to null]
 **profileGivenName** | **String**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


## postConfigAdobeGraniteSamlAuthenticationHandler

> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String keyStorePassword = null; // String | 
String keyStorePasswordTypeHint = null; // String | 
Integer serviceRanking = null; // Integer | 
String serviceRankingTypeHint = null; // String | 
Boolean idpHttpRedirect = null; // Boolean | 
String idpHttpRedirectTypeHint = null; // String | 
Boolean createUser = null; // Boolean | 
String createUserTypeHint = null; // String | 
String defaultRedirectUrl = null; // String | 
String defaultRedirectUrlTypeHint = null; // String | 
String userIDAttribute = null; // String | 
String userIDAttributeTypeHint = null; // String | 
List<String> defaultGroups = null; // List<String> | 
String defaultGroupsTypeHint = null; // String | 
String idpCertAlias = null; // String | 
String idpCertAliasTypeHint = null; // String | 
Boolean addGroupMemberships = null; // Boolean | 
String addGroupMembershipsTypeHint = null; // String | 
List<String> path = null; // List<String> | 
String pathTypeHint = null; // String | 
List<String> synchronizeAttributes = null; // List<String> | 
String synchronizeAttributesTypeHint = null; // String | 
Integer clockTolerance = null; // Integer | 
String clockToleranceTypeHint = null; // String | 
String groupMembershipAttribute = null; // String | 
String groupMembershipAttributeTypeHint = null; // String | 
String idpUrl = null; // String | 
String idpUrlTypeHint = null; // String | 
String logoutUrl = null; // String | 
String logoutUrlTypeHint = null; // String | 
String serviceProviderEntityId = null; // String | 
String serviceProviderEntityIdTypeHint = null; // String | 
String assertionConsumerServiceURL = null; // String | 
String assertionConsumerServiceURLTypeHint = null; // String | 
Boolean handleLogout = null; // Boolean | 
String handleLogoutTypeHint = null; // String | 
String spPrivateKeyAlias = null; // String | 
String spPrivateKeyAliasTypeHint = null; // String | 
Boolean useEncryption = null; // Boolean | 
String useEncryptionTypeHint = null; // String | 
String nameIdFormat = null; // String | 
String nameIdFormatTypeHint = null; // String | 
String digestMethod = null; // String | 
String digestMethodTypeHint = null; // String | 
String signatureMethod = null; // String | 
String signatureMethodTypeHint = null; // String | 
String userIntermediatePath = null; // String | 
String userIntermediatePathTypeHint = null; // String | 
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
 **keyStorePassword** | **String**|  | [optional] [default to null]
 **keyStorePasswordTypeHint** | **String**|  | [optional] [default to null]
 **serviceRanking** | **Integer**|  | [optional] [default to null]
 **serviceRankingTypeHint** | **String**|  | [optional] [default to null]
 **idpHttpRedirect** | **Boolean**|  | [optional] [default to null]
 **idpHttpRedirectTypeHint** | **String**|  | [optional] [default to null]
 **createUser** | **Boolean**|  | [optional] [default to null]
 **createUserTypeHint** | **String**|  | [optional] [default to null]
 **defaultRedirectUrl** | **String**|  | [optional] [default to null]
 **defaultRedirectUrlTypeHint** | **String**|  | [optional] [default to null]
 **userIDAttribute** | **String**|  | [optional] [default to null]
 **userIDAttributeTypeHint** | **String**|  | [optional] [default to null]
 **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **defaultGroupsTypeHint** | **String**|  | [optional] [default to null]
 **idpCertAlias** | **String**|  | [optional] [default to null]
 **idpCertAliasTypeHint** | **String**|  | [optional] [default to null]
 **addGroupMemberships** | **Boolean**|  | [optional] [default to null]
 **addGroupMembershipsTypeHint** | **String**|  | [optional] [default to null]
 **path** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **pathTypeHint** | **String**|  | [optional] [default to null]
 **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **synchronizeAttributesTypeHint** | **String**|  | [optional] [default to null]
 **clockTolerance** | **Integer**|  | [optional] [default to null]
 **clockToleranceTypeHint** | **String**|  | [optional] [default to null]
 **groupMembershipAttribute** | **String**|  | [optional] [default to null]
 **groupMembershipAttributeTypeHint** | **String**|  | [optional] [default to null]
 **idpUrl** | **String**|  | [optional] [default to null]
 **idpUrlTypeHint** | **String**|  | [optional] [default to null]
 **logoutUrl** | **String**|  | [optional] [default to null]
 **logoutUrlTypeHint** | **String**|  | [optional] [default to null]
 **serviceProviderEntityId** | **String**|  | [optional] [default to null]
 **serviceProviderEntityIdTypeHint** | **String**|  | [optional] [default to null]
 **assertionConsumerServiceURL** | **String**|  | [optional] [default to null]
 **assertionConsumerServiceURLTypeHint** | **String**|  | [optional] [default to null]
 **handleLogout** | **Boolean**|  | [optional] [default to null]
 **handleLogoutTypeHint** | **String**|  | [optional] [default to null]
 **spPrivateKeyAlias** | **String**|  | [optional] [default to null]
 **spPrivateKeyAliasTypeHint** | **String**|  | [optional] [default to null]
 **useEncryption** | **Boolean**|  | [optional] [default to null]
 **useEncryptionTypeHint** | **String**|  | [optional] [default to null]
 **nameIdFormat** | **String**|  | [optional] [default to null]
 **nameIdFormatTypeHint** | **String**|  | [optional] [default to null]
 **digestMethod** | **String**|  | [optional] [default to null]
 **digestMethodTypeHint** | **String**|  | [optional] [default to null]
 **signatureMethod** | **String**|  | [optional] [default to null]
 **signatureMethodTypeHint** | **String**|  | [optional] [default to null]
 **userIntermediatePath** | **String**|  | [optional] [default to null]
 **userIntermediatePathTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheFelixJettyBasedHttpService

> postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
Boolean orgApacheFelixHttpsNio = null; // Boolean | 
String orgApacheFelixHttpsNioTypeHint = null; // String | 
String orgApacheFelixHttpsKeystore = null; // String | 
String orgApacheFelixHttpsKeystoreTypeHint = null; // String | 
String orgApacheFelixHttpsKeystorePassword = null; // String | 
String orgApacheFelixHttpsKeystorePasswordTypeHint = null; // String | 
String orgApacheFelixHttpsKeystoreKey = null; // String | 
String orgApacheFelixHttpsKeystoreKeyTypeHint = null; // String | 
String orgApacheFelixHttpsKeystoreKeyPassword = null; // String | 
String orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = null; // String | 
String orgApacheFelixHttpsTruststore = null; // String | 
String orgApacheFelixHttpsTruststoreTypeHint = null; // String | 
String orgApacheFelixHttpsTruststorePassword = null; // String | 
String orgApacheFelixHttpsTruststorePasswordTypeHint = null; // String | 
String orgApacheFelixHttpsClientcertificate = null; // String | 
String orgApacheFelixHttpsClientcertificateTypeHint = null; // String | 
Boolean orgApacheFelixHttpsEnable = null; // Boolean | 
String orgApacheFelixHttpsEnableTypeHint = null; // String | 
String orgOsgiServiceHttpPortSecure = null; // String | 
String orgOsgiServiceHttpPortSecureTypeHint = null; // String | 
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
 **orgApacheFelixHttpsNio** | **Boolean**|  | [optional] [default to null]
 **orgApacheFelixHttpsNioTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystore** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystoreTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystorePassword** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystoreKey** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsTruststore** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsTruststoreTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsTruststorePassword** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsClientcertificate** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsClientcertificateTypeHint** | **String**|  | [optional] [default to null]
 **orgApacheFelixHttpsEnable** | **Boolean**|  | [optional] [default to null]
 **orgApacheFelixHttpsEnableTypeHint** | **String**|  | [optional] [default to null]
 **orgOsgiServiceHttpPortSecure** | **String**|  | [optional] [default to null]
 **orgOsgiServiceHttpPortSecureTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheHttpComponentsProxyConfiguration

> postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String proxyHost = null; // String | 
String proxyHostTypeHint = null; // String | 
Integer proxyPort = null; // Integer | 
String proxyPortTypeHint = null; // String | 
List<String> proxyExceptions = null; // List<String> | 
String proxyExceptionsTypeHint = null; // String | 
Boolean proxyEnabled = null; // Boolean | 
String proxyEnabledTypeHint = null; // String | 
String proxyUser = null; // String | 
String proxyUserTypeHint = null; // String | 
String proxyPassword = null; // String | 
String proxyPasswordTypeHint = null; // String | 
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
 **proxyHost** | **String**|  | [optional] [default to null]
 **proxyHostTypeHint** | **String**|  | [optional] [default to null]
 **proxyPort** | **Integer**|  | [optional] [default to null]
 **proxyPortTypeHint** | **String**|  | [optional] [default to null]
 **proxyExceptions** | [**List&lt;String&gt;**](String.md)|  | [optional] [default to null]
 **proxyExceptionsTypeHint** | **String**|  | [optional] [default to null]
 **proxyEnabled** | **Boolean**|  | [optional] [default to null]
 **proxyEnabledTypeHint** | **String**|  | [optional] [default to null]
 **proxyUser** | **String**|  | [optional] [default to null]
 **proxyUserTypeHint** | **String**|  | [optional] [default to null]
 **proxyPassword** | **String**|  | [optional] [default to null]
 **proxyPasswordTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheSlingDavExServlet

> postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String alias = null; // String | 
String aliasTypeHint = null; // String | 
Boolean davCreateAbsoluteUri = null; // Boolean | 
String davCreateAbsoluteUriTypeHint = null; // String | 
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
 **alias** | **String**|  | [optional] [default to null]
 **aliasTypeHint** | **String**|  | [optional] [default to null]
 **davCreateAbsoluteUri** | **Boolean**|  | [optional] [default to null]
 **davCreateAbsoluteUriTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheSlingGetServlet

> postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String jsonMaximumresults = null; // String | 
String jsonMaximumresultsTypeHint = null; // String | 
Boolean enableHtml = null; // Boolean | 
String enableHtmlTypeHint = null; // String | 
Boolean enableTxt = null; // Boolean | 
String enableTxtTypeHint = null; // String | 
Boolean enableXml = null; // Boolean | 
String enableXmlTypeHint = null; // String | 
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
 **jsonMaximumresults** | **String**|  | [optional] [default to null]
 **jsonMaximumresultsTypeHint** | **String**|  | [optional] [default to null]
 **enableHtml** | **Boolean**|  | [optional] [default to null]
 **enableHtmlTypeHint** | **String**|  | [optional] [default to null]
 **enableTxt** | **Boolean**|  | [optional] [default to null]
 **enableTxtTypeHint** | **String**|  | [optional] [default to null]
 **enableXml** | **Boolean**|  | [optional] [default to null]
 **enableXmlTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigApacheSlingReferrerFilter

> postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
Boolean allowEmpty = null; // Boolean | 
String allowEmptyTypeHint = null; // String | 
String allowHosts = null; // String | 
String allowHostsTypeHint = null; // String | 
String allowHostsRegexp = null; // String | 
String allowHostsRegexpTypeHint = null; // String | 
String filterMethods = null; // String | 
String filterMethodsTypeHint = null; // String | 
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
 **allowEmpty** | **Boolean**|  | [optional] [default to null]
 **allowEmptyTypeHint** | **String**|  | [optional] [default to null]
 **allowHosts** | **String**|  | [optional] [default to null]
 **allowHostsTypeHint** | **String**|  | [optional] [default to null]
 **allowHostsRegexp** | **String**|  | [optional] [default to null]
 **allowHostsRegexpTypeHint** | **String**|  | [optional] [default to null]
 **filterMethods** | **String**|  | [optional] [default to null]
 **filterMethodsTypeHint** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postConfigProperty

> postConfigProperty(configNodeName)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String configNodeName = null; // String | 
try {
    apiInstance.postConfigProperty(configNodeName);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postConfigProperty");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postNode

> postNode(path, name, operation, deleteAuthorizable, file)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = null; // String | 
String name = null; // String | 
String operation = null; // String | 
String deleteAuthorizable = null; // String | 
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
 **path** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]
 **operation** | **String**|  | [optional] [default to null]
 **deleteAuthorizable** | **String**|  | [optional] [default to null]
 **file** | **File**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


## postNodeRw

> postNodeRw(path, name, addMembers)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = null; // String | 
String name = null; // String | 
String addMembers = null; // String | 
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
 **path** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]
 **addMembers** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postPath

> postPath(path, jcrPrimaryType, name)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = null; // String | 
String jcrPrimaryType = null; // String | 
String name = null; // String | 
try {
    apiInstance.postPath(path, jcrPrimaryType, name);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postPath");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | [default to null]
 **jcrPrimaryType** | **String**|  | [default to null]
 **name** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postQuery

> String postQuery(path, pLimit, _1property, _1propertyValue)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String path = null; // String | 
BigDecimal pLimit = null; // BigDecimal | 
String _1property = null; // String | 
String _1propertyValue = null; // String | 
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
 **path** | **String**|  | [default to null]
 **pLimit** | **BigDecimal**|  | [default to null]
 **_1property** | **String**|  | [default to null]
 **_1propertyValue** | **String**|  | [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postTreeActivation

> postTreeActivation(ignoredeactivated, onlymodified, path, cmd)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
Boolean ignoredeactivated = null; // Boolean | 
Boolean onlymodified = null; // Boolean | 
String path = null; // String | 
String cmd = activate; // String | 
try {
    apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path, cmd);
} catch (ApiException e) {
    System.err.println("Exception when calling SlingApi#postTreeActivation");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **Boolean**|  | [default to null]
 **onlymodified** | **Boolean**|  | [default to null]
 **path** | **String**|  | [default to null]
 **cmd** | **String**|  | [default to activate]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## postTruststore

> String postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SlingApi;

SlingApi apiInstance = new SlingApi();
String operation = null; // String | 
String newPassword = null; // String | 
String rePassword = null; // String | 
String keyStoreType = null; // String | 
String removeAlias = null; // String | 
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
 **operation** | **String**|  | [optional] [default to null]
 **newPassword** | **String**|  | [optional] [default to null]
 **rePassword** | **String**|  | [optional] [default to null]
 **keyStoreType** | **String**|  | [optional] [default to null]
 **removeAlias** | **String**|  | [optional] [default to null]
 **certificate** | **File**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


## postTruststorePKCS12

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

