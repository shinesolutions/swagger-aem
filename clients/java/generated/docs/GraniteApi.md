# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


<a name="sslSetup"></a>
# **sslSetup**
> String sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)



### Example
```java
// Import classes:
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.auth.*;
import com.shinesolutions.swaggeraem4j.models.*;
import com.shinesolutions.swaggeraem4j.api.GraniteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: aemAuth
    HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
    aemAuth.setUsername("YOUR USERNAME");
    aemAuth.setPassword("YOUR PASSWORD");

    GraniteApi apiInstance = new GraniteApi(defaultClient);
    String keystorePassword = "keystorePassword_example"; // String | 
    String keystorePasswordConfirm = "keystorePasswordConfirm_example"; // String | 
    String truststorePassword = "truststorePassword_example"; // String | 
    String truststorePasswordConfirm = "truststorePasswordConfirm_example"; // String | 
    String httpsHostname = "httpsHostname_example"; // String | 
    String httpsPort = "httpsPort_example"; // String | 
    File privatekeyFile = new File("/path/to/file"); // File | 
    File certificateFile = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GraniteApi#sslSetup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
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

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

