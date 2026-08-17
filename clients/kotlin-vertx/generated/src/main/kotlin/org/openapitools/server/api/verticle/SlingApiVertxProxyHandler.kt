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
import org.openapitools.server.api.model.KeystoreInfo
import org.openapitools.server.api.model.TruststoreInfo

class SlingApiVertxProxyHandler(private val vertx: Vertx, private val service: SlingApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "deleteAgent" -> {
                    val params = context.params
                    val runmode = ApiHandlerUtils.searchStringInJson(params,"runmode")
                    if(runmode == null){
                        throw IllegalArgumentException("runmode is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteAgent(runmode,name,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteNode" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteNode(path,name,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAgent" -> {
                    val params = context.params
                    val runmode = ApiHandlerUtils.searchStringInJson(params,"runmode")
                    if(runmode == null){
                        throw IllegalArgumentException("runmode is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAgent(runmode,name,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAgents" -> {
                    val params = context.params
                    val runmode = ApiHandlerUtils.searchStringInJson(params,"runmode")
                    if(runmode == null){
                        throw IllegalArgumentException("runmode is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAgents(runmode,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAuthorizableKeystore" -> {
                    val params = context.params
                    val intermediatePath = ApiHandlerUtils.searchStringInJson(params,"intermediatePath")
                    if(intermediatePath == null){
                        throw IllegalArgumentException("intermediatePath is required")
                    }
                    val authorizableId = ApiHandlerUtils.searchStringInJson(params,"authorizableId")
                    if(authorizableId == null){
                        throw IllegalArgumentException("authorizableId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAuthorizableKeystore(intermediatePath,authorizableId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getKeystore" -> {
                    val params = context.params
                    val intermediatePath = ApiHandlerUtils.searchStringInJson(params,"intermediatePath")
                    if(intermediatePath == null){
                        throw IllegalArgumentException("intermediatePath is required")
                    }
                    val authorizableId = ApiHandlerUtils.searchStringInJson(params,"authorizableId")
                    if(authorizableId == null){
                        throw IllegalArgumentException("authorizableId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getKeystore(intermediatePath,authorizableId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getNode" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getNode(path,name,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getPackage" -> {
                    val params = context.params
                    val group = ApiHandlerUtils.searchStringInJson(params,"group")
                    if(group == null){
                        throw IllegalArgumentException("group is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val version = ApiHandlerUtils.searchStringInJson(params,"version")
                    if(version == null){
                        throw IllegalArgumentException("version is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getPackage(group,name,version,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getPackageFilter" -> {
                    val params = context.params
                    val group = ApiHandlerUtils.searchStringInJson(params,"group")
                    if(group == null){
                        throw IllegalArgumentException("group is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val version = ApiHandlerUtils.searchStringInJson(params,"version")
                    if(version == null){
                        throw IllegalArgumentException("version is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getPackageFilter(group,name,version,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getQuery" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val pLimit = ApiHandlerUtils.searchDoubleInJson(params,"p.limit")
                    if(pLimit == null){
                        throw IllegalArgumentException("pLimit is required")
                    }
                    val &#x60;1property&#x60; = ApiHandlerUtils.searchStringInJson(params,"1_property")
                    if(&#x60;1property&#x60; == null){
                        throw IllegalArgumentException("&#x60;1property&#x60; is required")
                    }
                    val &#x60;1propertyValue&#x60; = ApiHandlerUtils.searchStringInJson(params,"1_property.value")
                    if(&#x60;1propertyValue&#x60; == null){
                        throw IllegalArgumentException("&#x60;1propertyValue&#x60; is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getQuery(path,pLimit,&#x60;1property&#x60;,&#x60;1propertyValue&#x60;,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getTruststore" -> {
                }
        
                "getTruststoreInfo" -> {
                }
        
                "postAgent" -> {
                    val params = context.params
                    val runmode = ApiHandlerUtils.searchStringInJson(params,"runmode")
                    if(runmode == null){
                        throw IllegalArgumentException("runmode is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val jcrContentCqDistribute = ApiHandlerUtils.searchStringInJson(params,"jcr:content/cq:distribute")?.toBoolean()
                    val jcrContentCqDistributeAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"jcr:content/cq:distribute@TypeHint")
                    val jcrContentCqName = ApiHandlerUtils.searchStringInJson(params,"jcr:content/cq:name")
                    val jcrContentCqTemplate = ApiHandlerUtils.searchStringInJson(params,"jcr:content/cq:template")
                    val jcrContentAliasUpdate = ApiHandlerUtils.searchStringInJson(params,"jcr:content/aliasUpdate")?.toBoolean()
                    val jcrContentEnabled = ApiHandlerUtils.searchStringInJson(params,"jcr:content/enabled")?.toBoolean()
                    val jcrContentJcrDescription = ApiHandlerUtils.searchStringInJson(params,"jcr:content/jcr:description")
                    val jcrContentJcrLastModified = ApiHandlerUtils.searchStringInJson(params,"jcr:content/jcr:lastModified")
                    val jcrContentJcrLastModifiedBy = ApiHandlerUtils.searchStringInJson(params,"jcr:content/jcr:lastModifiedBy")
                    val jcrContentJcrMixinTypes = ApiHandlerUtils.searchStringInJson(params,"jcr:content/jcr:mixinTypes")
                    val jcrContentJcrTitle = ApiHandlerUtils.searchStringInJson(params,"jcr:content/jcr:title")
                    val jcrContentLogLevel = ApiHandlerUtils.searchStringInJson(params,"jcr:content/logLevel")
                    val jcrContentNoStatusUpdate = ApiHandlerUtils.searchStringInJson(params,"jcr:content/noStatusUpdate")?.toBoolean()
                    val jcrContentNoVersioning = ApiHandlerUtils.searchStringInJson(params,"jcr:content/noVersioning")?.toBoolean()
                    val jcrContentProtocolConnectTimeout = ApiHandlerUtils.searchDoubleInJson(params,"jcr:content/protocolConnectTimeout")
                    val jcrContentProtocolHTTPConnectionClosed = ApiHandlerUtils.searchStringInJson(params,"jcr:content/protocolHTTPConnectionClosed")?.toBoolean()
                    val jcrContentProtocolHTTPExpired = ApiHandlerUtils.searchStringInJson(params,"jcr:content/protocolHTTPExpired")
                    val jcrContentProtocolHTTPHeadersParam = ApiHandlerUtils.searchJsonArrayInJson(params,"jcr:content/protocolHTTPHeaders")
                    val jcrContentProtocolHTTPHeaders:kotlin.Array<kotlin.String>? = if(jcrContentProtocolHTTPHeadersParam == null) null
                            else Gson().fromJson(jcrContentProtocolHTTPHeadersParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val jcrContentProtocolHTTPHeadersAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"jcr:content/protocolHTTPHeaders@TypeHint")
                    val jcrContentProtocolHTTPMethod = ApiHandlerUtils.searchStringInJson(params,"jcr:content/protocolHTTPMethod")
                    val jcrContentProtocolHTTPSRelaxed = ApiHandlerUtils.searchStringInJson(params,"jcr:content/protocolHTTPSRelaxed")?.toBoolean()
                    val jcrContentProtocolInterface = ApiHandlerUtils.searchStringInJson(params,"jcr:content/protocolInterface")
                    val jcrContentProtocolSocketTimeout = ApiHandlerUtils.searchDoubleInJson(params,"jcr:content/protocolSocketTimeout")
                    val jcrContentProtocolVersion = ApiHandlerUtils.searchStringInJson(params,"jcr:content/protocolVersion")
                    val jcrContentProxyNTLMDomain = ApiHandlerUtils.searchStringInJson(params,"jcr:content/proxyNTLMDomain")
                    val jcrContentProxyNTLMHost = ApiHandlerUtils.searchStringInJson(params,"jcr:content/proxyNTLMHost")
                    val jcrContentProxyHost = ApiHandlerUtils.searchStringInJson(params,"jcr:content/proxyHost")
                    val jcrContentProxyPassword = ApiHandlerUtils.searchStringInJson(params,"jcr:content/proxyPassword")
                    val jcrContentProxyPort = ApiHandlerUtils.searchDoubleInJson(params,"jcr:content/proxyPort")
                    val jcrContentProxyUser = ApiHandlerUtils.searchStringInJson(params,"jcr:content/proxyUser")
                    val jcrContentQueueBatchMaxSize = ApiHandlerUtils.searchDoubleInJson(params,"jcr:content/queueBatchMaxSize")
                    val jcrContentQueueBatchMode = ApiHandlerUtils.searchStringInJson(params,"jcr:content/queueBatchMode")
                    val jcrContentQueueBatchWaitTime = ApiHandlerUtils.searchDoubleInJson(params,"jcr:content/queueBatchWaitTime")
                    val jcrContentRetryDelay = ApiHandlerUtils.searchStringInJson(params,"jcr:content/retryDelay")
                    val jcrContentReverseReplication = ApiHandlerUtils.searchStringInJson(params,"jcr:content/reverseReplication")?.toBoolean()
                    val jcrContentSerializationType = ApiHandlerUtils.searchStringInJson(params,"jcr:content/serializationType")
                    val jcrContentSlingResourceType = ApiHandlerUtils.searchStringInJson(params,"jcr:content/sling:resourceType")
                    val jcrContentSsl = ApiHandlerUtils.searchStringInJson(params,"jcr:content/ssl")
                    val jcrContentTransportNTLMDomain = ApiHandlerUtils.searchStringInJson(params,"jcr:content/transportNTLMDomain")
                    val jcrContentTransportNTLMHost = ApiHandlerUtils.searchStringInJson(params,"jcr:content/transportNTLMHost")
                    val jcrContentTransportPassword = ApiHandlerUtils.searchStringInJson(params,"jcr:content/transportPassword")
                    val jcrContentTransportUri = ApiHandlerUtils.searchStringInJson(params,"jcr:content/transportUri")
                    val jcrContentTransportUser = ApiHandlerUtils.searchStringInJson(params,"jcr:content/transportUser")
                    val jcrContentTriggerDistribute = ApiHandlerUtils.searchStringInJson(params,"jcr:content/triggerDistribute")?.toBoolean()
                    val jcrContentTriggerModified = ApiHandlerUtils.searchStringInJson(params,"jcr:content/triggerModified")?.toBoolean()
                    val jcrContentTriggerOnOffTime = ApiHandlerUtils.searchStringInJson(params,"jcr:content/triggerOnOffTime")?.toBoolean()
                    val jcrContentTriggerReceive = ApiHandlerUtils.searchStringInJson(params,"jcr:content/triggerReceive")?.toBoolean()
                    val jcrContentTriggerSpecific = ApiHandlerUtils.searchStringInJson(params,"jcr:content/triggerSpecific")?.toBoolean()
                    val jcrContentUserId = ApiHandlerUtils.searchStringInJson(params,"jcr:content/userId")
                    val jcrPrimaryType = ApiHandlerUtils.searchStringInJson(params,"jcr:primaryType")
                    val operation = ApiHandlerUtils.searchStringInJson(params,":operation")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postAgent(runmode,name,jcrContentCqDistribute,jcrContentCqDistributeAtTypeHint,jcrContentCqName,jcrContentCqTemplate,jcrContentAliasUpdate,jcrContentEnabled,jcrContentJcrDescription,jcrContentJcrLastModified,jcrContentJcrLastModifiedBy,jcrContentJcrMixinTypes,jcrContentJcrTitle,jcrContentLogLevel,jcrContentNoStatusUpdate,jcrContentNoVersioning,jcrContentProtocolConnectTimeout,jcrContentProtocolHTTPConnectionClosed,jcrContentProtocolHTTPExpired,jcrContentProtocolHTTPHeaders,jcrContentProtocolHTTPHeadersAtTypeHint,jcrContentProtocolHTTPMethod,jcrContentProtocolHTTPSRelaxed,jcrContentProtocolInterface,jcrContentProtocolSocketTimeout,jcrContentProtocolVersion,jcrContentProxyNTLMDomain,jcrContentProxyNTLMHost,jcrContentProxyHost,jcrContentProxyPassword,jcrContentProxyPort,jcrContentProxyUser,jcrContentQueueBatchMaxSize,jcrContentQueueBatchMode,jcrContentQueueBatchWaitTime,jcrContentRetryDelay,jcrContentReverseReplication,jcrContentSerializationType,jcrContentSlingResourceType,jcrContentSsl,jcrContentTransportNTLMDomain,jcrContentTransportNTLMHost,jcrContentTransportPassword,jcrContentTransportUri,jcrContentTransportUser,jcrContentTriggerDistribute,jcrContentTriggerModified,jcrContentTriggerOnOffTime,jcrContentTriggerReceive,jcrContentTriggerSpecific,jcrContentUserId,jcrPrimaryType,operation,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postAuthorizableKeystore" -> {
                    val params = context.params
                    val intermediatePath = ApiHandlerUtils.searchStringInJson(params,"intermediatePath")
                    if(intermediatePath == null){
                        throw IllegalArgumentException("intermediatePath is required")
                    }
                    val authorizableId = ApiHandlerUtils.searchStringInJson(params,"authorizableId")
                    if(authorizableId == null){
                        throw IllegalArgumentException("authorizableId is required")
                    }
                    val operation = ApiHandlerUtils.searchStringInJson(params,":operation")
                    val currentPassword = ApiHandlerUtils.searchStringInJson(params,"currentPassword")
                    val newPassword = ApiHandlerUtils.searchStringInJson(params,"newPassword")
                    val rePassword = ApiHandlerUtils.searchStringInJson(params,"rePassword")
                    val keyPassword = ApiHandlerUtils.searchStringInJson(params,"keyPassword")
                    val keyStorePass = ApiHandlerUtils.searchStringInJson(params,"keyStorePass")
                    val alias = ApiHandlerUtils.searchStringInJson(params,"alias")
                    val newAlias = ApiHandlerUtils.searchStringInJson(params,"newAlias")
                    val removeAlias = ApiHandlerUtils.searchStringInJson(params,"removeAlias")
                    val certChainParam = context.extra.getJsonArray("files")
                    val certChain = certChainParam?.map{ java.io.File(it as String) }
                    val pkParam = context.extra.getJsonArray("files")
                    val pk = pkParam?.map{ java.io.File(it as String) }
                    val keyStoreParam = context.extra.getJsonArray("files")
                    val keyStore = keyStoreParam?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postAuthorizableKeystore(intermediatePath,authorizableId,operation,currentPassword,newPassword,rePassword,keyPassword,keyStorePass,alias,newAlias,removeAlias,certChain,pk,keyStore,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postAuthorizables" -> {
                    val params = context.params
                    val authorizableId = ApiHandlerUtils.searchStringInJson(params,"authorizableId")
                    if(authorizableId == null){
                        throw IllegalArgumentException("authorizableId is required")
                    }
                    val intermediatePath = ApiHandlerUtils.searchStringInJson(params,"intermediatePath")
                    if(intermediatePath == null){
                        throw IllegalArgumentException("intermediatePath is required")
                    }
                    val createUser = ApiHandlerUtils.searchStringInJson(params,"createUser")
                    val createGroup = ApiHandlerUtils.searchStringInJson(params,"createGroup")
                    val repPassword = ApiHandlerUtils.searchStringInJson(params,"rep:password")
                    val profileGivenName = ApiHandlerUtils.searchStringInJson(params,"profile/givenName")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postAuthorizables(authorizableId,intermediatePath,createUser,createGroup,repPassword,profileGivenName,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigAdobeGraniteSamlAuthenticationHandler" -> {
                    val params = context.params
                    val keyStorePassword = ApiHandlerUtils.searchStringInJson(params,"keyStorePassword")
                    val keyStorePasswordAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"keyStorePassword@TypeHint")
                    val serviceRanking = ApiHandlerUtils.searchIntegerInJson(params,"service.ranking")
                    val serviceRankingAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"service.ranking@TypeHint")
                    val idpHttpRedirect = ApiHandlerUtils.searchStringInJson(params,"idpHttpRedirect")?.toBoolean()
                    val idpHttpRedirectAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"idpHttpRedirect@TypeHint")
                    val createUser = ApiHandlerUtils.searchStringInJson(params,"createUser")?.toBoolean()
                    val createUserAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"createUser@TypeHint")
                    val defaultRedirectUrl = ApiHandlerUtils.searchStringInJson(params,"defaultRedirectUrl")
                    val defaultRedirectUrlAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"defaultRedirectUrl@TypeHint")
                    val userIDAttribute = ApiHandlerUtils.searchStringInJson(params,"userIDAttribute")
                    val userIDAttributeAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"userIDAttribute@TypeHint")
                    val defaultGroupsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"defaultGroups")
                    val defaultGroups:kotlin.Array<kotlin.String>? = if(defaultGroupsParam == null) null
                            else Gson().fromJson(defaultGroupsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val defaultGroupsAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"defaultGroups@TypeHint")
                    val idpCertAlias = ApiHandlerUtils.searchStringInJson(params,"idpCertAlias")
                    val idpCertAliasAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"idpCertAlias@TypeHint")
                    val addGroupMemberships = ApiHandlerUtils.searchStringInJson(params,"addGroupMemberships")?.toBoolean()
                    val addGroupMembershipsAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"addGroupMemberships@TypeHint")
                    val pathParam = ApiHandlerUtils.searchJsonArrayInJson(params,"path")
                    val path:kotlin.Array<kotlin.String>? = if(pathParam == null) null
                            else Gson().fromJson(pathParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val pathAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"path@TypeHint")
                    val synchronizeAttributesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"synchronizeAttributes")
                    val synchronizeAttributes:kotlin.Array<kotlin.String>? = if(synchronizeAttributesParam == null) null
                            else Gson().fromJson(synchronizeAttributesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val synchronizeAttributesAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"synchronizeAttributes@TypeHint")
                    val clockTolerance = ApiHandlerUtils.searchIntegerInJson(params,"clockTolerance")
                    val clockToleranceAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"clockTolerance@TypeHint")
                    val groupMembershipAttribute = ApiHandlerUtils.searchStringInJson(params,"groupMembershipAttribute")
                    val groupMembershipAttributeAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"groupMembershipAttribute@TypeHint")
                    val idpUrl = ApiHandlerUtils.searchStringInJson(params,"idpUrl")
                    val idpUrlAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"idpUrl@TypeHint")
                    val logoutUrl = ApiHandlerUtils.searchStringInJson(params,"logoutUrl")
                    val logoutUrlAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"logoutUrl@TypeHint")
                    val serviceProviderEntityId = ApiHandlerUtils.searchStringInJson(params,"serviceProviderEntityId")
                    val serviceProviderEntityIdAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"serviceProviderEntityId@TypeHint")
                    val assertionConsumerServiceURL = ApiHandlerUtils.searchStringInJson(params,"assertionConsumerServiceURL")
                    val assertionConsumerServiceURLAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"assertionConsumerServiceURL@TypeHint")
                    val handleLogout = ApiHandlerUtils.searchStringInJson(params,"handleLogout")?.toBoolean()
                    val handleLogoutAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"handleLogout@TypeHint")
                    val spPrivateKeyAlias = ApiHandlerUtils.searchStringInJson(params,"spPrivateKeyAlias")
                    val spPrivateKeyAliasAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"spPrivateKeyAlias@TypeHint")
                    val useEncryption = ApiHandlerUtils.searchStringInJson(params,"useEncryption")?.toBoolean()
                    val useEncryptionAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"useEncryption@TypeHint")
                    val nameIdFormat = ApiHandlerUtils.searchStringInJson(params,"nameIdFormat")
                    val nameIdFormatAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"nameIdFormat@TypeHint")
                    val digestMethod = ApiHandlerUtils.searchStringInJson(params,"digestMethod")
                    val digestMethodAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"digestMethod@TypeHint")
                    val signatureMethod = ApiHandlerUtils.searchStringInJson(params,"signatureMethod")
                    val signatureMethodAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"signatureMethod@TypeHint")
                    val userIntermediatePath = ApiHandlerUtils.searchStringInJson(params,"userIntermediatePath")
                    val userIntermediatePathAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"userIntermediatePath@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword,keyStorePasswordAtTypeHint,serviceRanking,serviceRankingAtTypeHint,idpHttpRedirect,idpHttpRedirectAtTypeHint,createUser,createUserAtTypeHint,defaultRedirectUrl,defaultRedirectUrlAtTypeHint,userIDAttribute,userIDAttributeAtTypeHint,defaultGroups,defaultGroupsAtTypeHint,idpCertAlias,idpCertAliasAtTypeHint,addGroupMemberships,addGroupMembershipsAtTypeHint,path,pathAtTypeHint,synchronizeAttributes,synchronizeAttributesAtTypeHint,clockTolerance,clockToleranceAtTypeHint,groupMembershipAttribute,groupMembershipAttributeAtTypeHint,idpUrl,idpUrlAtTypeHint,logoutUrl,logoutUrlAtTypeHint,serviceProviderEntityId,serviceProviderEntityIdAtTypeHint,assertionConsumerServiceURL,assertionConsumerServiceURLAtTypeHint,handleLogout,handleLogoutAtTypeHint,spPrivateKeyAlias,spPrivateKeyAliasAtTypeHint,useEncryption,useEncryptionAtTypeHint,nameIdFormat,nameIdFormatAtTypeHint,digestMethod,digestMethodAtTypeHint,signatureMethod,signatureMethodAtTypeHint,userIntermediatePath,userIntermediatePathAtTypeHint,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigApacheFelixJettyBasedHttpService" -> {
                    val params = context.params
                    val orgApacheFelixHttpsNio = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.nio")?.toBoolean()
                    val orgApacheFelixHttpsNioAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.nio@TypeHint")
                    val orgApacheFelixHttpsKeystore = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore")
                    val orgApacheFelixHttpsKeystoreAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore@TypeHint")
                    val orgApacheFelixHttpsKeystorePassword = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore.password")
                    val orgApacheFelixHttpsKeystorePasswordAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore.password@TypeHint")
                    val orgApacheFelixHttpsKeystoreKey = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore.key")
                    val orgApacheFelixHttpsKeystoreKeyAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore.key@TypeHint")
                    val orgApacheFelixHttpsKeystoreKeyPassword = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore.key.password")
                    val orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.keystore.key.password@TypeHint")
                    val orgApacheFelixHttpsTruststore = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.truststore")
                    val orgApacheFelixHttpsTruststoreAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.truststore@TypeHint")
                    val orgApacheFelixHttpsTruststorePassword = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.truststore.password")
                    val orgApacheFelixHttpsTruststorePasswordAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.truststore.password@TypeHint")
                    val orgApacheFelixHttpsClientcertificate = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.clientcertificate")
                    val orgApacheFelixHttpsClientcertificateAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.clientcertificate@TypeHint")
                    val orgApacheFelixHttpsEnable = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.enable")?.toBoolean()
                    val orgApacheFelixHttpsEnableAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.apache.felix.https.enable@TypeHint")
                    val orgOsgiServiceHttpPortSecure = ApiHandlerUtils.searchStringInJson(params,"org.osgi.service.http.port.secure")
                    val orgOsgiServiceHttpPortSecureAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"org.osgi.service.http.port.secure@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio,orgApacheFelixHttpsNioAtTypeHint,orgApacheFelixHttpsKeystore,orgApacheFelixHttpsKeystoreAtTypeHint,orgApacheFelixHttpsKeystorePassword,orgApacheFelixHttpsKeystorePasswordAtTypeHint,orgApacheFelixHttpsKeystoreKey,orgApacheFelixHttpsKeystoreKeyAtTypeHint,orgApacheFelixHttpsKeystoreKeyPassword,orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint,orgApacheFelixHttpsTruststore,orgApacheFelixHttpsTruststoreAtTypeHint,orgApacheFelixHttpsTruststorePassword,orgApacheFelixHttpsTruststorePasswordAtTypeHint,orgApacheFelixHttpsClientcertificate,orgApacheFelixHttpsClientcertificateAtTypeHint,orgApacheFelixHttpsEnable,orgApacheFelixHttpsEnableAtTypeHint,orgOsgiServiceHttpPortSecure,orgOsgiServiceHttpPortSecureAtTypeHint,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigApacheHttpComponentsProxyConfiguration" -> {
                    val params = context.params
                    val proxyHost = ApiHandlerUtils.searchStringInJson(params,"proxy.host")
                    val proxyHostAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"proxy.host@TypeHint")
                    val proxyPort = ApiHandlerUtils.searchIntegerInJson(params,"proxy.port")
                    val proxyPortAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"proxy.port@TypeHint")
                    val proxyExceptionsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"proxy.exceptions")
                    val proxyExceptions:kotlin.Array<kotlin.String>? = if(proxyExceptionsParam == null) null
                            else Gson().fromJson(proxyExceptionsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val proxyExceptionsAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"proxy.exceptions@TypeHint")
                    val proxyEnabled = ApiHandlerUtils.searchStringInJson(params,"proxy.enabled")?.toBoolean()
                    val proxyEnabledAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"proxy.enabled@TypeHint")
                    val proxyUser = ApiHandlerUtils.searchStringInJson(params,"proxy.user")
                    val proxyUserAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"proxy.user@TypeHint")
                    val proxyPassword = ApiHandlerUtils.searchStringInJson(params,"proxy.password")
                    val proxyPasswordAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"proxy.password@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigApacheHttpComponentsProxyConfiguration(proxyHost,proxyHostAtTypeHint,proxyPort,proxyPortAtTypeHint,proxyExceptions,proxyExceptionsAtTypeHint,proxyEnabled,proxyEnabledAtTypeHint,proxyUser,proxyUserAtTypeHint,proxyPassword,proxyPasswordAtTypeHint,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigApacheSlingDavExServlet" -> {
                    val params = context.params
                    val alias = ApiHandlerUtils.searchStringInJson(params,"alias")
                    val aliasAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"alias@TypeHint")
                    val davCreateAbsoluteUri = ApiHandlerUtils.searchStringInJson(params,"dav.create-absolute-uri")?.toBoolean()
                    val davCreateAbsoluteUriAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"dav.create-absolute-uri@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigApacheSlingDavExServlet(alias,aliasAtTypeHint,davCreateAbsoluteUri,davCreateAbsoluteUriAtTypeHint,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigApacheSlingGetServlet" -> {
                    val params = context.params
                    val jsonMaximumresults = ApiHandlerUtils.searchStringInJson(params,"json.maximumresults")
                    val jsonMaximumresultsAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"json.maximumresults@TypeHint")
                    val enableHtml = ApiHandlerUtils.searchStringInJson(params,"enable.html")?.toBoolean()
                    val enableHtmlAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"enable.html@TypeHint")
                    val enableTxt = ApiHandlerUtils.searchStringInJson(params,"enable.txt")?.toBoolean()
                    val enableTxtAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"enable.txt@TypeHint")
                    val enableXml = ApiHandlerUtils.searchStringInJson(params,"enable.xml")?.toBoolean()
                    val enableXmlAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"enable.xml@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigApacheSlingGetServlet(jsonMaximumresults,jsonMaximumresultsAtTypeHint,enableHtml,enableHtmlAtTypeHint,enableTxt,enableTxtAtTypeHint,enableXml,enableXmlAtTypeHint,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigApacheSlingReferrerFilter" -> {
                    val params = context.params
                    val allowEmpty = ApiHandlerUtils.searchStringInJson(params,"allow.empty")?.toBoolean()
                    val allowEmptyAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"allow.empty@TypeHint")
                    val allowHosts = ApiHandlerUtils.searchStringInJson(params,"allow.hosts")
                    val allowHostsAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"allow.hosts@TypeHint")
                    val allowHostsRegexp = ApiHandlerUtils.searchStringInJson(params,"allow.hosts.regexp")
                    val allowHostsRegexpAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"allow.hosts.regexp@TypeHint")
                    val filterMethods = ApiHandlerUtils.searchStringInJson(params,"filter.methods")
                    val filterMethodsAtTypeHint = ApiHandlerUtils.searchStringInJson(params,"filter.methods@TypeHint")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigApacheSlingReferrerFilter(allowEmpty,allowEmptyAtTypeHint,allowHosts,allowHostsAtTypeHint,allowHostsRegexp,allowHostsRegexpAtTypeHint,filterMethods,filterMethodsAtTypeHint,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postConfigProperty" -> {
                    val params = context.params
                    val configNodeName = ApiHandlerUtils.searchStringInJson(params,"configNodeName")
                    if(configNodeName == null){
                        throw IllegalArgumentException("configNodeName is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postConfigProperty(configNodeName,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postNode" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val operation = ApiHandlerUtils.searchStringInJson(params,":operation")
                    val deleteAuthorizable = ApiHandlerUtils.searchStringInJson(params,"deleteAuthorizable")
                    val fileParam = context.extra.getJsonArray("files")
                    val file = fileParam?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postNode(path,name,operation,deleteAuthorizable,file,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postNodeRw" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,"name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    val addMembers = ApiHandlerUtils.searchStringInJson(params,"addMembers")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postNodeRw(path,name,addMembers,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postPath" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val jcrPrimaryType = ApiHandlerUtils.searchStringInJson(params,"jcr:primaryType")
                    if(jcrPrimaryType == null){
                        throw IllegalArgumentException("jcrPrimaryType is required")
                    }
                    val name = ApiHandlerUtils.searchStringInJson(params,":name")
                    if(name == null){
                        throw IllegalArgumentException("name is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postPath(path,jcrPrimaryType,name,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postQuery" -> {
                    val params = context.params
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val pLimit = ApiHandlerUtils.searchDoubleInJson(params,"p.limit")
                    if(pLimit == null){
                        throw IllegalArgumentException("pLimit is required")
                    }
                    val &#x60;1property&#x60; = ApiHandlerUtils.searchStringInJson(params,"1_property")
                    if(&#x60;1property&#x60; == null){
                        throw IllegalArgumentException("&#x60;1property&#x60; is required")
                    }
                    val &#x60;1propertyValue&#x60; = ApiHandlerUtils.searchStringInJson(params,"1_property.value")
                    if(&#x60;1propertyValue&#x60; == null){
                        throw IllegalArgumentException("&#x60;1propertyValue&#x60; is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postQuery(path,pLimit,&#x60;1property&#x60;,&#x60;1propertyValue&#x60;,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postTreeActivation" -> {
                    val params = context.params
                    val ignoredeactivated = ApiHandlerUtils.searchStringInJson(params,"ignoredeactivated")?.toBoolean()
                    if(ignoredeactivated == null){
                        throw IllegalArgumentException("ignoredeactivated is required")
                    }
                    val onlymodified = ApiHandlerUtils.searchStringInJson(params,"onlymodified")?.toBoolean()
                    if(onlymodified == null){
                        throw IllegalArgumentException("onlymodified is required")
                    }
                    val path = ApiHandlerUtils.searchStringInJson(params,"path")
                    if(path == null){
                        throw IllegalArgumentException("path is required")
                    }
                    val cmd = ApiHandlerUtils.searchStringInJson(params,"cmd")
                    if(cmd == null){
                        throw IllegalArgumentException("cmd is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postTreeActivation(ignoredeactivated,onlymodified,path,cmd,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postTruststore" -> {
                    val params = context.params
                    val operation = ApiHandlerUtils.searchStringInJson(params,":operation")
                    val newPassword = ApiHandlerUtils.searchStringInJson(params,"newPassword")
                    val rePassword = ApiHandlerUtils.searchStringInJson(params,"rePassword")
                    val keyStoreType = ApiHandlerUtils.searchStringInJson(params,"keyStoreType")
                    val removeAlias = ApiHandlerUtils.searchStringInJson(params,"removeAlias")
                    val certificateParam = context.extra.getJsonArray("files")
                    val certificate = certificateParam?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postTruststore(operation,newPassword,rePassword,keyStoreType,removeAlias,certificate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "postTruststorePKCS12" -> {
                    val params = context.params
                    val truststoreP12Param = context.extra.getJsonArray("files")
                    val truststoreP12 = truststoreP12Param?.map{ java.io.File(it as String) }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.postTruststorePKCS12(truststoreP12,context)
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
