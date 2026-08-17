package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader

@MiskTest(startService = true)
internal class CustomApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var customApi: CustomApiAction

    /**
     * To test CustomApiAction.getAemHealthCheck
     */
    @Test
    fun `should handle getAemHealthCheck`() {
        val tags = TODO()
        val combineTagsOr = TODO()
        val response: kotlin.String = customApi.getAemHealthCheck(tags, combineTagsOr)
    }

    /**
     * To test CustomApiAction.postConfigAemHealthCheckServlet
     */
    @Test
    fun `should handle postConfigAemHealthCheckServlet`() {
        val bundlesIgnored = TODO()
        val bundlesIgnoredAtTypeHint = TODO()
        val response = customApi.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint)
    }

    /**
     * To test CustomApiAction.postConfigAemPasswordReset
     */
    @Test
    fun `should handle postConfigAemPasswordReset`() {
        val pwdresetAuthorizables = TODO()
        val pwdresetAuthorizablesAtTypeHint = TODO()
        val response = customApi.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint)
    }
}
