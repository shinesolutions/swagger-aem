package org.openapitools.api

import org.openapitools.model.InstallStatus
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CrxApiTest {

    private val api: CrxApiController = CrxApiController()

    /**
     * To test CrxApiController.getCrxdeStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCrxdeStatusTest() {
        
        
        val response: ResponseEntity<kotlin.String> = api.getCrxdeStatus()

        // TODO: test validations
    }

    /**
     * To test CrxApiController.getInstallStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getInstallStatusTest() {
        
        
        val response: ResponseEntity<InstallStatus> = api.getInstallStatus()

        // TODO: test validations
    }

    /**
     * To test CrxApiController.getPackageManagerServlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPackageManagerServletTest() {
        
        
        val response: ResponseEntity<Unit> = api.getPackageManagerServlet()

        // TODO: test validations
    }

    /**
     * To test CrxApiController.postPackageService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postPackageServiceTest() {
        val cmd: kotlin.String = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postPackageService(cmd)

        // TODO: test validations
    }

    /**
     * To test CrxApiController.postPackageServiceJson
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postPackageServiceJsonTest() {
        val path: kotlin.String = TODO()
        val cmd: kotlin.String = TODO()
        val groupName: kotlin.String? = TODO()
        val packageName: kotlin.String? = TODO()
        val packageVersion: kotlin.String? = TODO()
        val charset: kotlin.String? = TODO()
        val force: kotlin.Boolean? = TODO()
        val recursive: kotlin.Boolean? = TODO()
        val `package`: org.springframework.web.multipart.MultipartFile = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, `package`)

        // TODO: test validations
    }

    /**
     * To test CrxApiController.postPackageUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postPackageUpdateTest() {
        val groupName: kotlin.String = TODO()
        val packageName: kotlin.String = TODO()
        val version: kotlin.String = TODO()
        val path: kotlin.String = TODO()
        val filter: kotlin.String? = TODO()
        val charset: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postPackageUpdate(groupName, packageName, version, path, filter, charset)

        // TODO: test validations
    }

    /**
     * To test CrxApiController.postSetPassword
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postSetPasswordTest() {
        val old: kotlin.String = TODO()
        val plain: kotlin.String = TODO()
        val verify: kotlin.String = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postSetPassword(old, plain, verify)

        // TODO: test validations
    }
}
