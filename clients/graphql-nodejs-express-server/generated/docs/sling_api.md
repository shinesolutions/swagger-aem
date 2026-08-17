# sling_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteAgent**](sling_api.md#DeleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**DeleteNode**](sling_api.md#DeleteNode) | **DELETE** /{path}/{name} | 
[**GetAgent**](sling_api.md#GetAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**GetAgents**](sling_api.md#GetAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**GetAuthorizableKeystore**](sling_api.md#GetAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**GetKeystore**](sling_api.md#GetKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**GetNode**](sling_api.md#GetNode) | **GET** /{path}/{name} | 
[**GetPackage**](sling_api.md#GetPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**GetPackageFilter**](sling_api.md#GetPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**GetQuery**](sling_api.md#GetQuery) | **GET** /bin/querybuilder.json | 
[**GetTruststore**](sling_api.md#GetTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**GetTruststoreInfo**](sling_api.md#GetTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**PostAgent**](sling_api.md#PostAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**PostAuthorizableKeystore**](sling_api.md#PostAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**PostAuthorizables**](sling_api.md#PostAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**PostConfigAdobeGraniteSamlAuthenticationHandler**](sling_api.md#PostConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**PostConfigApacheFelixJettyBasedHttpService**](sling_api.md#PostConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**PostConfigApacheHttpComponentsProxyConfiguration**](sling_api.md#PostConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**PostConfigApacheSlingDavExServlet**](sling_api.md#PostConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**PostConfigApacheSlingGetServlet**](sling_api.md#PostConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**PostConfigApacheSlingReferrerFilter**](sling_api.md#PostConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**PostConfigProperty**](sling_api.md#PostConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**PostNode**](sling_api.md#PostNode) | **POST** /{path}/{name} | 
[**PostNodeRw**](sling_api.md#PostNodeRw) | **POST** /{path}/{name}.rw.html | 
[**PostPath**](sling_api.md#PostPath) | **POST** /{path}/ | 
[**PostQuery**](sling_api.md#PostQuery) | **POST** /bin/querybuilder.json | 
[**PostTreeActivation**](sling_api.md#PostTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**PostTruststore**](sling_api.md#PostTruststore) | **POST** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](sling_api.md#PostTruststorePKCS12) | **POST** /etc/truststore | 


<a name="DeleteAgent"></a>
# **DeleteAgent**
> DeleteAgent(runmode, name)


<a name="DeleteNode"></a>
# **DeleteNode**
> DeleteNode(path, name)


<a name="GetAgent"></a>
# **GetAgent**
> GetAgent(runmode, name)


<a name="GetAgents"></a>
# **GetAgents**
> String! GetAgents(runmode)


<a name="GetAuthorizableKeystore"></a>
# **GetAuthorizableKeystore**
> KeystoreInfo GetAuthorizableKeystore(intermediatePath, authorizableId)


<a name="GetKeystore"></a>
# **GetKeystore**
> String! GetKeystore(intermediatePath, authorizableId)


<a name="GetNode"></a>
# **GetNode**
> GetNode(path, name)


<a name="GetPackage"></a>
# **GetPackage**
> String! GetPackage(group, name, version)


<a name="GetPackageFilter"></a>
# **GetPackageFilter**
> String! GetPackageFilter(group, name, version)


<a name="GetQuery"></a>
# **GetQuery**
> String! GetQuery(path, pLimit, Var1property, Var1propertyValue)


<a name="GetTruststore"></a>
# **GetTruststore**
> String! GetTruststore()


<a name="GetTruststoreInfo"></a>
# **GetTruststoreInfo**
> TruststoreInfo GetTruststoreInfo()


<a name="PostAgent"></a>
# **PostAgent**
> PostAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)


<a name="PostAuthorizableKeystore"></a>
# **PostAuthorizableKeystore**
> KeystoreInfo PostAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)


<a name="PostAuthorizables"></a>
# **PostAuthorizables**
> String! PostAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)


<a name="PostConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **PostConfigAdobeGraniteSamlAuthenticationHandler**
> PostConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint)


<a name="PostConfigApacheFelixJettyBasedHttpService"></a>
# **PostConfigApacheFelixJettyBasedHttpService**
> PostConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint)


<a name="PostConfigApacheHttpComponentsProxyConfiguration"></a>
# **PostConfigApacheHttpComponentsProxyConfiguration**
> PostConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint)


<a name="PostConfigApacheSlingDavExServlet"></a>
# **PostConfigApacheSlingDavExServlet**
> PostConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint)


<a name="PostConfigApacheSlingGetServlet"></a>
# **PostConfigApacheSlingGetServlet**
> PostConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint)


<a name="PostConfigApacheSlingReferrerFilter"></a>
# **PostConfigApacheSlingReferrerFilter**
> PostConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint)


<a name="PostConfigProperty"></a>
# **PostConfigProperty**
> PostConfigProperty(configNodeName)


<a name="PostNode"></a>
# **PostNode**
> PostNode(path, name, operation, deleteAuthorizable, file)


<a name="PostNodeRw"></a>
# **PostNodeRw**
> PostNodeRw(path, name, addMembers)


<a name="PostPath"></a>
# **PostPath**
> PostPath(path, jcrPrimaryType, name)


<a name="PostQuery"></a>
# **PostQuery**
> String! PostQuery(path, pLimit, Var1property, Var1propertyValue)


<a name="PostTreeActivation"></a>
# **PostTreeActivation**
> PostTreeActivation(ignoredeactivated, onlymodified, path, cmd)


<a name="PostTruststore"></a>
# **PostTruststore**
> String! PostTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)


<a name="PostTruststorePKCS12"></a>
# **PostTruststorePKCS12**
> String! PostTruststorePKCS12(truststoreP12)


