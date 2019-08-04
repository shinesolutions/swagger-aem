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

[aemAuth](../README.md#aemAuth)

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

[aemAuth](../README.md#aemAuth)

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

[aemAuth](../README.md#aemAuth)

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

[aemAuth](../README.md#aemAuth)

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuery"></a>
# **getQuery**
> kotlin.String getQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val pPeriodlimit : java.math.BigDecimal = 1.2 // java.math.BigDecimal | 
val 1Property : kotlin.String = 1Property_example // kotlin.String | 
val 1PropertyPeriodvalue : kotlin.String = 1PropertyPeriodvalue_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue)
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
 **pPeriodlimit** | **java.math.BigDecimal**|  |
 **1Property** | **kotlin.String**|  |
 **1PropertyPeriodvalue** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

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

[aemAuth](../README.md#aemAuth)

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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val runmode : kotlin.String = runmode_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val jcrContentSlashcqDistribute : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashcqDistributeAtTypeHint : kotlin.String = jcrContentSlashcqDistributeAtTypeHint_example // kotlin.String | 
val jcrContentSlashcqName : kotlin.String = jcrContentSlashcqName_example // kotlin.String | 
val jcrContentSlashcqTemplate : kotlin.String = jcrContentSlashcqTemplate_example // kotlin.String | 
val jcrContentSlashenabled : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashjcrDescription : kotlin.String = jcrContentSlashjcrDescription_example // kotlin.String | 
val jcrContentSlashjcrLastModified : kotlin.String = jcrContentSlashjcrLastModified_example // kotlin.String | 
val jcrContentSlashjcrLastModifiedBy : kotlin.String = jcrContentSlashjcrLastModifiedBy_example // kotlin.String | 
val jcrContentSlashjcrMixinTypes : kotlin.String = jcrContentSlashjcrMixinTypes_example // kotlin.String | 
val jcrContentSlashjcrTitle : kotlin.String = jcrContentSlashjcrTitle_example // kotlin.String | 
val jcrContentSlashlogLevel : kotlin.String = jcrContentSlashlogLevel_example // kotlin.String | 
val jcrContentSlashnoStatusUpdate : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashnoVersioning : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashprotocolConnectTimeout : java.math.BigDecimal = 1.2 // java.math.BigDecimal | 
val jcrContentSlashprotocolHTTPConnectionClosed : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashprotocolHTTPExpired : kotlin.String = jcrContentSlashprotocolHTTPExpired_example // kotlin.String | 
val jcrContentSlashprotocolHTTPHeaders : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val jcrContentSlashprotocolHTTPHeadersAtTypeHint : kotlin.String = jcrContentSlashprotocolHTTPHeadersAtTypeHint_example // kotlin.String | 
val jcrContentSlashprotocolHTTPMethod : kotlin.String = jcrContentSlashprotocolHTTPMethod_example // kotlin.String | 
val jcrContentSlashprotocolHTTPSRelaxed : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashprotocolInterface : kotlin.String = jcrContentSlashprotocolInterface_example // kotlin.String | 
val jcrContentSlashprotocolSocketTimeout : java.math.BigDecimal = 1.2 // java.math.BigDecimal | 
val jcrContentSlashprotocolVersion : kotlin.String = jcrContentSlashprotocolVersion_example // kotlin.String | 
val jcrContentSlashproxyNTLMDomain : kotlin.String = jcrContentSlashproxyNTLMDomain_example // kotlin.String | 
val jcrContentSlashproxyNTLMHost : kotlin.String = jcrContentSlashproxyNTLMHost_example // kotlin.String | 
val jcrContentSlashproxyHost : kotlin.String = jcrContentSlashproxyHost_example // kotlin.String | 
val jcrContentSlashproxyPassword : kotlin.String = jcrContentSlashproxyPassword_example // kotlin.String | 
val jcrContentSlashproxyPort : java.math.BigDecimal = 1.2 // java.math.BigDecimal | 
val jcrContentSlashproxyUser : kotlin.String = jcrContentSlashproxyUser_example // kotlin.String | 
val jcrContentSlashqueueBatchMaxSize : java.math.BigDecimal = 1.2 // java.math.BigDecimal | 
val jcrContentSlashqueueBatchMode : kotlin.String = jcrContentSlashqueueBatchMode_example // kotlin.String | 
val jcrContentSlashqueueBatchWaitTime : java.math.BigDecimal = 1.2 // java.math.BigDecimal | 
val jcrContentSlashretryDelay : kotlin.String = jcrContentSlashretryDelay_example // kotlin.String | 
val jcrContentSlashreverseReplication : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashserializationType : kotlin.String = jcrContentSlashserializationType_example // kotlin.String | 
val jcrContentSlashslingResourceType : kotlin.String = jcrContentSlashslingResourceType_example // kotlin.String | 
val jcrContentSlashssl : kotlin.String = jcrContentSlashssl_example // kotlin.String | 
val jcrContentSlashtransportNTLMDomain : kotlin.String = jcrContentSlashtransportNTLMDomain_example // kotlin.String | 
val jcrContentSlashtransportNTLMHost : kotlin.String = jcrContentSlashtransportNTLMHost_example // kotlin.String | 
val jcrContentSlashtransportPassword : kotlin.String = jcrContentSlashtransportPassword_example // kotlin.String | 
val jcrContentSlashtransportUri : kotlin.String = jcrContentSlashtransportUri_example // kotlin.String | 
val jcrContentSlashtransportUser : kotlin.String = jcrContentSlashtransportUser_example // kotlin.String | 
val jcrContentSlashtriggerDistribute : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashtriggerModified : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashtriggerOnOffTime : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashtriggerReceive : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashtriggerSpecific : kotlin.Boolean = true // kotlin.Boolean | 
val jcrContentSlashuserId : kotlin.String = jcrContentSlashuserId_example // kotlin.String | 
val jcrPrimaryType : kotlin.String = jcrPrimaryType_example // kotlin.String | 
val operation : kotlin.String = operation_example // kotlin.String | 
try {
    apiInstance.postAgent(runmode, name, jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation)
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
 **jcrContentSlashcqDistribute** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashcqDistributeAtTypeHint** | **kotlin.String**|  | [optional]
 **jcrContentSlashcqName** | **kotlin.String**|  | [optional]
 **jcrContentSlashcqTemplate** | **kotlin.String**|  | [optional]
 **jcrContentSlashenabled** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashjcrDescription** | **kotlin.String**|  | [optional]
 **jcrContentSlashjcrLastModified** | **kotlin.String**|  | [optional]
 **jcrContentSlashjcrLastModifiedBy** | **kotlin.String**|  | [optional]
 **jcrContentSlashjcrMixinTypes** | **kotlin.String**|  | [optional]
 **jcrContentSlashjcrTitle** | **kotlin.String**|  | [optional]
 **jcrContentSlashlogLevel** | **kotlin.String**|  | [optional]
 **jcrContentSlashnoStatusUpdate** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashnoVersioning** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashprotocolConnectTimeout** | **java.math.BigDecimal**|  | [optional]
 **jcrContentSlashprotocolHTTPConnectionClosed** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashprotocolHTTPExpired** | **kotlin.String**|  | [optional]
 **jcrContentSlashprotocolHTTPHeaders** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **jcrContentSlashprotocolHTTPHeadersAtTypeHint** | **kotlin.String**|  | [optional]
 **jcrContentSlashprotocolHTTPMethod** | **kotlin.String**|  | [optional]
 **jcrContentSlashprotocolHTTPSRelaxed** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashprotocolInterface** | **kotlin.String**|  | [optional]
 **jcrContentSlashprotocolSocketTimeout** | **java.math.BigDecimal**|  | [optional]
 **jcrContentSlashprotocolVersion** | **kotlin.String**|  | [optional]
 **jcrContentSlashproxyNTLMDomain** | **kotlin.String**|  | [optional]
 **jcrContentSlashproxyNTLMHost** | **kotlin.String**|  | [optional]
 **jcrContentSlashproxyHost** | **kotlin.String**|  | [optional]
 **jcrContentSlashproxyPassword** | **kotlin.String**|  | [optional]
 **jcrContentSlashproxyPort** | **java.math.BigDecimal**|  | [optional]
 **jcrContentSlashproxyUser** | **kotlin.String**|  | [optional]
 **jcrContentSlashqueueBatchMaxSize** | **java.math.BigDecimal**|  | [optional]
 **jcrContentSlashqueueBatchMode** | **kotlin.String**|  | [optional]
 **jcrContentSlashqueueBatchWaitTime** | **java.math.BigDecimal**|  | [optional]
 **jcrContentSlashretryDelay** | **kotlin.String**|  | [optional]
 **jcrContentSlashreverseReplication** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashserializationType** | **kotlin.String**|  | [optional]
 **jcrContentSlashslingResourceType** | **kotlin.String**|  | [optional]
 **jcrContentSlashssl** | **kotlin.String**|  | [optional]
 **jcrContentSlashtransportNTLMDomain** | **kotlin.String**|  | [optional]
 **jcrContentSlashtransportNTLMHost** | **kotlin.String**|  | [optional]
 **jcrContentSlashtransportPassword** | **kotlin.String**|  | [optional]
 **jcrContentSlashtransportUri** | **kotlin.String**|  | [optional]
 **jcrContentSlashtransportUser** | **kotlin.String**|  | [optional]
 **jcrContentSlashtriggerDistribute** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashtriggerModified** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashtriggerOnOffTime** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashtriggerReceive** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashtriggerSpecific** | **kotlin.Boolean**|  | [optional]
 **jcrContentSlashuserId** | **kotlin.String**|  | [optional]
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
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
 **certChain** | **java.io.File**|  | [optional] [default to null]
 **pk** | **java.io.File**|  | [optional] [default to null]
 **keyStore** | **java.io.File**|  | [optional] [default to null]

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> kotlin.String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName)



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
val repPassword : kotlin.String = repPassword_example // kotlin.String | 
val profileSlashgivenName : kotlin.String = profileSlashgivenName_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName)
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
 **profileSlashgivenName** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val keyStorePassword : kotlin.String = keyStorePassword_example // kotlin.String | 
val keyStorePasswordAtTypeHint : kotlin.String = keyStorePasswordAtTypeHint_example // kotlin.String | 
val servicePeriodranking : kotlin.Int = 56 // kotlin.Int | 
val servicePeriodrankingAtTypeHint : kotlin.String = servicePeriodrankingAtTypeHint_example // kotlin.String | 
val idpHttpRedirect : kotlin.Boolean = true // kotlin.Boolean | 
val idpHttpRedirectAtTypeHint : kotlin.String = idpHttpRedirectAtTypeHint_example // kotlin.String | 
val createUser : kotlin.Boolean = true // kotlin.Boolean | 
val createUserAtTypeHint : kotlin.String = createUserAtTypeHint_example // kotlin.String | 
val defaultRedirectUrl : kotlin.String = defaultRedirectUrl_example // kotlin.String | 
val defaultRedirectUrlAtTypeHint : kotlin.String = defaultRedirectUrlAtTypeHint_example // kotlin.String | 
val userIDAttribute : kotlin.String = userIDAttribute_example // kotlin.String | 
val userIDAttributeAtTypeHint : kotlin.String = userIDAttributeAtTypeHint_example // kotlin.String | 
val defaultGroups : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val defaultGroupsAtTypeHint : kotlin.String = defaultGroupsAtTypeHint_example // kotlin.String | 
val idpCertAlias : kotlin.String = idpCertAlias_example // kotlin.String | 
val idpCertAliasAtTypeHint : kotlin.String = idpCertAliasAtTypeHint_example // kotlin.String | 
val addGroupMemberships : kotlin.Boolean = true // kotlin.Boolean | 
val addGroupMembershipsAtTypeHint : kotlin.String = addGroupMembershipsAtTypeHint_example // kotlin.String | 
val path : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val pathAtTypeHint : kotlin.String = pathAtTypeHint_example // kotlin.String | 
val synchronizeAttributes : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
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
    apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)
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
 **servicePeriodranking** | **kotlin.Int**|  | [optional]
 **servicePeriodrankingAtTypeHint** | **kotlin.String**|  | [optional]
 **idpHttpRedirect** | **kotlin.Boolean**|  | [optional]
 **idpHttpRedirectAtTypeHint** | **kotlin.String**|  | [optional]
 **createUser** | **kotlin.Boolean**|  | [optional]
 **createUserAtTypeHint** | **kotlin.String**|  | [optional]
 **defaultRedirectUrl** | **kotlin.String**|  | [optional]
 **defaultRedirectUrlAtTypeHint** | **kotlin.String**|  | [optional]
 **userIDAttribute** | **kotlin.String**|  | [optional]
 **userIDAttributeAtTypeHint** | **kotlin.String**|  | [optional]
 **defaultGroups** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **defaultGroupsAtTypeHint** | **kotlin.String**|  | [optional]
 **idpCertAlias** | **kotlin.String**|  | [optional]
 **idpCertAliasAtTypeHint** | **kotlin.String**|  | [optional]
 **addGroupMemberships** | **kotlin.Boolean**|  | [optional]
 **addGroupMembershipsAtTypeHint** | **kotlin.String**|  | [optional]
 **path** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **pathAtTypeHint** | **kotlin.String**|  | [optional]
 **synchronizeAttributes** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
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
> postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val orgPeriodapachePeriodfelixPeriodhttpsPeriodnio : kotlin.Boolean = true // kotlin.Boolean | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint_example // kotlin.String | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodenable : kotlin.Boolean = true // kotlin.Boolean | 
val orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint : kotlin.String = orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint_example // kotlin.String | 
val orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure : kotlin.String = orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure_example // kotlin.String | 
val orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint : kotlin.String = orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint)
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
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodnio** | **kotlin.Boolean**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodenable** | **kotlin.Boolean**|  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint** | **kotlin.String**|  | [optional]
 **orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure** | **kotlin.String**|  | [optional]
 **orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val proxyPeriodhost : kotlin.String = proxyPeriodhost_example // kotlin.String | 
val proxyPeriodhostAtTypeHint : kotlin.String = proxyPeriodhostAtTypeHint_example // kotlin.String | 
val proxyPeriodport : kotlin.Int = 56 // kotlin.Int | 
val proxyPeriodportAtTypeHint : kotlin.String = proxyPeriodportAtTypeHint_example // kotlin.String | 
val proxyPeriodexceptions : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val proxyPeriodexceptionsAtTypeHint : kotlin.String = proxyPeriodexceptionsAtTypeHint_example // kotlin.String | 
val proxyPeriodenabled : kotlin.Boolean = true // kotlin.Boolean | 
val proxyPeriodenabledAtTypeHint : kotlin.String = proxyPeriodenabledAtTypeHint_example // kotlin.String | 
val proxyPerioduser : kotlin.String = proxyPerioduser_example // kotlin.String | 
val proxyPerioduserAtTypeHint : kotlin.String = proxyPerioduserAtTypeHint_example // kotlin.String | 
val proxyPeriodpassword : kotlin.String = proxyPeriodpassword_example // kotlin.String | 
val proxyPeriodpasswordAtTypeHint : kotlin.String = proxyPeriodpasswordAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint)
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
 **proxyPeriodhost** | **kotlin.String**|  | [optional]
 **proxyPeriodhostAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyPeriodport** | **kotlin.Int**|  | [optional]
 **proxyPeriodportAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyPeriodexceptions** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **proxyPeriodexceptionsAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyPeriodenabled** | **kotlin.Boolean**|  | [optional]
 **proxyPeriodenabledAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyPerioduser** | **kotlin.String**|  | [optional]
 **proxyPerioduserAtTypeHint** | **kotlin.String**|  | [optional]
 **proxyPeriodpassword** | **kotlin.String**|  | [optional]
 **proxyPeriodpasswordAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val alias : kotlin.String = alias_example // kotlin.String | 
