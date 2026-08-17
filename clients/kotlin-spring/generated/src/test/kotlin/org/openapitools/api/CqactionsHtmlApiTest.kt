package org.openapitools.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CqactionsHtmlApiTest {

    private val api: CqactionsHtmlApiController = CqactionsHtmlApiController()

    /**
     * To test CqactionsHtmlApiController.postCqActions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postCqActionsTest() {
        val authorizableId: kotlin.String = TODO()
        val changelog: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postCqActions(authorizableId, changelog)

        // TODO: test validations
    }
}
