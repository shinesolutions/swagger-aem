package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.KeystoreInfo;
import apimodels.TruststoreInfo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-04T23:41:35.248Z[GMT]")

public class SlingApiControllerImp implements SlingApiControllerImpInterface {
    @Override
    public void deleteAgent(String runmode, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void deleteNode(String path, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void getAgent(String runmode, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public String getAgents(String runmode) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public KeystoreInfo getAuthorizableKeystore(String intermediatePath, String authorizableId) throws Exception {
        //Do your magic!!!
        return new KeystoreInfo();
    }

    @Override
    public InputStream getKeystore(String intermediatePath, String authorizableId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public void getNode(String path, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public InputStream getPackage(String group, String name, String version) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public String getPackageFilter(String group, String name, String version) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String getQuery( @NotNull String path,  @NotNull BigDecimal pLimit,  @NotNull String _1property,  @NotNull String _1propertyValue) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public InputStream getTruststore() throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public TruststoreInfo getTruststoreInfo() throws Exception {
        //Do your magic!!!
        return new TruststoreInfo();
    }

    @Override
    public void postAgent(String runmode, String name, Boolean jcrColonContentSlashCqColonDistribute, String jcrColonContentSlashCqColonDistributeAtTypeHint, String jcrColonContentSlashCqColonName, String jcrColonContentSlashCqColonTemplate, Boolean jcrColonContentSlashEnabled, String jcrColonContentSlashJcrColonDescription, String jcrColonContentSlashJcrColonLastModified, String jcrColonContentSlashJcrColonLastModifiedBy, String jcrColonContentSlashJcrColonMixinTypes, String jcrColonContentSlashJcrColonTitle, String jcrColonContentSlashLogLevel, Boolean jcrColonContentSlashNoStatusUpdate, Boolean jcrColonContentSlashNoVersioning, BigDecimal jcrColonContentSlashProtocolConnectTimeout, Boolean jcrColonContentSlashProtocolHTTPConnectionClosed, String jcrColonContentSlashProtocolHTTPExpired, List<String> jcrColonContentSlashProtocolHTTPHeaders, String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String jcrColonContentSlashProtocolHTTPMethod, Boolean jcrColonContentSlashProtocolHTTPSRelaxed, String jcrColonContentSlashProtocolInterface, BigDecimal jcrColonContentSlashProtocolSocketTimeout, String jcrColonContentSlashProtocolVersion, String jcrColonContentSlashProxyNTLMDomain, String jcrColonContentSlashProxyNTLMHost, String jcrColonContentSlashProxyHost, String jcrColonContentSlashProxyPassword, BigDecimal jcrColonContentSlashProxyPort, String jcrColonContentSlashProxyUser, BigDecimal jcrColonContentSlashQueueBatchMaxSize, String jcrColonContentSlashQueueBatchMode, BigDecimal jcrColonContentSlashQueueBatchWaitTime, String jcrColonContentSlashRetryDelay, Boolean jcrColonContentSlashReverseReplication, String jcrColonContentSlashSerializationType, String jcrColonContentSlashSlingColonResourceType, String jcrColonContentSlashSsl, String jcrColonContentSlashTransportNTLMDomain, String jcrColonContentSlashTransportNTLMHost, String jcrColonContentSlashTransportPassword, String jcrColonContentSlashTransportUri, String jcrColonContentSlashTransportUser, Boolean jcrColonContentSlashTriggerDistribute, Boolean jcrColonContentSlashTriggerModified, Boolean jcrColonContentSlashTriggerOnOffTime, Boolean jcrColonContentSlashTriggerReceive, Boolean jcrColonContentSlashTriggerSpecific, String jcrColonContentSlashUserId, String jcrColonPrimaryType, String colonOperation) throws Exception {
        //Do your magic!!!
    }

    @Override
    public KeystoreInfo postAuthorizableKeystore(String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, Http.MultipartFormData.FilePart certChain, Http.MultipartFormData.FilePart pk, Http.MultipartFormData.FilePart keyStore) throws Exception {
        //Do your magic!!!
        return new KeystoreInfo();
    }

    @Override
    public String postAuthorizables( @NotNull String authorizableId,  @NotNull String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileSlashGivenName) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void postConfigAdobeGraniteSamlAuthenticationHandler(String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheFelixJettyBasedHttpService(Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheHttpComponentsProxyConfiguration(String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheSlingDavExServlet(String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheSlingGetServlet(String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheSlingReferrerFilter(Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postNode(String path, String name, String colonOperation, String deleteAuthorizable, Http.MultipartFormData.FilePart file) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postNodeRw(String path, String name, String addMembers) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postPath(String path,  @NotNull String jcrColonPrimaryType,  @NotNull String colonName) throws Exception {
        //Do your magic!!!
    }

    @Override
    public String postQuery( @NotNull String path,  @NotNull BigDecimal pLimit,  @NotNull String _1property,  @NotNull String _1propertyValue) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void postTreeActivation( @NotNull Boolean ignoredeactivated,  @NotNull Boolean onlymodified,  @NotNull String path) throws Exception {
        //Do your magic!!!
    }

    @Override
    public String postTruststore(String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, Http.MultipartFormData.FilePart certificate) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postTruststorePKCS12(Http.MultipartFormData.FilePart truststoreP12) throws Exception {
        //Do your magic!!!
        return new String();
    }

}
