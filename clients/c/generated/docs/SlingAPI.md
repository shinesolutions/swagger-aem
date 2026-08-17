# SlingAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SlingAPI_deleteAgent**](SlingAPI.md#SlingAPI_deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**SlingAPI_deleteNode**](SlingAPI.md#SlingAPI_deleteNode) | **DELETE** /{path}/{name} | 
[**SlingAPI_getAgent**](SlingAPI.md#SlingAPI_getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**SlingAPI_getAgents**](SlingAPI.md#SlingAPI_getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**SlingAPI_getAuthorizableKeystore**](SlingAPI.md#SlingAPI_getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**SlingAPI_getKeystore**](SlingAPI.md#SlingAPI_getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**SlingAPI_getNode**](SlingAPI.md#SlingAPI_getNode) | **GET** /{path}/{name} | 
[**SlingAPI_getPackage**](SlingAPI.md#SlingAPI_getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**SlingAPI_getPackageFilter**](SlingAPI.md#SlingAPI_getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**SlingAPI_getQuery**](SlingAPI.md#SlingAPI_getQuery) | **GET** /bin/querybuilder.json | 
[**SlingAPI_getTruststore**](SlingAPI.md#SlingAPI_getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**SlingAPI_getTruststoreInfo**](SlingAPI.md#SlingAPI_getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**SlingAPI_postAgent**](SlingAPI.md#SlingAPI_postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**SlingAPI_postAuthorizableKeystore**](SlingAPI.md#SlingAPI_postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**SlingAPI_postAuthorizables**](SlingAPI.md#SlingAPI_postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**SlingAPI_postConfigAdobeGraniteSamlAuthenticationHandler**](SlingAPI.md#SlingAPI_postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**SlingAPI_postConfigApacheFelixJettyBasedHttpService**](SlingAPI.md#SlingAPI_postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**SlingAPI_postConfigApacheHttpComponentsProxyConfiguration**](SlingAPI.md#SlingAPI_postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**SlingAPI_postConfigApacheSlingDavExServlet**](SlingAPI.md#SlingAPI_postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**SlingAPI_postConfigApacheSlingGetServlet**](SlingAPI.md#SlingAPI_postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**SlingAPI_postConfigApacheSlingReferrerFilter**](SlingAPI.md#SlingAPI_postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**SlingAPI_postConfigProperty**](SlingAPI.md#SlingAPI_postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**SlingAPI_postNode**](SlingAPI.md#SlingAPI_postNode) | **POST** /{path}/{name} | 
[**SlingAPI_postNodeRw**](SlingAPI.md#SlingAPI_postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**SlingAPI_postPath**](SlingAPI.md#SlingAPI_postPath) | **POST** /{path}/ | 
[**SlingAPI_postQuery**](SlingAPI.md#SlingAPI_postQuery) | **POST** /bin/querybuilder.json | 
[**SlingAPI_postTreeActivation**](SlingAPI.md#SlingAPI_postTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**SlingAPI_postTruststore**](SlingAPI.md#SlingAPI_postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**SlingAPI_postTruststorePKCS12**](SlingAPI.md#SlingAPI_postTruststorePKCS12) | **POST** /etc/truststore | 


# **SlingAPI_deleteAgent**
```c
void SlingAPI_deleteAgent(apiClient_t *apiClient, char *runmode, char *name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**runmode** | **char \*** |  | 
**name** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_deleteNode**
```c
void SlingAPI_deleteNode(apiClient_t *apiClient, char *path, char *name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**name** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getAgent**
```c
void SlingAPI_getAgent(apiClient_t *apiClient, char *runmode, char *name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**runmode** | **char \*** |  | 
**name** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getAgents**
```c
char* SlingAPI_getAgents(apiClient_t *apiClient, char *runmode);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**runmode** | **char \*** |  | 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getAuthorizableKeystore**
```c
keystore_info_t* SlingAPI_getAuthorizableKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**intermediatePath** | **char \*** |  | 
**authorizableId** | **char \*** |  | 

### Return type

[keystore_info_t](keystore_info.md) *


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getKeystore**
```c
binary_t** SlingAPI_getKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**intermediatePath** | **char \*** |  | 
**authorizableId** | **char \*** |  | 

### Return type

binary_t**



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getNode**
```c
void SlingAPI_getNode(apiClient_t *apiClient, char *path, char *name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**name** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getPackage**
```c
binary_t** SlingAPI_getPackage(apiClient_t *apiClient, char *group, char *name, char *version);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**group** | **char \*** |  | 
**name** | **char \*** |  | 
**version** | **char \*** |  | 

### Return type

binary_t**



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getPackageFilter**
```c
char* SlingAPI_getPackageFilter(apiClient_t *apiClient, char *group, char *name, char *version);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**group** | **char \*** |  | 
**name** | **char \*** |  | 
**version** | **char \*** |  | 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getQuery**
```c
char* SlingAPI_getQuery(apiClient_t *apiClient, char *path, double p.limit, char *_1_property, char *_1_property.value);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**p.limit** | **double** |  | 
**_1_property** | **char \*** |  | 
**_1_property.value** | **char \*** |  | 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getTruststore**
```c
binary_t** SlingAPI_getTruststore(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

binary_t**



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_getTruststoreInfo**
```c
truststore_info_t* SlingAPI_getTruststoreInfo(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[truststore_info_t](truststore_info.md) *


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postAgent**
```c
void SlingAPI_postAgent(apiClient_t *apiClient, char *runmode, char *name, int *jcr:content/cq:distribute, char *jcr:content/cq:distribute@TypeHint, char *jcr:content/cq:name, char *jcr:content/cq:template, int *jcr:content/aliasUpdate, int *jcr:content/enabled, char *jcr:content/jcr:description, char *jcr:content/jcr:lastModified, char *jcr:content/jcr:lastModifiedBy, char *jcr:content/jcr:mixinTypes, char *jcr:content/jcr:title, char *jcr:content/logLevel, int *jcr:content/noStatusUpdate, int *jcr:content/noVersioning, double jcr:content/protocolConnectTimeout, int *jcr:content/protocolHTTPConnectionClosed, char *jcr:content/protocolHTTPExpired, list_t *jcr:content/protocolHTTPHeaders, char *jcr:content/protocolHTTPHeaders@TypeHint, char *jcr:content/protocolHTTPMethod, int *jcr:content/protocolHTTPSRelaxed, char *jcr:content/protocolInterface, double jcr:content/protocolSocketTimeout, char *jcr:content/protocolVersion, char *jcr:content/proxyNTLMDomain, char *jcr:content/proxyNTLMHost, char *jcr:content/proxyHost, char *jcr:content/proxyPassword, double jcr:content/proxyPort, char *jcr:content/proxyUser, double jcr:content/queueBatchMaxSize, char *jcr:content/queueBatchMode, double jcr:content/queueBatchWaitTime, char *jcr:content/retryDelay, int *jcr:content/reverseReplication, char *jcr:content/serializationType, char *jcr:content/sling:resourceType, char *jcr:content/ssl, char *jcr:content/transportNTLMDomain, char *jcr:content/transportNTLMHost, char *jcr:content/transportPassword, char *jcr:content/transportUri, char *jcr:content/transportUser, int *jcr:content/triggerDistribute, int *jcr:content/triggerModified, int *jcr:content/triggerOnOffTime, int *jcr:content/triggerReceive, int *jcr:content/triggerSpecific, char *jcr:content/userId, char *jcr:primaryType, char *:operation);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**runmode** | **char \*** |  | 
**name** | **char \*** |  | 
**jcr:content/cq:distribute** | **int \*** |  | [optional] 
**jcr:content/cq:distribute@TypeHint** | **char \*** |  | [optional] 
**jcr:content/cq:name** | **char \*** |  | [optional] 
**jcr:content/cq:template** | **char \*** |  | [optional] 
**jcr:content/aliasUpdate** | **int \*** |  | [optional] 
**jcr:content/enabled** | **int \*** |  | [optional] 
**jcr:content/jcr:description** | **char \*** |  | [optional] 
**jcr:content/jcr:lastModified** | **char \*** |  | [optional] 
**jcr:content/jcr:lastModifiedBy** | **char \*** |  | [optional] 
**jcr:content/jcr:mixinTypes** | **char \*** |  | [optional] 
**jcr:content/jcr:title** | **char \*** |  | [optional] 
**jcr:content/logLevel** | **char \*** |  | [optional] 
**jcr:content/noStatusUpdate** | **int \*** |  | [optional] 
**jcr:content/noVersioning** | **int \*** |  | [optional] 
**jcr:content/protocolConnectTimeout** | **double** |  | [optional] 
**jcr:content/protocolHTTPConnectionClosed** | **int \*** |  | [optional] 
**jcr:content/protocolHTTPExpired** | **char \*** |  | [optional] 
**jcr:content/protocolHTTPHeaders** | **[list_t](char.md) \*** |  | [optional] 
**jcr:content/protocolHTTPHeaders@TypeHint** | **char \*** |  | [optional] 
**jcr:content/protocolHTTPMethod** | **char \*** |  | [optional] 
**jcr:content/protocolHTTPSRelaxed** | **int \*** |  | [optional] 
**jcr:content/protocolInterface** | **char \*** |  | [optional] 
**jcr:content/protocolSocketTimeout** | **double** |  | [optional] 
**jcr:content/protocolVersion** | **char \*** |  | [optional] 
**jcr:content/proxyNTLMDomain** | **char \*** |  | [optional] 
**jcr:content/proxyNTLMHost** | **char \*** |  | [optional] 
**jcr:content/proxyHost** | **char \*** |  | [optional] 
**jcr:content/proxyPassword** | **char \*** |  | [optional] 
**jcr:content/proxyPort** | **double** |  | [optional] 
**jcr:content/proxyUser** | **char \*** |  | [optional] 
**jcr:content/queueBatchMaxSize** | **double** |  | [optional] 
**jcr:content/queueBatchMode** | **char \*** |  | [optional] 
**jcr:content/queueBatchWaitTime** | **double** |  | [optional] 
**jcr:content/retryDelay** | **char \*** |  | [optional] 
**jcr:content/reverseReplication** | **int \*** |  | [optional] 
**jcr:content/serializationType** | **char \*** |  | [optional] 
**jcr:content/sling:resourceType** | **char \*** |  | [optional] 
**jcr:content/ssl** | **char \*** |  | [optional] 
**jcr:content/transportNTLMDomain** | **char \*** |  | [optional] 
**jcr:content/transportNTLMHost** | **char \*** |  | [optional] 
**jcr:content/transportPassword** | **char \*** |  | [optional] 
**jcr:content/transportUri** | **char \*** |  | [optional] 
**jcr:content/transportUser** | **char \*** |  | [optional] 
**jcr:content/triggerDistribute** | **int \*** |  | [optional] 
**jcr:content/triggerModified** | **int \*** |  | [optional] 
**jcr:content/triggerOnOffTime** | **int \*** |  | [optional] 
**jcr:content/triggerReceive** | **int \*** |  | [optional] 
**jcr:content/triggerSpecific** | **int \*** |  | [optional] 
**jcr:content/userId** | **char \*** |  | [optional] 
**jcr:primaryType** | **char \*** |  | [optional] 
**:operation** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postAuthorizableKeystore**
```c
keystore_info_t* SlingAPI_postAuthorizableKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId, char *:operation, char *currentPassword, char *newPassword, char *rePassword, char *keyPassword, char *keyStorePass, char *alias, char *newAlias, char *removeAlias, binary_t* cert_chain, binary_t* pk, binary_t* keyStore);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**intermediatePath** | **char \*** |  | 
**authorizableId** | **char \*** |  | 
**:operation** | **char \*** |  | [optional] 
**currentPassword** | **char \*** |  | [optional] 
**newPassword** | **char \*** |  | [optional] 
**rePassword** | **char \*** |  | [optional] 
**keyPassword** | **char \*** |  | [optional] 
**keyStorePass** | **char \*** |  | [optional] 
**alias** | **char \*** |  | [optional] 
**newAlias** | **char \*** |  | [optional] 
**removeAlias** | **char \*** |  | [optional] 
**cert_chain** | **binary_t*** |  | [optional] 
**pk** | **binary_t*** |  | [optional] 
**keyStore** | **binary_t*** |  | [optional] 

### Return type

[keystore_info_t](keystore_info.md) *


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postAuthorizables**
```c
char* SlingAPI_postAuthorizables(apiClient_t *apiClient, char *authorizableId, char *intermediatePath, char *createUser, char *createGroup, char *rep:password, char *profile/givenName);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**authorizableId** | **char \*** |  | 
**intermediatePath** | **char \*** |  | 
**createUser** | **char \*** |  | [optional] 
**createGroup** | **char \*** |  | [optional] 
**rep:password** | **char \*** |  | [optional] 
**profile/givenName** | **char \*** |  | [optional] 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postConfigAdobeGraniteSamlAuthenticationHandler**
```c
void SlingAPI_postConfigAdobeGraniteSamlAuthenticationHandler(apiClient_t *apiClient, char *keyStorePassword, char *keyStorePassword@TypeHint, int *service.ranking, char *service.ranking@TypeHint, int *idpHttpRedirect, char *idpHttpRedirect@TypeHint, int *createUser, char *createUser@TypeHint, char *defaultRedirectUrl, char *defaultRedirectUrl@TypeHint, char *userIDAttribute, char *userIDAttribute@TypeHint, list_t *defaultGroups, char *defaultGroups@TypeHint, char *idpCertAlias, char *idpCertAlias@TypeHint, int *addGroupMemberships, char *addGroupMemberships@TypeHint, list_t *path, char *path@TypeHint, list_t *synchronizeAttributes, char *synchronizeAttributes@TypeHint, int *clockTolerance, char *clockTolerance@TypeHint, char *groupMembershipAttribute, char *groupMembershipAttribute@TypeHint, char *idpUrl, char *idpUrl@TypeHint, char *logoutUrl, char *logoutUrl@TypeHint, char *serviceProviderEntityId, char *serviceProviderEntityId@TypeHint, char *assertionConsumerServiceURL, char *assertionConsumerServiceURL@TypeHint, int *handleLogout, char *handleLogout@TypeHint, char *spPrivateKeyAlias, char *spPrivateKeyAlias@TypeHint, int *useEncryption, char *useEncryption@TypeHint, char *nameIdFormat, char *nameIdFormat@TypeHint, char *digestMethod, char *digestMethod@TypeHint, char *signatureMethod, char *signatureMethod@TypeHint, char *userIntermediatePath, char *userIntermediatePath@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**keyStorePassword** | **char \*** |  | [optional] 
**keyStorePassword@TypeHint** | **char \*** |  | [optional] 
**service.ranking** | **int \*** |  | [optional] 
**service.ranking@TypeHint** | **char \*** |  | [optional] 
**idpHttpRedirect** | **int \*** |  | [optional] 
**idpHttpRedirect@TypeHint** | **char \*** |  | [optional] 
**createUser** | **int \*** |  | [optional] 
**createUser@TypeHint** | **char \*** |  | [optional] 
**defaultRedirectUrl** | **char \*** |  | [optional] 
**defaultRedirectUrl@TypeHint** | **char \*** |  | [optional] 
**userIDAttribute** | **char \*** |  | [optional] 
**userIDAttribute@TypeHint** | **char \*** |  | [optional] 
**defaultGroups** | **[list_t](char.md) \*** |  | [optional] 
**defaultGroups@TypeHint** | **char \*** |  | [optional] 
**idpCertAlias** | **char \*** |  | [optional] 
**idpCertAlias@TypeHint** | **char \*** |  | [optional] 
**addGroupMemberships** | **int \*** |  | [optional] 
**addGroupMemberships@TypeHint** | **char \*** |  | [optional] 
**path** | **[list_t](char.md) \*** |  | [optional] 
**path@TypeHint** | **char \*** |  | [optional] 
**synchronizeAttributes** | **[list_t](char.md) \*** |  | [optional] 
**synchronizeAttributes@TypeHint** | **char \*** |  | [optional] 
**clockTolerance** | **int \*** |  | [optional] 
**clockTolerance@TypeHint** | **char \*** |  | [optional] 
**groupMembershipAttribute** | **char \*** |  | [optional] 
**groupMembershipAttribute@TypeHint** | **char \*** |  | [optional] 
**idpUrl** | **char \*** |  | [optional] 
**idpUrl@TypeHint** | **char \*** |  | [optional] 
**logoutUrl** | **char \*** |  | [optional] 
**logoutUrl@TypeHint** | **char \*** |  | [optional] 
**serviceProviderEntityId** | **char \*** |  | [optional] 
**serviceProviderEntityId@TypeHint** | **char \*** |  | [optional] 
**assertionConsumerServiceURL** | **char \*** |  | [optional] 
**assertionConsumerServiceURL@TypeHint** | **char \*** |  | [optional] 
**handleLogout** | **int \*** |  | [optional] 
**handleLogout@TypeHint** | **char \*** |  | [optional] 
**spPrivateKeyAlias** | **char \*** |  | [optional] 
**spPrivateKeyAlias@TypeHint** | **char \*** |  | [optional] 
**useEncryption** | **int \*** |  | [optional] 
**useEncryption@TypeHint** | **char \*** |  | [optional] 
**nameIdFormat** | **char \*** |  | [optional] 
**nameIdFormat@TypeHint** | **char \*** |  | [optional] 
**digestMethod** | **char \*** |  | [optional] 
**digestMethod@TypeHint** | **char \*** |  | [optional] 
**signatureMethod** | **char \*** |  | [optional] 
**signatureMethod@TypeHint** | **char \*** |  | [optional] 
**userIntermediatePath** | **char \*** |  | [optional] 
**userIntermediatePath@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postConfigApacheFelixJettyBasedHttpService**
```c
void SlingAPI_postConfigApacheFelixJettyBasedHttpService(apiClient_t *apiClient, int *org.apache.felix.https.nio, char *org.apache.felix.https.nio@TypeHint, char *org.apache.felix.https.keystore, char *org.apache.felix.https.keystore@TypeHint, char *org.apache.felix.https.keystore.password, char *org.apache.felix.https.keystore.password@TypeHint, char *org.apache.felix.https.keystore.key, char *org.apache.felix.https.keystore.key@TypeHint, char *org.apache.felix.https.keystore.key.password, char *org.apache.felix.https.keystore.key.password@TypeHint, char *org.apache.felix.https.truststore, char *org.apache.felix.https.truststore@TypeHint, char *org.apache.felix.https.truststore.password, char *org.apache.felix.https.truststore.password@TypeHint, char *org.apache.felix.https.clientcertificate, char *org.apache.felix.https.clientcertificate@TypeHint, int *org.apache.felix.https.enable, char *org.apache.felix.https.enable@TypeHint, char *org.osgi.service.http.port.secure, char *org.osgi.service.http.port.secure@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**org.apache.felix.https.nio** | **int \*** |  | [optional] 
**org.apache.felix.https.nio@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore.password** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore.password@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore.key** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore.key@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore.key.password** | **char \*** |  | [optional] 
**org.apache.felix.https.keystore.key.password@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.truststore** | **char \*** |  | [optional] 
**org.apache.felix.https.truststore@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.truststore.password** | **char \*** |  | [optional] 
**org.apache.felix.https.truststore.password@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.clientcertificate** | **char \*** |  | [optional] 
**org.apache.felix.https.clientcertificate@TypeHint** | **char \*** |  | [optional] 
**org.apache.felix.https.enable** | **int \*** |  | [optional] 
**org.apache.felix.https.enable@TypeHint** | **char \*** |  | [optional] 
**org.osgi.service.http.port.secure** | **char \*** |  | [optional] 
**org.osgi.service.http.port.secure@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postConfigApacheHttpComponentsProxyConfiguration**
```c
void SlingAPI_postConfigApacheHttpComponentsProxyConfiguration(apiClient_t *apiClient, char *proxy.host, char *proxy.host@TypeHint, int *proxy.port, char *proxy.port@TypeHint, list_t *proxy.exceptions, char *proxy.exceptions@TypeHint, int *proxy.enabled, char *proxy.enabled@TypeHint, char *proxy.user, char *proxy.user@TypeHint, char *proxy.password, char *proxy.password@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**proxy.host** | **char \*** |  | [optional] 
**proxy.host@TypeHint** | **char \*** |  | [optional] 
**proxy.port** | **int \*** |  | [optional] 
**proxy.port@TypeHint** | **char \*** |  | [optional] 
**proxy.exceptions** | **[list_t](char.md) \*** |  | [optional] 
**proxy.exceptions@TypeHint** | **char \*** |  | [optional] 
**proxy.enabled** | **int \*** |  | [optional] 
**proxy.enabled@TypeHint** | **char \*** |  | [optional] 
**proxy.user** | **char \*** |  | [optional] 
**proxy.user@TypeHint** | **char \*** |  | [optional] 
**proxy.password** | **char \*** |  | [optional] 
**proxy.password@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postConfigApacheSlingDavExServlet**
```c
void SlingAPI_postConfigApacheSlingDavExServlet(apiClient_t *apiClient, char *alias, char *alias@TypeHint, int *dav.create_absolute_uri, char *dav.create_absolute_uri@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**alias** | **char \*** |  | [optional] 
**alias@TypeHint** | **char \*** |  | [optional] 
**dav.create_absolute_uri** | **int \*** |  | [optional] 
**dav.create_absolute_uri@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postConfigApacheSlingGetServlet**
```c
void SlingAPI_postConfigApacheSlingGetServlet(apiClient_t *apiClient, char *json.maximumresults, char *json.maximumresults@TypeHint, int *enable.html, char *enable.html@TypeHint, int *enable.txt, char *enable.txt@TypeHint, int *enable.xml, char *enable.xml@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**json.maximumresults** | **char \*** |  | [optional] 
**json.maximumresults@TypeHint** | **char \*** |  | [optional] 
**enable.html** | **int \*** |  | [optional] 
**enable.html@TypeHint** | **char \*** |  | [optional] 
**enable.txt** | **int \*** |  | [optional] 
**enable.txt@TypeHint** | **char \*** |  | [optional] 
**enable.xml** | **int \*** |  | [optional] 
**enable.xml@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postConfigApacheSlingReferrerFilter**
```c
void SlingAPI_postConfigApacheSlingReferrerFilter(apiClient_t *apiClient, int *allow.empty, char *allow.empty@TypeHint, char *allow.hosts, char *allow.hosts@TypeHint, char *allow.hosts.regexp, char *allow.hosts.regexp@TypeHint, char *filter.methods, char *filter.methods@TypeHint);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**allow.empty** | **int \*** |  | [optional] 
**allow.empty@TypeHint** | **char \*** |  | [optional] 
**allow.hosts** | **char \*** |  | [optional] 
**allow.hosts@TypeHint** | **char \*** |  | [optional] 
**allow.hosts.regexp** | **char \*** |  | [optional] 
**allow.hosts.regexp@TypeHint** | **char \*** |  | [optional] 
**filter.methods** | **char \*** |  | [optional] 
**filter.methods@TypeHint** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postConfigProperty**
```c
void SlingAPI_postConfigProperty(apiClient_t *apiClient, char *configNodeName);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**configNodeName** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postNode**
```c
void SlingAPI_postNode(apiClient_t *apiClient, char *path, char *name, char *:operation, char *deleteAuthorizable, binary_t* file);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**name** | **char \*** |  | 
**:operation** | **char \*** |  | [optional] 
**deleteAuthorizable** | **char \*** |  | [optional] 
**file** | **binary_t*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postNodeRw**
```c
void SlingAPI_postNodeRw(apiClient_t *apiClient, char *path, char *name, char *addMembers);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**name** | **char \*** |  | 
**addMembers** | **char \*** |  | [optional] 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postPath**
```c
void SlingAPI_postPath(apiClient_t *apiClient, char *path, char *jcr:primaryType, char *:name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**jcr:primaryType** | **char \*** |  | 
**:name** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postQuery**
```c
char* SlingAPI_postQuery(apiClient_t *apiClient, char *path, double p.limit, char *_1_property, char *_1_property.value);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**path** | **char \*** |  | 
**p.limit** | **double** |  | 
**_1_property** | **char \*** |  | 
**_1_property.value** | **char \*** |  | 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postTreeActivation**
```c
void SlingAPI_postTreeActivation(apiClient_t *apiClient, int *ignoredeactivated, int *onlymodified, char *path, char *cmd);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ignoredeactivated** | **int \*** |  | 
**onlymodified** | **int \*** |  | 
**path** | **char \*** |  | 
**cmd** | **char \*** |  | [default to &#39;activate&#39;]

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postTruststore**
```c
char* SlingAPI_postTruststore(apiClient_t *apiClient, char *:operation, char *newPassword, char *rePassword, char *keyStoreType, char *removeAlias, binary_t* certificate);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**:operation** | **char \*** |  | [optional] 
**newPassword** | **char \*** |  | [optional] 
**rePassword** | **char \*** |  | [optional] 
**keyStoreType** | **char \*** |  | [optional] 
**removeAlias** | **char \*** |  | [optional] 
**certificate** | **binary_t*** |  | [optional] 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SlingAPI_postTruststorePKCS12**
```c
char* SlingAPI_postTruststorePKCS12(apiClient_t *apiClient, binary_t* truststore.p12);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**truststore.p12** | **binary_t*** |  | [optional] 

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

