# Org.OpenAPITools.Api.SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteAgent**](SlingApi.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**DeleteNode**](SlingApi.md#deletenode) | **DELETE** /{path}/{name} | 
[**GetAgent**](SlingApi.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**GetAgents**](SlingApi.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**GetAuthorizableKeystore**](SlingApi.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**GetKeystore**](SlingApi.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**GetNode**](SlingApi.md#getnode) | **GET** /{path}/{name} | 
[**GetPackage**](SlingApi.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**GetPackageFilter**](SlingApi.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**GetQuery**](SlingApi.md#getquery) | **GET** /bin/querybuilder.json | 
[**GetTruststore**](SlingApi.md#gettruststore) | **GET** /etc/truststore/truststore.p12 | 
[**GetTruststoreInfo**](SlingApi.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | 
[**PostAgent**](SlingApi.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**PostAuthorizableKeystore**](SlingApi.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**PostAuthorizables**](SlingApi.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**PostConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**PostConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | 
[**PostConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**PostConfigApacheSlingDavExServlet**](SlingApi.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**PostConfigApacheSlingGetServlet**](SlingApi.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**PostConfigApacheSlingReferrerFilter**](SlingApi.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**PostConfigProperty**](SlingApi.md#postconfigproperty) | **POST** /apps/system/config/{configNodeName} | 
[**PostNode**](SlingApi.md#postnode) | **POST** /{path}/{name} | 
[**PostNodeRw**](SlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html | 
[**PostPath**](SlingApi.md#postpath) | **POST** /{path}/ | 
[**PostQuery**](SlingApi.md#postquery) | **POST** /bin/querybuilder.json | 
[**PostTreeActivation**](SlingApi.md#posttreeactivation) | **POST** /etc/replication/treeactivation.html | 
[**PostTruststore**](SlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](SlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore | 



## DeleteAgent

> void DeleteAgent (string runmode, string name)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteAgentExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var runmode = runmode_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.DeleteAgent(runmode, name);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.DeleteAgent: " + e.Message );
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
 **runmode** | **string**|  | 
 **name** | **string**|  | 

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


## DeleteNode

> void DeleteNode (string path, string name)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteNodeExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var path = path_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.DeleteNode(path, name);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.DeleteNode: " + e.Message );
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
 **path** | **string**|  | 
 **name** | **string**|  | 

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


## GetAgent

> void GetAgent (string runmode, string name)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAgentExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var runmode = runmode_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.GetAgent(runmode, name);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetAgent: " + e.Message );
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
 **runmode** | **string**|  | 
 **name** | **string**|  | 

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


## GetAgents

> string GetAgents (string runmode)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAgentsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var runmode = runmode_example;  // string | 

            try
            {
                string result = apiInstance.GetAgents(runmode);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetAgents: " + e.Message );
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
 **runmode** | **string**|  | 

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


## GetAuthorizableKeystore

> KeystoreInfo GetAuthorizableKeystore (string intermediatePath, string authorizableId)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAuthorizableKeystoreExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var intermediatePath = intermediatePath_example;  // string | 
            var authorizableId = authorizableId_example;  // string | 

            try
            {
                KeystoreInfo result = apiInstance.GetAuthorizableKeystore(intermediatePath, authorizableId);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetAuthorizableKeystore: " + e.Message );
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
 **intermediatePath** | **string**|  | 
 **authorizableId** | **string**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetKeystore

> System.IO.Stream GetKeystore (string intermediatePath, string authorizableId)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetKeystoreExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var intermediatePath = intermediatePath_example;  // string | 
            var authorizableId = authorizableId_example;  // string | 

            try
            {
                System.IO.Stream result = apiInstance.GetKeystore(intermediatePath, authorizableId);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetKeystore: " + e.Message );
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
 **intermediatePath** | **string**|  | 
 **authorizableId** | **string**|  | 

### Return type

**System.IO.Stream**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetNode

> void GetNode (string path, string name)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetNodeExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var path = path_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.GetNode(path, name);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetNode: " + e.Message );
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
 **path** | **string**|  | 
 **name** | **string**|  | 

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


## GetPackage

> System.IO.Stream GetPackage (string group, string name, string version)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPackageExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var group = group_example;  // string | 
            var name = name_example;  // string | 
            var version = version_example;  // string | 

            try
            {
                System.IO.Stream result = apiInstance.GetPackage(group, name, version);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetPackage: " + e.Message );
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
 **group** | **string**|  | 
 **name** | **string**|  | 
 **version** | **string**|  | 

### Return type

**System.IO.Stream**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPackageFilter

> string GetPackageFilter (string group, string name, string version)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPackageFilterExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var group = group_example;  // string | 
            var name = name_example;  // string | 
            var version = version_example;  // string | 

            try
            {
                string result = apiInstance.GetPackageFilter(group, name, version);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetPackageFilter: " + e.Message );
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
 **group** | **string**|  | 
 **name** | **string**|  | 
 **version** | **string**|  | 

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


## GetQuery

> string GetQuery (string path, decimal pLimit, string _1property, string _1propertyValue)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetQueryExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var path = path_example;  // string | 
            var pLimit = 8.14;  // decimal | 
            var _1property = _1property_example;  // string | 
            var _1propertyValue = _1propertyValue_example;  // string | 

            try
            {
                string result = apiInstance.GetQuery(path, pLimit, _1property, _1propertyValue);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetQuery: " + e.Message );
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
 **path** | **string**|  | 
 **pLimit** | **decimal**|  | 
 **_1property** | **string**|  | 
 **_1propertyValue** | **string**|  | 

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


## GetTruststore

> System.IO.Stream GetTruststore ()



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetTruststoreExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);

            try
            {
                System.IO.Stream result = apiInstance.GetTruststore();
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetTruststore: " + e.Message );
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

**System.IO.Stream**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTruststoreInfo

> TruststoreInfo GetTruststoreInfo ()



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetTruststoreInfoExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);

            try
            {
                TruststoreInfo result = apiInstance.GetTruststoreInfo();
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.GetTruststoreInfo: " + e.Message );
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

[**TruststoreInfo**](TruststoreInfo.md)

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostAgent

> void PostAgent (string runmode, string name, bool? jcrcontentCqdistribute = null, string jcrcontentCqdistributeTypeHint = null, string jcrcontentCqname = null, string jcrcontentCqtemplate = null, bool? jcrcontentEnabled = null, string jcrcontentJcrdescription = null, string jcrcontentJcrlastModified = null, string jcrcontentJcrlastModifiedBy = null, string jcrcontentJcrmixinTypes = null, string jcrcontentJcrtitle = null, string jcrcontentLogLevel = null, bool? jcrcontentNoStatusUpdate = null, bool? jcrcontentNoVersioning = null, decimal? jcrcontentProtocolConnectTimeout = null, bool? jcrcontentProtocolHTTPConnectionClosed = null, string jcrcontentProtocolHTTPExpired = null, List<string> jcrcontentProtocolHTTPHeaders = null, string jcrcontentProtocolHTTPHeadersTypeHint = null, string jcrcontentProtocolHTTPMethod = null, bool? jcrcontentProtocolHTTPSRelaxed = null, string jcrcontentProtocolInterface = null, decimal? jcrcontentProtocolSocketTimeout = null, string jcrcontentProtocolVersion = null, string jcrcontentProxyNTLMDomain = null, string jcrcontentProxyNTLMHost = null, string jcrcontentProxyHost = null, string jcrcontentProxyPassword = null, decimal? jcrcontentProxyPort = null, string jcrcontentProxyUser = null, decimal? jcrcontentQueueBatchMaxSize = null, string jcrcontentQueueBatchMode = null, decimal? jcrcontentQueueBatchWaitTime = null, string jcrcontentRetryDelay = null, bool? jcrcontentReverseReplication = null, string jcrcontentSerializationType = null, string jcrcontentSlingresourceType = null, string jcrcontentSsl = null, string jcrcontentTransportNTLMDomain = null, string jcrcontentTransportNTLMHost = null, string jcrcontentTransportPassword = null, string jcrcontentTransportUri = null, string jcrcontentTransportUser = null, bool? jcrcontentTriggerDistribute = null, bool? jcrcontentTriggerModified = null, bool? jcrcontentTriggerOnOffTime = null, bool? jcrcontentTriggerReceive = null, bool? jcrcontentTriggerSpecific = null, string jcrcontentUserId = null, string jcrprimaryType = null, string operation = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostAgentExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var runmode = runmode_example;  // string | 
            var name = name_example;  // string | 
            var jcrcontentCqdistribute = true;  // bool? |  (optional) 
            var jcrcontentCqdistributeTypeHint = jcrcontentCqdistributeTypeHint_example;  // string |  (optional) 
            var jcrcontentCqname = jcrcontentCqname_example;  // string |  (optional) 
            var jcrcontentCqtemplate = jcrcontentCqtemplate_example;  // string |  (optional) 
            var jcrcontentEnabled = true;  // bool? |  (optional) 
            var jcrcontentJcrdescription = jcrcontentJcrdescription_example;  // string |  (optional) 
            var jcrcontentJcrlastModified = jcrcontentJcrlastModified_example;  // string |  (optional) 
            var jcrcontentJcrlastModifiedBy = jcrcontentJcrlastModifiedBy_example;  // string |  (optional) 
            var jcrcontentJcrmixinTypes = jcrcontentJcrmixinTypes_example;  // string |  (optional) 
            var jcrcontentJcrtitle = jcrcontentJcrtitle_example;  // string |  (optional) 
            var jcrcontentLogLevel = jcrcontentLogLevel_example;  // string |  (optional) 
            var jcrcontentNoStatusUpdate = true;  // bool? |  (optional) 
            var jcrcontentNoVersioning = true;  // bool? |  (optional) 
            var jcrcontentProtocolConnectTimeout = 8.14;  // decimal? |  (optional) 
            var jcrcontentProtocolHTTPConnectionClosed = true;  // bool? |  (optional) 
            var jcrcontentProtocolHTTPExpired = jcrcontentProtocolHTTPExpired_example;  // string |  (optional) 
            var jcrcontentProtocolHTTPHeaders = new List<string>(); // List<string> |  (optional) 
            var jcrcontentProtocolHTTPHeadersTypeHint = jcrcontentProtocolHTTPHeadersTypeHint_example;  // string |  (optional) 
            var jcrcontentProtocolHTTPMethod = jcrcontentProtocolHTTPMethod_example;  // string |  (optional) 
            var jcrcontentProtocolHTTPSRelaxed = true;  // bool? |  (optional) 
            var jcrcontentProtocolInterface = jcrcontentProtocolInterface_example;  // string |  (optional) 
            var jcrcontentProtocolSocketTimeout = 8.14;  // decimal? |  (optional) 
            var jcrcontentProtocolVersion = jcrcontentProtocolVersion_example;  // string |  (optional) 
            var jcrcontentProxyNTLMDomain = jcrcontentProxyNTLMDomain_example;  // string |  (optional) 
            var jcrcontentProxyNTLMHost = jcrcontentProxyNTLMHost_example;  // string |  (optional) 
            var jcrcontentProxyHost = jcrcontentProxyHost_example;  // string |  (optional) 
            var jcrcontentProxyPassword = jcrcontentProxyPassword_example;  // string |  (optional) 
            var jcrcontentProxyPort = 8.14;  // decimal? |  (optional) 
            var jcrcontentProxyUser = jcrcontentProxyUser_example;  // string |  (optional) 
            var jcrcontentQueueBatchMaxSize = 8.14;  // decimal? |  (optional) 
            var jcrcontentQueueBatchMode = jcrcontentQueueBatchMode_example;  // string |  (optional) 
            var jcrcontentQueueBatchWaitTime = 8.14;  // decimal? |  (optional) 
            var jcrcontentRetryDelay = jcrcontentRetryDelay_example;  // string |  (optional) 
            var jcrcontentReverseReplication = true;  // bool? |  (optional) 
            var jcrcontentSerializationType = jcrcontentSerializationType_example;  // string |  (optional) 
            var jcrcontentSlingresourceType = jcrcontentSlingresourceType_example;  // string |  (optional) 
            var jcrcontentSsl = jcrcontentSsl_example;  // string |  (optional) 
            var jcrcontentTransportNTLMDomain = jcrcontentTransportNTLMDomain_example;  // string |  (optional) 
            var jcrcontentTransportNTLMHost = jcrcontentTransportNTLMHost_example;  // string |  (optional) 
            var jcrcontentTransportPassword = jcrcontentTransportPassword_example;  // string |  (optional) 
            var jcrcontentTransportUri = jcrcontentTransportUri_example;  // string |  (optional) 
            var jcrcontentTransportUser = jcrcontentTransportUser_example;  // string |  (optional) 
            var jcrcontentTriggerDistribute = true;  // bool? |  (optional) 
            var jcrcontentTriggerModified = true;  // bool? |  (optional) 
            var jcrcontentTriggerOnOffTime = true;  // bool? |  (optional) 
            var jcrcontentTriggerReceive = true;  // bool? |  (optional) 
            var jcrcontentTriggerSpecific = true;  // bool? |  (optional) 
            var jcrcontentUserId = jcrcontentUserId_example;  // string |  (optional) 
            var jcrprimaryType = jcrprimaryType_example;  // string |  (optional) 
            var operation = operation_example;  // string |  (optional) 

            try
            {
                apiInstance.PostAgent(runmode, name, jcrcontentCqdistribute, jcrcontentCqdistributeTypeHint, jcrcontentCqname, jcrcontentCqtemplate, jcrcontentEnabled, jcrcontentJcrdescription, jcrcontentJcrlastModified, jcrcontentJcrlastModifiedBy, jcrcontentJcrmixinTypes, jcrcontentJcrtitle, jcrcontentLogLevel, jcrcontentNoStatusUpdate, jcrcontentNoVersioning, jcrcontentProtocolConnectTimeout, jcrcontentProtocolHTTPConnectionClosed, jcrcontentProtocolHTTPExpired, jcrcontentProtocolHTTPHeaders, jcrcontentProtocolHTTPHeadersTypeHint, jcrcontentProtocolHTTPMethod, jcrcontentProtocolHTTPSRelaxed, jcrcontentProtocolInterface, jcrcontentProtocolSocketTimeout, jcrcontentProtocolVersion, jcrcontentProxyNTLMDomain, jcrcontentProxyNTLMHost, jcrcontentProxyHost, jcrcontentProxyPassword, jcrcontentProxyPort, jcrcontentProxyUser, jcrcontentQueueBatchMaxSize, jcrcontentQueueBatchMode, jcrcontentQueueBatchWaitTime, jcrcontentRetryDelay, jcrcontentReverseReplication, jcrcontentSerializationType, jcrcontentSlingresourceType, jcrcontentSsl, jcrcontentTransportNTLMDomain, jcrcontentTransportNTLMHost, jcrcontentTransportPassword, jcrcontentTransportUri, jcrcontentTransportUser, jcrcontentTriggerDistribute, jcrcontentTriggerModified, jcrcontentTriggerOnOffTime, jcrcontentTriggerReceive, jcrcontentTriggerSpecific, jcrcontentUserId, jcrprimaryType, operation);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostAgent: " + e.Message );
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
 **runmode** | **string**|  | 
 **name** | **string**|  | 
 **jcrcontentCqdistribute** | **bool?**|  | [optional] 
 **jcrcontentCqdistributeTypeHint** | **string**|  | [optional] 
 **jcrcontentCqname** | **string**|  | [optional] 
 **jcrcontentCqtemplate** | **string**|  | [optional] 
 **jcrcontentEnabled** | **bool?**|  | [optional] 
 **jcrcontentJcrdescription** | **string**|  | [optional] 
 **jcrcontentJcrlastModified** | **string**|  | [optional] 
 **jcrcontentJcrlastModifiedBy** | **string**|  | [optional] 
 **jcrcontentJcrmixinTypes** | **string**|  | [optional] 
 **jcrcontentJcrtitle** | **string**|  | [optional] 
 **jcrcontentLogLevel** | **string**|  | [optional] 
 **jcrcontentNoStatusUpdate** | **bool?**|  | [optional] 
 **jcrcontentNoVersioning** | **bool?**|  | [optional] 
 **jcrcontentProtocolConnectTimeout** | **decimal?**|  | [optional] 
 **jcrcontentProtocolHTTPConnectionClosed** | **bool?**|  | [optional] 
 **jcrcontentProtocolHTTPExpired** | **string**|  | [optional] 
 **jcrcontentProtocolHTTPHeaders** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **jcrcontentProtocolHTTPHeadersTypeHint** | **string**|  | [optional] 
 **jcrcontentProtocolHTTPMethod** | **string**|  | [optional] 
 **jcrcontentProtocolHTTPSRelaxed** | **bool?**|  | [optional] 
 **jcrcontentProtocolInterface** | **string**|  | [optional] 
 **jcrcontentProtocolSocketTimeout** | **decimal?**|  | [optional] 
 **jcrcontentProtocolVersion** | **string**|  | [optional] 
 **jcrcontentProxyNTLMDomain** | **string**|  | [optional] 
 **jcrcontentProxyNTLMHost** | **string**|  | [optional] 
 **jcrcontentProxyHost** | **string**|  | [optional] 
 **jcrcontentProxyPassword** | **string**|  | [optional] 
 **jcrcontentProxyPort** | **decimal?**|  | [optional] 
 **jcrcontentProxyUser** | **string**|  | [optional] 
 **jcrcontentQueueBatchMaxSize** | **decimal?**|  | [optional] 
 **jcrcontentQueueBatchMode** | **string**|  | [optional] 
 **jcrcontentQueueBatchWaitTime** | **decimal?**|  | [optional] 
 **jcrcontentRetryDelay** | **string**|  | [optional] 
 **jcrcontentReverseReplication** | **bool?**|  | [optional] 
 **jcrcontentSerializationType** | **string**|  | [optional] 
 **jcrcontentSlingresourceType** | **string**|  | [optional] 
 **jcrcontentSsl** | **string**|  | [optional] 
 **jcrcontentTransportNTLMDomain** | **string**|  | [optional] 
 **jcrcontentTransportNTLMHost** | **string**|  | [optional] 
 **jcrcontentTransportPassword** | **string**|  | [optional] 
 **jcrcontentTransportUri** | **string**|  | [optional] 
 **jcrcontentTransportUser** | **string**|  | [optional] 
 **jcrcontentTriggerDistribute** | **bool?**|  | [optional] 
 **jcrcontentTriggerModified** | **bool?**|  | [optional] 
 **jcrcontentTriggerOnOffTime** | **bool?**|  | [optional] 
 **jcrcontentTriggerReceive** | **bool?**|  | [optional] 
 **jcrcontentTriggerSpecific** | **bool?**|  | [optional] 
 **jcrcontentUserId** | **string**|  | [optional] 
 **jcrprimaryType** | **string**|  | [optional] 
 **operation** | **string**|  | [optional] 

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


## PostAuthorizableKeystore

> KeystoreInfo PostAuthorizableKeystore (string intermediatePath, string authorizableId, string operation = null, string currentPassword = null, string newPassword = null, string rePassword = null, string keyPassword = null, string keyStorePass = null, string alias = null, string newAlias = null, string removeAlias = null, System.IO.Stream certChain = null, System.IO.Stream pk = null, System.IO.Stream keyStore = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostAuthorizableKeystoreExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var intermediatePath = intermediatePath_example;  // string | 
            var authorizableId = authorizableId_example;  // string | 
            var operation = operation_example;  // string |  (optional) 
            var currentPassword = currentPassword_example;  // string |  (optional) 
            var newPassword = newPassword_example;  // string |  (optional) 
            var rePassword = rePassword_example;  // string |  (optional) 
            var keyPassword = keyPassword_example;  // string |  (optional) 
            var keyStorePass = keyStorePass_example;  // string |  (optional) 
            var alias = alias_example;  // string |  (optional) 
            var newAlias = newAlias_example;  // string |  (optional) 
            var removeAlias = removeAlias_example;  // string |  (optional) 
            var certChain = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 
            var pk = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 
            var keyStore = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 

            try
            {
                KeystoreInfo result = apiInstance.PostAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostAuthorizableKeystore: " + e.Message );
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
 **intermediatePath** | **string**|  | 
 **authorizableId** | **string**|  | 
 **operation** | **string**|  | [optional] 
 **currentPassword** | **string**|  | [optional] 
 **newPassword** | **string**|  | [optional] 
 **rePassword** | **string**|  | [optional] 
 **keyPassword** | **string**|  | [optional] 
 **keyStorePass** | **string**|  | [optional] 
 **alias** | **string**|  | [optional] 
 **newAlias** | **string**|  | [optional] 
 **removeAlias** | **string**|  | [optional] 
 **certChain** | **System.IO.Stream**|  | [optional] 
 **pk** | **System.IO.Stream**|  | [optional] 
 **keyStore** | **System.IO.Stream**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostAuthorizables

> string PostAuthorizables (string authorizableId, string intermediatePath, string createUser = null, string createGroup = null, string reppassword = null, string profileGivenName = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostAuthorizablesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var authorizableId = authorizableId_example;  // string | 
            var intermediatePath = intermediatePath_example;  // string | 
            var createUser = createUser_example;  // string |  (optional) 
            var createGroup = createGroup_example;  // string |  (optional) 
            var reppassword = reppassword_example;  // string |  (optional) 
            var profileGivenName = profileGivenName_example;  // string |  (optional) 

            try
            {
                string result = apiInstance.PostAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profileGivenName);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostAuthorizables: " + e.Message );
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
 **authorizableId** | **string**|  | 
 **intermediatePath** | **string**|  | 
 **createUser** | **string**|  | [optional] 
 **createGroup** | **string**|  | [optional] 
 **reppassword** | **string**|  | [optional] 
 **profileGivenName** | **string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostConfigAdobeGraniteSamlAuthenticationHandler

> void PostConfigAdobeGraniteSamlAuthenticationHandler (string keyStorePassword = null, string keyStorePasswordTypeHint = null, int? serviceRanking = null, string serviceRankingTypeHint = null, bool? idpHttpRedirect = null, string idpHttpRedirectTypeHint = null, bool? createUser = null, string createUserTypeHint = null, string defaultRedirectUrl = null, string defaultRedirectUrlTypeHint = null, string userIDAttribute = null, string userIDAttributeTypeHint = null, List<string> defaultGroups = null, string defaultGroupsTypeHint = null, string idpCertAlias = null, string idpCertAliasTypeHint = null, bool? addGroupMemberships = null, string addGroupMembershipsTypeHint = null, List<string> path = null, string pathTypeHint = null, List<string> synchronizeAttributes = null, string synchronizeAttributesTypeHint = null, int? clockTolerance = null, string clockToleranceTypeHint = null, string groupMembershipAttribute = null, string groupMembershipAttributeTypeHint = null, string idpUrl = null, string idpUrlTypeHint = null, string logoutUrl = null, string logoutUrlTypeHint = null, string serviceProviderEntityId = null, string serviceProviderEntityIdTypeHint = null, string assertionConsumerServiceURL = null, string assertionConsumerServiceURLTypeHint = null, bool? handleLogout = null, string handleLogoutTypeHint = null, string spPrivateKeyAlias = null, string spPrivateKeyAliasTypeHint = null, bool? useEncryption = null, string useEncryptionTypeHint = null, string nameIdFormat = null, string nameIdFormatTypeHint = null, string digestMethod = null, string digestMethodTypeHint = null, string signatureMethod = null, string signatureMethodTypeHint = null, string userIntermediatePath = null, string userIntermediatePathTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigAdobeGraniteSamlAuthenticationHandlerExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var keyStorePassword = keyStorePassword_example;  // string |  (optional) 
            var keyStorePasswordTypeHint = keyStorePasswordTypeHint_example;  // string |  (optional) 
            var serviceRanking = 56;  // int? |  (optional) 
            var serviceRankingTypeHint = serviceRankingTypeHint_example;  // string |  (optional) 
            var idpHttpRedirect = true;  // bool? |  (optional) 
            var idpHttpRedirectTypeHint = idpHttpRedirectTypeHint_example;  // string |  (optional) 
            var createUser = true;  // bool? |  (optional) 
            var createUserTypeHint = createUserTypeHint_example;  // string |  (optional) 
            var defaultRedirectUrl = defaultRedirectUrl_example;  // string |  (optional) 
            var defaultRedirectUrlTypeHint = defaultRedirectUrlTypeHint_example;  // string |  (optional) 
            var userIDAttribute = userIDAttribute_example;  // string |  (optional) 
            var userIDAttributeTypeHint = userIDAttributeTypeHint_example;  // string |  (optional) 
            var defaultGroups = new List<string>(); // List<string> |  (optional) 
            var defaultGroupsTypeHint = defaultGroupsTypeHint_example;  // string |  (optional) 
            var idpCertAlias = idpCertAlias_example;  // string |  (optional) 
            var idpCertAliasTypeHint = idpCertAliasTypeHint_example;  // string |  (optional) 
            var addGroupMemberships = true;  // bool? |  (optional) 
            var addGroupMembershipsTypeHint = addGroupMembershipsTypeHint_example;  // string |  (optional) 
            var path = new List<string>(); // List<string> |  (optional) 
            var pathTypeHint = pathTypeHint_example;  // string |  (optional) 
            var synchronizeAttributes = new List<string>(); // List<string> |  (optional) 
            var synchronizeAttributesTypeHint = synchronizeAttributesTypeHint_example;  // string |  (optional) 
            var clockTolerance = 56;  // int? |  (optional) 
            var clockToleranceTypeHint = clockToleranceTypeHint_example;  // string |  (optional) 
            var groupMembershipAttribute = groupMembershipAttribute_example;  // string |  (optional) 
            var groupMembershipAttributeTypeHint = groupMembershipAttributeTypeHint_example;  // string |  (optional) 
            var idpUrl = idpUrl_example;  // string |  (optional) 
            var idpUrlTypeHint = idpUrlTypeHint_example;  // string |  (optional) 
            var logoutUrl = logoutUrl_example;  // string |  (optional) 
            var logoutUrlTypeHint = logoutUrlTypeHint_example;  // string |  (optional) 
            var serviceProviderEntityId = serviceProviderEntityId_example;  // string |  (optional) 
            var serviceProviderEntityIdTypeHint = serviceProviderEntityIdTypeHint_example;  // string |  (optional) 
            var assertionConsumerServiceURL = assertionConsumerServiceURL_example;  // string |  (optional) 
            var assertionConsumerServiceURLTypeHint = assertionConsumerServiceURLTypeHint_example;  // string |  (optional) 
            var handleLogout = true;  // bool? |  (optional) 
            var handleLogoutTypeHint = handleLogoutTypeHint_example;  // string |  (optional) 
            var spPrivateKeyAlias = spPrivateKeyAlias_example;  // string |  (optional) 
            var spPrivateKeyAliasTypeHint = spPrivateKeyAliasTypeHint_example;  // string |  (optional) 
            var useEncryption = true;  // bool? |  (optional) 
            var useEncryptionTypeHint = useEncryptionTypeHint_example;  // string |  (optional) 
            var nameIdFormat = nameIdFormat_example;  // string |  (optional) 
            var nameIdFormatTypeHint = nameIdFormatTypeHint_example;  // string |  (optional) 
            var digestMethod = digestMethod_example;  // string |  (optional) 
            var digestMethodTypeHint = digestMethodTypeHint_example;  // string |  (optional) 
            var signatureMethod = signatureMethod_example;  // string |  (optional) 
            var signatureMethodTypeHint = signatureMethodTypeHint_example;  // string |  (optional) 
            var userIntermediatePath = userIntermediatePath_example;  // string |  (optional) 
            var userIntermediatePathTypeHint = userIntermediatePathTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigAdobeGraniteSamlAuthenticationHandler: " + e.Message );
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
 **keyStorePassword** | **string**|  | [optional] 
 **keyStorePasswordTypeHint** | **string**|  | [optional] 
 **serviceRanking** | **int?**|  | [optional] 
 **serviceRankingTypeHint** | **string**|  | [optional] 
 **idpHttpRedirect** | **bool?**|  | [optional] 
 **idpHttpRedirectTypeHint** | **string**|  | [optional] 
 **createUser** | **bool?**|  | [optional] 
 **createUserTypeHint** | **string**|  | [optional] 
 **defaultRedirectUrl** | **string**|  | [optional] 
 **defaultRedirectUrlTypeHint** | **string**|  | [optional] 
 **userIDAttribute** | **string**|  | [optional] 
 **userIDAttributeTypeHint** | **string**|  | [optional] 
 **defaultGroups** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **defaultGroupsTypeHint** | **string**|  | [optional] 
 **idpCertAlias** | **string**|  | [optional] 
 **idpCertAliasTypeHint** | **string**|  | [optional] 
 **addGroupMemberships** | **bool?**|  | [optional] 
 **addGroupMembershipsTypeHint** | **string**|  | [optional] 
 **path** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **pathTypeHint** | **string**|  | [optional] 
 **synchronizeAttributes** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **synchronizeAttributesTypeHint** | **string**|  | [optional] 
 **clockTolerance** | **int?**|  | [optional] 
 **clockToleranceTypeHint** | **string**|  | [optional] 
 **groupMembershipAttribute** | **string**|  | [optional] 
 **groupMembershipAttributeTypeHint** | **string**|  | [optional] 
 **idpUrl** | **string**|  | [optional] 
 **idpUrlTypeHint** | **string**|  | [optional] 
 **logoutUrl** | **string**|  | [optional] 
 **logoutUrlTypeHint** | **string**|  | [optional] 
 **serviceProviderEntityId** | **string**|  | [optional] 
 **serviceProviderEntityIdTypeHint** | **string**|  | [optional] 
 **assertionConsumerServiceURL** | **string**|  | [optional] 
 **assertionConsumerServiceURLTypeHint** | **string**|  | [optional] 
 **handleLogout** | **bool?**|  | [optional] 
 **handleLogoutTypeHint** | **string**|  | [optional] 
 **spPrivateKeyAlias** | **string**|  | [optional] 
 **spPrivateKeyAliasTypeHint** | **string**|  | [optional] 
 **useEncryption** | **bool?**|  | [optional] 
 **useEncryptionTypeHint** | **string**|  | [optional] 
 **nameIdFormat** | **string**|  | [optional] 
 **nameIdFormatTypeHint** | **string**|  | [optional] 
 **digestMethod** | **string**|  | [optional] 
 **digestMethodTypeHint** | **string**|  | [optional] 
 **signatureMethod** | **string**|  | [optional] 
 **signatureMethodTypeHint** | **string**|  | [optional] 
 **userIntermediatePath** | **string**|  | [optional] 
 **userIntermediatePathTypeHint** | **string**|  | [optional] 

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


## PostConfigApacheFelixJettyBasedHttpService

> void PostConfigApacheFelixJettyBasedHttpService (bool? orgApacheFelixHttpsNio = null, string orgApacheFelixHttpsNioTypeHint = null, string orgApacheFelixHttpsKeystore = null, string orgApacheFelixHttpsKeystoreTypeHint = null, string orgApacheFelixHttpsKeystorePassword = null, string orgApacheFelixHttpsKeystorePasswordTypeHint = null, string orgApacheFelixHttpsKeystoreKey = null, string orgApacheFelixHttpsKeystoreKeyTypeHint = null, string orgApacheFelixHttpsKeystoreKeyPassword = null, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = null, string orgApacheFelixHttpsTruststore = null, string orgApacheFelixHttpsTruststoreTypeHint = null, string orgApacheFelixHttpsTruststorePassword = null, string orgApacheFelixHttpsTruststorePasswordTypeHint = null, string orgApacheFelixHttpsClientcertificate = null, string orgApacheFelixHttpsClientcertificateTypeHint = null, bool? orgApacheFelixHttpsEnable = null, string orgApacheFelixHttpsEnableTypeHint = null, string orgOsgiServiceHttpPortSecure = null, string orgOsgiServiceHttpPortSecureTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheFelixJettyBasedHttpServiceExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var orgApacheFelixHttpsNio = true;  // bool? |  (optional) 
            var orgApacheFelixHttpsNioTypeHint = orgApacheFelixHttpsNioTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystoreTypeHint = orgApacheFelixHttpsKeystoreTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystorePasswordTypeHint = orgApacheFelixHttpsKeystorePasswordTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystoreKey = orgApacheFelixHttpsKeystoreKey_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystoreKeyTypeHint = orgApacheFelixHttpsKeystoreKeyTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword_example;  // string |  (optional) 
            var orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore_example;  // string |  (optional) 
            var orgApacheFelixHttpsTruststoreTypeHint = orgApacheFelixHttpsTruststoreTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword_example;  // string |  (optional) 
            var orgApacheFelixHttpsTruststorePasswordTypeHint = orgApacheFelixHttpsTruststorePasswordTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate_example;  // string |  (optional) 
            var orgApacheFelixHttpsClientcertificateTypeHint = orgApacheFelixHttpsClientcertificateTypeHint_example;  // string |  (optional) 
            var orgApacheFelixHttpsEnable = true;  // bool? |  (optional) 
            var orgApacheFelixHttpsEnableTypeHint = orgApacheFelixHttpsEnableTypeHint_example;  // string |  (optional) 
            var orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure_example;  // string |  (optional) 
            var orgOsgiServiceHttpPortSecureTypeHint = orgOsgiServiceHttpPortSecureTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheFelixJettyBasedHttpService: " + e.Message );
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
 **orgApacheFelixHttpsNio** | **bool?**|  | [optional] 
 **orgApacheFelixHttpsNioTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystore** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystoreTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystorePassword** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKey** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **string**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsTruststore** | **string**|  | [optional] 
 **orgApacheFelixHttpsTruststoreTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsTruststorePassword** | **string**|  | [optional] 
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsClientcertificate** | **string**|  | [optional] 
 **orgApacheFelixHttpsClientcertificateTypeHint** | **string**|  | [optional] 
 **orgApacheFelixHttpsEnable** | **bool?**|  | [optional] 
 **orgApacheFelixHttpsEnableTypeHint** | **string**|  | [optional] 
 **orgOsgiServiceHttpPortSecure** | **string**|  | [optional] 
 **orgOsgiServiceHttpPortSecureTypeHint** | **string**|  | [optional] 

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


## PostConfigApacheHttpComponentsProxyConfiguration

> void PostConfigApacheHttpComponentsProxyConfiguration (string proxyHost = null, string proxyHostTypeHint = null, int? proxyPort = null, string proxyPortTypeHint = null, List<string> proxyExceptions = null, string proxyExceptionsTypeHint = null, bool? proxyEnabled = null, string proxyEnabledTypeHint = null, string proxyUser = null, string proxyUserTypeHint = null, string proxyPassword = null, string proxyPasswordTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheHttpComponentsProxyConfigurationExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var proxyHost = proxyHost_example;  // string |  (optional) 
            var proxyHostTypeHint = proxyHostTypeHint_example;  // string |  (optional) 
            var proxyPort = 56;  // int? |  (optional) 
            var proxyPortTypeHint = proxyPortTypeHint_example;  // string |  (optional) 
            var proxyExceptions = new List<string>(); // List<string> |  (optional) 
            var proxyExceptionsTypeHint = proxyExceptionsTypeHint_example;  // string |  (optional) 
            var proxyEnabled = true;  // bool? |  (optional) 
            var proxyEnabledTypeHint = proxyEnabledTypeHint_example;  // string |  (optional) 
            var proxyUser = proxyUser_example;  // string |  (optional) 
            var proxyUserTypeHint = proxyUserTypeHint_example;  // string |  (optional) 
            var proxyPassword = proxyPassword_example;  // string |  (optional) 
            var proxyPasswordTypeHint = proxyPasswordTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheHttpComponentsProxyConfiguration: " + e.Message );
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
 **proxyHost** | **string**|  | [optional] 
 **proxyHostTypeHint** | **string**|  | [optional] 
 **proxyPort** | **int?**|  | [optional] 
 **proxyPortTypeHint** | **string**|  | [optional] 
 **proxyExceptions** | [**List&lt;string&gt;**](string.md)|  | [optional] 
 **proxyExceptionsTypeHint** | **string**|  | [optional] 
 **proxyEnabled** | **bool?**|  | [optional] 
 **proxyEnabledTypeHint** | **string**|  | [optional] 
 **proxyUser** | **string**|  | [optional] 
 **proxyUserTypeHint** | **string**|  | [optional] 
 **proxyPassword** | **string**|  | [optional] 
 **proxyPasswordTypeHint** | **string**|  | [optional] 

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


## PostConfigApacheSlingDavExServlet

> void PostConfigApacheSlingDavExServlet (string alias = null, string aliasTypeHint = null, bool? davCreateAbsoluteUri = null, string davCreateAbsoluteUriTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheSlingDavExServletExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var alias = alias_example;  // string |  (optional) 
            var aliasTypeHint = aliasTypeHint_example;  // string |  (optional) 
            var davCreateAbsoluteUri = true;  // bool? |  (optional) 
            var davCreateAbsoluteUriTypeHint = davCreateAbsoluteUriTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheSlingDavExServlet: " + e.Message );
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
 **alias** | **string**|  | [optional] 
 **aliasTypeHint** | **string**|  | [optional] 
 **davCreateAbsoluteUri** | **bool?**|  | [optional] 
 **davCreateAbsoluteUriTypeHint** | **string**|  | [optional] 

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


## PostConfigApacheSlingGetServlet

> void PostConfigApacheSlingGetServlet (string jsonMaximumresults = null, string jsonMaximumresultsTypeHint = null, bool? enableHtml = null, string enableHtmlTypeHint = null, bool? enableTxt = null, string enableTxtTypeHint = null, bool? enableXml = null, string enableXmlTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheSlingGetServletExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var jsonMaximumresults = jsonMaximumresults_example;  // string |  (optional) 
            var jsonMaximumresultsTypeHint = jsonMaximumresultsTypeHint_example;  // string |  (optional) 
            var enableHtml = true;  // bool? |  (optional) 
            var enableHtmlTypeHint = enableHtmlTypeHint_example;  // string |  (optional) 
            var enableTxt = true;  // bool? |  (optional) 
            var enableTxtTypeHint = enableTxtTypeHint_example;  // string |  (optional) 
            var enableXml = true;  // bool? |  (optional) 
            var enableXmlTypeHint = enableXmlTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheSlingGetServlet: " + e.Message );
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
 **jsonMaximumresults** | **string**|  | [optional] 
 **jsonMaximumresultsTypeHint** | **string**|  | [optional] 
 **enableHtml** | **bool?**|  | [optional] 
 **enableHtmlTypeHint** | **string**|  | [optional] 
 **enableTxt** | **bool?**|  | [optional] 
 **enableTxtTypeHint** | **string**|  | [optional] 
 **enableXml** | **bool?**|  | [optional] 
 **enableXmlTypeHint** | **string**|  | [optional] 

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


## PostConfigApacheSlingReferrerFilter

> void PostConfigApacheSlingReferrerFilter (bool? allowEmpty = null, string allowEmptyTypeHint = null, string allowHosts = null, string allowHostsTypeHint = null, string allowHostsRegexp = null, string allowHostsRegexpTypeHint = null, string filterMethods = null, string filterMethodsTypeHint = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheSlingReferrerFilterExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var allowEmpty = true;  // bool? |  (optional) 
            var allowEmptyTypeHint = allowEmptyTypeHint_example;  // string |  (optional) 
            var allowHosts = allowHosts_example;  // string |  (optional) 
            var allowHostsTypeHint = allowHostsTypeHint_example;  // string |  (optional) 
            var allowHostsRegexp = allowHostsRegexp_example;  // string |  (optional) 
            var allowHostsRegexpTypeHint = allowHostsRegexpTypeHint_example;  // string |  (optional) 
            var filterMethods = filterMethods_example;  // string |  (optional) 
            var filterMethodsTypeHint = filterMethodsTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheSlingReferrerFilter: " + e.Message );
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
 **allowEmpty** | **bool?**|  | [optional] 
 **allowEmptyTypeHint** | **string**|  | [optional] 
 **allowHosts** | **string**|  | [optional] 
 **allowHostsTypeHint** | **string**|  | [optional] 
 **allowHostsRegexp** | **string**|  | [optional] 
 **allowHostsRegexpTypeHint** | **string**|  | [optional] 
 **filterMethods** | **string**|  | [optional] 
 **filterMethodsTypeHint** | **string**|  | [optional] 

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


## PostConfigProperty

> void PostConfigProperty (string configNodeName)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigPropertyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var configNodeName = configNodeName_example;  // string | 

            try
            {
                apiInstance.PostConfigProperty(configNodeName);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigProperty: " + e.Message );
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
 **configNodeName** | **string**|  | 

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


## PostNode

> void PostNode (string path, string name, string operation = null, string deleteAuthorizable = null, System.IO.Stream file = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostNodeExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var path = path_example;  // string | 
            var name = name_example;  // string | 
            var operation = operation_example;  // string |  (optional) 
            var deleteAuthorizable = deleteAuthorizable_example;  // string |  (optional) 
            var file = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 

            try
            {
                apiInstance.PostNode(path, name, operation, deleteAuthorizable, file);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostNode: " + e.Message );
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
 **path** | **string**|  | 
 **name** | **string**|  | 
 **operation** | **string**|  | [optional] 
 **deleteAuthorizable** | **string**|  | [optional] 
 **file** | **System.IO.Stream**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostNodeRw

> void PostNodeRw (string path, string name, string addMembers = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostNodeRwExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var path = path_example;  // string | 
            var name = name_example;  // string | 
            var addMembers = addMembers_example;  // string |  (optional) 

            try
            {
                apiInstance.PostNodeRw(path, name, addMembers);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostNodeRw: " + e.Message );
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
 **path** | **string**|  | 
 **name** | **string**|  | 
 **addMembers** | **string**|  | [optional] 

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


## PostPath

> void PostPath (string path, string jcrprimaryType, string name)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostPathExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var path = path_example;  // string | 
            var jcrprimaryType = jcrprimaryType_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.PostPath(path, jcrprimaryType, name);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostPath: " + e.Message );
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
 **path** | **string**|  | 
 **jcrprimaryType** | **string**|  | 
 **name** | **string**|  | 

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


## PostQuery

> string PostQuery (string path, decimal pLimit, string _1property, string _1propertyValue)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostQueryExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var path = path_example;  // string | 
            var pLimit = 8.14;  // decimal | 
            var _1property = _1property_example;  // string | 
            var _1propertyValue = _1propertyValue_example;  // string | 

            try
            {
                string result = apiInstance.PostQuery(path, pLimit, _1property, _1propertyValue);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostQuery: " + e.Message );
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
 **path** | **string**|  | 
 **pLimit** | **decimal**|  | 
 **_1property** | **string**|  | 
 **_1propertyValue** | **string**|  | 

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


## PostTreeActivation

> void PostTreeActivation (bool ignoredeactivated, bool onlymodified, string path)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostTreeActivationExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var ignoredeactivated = true;  // bool | 
            var onlymodified = true;  // bool | 
            var path = path_example;  // string | 

            try
            {
                apiInstance.PostTreeActivation(ignoredeactivated, onlymodified, path);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostTreeActivation: " + e.Message );
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
 **ignoredeactivated** | **bool**|  | 
 **onlymodified** | **bool**|  | 
 **path** | **string**|  | 

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


## PostTruststore

> string PostTruststore (string operation = null, string newPassword = null, string rePassword = null, string keyStoreType = null, string removeAlias = null, System.IO.Stream certificate = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostTruststoreExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var operation = operation_example;  // string |  (optional) 
            var newPassword = newPassword_example;  // string |  (optional) 
            var rePassword = rePassword_example;  // string |  (optional) 
            var keyStoreType = keyStoreType_example;  // string |  (optional) 
            var removeAlias = removeAlias_example;  // string |  (optional) 
            var certificate = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 

            try
            {
                string result = apiInstance.PostTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostTruststore: " + e.Message );
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
 **operation** | **string**|  | [optional] 
 **newPassword** | **string**|  | [optional] 
 **rePassword** | **string**|  | [optional] 
 **keyStoreType** | **string**|  | [optional] 
 **removeAlias** | **string**|  | [optional] 
 **certificate** | **System.IO.Stream**|  | [optional] 

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


## PostTruststorePKCS12

> string PostTruststorePKCS12 (System.IO.Stream truststoreP12 = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostTruststorePKCS12Example
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi(Configuration.Default);
            var truststoreP12 = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 

            try
            {
                string result = apiInstance.PostTruststorePKCS12(truststoreP12);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling SlingApi.PostTruststorePKCS12: " + e.Message );
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
 **truststoreP12** | **System.IO.Stream**|  | [optional] 

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

