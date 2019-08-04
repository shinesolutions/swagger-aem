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
> kotlin.Array&lt;kotlin.String&gt; getAemProductInfo()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsoleApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getAemProductInfo()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsoleApi#getAemProductInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsoleApi#getAemProductInfo")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConfigMgr"></a>
# **getConfigMgr**
> kotlin.String getConfigMgr()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsoleApi()
try {
    val result : kotlin.String = apiInstance.getConfigMgr()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsoleApi#getConfigMgr")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsoleApi#getConfigMgr")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

<a name="postBundle"></a>
# **postBundle**
> postBundle(name, action)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsoleApi()
val name : kotlin.String = name_example // kotlin.String | 
val action : kotlin.String = action_example // kotlin.String | 
try {
    apiInstance.postBundle(name, action)
} catch (e: ClientException) {
    println("4xx response calling ConsoleApi#postBundle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsoleApi#postBundle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **action** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postJmxRepository"></a>
# **postJmxRepository**
> postJmxRepository(action)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsoleApi()
val action : kotlin.String = action_example // kotlin.String | 
try {
    apiInstance.postJmxRepository(action)
} catch (e: ClientException) {
    println("4xx response calling ConsoleApi#postJmxRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsoleApi#postJmxRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postSamlConfiguration"></a>
# **postSamlConfiguration**
> SamlConfigurationInfo postSamlConfiguration(post, apply, delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConsoleApi()
val post : kotlin.Boolean = true // kotlin.Boolean | 
val apply : kotlin.Boolean = true // kotlin.Boolean | 
val delete : kotlin.Boolean = true // kotlin.Boolean | 
val action : kotlin.String = action_example // kotlin.String | 
val Dollarlocation : kotlin.String = Dollarlocation_example // kotlin.String | 
val path : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val servicePeriodranking : kotlin.Int = 56 // kotlin.Int | 
val idpUrl : kotlin.String = idpUrl_example // kotlin.String | 
val idpCertAlias : kotlin.String = idpCertAlias_example // kotlin.String | 
val idpHttpRedirect : kotlin.Boolean = true // kotlin.Boolean | 
val serviceProviderEntityId : kotlin.String = serviceProviderEntityId_example // kotlin.String | 
val assertionConsumerServiceURL : kotlin.String = assertionConsumerServiceURL_example // kotlin.String | 
val spPrivateKeyAlias : kotlin.String = spPrivateKeyAlias_example // kotlin.String | 
val keyStorePassword : kotlin.String = keyStorePassword_example // kotlin.String | 
val defaultRedirectUrl : kotlin.String = defaultRedirectUrl_example // kotlin.String | 
val userIDAttribute : kotlin.String = userIDAttribute_example // kotlin.String | 
val useEncryption : kotlin.Boolean = true // kotlin.Boolean | 
val createUser : kotlin.Boolean = true // kotlin.Boolean | 
val addGroupMemberships : kotlin.Boolean = true // kotlin.Boolean | 
val groupMembershipAttribute : kotlin.String = groupMembershipAttribute_example // kotlin.String | 
val defaultGroups : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val nameIdFormat : kotlin.String = nameIdFormat_example // kotlin.String | 
val synchronizeAttributes : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val handleLogout : kotlin.Boolean = true // kotlin.Boolean | 
val logoutUrl : kotlin.String = logoutUrl_example // kotlin.String | 
val clockTolerance : kotlin.Int = 56 // kotlin.Int | 
val digestMethod : kotlin.String = digestMethod_example // kotlin.String | 
val signatureMethod : kotlin.String = signatureMethod_example // kotlin.String | 
val userIntermediatePath : kotlin.String = userIntermediatePath_example // kotlin.String | 
val propertylist : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : SamlConfigurationInfo = apiInstance.postSamlConfiguration(post, apply, delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsoleApi#postSamlConfiguration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsoleApi#postSamlConfiguration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **kotlin.Boolean**|  | [optional]
 **apply** | **kotlin.Boolean**|  | [optional]
 **delete** | **kotlin.Boolean**|  | [optional]
 **action** | **kotlin.String**|  | [optional]
 **Dollarlocation** | **kotlin.String**|  | [optional]
 **path** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **servicePeriodranking** | **kotlin.Int**|  | [optional]
 **idpUrl** | **kotlin.String**|  | [optional]
 **idpCertAlias** | **kotlin.String**|  | [optional]
 **idpHttpRedirect** | **kotlin.Boolean**|  | [optional]
 **serviceProviderEntityId** | **kotlin.String**|  | [optional]
 **assertionConsumerServiceURL** | **kotlin.String**|  | [optional]
 **spPrivateKeyAlias** | **kotlin.String**|  | [optional]
 **keyStorePassword** | **kotlin.String**|  | [optional]
 **defaultRedirectUrl** | **kotlin.String**|  | [optional]
 **userIDAttribute** | **kotlin.String**|  | [optional]
 **useEncryption** | **kotlin.Boolean**|  | [optional]
 **createUser** | **kotlin.Boolean**|  | [optional]
 **addGroupMemberships** | **kotlin.Boolean**|  | [optional]
 **groupMembershipAttribute** | **kotlin.String**|  | [optional]
 **defaultGroups** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **nameIdFormat** | **kotlin.String**|  | [optional]
 **synchronizeAttributes** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **handleLogout** | **kotlin.Boolean**|  | [optional]
 **logoutUrl** | **kotlin.String**|  | [optional]
 **clockTolerance** | **kotlin.Int**|  | [optional]
 **digestMethod** | **kotlin.String**|  | [optional]
 **signatureMethod** | **kotlin.String**|  | [optional]
 **userIntermediatePath** | **kotlin.String**|  | [optional]
 **propertylist** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

