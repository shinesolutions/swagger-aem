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
class GraniteApiAction @Inject constructor(
) : WebAction {

    @Post("/libs/granite/security/post/sslSetup.html")
    @Description("")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.TEXT_PLAIN_UTF8)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun sslSetup(
         @QueryParam(value = "keystorePassword") keystorePassword: kotlin.String, 
         @QueryParam(value = "keystorePasswordConfirm") keystorePasswordConfirm: kotlin.String, 
         @QueryParam(value = "truststorePassword") truststorePassword: kotlin.String, 
         @QueryParam(value = "truststorePasswordConfirm") truststorePasswordConfirm: kotlin.String, 
         @QueryParam(value = "httpsHostname") httpsHostname: kotlin.String, 
         @QueryParam(value = "httpsPort") httpsPort: kotlin.String, 
        @Valid privatekeyFile: HttpCall, 
        @Valid certificateFile: HttpCall
    ): kotlin.String {
        TODO()
    }
}
