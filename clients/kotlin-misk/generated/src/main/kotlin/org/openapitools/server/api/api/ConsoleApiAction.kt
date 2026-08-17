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
import org.openapitools.server.api.model.BundleInfo
import org.openapitools.server.api.model.SamlConfigurationInfo

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ConsoleApiAction @Inject constructor(
) : WebAction {

    @Get("/system/console/status-productinfo.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAemProductInfo(
    ): kotlin.collections.List<kotlin.String> {
        TODO()
    }

    @Get("/system/console/bundles/{name}.json")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getBundleInfo(
        @PathParam("name") name: kotlin.String
    ): BundleInfo {
        TODO()
    }

    @Get("/system/console/configMgr")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> text/xml */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getConfigMgr(
    ): kotlin.String {
        TODO()
    }

    @Post("/system/console/bundles/{name}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postBundle(
        @PathParam("name") name: kotlin.String, 
         @QueryParam(value = "action") action: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Post("/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}")
    @Description("")
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postJmxRepository(
        @PathParam("action") action: kotlin.String
    ): Response<Unit> {
        TODO()
    }

    @Post("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
    @Description("")
    @ResponseContentType(MediaTypes.TEXT_PLAIN_UTF8)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun postSamlConfiguration(
         @QueryParam(value = "post") post: kotlin.Boolean?, 
         @QueryParam(value = "apply") apply: kotlin.Boolean?, 
         @QueryParam(value = "delete") delete: kotlin.Boolean?, 
         @QueryParam(value = "action") action: kotlin.String?, 
         @QueryParam(value = "$location") dollarLocation: kotlin.String?, 
         @QueryParam(value = "path") path: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "service.ranking") serviceRanking: kotlin.Int?, 
         @QueryParam(value = "idpUrl") idpUrl: kotlin.String?, 
         @QueryParam(value = "idpCertAlias") idpCertAlias: kotlin.String?, 
         @QueryParam(value = "idpHttpRedirect") idpHttpRedirect: kotlin.Boolean?, 
         @QueryParam(value = "serviceProviderEntityId") serviceProviderEntityId: kotlin.String?, 
         @QueryParam(value = "assertionConsumerServiceURL") assertionConsumerServiceURL: kotlin.String?, 
         @QueryParam(value = "spPrivateKeyAlias") spPrivateKeyAlias: kotlin.String?, 
         @QueryParam(value = "keyStorePassword") keyStorePassword: kotlin.String?, 
         @QueryParam(value = "defaultRedirectUrl") defaultRedirectUrl: kotlin.String?, 
         @QueryParam(value = "userIDAttribute") userIDAttribute: kotlin.String?, 
         @QueryParam(value = "useEncryption") useEncryption: kotlin.Boolean?, 
         @QueryParam(value = "createUser") createUser: kotlin.Boolean?, 
         @QueryParam(value = "addGroupMemberships") addGroupMemberships: kotlin.Boolean?, 
         @QueryParam(value = "groupMembershipAttribute") groupMembershipAttribute: kotlin.String?, 
         @QueryParam(value = "defaultGroups") defaultGroups: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "nameIdFormat") nameIdFormat: kotlin.String?, 
         @QueryParam(value = "synchronizeAttributes") synchronizeAttributes: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "handleLogout") handleLogout: kotlin.Boolean?, 
         @QueryParam(value = "logoutUrl") logoutUrl: kotlin.String?, 
         @QueryParam(value = "clockTolerance") clockTolerance: kotlin.Int?, 
         @QueryParam(value = "digestMethod") digestMethod: kotlin.String?, 
         @QueryParam(value = "signatureMethod") signatureMethod: kotlin.String?, 
         @QueryParam(value = "userIntermediatePath") userIntermediatePath: kotlin.String?, 
         @QueryParam(value = "propertylist") propertylist: kotlin.collections.List<kotlin.String>?
    ): SamlConfigurationInfo {
        TODO()
    }
}
