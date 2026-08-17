package org.openapitools.api

import org.openapitools.model.BundleInfo
import org.openapitools.model.SamlConfigurationInfo
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class SystemApiTest {

    private val api: SystemApiController = SystemApiController()

    /**
     * To test SystemApiController.getAemHealthCheck
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAemHealthCheckTest() {
        val tags: kotlin.String? = TODO()
        val combineTagsOr: kotlin.Boolean? = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.getAemHealthCheck(tags, combineTagsOr)

        // TODO: test validations
    }

    /**
     * To test SystemApiController.getAemProductInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAemProductInfoTest() {
        
        
        val response: ResponseEntity<List<kotlin.String>> = api.getAemProductInfo()

        // TODO: test validations
    }

    /**
     * To test SystemApiController.getBundleInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBundleInfoTest() {
        val name: kotlin.String = TODO()
        
        
        val response: ResponseEntity<BundleInfo> = api.getBundleInfo(name)

        // TODO: test validations
    }

    /**
     * To test SystemApiController.getConfigMgr
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getConfigMgrTest() {
        
        
        val response: ResponseEntity<kotlin.String> = api.getConfigMgr()

        // TODO: test validations
    }

    /**
     * To test SystemApiController.postBundle
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postBundleTest() {
        val name: kotlin.String = TODO()
        val action: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postBundle(name, action)

        // TODO: test validations
    }

    /**
     * To test SystemApiController.postJmxRepository
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postJmxRepositoryTest() {
        val action: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postJmxRepository(action)

        // TODO: test validations
    }

    /**
     * To test SystemApiController.postSamlConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postSamlConfigurationTest() {
        val post: kotlin.Boolean? = TODO()
        val apply: kotlin.Boolean? = TODO()
        val delete: kotlin.Boolean? = TODO()
        val action: kotlin.String? = TODO()
        val dollarLocation: kotlin.String? = TODO()
        val path: kotlin.collections.List<kotlin.String>? = TODO()
        val serviceRanking: kotlin.Int? = TODO()
        val idpUrl: kotlin.String? = TODO()
        val idpCertAlias: kotlin.String? = TODO()
        val idpHttpRedirect: kotlin.Boolean? = TODO()
        val serviceProviderEntityId: kotlin.String? = TODO()
        val assertionConsumerServiceURL: kotlin.String? = TODO()
        val spPrivateKeyAlias: kotlin.String? = TODO()
        val keyStorePassword: kotlin.String? = TODO()
        val defaultRedirectUrl: kotlin.String? = TODO()
        val userIDAttribute: kotlin.String? = TODO()
        val useEncryption: kotlin.Boolean? = TODO()
        val createUser: kotlin.Boolean? = TODO()
        val addGroupMemberships: kotlin.Boolean? = TODO()
        val groupMembershipAttribute: kotlin.String? = TODO()
        val defaultGroups: kotlin.collections.List<kotlin.String>? = TODO()
        val nameIdFormat: kotlin.String? = TODO()
        val synchronizeAttributes: kotlin.collections.List<kotlin.String>? = TODO()
        val handleLogout: kotlin.Boolean? = TODO()
        val logoutUrl: kotlin.String? = TODO()
        val clockTolerance: kotlin.Int? = TODO()
        val digestMethod: kotlin.String? = TODO()
        val signatureMethod: kotlin.String? = TODO()
        val userIntermediatePath: kotlin.String? = TODO()
        val propertylist: kotlin.collections.List<kotlin.String>? = TODO()
        
        
        val response: ResponseEntity<SamlConfigurationInfo> = api.postSamlConfiguration(post, apply, delete, action, dollarLocation, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)

        // TODO: test validations
    }
}
