package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.KeystoreInfo
import org.openapitools.server.api.model.TruststoreInfo

@MiskTest(startService = true)
internal class SlingApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var slingApi: SlingApiAction

    /**
     * To test SlingApiAction.deleteAgent
     */
    @Test
    fun `should handle deleteAgent`() {
        val runmode = TODO()
        val name = TODO()
        val response = slingApi.deleteAgent(runmode, name)
    }

    /**
     * To test SlingApiAction.deleteNode
     */
    @Test
    fun `should handle deleteNode`() {
        val path = TODO()
        val name = TODO()
        val response = slingApi.deleteNode(path, name)
    }

    /**
     * To test SlingApiAction.getAgent
     */
    @Test
    fun `should handle getAgent`() {
        val runmode = TODO()
        val name = TODO()
        val response = slingApi.getAgent(runmode, name)
    }

    /**
     * To test SlingApiAction.getAgents
     */
    @Test
    fun `should handle getAgents`() {
        val runmode = TODO()
        val response: kotlin.String = slingApi.getAgents(runmode)
    }

    /**
     * To test SlingApiAction.getAuthorizableKeystore
     */
    @Test
    fun `should handle getAuthorizableKeystore`() {
        val intermediatePath = TODO()
        val authorizableId = TODO()
        val response: KeystoreInfo = slingApi.getAuthorizableKeystore(intermediatePath, authorizableId)
    }

    /**
     * To test SlingApiAction.getKeystore
     */
    @Test
    fun `should handle getKeystore`() {
        val intermediatePath = TODO()
        val authorizableId = TODO()
        val response: java.io.File = slingApi.getKeystore(intermediatePath, authorizableId)
    }

    /**
     * To test SlingApiAction.getNode
     */
    @Test
    fun `should handle getNode`() {
        val path = TODO()
        val name = TODO()
        val response = slingApi.getNode(path, name)
    }

    /**
     * To test SlingApiAction.getPackage
     */
    @Test
    fun `should handle getPackage`() {
        val group = TODO()
        val name = TODO()
        val version = TODO()
        val response: java.io.File = slingApi.getPackage(group, name, version)
    }

    /**
     * To test SlingApiAction.getPackageFilter
     */
    @Test
    fun `should handle getPackageFilter`() {
        val group = TODO()
        val name = TODO()
        val version = TODO()
        val response: kotlin.String = slingApi.getPackageFilter(group, name, version)
    }

    /**
     * To test SlingApiAction.getQuery
     */
    @Test
    fun `should handle getQuery`() {
        val path = TODO()
        val pLimit = TODO()
        val `1property` = TODO()
        val `1propertyValue` = TODO()
        val response: kotlin.String = slingApi.getQuery(path, pLimit, `1property`, `1propertyValue`)
    }

    /**
     * To test SlingApiAction.getTruststore
     */
    @Test
    fun `should handle getTruststore`() {
        val response: java.io.File = slingApi.getTruststore()
    }

    /**
     * To test SlingApiAction.getTruststoreInfo
     */
    @Test
    fun `should handle getTruststoreInfo`() {
        val response: TruststoreInfo = slingApi.getTruststoreInfo()
    }

    /**
     * To test SlingApiAction.postAgent
     */
    @Test
    fun `should handle postAgent`() {
        val runmode = TODO()
        val name = TODO()
        val jcrContentCqDistribute = TODO()
        val jcrContentCqDistributeAtTypeHint = TODO()
        val jcrContentCqName = TODO()
        val jcrContentCqTemplate = TODO()
        val jcrContentAliasUpdate = TODO()
        val jcrContentEnabled = TODO()
        val jcrContentJcrDescription = TODO()
        val jcrContentJcrLastModified = TODO()
        val jcrContentJcrLastModifiedBy = TODO()
        val jcrContentJcrMixinTypes = TODO()
        val jcrContentJcrTitle = TODO()
        val jcrContentLogLevel = TODO()
        val jcrContentNoStatusUpdate = TODO()
        val jcrContentNoVersioning = TODO()
        val jcrContentProtocolConnectTimeout = TODO()
        val jcrContentProtocolHTTPConnectionClosed = TODO()
        val jcrContentProtocolHTTPExpired = TODO()
        val jcrContentProtocolHTTPHeaders = TODO()
        val jcrContentProtocolHTTPHeadersAtTypeHint = TODO()
        val jcrContentProtocolHTTPMethod = TODO()
        val jcrContentProtocolHTTPSRelaxed = TODO()
        val jcrContentProtocolInterface = TODO()
        val jcrContentProtocolSocketTimeout = TODO()
        val jcrContentProtocolVersion = TODO()
        val jcrContentProxyNTLMDomain = TODO()
        val jcrContentProxyNTLMHost = TODO()
        val jcrContentProxyHost = TODO()
        val jcrContentProxyPassword = TODO()
        val jcrContentProxyPort = TODO()
        val jcrContentProxyUser = TODO()
        val jcrContentQueueBatchMaxSize = TODO()
        val jcrContentQueueBatchMode = TODO()
        val jcrContentQueueBatchWaitTime = TODO()
        val jcrContentRetryDelay = TODO()
        val jcrContentReverseReplication = TODO()
        val jcrContentSerializationType = TODO()
        val jcrContentSlingResourceType = TODO()
        val jcrContentSsl = TODO()
        val jcrContentTransportNTLMDomain = TODO()
        val jcrContentTransportNTLMHost = TODO()
        val jcrContentTransportPassword = TODO()
        val jcrContentTransportUri = TODO()
        val jcrContentTransportUser = TODO()
        val jcrContentTriggerDistribute = TODO()
        val jcrContentTriggerModified = TODO()
        val jcrContentTriggerOnOffTime = TODO()
        val jcrContentTriggerReceive = TODO()
        val jcrContentTriggerSpecific = TODO()
        val jcrContentUserId = TODO()
        val jcrPrimaryType = TODO()
        val operation = TODO()
        val response = slingApi.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)
    }

    /**
     * To test SlingApiAction.postAuthorizableKeystore
     */
    @Test
    fun `should handle postAuthorizableKeystore`() {
        val intermediatePath = TODO()
        val authorizableId = TODO()
        val operation = TODO()
        val currentPassword = TODO()
        val newPassword = TODO()
        val rePassword = TODO()
        val keyPassword = TODO()
        val keyStorePass = TODO()
        val alias = TODO()
        val newAlias = TODO()
        val removeAlias = TODO()
        val certChain = TODO()
        val pk = TODO()
        val keyStore = TODO()
        val response: KeystoreInfo = slingApi.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)
    }

    /**
     * To test SlingApiAction.postAuthorizables
     */
    @Test
    fun `should handle postAuthorizables`() {
        val authorizableId = TODO()
        val intermediatePath = TODO()
        val createUser = TODO()
        val createGroup = TODO()
        val repPassword = TODO()
        val profileGivenName = TODO()
        val response: kotlin.String = slingApi.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)
    }

    /**
     * To test SlingApiAction.postConfigAdobeGraniteSamlAuthenticationHandler
     */
    @Test
    fun `should handle postConfigAdobeGraniteSamlAuthenticationHandler`() {
        val keyStorePassword = TODO()
        val keyStorePasswordAtTypeHint = TODO()
        val serviceRanking = TODO()
        val serviceRankingAtTypeHint = TODO()
        val idpHttpRedirect = TODO()
        val idpHttpRedirectAtTypeHint = TODO()
        val createUser = TODO()
        val createUserAtTypeHint = TODO()
        val defaultRedirectUrl = TODO()
        val defaultRedirectUrlAtTypeHint = TODO()
        val userIDAttribute = TODO()
        val userIDAttributeAtTypeHint = TODO()
        val defaultGroups = TODO()
        val defaultGroupsAtTypeHint = TODO()
        val idpCertAlias = TODO()
        val idpCertAliasAtTypeHint = TODO()
        val addGroupMemberships = TODO()
        val addGroupMembershipsAtTypeHint = TODO()
        val path = TODO()
        val pathAtTypeHint = TODO()
        val synchronizeAttributes = TODO()
        val synchronizeAttributesAtTypeHint = TODO()
        val clockTolerance = TODO()
        val clockToleranceAtTypeHint = TODO()
        val groupMembershipAttribute = TODO()
        val groupMembershipAttributeAtTypeHint = TODO()
        val idpUrl = TODO()
        val idpUrlAtTypeHint = TODO()
        val logoutUrl = TODO()
        val logoutUrlAtTypeHint = TODO()
        val serviceProviderEntityId = TODO()
        val serviceProviderEntityIdAtTypeHint = TODO()
        val assertionConsumerServiceURL = TODO()
        val assertionConsumerServiceURLAtTypeHint = TODO()
        val handleLogout = TODO()
        val handleLogoutAtTypeHint = TODO()
        val spPrivateKeyAlias = TODO()
        val spPrivateKeyAliasAtTypeHint = TODO()
        val useEncryption = TODO()
        val useEncryptionAtTypeHint = TODO()
        val nameIdFormat = TODO()
        val nameIdFormatAtTypeHint = TODO()
        val digestMethod = TODO()
        val digestMethodAtTypeHint = TODO()
        val signatureMethod = TODO()
        val signatureMethodAtTypeHint = TODO()
        val userIntermediatePath = TODO()
        val userIntermediatePathAtTypeHint = TODO()
        val response = slingApi.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)
    }

    /**
     * To test SlingApiAction.postConfigApacheFelixJettyBasedHttpService
     */
    @Test
    fun `should handle postConfigApacheFelixJettyBasedHttpService`() {
        val orgApacheFelixHttpsNio = TODO()
        val orgApacheFelixHttpsNioAtTypeHint = TODO()
        val orgApacheFelixHttpsKeystore = TODO()
        val orgApacheFelixHttpsKeystoreAtTypeHint = TODO()
        val orgApacheFelixHttpsKeystorePassword = TODO()
        val orgApacheFelixHttpsKeystorePasswordAtTypeHint = TODO()
        val orgApacheFelixHttpsKeystoreKey = TODO()
        val orgApacheFelixHttpsKeystoreKeyAtTypeHint = TODO()
        val orgApacheFelixHttpsKeystoreKeyPassword = TODO()
        val orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = TODO()
        val orgApacheFelixHttpsTruststore = TODO()
        val orgApacheFelixHttpsTruststoreAtTypeHint = TODO()
        val orgApacheFelixHttpsTruststorePassword = TODO()
        val orgApacheFelixHttpsTruststorePasswordAtTypeHint = TODO()
        val orgApacheFelixHttpsClientcertificate = TODO()
        val orgApacheFelixHttpsClientcertificateAtTypeHint = TODO()
        val orgApacheFelixHttpsEnable = TODO()
        val orgApacheFelixHttpsEnableAtTypeHint = TODO()
        val orgOsgiServiceHttpPortSecure = TODO()
        val orgOsgiServiceHttpPortSecureAtTypeHint = TODO()
        val response = slingApi.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)
    }

    /**
     * To test SlingApiAction.postConfigApacheHttpComponentsProxyConfiguration
     */
    @Test
    fun `should handle postConfigApacheHttpComponentsProxyConfiguration`() {
        val proxyHost = TODO()
        val proxyHostAtTypeHint = TODO()
        val proxyPort = TODO()
        val proxyPortAtTypeHint = TODO()
        val proxyExceptions = TODO()
        val proxyExceptionsAtTypeHint = TODO()
        val proxyEnabled = TODO()
        val proxyEnabledAtTypeHint = TODO()
        val proxyUser = TODO()
        val proxyUserAtTypeHint = TODO()
        val proxyPassword = TODO()
        val proxyPasswordAtTypeHint = TODO()
        val response = slingApi.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)
    }

    /**
     * To test SlingApiAction.postConfigApacheSlingDavExServlet
     */
    @Test
    fun `should handle postConfigApacheSlingDavExServlet`() {
        val alias = TODO()
        val aliasAtTypeHint = TODO()
        val davCreateAbsoluteUri = TODO()
        val davCreateAbsoluteUriAtTypeHint = TODO()
        val response = slingApi.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)
    }

    /**
     * To test SlingApiAction.postConfigApacheSlingGetServlet
     */
    @Test
    fun `should handle postConfigApacheSlingGetServlet`() {
        val jsonMaximumresults = TODO()
        val jsonMaximumresultsAtTypeHint = TODO()
        val enableHtml = TODO()
        val enableHtmlAtTypeHint = TODO()
        val enableTxt = TODO()
        val enableTxtAtTypeHint = TODO()
        val enableXml = TODO()
        val enableXmlAtTypeHint = TODO()
        val response = slingApi.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)
    }

    /**
     * To test SlingApiAction.postConfigApacheSlingReferrerFilter
     */
    @Test
    fun `should handle postConfigApacheSlingReferrerFilter`() {
        val allowEmpty = TODO()
        val allowEmptyAtTypeHint = TODO()
        val allowHosts = TODO()
        val allowHostsAtTypeHint = TODO()
        val allowHostsRegexp = TODO()
        val allowHostsRegexpAtTypeHint = TODO()
        val filterMethods = TODO()
        val filterMethodsAtTypeHint = TODO()
        val response = slingApi.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)
    }

    /**
     * To test SlingApiAction.postConfigProperty
     */
    @Test
    fun `should handle postConfigProperty`() {
        val configNodeName = TODO()
        val response = slingApi.postConfigProperty(configNodeName)
    }

    /**
     * To test SlingApiAction.postNode
     */
    @Test
    fun `should handle postNode`() {
        val path = TODO()
        val name = TODO()
        val operation = TODO()
        val deleteAuthorizable = TODO()
        val file = TODO()
        val response = slingApi.postNode(path, name, operation, deleteAuthorizable, file)
    }

    /**
     * To test SlingApiAction.postNodeRw
     */
    @Test
    fun `should handle postNodeRw`() {
        val path = TODO()
        val name = TODO()
        val addMembers = TODO()
        val response = slingApi.postNodeRw(path, name, addMembers)
    }

    /**
     * To test SlingApiAction.postPath
     */
    @Test
    fun `should handle postPath`() {
        val path = TODO()
        val jcrPrimaryType = TODO()
        val name = TODO()
        val response = slingApi.postPath(path, jcrPrimaryType, name)
    }

    /**
     * To test SlingApiAction.postQuery
     */
    @Test
    fun `should handle postQuery`() {
        val path = TODO()
        val pLimit = TODO()
        val `1property` = TODO()
        val `1propertyValue` = TODO()
        val response: kotlin.String = slingApi.postQuery(path, pLimit, `1property`, `1propertyValue`)
    }

    /**
     * To test SlingApiAction.postTreeActivation
     */
    @Test
    fun `should handle postTreeActivation`() {
        val ignoredeactivated = TODO()
        val onlymodified = TODO()
        val path = TODO()
        val cmd = TODO()
        val response = slingApi.postTreeActivation(ignoredeactivated, onlymodified, path, cmd)
    }

    /**
     * To test SlingApiAction.postTruststore
     */
    @Test
    fun `should handle postTruststore`() {
        val operation = TODO()
        val newPassword = TODO()
        val rePassword = TODO()
        val keyStoreType = TODO()
        val removeAlias = TODO()
        val certificate = TODO()
        val response: kotlin.String = slingApi.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)
    }

    /**
     * To test SlingApiAction.postTruststorePKCS12
     */
    @Test
    fun `should handle postTruststorePKCS12`() {
        val truststoreP12 = TODO()
        val response: kotlin.String = slingApi.postTruststorePKCS12(truststoreP12)
    }
}
