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
            var pLimit = 8.14;  // decimal? | 
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
> void PostAgent (string runmode, string name, bool? jcrcontentCqdistribute, string jcrcontentCqdistributeTypeHint, string jcrcontentCqname, string jcrcontentCqtemplate, bool? jcrcontentEnabled, string jcrcontentJcrdescription, string jcrcontentJcrlastModified, string jcrcontentJcrlastModifiedBy, string jcrcontentJcrmixinTypes, string jcrcontentJcrtitle, string jcrcontentLogLevel, bool? jcrcontentNoStatusUpdate, bool? jcrcontentNoVersioning, decimal? jcrcontentProtocolConnectTimeout, bool? jcrcontentProtocolHTTPConnectionClosed, string jcrcontentProtocolHTTPExpired, List<string> jcrcontentProtocolHTTPHeaders, string jcrcontentProtocolHTTPHeadersTypeHint, string jcrcontentProtocolHTTPMethod, bool? jcrcontentProtocolHTTPSRelaxed, string jcrcontentProtocolInterface, decimal? jcrcontentProtocolSocketTimeout, string jcrcontentProtocolVersion, string jcrcontentProxyNTLMDomain, string jcrcontentProxyNTLMHost, string jcrcontentProxyHost, string jcrcontentProxyPassword, decimal? jcrcontentProxyPort, string jcrcontentProxyUser, decimal? jcrcontentQueueBatchMaxSize, string jcrcontentQueueBatchMode, decimal? jcrcontentQueueBatchWaitTime, string jcrcontentRetryDelay, bool? jcrcontentReverseReplication, string jcrcontentSerializationType, string jcrcontentSlingresourceType, string jcrcontentSsl, string jcrcontentTransportNTLMDomain, string jcrcontentTransportNTLMHost, string jcrcontentTransportPassword, string jcrcontentTransportUri, string jcrcontentTransportUser, bool? jcrcontentTriggerDistribute, bool? jcrcontentTriggerModified, bool? jcrcontentTriggerOnOffTime, bool? jcrcontentTriggerReceive, bool? jcrcontentTriggerSpecific, string jcrcontentUserId, string jcrprimaryType, string operation)



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
 **jcrcontentProtocolHTTPHeaders** | [**List<string>**](string.md)|  | [optional] 
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
> string PostAuthorizables (string authorizableId, string intermediatePath, string createUser, string createGroup, string reppassword, string profileGivenName)



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
            var profileGivenName = profileGivenName_example;  // string |  (optional) 

            try
            {
                string result = apiInstance.PostAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profileGivenName);
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
 **profileGivenName** | **string**|  | [optional] 

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

<a name="postconfigproperty"></a>
# **PostConfigProperty**
> void PostConfigProperty (string configNodeName)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PostConfigPropertyExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SlingApi();
            var configNodeName = configNodeName_example;  // string | 

            try
            {
                apiInstance.PostConfigProperty(configNodeName);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SlingApi.PostConfigProperty: " + e.Message );
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
            var pLimit = 8.14;  // decimal? | 
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

