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
class EtcApiController() {

    @Operation(
        summary = "",
        operationId = "deleteAgent",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/etc/replication/agents.{runmode}/{name}"
        value = [PATH_DELETE_AGENT]
    )
    fun deleteAgent(
        @Parameter(description = "", required = true) @PathVariable("runmode") runmode: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getAgent",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/etc/replication/agents.{runmode}/{name}"
        value = [PATH_GET_AGENT]
    )
    fun getAgent(
        @Parameter(description = "", required = true) @PathVariable("runmode") runmode: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getAgents",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/etc/replication/agents.{runmode}.-1.json"
        value = [PATH_GET_AGENTS],
        produces = ["application/json"]
    )
    fun getAgents(
        @Parameter(description = "", required = true) @PathVariable("runmode") runmode: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getPackage",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = org.springframework.core.io.Resource::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/etc/packages/{group}/{name}-{version}.zip"
        value = [PATH_GET_PACKAGE],
        produces = ["application/octet-stream"]
    )
    fun getPackage(
        @Parameter(description = "", required = true) @PathVariable("group") group: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("version") version: kotlin.String
    ): ResponseEntity<org.springframework.core.io.Resource> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getPackageFilter",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"
        value = [PATH_GET_PACKAGE_FILTER],
        produces = ["application/json"]
    )
    fun getPackageFilter(
        @Parameter(description = "", required = true) @PathVariable("group") group: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("version") version: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getTruststore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = org.springframework.core.io.Resource::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/etc/truststore/truststore.p12"
        value = [PATH_GET_TRUSTSTORE],
        produces = ["application/octet-stream"]
    )
    fun getTruststore(): ResponseEntity<org.springframework.core.io.Resource> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postAgent",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/etc/replication/agents.{runmode}/{name}"
        value = [PATH_POST_AGENT]
    )
    fun postAgent(
        @Parameter(description = "", required = true) @PathVariable("runmode") runmode: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/cq:distribute", required = false) jcrContentCqDistribute: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/cq:distribute@TypeHint", required = false) jcrContentCqDistributeAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/cq:name", required = false) jcrContentCqName: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/cq:template", required = false) jcrContentCqTemplate: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/aliasUpdate", required = false) jcrContentAliasUpdate: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/enabled", required = false) jcrContentEnabled: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/jcr:description", required = false) jcrContentJcrDescription: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/jcr:lastModified", required = false) jcrContentJcrLastModified: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/jcr:lastModifiedBy", required = false) jcrContentJcrLastModifiedBy: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/jcr:mixinTypes", required = false) jcrContentJcrMixinTypes: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/jcr:title", required = false) jcrContentJcrTitle: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/logLevel", required = false) jcrContentLogLevel: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/noStatusUpdate", required = false) jcrContentNoStatusUpdate: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/noVersioning", required = false) jcrContentNoVersioning: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolConnectTimeout", required = false) jcrContentProtocolConnectTimeout: java.math.BigDecimal?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolHTTPConnectionClosed", required = false) jcrContentProtocolHTTPConnectionClosed: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolHTTPExpired", required = false) jcrContentProtocolHTTPExpired: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolHTTPHeaders", required = false) jcrContentProtocolHTTPHeaders: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolHTTPHeaders@TypeHint", required = false) jcrContentProtocolHTTPHeadersAtTypeHint: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolHTTPMethod", required = false) jcrContentProtocolHTTPMethod: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolHTTPSRelaxed", required = false) jcrContentProtocolHTTPSRelaxed: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolInterface", required = false) jcrContentProtocolInterface: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolSocketTimeout", required = false) jcrContentProtocolSocketTimeout: java.math.BigDecimal?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/protocolVersion", required = false) jcrContentProtocolVersion: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/proxyNTLMDomain", required = false) jcrContentProxyNTLMDomain: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/proxyNTLMHost", required = false) jcrContentProxyNTLMHost: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/proxyHost", required = false) jcrContentProxyHost: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/proxyPassword", required = false) jcrContentProxyPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/proxyPort", required = false) jcrContentProxyPort: java.math.BigDecimal?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/proxyUser", required = false) jcrContentProxyUser: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/queueBatchMaxSize", required = false) jcrContentQueueBatchMaxSize: java.math.BigDecimal?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/queueBatchMode", required = false) jcrContentQueueBatchMode: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/queueBatchWaitTime", required = false) jcrContentQueueBatchWaitTime: java.math.BigDecimal?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/retryDelay", required = false) jcrContentRetryDelay: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/reverseReplication", required = false) jcrContentReverseReplication: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/serializationType", required = false) jcrContentSerializationType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/sling:resourceType", required = false) jcrContentSlingResourceType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/ssl", required = false) jcrContentSsl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/transportNTLMDomain", required = false) jcrContentTransportNTLMDomain: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/transportNTLMHost", required = false) jcrContentTransportNTLMHost: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/transportPassword", required = false) jcrContentTransportPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/transportUri", required = false) jcrContentTransportUri: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/transportUser", required = false) jcrContentTransportUser: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/triggerDistribute", required = false) jcrContentTriggerDistribute: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/triggerModified", required = false) jcrContentTriggerModified: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/triggerOnOffTime", required = false) jcrContentTriggerOnOffTime: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/triggerReceive", required = false) jcrContentTriggerReceive: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/triggerSpecific", required = false) jcrContentTriggerSpecific: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:content/userId", required = false) jcrContentUserId: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "jcr:primaryType", required = false) jcrPrimaryType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = ":operation", required = false) operation: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postTruststorePKCS12",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/etc/truststore"
        value = [PATH_POST_TRUSTSTORE_PKCS12],
        produces = ["text/plain"],
        consumes = ["multipart/form-data"]
    )
    fun postTruststorePKCS12(
        @Parameter(description = "") @Valid @RequestPart("truststore.p12", required = false) truststoreP12: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_DELETE_AGENT: String = "/etc/replication/agents.{runmode}/{name}"
        const val PATH_GET_AGENT: String = "/etc/replication/agents.{runmode}/{name}"
        const val PATH_GET_AGENTS: String = "/etc/replication/agents.{runmode}.-1.json"
        const val PATH_GET_PACKAGE: String = "/etc/packages/{group}/{name}-{version}.zip"
        const val PATH_GET_PACKAGE_FILTER: String = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"
        const val PATH_GET_TRUSTSTORE: String = "/etc/truststore/truststore.p12"
        const val PATH_POST_AGENT: String = "/etc/replication/agents.{runmode}/{name}"
        const val PATH_POST_TRUSTSTORE_PKCS12: String = "/etc/truststore"
    }
}
