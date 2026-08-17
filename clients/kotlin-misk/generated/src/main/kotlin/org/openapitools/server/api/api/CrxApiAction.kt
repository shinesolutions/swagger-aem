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
import org.openapitools.server.api.model.InstallStatus

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CrxApiAction @Inject constructor(
) : WebAction {

    @Get("/crx/server/crx.default/jcr:root/.1.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> plain/text */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getCrxdeStatus(
    ): kotlin.String {
        TODO()
    }

    @Get("/crx/packmgr/installstatus.jsp")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getInstallStatus(
    ): InstallStatus {
        TODO()
    }

    @Get("/crx/packmgr/service/script.html")
    @Description("")
    @ResponseContentType(MediaTypes.TEXT_HTML)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getPackageManagerServlet(
    ): Response<Unit> {
        TODO()
    }

    @Post("/crx/packmgr/service.jsp")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> text/xml */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postPackageService(
         @QueryParam(value = "cmd") cmd: kotlin.String
    ): kotlin.String {
        TODO()
    }

    @Post("/crx/packmgr/service/.json/{path}")
    @Description("")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postPackageServiceJson(
        @PathParam("path") path: kotlin.String, 
         @QueryParam(value = "cmd") cmd: kotlin.String, 
         @QueryParam(value = "groupName") groupName: kotlin.String?, 
         @QueryParam(value = "packageName") packageName: kotlin.String?, 
         @QueryParam(value = "packageVersion") packageVersion: kotlin.String?, 
         @QueryParam(value = "_charset_") charset: kotlin.String?, 
         @QueryParam(value = "force") force: kotlin.Boolean?, 
         @QueryParam(value = "recursive") recursive: kotlin.Boolean?, 
        @Valid `package`: HttpCall
    ): kotlin.String {
        TODO()
    }

    @Post("/crx/packmgr/update.jsp")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postPackageUpdate(
         @QueryParam(value = "groupName") groupName: kotlin.String, 
         @QueryParam(value = "packageName") packageName: kotlin.String, 
         @QueryParam(value = "version") version: kotlin.String, 
         @QueryParam(value = "path") path: kotlin.String, 
         @QueryParam(value = "filter") filter: kotlin.String?, 
         @QueryParam(value = "_charset_") charset: kotlin.String?
    ): kotlin.String {
        TODO()
    }

    @Post("/crx/explorer/ui/setpassword.jsp")
    @Description("")
    @ResponseContentType(MediaTypes.TEXT_PLAIN_UTF8)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postSetPassword(
         @QueryParam(value = "old") old: kotlin.String, 
         @QueryParam(value = "plain") plain: kotlin.String, 
         @QueryParam(value = "verify") verify: kotlin.String
    ): kotlin.String {
        TODO()
    }
}
