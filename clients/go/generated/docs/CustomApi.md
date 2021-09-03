# \CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemHealthCheck**](CustomApi.md#GetAemHealthCheck) | **Get** /system/health | 
[**PostConfigAemHealthCheckServlet**](CustomApi.md#PostConfigAemHealthCheckServlet) | **Post** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**PostConfigAemPasswordReset**](CustomApi.md#PostConfigAemPasswordReset) | **Post** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 



## GetAemHealthCheck

> string GetAemHealthCheck(ctx).Tags(tags).CombineTagsOr(combineTagsOr).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    tags := "tags_example" // string |  (optional)
    combineTagsOr := true // bool |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CustomApi.GetAemHealthCheck(context.Background()).Tags(tags).CombineTagsOr(combineTagsOr).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CustomApi.GetAemHealthCheck``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAemHealthCheck`: string
    fmt.Fprintf(os.Stdout, "Response from `CustomApi.GetAemHealthCheck`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAemHealthCheckRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **string** |  | 
 **combineTagsOr** | **bool** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostConfigAemHealthCheckServlet

> PostConfigAemHealthCheckServlet(ctx).BundlesIgnored(bundlesIgnored).BundlesIgnoredTypeHint(bundlesIgnoredTypeHint).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    bundlesIgnored := []string{"Inner_example"} // []string |  (optional)
    bundlesIgnoredTypeHint := "bundlesIgnoredTypeHint_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CustomApi.PostConfigAemHealthCheckServlet(context.Background()).BundlesIgnored(bundlesIgnored).BundlesIgnoredTypeHint(bundlesIgnoredTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CustomApi.PostConfigAemHealthCheckServlet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigAemHealthCheckServletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | **[]string** |  | 
 **bundlesIgnoredTypeHint** | **string** |  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostConfigAemPasswordReset

> PostConfigAemPasswordReset(ctx).PwdresetAuthorizables(pwdresetAuthorizables).PwdresetAuthorizablesTypeHint(pwdresetAuthorizablesTypeHint).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    pwdresetAuthorizables := []string{"Inner_example"} // []string |  (optional)
    pwdresetAuthorizablesTypeHint := "pwdresetAuthorizablesTypeHint_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CustomApi.PostConfigAemPasswordReset(context.Background()).PwdresetAuthorizables(pwdresetAuthorizables).PwdresetAuthorizablesTypeHint(pwdresetAuthorizablesTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CustomApi.PostConfigAemPasswordReset``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigAemPasswordResetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | **[]string** |  | 
 **pwdresetAuthorizablesTypeHint** | **string** |  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

