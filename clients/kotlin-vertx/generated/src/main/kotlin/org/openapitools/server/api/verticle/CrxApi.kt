package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.InstallStatus
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


interface CrxApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getCrxdeStatus
     *  */
    suspend fun getCrxdeStatus(context:OperationRequest):Response<kotlin.String>
    /* getInstallStatus
     *  */
    suspend fun getInstallStatus(context:OperationRequest):Response<InstallStatus>
    /* getPackageManagerServlet
     *  */
    suspend fun getPackageManagerServlet(context:OperationRequest):Response<Void>
    /* postPackageService
     *  */
    suspend fun postPackageService(cmd:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* postPackageServiceJson
     *  */
    suspend fun postPackageServiceJson(path:kotlin.String?,cmd:kotlin.String?,groupName:kotlin.String?,packageName:kotlin.String?,packageVersion:kotlin.String?,charset:kotlin.String?,force:kotlin.Boolean?,recursive:kotlin.Boolean?,&#x60;package&#x60;:kotlin.collections.List<java.io.File>?,context:OperationRequest):Response<kotlin.String>
    /* postPackageUpdate
     *  */
    suspend fun postPackageUpdate(groupName:kotlin.String?,packageName:kotlin.String?,version:kotlin.String?,path:kotlin.String?,filter:kotlin.String?,charset:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* postSetPassword
     *  */
    suspend fun postSetPassword(old:kotlin.String?,plain:kotlin.String?,verify:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    companion object {
        const val address = "CrxApi-service"
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
            for (m in CrxApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CrxApi::class.java, address)
            return routerFactory
        }
    }
}
