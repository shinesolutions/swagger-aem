# ConsoleController

All URIs are relative to `""`

The controller class is defined in **[ConsoleController.java](../../src/main/java/org/openapitools/controller/ConsoleController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 

<a id="getAemProductInfo"></a>
# **getAemProductInfo**
```java
Mono<List<String>> ConsoleController.getAemProductInfo()
```




### Return type
`List&lt;String&gt;`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getBundleInfo"></a>
# **getBundleInfo**
```java
Mono<BundleInfo> ConsoleController.getBundleInfo(name)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**name** | `String` |  |

### Return type
[**BundleInfo**](../../docs/models/BundleInfo.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getConfigMgr"></a>
# **getConfigMgr**
```java
Mono<String> ConsoleController.getConfigMgr()
```




### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/xml`

<a id="postBundle"></a>
# **postBundle**
```java
Mono<Object> ConsoleController.postBundle(nameaction)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**name** | `String` |  |
**action** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postJmxRepository"></a>
# **postJmxRepository**
```java
Mono<Object> ConsoleController.postJmxRepository(action)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**action** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postSamlConfiguration"></a>
# **postSamlConfiguration**
```java
Mono<SamlConfigurationInfo> ConsoleController.postSamlConfiguration(postapplydeleteaction$locationpathserviceRankingidpUrlidpCertAliasidpHttpRedirectserviceProviderEntityIdassertionConsumerServiceURLspPrivateKeyAliaskeyStorePassworddefaultRedirectUrluserIDAttributeuseEncryptioncreateUseraddGroupMembershipsgroupMembershipAttributedefaultGroupsnameIdFormatsynchronizeAttributeshandleLogoutlogoutUrlclockTolerancedigestMethodsignatureMethoduserIntermediatePathpropertylist)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**post** | `Boolean` |  | [optional parameter]
**apply** | `Boolean` |  | [optional parameter]
**delete** | `Boolean` |  | [optional parameter]
**action** | `String` |  | [optional parameter]
**$location** | `String` |  | [optional parameter]
**path** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**serviceRanking** | `Integer` |  | [optional parameter]
**idpUrl** | `String` |  | [optional parameter]
**idpCertAlias** | `String` |  | [optional parameter]
**idpHttpRedirect** | `Boolean` |  | [optional parameter]
**serviceProviderEntityId** | `String` |  | [optional parameter]
**assertionConsumerServiceURL** | `String` |  | [optional parameter]
**spPrivateKeyAlias** | `String` |  | [optional parameter]
**keyStorePassword** | `String` |  | [optional parameter]
**defaultRedirectUrl** | `String` |  | [optional parameter]
**userIDAttribute** | `String` |  | [optional parameter]
**useEncryption** | `Boolean` |  | [optional parameter]
**createUser** | `Boolean` |  | [optional parameter]
**addGroupMemberships** | `Boolean` |  | [optional parameter]
**groupMembershipAttribute** | `String` |  | [optional parameter]
**defaultGroups** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**nameIdFormat** | `String` |  | [optional parameter]
**synchronizeAttributes** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**handleLogout** | `Boolean` |  | [optional parameter]
**logoutUrl** | `String` |  | [optional parameter]
**clockTolerance** | `Integer` |  | [optional parameter]
**digestMethod** | `String` |  | [optional parameter]
**signatureMethod** | `String` |  | [optional parameter]
**userIntermediatePath** | `String` |  | [optional parameter]
**propertylist** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]

### Return type
[**SamlConfigurationInfo**](../../docs/models/SamlConfigurationInfo.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

