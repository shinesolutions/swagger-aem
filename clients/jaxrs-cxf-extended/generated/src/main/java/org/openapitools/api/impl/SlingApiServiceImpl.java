package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.KeystoreInfo;
import org.openapitools.model.TruststoreInfo;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Adobe Experience Manager (AEM) API
 *
 * <p>Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 */
public class SlingApiServiceImpl implements SlingApi {
    @Override
    public void deleteAgent(String runmode, String name) {
        // TODO: Implement...

    }

    @Override
    public void deleteNode(String path, String name) {
        // TODO: Implement...

    }

    @Override
    public void getAgent(String runmode, String name) {
        // TODO: Implement...

    }

    @Override
    public String getAgents(String runmode) {
        // TODO: Implement...
        return null;
    }

    @Override
    public KeystoreInfo getAuthorizableKeystore(String intermediatePath, String authorizableId) {
        // TODO: Implement...
        return null;
    }

    @Override
    public File getKeystore(String intermediatePath, String authorizableId) {
        // TODO: Implement...
        return null;
    }

    @Override
    public void getNode(String path, String name) {
        // TODO: Implement...

    }

    @Override
    public File getPackage(String group, String name, String version) {
        // TODO: Implement...
        return null;
    }

    @Override
    public String getPackageFilter(String group, String name, String version) {
        // TODO: Implement...
        return null;
    }

    @Override
    public String getQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue) {
        // TODO: Implement...
        return null;
    }

    @Override
    public File getTruststore() {
        // TODO: Implement...
        return null;
    }

    @Override
    public TruststoreInfo getTruststoreInfo() {
        // TODO: Implement...
        return null;
    }

    @Override
    public void postAgent(String runmode, String name, Boolean jcrContentCqDistribute, String jcrContentCqDistributeAtTypeHint, String jcrContentCqName, String jcrContentCqTemplate, Boolean jcrContentAliasUpdate, Boolean jcrContentEnabled, String jcrContentJcrDescription, String jcrContentJcrLastModified, String jcrContentJcrLastModifiedBy, String jcrContentJcrMixinTypes, String jcrContentJcrTitle, String jcrContentLogLevel, Boolean jcrContentNoStatusUpdate, Boolean jcrContentNoVersioning, BigDecimal jcrContentProtocolConnectTimeout, Boolean jcrContentProtocolHTTPConnectionClosed, String jcrContentProtocolHTTPExpired, List<String> jcrContentProtocolHTTPHeaders, String jcrContentProtocolHTTPHeadersAtTypeHint, String jcrContentProtocolHTTPMethod, Boolean jcrContentProtocolHTTPSRelaxed, String jcrContentProtocolInterface, BigDecimal jcrContentProtocolSocketTimeout, String jcrContentProtocolVersion, String jcrContentProxyNTLMDomain, String jcrContentProxyNTLMHost, String jcrContentProxyHost, String jcrContentProxyPassword, BigDecimal jcrContentProxyPort, String jcrContentProxyUser, BigDecimal jcrContentQueueBatchMaxSize, String jcrContentQueueBatchMode, BigDecimal jcrContentQueueBatchWaitTime, String jcrContentRetryDelay, Boolean jcrContentReverseReplication, String jcrContentSerializationType, String jcrContentSlingResourceType, String jcrContentSsl, String jcrContentTransportNTLMDomain, String jcrContentTransportNTLMHost, String jcrContentTransportPassword, String jcrContentTransportUri, String jcrContentTransportUser, Boolean jcrContentTriggerDistribute, Boolean jcrContentTriggerModified, Boolean jcrContentTriggerOnOffTime, Boolean jcrContentTriggerReceive, Boolean jcrContentTriggerSpecific, String jcrContentUserId, String jcrPrimaryType, String operation) {
        // TODO: Implement...

    }

    @Override
    public KeystoreInfo postAuthorizableKeystore(String intermediatePath, String authorizableId, String operation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias,  Attachment certChainDetail,  Attachment pkDetail,  Attachment keyStoreDetail) {
        // TODO: Implement...
        return null;
    }

    @Override
    public String postAuthorizables(String authorizableId, String intermediatePath, String createUser, String createGroup, String repPassword, String profileGivenName) {
        // TODO: Implement...
        return null;
    }

    @Override
    public void postConfigAdobeGraniteSamlAuthenticationHandler(String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint) {
        // TODO: Implement...

    }

    @Override
    public void postConfigApacheFelixJettyBasedHttpService(Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint) {
        // TODO: Implement...

    }

    @Override
    public void postConfigApacheHttpComponentsProxyConfiguration(String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint) {
        // TODO: Implement...

    }

    @Override
    public void postConfigApacheSlingDavExServlet(String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint) {
        // TODO: Implement...

    }

    @Override
    public void postConfigApacheSlingGetServlet(String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint) {
        // TODO: Implement...

    }

    @Override
    public void postConfigApacheSlingReferrerFilter(Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint) {
        // TODO: Implement...

    }

    @Override
    public void postConfigProperty(String configNodeName) {
        // TODO: Implement...

    }

    @Override
    public void postNode(String path, String name, String operation, String deleteAuthorizable,  Attachment _fileDetail) {
        // TODO: Implement...

    }

    @Override
    public void postNodeRw(String path, String name, String addMembers) {
        // TODO: Implement...

    }

    @Override
    public void postPath(String path, String jcrPrimaryType, String name) {
        // TODO: Implement...

    }

    @Override
    public String postQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue) {
        // TODO: Implement...
        return null;
    }

    @Override
    public void postTreeActivation(Boolean ignoredeactivated, Boolean onlymodified, String path, String cmd) {
        // TODO: Implement...

    }

    @Override
    public String postTruststore(String operation, String newPassword, String rePassword, String keyStoreType, String removeAlias,  Attachment certificateDetail) {
        // TODO: Implement...
        return null;
    }

    @Override
    public String postTruststorePKCS12( Attachment truststoreP12Detail) {
        // TODO: Implement...
        return null;
    }

}
