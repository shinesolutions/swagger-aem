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
class BinApiController() {

    @Operation(
        summary = "",
        operationId = "getQuery",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/bin/querybuilder.json"
        value = [PATH_GET_QUERY],
        produces = ["application/json"]
    )
    fun getQuery(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "path", required = true) path: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "p.limit", required = true) pLimit: java.math.BigDecimal,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "1_property", required = true) `1property`: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "1_property.value", required = true) `1propertyValue`: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postQuery",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/bin/querybuilder.json"
        value = [PATH_POST_QUERY],
        produces = ["application/json"]
    )
    fun postQuery(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "path", required = true) path: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "p.limit", required = true) pLimit: java.math.BigDecimal,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "1_property", required = true) `1property`: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "1_property.value", required = true) `1propertyValue`: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_GET_QUERY: String = "/bin/querybuilder.json"
        const val PATH_POST_QUERY: String = "/bin/querybuilder.json"
    }
}
