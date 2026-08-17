package org.openapitools.api

import org.openapitools.model.KeystoreInfo
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
class {IntermediatePath}ApiController() {

    @Operation(
        summary = "",
        operationId = "getAuthorizableKeystore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Retrieved Authorizable Keystore info", content = [Content(schema = Schema(implementation = KeystoreInfo::class))]),
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/{intermediatePath}/{authorizableId}.ks.json"
        value = [PATH_GET_AUTHORIZABLE_KEYSTORE],
        produces = ["text/plain"]
    )
    fun getAuthorizableKeystore(
        @Parameter(description = "", required = true) @PathVariable("intermediatePath") intermediatePath: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("authorizableId") authorizableId: kotlin.String
    ): ResponseEntity<KeystoreInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getKeystore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = org.springframework.core.io.Resource::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/{intermediatePath}/{authorizableId}/keystore/store.p12"
        value = [PATH_GET_KEYSTORE],
        produces = ["application/octet-stream"]
    )
    fun getKeystore(
        @Parameter(description = "", required = true) @PathVariable("intermediatePath") intermediatePath: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("authorizableId") authorizableId: kotlin.String
    ): ResponseEntity<org.springframework.core.io.Resource> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postAuthorizableKeystore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Retrieved Authorizable Keystore info", content = [Content(schema = Schema(implementation = KeystoreInfo::class))]),
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/{intermediatePath}/{authorizableId}.ks.html"
        value = [PATH_POST_AUTHORIZABLE_KEYSTORE],
        produces = ["text/plain"],
        consumes = ["multipart/form-data"]
    )
    fun postAuthorizableKeystore(
        @Parameter(description = "", required = true) @PathVariable("intermediatePath") intermediatePath: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("authorizableId") authorizableId: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = ":operation", required = false) operation: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "currentPassword", required = false) currentPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "newPassword", required = false) newPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "rePassword", required = false) rePassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "keyPassword", required = false) keyPassword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "keyStorePass", required = false) keyStorePass: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "alias", required = false) alias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "newAlias", required = false) newAlias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "removeAlias", required = false) removeAlias: kotlin.String?,
        @Parameter(description = "") @Valid @RequestPart("cert-chain", required = false) certChain: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "") @Valid @RequestPart("pk", required = false) pk: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "") @Valid @RequestPart("keyStore", required = false) keyStore: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<KeystoreInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_GET_AUTHORIZABLE_KEYSTORE: String = "/{intermediatePath}/{authorizableId}.ks.json"
        const val PATH_GET_KEYSTORE: String = "/{intermediatePath}/{authorizableId}/keystore/store.p12"
        const val PATH_POST_AUTHORIZABLE_KEYSTORE: String = "/{intermediatePath}/{authorizableId}.ks.html"
    }
}
