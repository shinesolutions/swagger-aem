# \CqAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLoginPage**](CqAPI.md#GetLoginPage) | **Get** /libs/granite/core/content/login.html | 
[**PostCqActions**](CqAPI.md#PostCqActions) | **Post** /.cqactions.html | 



## GetLoginPage

> string GetLoginPage(ctx).Execute()



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CqAPI.GetLoginPage(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CqAPI.GetLoginPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetLoginPage`: string
	fmt.Fprintf(os.Stdout, "Response from `CqAPI.GetLoginPage`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetLoginPageRequest struct via the builder pattern


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostCqActions

> PostCqActions(ctx).AuthorizableId(authorizableId).Changelog(changelog).Execute()



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	authorizableId := "authorizableId_example" // string | 
	changelog := "changelog_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CqAPI.PostCqActions(context.Background()).AuthorizableId(authorizableId).Changelog(changelog).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CqAPI.PostCqActions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostCqActionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **string** |  | 
 **changelog** | **string** |  | 

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

