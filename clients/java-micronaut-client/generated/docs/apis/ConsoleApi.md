# ConsoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json |  |
| [**getBundleInfo**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json |  |
| [**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr |  |
| [**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} |  |
| [**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} |  |
| [**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler |  |


## Creating ConsoleApi

To initiate an instance of `ConsoleApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ConsoleApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ConsoleApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ConsoleApi consoleApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getAemProductInfo"></a>
# **getAemProductInfo**
```java
Mono<List<String>> ConsoleApi.getAemProductInfo()
```





### Return type
`List&lt;String&gt;`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getBundleInfo"></a>
# **getBundleInfo**
```java
Mono<BundleInfo> ConsoleApi.getBundleInfo(name)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | `String`|  | |


### Return type
[**BundleInfo**](BundleInfo.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getConfigMgr"></a>
# **getConfigMgr**
```java
Mono<String> ConsoleApi.getConfigMgr()
```





### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/xml`

<a id="postBundle"></a>
# **postBundle**
```java
Mono<Void> ConsoleApi.postBundle(nameaction)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | `String`|  | |
| **action** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postJmxRepository"></a>
# **postJmxRepository**
```java
Mono<Void> ConsoleApi.postJmxRepository(action)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postSamlConfiguration"></a>
# **postSamlConfiguration**
```java
Mono<SamlConfigurationInfo> ConsoleApi.postSamlConfiguration(postapplydeleteaction$locationpathserviceRankingidpUrlidpCertAliasidpHttpRedirectserviceProviderEntityIdassertionConsumerServiceURLspPrivateKeyAliaskeyStorePassworddefaultRedirectUrluserIDAttributeuseEncryptioncreateUseraddGroupMembershipsgroupMembershipAttributedefaultGroupsnameIdFormatsynchronizeAttributeshandleLogoutlogoutUrlclockTolerancedigestMethodsignatureMethoduserIntermediatePathpropertylist)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **post** | `Boolean`|  | [optional parameter] |
| **apply** | `Boolean`|  | [optional parameter] |
| **delete** | `Boolean`|  | [optional parameter] |
| **action** | `String`|  | [optional parameter] |
| **$location** | `String`|  | [optional parameter] |
| **path** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **serviceRanking** | `Integer`|  | [optional parameter] |
| **idpUrl** | `String`|  | [optional parameter] |
| **idpCertAlias** | `String`|  | [optional parameter] |
| **idpHttpRedirect** | `Boolean`|  | [optional parameter] |
| **serviceProviderEntityId** | `String`|  | [optional parameter] |
| **assertionConsumerServiceURL** | `String`|  | [optional parameter] |
| **spPrivateKeyAlias** | `String`|  | [optional parameter] |
| **keyStorePassword** | `String`|  | [optional parameter] |
| **defaultRedirectUrl** | `String`|  | [optional parameter] |
| **userIDAttribute** | `String`|  | [optional parameter] |
| **useEncryption** | `Boolean`|  | [optional parameter] |
| **createUser** | `Boolean`|  | [optional parameter] |
| **addGroupMemberships** | `Boolean`|  | [optional parameter] |
| **groupMembershipAttribute** | `String`|  | [optional parameter] |
| **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **nameIdFormat** | `String`|  | [optional parameter] |
| **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **handleLogout** | `Boolean`|  | [optional parameter] |
| **logoutUrl** | `String`|  | [optional parameter] |
| **clockTolerance** | `Integer`|  | [optional parameter] |
| **digestMethod** | `String`|  | [optional parameter] |
| **signatureMethod** | `String`|  | [optional parameter] |
| **userIntermediatePath** | `String`|  | [optional parameter] |
| **propertylist** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |


### Return type
[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`

