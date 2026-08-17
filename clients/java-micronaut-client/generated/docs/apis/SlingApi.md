# SlingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} |  |
| [**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} |  |
| [**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} |  |
| [**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json |  |
| [**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json |  |
| [**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 |  |
| [**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} |  |
| [**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip |  |
| [**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json |  |
| [**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json |  |
| [**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 |  |
| [**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json |  |
| [**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} |  |
| [**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html |  |
| [**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables |  |
| [**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config |  |
| [**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http |  |
| [**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config |  |
| [**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet |  |
| [**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet |  |
| [**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter |  |
| [**postConfigProperty**](SlingApi.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} |  |
| [**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} |  |
| [**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html |  |
| [**postPath**](SlingApi.md#postPath) | **POST** /{path}/ |  |
| [**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json |  |
| [**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /libs/replication/treeactivation.html |  |
| [**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore |  |
| [**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore |  |


## Creating SlingApi

To initiate an instance of `SlingApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.SlingApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(SlingApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    SlingApi slingApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="deleteAgent"></a>
# **deleteAgent**
```java
Mono<Void> SlingApi.deleteAgent(runmodename)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | `String`|  | |
| **name** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="deleteNode"></a>
# **deleteNode**
```java
Mono<Void> SlingApi.deleteNode(pathname)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **name** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getAgent"></a>
# **getAgent**
```java
Mono<Void> SlingApi.getAgent(runmodename)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | `String`|  | |
| **name** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getAgents"></a>
# **getAgents**
```java
Mono<String> SlingApi.getAgents(runmode)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | `String`|  | |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
```java
Mono<KeystoreInfo> SlingApi.getAuthorizableKeystore(intermediatePathauthorizableId)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | `String`|  | |
| **authorizableId** | `String`|  | |


### Return type
[**KeystoreInfo**](KeystoreInfo.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`

<a id="getKeystore"></a>
# **getKeystore**
```java
Mono<File> SlingApi.getKeystore(intermediatePathauthorizableId)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | `String`|  | |
| **authorizableId** | `String`|  | |


### Return type
[**File**](File.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/octet-stream`

<a id="getNode"></a>
# **getNode**
```java
Mono<Void> SlingApi.getNode(pathname)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **name** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getPackage"></a>
# **getPackage**
```java
Mono<File> SlingApi.getPackage(groupnameversion)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | `String`|  | |
| **name** | `String`|  | |
| **version** | `String`|  | |


### Return type
[**File**](File.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/octet-stream`

<a id="getPackageFilter"></a>
# **getPackageFilter**
```java
Mono<String> SlingApi.getPackageFilter(groupnameversion)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | `String`|  | |
| **name** | `String`|  | |
| **version** | `String`|  | |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getQuery"></a>
# **getQuery**
```java
Mono<String> SlingApi.getQuery(pathpLimit_1property_1propertyValue)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **pLimit** | `BigDecimal`|  | |
| **_1property** | `String`|  | |
| **_1propertyValue** | `String`|  | |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getTruststore"></a>
# **getTruststore**
```java
Mono<File> SlingApi.getTruststore()
```





### Return type
[**File**](File.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/octet-stream`

<a id="getTruststoreInfo"></a>
# **getTruststoreInfo**
```java
Mono<TruststoreInfo> SlingApi.getTruststoreInfo()
```





### Return type
[**TruststoreInfo**](TruststoreInfo.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="postAgent"></a>
# **postAgent**
```java
Mono<Void> SlingApi.postAgent(runmodenamejcrContentCqDistributejcrContentCqDistributeAtTypeHintjcrContentCqNamejcrContentCqTemplatejcrContentAliasUpdatejcrContentEnabledjcrContentJcrDescriptionjcrContentJcrLastModifiedjcrContentJcrLastModifiedByjcrContentJcrMixinTypesjcrContentJcrTitlejcrContentLogLeveljcrContentNoStatusUpdatejcrContentNoVersioningjcrContentProtocolConnectTimeoutjcrContentProtocolHTTPConnectionClosedjcrContentProtocolHTTPExpiredjcrContentProtocolHTTPHeadersjcrContentProtocolHTTPHeadersAtTypeHintjcrContentProtocolHTTPMethodjcrContentProtocolHTTPSRelaxedjcrContentProtocolInterfacejcrContentProtocolSocketTimeoutjcrContentProtocolVersionjcrContentProxyNTLMDomainjcrContentProxyNTLMHostjcrContentProxyHostjcrContentProxyPasswordjcrContentProxyPortjcrContentProxyUserjcrContentQueueBatchMaxSizejcrContentQueueBatchModejcrContentQueueBatchWaitTimejcrContentRetryDelayjcrContentReverseReplicationjcrContentSerializationTypejcrContentSlingResourceTypejcrContentSsljcrContentTransportNTLMDomainjcrContentTransportNTLMHostjcrContentTransportPasswordjcrContentTransportUrijcrContentTransportUserjcrContentTriggerDistributejcrContentTriggerModifiedjcrContentTriggerOnOffTimejcrContentTriggerReceivejcrContentTriggerSpecificjcrContentUserIdjcrPrimaryTypeoperation)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | `String`|  | |
| **name** | `String`|  | |
| **jcrContentCqDistribute** | `Boolean`|  | [optional parameter] |
| **jcrContentCqDistributeAtTypeHint** | `String`|  | [optional parameter] |
| **jcrContentCqName** | `String`|  | [optional parameter] |
| **jcrContentCqTemplate** | `String`|  | [optional parameter] |
| **jcrContentAliasUpdate** | `Boolean`|  | [optional parameter] |
| **jcrContentEnabled** | `Boolean`|  | [optional parameter] |
| **jcrContentJcrDescription** | `String`|  | [optional parameter] |
| **jcrContentJcrLastModified** | `String`|  | [optional parameter] |
| **jcrContentJcrLastModifiedBy** | `String`|  | [optional parameter] |
| **jcrContentJcrMixinTypes** | `String`|  | [optional parameter] |
| **jcrContentJcrTitle** | `String`|  | [optional parameter] |
| **jcrContentLogLevel** | `String`|  | [optional parameter] |
| **jcrContentNoStatusUpdate** | `Boolean`|  | [optional parameter] |
| **jcrContentNoVersioning** | `Boolean`|  | [optional parameter] |
| **jcrContentProtocolConnectTimeout** | `BigDecimal`|  | [optional parameter] |
| **jcrContentProtocolHTTPConnectionClosed** | `Boolean`|  | [optional parameter] |
| **jcrContentProtocolHTTPExpired** | `String`|  | [optional parameter] |
| **jcrContentProtocolHTTPHeaders** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **jcrContentProtocolHTTPHeadersAtTypeHint** | `String`|  | [optional parameter] |
| **jcrContentProtocolHTTPMethod** | `String`|  | [optional parameter] |
| **jcrContentProtocolHTTPSRelaxed** | `Boolean`|  | [optional parameter] |
| **jcrContentProtocolInterface** | `String`|  | [optional parameter] |
| **jcrContentProtocolSocketTimeout** | `BigDecimal`|  | [optional parameter] |
| **jcrContentProtocolVersion** | `String`|  | [optional parameter] |
| **jcrContentProxyNTLMDomain** | `String`|  | [optional parameter] |
| **jcrContentProxyNTLMHost** | `String`|  | [optional parameter] |
| **jcrContentProxyHost** | `String`|  | [optional parameter] |
| **jcrContentProxyPassword** | `String`|  | [optional parameter] |
| **jcrContentProxyPort** | `BigDecimal`|  | [optional parameter] |
| **jcrContentProxyUser** | `String`|  | [optional parameter] |
| **jcrContentQueueBatchMaxSize** | `BigDecimal`|  | [optional parameter] |
| **jcrContentQueueBatchMode** | `String`|  | [optional parameter] |
| **jcrContentQueueBatchWaitTime** | `BigDecimal`|  | [optional parameter] |
| **jcrContentRetryDelay** | `String`|  | [optional parameter] |
| **jcrContentReverseReplication** | `Boolean`|  | [optional parameter] |
| **jcrContentSerializationType** | `String`|  | [optional parameter] |
| **jcrContentSlingResourceType** | `String`|  | [optional parameter] |
| **jcrContentSsl** | `String`|  | [optional parameter] |
| **jcrContentTransportNTLMDomain** | `String`|  | [optional parameter] |
| **jcrContentTransportNTLMHost** | `String`|  | [optional parameter] |
| **jcrContentTransportPassword** | `String`|  | [optional parameter] |
| **jcrContentTransportUri** | `String`|  | [optional parameter] |
| **jcrContentTransportUser** | `String`|  | [optional parameter] |
| **jcrContentTriggerDistribute** | `Boolean`|  | [optional parameter] |
| **jcrContentTriggerModified** | `Boolean`|  | [optional parameter] |
| **jcrContentTriggerOnOffTime** | `Boolean`|  | [optional parameter] |
| **jcrContentTriggerReceive** | `Boolean`|  | [optional parameter] |
| **jcrContentTriggerSpecific** | `Boolean`|  | [optional parameter] |
| **jcrContentUserId** | `String`|  | [optional parameter] |
| **jcrPrimaryType** | `String`|  | [optional parameter] |
| **operation** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postAuthorizableKeystore"></a>
# **postAuthorizableKeystore**
```java
Mono<KeystoreInfo> SlingApi.postAuthorizableKeystore(intermediatePathauthorizableIdoperationcurrentPasswordnewPasswordrePasswordkeyPasswordkeyStorePassaliasnewAliasremoveAliascertChainpkkeyStore)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | `String`|  | |
| **authorizableId** | `String`|  | |
| **operation** | `String`|  | [optional parameter] |
| **currentPassword** | `String`|  | [optional parameter] |
| **newPassword** | `String`|  | [optional parameter] |
| **rePassword** | `String`|  | [optional parameter] |
| **keyPassword** | `String`|  | [optional parameter] |
| **keyStorePass** | `String`|  | [optional parameter] |
| **alias** | `String`|  | [optional parameter] |
| **newAlias** | `String`|  | [optional parameter] |
| **removeAlias** | `String`|  | [optional parameter] |
| **certChain** | `File`|  | [optional parameter] |
| **pk** | `File`|  | [optional parameter] |
| **keyStore** | `File`|  | [optional parameter] |


### Return type
[**KeystoreInfo**](KeystoreInfo.md)

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `text/plain`

<a id="postAuthorizables"></a>
# **postAuthorizables**
```java
Mono<String> SlingApi.postAuthorizables(authorizableIdintermediatePathcreateUsercreateGrouprepPasswordprofileGivenName)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | `String`|  | |
| **intermediatePath** | `String`|  | |
| **createUser** | `String`|  | [optional parameter] |
| **createGroup** | `String`|  | [optional parameter] |
| **repPassword** | `String`|  | [optional parameter] |
| **profileGivenName** | `String`|  | [optional parameter] |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/html`

<a id="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
```java
Mono<Void> SlingApi.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePasswordkeyStorePasswordAtTypeHintserviceRankingserviceRankingAtTypeHintidpHttpRedirectidpHttpRedirectAtTypeHintcreateUsercreateUserAtTypeHintdefaultRedirectUrldefaultRedirectUrlAtTypeHintuserIDAttributeuserIDAttributeAtTypeHintdefaultGroupsdefaultGroupsAtTypeHintidpCertAliasidpCertAliasAtTypeHintaddGroupMembershipsaddGroupMembershipsAtTypeHintpathpathAtTypeHintsynchronizeAttributessynchronizeAttributesAtTypeHintclockToleranceclockToleranceAtTypeHintgroupMembershipAttributegroupMembershipAttributeAtTypeHintidpUrlidpUrlAtTypeHintlogoutUrllogoutUrlAtTypeHintserviceProviderEntityIdserviceProviderEntityIdAtTypeHintassertionConsumerServiceURLassertionConsumerServiceURLAtTypeHinthandleLogouthandleLogoutAtTypeHintspPrivateKeyAliasspPrivateKeyAliasAtTypeHintuseEncryptionuseEncryptionAtTypeHintnameIdFormatnameIdFormatAtTypeHintdigestMethoddigestMethodAtTypeHintsignatureMethodsignatureMethodAtTypeHintuserIntermediatePathuserIntermediatePathAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyStorePassword** | `String`|  | [optional parameter] |
| **keyStorePasswordAtTypeHint** | `String`|  | [optional parameter] |
| **serviceRanking** | `Integer`|  | [optional parameter] |
| **serviceRankingAtTypeHint** | `String`|  | [optional parameter] |
| **idpHttpRedirect** | `Boolean`|  | [optional parameter] |
| **idpHttpRedirectAtTypeHint** | `String`|  | [optional parameter] |
| **createUser** | `Boolean`|  | [optional parameter] |
| **createUserAtTypeHint** | `String`|  | [optional parameter] |
| **defaultRedirectUrl** | `String`|  | [optional parameter] |
| **defaultRedirectUrlAtTypeHint** | `String`|  | [optional parameter] |
| **userIDAttribute** | `String`|  | [optional parameter] |
| **userIDAttributeAtTypeHint** | `String`|  | [optional parameter] |
| **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **defaultGroupsAtTypeHint** | `String`|  | [optional parameter] |
| **idpCertAlias** | `String`|  | [optional parameter] |
| **idpCertAliasAtTypeHint** | `String`|  | [optional parameter] |
| **addGroupMemberships** | `Boolean`|  | [optional parameter] |
| **addGroupMembershipsAtTypeHint** | `String`|  | [optional parameter] |
| **path** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **pathAtTypeHint** | `String`|  | [optional parameter] |
| **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **synchronizeAttributesAtTypeHint** | `String`|  | [optional parameter] |
| **clockTolerance** | `Integer`|  | [optional parameter] |
| **clockToleranceAtTypeHint** | `String`|  | [optional parameter] |
| **groupMembershipAttribute** | `String`|  | [optional parameter] |
| **groupMembershipAttributeAtTypeHint** | `String`|  | [optional parameter] |
| **idpUrl** | `String`|  | [optional parameter] |
| **idpUrlAtTypeHint** | `String`|  | [optional parameter] |
| **logoutUrl** | `String`|  | [optional parameter] |
| **logoutUrlAtTypeHint** | `String`|  | [optional parameter] |
| **serviceProviderEntityId** | `String`|  | [optional parameter] |
| **serviceProviderEntityIdAtTypeHint** | `String`|  | [optional parameter] |
| **assertionConsumerServiceURL** | `String`|  | [optional parameter] |
| **assertionConsumerServiceURLAtTypeHint** | `String`|  | [optional parameter] |
| **handleLogout** | `Boolean`|  | [optional parameter] |
| **handleLogoutAtTypeHint** | `String`|  | [optional parameter] |
| **spPrivateKeyAlias** | `String`|  | [optional parameter] |
| **spPrivateKeyAliasAtTypeHint** | `String`|  | [optional parameter] |
| **useEncryption** | `Boolean`|  | [optional parameter] |
| **useEncryptionAtTypeHint** | `String`|  | [optional parameter] |
| **nameIdFormat** | `String`|  | [optional parameter] |
| **nameIdFormatAtTypeHint** | `String`|  | [optional parameter] |
| **digestMethod** | `String`|  | [optional parameter] |
| **digestMethodAtTypeHint** | `String`|  | [optional parameter] |
| **signatureMethod** | `String`|  | [optional parameter] |
| **signatureMethodAtTypeHint** | `String`|  | [optional parameter] |
| **userIntermediatePath** | `String`|  | [optional parameter] |
| **userIntermediatePathAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
```java
Mono<Void> SlingApi.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNioorgApacheFelixHttpsNioAtTypeHintorgApacheFelixHttpsKeystoreorgApacheFelixHttpsKeystoreAtTypeHintorgApacheFelixHttpsKeystorePasswordorgApacheFelixHttpsKeystorePasswordAtTypeHintorgApacheFelixHttpsKeystoreKeyorgApacheFelixHttpsKeystoreKeyAtTypeHintorgApacheFelixHttpsKeystoreKeyPasswordorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHintorgApacheFelixHttpsTruststoreorgApacheFelixHttpsTruststoreAtTypeHintorgApacheFelixHttpsTruststorePasswordorgApacheFelixHttpsTruststorePasswordAtTypeHintorgApacheFelixHttpsClientcertificateorgApacheFelixHttpsClientcertificateAtTypeHintorgApacheFelixHttpsEnableorgApacheFelixHttpsEnableAtTypeHintorgOsgiServiceHttpPortSecureorgOsgiServiceHttpPortSecureAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgApacheFelixHttpsNio** | `Boolean`|  | [optional parameter] |
| **orgApacheFelixHttpsNioAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystore** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystoreAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystorePassword** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystorePasswordAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystoreKey** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystoreKeyAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystoreKeyPassword** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsTruststore** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsTruststoreAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsTruststorePassword** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsTruststorePasswordAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsClientcertificate** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsClientcertificateAtTypeHint** | `String`|  | [optional parameter] |
| **orgApacheFelixHttpsEnable** | `Boolean`|  | [optional parameter] |
| **orgApacheFelixHttpsEnableAtTypeHint** | `String`|  | [optional parameter] |
| **orgOsgiServiceHttpPortSecure** | `String`|  | [optional parameter] |
| **orgOsgiServiceHttpPortSecureAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
```java
Mono<Void> SlingApi.postConfigApacheHttpComponentsProxyConfiguration(proxyHostproxyHostAtTypeHintproxyPortproxyPortAtTypeHintproxyExceptionsproxyExceptionsAtTypeHintproxyEnabledproxyEnabledAtTypeHintproxyUserproxyUserAtTypeHintproxyPasswordproxyPasswordAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **proxyHost** | `String`|  | [optional parameter] |
| **proxyHostAtTypeHint** | `String`|  | [optional parameter] |
| **proxyPort** | `Integer`|  | [optional parameter] |
| **proxyPortAtTypeHint** | `String`|  | [optional parameter] |
| **proxyExceptions** | [**List&lt;String&gt;**](String.md)|  | [optional parameter] |
| **proxyExceptionsAtTypeHint** | `String`|  | [optional parameter] |
| **proxyEnabled** | `Boolean`|  | [optional parameter] |
| **proxyEnabledAtTypeHint** | `String`|  | [optional parameter] |
| **proxyUser** | `String`|  | [optional parameter] |
| **proxyUserAtTypeHint** | `String`|  | [optional parameter] |
| **proxyPassword** | `String`|  | [optional parameter] |
| **proxyPasswordAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
```java
Mono<Void> SlingApi.postConfigApacheSlingDavExServlet(aliasaliasAtTypeHintdavCreateAbsoluteUridavCreateAbsoluteUriAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alias** | `String`|  | [optional parameter] |
| **aliasAtTypeHint** | `String`|  | [optional parameter] |
| **davCreateAbsoluteUri** | `Boolean`|  | [optional parameter] |
| **davCreateAbsoluteUriAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
```java
Mono<Void> SlingApi.postConfigApacheSlingGetServlet(jsonMaximumresultsjsonMaximumresultsAtTypeHintenableHtmlenableHtmlAtTypeHintenableTxtenableTxtAtTypeHintenableXmlenableXmlAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jsonMaximumresults** | `String`|  | [optional parameter] |
| **jsonMaximumresultsAtTypeHint** | `String`|  | [optional parameter] |
| **enableHtml** | `Boolean`|  | [optional parameter] |
| **enableHtmlAtTypeHint** | `String`|  | [optional parameter] |
| **enableTxt** | `Boolean`|  | [optional parameter] |
| **enableTxtAtTypeHint** | `String`|  | [optional parameter] |
| **enableXml** | `Boolean`|  | [optional parameter] |
| **enableXmlAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
```java
Mono<Void> SlingApi.postConfigApacheSlingReferrerFilter(allowEmptyallowEmptyAtTypeHintallowHostsallowHostsAtTypeHintallowHostsRegexpallowHostsRegexpAtTypeHintfilterMethodsfilterMethodsAtTypeHint)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **allowEmpty** | `Boolean`|  | [optional parameter] |
| **allowEmptyAtTypeHint** | `String`|  | [optional parameter] |
| **allowHosts** | `String`|  | [optional parameter] |
| **allowHostsAtTypeHint** | `String`|  | [optional parameter] |
| **allowHostsRegexp** | `String`|  | [optional parameter] |
| **allowHostsRegexpAtTypeHint** | `String`|  | [optional parameter] |
| **filterMethods** | `String`|  | [optional parameter] |
| **filterMethodsAtTypeHint** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postConfigProperty"></a>
# **postConfigProperty**
```java
Mono<Void> SlingApi.postConfigProperty(configNodeName)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configNodeName** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postNode"></a>
# **postNode**
```java
Mono<Void> SlingApi.postNode(pathnameoperationdeleteAuthorizable_file)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **name** | `String`|  | |
| **operation** | `String`|  | [optional parameter] |
| **deleteAuthorizable** | `String`|  | [optional parameter] |
| **_file** | `File`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: Not defined

<a id="postNodeRw"></a>
# **postNodeRw**
```java
Mono<Void> SlingApi.postNodeRw(pathnameaddMembers)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **name** | `String`|  | |
| **addMembers** | `String`|  | [optional parameter] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postPath"></a>
# **postPath**
```java
Mono<Void> SlingApi.postPath(pathjcrPrimaryTypename)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **jcrPrimaryType** | `String`|  | |
| **name** | `String`|  | |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postQuery"></a>
# **postQuery**
```java
Mono<String> SlingApi.postQuery(pathpLimit_1property_1propertyValue)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | `String`|  | |
| **pLimit** | `BigDecimal`|  | |
| **_1property** | `String`|  | |
| **_1propertyValue** | `String`|  | |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="postTreeActivation"></a>
# **postTreeActivation**
```java
Mono<Void> SlingApi.postTreeActivation(ignoredeactivatedonlymodifiedpathcmd)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ignoredeactivated** | `Boolean`|  | |
| **onlymodified** | `Boolean`|  | |
| **path** | `String`|  | |
| **cmd** | `String`|  | [default to `activate`] |




### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="postTruststore"></a>
# **postTruststore**
```java
Mono<String> SlingApi.postTruststore(operationnewPasswordrePasswordkeyStoreTyperemoveAliascertificate)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **operation** | `String`|  | [optional parameter] |
| **newPassword** | `String`|  | [optional parameter] |
| **rePassword** | `String`|  | [optional parameter] |
| **keyStoreType** | `String`|  | [optional parameter] |
| **removeAlias** | `String`|  | [optional parameter] |
| **certificate** | `File`|  | [optional parameter] |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `text/plain`

<a id="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
```java
Mono<String> SlingApi.postTruststorePKCS12(truststoreP12)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **truststoreP12** | `File`|  | [optional parameter] |


### Return type
`String`

### Authorization
* **[aemAuth](auth.md#aemAuth)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `text/plain`

