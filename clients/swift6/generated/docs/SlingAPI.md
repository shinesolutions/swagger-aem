# SlingAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingAPI.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingAPI.md#deletenode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingAPI.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingAPI.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingAPI.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingAPI.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingAPI.md#getnode) | **GET** /{path}/{name} | 
[**getPackage**](SlingAPI.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingAPI.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingAPI.md#getquery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingAPI.md#gettruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingAPI.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingAPI.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingAPI.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingAPI.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingAPI.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingAPI.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingAPI.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingAPI.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingAPI.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingAPI.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](SlingAPI.md#postconfigproperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](SlingAPI.md#postnode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingAPI.md#postnoderw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingAPI.md#postpath) | **POST** /{path}/ | 
[**postQuery**](SlingAPI.md#postquery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingAPI.md#posttreeactivation) | **POST** /libs/replication/treeactivation.html | 
[**postTruststore**](SlingAPI.md#posttruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingAPI.md#posttruststorepkcs12) | **POST** /etc/truststore | 


# **deleteAgent**
```swift
    open class func deleteAgent(runmode: String, name: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let runmode = "runmode_example" // String | 
let name = "name_example" // String | 

SlingAPI.deleteAgent(runmode: runmode, name: name) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String** |  | 
 **name** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteNode**
```swift
    open class func deleteNode(path: String, name: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let name = "name_example" // String | 

SlingAPI.deleteNode(path: path, name: name) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** |  | 
 **name** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAgent**
```swift
    open class func getAgent(runmode: String, name: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let runmode = "runmode_example" // String | 
let name = "name_example" // String | 

SlingAPI.getAgent(runmode: runmode, name: name) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String** |  | 
 **name** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAgents**
```swift
    open class func getAgents(runmode: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let runmode = "runmode_example" // String | 

SlingAPI.getAgents(runmode: runmode) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String** |  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAuthorizableKeystore**
```swift
    open class func getAuthorizableKeystore(intermediatePath: String, authorizableId: String, completion: @escaping (_ data: KeystoreInfo?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let intermediatePath = "intermediatePath_example" // String | 
let authorizableId = "authorizableId_example" // String | 

SlingAPI.getAuthorizableKeystore(intermediatePath: intermediatePath, authorizableId: authorizableId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String** |  | 
 **authorizableId** | **String** |  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getKeystore**
```swift
    open class func getKeystore(intermediatePath: String, authorizableId: String, completion: @escaping (_ data: URL?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let intermediatePath = "intermediatePath_example" // String | 
let authorizableId = "authorizableId_example" // String | 

SlingAPI.getKeystore(intermediatePath: intermediatePath, authorizableId: authorizableId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String** |  | 
 **authorizableId** | **String** |  | 

### Return type

**URL**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNode**
```swift
    open class func getNode(path: String, name: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let name = "name_example" // String | 

SlingAPI.getNode(path: path, name: name) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** |  | 
 **name** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackage**
```swift
    open class func getPackage(group: String, name: String, version: String, completion: @escaping (_ data: URL?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let group = "group_example" // String | 
let name = "name_example" // String | 
let version = "version_example" // String | 

SlingAPI.getPackage(group: group, name: name, version: version) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String** |  | 
 **name** | **String** |  | 
 **version** | **String** |  | 

### Return type

**URL**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageFilter**
```swift
    open class func getPackageFilter(group: String, name: String, version: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let group = "group_example" // String | 
let name = "name_example" // String | 
let version = "version_example" // String | 

SlingAPI.getPackageFilter(group: group, name: name, version: version) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String** |  | 
 **name** | **String** |  | 
 **version** | **String** |  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getQuery**
```swift
    open class func getQuery(path: String, pLimit: Double, _1property: String, _1propertyValue: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let pLimit = 987 // Double | 
let _1property = "_1property_example" // String | 
let _1propertyValue = "_1propertyValue_example" // String | 

SlingAPI.getQuery(path: path, pLimit: pLimit, _1property: _1property, _1propertyValue: _1propertyValue) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** |  | 
 **pLimit** | **Double** |  | 
 **_1property** | **String** |  | 
 **_1propertyValue** | **String** |  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststore**
```swift
    open class func getTruststore(completion: @escaping (_ data: URL?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


SlingAPI.getTruststore() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**URL**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststoreInfo**
```swift
    open class func getTruststoreInfo(completion: @escaping (_ data: TruststoreInfo?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


SlingAPI.getTruststoreInfo() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
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

# **postAgent**
```swift
    open class func postAgent(runmode: String, name: String, jcrContentCqDistribute: Bool? = nil, jcrContentCqDistributeTypeHint: String? = nil, jcrContentCqName: String? = nil, jcrContentCqTemplate: String? = nil, jcrContentAliasUpdate: Bool? = nil, jcrContentEnabled: Bool? = nil, jcrContentJcrDescription: String? = nil, jcrContentJcrLastModified: String? = nil, jcrContentJcrLastModifiedBy: String? = nil, jcrContentJcrMixinTypes: String? = nil, jcrContentJcrTitle: String? = nil, jcrContentLogLevel: String? = nil, jcrContentNoStatusUpdate: Bool? = nil, jcrContentNoVersioning: Bool? = nil, jcrContentProtocolConnectTimeout: Double? = nil, jcrContentProtocolHTTPConnectionClosed: Bool? = nil, jcrContentProtocolHTTPExpired: String? = nil, jcrContentProtocolHTTPHeaders: [String]? = nil, jcrContentProtocolHTTPHeadersTypeHint: String? = nil, jcrContentProtocolHTTPMethod: String? = nil, jcrContentProtocolHTTPSRelaxed: Bool? = nil, jcrContentProtocolInterface: String? = nil, jcrContentProtocolSocketTimeout: Double? = nil, jcrContentProtocolVersion: String? = nil, jcrContentProxyNTLMDomain: String? = nil, jcrContentProxyNTLMHost: String? = nil, jcrContentProxyHost: String? = nil, jcrContentProxyPassword: String? = nil, jcrContentProxyPort: Double? = nil, jcrContentProxyUser: String? = nil, jcrContentQueueBatchMaxSize: Double? = nil, jcrContentQueueBatchMode: String? = nil, jcrContentQueueBatchWaitTime: Double? = nil, jcrContentRetryDelay: String? = nil, jcrContentReverseReplication: Bool? = nil, jcrContentSerializationType: String? = nil, jcrContentSlingResourceType: String? = nil, jcrContentSsl: String? = nil, jcrContentTransportNTLMDomain: String? = nil, jcrContentTransportNTLMHost: String? = nil, jcrContentTransportPassword: String? = nil, jcrContentTransportUri: String? = nil, jcrContentTransportUser: String? = nil, jcrContentTriggerDistribute: Bool? = nil, jcrContentTriggerModified: Bool? = nil, jcrContentTriggerOnOffTime: Bool? = nil, jcrContentTriggerReceive: Bool? = nil, jcrContentTriggerSpecific: Bool? = nil, jcrContentUserId: String? = nil, jcrPrimaryType: String? = nil, operation: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let runmode = "runmode_example" // String | 
let name = "name_example" // String | 
let jcrContentCqDistribute = true // Bool |  (optional)
let jcrContentCqDistributeTypeHint = "jcrContentCqDistributeTypeHint_example" // String |  (optional)
let jcrContentCqName = "jcrContentCqName_example" // String |  (optional)
let jcrContentCqTemplate = "jcrContentCqTemplate_example" // String |  (optional)
let jcrContentAliasUpdate = true // Bool |  (optional)
let jcrContentEnabled = true // Bool |  (optional)
let jcrContentJcrDescription = "jcrContentJcrDescription_example" // String |  (optional)
let jcrContentJcrLastModified = "jcrContentJcrLastModified_example" // String |  (optional)
let jcrContentJcrLastModifiedBy = "jcrContentJcrLastModifiedBy_example" // String |  (optional)
let jcrContentJcrMixinTypes = "jcrContentJcrMixinTypes_example" // String |  (optional)
let jcrContentJcrTitle = "jcrContentJcrTitle_example" // String |  (optional)
let jcrContentLogLevel = "jcrContentLogLevel_example" // String |  (optional)
let jcrContentNoStatusUpdate = true // Bool |  (optional)
let jcrContentNoVersioning = true // Bool |  (optional)
let jcrContentProtocolConnectTimeout = 987 // Double |  (optional)
let jcrContentProtocolHTTPConnectionClosed = true // Bool |  (optional)
let jcrContentProtocolHTTPExpired = "jcrContentProtocolHTTPExpired_example" // String |  (optional)
let jcrContentProtocolHTTPHeaders = ["inner_example"] // [String] |  (optional)
let jcrContentProtocolHTTPHeadersTypeHint = "jcrContentProtocolHTTPHeadersTypeHint_example" // String |  (optional)
let jcrContentProtocolHTTPMethod = "jcrContentProtocolHTTPMethod_example" // String |  (optional)
let jcrContentProtocolHTTPSRelaxed = true // Bool |  (optional)
let jcrContentProtocolInterface = "jcrContentProtocolInterface_example" // String |  (optional)
let jcrContentProtocolSocketTimeout = 987 // Double |  (optional)
let jcrContentProtocolVersion = "jcrContentProtocolVersion_example" // String |  (optional)
let jcrContentProxyNTLMDomain = "jcrContentProxyNTLMDomain_example" // String |  (optional)
let jcrContentProxyNTLMHost = "jcrContentProxyNTLMHost_example" // String |  (optional)
let jcrContentProxyHost = "jcrContentProxyHost_example" // String |  (optional)
let jcrContentProxyPassword = "jcrContentProxyPassword_example" // String |  (optional)
let jcrContentProxyPort = 987 // Double |  (optional)
let jcrContentProxyUser = "jcrContentProxyUser_example" // String |  (optional)
let jcrContentQueueBatchMaxSize = 987 // Double |  (optional)
let jcrContentQueueBatchMode = "jcrContentQueueBatchMode_example" // String |  (optional)
let jcrContentQueueBatchWaitTime = 987 // Double |  (optional)
let jcrContentRetryDelay = "jcrContentRetryDelay_example" // String |  (optional)
let jcrContentReverseReplication = true // Bool |  (optional)
let jcrContentSerializationType = "jcrContentSerializationType_example" // String |  (optional)
let jcrContentSlingResourceType = "jcrContentSlingResourceType_example" // String |  (optional)
let jcrContentSsl = "jcrContentSsl_example" // String |  (optional)
let jcrContentTransportNTLMDomain = "jcrContentTransportNTLMDomain_example" // String |  (optional)
let jcrContentTransportNTLMHost = "jcrContentTransportNTLMHost_example" // String |  (optional)
let jcrContentTransportPassword = "jcrContentTransportPassword_example" // String |  (optional)
let jcrContentTransportUri = "jcrContentTransportUri_example" // String |  (optional)
let jcrContentTransportUser = "jcrContentTransportUser_example" // String |  (optional)
let jcrContentTriggerDistribute = true // Bool |  (optional)
let jcrContentTriggerModified = true // Bool |  (optional)
let jcrContentTriggerOnOffTime = true // Bool |  (optional)
let jcrContentTriggerReceive = true // Bool |  (optional)
let jcrContentTriggerSpecific = true // Bool |  (optional)
let jcrContentUserId = "jcrContentUserId_example" // String |  (optional)
let jcrPrimaryType = "jcrPrimaryType_example" // String |  (optional)
let operation = "operation_example" // String |  (optional)

SlingAPI.postAgent(runmode: runmode, name: name, jcrContentCqDistribute: jcrContentCqDistribute, jcrContentCqDistributeTypeHint: jcrContentCqDistributeTypeHint, jcrContentCqName: jcrContentCqName, jcrContentCqTemplate: jcrContentCqTemplate, jcrContentAliasUpdate: jcrContentAliasUpdate, jcrContentEnabled: jcrContentEnabled, jcrContentJcrDescription: jcrContentJcrDescription, jcrContentJcrLastModified: jcrContentJcrLastModified, jcrContentJcrLastModifiedBy: jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes: jcrContentJcrMixinTypes, jcrContentJcrTitle: jcrContentJcrTitle, jcrContentLogLevel: jcrContentLogLevel, jcrContentNoStatusUpdate: jcrContentNoStatusUpdate, jcrContentNoVersioning: jcrContentNoVersioning, jcrContentProtocolConnectTimeout: jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed: jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired: jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders: jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint: jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod: jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed: jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface: jcrContentProtocolInterface, jcrContentProtocolSocketTimeout: jcrContentProtocolSocketTimeout, jcrContentProtocolVersion: jcrContentProtocolVersion, jcrContentProxyNTLMDomain: jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost: jcrContentProxyNTLMHost, jcrContentProxyHost: jcrContentProxyHost, jcrContentProxyPassword: jcrContentProxyPassword, jcrContentProxyPort: jcrContentProxyPort, jcrContentProxyUser: jcrContentProxyUser, jcrContentQueueBatchMaxSize: jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode: jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime: jcrContentQueueBatchWaitTime, jcrContentRetryDelay: jcrContentRetryDelay, jcrContentReverseReplication: jcrContentReverseReplication, jcrContentSerializationType: jcrContentSerializationType, jcrContentSlingResourceType: jcrContentSlingResourceType, jcrContentSsl: jcrContentSsl, jcrContentTransportNTLMDomain: jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost: jcrContentTransportNTLMHost, jcrContentTransportPassword: jcrContentTransportPassword, jcrContentTransportUri: jcrContentTransportUri, jcrContentTransportUser: jcrContentTransportUser, jcrContentTriggerDistribute: jcrContentTriggerDistribute, jcrContentTriggerModified: jcrContentTriggerModified, jcrContentTriggerOnOffTime: jcrContentTriggerOnOffTime, jcrContentTriggerReceive: jcrContentTriggerReceive, jcrContentTriggerSpecific: jcrContentTriggerSpecific, jcrContentUserId: jcrContentUserId, jcrPrimaryType: jcrPrimaryType, operation: operation) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String** |  | 
 **name** | **String** |  | 
 **jcrContentCqDistribute** | **Bool** |  | [optional] 
 **jcrContentCqDistributeTypeHint** | **String** |  | [optional] 
 **jcrContentCqName** | **String** |  | [optional] 
 **jcrContentCqTemplate** | **String** |  | [optional] 
 **jcrContentAliasUpdate** | **Bool** |  | [optional] 
 **jcrContentEnabled** | **Bool** |  | [optional] 
 **jcrContentJcrDescription** | **String** |  | [optional] 
 **jcrContentJcrLastModified** | **String** |  | [optional] 
 **jcrContentJcrLastModifiedBy** | **String** |  | [optional] 
 **jcrContentJcrMixinTypes** | **String** |  | [optional] 
 **jcrContentJcrTitle** | **String** |  | [optional] 
 **jcrContentLogLevel** | **String** |  | [optional] 
 **jcrContentNoStatusUpdate** | **Bool** |  | [optional] 
 **jcrContentNoVersioning** | **Bool** |  | [optional] 
 **jcrContentProtocolConnectTimeout** | **Double** |  | [optional] 
 **jcrContentProtocolHTTPConnectionClosed** | **Bool** |  | [optional] 
 **jcrContentProtocolHTTPExpired** | **String** |  | [optional] 
 **jcrContentProtocolHTTPHeaders** | [**[String]**](String.md) |  | [optional] 
 **jcrContentProtocolHTTPHeadersTypeHint** | **String** |  | [optional] 
 **jcrContentProtocolHTTPMethod** | **String** |  | [optional] 
 **jcrContentProtocolHTTPSRelaxed** | **Bool** |  | [optional] 
 **jcrContentProtocolInterface** | **String** |  | [optional] 
 **jcrContentProtocolSocketTimeout** | **Double** |  | [optional] 
 **jcrContentProtocolVersion** | **String** |  | [optional] 
 **jcrContentProxyNTLMDomain** | **String** |  | [optional] 
 **jcrContentProxyNTLMHost** | **String** |  | [optional] 
 **jcrContentProxyHost** | **String** |  | [optional] 
 **jcrContentProxyPassword** | **String** |  | [optional] 
 **jcrContentProxyPort** | **Double** |  | [optional] 
 **jcrContentProxyUser** | **String** |  | [optional] 
 **jcrContentQueueBatchMaxSize** | **Double** |  | [optional] 
 **jcrContentQueueBatchMode** | **String** |  | [optional] 
 **jcrContentQueueBatchWaitTime** | **Double** |  | [optional] 
 **jcrContentRetryDelay** | **String** |  | [optional] 
 **jcrContentReverseReplication** | **Bool** |  | [optional] 
 **jcrContentSerializationType** | **String** |  | [optional] 
 **jcrContentSlingResourceType** | **String** |  | [optional] 
 **jcrContentSsl** | **String** |  | [optional] 
 **jcrContentTransportNTLMDomain** | **String** |  | [optional] 
 **jcrContentTransportNTLMHost** | **String** |  | [optional] 
 **jcrContentTransportPassword** | **String** |  | [optional] 
 **jcrContentTransportUri** | **String** |  | [optional] 
 **jcrContentTransportUser** | **String** |  | [optional] 
 **jcrContentTriggerDistribute** | **Bool** |  | [optional] 
 **jcrContentTriggerModified** | **Bool** |  | [optional] 
 **jcrContentTriggerOnOffTime** | **Bool** |  | [optional] 
 **jcrContentTriggerReceive** | **Bool** |  | [optional] 
 **jcrContentTriggerSpecific** | **Bool** |  | [optional] 
 **jcrContentUserId** | **String** |  | [optional] 
 **jcrPrimaryType** | **String** |  | [optional] 
 **operation** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizableKeystore**
```swift
    open class func postAuthorizableKeystore(intermediatePath: String, authorizableId: String, operation: String? = nil, currentPassword: String? = nil, newPassword: String? = nil, rePassword: String? = nil, keyPassword: String? = nil, keyStorePass: String? = nil, alias: String? = nil, newAlias: String? = nil, removeAlias: String? = nil, certChain: URL? = nil, pk: URL? = nil, keyStore: URL? = nil, completion: @escaping (_ data: KeystoreInfo?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let intermediatePath = "intermediatePath_example" // String | 
let authorizableId = "authorizableId_example" // String | 
let operation = "operation_example" // String |  (optional)
let currentPassword = "currentPassword_example" // String |  (optional)
let newPassword = "newPassword_example" // String |  (optional)
let rePassword = "rePassword_example" // String |  (optional)
let keyPassword = "keyPassword_example" // String |  (optional)
let keyStorePass = "keyStorePass_example" // String |  (optional)
let alias = "alias_example" // String |  (optional)
let newAlias = "newAlias_example" // String |  (optional)
let removeAlias = "removeAlias_example" // String |  (optional)
let certChain = URL(string: "https://example.com")! // URL |  (optional)
let pk = URL(string: "https://example.com")! // URL |  (optional)
let keyStore = URL(string: "https://example.com")! // URL |  (optional)

SlingAPI.postAuthorizableKeystore(intermediatePath: intermediatePath, authorizableId: authorizableId, operation: operation, currentPassword: currentPassword, newPassword: newPassword, rePassword: rePassword, keyPassword: keyPassword, keyStorePass: keyStorePass, alias: alias, newAlias: newAlias, removeAlias: removeAlias, certChain: certChain, pk: pk, keyStore: keyStore) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **String** |  | 
 **authorizableId** | **String** |  | 
 **operation** | **String** |  | [optional] 
 **currentPassword** | **String** |  | [optional] 
 **newPassword** | **String** |  | [optional] 
 **rePassword** | **String** |  | [optional] 
 **keyPassword** | **String** |  | [optional] 
 **keyStorePass** | **String** |  | [optional] 
 **alias** | **String** |  | [optional] 
 **newAlias** | **String** |  | [optional] 
 **removeAlias** | **String** |  | [optional] 
 **certChain** | **URL** |  | [optional] 
 **pk** | **URL** |  | [optional] 
 **keyStore** | **URL** |  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizables**
```swift
    open class func postAuthorizables(authorizableId: String, intermediatePath: String, createUser: String? = nil, createGroup: String? = nil, repPassword: String? = nil, profileGivenName: String? = nil, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let authorizableId = "authorizableId_example" // String | 
let intermediatePath = "intermediatePath_example" // String | 
let createUser = "createUser_example" // String |  (optional)
let createGroup = "createGroup_example" // String |  (optional)
let repPassword = "repPassword_example" // String |  (optional)
let profileGivenName = "profileGivenName_example" // String |  (optional)

SlingAPI.postAuthorizables(authorizableId: authorizableId, intermediatePath: intermediatePath, createUser: createUser, createGroup: createGroup, repPassword: repPassword, profileGivenName: profileGivenName) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String** |  | 
 **intermediatePath** | **String** |  | 
 **createUser** | **String** |  | [optional] 
 **createGroup** | **String** |  | [optional] 
 **repPassword** | **String** |  | [optional] 
 **profileGivenName** | **String** |  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
```swift
    open class func postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: String? = nil, keyStorePasswordTypeHint: String? = nil, serviceRanking: Int? = nil, serviceRankingTypeHint: String? = nil, idpHttpRedirect: Bool? = nil, idpHttpRedirectTypeHint: String? = nil, createUser: Bool? = nil, createUserTypeHint: String? = nil, defaultRedirectUrl: String? = nil, defaultRedirectUrlTypeHint: String? = nil, userIDAttribute: String? = nil, userIDAttributeTypeHint: String? = nil, defaultGroups: [String]? = nil, defaultGroupsTypeHint: String? = nil, idpCertAlias: String? = nil, idpCertAliasTypeHint: String? = nil, addGroupMemberships: Bool? = nil, addGroupMembershipsTypeHint: String? = nil, path: [String]? = nil, pathTypeHint: String? = nil, synchronizeAttributes: [String]? = nil, synchronizeAttributesTypeHint: String? = nil, clockTolerance: Int? = nil, clockToleranceTypeHint: String? = nil, groupMembershipAttribute: String? = nil, groupMembershipAttributeTypeHint: String? = nil, idpUrl: String? = nil, idpUrlTypeHint: String? = nil, logoutUrl: String? = nil, logoutUrlTypeHint: String? = nil, serviceProviderEntityId: String? = nil, serviceProviderEntityIdTypeHint: String? = nil, assertionConsumerServiceURL: String? = nil, assertionConsumerServiceURLTypeHint: String? = nil, handleLogout: Bool? = nil, handleLogoutTypeHint: String? = nil, spPrivateKeyAlias: String? = nil, spPrivateKeyAliasTypeHint: String? = nil, useEncryption: Bool? = nil, useEncryptionTypeHint: String? = nil, nameIdFormat: String? = nil, nameIdFormatTypeHint: String? = nil, digestMethod: String? = nil, digestMethodTypeHint: String? = nil, signatureMethod: String? = nil, signatureMethodTypeHint: String? = nil, userIntermediatePath: String? = nil, userIntermediatePathTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let keyStorePassword = "keyStorePassword_example" // String |  (optional)
let keyStorePasswordTypeHint = "keyStorePasswordTypeHint_example" // String |  (optional)
let serviceRanking = 987 // Int |  (optional)
let serviceRankingTypeHint = "serviceRankingTypeHint_example" // String |  (optional)
let idpHttpRedirect = true // Bool |  (optional)
let idpHttpRedirectTypeHint = "idpHttpRedirectTypeHint_example" // String |  (optional)
let createUser = true // Bool |  (optional)
let createUserTypeHint = "createUserTypeHint_example" // String |  (optional)
let defaultRedirectUrl = "defaultRedirectUrl_example" // String |  (optional)
let defaultRedirectUrlTypeHint = "defaultRedirectUrlTypeHint_example" // String |  (optional)
let userIDAttribute = "userIDAttribute_example" // String |  (optional)
let userIDAttributeTypeHint = "userIDAttributeTypeHint_example" // String |  (optional)
let defaultGroups = ["inner_example"] // [String] |  (optional)
let defaultGroupsTypeHint = "defaultGroupsTypeHint_example" // String |  (optional)
let idpCertAlias = "idpCertAlias_example" // String |  (optional)
let idpCertAliasTypeHint = "idpCertAliasTypeHint_example" // String |  (optional)
let addGroupMemberships = true // Bool |  (optional)
let addGroupMembershipsTypeHint = "addGroupMembershipsTypeHint_example" // String |  (optional)
let path = ["inner_example"] // [String] |  (optional)
let pathTypeHint = "pathTypeHint_example" // String |  (optional)
let synchronizeAttributes = ["inner_example"] // [String] |  (optional)
let synchronizeAttributesTypeHint = "synchronizeAttributesTypeHint_example" // String |  (optional)
let clockTolerance = 987 // Int |  (optional)
let clockToleranceTypeHint = "clockToleranceTypeHint_example" // String |  (optional)
let groupMembershipAttribute = "groupMembershipAttribute_example" // String |  (optional)
let groupMembershipAttributeTypeHint = "groupMembershipAttributeTypeHint_example" // String |  (optional)
let idpUrl = "idpUrl_example" // String |  (optional)
let idpUrlTypeHint = "idpUrlTypeHint_example" // String |  (optional)
let logoutUrl = "logoutUrl_example" // String |  (optional)
let logoutUrlTypeHint = "logoutUrlTypeHint_example" // String |  (optional)
let serviceProviderEntityId = "serviceProviderEntityId_example" // String |  (optional)
let serviceProviderEntityIdTypeHint = "serviceProviderEntityIdTypeHint_example" // String |  (optional)
let assertionConsumerServiceURL = "assertionConsumerServiceURL_example" // String |  (optional)
let assertionConsumerServiceURLTypeHint = "assertionConsumerServiceURLTypeHint_example" // String |  (optional)
let handleLogout = true // Bool |  (optional)
let handleLogoutTypeHint = "handleLogoutTypeHint_example" // String |  (optional)
let spPrivateKeyAlias = "spPrivateKeyAlias_example" // String |  (optional)
let spPrivateKeyAliasTypeHint = "spPrivateKeyAliasTypeHint_example" // String |  (optional)
let useEncryption = true // Bool |  (optional)
let useEncryptionTypeHint = "useEncryptionTypeHint_example" // String |  (optional)
let nameIdFormat = "nameIdFormat_example" // String |  (optional)
let nameIdFormatTypeHint = "nameIdFormatTypeHint_example" // String |  (optional)
let digestMethod = "digestMethod_example" // String |  (optional)
let digestMethodTypeHint = "digestMethodTypeHint_example" // String |  (optional)
let signatureMethod = "signatureMethod_example" // String |  (optional)
let signatureMethodTypeHint = "signatureMethodTypeHint_example" // String |  (optional)
let userIntermediatePath = "userIntermediatePath_example" // String |  (optional)
let userIntermediatePathTypeHint = "userIntermediatePathTypeHint_example" // String |  (optional)

SlingAPI.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: keyStorePassword, keyStorePasswordTypeHint: keyStorePasswordTypeHint, serviceRanking: serviceRanking, serviceRankingTypeHint: serviceRankingTypeHint, idpHttpRedirect: idpHttpRedirect, idpHttpRedirectTypeHint: idpHttpRedirectTypeHint, createUser: createUser, createUserTypeHint: createUserTypeHint, defaultRedirectUrl: defaultRedirectUrl, defaultRedirectUrlTypeHint: defaultRedirectUrlTypeHint, userIDAttribute: userIDAttribute, userIDAttributeTypeHint: userIDAttributeTypeHint, defaultGroups: defaultGroups, defaultGroupsTypeHint: defaultGroupsTypeHint, idpCertAlias: idpCertAlias, idpCertAliasTypeHint: idpCertAliasTypeHint, addGroupMemberships: addGroupMemberships, addGroupMembershipsTypeHint: addGroupMembershipsTypeHint, path: path, pathTypeHint: pathTypeHint, synchronizeAttributes: synchronizeAttributes, synchronizeAttributesTypeHint: synchronizeAttributesTypeHint, clockTolerance: clockTolerance, clockToleranceTypeHint: clockToleranceTypeHint, groupMembershipAttribute: groupMembershipAttribute, groupMembershipAttributeTypeHint: groupMembershipAttributeTypeHint, idpUrl: idpUrl, idpUrlTypeHint: idpUrlTypeHint, logoutUrl: logoutUrl, logoutUrlTypeHint: logoutUrlTypeHint, serviceProviderEntityId: serviceProviderEntityId, serviceProviderEntityIdTypeHint: serviceProviderEntityIdTypeHint, assertionConsumerServiceURL: assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint: assertionConsumerServiceURLTypeHint, handleLogout: handleLogout, handleLogoutTypeHint: handleLogoutTypeHint, spPrivateKeyAlias: spPrivateKeyAlias, spPrivateKeyAliasTypeHint: spPrivateKeyAliasTypeHint, useEncryption: useEncryption, useEncryptionTypeHint: useEncryptionTypeHint, nameIdFormat: nameIdFormat, nameIdFormatTypeHint: nameIdFormatTypeHint, digestMethod: digestMethod, digestMethodTypeHint: digestMethodTypeHint, signatureMethod: signatureMethod, signatureMethodTypeHint: signatureMethodTypeHint, userIntermediatePath: userIntermediatePath, userIntermediatePathTypeHint: userIntermediatePathTypeHint) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **String** |  | [optional] 
 **keyStorePasswordTypeHint** | **String** |  | [optional] 
 **serviceRanking** | **Int** |  | [optional] 
 **serviceRankingTypeHint** | **String** |  | [optional] 
 **idpHttpRedirect** | **Bool** |  | [optional] 
 **idpHttpRedirectTypeHint** | **String** |  | [optional] 
 **createUser** | **Bool** |  | [optional] 
 **createUserTypeHint** | **String** |  | [optional] 
 **defaultRedirectUrl** | **String** |  | [optional] 
 **defaultRedirectUrlTypeHint** | **String** |  | [optional] 
 **userIDAttribute** | **String** |  | [optional] 
 **userIDAttributeTypeHint** | **String** |  | [optional] 
 **defaultGroups** | [**[String]**](String.md) |  | [optional] 
 **defaultGroupsTypeHint** | **String** |  | [optional] 
 **idpCertAlias** | **String** |  | [optional] 
 **idpCertAliasTypeHint** | **String** |  | [optional] 
 **addGroupMemberships** | **Bool** |  | [optional] 
 **addGroupMembershipsTypeHint** | **String** |  | [optional] 
 **path** | [**[String]**](String.md) |  | [optional] 
 **pathTypeHint** | **String** |  | [optional] 
 **synchronizeAttributes** | [**[String]**](String.md) |  | [optional] 
 **synchronizeAttributesTypeHint** | **String** |  | [optional] 
 **clockTolerance** | **Int** |  | [optional] 
 **clockToleranceTypeHint** | **String** |  | [optional] 
 **groupMembershipAttribute** | **String** |  | [optional] 
 **groupMembershipAttributeTypeHint** | **String** |  | [optional] 
 **idpUrl** | **String** |  | [optional] 
 **idpUrlTypeHint** | **String** |  | [optional] 
 **logoutUrl** | **String** |  | [optional] 
 **logoutUrlTypeHint** | **String** |  | [optional] 
 **serviceProviderEntityId** | **String** |  | [optional] 
 **serviceProviderEntityIdTypeHint** | **String** |  | [optional] 
 **assertionConsumerServiceURL** | **String** |  | [optional] 
 **assertionConsumerServiceURLTypeHint** | **String** |  | [optional] 
 **handleLogout** | **Bool** |  | [optional] 
 **handleLogoutTypeHint** | **String** |  | [optional] 
 **spPrivateKeyAlias** | **String** |  | [optional] 
 **spPrivateKeyAliasTypeHint** | **String** |  | [optional] 
 **useEncryption** | **Bool** |  | [optional] 
 **useEncryptionTypeHint** | **String** |  | [optional] 
 **nameIdFormat** | **String** |  | [optional] 
 **nameIdFormatTypeHint** | **String** |  | [optional] 
 **digestMethod** | **String** |  | [optional] 
 **digestMethodTypeHint** | **String** |  | [optional] 
 **signatureMethod** | **String** |  | [optional] 
 **signatureMethodTypeHint** | **String** |  | [optional] 
 **userIntermediatePath** | **String** |  | [optional] 
 **userIntermediatePathTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheFelixJettyBasedHttpService**
```swift
    open class func postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio: Bool? = nil, orgApacheFelixHttpsNioTypeHint: String? = nil, orgApacheFelixHttpsKeystore: String? = nil, orgApacheFelixHttpsKeystoreTypeHint: String? = nil, orgApacheFelixHttpsKeystorePassword: String? = nil, orgApacheFelixHttpsKeystorePasswordTypeHint: String? = nil, orgApacheFelixHttpsKeystoreKey: String? = nil, orgApacheFelixHttpsKeystoreKeyTypeHint: String? = nil, orgApacheFelixHttpsKeystoreKeyPassword: String? = nil, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: String? = nil, orgApacheFelixHttpsTruststore: String? = nil, orgApacheFelixHttpsTruststoreTypeHint: String? = nil, orgApacheFelixHttpsTruststorePassword: String? = nil, orgApacheFelixHttpsTruststorePasswordTypeHint: String? = nil, orgApacheFelixHttpsClientcertificate: String? = nil, orgApacheFelixHttpsClientcertificateTypeHint: String? = nil, orgApacheFelixHttpsEnable: Bool? = nil, orgApacheFelixHttpsEnableTypeHint: String? = nil, orgOsgiServiceHttpPortSecure: String? = nil, orgOsgiServiceHttpPortSecureTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let orgApacheFelixHttpsNio = true // Bool |  (optional)
let orgApacheFelixHttpsNioTypeHint = "orgApacheFelixHttpsNioTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsKeystore = "orgApacheFelixHttpsKeystore_example" // String |  (optional)
let orgApacheFelixHttpsKeystoreTypeHint = "orgApacheFelixHttpsKeystoreTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsKeystorePassword = "orgApacheFelixHttpsKeystorePassword_example" // String |  (optional)
let orgApacheFelixHttpsKeystorePasswordTypeHint = "orgApacheFelixHttpsKeystorePasswordTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsKeystoreKey = "orgApacheFelixHttpsKeystoreKey_example" // String |  (optional)
let orgApacheFelixHttpsKeystoreKeyTypeHint = "orgApacheFelixHttpsKeystoreKeyTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsKeystoreKeyPassword = "orgApacheFelixHttpsKeystoreKeyPassword_example" // String |  (optional)
let orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = "orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsTruststore = "orgApacheFelixHttpsTruststore_example" // String |  (optional)
let orgApacheFelixHttpsTruststoreTypeHint = "orgApacheFelixHttpsTruststoreTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsTruststorePassword = "orgApacheFelixHttpsTruststorePassword_example" // String |  (optional)
let orgApacheFelixHttpsTruststorePasswordTypeHint = "orgApacheFelixHttpsTruststorePasswordTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsClientcertificate = "orgApacheFelixHttpsClientcertificate_example" // String |  (optional)
let orgApacheFelixHttpsClientcertificateTypeHint = "orgApacheFelixHttpsClientcertificateTypeHint_example" // String |  (optional)
let orgApacheFelixHttpsEnable = true // Bool |  (optional)
let orgApacheFelixHttpsEnableTypeHint = "orgApacheFelixHttpsEnableTypeHint_example" // String |  (optional)
let orgOsgiServiceHttpPortSecure = "orgOsgiServiceHttpPortSecure_example" // String |  (optional)
let orgOsgiServiceHttpPortSecureTypeHint = "orgOsgiServiceHttpPortSecureTypeHint_example" // String |  (optional)

SlingAPI.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio: orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint: orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore: orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint: orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword: orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint: orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey: orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint: orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword: orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore: orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint: orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword: orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint: orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate: orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint: orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable: orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint: orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure: orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint: orgOsgiServiceHttpPortSecureTypeHint) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **Bool** |  | [optional] 
 **orgApacheFelixHttpsNioTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystore** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystoreTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystorePassword** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystoreKey** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **String** |  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsTruststore** | **String** |  | [optional] 
 **orgApacheFelixHttpsTruststoreTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsTruststorePassword** | **String** |  | [optional] 
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsClientcertificate** | **String** |  | [optional] 
 **orgApacheFelixHttpsClientcertificateTypeHint** | **String** |  | [optional] 
 **orgApacheFelixHttpsEnable** | **Bool** |  | [optional] 
 **orgApacheFelixHttpsEnableTypeHint** | **String** |  | [optional] 
 **orgOsgiServiceHttpPortSecure** | **String** |  | [optional] 
 **orgOsgiServiceHttpPortSecureTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheHttpComponentsProxyConfiguration**
```swift
    open class func postConfigApacheHttpComponentsProxyConfiguration(proxyHost: String? = nil, proxyHostTypeHint: String? = nil, proxyPort: Int? = nil, proxyPortTypeHint: String? = nil, proxyExceptions: [String]? = nil, proxyExceptionsTypeHint: String? = nil, proxyEnabled: Bool? = nil, proxyEnabledTypeHint: String? = nil, proxyUser: String? = nil, proxyUserTypeHint: String? = nil, proxyPassword: String? = nil, proxyPasswordTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let proxyHost = "proxyHost_example" // String |  (optional)
let proxyHostTypeHint = "proxyHostTypeHint_example" // String |  (optional)
let proxyPort = 987 // Int |  (optional)
let proxyPortTypeHint = "proxyPortTypeHint_example" // String |  (optional)
let proxyExceptions = ["inner_example"] // [String] |  (optional)
let proxyExceptionsTypeHint = "proxyExceptionsTypeHint_example" // String |  (optional)
let proxyEnabled = true // Bool |  (optional)
let proxyEnabledTypeHint = "proxyEnabledTypeHint_example" // String |  (optional)
let proxyUser = "proxyUser_example" // String |  (optional)
let proxyUserTypeHint = "proxyUserTypeHint_example" // String |  (optional)
let proxyPassword = "proxyPassword_example" // String |  (optional)
let proxyPasswordTypeHint = "proxyPasswordTypeHint_example" // String |  (optional)

SlingAPI.postConfigApacheHttpComponentsProxyConfiguration(proxyHost: proxyHost, proxyHostTypeHint: proxyHostTypeHint, proxyPort: proxyPort, proxyPortTypeHint: proxyPortTypeHint, proxyExceptions: proxyExceptions, proxyExceptionsTypeHint: proxyExceptionsTypeHint, proxyEnabled: proxyEnabled, proxyEnabledTypeHint: proxyEnabledTypeHint, proxyUser: proxyUser, proxyUserTypeHint: proxyUserTypeHint, proxyPassword: proxyPassword, proxyPasswordTypeHint: proxyPasswordTypeHint) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **String** |  | [optional] 
 **proxyHostTypeHint** | **String** |  | [optional] 
 **proxyPort** | **Int** |  | [optional] 
 **proxyPortTypeHint** | **String** |  | [optional] 
 **proxyExceptions** | [**[String]**](String.md) |  | [optional] 
 **proxyExceptionsTypeHint** | **String** |  | [optional] 
 **proxyEnabled** | **Bool** |  | [optional] 
 **proxyEnabledTypeHint** | **String** |  | [optional] 
 **proxyUser** | **String** |  | [optional] 
 **proxyUserTypeHint** | **String** |  | [optional] 
 **proxyPassword** | **String** |  | [optional] 
 **proxyPasswordTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingDavExServlet**
```swift
    open class func postConfigApacheSlingDavExServlet(alias: String? = nil, aliasTypeHint: String? = nil, davCreateAbsoluteUri: Bool? = nil, davCreateAbsoluteUriTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let alias = "alias_example" // String |  (optional)
let aliasTypeHint = "aliasTypeHint_example" // String |  (optional)
let davCreateAbsoluteUri = true // Bool |  (optional)
let davCreateAbsoluteUriTypeHint = "davCreateAbsoluteUriTypeHint_example" // String |  (optional)

SlingAPI.postConfigApacheSlingDavExServlet(alias: alias, aliasTypeHint: aliasTypeHint, davCreateAbsoluteUri: davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint: davCreateAbsoluteUriTypeHint) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String** |  | [optional] 
 **aliasTypeHint** | **String** |  | [optional] 
 **davCreateAbsoluteUri** | **Bool** |  | [optional] 
 **davCreateAbsoluteUriTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingGetServlet**
```swift
    open class func postConfigApacheSlingGetServlet(jsonMaximumresults: String? = nil, jsonMaximumresultsTypeHint: String? = nil, enableHtml: Bool? = nil, enableHtmlTypeHint: String? = nil, enableTxt: Bool? = nil, enableTxtTypeHint: String? = nil, enableXml: Bool? = nil, enableXmlTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let jsonMaximumresults = "jsonMaximumresults_example" // String |  (optional)
let jsonMaximumresultsTypeHint = "jsonMaximumresultsTypeHint_example" // String |  (optional)
let enableHtml = true // Bool |  (optional)
let enableHtmlTypeHint = "enableHtmlTypeHint_example" // String |  (optional)
let enableTxt = true // Bool |  (optional)
let enableTxtTypeHint = "enableTxtTypeHint_example" // String |  (optional)
let enableXml = true // Bool |  (optional)
let enableXmlTypeHint = "enableXmlTypeHint_example" // String |  (optional)

SlingAPI.postConfigApacheSlingGetServlet(jsonMaximumresults: jsonMaximumresults, jsonMaximumresultsTypeHint: jsonMaximumresultsTypeHint, enableHtml: enableHtml, enableHtmlTypeHint: enableHtmlTypeHint, enableTxt: enableTxt, enableTxtTypeHint: enableTxtTypeHint, enableXml: enableXml, enableXmlTypeHint: enableXmlTypeHint) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **String** |  | [optional] 
 **jsonMaximumresultsTypeHint** | **String** |  | [optional] 
 **enableHtml** | **Bool** |  | [optional] 
 **enableHtmlTypeHint** | **String** |  | [optional] 
 **enableTxt** | **Bool** |  | [optional] 
 **enableTxtTypeHint** | **String** |  | [optional] 
 **enableXml** | **Bool** |  | [optional] 
 **enableXmlTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingReferrerFilter**
```swift
    open class func postConfigApacheSlingReferrerFilter(allowEmpty: Bool? = nil, allowEmptyTypeHint: String? = nil, allowHosts: String? = nil, allowHostsTypeHint: String? = nil, allowHostsRegexp: String? = nil, allowHostsRegexpTypeHint: String? = nil, filterMethods: String? = nil, filterMethodsTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let allowEmpty = true // Bool |  (optional)
let allowEmptyTypeHint = "allowEmptyTypeHint_example" // String |  (optional)
let allowHosts = "allowHosts_example" // String |  (optional)
let allowHostsTypeHint = "allowHostsTypeHint_example" // String |  (optional)
let allowHostsRegexp = "allowHostsRegexp_example" // String |  (optional)
let allowHostsRegexpTypeHint = "allowHostsRegexpTypeHint_example" // String |  (optional)
let filterMethods = "filterMethods_example" // String |  (optional)
let filterMethodsTypeHint = "filterMethodsTypeHint_example" // String |  (optional)

SlingAPI.postConfigApacheSlingReferrerFilter(allowEmpty: allowEmpty, allowEmptyTypeHint: allowEmptyTypeHint, allowHosts: allowHosts, allowHostsTypeHint: allowHostsTypeHint, allowHostsRegexp: allowHostsRegexp, allowHostsRegexpTypeHint: allowHostsRegexpTypeHint, filterMethods: filterMethods, filterMethodsTypeHint: filterMethodsTypeHint) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **Bool** |  | [optional] 
 **allowEmptyTypeHint** | **String** |  | [optional] 
 **allowHosts** | **String** |  | [optional] 
 **allowHostsTypeHint** | **String** |  | [optional] 
 **allowHostsRegexp** | **String** |  | [optional] 
 **allowHostsRegexpTypeHint** | **String** |  | [optional] 
 **filterMethods** | **String** |  | [optional] 
 **filterMethodsTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigProperty**
```swift
    open class func postConfigProperty(configNodeName: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let configNodeName = "configNodeName_example" // String | 

SlingAPI.postConfigProperty(configNodeName: configNodeName) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNode**
```swift
    open class func postNode(path: String, name: String, operation: String? = nil, deleteAuthorizable: String? = nil, file: URL? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let name = "name_example" // String | 
let operation = "operation_example" // String |  (optional)
let deleteAuthorizable = "deleteAuthorizable_example" // String |  (optional)
let file = URL(string: "https://example.com")! // URL |  (optional)

SlingAPI.postNode(path: path, name: name, operation: operation, deleteAuthorizable: deleteAuthorizable, file: file) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** |  | 
 **name** | **String** |  | 
 **operation** | **String** |  | [optional] 
 **deleteAuthorizable** | **String** |  | [optional] 
 **file** | **URL** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNodeRw**
```swift
    open class func postNodeRw(path: String, name: String, addMembers: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let name = "name_example" // String | 
let addMembers = "addMembers_example" // String |  (optional)

SlingAPI.postNodeRw(path: path, name: name, addMembers: addMembers) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** |  | 
 **name** | **String** |  | 
 **addMembers** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPath**
```swift
    open class func postPath(path: String, jcrPrimaryType: String, name: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let jcrPrimaryType = "jcrPrimaryType_example" // String | 
let name = "name_example" // String | 

SlingAPI.postPath(path: path, jcrPrimaryType: jcrPrimaryType, name: name) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** |  | 
 **jcrPrimaryType** | **String** |  | 
 **name** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postQuery**
```swift
    open class func postQuery(path: String, pLimit: Double, _1property: String, _1propertyValue: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let pLimit = 987 // Double | 
let _1property = "_1property_example" // String | 
let _1propertyValue = "_1propertyValue_example" // String | 

SlingAPI.postQuery(path: path, pLimit: pLimit, _1property: _1property, _1propertyValue: _1propertyValue) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** |  | 
 **pLimit** | **Double** |  | 
 **_1property** | **String** |  | 
 **_1propertyValue** | **String** |  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTreeActivation**
```swift
    open class func postTreeActivation(ignoredeactivated: Bool, onlymodified: Bool, path: String, cmd: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let ignoredeactivated = true // Bool | 
let onlymodified = true // Bool | 
let path = "path_example" // String | 
let cmd = "cmd_example" // String |  (default to "activate")

SlingAPI.postTreeActivation(ignoredeactivated: ignoredeactivated, onlymodified: onlymodified, path: path, cmd: cmd) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **Bool** |  | 
 **onlymodified** | **Bool** |  | 
 **path** | **String** |  | 
 **cmd** | **String** |  | [default to &quot;activate&quot;]

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststore**
```swift
    open class func postTruststore(operation: String? = nil, newPassword: String? = nil, rePassword: String? = nil, keyStoreType: String? = nil, removeAlias: String? = nil, certificate: URL? = nil, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let operation = "operation_example" // String |  (optional)
let newPassword = "newPassword_example" // String |  (optional)
let rePassword = "rePassword_example" // String |  (optional)
let keyStoreType = "keyStoreType_example" // String |  (optional)
let removeAlias = "removeAlias_example" // String |  (optional)
let certificate = URL(string: "https://example.com")! // URL |  (optional)

SlingAPI.postTruststore(operation: operation, newPassword: newPassword, rePassword: rePassword, keyStoreType: keyStoreType, removeAlias: removeAlias, certificate: certificate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **String** |  | [optional] 
 **newPassword** | **String** |  | [optional] 
 **rePassword** | **String** |  | [optional] 
 **keyStoreType** | **String** |  | [optional] 
 **removeAlias** | **String** |  | [optional] 
 **certificate** | **URL** |  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststorePKCS12**
```swift
    open class func postTruststorePKCS12(truststoreP12: URL? = nil, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let truststoreP12 = URL(string: "https://example.com")! // URL |  (optional)

SlingAPI.postTruststorePKCS12(truststoreP12: truststoreP12) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **URL** |  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

