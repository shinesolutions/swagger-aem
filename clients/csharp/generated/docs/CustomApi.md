# Org.OpenAPITools.Api.CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemHealthCheck**](CustomApi.md#getaemhealthcheck) | **GET** /system/health | 
[**PostConfigAemHealthCheckServlet**](CustomApi.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**PostConfigAemPasswordReset**](CustomApi.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 



## GetAemHealthCheck

> string GetAemHealthCheck (string tags = null, bool? combineTagsOr = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAemHealthCheckExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CustomApi(Configuration.Default);
            var tags = tags_example;  // string |  (optional) 
            var combineTagsOr = true;  // bool? |  (optional) 

            try
            {
                string result = apiInstance.GetAemHealthCheck(tags, combineTagsOr);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling CustomApi.GetAemHealthCheck: " + e.Message );
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
 **tags** | **string**|  | [optional] 
 **combineTagsOr** | **bool?**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostConfigAemHealthCheckServlet

> void PostConfigAemHealthCheckServlet (List<string> bundlesIgnored = null, string bundlesIgnoredTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigAemHealthCheckServletExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CustomApi(Configuration.Default);
            var bundlesIgnored = new List<string>(); // List<string> |  (optional) 
            var bundlesIgnoredTypeHint = bundlesIgnoredTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling CustomApi.PostConfigAemHealthCheckServlet: " + e.Message );
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
 **bundlesIgnored** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **bundlesIgnoredTypeHint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostConfigAemPasswordReset

> void PostConfigAemPasswordReset (List<string> pwdresetAuthorizables = null, string pwdresetAuthorizablesTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigAemPasswordResetExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CustomApi(Configuration.Default);
            var pwdresetAuthorizables = new List<string>(); // List<string> |  (optional) 
            var pwdresetAuthorizablesTypeHint = pwdresetAuthorizablesTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling CustomApi.PostConfigAemPasswordReset: " + e.Message );
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
 **pwdresetAuthorizables** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **pwdresetAuthorizablesTypeHint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

