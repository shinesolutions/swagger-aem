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
import org.openapitools.server.api.model.InstallStatus

@MiskTest(startService = true)
internal class CrxApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var crxApi: CrxApiAction

    /**
     * To test CrxApiAction.getCrxdeStatus
     */
    @Test
    fun `should handle getCrxdeStatus`() {
        val response: kotlin.String = crxApi.getCrxdeStatus()
    }

    /**
     * To test CrxApiAction.getInstallStatus
     */
    @Test
    fun `should handle getInstallStatus`() {
        val response: InstallStatus = crxApi.getInstallStatus()
    }

    /**
     * To test CrxApiAction.getPackageManagerServlet
     */
    @Test
    fun `should handle getPackageManagerServlet`() {
        val response = crxApi.getPackageManagerServlet()
    }

    /**
     * To test CrxApiAction.postPackageService
     */
    @Test
    fun `should handle postPackageService`() {
        val cmd = TODO()
        val response: kotlin.String = crxApi.postPackageService(cmd)
    }

    /**
     * To test CrxApiAction.postPackageServiceJson
     */
    @Test
    fun `should handle postPackageServiceJson`() {
        val path = TODO()
        val cmd = TODO()
        val groupName = TODO()
        val packageName = TODO()
        val packageVersion = TODO()
        val charset = TODO()
        val force = TODO()
        val recursive = TODO()
        val `package` = TODO()
        val response: kotlin.String = crxApi.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, `package`)
    }

    /**
     * To test CrxApiAction.postPackageUpdate
     */
    @Test
    fun `should handle postPackageUpdate`() {
        val groupName = TODO()
        val packageName = TODO()
        val version = TODO()
        val path = TODO()
        val filter = TODO()
        val charset = TODO()
        val response: kotlin.String = crxApi.postPackageUpdate(groupName, packageName, version, path, filter, charset)
    }

    /**
     * To test CrxApiAction.postSetPassword
     */
    @Test
    fun `should handle postSetPassword`() {
        val old = TODO()
        val plain = TODO()
        val verify = TODO()
        val response: kotlin.String = crxApi.postSetPassword(old, plain, verify)
    }
}
