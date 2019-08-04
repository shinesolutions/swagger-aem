# Org.OpenAPITools.Api.CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemHealthCheck**](CustomApi.md#getaemhealthcheck) | **GET** /system/health | 
[**PostConfigAemHealthCheckServlet**](CustomApi.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**PostConfigAemPasswordReset**](CustomApi.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


<a name="getaemhealthcheck"></a>
# **GetAemHealthCheck**
> string GetAemHealthCheck (string tags, bool? combineTagsOr)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAemHealthCheckExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CustomApi();
            var tags = tags_example;  // string |  (optional) 
            var combineTagsOr = true;  // bool? |  (optional) 

            try
            {
                string result = apiInstance.GetAemHealthCheck(tags, combineTagsOr);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CustomApi.GetAemHealthCheck: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigaemhealthcheckservlet"></a>
# **PostConfigAemHealthCheckServlet**
> void PostConfigAemHealthCheckServlet (List<string> bundlesIgnored, string bundlesIgnoredTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigAemHealthCheckServletExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CustomApi();
            var bundlesIgnored = new List<string>(); // List<string> |  (optional) 
            var bundlesIgnoredTypeHint = bundlesIgnoredTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CustomApi.PostConfigAemHealthCheckServlet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | [**List<string>**](string.md)|  | [optional] 
 **bundlesIgnoredTypeHint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigaempasswordreset"></a>
# **PostConfigAemPasswordReset**
> void PostConfigAemPasswordReset (List<string> pwdresetAuthorizables, string pwdresetAuthorizablesTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigAemPasswordResetExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CustomApi();
            var pwdresetAuthorizables = new List<string>(); // List<string> |  (optional) 
            var pwdresetAuthorizablesTypeHint = pwdresetAuthorizablesTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CustomApi.PostConfigAemPasswordReset: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | [**List<string>**](string.md)|  | [optional] 
 **pwdresetAuthorizablesTypeHint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

