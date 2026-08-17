package org.openapitools.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BinApiTest {

    private val api: BinApiController = BinApiController()

    /**
     * To test BinApiController.getQuery
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQueryTest() {
        val path: kotlin.String = TODO()
        val pLimit: java.math.BigDecimal = TODO()
        val `1property`: kotlin.String = TODO()
        val `1propertyValue`: kotlin.String = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.getQuery(path, pLimit, `1property`, `1propertyValue`)

        // TODO: test validations
    }

    /**
     * To test BinApiController.postQuery
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postQueryTest() {
        val path: kotlin.String = TODO()
        val pLimit: java.math.BigDecimal = TODO()
        val `1property`: kotlin.String = TODO()
        val `1propertyValue`: kotlin.String = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postQuery(path, pLimit, `1property`, `1propertyValue`)

        // TODO: test validations
    }
}
