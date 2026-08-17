package org.openapitools.api

import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class AppsApiController() {

    @Operation(
        summary = "",
        operationId = "postConfigAdobeGraniteSamlAuthenticationHandler",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"
        value = [PATH_POST_CONFIG_ADOBE_GRANITE_SAML_AUTHENTICATION_HANDLER]
    )
    fun postConfigAdobeGraniteSamlAuthenticationHandler(
        @Parameter(description = "") @Valid @RequestParam(value = "keyStorePassword", required = false) keyStorePassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "keyStorePassword@TypeHint", required = false) keyStorePasswordAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "service.ranking", required = false) serviceRanking: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "service.ranking@TypeHint", required = false) serviceRankingAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpHttpRedirect", required = false) idpHttpRedirect: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpHttpRedirect@TypeHint", required = false) idpHttpRedirectAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "createUser", required = false) createUser: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "createUser@TypeHint", required = false) createUserAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "defaultRedirectUrl", required = false) defaultRedirectUrl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "defaultRedirectUrl@TypeHint", required = false) defaultRedirectUrlAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "userIDAttribute", required = false) userIDAttribute: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "userIDAttribute@TypeHint", required = false) userIDAttributeAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "defaultGroups", required = false) defaultGroups: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "defaultGroups@TypeHint", required = false) defaultGroupsAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpCertAlias", required = false) idpCertAlias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpCertAlias@TypeHint", required = false) idpCertAliasAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "addGroupMemberships", required = false) addGroupMemberships: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "addGroupMemberships@TypeHint", required = false) addGroupMembershipsAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "path", required = false) path: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "path@TypeHint", required = false) pathAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "synchronizeAttributes", required = false) synchronizeAttributes: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "synchronizeAttributes@TypeHint", required = false) synchronizeAttributesAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "clockTolerance", required = false) clockTolerance: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "clockTolerance@TypeHint", required = false) clockToleranceAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "groupMembershipAttribute", required = false) groupMembershipAttribute: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "groupMembershipAttribute@TypeHint", required = false) groupMembershipAttributeAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpUrl", required = false) idpUrl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpUrl@TypeHint", required = false) idpUrlAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "logoutUrl", required = false) logoutUrl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "logoutUrl@TypeHint", required = false) logoutUrlAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "serviceProviderEntityId", required = false) serviceProviderEntityId: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "serviceProviderEntityId@TypeHint", required = false) serviceProviderEntityIdAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "assertionConsumerServiceURL", required = false) assertionConsumerServiceURL: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "assertionConsumerServiceURL@TypeHint", required = false) assertionConsumerServiceURLAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "handleLogout", required = false) handleLogout: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "handleLogout@TypeHint", required = false) handleLogoutAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "spPrivateKeyAlias", required = false) spPrivateKeyAlias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "spPrivateKeyAlias@TypeHint", required = false) spPrivateKeyAliasAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "useEncryption", required = false) useEncryption: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "useEncryption@TypeHint", required = false) useEncryptionAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "nameIdFormat", required = false) nameIdFormat: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "nameIdFormat@TypeHint", required = false) nameIdFormatAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "digestMethod", required = false) digestMethod: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "digestMethod@TypeHint", required = false) digestMethodAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "signatureMethod", required = false) signatureMethod: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "signatureMethod@TypeHint", required = false) signatureMethodAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "userIntermediatePath", required = false) userIntermediatePath: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "userIntermediatePath@TypeHint", required = false) userIntermediatePathAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigAemHealthCheckServlet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"
        value = [PATH_POST_CONFIG_AEM_HEALTH_CHECK_SERVLET]
    )
    fun postConfigAemHealthCheckServlet(
        @Parameter(description = "") @Valid @RequestParam(value = "bundles.ignored", required = false) bundlesIgnored: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "bundles.ignored@TypeHint", required = false) bundlesIgnoredAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigAemPasswordReset",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"
        value = [PATH_POST_CONFIG_AEM_PASSWORD_RESET]
    )
    fun postConfigAemPasswordReset(
        @Parameter(description = "") @Valid @RequestParam(value = "pwdreset.authorizables", required = false) pwdresetAuthorizables: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "pwdreset.authorizables@TypeHint", required = false) pwdresetAuthorizablesAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigApacheFelixJettyBasedHttpService",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/org.apache.felix.http"
        value = [PATH_POST_CONFIG_APACHE_FELIX_JETTY_BASED_HTTP_SERVICE]
    )
    fun postConfigApacheFelixJettyBasedHttpService(
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.nio", required = false) orgApacheFelixHttpsNio: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.nio@TypeHint", required = false) orgApacheFelixHttpsNioAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore", required = false) orgApacheFelixHttpsKeystore: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore@TypeHint", required = false) orgApacheFelixHttpsKeystoreAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore.password", required = false) orgApacheFelixHttpsKeystorePassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore.password@TypeHint", required = false) orgApacheFelixHttpsKeystorePasswordAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore.key", required = false) orgApacheFelixHttpsKeystoreKey: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore.key@TypeHint", required = false) orgApacheFelixHttpsKeystoreKeyAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore.key.password", required = false) orgApacheFelixHttpsKeystoreKeyPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.keystore.key.password@TypeHint", required = false) orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.truststore", required = false) orgApacheFelixHttpsTruststore: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.truststore@TypeHint", required = false) orgApacheFelixHttpsTruststoreAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.truststore.password", required = false) orgApacheFelixHttpsTruststorePassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.truststore.password@TypeHint", required = false) orgApacheFelixHttpsTruststorePasswordAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.clientcertificate", required = false) orgApacheFelixHttpsClientcertificate: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.clientcertificate@TypeHint", required = false) orgApacheFelixHttpsClientcertificateAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.enable", required = false) orgApacheFelixHttpsEnable: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.apache.felix.https.enable@TypeHint", required = false) orgApacheFelixHttpsEnableAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.osgi.service.http.port.secure", required = false) orgOsgiServiceHttpPortSecure: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "org.osgi.service.http.port.secure@TypeHint", required = false) orgOsgiServiceHttpPortSecureAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigApacheHttpComponentsProxyConfiguration",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/org.apache.http.proxyconfigurator.config"
        value = [PATH_POST_CONFIG_APACHE_HTTP_COMPONENTS_PROXY_CONFIGURATION]
    )
    fun postConfigApacheHttpComponentsProxyConfiguration(
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.host", required = false) proxyHost: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.host@TypeHint", required = false) proxyHostAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.port", required = false) proxyPort: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.port@TypeHint", required = false) proxyPortAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.exceptions", required = false) proxyExceptions: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.exceptions@TypeHint", required = false) proxyExceptionsAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.enabled", required = false) proxyEnabled: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.enabled@TypeHint", required = false) proxyEnabledAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.user", required = false) proxyUser: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.user@TypeHint", required = false) proxyUserAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.password", required = false) proxyPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "proxy.password@TypeHint", required = false) proxyPasswordAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigApacheSlingDavExServlet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"
        value = [PATH_POST_CONFIG_APACHE_SLING_DAV_EX_SERVLET]
    )
    fun postConfigApacheSlingDavExServlet(
        @Parameter(description = "") @Valid @RequestParam(value = "alias", required = false) alias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "alias@TypeHint", required = false) aliasAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "dav.create-absolute-uri", required = false) davCreateAbsoluteUri: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "dav.create-absolute-uri@TypeHint", required = false) davCreateAbsoluteUriAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigApacheSlingGetServlet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"
        value = [PATH_POST_CONFIG_APACHE_SLING_GET_SERVLET]
    )
    fun postConfigApacheSlingGetServlet(
        @Parameter(description = "") @Valid @RequestParam(value = "json.maximumresults", required = false) jsonMaximumresults: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "json.maximumresults@TypeHint", required = false) jsonMaximumresultsAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "enable.html", required = false) enableHtml: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "enable.html@TypeHint", required = false) enableHtmlAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "enable.txt", required = false) enableTxt: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "enable.txt@TypeHint", required = false) enableTxtAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "enable.xml", required = false) enableXml: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "enable.xml@TypeHint", required = false) enableXmlAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigApacheSlingReferrerFilter",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"
        value = [PATH_POST_CONFIG_APACHE_SLING_REFERRER_FILTER]
    )
    fun postConfigApacheSlingReferrerFilter(
        @Parameter(description = "") @Valid @RequestParam(value = "allow.empty", required = false) allowEmpty: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "allow.empty@TypeHint", required = false) allowEmptyAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "allow.hosts", required = false) allowHosts: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "allow.hosts@TypeHint", required = false) allowHostsAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "allow.hosts.regexp", required = false) allowHostsRegexp: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "allow.hosts.regexp@TypeHint", required = false) allowHostsRegexpAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "filter.methods", required = false) filterMethods: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "filter.methods@TypeHint", required = false) filterMethodsAtTypeHint: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postConfigProperty",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/apps/system/config/{configNodeName}"
        value = [PATH_POST_CONFIG_PROPERTY]
    )
    fun postConfigProperty(
        @Parameter(description = "", required = true) @PathVariable("configNodeName") configNodeName: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_POST_CONFIG_ADOBE_GRANITE_SAML_AUTHENTICATION_HANDLER: String = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"
        const val PATH_POST_CONFIG_AEM_HEALTH_CHECK_SERVLET: String = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"
        const val PATH_POST_CONFIG_AEM_PASSWORD_RESET: String = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"
        const val PATH_POST_CONFIG_APACHE_FELIX_JETTY_BASED_HTTP_SERVICE: String = "/apps/system/config/org.apache.felix.http"
        const val PATH_POST_CONFIG_APACHE_HTTP_COMPONENTS_PROXY_CONFIGURATION: String = "/apps/system/config/org.apache.http.proxyconfigurator.config"
        const val PATH_POST_CONFIG_APACHE_SLING_DAV_EX_SERVLET: String = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"
        const val PATH_POST_CONFIG_APACHE_SLING_GET_SERVLET: String = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"
        const val PATH_POST_CONFIG_APACHE_SLING_REFERRER_FILTER: String = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"
        const val PATH_POST_CONFIG_PROPERTY: String = "/apps/system/config/{configNodeName}"
    }
}
