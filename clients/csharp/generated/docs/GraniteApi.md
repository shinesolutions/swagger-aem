# Org.OpenAPITools.Api.GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SslSetup**](GraniteApi.md#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html | 



## SslSetup

> string SslSetup (string keystorePassword, string keystorePasswordConfirm, string truststorePassword, string truststorePasswordConfirm, string httpsHostname, string httpsPort, System.IO.Stream privatekeyFile = null, System.IO.Stream certificateFile = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SslSetupExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new GraniteApi(Configuration.Default);
            var keystorePassword = keystorePassword_example;  // string | 
            var keystorePasswordConfirm = keystorePasswordConfirm_example;  // string | 
            var truststorePassword = truststorePassword_example;  // string | 
            var truststorePasswordConfirm = truststorePasswordConfirm_example;  // string | 
            var httpsHostname = httpsHostname_example;  // string | 
            var httpsPort = httpsPort_example;  // string | 
            var privatekeyFile = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 
            var certificateFile = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 

            try
            {
                string result = apiInstance.SslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling GraniteApi.SslSetup: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **string**|  | 
 **keystorePasswordConfirm** | **string**|  | 
 **truststorePassword** | **string**|  | 
 **truststorePasswordConfirm** | **string**|  | 
 **httpsHostname** | **string**|  | 
 **httpsPort** | **string**|  | 
 **privatekeyFile** | **System.IO.Stream**|  | [optional] 
 **certificateFile** | **System.IO.Stream**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

