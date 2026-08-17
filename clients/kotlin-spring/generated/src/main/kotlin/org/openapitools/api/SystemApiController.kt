package org.openapitools.api

import org.openapitools.model.BundleInfo
import org.openapitools.model.SamlConfigurationInfo
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
class SystemApiController() {

    @Operation(
        summary = "",
        operationId = "getAemHealthCheck",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/system/health"
        value = [PATH_GET_AEM_HEALTH_CHECK],
        produces = ["application/json"]
    )
    fun getAemHealthCheck(
        @Parameter(description = "") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "combineTagsOr", required = false) combineTagsOr: kotlin.Boolean?
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getAemProductInfo",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(array = ArraySchema(schema = Schema(implementation = kotlin.String::class)))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/system/console/status-productinfo.json"
        value = [PATH_GET_AEM_PRODUCT_INFO],
        produces = ["application/json"]
    )
    fun getAemProductInfo(): ResponseEntity<List<kotlin.String>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getBundleInfo",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Retrieved bundle info", content = [Content(schema = Schema(implementation = BundleInfo::class))]),
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/system/console/bundles/{name}.json"
        value = [PATH_GET_BUNDLE_INFO],
        produces = ["application/json"]
    )
    fun getBundleInfo(
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String
    ): ResponseEntity<BundleInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getConfigMgr",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = kotlin.String::class))]),
            ApiResponse(responseCode = "5XX", description = "Unexpected error.") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/system/console/configMgr"
        value = [PATH_GET_CONFIG_MGR],
        produces = ["text/xml"]
    )
    fun getConfigMgr(): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postBundle",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/system/console/bundles/{name}"
        value = [PATH_POST_BUNDLE]
    )
    fun postBundle(
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "action", required = true) action: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postJmxRepository",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"
        value = [PATH_POST_JMX_REPOSITORY]
    )
    fun postJmxRepository(
        @Parameter(description = "", required = true) @PathVariable("action") action: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postSamlConfiguration",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Retrieved AEM SAML Configuration", content = [Content(schema = Schema(implementation = SamlConfigurationInfo::class))]),
            ApiResponse(responseCode = "302", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]),
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"
        value = [PATH_POST_SAML_CONFIGURATION],
        produces = ["text/plain"]
    )
    fun postSamlConfiguration(
        @Parameter(description = "") @Valid @RequestParam(value = "post", required = false) post: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "apply", required = false) apply: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "delete", required = false) delete: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "action", required = false) action: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "$location", required = false) dollarLocation: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "path", required = false) path: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "service.ranking", required = false) serviceRanking: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpUrl", required = false) idpUrl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpCertAlias", required = false) idpCertAlias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "idpHttpRedirect", required = false) idpHttpRedirect: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "serviceProviderEntityId", required = false) serviceProviderEntityId: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "assertionConsumerServiceURL", required = false) assertionConsumerServiceURL: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "spPrivateKeyAlias", required = false) spPrivateKeyAlias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "keyStorePassword", required = false) keyStorePassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "defaultRedirectUrl", required = false) defaultRedirectUrl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "userIDAttribute", required = false) userIDAttribute: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "useEncryption", required = false) useEncryption: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "createUser", required = false) createUser: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "addGroupMemberships", required = false) addGroupMemberships: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "groupMembershipAttribute", required = false) groupMembershipAttribute: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "defaultGroups", required = false) defaultGroups: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "nameIdFormat", required = false) nameIdFormat: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "synchronizeAttributes", required = false) synchronizeAttributes: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "") @Valid @RequestParam(value = "handleLogout", required = false) handleLogout: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "logoutUrl", required = false) logoutUrl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "clockTolerance", required = false) clockTolerance: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "digestMethod", required = false) digestMethod: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "signatureMethod", required = false) signatureMethod: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "userIntermediatePath", required = false) userIntermediatePath: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "propertylist", required = false) propertylist: kotlin.collections.List<kotlin.String>?
    ): ResponseEntity<SamlConfigurationInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_GET_AEM_HEALTH_CHECK: String = "/system/health"
        const val PATH_GET_AEM_PRODUCT_INFO: String = "/system/console/status-productinfo.json"
        const val PATH_GET_BUNDLE_INFO: String = "/system/console/bundles/{name}.json"
        const val PATH_GET_CONFIG_MGR: String = "/system/console/configMgr"
        const val PATH_POST_BUNDLE: String = "/system/console/bundles/{name}"
        const val PATH_POST_JMX_REPOSITORY: String = "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"
        const val PATH_POST_SAML_CONFIGURATION: String = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"
    }
}
