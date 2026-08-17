package org.openapitools.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class {Path}ApiTest {

    private val api: {Path}ApiController = {Path}ApiController()

    /**
     * To test {Path}ApiController.deleteNode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteNodeTest() {
        val path: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.deleteNode(path, name)

        // TODO: test validations
    }

    /**
     * To test {Path}ApiController.getNode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getNodeTest() {
        val path: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.getNode(path, name)

        // TODO: test validations
    }

    /**
     * To test {Path}ApiController.postNode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postNodeTest() {
        val path: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        val operation: kotlin.String? = TODO()
        val deleteAuthorizable: kotlin.String? = TODO()
        val file: org.springframework.web.multipart.MultipartFile = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postNode(path, name, operation, deleteAuthorizable, file)

        // TODO: test validations
    }

    /**
     * To test {Path}ApiController.postNodeRw
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postNodeRwTest() {
        val path: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        val addMembers: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postNodeRw(path, name, addMembers)

        // TODO: test validations
    }

    /**
     * To test {Path}ApiController.postPath
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postPathTest() {
        val path: kotlin.String = TODO()
        val jcrPrimaryType: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postPath(path, jcrPrimaryType, name)

        // TODO: test validations
    }
}
