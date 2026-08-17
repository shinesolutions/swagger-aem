package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.KeystoreInfo;
import org.openapitools.model.TruststoreInfo;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for SlingApi
 */
@MicronautTest
public class SlingApiTest {

    @Inject
    SlingApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteAgentTest() {
        // given
        String runmode = "example";
        String name = "example";

        // when
        api.deleteAgent(runmode, name).block();

        // then
        // TODO implement the deleteAgentTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteNodeTest() {
        // given
        String path = "example";
        String name = "example";

        // when
        api.deleteNode(path, name).block();

        // then
        // TODO implement the deleteNodeTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getAgentTest() {
        // given
        String runmode = "example";
        String name = "example";

        // when
        api.getAgent(runmode, name).block();

        // then
        // TODO implement the getAgentTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getAgentsTest() {
        // given
        String runmode = "example";

        // when
        String body = api.getAgents(runmode).block();

        // then
        // TODO implement the getAgentsTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getAuthorizableKeystoreTest() {
        // given
        String intermediatePath = "example";
        String authorizableId = "example";

        // when
        KeystoreInfo body = api.getAuthorizableKeystore(intermediatePath, authorizableId).block();

        // then
        // TODO implement the getAuthorizableKeystoreTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getKeystoreTest() {
        // given
        String intermediatePath = "example";
        String authorizableId = "example";

        // when
        File body = api.getKeystore(intermediatePath, authorizableId).block();

        // then
        // TODO implement the getKeystoreTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getNodeTest() {
        // given
        String path = "example";
        String name = "example";

        // when
        api.getNode(path, name).block();

        // then
        // TODO implement the getNodeTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPackageTest() {
        // given
        String group = "example";
        String name = "example";
        String version = "example";

        // when
        File body = api.getPackage(group, name, version).block();

        // then
        // TODO implement the getPackageTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPackageFilterTest() {
        // given
        String group = "example";
        String name = "example";
        String version = "example";

        // when
        String body = api.getPackageFilter(group, name, version).block();

        // then
        // TODO implement the getPackageFilterTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getQueryTest() {
        // given
        String path = "example";
        BigDecimal pLimit = new BigDecimal(78);
        String _1property = "example";
        String _1propertyValue = "example";

        // when
        String body = api.getQuery(path, pLimit, _1property, _1propertyValue).block();

        // then
        // TODO implement the getQueryTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getTruststoreTest() {
        // given

        // when
        File body = api.getTruststore().block();

        // then
        // TODO implement the getTruststoreTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getTruststoreInfoTest() {
        // given

        // when
        TruststoreInfo body = api.getTruststoreInfo().block();

        // then
        // TODO implement the getTruststoreInfoTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postAgentTest() {
        // given
        String runmode = "example";
        String name = "example";
        Boolean jcrContentCqDistribute = false;
        String jcrContentCqDistributeAtTypeHint = "example";
        String jcrContentCqName = "example";
        String jcrContentCqTemplate = "example";
        Boolean jcrContentAliasUpdate = false;
        Boolean jcrContentEnabled = false;
        String jcrContentJcrDescription = "example";
        String jcrContentJcrLastModified = "example";
        String jcrContentJcrLastModifiedBy = "example";
        String jcrContentJcrMixinTypes = "example";
        String jcrContentJcrTitle = "example";
        String jcrContentLogLevel = "example";
        Boolean jcrContentNoStatusUpdate = false;
        Boolean jcrContentNoVersioning = false;
        BigDecimal jcrContentProtocolConnectTimeout = new BigDecimal(78);
        Boolean jcrContentProtocolHTTPConnectionClosed = false;
        String jcrContentProtocolHTTPExpired = "example";
        List<String> jcrContentProtocolHTTPHeaders = Arrays.asList("example");
        String jcrContentProtocolHTTPHeadersAtTypeHint = "example";
        String jcrContentProtocolHTTPMethod = "example";
        Boolean jcrContentProtocolHTTPSRelaxed = false;
        String jcrContentProtocolInterface = "example";
        BigDecimal jcrContentProtocolSocketTimeout = new BigDecimal(78);
        String jcrContentProtocolVersion = "example";
        String jcrContentProxyNTLMDomain = "example";
        String jcrContentProxyNTLMHost = "example";
        String jcrContentProxyHost = "example";
        String jcrContentProxyPassword = "example";
        BigDecimal jcrContentProxyPort = new BigDecimal(78);
        String jcrContentProxyUser = "example";
        BigDecimal jcrContentQueueBatchMaxSize = new BigDecimal(78);
        String jcrContentQueueBatchMode = "example";
        BigDecimal jcrContentQueueBatchWaitTime = new BigDecimal(78);
        String jcrContentRetryDelay = "example";
        Boolean jcrContentReverseReplication = false;
        String jcrContentSerializationType = "example";
        String jcrContentSlingResourceType = "example";
        String jcrContentSsl = "example";
        String jcrContentTransportNTLMDomain = "example";
        String jcrContentTransportNTLMHost = "example";
        String jcrContentTransportPassword = "example";
        String jcrContentTransportUri = "example";
        String jcrContentTransportUser = "example";
        Boolean jcrContentTriggerDistribute = false;
        Boolean jcrContentTriggerModified = false;
        Boolean jcrContentTriggerOnOffTime = false;
        Boolean jcrContentTriggerReceive = false;
        Boolean jcrContentTriggerSpecific = false;
        String jcrContentUserId = "example";
        String jcrPrimaryType = "example";
        String operation = "example";

        // when
        api.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation).block();

