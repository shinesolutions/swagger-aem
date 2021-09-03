# SlingApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](SlingApi.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 



## deleteAgent



### Example

```bash
 deleteAgent runmode=value name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteNode



### Example

```bash
 deleteNode path=value name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAgent



### Example

```bash
 getAgent runmode=value name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAgents



### Example

```bash
 getAgents runmode=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  | [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAuthorizableKeystore



### Example

```bash
 getAuthorizableKeystore intermediatePath=value authorizableId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string** |  | [default to null]
 **authorizableId** | **string** |  | [default to null]

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getKeystore



### Example

```bash
 getKeystore intermediatePath=value authorizableId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string** |  | [default to null]
 **authorizableId** | **string** |  | [default to null]

### Return type

**binary**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getNode



### Example

```bash
 getNode path=value name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPackage



### Example

```bash
 getPackage group=value name=value version=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]
 **version** | **string** |  | [default to null]

### Return type

**binary**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPackageFilter



### Example

```bash
 getPackageFilter group=value name=value version=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]
 **version** | **string** |  | [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getQuery



### Example

```bash
 getQuery  path=value  p.limit=value  1_property=value  1_property.value=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **pPeriodlimit** | **integer** |  | [default to null]
 **1Property** | **string** |  | [default to null]
 **1PropertyPeriodvalue** | **string** |  | [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getTruststore



### Example

```bash
 getTruststore
```

### Parameters

This endpoint does not need any parameter.

### Return type

**binary**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getTruststoreInfo



### Example

```bash
 getTruststoreInfo
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postAgent



### Example

```bash
 postAgent runmode=value name=value  jcr:content/cq:distribute=value  jcr:content/cq:distribute@TypeHint=value  jcr:content/cq:name=value  jcr:content/cq:template=value  jcr:content/enabled=value  jcr:content/jcr:description=value  jcr:content/jcr:lastModified=value  jcr:content/jcr:lastModifiedBy=value  jcr:content/jcr:mixinTypes=value  jcr:content/jcr:title=value  jcr:content/logLevel=value  jcr:content/noStatusUpdate=value  jcr:content/noVersioning=value  jcr:content/protocolConnectTimeout=value  jcr:content/protocolHTTPConnectionClosed=value  jcr:content/protocolHTTPExpired=value  Specify as:  jcr:content/protocolHTTPHeaders=value1 jcr:content/protocolHTTPHeaders=value2 jcr:content/protocolHTTPHeaders=...  jcr:content/protocolHTTPHeaders@TypeHint=value  jcr:content/protocolHTTPMethod=value  jcr:content/protocolHTTPSRelaxed=value  jcr:content/protocolInterface=value  jcr:content/protocolSocketTimeout=value  jcr:content/protocolVersion=value  jcr:content/proxyNTLMDomain=value  jcr:content/proxyNTLMHost=value  jcr:content/proxyHost=value  jcr:content/proxyPassword=value  jcr:content/proxyPort=value  jcr:content/proxyUser=value  jcr:content/queueBatchMaxSize=value  jcr:content/queueBatchMode=value  jcr:content/queueBatchWaitTime=value  jcr:content/retryDelay=value  jcr:content/reverseReplication=value  jcr:content/serializationType=value  jcr:content/sling:resourceType=value  jcr:content/ssl=value  jcr:content/transportNTLMDomain=value  jcr:content/transportNTLMHost=value  jcr:content/transportPassword=value  jcr:content/transportUri=value  jcr:content/transportUser=value  jcr:content/triggerDistribute=value  jcr:content/triggerModified=value  jcr:content/triggerOnOffTime=value  jcr:content/triggerReceive=value  jcr:content/triggerSpecific=value  jcr:content/userId=value  jcr:primaryType=value  :operation=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]
 **jcrContentSlashcqDistribute** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashcqDistributeAtTypeHint** | **string** |  | [optional] [default to null]
 **jcrContentSlashcqName** | **string** |  | [optional] [default to null]
 **jcrContentSlashcqTemplate** | **string** |  | [optional] [default to null]
 **jcrContentSlashenabled** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashjcrDescription** | **string** |  | [optional] [default to null]
 **jcrContentSlashjcrLastModified** | **string** |  | [optional] [default to null]
 **jcrContentSlashjcrLastModifiedBy** | **string** |  | [optional] [default to null]
 **jcrContentSlashjcrMixinTypes** | **string** |  | [optional] [default to null]
 **jcrContentSlashjcrTitle** | **string** |  | [optional] [default to null]
 **jcrContentSlashlogLevel** | **string** |  | [optional] [default to null]
 **jcrContentSlashnoStatusUpdate** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashnoVersioning** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashprotocolConnectTimeout** | **integer** |  | [optional] [default to null]
 **jcrContentSlashprotocolHTTPConnectionClosed** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashprotocolHTTPExpired** | **string** |  | [optional] [default to null]
 **jcrContentSlashprotocolHTTPHeaders** | [**array[string]**](string.md) |  | [optional] [default to null]
 **jcrContentSlashprotocolHTTPHeadersAtTypeHint** | **string** |  | [optional] [default to null]
 **jcrContentSlashprotocolHTTPMethod** | **string** |  | [optional] [default to null]
 **jcrContentSlashprotocolHTTPSRelaxed** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashprotocolInterface** | **string** |  | [optional] [default to null]
 **jcrContentSlashprotocolSocketTimeout** | **integer** |  | [optional] [default to null]
 **jcrContentSlashprotocolVersion** | **string** |  | [optional] [default to null]
 **jcrContentSlashproxyNTLMDomain** | **string** |  | [optional] [default to null]
 **jcrContentSlashproxyNTLMHost** | **string** |  | [optional] [default to null]
 **jcrContentSlashproxyHost** | **string** |  | [optional] [default to null]
 **jcrContentSlashproxyPassword** | **string** |  | [optional] [default to null]
 **jcrContentSlashproxyPort** | **integer** |  | [optional] [default to null]
 **jcrContentSlashproxyUser** | **string** |  | [optional] [default to null]
 **jcrContentSlashqueueBatchMaxSize** | **integer** |  | [optional] [default to null]
 **jcrContentSlashqueueBatchMode** | **string** |  | [optional] [default to null]
 **jcrContentSlashqueueBatchWaitTime** | **integer** |  | [optional] [default to null]
 **jcrContentSlashretryDelay** | **string** |  | [optional] [default to null]
 **jcrContentSlashreverseReplication** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashserializationType** | **string** |  | [optional] [default to null]
 **jcrContentSlashslingResourceType** | **string** |  | [optional] [default to null]
 **jcrContentSlashssl** | **string** |  | [optional] [default to null]
 **jcrContentSlashtransportNTLMDomain** | **string** |  | [optional] [default to null]
 **jcrContentSlashtransportNTLMHost** | **string** |  | [optional] [default to null]
 **jcrContentSlashtransportPassword** | **string** |  | [optional] [default to null]
 **jcrContentSlashtransportUri** | **string** |  | [optional] [default to null]
 **jcrContentSlashtransportUser** | **string** |  | [optional] [default to null]
 **jcrContentSlashtriggerDistribute** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashtriggerModified** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashtriggerOnOffTime** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashtriggerReceive** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashtriggerSpecific** | **boolean** |  | [optional] [default to null]
 **jcrContentSlashuserId** | **string** |  | [optional] [default to null]
 **jcrPrimaryType** | **string** |  | [optional] [default to null]
 **operation** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postAuthorizableKeystore



