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
open class GraniteApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation sslSetup.
     *
     * @param keystorePassword query parameter keystorePassword pattern.
     * @param keystorePasswordConfirm query parameter keystorePasswordConfirm pattern.
     * @param truststorePassword query parameter truststorePassword pattern.
     * @param truststorePasswordConfirm query parameter truststorePasswordConfirm pattern.
     * @param httpsHostname query parameter httpsHostname pattern.
     * @param httpsPort query parameter httpsPort pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SslSetupStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun sslSetup(keystorePassword: StringValuePattern? = null, keystorePasswordConfirm: StringValuePattern? = null, truststorePassword: StringValuePattern? = null, truststorePasswordConfirm: StringValuePattern? = null, httpsHostname: StringValuePattern? = null, httpsPort: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SslSetupStubBuilder =
        SslSetupStubBuilder(objectMapper, post(urlPathTemplate("/libs/granite/security/post/sslSetup.html"))
            .apply { keystorePassword?.let { withQueryParam("keystorePassword", it) } }
            .apply { keystorePasswordConfirm?.let { withQueryParam("keystorePasswordConfirm", it) } }
            .apply { truststorePassword?.let { withQueryParam("truststorePassword", it) } }
            .apply { truststorePasswordConfirm?.let { withQueryParam("truststorePasswordConfirm", it) } }
            .apply { httpsHostname?.let { withQueryParam("httpsHostname", it) } }
            .apply { httpsPort?.let { withQueryParam("httpsPort", it) } }
            .configurer()
        )
}
