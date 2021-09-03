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
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(runmode, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val runmode : kotlin.String = runmode_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
try {
    apiInstance.deleteAgent(runmode, name)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#deleteAgent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#deleteAgent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
try {
    apiInstance.deleteNode(path, name)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#deleteNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#deleteNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val runmode : kotlin.String = runmode_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
try {
    apiInstance.getAgent(runmode, name)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getAgent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getAgent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAgents"></a>
# **getAgents**
> kotlin.String getAgents(runmode)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val runmode : kotlin.String = runmode_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getAgents(runmode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getAgents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getAgents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val intermediatePath : kotlin.String = intermediatePath_example // kotlin.String | 
val authorizableId : kotlin.String = authorizableId_example // kotlin.String | 
try {
    val result : KeystoreInfo = apiInstance.getAuthorizableKeystore(intermediatePath, authorizableId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getAuthorizableKeystore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getAuthorizableKeystore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **kotlin.String**|  |
 **authorizableId** | **kotlin.String**|  |

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getKeystore"></a>
# **getKeystore**
> java.io.File getKeystore(intermediatePath, authorizableId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val intermediatePath : kotlin.String = intermediatePath_example // kotlin.String | 
val authorizableId : kotlin.String = authorizableId_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getKeystore(intermediatePath, authorizableId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getKeystore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getKeystore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **kotlin.String**|  |
 **authorizableId** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getNode"></a>
# **getNode**
> getNode(path, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
try {
    apiInstance.getNode(path, name)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPackage"></a>
# **getPackage**
> java.io.File getPackage(group, name, version)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val group : kotlin.String = group_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val version : kotlin.String = version_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getPackage(group, name, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getPackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **version** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getPackageFilter"></a>
# **getPackageFilter**
> kotlin.String getPackageFilter(group, name, version)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val group : kotlin.String = group_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val version : kotlin.String = version_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getPackageFilter(group, name, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getPackageFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getPackageFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **version** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuery"></a>
# **getQuery**
> kotlin.String getQuery(path, pLimit, `1property`, `1propertyValue`)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val pLimit : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val `1property` : kotlin.String = `1property`_example // kotlin.String | 
val `1propertyValue` : kotlin.String = `1propertyValue`_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getQuery(path, pLimit, `1property`, `1propertyValue`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getQuery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **pLimit** | **java.math.BigDecimal**|  |
 **&#x60;1property&#x60;** | **kotlin.String**|  |
 **&#x60;1propertyValue&#x60;** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTruststore"></a>
# **getTruststore**
> java.io.File getTruststore()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
try {
    val result : java.io.File = apiInstance.getTruststore()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getTruststore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getTruststore")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getTruststoreInfo"></a>
# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
try {
    val result : TruststoreInfo = apiInstance.getTruststoreInfo()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#getTruststoreInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#getTruststoreInfo")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, jcrColonContentCqColonDistribute, jcrColonContentCqColonDistributeAtTypeHint, jcrColonContentCqColonName, jcrColonContentCqColonTemplate, jcrColonContentEnabled, jcrColonContentJcrColonDescription, jcrColonContentJcrColonLastModified, jcrColonContentJcrColonLastModifiedBy, jcrColonContentJcrColonMixinTypes, jcrColonContentJcrColonTitle, jcrColonContentLogLevel, jcrColonContentNoStatusUpdate, jcrColonContentNoVersioning, jcrColonContentProtocolConnectTimeout, jcrColonContentProtocolHTTPConnectionClosed, jcrColonContentProtocolHTTPExpired, jcrColonContentProtocolHTTPHeaders, jcrColonContentProtocolHTTPHeadersAtTypeHint, jcrColonContentProtocolHTTPMethod, jcrColonContentProtocolHTTPSRelaxed, jcrColonContentProtocolInterface, jcrColonContentProtocolSocketTimeout, jcrColonContentProtocolVersion, jcrColonContentProxyNTLMDomain, jcrColonContentProxyNTLMHost, jcrColonContentProxyHost, jcrColonContentProxyPassword, jcrColonContentProxyPort, jcrColonContentProxyUser, jcrColonContentQueueBatchMaxSize, jcrColonContentQueueBatchMode, jcrColonContentQueueBatchWaitTime, jcrColonContentRetryDelay, jcrColonContentReverseReplication, jcrColonContentSerializationType, jcrColonContentSlingColonResourceType, jcrColonContentSsl, jcrColonContentTransportNTLMDomain, jcrColonContentTransportNTLMHost, jcrColonContentTransportPassword, jcrColonContentTransportUri, jcrColonContentTransportUser, jcrColonContentTriggerDistribute, jcrColonContentTriggerModified, jcrColonContentTriggerOnOffTime, jcrColonContentTriggerReceive, jcrColonContentTriggerSpecific, jcrColonContentUserId, jcrColonPrimaryType, colonOperation)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val runmode : kotlin.String = runmode_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val jcrColonContentCqColonDistribute : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentCqColonDistributeAtTypeHint : kotlin.String = jcrColonContentCqColonDistributeAtTypeHint_example // kotlin.String | 
val jcrColonContentCqColonName : kotlin.String = jcrColonContentCqColonName_example // kotlin.String | 
val jcrColonContentCqColonTemplate : kotlin.String = jcrColonContentCqColonTemplate_example // kotlin.String | 
val jcrColonContentEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentJcrColonDescription : kotlin.String = jcrColonContentJcrColonDescription_example // kotlin.String | 
val jcrColonContentJcrColonLastModified : kotlin.String = jcrColonContentJcrColonLastModified_example // kotlin.String | 
val jcrColonContentJcrColonLastModifiedBy : kotlin.String = jcrColonContentJcrColonLastModifiedBy_example // kotlin.String | 
val jcrColonContentJcrColonMixinTypes : kotlin.String = jcrColonContentJcrColonMixinTypes_example // kotlin.String | 
val jcrColonContentJcrColonTitle : kotlin.String = jcrColonContentJcrColonTitle_example // kotlin.String | 
val jcrColonContentLogLevel : kotlin.String = jcrColonContentLogLevel_example // kotlin.String | 
val jcrColonContentNoStatusUpdate : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentNoVersioning : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentProtocolConnectTimeout : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrColonContentProtocolHTTPConnectionClosed : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentProtocolHTTPExpired : kotlin.String = jcrColonContentProtocolHTTPExpired_example // kotlin.String | 
val jcrColonContentProtocolHTTPHeaders : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val jcrColonContentProtocolHTTPHeadersAtTypeHint : kotlin.String = jcrColonContentProtocolHTTPHeadersAtTypeHint_example // kotlin.String | 
val jcrColonContentProtocolHTTPMethod : kotlin.String = jcrColonContentProtocolHTTPMethod_example // kotlin.String | 
val jcrColonContentProtocolHTTPSRelaxed : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentProtocolInterface : kotlin.String = jcrColonContentProtocolInterface_example // kotlin.String | 
val jcrColonContentProtocolSocketTimeout : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrColonContentProtocolVersion : kotlin.String = jcrColonContentProtocolVersion_example // kotlin.String | 
val jcrColonContentProxyNTLMDomain : kotlin.String = jcrColonContentProxyNTLMDomain_example // kotlin.String | 
val jcrColonContentProxyNTLMHost : kotlin.String = jcrColonContentProxyNTLMHost_example // kotlin.String | 
val jcrColonContentProxyHost : kotlin.String = jcrColonContentProxyHost_example // kotlin.String | 
val jcrColonContentProxyPassword : kotlin.String = jcrColonContentProxyPassword_example // kotlin.String | 
val jcrColonContentProxyPort : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrColonContentProxyUser : kotlin.String = jcrColonContentProxyUser_example // kotlin.String | 
val jcrColonContentQueueBatchMaxSize : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrColonContentQueueBatchMode : kotlin.String = jcrColonContentQueueBatchMode_example // kotlin.String | 
val jcrColonContentQueueBatchWaitTime : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrColonContentRetryDelay : kotlin.String = jcrColonContentRetryDelay_example // kotlin.String | 
val jcrColonContentReverseReplication : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentSerializationType : kotlin.String = jcrColonContentSerializationType_example // kotlin.String | 
val jcrColonContentSlingColonResourceType : kotlin.String = jcrColonContentSlingColonResourceType_example // kotlin.String | 
val jcrColonContentSsl : kotlin.String = jcrColonContentSsl_example // kotlin.String | 
val jcrColonContentTransportNTLMDomain : kotlin.String = jcrColonContentTransportNTLMDomain_example // kotlin.String | 
val jcrColonContentTransportNTLMHost : kotlin.String = jcrColonContentTransportNTLMHost_example // kotlin.String | 
val jcrColonContentTransportPassword : kotlin.String = jcrColonContentTransportPassword_example // kotlin.String | 
val jcrColonContentTransportUri : kotlin.String = jcrColonContentTransportUri_example // kotlin.String | 
val jcrColonContentTransportUser : kotlin.String = jcrColonContentTransportUser_example // kotlin.String | 
val jcrColonContentTriggerDistribute : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentTriggerModified : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentTriggerOnOffTime : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentTriggerReceive : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentTriggerSpecific : kotlin.Boolean = true // kotlin.Boolean | 
val jcrColonContentUserId : kotlin.String = jcrColonContentUserId_example // kotlin.String | 
val jcrColonPrimaryType : kotlin.String = jcrColonPrimaryType_example // kotlin.String | 
val colonOperation : kotlin.String = colonOperation_example // kotlin.String | 
try {
    apiInstance.postAgent(runmode, name, jcrColonContentCqColonDistribute, jcrColonContentCqColonDistributeAtTypeHint, jcrColonContentCqColonName, jcrColonContentCqColonTemplate, jcrColonContentEnabled, jcrColonContentJcrColonDescription, jcrColonContentJcrColonLastModified, jcrColonContentJcrColonLastModifiedBy, jcrColonContentJcrColonMixinTypes, jcrColonContentJcrColonTitle, jcrColonContentLogLevel, jcrColonContentNoStatusUpdate, jcrColonContentNoVersioning, jcrColonContentProtocolConnectTimeout, jcrColonContentProtocolHTTPConnectionClosed, jcrColonContentProtocolHTTPExpired, jcrColonContentProtocolHTTPHeaders, jcrColonContentProtocolHTTPHeadersAtTypeHint, jcrColonContentProtocolHTTPMethod, jcrColonContentProtocolHTTPSRelaxed, jcrColonContentProtocolInterface, jcrColonContentProtocolSocketTimeout, jcrColonContentProtocolVersion, jcrColonContentProxyNTLMDomain, jcrColonContentProxyNTLMHost, jcrColonContentProxyHost, jcrColonContentProxyPassword, jcrColonContentProxyPort, jcrColonContentProxyUser, jcrColonContentQueueBatchMaxSize, jcrColonContentQueueBatchMode, jcrColonContentQueueBatchWaitTime, jcrColonContentRetryDelay, jcrColonContentReverseReplication, jcrColonContentSerializationType, jcrColonContentSlingColonResourceType, jcrColonContentSsl, jcrColonContentTransportNTLMDomain, jcrColonContentTransportNTLMHost, jcrColonContentTransportPassword, jcrColonContentTransportUri, jcrColonContentTransportUser, jcrColonContentTriggerDistribute, jcrColonContentTriggerModified, jcrColonContentTriggerOnOffTime, jcrColonContentTriggerReceive, jcrColonContentTriggerSpecific, jcrColonContentUserId, jcrColonPrimaryType, colonOperation)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postAgent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postAgent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **jcrColonContentCqColonDistribute** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentCqColonDistributeAtTypeHint** | **kotlin.String**|  | [optional]
 **jcrColonContentCqColonName** | **kotlin.String**|  | [optional]
 **jcrColonContentCqColonTemplate** | **kotlin.String**|  | [optional]
 **jcrColonContentEnabled** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentJcrColonDescription** | **kotlin.String**|  | [optional]
 **jcrColonContentJcrColonLastModified** | **kotlin.String**|  | [optional]
 **jcrColonContentJcrColonLastModifiedBy** | **kotlin.String**|  | [optional]
 **jcrColonContentJcrColonMixinTypes** | **kotlin.String**|  | [optional]
 **jcrColonContentJcrColonTitle** | **kotlin.String**|  | [optional]
 **jcrColonContentLogLevel** | **kotlin.String**|  | [optional]
 **jcrColonContentNoStatusUpdate** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentNoVersioning** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentProtocolConnectTimeout** | **java.math.BigDecimal**|  | [optional]
 **jcrColonContentProtocolHTTPConnectionClosed** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentProtocolHTTPExpired** | **kotlin.String**|  | [optional]
 **jcrColonContentProtocolHTTPHeaders** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **jcrColonContentProtocolHTTPHeadersAtTypeHint** | **kotlin.String**|  | [optional]
 **jcrColonContentProtocolHTTPMethod** | **kotlin.String**|  | [optional]
 **jcrColonContentProtocolHTTPSRelaxed** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentProtocolInterface** | **kotlin.String**|  | [optional]
 **jcrColonContentProtocolSocketTimeout** | **java.math.BigDecimal**|  | [optional]
 **jcrColonContentProtocolVersion** | **kotlin.String**|  | [optional]
 **jcrColonContentProxyNTLMDomain** | **kotlin.String**|  | [optional]
 **jcrColonContentProxyNTLMHost** | **kotlin.String**|  | [optional]
 **jcrColonContentProxyHost** | **kotlin.String**|  | [optional]
 **jcrColonContentProxyPassword** | **kotlin.String**|  | [optional]
 **jcrColonContentProxyPort** | **java.math.BigDecimal**|  | [optional]
 **jcrColonContentProxyUser** | **kotlin.String**|  | [optional]
 **jcrColonContentQueueBatchMaxSize** | **java.math.BigDecimal**|  | [optional]
 **jcrColonContentQueueBatchMode** | **kotlin.String**|  | [optional]
 **jcrColonContentQueueBatchWaitTime** | **java.math.BigDecimal**|  | [optional]
 **jcrColonContentRetryDelay** | **kotlin.String**|  | [optional]
 **jcrColonContentReverseReplication** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentSerializationType** | **kotlin.String**|  | [optional]
 **jcrColonContentSlingColonResourceType** | **kotlin.String**|  | [optional]
 **jcrColonContentSsl** | **kotlin.String**|  | [optional]
 **jcrColonContentTransportNTLMDomain** | **kotlin.String**|  | [optional]
 **jcrColonContentTransportNTLMHost** | **kotlin.String**|  | [optional]
 **jcrColonContentTransportPassword** | **kotlin.String**|  | [optional]
 **jcrColonContentTransportUri** | **kotlin.String**|  | [optional]
 **jcrColonContentTransportUser** | **kotlin.String**|  | [optional]
 **jcrColonContentTriggerDistribute** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentTriggerModified** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentTriggerOnOffTime** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentTriggerReceive** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentTriggerSpecific** | **kotlin.Boolean**|  | [optional]
 **jcrColonContentUserId** | **kotlin.String**|  | [optional]
 **jcrColonPrimaryType** | **kotlin.String**|  | [optional]
 **colonOperation** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postAuthorizableKeystore"></a>
# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val intermediatePath : kotlin.String = intermediatePath_example // kotlin.String | 
val authorizableId : kotlin.String = authorizableId_example // kotlin.String | 
val colonOperation : kotlin.String = colonOperation_example // kotlin.String | 
val currentPassword : kotlin.String = currentPassword_example // kotlin.String | 
val newPassword : kotlin.String = newPassword_example // kotlin.String | 
val rePassword : kotlin.String = rePassword_example // kotlin.String | 
val keyPassword : kotlin.String = keyPassword_example // kotlin.String | 
val keyStorePass : kotlin.String = keyStorePass_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
val newAlias : kotlin.String = newAlias_example // kotlin.String | 
val removeAlias : kotlin.String = removeAlias_example // kotlin.String | 
val certChain : java.io.File = BINARY_DATA_HERE // java.io.File | 
val pk : java.io.File = BINARY_DATA_HERE // java.io.File | 
val keyStore : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : KeystoreInfo = apiInstance.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postAuthorizableKeystore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postAuthorizableKeystore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **kotlin.String**|  |
 **authorizableId** | **kotlin.String**|  |
 **colonOperation** | **kotlin.String**|  | [optional]
 **currentPassword** | **kotlin.String**|  | [optional]
 **newPassword** | **kotlin.String**|  | [optional]
 **rePassword** | **kotlin.String**|  | [optional]
 **keyPassword** | **kotlin.String**|  | [optional]
 **keyStorePass** | **kotlin.String**|  | [optional]
 **alias** | **kotlin.String**|  | [optional]
 **newAlias** | **kotlin.String**|  | [optional]
 **removeAlias** | **kotlin.String**|  | [optional]
 **certChain** | **java.io.File**|  | [optional]
 **pk** | **java.io.File**|  | [optional]
 **keyStore** | **java.io.File**|  | [optional]

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> kotlin.String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileGivenName)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val authorizableId : kotlin.String = authorizableId_example // kotlin.String | 
val intermediatePath : kotlin.String = intermediatePath_example // kotlin.String | 
val createUser : kotlin.String = createUser_example // kotlin.String | 
val createGroup : kotlin.String = createGroup_example // kotlin.String | 
val repColonPassword : kotlin.String = repColonPassword_example // kotlin.String | 
val profileGivenName : kotlin.String = profileGivenName_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileGivenName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postAuthorizables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postAuthorizables")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **kotlin.String**|  |
 **intermediatePath** | **kotlin.String**|  |
 **createUser** | **kotlin.String**|  | [optional]
 **createGroup** | **kotlin.String**|  | [optional]
 **repColonPassword** | **kotlin.String**|  | [optional]
 **profileGivenName** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val keyStorePassword : kotlin.String = keyStorePassword_example // kotlin.String | 
val keyStorePasswordAtTypeHint : kotlin.String = keyStorePasswordAtTypeHint_example // kotlin.String | 
val serviceRanking : kotlin.Int = 56 // kotlin.Int | 
val serviceRankingAtTypeHint : kotlin.String = serviceRankingAtTypeHint_example // kotlin.String | 
val idpHttpRedirect : kotlin.Boolean = true // kotlin.Boolean | 
val idpHttpRedirectAtTypeHint : kotlin.String = idpHttpRedirectAtTypeHint_example // kotlin.String | 
val createUser : kotlin.Boolean = true // kotlin.Boolean | 
val createUserAtTypeHint : kotlin.String = createUserAtTypeHint_example // kotlin.String | 
val defaultRedirectUrl : kotlin.String = defaultRedirectUrl_example // kotlin.String | 
val defaultRedirectUrlAtTypeHint : kotlin.String = defaultRedirectUrlAtTypeHint_example // kotlin.String | 
val userIDAttribute : kotlin.String = userIDAttribute_example // kotlin.String | 
val userIDAttributeAtTypeHint : kotlin.String = userIDAttributeAtTypeHint_example // kotlin.String | 
val defaultGroups : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val defaultGroupsAtTypeHint : kotlin.String = defaultGroupsAtTypeHint_example // kotlin.String | 
val idpCertAlias : kotlin.String = idpCertAlias_example // kotlin.String | 
val idpCertAliasAtTypeHint : kotlin.String = idpCertAliasAtTypeHint_example // kotlin.String | 
val addGroupMemberships : kotlin.Boolean = true // kotlin.Boolean | 
val addGroupMembershipsAtTypeHint : kotlin.String = addGroupMembershipsAtTypeHint_example // kotlin.String | 
val path : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val pathAtTypeHint : kotlin.String = pathAtTypeHint_example // kotlin.String | 
val synchronizeAttributes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val synchronizeAttributesAtTypeHint : kotlin.String = synchronizeAttributesAtTypeHint_example // kotlin.String | 
val clockTolerance : kotlin.Int = 56 // kotlin.Int | 
val clockToleranceAtTypeHint : kotlin.String = clockToleranceAtTypeHint_example // kotlin.String | 
val groupMembershipAttribute : kotlin.String = groupMembershipAttribute_example // kotlin.String | 
val groupMembershipAttributeAtTypeHint : kotlin.String = groupMembershipAttributeAtTypeHint_example // kotlin.String | 
val idpUrl : kotlin.String = idpUrl_example // kotlin.String | 
val idpUrlAtTypeHint : kotlin.String = idpUrlAtTypeHint_example // kotlin.String | 
val logoutUrl : kotlin.String = logoutUrl_example // kotlin.String | 
val logoutUrlAtTypeHint : kotlin.String = logoutUrlAtTypeHint_example // kotlin.String | 
val serviceProviderEntityId : kotlin.String = serviceProviderEntityId_example // kotlin.String | 
val serviceProviderEntityIdAtTypeHint : kotlin.String = serviceProviderEntityIdAtTypeHint_example // kotlin.String | 
val assertionConsumerServiceURL : kotlin.String = assertionConsumerServiceURL_example // kotlin.String | 
val assertionConsumerServiceURLAtTypeHint : kotlin.String = assertionConsumerServiceURLAtTypeHint_example // kotlin.String | 
val handleLogout : kotlin.Boolean = true // kotlin.Boolean | 
val handleLogoutAtTypeHint : kotlin.String = handleLogoutAtTypeHint_example // kotlin.String | 
val spPrivateKeyAlias : kotlin.String = spPrivateKeyAlias_example // kotlin.String | 
val spPrivateKeyAliasAtTypeHint : kotlin.String = spPrivateKeyAliasAtTypeHint_example // kotlin.String | 
val useEncryption : kotlin.Boolean = true // kotlin.Boolean | 
val useEncryptionAtTypeHint : kotlin.String = useEncryptionAtTypeHint_example // kotlin.String | 
val nameIdFormat : kotlin.String = nameIdFormat_example // kotlin.String | 
val nameIdFormatAtTypeHint : kotlin.String = nameIdFormatAtTypeHint_example // kotlin.String | 
val digestMethod : kotlin.String = digestMethod_example // kotlin.String | 
val digestMethodAtTypeHint : kotlin.String = digestMethodAtTypeHint_example // kotlin.String | 
val signatureMethod : kotlin.String = signatureMethod_example // kotlin.String | 
val signatureMethodAtTypeHint : kotlin.String = signatureMethodAtTypeHint_example // kotlin.String | 
val userIntermediatePath : kotlin.String = userIntermediatePath_example // kotlin.String | 
val userIntermediatePathAtTypeHint : kotlin.String = userIntermediatePathAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postConfigAdobeGraniteSamlAuthenticationHandler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postConfigAdobeGraniteSamlAuthenticationHandler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **kotlin.String**|  | [optional]
 **keyStorePasswordAtTypeHint** | **kotlin.String**|  | [optional]
 **serviceRanking** | **kotlin.Int**|  | [optional]
 **serviceRankingAtTypeHint** | **kotlin.String**|  | [optional]
 **idpHttpRedirect** | **kotlin.Boolean**|  | [optional]
 **idpHttpRedirectAtTypeHint** | **kotlin.String**|  | [optional]
 **createUser** | **kotlin.Boolean**|  | [optional]
 **createUserAtTypeHint** | **kotlin.String**|  | [optional]
 **defaultRedirectUrl** | **kotlin.String**|  | [optional]
 **defaultRedirectUrlAtTypeHint** | **kotlin.String**|  | [optional]
 **userIDAttribute** | **kotlin.String**|  | [optional]
 **userIDAttributeAtTypeHint** | **kotlin.String**|  | [optional]
 **defaultGroups** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **defaultGroupsAtTypeHint** | **kotlin.String**|  | [optional]
 **idpCertAlias** | **kotlin.String**|  | [optional]
 **idpCertAliasAtTypeHint** | **kotlin.String**|  | [optional]
 **addGroupMemberships** | **kotlin.Boolean**|  | [optional]
 **addGroupMembershipsAtTypeHint** | **kotlin.String**|  | [optional]
 **path** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **pathAtTypeHint** | **kotlin.String**|  | [optional]
 **synchronizeAttributes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **synchronizeAttributesAtTypeHint** | **kotlin.String**|  | [optional]
 **clockTolerance** | **kotlin.Int**|  | [optional]
 **clockToleranceAtTypeHint** | **kotlin.String**|  | [optional]
 **groupMembershipAttribute** | **kotlin.String**|  | [optional]
 **groupMembershipAttributeAtTypeHint** | **kotlin.String**|  | [optional]
 **idpUrl** | **kotlin.String**|  | [optional]
 **idpUrlAtTypeHint** | **kotlin.String**|  | [optional]
 **logoutUrl** | **kotlin.String**|  | [optional]
 **logoutUrlAtTypeHint** | **kotlin.String**|  | [optional]
 **serviceProviderEntityId** | **kotlin.String**|  | [optional]
 **serviceProviderEntityIdAtTypeHint** | **kotlin.String**|  | [optional]
 **assertionConsumerServiceURL** | **kotlin.String**|  | [optional]
 **assertionConsumerServiceURLAtTypeHint** | **kotlin.String**|  | [optional]
 **handleLogout** | **kotlin.Boolean**|  | [optional]
 **handleLogoutAtTypeHint** | **kotlin.String**|  | [optional]
 **spPrivateKeyAlias** | **kotlin.String**|  | [optional]
 **spPrivateKeyAliasAtTypeHint** | **kotlin.String**|  | [optional]
 **useEncryption** | **kotlin.Boolean**|  | [optional]
 **useEncryptionAtTypeHint** | **kotlin.String**|  | [optional]
 **nameIdFormat** | **kotlin.String**|  | [optional]
 **nameIdFormatAtTypeHint** | **kotlin.String**|  | [optional]
 **digestMethod** | **kotlin.String**|  | [optional]
 **digestMethodAtTypeHint** | **kotlin.String**|  | [optional]
 **signatureMethod** | **kotlin.String**|  | [optional]
 **signatureMethodAtTypeHint** | **kotlin.String**|  | [optional]
 **userIntermediatePath** | **kotlin.String**|  | [optional]
 **userIntermediatePathAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val orgApacheFelixHttpsNio : kotlin.Boolean = true // kotlin.Boolean | 
val orgApacheFelixHttpsNioAtTypeHint : kotlin.String = orgApacheFelixHttpsNioAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsKeystore : kotlin.String = orgApacheFelixHttpsKeystore_example // kotlin.String | 
val orgApacheFelixHttpsKeystoreAtTypeHint : kotlin.String = orgApacheFelixHttpsKeystoreAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsKeystorePassword : kotlin.String = orgApacheFelixHttpsKeystorePassword_example // kotlin.String | 
val orgApacheFelixHttpsKeystorePasswordAtTypeHint : kotlin.String = orgApacheFelixHttpsKeystorePasswordAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsKeystoreKey : kotlin.String = orgApacheFelixHttpsKeystoreKey_example // kotlin.String | 
val orgApacheFelixHttpsKeystoreKeyAtTypeHint : kotlin.String = orgApacheFelixHttpsKeystoreKeyAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsKeystoreKeyPassword : kotlin.String = orgApacheFelixHttpsKeystoreKeyPassword_example // kotlin.String | 
val orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint : kotlin.String = orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsTruststore : kotlin.String = orgApacheFelixHttpsTruststore_example // kotlin.String | 
val orgApacheFelixHttpsTruststoreAtTypeHint : kotlin.String = orgApacheFelixHttpsTruststoreAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsTruststorePassword : kotlin.String = orgApacheFelixHttpsTruststorePassword_example // kotlin.String | 
val orgApacheFelixHttpsTruststorePasswordAtTypeHint : kotlin.String = orgApacheFelixHttpsTruststorePasswordAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsClientcertificate : kotlin.String = orgApacheFelixHttpsClientcertificate_example // kotlin.String | 
val orgApacheFelixHttpsClientcertificateAtTypeHint : kotlin.String = orgApacheFelixHttpsClientcertificateAtTypeHint_example // kotlin.String | 
val orgApacheFelixHttpsEnable : kotlin.Boolean = true // kotlin.Boolean | 
val orgApacheFelixHttpsEnableAtTypeHint : kotlin.String = orgApacheFelixHttpsEnableAtTypeHint_example // kotlin.String | 
val orgOsgiServiceHttpPortSecure : kotlin.String = orgOsgiServiceHttpPortSecure_example // kotlin.String | 
val orgOsgiServiceHttpPortSecureAtTypeHint : kotlin.String = orgOsgiServiceHttpPortSecureAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postConfigApacheFelixJettyBasedHttpService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postConfigApacheFelixJettyBasedHttpService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **kotlin.Boolean**|  | [optional]
 **orgApacheFelixHttpsNioAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystore** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystoreAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystorePassword** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystorePasswordAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKey** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyPassword** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsTruststore** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsTruststoreAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsTruststorePassword** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsTruststorePasswordAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsClientcertificate** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsClientcertificateAtTypeHint** | **kotlin.String**|  | [optional]
 **orgApacheFelixHttpsEnable** | **kotlin.Boolean**|  | [optional]
 **orgApacheFelixHttpsEnableAtTypeHint** | **kotlin.String**|  | [optional]
 **orgOsgiServiceHttpPortSecure** | **kotlin.String**|  | [optional]
 **orgOsgiServiceHttpPortSecureAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val proxyHost : kotlin.String = proxyHost_example // kotlin.String | 
val proxyHostAtTypeHint : kotlin.String = proxyHostAtTypeHint_example // kotlin.String | 
val proxyPort : kotlin.Int = 56 // kotlin.Int | 
val proxyPortAtTypeHint : kotlin.String = proxyPortAtTypeHint_example // kotlin.String | 
val proxyExceptions : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val proxyExceptionsAtTypeHint : kotlin.String = proxyExceptionsAtTypeHint_example // kotlin.String | 
val proxyEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val proxyEnabledAtTypeHint : kotlin.String = proxyEnabledAtTypeHint_example // kotlin.String | 
val proxyUser : kotlin.String = proxyUser_example // kotlin.String | 
val proxyUserAtTypeHint : kotlin.String = proxyUserAtTypeHint_example // kotlin.String | 
val proxyPassword : kotlin.String = proxyPassword_example // kotlin.String | 
val proxyPasswordAtTypeHint : kotlin.String = proxyPasswordAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postConfigApacheHttpComponentsProxyConfiguration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postConfigApacheHttpComponentsProxyConfiguration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **kotlin.String**|  | [optional]
 **proxyHostAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyPort** | **kotlin.Int**|  | [optional]
 **proxyPortAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyExceptions** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **proxyExceptionsAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyEnabled** | **kotlin.Boolean**|  | [optional]
 **proxyEnabledAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyUser** | **kotlin.String**|  | [optional]
 **proxyUserAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyPassword** | **kotlin.String**|  | [optional]
 **proxyPasswordAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val alias : kotlin.String = alias_example // kotlin.String | 
val aliasAtTypeHint : kotlin.String = aliasAtTypeHint_example // kotlin.String | 
val davCreateAbsoluteUri : kotlin.Boolean = true // kotlin.Boolean | 
val davCreateAbsoluteUriAtTypeHint : kotlin.String = davCreateAbsoluteUriAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postConfigApacheSlingDavExServlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postConfigApacheSlingDavExServlet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **kotlin.String**|  | [optional]
 **aliasAtTypeHint** | **kotlin.String**|  | [optional]
 **davCreateAbsoluteUri** | **kotlin.Boolean**|  | [optional]
 **davCreateAbsoluteUriAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val jsonMaximumresults : kotlin.String = jsonMaximumresults_example // kotlin.String | 
val jsonMaximumresultsAtTypeHint : kotlin.String = jsonMaximumresultsAtTypeHint_example // kotlin.String | 
val enableHtml : kotlin.Boolean = true // kotlin.Boolean | 
val enableHtmlAtTypeHint : kotlin.String = enableHtmlAtTypeHint_example // kotlin.String | 
val enableTxt : kotlin.Boolean = true // kotlin.Boolean | 
val enableTxtAtTypeHint : kotlin.String = enableTxtAtTypeHint_example // kotlin.String | 
val enableXml : kotlin.Boolean = true // kotlin.Boolean | 
val enableXmlAtTypeHint : kotlin.String = enableXmlAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postConfigApacheSlingGetServlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postConfigApacheSlingGetServlet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **kotlin.String**|  | [optional]
 **jsonMaximumresultsAtTypeHint** | **kotlin.String**|  | [optional]
 **enableHtml** | **kotlin.Boolean**|  | [optional]
 **enableHtmlAtTypeHint** | **kotlin.String**|  | [optional]
 **enableTxt** | **kotlin.Boolean**|  | [optional]
 **enableTxtAtTypeHint** | **kotlin.String**|  | [optional]
 **enableXml** | **kotlin.Boolean**|  | [optional]
 **enableXmlAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val allowEmpty : kotlin.Boolean = true // kotlin.Boolean | 
val allowEmptyAtTypeHint : kotlin.String = allowEmptyAtTypeHint_example // kotlin.String | 
val allowHosts : kotlin.String = allowHosts_example // kotlin.String | 
val allowHostsAtTypeHint : kotlin.String = allowHostsAtTypeHint_example // kotlin.String | 
val allowHostsRegexp : kotlin.String = allowHostsRegexp_example // kotlin.String | 
val allowHostsRegexpAtTypeHint : kotlin.String = allowHostsRegexpAtTypeHint_example // kotlin.String | 
val filterMethods : kotlin.String = filterMethods_example // kotlin.String | 
val filterMethodsAtTypeHint : kotlin.String = filterMethodsAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postConfigApacheSlingReferrerFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postConfigApacheSlingReferrerFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **kotlin.Boolean**|  | [optional]
 **allowEmptyAtTypeHint** | **kotlin.String**|  | [optional]
 **allowHosts** | **kotlin.String**|  | [optional]
 **allowHostsAtTypeHint** | **kotlin.String**|  | [optional]
 **allowHostsRegexp** | **kotlin.String**|  | [optional]
 **allowHostsRegexpAtTypeHint** | **kotlin.String**|  | [optional]
 **filterMethods** | **kotlin.String**|  | [optional]
 **filterMethodsAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigProperty"></a>
# **postConfigProperty**
> postConfigProperty(configNodeName)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val configNodeName : kotlin.String = configNodeName_example // kotlin.String | 
try {
    apiInstance.postConfigProperty(configNodeName)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postConfigProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postConfigProperty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postNode"></a>
# **postNode**
> postNode(path, name, colonOperation, deleteAuthorizable, file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val colonOperation : kotlin.String = colonOperation_example // kotlin.String | 
val deleteAuthorizable : kotlin.String = deleteAuthorizable_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.postNode(path, name, colonOperation, deleteAuthorizable, file)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **colonOperation** | **kotlin.String**|  | [optional]
 **deleteAuthorizable** | **kotlin.String**|  | [optional]
 **file** | **java.io.File**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, addMembers)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val addMembers : kotlin.String = addMembers_example // kotlin.String | 
try {
    apiInstance.postNodeRw(path, name, addMembers)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postNodeRw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postNodeRw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **addMembers** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postPath"></a>
# **postPath**
> postPath(path, jcrColonPrimaryType, colonName)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val jcrColonPrimaryType : kotlin.String = jcrColonPrimaryType_example // kotlin.String | 
val colonName : kotlin.String = colonName_example // kotlin.String | 
try {
    apiInstance.postPath(path, jcrColonPrimaryType, colonName)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postPath")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postPath")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **jcrColonPrimaryType** | **kotlin.String**|  |
 **colonName** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postQuery"></a>
# **postQuery**
> kotlin.String postQuery(path, pLimit, `1property`, `1propertyValue`)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val pLimit : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val `1property` : kotlin.String = `1property`_example // kotlin.String | 
val `1propertyValue` : kotlin.String = `1propertyValue`_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postQuery(path, pLimit, `1property`, `1propertyValue`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postQuery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **kotlin.String**|  |
 **pLimit** | **java.math.BigDecimal**|  |
 **&#x60;1property&#x60;** | **kotlin.String**|  |
 **&#x60;1propertyValue&#x60;** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTreeActivation"></a>
# **postTreeActivation**
> postTreeActivation(ignoredeactivated, onlymodified, path)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val ignoredeactivated : kotlin.Boolean = true // kotlin.Boolean | 
val onlymodified : kotlin.Boolean = true // kotlin.Boolean | 
val path : kotlin.String = path_example // kotlin.String | 
try {
    apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postTreeActivation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postTreeActivation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **kotlin.Boolean**|  |
 **onlymodified** | **kotlin.Boolean**|  |
 **path** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postTruststore"></a>
# **postTruststore**
> kotlin.String postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val colonOperation : kotlin.String = colonOperation_example // kotlin.String | 
val newPassword : kotlin.String = newPassword_example // kotlin.String | 
val rePassword : kotlin.String = rePassword_example // kotlin.String | 
val keyStoreType : kotlin.String = keyStoreType_example // kotlin.String | 
val removeAlias : kotlin.String = removeAlias_example // kotlin.String | 
val certificate : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postTruststore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postTruststore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **colonOperation** | **kotlin.String**|  | [optional]
 **newPassword** | **kotlin.String**|  | [optional]
 **rePassword** | **kotlin.String**|  | [optional]
 **keyStoreType** | **kotlin.String**|  | [optional]
 **removeAlias** | **kotlin.String**|  | [optional]
 **certificate** | **java.io.File**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
> kotlin.String postTruststorePKCS12(truststoreP12)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val truststoreP12 : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.postTruststorePKCS12(truststoreP12)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SlingApi#postTruststorePKCS12")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SlingApi#postTruststorePKCS12")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **java.io.File**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure aemAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

