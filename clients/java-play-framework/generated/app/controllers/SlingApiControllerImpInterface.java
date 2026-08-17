package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.KeystoreInfo;
import apimodels.TruststoreInfo;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class SlingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result deleteAgentHttp(Http.Request request, String runmode, String name) throws Exception {
        deleteAgent(request, runmode, name);
        return ok();

    }

    public abstract void deleteAgent(Http.Request request, String runmode, String name) throws Exception;

    public Result deleteNodeHttp(Http.Request request, String path, String name) throws Exception {
        deleteNode(request, path, name);
        return ok();

    }

    public abstract void deleteNode(Http.Request request, String path, String name) throws Exception;

    public Result getAgentHttp(Http.Request request, String runmode, String name) throws Exception {
        getAgent(request, runmode, name);
        return ok();

    }

    public abstract void getAgent(Http.Request request, String runmode, String name) throws Exception;

    public Result getAgentsHttp(Http.Request request, String runmode) throws Exception {
        String obj = getAgents(request, runmode);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String getAgents(Http.Request request, String runmode) throws Exception;

    public Result getAuthorizableKeystoreHttp(Http.Request request, String intermediatePath, String authorizableId) throws Exception {
        KeystoreInfo obj = getAuthorizableKeystore(request, intermediatePath, authorizableId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract KeystoreInfo getAuthorizableKeystore(Http.Request request, String intermediatePath, String authorizableId) throws Exception;

    public Result getKeystoreHttp(Http.Request request, String intermediatePath, String authorizableId) throws Exception {
        InputStream obj = getKeystore(request, intermediatePath, authorizableId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InputStream getKeystore(Http.Request request, String intermediatePath, String authorizableId) throws Exception;

    public Result getNodeHttp(Http.Request request, String path, String name) throws Exception {
        getNode(request, path, name);
        return ok();

    }

    public abstract void getNode(Http.Request request, String path, String name) throws Exception;

    public Result getPackageHttp(Http.Request request, String group, String name, String version) throws Exception {
        InputStream obj = getPackage(request, group, name, version);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InputStream getPackage(Http.Request request, String group, String name, String version) throws Exception;

    public Result getPackageFilterHttp(Http.Request request, String group, String name, String version) throws Exception {
        String obj = getPackageFilter(request, group, name, version);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String getPackageFilter(Http.Request request, String group, String name, String version) throws Exception;

    public Result getQueryHttp(Http.Request request, @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue) throws Exception {
        String obj = getQuery(request, path, pLimit, _1property, _1propertyValue);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String getQuery(Http.Request request, @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue) throws Exception;

    public Result getTruststoreHttp(Http.Request request) throws Exception {
        InputStream obj = getTruststore(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InputStream getTruststore(Http.Request request) throws Exception;

    public Result getTruststoreInfoHttp(Http.Request request) throws Exception {
        TruststoreInfo obj = getTruststoreInfo(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TruststoreInfo getTruststoreInfo(Http.Request request) throws Exception;

    public Result postAgentHttp(Http.Request request, String runmode, String name, Boolean jcrContentCqDistribute, String jcrContentCqDistributeAtTypeHint, String jcrContentCqName, String jcrContentCqTemplate, Boolean jcrContentAliasUpdate, Boolean jcrContentEnabled, String jcrContentJcrDescription, String jcrContentJcrLastModified, String jcrContentJcrLastModifiedBy, String jcrContentJcrMixinTypes, String jcrContentJcrTitle, String jcrContentLogLevel, Boolean jcrContentNoStatusUpdate, Boolean jcrContentNoVersioning, BigDecimal jcrContentProtocolConnectTimeout, Boolean jcrContentProtocolHTTPConnectionClosed, String jcrContentProtocolHTTPExpired, List<String> jcrContentProtocolHTTPHeaders, String jcrContentProtocolHTTPHeadersAtTypeHint, String jcrContentProtocolHTTPMethod, Boolean jcrContentProtocolHTTPSRelaxed, String jcrContentProtocolInterface, BigDecimal jcrContentProtocolSocketTimeout, String jcrContentProtocolVersion, String jcrContentProxyNTLMDomain, String jcrContentProxyNTLMHost, String jcrContentProxyHost, String jcrContentProxyPassword, BigDecimal jcrContentProxyPort, String jcrContentProxyUser, BigDecimal jcrContentQueueBatchMaxSize, String jcrContentQueueBatchMode, BigDecimal jcrContentQueueBatchWaitTime, String jcrContentRetryDelay, Boolean jcrContentReverseReplication, String jcrContentSerializationType, String jcrContentSlingResourceType, String jcrContentSsl, String jcrContentTransportNTLMDomain, String jcrContentTransportNTLMHost, String jcrContentTransportPassword, String jcrContentTransportUri, String jcrContentTransportUser, Boolean jcrContentTriggerDistribute, Boolean jcrContentTriggerModified, Boolean jcrContentTriggerOnOffTime, Boolean jcrContentTriggerReceive, Boolean jcrContentTriggerSpecific, String jcrContentUserId, String jcrPrimaryType, String operation) throws Exception {
        postAgent(request, runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation);
        return ok();

    }

    public abstract void postAgent(Http.Request request, String runmode, String name, Boolean jcrContentCqDistribute, String jcrContentCqDistributeAtTypeHint, String jcrContentCqName, String jcrContentCqTemplate, Boolean jcrContentAliasUpdate, Boolean jcrContentEnabled, String jcrContentJcrDescription, String jcrContentJcrLastModified, String jcrContentJcrLastModifiedBy, String jcrContentJcrMixinTypes, String jcrContentJcrTitle, String jcrContentLogLevel, Boolean jcrContentNoStatusUpdate, Boolean jcrContentNoVersioning, BigDecimal jcrContentProtocolConnectTimeout, Boolean jcrContentProtocolHTTPConnectionClosed, String jcrContentProtocolHTTPExpired, List<String> jcrContentProtocolHTTPHeaders, String jcrContentProtocolHTTPHeadersAtTypeHint, String jcrContentProtocolHTTPMethod, Boolean jcrContentProtocolHTTPSRelaxed, String jcrContentProtocolInterface, BigDecimal jcrContentProtocolSocketTimeout, String jcrContentProtocolVersion, String jcrContentProxyNTLMDomain, String jcrContentProxyNTLMHost, String jcrContentProxyHost, String jcrContentProxyPassword, BigDecimal jcrContentProxyPort, String jcrContentProxyUser, BigDecimal jcrContentQueueBatchMaxSize, String jcrContentQueueBatchMode, BigDecimal jcrContentQueueBatchWaitTime, String jcrContentRetryDelay, Boolean jcrContentReverseReplication, String jcrContentSerializationType, String jcrContentSlingResourceType, String jcrContentSsl, String jcrContentTransportNTLMDomain, String jcrContentTransportNTLMHost, String jcrContentTransportPassword, String jcrContentTransportUri, String jcrContentTransportUser, Boolean jcrContentTriggerDistribute, Boolean jcrContentTriggerModified, Boolean jcrContentTriggerOnOffTime, Boolean jcrContentTriggerReceive, Boolean jcrContentTriggerSpecific, String jcrContentUserId, String jcrPrimaryType, String operation) throws Exception;

    public Result postAuthorizableKeystoreHttp(Http.Request request, String intermediatePath, String authorizableId, String operation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, Http.MultipartFormData.FilePart<TemporaryFile> certChain, Http.MultipartFormData.FilePart<TemporaryFile> pk, Http.MultipartFormData.FilePart<TemporaryFile> keyStore) throws Exception {
        KeystoreInfo obj = postAuthorizableKeystore(request, intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract KeystoreInfo postAuthorizableKeystore(Http.Request request, String intermediatePath, String authorizableId, String operation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, Http.MultipartFormData.FilePart<TemporaryFile> certChain, Http.MultipartFormData.FilePart<TemporaryFile> pk, Http.MultipartFormData.FilePart<TemporaryFile> keyStore) throws Exception;

    public Result postAuthorizablesHttp(Http.Request request, @NotNull String authorizableId, @NotNull String intermediatePath, String createUser, String createGroup, String repPassword, String profileGivenName) throws Exception {
        String obj = postAuthorizables(request, authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String postAuthorizables(Http.Request request, @NotNull String authorizableId, @NotNull String intermediatePath, String createUser, String createGroup, String repPassword, String profileGivenName) throws Exception;

    public Result postConfigAdobeGraniteSamlAuthenticationHandlerHttp(Http.Request request, String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint) throws Exception {
        postConfigAdobeGraniteSamlAuthenticationHandler(request, keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);
        return ok();

    }

    public abstract void postConfigAdobeGraniteSamlAuthenticationHandler(Http.Request request, String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint) throws Exception;

    public Result postConfigApacheFelixJettyBasedHttpServiceHttp(Http.Request request, Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint) throws Exception {
        postConfigApacheFelixJettyBasedHttpService(request, orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint);
        return ok();

    }

    public abstract void postConfigApacheFelixJettyBasedHttpService(Http.Request request, Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint) throws Exception;

    public Result postConfigApacheHttpComponentsProxyConfigurationHttp(Http.Request request, String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint) throws Exception {
        postConfigApacheHttpComponentsProxyConfiguration(request, proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint);
        return ok();

    }

    public abstract void postConfigApacheHttpComponentsProxyConfiguration(Http.Request request, String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint) throws Exception;

    public Result postConfigApacheSlingDavExServletHttp(Http.Request request, String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint) throws Exception {
        postConfigApacheSlingDavExServlet(request, alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint);
        return ok();

    }

    public abstract void postConfigApacheSlingDavExServlet(Http.Request request, String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint) throws Exception;

    public Result postConfigApacheSlingGetServletHttp(Http.Request request, String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint) throws Exception {
        postConfigApacheSlingGetServlet(request, jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint);
        return ok();

    }

    public abstract void postConfigApacheSlingGetServlet(Http.Request request, String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint) throws Exception;

    public Result postConfigApacheSlingReferrerFilterHttp(Http.Request request, Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint) throws Exception {
        postConfigApacheSlingReferrerFilter(request, allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint);
        return ok();

    }

    public abstract void postConfigApacheSlingReferrerFilter(Http.Request request, Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint) throws Exception;

    public Result postConfigPropertyHttp(Http.Request request, String configNodeName) throws Exception {
        postConfigProperty(request, configNodeName);
        return ok();

    }

    public abstract void postConfigProperty(Http.Request request, String configNodeName) throws Exception;

    public Result postNodeHttp(Http.Request request, String path, String name, String operation, String deleteAuthorizable, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception {
        postNode(request, path, name, operation, deleteAuthorizable, _file);
        return ok();

    }

    public abstract void postNode(Http.Request request, String path, String name, String operation, String deleteAuthorizable, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception;

    public Result postNodeRwHttp(Http.Request request, String path, String name, String addMembers) throws Exception {
        postNodeRw(request, path, name, addMembers);
        return ok();

    }

    public abstract void postNodeRw(Http.Request request, String path, String name, String addMembers) throws Exception;

    public Result postPathHttp(Http.Request request, String path, @NotNull String jcrPrimaryType, @NotNull String name) throws Exception {
        postPath(request, path, jcrPrimaryType, name);
        return ok();

    }

    public abstract void postPath(Http.Request request, String path, @NotNull String jcrPrimaryType, @NotNull String name) throws Exception;

    public Result postQueryHttp(Http.Request request, @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue) throws Exception {
        String obj = postQuery(request, path, pLimit, _1property, _1propertyValue);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String postQuery(Http.Request request, @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue) throws Exception;

    public Result postTreeActivationHttp(Http.Request request, @NotNull Boolean ignoredeactivated, @NotNull Boolean onlymodified, @NotNull String path, @NotNull String cmd) throws Exception {
        postTreeActivation(request, ignoredeactivated, onlymodified, path, cmd);
        return ok();

    }

    public abstract void postTreeActivation(Http.Request request, @NotNull Boolean ignoredeactivated, @NotNull Boolean onlymodified, @NotNull String path, @NotNull String cmd) throws Exception;

    public Result postTruststoreHttp(Http.Request request, String operation, String newPassword, String rePassword, String keyStoreType, String removeAlias, Http.MultipartFormData.FilePart<TemporaryFile> certificate) throws Exception {
        String obj = postTruststore(request, operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String postTruststore(Http.Request request, String operation, String newPassword, String rePassword, String keyStoreType, String removeAlias, Http.MultipartFormData.FilePart<TemporaryFile> certificate) throws Exception;

    public Result postTruststorePKCS12Http(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> truststoreP12) throws Exception {
        String obj = postTruststorePKCS12(request, truststoreP12);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String postTruststorePKCS12(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> truststoreP12) throws Exception;

}
