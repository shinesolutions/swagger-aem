package org.openapitools.api

import org.openapitools.model.TruststoreInfo
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
class LibsApiController() {

    @Operation(
        summary = "",
        operationId = "getLoginPage",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/libs/granite/core/content/login.html"
        value = [PATH_GET_LOGIN_PAGE],
        produces = ["text/html"]
    )
    fun getLoginPage(): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getTruststoreInfo",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Retrieved AEM Truststore info", content = [Content(schema = Schema(implementation = TruststoreInfo::class))]),
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/libs/granite/security/truststore.json"
        value = [PATH_GET_TRUSTSTORE_INFO],
        produces = ["application/json"]
    )
    fun getTruststoreInfo(): ResponseEntity<TruststoreInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postAuthorizables",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/libs/granite/security/post/authorizables"
        value = [PATH_POST_AUTHORIZABLES],
        produces = ["text/html"]
    )
    fun postAuthorizables(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "authorizableId", required = true) authorizableId: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "intermediatePath", required = true) intermediatePath: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "createUser", required = false) createUser: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "createGroup", required = false) createGroup: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "rep:password", required = false) repPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "profile/givenName", required = false) profileGivenName: kotlin.String?
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postTreeActivation",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/libs/replication/treeactivation.html"
        value = [PATH_POST_TREE_ACTIVATION]
    )
    fun postTreeActivation(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "ignoredeactivated", required = true) ignoredeactivated: kotlin.Boolean,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "onlymodified", required = true) onlymodified: kotlin.Boolean,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "path", required = true) path: kotlin.String,
        @NotNull @Parameter(description = "", required = true, schema = Schema(defaultValue = "activate")) @Valid @RequestParam(value = "cmd", required = true, defaultValue = "activate") cmd: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postTruststore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/libs/granite/security/post/truststore"
        value = [PATH_POST_TRUSTSTORE],
        produces = ["text/plain"],
        consumes = ["multipart/form-data"]
    )
    fun postTruststore(
        @Parameter(description = "") @Valid @RequestParam(value = ":operation", required = false) operation: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "newPassword", required = false) newPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "rePassword", required = false) rePassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "keyStoreType", required = false) keyStoreType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "removeAlias", required = false) removeAlias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestPart("certificate", required = false) certificate: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "sslSetup",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/libs/granite/security/post/sslSetup.html"
        value = [PATH_SSL_SETUP],
        produces = ["text/plain"],
        consumes = ["multipart/form-data"]
    )
    fun sslSetup(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "keystorePassword", required = true) keystorePassword: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "keystorePasswordConfirm", required = true) keystorePasswordConfirm: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "truststorePassword", required = true) truststorePassword: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "truststorePasswordConfirm", required = true) truststorePasswordConfirm: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "httpsHostname", required = true) httpsHostname: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "httpsPort", required = true) httpsPort: kotlin.String,
        @Parameter(description = "") @Valid @RequestPart("privatekeyFile", required = false) privatekeyFile: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "") @Valid @RequestPart("certificateFile", required = false) certificateFile: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_GET_LOGIN_PAGE: String = "/libs/granite/core/content/login.html"
        const val PATH_GET_TRUSTSTORE_INFO: String = "/libs/granite/security/truststore.json"
        const val PATH_POST_AUTHORIZABLES: String = "/libs/granite/security/post/authorizables"
        const val PATH_POST_TREE_ACTIVATION: String = "/libs/replication/treeactivation.html"
        const val PATH_POST_TRUSTSTORE: String = "/libs/granite/security/post/truststore"
        const val PATH_SSL_SETUP: String = "/libs/granite/security/post/sslSetup.html"
    }
}
