# CqApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLoginPage**](CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html |  |
| [**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html |  |


## Creating CqApi

To initiate an instance of `CqApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CqApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CqApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CqApi cqApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getLoginPage"></a>
# **getLoginPage**
```java
Mono<String> CqApi.getLoginPage()
```





### Return type
`String`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/html`

<a id="postCqActions"></a>
# **postCqActions**
```java
Mono<Void> CqApi.postCqActions(authorizableIdchangelog)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | `String`|  | |
| **changelog** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

