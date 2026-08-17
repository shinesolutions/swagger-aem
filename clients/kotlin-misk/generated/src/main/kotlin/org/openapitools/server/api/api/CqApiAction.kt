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
class CqApiAction @Inject constructor(
) : WebAction {

    @Get("/libs/granite/core/content/login.html")
    @Description("")
    @ResponseContentType(MediaTypes.TEXT_HTML)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getLoginPage(
    ): kotlin.String {
        TODO()
    }

    @Post("/.cqactions.html")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postCqActions(
         @QueryParam(value = "authorizableId") authorizableId: kotlin.String, 
         @QueryParam(value = "changelog") changelog: kotlin.String
    ): Response<Unit> {
        TODO()
    }
}