val aliasAtTypeHint : kotlin.String = aliasAtTypeHint_example // kotlin.String | 
val davPeriodcreateAbsoluteUri : kotlin.Boolean = true // kotlin.Boolean | 
val davPeriodcreateAbsoluteUriAtTypeHint : kotlin.String = davPeriodcreateAbsoluteUriAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint)
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
 **davPeriodcreateAbsoluteUri** | **kotlin.Boolean**|  | [optional]
 **davPeriodcreateAbsoluteUriAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val jsonPeriodmaximumresults : kotlin.String = jsonPeriodmaximumresults_example // kotlin.String | 
val jsonPeriodmaximumresultsAtTypeHint : kotlin.String = jsonPeriodmaximumresultsAtTypeHint_example // kotlin.String | 
val enablePeriodhtml : kotlin.Boolean = true // kotlin.Boolean | 
val enablePeriodhtmlAtTypeHint : kotlin.String = enablePeriodhtmlAtTypeHint_example // kotlin.String | 
val enablePeriodtxt : kotlin.Boolean = true // kotlin.Boolean | 
val enablePeriodtxtAtTypeHint : kotlin.String = enablePeriodtxtAtTypeHint_example // kotlin.String | 
val enablePeriodxml : kotlin.Boolean = true // kotlin.Boolean | 
val enablePeriodxmlAtTypeHint : kotlin.String = enablePeriodxmlAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheSlingGetServlet(jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint)
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
 **jsonPeriodmaximumresults** | **kotlin.String**|  | [optional]
 **jsonPeriodmaximumresultsAtTypeHint** | **kotlin.String**|  | [optional]
 **enablePeriodhtml** | **kotlin.Boolean**|  | [optional]
 **enablePeriodhtmlAtTypeHint** | **kotlin.String**|  | [optional]
 **enablePeriodtxt** | **kotlin.Boolean**|  | [optional]
 **enablePeriodtxtAtTypeHint** | **kotlin.String**|  | [optional]
 **enablePeriodxml** | **kotlin.Boolean**|  | [optional]
 **enablePeriodxmlAtTypeHint** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val allowPeriodempty : kotlin.Boolean = true // kotlin.Boolean | 
