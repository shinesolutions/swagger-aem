package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.KeystoreInfo
import org.openapitools.server.api.model.TruststoreInfo

/**
* @TODO("Fill out implementation")
*/
@Singleton
class SlingApiAction @Inject constructor(
) : WebAction {

    @Delete("/etc/replication/agents.{runmode}/{name}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteAgent(
        @PathParam("runmode") runmode: kotlin.String, 
        @PathParam("name") name: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Delete("/{path}/{name}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteNode(
        @PathParam("path") path: kotlin.String, 
        @PathParam("name") name: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Get("/etc/replication/agents.{runmode}/{name}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAgent(
        @PathParam("runmode") runmode: kotlin.String, 
        @PathParam("name") name: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Get("/etc/replication/agents.{runmode}.-1.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAgents(
        @PathParam("runmode") runmode: kotlin.String
    ): kotlin.String {
        TODO()
    }

    @Get("/{intermediatePath}/{authorizableId}.ks.json")
    @Description("")
    @ResponseContentType(MediaTypes.TEXT_PLAIN_UTF8)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAuthorizableKeystore(
        @PathParam("intermediatePath") intermediatePath: kotlin.String, 
        @PathParam("authorizableId") authorizableId: kotlin.String
    ): KeystoreInfo {
        TODO()
    }

    @Get("/{intermediatePath}/{authorizableId}/keystore/store.p12")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getKeystore(
        @PathParam("intermediatePath") intermediatePath: kotlin.String, 
        @PathParam("authorizableId") authorizableId: kotlin.String
    ): java.io.File {
        TODO()
    }

    @Get("/{path}/{name}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getNode(
        @PathParam("path") path: kotlin.String, 
        @PathParam("name") name: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Get("/etc/packages/{group}/{name}-{version}.zip")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getPackage(
        @PathParam("group") group: kotlin.String, 
        @PathParam("name") name: kotlin.String, 
        @PathParam("version") version: kotlin.String
    ): java.io.File {
        TODO()
    }

    @Get("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getPackageFilter(
        @PathParam("group") group: kotlin.String, 
        @PathParam("name") name: kotlin.String, 
        @PathParam("version") version: kotlin.String
    ): kotlin.String {
        TODO()
    }

    @Get("/bin/querybuilder.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getQuery(
         @QueryParam(value = "path") path: kotlin.String, 
         @QueryParam(value = "p.limit") pLimit: java.math.BigDecimal, 
         @QueryParam(value = "1_property") `1property`: kotlin.String, 
         @QueryParam(value = "1_property.value") `1propertyValue`: kotlin.String
    ): kotlin.String {
        TODO()
    }

    @Get("/etc/truststore/truststore.p12")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getTruststore(
    ): java.io.File {
        TODO()
    }

    @Get("/libs/granite/security/truststore.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getTruststoreInfo(
    ): TruststoreInfo {
        TODO()
    }

    @Post("/etc/replication/agents.{runmode}/{name}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postAgent(
        @PathParam("runmode") runmode: kotlin.String, 
        @PathParam("name") name: kotlin.String, 
         @QueryParam(value = "jcr:content/cq:distribute") jcrContentCqDistribute: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/cq:distribute@TypeHint") jcrContentCqDistributeAtTypeHint: kotlin.String?, 
         @QueryParam(value = "jcr:content/cq:name") jcrContentCqName: kotlin.String?, 
         @QueryParam(value = "jcr:content/cq:template") jcrContentCqTemplate: kotlin.String?, 
         @QueryParam(value = "jcr:content/aliasUpdate") jcrContentAliasUpdate: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/enabled") jcrContentEnabled: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/jcr:description") jcrContentJcrDescription: kotlin.String?, 
         @QueryParam(value = "jcr:content/jcr:lastModified") jcrContentJcrLastModified: kotlin.String?, 
         @QueryParam(value = "jcr:content/jcr:lastModifiedBy") jcrContentJcrLastModifiedBy: kotlin.String?, 
         @QueryParam(value = "jcr:content/jcr:mixinTypes") jcrContentJcrMixinTypes: kotlin.String?, 
         @QueryParam(value = "jcr:content/jcr:title") jcrContentJcrTitle: kotlin.String?, 
         @QueryParam(value = "jcr:content/logLevel") jcrContentLogLevel: kotlin.String?, 
         @QueryParam(value = "jcr:content/noStatusUpdate") jcrContentNoStatusUpdate: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/noVersioning") jcrContentNoVersioning: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/protocolConnectTimeout") jcrContentProtocolConnectTimeout: java.math.BigDecimal?, 
         @QueryParam(value = "jcr:content/protocolHTTPConnectionClosed") jcrContentProtocolHTTPConnectionClosed: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/protocolHTTPExpired") jcrContentProtocolHTTPExpired: kotlin.String?, 
         @QueryParam(value = "jcr:content/protocolHTTPHeaders") jcrContentProtocolHTTPHeaders: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "jcr:content/protocolHTTPHeaders@TypeHint") jcrContentProtocolHTTPHeadersAtTypeHint: kotlin.String?, 
         @QueryParam(value = "jcr:content/protocolHTTPMethod") jcrContentProtocolHTTPMethod: kotlin.String?, 
         @QueryParam(value = "jcr:content/protocolHTTPSRelaxed") jcrContentProtocolHTTPSRelaxed: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/protocolInterface") jcrContentProtocolInterface: kotlin.String?, 
         @QueryParam(value = "jcr:content/protocolSocketTimeout") jcrContentProtocolSocketTimeout: java.math.BigDecimal?, 
         @QueryParam(value = "jcr:content/protocolVersion") jcrContentProtocolVersion: kotlin.String?, 
         @QueryParam(value = "jcr:content/proxyNTLMDomain") jcrContentProxyNTLMDomain: kotlin.String?, 
         @QueryParam(value = "jcr:content/proxyNTLMHost") jcrContentProxyNTLMHost: kotlin.String?, 
         @QueryParam(value = "jcr:content/proxyHost") jcrContentProxyHost: kotlin.String?, 
         @QueryParam(value = "jcr:content/proxyPassword") jcrContentProxyPassword: kotlin.String?, 
         @QueryParam(value = "jcr:content/proxyPort") jcrContentProxyPort: java.math.BigDecimal?, 
         @QueryParam(value = "jcr:content/proxyUser") jcrContentProxyUser: kotlin.String?, 
         @QueryParam(value = "jcr:content/queueBatchMaxSize") jcrContentQueueBatchMaxSize: java.math.BigDecimal?, 
         @QueryParam(value = "jcr:content/queueBatchMode") jcrContentQueueBatchMode: kotlin.String?, 
         @QueryParam(value = "jcr:content/queueBatchWaitTime") jcrContentQueueBatchWaitTime: java.math.BigDecimal?, 
         @QueryParam(value = "jcr:content/retryDelay") jcrContentRetryDelay: kotlin.String?, 
         @QueryParam(value = "jcr:content/reverseReplication") jcrContentReverseReplication: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/serializationType") jcrContentSerializationType: kotlin.String?, 
         @QueryParam(value = "jcr:content/sling:resourceType") jcrContentSlingResourceType: kotlin.String?, 
         @QueryParam(value = "jcr:content/ssl") jcrContentSsl: kotlin.String?, 
         @QueryParam(value = "jcr:content/transportNTLMDomain") jcrContentTransportNTLMDomain: kotlin.String?, 
         @QueryParam(value = "jcr:content/transportNTLMHost") jcrContentTransportNTLMHost: kotlin.String?, 
         @QueryParam(value = "jcr:content/transportPassword") jcrContentTransportPassword: kotlin.String?, 
         @QueryParam(value = "jcr:content/transportUri") jcrContentTransportUri: kotlin.String?, 
         @QueryParam(value = "jcr:content/transportUser") jcrContentTransportUser: kotlin.String?, 
         @QueryParam(value = "jcr:content/triggerDistribute") jcrContentTriggerDistribute: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/triggerModified") jcrContentTriggerModified: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/triggerOnOffTime") jcrContentTriggerOnOffTime: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/triggerReceive") jcrContentTriggerReceive: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/triggerSpecific") jcrContentTriggerSpecific: kotlin.Boolean?, 
         @QueryParam(value = "jcr:content/userId") jcrContentUserId: kotlin.String?, 
         @QueryParam(value = "jcr:primaryType") jcrPrimaryType: kotlin.String?, 
         @QueryParam(value = ":operation") operation: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/{intermediatePath}/{authorizableId}.ks.html")
    @Description("")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.TEXT_PLAIN_UTF8)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postAuthorizableKeystore(
        @PathParam("intermediatePath") intermediatePath: kotlin.String, 
        @PathParam("authorizableId") authorizableId: kotlin.String, 
         @QueryParam(value = ":operation") operation: kotlin.String?, 
         @QueryParam(value = "currentPassword") currentPassword: kotlin.String?, 
         @QueryParam(value = "newPassword") newPassword: kotlin.String?, 
         @QueryParam(value = "rePassword") rePassword: kotlin.String?, 
         @QueryParam(value = "keyPassword") keyPassword: kotlin.String?, 
         @QueryParam(value = "keyStorePass") keyStorePass: kotlin.String?, 
         @QueryParam(value = "alias") alias: kotlin.String?, 
         @QueryParam(value = "newAlias") newAlias: kotlin.String?, 
         @QueryParam(value = "removeAlias") removeAlias: kotlin.String?, 
        @Valid certChain: HttpCall, 
        @Valid pk: HttpCall, 
        @Valid keyStore: HttpCall
    ): KeystoreInfo {
        TODO()
    }

    @Post("/libs/granite/security/post/authorizables")
    @Description("")
    @ResponseContentType(MediaTypes.TEXT_HTML)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postAuthorizables(
         @QueryParam(value = "authorizableId") authorizableId: kotlin.String, 
         @QueryParam(value = "intermediatePath") intermediatePath: kotlin.String, 
         @QueryParam(value = "createUser") createUser: kotlin.String?, 
         @QueryParam(value = "createGroup") createGroup: kotlin.String?, 
         @QueryParam(value = "rep:password") repPassword: kotlin.String?, 
         @QueryParam(value = "profile/givenName") profileGivenName: kotlin.String?
    ): kotlin.String {
        TODO()
    }

    @Post("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigAdobeGraniteSamlAuthenticationHandler(
         @QueryParam(value = "keyStorePassword") keyStorePassword: kotlin.String?, 
         @QueryParam(value = "keyStorePassword@TypeHint") keyStorePasswordAtTypeHint: kotlin.String?, 
         @QueryParam(value = "service.ranking") serviceRanking: kotlin.Int?, 
         @QueryParam(value = "service.ranking@TypeHint") serviceRankingAtTypeHint: kotlin.String?, 
         @QueryParam(value = "idpHttpRedirect") idpHttpRedirect: kotlin.Boolean?, 
         @QueryParam(value = "idpHttpRedirect@TypeHint") idpHttpRedirectAtTypeHint: kotlin.String?, 
         @QueryParam(value = "createUser") createUser: kotlin.Boolean?, 
         @QueryParam(value = "createUser@TypeHint") createUserAtTypeHint: kotlin.String?, 
         @QueryParam(value = "defaultRedirectUrl") defaultRedirectUrl: kotlin.String?, 
         @QueryParam(value = "defaultRedirectUrl@TypeHint") defaultRedirectUrlAtTypeHint: kotlin.String?, 
         @QueryParam(value = "userIDAttribute") userIDAttribute: kotlin.String?, 
         @QueryParam(value = "userIDAttribute@TypeHint") userIDAttributeAtTypeHint: kotlin.String?, 
         @QueryParam(value = "defaultGroups") defaultGroups: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "defaultGroups@TypeHint") defaultGroupsAtTypeHint: kotlin.String?, 
         @QueryParam(value = "idpCertAlias") idpCertAlias: kotlin.String?, 
         @QueryParam(value = "idpCertAlias@TypeHint") idpCertAliasAtTypeHint: kotlin.String?, 
         @QueryParam(value = "addGroupMemberships") addGroupMemberships: kotlin.Boolean?, 
         @QueryParam(value = "addGroupMemberships@TypeHint") addGroupMembershipsAtTypeHint: kotlin.String?, 
         @QueryParam(value = "path") path: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "path@TypeHint") pathAtTypeHint: kotlin.String?, 
         @QueryParam(value = "synchronizeAttributes") synchronizeAttributes: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "synchronizeAttributes@TypeHint") synchronizeAttributesAtTypeHint: kotlin.String?, 
         @QueryParam(value = "clockTolerance") clockTolerance: kotlin.Int?, 
         @QueryParam(value = "clockTolerance@TypeHint") clockToleranceAtTypeHint: kotlin.String?, 
         @QueryParam(value = "groupMembershipAttribute") groupMembershipAttribute: kotlin.String?, 
         @QueryParam(value = "groupMembershipAttribute@TypeHint") groupMembershipAttributeAtTypeHint: kotlin.String?, 
         @QueryParam(value = "idpUrl") idpUrl: kotlin.String?, 
         @QueryParam(value = "idpUrl@TypeHint") idpUrlAtTypeHint: kotlin.String?, 
         @QueryParam(value = "logoutUrl") logoutUrl: kotlin.String?, 
         @QueryParam(value = "logoutUrl@TypeHint") logoutUrlAtTypeHint: kotlin.String?, 
         @QueryParam(value = "serviceProviderEntityId") serviceProviderEntityId: kotlin.String?, 
         @QueryParam(value = "serviceProviderEntityId@TypeHint") serviceProviderEntityIdAtTypeHint: kotlin.String?, 
         @QueryParam(value = "assertionConsumerServiceURL") assertionConsumerServiceURL: kotlin.String?, 
         @QueryParam(value = "assertionConsumerServiceURL@TypeHint") assertionConsumerServiceURLAtTypeHint: kotlin.String?, 
         @QueryParam(value = "handleLogout") handleLogout: kotlin.Boolean?, 
         @QueryParam(value = "handleLogout@TypeHint") handleLogoutAtTypeHint: kotlin.String?, 
         @QueryParam(value = "spPrivateKeyAlias") spPrivateKeyAlias: kotlin.String?, 
         @QueryParam(value = "spPrivateKeyAlias@TypeHint") spPrivateKeyAliasAtTypeHint: kotlin.String?, 
         @QueryParam(value = "useEncryption") useEncryption: kotlin.Boolean?, 
         @QueryParam(value = "useEncryption@TypeHint") useEncryptionAtTypeHint: kotlin.String?, 
         @QueryParam(value = "nameIdFormat") nameIdFormat: kotlin.String?, 
         @QueryParam(value = "nameIdFormat@TypeHint") nameIdFormatAtTypeHint: kotlin.String?, 
         @QueryParam(value = "digestMethod") digestMethod: kotlin.String?, 
         @QueryParam(value = "digestMethod@TypeHint") digestMethodAtTypeHint: kotlin.String?, 
         @QueryParam(value = "signatureMethod") signatureMethod: kotlin.String?, 
         @QueryParam(value = "signatureMethod@TypeHint") signatureMethodAtTypeHint: kotlin.String?, 
         @QueryParam(value = "userIntermediatePath") userIntermediatePath: kotlin.String?, 
         @QueryParam(value = "userIntermediatePath@TypeHint") userIntermediatePathAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/apps/system/config/org.apache.felix.http")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigApacheFelixJettyBasedHttpService(
         @QueryParam(value = "org.apache.felix.https.nio") orgApacheFelixHttpsNio: kotlin.Boolean?, 
         @QueryParam(value = "org.apache.felix.https.nio@TypeHint") orgApacheFelixHttpsNioAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore") orgApacheFelixHttpsKeystore: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore@TypeHint") orgApacheFelixHttpsKeystoreAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore.password") orgApacheFelixHttpsKeystorePassword: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore.password@TypeHint") orgApacheFelixHttpsKeystorePasswordAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore.key") orgApacheFelixHttpsKeystoreKey: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore.key@TypeHint") orgApacheFelixHttpsKeystoreKeyAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore.key.password") orgApacheFelixHttpsKeystoreKeyPassword: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.keystore.key.password@TypeHint") orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.truststore") orgApacheFelixHttpsTruststore: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.truststore@TypeHint") orgApacheFelixHttpsTruststoreAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.truststore.password") orgApacheFelixHttpsTruststorePassword: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.truststore.password@TypeHint") orgApacheFelixHttpsTruststorePasswordAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.clientcertificate") orgApacheFelixHttpsClientcertificate: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.clientcertificate@TypeHint") orgApacheFelixHttpsClientcertificateAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.apache.felix.https.enable") orgApacheFelixHttpsEnable: kotlin.Boolean?, 
         @QueryParam(value = "org.apache.felix.https.enable@TypeHint") orgApacheFelixHttpsEnableAtTypeHint: kotlin.String?, 
         @QueryParam(value = "org.osgi.service.http.port.secure") orgOsgiServiceHttpPortSecure: kotlin.String?, 
         @QueryParam(value = "org.osgi.service.http.port.secure@TypeHint") orgOsgiServiceHttpPortSecureAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/apps/system/config/org.apache.http.proxyconfigurator.config")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigApacheHttpComponentsProxyConfiguration(
         @QueryParam(value = "proxy.host") proxyHost: kotlin.String?, 
         @QueryParam(value = "proxy.host@TypeHint") proxyHostAtTypeHint: kotlin.String?, 
         @QueryParam(value = "proxy.port") proxyPort: kotlin.Int?, 
         @QueryParam(value = "proxy.port@TypeHint") proxyPortAtTypeHint: kotlin.String?, 
         @QueryParam(value = "proxy.exceptions") proxyExceptions: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "proxy.exceptions@TypeHint") proxyExceptionsAtTypeHint: kotlin.String?, 
         @QueryParam(value = "proxy.enabled") proxyEnabled: kotlin.Boolean?, 
         @QueryParam(value = "proxy.enabled@TypeHint") proxyEnabledAtTypeHint: kotlin.String?, 
         @QueryParam(value = "proxy.user") proxyUser: kotlin.String?, 
         @QueryParam(value = "proxy.user@TypeHint") proxyUserAtTypeHint: kotlin.String?, 
         @QueryParam(value = "proxy.password") proxyPassword: kotlin.String?, 
         @QueryParam(value = "proxy.password@TypeHint") proxyPasswordAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigApacheSlingDavExServlet(
         @QueryParam(value = "alias") alias: kotlin.String?, 
         @QueryParam(value = "alias@TypeHint") aliasAtTypeHint: kotlin.String?, 
         @QueryParam(value = "dav.create-absolute-uri") davCreateAbsoluteUri: kotlin.Boolean?, 
         @QueryParam(value = "dav.create-absolute-uri@TypeHint") davCreateAbsoluteUriAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigApacheSlingGetServlet(
         @QueryParam(value = "json.maximumresults") jsonMaximumresults: kotlin.String?, 
         @QueryParam(value = "json.maximumresults@TypeHint") jsonMaximumresultsAtTypeHint: kotlin.String?, 
         @QueryParam(value = "enable.html") enableHtml: kotlin.Boolean?, 
         @QueryParam(value = "enable.html@TypeHint") enableHtmlAtTypeHint: kotlin.String?, 
         @QueryParam(value = "enable.txt") enableTxt: kotlin.Boolean?, 
         @QueryParam(value = "enable.txt@TypeHint") enableTxtAtTypeHint: kotlin.String?, 
         @QueryParam(value = "enable.xml") enableXml: kotlin.Boolean?, 
         @QueryParam(value = "enable.xml@TypeHint") enableXmlAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigApacheSlingReferrerFilter(
         @QueryParam(value = "allow.empty") allowEmpty: kotlin.Boolean?, 
         @QueryParam(value = "allow.empty@TypeHint") allowEmptyAtTypeHint: kotlin.String?, 
         @QueryParam(value = "allow.hosts") allowHosts: kotlin.String?, 
         @QueryParam(value = "allow.hosts@TypeHint") allowHostsAtTypeHint: kotlin.String?, 
         @QueryParam(value = "allow.hosts.regexp") allowHostsRegexp: kotlin.String?, 
         @QueryParam(value = "allow.hosts.regexp@TypeHint") allowHostsRegexpAtTypeHint: kotlin.String?, 
         @QueryParam(value = "filter.methods") filterMethods: kotlin.String?, 
         @QueryParam(value = "filter.methods@TypeHint") filterMethodsAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/apps/system/config/{configNodeName}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigProperty(
        @PathParam("configNodeName") configNodeName: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Post("/{path}/{name}")
    @Description("")
    @RequestContentType(MediaTypes.FORM_DATA)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postNode(
        @PathParam("path") path: kotlin.String, 
        @PathParam("name") name: kotlin.String, 
         @QueryParam(value = ":operation") operation: kotlin.String?, 
         @QueryParam(value = "deleteAuthorizable") deleteAuthorizable: kotlin.String?, 
        @Valid file: HttpCall
    ): Response<Unit> {
        TODO()
    }

    @Post("/{path}/{name}.rw.html")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postNodeRw(
        @PathParam("path") path: kotlin.String, 
        @PathParam("name") name: kotlin.String, 
         @QueryParam(value = "addMembers") addMembers: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/{path}/")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postPath(
        @PathParam("path") path: kotlin.String, 
         @QueryParam(value = "jcr:primaryType") jcrPrimaryType: kotlin.String, 
         @QueryParam(value = ":name") name: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Post("/bin/querybuilder.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postQuery(
         @QueryParam(value = "path") path: kotlin.String, 
         @QueryParam(value = "p.limit") pLimit: java.math.BigDecimal, 
         @QueryParam(value = "1_property") `1property`: kotlin.String, 
         @QueryParam(value = "1_property.value") `1propertyValue`: kotlin.String
    ): kotlin.String {
        TODO()
    }

    @Post("/libs/replication/treeactivation.html")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postTreeActivation(
         @QueryParam(value = "ignoredeactivated") ignoredeactivated: kotlin.Boolean, 
         @QueryParam(value = "onlymodified") onlymodified: kotlin.Boolean, 
         @QueryParam(value = "path") path: kotlin.String, 
         @QueryParam(value = "cmd") cmd: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Post("/libs/granite/security/post/truststore")
    @Description("")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.TEXT_PLAIN_UTF8)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postTruststore(
         @QueryParam(value = ":operation") operation: kotlin.String?, 
         @QueryParam(value = "newPassword") newPassword: kotlin.String?, 
         @QueryParam(value = "rePassword") rePassword: kotlin.String?, 
         @QueryParam(value = "keyStoreType") keyStoreType: kotlin.String?, 
         @QueryParam(value = "removeAlias") removeAlias: kotlin.String?, 
        @Valid certificate: HttpCall
    ): kotlin.String {
        TODO()
    }

    @Post("/etc/truststore")
    @Description("")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.TEXT_PLAIN_UTF8)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postTruststorePKCS12(
        @Valid truststoreP12: HttpCall
    ): kotlin.String {
        TODO()
    }
}
