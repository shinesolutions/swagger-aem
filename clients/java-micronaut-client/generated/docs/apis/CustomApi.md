# CustomApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health |  |
| [**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck |  |
| [**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator |  |


## Creating CustomApi

To initiate an instance of `CustomApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CustomApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CustomApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CustomApi customApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getAemHealthCheck"></a>
# **getAemHealthCheck**
```java
Mono<String> CustomApi.getAemHealthCheck(tagscombineTagsOr)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | `String`|  | [optional parameter] |
| **combineTagsOr** | `Boolean`|  | [optional parameter] |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="postConfigAemHealthCheckServlet"></a>
# **postConfigAemHealthCheckServlet**
```java
Mono<Void> CustomApi.postConfigAemHealthCheckServlet(bundlesIgnoredbundlesIgnoredAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bundlesIgnored** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **bundlesIgnoredAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
```java
Mono<Void> CustomApi.postConfigAemPasswordReset(pwdresetAuthorizablespwdresetAuthorizablesAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pwdresetAuthorizables** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **pwdresetAuthorizablesAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

