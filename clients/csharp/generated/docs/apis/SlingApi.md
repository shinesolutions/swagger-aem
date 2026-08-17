# Org.OpenAPITools.Api.SlingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteAgent**](SlingApi.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} |  |
| [**DeleteNode**](SlingApi.md#deletenode) | **DELETE** /{path}/{name} |  |
| [**GetAgent**](SlingApi.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} |  |
| [**GetAgents**](SlingApi.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json |  |
| [**GetAuthorizableKeystore**](SlingApi.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json |  |
| [**GetKeystore**](SlingApi.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 |  |
| [**GetNode**](SlingApi.md#getnode) | **GET** /{path}/{name} |  |
| [**GetPackage**](SlingApi.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip |  |
| [**GetPackageFilter**](SlingApi.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json |  |
| [**GetQuery**](SlingApi.md#getquery) | **GET** /bin/querybuilder.json |  |
| [**GetTruststore**](SlingApi.md#gettruststore) | **GET** /etc/truststore/truststore.p12 |  |
| [**GetTruststoreInfo**](SlingApi.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json |  |
| [**PostAgent**](SlingApi.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} |  |
| [**PostAuthorizableKeystore**](SlingApi.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html |  |
| [**PostAuthorizables**](SlingApi.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables |  |
| [**PostConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config |  |
| [**PostConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http |  |
| [**PostConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config |  |
| [**PostConfigApacheSlingDavExServlet**](SlingApi.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet |  |
| [**PostConfigApacheSlingGetServlet**](SlingApi.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet |  |
| [**PostConfigApacheSlingReferrerFilter**](SlingApi.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter |  |
| [**PostConfigProperty**](SlingApi.md#postconfigproperty) | **POST** /apps/system/config/{configNodeName} |  |
| [**PostNode**](SlingApi.md#postnode) | **POST** /{path}/{name} |  |
| [**PostNodeRw**](SlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html |  |
| [**PostPath**](SlingApi.md#postpath) | **POST** /{path}/ |  |
| [**PostQuery**](SlingApi.md#postquery) | **POST** /bin/querybuilder.json |  |
| [**PostTreeActivation**](SlingApi.md#posttreeactivation) | **POST** /libs/replication/treeactivation.html |  |
| [**PostTruststore**](SlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore |  |
| [**PostTruststorePKCS12**](SlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore |  |

<a id="deleteagent"></a>
# **DeleteAgent**
> void DeleteAgent (string runmode, string name)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **runmode** | **string** |  |  |
| **name** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deletenode"></a>
# **DeleteNode**
> void DeleteNode (string path, string name)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **name** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getagent"></a>
# **GetAgent**
> void GetAgent (string runmode, string name)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **runmode** | **string** |  |  |
| **name** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getagents"></a>
# **GetAgents**
> string GetAgents (string runmode)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **runmode** | **string** |  |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getauthorizablekeystore"></a>
# **GetAuthorizableKeystore**
> KeystoreInfo GetAuthorizableKeystore (string intermediatePath, string authorizableId)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **intermediatePath** | **string** |  |  |
| **authorizableId** | **string** |  |  |

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
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getkeystore"></a>
# **GetKeystore**
> System.IO.Stream GetKeystore (string intermediatePath, string authorizableId)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **intermediatePath** | **string** |  |  |
| **authorizableId** | **string** |  |  |

### Return type

**System.IO.Stream**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getnode"></a>
# **GetNode**
> void GetNode (string path, string name)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **name** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getpackage"></a>
# **GetPackage**
> System.IO.Stream GetPackage (string group, string name, string version)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **group** | **string** |  |  |
| **name** | **string** |  |  |
| **version** | **string** |  |  |

### Return type

**System.IO.Stream**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getpackagefilter"></a>
# **GetPackageFilter**
> string GetPackageFilter (string group, string name, string version)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **group** | **string** |  |  |
| **name** | **string** |  |  |
| **version** | **string** |  |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getquery"></a>
# **GetQuery**
> string GetQuery (string path, decimal pLimit, string var1property, string var1propertyValue)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **pLimit** | **decimal** |  |  |
| **var1property** | **string** |  |  |
| **var1propertyValue** | **string** |  |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="gettruststore"></a>
# **GetTruststore**
> System.IO.Stream GetTruststore ()




### Parameters
This endpoint does not need any parameter.
### Return type

**System.IO.Stream**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="gettruststoreinfo"></a>
# **GetTruststoreInfo**
> TruststoreInfo GetTruststoreInfo ()




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
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postagent"></a>
# **PostAgent**
> void PostAgent (string runmode, string name, bool jcrContentCqDistribute = null, string jcrContentCqDistributeTypeHint = null, string jcrContentCqName = null, string jcrContentCqTemplate = null, bool jcrContentAliasUpdate = null, bool jcrContentEnabled = null, string jcrContentJcrDescription = null, string jcrContentJcrLastModified = null, string jcrContentJcrLastModifiedBy = null, string jcrContentJcrMixinTypes = null, string jcrContentJcrTitle = null, string jcrContentLogLevel = null, bool jcrContentNoStatusUpdate = null, bool jcrContentNoVersioning = null, decimal jcrContentProtocolConnectTimeout = null, bool jcrContentProtocolHTTPConnectionClosed = null, string jcrContentProtocolHTTPExpired = null, List<string> jcrContentProtocolHTTPHeaders = null, string jcrContentProtocolHTTPHeadersTypeHint = null, string jcrContentProtocolHTTPMethod = null, bool jcrContentProtocolHTTPSRelaxed = null, string jcrContentProtocolInterface = null, decimal jcrContentProtocolSocketTimeout = null, string jcrContentProtocolVersion = null, string jcrContentProxyNTLMDomain = null, string jcrContentProxyNTLMHost = null, string jcrContentProxyHost = null, string jcrContentProxyPassword = null, decimal jcrContentProxyPort = null, string jcrContentProxyUser = null, decimal jcrContentQueueBatchMaxSize = null, string jcrContentQueueBatchMode = null, decimal jcrContentQueueBatchWaitTime = null, string jcrContentRetryDelay = null, bool jcrContentReverseReplication = null, string jcrContentSerializationType = null, string jcrContentSlingResourceType = null, string jcrContentSsl = null, string jcrContentTransportNTLMDomain = null, string jcrContentTransportNTLMHost = null, string jcrContentTransportPassword = null, string jcrContentTransportUri = null, string jcrContentTransportUser = null, bool jcrContentTriggerDistribute = null, bool jcrContentTriggerModified = null, bool jcrContentTriggerOnOffTime = null, bool jcrContentTriggerReceive = null, bool jcrContentTriggerSpecific = null, string jcrContentUserId = null, string jcrPrimaryType = null, string operation = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **runmode** | **string** |  |  |
| **name** | **string** |  |  |
| **jcrContentCqDistribute** | **bool** |  | [optional]  |
| **jcrContentCqDistributeTypeHint** | **string** |  | [optional]  |
| **jcrContentCqName** | **string** |  | [optional]  |
| **jcrContentCqTemplate** | **string** |  | [optional]  |
| **jcrContentAliasUpdate** | **bool** |  | [optional]  |
| **jcrContentEnabled** | **bool** |  | [optional]  |
| **jcrContentJcrDescription** | **string** |  | [optional]  |
| **jcrContentJcrLastModified** | **string** |  | [optional]  |
| **jcrContentJcrLastModifiedBy** | **string** |  | [optional]  |
| **jcrContentJcrMixinTypes** | **string** |  | [optional]  |
| **jcrContentJcrTitle** | **string** |  | [optional]  |
| **jcrContentLogLevel** | **string** |  | [optional]  |
| **jcrContentNoStatusUpdate** | **bool** |  | [optional]  |
| **jcrContentNoVersioning** | **bool** |  | [optional]  |
| **jcrContentProtocolConnectTimeout** | **decimal** |  | [optional]  |
| **jcrContentProtocolHTTPConnectionClosed** | **bool** |  | [optional]  |
| **jcrContentProtocolHTTPExpired** | **string** |  | [optional]  |
| **jcrContentProtocolHTTPHeaders** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **jcrContentProtocolHTTPHeadersTypeHint** | **string** |  | [optional]  |
| **jcrContentProtocolHTTPMethod** | **string** |  | [optional]  |
| **jcrContentProtocolHTTPSRelaxed** | **bool** |  | [optional]  |
| **jcrContentProtocolInterface** | **string** |  | [optional]  |
| **jcrContentProtocolSocketTimeout** | **decimal** |  | [optional]  |
| **jcrContentProtocolVersion** | **string** |  | [optional]  |
| **jcrContentProxyNTLMDomain** | **string** |  | [optional]  |
| **jcrContentProxyNTLMHost** | **string** |  | [optional]  |
| **jcrContentProxyHost** | **string** |  | [optional]  |
| **jcrContentProxyPassword** | **string** |  | [optional]  |
| **jcrContentProxyPort** | **decimal** |  | [optional]  |
| **jcrContentProxyUser** | **string** |  | [optional]  |
| **jcrContentQueueBatchMaxSize** | **decimal** |  | [optional]  |
| **jcrContentQueueBatchMode** | **string** |  | [optional]  |
| **jcrContentQueueBatchWaitTime** | **decimal** |  | [optional]  |
| **jcrContentRetryDelay** | **string** |  | [optional]  |
| **jcrContentReverseReplication** | **bool** |  | [optional]  |
| **jcrContentSerializationType** | **string** |  | [optional]  |
| **jcrContentSlingResourceType** | **string** |  | [optional]  |
| **jcrContentSsl** | **string** |  | [optional]  |
| **jcrContentTransportNTLMDomain** | **string** |  | [optional]  |
| **jcrContentTransportNTLMHost** | **string** |  | [optional]  |
| **jcrContentTransportPassword** | **string** |  | [optional]  |
| **jcrContentTransportUri** | **string** |  | [optional]  |
| **jcrContentTransportUser** | **string** |  | [optional]  |
| **jcrContentTriggerDistribute** | **bool** |  | [optional]  |
| **jcrContentTriggerModified** | **bool** |  | [optional]  |
| **jcrContentTriggerOnOffTime** | **bool** |  | [optional]  |
| **jcrContentTriggerReceive** | **bool** |  | [optional]  |
| **jcrContentTriggerSpecific** | **bool** |  | [optional]  |
| **jcrContentUserId** | **string** |  | [optional]  |
| **jcrPrimaryType** | **string** |  | [optional]  |
| **operation** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postauthorizablekeystore"></a>
# **PostAuthorizableKeystore**
> KeystoreInfo PostAuthorizableKeystore (string intermediatePath, string authorizableId, string operation = null, string currentPassword = null, string newPassword = null, string rePassword = null, string keyPassword = null, string keyStorePass = null, string alias = null, string newAlias = null, string removeAlias = null, System.IO.Stream certChain = null, System.IO.Stream pk = null, System.IO.Stream keyStore = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **intermediatePath** | **string** |  |  |
| **authorizableId** | **string** |  |  |
| **operation** | **string** |  | [optional]  |
| **currentPassword** | **string** |  | [optional]  |
| **newPassword** | **string** |  | [optional]  |
| **rePassword** | **string** |  | [optional]  |
| **keyPassword** | **string** |  | [optional]  |
| **keyStorePass** | **string** |  | [optional]  |
| **alias** | **string** |  | [optional]  |
| **newAlias** | **string** |  | [optional]  |
| **removeAlias** | **string** |  | [optional]  |
| **certChain** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |
| **pk** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |
| **keyStore** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |

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
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postauthorizables"></a>
# **PostAuthorizables**
> string PostAuthorizables (string authorizableId, string intermediatePath, string createUser = null, string createGroup = null, string repPassword = null, string profileGivenName = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorizableId** | **string** |  |  |
| **intermediatePath** | **string** |  |  |
| **createUser** | **string** |  | [optional]  |
| **createGroup** | **string** |  | [optional]  |
| **repPassword** | **string** |  | [optional]  |
| **profileGivenName** | **string** |  | [optional]  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postconfigadobegranitesamlauthenticationhandler"></a>
# **PostConfigAdobeGraniteSamlAuthenticationHandler**
> void PostConfigAdobeGraniteSamlAuthenticationHandler (string keyStorePassword = null, string keyStorePasswordTypeHint = null, int serviceRanking = null, string serviceRankingTypeHint = null, bool idpHttpRedirect = null, string idpHttpRedirectTypeHint = null, bool createUser = null, string createUserTypeHint = null, string defaultRedirectUrl = null, string defaultRedirectUrlTypeHint = null, string userIDAttribute = null, string userIDAttributeTypeHint = null, List<string> defaultGroups = null, string defaultGroupsTypeHint = null, string idpCertAlias = null, string idpCertAliasTypeHint = null, bool addGroupMemberships = null, string addGroupMembershipsTypeHint = null, List<string> path = null, string pathTypeHint = null, List<string> synchronizeAttributes = null, string synchronizeAttributesTypeHint = null, int clockTolerance = null, string clockToleranceTypeHint = null, string groupMembershipAttribute = null, string groupMembershipAttributeTypeHint = null, string idpUrl = null, string idpUrlTypeHint = null, string logoutUrl = null, string logoutUrlTypeHint = null, string serviceProviderEntityId = null, string serviceProviderEntityIdTypeHint = null, string assertionConsumerServiceURL = null, string assertionConsumerServiceURLTypeHint = null, bool handleLogout = null, string handleLogoutTypeHint = null, string spPrivateKeyAlias = null, string spPrivateKeyAliasTypeHint = null, bool useEncryption = null, string useEncryptionTypeHint = null, string nameIdFormat = null, string nameIdFormatTypeHint = null, string digestMethod = null, string digestMethodTypeHint = null, string signatureMethod = null, string signatureMethodTypeHint = null, string userIntermediatePath = null, string userIntermediatePathTypeHint = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **keyStorePassword** | **string** |  | [optional]  |
| **keyStorePasswordTypeHint** | **string** |  | [optional]  |
| **serviceRanking** | **int** |  | [optional]  |
| **serviceRankingTypeHint** | **string** |  | [optional]  |
| **idpHttpRedirect** | **bool** |  | [optional]  |
| **idpHttpRedirectTypeHint** | **string** |  | [optional]  |
| **createUser** | **bool** |  | [optional]  |
| **createUserTypeHint** | **string** |  | [optional]  |
| **defaultRedirectUrl** | **string** |  | [optional]  |
| **defaultRedirectUrlTypeHint** | **string** |  | [optional]  |
| **userIDAttribute** | **string** |  | [optional]  |
| **userIDAttributeTypeHint** | **string** |  | [optional]  |
| **defaultGroups** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **defaultGroupsTypeHint** | **string** |  | [optional]  |
| **idpCertAlias** | **string** |  | [optional]  |
| **idpCertAliasTypeHint** | **string** |  | [optional]  |
| **addGroupMemberships** | **bool** |  | [optional]  |
| **addGroupMembershipsTypeHint** | **string** |  | [optional]  |
| **path** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **pathTypeHint** | **string** |  | [optional]  |
| **synchronizeAttributes** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **synchronizeAttributesTypeHint** | **string** |  | [optional]  |
| **clockTolerance** | **int** |  | [optional]  |
| **clockToleranceTypeHint** | **string** |  | [optional]  |
| **groupMembershipAttribute** | **string** |  | [optional]  |
| **groupMembershipAttributeTypeHint** | **string** |  | [optional]  |
| **idpUrl** | **string** |  | [optional]  |
| **idpUrlTypeHint** | **string** |  | [optional]  |
| **logoutUrl** | **string** |  | [optional]  |
| **logoutUrlTypeHint** | **string** |  | [optional]  |
| **serviceProviderEntityId** | **string** |  | [optional]  |
| **serviceProviderEntityIdTypeHint** | **string** |  | [optional]  |
| **assertionConsumerServiceURL** | **string** |  | [optional]  |
| **assertionConsumerServiceURLTypeHint** | **string** |  | [optional]  |
| **handleLogout** | **bool** |  | [optional]  |
| **handleLogoutTypeHint** | **string** |  | [optional]  |
| **spPrivateKeyAlias** | **string** |  | [optional]  |
| **spPrivateKeyAliasTypeHint** | **string** |  | [optional]  |
| **useEncryption** | **bool** |  | [optional]  |
| **useEncryptionTypeHint** | **string** |  | [optional]  |
| **nameIdFormat** | **string** |  | [optional]  |
| **nameIdFormatTypeHint** | **string** |  | [optional]  |
| **digestMethod** | **string** |  | [optional]  |
| **digestMethodTypeHint** | **string** |  | [optional]  |
| **signatureMethod** | **string** |  | [optional]  |
| **signatureMethodTypeHint** | **string** |  | [optional]  |
| **userIntermediatePath** | **string** |  | [optional]  |
| **userIntermediatePathTypeHint** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postconfigapachefelixjettybasedhttpservice"></a>
# **PostConfigApacheFelixJettyBasedHttpService**
> void PostConfigApacheFelixJettyBasedHttpService (bool orgApacheFelixHttpsNio = null, string orgApacheFelixHttpsNioTypeHint = null, string orgApacheFelixHttpsKeystore = null, string orgApacheFelixHttpsKeystoreTypeHint = null, string orgApacheFelixHttpsKeystorePassword = null, string orgApacheFelixHttpsKeystorePasswordTypeHint = null, string orgApacheFelixHttpsKeystoreKey = null, string orgApacheFelixHttpsKeystoreKeyTypeHint = null, string orgApacheFelixHttpsKeystoreKeyPassword = null, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = null, string orgApacheFelixHttpsTruststore = null, string orgApacheFelixHttpsTruststoreTypeHint = null, string orgApacheFelixHttpsTruststorePassword = null, string orgApacheFelixHttpsTruststorePasswordTypeHint = null, string orgApacheFelixHttpsClientcertificate = null, string orgApacheFelixHttpsClientcertificateTypeHint = null, bool orgApacheFelixHttpsEnable = null, string orgApacheFelixHttpsEnableTypeHint = null, string orgOsgiServiceHttpPortSecure = null, string orgOsgiServiceHttpPortSecureTypeHint = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **orgApacheFelixHttpsNio** | **bool** |  | [optional]  |
| **orgApacheFelixHttpsNioTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystore** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystoreTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystorePassword** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystorePasswordTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystoreKey** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystoreKeyTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystoreKeyPassword** | **string** |  | [optional]  |
| **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsTruststore** | **string** |  | [optional]  |
| **orgApacheFelixHttpsTruststoreTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsTruststorePassword** | **string** |  | [optional]  |
| **orgApacheFelixHttpsTruststorePasswordTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsClientcertificate** | **string** |  | [optional]  |
| **orgApacheFelixHttpsClientcertificateTypeHint** | **string** |  | [optional]  |
| **orgApacheFelixHttpsEnable** | **bool** |  | [optional]  |
| **orgApacheFelixHttpsEnableTypeHint** | **string** |  | [optional]  |
| **orgOsgiServiceHttpPortSecure** | **string** |  | [optional]  |
| **orgOsgiServiceHttpPortSecureTypeHint** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postconfigapachehttpcomponentsproxyconfiguration"></a>
# **PostConfigApacheHttpComponentsProxyConfiguration**
> void PostConfigApacheHttpComponentsProxyConfiguration (string proxyHost = null, string proxyHostTypeHint = null, int proxyPort = null, string proxyPortTypeHint = null, List<string> proxyExceptions = null, string proxyExceptionsTypeHint = null, bool proxyEnabled = null, string proxyEnabledTypeHint = null, string proxyUser = null, string proxyUserTypeHint = null, string proxyPassword = null, string proxyPasswordTypeHint = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **proxyHost** | **string** |  | [optional]  |
| **proxyHostTypeHint** | **string** |  | [optional]  |
| **proxyPort** | **int** |  | [optional]  |
| **proxyPortTypeHint** | **string** |  | [optional]  |
| **proxyExceptions** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **proxyExceptionsTypeHint** | **string** |  | [optional]  |
| **proxyEnabled** | **bool** |  | [optional]  |
| **proxyEnabledTypeHint** | **string** |  | [optional]  |
| **proxyUser** | **string** |  | [optional]  |
| **proxyUserTypeHint** | **string** |  | [optional]  |
| **proxyPassword** | **string** |  | [optional]  |
| **proxyPasswordTypeHint** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postconfigapacheslingdavexservlet"></a>
# **PostConfigApacheSlingDavExServlet**
> void PostConfigApacheSlingDavExServlet (string alias = null, string aliasTypeHint = null, bool davCreateAbsoluteUri = null, string davCreateAbsoluteUriTypeHint = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **alias** | **string** |  | [optional]  |
| **aliasTypeHint** | **string** |  | [optional]  |
| **davCreateAbsoluteUri** | **bool** |  | [optional]  |
| **davCreateAbsoluteUriTypeHint** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postconfigapacheslinggetservlet"></a>
# **PostConfigApacheSlingGetServlet**
> void PostConfigApacheSlingGetServlet (string jsonMaximumresults = null, string jsonMaximumresultsTypeHint = null, bool enableHtml = null, string enableHtmlTypeHint = null, bool enableTxt = null, string enableTxtTypeHint = null, bool enableXml = null, string enableXmlTypeHint = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jsonMaximumresults** | **string** |  | [optional]  |
| **jsonMaximumresultsTypeHint** | **string** |  | [optional]  |
| **enableHtml** | **bool** |  | [optional]  |
| **enableHtmlTypeHint** | **string** |  | [optional]  |
| **enableTxt** | **bool** |  | [optional]  |
| **enableTxtTypeHint** | **string** |  | [optional]  |
| **enableXml** | **bool** |  | [optional]  |
| **enableXmlTypeHint** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postconfigapacheslingreferrerfilter"></a>
# **PostConfigApacheSlingReferrerFilter**
> void PostConfigApacheSlingReferrerFilter (bool allowEmpty = null, string allowEmptyTypeHint = null, string allowHosts = null, string allowHostsTypeHint = null, string allowHostsRegexp = null, string allowHostsRegexpTypeHint = null, string filterMethods = null, string filterMethodsTypeHint = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **allowEmpty** | **bool** |  | [optional]  |
| **allowEmptyTypeHint** | **string** |  | [optional]  |
| **allowHosts** | **string** |  | [optional]  |
| **allowHostsTypeHint** | **string** |  | [optional]  |
| **allowHostsRegexp** | **string** |  | [optional]  |
| **allowHostsRegexpTypeHint** | **string** |  | [optional]  |
| **filterMethods** | **string** |  | [optional]  |
| **filterMethodsTypeHint** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postconfigproperty"></a>
# **PostConfigProperty**
> void PostConfigProperty (string configNodeName)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **configNodeName** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postnode"></a>
# **PostNode**
> void PostNode (string path, string name, string operation = null, string deleteAuthorizable = null, System.IO.Stream file = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **name** | **string** |  |  |
| **operation** | **string** |  | [optional]  |
| **deleteAuthorizable** | **string** |  | [optional]  |
| **file** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postnoderw"></a>
# **PostNodeRw**
> void PostNodeRw (string path, string name, string addMembers = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **name** | **string** |  |  |
| **addMembers** | **string** |  | [optional]  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postpath"></a>
# **PostPath**
> void PostPath (string path, string jcrPrimaryType, string name)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **jcrPrimaryType** | **string** |  |  |
| **name** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postquery"></a>
# **PostQuery**
> string PostQuery (string path, decimal pLimit, string var1property, string var1propertyValue)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **path** | **string** |  |  |
| **pLimit** | **decimal** |  |  |
| **var1property** | **string** |  |  |
| **var1propertyValue** | **string** |  |  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="posttreeactivation"></a>
# **PostTreeActivation**
> void PostTreeActivation (bool ignoredeactivated, bool onlymodified, string path, string cmd)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ignoredeactivated** | **bool** |  |  |
| **onlymodified** | **bool** |  |  |
| **path** | **string** |  |  |
| **cmd** | **string** |  | [default to &quot;activate&quot;] |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="posttruststore"></a>
# **PostTruststore**
> string PostTruststore (string operation = null, string newPassword = null, string rePassword = null, string keyStoreType = null, string removeAlias = null, System.IO.Stream certificate = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **operation** | **string** |  | [optional]  |
| **newPassword** | **string** |  | [optional]  |
| **rePassword** | **string** |  | [optional]  |
| **keyStoreType** | **string** |  | [optional]  |
| **removeAlias** | **string** |  | [optional]  |
| **certificate** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="posttruststorepkcs12"></a>
# **PostTruststorePKCS12**
> string PostTruststorePKCS12 (System.IO.Stream truststoreP12 = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **truststoreP12** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

