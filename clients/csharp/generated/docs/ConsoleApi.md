# Org.OpenAPITools.Api.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemProductInfo**](ConsoleApi.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json | 
[**GetBundleInfo**](ConsoleApi.md#getbundleinfo) | **GET** /system/console/bundles/{name}.json | 
[**GetConfigMgr**](ConsoleApi.md#getconfigmgr) | **GET** /system/console/configMgr | 
[**PostBundle**](ConsoleApi.md#postbundle) | **POST** /system/console/bundles/{name} | 
[**PostJmxRepository**](ConsoleApi.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**PostSamlConfiguration**](ConsoleApi.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 



## GetAemProductInfo

> List&lt;string&gt; GetAemProductInfo ()



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAemProductInfoExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConsoleApi(Configuration.Default);

            try
            {
                List<string> result = apiInstance.GetAemProductInfo();
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ConsoleApi.GetAemProductInfo: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List<string>**

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


## GetBundleInfo

> BundleInfo GetBundleInfo (string name)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBundleInfoExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConsoleApi(Configuration.Default);
            var name = name_example;  // string | 

            try
            {
                BundleInfo result = apiInstance.GetBundleInfo(name);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ConsoleApi.GetBundleInfo: " + e.Message );
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
 **name** | **string**|  | 

### Return type

[**BundleInfo**](BundleInfo.md)

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetConfigMgr

> string GetConfigMgr ()



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetConfigMgrExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConsoleApi(Configuration.Default);

            try
            {
                string result = apiInstance.GetConfigMgr();
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ConsoleApi.GetConfigMgr: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
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
- **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **5XX** | Unexpected error. |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostBundle

> void PostBundle (string name, string action)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostBundleExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConsoleApi(Configuration.Default);
            var name = name_example;  // string | 
            var action = action_example;  // string | 

            try
            {
                apiInstance.PostBundle(name, action);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ConsoleApi.PostBundle: " + e.Message );
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
 **name** | **string**|  | 
 **action** | **string**|  | 

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


## PostJmxRepository

> void PostJmxRepository (string action)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostJmxRepositoryExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConsoleApi(Configuration.Default);
            var action = action_example;  // string | 

            try
            {
                apiInstance.PostJmxRepository(action);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ConsoleApi.PostJmxRepository: " + e.Message );
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
 **action** | **string**|  | 

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


## PostSamlConfiguration

> SamlConfigurationInfo PostSamlConfiguration (bool? post = null, bool? apply = null, bool? delete = null, string action = null, string location = null, List<string> path = null, int? serviceRanking = null, string idpUrl = null, string idpCertAlias = null, bool? idpHttpRedirect = null, string serviceProviderEntityId = null, string assertionConsumerServiceURL = null, string spPrivateKeyAlias = null, string keyStorePassword = null, string defaultRedirectUrl = null, string userIDAttribute = null, bool? useEncryption = null, bool? createUser = null, bool? addGroupMemberships = null, string groupMembershipAttribute = null, List<string> defaultGroups = null, string nameIdFormat = null, List<string> synchronizeAttributes = null, bool? handleLogout = null, string logoutUrl = null, int? clockTolerance = null, string digestMethod = null, string signatureMethod = null, string userIntermediatePath = null, List<string> propertylist = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostSamlConfigurationExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConsoleApi(Configuration.Default);
            var post = true;  // bool? |  (optional) 
            var apply = true;  // bool? |  (optional) 
            var delete = true;  // bool? |  (optional) 
            var action = action_example;  // string |  (optional) 
            var location = location_example;  // string |  (optional) 
            var path = new List<string>(); // List<string> |  (optional) 
            var serviceRanking = 56;  // int? |  (optional) 
            var idpUrl = idpUrl_example;  // string |  (optional) 
            var idpCertAlias = idpCertAlias_example;  // string |  (optional) 
            var idpHttpRedirect = true;  // bool? |  (optional) 
            var serviceProviderEntityId = serviceProviderEntityId_example;  // string |  (optional) 
            var assertionConsumerServiceURL = assertionConsumerServiceURL_example;  // string |  (optional) 
            var spPrivateKeyAlias = spPrivateKeyAlias_example;  // string |  (optional) 
            var keyStorePassword = keyStorePassword_example;  // string |  (optional) 
            var defaultRedirectUrl = defaultRedirectUrl_example;  // string |  (optional) 
            var userIDAttribute = userIDAttribute_example;  // string |  (optional) 
            var useEncryption = true;  // bool? |  (optional) 
            var createUser = true;  // bool? |  (optional) 
            var addGroupMemberships = true;  // bool? |  (optional) 
            var groupMembershipAttribute = groupMembershipAttribute_example;  // string |  (optional) 
            var defaultGroups = new List<string>(); // List<string> |  (optional) 
            var nameIdFormat = nameIdFormat_example;  // string |  (optional) 
            var synchronizeAttributes = new List<string>(); // List<string> |  (optional) 
            var handleLogout = true;  // bool? |  (optional) 
            var logoutUrl = logoutUrl_example;  // string |  (optional) 
            var clockTolerance = 56;  // int? |  (optional) 
            var digestMethod = digestMethod_example;  // string |  (optional) 
            var signatureMethod = signatureMethod_example;  // string |  (optional) 
            var userIntermediatePath = userIntermediatePath_example;  // string |  (optional) 
            var propertylist = new List<string>(); // List<string> |  (optional) 

            try
            {
                SamlConfigurationInfo result = apiInstance.PostSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ConsoleApi.PostSamlConfiguration: " + e.Message );
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
 **post** | **bool?**|  | [optional] 
 **apply** | **bool?**|  | [optional] 
 **delete** | **bool?**|  | [optional] 
 **action** | **string**|  | [optional] 
 **location** | **string**|  | [optional] 
 **path** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **serviceRanking** | **int?**|  | [optional] 
 **idpUrl** | **string**|  | [optional] 
 **idpCertAlias** | **string**|  | [optional] 
 **idpHttpRedirect** | **bool?**|  | [optional] 
 **serviceProviderEntityId** | **string**|  | [optional] 
 **assertionConsumerServiceURL** | **string**|  | [optional] 
 **spPrivateKeyAlias** | **string**|  | [optional] 
 **keyStorePassword** | **string**|  | [optional] 
 **defaultRedirectUrl** | **string**|  | [optional] 
 **userIDAttribute** | **string**|  | [optional] 
 **useEncryption** | **bool?**|  | [optional] 
 **createUser** | **bool?**|  | [optional] 
 **addGroupMemberships** | **bool?**|  | [optional] 
 **groupMembershipAttribute** | **string**|  | [optional] 
 **defaultGroups** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **nameIdFormat** | **string**|  | [optional] 
 **synchronizeAttributes** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **handleLogout** | **bool?**|  | [optional] 
 **logoutUrl** | **string**|  | [optional] 
 **clockTolerance** | **int?**|  | [optional] 
 **digestMethod** | **string**|  | [optional] 
 **signatureMethod** | **string**|  | [optional] 
 **userIntermediatePath** | **string**|  | [optional] 
 **propertylist** | [**List&lt;string&gt;**](string.md)|  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

