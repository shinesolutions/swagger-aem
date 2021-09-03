package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.KeystoreInfo;
import apimodels.TruststoreInfo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
public class SlingApiControllerImp extends SlingApiControllerImpInterface {
    @Override
    public void deleteAgent(Http.Request request, String runmode, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void deleteNode(Http.Request request, String path, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void getAgent(Http.Request request, String runmode, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public String getAgents(Http.Request request, String runmode) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public KeystoreInfo getAuthorizableKeystore(Http.Request request, String intermediatePath, String authorizableId) throws Exception {
        //Do your magic!!!
        return new KeystoreInfo();
    }

    @Override
    public InputStream getKeystore(Http.Request request, String intermediatePath, String authorizableId) throws Exception {
        //Do your magic!!!
        return new InputStream();
    }

    @Override
    public void getNode(Http.Request request, String path, String name) throws Exception {
        //Do your magic!!!
    }

    @Override
    public InputStream getPackage(Http.Request request, String group, String name, String version) throws Exception {
        //Do your magic!!!
        return new InputStream();
    }

    @Override
    public String getPackageFilter(Http.Request request, String group, String name, String version) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String getQuery(Http.Request request, @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public InputStream getTruststore(Http.Request request) throws Exception {
        //Do your magic!!!
        return new InputStream();
    }

    @Override
    public TruststoreInfo getTruststoreInfo(Http.Request request) throws Exception {
        //Do your magic!!!
        return new TruststoreInfo();
    }

    @Override
    public void postAgent(Http.Request request, String runmode, String name, Boolean jcrColonContentCqColonDistribute, String jcrColonContentCqColonDistributeAtTypeHint, String jcrColonContentCqColonName, String jcrColonContentCqColonTemplate, Boolean jcrColonContentEnabled, String jcrColonContentJcrColonDescription, String jcrColonContentJcrColonLastModified, String jcrColonContentJcrColonLastModifiedBy, String jcrColonContentJcrColonMixinTypes, String jcrColonContentJcrColonTitle, String jcrColonContentLogLevel, Boolean jcrColonContentNoStatusUpdate, Boolean jcrColonContentNoVersioning, BigDecimal jcrColonContentProtocolConnectTimeout, Boolean jcrColonContentProtocolHTTPConnectionClosed, String jcrColonContentProtocolHTTPExpired, List<String> jcrColonContentProtocolHTTPHeaders, String jcrColonContentProtocolHTTPHeadersAtTypeHint, String jcrColonContentProtocolHTTPMethod, Boolean jcrColonContentProtocolHTTPSRelaxed, String jcrColonContentProtocolInterface, BigDecimal jcrColonContentProtocolSocketTimeout, String jcrColonContentProtocolVersion, String jcrColonContentProxyNTLMDomain, String jcrColonContentProxyNTLMHost, String jcrColonContentProxyHost, String jcrColonContentProxyPassword, BigDecimal jcrColonContentProxyPort, String jcrColonContentProxyUser, BigDecimal jcrColonContentQueueBatchMaxSize, String jcrColonContentQueueBatchMode, BigDecimal jcrColonContentQueueBatchWaitTime, String jcrColonContentRetryDelay, Boolean jcrColonContentReverseReplication, String jcrColonContentSerializationType, String jcrColonContentSlingColonResourceType, String jcrColonContentSsl, String jcrColonContentTransportNTLMDomain, String jcrColonContentTransportNTLMHost, String jcrColonContentTransportPassword, String jcrColonContentTransportUri, String jcrColonContentTransportUser, Boolean jcrColonContentTriggerDistribute, Boolean jcrColonContentTriggerModified, Boolean jcrColonContentTriggerOnOffTime, Boolean jcrColonContentTriggerReceive, Boolean jcrColonContentTriggerSpecific, String jcrColonContentUserId, String jcrColonPrimaryType, String colonOperation) throws Exception {
        //Do your magic!!!
    }

    @Override
    public KeystoreInfo postAuthorizableKeystore(Http.Request request, String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, Http.MultipartFormData.FilePart<TemporaryFile> certChain, Http.MultipartFormData.FilePart<TemporaryFile> pk, Http.MultipartFormData.FilePart<TemporaryFile> keyStore) throws Exception {
        //Do your magic!!!
        return new KeystoreInfo();
    }

    @Override
    public String postAuthorizables(Http.Request request, @NotNull String authorizableId, @NotNull String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileGivenName) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void postConfigAdobeGraniteSamlAuthenticationHandler(Http.Request request, String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheFelixJettyBasedHttpService(Http.Request request, Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheHttpComponentsProxyConfiguration(Http.Request request, String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheSlingDavExServlet(Http.Request request, String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheSlingGetServlet(Http.Request request, String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigApacheSlingReferrerFilter(Http.Request request, Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postConfigProperty(Http.Request request, String configNodeName) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postNode(Http.Request request, String path, String name, String colonOperation, String deleteAuthorizable, Http.MultipartFormData.FilePart<TemporaryFile> file) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postNodeRw(Http.Request request, String path, String name, String addMembers) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postPath(Http.Request request, String path, @NotNull String jcrColonPrimaryType, @NotNull String colonName) throws Exception {
        //Do your magic!!!
    }

    @Override
    public String postQuery(Http.Request request, @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void postTreeActivation(Http.Request request, @NotNull Boolean ignoredeactivated, @NotNull Boolean onlymodified, @NotNull String path) throws Exception {
        //Do your magic!!!
    }

    @Override
    public String postTruststore(Http.Request request, String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, Http.MultipartFormData.FilePart<TemporaryFile> certificate) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postTruststorePKCS12(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> truststoreP12) throws Exception {
        //Do your magic!!!
        return new String();
    }

}
