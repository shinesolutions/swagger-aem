# \ConsoleAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemProductInfo**](ConsoleAPI.md#GetAemProductInfo) | **Get** /system/console/status-productinfo.json | 
[**GetBundleInfo**](ConsoleAPI.md#GetBundleInfo) | **Get** /system/console/bundles/{name}.json | 
[**GetConfigMgr**](ConsoleAPI.md#GetConfigMgr) | **Get** /system/console/configMgr | 
[**PostBundle**](ConsoleAPI.md#PostBundle) | **Post** /system/console/bundles/{name} | 
[**PostJmxRepository**](ConsoleAPI.md#PostJmxRepository) | **Post** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**PostSamlConfiguration**](ConsoleAPI.md#PostSamlConfiguration) | **Post** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 



## GetAemProductInfo

> []string GetAemProductInfo(ctx).Execute()



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
	resp, r, err := apiClient.ConsoleAPI.GetAemProductInfo(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConsoleAPI.GetAemProductInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAemProductInfo`: []string
	fmt.Fprintf(os.Stdout, "Response from `ConsoleAPI.GetAemProductInfo`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetAemProductInfoRequest struct via the builder pattern


### Return type

**[]string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBundleInfo

> BundleInfo GetBundleInfo(ctx, name).Execute()



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
	name := "name_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConsoleAPI.GetBundleInfo(context.Background(), name).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConsoleAPI.GetBundleInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBundleInfo`: BundleInfo
	fmt.Fprintf(os.Stdout, "Response from `ConsoleAPI.GetBundleInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBundleInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetConfigMgr

> string GetConfigMgr(ctx).Execute()



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
	resp, r, err := apiClient.ConsoleAPI.GetConfigMgr(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConsoleAPI.GetConfigMgr``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetConfigMgr`: string
	fmt.Fprintf(os.Stdout, "Response from `ConsoleAPI.GetConfigMgr`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetConfigMgrRequest struct via the builder pattern


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


## PostBundle

> PostBundle(ctx, name).Action(action).Execute()



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
	name := "name_example" // string | 
	action := "action_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.ConsoleAPI.PostBundle(context.Background(), name).Action(action).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConsoleAPI.PostBundle``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostBundleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **action** | **string** |  | 

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


## PostJmxRepository

> PostJmxRepository(ctx, action).Execute()



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
	action := "action_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.ConsoleAPI.PostJmxRepository(context.Background(), action).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConsoleAPI.PostJmxRepository``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**action** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostJmxRepositoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


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


## PostSamlConfiguration

> SamlConfigurationInfo PostSamlConfiguration(ctx).Post(post).Apply(apply).Delete(delete).Action(action).Location(location).Path(path).ServiceRanking(serviceRanking).IdpUrl(idpUrl).IdpCertAlias(idpCertAlias).IdpHttpRedirect(idpHttpRedirect).ServiceProviderEntityId(serviceProviderEntityId).AssertionConsumerServiceURL(assertionConsumerServiceURL).SpPrivateKeyAlias(spPrivateKeyAlias).KeyStorePassword(keyStorePassword).DefaultRedirectUrl(defaultRedirectUrl).UserIDAttribute(userIDAttribute).UseEncryption(useEncryption).CreateUser(createUser).AddGroupMemberships(addGroupMemberships).GroupMembershipAttribute(groupMembershipAttribute).DefaultGroups(defaultGroups).NameIdFormat(nameIdFormat).SynchronizeAttributes(synchronizeAttributes).HandleLogout(handleLogout).LogoutUrl(logoutUrl).ClockTolerance(clockTolerance).DigestMethod(digestMethod).SignatureMethod(signatureMethod).UserIntermediatePath(userIntermediatePath).Propertylist(propertylist).Execute()



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
	post := true // bool |  (optional)
	apply := true // bool |  (optional)
	delete := true // bool |  (optional)
	action := "action_example" // string |  (optional)
	location := "location_example" // string |  (optional)
	path := []string{"Inner_example"} // []string |  (optional)
	serviceRanking := int32(56) // int32 |  (optional)
	idpUrl := "idpUrl_example" // string |  (optional)
	idpCertAlias := "idpCertAlias_example" // string |  (optional)
	idpHttpRedirect := true // bool |  (optional)
	serviceProviderEntityId := "serviceProviderEntityId_example" // string |  (optional)
	assertionConsumerServiceURL := "assertionConsumerServiceURL_example" // string |  (optional)
	spPrivateKeyAlias := "spPrivateKeyAlias_example" // string |  (optional)
	keyStorePassword := "keyStorePassword_example" // string |  (optional)
	defaultRedirectUrl := "defaultRedirectUrl_example" // string |  (optional)
	userIDAttribute := "userIDAttribute_example" // string |  (optional)
	useEncryption := true // bool |  (optional)
	createUser := true // bool |  (optional)
	addGroupMemberships := true // bool |  (optional)
	groupMembershipAttribute := "groupMembershipAttribute_example" // string |  (optional)
	defaultGroups := []string{"Inner_example"} // []string |  (optional)
	nameIdFormat := "nameIdFormat_example" // string |  (optional)
	synchronizeAttributes := []string{"Inner_example"} // []string |  (optional)
	handleLogout := true // bool |  (optional)
	logoutUrl := "logoutUrl_example" // string |  (optional)
	clockTolerance := int32(56) // int32 |  (optional)
	digestMethod := "digestMethod_example" // string |  (optional)
	signatureMethod := "signatureMethod_example" // string |  (optional)
	userIntermediatePath := "userIntermediatePath_example" // string |  (optional)
	propertylist := []string{"Inner_example"} // []string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConsoleAPI.PostSamlConfiguration(context.Background()).Post(post).Apply(apply).Delete(delete).Action(action).Location(location).Path(path).ServiceRanking(serviceRanking).IdpUrl(idpUrl).IdpCertAlias(idpCertAlias).IdpHttpRedirect(idpHttpRedirect).ServiceProviderEntityId(serviceProviderEntityId).AssertionConsumerServiceURL(assertionConsumerServiceURL).SpPrivateKeyAlias(spPrivateKeyAlias).KeyStorePassword(keyStorePassword).DefaultRedirectUrl(defaultRedirectUrl).UserIDAttribute(userIDAttribute).UseEncryption(useEncryption).CreateUser(createUser).AddGroupMemberships(addGroupMemberships).GroupMembershipAttribute(groupMembershipAttribute).DefaultGroups(defaultGroups).NameIdFormat(nameIdFormat).SynchronizeAttributes(synchronizeAttributes).HandleLogout(handleLogout).LogoutUrl(logoutUrl).ClockTolerance(clockTolerance).DigestMethod(digestMethod).SignatureMethod(signatureMethod).UserIntermediatePath(userIntermediatePath).Propertylist(propertylist).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConsoleAPI.PostSamlConfiguration``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PostSamlConfiguration`: SamlConfigurationInfo
	fmt.Fprintf(os.Stdout, "Response from `ConsoleAPI.PostSamlConfiguration`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostSamlConfigurationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **bool** |  | 
 **apply** | **bool** |  | 
 **delete** | **bool** |  | 
 **action** | **string** |  | 
 **location** | **string** |  | 
 **path** | **[]string** |  | 
 **serviceRanking** | **int32** |  | 
 **idpUrl** | **string** |  | 
 **idpCertAlias** | **string** |  | 
 **idpHttpRedirect** | **bool** |  | 
 **serviceProviderEntityId** | **string** |  | 
 **assertionConsumerServiceURL** | **string** |  | 
 **spPrivateKeyAlias** | **string** |  | 
 **keyStorePassword** | **string** |  | 
 **defaultRedirectUrl** | **string** |  | 
 **userIDAttribute** | **string** |  | 
 **useEncryption** | **bool** |  | 
 **createUser** | **bool** |  | 
 **addGroupMemberships** | **bool** |  | 
 **groupMembershipAttribute** | **string** |  | 
 **defaultGroups** | **[]string** |  | 
 **nameIdFormat** | **string** |  | 
 **synchronizeAttributes** | **[]string** |  | 
 **handleLogout** | **bool** |  | 
 **logoutUrl** | **string** |  | 
 **clockTolerance** | **int32** |  | 
 **digestMethod** | **string** |  | 
 **signatureMethod** | **string** |  | 
 **userIntermediatePath** | **string** |  | 
 **propertylist** | **[]string** |  | 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

