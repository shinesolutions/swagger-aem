package org.openapitools.vertxweb.server.api;

import java.math.BigDecimal;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.KeystoreInfo;
import org.openapitools.vertxweb.server.model.TruststoreInfo;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class SlingApiImpl implements SlingApi {
    public Future<ApiResponse<Void>> deleteAgent(String runmode, String name) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> deleteNode(String path, String name) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> getAgent(String runmode, String name) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> getAgents(String runmode) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<KeystoreInfo>> getAuthorizableKeystore(String intermediatePath, String authorizableId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FileUpload>> getKeystore(String intermediatePath, String authorizableId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> getNode(String path, String name) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FileUpload>> getPackage(String group, String name, String version) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> getPackageFilter(String group, String name, String version) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> getQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FileUpload>> getTruststore() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TruststoreInfo>> getTruststoreInfo() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postAgent(String runmode, String name, Boolean jcrContentCqDistribute, String jcrContentCqDistributeAtTypeHint, String jcrContentCqName, String jcrContentCqTemplate, Boolean jcrContentAliasUpdate, Boolean jcrContentEnabled, String jcrContentJcrDescription, String jcrContentJcrLastModified, String jcrContentJcrLastModifiedBy, String jcrContentJcrMixinTypes, String jcrContentJcrTitle, String jcrContentLogLevel, Boolean jcrContentNoStatusUpdate, Boolean jcrContentNoVersioning, BigDecimal jcrContentProtocolConnectTimeout, Boolean jcrContentProtocolHTTPConnectionClosed, String jcrContentProtocolHTTPExpired, List<String> jcrContentProtocolHTTPHeaders, String jcrContentProtocolHTTPHeadersAtTypeHint, String jcrContentProtocolHTTPMethod, Boolean jcrContentProtocolHTTPSRelaxed, String jcrContentProtocolInterface, BigDecimal jcrContentProtocolSocketTimeout, String jcrContentProtocolVersion, String jcrContentProxyNTLMDomain, String jcrContentProxyNTLMHost, String jcrContentProxyHost, String jcrContentProxyPassword, BigDecimal jcrContentProxyPort, String jcrContentProxyUser, BigDecimal jcrContentQueueBatchMaxSize, String jcrContentQueueBatchMode, BigDecimal jcrContentQueueBatchWaitTime, String jcrContentRetryDelay, Boolean jcrContentReverseReplication, String jcrContentSerializationType, String jcrContentSlingResourceType, String jcrContentSsl, String jcrContentTransportNTLMDomain, String jcrContentTransportNTLMHost, String jcrContentTransportPassword, String jcrContentTransportUri, String jcrContentTransportUser, Boolean jcrContentTriggerDistribute, Boolean jcrContentTriggerModified, Boolean jcrContentTriggerOnOffTime, Boolean jcrContentTriggerReceive, Boolean jcrContentTriggerSpecific, String jcrContentUserId, String jcrPrimaryType, String operation) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<KeystoreInfo>> postAuthorizableKeystore(String intermediatePath, String authorizableId, String operation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, FileUpload certChain, FileUpload pk, FileUpload keyStore) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postAuthorizables(String authorizableId, String intermediatePath, String createUser, String createGroup, String repPassword, String profileGivenName) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigAdobeGraniteSamlAuthenticationHandler(String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigApacheFelixJettyBasedHttpService(Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigApacheHttpComponentsProxyConfiguration(String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigApacheSlingDavExServlet(String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigApacheSlingGetServlet(String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigApacheSlingReferrerFilter(Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigProperty(String configNodeName) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postNode(String path, String name, String operation, String deleteAuthorizable, FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postNodeRw(String path, String name, String addMembers) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postPath(String path, String jcrPrimaryType, String name) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postTreeActivation(Boolean ignoredeactivated, Boolean onlymodified, String path, String cmd) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postTruststore(String operation, String newPassword, String rePassword, String keyStoreType, String removeAlias, FileUpload certificate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postTruststorePKCS12(FileUpload truststoreP12) {
        return Future.failedFuture(new HttpException(501));
    }

}
