package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.KeystoreInfo
import org.openapitools.server.api.model.TruststoreInfo
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface SlingApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deleteAgent
     *  */
    suspend fun deleteAgent(runmode:kotlin.String?,name:kotlin.String?,context:OperationRequest):Response<Void>
    /* deleteNode
     *  */
    suspend fun deleteNode(path:kotlin.String?,name:kotlin.String?,context:OperationRequest):Response<Void>
    /* getAgent
     *  */
    suspend fun getAgent(runmode:kotlin.String?,name:kotlin.String?,context:OperationRequest):Response<Void>
    /* getAgents
     *  */
    suspend fun getAgents(runmode:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* getAuthorizableKeystore
     *  */
    suspend fun getAuthorizableKeystore(intermediatePath:kotlin.String?,authorizableId:kotlin.String?,context:OperationRequest):Response<KeystoreInfo>
    /* getKeystore
     *  */
    suspend fun getKeystore(intermediatePath:kotlin.String?,authorizableId:kotlin.String?,context:OperationRequest):Response<java.io.File>
    /* getNode
     *  */
    suspend fun getNode(path:kotlin.String?,name:kotlin.String?,context:OperationRequest):Response<Void>
    /* getPackage
     *  */
    suspend fun getPackage(group:kotlin.String?,name:kotlin.String?,version:kotlin.String?,context:OperationRequest):Response<java.io.File>
    /* getPackageFilter
     *  */
    suspend fun getPackageFilter(group:kotlin.String?,name:kotlin.String?,version:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* getQuery
     *  */
    suspend fun getQuery(path:kotlin.String?,pLimit:java.math.BigDecimal?,&#x60;1property&#x60;:kotlin.String?,&#x60;1propertyValue&#x60;:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* getTruststore
     *  */
    suspend fun getTruststore(context:OperationRequest):Response<java.io.File>
    /* getTruststoreInfo
     *  */
    suspend fun getTruststoreInfo(context:OperationRequest):Response<TruststoreInfo>
    /* postAgent
     *  */
    suspend fun postAgent(runmode:kotlin.String?,name:kotlin.String?,jcrContentCqDistribute:kotlin.Boolean?,jcrContentCqDistributeAtTypeHint:kotlin.String?,jcrContentCqName:kotlin.String?,jcrContentCqTemplate:kotlin.String?,jcrContentAliasUpdate:kotlin.Boolean?,jcrContentEnabled:kotlin.Boolean?,jcrContentJcrDescription:kotlin.String?,jcrContentJcrLastModified:kotlin.String?,jcrContentJcrLastModifiedBy:kotlin.String?,jcrContentJcrMixinTypes:kotlin.String?,jcrContentJcrTitle:kotlin.String?,jcrContentLogLevel:kotlin.String?,jcrContentNoStatusUpdate:kotlin.Boolean?,jcrContentNoVersioning:kotlin.Boolean?,jcrContentProtocolConnectTimeout:java.math.BigDecimal?,jcrContentProtocolHTTPConnectionClosed:kotlin.Boolean?,jcrContentProtocolHTTPExpired:kotlin.String?,jcrContentProtocolHTTPHeaders:kotlin.Array<kotlin.String>?,jcrContentProtocolHTTPHeadersAtTypeHint:kotlin.String?,jcrContentProtocolHTTPMethod:kotlin.String?,jcrContentProtocolHTTPSRelaxed:kotlin.Boolean?,jcrContentProtocolInterface:kotlin.String?,jcrContentProtocolSocketTimeout:java.math.BigDecimal?,jcrContentProtocolVersion:kotlin.String?,jcrContentProxyNTLMDomain:kotlin.String?,jcrContentProxyNTLMHost:kotlin.String?,jcrContentProxyHost:kotlin.String?,jcrContentProxyPassword:kotlin.String?,jcrContentProxyPort:java.math.BigDecimal?,jcrContentProxyUser:kotlin.String?,jcrContentQueueBatchMaxSize:java.math.BigDecimal?,jcrContentQueueBatchMode:kotlin.String?,jcrContentQueueBatchWaitTime:java.math.BigDecimal?,jcrContentRetryDelay:kotlin.String?,jcrContentReverseReplication:kotlin.Boolean?,jcrContentSerializationType:kotlin.String?,jcrContentSlingResourceType:kotlin.String?,jcrContentSsl:kotlin.String?,jcrContentTransportNTLMDomain:kotlin.String?,jcrContentTransportNTLMHost:kotlin.String?,jcrContentTransportPassword:kotlin.String?,jcrContentTransportUri:kotlin.String?,jcrContentTransportUser:kotlin.String?,jcrContentTriggerDistribute:kotlin.Boolean?,jcrContentTriggerModified:kotlin.Boolean?,jcrContentTriggerOnOffTime:kotlin.Boolean?,jcrContentTriggerReceive:kotlin.Boolean?,jcrContentTriggerSpecific:kotlin.Boolean?,jcrContentUserId:kotlin.String?,jcrPrimaryType:kotlin.String?,operation:kotlin.String?,context:OperationRequest):Response<Void>
    /* postAuthorizableKeystore
     *  */
    suspend fun postAuthorizableKeystore(intermediatePath:kotlin.String?,authorizableId:kotlin.String?,operation:kotlin.String?,currentPassword:kotlin.String?,newPassword:kotlin.String?,rePassword:kotlin.String?,keyPassword:kotlin.String?,keyStorePass:kotlin.String?,alias:kotlin.String?,newAlias:kotlin.String?,removeAlias:kotlin.String?,certChain:kotlin.collections.List<java.io.File>?,pk:kotlin.collections.List<java.io.File>?,keyStore:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<KeystoreInfo>
    /* postAuthorizables
     *  */
    suspend fun postAuthorizables(authorizableId:kotlin.String?,intermediatePath:kotlin.String?,createUser:kotlin.String?,createGroup:kotlin.String?,repPassword:kotlin.String?,profileGivenName:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* postConfigAdobeGraniteSamlAuthenticationHandler
     *  */
    suspend fun postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword:kotlin.String?,keyStorePasswordAtTypeHint:kotlin.String?,serviceRanking:kotlin.Int?,serviceRankingAtTypeHint:kotlin.String?,idpHttpRedirect:kotlin.Boolean?,idpHttpRedirectAtTypeHint:kotlin.String?,createUser:kotlin.Boolean?,createUserAtTypeHint:kotlin.String?,defaultRedirectUrl:kotlin.String?,defaultRedirectUrlAtTypeHint:kotlin.String?,userIDAttribute:kotlin.String?,userIDAttributeAtTypeHint:kotlin.String?,defaultGroups:kotlin.Array<kotlin.String>?,defaultGroupsAtTypeHint:kotlin.String?,idpCertAlias:kotlin.String?,idpCertAliasAtTypeHint:kotlin.String?,addGroupMemberships:kotlin.Boolean?,addGroupMembershipsAtTypeHint:kotlin.String?,path:kotlin.Array<kotlin.String>?,pathAtTypeHint:kotlin.String?,synchronizeAttributes:kotlin.Array<kotlin.String>?,synchronizeAttributesAtTypeHint:kotlin.String?,clockTolerance:kotlin.Int?,clockToleranceAtTypeHint:kotlin.String?,groupMembershipAttribute:kotlin.String?,groupMembershipAttributeAtTypeHint:kotlin.String?,idpUrl:kotlin.String?,idpUrlAtTypeHint:kotlin.String?,logoutUrl:kotlin.String?,logoutUrlAtTypeHint:kotlin.String?,serviceProviderEntityId:kotlin.String?,serviceProviderEntityIdAtTypeHint:kotlin.String?,assertionConsumerServiceURL:kotlin.String?,assertionConsumerServiceURLAtTypeHint:kotlin.String?,handleLogout:kotlin.Boolean?,handleLogoutAtTypeHint:kotlin.String?,spPrivateKeyAlias:kotlin.String?,spPrivateKeyAliasAtTypeHint:kotlin.String?,useEncryption:kotlin.Boolean?,useEncryptionAtTypeHint:kotlin.String?,nameIdFormat:kotlin.String?,nameIdFormatAtTypeHint:kotlin.String?,digestMethod:kotlin.String?,digestMethodAtTypeHint:kotlin.String?,signatureMethod:kotlin.String?,signatureMethodAtTypeHint:kotlin.String?,userIntermediatePath:kotlin.String?,userIntermediatePathAtTypeHint:kotlin.String?,context:OperationRequest):Response<Void>
    /* postConfigApacheFelixJettyBasedHttpService
     *  */
    suspend fun postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio:kotlin.Boolean?,orgApacheFelixHttpsNioAtTypeHint:kotlin.String?,orgApacheFelixHttpsKeystore:kotlin.String?,orgApacheFelixHttpsKeystoreAtTypeHint:kotlin.String?,orgApacheFelixHttpsKeystorePassword:kotlin.String?,orgApacheFelixHttpsKeystorePasswordAtTypeHint:kotlin.String?,orgApacheFelixHttpsKeystoreKey:kotlin.String?,orgApacheFelixHttpsKeystoreKeyAtTypeHint:kotlin.String?,orgApacheFelixHttpsKeystoreKeyPassword:kotlin.String?,orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint:kotlin.String?,orgApacheFelixHttpsTruststore:kotlin.String?,orgApacheFelixHttpsTruststoreAtTypeHint:kotlin.String?,orgApacheFelixHttpsTruststorePassword:kotlin.String?,orgApacheFelixHttpsTruststorePasswordAtTypeHint:kotlin.String?,orgApacheFelixHttpsClientcertificate:kotlin.String?,orgApacheFelixHttpsClientcertificateAtTypeHint:kotlin.String?,orgApacheFelixHttpsEnable:kotlin.Boolean?,orgApacheFelixHttpsEnableAtTypeHint:kotlin.String?,orgOsgiServiceHttpPortSecure:kotlin.String?,orgOsgiServiceHttpPortSecureAtTypeHint:kotlin.String?,context:OperationRequest):Response<Void>
    /* postConfigApacheHttpComponentsProxyConfiguration
     *  */
    suspend fun postConfigApacheHttpComponentsProxyConfiguration(proxyHost:kotlin.String?,proxyHostAtTypeHint:kotlin.String?,proxyPort:kotlin.Int?,proxyPortAtTypeHint:kotlin.String?,proxyExceptions:kotlin.Array<kotlin.String>?,proxyExceptionsAtTypeHint:kotlin.String?,proxyEnabled:kotlin.Boolean?,proxyEnabledAtTypeHint:kotlin.String?,proxyUser:kotlin.String?,proxyUserAtTypeHint:kotlin.String?,proxyPassword:kotlin.String?,proxyPasswordAtTypeHint:kotlin.String?,context:OperationRequest):Response<Void>
    /* postConfigApacheSlingDavExServlet
     *  */
    suspend fun postConfigApacheSlingDavExServlet(alias:kotlin.String?,aliasAtTypeHint:kotlin.String?,davCreateAbsoluteUri:kotlin.Boolean?,davCreateAbsoluteUriAtTypeHint:kotlin.String?,context:OperationRequest):Response<Void>
    /* postConfigApacheSlingGetServlet
     *  */
    suspend fun postConfigApacheSlingGetServlet(jsonMaximumresults:kotlin.String?,jsonMaximumresultsAtTypeHint:kotlin.String?,enableHtml:kotlin.Boolean?,enableHtmlAtTypeHint:kotlin.String?,enableTxt:kotlin.Boolean?,enableTxtAtTypeHint:kotlin.String?,enableXml:kotlin.Boolean?,enableXmlAtTypeHint:kotlin.String?,context:OperationRequest):Response<Void>
    /* postConfigApacheSlingReferrerFilter
     *  */
    suspend fun postConfigApacheSlingReferrerFilter(allowEmpty:kotlin.Boolean?,allowEmptyAtTypeHint:kotlin.String?,allowHosts:kotlin.String?,allowHostsAtTypeHint:kotlin.String?,allowHostsRegexp:kotlin.String?,allowHostsRegexpAtTypeHint:kotlin.String?,filterMethods:kotlin.String?,filterMethodsAtTypeHint:kotlin.String?,context:OperationRequest):Response<Void>
    /* postConfigProperty
     *  */
    suspend fun postConfigProperty(configNodeName:kotlin.String?,context:OperationRequest):Response<Void>
    /* postNode
     *  */
    suspend fun postNode(path:kotlin.String?,name:kotlin.String?,operation:kotlin.String?,deleteAuthorizable:kotlin.String?,file:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<Void>
    /* postNodeRw
     *  */
    suspend fun postNodeRw(path:kotlin.String?,name:kotlin.String?,addMembers:kotlin.String?,context:OperationRequest):Response<Void>
    /* postPath
     *  */
    suspend fun postPath(path:kotlin.String?,jcrPrimaryType:kotlin.String?,name:kotlin.String?,context:OperationRequest):Response<Void>
    /* postQuery
     *  */
    suspend fun postQuery(path:kotlin.String?,pLimit:java.math.BigDecimal?,&#x60;1property&#x60;:kotlin.String?,&#x60;1propertyValue&#x60;:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* postTreeActivation
     *  */
    suspend fun postTreeActivation(ignoredeactivated:kotlin.Boolean?,onlymodified:kotlin.Boolean?,path:kotlin.String?,cmd:kotlin.String?,context:OperationRequest):Response<Void>
    /* postTruststore
     *  */
    suspend fun postTruststore(operation:kotlin.String?,newPassword:kotlin.String?,rePassword:kotlin.String?,keyStoreType:kotlin.String?,removeAlias:kotlin.String?,certificate:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<kotlin.String>
    /* postTruststorePKCS12
     *  */
    suspend fun postTruststorePKCS12(truststoreP12:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<kotlin.String>
    companion object {
        const val address = "SlingApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in SlingApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(SlingApi::class.java, address)
            return routerFactory
        }
    }
}
