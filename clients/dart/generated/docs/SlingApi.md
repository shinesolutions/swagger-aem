# openapi.api.SlingApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


# **deleteAgent**
> deleteAgent(runmode, name)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var runmode = runmode_example; // String | 
var name = name_example; // String | 

try { 
    api_instance.deleteAgent(runmode, name);
} catch (e) {
    print("Exception when calling SlingApi->deleteAgent: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteNode**
> deleteNode(path, name)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var path = path_example; // String | 
var name = name_example; // String | 

try { 
    api_instance.deleteNode(path, name);
} catch (e) {
    print("Exception when calling SlingApi->deleteNode: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAgent**
> getAgent(runmode, name)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var runmode = runmode_example; // String | 
var name = name_example; // String | 

try { 
    api_instance.getAgent(runmode, name);
} catch (e) {
    print("Exception when calling SlingApi->getAgent: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAgents**
> String getAgents(runmode)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var runmode = runmode_example; // String | 

try { 
    var result = api_instance.getAgents(runmode);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getAgents: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var intermediatePath = intermediatePath_example; // String | 
var authorizableId = authorizableId_example; // String | 

try { 
    var result = api_instance.getAuthorizableKeystore(intermediatePath, authorizableId);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getAuthorizableKeystore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getKeystore**
> MultipartFile getKeystore(intermediatePath, authorizableId)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var intermediatePath = intermediatePath_example; // String | 
var authorizableId = authorizableId_example; // String | 

try { 
    var result = api_instance.getKeystore(intermediatePath, authorizableId);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getKeystore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 

### Return type

[**MultipartFile**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNode**
> getNode(path, name)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var path = path_example; // String | 
var name = name_example; // String | 

try { 
    api_instance.getNode(path, name);
} catch (e) {
    print("Exception when calling SlingApi->getNode: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackage**
> MultipartFile getPackage(group, name, version)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var group = group_example; // String | 
var name = name_example; // String | 
var version = version_example; // String | 

try { 
    var result = api_instance.getPackage(group, name, version);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getPackage: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

[**MultipartFile**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageFilter**
> String getPackageFilter(group, name, version)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var group = group_example; // String | 
var name = name_example; // String | 
var version = version_example; // String | 

try { 
    var result = api_instance.getPackageFilter(group, name, version);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getPackageFilter: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getQuery**
> String getQuery(path, pLimit, n1property, n1propertyValue)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var path = path_example; // String | 
var pLimit = 1.2; // num | 
var n1property = n1property_example; // String | 
var n1propertyValue = n1propertyValue_example; // String | 

try { 
    var result = api_instance.getQuery(path, pLimit, n1property, n1propertyValue);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getQuery: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pLimit** | **num**|  | 
 **n1property** | **String**|  | 
 **n1propertyValue** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststore**
> MultipartFile getTruststore()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();

try { 
    var result = api_instance.getTruststore();
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getTruststore: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MultipartFile**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();

try { 
    var result = api_instance.getTruststoreInfo();
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->getTruststoreInfo: $e\n");
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

# **postAgent**
> postAgent(runmode, name, jcr:contentCq:distribute, jcr:contentCq:distribute@TypeHint, jcr:contentCq:name, jcr:contentCq:template, jcr:contentEnabled, jcr:contentJcr:description, jcr:contentJcr:lastModified, jcr:contentJcr:lastModifiedBy, jcr:contentJcr:mixinTypes, jcr:contentJcr:title, jcr:contentLogLevel, jcr:contentNoStatusUpdate, jcr:contentNoVersioning, jcr:contentProtocolConnectTimeout, jcr:contentProtocolHTTPConnectionClosed, jcr:contentProtocolHTTPExpired, jcr:contentProtocolHTTPHeaders, jcr:contentProtocolHTTPHeaders@TypeHint, jcr:contentProtocolHTTPMethod, jcr:contentProtocolHTTPSRelaxed, jcr:contentProtocolInterface, jcr:contentProtocolSocketTimeout, jcr:contentProtocolVersion, jcr:contentProxyNTLMDomain, jcr:contentProxyNTLMHost, jcr:contentProxyHost, jcr:contentProxyPassword, jcr:contentProxyPort, jcr:contentProxyUser, jcr:contentQueueBatchMaxSize, jcr:contentQueueBatchMode, jcr:contentQueueBatchWaitTime, jcr:contentRetryDelay, jcr:contentReverseReplication, jcr:contentSerializationType, jcr:contentSling:resourceType, jcr:contentSsl, jcr:contentTransportNTLMDomain, jcr:contentTransportNTLMHost, jcr:contentTransportPassword, jcr:contentTransportUri, jcr:contentTransportUser, jcr:contentTriggerDistribute, jcr:contentTriggerModified, jcr:contentTriggerOnOffTime, jcr:contentTriggerReceive, jcr:contentTriggerSpecific, jcr:contentUserId, jcr:primaryType, :operation)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var runmode = runmode_example; // String | 
var name = name_example; // String | 
var jcr:contentCq:distribute = true; // bool | 
var jcr:contentCq:distribute@TypeHint = jcr:contentCq:distribute@TypeHint_example; // String | 
var jcr:contentCq:name = jcr:contentCq:name_example; // String | 
var jcr:contentCq:template = jcr:contentCq:template_example; // String | 
var jcr:contentEnabled = true; // bool | 
var jcr:contentJcr:description = jcr:contentJcr:description_example; // String | 
var jcr:contentJcr:lastModified = jcr:contentJcr:lastModified_example; // String | 
var jcr:contentJcr:lastModifiedBy = jcr:contentJcr:lastModifiedBy_example; // String | 
var jcr:contentJcr:mixinTypes = jcr:contentJcr:mixinTypes_example; // String | 
var jcr:contentJcr:title = jcr:contentJcr:title_example; // String | 
var jcr:contentLogLevel = jcr:contentLogLevel_example; // String | 
var jcr:contentNoStatusUpdate = true; // bool | 
var jcr:contentNoVersioning = true; // bool | 
var jcr:contentProtocolConnectTimeout = 1.2; // num | 
var jcr:contentProtocolHTTPConnectionClosed = true; // bool | 
var jcr:contentProtocolHTTPExpired = jcr:contentProtocolHTTPExpired_example; // String | 
var jcr:contentProtocolHTTPHeaders = []; // List<String> | 
var jcr:contentProtocolHTTPHeaders@TypeHint = jcr:contentProtocolHTTPHeaders@TypeHint_example; // String | 
var jcr:contentProtocolHTTPMethod = jcr:contentProtocolHTTPMethod_example; // String | 
var jcr:contentProtocolHTTPSRelaxed = true; // bool | 
var jcr:contentProtocolInterface = jcr:contentProtocolInterface_example; // String | 
var jcr:contentProtocolSocketTimeout = 1.2; // num | 
var jcr:contentProtocolVersion = jcr:contentProtocolVersion_example; // String | 
var jcr:contentProxyNTLMDomain = jcr:contentProxyNTLMDomain_example; // String | 
var jcr:contentProxyNTLMHost = jcr:contentProxyNTLMHost_example; // String | 
var jcr:contentProxyHost = jcr:contentProxyHost_example; // String | 
var jcr:contentProxyPassword = jcr:contentProxyPassword_example; // String | 
var jcr:contentProxyPort = 1.2; // num | 
var jcr:contentProxyUser = jcr:contentProxyUser_example; // String | 
var jcr:contentQueueBatchMaxSize = 1.2; // num | 
var jcr:contentQueueBatchMode = jcr:contentQueueBatchMode_example; // String | 
var jcr:contentQueueBatchWaitTime = 1.2; // num | 
var jcr:contentRetryDelay = jcr:contentRetryDelay_example; // String | 
var jcr:contentReverseReplication = true; // bool | 
var jcr:contentSerializationType = jcr:contentSerializationType_example; // String | 
var jcr:contentSling:resourceType = jcr:contentSling:resourceType_example; // String | 
var jcr:contentSsl = jcr:contentSsl_example; // String | 
var jcr:contentTransportNTLMDomain = jcr:contentTransportNTLMDomain_example; // String | 
var jcr:contentTransportNTLMHost = jcr:contentTransportNTLMHost_example; // String | 
var jcr:contentTransportPassword = jcr:contentTransportPassword_example; // String | 
var jcr:contentTransportUri = jcr:contentTransportUri_example; // String | 
var jcr:contentTransportUser = jcr:contentTransportUser_example; // String | 
var jcr:contentTriggerDistribute = true; // bool | 
var jcr:contentTriggerModified = true; // bool | 
var jcr:contentTriggerOnOffTime = true; // bool | 
var jcr:contentTriggerReceive = true; // bool | 
var jcr:contentTriggerSpecific = true; // bool | 
var jcr:contentUserId = jcr:contentUserId_example; // String | 
var jcr:primaryType = jcr:primaryType_example; // String | 
var :operation = :operation_example; // String | 

try { 
    api_instance.postAgent(runmode, name, jcr:contentCq:distribute, jcr:contentCq:distribute@TypeHint, jcr:contentCq:name, jcr:contentCq:template, jcr:contentEnabled, jcr:contentJcr:description, jcr:contentJcr:lastModified, jcr:contentJcr:lastModifiedBy, jcr:contentJcr:mixinTypes, jcr:contentJcr:title, jcr:contentLogLevel, jcr:contentNoStatusUpdate, jcr:contentNoVersioning, jcr:contentProtocolConnectTimeout, jcr:contentProtocolHTTPConnectionClosed, jcr:contentProtocolHTTPExpired, jcr:contentProtocolHTTPHeaders, jcr:contentProtocolHTTPHeaders@TypeHint, jcr:contentProtocolHTTPMethod, jcr:contentProtocolHTTPSRelaxed, jcr:contentProtocolInterface, jcr:contentProtocolSocketTimeout, jcr:contentProtocolVersion, jcr:contentProxyNTLMDomain, jcr:contentProxyNTLMHost, jcr:contentProxyHost, jcr:contentProxyPassword, jcr:contentProxyPort, jcr:contentProxyUser, jcr:contentQueueBatchMaxSize, jcr:contentQueueBatchMode, jcr:contentQueueBatchWaitTime, jcr:contentRetryDelay, jcr:contentReverseReplication, jcr:contentSerializationType, jcr:contentSling:resourceType, jcr:contentSsl, jcr:contentTransportNTLMDomain, jcr:contentTransportNTLMHost, jcr:contentTransportPassword, jcr:contentTransportUri, jcr:contentTransportUser, jcr:contentTriggerDistribute, jcr:contentTriggerModified, jcr:contentTriggerOnOffTime, jcr:contentTriggerReceive, jcr:contentTriggerSpecific, jcr:contentUserId, jcr:primaryType, :operation);
} catch (e) {
    print("Exception when calling SlingApi->postAgent: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
 **jcr:contentCq:distribute** | **bool**|  | [optional] 
 **jcr:contentCq:distribute@TypeHint** | **String**|  | [optional] 
 **jcr:contentCq:name** | **String**|  | [optional] 
 **jcr:contentCq:template** | **String**|  | [optional] 
 **jcr:contentEnabled** | **bool**|  | [optional] 
 **jcr:contentJcr:description** | **String**|  | [optional] 
 **jcr:contentJcr:lastModified** | **String**|  | [optional] 
 **jcr:contentJcr:lastModifiedBy** | **String**|  | [optional] 
 **jcr:contentJcr:mixinTypes** | **String**|  | [optional] 
 **jcr:contentJcr:title** | **String**|  | [optional] 
 **jcr:contentLogLevel** | **String**|  | [optional] 
 **jcr:contentNoStatusUpdate** | **bool**|  | [optional] 
 **jcr:contentNoVersioning** | **bool**|  | [optional] 
 **jcr:contentProtocolConnectTimeout** | **num**|  | [optional] 
 **jcr:contentProtocolHTTPConnectionClosed** | **bool**|  | [optional] 
 **jcr:contentProtocolHTTPExpired** | **String**|  | [optional] 
 **jcr:contentProtocolHTTPHeaders** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **jcr:contentProtocolHTTPHeaders@TypeHint** | **String**|  | [optional] 
 **jcr:contentProtocolHTTPMethod** | **String**|  | [optional] 
 **jcr:contentProtocolHTTPSRelaxed** | **bool**|  | [optional] 
 **jcr:contentProtocolInterface** | **String**|  | [optional] 
 **jcr:contentProtocolSocketTimeout** | **num**|  | [optional] 
 **jcr:contentProtocolVersion** | **String**|  | [optional] 
 **jcr:contentProxyNTLMDomain** | **String**|  | [optional] 
 **jcr:contentProxyNTLMHost** | **String**|  | [optional] 
 **jcr:contentProxyHost** | **String**|  | [optional] 
 **jcr:contentProxyPassword** | **String**|  | [optional] 
 **jcr:contentProxyPort** | **num**|  | [optional] 
 **jcr:contentProxyUser** | **String**|  | [optional] 
 **jcr:contentQueueBatchMaxSize** | **num**|  | [optional] 
 **jcr:contentQueueBatchMode** | **String**|  | [optional] 
 **jcr:contentQueueBatchWaitTime** | **num**|  | [optional] 
 **jcr:contentRetryDelay** | **String**|  | [optional] 
 **jcr:contentReverseReplication** | **bool**|  | [optional] 
 **jcr:contentSerializationType** | **String**|  | [optional] 
 **jcr:contentSling:resourceType** | **String**|  | [optional] 
 **jcr:contentSsl** | **String**|  | [optional] 
 **jcr:contentTransportNTLMDomain** | **String**|  | [optional] 
 **jcr:contentTransportNTLMHost** | **String**|  | [optional] 
 **jcr:contentTransportPassword** | **String**|  | [optional] 
 **jcr:contentTransportUri** | **String**|  | [optional] 
 **jcr:contentTransportUser** | **String**|  | [optional] 
 **jcr:contentTriggerDistribute** | **bool**|  | [optional] 
 **jcr:contentTriggerModified** | **bool**|  | [optional] 
 **jcr:contentTriggerOnOffTime** | **bool**|  | [optional] 
 **jcr:contentTriggerReceive** | **bool**|  | [optional] 
 **jcr:contentTriggerSpecific** | **bool**|  | [optional] 
 **jcr:contentUserId** | **String**|  | [optional] 
 **jcr:primaryType** | **String**|  | [optional] 
 **:operation** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, :operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var intermediatePath = intermediatePath_example; // String | 
var authorizableId = authorizableId_example; // String | 
var :operation = :operation_example; // String | 
var currentPassword = currentPassword_example; // String | 
var newPassword = newPassword_example; // String | 
var rePassword = rePassword_example; // String | 
var keyPassword = keyPassword_example; // String | 
var keyStorePass = keyStorePass_example; // String | 
var alias = alias_example; // String | 
var newAlias = newAlias_example; // String | 
var removeAlias = removeAlias_example; // String | 
var certChain = BINARY_DATA_HERE; // MultipartFile | 
var pk = BINARY_DATA_HERE; // MultipartFile | 
var keyStore = BINARY_DATA_HERE; // MultipartFile | 

try { 
    var result = api_instance.postAuthorizableKeystore(intermediatePath, authorizableId, :operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->postAuthorizableKeystore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 
 **:operation** | **String**|  | [optional] 
 **currentPassword** | **String**|  | [optional] 
 **newPassword** | **String**|  | [optional] 
 **rePassword** | **String**|  | [optional] 
 **keyPassword** | **String**|  | [optional] 
 **keyStorePass** | **String**|  | [optional] 
 **alias** | **String**|  | [optional] 
 **newAlias** | **String**|  | [optional] 
 **removeAlias** | **String**|  | [optional] 
 **certChain** | **MultipartFile**|  | [optional] [default to null]
 **pk** | **MultipartFile**|  | [optional] [default to null]
 **keyStore** | **MultipartFile**|  | [optional] [default to null]

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizables**
> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, rep:password, profileGivenName)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var authorizableId = authorizableId_example; // String | 
var intermediatePath = intermediatePath_example; // String | 
var createUser = createUser_example; // String | 
var createGroup = createGroup_example; // String | 
var rep:password = rep:password_example; // String | 
var profileGivenName = profileGivenName_example; // String | 

try { 
    var result = api_instance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, rep:password, profileGivenName);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->postAuthorizables: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  | 
 **intermediatePath** | **String**|  | 
 **createUser** | **String**|  | [optional] 
 **createGroup** | **String**|  | [optional] 
 **rep:password** | **String**|  | [optional] 
 **profileGivenName** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePassword@TypeHint, serviceRanking, serviceRanking@TypeHint, idpHttpRedirect, idpHttpRedirect@TypeHint, createUser, createUser@TypeHint, defaultRedirectUrl, defaultRedirectUrl@TypeHint, userIDAttribute, userIDAttribute@TypeHint, defaultGroups, defaultGroups@TypeHint, idpCertAlias, idpCertAlias@TypeHint, addGroupMemberships, addGroupMemberships@TypeHint, path, path@TypeHint, synchronizeAttributes, synchronizeAttributes@TypeHint, clockTolerance, clockTolerance@TypeHint, groupMembershipAttribute, groupMembershipAttribute@TypeHint, idpUrl, idpUrl@TypeHint, logoutUrl, logoutUrl@TypeHint, serviceProviderEntityId, serviceProviderEntityId@TypeHint, assertionConsumerServiceURL, assertionConsumerServiceURL@TypeHint, handleLogout, handleLogout@TypeHint, spPrivateKeyAlias, spPrivateKeyAlias@TypeHint, useEncryption, useEncryption@TypeHint, nameIdFormat, nameIdFormat@TypeHint, digestMethod, digestMethod@TypeHint, signatureMethod, signatureMethod@TypeHint, userIntermediatePath, userIntermediatePath@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var keyStorePassword = keyStorePassword_example; // String | 
var keyStorePassword@TypeHint = keyStorePassword@TypeHint_example; // String | 
var serviceRanking = 56; // int | 
var serviceRanking@TypeHint = serviceRanking@TypeHint_example; // String | 
var idpHttpRedirect = true; // bool | 
var idpHttpRedirect@TypeHint = idpHttpRedirect@TypeHint_example; // String | 
var createUser = true; // bool | 
var createUser@TypeHint = createUser@TypeHint_example; // String | 
var defaultRedirectUrl = defaultRedirectUrl_example; // String | 
var defaultRedirectUrl@TypeHint = defaultRedirectUrl@TypeHint_example; // String | 
var userIDAttribute = userIDAttribute_example; // String | 
var userIDAttribute@TypeHint = userIDAttribute@TypeHint_example; // String | 
var defaultGroups = []; // List<String> | 
var defaultGroups@TypeHint = defaultGroups@TypeHint_example; // String | 
var idpCertAlias = idpCertAlias_example; // String | 
var idpCertAlias@TypeHint = idpCertAlias@TypeHint_example; // String | 
var addGroupMemberships = true; // bool | 
var addGroupMemberships@TypeHint = addGroupMemberships@TypeHint_example; // String | 
var path = []; // List<String> | 
var path@TypeHint = path@TypeHint_example; // String | 
var synchronizeAttributes = []; // List<String> | 
var synchronizeAttributes@TypeHint = synchronizeAttributes@TypeHint_example; // String | 
var clockTolerance = 56; // int | 
var clockTolerance@TypeHint = clockTolerance@TypeHint_example; // String | 
var groupMembershipAttribute = groupMembershipAttribute_example; // String | 
var groupMembershipAttribute@TypeHint = groupMembershipAttribute@TypeHint_example; // String | 
var idpUrl = idpUrl_example; // String | 
var idpUrl@TypeHint = idpUrl@TypeHint_example; // String | 
var logoutUrl = logoutUrl_example; // String | 
var logoutUrl@TypeHint = logoutUrl@TypeHint_example; // String | 
var serviceProviderEntityId = serviceProviderEntityId_example; // String | 
var serviceProviderEntityId@TypeHint = serviceProviderEntityId@TypeHint_example; // String | 
var assertionConsumerServiceURL = assertionConsumerServiceURL_example; // String | 
var assertionConsumerServiceURL@TypeHint = assertionConsumerServiceURL@TypeHint_example; // String | 
var handleLogout = true; // bool | 
var handleLogout@TypeHint = handleLogout@TypeHint_example; // String | 
var spPrivateKeyAlias = spPrivateKeyAlias_example; // String | 
var spPrivateKeyAlias@TypeHint = spPrivateKeyAlias@TypeHint_example; // String | 
var useEncryption = true; // bool | 
var useEncryption@TypeHint = useEncryption@TypeHint_example; // String | 
var nameIdFormat = nameIdFormat_example; // String | 
var nameIdFormat@TypeHint = nameIdFormat@TypeHint_example; // String | 
var digestMethod = digestMethod_example; // String | 
var digestMethod@TypeHint = digestMethod@TypeHint_example; // String | 
var signatureMethod = signatureMethod_example; // String | 
var signatureMethod@TypeHint = signatureMethod@TypeHint_example; // String | 
var userIntermediatePath = userIntermediatePath_example; // String | 
var userIntermediatePath@TypeHint = userIntermediatePath@TypeHint_example; // String | 

try { 
    api_instance.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePassword@TypeHint, serviceRanking, serviceRanking@TypeHint, idpHttpRedirect, idpHttpRedirect@TypeHint, createUser, createUser@TypeHint, defaultRedirectUrl, defaultRedirectUrl@TypeHint, userIDAttribute, userIDAttribute@TypeHint, defaultGroups, defaultGroups@TypeHint, idpCertAlias, idpCertAlias@TypeHint, addGroupMemberships, addGroupMemberships@TypeHint, path, path@TypeHint, synchronizeAttributes, synchronizeAttributes@TypeHint, clockTolerance, clockTolerance@TypeHint, groupMembershipAttribute, groupMembershipAttribute@TypeHint, idpUrl, idpUrl@TypeHint, logoutUrl, logoutUrl@TypeHint, serviceProviderEntityId, serviceProviderEntityId@TypeHint, assertionConsumerServiceURL, assertionConsumerServiceURL@TypeHint, handleLogout, handleLogout@TypeHint, spPrivateKeyAlias, spPrivateKeyAlias@TypeHint, useEncryption, useEncryption@TypeHint, nameIdFormat, nameIdFormat@TypeHint, digestMethod, digestMethod@TypeHint, signatureMethod, signatureMethod@TypeHint, userIntermediatePath, userIntermediatePath@TypeHint);
} catch (e) {
    print("Exception when calling SlingApi->postConfigAdobeGraniteSamlAuthenticationHandler: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **String**|  | [optional] 
 **keyStorePassword@TypeHint** | **String**|  | [optional] 
 **serviceRanking** | **int**|  | [optional] 
 **serviceRanking@TypeHint** | **String**|  | [optional] 
 **idpHttpRedirect** | **bool**|  | [optional] 
 **idpHttpRedirect@TypeHint** | **String**|  | [optional] 
 **createUser** | **bool**|  | [optional] 
 **createUser@TypeHint** | **String**|  | [optional] 
 **defaultRedirectUrl** | **String**|  | [optional] 
 **defaultRedirectUrl@TypeHint** | **String**|  | [optional] 
 **userIDAttribute** | **String**|  | [optional] 
 **userIDAttribute@TypeHint** | **String**|  | [optional] 
 **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **defaultGroups@TypeHint** | **String**|  | [optional] 
 **idpCertAlias** | **String**|  | [optional] 
 **idpCertAlias@TypeHint** | **String**|  | [optional] 
 **addGroupMemberships** | **bool**|  | [optional] 
 **addGroupMemberships@TypeHint** | **String**|  | [optional] 
 **path** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **path@TypeHint** | **String**|  | [optional] 
 **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **synchronizeAttributes@TypeHint** | **String**|  | [optional] 
 **clockTolerance** | **int**|  | [optional] 
 **clockTolerance@TypeHint** | **String**|  | [optional] 
 **groupMembershipAttribute** | **String**|  | [optional] 
 **groupMembershipAttribute@TypeHint** | **String**|  | [optional] 
 **idpUrl** | **String**|  | [optional] 
 **idpUrl@TypeHint** | **String**|  | [optional] 
 **logoutUrl** | **String**|  | [optional] 
 **logoutUrl@TypeHint** | **String**|  | [optional] 
 **serviceProviderEntityId** | **String**|  | [optional] 
 **serviceProviderEntityId@TypeHint** | **String**|  | [optional] 
 **assertionConsumerServiceURL** | **String**|  | [optional] 
 **assertionConsumerServiceURL@TypeHint** | **String**|  | [optional] 
 **handleLogout** | **bool**|  | [optional] 
 **handleLogout@TypeHint** | **String**|  | [optional] 
 **spPrivateKeyAlias** | **String**|  | [optional] 
 **spPrivateKeyAlias@TypeHint** | **String**|  | [optional] 
 **useEncryption** | **bool**|  | [optional] 
 **useEncryption@TypeHint** | **String**|  | [optional] 
 **nameIdFormat** | **String**|  | [optional] 
 **nameIdFormat@TypeHint** | **String**|  | [optional] 
 **digestMethod** | **String**|  | [optional] 
 **digestMethod@TypeHint** | **String**|  | [optional] 
 **signatureMethod** | **String**|  | [optional] 
 **signatureMethod@TypeHint** | **String**|  | [optional] 
 **userIntermediatePath** | **String**|  | [optional] 
 **userIntermediatePath@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNio@TypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystore@TypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePassword@TypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKey@TypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPassword@TypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststore@TypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePassword@TypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificate@TypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnable@TypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecure@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var orgApacheFelixHttpsNio = true; // bool | 
var orgApacheFelixHttpsNio@TypeHint = orgApacheFelixHttpsNio@TypeHint_example; // String | 
var orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore_example; // String | 
var orgApacheFelixHttpsKeystore@TypeHint = orgApacheFelixHttpsKeystore@TypeHint_example; // String | 
var orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword_example; // String | 
var orgApacheFelixHttpsKeystorePassword@TypeHint = orgApacheFelixHttpsKeystorePassword@TypeHint_example; // String | 
var orgApacheFelixHttpsKeystoreKey = orgApacheFelixHttpsKeystoreKey_example; // String | 
var orgApacheFelixHttpsKeystoreKey@TypeHint = orgApacheFelixHttpsKeystoreKey@TypeHint_example; // String | 
var orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword_example; // String | 
var orgApacheFelixHttpsKeystoreKeyPassword@TypeHint = orgApacheFelixHttpsKeystoreKeyPassword@TypeHint_example; // String | 
var orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore_example; // String | 
var orgApacheFelixHttpsTruststore@TypeHint = orgApacheFelixHttpsTruststore@TypeHint_example; // String | 
var orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword_example; // String | 
var orgApacheFelixHttpsTruststorePassword@TypeHint = orgApacheFelixHttpsTruststorePassword@TypeHint_example; // String | 
var orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate_example; // String | 
var orgApacheFelixHttpsClientcertificate@TypeHint = orgApacheFelixHttpsClientcertificate@TypeHint_example; // String | 
var orgApacheFelixHttpsEnable = true; // bool | 
var orgApacheFelixHttpsEnable@TypeHint = orgApacheFelixHttpsEnable@TypeHint_example; // String | 
var orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure_example; // String | 
var orgOsgiServiceHttpPortSecure@TypeHint = orgOsgiServiceHttpPortSecure@TypeHint_example; // String | 

try { 
    api_instance.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNio@TypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystore@TypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePassword@TypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKey@TypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPassword@TypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststore@TypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePassword@TypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificate@TypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnable@TypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecure@TypeHint);
} catch (e) {
    print("Exception when calling SlingApi->postConfigApacheFelixJettyBasedHttpService: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **bool**|  | [optional] 
 **orgApacheFelixHttpsNio@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystore** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystore@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystorePassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystorePassword@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKey** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKey@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPassword@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststore** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststore@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststorePassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststorePassword@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsClientcertificate** | **String**|  | [optional] 
 **orgApacheFelixHttpsClientcertificate@TypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsEnable** | **bool**|  | [optional] 
 **orgApacheFelixHttpsEnable@TypeHint** | **String**|  | [optional] 
 **orgOsgiServiceHttpPortSecure** | **String**|  | [optional] 
 **orgOsgiServiceHttpPortSecure@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHost@TypeHint, proxyPort, proxyPort@TypeHint, proxyExceptions, proxyExceptions@TypeHint, proxyEnabled, proxyEnabled@TypeHint, proxyUser, proxyUser@TypeHint, proxyPassword, proxyPassword@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var proxyHost = proxyHost_example; // String | 
var proxyHost@TypeHint = proxyHost@TypeHint_example; // String | 
var proxyPort = 56; // int | 
var proxyPort@TypeHint = proxyPort@TypeHint_example; // String | 
var proxyExceptions = []; // List<String> | 
var proxyExceptions@TypeHint = proxyExceptions@TypeHint_example; // String | 
var proxyEnabled = true; // bool | 
var proxyEnabled@TypeHint = proxyEnabled@TypeHint_example; // String | 
var proxyUser = proxyUser_example; // String | 
var proxyUser@TypeHint = proxyUser@TypeHint_example; // String | 
var proxyPassword = proxyPassword_example; // String | 
var proxyPassword@TypeHint = proxyPassword@TypeHint_example; // String | 

try { 
    api_instance.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHost@TypeHint, proxyPort, proxyPort@TypeHint, proxyExceptions, proxyExceptions@TypeHint, proxyEnabled, proxyEnabled@TypeHint, proxyUser, proxyUser@TypeHint, proxyPassword, proxyPassword@TypeHint);
} catch (e) {
    print("Exception when calling SlingApi->postConfigApacheHttpComponentsProxyConfiguration: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **String**|  | [optional] 
 **proxyHost@TypeHint** | **String**|  | [optional] 
 **proxyPort** | **int**|  | [optional] 
 **proxyPort@TypeHint** | **String**|  | [optional] 
 **proxyExceptions** | [**List&lt;String&gt;**](String.md)|  | [optional] 
 **proxyExceptions@TypeHint** | **String**|  | [optional] 
 **proxyEnabled** | **bool**|  | [optional] 
 **proxyEnabled@TypeHint** | **String**|  | [optional] 
 **proxyUser** | **String**|  | [optional] 
 **proxyUser@TypeHint** | **String**|  | [optional] 
 **proxyPassword** | **String**|  | [optional] 
 **proxyPassword@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(alias, alias@TypeHint, davCreateAbsoluteUri, davCreateAbsoluteUri@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var alias = alias_example; // String | 
var alias@TypeHint = alias@TypeHint_example; // String | 
var davCreateAbsoluteUri = true; // bool | 
var davCreateAbsoluteUri@TypeHint = davCreateAbsoluteUri@TypeHint_example; // String | 

try { 
    api_instance.postConfigApacheSlingDavExServlet(alias, alias@TypeHint, davCreateAbsoluteUri, davCreateAbsoluteUri@TypeHint);
} catch (e) {
    print("Exception when calling SlingApi->postConfigApacheSlingDavExServlet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**|  | [optional] 
 **alias@TypeHint** | **String**|  | [optional] 
 **davCreateAbsoluteUri** | **bool**|  | [optional] 
 **davCreateAbsoluteUri@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresults@TypeHint, enableHtml, enableHtml@TypeHint, enableTxt, enableTxt@TypeHint, enableXml, enableXml@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var jsonMaximumresults = jsonMaximumresults_example; // String | 
var jsonMaximumresults@TypeHint = jsonMaximumresults@TypeHint_example; // String | 
var enableHtml = true; // bool | 
var enableHtml@TypeHint = enableHtml@TypeHint_example; // String | 
var enableTxt = true; // bool | 
var enableTxt@TypeHint = enableTxt@TypeHint_example; // String | 
var enableXml = true; // bool | 
var enableXml@TypeHint = enableXml@TypeHint_example; // String | 

try { 
    api_instance.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresults@TypeHint, enableHtml, enableHtml@TypeHint, enableTxt, enableTxt@TypeHint, enableXml, enableXml@TypeHint);
} catch (e) {
    print("Exception when calling SlingApi->postConfigApacheSlingGetServlet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **String**|  | [optional] 
 **jsonMaximumresults@TypeHint** | **String**|  | [optional] 
 **enableHtml** | **bool**|  | [optional] 
 **enableHtml@TypeHint** | **String**|  | [optional] 
 **enableTxt** | **bool**|  | [optional] 
 **enableTxt@TypeHint** | **String**|  | [optional] 
 **enableXml** | **bool**|  | [optional] 
 **enableXml@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(allowEmpty, allowEmpty@TypeHint, allowHosts, allowHosts@TypeHint, allowHostsRegexp, allowHostsRegexp@TypeHint, filterMethods, filterMethods@TypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var allowEmpty = true; // bool | 
var allowEmpty@TypeHint = allowEmpty@TypeHint_example; // String | 
var allowHosts = allowHosts_example; // String | 
var allowHosts@TypeHint = allowHosts@TypeHint_example; // String | 
var allowHostsRegexp = allowHostsRegexp_example; // String | 
var allowHostsRegexp@TypeHint = allowHostsRegexp@TypeHint_example; // String | 
var filterMethods = filterMethods_example; // String | 
var filterMethods@TypeHint = filterMethods@TypeHint_example; // String | 

try { 
    api_instance.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmpty@TypeHint, allowHosts, allowHosts@TypeHint, allowHostsRegexp, allowHostsRegexp@TypeHint, filterMethods, filterMethods@TypeHint);
} catch (e) {
    print("Exception when calling SlingApi->postConfigApacheSlingReferrerFilter: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **bool**|  | [optional] 
 **allowEmpty@TypeHint** | **String**|  | [optional] 
 **allowHosts** | **String**|  | [optional] 
 **allowHosts@TypeHint** | **String**|  | [optional] 
 **allowHostsRegexp** | **String**|  | [optional] 
 **allowHostsRegexp@TypeHint** | **String**|  | [optional] 
 **filterMethods** | **String**|  | [optional] 
 **filterMethods@TypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNode**
> postNode(path, name, :operation, deleteAuthorizable, file)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var path = path_example; // String | 
var name = name_example; // String | 
var :operation = :operation_example; // String | 
var deleteAuthorizable = deleteAuthorizable_example; // String | 
var file = BINARY_DATA_HERE; // MultipartFile | 

try { 
    api_instance.postNode(path, name, :operation, deleteAuthorizable, file);
} catch (e) {
    print("Exception when calling SlingApi->postNode: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **:operation** | **String**|  | [optional] 
 **deleteAuthorizable** | **String**|  | [optional] 
 **file** | **MultipartFile**|  | [optional] [default to null]

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNodeRw**
> postNodeRw(path, name, addMembers)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var path = path_example; // String | 
var name = name_example; // String | 
var addMembers = addMembers_example; // String | 

try { 
    api_instance.postNodeRw(path, name, addMembers);
} catch (e) {
    print("Exception when calling SlingApi->postNodeRw: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **addMembers** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPath**
> postPath(path, jcr:primaryType, :name)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var path = path_example; // String | 
var jcr:primaryType = jcr:primaryType_example; // String | 
var :name = :name_example; // String | 

try { 
    api_instance.postPath(path, jcr:primaryType, :name);
} catch (e) {
    print("Exception when calling SlingApi->postPath: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **jcr:primaryType** | **String**|  | 
 **:name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postQuery**
> String postQuery(path, pLimit, n1property, n1propertyValue)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var path = path_example; // String | 
var pLimit = 1.2; // num | 
var n1property = n1property_example; // String | 
var n1propertyValue = n1propertyValue_example; // String | 

try { 
    var result = api_instance.postQuery(path, pLimit, n1property, n1propertyValue);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->postQuery: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pLimit** | **num**|  | 
 **n1property** | **String**|  | 
 **n1propertyValue** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTreeActivation**
> postTreeActivation(ignoredeactivated, onlymodified, path)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var ignoredeactivated = true; // bool | 
var onlymodified = true; // bool | 
var path = path_example; // String | 

try { 
    api_instance.postTreeActivation(ignoredeactivated, onlymodified, path);
} catch (e) {
    print("Exception when calling SlingApi->postTreeActivation: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **bool**|  | 
 **onlymodified** | **bool**|  | 
 **path** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststore**
> String postTruststore(:operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var :operation = :operation_example; // String | 
var newPassword = newPassword_example; // String | 
var rePassword = rePassword_example; // String | 
var keyStoreType = keyStoreType_example; // String | 
var removeAlias = removeAlias_example; // String | 
var certificate = BINARY_DATA_HERE; // MultipartFile | 

try { 
    var result = api_instance.postTruststore(:operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->postTruststore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **:operation** | **String**|  | [optional] 
 **newPassword** | **String**|  | [optional] 
 **rePassword** | **String**|  | [optional] 
 **keyStoreType** | **String**|  | [optional] 
 **removeAlias** | **String**|  | [optional] 
 **certificate** | **MultipartFile**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststorePKCS12**
> String postTruststorePKCS12(truststoreP12)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SlingApi();
var truststoreP12 = BINARY_DATA_HERE; // MultipartFile | 

try { 
    var result = api_instance.postTruststorePKCS12(truststoreP12);
    print(result);
} catch (e) {
    print("Exception when calling SlingApi->postTruststorePKCS12: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **MultipartFile**|  | [optional] [default to null]

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

