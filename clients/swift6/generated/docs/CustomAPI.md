# CustomAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomAPI.md#getaemhealthcheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomAPI.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomAPI.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **getAemHealthCheck**
```swift
    open class func getAemHealthCheck(tags: String? = nil, combineTagsOr: Bool? = nil, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let tags = "tags_example" // String |  (optional)
let combineTagsOr = true // Bool |  (optional)

CustomAPI.getAemHealthCheck(tags: tags, combineTagsOr: combineTagsOr) { (response, error) in
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
 **tags** | **String** |  | [optional] 
 **combineTagsOr** | **Bool** |  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemHealthCheckServlet**
```swift
    open class func postConfigAemHealthCheckServlet(bundlesIgnored: [String]? = nil, bundlesIgnoredTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bundlesIgnored = ["inner_example"] // [String] |  (optional)
let bundlesIgnoredTypeHint = "bundlesIgnoredTypeHint_example" // String |  (optional)

CustomAPI.postConfigAemHealthCheckServlet(bundlesIgnored: bundlesIgnored, bundlesIgnoredTypeHint: bundlesIgnoredTypeHint) { (response, error) in
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
 **bundlesIgnored** | [**[String]**](String.md) |  | [optional] 
 **bundlesIgnoredTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemPasswordReset**
```swift
    open class func postConfigAemPasswordReset(pwdresetAuthorizables: [String]? = nil, pwdresetAuthorizablesTypeHint: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pwdresetAuthorizables = ["inner_example"] // [String] |  (optional)
let pwdresetAuthorizablesTypeHint = "pwdresetAuthorizablesTypeHint_example" // String |  (optional)

CustomAPI.postConfigAemPasswordReset(pwdresetAuthorizables: pwdresetAuthorizables, pwdresetAuthorizablesTypeHint: pwdresetAuthorizablesTypeHint) { (response, error) in
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
 **pwdresetAuthorizables** | [**[String]**](String.md) |  | [optional] 
 **pwdresetAuthorizablesTypeHint** | **String** |  | [optional] 

### Return type

Void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

