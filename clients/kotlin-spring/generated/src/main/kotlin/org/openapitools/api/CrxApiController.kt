package org.openapitools.api

import org.openapitools.model.InstallStatus
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
class CrxApiController() {

    @Operation(
        summary = "",
        operationId = "getCrxdeStatus",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "CRXDE is enabled", content = [Content(schema = Schema(implementation = kotlin.String::class))]),
            ApiResponse(responseCode = "404", description = "CRXDE is disabled", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/crx/server/crx.default/jcr:root/.1.json"
        value = [PATH_GET_CRXDE_STATUS],
        produces = ["plain/text"]
    )
    fun getCrxdeStatus(): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getInstallStatus",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Retrieved CRX package manager install status", content = [Content(schema = Schema(implementation = InstallStatus::class))]),
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/crx/packmgr/installstatus.jsp"
        value = [PATH_GET_INSTALL_STATUS],
        produces = ["application/json"]
    )
    fun getInstallStatus(): ResponseEntity<InstallStatus> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "getPackageManagerServlet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "404", description = "Package Manager Servlet is disabled", content = [Content(schema = Schema(implementation = kotlin.String::class))]),
            ApiResponse(responseCode = "405", description = "Package Manager Servlet is active", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/crx/packmgr/service/script.html"
        value = [PATH_GET_PACKAGE_MANAGER_SERVLET],
        produces = ["text/html"]
    )
    fun getPackageManagerServlet(): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postPackageService",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/crx/packmgr/service.jsp"
        value = [PATH_POST_PACKAGE_SERVICE],
        produces = ["text/xml"]
    )
    fun postPackageService(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "cmd", required = true) cmd: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postPackageServiceJson",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/crx/packmgr/service/.json/{path}"
        value = [PATH_POST_PACKAGE_SERVICE_JSON],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun postPackageServiceJson(
        @Parameter(description = "", required = true) @PathVariable("path") path: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "cmd", required = true) cmd: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "groupName", required = false) groupName: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "packageName", required = false) packageName: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "packageVersion", required = false) packageVersion: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "_charset_", required = false) charset: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "force", required = false) force: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "recursive", required = false) recursive: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestPart("package", required = false) `package`: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postPackageUpdate",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/crx/packmgr/update.jsp"
        value = [PATH_POST_PACKAGE_UPDATE],
        produces = ["application/json"]
    )
    fun postPackageUpdate(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "groupName", required = true) groupName: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "packageName", required = true) packageName: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "version", required = true) version: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "path", required = true) path: kotlin.String,
        @Parameter(description = "") @Valid @RequestParam(value = "filter", required = false) filter: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "_charset_", required = false) charset: kotlin.String?
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "",
        operationId = "postSetPassword",
        description = """""",
        responses = [
            ApiResponse(responseCode = "default", description = "Default response", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "aemAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/crx/explorer/ui/setpassword.jsp"
        value = [PATH_POST_SET_PASSWORD],
        produces = ["text/plain"]
    )
    fun postSetPassword(
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "old", required = true) old: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "plain", required = true) plain: kotlin.String,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "verify", required = true) verify: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_GET_CRXDE_STATUS: String = "/crx/server/crx.default/jcr:root/.1.json"
        const val PATH_GET_INSTALL_STATUS: String = "/crx/packmgr/installstatus.jsp"
        const val PATH_GET_PACKAGE_MANAGER_SERVLET: String = "/crx/packmgr/service/script.html"
        const val PATH_POST_PACKAGE_SERVICE: String = "/crx/packmgr/service.jsp"
        const val PATH_POST_PACKAGE_SERVICE_JSON: String = "/crx/packmgr/service/.json/{path}"
        const val PATH_POST_PACKAGE_UPDATE: String = "/crx/packmgr/update.jsp"
        const val PATH_POST_SET_PASSWORD: String = "/crx/explorer/ui/setpassword.jsp"
    }
}
