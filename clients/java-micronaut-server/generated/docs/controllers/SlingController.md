# SlingController

All URIs are relative to `""`

The controller class is defined in **[SlingController.java](../../src/main/java/org/openapitools/controller/SlingController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](#getNode) | **GET** /{path}/{name} | 
[**getPackage**](#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](#getQuery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](#postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](#postPath) | **POST** /{path}/ | 
[**postQuery**](#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](#postTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**postTruststore**](#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](#postTruststorePKCS12) | **POST** /etc/truststore | 

<a id="deleteAgent"></a>
# **deleteAgent**
```java
Mono<Object> SlingController.deleteAgent(runmodename)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**runmode** | `String` |  |
**name** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="deleteNode"></a>
# **deleteNode**
```java
Mono<Object> SlingController.deleteNode(pathname)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**name** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="getAgent"></a>
# **getAgent**
```java
Mono<Object> SlingController.getAgent(runmodename)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**runmode** | `String` |  |
**name** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="getAgents"></a>
# **getAgents**
```java
Mono<String> SlingController.getAgents(runmode)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**runmode** | `String` |  |

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
```java
Mono<KeystoreInfo> SlingController.getAuthorizableKeystore(intermediatePathauthorizableId)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**intermediatePath** | `String` |  |
**authorizableId** | `String` |  |

### Return type
[**KeystoreInfo**](../../docs/models/KeystoreInfo.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

<a id="getKeystore"></a>
# **getKeystore**
```java
Mono<CompletedFileUpload> SlingController.getKeystore(intermediatePathauthorizableId)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**intermediatePath** | `String` |  |
**authorizableId** | `String` |  |

### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/octet-stream`

<a id="getNode"></a>
# **getNode**
```java
Mono<Object> SlingController.getNode(pathname)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**name** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="getPackage"></a>
# **getPackage**
```java
Mono<CompletedFileUpload> SlingController.getPackage(groupnameversion)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**group** | `String` |  |
**name** | `String` |  |
**version** | `String` |  |

### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/octet-stream`

<a id="getPackageFilter"></a>
# **getPackageFilter**
```java
Mono<String> SlingController.getPackageFilter(groupnameversion)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**group** | `String` |  |
**name** | `String` |  |
**version** | `String` |  |

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getQuery"></a>
# **getQuery**
```java
Mono<String> SlingController.getQuery(pathpLimit_1property_1propertyValue)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**pLimit** | `BigDecimal` |  |
**_1property** | `String` |  |
**_1propertyValue** | `String` |  |

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getTruststore"></a>
# **getTruststore**
```java
Mono<CompletedFileUpload> SlingController.getTruststore()
```




### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/octet-stream`

<a id="getTruststoreInfo"></a>
# **getTruststoreInfo**
```java
Mono<TruststoreInfo> SlingController.getTruststoreInfo()
```




### Return type
[**TruststoreInfo**](../../docs/models/TruststoreInfo.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="postAgent"></a>
# **postAgent**
```java
Mono<Object> SlingController.postAgent(runmodenamejcrContentCqDistributejcrContentCqDistributeAtTypeHintjcrContentCqNamejcrContentCqTemplatejcrContentAliasUpdatejcrContentEnabledjcrContentJcrDescriptionjcrContentJcrLastModifiedjcrContentJcrLastModifiedByjcrContentJcrMixinTypesjcrContentJcrTitlejcrContentLogLeveljcrContentNoStatusUpdatejcrContentNoVersioningjcrContentProtocolConnectTimeoutjcrContentProtocolHTTPConnectionClosedjcrContentProtocolHTTPExpiredjcrContentProtocolHTTPHeadersjcrContentProtocolHTTPHeadersAtTypeHintjcrContentProtocolHTTPMethodjcrContentProtocolHTTPSRelaxedjcrContentProtocolInterfacejcrContentProtocolSocketTimeoutjcrContentProtocolVersionjcrContentProxyNTLMDomainjcrContentProxyNTLMHostjcrContentProxyHostjcrContentProxyPasswordjcrContentProxyPortjcrContentProxyUserjcrContentQueueBatchMaxSizejcrContentQueueBatchModejcrContentQueueBatchWaitTimejcrContentRetryDelayjcrContentReverseReplicationjcrContentSerializationTypejcrContentSlingResourceTypejcrContentSsljcrContentTransportNTLMDomainjcrContentTransportNTLMHostjcrContentTransportPasswordjcrContentTransportUrijcrContentTransportUserjcrContentTriggerDistributejcrContentTriggerModifiedjcrContentTriggerOnOffTimejcrContentTriggerReceivejcrContentTriggerSpecificjcrContentUserIdjcrPrimaryTypeoperation)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**runmode** | `String` |  |
**name** | `String` |  |
**jcrContentCqDistribute** | `Boolean` |  | [optional parameter]
**jcrContentCqDistributeAtTypeHint** | `String` |  | [optional parameter]
**jcrContentCqName** | `String` |  | [optional parameter]
**jcrContentCqTemplate** | `String` |  | [optional parameter]
**jcrContentAliasUpdate** | `Boolean` |  | [optional parameter]
**jcrContentEnabled** | `Boolean` |  | [optional parameter]
**jcrContentJcrDescription** | `String` |  | [optional parameter]
**jcrContentJcrLastModified** | `String` |  | [optional parameter]
**jcrContentJcrLastModifiedBy** | `String` |  | [optional parameter]
**jcrContentJcrMixinTypes** | `String` |  | [optional parameter]
**jcrContentJcrTitle** | `String` |  | [optional parameter]
**jcrContentLogLevel** | `String` |  | [optional parameter]
**jcrContentNoStatusUpdate** | `Boolean` |  | [optional parameter]
**jcrContentNoVersioning** | `Boolean` |  | [optional parameter]
**jcrContentProtocolConnectTimeout** | `BigDecimal` |  | [optional parameter]
**jcrContentProtocolHTTPConnectionClosed** | `Boolean` |  | [optional parameter]
**jcrContentProtocolHTTPExpired** | `String` |  | [optional parameter]
**jcrContentProtocolHTTPHeaders** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**jcrContentProtocolHTTPHeadersAtTypeHint** | `String` |  | [optional parameter]
**jcrContentProtocolHTTPMethod** | `String` |  | [optional parameter]
**jcrContentProtocolHTTPSRelaxed** | `Boolean` |  | [optional parameter]
**jcrContentProtocolInterface** | `String` |  | [optional parameter]
**jcrContentProtocolSocketTimeout** | `BigDecimal` |  | [optional parameter]
**jcrContentProtocolVersion** | `String` |  | [optional parameter]
**jcrContentProxyNTLMDomain** | `String` |  | [optional parameter]
**jcrContentProxyNTLMHost** | `String` |  | [optional parameter]
**jcrContentProxyHost** | `String` |  | [optional parameter]
**jcrContentProxyPassword** | `String` |  | [optional parameter]
**jcrContentProxyPort** | `BigDecimal` |  | [optional parameter]
**jcrContentProxyUser** | `String` |  | [optional parameter]
**jcrContentQueueBatchMaxSize** | `BigDecimal` |  | [optional parameter]
**jcrContentQueueBatchMode** | `String` |  | [optional parameter]
**jcrContentQueueBatchWaitTime** | `BigDecimal` |  | [optional parameter]
**jcrContentRetryDelay** | `String` |  | [optional parameter]
**jcrContentReverseReplication** | `Boolean` |  | [optional parameter]
**jcrContentSerializationType** | `String` |  | [optional parameter]
**jcrContentSlingResourceType** | `String` |  | [optional parameter]
**jcrContentSsl** | `String` |  | [optional parameter]
**jcrContentTransportNTLMDomain** | `String` |  | [optional parameter]
**jcrContentTransportNTLMHost** | `String` |  | [optional parameter]
**jcrContentTransportPassword** | `String` |  | [optional parameter]
**jcrContentTransportUri** | `String` |  | [optional parameter]
**jcrContentTransportUser** | `String` |  | [optional parameter]
**jcrContentTriggerDistribute** | `Boolean` |  | [optional parameter]
**jcrContentTriggerModified** | `Boolean` |  | [optional parameter]
**jcrContentTriggerOnOffTime** | `Boolean` |  | [optional parameter]
**jcrContentTriggerReceive** | `Boolean` |  | [optional parameter]
**jcrContentTriggerSpecific** | `Boolean` |  | [optional parameter]
**jcrContentUserId** | `String` |  | [optional parameter]
**jcrPrimaryType** | `String` |  | [optional parameter]
**operation** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postAuthorizableKeystore"></a>
# **postAuthorizableKeystore**
```java
Mono<KeystoreInfo> SlingController.postAuthorizableKeystore(intermediatePathauthorizableIdoperationcurrentPasswordnewPasswordrePasswordkeyPasswordkeyStorePassaliasnewAliasremoveAliascertChainpkkeyStore)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**intermediatePath** | `String` |  |
**authorizableId** | `String` |  |
**operation** | `String` |  | [optional parameter]
**currentPassword** | `String` |  | [optional parameter]
**newPassword** | `String` |  | [optional parameter]
**rePassword** | `String` |  | [optional parameter]
**keyPassword** | `String` |  | [optional parameter]
**keyStorePass** | `String` |  | [optional parameter]
**alias** | `String` |  | [optional parameter]
**newAlias** | `String` |  | [optional parameter]
**removeAlias** | `String` |  | [optional parameter]
**certChain** | `CompletedFileUpload` |  | [optional parameter]
**pk** | `CompletedFileUpload` |  | [optional parameter]
**keyStore** | `CompletedFileUpload` |  | [optional parameter]

### Return type
[**KeystoreInfo**](../../docs/models/KeystoreInfo.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `text/plain`

<a id="postAuthorizables"></a>
# **postAuthorizables**
```java
Mono<String> SlingController.postAuthorizables(authorizableIdintermediatePathcreateUsercreateGrouprepPasswordprofileGivenName)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**authorizableId** | `String` |  |
**intermediatePath** | `String` |  |
**createUser** | `String` |  | [optional parameter]
**createGroup** | `String` |  | [optional parameter]
**repPassword** | `String` |  | [optional parameter]
**profileGivenName** | `String` |  | [optional parameter]

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/html`

<a id="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
```java
Mono<Object> SlingController.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePasswordkeyStorePasswordAtTypeHintserviceRankingserviceRankingAtTypeHintidpHttpRedirectidpHttpRedirectAtTypeHintcreateUsercreateUserAtTypeHintdefaultRedirectUrldefaultRedirectUrlAtTypeHintuserIDAttributeuserIDAttributeAtTypeHintdefaultGroupsdefaultGroupsAtTypeHintidpCertAliasidpCertAliasAtTypeHintaddGroupMembershipsaddGroupMembershipsAtTypeHintpathpathAtTypeHintsynchronizeAttributessynchronizeAttributesAtTypeHintclockToleranceclockToleranceAtTypeHintgroupMembershipAttributegroupMembershipAttributeAtTypeHintidpUrlidpUrlAtTypeHintlogoutUrllogoutUrlAtTypeHintserviceProviderEntityIdserviceProviderEntityIdAtTypeHintassertionConsumerServiceURLassertionConsumerServiceURLAtTypeHinthandleLogouthandleLogoutAtTypeHintspPrivateKeyAliasspPrivateKeyAliasAtTypeHintuseEncryptionuseEncryptionAtTypeHintnameIdFormatnameIdFormatAtTypeHintdigestMethoddigestMethodAtTypeHintsignatureMethodsignatureMethodAtTypeHintuserIntermediatePathuserIntermediatePathAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**keyStorePassword** | `String` |  | [optional parameter]
**keyStorePasswordAtTypeHint** | `String` |  | [optional parameter]
**serviceRanking** | `Integer` |  | [optional parameter]
**serviceRankingAtTypeHint** | `String` |  | [optional parameter]
**idpHttpRedirect** | `Boolean` |  | [optional parameter]
**idpHttpRedirectAtTypeHint** | `String` |  | [optional parameter]
**createUser** | `Boolean` |  | [optional parameter]
**createUserAtTypeHint** | `String` |  | [optional parameter]
**defaultRedirectUrl** | `String` |  | [optional parameter]
**defaultRedirectUrlAtTypeHint** | `String` |  | [optional parameter]
**userIDAttribute** | `String` |  | [optional parameter]
**userIDAttributeAtTypeHint** | `String` |  | [optional parameter]
**defaultGroups** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**defaultGroupsAtTypeHint** | `String` |  | [optional parameter]
**idpCertAlias** | `String` |  | [optional parameter]
**idpCertAliasAtTypeHint** | `String` |  | [optional parameter]
**addGroupMemberships** | `Boolean` |  | [optional parameter]
**addGroupMembershipsAtTypeHint** | `String` |  | [optional parameter]
**path** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**pathAtTypeHint** | `String` |  | [optional parameter]
**synchronizeAttributes** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**synchronizeAttributesAtTypeHint** | `String` |  | [optional parameter]
**clockTolerance** | `Integer` |  | [optional parameter]
**clockToleranceAtTypeHint** | `String` |  | [optional parameter]
**groupMembershipAttribute** | `String` |  | [optional parameter]
**groupMembershipAttributeAtTypeHint** | `String` |  | [optional parameter]
**idpUrl** | `String` |  | [optional parameter]
**idpUrlAtTypeHint** | `String` |  | [optional parameter]
**logoutUrl** | `String` |  | [optional parameter]
**logoutUrlAtTypeHint** | `String` |  | [optional parameter]
**serviceProviderEntityId** | `String` |  | [optional parameter]
**serviceProviderEntityIdAtTypeHint** | `String` |  | [optional parameter]
**assertionConsumerServiceURL** | `String` |  | [optional parameter]
**assertionConsumerServiceURLAtTypeHint** | `String` |  | [optional parameter]
**handleLogout** | `Boolean` |  | [optional parameter]
**handleLogoutAtTypeHint** | `String` |  | [optional parameter]
**spPrivateKeyAlias** | `String` |  | [optional parameter]
**spPrivateKeyAliasAtTypeHint** | `String` |  | [optional parameter]
**useEncryption** | `Boolean` |  | [optional parameter]
**useEncryptionAtTypeHint** | `String` |  | [optional parameter]
**nameIdFormat** | `String` |  | [optional parameter]
**nameIdFormatAtTypeHint** | `String` |  | [optional parameter]
**digestMethod** | `String` |  | [optional parameter]
**digestMethodAtTypeHint** | `String` |  | [optional parameter]
**signatureMethod** | `String` |  | [optional parameter]
**signatureMethodAtTypeHint** | `String` |  | [optional parameter]
**userIntermediatePath** | `String` |  | [optional parameter]
**userIntermediatePathAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
```java
Mono<Object> SlingController.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNioorgApacheFelixHttpsNioAtTypeHintorgApacheFelixHttpsKeystoreorgApacheFelixHttpsKeystoreAtTypeHintorgApacheFelixHttpsKeystorePasswordorgApacheFelixHttpsKeystorePasswordAtTypeHintorgApacheFelixHttpsKeystoreKeyorgApacheFelixHttpsKeystoreKeyAtTypeHintorgApacheFelixHttpsKeystoreKeyPasswordorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHintorgApacheFelixHttpsTruststoreorgApacheFelixHttpsTruststoreAtTypeHintorgApacheFelixHttpsTruststorePasswordorgApacheFelixHttpsTruststorePasswordAtTypeHintorgApacheFelixHttpsClientcertificateorgApacheFelixHttpsClientcertificateAtTypeHintorgApacheFelixHttpsEnableorgApacheFelixHttpsEnableAtTypeHintorgOsgiServiceHttpPortSecureorgOsgiServiceHttpPortSecureAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**orgApacheFelixHttpsNio** | `Boolean` |  | [optional parameter]
**orgApacheFelixHttpsNioAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystore** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystoreAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystorePassword** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystorePasswordAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystoreKey** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystoreKeyAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystoreKeyPassword** | `String` |  | [optional parameter]
**orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsTruststore** | `String` |  | [optional parameter]
**orgApacheFelixHttpsTruststoreAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsTruststorePassword** | `String` |  | [optional parameter]
**orgApacheFelixHttpsTruststorePasswordAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsClientcertificate** | `String` |  | [optional parameter]
**orgApacheFelixHttpsClientcertificateAtTypeHint** | `String` |  | [optional parameter]
**orgApacheFelixHttpsEnable** | `Boolean` |  | [optional parameter]
**orgApacheFelixHttpsEnableAtTypeHint** | `String` |  | [optional parameter]
**orgOsgiServiceHttpPortSecure** | `String` |  | [optional parameter]
**orgOsgiServiceHttpPortSecureAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
```java
Mono<Object> SlingController.postConfigApacheHttpComponentsProxyConfiguration(proxyHostproxyHostAtTypeHintproxyPortproxyPortAtTypeHintproxyExceptionsproxyExceptionsAtTypeHintproxyEnabledproxyEnabledAtTypeHintproxyUserproxyUserAtTypeHintproxyPasswordproxyPasswordAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**proxyHost** | `String` |  | [optional parameter]
**proxyHostAtTypeHint** | `String` |  | [optional parameter]
**proxyPort** | `Integer` |  | [optional parameter]
**proxyPortAtTypeHint** | `String` |  | [optional parameter]
**proxyExceptions** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**proxyExceptionsAtTypeHint** | `String` |  | [optional parameter]
**proxyEnabled** | `Boolean` |  | [optional parameter]
**proxyEnabledAtTypeHint** | `String` |  | [optional parameter]
**proxyUser** | `String` |  | [optional parameter]
**proxyUserAtTypeHint** | `String` |  | [optional parameter]
**proxyPassword** | `String` |  | [optional parameter]
**proxyPasswordAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
```java
Mono<Object> SlingController.postConfigApacheSlingDavExServlet(aliasaliasAtTypeHintdavCreateAbsoluteUridavCreateAbsoluteUriAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**alias** | `String` |  | [optional parameter]
**aliasAtTypeHint** | `String` |  | [optional parameter]
**davCreateAbsoluteUri** | `Boolean` |  | [optional parameter]
**davCreateAbsoluteUriAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
```java
Mono<Object> SlingController.postConfigApacheSlingGetServlet(jsonMaximumresultsjsonMaximumresultsAtTypeHintenableHtmlenableHtmlAtTypeHintenableTxtenableTxtAtTypeHintenableXmlenableXmlAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**jsonMaximumresults** | `String` |  | [optional parameter]
**jsonMaximumresultsAtTypeHint** | `String` |  | [optional parameter]
**enableHtml** | `Boolean` |  | [optional parameter]
**enableHtmlAtTypeHint** | `String` |  | [optional parameter]
**enableTxt** | `Boolean` |  | [optional parameter]
**enableTxtAtTypeHint** | `String` |  | [optional parameter]
**enableXml** | `Boolean` |  | [optional parameter]
**enableXmlAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
```java
Mono<Object> SlingController.postConfigApacheSlingReferrerFilter(allowEmptyallowEmptyAtTypeHintallowHostsallowHostsAtTypeHintallowHostsRegexpallowHostsRegexpAtTypeHintfilterMethodsfilterMethodsAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**allowEmpty** | `Boolean` |  | [optional parameter]
**allowEmptyAtTypeHint** | `String` |  | [optional parameter]
**allowHosts** | `String` |  | [optional parameter]
**allowHostsAtTypeHint** | `String` |  | [optional parameter]
**allowHostsRegexp** | `String` |  | [optional parameter]
**allowHostsRegexpAtTypeHint** | `String` |  | [optional parameter]
**filterMethods** | `String` |  | [optional parameter]
**filterMethodsAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postConfigProperty"></a>
# **postConfigProperty**
```java
Mono<Object> SlingController.postConfigProperty(configNodeName)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**configNodeName** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postNode"></a>
# **postNode**
```java
Mono<Object> SlingController.postNode(pathnameoperationdeleteAuthorizable_file)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**name** | `String` |  |
**operation** | `String` |  | [optional parameter]
**deleteAuthorizable** | `String` |  | [optional parameter]
**_file** | `CompletedFileUpload` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: Not defined

<a id="postNodeRw"></a>
# **postNodeRw**
```java
Mono<Object> SlingController.postNodeRw(pathnameaddMembers)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**name** | `String` |  |
**addMembers** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postPath"></a>
# **postPath**
```java
Mono<Object> SlingController.postPath(pathjcrPrimaryTypename)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**jcrPrimaryType** | `String` |  |
**name** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postQuery"></a>
# **postQuery**
```java
Mono<String> SlingController.postQuery(pathpLimit_1property_1propertyValue)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**pLimit** | `BigDecimal` |  |
**_1property** | `String` |  |
**_1propertyValue** | `String` |  |

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="postTreeActivation"></a>
# **postTreeActivation**
```java
Mono<Object> SlingController.postTreeActivation(ignoredeactivatedonlymodifiedpathcmd)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ignoredeactivated** | `Boolean` |  |
**onlymodified** | `Boolean` |  |
**path** | `String` |  |
**cmd** | `String` |  | [default to `activate`]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postTruststore"></a>
# **postTruststore**
```java
Mono<String> SlingController.postTruststore(operationnewPasswordrePasswordkeyStoreTyperemoveAliascertificate)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**operation** | `String` |  | [optional parameter]
**newPassword** | `String` |  | [optional parameter]
**rePassword** | `String` |  | [optional parameter]
**keyStoreType** | `String` |  | [optional parameter]
**removeAlias** | `String` |  | [optional parameter]
**certificate** | `CompletedFileUpload` |  | [optional parameter]

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `text/plain`

<a id="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
```java
Mono<String> SlingController.postTruststorePKCS12(truststoreP12)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**truststoreP12** | `CompletedFileUpload` |  | [optional parameter]

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `text/plain`

