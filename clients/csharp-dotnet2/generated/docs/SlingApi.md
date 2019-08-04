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
[**PostNode**](SlingApi.md#postnode) | **POST** /{path}/{name} | 
[**PostNodeRw**](SlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html | 
[**PostPath**](SlingApi.md#postpath) | **POST** /{path}/ | 
[**PostQuery**](SlingApi.md#postquery) | **POST** /bin/querybuilder.json | 
[**PostTreeActivation**](SlingApi.md#posttreeactivation) | **POST** /etc/replication/treeactivation.html | 
[**PostTruststore**](SlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](SlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore | 


<a name="deleteagent"></a>
# **DeleteAgent**
> void DeleteAgent (string runmode, string name)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteAgentExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var runmode = runmode_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.DeleteAgent(runmode, name);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.DeleteAgent: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletenode"></a>
# **DeleteNode**
> void DeleteNode (string path, string name)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteNodeExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var path = path_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.DeleteNode(path, name);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.DeleteNode: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getagent"></a>
# **GetAgent**
> void GetAgent (string runmode, string name)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAgentExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var runmode = runmode_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.GetAgent(runmode, name);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetAgent: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getagents"></a>
# **GetAgents**
> string GetAgents (string runmode)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAgentsExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var runmode = runmode_example;  // string | 

            try
            {
                string result = apiInstance.GetAgents(runmode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetAgents: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getauthorizablekeystore"></a>
# **GetAuthorizableKeystore**
> KeystoreInfo GetAuthorizableKeystore (string intermediatePath, string authorizableId)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAuthorizableKeystoreExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var intermediatePath = intermediatePath_example;  // string | 
            var authorizableId = authorizableId_example;  // string | 

            try
            {
                KeystoreInfo result = apiInstance.GetAuthorizableKeystore(intermediatePath, authorizableId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetAuthorizableKeystore: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getkeystore"></a>
# **GetKeystore**
> System.IO.Stream GetKeystore (string intermediatePath, string authorizableId)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetKeystoreExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var intermediatePath = intermediatePath_example;  // string | 
            var authorizableId = authorizableId_example;  // string | 

            try
            {
                System.IO.Stream result = apiInstance.GetKeystore(intermediatePath, authorizableId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetKeystore: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getnode"></a>
# **GetNode**
> void GetNode (string path, string name)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetNodeExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var path = path_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.GetNode(path, name);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetNode: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpackage"></a>
# **GetPackage**
> System.IO.Stream GetPackage (string group, string name, string version)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPackageExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var group = group_example;  // string | 
            var name = name_example;  // string | 
            var version = version_example;  // string | 

            try
            {
                System.IO.Stream result = apiInstance.GetPackage(group, name, version);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetPackage: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpackagefilter"></a>
# **GetPackageFilter**
> string GetPackageFilter (string group, string name, string version)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPackageFilterExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var group = group_example;  // string | 
            var name = name_example;  // string | 
            var version = version_example;  // string | 

            try
            {
                string result = apiInstance.GetPackageFilter(group, name, version);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetPackageFilter: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getquery"></a>
# **GetQuery**
> string GetQuery (string path, decimal? pLimit, string _1property, string _1propertyValue)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetQueryExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var path = path_example;  // string | 
            var pLimit = 1.2;  // decimal? | 
            var _1property = _1property_example;  // string | 
            var _1propertyValue = _1propertyValue_example;  // string | 

            try
            {
                string result = apiInstance.GetQuery(path, pLimit, _1property, _1propertyValue);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetQuery: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **pLimit** | **decimal?**|  | 
 **_1property** | **string**|  | 
 **_1propertyValue** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettruststore"></a>
# **GetTruststore**
> System.IO.Stream GetTruststore ()



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetTruststoreExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();

            try
            {
                System.IO.Stream result = apiInstance.GetTruststore();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetTruststore: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettruststoreinfo"></a>
# **GetTruststoreInfo**
> TruststoreInfo GetTruststoreInfo ()



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetTruststoreInfoExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();

            try
            {
                TruststoreInfo result = apiInstance.GetTruststoreInfo();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.GetTruststoreInfo: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postagent"></a>
# **PostAgent**
> void PostAgent (string runmode, string name, bool? jcrcontentcqdistribute, string jcrcontentcqdistributeTypeHint, string jcrcontentcqname, string jcrcontentcqtemplate, bool? jcrcontentenabled, string jcrcontentjcrdescription, string jcrcontentjcrlastModified, string jcrcontentjcrlastModifiedBy, string jcrcontentjcrmixinTypes, string jcrcontentjcrtitle, string jcrcontentlogLevel, bool? jcrcontentnoStatusUpdate, bool? jcrcontentnoVersioning, decimal? jcrcontentprotocolConnectTimeout, bool? jcrcontentprotocolHTTPConnectionClosed, string jcrcontentprotocolHTTPExpired, List<string> jcrcontentprotocolHTTPHeaders, string jcrcontentprotocolHTTPHeadersTypeHint, string jcrcontentprotocolHTTPMethod, bool? jcrcontentprotocolHTTPSRelaxed, string jcrcontentprotocolInterface, decimal? jcrcontentprotocolSocketTimeout, string jcrcontentprotocolVersion, string jcrcontentproxyNTLMDomain, string jcrcontentproxyNTLMHost, string jcrcontentproxyHost, string jcrcontentproxyPassword, decimal? jcrcontentproxyPort, string jcrcontentproxyUser, decimal? jcrcontentqueueBatchMaxSize, string jcrcontentqueueBatchMode, decimal? jcrcontentqueueBatchWaitTime, string jcrcontentretryDelay, bool? jcrcontentreverseReplication, string jcrcontentserializationType, string jcrcontentslingresourceType, string jcrcontentssl, string jcrcontenttransportNTLMDomain, string jcrcontenttransportNTLMHost, string jcrcontenttransportPassword, string jcrcontenttransportUri, string jcrcontenttransportUser, bool? jcrcontenttriggerDistribute, bool? jcrcontenttriggerModified, bool? jcrcontenttriggerOnOffTime, bool? jcrcontenttriggerReceive, bool? jcrcontenttriggerSpecific, string jcrcontentuserId, string jcrprimaryType, string operation)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostAgentExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var runmode = runmode_example;  // string | 
            var name = name_example;  // string | 
            var jcrcontentcqdistribute = true;  // bool? |  (optional) 
            var jcrcontentcqdistributeTypeHint = jcrcontentcqdistributeTypeHint_example;  // string |  (optional) 
            var jcrcontentcqname = jcrcontentcqname_example;  // string |  (optional) 
            var jcrcontentcqtemplate = jcrcontentcqtemplate_example;  // string |  (optional) 
            var jcrcontentenabled = true;  // bool? |  (optional) 
            var jcrcontentjcrdescription = jcrcontentjcrdescription_example;  // string |  (optional) 
            var jcrcontentjcrlastModified = jcrcontentjcrlastModified_example;  // string |  (optional) 
            var jcrcontentjcrlastModifiedBy = jcrcontentjcrlastModifiedBy_example;  // string |  (optional) 
            var jcrcontentjcrmixinTypes = jcrcontentjcrmixinTypes_example;  // string |  (optional) 
            var jcrcontentjcrtitle = jcrcontentjcrtitle_example;  // string |  (optional) 
            var jcrcontentlogLevel = jcrcontentlogLevel_example;  // string |  (optional) 
            var jcrcontentnoStatusUpdate = true;  // bool? |  (optional) 
            var jcrcontentnoVersioning = true;  // bool? |  (optional) 
            var jcrcontentprotocolConnectTimeout = 1.2;  // decimal? |  (optional) 
            var jcrcontentprotocolHTTPConnectionClosed = true;  // bool? |  (optional) 
            var jcrcontentprotocolHTTPExpired = jcrcontentprotocolHTTPExpired_example;  // string |  (optional) 
            var jcrcontentprotocolHTTPHeaders = new List<string>(); // List<string> |  (optional) 
            var jcrcontentprotocolHTTPHeadersTypeHint = jcrcontentprotocolHTTPHeadersTypeHint_example;  // string |  (optional) 
            var jcrcontentprotocolHTTPMethod = jcrcontentprotocolHTTPMethod_example;  // string |  (optional) 
            var jcrcontentprotocolHTTPSRelaxed = true;  // bool? |  (optional) 
            var jcrcontentprotocolInterface = jcrcontentprotocolInterface_example;  // string |  (optional) 
            var jcrcontentprotocolSocketTimeout = 1.2;  // decimal? |  (optional) 
            var jcrcontentprotocolVersion = jcrcontentprotocolVersion_example;  // string |  (optional) 
            var jcrcontentproxyNTLMDomain = jcrcontentproxyNTLMDomain_example;  // string |  (optional) 
            var jcrcontentproxyNTLMHost = jcrcontentproxyNTLMHost_example;  // string |  (optional) 
            var jcrcontentproxyHost = jcrcontentproxyHost_example;  // string |  (optional) 
            var jcrcontentproxyPassword = jcrcontentproxyPassword_example;  // string |  (optional) 
            var jcrcontentproxyPort = 1.2;  // decimal? |  (optional) 
            var jcrcontentproxyUser = jcrcontentproxyUser_example;  // string |  (optional) 
            var jcrcontentqueueBatchMaxSize = 1.2;  // decimal? |  (optional) 
            var jcrcontentqueueBatchMode = jcrcontentqueueBatchMode_example;  // string |  (optional) 
            var jcrcontentqueueBatchWaitTime = 1.2;  // decimal? |  (optional) 
            var jcrcontentretryDelay = jcrcontentretryDelay_example;  // string |  (optional) 
            var jcrcontentreverseReplication = true;  // bool? |  (optional) 
            var jcrcontentserializationType = jcrcontentserializationType_example;  // string |  (optional) 
            var jcrcontentslingresourceType = jcrcontentslingresourceType_example;  // string |  (optional) 
            var jcrcontentssl = jcrcontentssl_example;  // string |  (optional) 
            var jcrcontenttransportNTLMDomain = jcrcontenttransportNTLMDomain_example;  // string |  (optional) 
            var jcrcontenttransportNTLMHost = jcrcontenttransportNTLMHost_example;  // string |  (optional) 
            var jcrcontenttransportPassword = jcrcontenttransportPassword_example;  // string |  (optional) 
            var jcrcontenttransportUri = jcrcontenttransportUri_example;  // string |  (optional) 
            var jcrcontenttransportUser = jcrcontenttransportUser_example;  // string |  (optional) 
            var jcrcontenttriggerDistribute = true;  // bool? |  (optional) 
            var jcrcontenttriggerModified = true;  // bool? |  (optional) 
            var jcrcontenttriggerOnOffTime = true;  // bool? |  (optional) 
            var jcrcontenttriggerReceive = true;  // bool? |  (optional) 
            var jcrcontenttriggerSpecific = true;  // bool? |  (optional) 
            var jcrcontentuserId = jcrcontentuserId_example;  // string |  (optional) 
            var jcrprimaryType = jcrprimaryType_example;  // string |  (optional) 
            var operation = operation_example;  // string |  (optional) 

            try
            {
                apiInstance.PostAgent(runmode, name, jcrcontentcqdistribute, jcrcontentcqdistributeTypeHint, jcrcontentcqname, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentjcrdescription, jcrcontentjcrlastModified, jcrcontentjcrlastModifiedBy, jcrcontentjcrmixinTypes, jcrcontentjcrtitle, jcrcontentlogLevel, jcrcontentnoStatusUpdate, jcrcontentnoVersioning, jcrcontentprotocolConnectTimeout, jcrcontentprotocolHTTPConnectionClosed, jcrcontentprotocolHTTPExpired, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentprotocolHTTPSRelaxed, jcrcontentprotocolInterface, jcrcontentprotocolSocketTimeout, jcrcontentprotocolVersion, jcrcontentproxyNTLMDomain, jcrcontentproxyNTLMHost, jcrcontentproxyHost, jcrcontentproxyPassword, jcrcontentproxyPort, jcrcontentproxyUser, jcrcontentqueueBatchMaxSize, jcrcontentqueueBatchMode, jcrcontentqueueBatchWaitTime, jcrcontentretryDelay, jcrcontentreverseReplication, jcrcontentserializationType, jcrcontentslingresourceType, jcrcontentssl, jcrcontenttransportNTLMDomain, jcrcontenttransportNTLMHost, jcrcontenttransportPassword, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttriggerDistribute, jcrcontenttriggerModified, jcrcontenttriggerOnOffTime, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentuserId, jcrprimaryType, operation);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostAgent: " + e.Message );
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
 **jcrcontentcqdistribute** | **bool?**|  | [optional] 
 **jcrcontentcqdistributeTypeHint** | **string**|  | [optional] 
 **jcrcontentcqname** | **string**|  | [optional] 
 **jcrcontentcqtemplate** | **string**|  | [optional] 
 **jcrcontentenabled** | **bool?**|  | [optional] 
 **jcrcontentjcrdescription** | **string**|  | [optional] 
 **jcrcontentjcrlastModified** | **string**|  | [optional] 
 **jcrcontentjcrlastModifiedBy** | **string**|  | [optional] 
 **jcrcontentjcrmixinTypes** | **string**|  | [optional] 
 **jcrcontentjcrtitle** | **string**|  | [optional] 
 **jcrcontentlogLevel** | **string**|  | [optional] 
 **jcrcontentnoStatusUpdate** | **bool?**|  | [optional] 
 **jcrcontentnoVersioning** | **bool?**|  | [optional] 
 **jcrcontentprotocolConnectTimeout** | **decimal?**|  | [optional] 
 **jcrcontentprotocolHTTPConnectionClosed** | **bool?**|  | [optional] 
 **jcrcontentprotocolHTTPExpired** | **string**|  | [optional] 
 **jcrcontentprotocolHTTPHeaders** | [**List<string>**](string.md)|  | [optional] 
 **jcrcontentprotocolHTTPHeadersTypeHint** | **string**|  | [optional] 
 **jcrcontentprotocolHTTPMethod** | **string**|  | [optional] 
 **jcrcontentprotocolHTTPSRelaxed** | **bool?**|  | [optional] 
 **jcrcontentprotocolInterface** | **string**|  | [optional] 
 **jcrcontentprotocolSocketTimeout** | **decimal?**|  | [optional] 
 **jcrcontentprotocolVersion** | **string**|  | [optional] 
 **jcrcontentproxyNTLMDomain** | **string**|  | [optional] 
 **jcrcontentproxyNTLMHost** | **string**|  | [optional] 
 **jcrcontentproxyHost** | **string**|  | [optional] 
 **jcrcontentproxyPassword** | **string**|  | [optional] 
 **jcrcontentproxyPort** | **decimal?**|  | [optional] 
 **jcrcontentproxyUser** | **string**|  | [optional] 
 **jcrcontentqueueBatchMaxSize** | **decimal?**|  | [optional] 
 **jcrcontentqueueBatchMode** | **string**|  | [optional] 
 **jcrcontentqueueBatchWaitTime** | **decimal?**|  | [optional] 
 **jcrcontentretryDelay** | **string**|  | [optional] 
 **jcrcontentreverseReplication** | **bool?**|  | [optional] 
 **jcrcontentserializationType** | **string**|  | [optional] 
 **jcrcontentslingresourceType** | **string**|  | [optional] 
 **jcrcontentssl** | **string**|  | [optional] 
 **jcrcontenttransportNTLMDomain** | **string**|  | [optional] 
 **jcrcontenttransportNTLMHost** | **string**|  | [optional] 
 **jcrcontenttransportPassword** | **string**|  | [optional] 
 **jcrcontenttransportUri** | **string**|  | [optional] 
 **jcrcontenttransportUser** | **string**|  | [optional] 
 **jcrcontenttriggerDistribute** | **bool?**|  | [optional] 
 **jcrcontenttriggerModified** | **bool?**|  | [optional] 
 **jcrcontenttriggerOnOffTime** | **bool?**|  | [optional] 
 **jcrcontenttriggerReceive** | **bool?**|  | [optional] 
 **jcrcontenttriggerSpecific** | **bool?**|  | [optional] 
 **jcrcontentuserId** | **string**|  | [optional] 
 **jcrprimaryType** | **string**|  | [optional] 
 **operation** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postauthorizablekeystore"></a>
# **PostAuthorizableKeystore**
> KeystoreInfo PostAuthorizableKeystore (string intermediatePath, string authorizableId, string operation, string currentPassword, string newPassword, string rePassword, string keyPassword, string keyStorePass, string alias, string newAlias, string removeAlias, System.IO.Stream certChain, System.IO.Stream pk, System.IO.Stream keyStore)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostAuthorizableKeystoreExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
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
            var certChain = new System.IO.Stream(); // System.IO.Stream |  (optional) 
            var pk = new System.IO.Stream(); // System.IO.Stream |  (optional) 
            var keyStore = new System.IO.Stream(); // System.IO.Stream |  (optional) 

            try
            {
                KeystoreInfo result = apiInstance.PostAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostAuthorizableKeystore: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postauthorizables"></a>
# **PostAuthorizables**
> string PostAuthorizables (string authorizableId, string intermediatePath, string createUser, string createGroup, string reppassword, string profilegivenName)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostAuthorizablesExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var authorizableId = authorizableId_example;  // string | 
            var intermediatePath = intermediatePath_example;  // string | 
            var createUser = createUser_example;  // string |  (optional) 
            var createGroup = createGroup_example;  // string |  (optional) 
            var reppassword = reppassword_example;  // string |  (optional) 
            var profilegivenName = profilegivenName_example;  // string |  (optional) 

            try
            {
                string result = apiInstance.PostAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profilegivenName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostAuthorizables: " + e.Message );
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
 **profilegivenName** | **string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigadobegranitesamlauthenticationhandler"></a>
# **PostConfigAdobeGraniteSamlAuthenticationHandler**
> void PostConfigAdobeGraniteSamlAuthenticationHandler (string keyStorePassword, string keyStorePasswordTypeHint, int? serviceRanking, string serviceRankingTypeHint, bool? idpHttpRedirect, string idpHttpRedirectTypeHint, bool? createUser, string createUserTypeHint, string defaultRedirectUrl, string defaultRedirectUrlTypeHint, string userIDAttribute, string userIDAttributeTypeHint, List<string> defaultGroups, string defaultGroupsTypeHint, string idpCertAlias, string idpCertAliasTypeHint, bool? addGroupMemberships, string addGroupMembershipsTypeHint, List<string> path, string pathTypeHint, List<string> synchronizeAttributes, string synchronizeAttributesTypeHint, int? clockTolerance, string clockToleranceTypeHint, string groupMembershipAttribute, string groupMembershipAttributeTypeHint, string idpUrl, string idpUrlTypeHint, string logoutUrl, string logoutUrlTypeHint, string serviceProviderEntityId, string serviceProviderEntityIdTypeHint, string assertionConsumerServiceURL, string assertionConsumerServiceURLTypeHint, bool? handleLogout, string handleLogoutTypeHint, string spPrivateKeyAlias, string spPrivateKeyAliasTypeHint, bool? useEncryption, string useEncryptionTypeHint, string nameIdFormat, string nameIdFormatTypeHint, string digestMethod, string digestMethodTypeHint, string signatureMethod, string signatureMethodTypeHint, string userIntermediatePath, string userIntermediatePathTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigAdobeGraniteSamlAuthenticationHandlerExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
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
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigAdobeGraniteSamlAuthenticationHandler: " + e.Message );
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
 **defaultGroups** | [**List<string>**](string.md)|  | [optional] 
 **defaultGroupsTypeHint** | **string**|  | [optional] 
 **idpCertAlias** | **string**|  | [optional] 
 **idpCertAliasTypeHint** | **string**|  | [optional] 
 **addGroupMemberships** | **bool?**|  | [optional] 
 **addGroupMembershipsTypeHint** | **string**|  | [optional] 
 **path** | [**List<string>**](string.md)|  | [optional] 
 **pathTypeHint** | **string**|  | [optional] 
 **synchronizeAttributes** | [**List<string>**](string.md)|  | [optional] 
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigapachefelixjettybasedhttpservice"></a>
# **PostConfigApacheFelixJettyBasedHttpService**
> void PostConfigApacheFelixJettyBasedHttpService (bool? orgApacheFelixHttpsNio, string orgApacheFelixHttpsNioTypeHint, string orgApacheFelixHttpsKeystore, string orgApacheFelixHttpsKeystoreTypeHint, string orgApacheFelixHttpsKeystorePassword, string orgApacheFelixHttpsKeystorePasswordTypeHint, string orgApacheFelixHttpsKeystoreKey, string orgApacheFelixHttpsKeystoreKeyTypeHint, string orgApacheFelixHttpsKeystoreKeyPassword, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, string orgApacheFelixHttpsTruststore, string orgApacheFelixHttpsTruststoreTypeHint, string orgApacheFelixHttpsTruststorePassword, string orgApacheFelixHttpsTruststorePasswordTypeHint, string orgApacheFelixHttpsClientcertificate, string orgApacheFelixHttpsClientcertificateTypeHint, bool? orgApacheFelixHttpsEnable, string orgApacheFelixHttpsEnableTypeHint, string orgOsgiServiceHttpPortSecure, string orgOsgiServiceHttpPortSecureTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheFelixJettyBasedHttpServiceExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
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
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheFelixJettyBasedHttpService: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigapachehttpcomponentsproxyconfiguration"></a>
# **PostConfigApacheHttpComponentsProxyConfiguration**
> void PostConfigApacheHttpComponentsProxyConfiguration (string proxyHost, string proxyHostTypeHint, int? proxyPort, string proxyPortTypeHint, List<string> proxyExceptions, string proxyExceptionsTypeHint, bool? proxyEnabled, string proxyEnabledTypeHint, string proxyUser, string proxyUserTypeHint, string proxyPassword, string proxyPasswordTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheHttpComponentsProxyConfigurationExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
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
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheHttpComponentsProxyConfiguration: " + e.Message );
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
 **proxyExceptions** | [**List<string>**](string.md)|  | [optional] 
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigapacheslingdavexservlet"></a>
# **PostConfigApacheSlingDavExServlet**
> void PostConfigApacheSlingDavExServlet (string alias, string aliasTypeHint, bool? davCreateAbsoluteUri, string davCreateAbsoluteUriTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheSlingDavExServletExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var alias = alias_example;  // string |  (optional) 
            var aliasTypeHint = aliasTypeHint_example;  // string |  (optional) 
            var davCreateAbsoluteUri = true;  // bool? |  (optional) 
            var davCreateAbsoluteUriTypeHint = davCreateAbsoluteUriTypeHint_example;  // string |  (optional) 

            try
            {
                apiInstance.PostConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheSlingDavExServlet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigapacheslinggetservlet"></a>
# **PostConfigApacheSlingGetServlet**
> void PostConfigApacheSlingGetServlet (string jsonMaximumresults, string jsonMaximumresultsTypeHint, bool? enableHtml, string enableHtmlTypeHint, bool? enableTxt, string enableTxtTypeHint, bool? enableXml, string enableXmlTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheSlingGetServletExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
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
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheSlingGetServlet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postconfigapacheslingreferrerfilter"></a>
# **PostConfigApacheSlingReferrerFilter**
> void PostConfigApacheSlingReferrerFilter (bool? allowEmpty, string allowEmptyTypeHint, string allowHosts, string allowHostsTypeHint, string allowHostsRegexp, string allowHostsRegexpTypeHint, string filterMethods, string filterMethodsTypeHint)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigApacheSlingReferrerFilterExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
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
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigApacheSlingReferrerFilter: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postnode"></a>
# **PostNode**
> void PostNode (string path, string name, string operation, string deleteAuthorizable, System.IO.Stream file)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostNodeExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var path = path_example;  // string | 
            var name = name_example;  // string | 
            var operation = operation_example;  // string |  (optional) 
            var deleteAuthorizable = deleteAuthorizable_example;  // string |  (optional) 
            var file = new System.IO.Stream(); // System.IO.Stream |  (optional) 

            try
            {
                apiInstance.PostNode(path, name, operation, deleteAuthorizable, file);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostNode: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postnoderw"></a>
# **PostNodeRw**
> void PostNodeRw (string path, string name, string addMembers)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostNodeRwExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var path = path_example;  // string | 
            var name = name_example;  // string | 
            var addMembers = addMembers_example;  // string |  (optional) 

            try
            {
                apiInstance.PostNodeRw(path, name, addMembers);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostNodeRw: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postpath"></a>
# **PostPath**
> void PostPath (string path, string jcrprimaryType, string name)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostPathExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var path = path_example;  // string | 
            var jcrprimaryType = jcrprimaryType_example;  // string | 
            var name = name_example;  // string | 

            try
            {
                apiInstance.PostPath(path, jcrprimaryType, name);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostPath: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postquery"></a>
# **PostQuery**
> string PostQuery (string path, decimal? pLimit, string _1property, string _1propertyValue)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostQueryExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var path = path_example;  // string | 
            var pLimit = 1.2;  // decimal? | 
            var _1property = _1property_example;  // string | 
            var _1propertyValue = _1propertyValue_example;  // string | 

            try
            {
                string result = apiInstance.PostQuery(path, pLimit, _1property, _1propertyValue);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostQuery: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **pLimit** | **decimal?**|  | 
 **_1property** | **string**|  | 
 **_1propertyValue** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="posttreeactivation"></a>
# **PostTreeActivation**
> void PostTreeActivation (bool? ignoredeactivated, bool? onlymodified, string path)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostTreeActivationExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var ignoredeactivated = true;  // bool? | 
            var onlymodified = true;  // bool? | 
            var path = path_example;  // string | 

            try
            {
                apiInstance.PostTreeActivation(ignoredeactivated, onlymodified, path);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostTreeActivation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **bool?**|  | 
 **onlymodified** | **bool?**|  | 
 **path** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="posttruststore"></a>
# **PostTruststore**
> string PostTruststore (string operation, string newPassword, string rePassword, string keyStoreType, string removeAlias, System.IO.Stream certificate)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostTruststoreExample
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var operation = operation_example;  // string |  (optional) 
            var newPassword = newPassword_example;  // string |  (optional) 
            var rePassword = rePassword_example;  // string |  (optional) 
            var keyStoreType = keyStoreType_example;  // string |  (optional) 
            var removeAlias = removeAlias_example;  // string |  (optional) 
            var certificate = new System.IO.Stream(); // System.IO.Stream |  (optional) 

            try
            {
                string result = apiInstance.PostTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostTruststore: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="posttruststorepkcs12"></a>
# **PostTruststorePKCS12**
> string PostTruststorePKCS12 (System.IO.Stream truststoreP12)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostTruststorePKCS12Example
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var truststoreP12 = new System.IO.Stream(); // System.IO.Stream |  (optional) 

            try
            {
                string result = apiInstance.PostTruststorePKCS12(truststoreP12);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostTruststorePKCS12: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

