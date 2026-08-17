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
 * API tests for CustomApi
 */
@MicronautTest
public class CustomApiTest {

    @Inject
    CustomApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getAemHealthCheckTest() {
        // given
        String tags = "example";
        Boolean combineTagsOr = false;

        // when
        String body = api.getAemHealthCheck(tags, combineTagsOr).block();

        // then
        // TODO implement the getAemHealthCheckTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigAemHealthCheckServletTest() {
        // given
        List<String> bundlesIgnored = Arrays.asList("example");
        String bundlesIgnoredAtTypeHint = "example";

        // when
        api.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint).block();

        // then
        // TODO implement the postConfigAemHealthCheckServletTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postConfigAemPasswordResetTest() {
        // given
        List<String> pwdresetAuthorizables = Arrays.asList("example");
        String pwdresetAuthorizablesAtTypeHint = "example";

        // when
        api.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint).block();

        // then
        // TODO implement the postConfigAemPasswordResetTest()
    }

    
}