### Example

```bash
 postAuthorizableKeystore intermediatePath=value authorizableId=value  :operation=value  currentPassword=value  newPassword=value  rePassword=value  keyPassword=value  keyStorePass=value  alias=value  newAlias=value  removeAlias=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string** |  | [default to null]
 **authorizableId** | **string** |  | [default to null]
 **operation** | **string** |  | [optional] [default to null]
 **currentPassword** | **string** |  | [optional] [default to null]
 **newPassword** | **string** |  | [optional] [default to null]
 **rePassword** | **string** |  | [optional] [default to null]
 **keyPassword** | **string** |  | [optional] [default to null]
 **keyStorePass** | **string** |  | [optional] [default to null]
 **alias** | **string** |  | [optional] [default to null]
 **newAlias** | **string** |  | [optional] [default to null]
 **removeAlias** | **string** |  | [optional] [default to null]
 **certChain** | **binary** |  | [optional] [default to null]
 **pk** | **binary** |  | [optional] [default to null]
 **keyStore** | **binary** |  | [optional] [default to null]

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postAuthorizables



### Example

```bash
 postAuthorizables  authorizableId=value  intermediatePath=value  createUser=value  createGroup=value  rep:password=value  profile/givenName=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **string** |  | [default to null]
 **intermediatePath** | **string** |  | [default to null]
 **createUser** | **string** |  | [optional] [default to null]
 **createGroup** | **string** |  | [optional] [default to null]
 **repPassword** | **string** |  | [optional] [default to null]
 **profileSlashgivenName** | **string** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigAdobeGraniteSamlAuthenticationHandler



