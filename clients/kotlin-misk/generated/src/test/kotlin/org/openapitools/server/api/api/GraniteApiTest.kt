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
internal class GraniteApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var graniteApi: GraniteApiAction

    /**
     * To test GraniteApiAction.sslSetup
     */
    @Test
    fun `should handle sslSetup`() {
        val keystorePassword = TODO()
        val keystorePasswordConfirm = TODO()
        val truststorePassword = TODO()
        val truststorePasswordConfirm = TODO()
        val httpsHostname = TODO()
        val httpsPort = TODO()
        val privatekeyFile = TODO()
        val certificateFile = TODO()
        val response: kotlin.String = graniteApi.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)
    }
}
