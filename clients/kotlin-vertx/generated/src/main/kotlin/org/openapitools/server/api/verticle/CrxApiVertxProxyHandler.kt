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
import org.openapitools.server.api.model.InstallStatus

class CrxApiVertxProxyHandler(private val vertx: Vertx, private val service: CrxApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "getCrxdeStatus" -> {
                }
        
                "getInstallStatus" -> {
                }
        
                "getPackageManagerServlet" -> {
                }
        
                "postPackageService" -> {
                    val params = context.params
                    val cmd = ApiHandlerUtils.searchStringInJson(params,"cmd")
                    if(cmd == null){
                        throw IllegalArgumentException("cmd is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postPackageService(cmd,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postPackageServiceJson" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val cmd = ApiHandlerUtils.searchStringInJson(params,"cmd")
                    if(cmd == null){
                        throw IllegalArgumentException("cmd is required")
                    }
                    val groupName = ApiHandlerUtils.searchStringInJson(params,"groupName")
                    val packageName = ApiHandlerUtils.searchStringInJson(params,"packageName")
                    val packageVersion = ApiHandlerUtils.searchStringInJson(params,"packageVersion")
                    val charset = ApiHandlerUtils.searchStringInJson(params,"_charset_")
                    val force = ApiHandlerUtils.searchStringInJson(params,"force")?.toBoolean()
                    val recursive = ApiHandlerUtils.searchStringInJson(params,"recursive")?.toBoolean()
                    val &#x60;package&#x60;Param = context.extra.getJsonArray("files")
                    val &#x60;package&#x60; = &#x60;package&#x60;Param?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postPackageServiceJson(path,cmd,groupName,packageName,packageVersion,charset,force,recursive,&#x60;package&#x60;,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postPackageUpdate" -> {
                    val params = context.params
                    val groupName = ApiHandlerUtils.searchStringInJson(params,"groupName")
                    if(groupName == null){
                        throw IllegalArgumentException("groupName is required")
                    }
                    val packageName = ApiHandlerUtils.searchStringInJson(params,"packageName")
                    if(packageName == null){
                        throw IllegalArgumentException("packageName is required")
                    }
                    val version = ApiHandlerUtils.searchStringInJson(params,"version")
                    if(version == null){
                        throw IllegalArgumentException("version is required")
                    }
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val filter = ApiHandlerUtils.searchStringInJson(params,"filter")
                    val charset = ApiHandlerUtils.searchStringInJson(params,"_charset_")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postPackageUpdate(groupName,packageName,version,path,filter,charset,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postSetPassword" -> {
                    val params = context.params
                    val old = ApiHandlerUtils.searchStringInJson(params,"old")
                    if(old == null){
                        throw IllegalArgumentException("old is required")
                    }
                    val plain = ApiHandlerUtils.searchStringInJson(params,"plain")
                    if(plain == null){
                        throw IllegalArgumentException("plain is required")
                    }
                    val verify = ApiHandlerUtils.searchStringInJson(params,"verify")
                    if(verify == null){
                        throw IllegalArgumentException("verify is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postSetPassword(old,plain,verify,context)
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
