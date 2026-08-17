package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.BundleInfo
import org.openapitools.server.api.model.SamlConfigurationInfo
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


interface ConsoleApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getAemProductInfo
     *  */
    suspend fun getAemProductInfo(context:OperationRequest):Response<kotlin.Array<kotlin.String>>
    /* getBundleInfo
     *  */
    suspend fun getBundleInfo(name:kotlin.String?,context:OperationRequest):Response<BundleInfo>
    /* getConfigMgr
     *  */
    suspend fun getConfigMgr(context:OperationRequest):Response<kotlin.String>
    /* postBundle
     *  */
    suspend fun postBundle(name:kotlin.String?,action:kotlin.String?,context:OperationRequest):Response<Void>
    /* postJmxRepository
     *  */
    suspend fun postJmxRepository(action:kotlin.String?,context:OperationRequest):Response<Void>
    /* postSamlConfiguration
     *  */
    suspend fun postSamlConfiguration(post:kotlin.Boolean?,apply:kotlin.Boolean?,delete:kotlin.Boolean?,action:kotlin.String?,dollarLocation:kotlin.String?,path:kotlin.Array<kotlin.String>?,serviceRanking:kotlin.Int?,idpUrl:kotlin.String?,idpCertAlias:kotlin.String?,idpHttpRedirect:kotlin.Boolean?,serviceProviderEntityId:kotlin.String?,assertionConsumerServiceURL:kotlin.String?,spPrivateKeyAlias:kotlin.String?,keyStorePassword:kotlin.String?,defaultRedirectUrl:kotlin.String?,userIDAttribute:kotlin.String?,useEncryption:kotlin.Boolean?,createUser:kotlin.Boolean?,addGroupMemberships:kotlin.Boolean?,groupMembershipAttribute:kotlin.String?,defaultGroups:kotlin.Array<kotlin.String>?,nameIdFormat:kotlin.String?,synchronizeAttributes:kotlin.Array<kotlin.String>?,handleLogout:kotlin.Boolean?,logoutUrl:kotlin.String?,clockTolerance:kotlin.Int?,digestMethod:kotlin.String?,signatureMethod:kotlin.String?,userIntermediatePath:kotlin.String?,propertylist:kotlin.Array<kotlin.String>?,context:OperationRequest):Response<SamlConfigurationInfo>
    companion object {
        const val address = "ConsoleApi-service"
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
            for (m in ConsoleApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ConsoleApi::class.java, address)
            return routerFactory
        }
    }
}
