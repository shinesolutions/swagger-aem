# SlingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} |  |
| [**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} |  |
| [**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} |  |
| [**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json |  |
| [**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json |  |
| [**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 |  |
| [**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} |  |
| [**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip |  |
| [**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json |  |
| [**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json |  |
| [**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 |  |
| [**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json |  |
| [**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} |  |
| [**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html |  |
| [**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables |  |
| [**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config |  |
| [**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http |  |
| [**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config |  |
| [**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet |  |
| [**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet |  |
| [**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter |  |
| [**postConfigProperty**](SlingApi.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} |  |
| [**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} |  |
| [**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html |  |
| [**postPath**](SlingApi.md#postPath) | **POST** /{path}/ |  |
| [**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json |  |
| [**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /libs/replication/treeactivation.html |  |
| [**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore |  |
| [**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore |  |



## deleteAgent

> void deleteAgent(runmode, name)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String runmode = "runmode_example"; // String | 
        String name = "name_example"; // String | 
        try {
            void result = apiInstance.deleteAgent(runmode, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#deleteAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## deleteNode

> void deleteNode(path, name)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String path = "path_example"; // String | 
        String name = "name_example"; // String | 
        try {
            void result = apiInstance.deleteNode(path, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#deleteNode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getAgent

> void getAgent(runmode, name)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String runmode = "runmode_example"; // String | 
        String name = "name_example"; // String | 
        try {
            void result = apiInstance.getAgent(runmode, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getAgents

> String getAgents(runmode)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String runmode = "runmode_example"; // String | 
        try {
            String result = apiInstance.getAgents(runmode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getAgents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getAuthorizableKeystore

> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String intermediatePath = "intermediatePath_example"; // String | 
        String authorizableId = "authorizableId_example"; // String | 
        try {
            KeystoreInfo result = apiInstance.getAuthorizableKeystore(intermediatePath, authorizableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getAuthorizableKeystore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | |
| **authorizableId** | **String**|  | |

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
| **200** | Default response |  -  |


## getKeystore

> File getKeystore(intermediatePath, authorizableId)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String intermediatePath = "intermediatePath_example"; // String | 
        String authorizableId = "authorizableId_example"; // String | 
        try {
            File result = apiInstance.getKeystore(intermediatePath, authorizableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getKeystore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | |
| **authorizableId** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getNode

> void getNode(path, name)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String path = "path_example"; // String | 
        String name = "name_example"; // String | 
        try {
            void result = apiInstance.getNode(path, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getNode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getPackage

> File getPackage(group, name, version)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String group = "group_example"; // String | 
        String name = "name_example"; // String | 
        String version = "version_example"; // String | 
        try {
            File result = apiInstance.getPackage(group, name, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getPackage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | **String**|  | |
| **name** | **String**|  | |
| **version** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getPackageFilter

> String getPackageFilter(group, name, version)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String group = "group_example"; // String | 
        String name = "name_example"; // String | 
        String version = "version_example"; // String | 
        try {
            String result = apiInstance.getPackageFilter(group, name, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getPackageFilter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | **String**|  | |
| **name** | **String**|  | |
| **version** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getQuery

> String getQuery(path, pLimit, _1property, _1propertyValue)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String path = "path_example"; // String | 
        BigDecimal pLimit = new BigDecimal(78); // BigDecimal | 
        String _1property = "_1property_example"; // String | 
        String _1propertyValue = "_1propertyValue_example"; // String | 
        try {
            String result = apiInstance.getQuery(path, pLimit, _1property, _1propertyValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getQuery");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **pLimit** | **BigDecimal**|  | |
| **_1property** | **String**|  | |
| **_1propertyValue** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getTruststore

> File getTruststore()



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        try {
            File result = apiInstance.getTruststore();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getTruststore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getTruststoreInfo

> TruststoreInfo getTruststoreInfo()



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        try {
            TruststoreInfo result = apiInstance.getTruststoreInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#getTruststoreInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
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
| **200** | Default response |  -  |


## postAgent

> void postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String runmode = "runmode_example"; // String | 
        String name = "name_example"; // String | 
        Boolean jcrContentCqDistribute = true; // Boolean | 
        String jcrContentCqDistributeAtTypeHint = "jcrContentCqDistributeAtTypeHint_example"; // String | 
        String jcrContentCqName = "jcrContentCqName_example"; // String | 
        String jcrContentCqTemplate = "jcrContentCqTemplate_example"; // String | 
        Boolean jcrContentAliasUpdate = true; // Boolean | 
        Boolean jcrContentEnabled = true; // Boolean | 
        String jcrContentJcrDescription = "jcrContentJcrDescription_example"; // String | 
        String jcrContentJcrLastModified = "jcrContentJcrLastModified_example"; // String | 
        String jcrContentJcrLastModifiedBy = "jcrContentJcrLastModifiedBy_example"; // String | 
        String jcrContentJcrMixinTypes = "jcrContentJcrMixinTypes_example"; // String | 
        String jcrContentJcrTitle = "jcrContentJcrTitle_example"; // String | 
        String jcrContentLogLevel = "jcrContentLogLevel_example"; // String | 
        Boolean jcrContentNoStatusUpdate = true; // Boolean | 
        Boolean jcrContentNoVersioning = true; // Boolean | 
        BigDecimal jcrContentProtocolConnectTimeout = new BigDecimal(78); // BigDecimal | 
        Boolean jcrContentProtocolHTTPConnectionClosed = true; // Boolean | 
        String jcrContentProtocolHTTPExpired = "jcrContentProtocolHTTPExpired_example"; // String | 
        List<String> jcrContentProtocolHTTPHeaders = Arrays.asList(); // List<String> | 
        String jcrContentProtocolHTTPHeadersAtTypeHint = "jcrContentProtocolHTTPHeadersAtTypeHint_example"; // String | 
        String jcrContentProtocolHTTPMethod = "jcrContentProtocolHTTPMethod_example"; // String | 
        Boolean jcrContentProtocolHTTPSRelaxed = true; // Boolean | 
        String jcrContentProtocolInterface = "jcrContentProtocolInterface_example"; // String | 
        BigDecimal jcrContentProtocolSocketTimeout = new BigDecimal(78); // BigDecimal | 
        String jcrContentProtocolVersion = "jcrContentProtocolVersion_example"; // String | 
        String jcrContentProxyNTLMDomain = "jcrContentProxyNTLMDomain_example"; // String | 
        String jcrContentProxyNTLMHost = "jcrContentProxyNTLMHost_example"; // String | 
        String jcrContentProxyHost = "jcrContentProxyHost_example"; // String | 
        String jcrContentProxyPassword = "jcrContentProxyPassword_example"; // String | 
        BigDecimal jcrContentProxyPort = new BigDecimal(78); // BigDecimal | 
        String jcrContentProxyUser = "jcrContentProxyUser_example"; // String | 
        BigDecimal jcrContentQueueBatchMaxSize = new BigDecimal(78); // BigDecimal | 
        String jcrContentQueueBatchMode = "jcrContentQueueBatchMode_example"; // String | 
        BigDecimal jcrContentQueueBatchWaitTime = new BigDecimal(78); // BigDecimal | 
        String jcrContentRetryDelay = "jcrContentRetryDelay_example"; // String | 
        Boolean jcrContentReverseReplication = true; // Boolean | 
        String jcrContentSerializationType = "jcrContentSerializationType_example"; // String | 
        String jcrContentSlingResourceType = "jcrContentSlingResourceType_example"; // String | 
        String jcrContentSsl = "jcrContentSsl_example"; // String | 
        String jcrContentTransportNTLMDomain = "jcrContentTransportNTLMDomain_example"; // String | 
        String jcrContentTransportNTLMHost = "jcrContentTransportNTLMHost_example"; // String | 
        String jcrContentTransportPassword = "jcrContentTransportPassword_example"; // String | 
        String jcrContentTransportUri = "jcrContentTransportUri_example"; // String | 
        String jcrContentTransportUser = "jcrContentTransportUser_example"; // String | 
        Boolean jcrContentTriggerDistribute = true; // Boolean | 
        Boolean jcrContentTriggerModified = true; // Boolean | 
        Boolean jcrContentTriggerOnOffTime = true; // Boolean | 
        Boolean jcrContentTriggerReceive = true; // Boolean | 
        Boolean jcrContentTriggerSpecific = true; // Boolean | 
        String jcrContentUserId = "jcrContentUserId_example"; // String | 
        String jcrPrimaryType = "jcrPrimaryType_example"; // String | 
        String operation = "operation_example"; // String | 
        try {
            void result = apiInstance.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |
| **name** | **String**|  | |
| **jcrContentCqDistribute** | **Boolean**|  | [optional] |
| **jcrContentCqDistributeAtTypeHint** | **String**|  | [optional] |
| **jcrContentCqName** | **String**|  | [optional] |
| **jcrContentCqTemplate** | **String**|  | [optional] |
| **jcrContentAliasUpdate** | **Boolean**|  | [optional] |
| **jcrContentEnabled** | **Boolean**|  | [optional] |
| **jcrContentJcrDescription** | **String**|  | [optional] |
| **jcrContentJcrLastModified** | **String**|  | [optional] |
| **jcrContentJcrLastModifiedBy** | **String**|  | [optional] |
| **jcrContentJcrMixinTypes** | **String**|  | [optional] |
| **jcrContentJcrTitle** | **String**|  | [optional] |
| **jcrContentLogLevel** | **String**|  | [optional] |
| **jcrContentNoStatusUpdate** | **Boolean**|  | [optional] |
| **jcrContentNoVersioning** | **Boolean**|  | [optional] |
| **jcrContentProtocolConnectTimeout** | **BigDecimal**|  | [optional] |
| **jcrContentProtocolHTTPConnectionClosed** | **Boolean**|  | [optional] |
| **jcrContentProtocolHTTPExpired** | **String**|  | [optional] |
| **jcrContentProtocolHTTPHeaders** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **jcrContentProtocolHTTPHeadersAtTypeHint** | **String**|  | [optional] |
| **jcrContentProtocolHTTPMethod** | **String**|  | [optional] |
| **jcrContentProtocolHTTPSRelaxed** | **Boolean**|  | [optional] |
| **jcrContentProtocolInterface** | **String**|  | [optional] |
| **jcrContentProtocolSocketTimeout** | **BigDecimal**|  | [optional] |
| **jcrContentProtocolVersion** | **String**|  | [optional] |
| **jcrContentProxyNTLMDomain** | **String**|  | [optional] |
| **jcrContentProxyNTLMHost** | **String**|  | [optional] |
| **jcrContentProxyHost** | **String**|  | [optional] |
| **jcrContentProxyPassword** | **String**|  | [optional] |
| **jcrContentProxyPort** | **BigDecimal**|  | [optional] |
| **jcrContentProxyUser** | **String**|  | [optional] |
| **jcrContentQueueBatchMaxSize** | **BigDecimal**|  | [optional] |
| **jcrContentQueueBatchMode** | **String**|  | [optional] |
| **jcrContentQueueBatchWaitTime** | **BigDecimal**|  | [optional] |
| **jcrContentRetryDelay** | **String**|  | [optional] |
| **jcrContentReverseReplication** | **Boolean**|  | [optional] |
| **jcrContentSerializationType** | **String**|  | [optional] |
| **jcrContentSlingResourceType** | **String**|  | [optional] |
| **jcrContentSsl** | **String**|  | [optional] |
| **jcrContentTransportNTLMDomain** | **String**|  | [optional] |
| **jcrContentTransportNTLMHost** | **String**|  | [optional] |
| **jcrContentTransportPassword** | **String**|  | [optional] |
| **jcrContentTransportUri** | **String**|  | [optional] |
| **jcrContentTransportUser** | **String**|  | [optional] |
| **jcrContentTriggerDistribute** | **Boolean**|  | [optional] |
| **jcrContentTriggerModified** | **Boolean**|  | [optional] |
| **jcrContentTriggerOnOffTime** | **Boolean**|  | [optional] |
| **jcrContentTriggerReceive** | **Boolean**|  | [optional] |
| **jcrContentTriggerSpecific** | **Boolean**|  | [optional] |
| **jcrContentUserId** | **String**|  | [optional] |
| **jcrPrimaryType** | **String**|  | [optional] |
| **operation** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postAuthorizableKeystore

> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String intermediatePath = "intermediatePath_example"; // String | 
        String authorizableId = "authorizableId_example"; // String | 
        String operation = "operation_example"; // String | 
        String currentPassword = "currentPassword_example"; // String | 
        String newPassword = "newPassword_example"; // String | 
        String rePassword = "rePassword_example"; // String | 
        String keyPassword = "keyPassword_example"; // String | 
        String keyStorePass = "keyStorePass_example"; // String | 
        String alias = "alias_example"; // String | 
        String newAlias = "newAlias_example"; // String | 
        String removeAlias = "removeAlias_example"; // String | 
        File certChain = new File("/path/to/file"); // File | 
        File pk = new File("/path/to/file"); // File | 
        File keyStore = new File("/path/to/file"); // File | 
        try {
            KeystoreInfo result = apiInstance.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postAuthorizableKeystore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | |
| **authorizableId** | **String**|  | |
| **operation** | **String**|  | [optional] |
| **currentPassword** | **String**|  | [optional] |
| **newPassword** | **String**|  | [optional] |
| **rePassword** | **String**|  | [optional] |
| **keyPassword** | **String**|  | [optional] |
| **keyStorePass** | **String**|  | [optional] |
| **alias** | **String**|  | [optional] |
| **newAlias** | **String**|  | [optional] |
| **removeAlias** | **String**|  | [optional] |
| **certChain** | **File**|  | [optional] |
| **pk** | **File**|  | [optional] |
| **keyStore** | **File**|  | [optional] |

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
| **200** | Default response |  -  |


## postAuthorizables

> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String authorizableId = "authorizableId_example"; // String | 
        String intermediatePath = "intermediatePath_example"; // String | 
        String createUser = "createUser_example"; // String | 
        String createGroup = "createGroup_example"; // String | 
        String repPassword = "repPassword_example"; // String | 
        String profileGivenName = "profileGivenName_example"; // String | 
        try {
            String result = apiInstance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postAuthorizables");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | **String**|  | |
| **intermediatePath** | **String**|  | |
| **createUser** | **String**|  | [optional] |
| **createGroup** | **String**|  | [optional] |
| **repPassword** | **String**|  | [optional] |
| **profileGivenName** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigAdobeGraniteSamlAuthenticationHandler

> void postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String keyStorePassword = "keyStorePassword_example"; // String | 
        String keyStorePasswordAtTypeHint = "keyStorePasswordAtTypeHint_example"; // String | 
        Integer serviceRanking = 56; // Integer | 
        String serviceRankingAtTypeHint = "serviceRankingAtTypeHint_example"; // String | 
        Boolean idpHttpRedirect = true; // Boolean | 
        String idpHttpRedirectAtTypeHint = "idpHttpRedirectAtTypeHint_example"; // String | 
        Boolean createUser = true; // Boolean | 
        String createUserAtTypeHint = "createUserAtTypeHint_example"; // String | 
        String defaultRedirectUrl = "defaultRedirectUrl_example"; // String | 
        String defaultRedirectUrlAtTypeHint = "defaultRedirectUrlAtTypeHint_example"; // String | 
        String userIDAttribute = "userIDAttribute_example"; // String | 
        String userIDAttributeAtTypeHint = "userIDAttributeAtTypeHint_example"; // String | 
        List<String> defaultGroups = Arrays.asList(); // List<String> | 
        String defaultGroupsAtTypeHint = "defaultGroupsAtTypeHint_example"; // String | 
        String idpCertAlias = "idpCertAlias_example"; // String | 
        String idpCertAliasAtTypeHint = "idpCertAliasAtTypeHint_example"; // String | 
        Boolean addGroupMemberships = true; // Boolean | 
        String addGroupMembershipsAtTypeHint = "addGroupMembershipsAtTypeHint_example"; // String | 
        List<String> path = Arrays.asList(); // List<String> | 
        String pathAtTypeHint = "pathAtTypeHint_example"; // String | 
        List<String> synchronizeAttributes = Arrays.asList(); // List<String> | 
        String synchronizeAttributesAtTypeHint = "synchronizeAttributesAtTypeHint_example"; // String | 
        Integer clockTolerance = 56; // Integer | 
        String clockToleranceAtTypeHint = "clockToleranceAtTypeHint_example"; // String | 
        String groupMembershipAttribute = "groupMembershipAttribute_example"; // String | 
        String groupMembershipAttributeAtTypeHint = "groupMembershipAttributeAtTypeHint_example"; // String | 
        String idpUrl = "idpUrl_example"; // String | 
        String idpUrlAtTypeHint = "idpUrlAtTypeHint_example"; // String | 
        String logoutUrl = "logoutUrl_example"; // String | 
        String logoutUrlAtTypeHint = "logoutUrlAtTypeHint_example"; // String | 
        String serviceProviderEntityId = "serviceProviderEntityId_example"; // String | 
        String serviceProviderEntityIdAtTypeHint = "serviceProviderEntityIdAtTypeHint_example"; // String | 
        String assertionConsumerServiceURL = "assertionConsumerServiceURL_example"; // String | 
        String assertionConsumerServiceURLAtTypeHint = "assertionConsumerServiceURLAtTypeHint_example"; // String | 
        Boolean handleLogout = true; // Boolean | 
        String handleLogoutAtTypeHint = "handleLogoutAtTypeHint_example"; // String | 
        String spPrivateKeyAlias = "spPrivateKeyAlias_example"; // String | 
        String spPrivateKeyAliasAtTypeHint = "spPrivateKeyAliasAtTypeHint_example"; // String | 
        Boolean useEncryption = true; // Boolean | 
        String useEncryptionAtTypeHint = "useEncryptionAtTypeHint_example"; // String | 
        String nameIdFormat = "nameIdFormat_example"; // String | 
        String nameIdFormatAtTypeHint = "nameIdFormatAtTypeHint_example"; // String | 
        String digestMethod = "digestMethod_example"; // String | 
        String digestMethodAtTypeHint = "digestMethodAtTypeHint_example"; // String | 
        String signatureMethod = "signatureMethod_example"; // String | 
        String signatureMethodAtTypeHint = "signatureMethodAtTypeHint_example"; // String | 
        String userIntermediatePath = "userIntermediatePath_example"; // String | 
        String userIntermediatePathAtTypeHint = "userIntermediatePathAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postConfigAdobeGraniteSamlAuthenticationHandler");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyStorePassword** | **String**|  | [optional] |
| **keyStorePasswordAtTypeHint** | **String**|  | [optional] |
| **serviceRanking** | **Integer**|  | [optional] |
| **serviceRankingAtTypeHint** | **String**|  | [optional] |
| **idpHttpRedirect** | **Boolean**|  | [optional] |
| **idpHttpRedirectAtTypeHint** | **String**|  | [optional] |
| **createUser** | **Boolean**|  | [optional] |
| **createUserAtTypeHint** | **String**|  | [optional] |
| **defaultRedirectUrl** | **String**|  | [optional] |
| **defaultRedirectUrlAtTypeHint** | **String**|  | [optional] |
| **userIDAttribute** | **String**|  | [optional] |
| **userIDAttributeAtTypeHint** | **String**|  | [optional] |
| **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **defaultGroupsAtTypeHint** | **String**|  | [optional] |
| **idpCertAlias** | **String**|  | [optional] |
| **idpCertAliasAtTypeHint** | **String**|  | [optional] |
| **addGroupMemberships** | **Boolean**|  | [optional] |
| **addGroupMembershipsAtTypeHint** | **String**|  | [optional] |
| **path** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathAtTypeHint** | **String**|  | [optional] |
| **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **synchronizeAttributesAtTypeHint** | **String**|  | [optional] |
| **clockTolerance** | **Integer**|  | [optional] |
| **clockToleranceAtTypeHint** | **String**|  | [optional] |
| **groupMembershipAttribute** | **String**|  | [optional] |
| **groupMembershipAttributeAtTypeHint** | **String**|  | [optional] |
| **idpUrl** | **String**|  | [optional] |
| **idpUrlAtTypeHint** | **String**|  | [optional] |
| **logoutUrl** | **String**|  | [optional] |
| **logoutUrlAtTypeHint** | **String**|  | [optional] |
| **serviceProviderEntityId** | **String**|  | [optional] |
| **serviceProviderEntityIdAtTypeHint** | **String**|  | [optional] |
| **assertionConsumerServiceURL** | **String**|  | [optional] |
| **assertionConsumerServiceURLAtTypeHint** | **String**|  | [optional] |
| **handleLogout** | **Boolean**|  | [optional] |
| **handleLogoutAtTypeHint** | **String**|  | [optional] |
| **spPrivateKeyAlias** | **String**|  | [optional] |
| **spPrivateKeyAliasAtTypeHint** | **String**|  | [optional] |
| **useEncryption** | **Boolean**|  | [optional] |
| **useEncryptionAtTypeHint** | **String**|  | [optional] |
| **nameIdFormat** | **String**|  | [optional] |
| **nameIdFormatAtTypeHint** | **String**|  | [optional] |
| **digestMethod** | **String**|  | [optional] |
| **digestMethodAtTypeHint** | **String**|  | [optional] |
| **signatureMethod** | **String**|  | [optional] |
| **signatureMethodAtTypeHint** | **String**|  | [optional] |
| **userIntermediatePath** | **String**|  | [optional] |
| **userIntermediatePathAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheFelixJettyBasedHttpService

> void postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        Boolean orgApacheFelixHttpsNio = true; // Boolean | 
        String orgApacheFelixHttpsNioAtTypeHint = "orgApacheFelixHttpsNioAtTypeHint_example"; // String | 
        String orgApacheFelixHttpsKeystore = "orgApacheFelixHttpsKeystore_example"; // String | 
        String orgApacheFelixHttpsKeystoreAtTypeHint = "orgApacheFelixHttpsKeystoreAtTypeHint_example"; // String | 
        String orgApacheFelixHttpsKeystorePassword = "orgApacheFelixHttpsKeystorePassword_example"; // String | 
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint = "orgApacheFelixHttpsKeystorePasswordAtTypeHint_example"; // String | 
        String orgApacheFelixHttpsKeystoreKey = "orgApacheFelixHttpsKeystoreKey_example"; // String | 
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint = "orgApacheFelixHttpsKeystoreKeyAtTypeHint_example"; // String | 
        String orgApacheFelixHttpsKeystoreKeyPassword = "orgApacheFelixHttpsKeystoreKeyPassword_example"; // String | 
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = "orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint_example"; // String | 
        String orgApacheFelixHttpsTruststore = "orgApacheFelixHttpsTruststore_example"; // String | 
        String orgApacheFelixHttpsTruststoreAtTypeHint = "orgApacheFelixHttpsTruststoreAtTypeHint_example"; // String | 
        String orgApacheFelixHttpsTruststorePassword = "orgApacheFelixHttpsTruststorePassword_example"; // String | 
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint = "orgApacheFelixHttpsTruststorePasswordAtTypeHint_example"; // String | 
        String orgApacheFelixHttpsClientcertificate = "orgApacheFelixHttpsClientcertificate_example"; // String | 
        String orgApacheFelixHttpsClientcertificateAtTypeHint = "orgApacheFelixHttpsClientcertificateAtTypeHint_example"; // String | 
        Boolean orgApacheFelixHttpsEnable = true; // Boolean | 
        String orgApacheFelixHttpsEnableAtTypeHint = "orgApacheFelixHttpsEnableAtTypeHint_example"; // String | 
        String orgOsgiServiceHttpPortSecure = "orgOsgiServiceHttpPortSecure_example"; // String | 
        String orgOsgiServiceHttpPortSecureAtTypeHint = "orgOsgiServiceHttpPortSecureAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postConfigApacheFelixJettyBasedHttpService");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgApacheFelixHttpsNio** | **Boolean**|  | [optional] |
| **orgApacheFelixHttpsNioAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystore** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystorePassword** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystorePasswordAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKey** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKeyAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststore** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststoreAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststorePassword** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststorePasswordAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsClientcertificate** | **String**|  | [optional] |
| **orgApacheFelixHttpsClientcertificateAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsEnable** | **Boolean**|  | [optional] |
| **orgApacheFelixHttpsEnableAtTypeHint** | **String**|  | [optional] |
| **orgOsgiServiceHttpPortSecure** | **String**|  | [optional] |
| **orgOsgiServiceHttpPortSecureAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheHttpComponentsProxyConfiguration

> void postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String proxyHost = "proxyHost_example"; // String | 
        String proxyHostAtTypeHint = "proxyHostAtTypeHint_example"; // String | 
        Integer proxyPort = 56; // Integer | 
        String proxyPortAtTypeHint = "proxyPortAtTypeHint_example"; // String | 
        List<String> proxyExceptions = Arrays.asList(); // List<String> | 
        String proxyExceptionsAtTypeHint = "proxyExceptionsAtTypeHint_example"; // String | 
        Boolean proxyEnabled = true; // Boolean | 
        String proxyEnabledAtTypeHint = "proxyEnabledAtTypeHint_example"; // String | 
        String proxyUser = "proxyUser_example"; // String | 
        String proxyUserAtTypeHint = "proxyUserAtTypeHint_example"; // String | 
        String proxyPassword = "proxyPassword_example"; // String | 
        String proxyPasswordAtTypeHint = "proxyPasswordAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postConfigApacheHttpComponentsProxyConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **proxyHost** | **String**|  | [optional] |
| **proxyHostAtTypeHint** | **String**|  | [optional] |
| **proxyPort** | **Integer**|  | [optional] |
| **proxyPortAtTypeHint** | **String**|  | [optional] |
| **proxyExceptions** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **proxyExceptionsAtTypeHint** | **String**|  | [optional] |
| **proxyEnabled** | **Boolean**|  | [optional] |
| **proxyEnabledAtTypeHint** | **String**|  | [optional] |
| **proxyUser** | **String**|  | [optional] |
| **proxyUserAtTypeHint** | **String**|  | [optional] |
| **proxyPassword** | **String**|  | [optional] |
| **proxyPasswordAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheSlingDavExServlet

> void postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String alias = "alias_example"; // String | 
        String aliasAtTypeHint = "aliasAtTypeHint_example"; // String | 
        Boolean davCreateAbsoluteUri = true; // Boolean | 
        String davCreateAbsoluteUriAtTypeHint = "davCreateAbsoluteUriAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingDavExServlet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alias** | **String**|  | [optional] |
| **aliasAtTypeHint** | **String**|  | [optional] |
| **davCreateAbsoluteUri** | **Boolean**|  | [optional] |
| **davCreateAbsoluteUriAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheSlingGetServlet

> void postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String jsonMaximumresults = "jsonMaximumresults_example"; // String | 
        String jsonMaximumresultsAtTypeHint = "jsonMaximumresultsAtTypeHint_example"; // String | 
        Boolean enableHtml = true; // Boolean | 
        String enableHtmlAtTypeHint = "enableHtmlAtTypeHint_example"; // String | 
        Boolean enableTxt = true; // Boolean | 
        String enableTxtAtTypeHint = "enableTxtAtTypeHint_example"; // String | 
        Boolean enableXml = true; // Boolean | 
        String enableXmlAtTypeHint = "enableXmlAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingGetServlet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jsonMaximumresults** | **String**|  | [optional] |
| **jsonMaximumresultsAtTypeHint** | **String**|  | [optional] |
| **enableHtml** | **Boolean**|  | [optional] |
| **enableHtmlAtTypeHint** | **String**|  | [optional] |
| **enableTxt** | **Boolean**|  | [optional] |
| **enableTxtAtTypeHint** | **String**|  | [optional] |
| **enableXml** | **Boolean**|  | [optional] |
| **enableXmlAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheSlingReferrerFilter

> void postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        Boolean allowEmpty = true; // Boolean | 
        String allowEmptyAtTypeHint = "allowEmptyAtTypeHint_example"; // String | 
        String allowHosts = "allowHosts_example"; // String | 
        String allowHostsAtTypeHint = "allowHostsAtTypeHint_example"; // String | 
        String allowHostsRegexp = "allowHostsRegexp_example"; // String | 
        String allowHostsRegexpAtTypeHint = "allowHostsRegexpAtTypeHint_example"; // String | 
        String filterMethods = "filterMethods_example"; // String | 
        String filterMethodsAtTypeHint = "filterMethodsAtTypeHint_example"; // String | 
        try {
            void result = apiInstance.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postConfigApacheSlingReferrerFilter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **allowEmpty** | **Boolean**|  | [optional] |
| **allowEmptyAtTypeHint** | **String**|  | [optional] |
| **allowHosts** | **String**|  | [optional] |
| **allowHostsAtTypeHint** | **String**|  | [optional] |
| **allowHostsRegexp** | **String**|  | [optional] |
| **allowHostsRegexpAtTypeHint** | **String**|  | [optional] |
| **filterMethods** | **String**|  | [optional] |
| **filterMethodsAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigProperty

> void postConfigProperty(configNodeName)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String configNodeName = "configNodeName_example"; // String | 
        try {
            void result = apiInstance.postConfigProperty(configNodeName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postConfigProperty");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configNodeName** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postNode

> void postNode(path, name, operation, deleteAuthorizable, _file)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String path = "path_example"; // String | 
        String name = "name_example"; // String | 
        String operation = "operation_example"; // String | 
        String deleteAuthorizable = "deleteAuthorizable_example"; // String | 
        File _file = new File("/path/to/file"); // File | 
        try {
            void result = apiInstance.postNode(path, name, operation, deleteAuthorizable, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postNode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |
| **operation** | **String**|  | [optional] |
| **deleteAuthorizable** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postNodeRw

> void postNodeRw(path, name, addMembers)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String path = "path_example"; // String | 
        String name = "name_example"; // String | 
        String addMembers = "addMembers_example"; // String | 
        try {
            void result = apiInstance.postNodeRw(path, name, addMembers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postNodeRw");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |
| **addMembers** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postPath

> void postPath(path, jcrPrimaryType, name)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String path = "path_example"; // String | 
        String jcrPrimaryType = "jcrPrimaryType_example"; // String | 
        String name = "name_example"; // String | 
        try {
            void result = apiInstance.postPath(path, jcrPrimaryType, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postPath");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **jcrPrimaryType** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postQuery

> String postQuery(path, pLimit, _1property, _1propertyValue)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String path = "path_example"; // String | 
        BigDecimal pLimit = new BigDecimal(78); // BigDecimal | 
        String _1property = "_1property_example"; // String | 
        String _1propertyValue = "_1propertyValue_example"; // String | 
        try {
            String result = apiInstance.postQuery(path, pLimit, _1property, _1propertyValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postQuery");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **pLimit** | **BigDecimal**|  | |
| **_1property** | **String**|  | |
| **_1propertyValue** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postTreeActivation

> void postTreeActivation(ignoredeactivated, onlymodified, path, cmd)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        Boolean ignoredeactivated = true; // Boolean | 
        Boolean onlymodified = true; // Boolean | 
        String path = "path_example"; // String | 
        String cmd = "activate"; // String | 
        try {
            void result = apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path, cmd);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postTreeActivation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ignoredeactivated** | **Boolean**|  | |
| **onlymodified** | **Boolean**|  | |
| **path** | **String**|  | |
| **cmd** | **String**|  | [default to activate] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postTruststore

> String postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        String operation = "operation_example"; // String | 
        String newPassword = "newPassword_example"; // String | 
        String rePassword = "rePassword_example"; // String | 
        String keyStoreType = "keyStoreType_example"; // String | 
        String removeAlias = "removeAlias_example"; // String | 
        File certificate = new File("/path/to/file"); // File | 
        try {
            String result = apiInstance.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postTruststore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **operation** | **String**|  | [optional] |
| **newPassword** | **String**|  | [optional] |
| **rePassword** | **String**|  | [optional] |
| **keyStoreType** | **String**|  | [optional] |
| **removeAlias** | **String**|  | [optional] |
| **certificate** | **File**|  | [optional] |

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
| **200** | Default response |  -  |


## postTruststorePKCS12

> String postTruststorePKCS12(truststoreP12)



### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.SlingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: aemAuth
        HttpBasicAuth aemAuth = (HttpBasicAuth) defaultClient.getAuthentication("aemAuth");
        aemAuth.setUsername("YOUR USERNAME");
        aemAuth.setPassword("YOUR PASSWORD");

        SlingApi apiInstance = new SlingApi(defaultClient);
        File truststoreP12 = new File("/path/to/file"); // File | 
        try {
            String result = apiInstance.postTruststorePKCS12(truststoreP12);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlingApi#postTruststorePKCS12");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **truststoreP12** | **File**|  | [optional] |

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
| **200** | Default response |  -  |

