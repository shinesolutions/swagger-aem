package org.openapitools.controller;

import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.InstallStatus;
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
 * API tests for CrxController
 */
@MicronautTest
public class CrxControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CrxController controller;

    /**
     * This test is used to validate the implementation of getCrxdeStatus() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCrxdeStatusMethodTest() {
        // given

        // when
        String result = controller.getCrxdeStatus().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/crx/server/crx.default/jcr:root/.1.json' to the features of getCrxdeStatus() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCrxdeStatusClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/crx/server/crx.default/jcr:root/.1.json").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1f15e689");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getInstallStatus() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getInstallStatusMethodTest() {
        // given

        // when
        InstallStatus result = controller.getInstallStatus().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/crx/packmgr/installstatus.jsp' to the features of getInstallStatus() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getInstallStatusClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/crx/packmgr/installstatus.jsp").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@195113de");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, InstallStatus.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getPackageManagerServlet() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getPackageManagerServletMethodTest() {
        // given

        // when
        controller.getPackageManagerServlet().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/crx/packmgr/service/script.html' to the features of getPackageManagerServlet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getPackageManagerServletClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/crx/packmgr/service/script.html").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3ebc955b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postPackageService() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postPackageServiceMethodTest() {
        // given
        String cmd = "example";

        // when
        String result = controller.postPackageService(cmd).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/crx/packmgr/service.jsp' to the features of postPackageService() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postPackageServiceClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/crx/packmgr/service.jsp").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@21a46ff1");
        request.getParameters()
            .add("cmd", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postPackageServiceJson() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postPackageServiceJsonMethodTest() {
        // given
        String path = "example";
        String cmd = "example";
        String groupName = "example";
        String packageName = "example";
        String packageVersion = "example";
        String charset = "example";
        Boolean force = false;
        Boolean recursive = false;
        CompletedFileUpload _package = null;

        // when
        String result = controller.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/crx/packmgr/service/.json/{path}' to the features of postPackageServiceJson() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postPackageServiceJsonClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("package", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/crx/packmgr/service/.json/{path}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("path", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@11b5f4e2");
        request.getParameters()
            .add("cmd", "example") // The query parameter format should be 
            .add("groupName", "example") // The query parameter format should be 
            .add("packageName", "example") // The query parameter format should be 
            .add("packageVersion", "example") // The query parameter format should be 
            .add("_charset_", "example") // The query parameter format should be 
            .add("force", String.valueOf(false)) // The query parameter format should be 
            .add("recursive", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postPackageUpdate() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postPackageUpdateMethodTest() {
        // given
        String groupName = "example";
        String packageName = "example";
        String version = "example";
        String path = "example";
        String filter = "example";
        String charset = "example";

        // when
        String result = controller.postPackageUpdate(groupName, packageName, version, path, filter, charset).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/crx/packmgr/update.jsp' to the features of postPackageUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postPackageUpdateClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/crx/packmgr/update.jsp").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@6bcae9");
        request.getParameters()
            .add("groupName", "example") // The query parameter format should be 
            .add("packageName", "example") // The query parameter format should be 
            .add("version", "example") // The query parameter format should be 
            .add("path", "example") // The query parameter format should be 
            .add("filter", "example") // The query parameter format should be 
            .add("_charset_", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postSetPassword() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postSetPasswordMethodTest() {
        // given
        String old = "example";
        String plain = "example";
        String verify = "example";

        // when
        String result = controller.postSetPassword(old, plain, verify).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/crx/explorer/ui/setpassword.jsp' to the features of postSetPassword() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postSetPasswordClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/crx/explorer/ui/setpassword.jsp").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@5aa781f2");
        request.getParameters()
            .add("old", "example") // The query parameter format should be 
            .add("plain", "example") // The query parameter format should be 
            .add("verify", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