val allowPeriodemptyAtTypeHint : kotlin.String = allowPeriodemptyAtTypeHint_example // kotlin.String | 
val allowPeriodhosts : kotlin.String = allowPeriodhosts_example // kotlin.String | 
val allowPeriodhostsAtTypeHint : kotlin.String = allowPeriodhostsAtTypeHint_example // kotlin.String | 
val allowPeriodhostsPeriodregexp : kotlin.String = allowPeriodhostsPeriodregexp_example // kotlin.String | 
val allowPeriodhostsPeriodregexpAtTypeHint : kotlin.String = allowPeriodhostsPeriodregexpAtTypeHint_example // kotlin.String | 
val filterPeriodmethods : kotlin.String = filterPeriodmethods_example // kotlin.String | 
val filterPeriodmethodsAtTypeHint : kotlin.String = filterPeriodmethodsAtTypeHint_example // kotlin.String | 
try {
    apiInstance.postConfigApacheSlingReferrerFilter(allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint)
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
 **allowPeriodempty** | **kotlin.Boolean**|  | [optional]
 **allowPeriodemptyAtTypeHint** | **kotlin.String**|  | [optional]
 **allowPeriodhosts** | **kotlin.String**|  | [optional]
 **allowPeriodhostsAtTypeHint** | **kotlin.String**|  | [optional]
 **allowPeriodhostsPeriodregexp** | **kotlin.String**|  | [optional]
 **allowPeriodhostsPeriodregexpAtTypeHint** | **kotlin.String**|  | [optional]
 **filterPeriodmethods** | **kotlin.String**|  | [optional]
 **filterPeriodmethodsAtTypeHint** | **kotlin.String**|  | [optional]

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
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
 **file** | **java.io.File**|  | [optional] [default to null]

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
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
> kotlin.String postQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val path : kotlin.String = path_example // kotlin.String | 
val pPeriodlimit : java.math.BigDecimal = 1.2 // java.math.BigDecimal | 
val 1Property : kotlin.String = 1Property_example // kotlin.String | 
val 1PropertyPeriodvalue : kotlin.String = 1PropertyPeriodvalue_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.postQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue)
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
 **pPeriodlimit** | **java.math.BigDecimal**|  |
 **1Property** | **kotlin.String**|  |
 **1PropertyPeriodvalue** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

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
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
 **certificate** | **java.io.File**|  | [optional] [default to null]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

<a name="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
> kotlin.String postTruststorePKCS12(truststorePeriodp12)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SlingApi()
val truststorePeriodp12 : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : kotlin.String = apiInstance.postTruststorePKCS12(truststorePeriodp12)
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
 **truststorePeriodp12** | **java.io.File**|  | [optional] [default to null]

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

