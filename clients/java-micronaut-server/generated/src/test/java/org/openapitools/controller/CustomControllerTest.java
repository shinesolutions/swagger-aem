package org.openapitools.controller;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for CustomController
 */
@MicronautTest
public class CustomControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CustomController controller;

    /**
     * This test is used to validate the implementation of getAemHealthCheck() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAemHealthCheckMethodTest() {
        // given
        String tags = "example";
        Boolean combineTagsOr = false;

        // when
        String result = controller.getAemHealthCheck(tags, combineTagsOr).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/system/health' to the features of getAemHealthCheck() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAemHealthCheckClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/system/health").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@34c53688");
        request.getParameters()
            .add("tags", "example") // The query parameter format should be 
            .add("combineTagsOr", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigAemHealthCheckServlet() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigAemHealthCheckServletMethodTest() {
        // given
        List<String> bundlesIgnored = Arrays.asList("example");
        String bundlesIgnoredAtTypeHint = "example";

        // when
        controller.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck' to the features of postConfigAemHealthCheckServlet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigAemHealthCheckServletClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@6ffd4c0d");
        request.getParameters()
            .add("bundles.ignored", Arrays.asList("example")) // The query format should be multi
            .add("bundles.ignored@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigAemPasswordReset() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigAemPasswordResetMethodTest() {
        // given
        List<String> pwdresetAuthorizables = Arrays.asList("example");
        String pwdresetAuthorizablesAtTypeHint = "example";

        // when
        controller.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/com.shinesolutions.aem.passwordreset.Activator' to the features of postConfigAemPasswordReset() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigAemPasswordResetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@74c9e11");
        request.getParameters()
            .add("pwdreset.authorizables", Arrays.asList("example")) // The query format should be multi
            .add("pwdreset.authorizables@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
