package org.openapitools.server.api.verticle;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.server.api.model.KeystoreInfo;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TruststoreInfo;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface SlingApi  {
    //deleteAgent
    void deleteAgent(String runmode, String name, Handler<AsyncResult<Void>> handler);
    
    //deleteNode
    void deleteNode(String path, String name, Handler<AsyncResult<Void>> handler);
    
    //getAgent
    void getAgent(String runmode, String name, Handler<AsyncResult<Void>> handler);
    
    //getAgents
    void getAgents(String runmode, Handler<AsyncResult<String>> handler);
    
    //getAuthorizableKeystore
    void getAuthorizableKeystore(String intermediatePath, String authorizableId, Handler<AsyncResult<KeystoreInfo>> handler);
    
    //getKeystore
    void getKeystore(String intermediatePath, String authorizableId, Handler<AsyncResult<File>> handler);
    
    //getNode
    void getNode(String path, String name, Handler<AsyncResult<Void>> handler);
    
    //getPackage
    void getPackage(String group, String name, String version, Handler<AsyncResult<File>> handler);
    
    //getPackageFilter
    void getPackageFilter(String group, String name, String version, Handler<AsyncResult<String>> handler);
    
    //getQuery
    void getQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue, Handler<AsyncResult<String>> handler);
    
    //getTruststore
    void getTruststore(Handler<AsyncResult<File>> handler);
    
    //getTruststoreInfo
    void getTruststoreInfo(Handler<AsyncResult<TruststoreInfo>> handler);
    
    //postAgent
    void postAgent(String runmode, String name, Boolean jcrColonContentCqColonDistribute, String jcrColonContentCqColonDistributeAtTypeHint, String jcrColonContentCqColonName, String jcrColonContentCqColonTemplate, Boolean jcrColonContentEnabled, String jcrColonContentJcrColonDescription, String jcrColonContentJcrColonLastModified, String jcrColonContentJcrColonLastModifiedBy, String jcrColonContentJcrColonMixinTypes, String jcrColonContentJcrColonTitle, String jcrColonContentLogLevel, Boolean jcrColonContentNoStatusUpdate, Boolean jcrColonContentNoVersioning, BigDecimal jcrColonContentProtocolConnectTimeout, Boolean jcrColonContentProtocolHTTPConnectionClosed, String jcrColonContentProtocolHTTPExpired, List<String> jcrColonContentProtocolHTTPHeaders, String jcrColonContentProtocolHTTPHeadersAtTypeHint, String jcrColonContentProtocolHTTPMethod, Boolean jcrColonContentProtocolHTTPSRelaxed, String jcrColonContentProtocolInterface, BigDecimal jcrColonContentProtocolSocketTimeout, String jcrColonContentProtocolVersion, String jcrColonContentProxyNTLMDomain, String jcrColonContentProxyNTLMHost, String jcrColonContentProxyHost, String jcrColonContentProxyPassword, BigDecimal jcrColonContentProxyPort, String jcrColonContentProxyUser, BigDecimal jcrColonContentQueueBatchMaxSize, String jcrColonContentQueueBatchMode, BigDecimal jcrColonContentQueueBatchWaitTime, String jcrColonContentRetryDelay, Boolean jcrColonContentReverseReplication, String jcrColonContentSerializationType, String jcrColonContentSlingColonResourceType, String jcrColonContentSsl, String jcrColonContentTransportNTLMDomain, String jcrColonContentTransportNTLMHost, String jcrColonContentTransportPassword, String jcrColonContentTransportUri, String jcrColonContentTransportUser, Boolean jcrColonContentTriggerDistribute, Boolean jcrColonContentTriggerModified, Boolean jcrColonContentTriggerOnOffTime, Boolean jcrColonContentTriggerReceive, Boolean jcrColonContentTriggerSpecific, String jcrColonContentUserId, String jcrColonPrimaryType, String colonOperation, Handler<AsyncResult<Void>> handler);
    
    //postAuthorizableKeystore
    void postAuthorizableKeystore(String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, File certChain, File pk, File keyStore, Handler<AsyncResult<KeystoreInfo>> handler);
    
    //postAuthorizables
    void postAuthorizables(String authorizableId, String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileGivenName, Handler<AsyncResult<String>> handler);
    
    //postConfigAdobeGraniteSamlAuthenticationHandler
    void postConfigAdobeGraniteSamlAuthenticationHandler(String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint, Handler<AsyncResult<Void>> handler);
    
    //postConfigApacheFelixJettyBasedHttpService
    void postConfigApacheFelixJettyBasedHttpService(Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint, Handler<AsyncResult<Void>> handler);
    
    //postConfigApacheHttpComponentsProxyConfiguration
    void postConfigApacheHttpComponentsProxyConfiguration(String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint, Handler<AsyncResult<Void>> handler);
    
    //postConfigApacheSlingDavExServlet
    void postConfigApacheSlingDavExServlet(String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint, Handler<AsyncResult<Void>> handler);
    
    //postConfigApacheSlingGetServlet
    void postConfigApacheSlingGetServlet(String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint, Handler<AsyncResult<Void>> handler);
    
    //postConfigApacheSlingReferrerFilter
    void postConfigApacheSlingReferrerFilter(Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint, Handler<AsyncResult<Void>> handler);
    
    //postConfigProperty
    void postConfigProperty(String configNodeName, Handler<AsyncResult<Void>> handler);
    
    //postNode
    void postNode(String path, String name, String colonOperation, String deleteAuthorizable, File file, Handler<AsyncResult<Void>> handler);
    
    //postNodeRw
    void postNodeRw(String path, String name, String addMembers, Handler<AsyncResult<Void>> handler);
    
    //postPath
    void postPath(String path, String jcrColonPrimaryType, String colonName, Handler<AsyncResult<Void>> handler);
    
    //postQuery
    void postQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue, Handler<AsyncResult<String>> handler);
    
    //postTreeActivation
    void postTreeActivation(Boolean ignoredeactivated, Boolean onlymodified, String path, Handler<AsyncResult<Void>> handler);
    
    //postTruststore
    void postTruststore(String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, File certificate, Handler<AsyncResult<String>> handler);
    
    //postTruststorePKCS12
    void postTruststorePKCS12(File truststoreP12, Handler<AsyncResult<String>> handler);
    
}
