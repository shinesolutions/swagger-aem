package org.openapitools.controller;

import io.micronaut.http.multipart.CompletedFileUpload;
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
 * API tests for GraniteController
 */
@MicronautTest
public class GraniteControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    GraniteController controller;

    /**
     * This test is used to validate the implementation of sslSetup() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void sslSetupMethodTest() {
        // given
        String keystorePassword = "example";
        String keystorePasswordConfirm = "example";
        String truststorePassword = "example";
        String truststorePasswordConfirm = "example";
        String httpsHostname = "example";
        String httpsPort = "example";
        CompletedFileUpload privatekeyFile = null;
        CompletedFileUpload certificateFile = null;

        // when
        String result = controller.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/libs/granite/security/post/sslSetup.html' to the features of sslSetup() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void sslSetupClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("privatekeyFile", new FileReader(File.createTempFile("test", ".tmp")));
            put("certificateFile", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/libs/granite/security/post/sslSetup.html").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@fb5aeed");
        request.getParameters()
            .add("keystorePassword", "example") // The query parameter format should be 
            .add("keystorePasswordConfirm", "example") // The query parameter format should be 
            .add("truststorePassword", "example") // The query parameter format should be 
            .add("truststorePasswordConfirm", "example") // The query parameter format should be 
            .add("httpsHostname", "example") // The query parameter format should be 
            .add("httpsPort", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