### Example

```bash
 postConfigAdobeGraniteSamlAuthenticationHandler  keyStorePassword=value  keyStorePassword@TypeHint=value  service.ranking=value  service.ranking@TypeHint=value  idpHttpRedirect=value  idpHttpRedirect@TypeHint=value  createUser=value  createUser@TypeHint=value  defaultRedirectUrl=value  defaultRedirectUrl@TypeHint=value  userIDAttribute=value  userIDAttribute@TypeHint=value  Specify as:  defaultGroups=value1 defaultGroups=value2 defaultGroups=...  defaultGroups@TypeHint=value  idpCertAlias=value  idpCertAlias@TypeHint=value  addGroupMemberships=value  addGroupMemberships@TypeHint=value  Specify as:  path=value1 path=value2 path=...  path@TypeHint=value  Specify as:  synchronizeAttributes=value1 synchronizeAttributes=value2 synchronizeAttributes=...  synchronizeAttributes@TypeHint=value  clockTolerance=value  clockTolerance@TypeHint=value  groupMembershipAttribute=value  groupMembershipAttribute@TypeHint=value  idpUrl=value  idpUrl@TypeHint=value  logoutUrl=value  logoutUrl@TypeHint=value  serviceProviderEntityId=value  serviceProviderEntityId@TypeHint=value  assertionConsumerServiceURL=value  assertionConsumerServiceURL@TypeHint=value  handleLogout=value  handleLogout@TypeHint=value  spPrivateKeyAlias=value  spPrivateKeyAlias@TypeHint=value  useEncryption=value  useEncryption@TypeHint=value  nameIdFormat=value  nameIdFormat@TypeHint=value  digestMethod=value  digestMethod@TypeHint=value  signatureMethod=value  signatureMethod@TypeHint=value  userIntermediatePath=value  userIntermediatePath@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **string** |  | [optional] [default to null]
 **keyStorePasswordAtTypeHint** | **string** |  | [optional] [default to null]
 **servicePeriodranking** | **integer** |  | [optional] [default to null]
 **servicePeriodrankingAtTypeHint** | **string** |  | [optional] [default to null]
 **idpHttpRedirect** | **boolean** |  | [optional] [default to null]
 **idpHttpRedirectAtTypeHint** | **string** |  | [optional] [default to null]
 **createUser** | **boolean** |  | [optional] [default to null]
 **createUserAtTypeHint** | **string** |  | [optional] [default to null]
 **defaultRedirectUrl** | **string** |  | [optional] [default to null]
 **defaultRedirectUrlAtTypeHint** | **string** |  | [optional] [default to null]
 **userIDAttribute** | **string** |  | [optional] [default to null]
 **userIDAttributeAtTypeHint** | **string** |  | [optional] [default to null]
 **defaultGroups** | [**array[string]**](string.md) |  | [optional] [default to null]
 **defaultGroupsAtTypeHint** | **string** |  | [optional] [default to null]
 **idpCertAlias** | **string** |  | [optional] [default to null]
 **idpCertAliasAtTypeHint** | **string** |  | [optional] [default to null]
 **addGroupMemberships** | **boolean** |  | [optional] [default to null]
 **addGroupMembershipsAtTypeHint** | **string** |  | [optional] [default to null]
 **path** | [**array[string]**](string.md) |  | [optional] [default to null]
 **pathAtTypeHint** | **string** |  | [optional] [default to null]
 **synchronizeAttributes** | [**array[string]**](string.md) |  | [optional] [default to null]
 **synchronizeAttributesAtTypeHint** | **string** |  | [optional] [default to null]
 **clockTolerance** | **integer** |  | [optional] [default to null]
 **clockToleranceAtTypeHint** | **string** |  | [optional] [default to null]
 **groupMembershipAttribute** | **string** |  | [optional] [default to null]
 **groupMembershipAttributeAtTypeHint** | **string** |  | [optional] [default to null]
 **idpUrl** | **string** |  | [optional] [default to null]
 **idpUrlAtTypeHint** | **string** |  | [optional] [default to null]
 **logoutUrl** | **string** |  | [optional] [default to null]
 **logoutUrlAtTypeHint** | **string** |  | [optional] [default to null]
 **serviceProviderEntityId** | **string** |  | [optional] [default to null]
 **serviceProviderEntityIdAtTypeHint** | **string** |  | [optional] [default to null]
 **assertionConsumerServiceURL** | **string** |  | [optional] [default to null]
 **assertionConsumerServiceURLAtTypeHint** | **string** |  | [optional] [default to null]
 **handleLogout** | **boolean** |  | [optional] [default to null]
 **handleLogoutAtTypeHint** | **string** |  | [optional] [default to null]
 **spPrivateKeyAlias** | **string** |  | [optional] [default to null]
 **spPrivateKeyAliasAtTypeHint** | **string** |  | [optional] [default to null]
 **useEncryption** | **boolean** |  | [optional] [default to null]
 **useEncryptionAtTypeHint** | **string** |  | [optional] [default to null]
 **nameIdFormat** | **string** |  | [optional] [default to null]
 **nameIdFormatAtTypeHint** | **string** |  | [optional] [default to null]
 **digestMethod** | **string** |  | [optional] [default to null]
 **digestMethodAtTypeHint** | **string** |  | [optional] [default to null]
 **signatureMethod** | **string** |  | [optional] [default to null]
 **signatureMethodAtTypeHint** | **string** |  | [optional] [default to null]
 **userIntermediatePath** | **string** |  | [optional] [default to null]
 **userIntermediatePathAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigApacheFelixJettyBasedHttpService



### Example

```bash
 postConfigApacheFelixJettyBasedHttpService  org.apache.felix.https.nio=value  org.apache.felix.https.nio@TypeHint=value  org.apache.felix.https.keystore=value  org.apache.felix.https.keystore@TypeHint=value  org.apache.felix.https.keystore.password=value  org.apache.felix.https.keystore.password@TypeHint=value  org.apache.felix.https.keystore.key=value  org.apache.felix.https.keystore.key@TypeHint=value  org.apache.felix.https.keystore.key.password=value  org.apache.felix.https.keystore.key.password@TypeHint=value  org.apache.felix.https.truststore=value  org.apache.felix.https.truststore@TypeHint=value  org.apache.felix.https.truststore.password=value  org.apache.felix.https.truststore.password@TypeHint=value  org.apache.felix.https.clientcertificate=value  org.apache.felix.https.clientcertificate@TypeHint=value  org.apache.felix.https.enable=value  org.apache.felix.https.enable@TypeHint=value  org.osgi.service.http.port.secure=value  org.osgi.service.http.port.secure@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodnio** | **boolean** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodenable** | **boolean** |  | [optional] [default to null]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint** | **string** |  | [optional] [default to null]
 **orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure** | **string** |  | [optional] [default to null]
 **orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigApacheHttpComponentsProxyConfiguration



