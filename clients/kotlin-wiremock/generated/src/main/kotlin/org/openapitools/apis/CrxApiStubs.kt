@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class CrxApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getCrxdeStatus.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCrxdeStatusStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCrxdeStatus(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCrxdeStatusStubBuilder =
        GetCrxdeStatusStubBuilder(objectMapper, get(urlPathTemplate("/crx/server/crx.default/jcr:root/.1.json"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getInstallStatus.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetInstallStatusStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getInstallStatus(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetInstallStatusStubBuilder =
        GetInstallStatusStubBuilder(objectMapper, get(urlPathTemplate("/crx/packmgr/installstatus.jsp"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getPackageManagerServlet.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPackageManagerServletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPackageManagerServlet(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPackageManagerServletStubBuilder =
        GetPackageManagerServletStubBuilder(objectMapper, get(urlPathTemplate("/crx/packmgr/service/script.html"))
            .configurer()
        )

    /**
     * Construct a stub for the operation postPackageService.
     *
     * @param cmd query parameter cmd pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostPackageServiceStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postPackageService(cmd: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostPackageServiceStubBuilder =
        PostPackageServiceStubBuilder(objectMapper, post(urlPathTemplate("/crx/packmgr/service.jsp"))
            .apply { cmd?.let { withQueryParam("cmd", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postPackageServiceJson.
     *
     * @param path path parameter path pattern.
     * @param cmd query parameter cmd pattern.
     * @param groupName query parameter groupName pattern.
     * @param packageName query parameter packageName pattern.
     * @param packageVersion query parameter packageVersion pattern.
     * @param charset query parameter charset pattern.
     * @param force query parameter force pattern.
     * @param recursive query parameter recursive pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostPackageServiceJsonStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postPackageServiceJson(path: StringValuePattern, cmd: StringValuePattern? = null, groupName: StringValuePattern? = null, packageName: StringValuePattern? = null, packageVersion: StringValuePattern? = null, charset: StringValuePattern? = null, force: StringValuePattern? = null, recursive: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostPackageServiceJsonStubBuilder =
        PostPackageServiceJsonStubBuilder(objectMapper, post(urlPathTemplate("/crx/packmgr/service/.json/{path}"))
            .withPathParam("path", path)
            .apply { cmd?.let { withQueryParam("cmd", it) } }
            .apply { groupName?.let { withQueryParam("groupName", it) } }
            .apply { packageName?.let { withQueryParam("packageName", it) } }
            .apply { packageVersion?.let { withQueryParam("packageVersion", it) } }
            .apply { charset?.let { withQueryParam("_charset_", it) } }
            .apply { force?.let { withQueryParam("force", it) } }
            .apply { recursive?.let { withQueryParam("recursive", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postPackageUpdate.
     *
     * @param groupName query parameter groupName pattern.
     * @param packageName query parameter packageName pattern.
     * @param version query parameter version pattern.
     * @param path query parameter path pattern.
     * @param filter query parameter filter pattern.
     * @param charset query parameter charset pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostPackageUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postPackageUpdate(groupName: StringValuePattern? = null, packageName: StringValuePattern? = null, version: StringValuePattern? = null, path: StringValuePattern? = null, filter: StringValuePattern? = null, charset: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostPackageUpdateStubBuilder =
        PostPackageUpdateStubBuilder(objectMapper, post(urlPathTemplate("/crx/packmgr/update.jsp"))
            .apply { groupName?.let { withQueryParam("groupName", it) } }
            .apply { packageName?.let { withQueryParam("packageName", it) } }
            .apply { version?.let { withQueryParam("version", it) } }
            .apply { path?.let { withQueryParam("path", it) } }
            .apply { filter?.let { withQueryParam("filter", it) } }
            .apply { charset?.let { withQueryParam("_charset_", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postSetPassword.
     *
     * @param old query parameter old pattern.
     * @param plain query parameter plain pattern.
     * @param verify query parameter verify pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostSetPasswordStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postSetPassword(old: StringValuePattern? = null, plain: StringValuePattern? = null, verify: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostSetPasswordStubBuilder =
        PostSetPasswordStubBuilder(objectMapper, post(urlPathTemplate("/crx/explorer/ui/setpassword.jsp"))
            .apply { old?.let { withQueryParam("old", it) } }
            .apply { plain?.let { withQueryParam("plain", it) } }
            .apply { verify?.let { withQueryParam("verify", it) } }
            .configurer()
        )
}
