# openapi.api.SlingApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deletenode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getnode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getquery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#gettruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](SlingApi.md#postconfigproperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](SlingApi.md#postnode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postpath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postquery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#posttreeactivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore | 


# **deleteAgent**
> deleteAgent(runmode, name)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final runmode = runmode_example; // String | 
final name = name_example; // String | 

try { 
    api_instance.deleteAgent(runmode, name);
} catch (e) {
    print('Exception when calling SlingApi->deleteAgent: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final path = path_example; // String | 
final name = name_example; // String | 

try { 
    api_instance.deleteNode(path, name);
} catch (e) {
    print('Exception when calling SlingApi->deleteNode: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final runmode = runmode_example; // String | 
final name = name_example; // String | 

try { 
    api_instance.getAgent(runmode, name);
} catch (e) {
    print('Exception when calling SlingApi->getAgent: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final runmode = runmode_example; // String | 

try { 
    final result = api_instance.getAgents(runmode);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getAgents: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final intermediatePath = intermediatePath_example; // String | 
final authorizableId = authorizableId_example; // String | 

try { 
    final result = api_instance.getAuthorizableKeystore(intermediatePath, authorizableId);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getAuthorizableKeystore: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final intermediatePath = intermediatePath_example; // String | 
final authorizableId = authorizableId_example; // String | 

try { 
    final result = api_instance.getKeystore(intermediatePath, authorizableId);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getKeystore: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 

### Return type

[**MultipartFile**](MultipartFile.md)

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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final path = path_example; // String | 
final name = name_example; // String | 

try { 
    api_instance.getNode(path, name);
} catch (e) {
    print('Exception when calling SlingApi->getNode: $e\n');
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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final group = group_example; // String | 
final name = name_example; // String | 
final version = version_example; // String | 

try { 
    final result = api_instance.getPackage(group, name, version);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getPackage: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

[**MultipartFile**](MultipartFile.md)

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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final group = group_example; // String | 
final name = name_example; // String | 
final version = version_example; // String | 

try { 
    final result = api_instance.getPackageFilter(group, name, version);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getPackageFilter: $e\n');
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
> String getQuery(path, pPeriodLimit, n1property, n1propertyPeriodValue)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final path = path_example; // String | 
final pPeriodLimit = 8.14; // num | 
final n1property = n1property_example; // String | 
final n1propertyPeriodValue = n1propertyPeriodValue_example; // String | 

try { 
    final result = api_instance.getQuery(path, pPeriodLimit, n1property, n1propertyPeriodValue);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getQuery: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pPeriodLimit** | **num**|  | 
 **n1property** | **String**|  | 
 **n1propertyPeriodValue** | **String**|  | 

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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();

try { 
    final result = api_instance.getTruststore();
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getTruststore: $e\n');
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MultipartFile**](MultipartFile.md)

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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();

try { 
    final result = api_instance.getTruststoreInfo();
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->getTruststoreInfo: $e\n');
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
> postAgent(runmode, name, jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate, jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId, jcrColonPrimaryType, colonOperation)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final runmode = runmode_example; // String | 
final name = name_example; // String | 
final jcrColonContentSlashCqColonDistribute = true; // bool | 
final jcrColonContentSlashCqColonDistributeAtTypeHint = jcrColonContentSlashCqColonDistributeAtTypeHint_example; // String | 
final jcrColonContentSlashCqColonName = jcrColonContentSlashCqColonName_example; // String | 
final jcrColonContentSlashCqColonTemplate = jcrColonContentSlashCqColonTemplate_example; // String | 
final jcrColonContentSlashEnabled = true; // bool | 
final jcrColonContentSlashJcrColonDescription = jcrColonContentSlashJcrColonDescription_example; // String | 
final jcrColonContentSlashJcrColonLastModified = jcrColonContentSlashJcrColonLastModified_example; // String | 
final jcrColonContentSlashJcrColonLastModifiedBy = jcrColonContentSlashJcrColonLastModifiedBy_example; // String | 
final jcrColonContentSlashJcrColonMixinTypes = jcrColonContentSlashJcrColonMixinTypes_example; // String | 
final jcrColonContentSlashJcrColonTitle = jcrColonContentSlashJcrColonTitle_example; // String | 
final jcrColonContentSlashLogLevel = jcrColonContentSlashLogLevel_example; // String | 
final jcrColonContentSlashNoStatusUpdate = true; // bool | 
final jcrColonContentSlashNoVersioning = true; // bool | 
final jcrColonContentSlashProtocolConnectTimeout = 8.14; // num | 
final jcrColonContentSlashProtocolHTTPConnectionClosed = true; // bool | 
final jcrColonContentSlashProtocolHTTPExpired = jcrColonContentSlashProtocolHTTPExpired_example; // String | 
final jcrColonContentSlashProtocolHTTPHeaders = []; // List<String> | 
final jcrColonContentSlashProtocolHTTPHeadersAtTypeHint = jcrColonContentSlashProtocolHTTPHeadersAtTypeHint_example; // String | 
final jcrColonContentSlashProtocolHTTPMethod = jcrColonContentSlashProtocolHTTPMethod_example; // String | 
final jcrColonContentSlashProtocolHTTPSRelaxed = true; // bool | 
final jcrColonContentSlashProtocolInterface = jcrColonContentSlashProtocolInterface_example; // String | 
final jcrColonContentSlashProtocolSocketTimeout = 8.14; // num | 
final jcrColonContentSlashProtocolVersion = jcrColonContentSlashProtocolVersion_example; // String | 
final jcrColonContentSlashProxyNTLMDomain = jcrColonContentSlashProxyNTLMDomain_example; // String | 
final jcrColonContentSlashProxyNTLMHost = jcrColonContentSlashProxyNTLMHost_example; // String | 
final jcrColonContentSlashProxyHost = jcrColonContentSlashProxyHost_example; // String | 
final jcrColonContentSlashProxyPassword = jcrColonContentSlashProxyPassword_example; // String | 
final jcrColonContentSlashProxyPort = 8.14; // num | 
final jcrColonContentSlashProxyUser = jcrColonContentSlashProxyUser_example; // String | 
final jcrColonContentSlashQueueBatchMaxSize = 8.14; // num | 
final jcrColonContentSlashQueueBatchMode = jcrColonContentSlashQueueBatchMode_example; // String | 
final jcrColonContentSlashQueueBatchWaitTime = 8.14; // num | 
final jcrColonContentSlashRetryDelay = jcrColonContentSlashRetryDelay_example; // String | 
final jcrColonContentSlashReverseReplication = true; // bool | 
final jcrColonContentSlashSerializationType = jcrColonContentSlashSerializationType_example; // String | 
final jcrColonContentSlashSlingColonResourceType = jcrColonContentSlashSlingColonResourceType_example; // String | 
final jcrColonContentSlashSsl = jcrColonContentSlashSsl_example; // String | 
final jcrColonContentSlashTransportNTLMDomain = jcrColonContentSlashTransportNTLMDomain_example; // String | 
final jcrColonContentSlashTransportNTLMHost = jcrColonContentSlashTransportNTLMHost_example; // String | 
final jcrColonContentSlashTransportPassword = jcrColonContentSlashTransportPassword_example; // String | 
final jcrColonContentSlashTransportUri = jcrColonContentSlashTransportUri_example; // String | 
final jcrColonContentSlashTransportUser = jcrColonContentSlashTransportUser_example; // String | 
final jcrColonContentSlashTriggerDistribute = true; // bool | 
final jcrColonContentSlashTriggerModified = true; // bool | 
final jcrColonContentSlashTriggerOnOffTime = true; // bool | 
final jcrColonContentSlashTriggerReceive = true; // bool | 
final jcrColonContentSlashTriggerSpecific = true; // bool | 
final jcrColonContentSlashUserId = jcrColonContentSlashUserId_example; // String | 
final jcrColonPrimaryType = jcrColonPrimaryType_example; // String | 
final colonOperation = colonOperation_example; // String | 

try { 
    api_instance.postAgent(runmode, name, jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate, jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId, jcrColonPrimaryType, colonOperation);
} catch (e) {
    print('Exception when calling SlingApi->postAgent: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
 **jcrColonContentSlashCqColonDistribute** | **bool**|  | [optional] 
 **jcrColonContentSlashCqColonDistributeAtTypeHint** | **String**|  | [optional] 
 **jcrColonContentSlashCqColonName** | **String**|  | [optional] 
 **jcrColonContentSlashCqColonTemplate** | **String**|  | [optional] 
 **jcrColonContentSlashEnabled** | **bool**|  | [optional] 
 **jcrColonContentSlashJcrColonDescription** | **String**|  | [optional] 
 **jcrColonContentSlashJcrColonLastModified** | **String**|  | [optional] 
 **jcrColonContentSlashJcrColonLastModifiedBy** | **String**|  | [optional] 
 **jcrColonContentSlashJcrColonMixinTypes** | **String**|  | [optional] 
 **jcrColonContentSlashJcrColonTitle** | **String**|  | [optional] 
 **jcrColonContentSlashLogLevel** | **String**|  | [optional] 
 **jcrColonContentSlashNoStatusUpdate** | **bool**|  | [optional] 
 **jcrColonContentSlashNoVersioning** | **bool**|  | [optional] 
 **jcrColonContentSlashProtocolConnectTimeout** | **num**|  | [optional] 
 **jcrColonContentSlashProtocolHTTPConnectionClosed** | **bool**|  | [optional] 
 **jcrColonContentSlashProtocolHTTPExpired** | **String**|  | [optional] 
 **jcrColonContentSlashProtocolHTTPHeaders** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **jcrColonContentSlashProtocolHTTPHeadersAtTypeHint** | **String**|  | [optional] 
 **jcrColonContentSlashProtocolHTTPMethod** | **String**|  | [optional] 
 **jcrColonContentSlashProtocolHTTPSRelaxed** | **bool**|  | [optional] 
 **jcrColonContentSlashProtocolInterface** | **String**|  | [optional] 
 **jcrColonContentSlashProtocolSocketTimeout** | **num**|  | [optional] 
 **jcrColonContentSlashProtocolVersion** | **String**|  | [optional] 
 **jcrColonContentSlashProxyNTLMDomain** | **String**|  | [optional] 
 **jcrColonContentSlashProxyNTLMHost** | **String**|  | [optional] 
 **jcrColonContentSlashProxyHost** | **String**|  | [optional] 
 **jcrColonContentSlashProxyPassword** | **String**|  | [optional] 
 **jcrColonContentSlashProxyPort** | **num**|  | [optional] 
 **jcrColonContentSlashProxyUser** | **String**|  | [optional] 
 **jcrColonContentSlashQueueBatchMaxSize** | **num**|  | [optional] 
 **jcrColonContentSlashQueueBatchMode** | **String**|  | [optional] 
 **jcrColonContentSlashQueueBatchWaitTime** | **num**|  | [optional] 
 **jcrColonContentSlashRetryDelay** | **String**|  | [optional] 
 **jcrColonContentSlashReverseReplication** | **bool**|  | [optional] 
 **jcrColonContentSlashSerializationType** | **String**|  | [optional] 
 **jcrColonContentSlashSlingColonResourceType** | **String**|  | [optional] 
 **jcrColonContentSlashSsl** | **String**|  | [optional] 
 **jcrColonContentSlashTransportNTLMDomain** | **String**|  | [optional] 
 **jcrColonContentSlashTransportNTLMHost** | **String**|  | [optional] 
 **jcrColonContentSlashTransportPassword** | **String**|  | [optional] 
 **jcrColonContentSlashTransportUri** | **String**|  | [optional] 
 **jcrColonContentSlashTransportUser** | **String**|  | [optional] 
 **jcrColonContentSlashTriggerDistribute** | **bool**|  | [optional] 
 **jcrColonContentSlashTriggerModified** | **bool**|  | [optional] 
 **jcrColonContentSlashTriggerOnOffTime** | **bool**|  | [optional] 
 **jcrColonContentSlashTriggerReceive** | **bool**|  | [optional] 
 **jcrColonContentSlashTriggerSpecific** | **bool**|  | [optional] 
 **jcrColonContentSlashUserId** | **String**|  | [optional] 
 **jcrColonPrimaryType** | **String**|  | [optional] 
 **colonOperation** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final intermediatePath = intermediatePath_example; // String | 
final authorizableId = authorizableId_example; // String | 
final colonOperation = colonOperation_example; // String | 
final currentPassword = currentPassword_example; // String | 
final newPassword = newPassword_example; // String | 
final rePassword = rePassword_example; // String | 
final keyPassword = keyPassword_example; // String | 
final keyStorePass = keyStorePass_example; // String | 
final alias = alias_example; // String | 
final newAlias = newAlias_example; // String | 
final removeAlias = removeAlias_example; // String | 
final certChain = BINARY_DATA_HERE; // MultipartFile | 
final pk = BINARY_DATA_HERE; // MultipartFile | 
final keyStore = BINARY_DATA_HERE; // MultipartFile | 

try { 
    final result = api_instance.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->postAuthorizableKeystore: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String**|  | 
 **authorizableId** | **String**|  | 
 **colonOperation** | **String**|  | [optional] 
 **currentPassword** | **String**|  | [optional] 
 **newPassword** | **String**|  | [optional] 
 **rePassword** | **String**|  | [optional] 
 **keyPassword** | **String**|  | [optional] 
 **keyStorePass** | **String**|  | [optional] 
 **alias** | **String**|  | [optional] 
 **newAlias** | **String**|  | [optional] 
 **removeAlias** | **String**|  | [optional] 
 **certChain** | **MultipartFile**|  | [optional] 
 **pk** | **MultipartFile**|  | [optional] 
 **keyStore** | **MultipartFile**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizables**
> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileSlashGivenName)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final authorizableId = authorizableId_example; // String | 
final intermediatePath = intermediatePath_example; // String | 
final createUser = createUser_example; // String | 
final createGroup = createGroup_example; // String | 
final repColonPassword = repColonPassword_example; // String | 
final profileSlashGivenName = profileSlashGivenName_example; // String | 

try { 
    final result = api_instance.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileSlashGivenName);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->postAuthorizables: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  | 
 **intermediatePath** | **String**|  | 
 **createUser** | **String**|  | [optional] 
 **createGroup** | **String**|  | [optional] 
 **repColonPassword** | **String**|  | [optional] 
 **profileSlashGivenName** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodRanking, servicePeriodRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final keyStorePassword = keyStorePassword_example; // String | 
final keyStorePasswordAtTypeHint = keyStorePasswordAtTypeHint_example; // String | 
final servicePeriodRanking = 56; // int | 
final servicePeriodRankingAtTypeHint = servicePeriodRankingAtTypeHint_example; // String | 
final idpHttpRedirect = true; // bool | 
final idpHttpRedirectAtTypeHint = idpHttpRedirectAtTypeHint_example; // String | 
final createUser = true; // bool | 
final createUserAtTypeHint = createUserAtTypeHint_example; // String | 
final defaultRedirectUrl = defaultRedirectUrl_example; // String | 
final defaultRedirectUrlAtTypeHint = defaultRedirectUrlAtTypeHint_example; // String | 
final userIDAttribute = userIDAttribute_example; // String | 
final userIDAttributeAtTypeHint = userIDAttributeAtTypeHint_example; // String | 
final defaultGroups = []; // List<String> | 
final defaultGroupsAtTypeHint = defaultGroupsAtTypeHint_example; // String | 
final idpCertAlias = idpCertAlias_example; // String | 
final idpCertAliasAtTypeHint = idpCertAliasAtTypeHint_example; // String | 
final addGroupMemberships = true; // bool | 
final addGroupMembershipsAtTypeHint = addGroupMembershipsAtTypeHint_example; // String | 
final path = []; // List<String> | 
final pathAtTypeHint = pathAtTypeHint_example; // String | 
final synchronizeAttributes = []; // List<String> | 
final synchronizeAttributesAtTypeHint = synchronizeAttributesAtTypeHint_example; // String | 
final clockTolerance = 56; // int | 
final clockToleranceAtTypeHint = clockToleranceAtTypeHint_example; // String | 
final groupMembershipAttribute = groupMembershipAttribute_example; // String | 
final groupMembershipAttributeAtTypeHint = groupMembershipAttributeAtTypeHint_example; // String | 
final idpUrl = idpUrl_example; // String | 
final idpUrlAtTypeHint = idpUrlAtTypeHint_example; // String | 
final logoutUrl = logoutUrl_example; // String | 
final logoutUrlAtTypeHint = logoutUrlAtTypeHint_example; // String | 
final serviceProviderEntityId = serviceProviderEntityId_example; // String | 
final serviceProviderEntityIdAtTypeHint = serviceProviderEntityIdAtTypeHint_example; // String | 
final assertionConsumerServiceURL = assertionConsumerServiceURL_example; // String | 
final assertionConsumerServiceURLAtTypeHint = assertionConsumerServiceURLAtTypeHint_example; // String | 
final handleLogout = true; // bool | 
final handleLogoutAtTypeHint = handleLogoutAtTypeHint_example; // String | 
final spPrivateKeyAlias = spPrivateKeyAlias_example; // String | 
final spPrivateKeyAliasAtTypeHint = spPrivateKeyAliasAtTypeHint_example; // String | 
final useEncryption = true; // bool | 
final useEncryptionAtTypeHint = useEncryptionAtTypeHint_example; // String | 
final nameIdFormat = nameIdFormat_example; // String | 
final nameIdFormatAtTypeHint = nameIdFormatAtTypeHint_example; // String | 
final digestMethod = digestMethod_example; // String | 
final digestMethodAtTypeHint = digestMethodAtTypeHint_example; // String | 
final signatureMethod = signatureMethod_example; // String | 
final signatureMethodAtTypeHint = signatureMethodAtTypeHint_example; // String | 
final userIntermediatePath = userIntermediatePath_example; // String | 
final userIntermediatePathAtTypeHint = userIntermediatePathAtTypeHint_example; // String | 

try { 
    api_instance.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodRanking, servicePeriodRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);
} catch (e) {
    print('Exception when calling SlingApi->postConfigAdobeGraniteSamlAuthenticationHandler: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **String**|  | [optional] 
 **keyStorePasswordAtTypeHint** | **String**|  | [optional] 
 **servicePeriodRanking** | **int**|  | [optional] 
 **servicePeriodRankingAtTypeHint** | **String**|  | [optional] 
 **idpHttpRedirect** | **bool**|  | [optional] 
 **idpHttpRedirectAtTypeHint** | **String**|  | [optional] 
 **createUser** | **bool**|  | [optional] 
 **createUserAtTypeHint** | **String**|  | [optional] 
 **defaultRedirectUrl** | **String**|  | [optional] 
 **defaultRedirectUrlAtTypeHint** | **String**|  | [optional] 
 **userIDAttribute** | **String**|  | [optional] 
 **userIDAttributeAtTypeHint** | **String**|  | [optional] 
 **defaultGroups** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **defaultGroupsAtTypeHint** | **String**|  | [optional] 
 **idpCertAlias** | **String**|  | [optional] 
 **idpCertAliasAtTypeHint** | **String**|  | [optional] 
 **addGroupMemberships** | **bool**|  | [optional] 
 **addGroupMembershipsAtTypeHint** | **String**|  | [optional] 
 **path** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **pathAtTypeHint** | **String**|  | [optional] 
 **synchronizeAttributes** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **synchronizeAttributesAtTypeHint** | **String**|  | [optional] 
 **clockTolerance** | **int**|  | [optional] 
 **clockToleranceAtTypeHint** | **String**|  | [optional] 
 **groupMembershipAttribute** | **String**|  | [optional] 
 **groupMembershipAttributeAtTypeHint** | **String**|  | [optional] 
 **idpUrl** | **String**|  | [optional] 
 **idpUrlAtTypeHint** | **String**|  | [optional] 
 **logoutUrl** | **String**|  | [optional] 
 **logoutUrlAtTypeHint** | **String**|  | [optional] 
 **serviceProviderEntityId** | **String**|  | [optional] 
 **serviceProviderEntityIdAtTypeHint** | **String**|  | [optional] 
 **assertionConsumerServiceURL** | **String**|  | [optional] 
 **assertionConsumerServiceURLAtTypeHint** | **String**|  | [optional] 
 **handleLogout** | **bool**|  | [optional] 
 **handleLogoutAtTypeHint** | **String**|  | [optional] 
 **spPrivateKeyAlias** | **String**|  | [optional] 
 **spPrivateKeyAliasAtTypeHint** | **String**|  | [optional] 
 **useEncryption** | **bool**|  | [optional] 
 **useEncryptionAtTypeHint** | **String**|  | [optional] 
 **nameIdFormat** | **String**|  | [optional] 
 **nameIdFormatAtTypeHint** | **String**|  | [optional] 
 **digestMethod** | **String**|  | [optional] 
 **digestMethodAtTypeHint** | **String**|  | [optional] 
 **signatureMethod** | **String**|  | [optional] 
 **signatureMethodAtTypeHint** | **String**|  | [optional] 
 **userIntermediatePath** | **String**|  | [optional] 
 **userIntermediatePathAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final orgPeriodApachePeriodFelixPeriodHttpsPeriodNio = true; // bool | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore = orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword = orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate = orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint_example; // String | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable = true; // bool | 
final orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint = orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint_example; // String | 
final orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure = orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure_example; // String | 
final orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint = orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint_example; // String | 

try { 
    api_instance.postConfigApacheFelixJettyBasedHttpService(orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint);
} catch (e) {
    print('Exception when calling SlingApi->postConfigApacheFelixJettyBasedHttpService: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodNio** | **bool**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint** | **String**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable** | **bool**|  | [optional] 
 **orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint** | **String**|  | [optional] 
 **orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure** | **String**|  | [optional] 
 **orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodHost, proxyPeriodHostAtTypeHint, proxyPeriodPort, proxyPeriodPortAtTypeHint, proxyPeriodExceptions, proxyPeriodExceptionsAtTypeHint, proxyPeriodEnabled, proxyPeriodEnabledAtTypeHint, proxyPeriodUser, proxyPeriodUserAtTypeHint, proxyPeriodPassword, proxyPeriodPasswordAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final proxyPeriodHost = proxyPeriodHost_example; // String | 
final proxyPeriodHostAtTypeHint = proxyPeriodHostAtTypeHint_example; // String | 
final proxyPeriodPort = 56; // int | 
final proxyPeriodPortAtTypeHint = proxyPeriodPortAtTypeHint_example; // String | 
final proxyPeriodExceptions = []; // List<String> | 
final proxyPeriodExceptionsAtTypeHint = proxyPeriodExceptionsAtTypeHint_example; // String | 
final proxyPeriodEnabled = true; // bool | 
final proxyPeriodEnabledAtTypeHint = proxyPeriodEnabledAtTypeHint_example; // String | 
final proxyPeriodUser = proxyPeriodUser_example; // String | 
final proxyPeriodUserAtTypeHint = proxyPeriodUserAtTypeHint_example; // String | 
final proxyPeriodPassword = proxyPeriodPassword_example; // String | 
final proxyPeriodPasswordAtTypeHint = proxyPeriodPasswordAtTypeHint_example; // String | 

try { 
    api_instance.postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodHost, proxyPeriodHostAtTypeHint, proxyPeriodPort, proxyPeriodPortAtTypeHint, proxyPeriodExceptions, proxyPeriodExceptionsAtTypeHint, proxyPeriodEnabled, proxyPeriodEnabledAtTypeHint, proxyPeriodUser, proxyPeriodUserAtTypeHint, proxyPeriodPassword, proxyPeriodPasswordAtTypeHint);
} catch (e) {
    print('Exception when calling SlingApi->postConfigApacheHttpComponentsProxyConfiguration: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyPeriodHost** | **String**|  | [optional] 
 **proxyPeriodHostAtTypeHint** | **String**|  | [optional] 
 **proxyPeriodPort** | **int**|  | [optional] 
 **proxyPeriodPortAtTypeHint** | **String**|  | [optional] 
 **proxyPeriodExceptions** | [**List<String>**](String.md)|  | [optional] [default to const []]
 **proxyPeriodExceptionsAtTypeHint** | **String**|  | [optional] 
 **proxyPeriodEnabled** | **bool**|  | [optional] 
 **proxyPeriodEnabledAtTypeHint** | **String**|  | [optional] 
 **proxyPeriodUser** | **String**|  | [optional] 
 **proxyPeriodUserAtTypeHint** | **String**|  | [optional] 
 **proxyPeriodPassword** | **String**|  | [optional] 
 **proxyPeriodPasswordAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davPeriodCreateAbsoluteUri, davPeriodCreateAbsoluteUriAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final alias = alias_example; // String | 
final aliasAtTypeHint = aliasAtTypeHint_example; // String | 
final davPeriodCreateAbsoluteUri = true; // bool | 
final davPeriodCreateAbsoluteUriAtTypeHint = davPeriodCreateAbsoluteUriAtTypeHint_example; // String | 

try { 
    api_instance.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davPeriodCreateAbsoluteUri, davPeriodCreateAbsoluteUriAtTypeHint);
} catch (e) {
    print('Exception when calling SlingApi->postConfigApacheSlingDavExServlet: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**|  | [optional] 
 **aliasAtTypeHint** | **String**|  | [optional] 
 **davPeriodCreateAbsoluteUri** | **bool**|  | [optional] 
 **davPeriodCreateAbsoluteUriAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(jsonPeriodMaximumresults, jsonPeriodMaximumresultsAtTypeHint, enablePeriodHtml, enablePeriodHtmlAtTypeHint, enablePeriodTxt, enablePeriodTxtAtTypeHint, enablePeriodXml, enablePeriodXmlAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final jsonPeriodMaximumresults = jsonPeriodMaximumresults_example; // String | 
final jsonPeriodMaximumresultsAtTypeHint = jsonPeriodMaximumresultsAtTypeHint_example; // String | 
final enablePeriodHtml = true; // bool | 
final enablePeriodHtmlAtTypeHint = enablePeriodHtmlAtTypeHint_example; // String | 
final enablePeriodTxt = true; // bool | 
final enablePeriodTxtAtTypeHint = enablePeriodTxtAtTypeHint_example; // String | 
final enablePeriodXml = true; // bool | 
final enablePeriodXmlAtTypeHint = enablePeriodXmlAtTypeHint_example; // String | 

try { 
    api_instance.postConfigApacheSlingGetServlet(jsonPeriodMaximumresults, jsonPeriodMaximumresultsAtTypeHint, enablePeriodHtml, enablePeriodHtmlAtTypeHint, enablePeriodTxt, enablePeriodTxtAtTypeHint, enablePeriodXml, enablePeriodXmlAtTypeHint);
} catch (e) {
    print('Exception when calling SlingApi->postConfigApacheSlingGetServlet: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonPeriodMaximumresults** | **String**|  | [optional] 
 **jsonPeriodMaximumresultsAtTypeHint** | **String**|  | [optional] 
 **enablePeriodHtml** | **bool**|  | [optional] 
 **enablePeriodHtmlAtTypeHint** | **String**|  | [optional] 
 **enablePeriodTxt** | **bool**|  | [optional] 
 **enablePeriodTxtAtTypeHint** | **String**|  | [optional] 
 **enablePeriodXml** | **bool**|  | [optional] 
 **enablePeriodXmlAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(allowPeriodEmpty, allowPeriodEmptyAtTypeHint, allowPeriodHosts, allowPeriodHostsAtTypeHint, allowPeriodHostsPeriodRegexp, allowPeriodHostsPeriodRegexpAtTypeHint, filterPeriodMethods, filterPeriodMethodsAtTypeHint)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final allowPeriodEmpty = true; // bool | 
final allowPeriodEmptyAtTypeHint = allowPeriodEmptyAtTypeHint_example; // String | 
final allowPeriodHosts = allowPeriodHosts_example; // String | 
final allowPeriodHostsAtTypeHint = allowPeriodHostsAtTypeHint_example; // String | 
final allowPeriodHostsPeriodRegexp = allowPeriodHostsPeriodRegexp_example; // String | 
final allowPeriodHostsPeriodRegexpAtTypeHint = allowPeriodHostsPeriodRegexpAtTypeHint_example; // String | 
final filterPeriodMethods = filterPeriodMethods_example; // String | 
final filterPeriodMethodsAtTypeHint = filterPeriodMethodsAtTypeHint_example; // String | 

try { 
    api_instance.postConfigApacheSlingReferrerFilter(allowPeriodEmpty, allowPeriodEmptyAtTypeHint, allowPeriodHosts, allowPeriodHostsAtTypeHint, allowPeriodHostsPeriodRegexp, allowPeriodHostsPeriodRegexpAtTypeHint, filterPeriodMethods, filterPeriodMethodsAtTypeHint);
} catch (e) {
    print('Exception when calling SlingApi->postConfigApacheSlingReferrerFilter: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowPeriodEmpty** | **bool**|  | [optional] 
 **allowPeriodEmptyAtTypeHint** | **String**|  | [optional] 
 **allowPeriodHosts** | **String**|  | [optional] 
 **allowPeriodHostsAtTypeHint** | **String**|  | [optional] 
 **allowPeriodHostsPeriodRegexp** | **String**|  | [optional] 
 **allowPeriodHostsPeriodRegexpAtTypeHint** | **String**|  | [optional] 
 **filterPeriodMethods** | **String**|  | [optional] 
 **filterPeriodMethodsAtTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigProperty**
> postConfigProperty(configNodeName)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final configNodeName = configNodeName_example; // String | 

try { 
    api_instance.postConfigProperty(configNodeName);
} catch (e) {
    print('Exception when calling SlingApi->postConfigProperty: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNode**
> postNode(path, name, colonOperation, deleteAuthorizable, file)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final path = path_example; // String | 
final name = name_example; // String | 
final colonOperation = colonOperation_example; // String | 
final deleteAuthorizable = deleteAuthorizable_example; // String | 
final file = BINARY_DATA_HERE; // MultipartFile | 

try { 
    api_instance.postNode(path, name, colonOperation, deleteAuthorizable, file);
} catch (e) {
    print('Exception when calling SlingApi->postNode: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **colonOperation** | **String**|  | [optional] 
 **deleteAuthorizable** | **String**|  | [optional] 
 **file** | **MultipartFile**|  | [optional] 

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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final path = path_example; // String | 
final name = name_example; // String | 
final addMembers = addMembers_example; // String | 

try { 
    api_instance.postNodeRw(path, name, addMembers);
} catch (e) {
    print('Exception when calling SlingApi->postNodeRw: $e\n');
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
> postPath(path, jcrColonPrimaryType, colonName)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final path = path_example; // String | 
final jcrColonPrimaryType = jcrColonPrimaryType_example; // String | 
final colonName = colonName_example; // String | 

try { 
    api_instance.postPath(path, jcrColonPrimaryType, colonName);
} catch (e) {
    print('Exception when calling SlingApi->postPath: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **jcrColonPrimaryType** | **String**|  | 
 **colonName** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postQuery**
> String postQuery(path, pPeriodLimit, n1property, n1propertyPeriodValue)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final path = path_example; // String | 
final pPeriodLimit = 8.14; // num | 
final n1property = n1property_example; // String | 
final n1propertyPeriodValue = n1propertyPeriodValue_example; // String | 

try { 
    final result = api_instance.postQuery(path, pPeriodLimit, n1property, n1propertyPeriodValue);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->postQuery: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pPeriodLimit** | **num**|  | 
 **n1property** | **String**|  | 
 **n1propertyPeriodValue** | **String**|  | 

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
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final ignoredeactivated = true; // bool | 
final onlymodified = true; // bool | 
final path = path_example; // String | 

try { 
    api_instance.postTreeActivation(ignoredeactivated, onlymodified, path);
} catch (e) {
    print('Exception when calling SlingApi->postTreeActivation: $e\n');
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
> String postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final colonOperation = colonOperation_example; // String | 
final newPassword = newPassword_example; // String | 
final rePassword = rePassword_example; // String | 
final keyStoreType = keyStoreType_example; // String | 
final removeAlias = removeAlias_example; // String | 
final certificate = BINARY_DATA_HERE; // MultipartFile | 

try { 
    final result = api_instance.postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->postTruststore: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **colonOperation** | **String**|  | [optional] 
 **newPassword** | **String**|  | [optional] 
 **rePassword** | **String**|  | [optional] 
 **keyStoreType** | **String**|  | [optional] 
 **removeAlias** | **String**|  | [optional] 
 **certificate** | **MultipartFile**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststorePKCS12**
> String postTruststorePKCS12(truststorePeriodP12)



### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: aemAuth
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').username = 'YOUR_USERNAME'
//defaultApiClient.getAuthentication<HttpBasicAuth>('aemAuth').password = 'YOUR_PASSWORD';

final api_instance = SlingApi();
final truststorePeriodP12 = BINARY_DATA_HERE; // MultipartFile | 

try { 
    final result = api_instance.postTruststorePKCS12(truststorePeriodP12);
    print(result);
} catch (e) {
    print('Exception when calling SlingApi->postTruststorePKCS12: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststorePeriodP12** | **MultipartFile**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

