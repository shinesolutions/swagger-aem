# GraniteApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sslSetup**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html |  |


## Creating GraniteApi

To initiate an instance of `GraniteApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.GraniteApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(GraniteApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    GraniteApi graniteApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="sslSetup"></a>
# **sslSetup**
```java
Mono<String> GraniteApi.sslSetup(keystorePasswordkeystorePasswordConfirmtruststorePasswordtruststorePasswordConfirmhttpsHostnamehttpsPortprivatekeyFilecertificateFile)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keystorePassword** | `String`|  | |
| **keystorePasswordConfirm** | `String`|  | |
| **truststorePassword** | `String`|  | |
| **truststorePasswordConfirm** | `String`|  | |
| **httpsHostname** | `String`|  | |
| **httpsPort** | `String`|  | |
| **privatekeyFile** | `File`|  | [optional parameter] |
| **certificateFile** | `File`|  | [optional parameter] |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `text/plain`

