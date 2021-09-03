# Org.OpenAPITools.Api.CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCrxdeStatus**](CrxApi.md#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**GetInstallStatus**](CrxApi.md#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**GetPackageManagerServlet**](CrxApi.md#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html | 
[**PostPackageService**](CrxApi.md#postpackageservice) | **POST** /crx/packmgr/service.jsp | 
[**PostPackageServiceJson**](CrxApi.md#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} | 
[**PostPackageUpdate**](CrxApi.md#postpackageupdate) | **POST** /crx/packmgr/update.jsp | 
[**PostSetPassword**](CrxApi.md#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


<a name="getcrxdestatus"></a>
# **GetCrxdeStatus**
> string GetCrxdeStatus ()



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetCrxdeStatusExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CrxApi();

            try
            {
                string result = apiInstance.GetCrxdeStatus();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CrxApi.GetCrxdeStatus: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getinstallstatus"></a>
# **GetInstallStatus**
> InstallStatus GetInstallStatus ()



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetInstallStatusExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CrxApi();

            try
            {
                InstallStatus result = apiInstance.GetInstallStatus();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CrxApi.GetInstallStatus: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpackagemanagerservlet"></a>
# **GetPackageManagerServlet**
> void GetPackageManagerServlet ()



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPackageManagerServletExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CrxApi();

            try
            {
                apiInstance.GetPackageManagerServlet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CrxApi.GetPackageManagerServlet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postpackageservice"></a>
# **PostPackageService**
> string PostPackageService (string cmd)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostPackageServiceExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CrxApi();
            var cmd = cmd_example;  // string | 

            try
            {
                string result = apiInstance.PostPackageService(cmd);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CrxApi.PostPackageService: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postpackageservicejson"></a>
# **PostPackageServiceJson**
> string PostPackageServiceJson (string path, string cmd, string groupName, string packageName, string packageVersion, string charset, bool? force, bool? recursive, System.IO.Stream package)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostPackageServiceJsonExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CrxApi();
            var path = path_example;  // string | 
            var cmd = cmd_example;  // string | 
            var groupName = groupName_example;  // string |  (optional) 
            var packageName = packageName_example;  // string |  (optional) 
            var packageVersion = packageVersion_example;  // string |  (optional) 
            var charset = charset_example;  // string |  (optional) 
            var force = true;  // bool? |  (optional) 
            var recursive = true;  // bool? |  (optional) 
            var package = new System.IO.Stream(); // System.IO.Stream |  (optional) 

            try
            {
                string result = apiInstance.PostPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CrxApi.PostPackageServiceJson: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **cmd** | **string**|  | 
 **groupName** | **string**|  | [optional] 
 **packageName** | **string**|  | [optional] 
 **packageVersion** | **string**|  | [optional] 
 **charset** | **string**|  | [optional] 
 **force** | **bool?**|  | [optional] 
 **recursive** | **bool?**|  | [optional] 
 **package** | **System.IO.Stream**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postpackageupdate"></a>
# **PostPackageUpdate**
> string PostPackageUpdate (string groupName, string packageName, string version, string path, string filter, string charset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostPackageUpdateExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CrxApi();
            var groupName = groupName_example;  // string | 
            var packageName = packageName_example;  // string | 
            var version = version_example;  // string | 
            var path = path_example;  // string | 
            var filter = filter_example;  // string |  (optional) 
            var charset = charset_example;  // string |  (optional) 

            try
            {
                string result = apiInstance.PostPackageUpdate(groupName, packageName, version, path, filter, charset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CrxApi.PostPackageUpdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **string**|  | 
 **packageName** | **string**|  | 
 **version** | **string**|  | 
 **path** | **string**|  | 
 **filter** | **string**|  | [optional] 
 **charset** | **string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postsetpassword"></a>
# **PostSetPassword**
> string PostSetPassword (string old, string plain, string verify)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostSetPasswordExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CrxApi();
            var old = old_example;  // string | 
            var plain = plain_example;  // string | 
            var verify = verify_example;  // string | 

            try
            {
                string result = apiInstance.PostSetPassword(old, plain, verify);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CrxApi.PostSetPassword: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **string**|  | 
 **plain** | **string**|  | 
 **verify** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

