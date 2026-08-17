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
open class CustomApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getAemHealthCheck.
     *
     * @param tags query parameter tags pattern.
     * @param combineTagsOr query parameter combineTagsOr pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAemHealthCheckStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAemHealthCheck(tags: StringValuePattern? = null, combineTagsOr: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAemHealthCheckStubBuilder =
        GetAemHealthCheckStubBuilder(objectMapper, get(urlPathTemplate("/system/health"))
            .apply { tags?.let { withQueryParam("tags", it) } }
            .apply { combineTagsOr?.let { withQueryParam("combineTagsOr", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigAemHealthCheckServlet.
     *
     * @param bundlesIgnored query parameter bundlesIgnored pattern.
     * @param bundlesIgnoredAtTypeHint query parameter bundlesIgnoredAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigAemHealthCheckServletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigAemHealthCheckServlet(bundlesIgnored: StringValuePattern? = null, bundlesIgnoredAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigAemHealthCheckServletStubBuilder =
        PostConfigAemHealthCheckServletStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"))
            .apply { bundlesIgnored?.let { withQueryParam("bundles.ignored", it) } }
            .apply { bundlesIgnoredAtTypeHint?.let { withQueryParam("bundles.ignored@TypeHint", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigAemPasswordReset.
     *
     * @param pwdresetAuthorizables query parameter pwdresetAuthorizables pattern.
     * @param pwdresetAuthorizablesAtTypeHint query parameter pwdresetAuthorizablesAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigAemPasswordResetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigAemPasswordReset(pwdresetAuthorizables: StringValuePattern? = null, pwdresetAuthorizablesAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigAemPasswordResetStubBuilder =
        PostConfigAemPasswordResetStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"))
            .apply { pwdresetAuthorizables?.let { withQueryParam("pwdreset.authorizables", it) } }
            .apply { pwdresetAuthorizablesAtTypeHint?.let { withQueryParam("pwdreset.authorizables@TypeHint", it) } }
            .configurer()
        )
}
