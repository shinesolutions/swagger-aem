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
import org.openapitools.server.api.model.BundleInfo
import org.openapitools.server.api.model.SamlConfigurationInfo

@MiskTest(startService = true)
internal class ConsoleApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var consoleApi: ConsoleApiAction

    /**
     * To test ConsoleApiAction.getAemProductInfo
     */
    @Test
    fun `should handle getAemProductInfo`() {
        val response: kotlin.collections.List<kotlin.String> = consoleApi.getAemProductInfo()
    }

    /**
     * To test ConsoleApiAction.getBundleInfo
     */
    @Test
    fun `should handle getBundleInfo`() {
        val name = TODO()
        val response: BundleInfo = consoleApi.getBundleInfo(name)
    }

    /**
     * To test ConsoleApiAction.getConfigMgr
     */
    @Test
    fun `should handle getConfigMgr`() {
        val response: kotlin.String = consoleApi.getConfigMgr()
    }

    /**
     * To test ConsoleApiAction.postBundle
     */
    @Test
    fun `should handle postBundle`() {
        val name = TODO()
        val action = TODO()
        val response = consoleApi.postBundle(name, action)
    }

    /**
     * To test ConsoleApiAction.postJmxRepository
     */
    @Test
    fun `should handle postJmxRepository`() {
        val action = TODO()
        val response = consoleApi.postJmxRepository(action)
    }

    /**
     * To test ConsoleApiAction.postSamlConfiguration
     */
    @Test
    fun `should handle postSamlConfiguration`() {
        val post = TODO()
        val apply = TODO()
        val delete = TODO()
        val action = TODO()
        val dollarLocation = TODO()
        val path = TODO()
        val serviceRanking = TODO()
        val idpUrl = TODO()
        val idpCertAlias = TODO()
        val idpHttpRedirect = TODO()
        val serviceProviderEntityId = TODO()
        val assertionConsumerServiceURL = TODO()
        val spPrivateKeyAlias = TODO()
        val keyStorePassword = TODO()
        val defaultRedirectUrl = TODO()
        val userIDAttribute = TODO()
        val useEncryption = TODO()
        val createUser = TODO()
        val addGroupMemberships = TODO()
        val groupMembershipAttribute = TODO()
        val defaultGroups = TODO()
        val nameIdFormat = TODO()
        val synchronizeAttributes = TODO()
        val handleLogout = TODO()
        val logoutUrl = TODO()
        val clockTolerance = TODO()
        val digestMethod = TODO()
        val signatureMethod = TODO()
        val userIntermediatePath = TODO()
        val propertylist = TODO()
        val response: SamlConfigurationInfo = consoleApi.postSamlConfiguration(post, apply, delete, action, dollarLocation, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)
    }
}
