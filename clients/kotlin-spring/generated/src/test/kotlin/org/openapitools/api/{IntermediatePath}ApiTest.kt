package org.openapitools.api

import org.openapitools.model.KeystoreInfo
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class {IntermediatePath}ApiTest {

    private val api: {IntermediatePath}ApiController = {IntermediatePath}ApiController()

    /**
     * To test {IntermediatePath}ApiController.getAuthorizableKeystore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAuthorizableKeystoreTest() {
        val intermediatePath: kotlin.String = TODO()
        val authorizableId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<KeystoreInfo> = api.getAuthorizableKeystore(intermediatePath, authorizableId)

        // TODO: test validations
    }

    /**
     * To test {IntermediatePath}ApiController.getKeystore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getKeystoreTest() {
        val intermediatePath: kotlin.String = TODO()
        val authorizableId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getKeystore(intermediatePath, authorizableId)

        // TODO: test validations
    }

    /**
     * To test {IntermediatePath}ApiController.postAuthorizableKeystore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postAuthorizableKeystoreTest() {
        val intermediatePath: kotlin.String = TODO()
        val authorizableId: kotlin.String = TODO()
        val operation: kotlin.String? = TODO()
        val currentPassword: kotlin.String? = TODO()
        val newPassword: kotlin.String? = TODO()
        val rePassword: kotlin.String? = TODO()
        val keyPassword: kotlin.String? = TODO()
        val keyStorePass: kotlin.String? = TODO()
        val alias: kotlin.String? = TODO()
        val newAlias: kotlin.String? = TODO()
        val removeAlias: kotlin.String? = TODO()
        val certChain: org.springframework.web.multipart.MultipartFile = TODO()
        val pk: org.springframework.web.multipart.MultipartFile = TODO()
        val keyStore: org.springframework.web.multipart.MultipartFile = TODO()
        
        
        val response: ResponseEntity<KeystoreInfo> = api.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)

        // TODO: test validations
    }
}
