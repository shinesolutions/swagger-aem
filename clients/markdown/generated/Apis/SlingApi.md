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


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(runmode, name)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="getAgents"></a>
# **getAgents**
> String getAgents(runmode)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getAuthorizableKeystore"></a>
# **getAuthorizableKeystore**
> KeystoreInfo getAuthorizableKeystore(intermediatePath, authorizableId)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | [default to null] |
| **authorizableId** | **String**|  | [default to null] |

### Return type

[**KeystoreInfo**](../Models/KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

<a name="getKeystore"></a>
# **getKeystore**
> File getKeystore(intermediatePath, authorizableId)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | [default to null] |
| **authorizableId** | **String**|  | [default to null] |

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

<a name="getNode"></a>
# **getNode**
> getNode(path, name)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="getPackage"></a>
# **getPackage**
> File getPackage(group, name, version)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |
| **version** | **String**|  | [default to null] |

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

<a name="getPackageFilter"></a>
# **getPackageFilter**
> String getPackageFilter(group, name, version)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |
| **version** | **String**|  | [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getQuery"></a>
# **getQuery**
> String getQuery(path, p.limit, 1\_property, 1\_property.value)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **p.limit** | **BigDecimal**|  | [default to null] |
| **1\_property** | **String**|  | [default to null] |
| **1\_property.value** | **String**|  | [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTruststore"></a>
# **getTruststore**
> File getTruststore()



### Parameters
This endpoint does not need any parameter.

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

<a name="getTruststoreInfo"></a>
# **getTruststoreInfo**
> TruststoreInfo getTruststoreInfo()



### Parameters
This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](../Models/TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, jcr:content\/cq:distribute, jcr:content\/cq:distribute@TypeHint, jcr:content\/cq:name, jcr:content\/cq:template, jcr:content\/aliasUpdate, jcr:content\/enabled, jcr:content\/jcr:description, jcr:content\/jcr:lastModified, jcr:content\/jcr:lastModifiedBy, jcr:content\/jcr:mixinTypes, jcr:content\/jcr:title, jcr:content\/logLevel, jcr:content\/noStatusUpdate, jcr:content\/noVersioning, jcr:content\/protocolConnectTimeout, jcr:content\/protocolHTTPConnectionClosed, jcr:content\/protocolHTTPExpired, jcr:content\/protocolHTTPHeaders, jcr:content\/protocolHTTPHeaders@TypeHint, jcr:content\/protocolHTTPMethod, jcr:content\/protocolHTTPSRelaxed, jcr:content\/protocolInterface, jcr:content\/protocolSocketTimeout, jcr:content\/protocolVersion, jcr:content\/proxyNTLMDomain, jcr:content\/proxyNTLMHost, jcr:content\/proxyHost, jcr:content\/proxyPassword, jcr:content\/proxyPort, jcr:content\/proxyUser, jcr:content\/queueBatchMaxSize, jcr:content\/queueBatchMode, jcr:content\/queueBatchWaitTime, jcr:content\/retryDelay, jcr:content\/reverseReplication, jcr:content\/serializationType, jcr:content\/sling:resourceType, jcr:content\/ssl, jcr:content\/transportNTLMDomain, jcr:content\/transportNTLMHost, jcr:content\/transportPassword, jcr:content\/transportUri, jcr:content\/transportUser, jcr:content\/triggerDistribute, jcr:content\/triggerModified, jcr:content\/triggerOnOffTime, jcr:content\/triggerReceive, jcr:content\/triggerSpecific, jcr:content\/userId, jcr:primaryType, :operation)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runmode** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |
| **jcr:content\/cq:distribute** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/cq:distribute@TypeHint** | **String**|  | [optional] [default to null] |
| **jcr:content\/cq:name** | **String**|  | [optional] [default to null] |
| **jcr:content\/cq:template** | **String**|  | [optional] [default to null] |
| **jcr:content\/aliasUpdate** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/enabled** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/jcr:description** | **String**|  | [optional] [default to null] |
| **jcr:content\/jcr:lastModified** | **String**|  | [optional] [default to null] |
| **jcr:content\/jcr:lastModifiedBy** | **String**|  | [optional] [default to null] |
| **jcr:content\/jcr:mixinTypes** | **String**|  | [optional] [default to null] |
| **jcr:content\/jcr:title** | **String**|  | [optional] [default to null] |
| **jcr:content\/logLevel** | **String**|  | [optional] [default to null] |
| **jcr:content\/noStatusUpdate** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/noVersioning** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/protocolConnectTimeout** | **BigDecimal**|  | [optional] [default to null] |
| **jcr:content\/protocolHTTPConnectionClosed** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/protocolHTTPExpired** | **String**|  | [optional] [default to null] |
| **jcr:content\/protocolHTTPHeaders** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **jcr:content\/protocolHTTPHeaders@TypeHint** | **String**|  | [optional] [default to null] |
| **jcr:content\/protocolHTTPMethod** | **String**|  | [optional] [default to null] |
| **jcr:content\/protocolHTTPSRelaxed** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/protocolInterface** | **String**|  | [optional] [default to null] |
| **jcr:content\/protocolSocketTimeout** | **BigDecimal**|  | [optional] [default to null] |
| **jcr:content\/protocolVersion** | **String**|  | [optional] [default to null] |
| **jcr:content\/proxyNTLMDomain** | **String**|  | [optional] [default to null] |
| **jcr:content\/proxyNTLMHost** | **String**|  | [optional] [default to null] |
| **jcr:content\/proxyHost** | **String**|  | [optional] [default to null] |
| **jcr:content\/proxyPassword** | **String**|  | [optional] [default to null] |
| **jcr:content\/proxyPort** | **BigDecimal**|  | [optional] [default to null] |
| **jcr:content\/proxyUser** | **String**|  | [optional] [default to null] |
| **jcr:content\/queueBatchMaxSize** | **BigDecimal**|  | [optional] [default to null] |
| **jcr:content\/queueBatchMode** | **String**|  | [optional] [default to null] |
| **jcr:content\/queueBatchWaitTime** | **BigDecimal**|  | [optional] [default to null] |
| **jcr:content\/retryDelay** | **String**|  | [optional] [default to null] |
| **jcr:content\/reverseReplication** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/serializationType** | **String**|  | [optional] [default to null] |
| **jcr:content\/sling:resourceType** | **String**|  | [optional] [default to null] |
| **jcr:content\/ssl** | **String**|  | [optional] [default to null] |
| **jcr:content\/transportNTLMDomain** | **String**|  | [optional] [default to null] |
| **jcr:content\/transportNTLMHost** | **String**|  | [optional] [default to null] |
| **jcr:content\/transportPassword** | **String**|  | [optional] [default to null] |
| **jcr:content\/transportUri** | **String**|  | [optional] [default to null] |
| **jcr:content\/transportUser** | **String**|  | [optional] [default to null] |
| **jcr:content\/triggerDistribute** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/triggerModified** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/triggerOnOffTime** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/triggerReceive** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/triggerSpecific** | **Boolean**|  | [optional] [default to null] |
| **jcr:content\/userId** | **String**|  | [optional] [default to null] |
| **jcr:primaryType** | **String**|  | [optional] [default to null] |
| **:operation** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postAuthorizableKeystore"></a>
# **postAuthorizableKeystore**
> KeystoreInfo postAuthorizableKeystore(intermediatePath, authorizableId, :operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, cert-chain, pk, keyStore)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediatePath** | **String**|  | [default to null] |
| **authorizableId** | **String**|  | [default to null] |
| **:operation** | **String**|  | [optional] [default to null] |
| **currentPassword** | **String**|  | [optional] [default to null] |
| **newPassword** | **String**|  | [optional] [default to null] |
| **rePassword** | **String**|  | [optional] [default to null] |
| **keyPassword** | **String**|  | [optional] [default to null] |
| **keyStorePass** | **String**|  | [optional] [default to null] |
| **alias** | **String**|  | [optional] [default to null] |
| **newAlias** | **String**|  | [optional] [default to null] |
| **removeAlias** | **String**|  | [optional] [default to null] |
| **cert-chain** | **File**|  | [optional] [default to null] |
| **pk** | **File**|  | [optional] [default to null] |
| **keyStore** | **File**|  | [optional] [default to null] |

### Return type

[**KeystoreInfo**](../Models/KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> String postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, rep:password, profile\/givenName)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | **String**|  | [default to null] |
| **intermediatePath** | **String**|  | [default to null] |
| **createUser** | **String**|  | [optional] [default to null] |
| **createGroup** | **String**|  | [optional] [default to null] |
| **rep:password** | **String**|  | [optional] [default to null] |
| **profile\/givenName** | **String**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

<a name="postConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePassword@TypeHint, service.ranking, service.ranking@TypeHint, idpHttpRedirect, idpHttpRedirect@TypeHint, createUser, createUser@TypeHint, defaultRedirectUrl, defaultRedirectUrl@TypeHint, userIDAttribute, userIDAttribute@TypeHint, defaultGroups, defaultGroups@TypeHint, idpCertAlias, idpCertAlias@TypeHint, addGroupMemberships, addGroupMemberships@TypeHint, path, path@TypeHint, synchronizeAttributes, synchronizeAttributes@TypeHint, clockTolerance, clockTolerance@TypeHint, groupMembershipAttribute, groupMembershipAttribute@TypeHint, idpUrl, idpUrl@TypeHint, logoutUrl, logoutUrl@TypeHint, serviceProviderEntityId, serviceProviderEntityId@TypeHint, assertionConsumerServiceURL, assertionConsumerServiceURL@TypeHint, handleLogout, handleLogout@TypeHint, spPrivateKeyAlias, spPrivateKeyAlias@TypeHint, useEncryption, useEncryption@TypeHint, nameIdFormat, nameIdFormat@TypeHint, digestMethod, digestMethod@TypeHint, signatureMethod, signatureMethod@TypeHint, userIntermediatePath, userIntermediatePath@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyStorePassword** | **String**|  | [optional] [default to null] |
| **keyStorePassword@TypeHint** | **String**|  | [optional] [default to null] |
| **service.ranking** | **Integer**|  | [optional] [default to null] |
| **service.ranking@TypeHint** | **String**|  | [optional] [default to null] |
| **idpHttpRedirect** | **Boolean**|  | [optional] [default to null] |
| **idpHttpRedirect@TypeHint** | **String**|  | [optional] [default to null] |
| **createUser** | **Boolean**|  | [optional] [default to null] |
| **createUser@TypeHint** | **String**|  | [optional] [default to null] |
| **defaultRedirectUrl** | **String**|  | [optional] [default to null] |
| **defaultRedirectUrl@TypeHint** | **String**|  | [optional] [default to null] |
| **userIDAttribute** | **String**|  | [optional] [default to null] |
| **userIDAttribute@TypeHint** | **String**|  | [optional] [default to null] |
| **defaultGroups** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **defaultGroups@TypeHint** | **String**|  | [optional] [default to null] |
| **idpCertAlias** | **String**|  | [optional] [default to null] |
| **idpCertAlias@TypeHint** | **String**|  | [optional] [default to null] |
| **addGroupMemberships** | **Boolean**|  | [optional] [default to null] |
| **addGroupMemberships@TypeHint** | **String**|  | [optional] [default to null] |
| **path** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **path@TypeHint** | **String**|  | [optional] [default to null] |
| **synchronizeAttributes** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **synchronizeAttributes@TypeHint** | **String**|  | [optional] [default to null] |
| **clockTolerance** | **Integer**|  | [optional] [default to null] |
| **clockTolerance@TypeHint** | **String**|  | [optional] [default to null] |
| **groupMembershipAttribute** | **String**|  | [optional] [default to null] |
| **groupMembershipAttribute@TypeHint** | **String**|  | [optional] [default to null] |
| **idpUrl** | **String**|  | [optional] [default to null] |
| **idpUrl@TypeHint** | **String**|  | [optional] [default to null] |
| **logoutUrl** | **String**|  | [optional] [default to null] |
| **logoutUrl@TypeHint** | **String**|  | [optional] [default to null] |
| **serviceProviderEntityId** | **String**|  | [optional] [default to null] |
| **serviceProviderEntityId@TypeHint** | **String**|  | [optional] [default to null] |
| **assertionConsumerServiceURL** | **String**|  | [optional] [default to null] |
| **assertionConsumerServiceURL@TypeHint** | **String**|  | [optional] [default to null] |
| **handleLogout** | **Boolean**|  | [optional] [default to null] |
| **handleLogout@TypeHint** | **String**|  | [optional] [default to null] |
| **spPrivateKeyAlias** | **String**|  | [optional] [default to null] |
| **spPrivateKeyAlias@TypeHint** | **String**|  | [optional] [default to null] |
| **useEncryption** | **Boolean**|  | [optional] [default to null] |
| **useEncryption@TypeHint** | **String**|  | [optional] [default to null] |
| **nameIdFormat** | **String**|  | [optional] [default to null] |
| **nameIdFormat@TypeHint** | **String**|  | [optional] [default to null] |
| **digestMethod** | **String**|  | [optional] [default to null] |
| **digestMethod@TypeHint** | **String**|  | [optional] [default to null] |
| **signatureMethod** | **String**|  | [optional] [default to null] |
| **signatureMethod@TypeHint** | **String**|  | [optional] [default to null] |
| **userIntermediatePath** | **String**|  | [optional] [default to null] |
| **userIntermediatePath@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(org.apache.felix.https.nio, org.apache.felix.https.nio@TypeHint, org.apache.felix.https.keystore, org.apache.felix.https.keystore@TypeHint, org.apache.felix.https.keystore.password, org.apache.felix.https.keystore.password@TypeHint, org.apache.felix.https.keystore.key, org.apache.felix.https.keystore.key@TypeHint, org.apache.felix.https.keystore.key.password, org.apache.felix.https.keystore.key.password@TypeHint, org.apache.felix.https.truststore, org.apache.felix.https.truststore@TypeHint, org.apache.felix.https.truststore.password, org.apache.felix.https.truststore.password@TypeHint, org.apache.felix.https.clientcertificate, org.apache.felix.https.clientcertificate@TypeHint, org.apache.felix.https.enable, org.apache.felix.https.enable@TypeHint, org.osgi.service.http.port.secure, org.osgi.service.http.port.secure@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org.apache.felix.https.nio** | **Boolean**|  | [optional] [default to null] |
| **org.apache.felix.https.nio@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore.password** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore.password@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore.key** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore.key@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore.key.password** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.keystore.key.password@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.truststore** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.truststore@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.truststore.password** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.truststore.password@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.clientcertificate** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.clientcertificate@TypeHint** | **String**|  | [optional] [default to null] |
| **org.apache.felix.https.enable** | **Boolean**|  | [optional] [default to null] |
| **org.apache.felix.https.enable@TypeHint** | **String**|  | [optional] [default to null] |
| **org.osgi.service.http.port.secure** | **String**|  | [optional] [default to null] |
| **org.osgi.service.http.port.secure@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postConfigApacheHttpComponentsProxyConfiguration"></a>
# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(proxy.host, proxy.host@TypeHint, proxy.port, proxy.port@TypeHint, proxy.exceptions, proxy.exceptions@TypeHint, proxy.enabled, proxy.enabled@TypeHint, proxy.user, proxy.user@TypeHint, proxy.password, proxy.password@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **proxy.host** | **String**|  | [optional] [default to null] |
| **proxy.host@TypeHint** | **String**|  | [optional] [default to null] |
| **proxy.port** | **Integer**|  | [optional] [default to null] |
| **proxy.port@TypeHint** | **String**|  | [optional] [default to null] |
| **proxy.exceptions** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **proxy.exceptions@TypeHint** | **String**|  | [optional] [default to null] |
| **proxy.enabled** | **Boolean**|  | [optional] [default to null] |
| **proxy.enabled@TypeHint** | **String**|  | [optional] [default to null] |
| **proxy.user** | **String**|  | [optional] [default to null] |
| **proxy.user@TypeHint** | **String**|  | [optional] [default to null] |
| **proxy.password** | **String**|  | [optional] [default to null] |
| **proxy.password@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(alias, alias@TypeHint, dav.create-absolute-uri, dav.create-absolute-uri@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alias** | **String**|  | [optional] [default to null] |
| **alias@TypeHint** | **String**|  | [optional] [default to null] |
| **dav.create-absolute-uri** | **Boolean**|  | [optional] [default to null] |
| **dav.create-absolute-uri@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(json.maximumresults, json.maximumresults@TypeHint, enable.html, enable.html@TypeHint, enable.txt, enable.txt@TypeHint, enable.xml, enable.xml@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **json.maximumresults** | **String**|  | [optional] [default to null] |
| **json.maximumresults@TypeHint** | **String**|  | [optional] [default to null] |
| **enable.html** | **Boolean**|  | [optional] [default to null] |
| **enable.html@TypeHint** | **String**|  | [optional] [default to null] |
| **enable.txt** | **Boolean**|  | [optional] [default to null] |
| **enable.txt@TypeHint** | **String**|  | [optional] [default to null] |
| **enable.xml** | **Boolean**|  | [optional] [default to null] |
| **enable.xml@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(allow.empty, allow.empty@TypeHint, allow.hosts, allow.hosts@TypeHint, allow.hosts.regexp, allow.hosts.regexp@TypeHint, filter.methods, filter.methods@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **allow.empty** | **Boolean**|  | [optional] [default to null] |
| **allow.empty@TypeHint** | **String**|  | [optional] [default to null] |
| **allow.hosts** | **String**|  | [optional] [default to null] |
| **allow.hosts@TypeHint** | **String**|  | [optional] [default to null] |
| **allow.hosts.regexp** | **String**|  | [optional] [default to null] |
| **allow.hosts.regexp@TypeHint** | **String**|  | [optional] [default to null] |
| **filter.methods** | **String**|  | [optional] [default to null] |
| **filter.methods@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postConfigProperty"></a>
# **postConfigProperty**
> postConfigProperty(configNodeName)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configNodeName** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postNode"></a>
# **postNode**
> postNode(path, name, :operation, deleteAuthorizable, file)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |
| **:operation** | **String**|  | [optional] [default to null] |
| **deleteAuthorizable** | **String**|  | [optional] [default to null] |
| **file** | **File**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, addMembers)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **name** | **String**|  | [default to null] |
| **addMembers** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postPath"></a>
# **postPath**
> postPath(path, jcr:primaryType, :name)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **jcr:primaryType** | **String**|  | [default to null] |
| **:name** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postQuery"></a>
# **postQuery**
> String postQuery(path, p.limit, 1\_property, 1\_property.value)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | [default to null] |
| **p.limit** | **BigDecimal**|  | [default to null] |
| **1\_property** | **String**|  | [default to null] |
| **1\_property.value** | **String**|  | [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="postTreeActivation"></a>
# **postTreeActivation**
> postTreeActivation(ignoredeactivated, onlymodified, path, cmd)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ignoredeactivated** | **Boolean**|  | [default to null] |
| **onlymodified** | **Boolean**|  | [default to null] |
| **path** | **String**|  | [default to null] |
| **cmd** | **String**|  | [default to activate] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postTruststore"></a>
# **postTruststore**
> String postTruststore(:operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **:operation** | **String**|  | [optional] [default to null] |
| **newPassword** | **String**|  | [optional] [default to null] |
| **rePassword** | **String**|  | [optional] [default to null] |
| **keyStoreType** | **String**|  | [optional] [default to null] |
| **removeAlias** | **String**|  | [optional] [default to null] |
| **certificate** | **File**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

<a name="postTruststorePKCS12"></a>
# **postTruststorePKCS12**
> String postTruststorePKCS12(truststore.p12)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **truststore.p12** | **File**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

