# ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getAemProductInfoWithHttpInfo**](ConsoleApi.md#getAemProductInfoWithHttpInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getBundleInfoWithHttpInfo**](ConsoleApi.md#getBundleInfoWithHttpInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**getConfigMgrWithHttpInfo**](ConsoleApi.md#getConfigMgrWithHttpInfo) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postBundleWithHttpInfo**](ConsoleApi.md#postBundleWithHttpInfo) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postJmxRepositoryWithHttpInfo**](ConsoleApi.md#postJmxRepositoryWithHttpInfo) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
[**postSamlConfigurationWithHttpInfo**](ConsoleApi.md#postSamlConfigurationWithHttpInfo) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 



## getAemProductInfo

> getAemProductInfo(): ApiRequest[Seq[String]]



### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = ConsoleApi("http://localhost")    
    val request = apiInstance.getAemProductInfo()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ConsoleApi#getAemProductInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ConsoleApi#getAemProductInfo")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[**Seq[String]**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## getBundleInfo

> getBundleInfo(getBundleInfoRequest): ApiRequest[BundleInfo]



### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = ConsoleApi("http://localhost")
    val name: String = name_example // String | 
    
    val request = apiInstance.getBundleInfo(name)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ConsoleApi#getBundleInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ConsoleApi#getBundleInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

ApiRequest[[**BundleInfo**](BundleInfo.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved bundle info |  -  |
| **0** | Default response |  -  |


## getConfigMgr

> getConfigMgr(): ApiRequest[String]



### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = ConsoleApi("http://localhost")    
    val request = apiInstance.getConfigMgr()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ConsoleApi#getConfigMgr")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ConsoleApi#getConfigMgr")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **5XX** | Unexpected error. |  -  |


## postBundle

> postBundle(postBundleRequest): ApiRequest[Unit]



### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = ConsoleApi("http://localhost")
    val name: String = name_example // String | 

    val action: String = action_example // String | 
    
    val request = apiInstance.postBundle(name, action)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ConsoleApi#postBundle")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ConsoleApi#postBundle")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **action** | **String**|  |

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## postJmxRepository

> postJmxRepository(postJmxRepositoryRequest): ApiRequest[Unit]



### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = ConsoleApi("http://localhost")
    val action: String = action_example // String | 
    
    val request = apiInstance.postJmxRepository(action)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ConsoleApi#postJmxRepository")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ConsoleApi#postJmxRepository")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  |

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## postSamlConfiguration

> postSamlConfiguration(postSamlConfigurationRequest): ApiRequest[SamlConfigurationInfo]



### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = ConsoleApi("http://localhost")
    val post: Boolean = true // Boolean | 

    val apply: Boolean = true // Boolean | 

    val delete: Boolean = true // Boolean | 

    val action: String = action_example // String | 

    val location: String = location_example // String | 

    val path: Seq[String] =  // Seq[String] | 

    val serviceRanking: Int = 56 // Int | 

    val idpUrl: String = idpUrl_example // String | 

    val idpCertAlias: String = idpCertAlias_example // String | 

    val idpHttpRedirect: Boolean = true // Boolean | 

    val serviceProviderEntityId: String = serviceProviderEntityId_example // String | 

    val assertionConsumerServiceURL: String = assertionConsumerServiceURL_example // String | 

    val spPrivateKeyAlias: String = spPrivateKeyAlias_example // String | 

    val keyStorePassword: String = keyStorePassword_example // String | 

    val defaultRedirectUrl: String = defaultRedirectUrl_example // String | 

    val userIDAttribute: String = userIDAttribute_example // String | 

    val useEncryption: Boolean = true // Boolean | 

    val createUser: Boolean = true // Boolean | 

    val addGroupMemberships: Boolean = true // Boolean | 

    val groupMembershipAttribute: String = groupMembershipAttribute_example // String | 

    val defaultGroups: Seq[String] =  // Seq[String] | 

    val nameIdFormat: String = nameIdFormat_example // String | 

    val synchronizeAttributes: Seq[String] =  // Seq[String] | 

    val handleLogout: Boolean = true // Boolean | 

    val logoutUrl: String = logoutUrl_example // String | 

    val clockTolerance: Int = 56 // Int | 

    val digestMethod: String = digestMethod_example // String | 

    val signatureMethod: String = signatureMethod_example // String | 

    val userIntermediatePath: String = userIntermediatePath_example // String | 

    val propertylist: Seq[String] =  // Seq[String] | 
    
    val request = apiInstance.postSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ConsoleApi#postSamlConfiguration")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ConsoleApi#postSamlConfiguration")
            exception.printStackTrace();
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
 **location** | **String**|  | [optional]
 **path** | [**Seq[String]**](String.md)|  | [optional]
 **serviceRanking** | **Int**|  | [optional]
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
 **defaultGroups** | [**Seq[String]**](String.md)|  | [optional]
 **nameIdFormat** | **String**|  | [optional]
 **synchronizeAttributes** | [**Seq[String]**](String.md)|  | [optional]
 **handleLogout** | **Boolean**|  | [optional]
 **logoutUrl** | **String**|  | [optional]
 **clockTolerance** | **Int**|  | [optional]
 **digestMethod** | **String**|  | [optional]
 **signatureMethod** | **String**|  | [optional]
 **userIntermediatePath** | **String**|  | [optional]
 **propertylist** | [**Seq[String]**](String.md)|  | [optional]

### Return type

ApiRequest[[**SamlConfigurationInfo**](SamlConfigurationInfo.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM SAML Configuration |  -  |
| **302** | Default response |  -  |
| **0** | Default response |  -  |

