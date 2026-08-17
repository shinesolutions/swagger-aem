# CrxAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](CrxAPI.md#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](CrxAPI.md#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](CrxAPI.md#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](CrxAPI.md#postpackageservice) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxAPI.md#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxAPI.md#postpackageupdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxAPI.md#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **getCrxdeStatus**
```swift
    open class func getCrxdeStatus(completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


CrxAPI.getCrxdeStatus() { (response, error) in
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
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInstallStatus**
```swift
    open class func getInstallStatus(completion: @escaping (_ data: InstallStatus?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


CrxAPI.getInstallStatus() { (response, error) in
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

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageManagerServlet**
```swift
    open class func getPackageManagerServlet(completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


CrxAPI.getPackageManagerServlet() { (response, error) in
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

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageService**
```swift
    open class func postPackageService(cmd: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let cmd = "cmd_example" // String | 

CrxAPI.postPackageService(cmd: cmd) { (response, error) in
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
 **cmd** | **String** |  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageServiceJson**
```swift
    open class func postPackageServiceJson(path: String, cmd: String, groupName: String? = nil, packageName: String? = nil, packageVersion: String? = nil, charset: String? = nil, force: Bool? = nil, recursive: Bool? = nil, package: URL? = nil, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let path = "path_example" // String | 
let cmd = "cmd_example" // String | 
let groupName = "groupName_example" // String |  (optional)
let packageName = "packageName_example" // String |  (optional)
let packageVersion = "packageVersion_example" // String |  (optional)
let charset = "charset_example" // String |  (optional)
let force = true // Bool |  (optional)
let recursive = true // Bool |  (optional)
let package = URL(string: "https://example.com")! // URL |  (optional)

CrxAPI.postPackageServiceJson(path: path, cmd: cmd, groupName: groupName, packageName: packageName, packageVersion: packageVersion, charset: charset, force: force, recursive: recursive, package: package) { (response, error) in
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
 **cmd** | **String** |  | 
 **groupName** | **String** |  | [optional] 
 **packageName** | **String** |  | [optional] 
 **packageVersion** | **String** |  | [optional] 
 **charset** | **String** |  | [optional] 
 **force** | **Bool** |  | [optional] 
 **recursive** | **Bool** |  | [optional] 
 **package** | **URL** |  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageUpdate**
```swift
    open class func postPackageUpdate(groupName: String, packageName: String, version: String, path: String, filter: String? = nil, charset: String? = nil, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let groupName = "groupName_example" // String | 
let packageName = "packageName_example" // String | 
let version = "version_example" // String | 
let path = "path_example" // String | 
let filter = "filter_example" // String |  (optional)
let charset = "charset_example" // String |  (optional)

CrxAPI.postPackageUpdate(groupName: groupName, packageName: packageName, version: version, path: path, filter: filter, charset: charset) { (response, error) in
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
 **groupName** | **String** |  | 
 **packageName** | **String** |  | 
 **version** | **String** |  | 
 **path** | **String** |  | 
 **filter** | **String** |  | [optional] 
 **charset** | **String** |  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSetPassword**
```swift
    open class func postSetPassword(old: String, plain: String, verify: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let old = "old_example" // String | 
let plain = "plain_example" // String | 
let verify = "verify_example" // String | 

CrxAPI.postSetPassword(old: old, plain: plain, verify: verify) { (response, error) in
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
 **old** | **String** |  | 
 **plain** | **String** |  | 
 **verify** | **String** |  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

