package org.openapitools.controller;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;
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
 * API tests for ConsoleController
 */
@MicronautTest
public class ConsoleControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ConsoleController controller;

    /**
     * This test is used to validate the implementation of getAemProductInfo() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAemProductInfoMethodTest() {
        // given

        // when
        List<String> result = controller.getAemProductInfo().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/system/console/status-productinfo.json' to the features of getAemProductInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAemProductInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/system/console/status-productinfo.json").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2744dcae");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, String.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getBundleInfo() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getBundleInfoMethodTest() {
        // given
        String name = "example";

        // when
        BundleInfo result = controller.getBundleInfo(name).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/system/console/bundles/{name}.json' to the features of getBundleInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getBundleInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/system/console/bundles/{name}.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@16d0e521");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BundleInfo.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getConfigMgr() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getConfigMgrMethodTest() {
        // given

        // when
        String result = controller.getConfigMgr().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/system/console/configMgr' to the features of getConfigMgr() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getConfigMgrClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/system/console/configMgr").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@634ca3e7");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postBundle() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postBundleMethodTest() {
        // given
        String name = "example";
        String action = "example";

        // when
        controller.postBundle(name, action).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/system/console/bundles/{name}' to the features of postBundle() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postBundleClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/system/console/bundles/{name}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@ab4aa5e");
        request.getParameters()
            .add("action", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postJmxRepository() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postJmxRepositoryMethodTest() {
        // given
        String action = "example";

        // when
        controller.postJmxRepository(action).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/system/console/jmx/com.adobe.granite:type=Repository/op/{action}' to the features of postJmxRepository() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postJmxRepositoryClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/system/console/jmx/com.adobe.granite:type=Repository/op/{action}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("action", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@b14b60a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postSamlConfiguration() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postSamlConfigurationMethodTest() {
        // given
        Boolean post = false;
        Boolean apply = false;
        Boolean delete = false;
        String action = "example";
        String $location = "example";
        List<String> path = Arrays.asList("example");
        Integer serviceRanking = 56;
        String idpUrl = "example";
        String idpCertAlias = "example";
        Boolean idpHttpRedirect = false;
        String serviceProviderEntityId = "example";
        String assertionConsumerServiceURL = "example";
        String spPrivateKeyAlias = "example";
        String keyStorePassword = "example";
        String defaultRedirectUrl = "example";
        String userIDAttribute = "example";
        Boolean useEncryption = false;
        Boolean createUser = false;
        Boolean addGroupMemberships = false;
        String groupMembershipAttribute = "example";
        List<String> defaultGroups = Arrays.asList("example");
        String nameIdFormat = "example";
        List<String> synchronizeAttributes = Arrays.asList("example");
        Boolean handleLogout = false;
        String logoutUrl = "example";
        Integer clockTolerance = 56;
        String digestMethod = "example";
        String signatureMethod = "example";
        String userIntermediatePath = "example";
        List<String> propertylist = Arrays.asList("example");

        // when
        SamlConfigurationInfo result = controller.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler' to the features of postSamlConfiguration() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postSamlConfigurationClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@1a7cb3a4");
        request.getParameters()
            .add("post", String.valueOf(false)) // The query parameter format should be 
            .add("apply", String.valueOf(false)) // The query parameter format should be 
            .add("delete", String.valueOf(false)) // The query parameter format should be 
            .add("action", "example") // The query parameter format should be 
            .add("$location", "example") // The query parameter format should be 
            .add("path", Arrays.asList("example")) // The query format should be multi
            .add("service.ranking", String.valueOf(56)) // The query parameter format should be 
            .add("idpUrl", "example") // The query parameter format should be 
            .add("idpCertAlias", "example") // The query parameter format should be 
            .add("idpHttpRedirect", String.valueOf(false)) // The query parameter format should be 
            .add("serviceProviderEntityId", "example") // The query parameter format should be 
            .add("assertionConsumerServiceURL", "example") // The query parameter format should be 
            .add("spPrivateKeyAlias", "example") // The query parameter format should be 
            .add("keyStorePassword", "example") // The query parameter format should be 
            .add("defaultRedirectUrl", "example") // The query parameter format should be 
            .add("userIDAttribute", "example") // The query parameter format should be 
            .add("useEncryption", String.valueOf(false)) // The query parameter format should be 
            .add("createUser", String.valueOf(false)) // The query parameter format should be 
            .add("addGroupMemberships", String.valueOf(false)) // The query parameter format should be 
            .add("groupMembershipAttribute", "example") // The query parameter format should be 
            .add("defaultGroups", Arrays.asList("example")) // The query format should be multi
            .add("nameIdFormat", "example") // The query parameter format should be 
            .add("synchronizeAttributes", Arrays.asList("example")) // The query format should be multi
            .add("handleLogout", String.valueOf(false)) // The query parameter format should be 
            .add("logoutUrl", "example") // The query parameter format should be 
            .add("clockTolerance", String.valueOf(56)) // The query parameter format should be 
            .add("digestMethod", "example") // The query parameter format should be 
            .add("signatureMethod", "example") // The query parameter format should be 
            .add("userIntermediatePath", "example") // The query parameter format should be 
            .add("propertylist", String.valueOf(Arrays.asList("example"))); // The query parameter format should be csv

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SamlConfigurationInfo.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
