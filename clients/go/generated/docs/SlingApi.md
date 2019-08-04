# \SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteAgent**](SlingApi.md#DeleteAgent) | **Delete** /etc/replication/agents.{runmode}/{name} | 
[**DeleteNode**](SlingApi.md#DeleteNode) | **Delete** /{path}/{name} | 
[**GetAgent**](SlingApi.md#GetAgent) | **Get** /etc/replication/agents.{runmode}/{name} | 
[**GetAgents**](SlingApi.md#GetAgents) | **Get** /etc/replication/agents.{runmode}.-1.json | 
[**GetAuthorizableKeystore**](SlingApi.md#GetAuthorizableKeystore) | **Get** /{intermediatePath}/{authorizableId}.ks.json | 
[**GetKeystore**](SlingApi.md#GetKeystore) | **Get** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**GetNode**](SlingApi.md#GetNode) | **Get** /{path}/{name} | 
[**GetPackage**](SlingApi.md#GetPackage) | **Get** /etc/packages/{group}/{name}-{version}.zip | 
[**GetPackageFilter**](SlingApi.md#GetPackageFilter) | **Get** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**GetQuery**](SlingApi.md#GetQuery) | **Get** /bin/querybuilder.json | 
[**GetTruststore**](SlingApi.md#GetTruststore) | **Get** /etc/truststore/truststore.p12 | 
[**GetTruststoreInfo**](SlingApi.md#GetTruststoreInfo) | **Get** /libs/granite/security/truststore.json | 
[**PostAgent**](SlingApi.md#PostAgent) | **Post** /etc/replication/agents.{runmode}/{name} | 
[**PostAuthorizableKeystore**](SlingApi.md#PostAuthorizableKeystore) | **Post** /{intermediatePath}/{authorizableId}.ks.html | 
[**PostAuthorizables**](SlingApi.md#PostAuthorizables) | **Post** /libs/granite/security/post/authorizables | 
[**PostConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#PostConfigAdobeGraniteSamlAuthenticationHandler) | **Post** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**PostConfigApacheFelixJettyBasedHttpService**](SlingApi.md#PostConfigApacheFelixJettyBasedHttpService) | **Post** /apps/system/config/org.apache.felix.http | 
[**PostConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#PostConfigApacheHttpComponentsProxyConfiguration) | **Post** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**PostConfigApacheSlingDavExServlet**](SlingApi.md#PostConfigApacheSlingDavExServlet) | **Post** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**PostConfigApacheSlingGetServlet**](SlingApi.md#PostConfigApacheSlingGetServlet) | **Post** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**PostConfigApacheSlingReferrerFilter**](SlingApi.md#PostConfigApacheSlingReferrerFilter) | **Post** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**PostNode**](SlingApi.md#PostNode) | **Post** /{path}/{name} | 
[**PostNodeRw**](SlingApi.md#PostNodeRw) | **Post** /{path}/{name}.rw.html | 
[**PostPath**](SlingApi.md#PostPath) | **Post** /{path}/ | 
[**PostQuery**](SlingApi.md#PostQuery) | **Post** /bin/querybuilder.json | 
[**PostTreeActivation**](SlingApi.md#PostTreeActivation) | **Post** /etc/replication/treeactivation.html | 
[**PostTruststore**](SlingApi.md#PostTruststore) | **Post** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](SlingApi.md#PostTruststorePKCS12) | **Post** /etc/truststore | 


# **DeleteAgent**
> DeleteAgent(ctx, runmode, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **runmode** | **string**|  | 
  **name** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteNode**
> DeleteNode(ctx, path, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **name** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAgent**
> GetAgent(ctx, runmode, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **runmode** | **string**|  | 
  **name** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAgents**
> string GetAgents(ctx, runmode)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **runmode** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAuthorizableKeystore**
> KeystoreInfo GetAuthorizableKeystore(ctx, intermediatePath, authorizableId)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **intermediatePath** | **string**|  | 
  **authorizableId** | **string**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetKeystore**
> *os.File GetKeystore(ctx, intermediatePath, authorizableId)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **intermediatePath** | **string**|  | 
  **authorizableId** | **string**|  | 

### Return type

[***os.File**](*os.File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetNode**
> GetNode(ctx, path, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **name** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPackage**
> *os.File GetPackage(ctx, group, name, version)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **group** | **string**|  | 
  **name** | **string**|  | 
  **version** | **string**|  | 

### Return type

[***os.File**](*os.File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPackageFilter**
> string GetPackageFilter(ctx, group, name, version)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **group** | **string**|  | 
  **name** | **string**|  | 
  **version** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetQuery**
> string GetQuery(ctx, path, pLimit, var1Property, var1PropertyValue)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **pLimit** | **float32**|  | 
  **var1Property** | **string**|  | 
  **var1PropertyValue** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetTruststore**
> *os.File GetTruststore(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[***os.File**](*os.File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetTruststoreInfo**
> TruststoreInfo GetTruststoreInfo(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostAgent**
> PostAgent(ctx, runmode, name, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **runmode** | **string**|  | 
  **name** | **string**|  | 
 **optional** | ***PostAgentOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostAgentOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **jcrcontentcqdistribute** | **optional.Bool**|  | 
 **jcrcontentcqdistributeTypeHint** | **optional.String**|  | 
 **jcrcontentcqname** | **optional.String**|  | 
 **jcrcontentcqtemplate** | **optional.String**|  | 
 **jcrcontentenabled** | **optional.Bool**|  | 
 **jcrcontentjcrdescription** | **optional.String**|  | 
 **jcrcontentjcrlastModified** | **optional.String**|  | 
 **jcrcontentjcrlastModifiedBy** | **optional.String**|  | 
 **jcrcontentjcrmixinTypes** | **optional.String**|  | 
 **jcrcontentjcrtitle** | **optional.String**|  | 
 **jcrcontentlogLevel** | **optional.String**|  | 
 **jcrcontentnoStatusUpdate** | **optional.Bool**|  | 
 **jcrcontentnoVersioning** | **optional.Bool**|  | 
 **jcrcontentprotocolConnectTimeout** | **optional.Float32**|  | 
 **jcrcontentprotocolHTTPConnectionClosed** | **optional.Bool**|  | 
 **jcrcontentprotocolHTTPExpired** | **optional.String**|  | 
 **jcrcontentprotocolHTTPHeaders** | [**optional.Interface of []string**](string.md)|  | 
 **jcrcontentprotocolHTTPHeadersTypeHint** | **optional.String**|  | 
 **jcrcontentprotocolHTTPMethod** | **optional.String**|  | 
 **jcrcontentprotocolHTTPSRelaxed** | **optional.Bool**|  | 
 **jcrcontentprotocolInterface** | **optional.String**|  | 
 **jcrcontentprotocolSocketTimeout** | **optional.Float32**|  | 
 **jcrcontentprotocolVersion** | **optional.String**|  | 
 **jcrcontentproxyNTLMDomain** | **optional.String**|  | 
 **jcrcontentproxyNTLMHost** | **optional.String**|  | 
 **jcrcontentproxyHost** | **optional.String**|  | 
 **jcrcontentproxyPassword** | **optional.String**|  | 
 **jcrcontentproxyPort** | **optional.Float32**|  | 
 **jcrcontentproxyUser** | **optional.String**|  | 
 **jcrcontentqueueBatchMaxSize** | **optional.Float32**|  | 
 **jcrcontentqueueBatchMode** | **optional.String**|  | 
 **jcrcontentqueueBatchWaitTime** | **optional.Float32**|  | 
 **jcrcontentretryDelay** | **optional.String**|  | 
 **jcrcontentreverseReplication** | **optional.Bool**|  | 
 **jcrcontentserializationType** | **optional.String**|  | 
 **jcrcontentslingresourceType** | **optional.String**|  | 
 **jcrcontentssl** | **optional.String**|  | 
 **jcrcontenttransportNTLMDomain** | **optional.String**|  | 
 **jcrcontenttransportNTLMHost** | **optional.String**|  | 
 **jcrcontenttransportPassword** | **optional.String**|  | 
 **jcrcontenttransportUri** | **optional.String**|  | 
 **jcrcontenttransportUser** | **optional.String**|  | 
 **jcrcontenttriggerDistribute** | **optional.Bool**|  | 
 **jcrcontenttriggerModified** | **optional.Bool**|  | 
 **jcrcontenttriggerOnOffTime** | **optional.Bool**|  | 
 **jcrcontenttriggerReceive** | **optional.Bool**|  | 
 **jcrcontenttriggerSpecific** | **optional.Bool**|  | 
 **jcrcontentuserId** | **optional.String**|  | 
 **jcrprimaryType** | **optional.String**|  | 
 **operation** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostAuthorizableKeystore**
> KeystoreInfo PostAuthorizableKeystore(ctx, intermediatePath, authorizableId, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **intermediatePath** | **string**|  | 
  **authorizableId** | **string**|  | 
 **optional** | ***PostAuthorizableKeystoreOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostAuthorizableKeystoreOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **operation** | **optional.String**|  | 
 **currentPassword** | **optional.String**|  | 
 **newPassword** | **optional.String**|  | 
 **rePassword** | **optional.String**|  | 
 **keyPassword** | **optional.String**|  | 
 **keyStorePass** | **optional.String**|  | 
 **alias** | **optional.String**|  | 
 **newAlias** | **optional.String**|  | 
 **removeAlias** | **optional.String**|  | 
 **certChain** | **optional.Interface of *os.File****optional.*os.File**|  | 
 **pk** | **optional.Interface of *os.File****optional.*os.File**|  | 
 **keyStore** | **optional.Interface of *os.File****optional.*os.File**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostAuthorizables**
> string PostAuthorizables(ctx, authorizableId, intermediatePath, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **authorizableId** | **string**|  | 
  **intermediatePath** | **string**|  | 
 **optional** | ***PostAuthorizablesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostAuthorizablesOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **createUser** | **optional.String**|  | 
 **createGroup** | **optional.String**|  | 
 **reppassword** | **optional.String**|  | 
 **profilegivenName** | **optional.String**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostConfigAdobeGraniteSamlAuthenticationHandler**
> PostConfigAdobeGraniteSamlAuthenticationHandler(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostConfigAdobeGraniteSamlAuthenticationHandlerOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostConfigAdobeGraniteSamlAuthenticationHandlerOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **optional.String**|  | 
 **keyStorePasswordTypeHint** | **optional.String**|  | 
 **serviceRanking** | **optional.Int32**|  | 
 **serviceRankingTypeHint** | **optional.String**|  | 
 **idpHttpRedirect** | **optional.Bool**|  | 
 **idpHttpRedirectTypeHint** | **optional.String**|  | 
 **createUser** | **optional.Bool**|  | 
 **createUserTypeHint** | **optional.String**|  | 
 **defaultRedirectUrl** | **optional.String**|  | 
 **defaultRedirectUrlTypeHint** | **optional.String**|  | 
 **userIDAttribute** | **optional.String**|  | 
 **userIDAttributeTypeHint** | **optional.String**|  | 
 **defaultGroups** | [**optional.Interface of []string**](string.md)|  | 
 **defaultGroupsTypeHint** | **optional.String**|  | 
 **idpCertAlias** | **optional.String**|  | 
 **idpCertAliasTypeHint** | **optional.String**|  | 
 **addGroupMemberships** | **optional.Bool**|  | 
 **addGroupMembershipsTypeHint** | **optional.String**|  | 
 **path** | [**optional.Interface of []string**](string.md)|  | 
 **pathTypeHint** | **optional.String**|  | 
 **synchronizeAttributes** | [**optional.Interface of []string**](string.md)|  | 
 **synchronizeAttributesTypeHint** | **optional.String**|  | 
 **clockTolerance** | **optional.Int32**|  | 
 **clockToleranceTypeHint** | **optional.String**|  | 
 **groupMembershipAttribute** | **optional.String**|  | 
 **groupMembershipAttributeTypeHint** | **optional.String**|  | 
 **idpUrl** | **optional.String**|  | 
 **idpUrlTypeHint** | **optional.String**|  | 
 **logoutUrl** | **optional.String**|  | 
 **logoutUrlTypeHint** | **optional.String**|  | 
 **serviceProviderEntityId** | **optional.String**|  | 
 **serviceProviderEntityIdTypeHint** | **optional.String**|  | 
 **assertionConsumerServiceURL** | **optional.String**|  | 
 **assertionConsumerServiceURLTypeHint** | **optional.String**|  | 
 **handleLogout** | **optional.Bool**|  | 
 **handleLogoutTypeHint** | **optional.String**|  | 
 **spPrivateKeyAlias** | **optional.String**|  | 
 **spPrivateKeyAliasTypeHint** | **optional.String**|  | 
 **useEncryption** | **optional.Bool**|  | 
 **useEncryptionTypeHint** | **optional.String**|  | 
 **nameIdFormat** | **optional.String**|  | 
 **nameIdFormatTypeHint** | **optional.String**|  | 
 **digestMethod** | **optional.String**|  | 
 **digestMethodTypeHint** | **optional.String**|  | 
 **signatureMethod** | **optional.String**|  | 
 **signatureMethodTypeHint** | **optional.String**|  | 
 **userIntermediatePath** | **optional.String**|  | 
 **userIntermediatePathTypeHint** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostConfigApacheFelixJettyBasedHttpService**
> PostConfigApacheFelixJettyBasedHttpService(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostConfigApacheFelixJettyBasedHttpServiceOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostConfigApacheFelixJettyBasedHttpServiceOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **optional.Bool**|  | 
 **orgApacheFelixHttpsNioTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystore** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystoreTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystorePassword** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystoreKey** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **optional.String**|  | 
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsTruststore** | **optional.String**|  | 
 **orgApacheFelixHttpsTruststoreTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsTruststorePassword** | **optional.String**|  | 
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsClientcertificate** | **optional.String**|  | 
 **orgApacheFelixHttpsClientcertificateTypeHint** | **optional.String**|  | 
 **orgApacheFelixHttpsEnable** | **optional.Bool**|  | 
 **orgApacheFelixHttpsEnableTypeHint** | **optional.String**|  | 
 **orgOsgiServiceHttpPortSecure** | **optional.String**|  | 
 **orgOsgiServiceHttpPortSecureTypeHint** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostConfigApacheHttpComponentsProxyConfiguration**
> PostConfigApacheHttpComponentsProxyConfiguration(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostConfigApacheHttpComponentsProxyConfigurationOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostConfigApacheHttpComponentsProxyConfigurationOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **optional.String**|  | 
 **proxyHostTypeHint** | **optional.String**|  | 
 **proxyPort** | **optional.Int32**|  | 
 **proxyPortTypeHint** | **optional.String**|  | 
 **proxyExceptions** | [**optional.Interface of []string**](string.md)|  | 
 **proxyExceptionsTypeHint** | **optional.String**|  | 
 **proxyEnabled** | **optional.Bool**|  | 
 **proxyEnabledTypeHint** | **optional.String**|  | 
 **proxyUser** | **optional.String**|  | 
 **proxyUserTypeHint** | **optional.String**|  | 
 **proxyPassword** | **optional.String**|  | 
 **proxyPasswordTypeHint** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostConfigApacheSlingDavExServlet**
> PostConfigApacheSlingDavExServlet(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostConfigApacheSlingDavExServletOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostConfigApacheSlingDavExServletOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **optional.String**|  | 
 **aliasTypeHint** | **optional.String**|  | 
 **davCreateAbsoluteUri** | **optional.Bool**|  | 
 **davCreateAbsoluteUriTypeHint** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostConfigApacheSlingGetServlet**
> PostConfigApacheSlingGetServlet(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostConfigApacheSlingGetServletOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostConfigApacheSlingGetServletOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **optional.String**|  | 
 **jsonMaximumresultsTypeHint** | **optional.String**|  | 
 **enableHtml** | **optional.Bool**|  | 
 **enableHtmlTypeHint** | **optional.String**|  | 
 **enableTxt** | **optional.Bool**|  | 
 **enableTxtTypeHint** | **optional.String**|  | 
 **enableXml** | **optional.Bool**|  | 
 **enableXmlTypeHint** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostConfigApacheSlingReferrerFilter**
> PostConfigApacheSlingReferrerFilter(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostConfigApacheSlingReferrerFilterOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostConfigApacheSlingReferrerFilterOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **optional.Bool**|  | 
 **allowEmptyTypeHint** | **optional.String**|  | 
 **allowHosts** | **optional.String**|  | 
 **allowHostsTypeHint** | **optional.String**|  | 
 **allowHostsRegexp** | **optional.String**|  | 
 **allowHostsRegexpTypeHint** | **optional.String**|  | 
 **filterMethods** | **optional.String**|  | 
 **filterMethodsTypeHint** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostNode**
> PostNode(ctx, path, name, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **name** | **string**|  | 
 **optional** | ***PostNodeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostNodeOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **operation** | **optional.String**|  | 
 **deleteAuthorizable** | **optional.String**|  | 
 **file** | **optional.Interface of *os.File****optional.*os.File**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostNodeRw**
> PostNodeRw(ctx, path, name, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **name** | **string**|  | 
 **optional** | ***PostNodeRwOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostNodeRwOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **addMembers** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostPath**
> PostPath(ctx, path, jcrprimaryType, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **jcrprimaryType** | **string**|  | 
  **name** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostQuery**
> string PostQuery(ctx, path, pLimit, var1Property, var1PropertyValue)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **path** | **string**|  | 
  **pLimit** | **float32**|  | 
  **var1Property** | **string**|  | 
  **var1PropertyValue** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostTreeActivation**
> PostTreeActivation(ctx, ignoredeactivated, onlymodified, path)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **ignoredeactivated** | **bool**|  | 
  **onlymodified** | **bool**|  | 
  **path** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostTruststore**
> string PostTruststore(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostTruststoreOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostTruststoreOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **optional.String**|  | 
 **newPassword** | **optional.String**|  | 
 **rePassword** | **optional.String**|  | 
 **keyStoreType** | **optional.String**|  | 
 **removeAlias** | **optional.String**|  | 
 **certificate** | **optional.Interface of *os.File****optional.*os.File**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PostTruststorePKCS12**
> string PostTruststorePKCS12(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PostTruststorePKCS12Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PostTruststorePKCS12Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **optional.Interface of *os.File****optional.*os.File**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

