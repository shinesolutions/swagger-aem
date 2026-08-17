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

class CustomApiVertxProxyHandler(private val vertx: Vertx, private val service: CustomApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "getAemHealthCheck" -> {
                    val params = context.params
                    val tags = ApiHandlerUtils.searchStringInJson(params,"tags")
                    val combineTagsOr = ApiHandlerUtils.searchStringInJson(params,"combineTagsOr")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAemHealthCheck(tags,combineTagsOr,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigAemHealthCheckServlet" -> {
                    val params = context.params
                    val bundlesIgnoredParam = ApiHandlerUtils.searchJsonArrayInJson(params,"bundles.ignored")
                    val bundlesIgnored:kotlin.Array<kotlin.String>? = if(bundlesIgnoredParam == null) null
                            else Gson().fromJson(bundlesIgnoredParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val bundlesIgnoredAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"bundles.ignored@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigAemHealthCheckServlet(bundlesIgnored,bundlesIgnoredAtTypeHint,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigAemPasswordReset" -> {
                    val params = context.params
                    val pwdresetAuthorizablesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"pwdreset.authorizables")
                    val pwdresetAuthorizables:kotlin.Array<kotlin.String>? = if(pwdresetAuthorizablesParam == null) null
                            else Gson().fromJson(pwdresetAuthorizablesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val pwdresetAuthorizablesAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"pwdreset.authorizables@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigAemPasswordReset(pwdresetAuthorizables,pwdresetAuthorizablesAtTypeHint,context)
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
