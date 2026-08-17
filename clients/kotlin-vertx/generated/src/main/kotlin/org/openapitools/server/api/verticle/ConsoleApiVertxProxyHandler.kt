package org.openapitools.server.api.verticle

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import io.vertx.ext.web.api.generator.ApiHandlerUtils
import io.vertx.serviceproxy.ProxyHandler
import io.vertx.serviceproxy.ServiceException
import io.vertx.serviceproxy.ServiceExceptionMessageCodec
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import io.vertx.kotlin.coroutines.dispatcher
import io.vertx.core.json.Json
import io.vertx.core.json.JsonArray
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson
import org.openapitools.server.api.model.BundleInfo
import org.openapitools.server.api.model.SamlConfigurationInfo

class ConsoleApiVertxProxyHandler(private val vertx: Vertx, private val service: ConsoleApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private lateinit var timerID: Long
    private var lastAccessed: Long = 0
    init {
        try {
            this.vertx.eventBus().registerDefaultCodec(ServiceException::class.java,
            ServiceExceptionMessageCodec())
        } catch (ex: IllegalStateException) {}

        if (timeoutSeconds != (-1).toLong() && !topLevel) {
            var period = timeoutSeconds * 1000 / 2
            if (period > 10000) {
                period = 10000
            }
            this.timerID = vertx.setPeriodic(period) { this.checkTimedOut(it) }
        } else {
            this.timerID = -1
        }
        accessed()
    }
    private fun checkTimedOut(id: Long) {
        val now = System.nanoTime()
        if (now - lastAccessed > timeoutSeconds * 1000000000) {
            close()
        }
    }

    override fun close() {
        if (timerID != (-1).toLong()) {
            vertx.cancelTimer(timerID)
        }
        super.close()
    }

    private fun accessed() {
        this.lastAccessed = System.nanoTime()
    }
    override fun handle(msg: Message<JsonObject>) {
        try {
            val json = msg.body()
            val action = msg.headers().get("action") ?: throw IllegalStateException("action not specified")
            accessed()
            val contextSerialized = json.getJsonObject("context") ?: throw IllegalStateException("Received action $action without OperationRequest \"context\"")
            val context = OperationRequest(contextSerialized)
            when (action) {
        
                "getAemProductInfo" -> {
                }
        
                "getBundleInfo" -> {
                    val params = context.params
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBundleInfo(name,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getConfigMgr" -> {
                }
        
                "postBundle" -> {
                    val params = context.params
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val action = ApiHandlerUtils.searchStringInJson(params,"action")
                    if(action == null){
                        throw IllegalArgumentException("action is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postBundle(name,action,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postJmxRepository" -> {
                    val params = context.params
                    val action = ApiHandlerUtils.searchStringInJson(params,"action")
                    if(action == null){
                        throw IllegalArgumentException("action is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postJmxRepository(action,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postSamlConfiguration" -> {
                    val params = context.params
                    val post = ApiHandlerUtils.searchStringInJson(params,"post")?.toBoolean()
                    val apply = ApiHandlerUtils.searchStringInJson(params,"apply")?.toBoolean()
                    val delete = ApiHandlerUtils.searchStringInJson(params,"delete")?.toBoolean()
                    val action = ApiHandlerUtils.searchStringInJson(params,"action")
                    val dollarLocation = ApiHandlerUtils.searchStringInJson(params,"$location")
                    val pathParam = ApiHandlerUtils.searchJsonArrayInJson(params,"path")
                    val path:kotlin.Array<kotlin.String>? = if(pathParam == null) null
                            else Gson().fromJson(pathParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val serviceRanking = ApiHandlerUtils.searchIntegerInJson(params,"service.ranking")
                    val idpUrl = ApiHandlerUtils.searchStringInJson(params,"idpUrl")
                    val idpCertAlias = ApiHandlerUtils.searchStringInJson(params,"idpCertAlias")
                    val idpHttpRedirect = ApiHandlerUtils.searchStringInJson(params,"idpHttpRedirect")?.toBoolean()
                    val serviceProviderEntityId = ApiHandlerUtils.searchStringInJson(params,"serviceProviderEntityId")
                    val assertionConsumerServiceURL = ApiHandlerUtils.searchStringInJson(params,"assertionConsumerServiceURL")
                    val spPrivateKeyAlias = ApiHandlerUtils.searchStringInJson(params,"spPrivateKeyAlias")
                    val keyStorePassword = ApiHandlerUtils.searchStringInJson(params,"keyStorePassword")
                    val defaultRedirectUrl = ApiHandlerUtils.searchStringInJson(params,"defaultRedirectUrl")
                    val userIDAttribute = ApiHandlerUtils.searchStringInJson(params,"userIDAttribute")
                    val useEncryption = ApiHandlerUtils.searchStringInJson(params,"useEncryption")?.toBoolean()
                    val createUser = ApiHandlerUtils.searchStringInJson(params,"createUser")?.toBoolean()
                    val addGroupMemberships = ApiHandlerUtils.searchStringInJson(params,"addGroupMemberships")?.toBoolean()
                    val groupMembershipAttribute = ApiHandlerUtils.searchStringInJson(params,"groupMembershipAttribute")
                    val defaultGroupsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"defaultGroups")
                    val defaultGroups:kotlin.Array<kotlin.String>? = if(defaultGroupsParam == null) null
                            else Gson().fromJson(defaultGroupsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val nameIdFormat = ApiHandlerUtils.searchStringInJson(params,"nameIdFormat")
                    val synchronizeAttributesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"synchronizeAttributes")
                    val synchronizeAttributes:kotlin.Array<kotlin.String>? = if(synchronizeAttributesParam == null) null
                            else Gson().fromJson(synchronizeAttributesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val handleLogout = ApiHandlerUtils.searchStringInJson(params,"handleLogout")?.toBoolean()
                    val logoutUrl = ApiHandlerUtils.searchStringInJson(params,"logoutUrl")
                    val clockTolerance = ApiHandlerUtils.searchIntegerInJson(params,"clockTolerance")
                    val digestMethod = ApiHandlerUtils.searchStringInJson(params,"digestMethod")
                    val signatureMethod = ApiHandlerUtils.searchStringInJson(params,"signatureMethod")
                    val userIntermediatePath = ApiHandlerUtils.searchStringInJson(params,"userIntermediatePath")
                    val propertylistParam = ApiHandlerUtils.searchJsonArrayInJson(params,"propertylist")
                    val propertylist:kotlin.Array<kotlin.String>? = if(propertylistParam == null) null
                            else Gson().fromJson(propertylistParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postSamlConfiguration(post,apply,delete,action,dollarLocation,path,serviceRanking,idpUrl,idpCertAlias,idpHttpRedirect,serviceProviderEntityId,assertionConsumerServiceURL,spPrivateKeyAlias,keyStorePassword,defaultRedirectUrl,userIDAttribute,useEncryption,createUser,addGroupMemberships,groupMembershipAttribute,defaultGroups,nameIdFormat,synchronizeAttributes,handleLogout,logoutUrl,clockTolerance,digestMethod,signatureMethod,userIntermediatePath,propertylist,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
