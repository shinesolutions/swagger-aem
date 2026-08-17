# CrxApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCrxdeStatus**](CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json |  |
| [**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp |  |
| [**getPackageManagerServlet**](CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html |  |
| [**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp |  |
| [**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} |  |
| [**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp |  |
| [**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp |  |


## Creating CrxApi

To initiate an instance of `CrxApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CrxApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CrxApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CrxApi crxApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getCrxdeStatus"></a>
# **getCrxdeStatus**
```java
Mono<String> CrxApi.getCrxdeStatus()
```





### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `plain/text`

<a id="getInstallStatus"></a>
# **getInstallStatus**
```java
Mono<InstallStatus> CrxApi.getInstallStatus()
```





### Return type
[**InstallStatus**](InstallStatus.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getPackageManagerServlet"></a>
# **getPackageManagerServlet**
```java
Mono<Void> CrxApi.getPackageManagerServlet()
```







### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/html`

<a id="postPackageService"></a>
# **postPackageService**
```java
Mono<String> CrxApi.postPackageService(cmd)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmd** | `String`|  | |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/xml`

<a id="postPackageServiceJson"></a>
# **postPackageServiceJson**
```java
Mono<String> CrxApi.postPackageServiceJson(pathcmdgroupNamepackageNamepackageVersioncharsetforcerecursive_package)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **cmd** | `String`|  | |
| **groupName** | `String`|  | [optional parameter] |
| **packageName** | `String`|  | [optional parameter] |
| **packageVersion** | `String`|  | [optional parameter] |
| **charset** | `String`|  | [optional parameter] |
| **force** | `Boolean`|  | [optional parameter] |
| **recursive** | `Boolean`|  | [optional parameter] |
| **_package** | `File`|  | [optional parameter] |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="postPackageUpdate"></a>
# **postPackageUpdate**
```java
Mono<String> CrxApi.postPackageUpdate(groupNamepackageNameversionpathfiltercharset)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupName** | `String`|  | |
| **packageName** | `String`|  | |
| **version** | `String`|  | |
| **path** | `String`|  | |
| **filter** | `String`|  | [optional parameter] |
| **charset** | `String`|  | [optional parameter] |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="postSetPassword"></a>
# **postSetPassword**
```java
Mono<String> CrxApi.postSetPassword(oldplainverify)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **old** | `String`|  | |
| **plain** | `String`|  | |
| **verify** | `String`|  | |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`

