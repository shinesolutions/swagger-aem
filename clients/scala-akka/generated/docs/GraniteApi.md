# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 
[**sslSetupWithHttpInfo**](GraniteApi.md#sslSetupWithHttpInfo) | **POST** /libs/granite/security/post/sslSetup.html | 



## sslSetup

> sslSetup(sslSetupRequest): ApiRequest[String]



### Example

```scala
// Import classes:
import 
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
    val apiInstance = GraniteApi("http://localhost")
    val keystorePassword: String = keystorePassword_example // String | 

    val keystorePasswordConfirm: String = keystorePasswordConfirm_example // String | 

    val truststorePassword: String = truststorePassword_example // String | 

    val truststorePasswordConfirm: String = truststorePasswordConfirm_example // String | 

    val httpsHostname: String = httpsHostname_example // String | 

    val httpsPort: String = httpsPort_example // String | 

    val privatekeyFile: File = BINARY_DATA_HERE // File | 

    val certificateFile: File = BINARY_DATA_HERE // File | 
    
    val request = apiInstance.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling GraniteApi#sslSetup")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling GraniteApi#sslSetup")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **String**|  |
 **keystorePasswordConfirm** | **String**|  |
 **truststorePassword** | **String**|  |
 **truststorePasswordConfirm** | **String**|  |
 **httpsHostname** | **String**|  |
 **httpsPort** | **String**|  |
 **privatekeyFile** | **File**|  | [optional]
 **certificateFile** | **File**|  | [optional]

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

