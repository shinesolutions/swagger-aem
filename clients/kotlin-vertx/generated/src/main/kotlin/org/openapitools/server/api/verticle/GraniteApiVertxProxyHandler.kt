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

class GraniteApiVertxProxyHandler(private val vertx: Vertx, private val service: GraniteApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "sslSetup" -> {
                    val params = context.params
                    val keystorePassword = ApiHandlerUtils.searchStringInJson(params,"keystorePassword")
                    if(keystorePassword == null){
                        throw IllegalArgumentException("keystorePassword is required")
                    }
                    val keystorePasswordConfirm = ApiHandlerUtils.searchStringInJson(params,"keystorePasswordConfirm")
                    if(keystorePasswordConfirm == null){
                        throw IllegalArgumentException("keystorePasswordConfirm is required")
                    }
                    val truststorePassword = ApiHandlerUtils.searchStringInJson(params,"truststorePassword")
                    if(truststorePassword == null){
                        throw IllegalArgumentException("truststorePassword is required")
                    }
                    val truststorePasswordConfirm = ApiHandlerUtils.searchStringInJson(params,"truststorePasswordConfirm")
                    if(truststorePasswordConfirm == null){
                        throw IllegalArgumentException("truststorePasswordConfirm is required")
                    }
                    val httpsHostname = ApiHandlerUtils.searchStringInJson(params,"httpsHostname")
                    if(httpsHostname == null){
                        throw IllegalArgumentException("httpsHostname is required")
                    }
                    val httpsPort = ApiHandlerUtils.searchStringInJson(params,"httpsPort")
                    if(httpsPort == null){
                        throw IllegalArgumentException("httpsPort is required")
                    }
                    val privatekeyFileParam = context.extra.getJsonArray("files")
                    val privatekeyFile = privatekeyFileParam?.map{ java.io.File(it as String) }
                    val certificateFileParam = context.extra.getJsonArray("files")
                    val certificateFile = certificateFileParam?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sslSetup(keystorePassword,keystorePasswordConfirm,truststorePassword,truststorePasswordConfirm,httpsHostname,httpsPort,privatekeyFile,certificateFile,context)
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
