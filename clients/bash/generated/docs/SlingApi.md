# SlingApi

All URIs are relative to */*

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
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


## **deleteAgent**



### Example
```bash
 deleteAgent runmode=value name=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  |
 **name** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteNode**



### Example
```bash
 deleteNode path=value name=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  |
 **name** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAgent**



### Example
```bash
 getAgent runmode=value name=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  |
 **name** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAgents**



### Example
```bash
 getAgents runmode=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAuthorizableKeystore**



### Example
```bash
 getAuthorizableKeystore intermediatePath=value authorizableId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string** |  |
 **authorizableId** | **string** |  |

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getKeystore**



### Example
```bash
 getKeystore intermediatePath=value authorizableId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string** |  |
 **authorizableId** | **string** |  |

### Return type

**binary**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getNode**



### Example
```bash
 getNode path=value name=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  |
 **name** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getPackage**



### Example
```bash
 getPackage group=value name=value version=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string** |  |
 **name** | **string** |  |
 **version** | **string** |  |

### Return type

**binary**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getPackageFilter**



### Example
```bash
 getPackageFilter group=value name=value version=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string** |  |
 **name** | **string** |  |
 **version** | **string** |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getQuery**



### Example
```bash
 getQuery  path=value  p.limit=value  1_property=value  1_property.value=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  |
 **pPeriodlimit** | **integer** |  |
 **1Property** | **string** |  |
 **1PropertyPeriodvalue** | **string** |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getTruststore**



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

## **getTruststoreInfo**



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

## **postAgent**



### Example
```bash
 postAgent runmode=value name=value  jcr:content/cq:distribute=value  jcr:content/cq:distribute@TypeHint=value  jcr:content/cq:name=value  jcr:content/cq:template=value  jcr:content/enabled=value  jcr:content/jcr:description=value  jcr:content/jcr:lastModified=value  jcr:content/jcr:lastModifiedBy=value  jcr:content/jcr:mixinTypes=value  jcr:content/jcr:title=value  jcr:content/logLevel=value  jcr:content/noStatusUpdate=value  jcr:content/noVersioning=value  jcr:content/protocolConnectTimeout=value  jcr:content/protocolHTTPConnectionClosed=value  jcr:content/protocolHTTPExpired=value  Specify as:  jcr:content/protocolHTTPHeaders=value1 jcr:content/protocolHTTPHeaders=value2 jcr:content/protocolHTTPHeaders=...  jcr:content/protocolHTTPHeaders@TypeHint=value  jcr:content/protocolHTTPMethod=value  jcr:content/protocolHTTPSRelaxed=value  jcr:content/protocolInterface=value  jcr:content/protocolSocketTimeout=value  jcr:content/protocolVersion=value  jcr:content/proxyNTLMDomain=value  jcr:content/proxyNTLMHost=value  jcr:content/proxyHost=value  jcr:content/proxyPassword=value  jcr:content/proxyPort=value  jcr:content/proxyUser=value  jcr:content/queueBatchMaxSize=value  jcr:content/queueBatchMode=value  jcr:content/queueBatchWaitTime=value  jcr:content/retryDelay=value  jcr:content/reverseReplication=value  jcr:content/serializationType=value  jcr:content/sling:resourceType=value  jcr:content/ssl=value  jcr:content/transportNTLMDomain=value  jcr:content/transportNTLMHost=value  jcr:content/transportPassword=value  jcr:content/transportUri=value  jcr:content/transportUser=value  jcr:content/triggerDistribute=value  jcr:content/triggerModified=value  jcr:content/triggerOnOffTime=value  jcr:content/triggerReceive=value  jcr:content/triggerSpecific=value  jcr:content/userId=value  jcr:primaryType=value  :operation=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string** |  |
 **name** | **string** |  |
 **jcrContentSlashcqDistribute** | **boolean** |  | [optional]
 **jcrContentSlashcqDistributeAtTypeHint** | **string** |  | [optional]
 **jcrContentSlashcqName** | **string** |  | [optional]
 **jcrContentSlashcqTemplate** | **string** |  | [optional]
 **jcrContentSlashenabled** | **boolean** |  | [optional]
 **jcrContentSlashjcrDescription** | **string** |  | [optional]
 **jcrContentSlashjcrLastModified** | **string** |  | [optional]
 **jcrContentSlashjcrLastModifiedBy** | **string** |  | [optional]
 **jcrContentSlashjcrMixinTypes** | **string** |  | [optional]
 **jcrContentSlashjcrTitle** | **string** |  | [optional]
 **jcrContentSlashlogLevel** | **string** |  | [optional]
 **jcrContentSlashnoStatusUpdate** | **boolean** |  | [optional]
 **jcrContentSlashnoVersioning** | **boolean** |  | [optional]
 **jcrContentSlashprotocolConnectTimeout** | **integer** |  | [optional]
 **jcrContentSlashprotocolHTTPConnectionClosed** | **boolean** |  | [optional]
 **jcrContentSlashprotocolHTTPExpired** | **string** |  | [optional]
 **jcrContentSlashprotocolHTTPHeaders** | [**array[string]**](string.md) |  | [optional]
 **jcrContentSlashprotocolHTTPHeadersAtTypeHint** | **string** |  | [optional]
 **jcrContentSlashprotocolHTTPMethod** | **string** |  | [optional]
 **jcrContentSlashprotocolHTTPSRelaxed** | **boolean** |  | [optional]
 **jcrContentSlashprotocolInterface** | **string** |  | [optional]
 **jcrContentSlashprotocolSocketTimeout** | **integer** |  | [optional]
 **jcrContentSlashprotocolVersion** | **string** |  | [optional]
 **jcrContentSlashproxyNTLMDomain** | **string** |  | [optional]
 **jcrContentSlashproxyNTLMHost** | **string** |  | [optional]
 **jcrContentSlashproxyHost** | **string** |  | [optional]
 **jcrContentSlashproxyPassword** | **string** |  | [optional]
 **jcrContentSlashproxyPort** | **integer** |  | [optional]
 **jcrContentSlashproxyUser** | **string** |  | [optional]
 **jcrContentSlashqueueBatchMaxSize** | **integer** |  | [optional]
 **jcrContentSlashqueueBatchMode** | **string** |  | [optional]
 **jcrContentSlashqueueBatchWaitTime** | **integer** |  | [optional]
 **jcrContentSlashretryDelay** | **string** |  | [optional]
 **jcrContentSlashreverseReplication** | **boolean** |  | [optional]
 **jcrContentSlashserializationType** | **string** |  | [optional]
 **jcrContentSlashslingResourceType** | **string** |  | [optional]
 **jcrContentSlashssl** | **string** |  | [optional]
 **jcrContentSlashtransportNTLMDomain** | **string** |  | [optional]
 **jcrContentSlashtransportNTLMHost** | **string** |  | [optional]
 **jcrContentSlashtransportPassword** | **string** |  | [optional]
 **jcrContentSlashtransportUri** | **string** |  | [optional]
 **jcrContentSlashtransportUser** | **string** |  | [optional]
 **jcrContentSlashtriggerDistribute** | **boolean** |  | [optional]
 **jcrContentSlashtriggerModified** | **boolean** |  | [optional]
 **jcrContentSlashtriggerOnOffTime** | **boolean** |  | [optional]
 **jcrContentSlashtriggerReceive** | **boolean** |  | [optional]
 **jcrContentSlashtriggerSpecific** | **boolean** |  | [optional]
 **jcrContentSlashuserId** | **string** |  | [optional]
 **jcrPrimaryType** | **string** |  | [optional]
 **operation** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postAuthorizableKeystore**



### Example
```bash
 postAuthorizableKeystore intermediatePath=value authorizableId=value  :operation=value  currentPassword=value  newPassword=value  rePassword=value  keyPassword=value  keyStorePass=value  alias=value  newAlias=value  removeAlias=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string** |  |
 **authorizableId** | **string** |  |
 **operation** | **string** |  | [optional]
 **currentPassword** | **string** |  | [optional]
 **newPassword** | **string** |  | [optional]
 **rePassword** | **string** |  | [optional]
 **keyPassword** | **string** |  | [optional]
 **keyStorePass** | **string** |  | [optional]
 **alias** | **string** |  | [optional]
 **newAlias** | **string** |  | [optional]
 **removeAlias** | **string** |  | [optional]
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

## **postAuthorizables**



### Example
```bash
 postAuthorizables  authorizableId=value  intermediatePath=value  createUser=value  createGroup=value  rep:password=value  profile/givenName=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **string** |  |
 **intermediatePath** | **string** |  |
 **createUser** | **string** |  | [optional]
 **createGroup** | **string** |  | [optional]
 **repPassword** | **string** |  | [optional]
 **profileSlashgivenName** | **string** |  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postConfigAdobeGraniteSamlAuthenticationHandler**



### Example
```bash
 postConfigAdobeGraniteSamlAuthenticationHandler  keyStorePassword=value  keyStorePassword@TypeHint=value  service.ranking=value  service.ranking@TypeHint=value  idpHttpRedirect=value  idpHttpRedirect@TypeHint=value  createUser=value  createUser@TypeHint=value  defaultRedirectUrl=value  defaultRedirectUrl@TypeHint=value  userIDAttribute=value  userIDAttribute@TypeHint=value  Specify as:  defaultGroups=value1 defaultGroups=value2 defaultGroups=...  defaultGroups@TypeHint=value  idpCertAlias=value  idpCertAlias@TypeHint=value  addGroupMemberships=value  addGroupMemberships@TypeHint=value  Specify as:  path=value1 path=value2 path=...  path@TypeHint=value  Specify as:  synchronizeAttributes=value1 synchronizeAttributes=value2 synchronizeAttributes=...  synchronizeAttributes@TypeHint=value  clockTolerance=value  clockTolerance@TypeHint=value  groupMembershipAttribute=value  groupMembershipAttribute@TypeHint=value  idpUrl=value  idpUrl@TypeHint=value  logoutUrl=value  logoutUrl@TypeHint=value  serviceProviderEntityId=value  serviceProviderEntityId@TypeHint=value  assertionConsumerServiceURL=value  assertionConsumerServiceURL@TypeHint=value  handleLogout=value  handleLogout@TypeHint=value  spPrivateKeyAlias=value  spPrivateKeyAlias@TypeHint=value  useEncryption=value  useEncryption@TypeHint=value  nameIdFormat=value  nameIdFormat@TypeHint=value  digestMethod=value  digestMethod@TypeHint=value  signatureMethod=value  signatureMethod@TypeHint=value  userIntermediatePath=value  userIntermediatePath@TypeHint=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **string** |  | [optional]
 **keyStorePasswordAtTypeHint** | **string** |  | [optional]
 **servicePeriodranking** | **integer** |  | [optional]
 **servicePeriodrankingAtTypeHint** | **string** |  | [optional]
 **idpHttpRedirect** | **boolean** |  | [optional]
 **idpHttpRedirectAtTypeHint** | **string** |  | [optional]
 **createUser** | **boolean** |  | [optional]
 **createUserAtTypeHint** | **string** |  | [optional]
 **defaultRedirectUrl** | **string** |  | [optional]
 **defaultRedirectUrlAtTypeHint** | **string** |  | [optional]
 **userIDAttribute** | **string** |  | [optional]
 **userIDAttributeAtTypeHint** | **string** |  | [optional]
 **defaultGroups** | [**array[string]**](string.md) |  | [optional]
 **defaultGroupsAtTypeHint** | **string** |  | [optional]
 **idpCertAlias** | **string** |  | [optional]
 **idpCertAliasAtTypeHint** | **string** |  | [optional]
 **addGroupMemberships** | **boolean** |  | [optional]
 **addGroupMembershipsAtTypeHint** | **string** |  | [optional]
 **path** | [**array[string]**](string.md) |  | [optional]
 **pathAtTypeHint** | **string** |  | [optional]
 **synchronizeAttributes** | [**array[string]**](string.md) |  | [optional]
 **synchronizeAttributesAtTypeHint** | **string** |  | [optional]
 **clockTolerance** | **integer** |  | [optional]
 **clockToleranceAtTypeHint** | **string** |  | [optional]
 **groupMembershipAttribute** | **string** |  | [optional]
 **groupMembershipAttributeAtTypeHint** | **string** |  | [optional]
 **idpUrl** | **string** |  | [optional]
 **idpUrlAtTypeHint** | **string** |  | [optional]
 **logoutUrl** | **string** |  | [optional]
 **logoutUrlAtTypeHint** | **string** |  | [optional]
 **serviceProviderEntityId** | **string** |  | [optional]
 **serviceProviderEntityIdAtTypeHint** | **string** |  | [optional]
 **assertionConsumerServiceURL** | **string** |  | [optional]
 **assertionConsumerServiceURLAtTypeHint** | **string** |  | [optional]
 **handleLogout** | **boolean** |  | [optional]
 **handleLogoutAtTypeHint** | **string** |  | [optional]
 **spPrivateKeyAlias** | **string** |  | [optional]
 **spPrivateKeyAliasAtTypeHint** | **string** |  | [optional]
 **useEncryption** | **boolean** |  | [optional]
 **useEncryptionAtTypeHint** | **string** |  | [optional]
 **nameIdFormat** | **string** |  | [optional]
 **nameIdFormatAtTypeHint** | **string** |  | [optional]
 **digestMethod** | **string** |  | [optional]
 **digestMethodAtTypeHint** | **string** |  | [optional]
 **signatureMethod** | **string** |  | [optional]
 **signatureMethodAtTypeHint** | **string** |  | [optional]
 **userIntermediatePath** | **string** |  | [optional]
 **userIntermediatePathAtTypeHint** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postConfigApacheFelixJettyBasedHttpService**



### Example
```bash
 postConfigApacheFelixJettyBasedHttpService  org.apache.felix.https.nio=value  org.apache.felix.https.nio@TypeHint=value  org.apache.felix.https.keystore=value  org.apache.felix.https.keystore@TypeHint=value  org.apache.felix.https.keystore.password=value  org.apache.felix.https.keystore.password@TypeHint=value  org.apache.felix.https.keystore.key=value  org.apache.felix.https.keystore.key@TypeHint=value  org.apache.felix.https.keystore.key.password=value  org.apache.felix.https.keystore.key.password@TypeHint=value  org.apache.felix.https.truststore=value  org.apache.felix.https.truststore@TypeHint=value  org.apache.felix.https.truststore.password=value  org.apache.felix.https.truststore.password@TypeHint=value  org.apache.felix.https.clientcertificate=value  org.apache.felix.https.clientcertificate@TypeHint=value  org.apache.felix.https.enable=value  org.apache.felix.https.enable@TypeHint=value  org.osgi.service.http.port.secure=value  org.osgi.service.http.port.secure@TypeHint=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodnio** | **boolean** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint** | **string** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodenable** | **boolean** |  | [optional]
 **orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint** | **string** |  | [optional]
 **orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure** | **string** |  | [optional]
 **orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postConfigApacheHttpComponentsProxyConfiguration**



### Example
```bash
 postConfigApacheHttpComponentsProxyConfiguration  proxy.host=value  proxy.host@TypeHint=value  proxy.port=value  proxy.port@TypeHint=value  Specify as:  proxy.exceptions=value1 proxy.exceptions=value2 proxy.exceptions=...  proxy.exceptions@TypeHint=value  proxy.enabled=value  proxy.enabled@TypeHint=value  proxy.user=value  proxy.user@TypeHint=value  proxy.password=value  proxy.password@TypeHint=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyPeriodhost** | **string** |  | [optional]
 **proxyPeriodhostAtTypeHint** | **string** |  | [optional]
 **proxyPeriodport** | **integer** |  | [optional]
 **proxyPeriodportAtTypeHint** | **string** |  | [optional]
 **proxyPeriodexceptions** | [**array[string]**](string.md) |  | [optional]
 **proxyPeriodexceptionsAtTypeHint** | **string** |  | [optional]
 **proxyPeriodenabled** | **boolean** |  | [optional]
 **proxyPeriodenabledAtTypeHint** | **string** |  | [optional]
 **proxyPerioduser** | **string** |  | [optional]
 **proxyPerioduserAtTypeHint** | **string** |  | [optional]
 **proxyPeriodpassword** | **string** |  | [optional]
 **proxyPeriodpasswordAtTypeHint** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postConfigApacheSlingDavExServlet**



### Example
```bash
 postConfigApacheSlingDavExServlet  alias=value  alias@TypeHint=value  dav.create-absolute-uri=value  dav.create-absolute-uri@TypeHint=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **string** |  | [optional]
 **aliasAtTypeHint** | **string** |  | [optional]
 **davPeriodcreateAbsoluteUri** | **boolean** |  | [optional]
 **davPeriodcreateAbsoluteUriAtTypeHint** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postConfigApacheSlingGetServlet**



### Example
```bash
 postConfigApacheSlingGetServlet  json.maximumresults=value  json.maximumresults@TypeHint=value  enable.html=value  enable.html@TypeHint=value  enable.txt=value  enable.txt@TypeHint=value  enable.xml=value  enable.xml@TypeHint=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonPeriodmaximumresults** | **string** |  | [optional]
 **jsonPeriodmaximumresultsAtTypeHint** | **string** |  | [optional]
 **enablePeriodhtml** | **boolean** |  | [optional]
 **enablePeriodhtmlAtTypeHint** | **string** |  | [optional]
 **enablePeriodtxt** | **boolean** |  | [optional]
 **enablePeriodtxtAtTypeHint** | **string** |  | [optional]
 **enablePeriodxml** | **boolean** |  | [optional]
 **enablePeriodxmlAtTypeHint** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postConfigApacheSlingReferrerFilter**



### Example
```bash
 postConfigApacheSlingReferrerFilter  allow.empty=value  allow.empty@TypeHint=value  allow.hosts=value  allow.hosts@TypeHint=value  allow.hosts.regexp=value  allow.hosts.regexp@TypeHint=value  filter.methods=value  filter.methods@TypeHint=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowPeriodempty** | **boolean** |  | [optional]
 **allowPeriodemptyAtTypeHint** | **string** |  | [optional]
 **allowPeriodhosts** | **string** |  | [optional]
 **allowPeriodhostsAtTypeHint** | **string** |  | [optional]
 **allowPeriodhostsPeriodregexp** | **string** |  | [optional]
 **allowPeriodhostsPeriodregexpAtTypeHint** | **string** |  | [optional]
 **filterPeriodmethods** | **string** |  | [optional]
 **filterPeriodmethodsAtTypeHint** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postNode**



### Example
```bash
 postNode path=value name=value  :operation=value  deleteAuthorizable=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  |
 **name** | **string** |  |
 **operation** | **string** |  | [optional]
 **deleteAuthorizable** | **string** |  | [optional]
 **file** | **binary** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postNodeRw**



### Example
```bash
 postNodeRw path=value name=value  addMembers=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  |
 **name** | **string** |  |
 **addMembers** | **string** |  | [optional]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postPath**



### Example
```bash
 postPath path=value  jcr:primaryType=value  :name=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  |
 **jcrPrimaryType** | **string** |  |
 **name** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postQuery**



### Example
```bash
 postQuery  path=value  p.limit=value  1_property=value  1_property.value=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string** |  |
 **pPeriodlimit** | **integer** |  |
 **1Property** | **string** |  |
 **1PropertyPeriodvalue** | **string** |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postTreeActivation**



### Example
```bash
 postTreeActivation  ignoredeactivated=value  onlymodified=value  path=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **boolean** |  |
 **onlymodified** | **boolean** |  |
 **path** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postTruststore**



### Example
```bash
 postTruststore  :operation=value  newPassword=value  rePassword=value  keyStoreType=value  removeAlias=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **string** |  | [optional]
 **newPassword** | **string** |  | [optional]
 **rePassword** | **string** |  | [optional]
 **keyStoreType** | **string** |  | [optional]
 **removeAlias** | **string** |  | [optional]
 **certificate** | **binary** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postTruststorePKCS12**



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

