# SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteAgentWithHttpInfo**](SlingApi.md#deleteAgentWithHttpInfo) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**deleteNodeWithHttpInfo**](SlingApi.md#deleteNodeWithHttpInfo) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgentWithHttpInfo**](SlingApi.md#getAgentWithHttpInfo) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAgentsWithHttpInfo**](SlingApi.md#getAgentsWithHttpInfo) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getAuthorizableKeystoreWithHttpInfo**](SlingApi.md#getAuthorizableKeystoreWithHttpInfo) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getKeystoreWithHttpInfo**](SlingApi.md#getKeystoreWithHttpInfo) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getNodeWithHttpInfo**](SlingApi.md#getNodeWithHttpInfo) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageWithHttpInfo**](SlingApi.md#getPackageWithHttpInfo) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getPackageFilterWithHttpInfo**](SlingApi.md#getPackageFilterWithHttpInfo) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
[**getQueryWithHttpInfo**](SlingApi.md#getQueryWithHttpInfo) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreWithHttpInfo**](SlingApi.md#getTruststoreWithHttpInfo) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**getTruststoreInfoWithHttpInfo**](SlingApi.md#getTruststoreInfoWithHttpInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAgentWithHttpInfo**](SlingApi.md#postAgentWithHttpInfo) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizableKeystoreWithHttpInfo**](SlingApi.md#postAuthorizableKeystoreWithHttpInfo) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postAuthorizablesWithHttpInfo**](SlingApi.md#postAuthorizablesWithHttpInfo) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo**](SlingApi.md#postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo**](SlingApi.md#postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingDavExServletWithHttpInfo**](SlingApi.md#postConfigApacheSlingDavExServletWithHttpInfo) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingGetServletWithHttpInfo**](SlingApi.md#postConfigApacheSlingGetServletWithHttpInfo) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigApacheSlingReferrerFilterWithHttpInfo**](SlingApi.md#postConfigApacheSlingReferrerFilterWithHttpInfo) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](SlingApi.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**postConfigPropertyWithHttpInfo**](SlingApi.md#postConfigPropertyWithHttpInfo) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeWithHttpInfo**](SlingApi.md#postNodeWithHttpInfo) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postNodeRwWithHttpInfo**](SlingApi.md#postNodeRwWithHttpInfo) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postPathWithHttpInfo**](SlingApi.md#postPathWithHttpInfo) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postQueryWithHttpInfo**](SlingApi.md#postQueryWithHttpInfo) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**postTreeActivationWithHttpInfo**](SlingApi.md#postTreeActivationWithHttpInfo) | **POST** /libs/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststoreWithHttpInfo**](SlingApi.md#postTruststoreWithHttpInfo) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 
[**postTruststorePKCS12WithHttpInfo**](SlingApi.md#postTruststorePKCS12WithHttpInfo) | **POST** /etc/truststore | 



## deleteAgent

> deleteAgent(deleteAgentRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val runmode: String = runmode_example // String | 

    val name: String = name_example // String | 
    
    val request = apiInstance.deleteAgent(runmode, name)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#deleteAgent")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#deleteAgent")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **name** | **String**|  |

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


## deleteNode

> deleteNode(deleteNodeRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val path: String = path_example // String | 

    val name: String = name_example // String | 
    
    val request = apiInstance.deleteNode(path, name)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#deleteNode")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#deleteNode")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |

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


## getAgent

> getAgent(getAgentRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val runmode: String = runmode_example // String | 

    val name: String = name_example // String | 
    
    val request = apiInstance.getAgent(runmode, name)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getAgent")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getAgent")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **name** | **String**|  |

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


## getAgents

> getAgents(getAgentsRequest): ApiRequest[String]



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
    val apiInstance = SlingApi("http://localhost")
    val runmode: String = runmode_example // String | 
    
    val request = apiInstance.getAgents(runmode)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getAgents")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getAgents")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## getAuthorizableKeystore

> getAuthorizableKeystore(getAuthorizableKeystoreRequest): ApiRequest[KeystoreInfo]



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
    val apiInstance = SlingApi("http://localhost")
    val intermediatePath: String = intermediatePath_example // String | 

    val authorizableId: String = authorizableId_example // String | 
    
    val request = apiInstance.getAuthorizableKeystore(intermediatePath, authorizableId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getAuthorizableKeystore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getAuthorizableKeystore")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  |
 **authorizableId** | **String**|  |

### Return type

ApiRequest[[**KeystoreInfo**](KeystoreInfo.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |


## getKeystore

> getKeystore(getKeystoreRequest): ApiRequest[File]



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
    val apiInstance = SlingApi("http://localhost")
    val intermediatePath: String = intermediatePath_example // String | 

    val authorizableId: String = authorizableId_example // String | 
    
    val request = apiInstance.getKeystore(intermediatePath, authorizableId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getKeystore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getKeystore")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  |
 **authorizableId** | **String**|  |

### Return type

ApiRequest[[**File**](File.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## getNode

> getNode(getNodeRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val path: String = path_example // String | 

    val name: String = name_example // String | 
    
    val request = apiInstance.getNode(path, name)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getNode")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getNode")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |

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


## getPackage

> getPackage(getPackageRequest): ApiRequest[File]



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
    val apiInstance = SlingApi("http://localhost")
    val group: String = group_example // String | 

    val name: String = name_example // String | 

    val version: String = version_example // String | 
    
    val request = apiInstance.getPackage(group, name, version)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getPackage")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getPackage")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  |
 **name** | **String**|  |
 **version** | **String**|  |

### Return type

ApiRequest[[**File**](File.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## getPackageFilter

> getPackageFilter(getPackageFilterRequest): ApiRequest[String]



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
    val apiInstance = SlingApi("http://localhost")
    val group: String = group_example // String | 

    val name: String = name_example // String | 

    val version: String = version_example // String | 
    
    val request = apiInstance.getPackageFilter(group, name, version)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getPackageFilter")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getPackageFilter")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  |
 **name** | **String**|  |
 **version** | **String**|  |

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## getQuery

> getQuery(getQueryRequest): ApiRequest[String]



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
    val apiInstance = SlingApi("http://localhost")
    val path: String = path_example // String | 

    val pLimit: BigDecimal = 8.14 // BigDecimal | 

    val `1property`: String = `1property`_example // String | 

    val `1propertyValue`: String = `1propertyValue`_example // String | 
    
    val request = apiInstance.getQuery(path, pLimit, `1property`, `1propertyValue`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getQuery")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getQuery")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **pLimit** | **BigDecimal**|  |
 **`1property`** | **String**|  |
 **`1propertyValue`** | **String**|  |

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## getTruststore

> getTruststore(): ApiRequest[File]



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
    val apiInstance = SlingApi("http://localhost")    
    val request = apiInstance.getTruststore()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getTruststore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getTruststore")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**File**](File.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## getTruststoreInfo

> getTruststoreInfo(): ApiRequest[TruststoreInfo]



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
    val apiInstance = SlingApi("http://localhost")    
    val request = apiInstance.getTruststoreInfo()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#getTruststoreInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#getTruststoreInfo")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**TruststoreInfo**](TruststoreInfo.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM Truststore info |  -  |
| **0** | Default response |  -  |


## postAgent

> postAgent(postAgentRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val runmode: String = runmode_example // String | 

    val name: String = name_example // String | 

    val jcrContentCqDistribute: Boolean = true // Boolean | 

    val jcrContentCqDistributeTypeHint: String = jcrContentCqDistributeTypeHint_example // String | 

    val jcrContentCqName: String = jcrContentCqName_example // String | 

    val jcrContentCqTemplate: String = jcrContentCqTemplate_example // String | 

    val jcrContentAliasUpdate: Boolean = true // Boolean | 

    val jcrContentEnabled: Boolean = true // Boolean | 

    val jcrContentJcrDescription: String = jcrContentJcrDescription_example // String | 

    val jcrContentJcrLastModified: String = jcrContentJcrLastModified_example // String | 

    val jcrContentJcrLastModifiedBy: String = jcrContentJcrLastModifiedBy_example // String | 

    val jcrContentJcrMixinTypes: String = jcrContentJcrMixinTypes_example // String | 

    val jcrContentJcrTitle: String = jcrContentJcrTitle_example // String | 

    val jcrContentLogLevel: String = jcrContentLogLevel_example // String | 

    val jcrContentNoStatusUpdate: Boolean = true // Boolean | 

    val jcrContentNoVersioning: Boolean = true // Boolean | 

    val jcrContentProtocolConnectTimeout: BigDecimal = 8.14 // BigDecimal | 

    val jcrContentProtocolHTTPConnectionClosed: Boolean = true // Boolean | 

    val jcrContentProtocolHTTPExpired: String = jcrContentProtocolHTTPExpired_example // String | 

    val jcrContentProtocolHTTPHeaders: Seq[String] =  // Seq[String] | 

    val jcrContentProtocolHTTPHeadersTypeHint: String = jcrContentProtocolHTTPHeadersTypeHint_example // String | 

    val jcrContentProtocolHTTPMethod: String = jcrContentProtocolHTTPMethod_example // String | 

    val jcrContentProtocolHTTPSRelaxed: Boolean = true // Boolean | 

    val jcrContentProtocolInterface: String = jcrContentProtocolInterface_example // String | 

    val jcrContentProtocolSocketTimeout: BigDecimal = 8.14 // BigDecimal | 

    val jcrContentProtocolVersion: String = jcrContentProtocolVersion_example // String | 

    val jcrContentProxyNTLMDomain: String = jcrContentProxyNTLMDomain_example // String | 

    val jcrContentProxyNTLMHost: String = jcrContentProxyNTLMHost_example // String | 

    val jcrContentProxyHost: String = jcrContentProxyHost_example // String | 

    val jcrContentProxyPassword: String = jcrContentProxyPassword_example // String | 

    val jcrContentProxyPort: BigDecimal = 8.14 // BigDecimal | 

    val jcrContentProxyUser: String = jcrContentProxyUser_example // String | 

    val jcrContentQueueBatchMaxSize: BigDecimal = 8.14 // BigDecimal | 

    val jcrContentQueueBatchMode: String = jcrContentQueueBatchMode_example // String | 

    val jcrContentQueueBatchWaitTime: BigDecimal = 8.14 // BigDecimal | 

    val jcrContentRetryDelay: String = jcrContentRetryDelay_example // String | 

    val jcrContentReverseReplication: Boolean = true // Boolean | 

    val jcrContentSerializationType: String = jcrContentSerializationType_example // String | 

    val jcrContentSlingResourceType: String = jcrContentSlingResourceType_example // String | 

    val jcrContentSsl: String = jcrContentSsl_example // String | 

    val jcrContentTransportNTLMDomain: String = jcrContentTransportNTLMDomain_example // String | 

    val jcrContentTransportNTLMHost: String = jcrContentTransportNTLMHost_example // String | 

    val jcrContentTransportPassword: String = jcrContentTransportPassword_example // String | 

    val jcrContentTransportUri: String = jcrContentTransportUri_example // String | 

    val jcrContentTransportUser: String = jcrContentTransportUser_example // String | 

    val jcrContentTriggerDistribute: Boolean = true // Boolean | 

    val jcrContentTriggerModified: Boolean = true // Boolean | 

    val jcrContentTriggerOnOffTime: Boolean = true // Boolean | 

    val jcrContentTriggerReceive: Boolean = true // Boolean | 

    val jcrContentTriggerSpecific: Boolean = true // Boolean | 

    val jcrContentUserId: String = jcrContentUserId_example // String | 

    val jcrPrimaryType: String = jcrPrimaryType_example // String | 

    val operation: String = operation_example // String | 
    
    val request = apiInstance.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postAgent")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postAgent")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  |
 **name** | **String**|  |
 **jcrContentCqDistribute** | **Boolean**|  | [optional]
 **jcrContentCqDistributeTypeHint** | **String**|  | [optional]
 **jcrContentCqName** | **String**|  | [optional]
 **jcrContentCqTemplate** | **String**|  | [optional]
 **jcrContentAliasUpdate** | **Boolean**|  | [optional]
 **jcrContentEnabled** | **Boolean**|  | [optional]
 **jcrContentJcrDescription** | **String**|  | [optional]
 **jcrContentJcrLastModified** | **String**|  | [optional]
 **jcrContentJcrLastModifiedBy** | **String**|  | [optional]
 **jcrContentJcrMixinTypes** | **String**|  | [optional]
 **jcrContentJcrTitle** | **String**|  | [optional]
 **jcrContentLogLevel** | **String**|  | [optional]
 **jcrContentNoStatusUpdate** | **Boolean**|  | [optional]
 **jcrContentNoVersioning** | **Boolean**|  | [optional]
 **jcrContentProtocolConnectTimeout** | **BigDecimal**|  | [optional]
 **jcrContentProtocolHTTPConnectionClosed** | **Boolean**|  | [optional]
 **jcrContentProtocolHTTPExpired** | **String**|  | [optional]
 **jcrContentProtocolHTTPHeaders** | [**Seq[String]**](String.md)|  | [optional]
 **jcrContentProtocolHTTPHeadersTypeHint** | **String**|  | [optional]
 **jcrContentProtocolHTTPMethod** | **String**|  | [optional]
 **jcrContentProtocolHTTPSRelaxed** | **Boolean**|  | [optional]
 **jcrContentProtocolInterface** | **String**|  | [optional]
 **jcrContentProtocolSocketTimeout** | **BigDecimal**|  | [optional]
 **jcrContentProtocolVersion** | **String**|  | [optional]
 **jcrContentProxyNTLMDomain** | **String**|  | [optional]
 **jcrContentProxyNTLMHost** | **String**|  | [optional]
 **jcrContentProxyHost** | **String**|  | [optional]
 **jcrContentProxyPassword** | **String**|  | [optional]
 **jcrContentProxyPort** | **BigDecimal**|  | [optional]
 **jcrContentProxyUser** | **String**|  | [optional]
 **jcrContentQueueBatchMaxSize** | **BigDecimal**|  | [optional]
 **jcrContentQueueBatchMode** | **String**|  | [optional]
 **jcrContentQueueBatchWaitTime** | **BigDecimal**|  | [optional]
 **jcrContentRetryDelay** | **String**|  | [optional]
 **jcrContentReverseReplication** | **Boolean**|  | [optional]
 **jcrContentSerializationType** | **String**|  | [optional]
 **jcrContentSlingResourceType** | **String**|  | [optional]
 **jcrContentSsl** | **String**|  | [optional]
 **jcrContentTransportNTLMDomain** | **String**|  | [optional]
 **jcrContentTransportNTLMHost** | **String**|  | [optional]
 **jcrContentTransportPassword** | **String**|  | [optional]
 **jcrContentTransportUri** | **String**|  | [optional]
 **jcrContentTransportUser** | **String**|  | [optional]
 **jcrContentTriggerDistribute** | **Boolean**|  | [optional]
 **jcrContentTriggerModified** | **Boolean**|  | [optional]
 **jcrContentTriggerOnOffTime** | **Boolean**|  | [optional]
 **jcrContentTriggerReceive** | **Boolean**|  | [optional]
 **jcrContentTriggerSpecific** | **Boolean**|  | [optional]
 **jcrContentUserId** | **String**|  | [optional]
 **jcrPrimaryType** | **String**|  | [optional]
 **operation** | **String**|  | [optional]

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


## postAuthorizableKeystore

> postAuthorizableKeystore(postAuthorizableKeystoreRequest): ApiRequest[KeystoreInfo]



### Example

```scala
// Import classes:
import 
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
    val apiInstance = SlingApi("http://localhost")
    val intermediatePath: String = intermediatePath_example // String | 

    val authorizableId: String = authorizableId_example // String | 

    val operation: String = operation_example // String | 

    val currentPassword: String = currentPassword_example // String | 

    val newPassword: String = newPassword_example // String | 

    val rePassword: String = rePassword_example // String | 

    val keyPassword: String = keyPassword_example // String | 

    val keyStorePass: String = keyStorePass_example // String | 

    val alias: String = alias_example // String | 

    val newAlias: String = newAlias_example // String | 

    val removeAlias: String = removeAlias_example // String | 

    val certChain: File = BINARY_DATA_HERE // File | 

    val pk: File = BINARY_DATA_HERE // File | 

    val keyStore: File = BINARY_DATA_HERE // File | 
    
    val request = apiInstance.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postAuthorizableKeystore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postAuthorizableKeystore")
            exception.printStackTrace();
    }
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
 **certChain** | **File**|  | [optional]
 **pk** | **File**|  | [optional]
 **keyStore** | **File**|  | [optional]

### Return type

ApiRequest[[**KeystoreInfo**](KeystoreInfo.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |


## postAuthorizables

> postAuthorizables(postAuthorizablesRequest): ApiRequest[String]



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
    val apiInstance = SlingApi("http://localhost")
    val authorizableId: String = authorizableId_example // String | 

    val intermediatePath: String = intermediatePath_example // String | 

    val createUser: String = createUser_example // String | 

    val createGroup: String = createGroup_example // String | 

    val repPassword: String = repPassword_example // String | 

    val profileGivenName: String = profileGivenName_example // String | 
    
    val request = apiInstance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postAuthorizables")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postAuthorizables")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  |
 **intermediatePath** | **String**|  |
 **createUser** | **String**|  | [optional]
 **createGroup** | **String**|  | [optional]
 **repPassword** | **String**|  | [optional]
 **profileGivenName** | **String**|  | [optional]

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## postConfigAdobeGraniteSamlAuthenticationHandler

> postConfigAdobeGraniteSamlAuthenticationHandler(postConfigAdobeGraniteSamlAuthenticationHandlerRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val keyStorePassword: String = keyStorePassword_example // String | 

    val keyStorePasswordTypeHint: String = keyStorePasswordTypeHint_example // String | 

    val serviceRanking: Int = 56 // Int | 

    val serviceRankingTypeHint: String = serviceRankingTypeHint_example // String | 

    val idpHttpRedirect: Boolean = true // Boolean | 

    val idpHttpRedirectTypeHint: String = idpHttpRedirectTypeHint_example // String | 

    val createUser: Boolean = true // Boolean | 

    val createUserTypeHint: String = createUserTypeHint_example // String | 

    val defaultRedirectUrl: String = defaultRedirectUrl_example // String | 

    val defaultRedirectUrlTypeHint: String = defaultRedirectUrlTypeHint_example // String | 

    val userIDAttribute: String = userIDAttribute_example // String | 

    val userIDAttributeTypeHint: String = userIDAttributeTypeHint_example // String | 

    val defaultGroups: Seq[String] =  // Seq[String] | 

    val defaultGroupsTypeHint: String = defaultGroupsTypeHint_example // String | 

    val idpCertAlias: String = idpCertAlias_example // String | 

    val idpCertAliasTypeHint: String = idpCertAliasTypeHint_example // String | 

    val addGroupMemberships: Boolean = true // Boolean | 

    val addGroupMembershipsTypeHint: String = addGroupMembershipsTypeHint_example // String | 

    val path: Seq[String] =  // Seq[String] | 

    val pathTypeHint: String = pathTypeHint_example // String | 

    val synchronizeAttributes: Seq[String] =  // Seq[String] | 

    val synchronizeAttributesTypeHint: String = synchronizeAttributesTypeHint_example // String | 

    val clockTolerance: Int = 56 // Int | 

    val clockToleranceTypeHint: String = clockToleranceTypeHint_example // String | 

    val groupMembershipAttribute: String = groupMembershipAttribute_example // String | 

    val groupMembershipAttributeTypeHint: String = groupMembershipAttributeTypeHint_example // String | 

    val idpUrl: String = idpUrl_example // String | 

    val idpUrlTypeHint: String = idpUrlTypeHint_example // String | 

    val logoutUrl: String = logoutUrl_example // String | 

    val logoutUrlTypeHint: String = logoutUrlTypeHint_example // String | 

    val serviceProviderEntityId: String = serviceProviderEntityId_example // String | 

    val serviceProviderEntityIdTypeHint: String = serviceProviderEntityIdTypeHint_example // String | 

    val assertionConsumerServiceURL: String = assertionConsumerServiceURL_example // String | 

    val assertionConsumerServiceURLTypeHint: String = assertionConsumerServiceURLTypeHint_example // String | 

    val handleLogout: Boolean = true // Boolean | 

    val handleLogoutTypeHint: String = handleLogoutTypeHint_example // String | 

    val spPrivateKeyAlias: String = spPrivateKeyAlias_example // String | 

    val spPrivateKeyAliasTypeHint: String = spPrivateKeyAliasTypeHint_example // String | 

    val useEncryption: Boolean = true // Boolean | 

    val useEncryptionTypeHint: String = useEncryptionTypeHint_example // String | 

    val nameIdFormat: String = nameIdFormat_example // String | 

    val nameIdFormatTypeHint: String = nameIdFormatTypeHint_example // String | 

    val digestMethod: String = digestMethod_example // String | 

    val digestMethodTypeHint: String = digestMethodTypeHint_example // String | 

    val signatureMethod: String = signatureMethod_example // String | 

    val signatureMethodTypeHint: String = signatureMethodTypeHint_example // String | 

    val userIntermediatePath: String = userIntermediatePath_example // String | 

    val userIntermediatePathTypeHint: String = userIntermediatePathTypeHint_example // String | 
    
    val request = apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postConfigAdobeGraniteSamlAuthenticationHandler")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postConfigAdobeGraniteSamlAuthenticationHandler")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **String**|  | [optional]
 **keyStorePasswordTypeHint** | **String**|  | [optional]
 **serviceRanking** | **Int**|  | [optional]
 **serviceRankingTypeHint** | **String**|  | [optional]
 **idpHttpRedirect** | **Boolean**|  | [optional]
 **idpHttpRedirectTypeHint** | **String**|  | [optional]
 **createUser** | **Boolean**|  | [optional]
 **createUserTypeHint** | **String**|  | [optional]
 **defaultRedirectUrl** | **String**|  | [optional]
 **defaultRedirectUrlTypeHint** | **String**|  | [optional]
 **userIDAttribute** | **String**|  | [optional]
 **userIDAttributeTypeHint** | **String**|  | [optional]
 **defaultGroups** | [**Seq[String]**](String.md)|  | [optional]
 **defaultGroupsTypeHint** | **String**|  | [optional]
 **idpCertAlias** | **String**|  | [optional]
 **idpCertAliasTypeHint** | **String**|  | [optional]
 **addGroupMemberships** | **Boolean**|  | [optional]
 **addGroupMembershipsTypeHint** | **String**|  | [optional]
 **path** | [**Seq[String]**](String.md)|  | [optional]
 **pathTypeHint** | **String**|  | [optional]
 **synchronizeAttributes** | [**Seq[String]**](String.md)|  | [optional]
 **synchronizeAttributesTypeHint** | **String**|  | [optional]
 **clockTolerance** | **Int**|  | [optional]
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


## postConfigApacheFelixJettyBasedHttpService

> postConfigApacheFelixJettyBasedHttpService(postConfigApacheFelixJettyBasedHttpServiceRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val orgApacheFelixHttpsNio: Boolean = true // Boolean | 

    val orgApacheFelixHttpsNioTypeHint: String = orgApacheFelixHttpsNioTypeHint_example // String | 

    val orgApacheFelixHttpsKeystore: String = orgApacheFelixHttpsKeystore_example // String | 

    val orgApacheFelixHttpsKeystoreTypeHint: String = orgApacheFelixHttpsKeystoreTypeHint_example // String | 

    val orgApacheFelixHttpsKeystorePassword: String = orgApacheFelixHttpsKeystorePassword_example // String | 

    val orgApacheFelixHttpsKeystorePasswordTypeHint: String = orgApacheFelixHttpsKeystorePasswordTypeHint_example // String | 

    val orgApacheFelixHttpsKeystoreKey: String = orgApacheFelixHttpsKeystoreKey_example // String | 

    val orgApacheFelixHttpsKeystoreKeyTypeHint: String = orgApacheFelixHttpsKeystoreKeyTypeHint_example // String | 

    val orgApacheFelixHttpsKeystoreKeyPassword: String = orgApacheFelixHttpsKeystoreKeyPassword_example // String | 

    val orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: String = orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example // String | 

    val orgApacheFelixHttpsTruststore: String = orgApacheFelixHttpsTruststore_example // String | 

    val orgApacheFelixHttpsTruststoreTypeHint: String = orgApacheFelixHttpsTruststoreTypeHint_example // String | 

    val orgApacheFelixHttpsTruststorePassword: String = orgApacheFelixHttpsTruststorePassword_example // String | 

    val orgApacheFelixHttpsTruststorePasswordTypeHint: String = orgApacheFelixHttpsTruststorePasswordTypeHint_example // String | 

    val orgApacheFelixHttpsClientcertificate: String = orgApacheFelixHttpsClientcertificate_example // String | 

    val orgApacheFelixHttpsClientcertificateTypeHint: String = orgApacheFelixHttpsClientcertificateTypeHint_example // String | 

    val orgApacheFelixHttpsEnable: Boolean = true // Boolean | 

    val orgApacheFelixHttpsEnableTypeHint: String = orgApacheFelixHttpsEnableTypeHint_example // String | 

    val orgOsgiServiceHttpPortSecure: String = orgOsgiServiceHttpPortSecure_example // String | 

    val orgOsgiServiceHttpPortSecureTypeHint: String = orgOsgiServiceHttpPortSecureTypeHint_example // String | 
    
    val request = apiInstance.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postConfigApacheFelixJettyBasedHttpService")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postConfigApacheFelixJettyBasedHttpService")
            exception.printStackTrace();
    }
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


## postConfigApacheHttpComponentsProxyConfiguration

> postConfigApacheHttpComponentsProxyConfiguration(postConfigApacheHttpComponentsProxyConfigurationRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val proxyHost: String = proxyHost_example // String | 

    val proxyHostTypeHint: String = proxyHostTypeHint_example // String | 

    val proxyPort: Int = 56 // Int | 

    val proxyPortTypeHint: String = proxyPortTypeHint_example // String | 

    val proxyExceptions: Seq[String] =  // Seq[String] | 

    val proxyExceptionsTypeHint: String = proxyExceptionsTypeHint_example // String | 

    val proxyEnabled: Boolean = true // Boolean | 

    val proxyEnabledTypeHint: String = proxyEnabledTypeHint_example // String | 

    val proxyUser: String = proxyUser_example // String | 

    val proxyUserTypeHint: String = proxyUserTypeHint_example // String | 

    val proxyPassword: String = proxyPassword_example // String | 

    val proxyPasswordTypeHint: String = proxyPasswordTypeHint_example // String | 
    
    val request = apiInstance.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postConfigApacheHttpComponentsProxyConfiguration")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postConfigApacheHttpComponentsProxyConfiguration")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **String**|  | [optional]
 **proxyHostTypeHint** | **String**|  | [optional]
 **proxyPort** | **Int**|  | [optional]
 **proxyPortTypeHint** | **String**|  | [optional]
 **proxyExceptions** | [**Seq[String]**](String.md)|  | [optional]
 **proxyExceptionsTypeHint** | **String**|  | [optional]
 **proxyEnabled** | **Boolean**|  | [optional]
 **proxyEnabledTypeHint** | **String**|  | [optional]
 **proxyUser** | **String**|  | [optional]
 **proxyUserTypeHint** | **String**|  | [optional]
 **proxyPassword** | **String**|  | [optional]
 **proxyPasswordTypeHint** | **String**|  | [optional]

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


## postConfigApacheSlingDavExServlet

> postConfigApacheSlingDavExServlet(postConfigApacheSlingDavExServletRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val alias: String = alias_example // String | 

    val aliasTypeHint: String = aliasTypeHint_example // String | 

    val davCreateAbsoluteUri: Boolean = true // Boolean | 

    val davCreateAbsoluteUriTypeHint: String = davCreateAbsoluteUriTypeHint_example // String | 
    
    val request = apiInstance.postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingDavExServlet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingDavExServlet")
            exception.printStackTrace();
    }
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


## postConfigApacheSlingGetServlet

> postConfigApacheSlingGetServlet(postConfigApacheSlingGetServletRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val jsonMaximumresults: String = jsonMaximumresults_example // String | 

    val jsonMaximumresultsTypeHint: String = jsonMaximumresultsTypeHint_example // String | 

    val enableHtml: Boolean = true // Boolean | 

    val enableHtmlTypeHint: String = enableHtmlTypeHint_example // String | 

    val enableTxt: Boolean = true // Boolean | 

    val enableTxtTypeHint: String = enableTxtTypeHint_example // String | 

    val enableXml: Boolean = true // Boolean | 

    val enableXmlTypeHint: String = enableXmlTypeHint_example // String | 
    
    val request = apiInstance.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingGetServlet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingGetServlet")
            exception.printStackTrace();
    }
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


## postConfigApacheSlingReferrerFilter

> postConfigApacheSlingReferrerFilter(postConfigApacheSlingReferrerFilterRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val allowEmpty: Boolean = true // Boolean | 

    val allowEmptyTypeHint: String = allowEmptyTypeHint_example // String | 

    val allowHosts: String = allowHosts_example // String | 

    val allowHostsTypeHint: String = allowHostsTypeHint_example // String | 

    val allowHostsRegexp: String = allowHostsRegexp_example // String | 

    val allowHostsRegexpTypeHint: String = allowHostsRegexpTypeHint_example // String | 

    val filterMethods: String = filterMethods_example // String | 

    val filterMethodsTypeHint: String = filterMethodsTypeHint_example // String | 
    
    val request = apiInstance.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingReferrerFilter")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingReferrerFilter")
            exception.printStackTrace();
    }
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


## postConfigProperty

> postConfigProperty(postConfigPropertyRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val configNodeName: String = configNodeName_example // String | 
    
    val request = apiInstance.postConfigProperty(configNodeName)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postConfigProperty")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postConfigProperty")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **String**|  |

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


## postNode

> postNode(postNodeRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val path: String = path_example // String | 

    val name: String = name_example // String | 

    val operation: String = operation_example // String | 

    val deleteAuthorizable: String = deleteAuthorizable_example // String | 

    val file: File = BINARY_DATA_HERE // File | 
    
    val request = apiInstance.postNode(path, name, operation, deleteAuthorizable, file)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postNode")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postNode")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |
 **operation** | **String**|  | [optional]
 **deleteAuthorizable** | **String**|  | [optional]
 **file** | **File**|  | [optional]

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## postNodeRw

> postNodeRw(postNodeRwRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val path: String = path_example // String | 

    val name: String = name_example // String | 

    val addMembers: String = addMembers_example // String | 
    
    val request = apiInstance.postNodeRw(path, name, addMembers)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postNodeRw")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postNodeRw")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **name** | **String**|  |
 **addMembers** | **String**|  | [optional]

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


## postPath

> postPath(postPathRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val path: String = path_example // String | 

    val jcrPrimaryType: String = jcrPrimaryType_example // String | 

    val name: String = name_example // String | 
    
    val request = apiInstance.postPath(path, jcrPrimaryType, name)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postPath")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postPath")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **jcrPrimaryType** | **String**|  |
 **name** | **String**|  |

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


## postQuery

> postQuery(postQueryRequest): ApiRequest[String]



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
    val apiInstance = SlingApi("http://localhost")
    val path: String = path_example // String | 

    val pLimit: BigDecimal = 8.14 // BigDecimal | 

    val `1property`: String = `1property`_example // String | 

    val `1propertyValue`: String = `1propertyValue`_example // String | 
    
    val request = apiInstance.postQuery(path, pLimit, `1property`, `1propertyValue`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postQuery")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postQuery")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **pLimit** | **BigDecimal**|  |
 **`1property`** | **String**|  |
 **`1propertyValue`** | **String**|  |

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## postTreeActivation

> postTreeActivation(postTreeActivationRequest): ApiRequest[Unit]



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
    val apiInstance = SlingApi("http://localhost")
    val ignoredeactivated: Boolean = true // Boolean | 

    val onlymodified: Boolean = true // Boolean | 

    val path: String = path_example // String | 

    val cmd: String = cmd_example // String | 
    
    val request = apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path, cmd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postTreeActivation")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postTreeActivation")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **Boolean**|  |
 **onlymodified** | **Boolean**|  |
 **path** | **String**|  |
 **cmd** | **String**|  |

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


## postTruststore

> postTruststore(postTruststoreRequest): ApiRequest[String]



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
    val apiInstance = SlingApi("http://localhost")
    val operation: String = operation_example // String | 

    val newPassword: String = newPassword_example // String | 

    val rePassword: String = rePassword_example // String | 

    val keyStoreType: String = keyStoreType_example // String | 

    val removeAlias: String = removeAlias_example // String | 

    val certificate: File = BINARY_DATA_HERE // File | 
    
    val request = apiInstance.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postTruststore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postTruststore")
            exception.printStackTrace();
    }
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
 **certificate** | **File**|  | [optional]

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## postTruststorePKCS12

> postTruststorePKCS12(postTruststorePKCS12Request): ApiRequest[String]



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
    val apiInstance = SlingApi("http://localhost")
    val truststoreP12: File = BINARY_DATA_HERE // File | 
    
    val request = apiInstance.postTruststorePKCS12(truststoreP12)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling SlingApi#postTruststorePKCS12")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling SlingApi#postTruststorePKCS12")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **File**|  | [optional]

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

