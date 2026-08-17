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



## deleteAgent

> void deleteAgent(runmode, name)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## deleteNode

> void deleteNode(path, name)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getAgent

> void getAgent(runmode, name)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getAgents

> String getAgents(runmode)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getAuthorizableKeystore

> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | |
| **authorizableId** | **String**|  | |

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **200** | Default response |  -  |


## getKeystore

> File getKeystore(intermediatePath, authorizableId)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | |
| **authorizableId** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getNode

> void getNode(path, name)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getPackage

> File getPackage(group, name, version)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | **String**|  | |
| **name** | **String**|  | |
| **version** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getPackageFilter

> String getPackageFilter(group, name, version)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | **String**|  | |
| **name** | **String**|  | |
| **version** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getQuery

> String getQuery(path, pLimit, _1property, _1propertyValue)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **pLimit** | **BigDecimal**|  | |
| **_1property** | **String**|  | |
| **_1propertyValue** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getTruststore

> File getTruststore()



### Parameters

This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getTruststoreInfo

> TruststoreInfo getTruststoreInfo()



### Parameters

This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM Truststore info |  -  |
| **200** | Default response |  -  |


## postAgent

> void postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | |
| **name** | **String**|  | |
| **jcrContentCqDistribute** | **Boolean**|  | [optional] |
| **jcrContentCqDistributeAtTypeHint** | **String**|  | [optional] |
| **jcrContentCqName** | **String**|  | [optional] |
| **jcrContentCqTemplate** | **String**|  | [optional] |
| **jcrContentAliasUpdate** | **Boolean**|  | [optional] |
| **jcrContentEnabled** | **Boolean**|  | [optional] |
| **jcrContentJcrDescription** | **String**|  | [optional] |
| **jcrContentJcrLastModified** | **String**|  | [optional] |
| **jcrContentJcrLastModifiedBy** | **String**|  | [optional] |
| **jcrContentJcrMixinTypes** | **String**|  | [optional] |
| **jcrContentJcrTitle** | **String**|  | [optional] |
| **jcrContentLogLevel** | **String**|  | [optional] |
| **jcrContentNoStatusUpdate** | **Boolean**|  | [optional] |
| **jcrContentNoVersioning** | **Boolean**|  | [optional] |
| **jcrContentProtocolConnectTimeout** | **BigDecimal**|  | [optional] |
| **jcrContentProtocolHTTPConnectionClosed** | **Boolean**|  | [optional] |
| **jcrContentProtocolHTTPExpired** | **String**|  | [optional] |
| **jcrContentProtocolHTTPHeaders** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **jcrContentProtocolHTTPHeadersAtTypeHint** | **String**|  | [optional] |
| **jcrContentProtocolHTTPMethod** | **String**|  | [optional] |
| **jcrContentProtocolHTTPSRelaxed** | **Boolean**|  | [optional] |
| **jcrContentProtocolInterface** | **String**|  | [optional] |
| **jcrContentProtocolSocketTimeout** | **BigDecimal**|  | [optional] |
| **jcrContentProtocolVersion** | **String**|  | [optional] |
| **jcrContentProxyNTLMDomain** | **String**|  | [optional] |
| **jcrContentProxyNTLMHost** | **String**|  | [optional] |
| **jcrContentProxyHost** | **String**|  | [optional] |
| **jcrContentProxyPassword** | **String**|  | [optional] |
| **jcrContentProxyPort** | **BigDecimal**|  | [optional] |
| **jcrContentProxyUser** | **String**|  | [optional] |
| **jcrContentQueueBatchMaxSize** | **BigDecimal**|  | [optional] |
| **jcrContentQueueBatchMode** | **String**|  | [optional] |
| **jcrContentQueueBatchWaitTime** | **BigDecimal**|  | [optional] |
| **jcrContentRetryDelay** | **String**|  | [optional] |
| **jcrContentReverseReplication** | **Boolean**|  | [optional] |
| **jcrContentSerializationType** | **String**|  | [optional] |
| **jcrContentSlingResourceType** | **String**|  | [optional] |
| **jcrContentSsl** | **String**|  | [optional] |
| **jcrContentTransportNTLMDomain** | **String**|  | [optional] |
| **jcrContentTransportNTLMHost** | **String**|  | [optional] |
| **jcrContentTransportPassword** | **String**|  | [optional] |
| **jcrContentTransportUri** | **String**|  | [optional] |
| **jcrContentTransportUser** | **String**|  | [optional] |
| **jcrContentTriggerDistribute** | **Boolean**|  | [optional] |
| **jcrContentTriggerModified** | **Boolean**|  | [optional] |
| **jcrContentTriggerOnOffTime** | **Boolean**|  | [optional] |
| **jcrContentTriggerReceive** | **Boolean**|  | [optional] |
| **jcrContentTriggerSpecific** | **Boolean**|  | [optional] |
| **jcrContentUserId** | **String**|  | [optional] |
| **jcrPrimaryType** | **String**|  | [optional] |
| **operation** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postAuthorizableKeystore

> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | |
| **authorizableId** | **String**|  | |
| **operation** | **String**|  | [optional] |
| **currentPassword** | **String**|  | [optional] |
| **newPassword** | **String**|  | [optional] |
| **rePassword** | **String**|  | [optional] |
| **keyPassword** | **String**|  | [optional] |
| **keyStorePass** | **String**|  | [optional] |
| **alias** | **String**|  | [optional] |
| **newAlias** | **String**|  | [optional] |
| **removeAlias** | **String**|  | [optional] |
| **certChain** | **File**|  | [optional] |
| **pk** | **File**|  | [optional] |
| **keyStore** | **File**|  | [optional] |

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **200** | Default response |  -  |


## postAuthorizables

> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | **String**|  | |
| **intermediatePath** | **String**|  | |
| **createUser** | **String**|  | [optional] |
| **createGroup** | **String**|  | [optional] |
| **repPassword** | **String**|  | [optional] |
| **profileGivenName** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigAdobeGraniteSamlAuthenticationHandler

> void postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyStorePassword** | **String**|  | [optional] |
| **keyStorePasswordAtTypeHint** | **String**|  | [optional] |
| **serviceRanking** | **Integer**|  | [optional] |
| **serviceRankingAtTypeHint** | **String**|  | [optional] |
| **idpHttpRedirect** | **Boolean**|  | [optional] |
| **idpHttpRedirectAtTypeHint** | **String**|  | [optional] |
| **createUser** | **Boolean**|  | [optional] |
| **createUserAtTypeHint** | **String**|  | [optional] |
| **defaultRedirectUrl** | **String**|  | [optional] |
| **defaultRedirectUrlAtTypeHint** | **String**|  | [optional] |
| **userIDAttribute** | **String**|  | [optional] |
| **userIDAttributeAtTypeHint** | **String**|  | [optional] |
| **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **defaultGroupsAtTypeHint** | **String**|  | [optional] |
| **idpCertAlias** | **String**|  | [optional] |
| **idpCertAliasAtTypeHint** | **String**|  | [optional] |
| **addGroupMemberships** | **Boolean**|  | [optional] |
| **addGroupMembershipsAtTypeHint** | **String**|  | [optional] |
| **path** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathAtTypeHint** | **String**|  | [optional] |
| **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **synchronizeAttributesAtTypeHint** | **String**|  | [optional] |
| **clockTolerance** | **Integer**|  | [optional] |
| **clockToleranceAtTypeHint** | **String**|  | [optional] |
| **groupMembershipAttribute** | **String**|  | [optional] |
| **groupMembershipAttributeAtTypeHint** | **String**|  | [optional] |
| **idpUrl** | **String**|  | [optional] |
| **idpUrlAtTypeHint** | **String**|  | [optional] |
| **logoutUrl** | **String**|  | [optional] |
| **logoutUrlAtTypeHint** | **String**|  | [optional] |
| **serviceProviderEntityId** | **String**|  | [optional] |
| **serviceProviderEntityIdAtTypeHint** | **String**|  | [optional] |
| **assertionConsumerServiceURL** | **String**|  | [optional] |
| **assertionConsumerServiceURLAtTypeHint** | **String**|  | [optional] |
| **handleLogout** | **Boolean**|  | [optional] |
| **handleLogoutAtTypeHint** | **String**|  | [optional] |
| **spPrivateKeyAlias** | **String**|  | [optional] |
| **spPrivateKeyAliasAtTypeHint** | **String**|  | [optional] |
| **useEncryption** | **Boolean**|  | [optional] |
| **useEncryptionAtTypeHint** | **String**|  | [optional] |
| **nameIdFormat** | **String**|  | [optional] |
| **nameIdFormatAtTypeHint** | **String**|  | [optional] |
| **digestMethod** | **String**|  | [optional] |
| **digestMethodAtTypeHint** | **String**|  | [optional] |
| **signatureMethod** | **String**|  | [optional] |
| **signatureMethodAtTypeHint** | **String**|  | [optional] |
| **userIntermediatePath** | **String**|  | [optional] |
| **userIntermediatePathAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheFelixJettyBasedHttpService

