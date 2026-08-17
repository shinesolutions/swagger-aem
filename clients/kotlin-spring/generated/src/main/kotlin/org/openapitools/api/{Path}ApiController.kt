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
class {Path}ApiController() {

    @Operation(
        summary = "",
        operationId = "deleteNode",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/{path}/{name}"
        value = [PATH_DELETE_NODE]
    )
    fun deleteNode(
        @Parameter(description = "", required = true) @PathVariable("path") path: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getNode",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/{path}/{name}"
        value = [PATH_GET_NODE]
    )
    fun getNode(
        @Parameter(description = "", required = true) @PathVariable("path") path: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postNode",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/{path}/{name}"
        value = [PATH_POST_NODE],
        consumes = ["multipart/form-data"]
    )
    fun postNode(
        @Parameter(description = "", required = true) @PathVariable("path") path: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = ":operation", required = false) operation: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "deleteAuthorizable", required = false) deleteAuthorizable: kotlin.String?,
        @Parameter(description = "") @Valid @RequestPart("file", required = false) file: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postNodeRw",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/{path}/{name}.rw.html"
        value = [PATH_POST_NODE_RW]
    )
    fun postNodeRw(
        @Parameter(description = "", required = true) @PathVariable("path") path: kotlin.String,
        @Parameter(description = "", required = true) @PathVariable("name") name: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "addMembers", required = false) addMembers: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postPath",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response") ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/{path}/"
        value = [PATH_POST_PATH]
    )
    fun postPath(
        @Parameter(description = "", required = true) @PathVariable("path") path: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "jcr:primaryType", required = true) jcrPrimaryType: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = ":name", required = true) name: kotlin.String
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_DELETE_NODE: String = "/{path}/{name}"
        const val PATH_GET_NODE: String = "/{path}/{name}"
        const val PATH_POST_NODE: String = "/{path}/{name}"
        const val PATH_POST_NODE_RW: String = "/{path}/{name}.rw.html"
        const val PATH_POST_PATH: String = "/{path}/"
    }
}
