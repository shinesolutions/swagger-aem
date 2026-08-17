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
internal class CqApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var cqApi: CqApiAction

    /**
     * To test CqApiAction.getLoginPage
     */
    @Test
    fun `should handle getLoginPage`() {
        val response: kotlin.String = cqApi.getLoginPage()
    }

    /**
     * To test CqApiAction.postCqActions
     */
    @Test
    fun `should handle postCqActions`() {
        val authorizableId = TODO()
        val changelog = TODO()
        val response = cqApi.postCqActions(authorizableId, changelog)
    }
}