        // then
        // TODO implement the postAgentTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postAuthorizableKeystoreTest() {
        // given
        String intermediatePath = "example";
        String authorizableId = "example";
        String operation = "example";
        String currentPassword = "example";
        String newPassword = "example";
        String rePassword = "example";
        String keyPassword = "example";
        String keyStorePass = "example";
        String alias = "example";
        String newAlias = "example";
        String removeAlias = "example";
        File certChain = null;
        File pk = null;
        File keyStore = null;

        // when
        KeystoreInfo body = api.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore).block();

        // then
        // TODO implement the postAuthorizableKeystoreTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postAuthorizablesTest() {
        // given
        String authorizableId = "example";
        String intermediatePath = "example";
        String createUser = "example";
        String createGroup = "example";
        String repPassword = "example";
        String profileGivenName = "example";

        // when
        String body = api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName).block();

        // then
        // TODO implement the postAuthorizablesTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigAdobeGraniteSamlAuthenticationHandlerTest() {
        // given
        String keyStorePassword = "example";
        String keyStorePasswordAtTypeHint = "example";
        Integer serviceRanking = 56;
        String serviceRankingAtTypeHint = "example";
        Boolean idpHttpRedirect = false;
        String idpHttpRedirectAtTypeHint = "example";
        Boolean createUser = false;
        String createUserAtTypeHint = "example";
        String defaultRedirectUrl = "example";
        String defaultRedirectUrlAtTypeHint = "example";
        String userIDAttribute = "example";
        String userIDAttributeAtTypeHint = "example";
        List<String> defaultGroups = Arrays.asList("example");
        String defaultGroupsAtTypeHint = "example";
        String idpCertAlias = "example";
        String idpCertAliasAtTypeHint = "example";
        Boolean addGroupMemberships = false;
        String addGroupMembershipsAtTypeHint = "example";
        List<String> path = Arrays.asList("example");
        String pathAtTypeHint = "example";
        List<String> synchronizeAttributes = Arrays.asList("example");
        String synchronizeAttributesAtTypeHint = "example";
        Integer clockTolerance = 56;
        String clockToleranceAtTypeHint = "example";
        String groupMembershipAttribute = "example";
        String groupMembershipAttributeAtTypeHint = "example";
        String idpUrl = "example";
        String idpUrlAtTypeHint = "example";
        String logoutUrl = "example";
        String logoutUrlAtTypeHint = "example";
        String serviceProviderEntityId = "example";
        String serviceProviderEntityIdAtTypeHint = "example";
        String assertionConsumerServiceURL = "example";
        String assertionConsumerServiceURLAtTypeHint = "example";
        Boolean handleLogout = false;
        String handleLogoutAtTypeHint = "example";
        String spPrivateKeyAlias = "example";
        String spPrivateKeyAliasAtTypeHint = "example";
        Boolean useEncryption = false;
        String useEncryptionAtTypeHint = "example";
        String nameIdFormat = "example";
        String nameIdFormatAtTypeHint = "example";
        String digestMethod = "example";
        String digestMethodAtTypeHint = "example";
        String signatureMethod = "example";
        String signatureMethodAtTypeHint = "example";
        String userIntermediatePath = "example";
        String userIntermediatePathAtTypeHint = "example";

        // when
        api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint).block();

        // then
        // TODO implement the postConfigAdobeGraniteSamlAuthenticationHandlerTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigApacheFelixJettyBasedHttpServiceTest() {
        // given
        Boolean orgApacheFelixHttpsNio = false;
        String orgApacheFelixHttpsNioAtTypeHint = "example";
        String orgApacheFelixHttpsKeystore = "example";
        String orgApacheFelixHttpsKeystoreAtTypeHint = "example";
        String orgApacheFelixHttpsKeystorePassword = "example";
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint = "example";
        String orgApacheFelixHttpsKeystoreKey = "example";
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint = "example";
        String orgApacheFelixHttpsKeystoreKeyPassword = "example";
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = "example";
        String orgApacheFelixHttpsTruststore = "example";
        String orgApacheFelixHttpsTruststoreAtTypeHint = "example";
        String orgApacheFelixHttpsTruststorePassword = "example";
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint = "example";
        String orgApacheFelixHttpsClientcertificate = "example";
        String orgApacheFelixHttpsClientcertificateAtTypeHint = "example";
        Boolean orgApacheFelixHttpsEnable = false;
        String orgApacheFelixHttpsEnableAtTypeHint = "example";
        String orgOsgiServiceHttpPortSecure = "example";
        String orgOsgiServiceHttpPortSecureAtTypeHint = "example";

        // when
        api.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint).block();

        // then
        // TODO implement the postConfigApacheFelixJettyBasedHttpServiceTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigApacheHttpComponentsProxyConfigurationTest() {
        // given
        String proxyHost = "example";
        String proxyHostAtTypeHint = "example";
        Integer proxyPort = 56;
        String proxyPortAtTypeHint = "example";
        List<String> proxyExceptions = Arrays.asList("example");
        String proxyExceptionsAtTypeHint = "example";
        Boolean proxyEnabled = false;
        String proxyEnabledAtTypeHint = "example";
        String proxyUser = "example";
        String proxyUserAtTypeHint = "example";
        String proxyPassword = "example";
        String proxyPasswordAtTypeHint = "example";

        // when
        api.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint).block();

        // then
        // TODO implement the postConfigApacheHttpComponentsProxyConfigurationTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigApacheSlingDavExServletTest() {
        // given
        String alias = "example";
        String aliasAtTypeHint = "example";
        Boolean davCreateAbsoluteUri = false;
        String davCreateAbsoluteUriAtTypeHint = "example";

        // when
        api.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint).block();

        // then
        // TODO implement the postConfigApacheSlingDavExServletTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigApacheSlingGetServletTest() {
        // given
        String jsonMaximumresults = "example";
        String jsonMaximumresultsAtTypeHint = "example";
        Boolean enableHtml = false;
        String enableHtmlAtTypeHint = "example";
        Boolean enableTxt = false;
        String enableTxtAtTypeHint = "example";
        Boolean enableXml = false;
        String enableXmlAtTypeHint = "example";

        // when
        api.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint).block();

        // then
        // TODO implement the postConfigApacheSlingGetServletTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigApacheSlingReferrerFilterTest() {
        // given
        Boolean allowEmpty = false;
        String allowEmptyAtTypeHint = "example";
        String allowHosts = "example";
        String allowHostsAtTypeHint = "example";
        String allowHostsRegexp = "example";
        String allowHostsRegexpAtTypeHint = "example";
        String filterMethods = "example";
        String filterMethodsAtTypeHint = "example";

        // when
        api.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint).block();

        // then
        // TODO implement the postConfigApacheSlingReferrerFilterTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigPropertyTest() {
        // given
        String configNodeName = "example";

        // when
        api.postConfigProperty(configNodeName).block();

        // then
        // TODO implement the postConfigPropertyTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postNodeTest() {
        // given
        String path = "example";
        String name = "example";
        String operation = "example";
        String deleteAuthorizable = "example";
        File _file = null;

        // when
        api.postNode(path, name, operation, deleteAuthorizable, _file).block();

        // then
        // TODO implement the postNodeTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postNodeRwTest() {
        // given
        String path = "example";
        String name = "example";
        String addMembers = "example";

        // when
        api.postNodeRw(path, name, addMembers).block();

        // then
        // TODO implement the postNodeRwTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postPathTest() {
        // given
        String path = "example";
        String jcrPrimaryType = "example";
        String name = "example";

        // when
        api.postPath(path, jcrPrimaryType, name).block();

        // then
        // TODO implement the postPathTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postQueryTest() {
        // given
        String path = "example";
        BigDecimal pLimit = new BigDecimal(78);
        String _1property = "example";
        String _1propertyValue = "example";

        // when
        String body = api.postQuery(path, pLimit, _1property, _1propertyValue).block();

        // then
        // TODO implement the postQueryTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postTreeActivationTest() {
        // given
        Boolean ignoredeactivated = false;
        Boolean onlymodified = false;
        String path = "example";
        String cmd = "activate";

        // when
        api.postTreeActivation(ignoredeactivated, onlymodified, path, cmd).block();

        // then
        // TODO implement the postTreeActivationTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postTruststoreTest() {
        // given
        String operation = "example";
        String newPassword = "example";
        String rePassword = "example";
        String keyStoreType = "example";
        String removeAlias = "example";
        File certificate = null;

        // when
        String body = api.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate).block();

        // then
        // TODO implement the postTruststoreTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postTruststorePKCS12Test() {
        // given
        File truststoreP12 = null;

        // when
        String body = api.postTruststorePKCS12(truststoreP12).block();

        // then
        // TODO implement the postTruststorePKCS12Test()
    }

    
}