### Example

```bash
 postConfigApacheHttpComponentsProxyConfiguration  proxy.host=value  proxy.host@TypeHint=value  proxy.port=value  proxy.port@TypeHint=value  Specify as:  proxy.exceptions=value1 proxy.exceptions=value2 proxy.exceptions=...  proxy.exceptions@TypeHint=value  proxy.enabled=value  proxy.enabled@TypeHint=value  proxy.user=value  proxy.user@TypeHint=value  proxy.password=value  proxy.password@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyPeriodhost** | **string** |  | [optional] [default to null]
 **proxyPeriodhostAtTypeHint** | **string** |  | [optional] [default to null]
 **proxyPeriodport** | **integer** |  | [optional] [default to null]
 **proxyPeriodportAtTypeHint** | **string** |  | [optional] [default to null]
 **proxyPeriodexceptions** | [**array[string]**](string.md) |  | [optional] [default to null]
 **proxyPeriodexceptionsAtTypeHint** | **string** |  | [optional] [default to null]
 **proxyPeriodenabled** | **boolean** |  | [optional] [default to null]
 **proxyPeriodenabledAtTypeHint** | **string** |  | [optional] [default to null]
 **proxyPerioduser** | **string** |  | [optional] [default to null]
 **proxyPerioduserAtTypeHint** | **string** |  | [optional] [default to null]
 **proxyPeriodpassword** | **string** |  | [optional] [default to null]
 **proxyPeriodpasswordAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigApacheSlingDavExServlet



### Example

```bash
 postConfigApacheSlingDavExServlet  alias=value  alias@TypeHint=value  dav.create-absolute-uri=value  dav.create-absolute-uri@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **string** |  | [optional] [default to null]
 **aliasAtTypeHint** | **string** |  | [optional] [default to null]
 **davPeriodcreateAbsoluteUri** | **boolean** |  | [optional] [default to null]
 **davPeriodcreateAbsoluteUriAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigApacheSlingGetServlet



