# \SlingAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteAgent**](SlingAPI.md#DeleteAgent) | **Delete** /etc/replication/agents.{runmode}/{name} | 
[**DeleteNode**](SlingAPI.md#DeleteNode) | **Delete** /{path}/{name} | 
[**GetAgent**](SlingAPI.md#GetAgent) | **Get** /etc/replication/agents.{runmode}/{name} | 
[**GetAgents**](SlingAPI.md#GetAgents) | **Get** /etc/replication/agents.{runmode}.-1.json | 
[**GetAuthorizableKeystore**](SlingAPI.md#GetAuthorizableKeystore) | **Get** /{intermediatePath}/{authorizableId}.ks.json | 
[**GetKeystore**](SlingAPI.md#GetKeystore) | **Get** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**GetNode**](SlingAPI.md#GetNode) | **Get** /{path}/{name} | 
[**GetPackage**](SlingAPI.md#GetPackage) | **Get** /etc/packages/{group}/{name}-{version}.zip | 
[**GetPackageFilter**](SlingAPI.md#GetPackageFilter) | **Get** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**GetQuery**](SlingAPI.md#GetQuery) | **Get** /bin/querybuilder.json | 
[**GetTruststore**](SlingAPI.md#GetTruststore) | **Get** /etc/truststore/truststore.p12 | 
[**GetTruststoreInfo**](SlingAPI.md#GetTruststoreInfo) | **Get** /libs/granite/security/truststore.json | 
[**PostAgent**](SlingAPI.md#PostAgent) | **Post** /etc/replication/agents.{runmode}/{name} | 
[**PostAuthorizableKeystore**](SlingAPI.md#PostAuthorizableKeystore) | **Post** /{intermediatePath}/{authorizableId}.ks.html | 
[**PostAuthorizables**](SlingAPI.md#PostAuthorizables) | **Post** /libs/granite/security/post/authorizables | 
[**PostConfigAdobeGraniteSamlAuthenticationHandler**](SlingAPI.md#PostConfigAdobeGraniteSamlAuthenticationHandler) | **Post** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**PostConfigApacheFelixJettyBasedHttpService**](SlingAPI.md#PostConfigApacheFelixJettyBasedHttpService) | **Post** /apps/system/config/org.apache.felix.http | 
[**PostConfigApacheHttpComponentsProxyConfiguration**](SlingAPI.md#PostConfigApacheHttpComponentsProxyConfiguration) | **Post** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**PostConfigApacheSlingDavExServlet**](SlingAPI.md#PostConfigApacheSlingDavExServlet) | **Post** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**PostConfigApacheSlingGetServlet**](SlingAPI.md#PostConfigApacheSlingGetServlet) | **Post** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**PostConfigApacheSlingReferrerFilter**](SlingAPI.md#PostConfigApacheSlingReferrerFilter) | **Post** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**PostConfigProperty**](SlingAPI.md#PostConfigProperty) | **Post** /apps/system/config/{configNodeName} | 
[**PostNode**](SlingAPI.md#PostNode) | **Post** /{path}/{name} | 
[**PostNodeRw**](SlingAPI.md#PostNodeRw) | **Post** /{path}/{name}.rw.html | 
[**PostPath**](SlingAPI.md#PostPath) | **Post** /{path}/ | 
[**PostQuery**](SlingAPI.md#PostQuery) | **Post** /bin/querybuilder.json | 
[**PostTreeActivation**](SlingAPI.md#PostTreeActivation) | **Post** /libs/replication/treeactivation.html | 
[**PostTruststore**](SlingAPI.md#PostTruststore) | **Post** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](SlingAPI.md#PostTruststorePKCS12) | **Post** /etc/truststore | 



## DeleteAgent

> DeleteAgent(ctx, runmode, name).Execute()



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
	runmode := "runmode_example" // string | 
	name := "name_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.DeleteAgent(context.Background(), runmode, name).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.DeleteAgent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**runmode** | **string** |  | 
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteAgentRequest struct via the builder pattern


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


## DeleteNode

> DeleteNode(ctx, path, name).Execute()



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
	path := "path_example" // string | 
	name := "name_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.DeleteNode(context.Background(), path, name).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.DeleteNode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**path** | **string** |  | 
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteNodeRequest struct via the builder pattern


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


## GetAgent

> GetAgent(ctx, runmode, name).Execute()



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
	runmode := "runmode_example" // string | 
	name := "name_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.GetAgent(context.Background(), runmode, name).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetAgent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**runmode** | **string** |  | 
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAgentRequest struct via the builder pattern


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


## GetAgents

> string GetAgents(ctx, runmode).Execute()



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
	runmode := "runmode_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.GetAgents(context.Background(), runmode).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetAgents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAgents`: string
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetAgents`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**runmode** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAgentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


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


## GetAuthorizableKeystore

> KeystoreInfo GetAuthorizableKeystore(ctx, intermediatePath, authorizableId).Execute()



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
	intermediatePath := "intermediatePath_example" // string | 
	authorizableId := "authorizableId_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.GetAuthorizableKeystore(context.Background(), intermediatePath, authorizableId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetAuthorizableKeystore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAuthorizableKeystore`: KeystoreInfo
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetAuthorizableKeystore`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**intermediatePath** | **string** |  | 
**authorizableId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAuthorizableKeystoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetKeystore

> *os.File GetKeystore(ctx, intermediatePath, authorizableId).Execute()



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
	intermediatePath := "intermediatePath_example" // string | 
	authorizableId := "authorizableId_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.GetKeystore(context.Background(), intermediatePath, authorizableId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetKeystore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetKeystore`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetKeystore`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**intermediatePath** | **string** |  | 
**authorizableId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetKeystoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[***os.File**](*os.File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetNode

> GetNode(ctx, path, name).Execute()



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
	path := "path_example" // string | 
	name := "name_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.GetNode(context.Background(), path, name).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetNode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**path** | **string** |  | 
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetNodeRequest struct via the builder pattern


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


## GetPackage

> *os.File GetPackage(ctx, group, name, version).Execute()



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
	group := "group_example" // string | 
	name := "name_example" // string | 
	version := "version_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.GetPackage(context.Background(), group, name, version).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetPackage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPackage`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetPackage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**group** | **string** |  | 
**name** | **string** |  | 
**version** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPackageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[***os.File**](*os.File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPackageFilter

> string GetPackageFilter(ctx, group, name, version).Execute()



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
	group := "group_example" // string | 
	name := "name_example" // string | 
	version := "version_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.GetPackageFilter(context.Background(), group, name, version).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetPackageFilter``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPackageFilter`: string
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetPackageFilter`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**group** | **string** |  | 
**name** | **string** |  | 
**version** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPackageFilterRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




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


## GetQuery

> string GetQuery(ctx).Path(path).PLimit(pLimit).Var1Property(var1Property).Var1PropertyValue(var1PropertyValue).Execute()



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
	path := "path_example" // string | 
	pLimit := float32(8.14) // float32 | 
	var1Property := "var1Property_example" // string | 
	var1PropertyValue := "var1PropertyValue_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.GetQuery(context.Background()).Path(path).PLimit(pLimit).Var1Property(var1Property).Var1PropertyValue(var1PropertyValue).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetQuery``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetQuery`: string
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetQuery`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetQueryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | 
 **pLimit** | **float32** |  | 
 **var1Property** | **string** |  | 
 **var1PropertyValue** | **string** |  | 

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


## GetTruststore

> *os.File GetTruststore(ctx).Execute()



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
	resp, r, err := apiClient.SlingAPI.GetTruststore(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetTruststore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetTruststore`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetTruststore`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetTruststoreRequest struct via the builder pattern


### Return type

[***os.File**](*os.File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTruststoreInfo

> TruststoreInfo GetTruststoreInfo(ctx).Execute()



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
	resp, r, err := apiClient.SlingAPI.GetTruststoreInfo(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.GetTruststoreInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetTruststoreInfo`: TruststoreInfo
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.GetTruststoreInfo`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetTruststoreInfoRequest struct via the builder pattern


### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostAgent

> PostAgent(ctx, runmode, name).JcrContentCqDistribute(jcrContentCqDistribute).JcrContentCqDistributeTypeHint(jcrContentCqDistributeTypeHint).JcrContentCqName(jcrContentCqName).JcrContentCqTemplate(jcrContentCqTemplate).JcrContentAliasUpdate(jcrContentAliasUpdate).JcrContentEnabled(jcrContentEnabled).JcrContentJcrDescription(jcrContentJcrDescription).JcrContentJcrLastModified(jcrContentJcrLastModified).JcrContentJcrLastModifiedBy(jcrContentJcrLastModifiedBy).JcrContentJcrMixinTypes(jcrContentJcrMixinTypes).JcrContentJcrTitle(jcrContentJcrTitle).JcrContentLogLevel(jcrContentLogLevel).JcrContentNoStatusUpdate(jcrContentNoStatusUpdate).JcrContentNoVersioning(jcrContentNoVersioning).JcrContentProtocolConnectTimeout(jcrContentProtocolConnectTimeout).JcrContentProtocolHTTPConnectionClosed(jcrContentProtocolHTTPConnectionClosed).JcrContentProtocolHTTPExpired(jcrContentProtocolHTTPExpired).JcrContentProtocolHTTPHeaders(jcrContentProtocolHTTPHeaders).JcrContentProtocolHTTPHeadersTypeHint(jcrContentProtocolHTTPHeadersTypeHint).JcrContentProtocolHTTPMethod(jcrContentProtocolHTTPMethod).JcrContentProtocolHTTPSRelaxed(jcrContentProtocolHTTPSRelaxed).JcrContentProtocolInterface(jcrContentProtocolInterface).JcrContentProtocolSocketTimeout(jcrContentProtocolSocketTimeout).JcrContentProtocolVersion(jcrContentProtocolVersion).JcrContentProxyNTLMDomain(jcrContentProxyNTLMDomain).JcrContentProxyNTLMHost(jcrContentProxyNTLMHost).JcrContentProxyHost(jcrContentProxyHost).JcrContentProxyPassword(jcrContentProxyPassword).JcrContentProxyPort(jcrContentProxyPort).JcrContentProxyUser(jcrContentProxyUser).JcrContentQueueBatchMaxSize(jcrContentQueueBatchMaxSize).JcrContentQueueBatchMode(jcrContentQueueBatchMode).JcrContentQueueBatchWaitTime(jcrContentQueueBatchWaitTime).JcrContentRetryDelay(jcrContentRetryDelay).JcrContentReverseReplication(jcrContentReverseReplication).JcrContentSerializationType(jcrContentSerializationType).JcrContentSlingResourceType(jcrContentSlingResourceType).JcrContentSsl(jcrContentSsl).JcrContentTransportNTLMDomain(jcrContentTransportNTLMDomain).JcrContentTransportNTLMHost(jcrContentTransportNTLMHost).JcrContentTransportPassword(jcrContentTransportPassword).JcrContentTransportUri(jcrContentTransportUri).JcrContentTransportUser(jcrContentTransportUser).JcrContentTriggerDistribute(jcrContentTriggerDistribute).JcrContentTriggerModified(jcrContentTriggerModified).JcrContentTriggerOnOffTime(jcrContentTriggerOnOffTime).JcrContentTriggerReceive(jcrContentTriggerReceive).JcrContentTriggerSpecific(jcrContentTriggerSpecific).JcrContentUserId(jcrContentUserId).JcrPrimaryType(jcrPrimaryType).Operation(operation).Execute()



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
	runmode := "runmode_example" // string | 
	name := "name_example" // string | 
	jcrContentCqDistribute := true // bool |  (optional)
	jcrContentCqDistributeTypeHint := "jcrContentCqDistributeTypeHint_example" // string |  (optional)
	jcrContentCqName := "jcrContentCqName_example" // string |  (optional)
	jcrContentCqTemplate := "jcrContentCqTemplate_example" // string |  (optional)
	jcrContentAliasUpdate := true // bool |  (optional)
	jcrContentEnabled := true // bool |  (optional)
	jcrContentJcrDescription := "jcrContentJcrDescription_example" // string |  (optional)
	jcrContentJcrLastModified := "jcrContentJcrLastModified_example" // string |  (optional)
	jcrContentJcrLastModifiedBy := "jcrContentJcrLastModifiedBy_example" // string |  (optional)
	jcrContentJcrMixinTypes := "jcrContentJcrMixinTypes_example" // string |  (optional)
	jcrContentJcrTitle := "jcrContentJcrTitle_example" // string |  (optional)
	jcrContentLogLevel := "jcrContentLogLevel_example" // string |  (optional)
	jcrContentNoStatusUpdate := true // bool |  (optional)
	jcrContentNoVersioning := true // bool |  (optional)
	jcrContentProtocolConnectTimeout := float32(8.14) // float32 |  (optional)
	jcrContentProtocolHTTPConnectionClosed := true // bool |  (optional)
	jcrContentProtocolHTTPExpired := "jcrContentProtocolHTTPExpired_example" // string |  (optional)
	jcrContentProtocolHTTPHeaders := []string{"Inner_example"} // []string |  (optional)
	jcrContentProtocolHTTPHeadersTypeHint := "jcrContentProtocolHTTPHeadersTypeHint_example" // string |  (optional)
	jcrContentProtocolHTTPMethod := "jcrContentProtocolHTTPMethod_example" // string |  (optional)
	jcrContentProtocolHTTPSRelaxed := true // bool |  (optional)
	jcrContentProtocolInterface := "jcrContentProtocolInterface_example" // string |  (optional)
	jcrContentProtocolSocketTimeout := float32(8.14) // float32 |  (optional)
	jcrContentProtocolVersion := "jcrContentProtocolVersion_example" // string |  (optional)
	jcrContentProxyNTLMDomain := "jcrContentProxyNTLMDomain_example" // string |  (optional)
	jcrContentProxyNTLMHost := "jcrContentProxyNTLMHost_example" // string |  (optional)
	jcrContentProxyHost := "jcrContentProxyHost_example" // string |  (optional)
	jcrContentProxyPassword := "jcrContentProxyPassword_example" // string |  (optional)
	jcrContentProxyPort := float32(8.14) // float32 |  (optional)
	jcrContentProxyUser := "jcrContentProxyUser_example" // string |  (optional)
	jcrContentQueueBatchMaxSize := float32(8.14) // float32 |  (optional)
	jcrContentQueueBatchMode := "jcrContentQueueBatchMode_example" // string |  (optional)
	jcrContentQueueBatchWaitTime := float32(8.14) // float32 |  (optional)
	jcrContentRetryDelay := "jcrContentRetryDelay_example" // string |  (optional)
	jcrContentReverseReplication := true // bool |  (optional)
	jcrContentSerializationType := "jcrContentSerializationType_example" // string |  (optional)
	jcrContentSlingResourceType := "jcrContentSlingResourceType_example" // string |  (optional)
	jcrContentSsl := "jcrContentSsl_example" // string |  (optional)
	jcrContentTransportNTLMDomain := "jcrContentTransportNTLMDomain_example" // string |  (optional)
	jcrContentTransportNTLMHost := "jcrContentTransportNTLMHost_example" // string |  (optional)
	jcrContentTransportPassword := "jcrContentTransportPassword_example" // string |  (optional)
	jcrContentTransportUri := "jcrContentTransportUri_example" // string |  (optional)
	jcrContentTransportUser := "jcrContentTransportUser_example" // string |  (optional)
	jcrContentTriggerDistribute := true // bool |  (optional)
	jcrContentTriggerModified := true // bool |  (optional)
	jcrContentTriggerOnOffTime := true // bool |  (optional)
	jcrContentTriggerReceive := true // bool |  (optional)
	jcrContentTriggerSpecific := true // bool |  (optional)
	jcrContentUserId := "jcrContentUserId_example" // string |  (optional)
	jcrPrimaryType := "jcrPrimaryType_example" // string |  (optional)
	operation := "operation_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostAgent(context.Background(), runmode, name).JcrContentCqDistribute(jcrContentCqDistribute).JcrContentCqDistributeTypeHint(jcrContentCqDistributeTypeHint).JcrContentCqName(jcrContentCqName).JcrContentCqTemplate(jcrContentCqTemplate).JcrContentAliasUpdate(jcrContentAliasUpdate).JcrContentEnabled(jcrContentEnabled).JcrContentJcrDescription(jcrContentJcrDescription).JcrContentJcrLastModified(jcrContentJcrLastModified).JcrContentJcrLastModifiedBy(jcrContentJcrLastModifiedBy).JcrContentJcrMixinTypes(jcrContentJcrMixinTypes).JcrContentJcrTitle(jcrContentJcrTitle).JcrContentLogLevel(jcrContentLogLevel).JcrContentNoStatusUpdate(jcrContentNoStatusUpdate).JcrContentNoVersioning(jcrContentNoVersioning).JcrContentProtocolConnectTimeout(jcrContentProtocolConnectTimeout).JcrContentProtocolHTTPConnectionClosed(jcrContentProtocolHTTPConnectionClosed).JcrContentProtocolHTTPExpired(jcrContentProtocolHTTPExpired).JcrContentProtocolHTTPHeaders(jcrContentProtocolHTTPHeaders).JcrContentProtocolHTTPHeadersTypeHint(jcrContentProtocolHTTPHeadersTypeHint).JcrContentProtocolHTTPMethod(jcrContentProtocolHTTPMethod).JcrContentProtocolHTTPSRelaxed(jcrContentProtocolHTTPSRelaxed).JcrContentProtocolInterface(jcrContentProtocolInterface).JcrContentProtocolSocketTimeout(jcrContentProtocolSocketTimeout).JcrContentProtocolVersion(jcrContentProtocolVersion).JcrContentProxyNTLMDomain(jcrContentProxyNTLMDomain).JcrContentProxyNTLMHost(jcrContentProxyNTLMHost).JcrContentProxyHost(jcrContentProxyHost).JcrContentProxyPassword(jcrContentProxyPassword).JcrContentProxyPort(jcrContentProxyPort).JcrContentProxyUser(jcrContentProxyUser).JcrContentQueueBatchMaxSize(jcrContentQueueBatchMaxSize).JcrContentQueueBatchMode(jcrContentQueueBatchMode).JcrContentQueueBatchWaitTime(jcrContentQueueBatchWaitTime).JcrContentRetryDelay(jcrContentRetryDelay).JcrContentReverseReplication(jcrContentReverseReplication).JcrContentSerializationType(jcrContentSerializationType).JcrContentSlingResourceType(jcrContentSlingResourceType).JcrContentSsl(jcrContentSsl).JcrContentTransportNTLMDomain(jcrContentTransportNTLMDomain).JcrContentTransportNTLMHost(jcrContentTransportNTLMHost).JcrContentTransportPassword(jcrContentTransportPassword).JcrContentTransportUri(jcrContentTransportUri).JcrContentTransportUser(jcrContentTransportUser).JcrContentTriggerDistribute(jcrContentTriggerDistribute).JcrContentTriggerModified(jcrContentTriggerModified).JcrContentTriggerOnOffTime(jcrContentTriggerOnOffTime).JcrContentTriggerReceive(jcrContentTriggerReceive).JcrContentTriggerSpecific(jcrContentTriggerSpecific).JcrContentUserId(jcrContentUserId).JcrPrimaryType(jcrPrimaryType).Operation(operation).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostAgent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**runmode** | **string** |  | 
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostAgentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **jcrContentCqDistribute** | **bool** |  | 
 **jcrContentCqDistributeTypeHint** | **string** |  | 
 **jcrContentCqName** | **string** |  | 
 **jcrContentCqTemplate** | **string** |  | 
 **jcrContentAliasUpdate** | **bool** |  | 
 **jcrContentEnabled** | **bool** |  | 
 **jcrContentJcrDescription** | **string** |  | 
 **jcrContentJcrLastModified** | **string** |  | 
 **jcrContentJcrLastModifiedBy** | **string** |  | 
 **jcrContentJcrMixinTypes** | **string** |  | 
 **jcrContentJcrTitle** | **string** |  | 
 **jcrContentLogLevel** | **string** |  | 
 **jcrContentNoStatusUpdate** | **bool** |  | 
 **jcrContentNoVersioning** | **bool** |  | 
 **jcrContentProtocolConnectTimeout** | **float32** |  | 
 **jcrContentProtocolHTTPConnectionClosed** | **bool** |  | 
 **jcrContentProtocolHTTPExpired** | **string** |  | 
 **jcrContentProtocolHTTPHeaders** | **[]string** |  | 
 **jcrContentProtocolHTTPHeadersTypeHint** | **string** |  | 
 **jcrContentProtocolHTTPMethod** | **string** |  | 
 **jcrContentProtocolHTTPSRelaxed** | **bool** |  | 
 **jcrContentProtocolInterface** | **string** |  | 
 **jcrContentProtocolSocketTimeout** | **float32** |  | 
 **jcrContentProtocolVersion** | **string** |  | 
 **jcrContentProxyNTLMDomain** | **string** |  | 
 **jcrContentProxyNTLMHost** | **string** |  | 
 **jcrContentProxyHost** | **string** |  | 
 **jcrContentProxyPassword** | **string** |  | 
 **jcrContentProxyPort** | **float32** |  | 
 **jcrContentProxyUser** | **string** |  | 
 **jcrContentQueueBatchMaxSize** | **float32** |  | 
 **jcrContentQueueBatchMode** | **string** |  | 
 **jcrContentQueueBatchWaitTime** | **float32** |  | 
 **jcrContentRetryDelay** | **string** |  | 
 **jcrContentReverseReplication** | **bool** |  | 
 **jcrContentSerializationType** | **string** |  | 
 **jcrContentSlingResourceType** | **string** |  | 
 **jcrContentSsl** | **string** |  | 
 **jcrContentTransportNTLMDomain** | **string** |  | 
 **jcrContentTransportNTLMHost** | **string** |  | 
 **jcrContentTransportPassword** | **string** |  | 
 **jcrContentTransportUri** | **string** |  | 
 **jcrContentTransportUser** | **string** |  | 
 **jcrContentTriggerDistribute** | **bool** |  | 
 **jcrContentTriggerModified** | **bool** |  | 
 **jcrContentTriggerOnOffTime** | **bool** |  | 
 **jcrContentTriggerReceive** | **bool** |  | 
 **jcrContentTriggerSpecific** | **bool** |  | 
 **jcrContentUserId** | **string** |  | 
 **jcrPrimaryType** | **string** |  | 
 **operation** | **string** |  | 

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


## PostAuthorizableKeystore

> KeystoreInfo PostAuthorizableKeystore(ctx, intermediatePath, authorizableId).Operation(operation).CurrentPassword(currentPassword).NewPassword(newPassword).RePassword(rePassword).KeyPassword(keyPassword).KeyStorePass(keyStorePass).Alias(alias).NewAlias(newAlias).RemoveAlias(removeAlias).CertChain(certChain).Pk(pk).KeyStore(keyStore).Execute()



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
	intermediatePath := "intermediatePath_example" // string | 
	authorizableId := "authorizableId_example" // string | 
	operation := "operation_example" // string |  (optional)
	currentPassword := "currentPassword_example" // string |  (optional)
	newPassword := "newPassword_example" // string |  (optional)
	rePassword := "rePassword_example" // string |  (optional)
	keyPassword := "keyPassword_example" // string |  (optional)
	keyStorePass := "keyStorePass_example" // string |  (optional)
	alias := "alias_example" // string |  (optional)
	newAlias := "newAlias_example" // string |  (optional)
	removeAlias := "removeAlias_example" // string |  (optional)
	certChain := os.NewFile(1234, "some_file") // *os.File |  (optional)
	pk := os.NewFile(1234, "some_file") // *os.File |  (optional)
	keyStore := os.NewFile(1234, "some_file") // *os.File |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.PostAuthorizableKeystore(context.Background(), intermediatePath, authorizableId).Operation(operation).CurrentPassword(currentPassword).NewPassword(newPassword).RePassword(rePassword).KeyPassword(keyPassword).KeyStorePass(keyStorePass).Alias(alias).NewAlias(newAlias).RemoveAlias(removeAlias).CertChain(certChain).Pk(pk).KeyStore(keyStore).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostAuthorizableKeystore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PostAuthorizableKeystore`: KeystoreInfo
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.PostAuthorizableKeystore`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**intermediatePath** | **string** |  | 
**authorizableId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostAuthorizableKeystoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **operation** | **string** |  | 
 **currentPassword** | **string** |  | 
 **newPassword** | **string** |  | 
 **rePassword** | **string** |  | 
 **keyPassword** | **string** |  | 
 **keyStorePass** | **string** |  | 
 **alias** | **string** |  | 
 **newAlias** | **string** |  | 
 **removeAlias** | **string** |  | 
 **certChain** | ***os.File** |  | 
 **pk** | ***os.File** |  | 
 **keyStore** | ***os.File** |  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostAuthorizables

> string PostAuthorizables(ctx).AuthorizableId(authorizableId).IntermediatePath(intermediatePath).CreateUser(createUser).CreateGroup(createGroup).RepPassword(repPassword).ProfileGivenName(profileGivenName).Execute()



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
	intermediatePath := "intermediatePath_example" // string | 
	createUser := "createUser_example" // string |  (optional)
	createGroup := "createGroup_example" // string |  (optional)
	repPassword := "repPassword_example" // string |  (optional)
	profileGivenName := "profileGivenName_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.PostAuthorizables(context.Background()).AuthorizableId(authorizableId).IntermediatePath(intermediatePath).CreateUser(createUser).CreateGroup(createGroup).RepPassword(repPassword).ProfileGivenName(profileGivenName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostAuthorizables``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PostAuthorizables`: string
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.PostAuthorizables`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostAuthorizablesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **string** |  | 
 **intermediatePath** | **string** |  | 
 **createUser** | **string** |  | 
 **createGroup** | **string** |  | 
 **repPassword** | **string** |  | 
 **profileGivenName** | **string** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostConfigAdobeGraniteSamlAuthenticationHandler

> PostConfigAdobeGraniteSamlAuthenticationHandler(ctx).KeyStorePassword(keyStorePassword).KeyStorePasswordTypeHint(keyStorePasswordTypeHint).ServiceRanking(serviceRanking).ServiceRankingTypeHint(serviceRankingTypeHint).IdpHttpRedirect(idpHttpRedirect).IdpHttpRedirectTypeHint(idpHttpRedirectTypeHint).CreateUser(createUser).CreateUserTypeHint(createUserTypeHint).DefaultRedirectUrl(defaultRedirectUrl).DefaultRedirectUrlTypeHint(defaultRedirectUrlTypeHint).UserIDAttribute(userIDAttribute).UserIDAttributeTypeHint(userIDAttributeTypeHint).DefaultGroups(defaultGroups).DefaultGroupsTypeHint(defaultGroupsTypeHint).IdpCertAlias(idpCertAlias).IdpCertAliasTypeHint(idpCertAliasTypeHint).AddGroupMemberships(addGroupMemberships).AddGroupMembershipsTypeHint(addGroupMembershipsTypeHint).Path(path).PathTypeHint(pathTypeHint).SynchronizeAttributes(synchronizeAttributes).SynchronizeAttributesTypeHint(synchronizeAttributesTypeHint).ClockTolerance(clockTolerance).ClockToleranceTypeHint(clockToleranceTypeHint).GroupMembershipAttribute(groupMembershipAttribute).GroupMembershipAttributeTypeHint(groupMembershipAttributeTypeHint).IdpUrl(idpUrl).IdpUrlTypeHint(idpUrlTypeHint).LogoutUrl(logoutUrl).LogoutUrlTypeHint(logoutUrlTypeHint).ServiceProviderEntityId(serviceProviderEntityId).ServiceProviderEntityIdTypeHint(serviceProviderEntityIdTypeHint).AssertionConsumerServiceURL(assertionConsumerServiceURL).AssertionConsumerServiceURLTypeHint(assertionConsumerServiceURLTypeHint).HandleLogout(handleLogout).HandleLogoutTypeHint(handleLogoutTypeHint).SpPrivateKeyAlias(spPrivateKeyAlias).SpPrivateKeyAliasTypeHint(spPrivateKeyAliasTypeHint).UseEncryption(useEncryption).UseEncryptionTypeHint(useEncryptionTypeHint).NameIdFormat(nameIdFormat).NameIdFormatTypeHint(nameIdFormatTypeHint).DigestMethod(digestMethod).DigestMethodTypeHint(digestMethodTypeHint).SignatureMethod(signatureMethod).SignatureMethodTypeHint(signatureMethodTypeHint).UserIntermediatePath(userIntermediatePath).UserIntermediatePathTypeHint(userIntermediatePathTypeHint).Execute()



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
	keyStorePassword := "keyStorePassword_example" // string |  (optional)
	keyStorePasswordTypeHint := "keyStorePasswordTypeHint_example" // string |  (optional)
	serviceRanking := int32(56) // int32 |  (optional)
	serviceRankingTypeHint := "serviceRankingTypeHint_example" // string |  (optional)
	idpHttpRedirect := true // bool |  (optional)
	idpHttpRedirectTypeHint := "idpHttpRedirectTypeHint_example" // string |  (optional)
	createUser := true // bool |  (optional)
	createUserTypeHint := "createUserTypeHint_example" // string |  (optional)
	defaultRedirectUrl := "defaultRedirectUrl_example" // string |  (optional)
	defaultRedirectUrlTypeHint := "defaultRedirectUrlTypeHint_example" // string |  (optional)
	userIDAttribute := "userIDAttribute_example" // string |  (optional)
	userIDAttributeTypeHint := "userIDAttributeTypeHint_example" // string |  (optional)
	defaultGroups := []string{"Inner_example"} // []string |  (optional)
	defaultGroupsTypeHint := "defaultGroupsTypeHint_example" // string |  (optional)
	idpCertAlias := "idpCertAlias_example" // string |  (optional)
	idpCertAliasTypeHint := "idpCertAliasTypeHint_example" // string |  (optional)
	addGroupMemberships := true // bool |  (optional)
	addGroupMembershipsTypeHint := "addGroupMembershipsTypeHint_example" // string |  (optional)
	path := []string{"Inner_example"} // []string |  (optional)
	pathTypeHint := "pathTypeHint_example" // string |  (optional)
	synchronizeAttributes := []string{"Inner_example"} // []string |  (optional)
	synchronizeAttributesTypeHint := "synchronizeAttributesTypeHint_example" // string |  (optional)
	clockTolerance := int32(56) // int32 |  (optional)
	clockToleranceTypeHint := "clockToleranceTypeHint_example" // string |  (optional)
	groupMembershipAttribute := "groupMembershipAttribute_example" // string |  (optional)
	groupMembershipAttributeTypeHint := "groupMembershipAttributeTypeHint_example" // string |  (optional)
	idpUrl := "idpUrl_example" // string |  (optional)
	idpUrlTypeHint := "idpUrlTypeHint_example" // string |  (optional)
	logoutUrl := "logoutUrl_example" // string |  (optional)
	logoutUrlTypeHint := "logoutUrlTypeHint_example" // string |  (optional)
	serviceProviderEntityId := "serviceProviderEntityId_example" // string |  (optional)
	serviceProviderEntityIdTypeHint := "serviceProviderEntityIdTypeHint_example" // string |  (optional)
	assertionConsumerServiceURL := "assertionConsumerServiceURL_example" // string |  (optional)
	assertionConsumerServiceURLTypeHint := "assertionConsumerServiceURLTypeHint_example" // string |  (optional)
	handleLogout := true // bool |  (optional)
	handleLogoutTypeHint := "handleLogoutTypeHint_example" // string |  (optional)
	spPrivateKeyAlias := "spPrivateKeyAlias_example" // string |  (optional)
	spPrivateKeyAliasTypeHint := "spPrivateKeyAliasTypeHint_example" // string |  (optional)
	useEncryption := true // bool |  (optional)
	useEncryptionTypeHint := "useEncryptionTypeHint_example" // string |  (optional)
	nameIdFormat := "nameIdFormat_example" // string |  (optional)
	nameIdFormatTypeHint := "nameIdFormatTypeHint_example" // string |  (optional)
	digestMethod := "digestMethod_example" // string |  (optional)
	digestMethodTypeHint := "digestMethodTypeHint_example" // string |  (optional)
	signatureMethod := "signatureMethod_example" // string |  (optional)
	signatureMethodTypeHint := "signatureMethodTypeHint_example" // string |  (optional)
	userIntermediatePath := "userIntermediatePath_example" // string |  (optional)
	userIntermediatePathTypeHint := "userIntermediatePathTypeHint_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostConfigAdobeGraniteSamlAuthenticationHandler(context.Background()).KeyStorePassword(keyStorePassword).KeyStorePasswordTypeHint(keyStorePasswordTypeHint).ServiceRanking(serviceRanking).ServiceRankingTypeHint(serviceRankingTypeHint).IdpHttpRedirect(idpHttpRedirect).IdpHttpRedirectTypeHint(idpHttpRedirectTypeHint).CreateUser(createUser).CreateUserTypeHint(createUserTypeHint).DefaultRedirectUrl(defaultRedirectUrl).DefaultRedirectUrlTypeHint(defaultRedirectUrlTypeHint).UserIDAttribute(userIDAttribute).UserIDAttributeTypeHint(userIDAttributeTypeHint).DefaultGroups(defaultGroups).DefaultGroupsTypeHint(defaultGroupsTypeHint).IdpCertAlias(idpCertAlias).IdpCertAliasTypeHint(idpCertAliasTypeHint).AddGroupMemberships(addGroupMemberships).AddGroupMembershipsTypeHint(addGroupMembershipsTypeHint).Path(path).PathTypeHint(pathTypeHint).SynchronizeAttributes(synchronizeAttributes).SynchronizeAttributesTypeHint(synchronizeAttributesTypeHint).ClockTolerance(clockTolerance).ClockToleranceTypeHint(clockToleranceTypeHint).GroupMembershipAttribute(groupMembershipAttribute).GroupMembershipAttributeTypeHint(groupMembershipAttributeTypeHint).IdpUrl(idpUrl).IdpUrlTypeHint(idpUrlTypeHint).LogoutUrl(logoutUrl).LogoutUrlTypeHint(logoutUrlTypeHint).ServiceProviderEntityId(serviceProviderEntityId).ServiceProviderEntityIdTypeHint(serviceProviderEntityIdTypeHint).AssertionConsumerServiceURL(assertionConsumerServiceURL).AssertionConsumerServiceURLTypeHint(assertionConsumerServiceURLTypeHint).HandleLogout(handleLogout).HandleLogoutTypeHint(handleLogoutTypeHint).SpPrivateKeyAlias(spPrivateKeyAlias).SpPrivateKeyAliasTypeHint(spPrivateKeyAliasTypeHint).UseEncryption(useEncryption).UseEncryptionTypeHint(useEncryptionTypeHint).NameIdFormat(nameIdFormat).NameIdFormatTypeHint(nameIdFormatTypeHint).DigestMethod(digestMethod).DigestMethodTypeHint(digestMethodTypeHint).SignatureMethod(signatureMethod).SignatureMethodTypeHint(signatureMethodTypeHint).UserIntermediatePath(userIntermediatePath).UserIntermediatePathTypeHint(userIntermediatePathTypeHint).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostConfigAdobeGraniteSamlAuthenticationHandler``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigAdobeGraniteSamlAuthenticationHandlerRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **string** |  | 
 **keyStorePasswordTypeHint** | **string** |  | 
 **serviceRanking** | **int32** |  | 
 **serviceRankingTypeHint** | **string** |  | 
 **idpHttpRedirect** | **bool** |  | 
 **idpHttpRedirectTypeHint** | **string** |  | 
 **createUser** | **bool** |  | 
 **createUserTypeHint** | **string** |  | 
 **defaultRedirectUrl** | **string** |  | 
 **defaultRedirectUrlTypeHint** | **string** |  | 
 **userIDAttribute** | **string** |  | 
 **userIDAttributeTypeHint** | **string** |  | 
 **defaultGroups** | **[]string** |  | 
 **defaultGroupsTypeHint** | **string** |  | 
 **idpCertAlias** | **string** |  | 
 **idpCertAliasTypeHint** | **string** |  | 
 **addGroupMemberships** | **bool** |  | 
 **addGroupMembershipsTypeHint** | **string** |  | 
 **path** | **[]string** |  | 
 **pathTypeHint** | **string** |  | 
 **synchronizeAttributes** | **[]string** |  | 
 **synchronizeAttributesTypeHint** | **string** |  | 
 **clockTolerance** | **int32** |  | 
 **clockToleranceTypeHint** | **string** |  | 
 **groupMembershipAttribute** | **string** |  | 
 **groupMembershipAttributeTypeHint** | **string** |  | 
 **idpUrl** | **string** |  | 
 **idpUrlTypeHint** | **string** |  | 
 **logoutUrl** | **string** |  | 
 **logoutUrlTypeHint** | **string** |  | 
 **serviceProviderEntityId** | **string** |  | 
 **serviceProviderEntityIdTypeHint** | **string** |  | 
 **assertionConsumerServiceURL** | **string** |  | 
 **assertionConsumerServiceURLTypeHint** | **string** |  | 
 **handleLogout** | **bool** |  | 
 **handleLogoutTypeHint** | **string** |  | 
 **spPrivateKeyAlias** | **string** |  | 
 **spPrivateKeyAliasTypeHint** | **string** |  | 
 **useEncryption** | **bool** |  | 
 **useEncryptionTypeHint** | **string** |  | 
 **nameIdFormat** | **string** |  | 
 **nameIdFormatTypeHint** | **string** |  | 
 **digestMethod** | **string** |  | 
 **digestMethodTypeHint** | **string** |  | 
 **signatureMethod** | **string** |  | 
 **signatureMethodTypeHint** | **string** |  | 
 **userIntermediatePath** | **string** |  | 
 **userIntermediatePathTypeHint** | **string** |  | 

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


## PostConfigApacheFelixJettyBasedHttpService

> PostConfigApacheFelixJettyBasedHttpService(ctx).OrgApacheFelixHttpsNio(orgApacheFelixHttpsNio).OrgApacheFelixHttpsNioTypeHint(orgApacheFelixHttpsNioTypeHint).OrgApacheFelixHttpsKeystore(orgApacheFelixHttpsKeystore).OrgApacheFelixHttpsKeystoreTypeHint(orgApacheFelixHttpsKeystoreTypeHint).OrgApacheFelixHttpsKeystorePassword(orgApacheFelixHttpsKeystorePassword).OrgApacheFelixHttpsKeystorePasswordTypeHint(orgApacheFelixHttpsKeystorePasswordTypeHint).OrgApacheFelixHttpsKeystoreKey(orgApacheFelixHttpsKeystoreKey).OrgApacheFelixHttpsKeystoreKeyTypeHint(orgApacheFelixHttpsKeystoreKeyTypeHint).OrgApacheFelixHttpsKeystoreKeyPassword(orgApacheFelixHttpsKeystoreKeyPassword).OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint(orgApacheFelixHttpsKeystoreKeyPasswordTypeHint).OrgApacheFelixHttpsTruststore(orgApacheFelixHttpsTruststore).OrgApacheFelixHttpsTruststoreTypeHint(orgApacheFelixHttpsTruststoreTypeHint).OrgApacheFelixHttpsTruststorePassword(orgApacheFelixHttpsTruststorePassword).OrgApacheFelixHttpsTruststorePasswordTypeHint(orgApacheFelixHttpsTruststorePasswordTypeHint).OrgApacheFelixHttpsClientcertificate(orgApacheFelixHttpsClientcertificate).OrgApacheFelixHttpsClientcertificateTypeHint(orgApacheFelixHttpsClientcertificateTypeHint).OrgApacheFelixHttpsEnable(orgApacheFelixHttpsEnable).OrgApacheFelixHttpsEnableTypeHint(orgApacheFelixHttpsEnableTypeHint).OrgOsgiServiceHttpPortSecure(orgOsgiServiceHttpPortSecure).OrgOsgiServiceHttpPortSecureTypeHint(orgOsgiServiceHttpPortSecureTypeHint).Execute()



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
	orgApacheFelixHttpsNio := true // bool |  (optional)
	orgApacheFelixHttpsNioTypeHint := "orgApacheFelixHttpsNioTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsKeystore := "orgApacheFelixHttpsKeystore_example" // string |  (optional)
	orgApacheFelixHttpsKeystoreTypeHint := "orgApacheFelixHttpsKeystoreTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsKeystorePassword := "orgApacheFelixHttpsKeystorePassword_example" // string |  (optional)
	orgApacheFelixHttpsKeystorePasswordTypeHint := "orgApacheFelixHttpsKeystorePasswordTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsKeystoreKey := "orgApacheFelixHttpsKeystoreKey_example" // string |  (optional)
	orgApacheFelixHttpsKeystoreKeyTypeHint := "orgApacheFelixHttpsKeystoreKeyTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsKeystoreKeyPassword := "orgApacheFelixHttpsKeystoreKeyPassword_example" // string |  (optional)
	orgApacheFelixHttpsKeystoreKeyPasswordTypeHint := "orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsTruststore := "orgApacheFelixHttpsTruststore_example" // string |  (optional)
	orgApacheFelixHttpsTruststoreTypeHint := "orgApacheFelixHttpsTruststoreTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsTruststorePassword := "orgApacheFelixHttpsTruststorePassword_example" // string |  (optional)
	orgApacheFelixHttpsTruststorePasswordTypeHint := "orgApacheFelixHttpsTruststorePasswordTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsClientcertificate := "orgApacheFelixHttpsClientcertificate_example" // string |  (optional)
	orgApacheFelixHttpsClientcertificateTypeHint := "orgApacheFelixHttpsClientcertificateTypeHint_example" // string |  (optional)
	orgApacheFelixHttpsEnable := true // bool |  (optional)
	orgApacheFelixHttpsEnableTypeHint := "orgApacheFelixHttpsEnableTypeHint_example" // string |  (optional)
	orgOsgiServiceHttpPortSecure := "orgOsgiServiceHttpPortSecure_example" // string |  (optional)
	orgOsgiServiceHttpPortSecureTypeHint := "orgOsgiServiceHttpPortSecureTypeHint_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostConfigApacheFelixJettyBasedHttpService(context.Background()).OrgApacheFelixHttpsNio(orgApacheFelixHttpsNio).OrgApacheFelixHttpsNioTypeHint(orgApacheFelixHttpsNioTypeHint).OrgApacheFelixHttpsKeystore(orgApacheFelixHttpsKeystore).OrgApacheFelixHttpsKeystoreTypeHint(orgApacheFelixHttpsKeystoreTypeHint).OrgApacheFelixHttpsKeystorePassword(orgApacheFelixHttpsKeystorePassword).OrgApacheFelixHttpsKeystorePasswordTypeHint(orgApacheFelixHttpsKeystorePasswordTypeHint).OrgApacheFelixHttpsKeystoreKey(orgApacheFelixHttpsKeystoreKey).OrgApacheFelixHttpsKeystoreKeyTypeHint(orgApacheFelixHttpsKeystoreKeyTypeHint).OrgApacheFelixHttpsKeystoreKeyPassword(orgApacheFelixHttpsKeystoreKeyPassword).OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint(orgApacheFelixHttpsKeystoreKeyPasswordTypeHint).OrgApacheFelixHttpsTruststore(orgApacheFelixHttpsTruststore).OrgApacheFelixHttpsTruststoreTypeHint(orgApacheFelixHttpsTruststoreTypeHint).OrgApacheFelixHttpsTruststorePassword(orgApacheFelixHttpsTruststorePassword).OrgApacheFelixHttpsTruststorePasswordTypeHint(orgApacheFelixHttpsTruststorePasswordTypeHint).OrgApacheFelixHttpsClientcertificate(orgApacheFelixHttpsClientcertificate).OrgApacheFelixHttpsClientcertificateTypeHint(orgApacheFelixHttpsClientcertificateTypeHint).OrgApacheFelixHttpsEnable(orgApacheFelixHttpsEnable).OrgApacheFelixHttpsEnableTypeHint(orgApacheFelixHttpsEnableTypeHint).OrgOsgiServiceHttpPortSecure(orgOsgiServiceHttpPortSecure).OrgOsgiServiceHttpPortSecureTypeHint(orgOsgiServiceHttpPortSecureTypeHint).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostConfigApacheFelixJettyBasedHttpService``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigApacheFelixJettyBasedHttpServiceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **bool** |  | 
 **orgApacheFelixHttpsNioTypeHint** | **string** |  | 
 **orgApacheFelixHttpsKeystore** | **string** |  | 
 **orgApacheFelixHttpsKeystoreTypeHint** | **string** |  | 
 **orgApacheFelixHttpsKeystorePassword** | **string** |  | 
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **string** |  | 
 **orgApacheFelixHttpsKeystoreKey** | **string** |  | 
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **string** |  | 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **string** |  | 
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **string** |  | 
 **orgApacheFelixHttpsTruststore** | **string** |  | 
 **orgApacheFelixHttpsTruststoreTypeHint** | **string** |  | 
 **orgApacheFelixHttpsTruststorePassword** | **string** |  | 
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **string** |  | 
 **orgApacheFelixHttpsClientcertificate** | **string** |  | 
 **orgApacheFelixHttpsClientcertificateTypeHint** | **string** |  | 
 **orgApacheFelixHttpsEnable** | **bool** |  | 
 **orgApacheFelixHttpsEnableTypeHint** | **string** |  | 
 **orgOsgiServiceHttpPortSecure** | **string** |  | 
 **orgOsgiServiceHttpPortSecureTypeHint** | **string** |  | 

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


## PostConfigApacheHttpComponentsProxyConfiguration

> PostConfigApacheHttpComponentsProxyConfiguration(ctx).ProxyHost(proxyHost).ProxyHostTypeHint(proxyHostTypeHint).ProxyPort(proxyPort).ProxyPortTypeHint(proxyPortTypeHint).ProxyExceptions(proxyExceptions).ProxyExceptionsTypeHint(proxyExceptionsTypeHint).ProxyEnabled(proxyEnabled).ProxyEnabledTypeHint(proxyEnabledTypeHint).ProxyUser(proxyUser).ProxyUserTypeHint(proxyUserTypeHint).ProxyPassword(proxyPassword).ProxyPasswordTypeHint(proxyPasswordTypeHint).Execute()



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
	proxyHost := "proxyHost_example" // string |  (optional)
	proxyHostTypeHint := "proxyHostTypeHint_example" // string |  (optional)
	proxyPort := int32(56) // int32 |  (optional)
	proxyPortTypeHint := "proxyPortTypeHint_example" // string |  (optional)
	proxyExceptions := []string{"Inner_example"} // []string |  (optional)
	proxyExceptionsTypeHint := "proxyExceptionsTypeHint_example" // string |  (optional)
	proxyEnabled := true // bool |  (optional)
	proxyEnabledTypeHint := "proxyEnabledTypeHint_example" // string |  (optional)
	proxyUser := "proxyUser_example" // string |  (optional)
	proxyUserTypeHint := "proxyUserTypeHint_example" // string |  (optional)
	proxyPassword := "proxyPassword_example" // string |  (optional)
	proxyPasswordTypeHint := "proxyPasswordTypeHint_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostConfigApacheHttpComponentsProxyConfiguration(context.Background()).ProxyHost(proxyHost).ProxyHostTypeHint(proxyHostTypeHint).ProxyPort(proxyPort).ProxyPortTypeHint(proxyPortTypeHint).ProxyExceptions(proxyExceptions).ProxyExceptionsTypeHint(proxyExceptionsTypeHint).ProxyEnabled(proxyEnabled).ProxyEnabledTypeHint(proxyEnabledTypeHint).ProxyUser(proxyUser).ProxyUserTypeHint(proxyUserTypeHint).ProxyPassword(proxyPassword).ProxyPasswordTypeHint(proxyPasswordTypeHint).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostConfigApacheHttpComponentsProxyConfiguration``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigApacheHttpComponentsProxyConfigurationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **string** |  | 
 **proxyHostTypeHint** | **string** |  | 
 **proxyPort** | **int32** |  | 
 **proxyPortTypeHint** | **string** |  | 
 **proxyExceptions** | **[]string** |  | 
 **proxyExceptionsTypeHint** | **string** |  | 
 **proxyEnabled** | **bool** |  | 
 **proxyEnabledTypeHint** | **string** |  | 
 **proxyUser** | **string** |  | 
 **proxyUserTypeHint** | **string** |  | 
 **proxyPassword** | **string** |  | 
 **proxyPasswordTypeHint** | **string** |  | 

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


## PostConfigApacheSlingDavExServlet

> PostConfigApacheSlingDavExServlet(ctx).Alias(alias).AliasTypeHint(aliasTypeHint).DavCreateAbsoluteUri(davCreateAbsoluteUri).DavCreateAbsoluteUriTypeHint(davCreateAbsoluteUriTypeHint).Execute()



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
	alias := "alias_example" // string |  (optional)
	aliasTypeHint := "aliasTypeHint_example" // string |  (optional)
	davCreateAbsoluteUri := true // bool |  (optional)
	davCreateAbsoluteUriTypeHint := "davCreateAbsoluteUriTypeHint_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostConfigApacheSlingDavExServlet(context.Background()).Alias(alias).AliasTypeHint(aliasTypeHint).DavCreateAbsoluteUri(davCreateAbsoluteUri).DavCreateAbsoluteUriTypeHint(davCreateAbsoluteUriTypeHint).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostConfigApacheSlingDavExServlet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigApacheSlingDavExServletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **string** |  | 
 **aliasTypeHint** | **string** |  | 
 **davCreateAbsoluteUri** | **bool** |  | 
 **davCreateAbsoluteUriTypeHint** | **string** |  | 

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


## PostConfigApacheSlingGetServlet

> PostConfigApacheSlingGetServlet(ctx).JsonMaximumresults(jsonMaximumresults).JsonMaximumresultsTypeHint(jsonMaximumresultsTypeHint).EnableHtml(enableHtml).EnableHtmlTypeHint(enableHtmlTypeHint).EnableTxt(enableTxt).EnableTxtTypeHint(enableTxtTypeHint).EnableXml(enableXml).EnableXmlTypeHint(enableXmlTypeHint).Execute()



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
	jsonMaximumresults := "jsonMaximumresults_example" // string |  (optional)
	jsonMaximumresultsTypeHint := "jsonMaximumresultsTypeHint_example" // string |  (optional)
	enableHtml := true // bool |  (optional)
	enableHtmlTypeHint := "enableHtmlTypeHint_example" // string |  (optional)
	enableTxt := true // bool |  (optional)
	enableTxtTypeHint := "enableTxtTypeHint_example" // string |  (optional)
	enableXml := true // bool |  (optional)
	enableXmlTypeHint := "enableXmlTypeHint_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostConfigApacheSlingGetServlet(context.Background()).JsonMaximumresults(jsonMaximumresults).JsonMaximumresultsTypeHint(jsonMaximumresultsTypeHint).EnableHtml(enableHtml).EnableHtmlTypeHint(enableHtmlTypeHint).EnableTxt(enableTxt).EnableTxtTypeHint(enableTxtTypeHint).EnableXml(enableXml).EnableXmlTypeHint(enableXmlTypeHint).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostConfigApacheSlingGetServlet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigApacheSlingGetServletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **string** |  | 
 **jsonMaximumresultsTypeHint** | **string** |  | 
 **enableHtml** | **bool** |  | 
 **enableHtmlTypeHint** | **string** |  | 
 **enableTxt** | **bool** |  | 
 **enableTxtTypeHint** | **string** |  | 
 **enableXml** | **bool** |  | 
 **enableXmlTypeHint** | **string** |  | 

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


## PostConfigApacheSlingReferrerFilter

> PostConfigApacheSlingReferrerFilter(ctx).AllowEmpty(allowEmpty).AllowEmptyTypeHint(allowEmptyTypeHint).AllowHosts(allowHosts).AllowHostsTypeHint(allowHostsTypeHint).AllowHostsRegexp(allowHostsRegexp).AllowHostsRegexpTypeHint(allowHostsRegexpTypeHint).FilterMethods(filterMethods).FilterMethodsTypeHint(filterMethodsTypeHint).Execute()



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
	allowEmpty := true // bool |  (optional)
	allowEmptyTypeHint := "allowEmptyTypeHint_example" // string |  (optional)
	allowHosts := "allowHosts_example" // string |  (optional)
	allowHostsTypeHint := "allowHostsTypeHint_example" // string |  (optional)
	allowHostsRegexp := "allowHostsRegexp_example" // string |  (optional)
	allowHostsRegexpTypeHint := "allowHostsRegexpTypeHint_example" // string |  (optional)
	filterMethods := "filterMethods_example" // string |  (optional)
	filterMethodsTypeHint := "filterMethodsTypeHint_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostConfigApacheSlingReferrerFilter(context.Background()).AllowEmpty(allowEmpty).AllowEmptyTypeHint(allowEmptyTypeHint).AllowHosts(allowHosts).AllowHostsTypeHint(allowHostsTypeHint).AllowHostsRegexp(allowHostsRegexp).AllowHostsRegexpTypeHint(allowHostsRegexpTypeHint).FilterMethods(filterMethods).FilterMethodsTypeHint(filterMethodsTypeHint).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostConfigApacheSlingReferrerFilter``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigApacheSlingReferrerFilterRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **bool** |  | 
 **allowEmptyTypeHint** | **string** |  | 
 **allowHosts** | **string** |  | 
 **allowHostsTypeHint** | **string** |  | 
 **allowHostsRegexp** | **string** |  | 
 **allowHostsRegexpTypeHint** | **string** |  | 
 **filterMethods** | **string** |  | 
 **filterMethodsTypeHint** | **string** |  | 

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


## PostConfigProperty

> PostConfigProperty(ctx, configNodeName).Execute()



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
	configNodeName := "configNodeName_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostConfigProperty(context.Background(), configNodeName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostConfigProperty``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**configNodeName** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostConfigPropertyRequest struct via the builder pattern


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


## PostNode

> PostNode(ctx, path, name).Operation(operation).DeleteAuthorizable(deleteAuthorizable).File(file).Execute()



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
	path := "path_example" // string | 
	name := "name_example" // string | 
	operation := "operation_example" // string |  (optional)
	deleteAuthorizable := "deleteAuthorizable_example" // string |  (optional)
	file := os.NewFile(1234, "some_file") // *os.File |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostNode(context.Background(), path, name).Operation(operation).DeleteAuthorizable(deleteAuthorizable).File(file).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostNode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**path** | **string** |  | 
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostNodeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **operation** | **string** |  | 
 **deleteAuthorizable** | **string** |  | 
 **file** | ***os.File** |  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostNodeRw

> PostNodeRw(ctx, path, name).AddMembers(addMembers).Execute()



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
	path := "path_example" // string | 
	name := "name_example" // string | 
	addMembers := "addMembers_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostNodeRw(context.Background(), path, name).AddMembers(addMembers).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostNodeRw``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**path** | **string** |  | 
**name** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostNodeRwRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **addMembers** | **string** |  | 

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


## PostPath

> PostPath(ctx, path).JcrPrimaryType(jcrPrimaryType).Name(name).Execute()



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
	path := "path_example" // string | 
	jcrPrimaryType := "jcrPrimaryType_example" // string | 
	name := "name_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostPath(context.Background(), path).JcrPrimaryType(jcrPrimaryType).Name(name).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostPath``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**path** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPostPathRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **jcrPrimaryType** | **string** |  | 
 **name** | **string** |  | 

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


## PostQuery

> string PostQuery(ctx).Path(path).PLimit(pLimit).Var1Property(var1Property).Var1PropertyValue(var1PropertyValue).Execute()



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
	path := "path_example" // string | 
	pLimit := float32(8.14) // float32 | 
	var1Property := "var1Property_example" // string | 
	var1PropertyValue := "var1PropertyValue_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.PostQuery(context.Background()).Path(path).PLimit(pLimit).Var1Property(var1Property).Var1PropertyValue(var1PropertyValue).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostQuery``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PostQuery`: string
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.PostQuery`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostQueryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | 
 **pLimit** | **float32** |  | 
 **var1Property** | **string** |  | 
 **var1PropertyValue** | **string** |  | 

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


## PostTreeActivation

> PostTreeActivation(ctx).Ignoredeactivated(ignoredeactivated).Onlymodified(onlymodified).Path(path).Cmd(cmd).Execute()



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
	ignoredeactivated := true // bool | 
	onlymodified := true // bool | 
	path := "path_example" // string | 
	cmd := "cmd_example" // string |  (default to "activate")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.SlingAPI.PostTreeActivation(context.Background()).Ignoredeactivated(ignoredeactivated).Onlymodified(onlymodified).Path(path).Cmd(cmd).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostTreeActivation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostTreeActivationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **bool** |  | 
 **onlymodified** | **bool** |  | 
 **path** | **string** |  | 
 **cmd** | **string** |  | [default to &quot;activate&quot;]

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


## PostTruststore

> string PostTruststore(ctx).Operation(operation).NewPassword(newPassword).RePassword(rePassword).KeyStoreType(keyStoreType).RemoveAlias(removeAlias).Certificate(certificate).Execute()



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
	operation := "operation_example" // string |  (optional)
	newPassword := "newPassword_example" // string |  (optional)
	rePassword := "rePassword_example" // string |  (optional)
	keyStoreType := "keyStoreType_example" // string |  (optional)
	removeAlias := "removeAlias_example" // string |  (optional)
	certificate := os.NewFile(1234, "some_file") // *os.File |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.PostTruststore(context.Background()).Operation(operation).NewPassword(newPassword).RePassword(rePassword).KeyStoreType(keyStoreType).RemoveAlias(removeAlias).Certificate(certificate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostTruststore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PostTruststore`: string
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.PostTruststore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostTruststoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **string** |  | 
 **newPassword** | **string** |  | 
 **rePassword** | **string** |  | 
 **keyStoreType** | **string** |  | 
 **removeAlias** | **string** |  | 
 **certificate** | ***os.File** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostTruststorePKCS12

> string PostTruststorePKCS12(ctx).TruststoreP12(truststoreP12).Execute()



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
	truststoreP12 := os.NewFile(1234, "some_file") // *os.File |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SlingAPI.PostTruststorePKCS12(context.Background()).TruststoreP12(truststoreP12).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SlingAPI.PostTruststorePKCS12``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PostTruststorePKCS12`: string
	fmt.Fprintf(os.Stdout, "Response from `SlingAPI.PostTruststorePKCS12`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostTruststorePKCS12Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | ***os.File** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

