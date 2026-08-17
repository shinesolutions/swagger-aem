package org.openapitools.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AppsApiTest {

    private val api: AppsApiController = AppsApiController()

    /**
     * To test AppsApiController.postConfigAdobeGraniteSamlAuthenticationHandler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigAdobeGraniteSamlAuthenticationHandlerTest() {
        val keyStorePassword: kotlin.String? = TODO()
        val keyStorePasswordAtTypeHint: kotlin.String? = TODO()
        val serviceRanking: kotlin.Int? = TODO()
        val serviceRankingAtTypeHint: kotlin.String? = TODO()
        val idpHttpRedirect: kotlin.Boolean? = TODO()
        val idpHttpRedirectAtTypeHint: kotlin.String? = TODO()
        val createUser: kotlin.Boolean? = TODO()
        val createUserAtTypeHint: kotlin.String? = TODO()
        val defaultRedirectUrl: kotlin.String? = TODO()
        val defaultRedirectUrlAtTypeHint: kotlin.String? = TODO()
        val userIDAttribute: kotlin.String? = TODO()
        val userIDAttributeAtTypeHint: kotlin.String? = TODO()
        val defaultGroups: kotlin.collections.List<kotlin.String>? = TODO()
        val defaultGroupsAtTypeHint: kotlin.String? = TODO()
        val idpCertAlias: kotlin.String? = TODO()
        val idpCertAliasAtTypeHint: kotlin.String? = TODO()
        val addGroupMemberships: kotlin.Boolean? = TODO()
        val addGroupMembershipsAtTypeHint: kotlin.String? = TODO()
        val path: kotlin.collections.List<kotlin.String>? = TODO()
        val pathAtTypeHint: kotlin.String? = TODO()
        val synchronizeAttributes: kotlin.collections.List<kotlin.String>? = TODO()
        val synchronizeAttributesAtTypeHint: kotlin.String? = TODO()
        val clockTolerance: kotlin.Int? = TODO()
        val clockToleranceAtTypeHint: kotlin.String? = TODO()
        val groupMembershipAttribute: kotlin.String? = TODO()
        val groupMembershipAttributeAtTypeHint: kotlin.String? = TODO()
        val idpUrl: kotlin.String? = TODO()
        val idpUrlAtTypeHint: kotlin.String? = TODO()
        val logoutUrl: kotlin.String? = TODO()
        val logoutUrlAtTypeHint: kotlin.String? = TODO()
        val serviceProviderEntityId: kotlin.String? = TODO()
        val serviceProviderEntityIdAtTypeHint: kotlin.String? = TODO()
        val assertionConsumerServiceURL: kotlin.String? = TODO()
        val assertionConsumerServiceURLAtTypeHint: kotlin.String? = TODO()
        val handleLogout: kotlin.Boolean? = TODO()
        val handleLogoutAtTypeHint: kotlin.String? = TODO()
        val spPrivateKeyAlias: kotlin.String? = TODO()
        val spPrivateKeyAliasAtTypeHint: kotlin.String? = TODO()
        val useEncryption: kotlin.Boolean? = TODO()
        val useEncryptionAtTypeHint: kotlin.String? = TODO()
        val nameIdFormat: kotlin.String? = TODO()
        val nameIdFormatAtTypeHint: kotlin.String? = TODO()
        val digestMethod: kotlin.String? = TODO()
        val digestMethodAtTypeHint: kotlin.String? = TODO()
        val signatureMethod: kotlin.String? = TODO()
        val signatureMethodAtTypeHint: kotlin.String? = TODO()
        val userIntermediatePath: kotlin.String? = TODO()
        val userIntermediatePathAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigAemHealthCheckServlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigAemHealthCheckServletTest() {
        val bundlesIgnored: kotlin.collections.List<kotlin.String>? = TODO()
        val bundlesIgnoredAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigAemPasswordReset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigAemPasswordResetTest() {
        val pwdresetAuthorizables: kotlin.collections.List<kotlin.String>? = TODO()
        val pwdresetAuthorizablesAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigApacheFelixJettyBasedHttpService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigApacheFelixJettyBasedHttpServiceTest() {
        val orgApacheFelixHttpsNio: kotlin.Boolean? = TODO()
        val orgApacheFelixHttpsNioAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystore: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystoreAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystorePassword: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystorePasswordAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystoreKey: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystoreKeyAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystoreKeyPassword: kotlin.String? = TODO()
        val orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsTruststore: kotlin.String? = TODO()
        val orgApacheFelixHttpsTruststoreAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsTruststorePassword: kotlin.String? = TODO()
        val orgApacheFelixHttpsTruststorePasswordAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsClientcertificate: kotlin.String? = TODO()
        val orgApacheFelixHttpsClientcertificateAtTypeHint: kotlin.String? = TODO()
        val orgApacheFelixHttpsEnable: kotlin.Boolean? = TODO()
        val orgApacheFelixHttpsEnableAtTypeHint: kotlin.String? = TODO()
        val orgOsgiServiceHttpPortSecure: kotlin.String? = TODO()
        val orgOsgiServiceHttpPortSecureAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigApacheHttpComponentsProxyConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigApacheHttpComponentsProxyConfigurationTest() {
        val proxyHost: kotlin.String? = TODO()
        val proxyHostAtTypeHint: kotlin.String? = TODO()
        val proxyPort: kotlin.Int? = TODO()
        val proxyPortAtTypeHint: kotlin.String? = TODO()
        val proxyExceptions: kotlin.collections.List<kotlin.String>? = TODO()
        val proxyExceptionsAtTypeHint: kotlin.String? = TODO()
        val proxyEnabled: kotlin.Boolean? = TODO()
        val proxyEnabledAtTypeHint: kotlin.String? = TODO()
        val proxyUser: kotlin.String? = TODO()
        val proxyUserAtTypeHint: kotlin.String? = TODO()
        val proxyPassword: kotlin.String? = TODO()
        val proxyPasswordAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigApacheSlingDavExServlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigApacheSlingDavExServletTest() {
        val alias: kotlin.String? = TODO()
        val aliasAtTypeHint: kotlin.String? = TODO()
        val davCreateAbsoluteUri: kotlin.Boolean? = TODO()
        val davCreateAbsoluteUriAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigApacheSlingGetServlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigApacheSlingGetServletTest() {
        val jsonMaximumresults: kotlin.String? = TODO()
        val jsonMaximumresultsAtTypeHint: kotlin.String? = TODO()
        val enableHtml: kotlin.Boolean? = TODO()
        val enableHtmlAtTypeHint: kotlin.String? = TODO()
        val enableTxt: kotlin.Boolean? = TODO()
        val enableTxtAtTypeHint: kotlin.String? = TODO()
        val enableXml: kotlin.Boolean? = TODO()
        val enableXmlAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigApacheSlingReferrerFilter
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigApacheSlingReferrerFilterTest() {
        val allowEmpty: kotlin.Boolean? = TODO()
        val allowEmptyAtTypeHint: kotlin.String? = TODO()
        val allowHosts: kotlin.String? = TODO()
        val allowHostsAtTypeHint: kotlin.String? = TODO()
        val allowHostsRegexp: kotlin.String? = TODO()
        val allowHostsRegexpAtTypeHint: kotlin.String? = TODO()
        val filterMethods: kotlin.String? = TODO()
        val filterMethodsAtTypeHint: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)

        // TODO: test validations
    }

    /**
     * To test AppsApiController.postConfigProperty
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postConfigPropertyTest() {
        val configNodeName: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postConfigProperty(configNodeName)

        // TODO: test validations
    }
}
