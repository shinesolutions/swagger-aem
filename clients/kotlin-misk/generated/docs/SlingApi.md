# SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **Delete** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **Delete** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **Get** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **Get** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **Get** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getKeystore) | **Get** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getNode) | **Get** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **Get** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **Get** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **Get** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#getTruststore) | **Get** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **Get** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **Post** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **Post** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **Post** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **Post** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **Post** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **Post** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **Post** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **Post** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **Post** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](SlingApi.md#postConfigProperty) | **Post** /apps/system/config/{configNodeName} | 
[**postNode**](SlingApi.md#postNode) | **Post** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **Post** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **Post** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **Post** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **Post** /libs/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **Post** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **Post** /etc/truststore | 


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(runmode, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAgents"></a>
# **getAgents**
> kotlin.String getAgents(runmode)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: TEXT_PLAIN_UTF8

<a name="getKeystore"></a>
# **getKeystore**
> java.io.File getKeystore(intermediatePath, authorizableId)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ 

<a name="getNode"></a>
# **getNode**
> getNode(path, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPackage"></a>
# **getPackage**
> java.io.File getPackage(group, name, version)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ 

<a name="getPackageFilter"></a>
# **getPackageFilter**
> kotlin.String getPackageFilter(group, name, version)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getQuery"></a>
# **getQuery**
> kotlin.String getQuery(path, pLimit, `1property`, `1propertyValue`)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="getTruststore"></a>
# **getTruststore**
> java.io.File getTruststore()



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ 

<a name="getTruststoreInfo"></a>
# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SlingApi()
val runmode : kotlin.String = runmode_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val jcrContentCqDistribute : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentCqDistributeAtTypeHint : kotlin.String = jcrContentCqDistributeAtTypeHint_example // kotlin.String | 
val jcrContentCqName : kotlin.String = jcrContentCqName_example // kotlin.String | 
val jcrContentCqTemplate : kotlin.String = jcrContentCqTemplate_example // kotlin.String | 
val jcrContentAliasUpdate : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentEnabled : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentJcrDescription : kotlin.String = jcrContentJcrDescription_example // kotlin.String | 
val jcrContentJcrLastModified : kotlin.String = jcrContentJcrLastModified_example // kotlin.String | 
val jcrContentJcrLastModifiedBy : kotlin.String = jcrContentJcrLastModifiedBy_example // kotlin.String | 
val jcrContentJcrMixinTypes : kotlin.String = jcrContentJcrMixinTypes_example // kotlin.String | 
val jcrContentJcrTitle : kotlin.String = jcrContentJcrTitle_example // kotlin.String | 
val jcrContentLogLevel : kotlin.String = jcrContentLogLevel_example // kotlin.String | 
val jcrContentNoStatusUpdate : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentNoVersioning : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentProtocolConnectTimeout : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrContentProtocolHTTPConnectionClosed : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentProtocolHTTPExpired : kotlin.String = jcrContentProtocolHTTPExpired_example // kotlin.String | 
val jcrContentProtocolHTTPHeaders : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val jcrContentProtocolHTTPHeadersAtTypeHint : kotlin.String = jcrContentProtocolHTTPHeadersAtTypeHint_example // kotlin.String | 
val jcrContentProtocolHTTPMethod : kotlin.String = jcrContentProtocolHTTPMethod_example // kotlin.String | 
val jcrContentProtocolHTTPSRelaxed : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentProtocolInterface : kotlin.String = jcrContentProtocolInterface_example // kotlin.String | 
val jcrContentProtocolSocketTimeout : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrContentProtocolVersion : kotlin.String = jcrContentProtocolVersion_example // kotlin.String | 
val jcrContentProxyNTLMDomain : kotlin.String = jcrContentProxyNTLMDomain_example // kotlin.String | 
val jcrContentProxyNTLMHost : kotlin.String = jcrContentProxyNTLMHost_example // kotlin.String | 
val jcrContentProxyHost : kotlin.String = jcrContentProxyHost_example // kotlin.String | 
val jcrContentProxyPassword : kotlin.String = jcrContentProxyPassword_example // kotlin.String | 
val jcrContentProxyPort : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrContentProxyUser : kotlin.String = jcrContentProxyUser_example // kotlin.String | 
val jcrContentQueueBatchMaxSize : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrContentQueueBatchMode : kotlin.String = jcrContentQueueBatchMode_example // kotlin.String | 
val jcrContentQueueBatchWaitTime : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val jcrContentRetryDelay : kotlin.String = jcrContentRetryDelay_example // kotlin.String | 
val jcrContentReverseReplication : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSerializationType : kotlin.String = jcrContentSerializationType_example // kotlin.String | 
val jcrContentSlingResourceType : kotlin.String = jcrContentSlingResourceType_example // kotlin.String | 
val jcrContentSsl : kotlin.String = jcrContentSsl_example // kotlin.String | 
val jcrContentTransportNTLMDomain : kotlin.String = jcrContentTransportNTLMDomain_example // kotlin.String | 
val jcrContentTransportNTLMHost : kotlin.String = jcrContentTransportNTLMHost_example // kotlin.String | 
val jcrContentTransportPassword : kotlin.String = jcrContentTransportPassword_example // kotlin.String | 
val jcrContentTransportUri : kotlin.String = jcrContentTransportUri_example // kotlin.String | 
val jcrContentTransportUser : kotlin.String = jcrContentTransportUser_example // kotlin.String | 
val jcrContentTriggerDistribute : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentTriggerModified : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentTriggerOnOffTime : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentTriggerReceive : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentTriggerSpecific : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentUserId : kotlin.String = jcrContentUserId_example // kotlin.String | 
val jcrPrimaryType : kotlin.String = jcrPrimaryType_example // kotlin.String | 
val operation : kotlin.String = operation_example // kotlin.String | 
try {
    apiInstance.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)
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
 **jcrContentCqDistribute** | **kotlin.Boolean**|  | [optional]
 **jcrContentCqDistributeAtTypeHint** | **kotlin.String**|  | [optional]
 **jcrContentCqName** | **kotlin.String**|  | [optional]
 **jcrContentCqTemplate** | **kotlin.String**|  | [optional]
 **jcrContentAliasUpdate** | **kotlin.Boolean**|  | [optional]
 **jcrContentEnabled** | **kotlin.Boolean**|  | [optional]
 **jcrContentJcrDescription** | **kotlin.String**|  | [optional]
 **jcrContentJcrLastModified** | **kotlin.String**|  | [optional]
 **jcrContentJcrLastModifiedBy** | **kotlin.String**|  | [optional]
 **jcrContentJcrMixinTypes** | **kotlin.String**|  | [optional]
 **jcrContentJcrTitle** | **kotlin.String**|  | [optional]
 **jcrContentLogLevel** | **kotlin.String**|  | [optional]
 **jcrContentNoStatusUpdate** | **kotlin.Boolean**|  | [optional]
 **jcrContentNoVersioning** | **kotlin.Boolean**|  | [optional]
 **jcrContentProtocolConnectTimeout** | **java.math.BigDecimal**|  | [optional]
 **jcrContentProtocolHTTPConnectionClosed** | **kotlin.Boolean**|  | [optional]
 **jcrContentProtocolHTTPExpired** | **kotlin.String**|  | [optional]
 **jcrContentProtocolHTTPHeaders** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **jcrContentProtocolHTTPHeadersAtTypeHint** | **kotlin.String**|  | [optional]
 **jcrContentProtocolHTTPMethod** | **kotlin.String**|  | [optional]
 **jcrContentProtocolHTTPSRelaxed** | **kotlin.Boolean**|  | [optional]
 **jcrContentProtocolInterface** | **kotlin.String**|  | [optional]
 **jcrContentProtocolSocketTimeout** | **java.math.BigDecimal**|  | [optional]
 **jcrContentProtocolVersion** | **kotlin.String**|  | [optional]
 **jcrContentProxyNTLMDomain** | **kotlin.String**|  | [optional]
 **jcrContentProxyNTLMHost** | **kotlin.String**|  | [optional]
 **jcrContentProxyHost** | **kotlin.String**|  | [optional]
 **jcrContentProxyPassword** | **kotlin.String**|  | [optional]
 **jcrContentProxyPort** | **java.math.BigDecimal**|  | [optional]
 **jcrContentProxyUser** | **kotlin.String**|  | [optional]
 **jcrContentQueueBatchMaxSize** | **java.math.BigDecimal**|  | [optional]
 **jcrContentQueueBatchMode** | **kotlin.String**|  | [optional]
 **jcrContentQueueBatchWaitTime** | **java.math.BigDecimal**|  | [optional]
 **jcrContentRetryDelay** | **kotlin.String**|  | [optional]
 **jcrContentReverseReplication** | **kotlin.Boolean**|  | [optional]
 **jcrContentSerializationType** | **kotlin.String**|  | [optional]
 **jcrContentSlingResourceType** | **kotlin.String**|  | [optional]
 **jcrContentSsl** | **kotlin.String**|  | [optional]
 **jcrContentTransportNTLMDomain** | **kotlin.String**|  | [optional]
 **jcrContentTransportNTLMHost** | **kotlin.String**|  | [optional]
 **jcrContentTransportPassword** | **kotlin.String**|  | [optional]
 **jcrContentTransportUri** | **kotlin.String**|  | [optional]
 **jcrContentTransportUser** | **kotlin.String**|  | [optional]
 **jcrContentTriggerDistribute** | **kotlin.Boolean**|  | [optional]
 **jcrContentTriggerModified** | **kotlin.Boolean**|  | [optional]
 **jcrContentTriggerOnOffTime** | **kotlin.Boolean**|  | [optional]
 **jcrContentTriggerReceive** | **kotlin.Boolean**|  | [optional]
 **jcrContentTriggerSpecific** | **kotlin.Boolean**|  | [optional]
 **jcrContentUserId** | **kotlin.String**|  | [optional]
 **jcrPrimaryType** | **kotlin.String**|  | [optional]
 **operation** | **kotlin.String**|  | [optional]

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
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SlingApi()
val intermediatePath : kotlin.String = intermediatePath_example // kotlin.String | 
val authorizableId : kotlin.String = authorizableId_example // kotlin.String | 
val operation : kotlin.String = operation_example // kotlin.String | 
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
    val result : KeystoreInfo = apiInstance.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)
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
 **operation** | **kotlin.String**|  | [optional]
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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: FORM_DATA
 - **Accept**: TEXT_PLAIN_UTF8

<a name="postAuthorizables"></a>
# **postAuthorizables**
> kotlin.String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SlingApi()
val authorizableId : kotlin.String = authorizableId_example // kotlin.String | 
val intermediatePath : kotlin.String = intermediatePath_example // kotlin.String | 
val createUser : kotlin.String = createUser_example // kotlin.String | 
val createGroup : kotlin.String = createGroup_example // kotlin.String | 
val repPassword : kotlin.String = repPassword_example // kotlin.String | 
val profileGivenName : kotlin.String = profileGivenName_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)
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
 **repPassword** | **kotlin.String**|  | [optional]
 **profileGivenName** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: TEXT_HTML

<a name="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigProperty"></a>
# **postConfigProperty**
> postConfigProperty(configNodeName)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postNode"></a>
# **postNode**
> postNode(path, name, operation, deleteAuthorizable, file)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val operation : kotlin.String = operation_example // kotlin.String | 
val deleteAuthorizable : kotlin.String = deleteAuthorizable_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.postNode(path, name, operation, deleteAuthorizable, file)
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
 **operation** | **kotlin.String**|  | [optional]
 **deleteAuthorizable** | **kotlin.String**|  | [optional]
 **file** | **java.io.File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: FORM_DATA
 - **Accept**: Not defined

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, addMembers)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postPath"></a>
# **postPath**
> postPath(path, jcrPrimaryType, name)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val jcrPrimaryType : kotlin.String = jcrPrimaryType_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
try {
    apiInstance.postPath(path, jcrPrimaryType, name)
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
 **jcrPrimaryType** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postQuery"></a>
# **postQuery**
> kotlin.String postQuery(path, pLimit, `1property`, `1propertyValue`)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="postTreeActivation"></a>
# **postTreeActivation**
> postTreeActivation(ignoredeactivated, onlymodified, path, cmd)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SlingApi()
val ignoredeactivated : kotlin.Boolean = true // kotlin.Boolean | 
val onlymodified : kotlin.Boolean = true // kotlin.Boolean | 
val path : kotlin.String = path_example // kotlin.String | 
val cmd : kotlin.String = cmd_example // kotlin.String | 
try {
    apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path, cmd)
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
 **cmd** | **kotlin.String**|  | [default to &quot;activate&quot;]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postTruststore"></a>
# **postTruststore**
> kotlin.String postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SlingApi()
val operation : kotlin.String = operation_example // kotlin.String | 
val newPassword : kotlin.String = newPassword_example // kotlin.String | 
val rePassword : kotlin.String = rePassword_example // kotlin.String | 
val keyStoreType : kotlin.String = keyStoreType_example // kotlin.String | 
val removeAlias : kotlin.String = removeAlias_example // kotlin.String | 
val certificate : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)
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
 **operation** | **kotlin.String**|  | [optional]
 **newPassword** | **kotlin.String**|  | [optional]
 **rePassword** | **kotlin.String**|  | [optional]
 **keyStoreType** | **kotlin.String**|  | [optional]
 **removeAlias** | **kotlin.String**|  | [optional]
 **certificate** | **java.io.File**|  | [optional]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: FORM_DATA
 - **Accept**: TEXT_PLAIN_UTF8

<a name="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
> kotlin.String postTruststorePKCS12(truststoreP12)



### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: FORM_DATA
 - **Accept**: TEXT_PLAIN_UTF8