> void postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgApacheFelixHttpsNio** | **Boolean**|  | [optional] |
| **orgApacheFelixHttpsNioAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystore** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystorePassword** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystorePasswordAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKey** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKeyAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional] |
| **orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststore** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststoreAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststorePassword** | **String**|  | [optional] |
| **orgApacheFelixHttpsTruststorePasswordAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsClientcertificate** | **String**|  | [optional] |
| **orgApacheFelixHttpsClientcertificateAtTypeHint** | **String**|  | [optional] |
| **orgApacheFelixHttpsEnable** | **Boolean**|  | [optional] |
| **orgApacheFelixHttpsEnableAtTypeHint** | **String**|  | [optional] |
| **orgOsgiServiceHttpPortSecure** | **String**|  | [optional] |
| **orgOsgiServiceHttpPortSecureAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheHttpComponentsProxyConfiguration

> void postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **proxyHost** | **String**|  | [optional] |
| **proxyHostAtTypeHint** | **String**|  | [optional] |
| **proxyPort** | **Integer**|  | [optional] |
| **proxyPortAtTypeHint** | **String**|  | [optional] |
| **proxyExceptions** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **proxyExceptionsAtTypeHint** | **String**|  | [optional] |
| **proxyEnabled** | **Boolean**|  | [optional] |
| **proxyEnabledAtTypeHint** | **String**|  | [optional] |
| **proxyUser** | **String**|  | [optional] |
| **proxyUserAtTypeHint** | **String**|  | [optional] |
| **proxyPassword** | **String**|  | [optional] |
| **proxyPasswordAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheSlingDavExServlet

> void postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alias** | **String**|  | [optional] |
| **aliasAtTypeHint** | **String**|  | [optional] |
| **davCreateAbsoluteUri** | **Boolean**|  | [optional] |
| **davCreateAbsoluteUriAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheSlingGetServlet

> void postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jsonMaximumresults** | **String**|  | [optional] |
| **jsonMaximumresultsAtTypeHint** | **String**|  | [optional] |
| **enableHtml** | **Boolean**|  | [optional] |
| **enableHtmlAtTypeHint** | **String**|  | [optional] |
| **enableTxt** | **Boolean**|  | [optional] |
| **enableTxtAtTypeHint** | **String**|  | [optional] |
| **enableXml** | **Boolean**|  | [optional] |
| **enableXmlAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigApacheSlingReferrerFilter

> void postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **allowEmpty** | **Boolean**|  | [optional] |
| **allowEmptyAtTypeHint** | **String**|  | [optional] |
| **allowHosts** | **String**|  | [optional] |
| **allowHostsAtTypeHint** | **String**|  | [optional] |
| **allowHostsRegexp** | **String**|  | [optional] |
| **allowHostsRegexpAtTypeHint** | **String**|  | [optional] |
| **filterMethods** | **String**|  | [optional] |
| **filterMethodsAtTypeHint** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postConfigProperty

> void postConfigProperty(configNodeName)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configNodeName** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postNode

> void postNode(path, name, operation, deleteAuthorizable, _file)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |
| **operation** | **String**|  | [optional] |
| **deleteAuthorizable** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postNodeRw

> void postNodeRw(path, name, addMembers)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **name** | **String**|  | |
| **addMembers** | **String**|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postPath

> void postPath(path, jcrPrimaryType, name)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **jcrPrimaryType** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postQuery

> String postQuery(path, pLimit, _1property, _1propertyValue)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |
| **pLimit** | **BigDecimal**|  | |
| **_1property** | **String**|  | |
| **_1propertyValue** | **String**|  | |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postTreeActivation

> void postTreeActivation(ignoredeactivated, onlymodified, path, cmd)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ignoredeactivated** | **Boolean**|  | |
| **onlymodified** | **Boolean**|  | |
| **path** | **String**|  | |
| **cmd** | **String**|  | [default to activate] |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postTruststore

> String postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **operation** | **String**|  | [optional] |
| **newPassword** | **String**|  | [optional] |
| **rePassword** | **String**|  | [optional] |
| **keyStoreType** | **String**|  | [optional] |
| **removeAlias** | **String**|  | [optional] |
| **certificate** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postTruststorePKCS12

> String postTruststorePKCS12(truststoreP12)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **truststoreP12** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

