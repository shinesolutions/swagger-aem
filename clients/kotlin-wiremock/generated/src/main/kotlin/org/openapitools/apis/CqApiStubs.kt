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
open class CqApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getLoginPage.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetLoginPageStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getLoginPage(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetLoginPageStubBuilder =
        GetLoginPageStubBuilder(objectMapper, get(urlPathTemplate("/libs/granite/core/content/login.html"))
            .configurer()
        )

    /**
     * Construct a stub for the operation postCqActions.
     *
     * @param authorizableId query parameter authorizableId pattern.
     * @param changelog query parameter changelog pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostCqActionsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postCqActions(authorizableId: StringValuePattern? = null, changelog: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostCqActionsStubBuilder =
        PostCqActionsStubBuilder(objectMapper, post(urlPathTemplate("/.cqactions.html"))
            .apply { authorizableId?.let { withQueryParam("authorizableId", it) } }
            .apply { changelog?.let { withQueryParam("changelog", it) } }
            .configurer()
        )
}
