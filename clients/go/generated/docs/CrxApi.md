# \CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCrxdeStatus**](CrxApi.md#GetCrxdeStatus) | **Get** /crx/server/crx.default/jcr:root/.1.json | 
[**GetInstallStatus**](CrxApi.md#GetInstallStatus) | **Get** /crx/packmgr/installstatus.jsp | 
[**GetPackageManagerServlet**](CrxApi.md#GetPackageManagerServlet) | **Get** /crx/packmgr/service/script.html | 
[**PostPackageService**](CrxApi.md#PostPackageService) | **Post** /crx/packmgr/service.jsp | 
[**PostPackageServiceJson**](CrxApi.md#PostPackageServiceJson) | **Post** /crx/packmgr/service/.json/{path} | 
[**PostPackageUpdate**](CrxApi.md#PostPackageUpdate) | **Post** /crx/packmgr/update.jsp | 
[**PostSetPassword**](CrxApi.md#PostSetPassword) | **Post** /crx/explorer/ui/setpassword.jsp | 



## GetCrxdeStatus

> string GetCrxdeStatus(ctx).Execute()



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CrxApi.GetCrxdeStatus(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CrxApi.GetCrxdeStatus``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCrxdeStatus`: string
    fmt.Fprintf(os.Stdout, "Response from `CrxApi.GetCrxdeStatus`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetCrxdeStatusRequest struct via the builder pattern


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetInstallStatus

> InstallStatus GetInstallStatus(ctx).Execute()



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CrxApi.GetInstallStatus(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CrxApi.GetInstallStatus``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetInstallStatus`: InstallStatus
    fmt.Fprintf(os.Stdout, "Response from `CrxApi.GetInstallStatus`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetInstallStatusRequest struct via the builder pattern


### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPackageManagerServlet

> GetPackageManagerServlet(ctx).Execute()



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CrxApi.GetPackageManagerServlet(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CrxApi.GetPackageManagerServlet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetPackageManagerServletRequest struct via the builder pattern


### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostPackageService

> string PostPackageService(ctx).Cmd(cmd).Execute()



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
    cmd := "cmd_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CrxApi.PostPackageService(context.Background()).Cmd(cmd).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CrxApi.PostPackageService``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostPackageService`: string
    fmt.Fprintf(os.Stdout, "Response from `CrxApi.PostPackageService`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostPackageServiceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **string** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostPackageServiceJson

> string PostPackageServiceJson(ctx, path).Cmd(cmd).GroupName(groupName).PackageName(packageName).PackageVersion(packageVersion).Charset(charset).Force(force).Recursive(recursive).Package_(package_).Execute()



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
    path := "path_example" // string | 
    cmd := "cmd_example" // string | 
    groupName := "groupName_example" // string |  (optional)
    packageName := "packageName_example" // string |  (optional)
    packageVersion := "packageVersion_example" // string |  (optional)
    charset := "charset_example" // string |  (optional)
    force := true // bool |  (optional)
    recursive := true // bool |  (optional)
    package_ := os.NewFile(1234, "some_file") // *os.File |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CrxApi.PostPackageServiceJson(context.Background(), path).Cmd(cmd).GroupName(groupName).PackageName(packageName).PackageVersion(packageVersion).Charset(charset).Force(force).Recursive(recursive).Package_(package_).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CrxApi.PostPackageServiceJson``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostPackageServiceJson`: string
    fmt.Fprintf(os.Stdout, "Response from `CrxApi.PostPackageServiceJson`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**path** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostPackageServiceJsonRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **cmd** | **string** |  | 
 **groupName** | **string** |  | 
 **packageName** | **string** |  | 
 **packageVersion** | **string** |  | 
 **charset** | **string** |  | 
 **force** | **bool** |  | 
 **recursive** | **bool** |  | 
 **package_** | ***os.File** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostPackageUpdate

> string PostPackageUpdate(ctx).GroupName(groupName).PackageName(packageName).Version(version).Path(path).Filter(filter).Charset(charset).Execute()



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
    groupName := "groupName_example" // string | 
    packageName := "packageName_example" // string | 
    version := "version_example" // string | 
    path := "path_example" // string | 
    filter := "filter_example" // string |  (optional)
    charset := "charset_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CrxApi.PostPackageUpdate(context.Background()).GroupName(groupName).PackageName(packageName).Version(version).Path(path).Filter(filter).Charset(charset).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CrxApi.PostPackageUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostPackageUpdate`: string
    fmt.Fprintf(os.Stdout, "Response from `CrxApi.PostPackageUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostPackageUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **string** |  | 
 **packageName** | **string** |  | 
 **version** | **string** |  | 
 **path** | **string** |  | 
 **filter** | **string** |  | 
 **charset** | **string** |  | 

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


## PostSetPassword

> string PostSetPassword(ctx).Old(old).Plain(plain).Verify(verify).Execute()



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
    old := "old_example" // string | 
    plain := "plain_example" // string | 
    verify := "verify_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.CrxApi.PostSetPassword(context.Background()).Old(old).Plain(plain).Verify(verify).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CrxApi.PostSetPassword``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostSetPassword`: string
    fmt.Fprintf(os.Stdout, "Response from `CrxApi.PostSetPassword`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostSetPasswordRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **string** |  | 
 **plain** | **string** |  | 
 **verify** | **string** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

