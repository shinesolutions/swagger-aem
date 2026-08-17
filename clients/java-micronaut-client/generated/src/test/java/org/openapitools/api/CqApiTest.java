package org.openapitools.api;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for CqApi
 */
@MicronautTest
public class CqApiTest {

    @Inject
    CqApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getLoginPageTest() {
        // given

        // when
        String body = api.getLoginPage().block();

        // then
        // TODO implement the getLoginPageTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postCqActionsTest() {
        // given
        String authorizableId = "example";
        String changelog = "example";

        // when
        api.postCqActions(authorizableId, changelog).block();

        // then
        // TODO implement the postCqActionsTest()
    }

    
}
