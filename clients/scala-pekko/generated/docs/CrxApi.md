# CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getCrxdeStatusWithHttpInfo**](CrxApi.md#getCrxdeStatusWithHttpInfo) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getInstallStatusWithHttpInfo**](CrxApi.md#getInstallStatusWithHttpInfo) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**getPackageManagerServletWithHttpInfo**](CrxApi.md#getPackageManagerServletWithHttpInfo) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceWithHttpInfo**](CrxApi.md#postPackageServiceWithHttpInfo) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageServiceJsonWithHttpInfo**](CrxApi.md#postPackageServiceJsonWithHttpInfo) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postPackageUpdateWithHttpInfo**](CrxApi.md#postPackageUpdateWithHttpInfo) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 
[**postSetPasswordWithHttpInfo**](CrxApi.md#postSetPasswordWithHttpInfo) | **POST** /crx/explorer/ui/setpassword.jsp | 



## getCrxdeStatus

> getCrxdeStatus(): ApiRequest[String]



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
    val apiInstance = CrxApi("http://localhost")    
    val request = apiInstance.getCrxdeStatus()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CrxApi#getCrxdeStatus")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CrxApi#getCrxdeStatus")
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
- **Accept**: plain/text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CRXDE is enabled |  -  |
| **404** | CRXDE is disabled |  -  |


## getInstallStatus

> getInstallStatus(): ApiRequest[InstallStatus]



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
    val apiInstance = CrxApi("http://localhost")    
    val request = apiInstance.getInstallStatus()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CrxApi#getInstallStatus")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CrxApi#getInstallStatus")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**InstallStatus**](InstallStatus.md)]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved CRX package manager install status |  -  |
| **0** | Default response |  -  |


## getPackageManagerServlet

> getPackageManagerServlet(): ApiRequest[Unit]



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
    val apiInstance = CrxApi("http://localhost")    
    val request = apiInstance.getPackageManagerServlet()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CrxApi#getPackageManagerServlet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CrxApi#getPackageManagerServlet")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Package Manager Servlet is disabled |  -  |
| **405** | Package Manager Servlet is active |  -  |


## postPackageService

> postPackageService(postPackageServiceRequest): ApiRequest[String]



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
    val apiInstance = CrxApi("http://localhost")
    val cmd: String = cmd_example // String | 
    
    val request = apiInstance.postPackageService(cmd)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CrxApi#postPackageService")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CrxApi#postPackageService")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **String**|  |

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
| **0** | Default response |  -  |


## postPackageServiceJson

> postPackageServiceJson(postPackageServiceJsonRequest): ApiRequest[String]



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
    val apiInstance = CrxApi("http://localhost")
    val path: String = path_example // String | 

    val cmd: String = cmd_example // String | 

    val groupName: String = groupName_example // String | 

    val packageName: String = packageName_example // String | 

    val packageVersion: String = packageVersion_example // String | 

    val charset: String = charset_example // String | 

    val force: Boolean = true // Boolean | 

    val recursive: Boolean = true // Boolean | 

    val `package`: File = BINARY_DATA_HERE // File | 
    
    val request = apiInstance.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, `package`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CrxApi#postPackageServiceJson")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CrxApi#postPackageServiceJson")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **cmd** | **String**|  |
 **groupName** | **String**|  | [optional]
 **packageName** | **String**|  | [optional]
 **packageVersion** | **String**|  | [optional]
 **charset** | **String**|  | [optional]
 **force** | **Boolean**|  | [optional]
 **recursive** | **Boolean**|  | [optional]
 **`package`** | **File**|  | [optional]

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |


## postPackageUpdate

> postPackageUpdate(postPackageUpdateRequest): ApiRequest[String]



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
    val apiInstance = CrxApi("http://localhost")
    val groupName: String = groupName_example // String | 

    val packageName: String = packageName_example // String | 

    val version: String = version_example // String | 

    val path: String = path_example // String | 

    val filter: String = filter_example // String | 

    val charset: String = charset_example // String | 
    
    val request = apiInstance.postPackageUpdate(groupName, packageName, version, path, filter, charset)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CrxApi#postPackageUpdate")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CrxApi#postPackageUpdate")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |
 **packageName** | **String**|  |
 **version** | **String**|  |
 **path** | **String**|  |
 **filter** | **String**|  | [optional]
 **charset** | **String**|  | [optional]

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


## postSetPassword

> postSetPassword(postSetPasswordRequest): ApiRequest[String]



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
    val apiInstance = CrxApi("http://localhost")
    val old: String = old_example // String | 

    val plain: String = plain_example // String | 

    val verify: String = verify_example // String | 
    
    val request = apiInstance.postSetPassword(old, plain, verify)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling CrxApi#postSetPassword")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling CrxApi#postSetPassword")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **String**|  |
 **plain** | **String**|  |
 **verify** | **String**|  |

### Return type

ApiRequest[**String**]


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

