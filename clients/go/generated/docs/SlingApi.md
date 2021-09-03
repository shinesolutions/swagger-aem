# \SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteAgent**](SlingApi.md#DeleteAgent) | **Delete** /etc/replication/agents.{runmode}/{name} | 
[**DeleteNode**](SlingApi.md#DeleteNode) | **Delete** /{path}/{name} | 
[**GetAgent**](SlingApi.md#GetAgent) | **Get** /etc/replication/agents.{runmode}/{name} | 
[**GetAgents**](SlingApi.md#GetAgents) | **Get** /etc/replication/agents.{runmode}.-1.json | 
[**GetAuthorizableKeystore**](SlingApi.md#GetAuthorizableKeystore) | **Get** /{intermediatePath}/{authorizableId}.ks.json | 
[**GetKeystore**](SlingApi.md#GetKeystore) | **Get** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**GetNode**](SlingApi.md#GetNode) | **Get** /{path}/{name} | 
[**GetPackage**](SlingApi.md#GetPackage) | **Get** /etc/packages/{group}/{name}-{version}.zip | 
[**GetPackageFilter**](SlingApi.md#GetPackageFilter) | **Get** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**GetQuery**](SlingApi.md#GetQuery) | **Get** /bin/querybuilder.json | 
[**GetTruststore**](SlingApi.md#GetTruststore) | **Get** /etc/truststore/truststore.p12 | 
[**GetTruststoreInfo**](SlingApi.md#GetTruststoreInfo) | **Get** /libs/granite/security/truststore.json | 
[**PostAgent**](SlingApi.md#PostAgent) | **Post** /etc/replication/agents.{runmode}/{name} | 
[**PostAuthorizableKeystore**](SlingApi.md#PostAuthorizableKeystore) | **Post** /{intermediatePath}/{authorizableId}.ks.html | 
[**PostAuthorizables**](SlingApi.md#PostAuthorizables) | **Post** /libs/granite/security/post/authorizables | 
[**PostConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#PostConfigAdobeGraniteSamlAuthenticationHandler) | **Post** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**PostConfigApacheFelixJettyBasedHttpService**](SlingApi.md#PostConfigApacheFelixJettyBasedHttpService) | **Post** /apps/system/config/org.apache.felix.http | 
[**PostConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#PostConfigApacheHttpComponentsProxyConfiguration) | **Post** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**PostConfigApacheSlingDavExServlet**](SlingApi.md#PostConfigApacheSlingDavExServlet) | **Post** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**PostConfigApacheSlingGetServlet**](SlingApi.md#PostConfigApacheSlingGetServlet) | **Post** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**PostConfigApacheSlingReferrerFilter**](SlingApi.md#PostConfigApacheSlingReferrerFilter) | **Post** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**PostConfigProperty**](SlingApi.md#PostConfigProperty) | **Post** /apps/system/config/{configNodeName} | 
[**PostNode**](SlingApi.md#PostNode) | **Post** /{path}/{name} | 
[**PostNodeRw**](SlingApi.md#PostNodeRw) | **Post** /{path}/{name}.rw.html | 
[**PostPath**](SlingApi.md#PostPath) | **Post** /{path}/ | 
[**PostQuery**](SlingApi.md#PostQuery) | **Post** /bin/querybuilder.json | 
[**PostTreeActivation**](SlingApi.md#PostTreeActivation) | **Post** /etc/replication/treeactivation.html | 
[**PostTruststore**](SlingApi.md#PostTruststore) | **Post** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](SlingApi.md#PostTruststorePKCS12) | **Post** /etc/truststore | 



## DeleteAgent

> DeleteAgent(ctx, runmode, name).Execute()



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
    runmode := "runmode_example" // string | 
    name := "name_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.DeleteAgent(context.Background(), runmode, name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.DeleteAgent``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    path := "path_example" // string | 
    name := "name_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.DeleteNode(context.Background(), path, name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.DeleteNode``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    runmode := "runmode_example" // string | 
    name := "name_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetAgent(context.Background(), runmode, name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetAgent``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    runmode := "runmode_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetAgents(context.Background(), runmode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetAgents``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAgents`: string
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetAgents`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {
    intermediatePath := "intermediatePath_example" // string | 
    authorizableId := "authorizableId_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetAuthorizableKeystore(context.Background(), intermediatePath, authorizableId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetAuthorizableKeystore``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAuthorizableKeystore`: KeystoreInfo
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetAuthorizableKeystore`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {
    intermediatePath := "intermediatePath_example" // string | 
    authorizableId := "authorizableId_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetKeystore(context.Background(), intermediatePath, authorizableId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetKeystore``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetKeystore`: *os.File
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetKeystore`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {
    path := "path_example" // string | 
    name := "name_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetNode(context.Background(), path, name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetNode``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    group := "group_example" // string | 
    name := "name_example" // string | 
    version := "version_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetPackage(context.Background(), group, name, version).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetPackage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPackage`: *os.File
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetPackage`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {
    group := "group_example" // string | 
    name := "name_example" // string | 
    version := "version_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetPackageFilter(context.Background(), group, name, version).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetPackageFilter``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPackageFilter`: string
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetPackageFilter`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {
    path := "path_example" // string | 
    pLimit := float32(8.14) // float32 | 
    var1Property := "var1Property_example" // string | 
    var1PropertyValue := "var1PropertyValue_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetQuery(context.Background()).Path(path).PLimit(pLimit).Var1Property(var1Property).Var1PropertyValue(var1PropertyValue).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetQuery``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetQuery`: string
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetQuery`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetTruststore(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetTruststore``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTruststore`: *os.File
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetTruststore`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.GetTruststoreInfo(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.GetTruststoreInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTruststoreInfo`: TruststoreInfo
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.GetTruststoreInfo`: %v\n", resp)
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

> PostAgent(ctx, runmode, name).JcrcontentCqdistribute(jcrcontentCqdistribute).JcrcontentCqdistributeTypeHint(jcrcontentCqdistributeTypeHint).JcrcontentCqname(jcrcontentCqname).JcrcontentCqtemplate(jcrcontentCqtemplate).JcrcontentEnabled(jcrcontentEnabled).JcrcontentJcrdescription(jcrcontentJcrdescription).JcrcontentJcrlastModified(jcrcontentJcrlastModified).JcrcontentJcrlastModifiedBy(jcrcontentJcrlastModifiedBy).JcrcontentJcrmixinTypes(jcrcontentJcrmixinTypes).JcrcontentJcrtitle(jcrcontentJcrtitle).JcrcontentLogLevel(jcrcontentLogLevel).JcrcontentNoStatusUpdate(jcrcontentNoStatusUpdate).JcrcontentNoVersioning(jcrcontentNoVersioning).JcrcontentProtocolConnectTimeout(jcrcontentProtocolConnectTimeout).JcrcontentProtocolHTTPConnectionClosed(jcrcontentProtocolHTTPConnectionClosed).JcrcontentProtocolHTTPExpired(jcrcontentProtocolHTTPExpired).JcrcontentProtocolHTTPHeaders(jcrcontentProtocolHTTPHeaders).JcrcontentProtocolHTTPHeadersTypeHint(jcrcontentProtocolHTTPHeadersTypeHint).JcrcontentProtocolHTTPMethod(jcrcontentProtocolHTTPMethod).JcrcontentProtocolHTTPSRelaxed(jcrcontentProtocolHTTPSRelaxed).JcrcontentProtocolInterface(jcrcontentProtocolInterface).JcrcontentProtocolSocketTimeout(jcrcontentProtocolSocketTimeout).JcrcontentProtocolVersion(jcrcontentProtocolVersion).JcrcontentProxyNTLMDomain(jcrcontentProxyNTLMDomain).JcrcontentProxyNTLMHost(jcrcontentProxyNTLMHost).JcrcontentProxyHost(jcrcontentProxyHost).JcrcontentProxyPassword(jcrcontentProxyPassword).JcrcontentProxyPort(jcrcontentProxyPort).JcrcontentProxyUser(jcrcontentProxyUser).JcrcontentQueueBatchMaxSize(jcrcontentQueueBatchMaxSize).JcrcontentQueueBatchMode(jcrcontentQueueBatchMode).JcrcontentQueueBatchWaitTime(jcrcontentQueueBatchWaitTime).JcrcontentRetryDelay(jcrcontentRetryDelay).JcrcontentReverseReplication(jcrcontentReverseReplication).JcrcontentSerializationType(jcrcontentSerializationType).JcrcontentSlingresourceType(jcrcontentSlingresourceType).JcrcontentSsl(jcrcontentSsl).JcrcontentTransportNTLMDomain(jcrcontentTransportNTLMDomain).JcrcontentTransportNTLMHost(jcrcontentTransportNTLMHost).JcrcontentTransportPassword(jcrcontentTransportPassword).JcrcontentTransportUri(jcrcontentTransportUri).JcrcontentTransportUser(jcrcontentTransportUser).JcrcontentTriggerDistribute(jcrcontentTriggerDistribute).JcrcontentTriggerModified(jcrcontentTriggerModified).JcrcontentTriggerOnOffTime(jcrcontentTriggerOnOffTime).JcrcontentTriggerReceive(jcrcontentTriggerReceive).JcrcontentTriggerSpecific(jcrcontentTriggerSpecific).JcrcontentUserId(jcrcontentUserId).JcrprimaryType(jcrprimaryType).Operation(operation).Execute()



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
    runmode := "runmode_example" // string | 
    name := "name_example" // string | 
    jcrcontentCqdistribute := true // bool |  (optional)
    jcrcontentCqdistributeTypeHint := "jcrcontentCqdistributeTypeHint_example" // string |  (optional)
    jcrcontentCqname := "jcrcontentCqname_example" // string |  (optional)
    jcrcontentCqtemplate := "jcrcontentCqtemplate_example" // string |  (optional)
    jcrcontentEnabled := true // bool |  (optional)
    jcrcontentJcrdescription := "jcrcontentJcrdescription_example" // string |  (optional)
    jcrcontentJcrlastModified := "jcrcontentJcrlastModified_example" // string |  (optional)
    jcrcontentJcrlastModifiedBy := "jcrcontentJcrlastModifiedBy_example" // string |  (optional)
    jcrcontentJcrmixinTypes := "jcrcontentJcrmixinTypes_example" // string |  (optional)
    jcrcontentJcrtitle := "jcrcontentJcrtitle_example" // string |  (optional)
    jcrcontentLogLevel := "jcrcontentLogLevel_example" // string |  (optional)
    jcrcontentNoStatusUpdate := true // bool |  (optional)
    jcrcontentNoVersioning := true // bool |  (optional)
    jcrcontentProtocolConnectTimeout := float32(8.14) // float32 |  (optional)
    jcrcontentProtocolHTTPConnectionClosed := true // bool |  (optional)
    jcrcontentProtocolHTTPExpired := "jcrcontentProtocolHTTPExpired_example" // string |  (optional)
    jcrcontentProtocolHTTPHeaders := []string{"Inner_example"} // []string |  (optional)
    jcrcontentProtocolHTTPHeadersTypeHint := "jcrcontentProtocolHTTPHeadersTypeHint_example" // string |  (optional)
    jcrcontentProtocolHTTPMethod := "jcrcontentProtocolHTTPMethod_example" // string |  (optional)
    jcrcontentProtocolHTTPSRelaxed := true // bool |  (optional)
    jcrcontentProtocolInterface := "jcrcontentProtocolInterface_example" // string |  (optional)
    jcrcontentProtocolSocketTimeout := float32(8.14) // float32 |  (optional)
    jcrcontentProtocolVersion := "jcrcontentProtocolVersion_example" // string |  (optional)
    jcrcontentProxyNTLMDomain := "jcrcontentProxyNTLMDomain_example" // string |  (optional)
    jcrcontentProxyNTLMHost := "jcrcontentProxyNTLMHost_example" // string |  (optional)
    jcrcontentProxyHost := "jcrcontentProxyHost_example" // string |  (optional)
    jcrcontentProxyPassword := "jcrcontentProxyPassword_example" // string |  (optional)
    jcrcontentProxyPort := float32(8.14) // float32 |  (optional)
    jcrcontentProxyUser := "jcrcontentProxyUser_example" // string |  (optional)
    jcrcontentQueueBatchMaxSize := float32(8.14) // float32 |  (optional)
    jcrcontentQueueBatchMode := "jcrcontentQueueBatchMode_example" // string |  (optional)
    jcrcontentQueueBatchWaitTime := float32(8.14) // float32 |  (optional)
    jcrcontentRetryDelay := "jcrcontentRetryDelay_example" // string |  (optional)
    jcrcontentReverseReplication := true // bool |  (optional)
    jcrcontentSerializationType := "jcrcontentSerializationType_example" // string |  (optional)
    jcrcontentSlingresourceType := "jcrcontentSlingresourceType_example" // string |  (optional)
    jcrcontentSsl := "jcrcontentSsl_example" // string |  (optional)
    jcrcontentTransportNTLMDomain := "jcrcontentTransportNTLMDomain_example" // string |  (optional)
    jcrcontentTransportNTLMHost := "jcrcontentTransportNTLMHost_example" // string |  (optional)
    jcrcontentTransportPassword := "jcrcontentTransportPassword_example" // string |  (optional)
    jcrcontentTransportUri := "jcrcontentTransportUri_example" // string |  (optional)
    jcrcontentTransportUser := "jcrcontentTransportUser_example" // string |  (optional)
    jcrcontentTriggerDistribute := true // bool |  (optional)
    jcrcontentTriggerModified := true // bool |  (optional)
    jcrcontentTriggerOnOffTime := true // bool |  (optional)
    jcrcontentTriggerReceive := true // bool |  (optional)
    jcrcontentTriggerSpecific := true // bool |  (optional)
    jcrcontentUserId := "jcrcontentUserId_example" // string |  (optional)
    jcrprimaryType := "jcrprimaryType_example" // string |  (optional)
    operation := "operation_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostAgent(context.Background(), runmode, name).JcrcontentCqdistribute(jcrcontentCqdistribute).JcrcontentCqdistributeTypeHint(jcrcontentCqdistributeTypeHint).JcrcontentCqname(jcrcontentCqname).JcrcontentCqtemplate(jcrcontentCqtemplate).JcrcontentEnabled(jcrcontentEnabled).JcrcontentJcrdescription(jcrcontentJcrdescription).JcrcontentJcrlastModified(jcrcontentJcrlastModified).JcrcontentJcrlastModifiedBy(jcrcontentJcrlastModifiedBy).JcrcontentJcrmixinTypes(jcrcontentJcrmixinTypes).JcrcontentJcrtitle(jcrcontentJcrtitle).JcrcontentLogLevel(jcrcontentLogLevel).JcrcontentNoStatusUpdate(jcrcontentNoStatusUpdate).JcrcontentNoVersioning(jcrcontentNoVersioning).JcrcontentProtocolConnectTimeout(jcrcontentProtocolConnectTimeout).JcrcontentProtocolHTTPConnectionClosed(jcrcontentProtocolHTTPConnectionClosed).JcrcontentProtocolHTTPExpired(jcrcontentProtocolHTTPExpired).JcrcontentProtocolHTTPHeaders(jcrcontentProtocolHTTPHeaders).JcrcontentProtocolHTTPHeadersTypeHint(jcrcontentProtocolHTTPHeadersTypeHint).JcrcontentProtocolHTTPMethod(jcrcontentProtocolHTTPMethod).JcrcontentProtocolHTTPSRelaxed(jcrcontentProtocolHTTPSRelaxed).JcrcontentProtocolInterface(jcrcontentProtocolInterface).JcrcontentProtocolSocketTimeout(jcrcontentProtocolSocketTimeout).JcrcontentProtocolVersion(jcrcontentProtocolVersion).JcrcontentProxyNTLMDomain(jcrcontentProxyNTLMDomain).JcrcontentProxyNTLMHost(jcrcontentProxyNTLMHost).JcrcontentProxyHost(jcrcontentProxyHost).JcrcontentProxyPassword(jcrcontentProxyPassword).JcrcontentProxyPort(jcrcontentProxyPort).JcrcontentProxyUser(jcrcontentProxyUser).JcrcontentQueueBatchMaxSize(jcrcontentQueueBatchMaxSize).JcrcontentQueueBatchMode(jcrcontentQueueBatchMode).JcrcontentQueueBatchWaitTime(jcrcontentQueueBatchWaitTime).JcrcontentRetryDelay(jcrcontentRetryDelay).JcrcontentReverseReplication(jcrcontentReverseReplication).JcrcontentSerializationType(jcrcontentSerializationType).JcrcontentSlingresourceType(jcrcontentSlingresourceType).JcrcontentSsl(jcrcontentSsl).JcrcontentTransportNTLMDomain(jcrcontentTransportNTLMDomain).JcrcontentTransportNTLMHost(jcrcontentTransportNTLMHost).JcrcontentTransportPassword(jcrcontentTransportPassword).JcrcontentTransportUri(jcrcontentTransportUri).JcrcontentTransportUser(jcrcontentTransportUser).JcrcontentTriggerDistribute(jcrcontentTriggerDistribute).JcrcontentTriggerModified(jcrcontentTriggerModified).JcrcontentTriggerOnOffTime(jcrcontentTriggerOnOffTime).JcrcontentTriggerReceive(jcrcontentTriggerReceive).JcrcontentTriggerSpecific(jcrcontentTriggerSpecific).JcrcontentUserId(jcrcontentUserId).JcrprimaryType(jcrprimaryType).Operation(operation).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostAgent``: %v\n", err)
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


 **jcrcontentCqdistribute** | **bool** |  | 
 **jcrcontentCqdistributeTypeHint** | **string** |  | 
 **jcrcontentCqname** | **string** |  | 
 **jcrcontentCqtemplate** | **string** |  | 
 **jcrcontentEnabled** | **bool** |  | 
 **jcrcontentJcrdescription** | **string** |  | 
 **jcrcontentJcrlastModified** | **string** |  | 
 **jcrcontentJcrlastModifiedBy** | **string** |  | 
 **jcrcontentJcrmixinTypes** | **string** |  | 
 **jcrcontentJcrtitle** | **string** |  | 
 **jcrcontentLogLevel** | **string** |  | 
 **jcrcontentNoStatusUpdate** | **bool** |  | 
 **jcrcontentNoVersioning** | **bool** |  | 
 **jcrcontentProtocolConnectTimeout** | **float32** |  | 
 **jcrcontentProtocolHTTPConnectionClosed** | **bool** |  | 
 **jcrcontentProtocolHTTPExpired** | **string** |  | 
 **jcrcontentProtocolHTTPHeaders** | **[]string** |  | 
 **jcrcontentProtocolHTTPHeadersTypeHint** | **string** |  | 
 **jcrcontentProtocolHTTPMethod** | **string** |  | 
 **jcrcontentProtocolHTTPSRelaxed** | **bool** |  | 
 **jcrcontentProtocolInterface** | **string** |  | 
 **jcrcontentProtocolSocketTimeout** | **float32** |  | 
 **jcrcontentProtocolVersion** | **string** |  | 
 **jcrcontentProxyNTLMDomain** | **string** |  | 
 **jcrcontentProxyNTLMHost** | **string** |  | 
 **jcrcontentProxyHost** | **string** |  | 
 **jcrcontentProxyPassword** | **string** |  | 
 **jcrcontentProxyPort** | **float32** |  | 
 **jcrcontentProxyUser** | **string** |  | 
 **jcrcontentQueueBatchMaxSize** | **float32** |  | 
 **jcrcontentQueueBatchMode** | **string** |  | 
 **jcrcontentQueueBatchWaitTime** | **float32** |  | 
 **jcrcontentRetryDelay** | **string** |  | 
 **jcrcontentReverseReplication** | **bool** |  | 
 **jcrcontentSerializationType** | **string** |  | 
 **jcrcontentSlingresourceType** | **string** |  | 
 **jcrcontentSsl** | **string** |  | 
 **jcrcontentTransportNTLMDomain** | **string** |  | 
 **jcrcontentTransportNTLMHost** | **string** |  | 
 **jcrcontentTransportPassword** | **string** |  | 
 **jcrcontentTransportUri** | **string** |  | 
 **jcrcontentTransportUser** | **string** |  | 
 **jcrcontentTriggerDistribute** | **bool** |  | 
 **jcrcontentTriggerModified** | **bool** |  | 
 **jcrcontentTriggerOnOffTime** | **bool** |  | 
 **jcrcontentTriggerReceive** | **bool** |  | 
 **jcrcontentTriggerSpecific** | **bool** |  | 
 **jcrcontentUserId** | **string** |  | 
 **jcrprimaryType** | **string** |  | 
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
    openapiclient "./openapi"
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
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostAuthorizableKeystore(context.Background(), intermediatePath, authorizableId).Operation(operation).CurrentPassword(currentPassword).NewPassword(newPassword).RePassword(rePassword).KeyPassword(keyPassword).KeyStorePass(keyStorePass).Alias(alias).NewAlias(newAlias).RemoveAlias(removeAlias).CertChain(certChain).Pk(pk).KeyStore(keyStore).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostAuthorizableKeystore``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostAuthorizableKeystore`: KeystoreInfo
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.PostAuthorizableKeystore`: %v\n", resp)
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

> string PostAuthorizables(ctx).AuthorizableId(authorizableId).IntermediatePath(intermediatePath).CreateUser(createUser).CreateGroup(createGroup).Reppassword(reppassword).ProfileGivenName(profileGivenName).Execute()



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
    authorizableId := "authorizableId_example" // string | 
    intermediatePath := "intermediatePath_example" // string | 
    createUser := "createUser_example" // string |  (optional)
    createGroup := "createGroup_example" // string |  (optional)
    reppassword := "reppassword_example" // string |  (optional)
    profileGivenName := "profileGivenName_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostAuthorizables(context.Background()).AuthorizableId(authorizableId).IntermediatePath(intermediatePath).CreateUser(createUser).CreateGroup(createGroup).Reppassword(reppassword).ProfileGivenName(profileGivenName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostAuthorizables``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostAuthorizables`: string
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.PostAuthorizables`: %v\n", resp)
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
 **reppassword** | **string** |  | 
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
    openapiclient "./openapi"
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
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostConfigAdobeGraniteSamlAuthenticationHandler(context.Background()).KeyStorePassword(keyStorePassword).KeyStorePasswordTypeHint(keyStorePasswordTypeHint).ServiceRanking(serviceRanking).ServiceRankingTypeHint(serviceRankingTypeHint).IdpHttpRedirect(idpHttpRedirect).IdpHttpRedirectTypeHint(idpHttpRedirectTypeHint).CreateUser(createUser).CreateUserTypeHint(createUserTypeHint).DefaultRedirectUrl(defaultRedirectUrl).DefaultRedirectUrlTypeHint(defaultRedirectUrlTypeHint).UserIDAttribute(userIDAttribute).UserIDAttributeTypeHint(userIDAttributeTypeHint).DefaultGroups(defaultGroups).DefaultGroupsTypeHint(defaultGroupsTypeHint).IdpCertAlias(idpCertAlias).IdpCertAliasTypeHint(idpCertAliasTypeHint).AddGroupMemberships(addGroupMemberships).AddGroupMembershipsTypeHint(addGroupMembershipsTypeHint).Path(path).PathTypeHint(pathTypeHint).SynchronizeAttributes(synchronizeAttributes).SynchronizeAttributesTypeHint(synchronizeAttributesTypeHint).ClockTolerance(clockTolerance).ClockToleranceTypeHint(clockToleranceTypeHint).GroupMembershipAttribute(groupMembershipAttribute).GroupMembershipAttributeTypeHint(groupMembershipAttributeTypeHint).IdpUrl(idpUrl).IdpUrlTypeHint(idpUrlTypeHint).LogoutUrl(logoutUrl).LogoutUrlTypeHint(logoutUrlTypeHint).ServiceProviderEntityId(serviceProviderEntityId).ServiceProviderEntityIdTypeHint(serviceProviderEntityIdTypeHint).AssertionConsumerServiceURL(assertionConsumerServiceURL).AssertionConsumerServiceURLTypeHint(assertionConsumerServiceURLTypeHint).HandleLogout(handleLogout).HandleLogoutTypeHint(handleLogoutTypeHint).SpPrivateKeyAlias(spPrivateKeyAlias).SpPrivateKeyAliasTypeHint(spPrivateKeyAliasTypeHint).UseEncryption(useEncryption).UseEncryptionTypeHint(useEncryptionTypeHint).NameIdFormat(nameIdFormat).NameIdFormatTypeHint(nameIdFormatTypeHint).DigestMethod(digestMethod).DigestMethodTypeHint(digestMethodTypeHint).SignatureMethod(signatureMethod).SignatureMethodTypeHint(signatureMethodTypeHint).UserIntermediatePath(userIntermediatePath).UserIntermediatePathTypeHint(userIntermediatePathTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostConfigAdobeGraniteSamlAuthenticationHandler``: %v\n", err)
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
    openapiclient "./openapi"
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
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostConfigApacheFelixJettyBasedHttpService(context.Background()).OrgApacheFelixHttpsNio(orgApacheFelixHttpsNio).OrgApacheFelixHttpsNioTypeHint(orgApacheFelixHttpsNioTypeHint).OrgApacheFelixHttpsKeystore(orgApacheFelixHttpsKeystore).OrgApacheFelixHttpsKeystoreTypeHint(orgApacheFelixHttpsKeystoreTypeHint).OrgApacheFelixHttpsKeystorePassword(orgApacheFelixHttpsKeystorePassword).OrgApacheFelixHttpsKeystorePasswordTypeHint(orgApacheFelixHttpsKeystorePasswordTypeHint).OrgApacheFelixHttpsKeystoreKey(orgApacheFelixHttpsKeystoreKey).OrgApacheFelixHttpsKeystoreKeyTypeHint(orgApacheFelixHttpsKeystoreKeyTypeHint).OrgApacheFelixHttpsKeystoreKeyPassword(orgApacheFelixHttpsKeystoreKeyPassword).OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint(orgApacheFelixHttpsKeystoreKeyPasswordTypeHint).OrgApacheFelixHttpsTruststore(orgApacheFelixHttpsTruststore).OrgApacheFelixHttpsTruststoreTypeHint(orgApacheFelixHttpsTruststoreTypeHint).OrgApacheFelixHttpsTruststorePassword(orgApacheFelixHttpsTruststorePassword).OrgApacheFelixHttpsTruststorePasswordTypeHint(orgApacheFelixHttpsTruststorePasswordTypeHint).OrgApacheFelixHttpsClientcertificate(orgApacheFelixHttpsClientcertificate).OrgApacheFelixHttpsClientcertificateTypeHint(orgApacheFelixHttpsClientcertificateTypeHint).OrgApacheFelixHttpsEnable(orgApacheFelixHttpsEnable).OrgApacheFelixHttpsEnableTypeHint(orgApacheFelixHttpsEnableTypeHint).OrgOsgiServiceHttpPortSecure(orgOsgiServiceHttpPortSecure).OrgOsgiServiceHttpPortSecureTypeHint(orgOsgiServiceHttpPortSecureTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostConfigApacheFelixJettyBasedHttpService``: %v\n", err)
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
    openapiclient "./openapi"
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
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostConfigApacheHttpComponentsProxyConfiguration(context.Background()).ProxyHost(proxyHost).ProxyHostTypeHint(proxyHostTypeHint).ProxyPort(proxyPort).ProxyPortTypeHint(proxyPortTypeHint).ProxyExceptions(proxyExceptions).ProxyExceptionsTypeHint(proxyExceptionsTypeHint).ProxyEnabled(proxyEnabled).ProxyEnabledTypeHint(proxyEnabledTypeHint).ProxyUser(proxyUser).ProxyUserTypeHint(proxyUserTypeHint).ProxyPassword(proxyPassword).ProxyPasswordTypeHint(proxyPasswordTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostConfigApacheHttpComponentsProxyConfiguration``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    alias := "alias_example" // string |  (optional)
    aliasTypeHint := "aliasTypeHint_example" // string |  (optional)
    davCreateAbsoluteUri := true // bool |  (optional)
    davCreateAbsoluteUriTypeHint := "davCreateAbsoluteUriTypeHint_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostConfigApacheSlingDavExServlet(context.Background()).Alias(alias).AliasTypeHint(aliasTypeHint).DavCreateAbsoluteUri(davCreateAbsoluteUri).DavCreateAbsoluteUriTypeHint(davCreateAbsoluteUriTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostConfigApacheSlingDavExServlet``: %v\n", err)
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
    openapiclient "./openapi"
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
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostConfigApacheSlingGetServlet(context.Background()).JsonMaximumresults(jsonMaximumresults).JsonMaximumresultsTypeHint(jsonMaximumresultsTypeHint).EnableHtml(enableHtml).EnableHtmlTypeHint(enableHtmlTypeHint).EnableTxt(enableTxt).EnableTxtTypeHint(enableTxtTypeHint).EnableXml(enableXml).EnableXmlTypeHint(enableXmlTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostConfigApacheSlingGetServlet``: %v\n", err)
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
    openapiclient "./openapi"
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
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostConfigApacheSlingReferrerFilter(context.Background()).AllowEmpty(allowEmpty).AllowEmptyTypeHint(allowEmptyTypeHint).AllowHosts(allowHosts).AllowHostsTypeHint(allowHostsTypeHint).AllowHostsRegexp(allowHostsRegexp).AllowHostsRegexpTypeHint(allowHostsRegexpTypeHint).FilterMethods(filterMethods).FilterMethodsTypeHint(filterMethodsTypeHint).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostConfigApacheSlingReferrerFilter``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    configNodeName := "configNodeName_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostConfigProperty(context.Background(), configNodeName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostConfigProperty``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    path := "path_example" // string | 
    name := "name_example" // string | 
    operation := "operation_example" // string |  (optional)
    deleteAuthorizable := "deleteAuthorizable_example" // string |  (optional)
    file := os.NewFile(1234, "some_file") // *os.File |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostNode(context.Background(), path, name).Operation(operation).DeleteAuthorizable(deleteAuthorizable).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostNode``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    path := "path_example" // string | 
    name := "name_example" // string | 
    addMembers := "addMembers_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostNodeRw(context.Background(), path, name).AddMembers(addMembers).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostNodeRw``: %v\n", err)
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

> PostPath(ctx, path).JcrprimaryType(jcrprimaryType).Name(name).Execute()



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
    jcrprimaryType := "jcrprimaryType_example" // string | 
    name := "name_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostPath(context.Background(), path).JcrprimaryType(jcrprimaryType).Name(name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostPath``: %v\n", err)
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

 **jcrprimaryType** | **string** |  | 
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
    openapiclient "./openapi"
)

func main() {
    path := "path_example" // string | 
    pLimit := float32(8.14) // float32 | 
    var1Property := "var1Property_example" // string | 
    var1PropertyValue := "var1PropertyValue_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostQuery(context.Background()).Path(path).PLimit(pLimit).Var1Property(var1Property).Var1PropertyValue(var1PropertyValue).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostQuery``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostQuery`: string
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.PostQuery`: %v\n", resp)
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

> PostTreeActivation(ctx).Ignoredeactivated(ignoredeactivated).Onlymodified(onlymodified).Path(path).Execute()



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
    ignoredeactivated := true // bool | 
    onlymodified := true // bool | 
    path := "path_example" // string | 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostTreeActivation(context.Background()).Ignoredeactivated(ignoredeactivated).Onlymodified(onlymodified).Path(path).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostTreeActivation``: %v\n", err)
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
    openapiclient "./openapi"
)

func main() {
    operation := "operation_example" // string |  (optional)
    newPassword := "newPassword_example" // string |  (optional)
    rePassword := "rePassword_example" // string |  (optional)
    keyStoreType := "keyStoreType_example" // string |  (optional)
    removeAlias := "removeAlias_example" // string |  (optional)
    certificate := os.NewFile(1234, "some_file") // *os.File |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostTruststore(context.Background()).Operation(operation).NewPassword(newPassword).RePassword(rePassword).KeyStoreType(keyStoreType).RemoveAlias(removeAlias).Certificate(certificate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostTruststore``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostTruststore`: string
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.PostTruststore`: %v\n", resp)
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
    openapiclient "./openapi"
)

func main() {
    truststoreP12 := os.NewFile(1234, "some_file") // *os.File |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.SlingApi.PostTruststorePKCS12(context.Background()).TruststoreP12(truststoreP12).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SlingApi.PostTruststorePKCS12``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostTruststorePKCS12`: string
    fmt.Fprintf(os.Stdout, "Response from `SlingApi.PostTruststorePKCS12`: %v\n", resp)
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

