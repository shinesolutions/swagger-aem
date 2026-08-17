# CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**getAemHealthCheckWithHttpInfo**](CustomApi.md#getAemHealthCheckWithHttpInfo) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemHealthCheckServletWithHttpInfo**](CustomApi.md#postConfigAemHealthCheckServletWithHttpInfo) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
[**postConfigAemPasswordResetWithHttpInfo**](CustomApi.md#postConfigAemPasswordResetWithHttpInfo) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 



## getAemHealthCheck

> getAemHealthCheck(getAemHealthCheckRequest): ApiRequest[String]



### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = CustomApi("http://localhost")
    val tags: String = tags_example // String | 

    val combineTagsOr: Boolean = true // Boolean | 
    
    val request = apiInstance.getAemHealthCheck(tags, combineTagsOr)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomApi#getAemHealthCheck")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomApi#getAemHealthCheck")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **String**|  | [optional]
 **combineTagsOr** | **Boolean**|  | [optional]

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


## postConfigAemHealthCheckServlet

> postConfigAemHealthCheckServlet(postConfigAemHealthCheckServletRequest): ApiRequest[Unit]



### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = CustomApi("http://localhost")
    val bundlesIgnored: Seq[String] =  // Seq[String] | 

    val bundlesIgnoredTypeHint: String = bundlesIgnoredTypeHint_example // String | 
    
    val request = apiInstance.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomApi#postConfigAemHealthCheckServlet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomApi#postConfigAemHealthCheckServlet")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | [**Seq[String]**](String.md)|  | [optional]
 **bundlesIgnoredTypeHint** | **String**|  | [optional]

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


## postConfigAemPasswordReset

> postConfigAemPasswordReset(postConfigAemPasswordResetRequest): ApiRequest[Unit]



### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: aemAuth
    implicit val aemAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    val apiInvoker = ApiInvoker()
    val apiInstance = CustomApi("http://localhost")
    val pwdresetAuthorizables: Seq[String] =  // Seq[String] | 

    val pwdresetAuthorizablesTypeHint: String = pwdresetAuthorizablesTypeHint_example // String | 
    
    val request = apiInstance.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CustomApi#postConfigAemPasswordReset")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CustomApi#postConfigAemPasswordReset")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | [**Seq[String]**](String.md)|  | [optional]
 **pwdresetAuthorizablesTypeHint** | **String**|  | [optional]

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

