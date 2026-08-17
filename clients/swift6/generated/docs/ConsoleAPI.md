# ConsoleAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleAPI.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleAPI.md#getbundleinfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleAPI.md#getconfigmgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleAPI.md#postbundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleAPI.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleAPI.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **getAemProductInfo**
```swift
    open class func getAemProductInfo(completion: @escaping (_ data: [String]?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


ConsoleAPI.getAemProductInfo() { (response, error) in
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

**[String]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBundleInfo**
```swift
    open class func getBundleInfo(name: String, completion: @escaping (_ data: BundleInfo?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let name = "name_example" // String | 

ConsoleAPI.getBundleInfo(name: name) { (response, error) in
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
 **name** | **String** |  | 

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getConfigMgr**
```swift
    open class func getConfigMgr(completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


ConsoleAPI.getConfigMgr() { (response, error) in
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

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postBundle**
```swift
    open class func postBundle(name: String, action: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let name = "name_example" // String | 
let action = "action_example" // String | 

ConsoleAPI.postBundle(name: name, action: action) { (response, error) in
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
 **name** | **String** |  | 
 **action** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postJmxRepository**
```swift
    open class func postJmxRepository(action: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let action = "action_example" // String | 

ConsoleAPI.postJmxRepository(action: action) { (response, error) in
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
 **action** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSamlConfiguration**
```swift
    open class func postSamlConfiguration(post: Bool? = nil, apply: Bool? = nil, delete: Bool? = nil, action: String? = nil, location: String? = nil, path: [String]? = nil, serviceRanking: Int? = nil, idpUrl: String? = nil, idpCertAlias: String? = nil, idpHttpRedirect: Bool? = nil, serviceProviderEntityId: String? = nil, assertionConsumerServiceURL: String? = nil, spPrivateKeyAlias: String? = nil, keyStorePassword: String? = nil, defaultRedirectUrl: String? = nil, userIDAttribute: String? = nil, useEncryption: Bool? = nil, createUser: Bool? = nil, addGroupMemberships: Bool? = nil, groupMembershipAttribute: String? = nil, defaultGroups: [String]? = nil, nameIdFormat: String? = nil, synchronizeAttributes: [String]? = nil, handleLogout: Bool? = nil, logoutUrl: String? = nil, clockTolerance: Int? = nil, digestMethod: String? = nil, signatureMethod: String? = nil, userIntermediatePath: String? = nil, propertylist: [String]? = nil, completion: @escaping (_ data: SamlConfigurationInfo?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let post = true // Bool |  (optional)
let apply = true // Bool |  (optional)
let delete = true // Bool |  (optional)
let action = "action_example" // String |  (optional)
let location = "location_example" // String |  (optional)
let path = ["inner_example"] // [String] |  (optional)
let serviceRanking = 987 // Int |  (optional)
let idpUrl = "idpUrl_example" // String |  (optional)
let idpCertAlias = "idpCertAlias_example" // String |  (optional)
let idpHttpRedirect = true // Bool |  (optional)
let serviceProviderEntityId = "serviceProviderEntityId_example" // String |  (optional)
let assertionConsumerServiceURL = "assertionConsumerServiceURL_example" // String |  (optional)
let spPrivateKeyAlias = "spPrivateKeyAlias_example" // String |  (optional)
let keyStorePassword = "keyStorePassword_example" // String |  (optional)
let defaultRedirectUrl = "defaultRedirectUrl_example" // String |  (optional)
let userIDAttribute = "userIDAttribute_example" // String |  (optional)
let useEncryption = true // Bool |  (optional)
let createUser = true // Bool |  (optional)
let addGroupMemberships = true // Bool |  (optional)
let groupMembershipAttribute = "groupMembershipAttribute_example" // String |  (optional)
let defaultGroups = ["inner_example"] // [String] |  (optional)
let nameIdFormat = "nameIdFormat_example" // String |  (optional)
let synchronizeAttributes = ["inner_example"] // [String] |  (optional)
let handleLogout = true // Bool |  (optional)
let logoutUrl = "logoutUrl_example" // String |  (optional)
let clockTolerance = 987 // Int |  (optional)
let digestMethod = "digestMethod_example" // String |  (optional)
let signatureMethod = "signatureMethod_example" // String |  (optional)
let userIntermediatePath = "userIntermediatePath_example" // String |  (optional)
let propertylist = ["inner_example"] // [String] |  (optional)

ConsoleAPI.postSamlConfiguration(post: post, apply: apply, delete: delete, action: action, location: location, path: path, serviceRanking: serviceRanking, idpUrl: idpUrl, idpCertAlias: idpCertAlias, idpHttpRedirect: idpHttpRedirect, serviceProviderEntityId: serviceProviderEntityId, assertionConsumerServiceURL: assertionConsumerServiceURL, spPrivateKeyAlias: spPrivateKeyAlias, keyStorePassword: keyStorePassword, defaultRedirectUrl: defaultRedirectUrl, userIDAttribute: userIDAttribute, useEncryption: useEncryption, createUser: createUser, addGroupMemberships: addGroupMemberships, groupMembershipAttribute: groupMembershipAttribute, defaultGroups: defaultGroups, nameIdFormat: nameIdFormat, synchronizeAttributes: synchronizeAttributes, handleLogout: handleLogout, logoutUrl: logoutUrl, clockTolerance: clockTolerance, digestMethod: digestMethod, signatureMethod: signatureMethod, userIntermediatePath: userIntermediatePath, propertylist: propertylist) { (response, error) in
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
 **post** | **Bool** |  | [optional] 
 **apply** | **Bool** |  | [optional] 
 **delete** | **Bool** |  | [optional] 
 **action** | **String** |  | [optional] 
 **location** | **String** |  | [optional] 
 **path** | [**[String]**](String.md) |  | [optional] 
 **serviceRanking** | **Int** |  | [optional] 
 **idpUrl** | **String** |  | [optional] 
 **idpCertAlias** | **String** |  | [optional] 
 **idpHttpRedirect** | **Bool** |  | [optional] 
 **serviceProviderEntityId** | **String** |  | [optional] 
 **assertionConsumerServiceURL** | **String** |  | [optional] 
 **spPrivateKeyAlias** | **String** |  | [optional] 
 **keyStorePassword** | **String** |  | [optional] 
 **defaultRedirectUrl** | **String** |  | [optional] 
 **userIDAttribute** | **String** |  | [optional] 
 **useEncryption** | **Bool** |  | [optional] 
 **createUser** | **Bool** |  | [optional] 
 **addGroupMemberships** | **Bool** |  | [optional] 
 **groupMembershipAttribute** | **String** |  | [optional] 
 **defaultGroups** | [**[String]**](String.md) |  | [optional] 
 **nameIdFormat** | **String** |  | [optional] 
 **synchronizeAttributes** | [**[String]**](String.md) |  | [optional] 
 **handleLogout** | **Bool** |  | [optional] 
 **logoutUrl** | **String** |  | [optional] 
 **clockTolerance** | **Int** |  | [optional] 
 **digestMethod** | **String** |  | [optional] 
 **signatureMethod** | **String** |  | [optional] 
 **userIntermediatePath** | **String** |  | [optional] 
 **propertylist** | [**[String]**](String.md) |  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