### Example

```bash
 postConfigApacheSlingGetServlet  json.maximumresults=value  json.maximumresults@TypeHint=value  enable.html=value  enable.html@TypeHint=value  enable.txt=value  enable.txt@TypeHint=value  enable.xml=value  enable.xml@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonPeriodmaximumresults** | **string** |  | [optional] [default to null]
 **jsonPeriodmaximumresultsAtTypeHint** | **string** |  | [optional] [default to null]
 **enablePeriodhtml** | **boolean** |  | [optional] [default to null]
 **enablePeriodhtmlAtTypeHint** | **string** |  | [optional] [default to null]
 **enablePeriodtxt** | **boolean** |  | [optional] [default to null]
 **enablePeriodtxtAtTypeHint** | **string** |  | [optional] [default to null]
 **enablePeriodxml** | **boolean** |  | [optional] [default to null]
 **enablePeriodxmlAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigApacheSlingReferrerFilter



### Example

```bash
 postConfigApacheSlingReferrerFilter  allow.empty=value  allow.empty@TypeHint=value  allow.hosts=value  allow.hosts@TypeHint=value  allow.hosts.regexp=value  allow.hosts.regexp@TypeHint=value  filter.methods=value  filter.methods@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowPeriodempty** | **boolean** |  | [optional] [default to null]
 **allowPeriodemptyAtTypeHint** | **string** |  | [optional] [default to null]
 **allowPeriodhosts** | **string** |  | [optional] [default to null]
 **allowPeriodhostsAtTypeHint** | **string** |  | [optional] [default to null]
 **allowPeriodhostsPeriodregexp** | **string** |  | [optional] [default to null]
 **allowPeriodhostsPeriodregexpAtTypeHint** | **string** |  | [optional] [default to null]
 **filterPeriodmethods** | **string** |  | [optional] [default to null]
 **filterPeriodmethodsAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigProperty



### Example

```bash
 postConfigProperty configNodeName=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postNode



### Example

```bash
 postNode path=value name=value  :operation=value  deleteAuthorizable=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]
 **operation** | **string** |  | [optional] [default to null]
 **deleteAuthorizable** | **string** |  | [optional] [default to null]
 **file** | **binary** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postNodeRw



### Example

```bash
 postNodeRw path=value name=value  addMembers=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]
 **addMembers** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postPath



### Example

```bash
 postPath path=value  jcr:primaryType=value  :name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **jcrPrimaryType** | **string** |  | [default to null]
 **name** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postQuery



### Example

```bash
 postQuery  path=value  p.limit=value  1_property=value  1_property.value=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  | [default to null]
 **pPeriodlimit** | **integer** |  | [default to null]
 **1Property** | **string** |  | [default to null]
 **1PropertyPeriodvalue** | **string** |  | [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postTreeActivation



### Example

```bash
 postTreeActivation  ignoredeactivated=value  onlymodified=value  path=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **boolean** |  | [default to null]
 **onlymodified** | **boolean** |  | [default to null]
 **path** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postTruststore



### Example

```bash
 postTruststore  :operation=value  newPassword=value  rePassword=value  keyStoreType=value  removeAlias=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **string** |  | [optional] [default to null]
 **newPassword** | **string** |  | [optional] [default to null]
 **rePassword** | **string** |  | [optional] [default to null]
 **keyStoreType** | **string** |  | [optional] [default to null]
 **removeAlias** | **string** |  | [optional] [default to null]
 **certificate** | **binary** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postTruststorePKCS12



### Example

```bash
 postTruststorePKCS12
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststorePeriodp12** | **binary** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

