package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CustomApiAction @Inject constructor(
) : WebAction {

    @Get("/system/health")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAemHealthCheck(
         @QueryParam(value = "tags") tags: kotlin.String?, 
         @QueryParam(value = "combineTagsOr") combineTagsOr: kotlin.Boolean?
    ): kotlin.String {
        TODO()
    }

    @Post("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigAemHealthCheckServlet(
         @QueryParam(value = "bundles.ignored") bundlesIgnored: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "bundles.ignored@TypeHint") bundlesIgnoredAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Post("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postConfigAemPasswordReset(
         @QueryParam(value = "pwdreset.authorizables") pwdresetAuthorizables: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "pwdreset.authorizables@TypeHint") pwdresetAuthorizablesAtTypeHint: kotlin.String?
    ): Response<Unit> {
        TODO()
    }
}
