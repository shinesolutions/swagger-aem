package org.openapitools.api

import org.openapitools.model.TruststoreInfo
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class LibsApiTest {

    private val api: LibsApiController = LibsApiController()

    /**
     * To test LibsApiController.getLoginPage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getLoginPageTest() {
        
        
        val response: ResponseEntity<kotlin.String> = api.getLoginPage()

        // TODO: test validations
    }

    /**
     * To test LibsApiController.getTruststoreInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getTruststoreInfoTest() {
        
        
        val response: ResponseEntity<TruststoreInfo> = api.getTruststoreInfo()

        // TODO: test validations
    }

    /**
     * To test LibsApiController.postAuthorizables
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postAuthorizablesTest() {
        val authorizableId: kotlin.String = TODO()
        val intermediatePath: kotlin.String = TODO()
        val createUser: kotlin.String? = TODO()
        val createGroup: kotlin.String? = TODO()
        val repPassword: kotlin.String? = TODO()
        val profileGivenName: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)

        // TODO: test validations
    }

    /**
     * To test LibsApiController.postTreeActivation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postTreeActivationTest() {
        val ignoredeactivated: kotlin.Boolean = TODO()
        val onlymodified: kotlin.Boolean = TODO()
        val path: kotlin.String = TODO()
        val cmd: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postTreeActivation(ignoredeactivated, onlymodified, path, cmd)

        // TODO: test validations
    }

    /**
     * To test LibsApiController.postTruststore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postTruststoreTest() {
        val operation: kotlin.String? = TODO()
        val newPassword: kotlin.String? = TODO()
        val rePassword: kotlin.String? = TODO()
        val keyStoreType: kotlin.String? = TODO()
        val removeAlias: kotlin.String? = TODO()
        val certificate: org.springframework.web.multipart.MultipartFile = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)

        // TODO: test validations
    }

    /**
     * To test LibsApiController.sslSetup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sslSetupTest() {
        val keystorePassword: kotlin.String = TODO()
        val keystorePasswordConfirm: kotlin.String = TODO()
        val truststorePassword: kotlin.String = TODO()
        val truststorePasswordConfirm: kotlin.String = TODO()
        val httpsHostname: kotlin.String = TODO()
        val httpsPort: kotlin.String = TODO()
        val privatekeyFile: org.springframework.web.multipart.MultipartFile = TODO()
        val certificateFile: org.springframework.web.multipart.MultipartFile = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)

        // TODO: test validations
    }
}
