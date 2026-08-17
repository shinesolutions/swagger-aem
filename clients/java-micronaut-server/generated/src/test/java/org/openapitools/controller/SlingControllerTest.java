package org.openapitools.controller;

import java.math.BigDecimal;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.KeystoreInfo;
import org.openapitools.model.TruststoreInfo;
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
 * API tests for SlingController
 */
@MicronautTest
public class SlingControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    SlingController controller;

    /**
     * This test is used to validate the implementation of deleteAgent() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteAgentMethodTest() {
        // given
        String runmode = "example";
        String name = "example";

        // when
        controller.deleteAgent(runmode, name).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/replication/agents.{runmode}/{name}' to the features of deleteAgent() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteAgentClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/etc/replication/agents.{runmode}/{name}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("runmode", "example");
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@231cdda8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteNode() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteNodeMethodTest() {
        // given
        String path = "example";
        String name = "example";

        // when
        controller.deleteNode(path, name).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{path}/{name}' to the features of deleteNode() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteNodeClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/{path}/{name}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("path", "example");
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@6b70d1fb");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getAgent() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAgentMethodTest() {
        // given
        String runmode = "example";
        String name = "example";

        // when
        controller.getAgent(runmode, name).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/replication/agents.{runmode}/{name}' to the features of getAgent() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAgentClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/etc/replication/agents.{runmode}/{name}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("runmode", "example");
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3002e397");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getAgents() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAgentsMethodTest() {
        // given
        String runmode = "example";

        // when
        String result = controller.getAgents(runmode).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/replication/agents.{runmode}.-1.json' to the features of getAgents() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAgentsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/etc/replication/agents.{runmode}.-1.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("runmode", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7da1e005");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getAuthorizableKeystore() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAuthorizableKeystoreMethodTest() {
        // given
        String intermediatePath = "example";
        String authorizableId = "example";

        // when
        KeystoreInfo result = controller.getAuthorizableKeystore(intermediatePath, authorizableId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{intermediatePath}/{authorizableId}.ks.json' to the features of getAuthorizableKeystore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAuthorizableKeystoreClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/{intermediatePath}/{authorizableId}.ks.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("intermediatePath", "example");
            put("authorizableId", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@38159384");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, KeystoreInfo.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getKeystore() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getKeystoreMethodTest() {
        // given
        String intermediatePath = "example";
        String authorizableId = "example";

        // when
        CompletedFileUpload result = controller.getKeystore(intermediatePath, authorizableId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{intermediatePath}/{authorizableId}/keystore/store.p12' to the features of getKeystore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getKeystoreClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/{intermediatePath}/{authorizableId}/keystore/store.p12").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("intermediatePath", "example");
            put("authorizableId", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@55877274");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getNode() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getNodeMethodTest() {
        // given
        String path = "example";
        String name = "example";

        // when
        controller.getNode(path, name).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{path}/{name}' to the features of getNode() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getNodeClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/{path}/{name}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("path", "example");
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@723e2d08");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getPackage() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getPackageMethodTest() {
        // given
        String group = "example";
        String name = "example";
        String version = "example";

        // when
        CompletedFileUpload result = controller.getPackage(group, name, version).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/packages/{group}/{name}-{version}.zip' to the features of getPackage() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getPackageClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/etc/packages/{group}/{name}-{version}.zip").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("group", "example");
            put("name", "example");
            put("version", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6d4a82");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getPackageFilter() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getPackageFilterMethodTest() {
        // given
        String group = "example";
        String name = "example";
        String version = "example";

        // when
        String result = controller.getPackageFilter(group, name, version).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json' to the features of getPackageFilter() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getPackageFilterClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("group", "example");
            put("name", "example");
            put("version", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@14f060b8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getQuery() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getQueryMethodTest() {
        // given
        String path = "example";
        BigDecimal pLimit = new BigDecimal(78);
        String _1property = "example";
        String _1propertyValue = "example";

        // when
        String result = controller.getQuery(path, pLimit, _1property, _1propertyValue).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/bin/querybuilder.json' to the features of getQuery() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getQueryClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/bin/querybuilder.json").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7a0ab480");
        request.getParameters()
            .add("path", "example") // The query parameter format should be 
            .add("p.limit", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("1_property", "example") // The query parameter format should be 
            .add("1_property.value", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getTruststore() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getTruststoreMethodTest() {
        // given

        // when
        CompletedFileUpload result = controller.getTruststore().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/truststore/truststore.p12' to the features of getTruststore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getTruststoreClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/etc/truststore/truststore.p12").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@79df80a4");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getTruststoreInfo() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getTruststoreInfoMethodTest() {
        // given

        // when
        TruststoreInfo result = controller.getTruststoreInfo().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/libs/granite/security/truststore.json' to the features of getTruststoreInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getTruststoreInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/libs/granite/security/truststore.json").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@130cfc47");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TruststoreInfo.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postAgent() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postAgentMethodTest() {
        // given
        String runmode = "example";
        String name = "example";
        Boolean jcrContentCqDistribute = false;
        String jcrContentCqDistributeAtTypeHint = "example";
        String jcrContentCqName = "example";
        String jcrContentCqTemplate = "example";
        Boolean jcrContentAliasUpdate = false;
        Boolean jcrContentEnabled = false;
        String jcrContentJcrDescription = "example";
        String jcrContentJcrLastModified = "example";
        String jcrContentJcrLastModifiedBy = "example";
        String jcrContentJcrMixinTypes = "example";
        String jcrContentJcrTitle = "example";
        String jcrContentLogLevel = "example";
        Boolean jcrContentNoStatusUpdate = false;
        Boolean jcrContentNoVersioning = false;
        BigDecimal jcrContentProtocolConnectTimeout = new BigDecimal(78);
        Boolean jcrContentProtocolHTTPConnectionClosed = false;
        String jcrContentProtocolHTTPExpired = "example";
        List<String> jcrContentProtocolHTTPHeaders = Arrays.asList("example");
        String jcrContentProtocolHTTPHeadersAtTypeHint = "example";
        String jcrContentProtocolHTTPMethod = "example";
        Boolean jcrContentProtocolHTTPSRelaxed = false;
        String jcrContentProtocolInterface = "example";
        BigDecimal jcrContentProtocolSocketTimeout = new BigDecimal(78);
        String jcrContentProtocolVersion = "example";
        String jcrContentProxyNTLMDomain = "example";
        String jcrContentProxyNTLMHost = "example";
        String jcrContentProxyHost = "example";
        String jcrContentProxyPassword = "example";
        BigDecimal jcrContentProxyPort = new BigDecimal(78);
        String jcrContentProxyUser = "example";
        BigDecimal jcrContentQueueBatchMaxSize = new BigDecimal(78);
        String jcrContentQueueBatchMode = "example";
        BigDecimal jcrContentQueueBatchWaitTime = new BigDecimal(78);
        String jcrContentRetryDelay = "example";
        Boolean jcrContentReverseReplication = false;
        String jcrContentSerializationType = "example";
        String jcrContentSlingResourceType = "example";
        String jcrContentSsl = "example";
        String jcrContentTransportNTLMDomain = "example";
        String jcrContentTransportNTLMHost = "example";
        String jcrContentTransportPassword = "example";
        String jcrContentTransportUri = "example";
        String jcrContentTransportUser = "example";
        Boolean jcrContentTriggerDistribute = false;
        Boolean jcrContentTriggerModified = false;
        Boolean jcrContentTriggerOnOffTime = false;
        Boolean jcrContentTriggerReceive = false;
        Boolean jcrContentTriggerSpecific = false;
        String jcrContentUserId = "example";
        String jcrPrimaryType = "example";
        String operation = "example";

        // when
        controller.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/replication/agents.{runmode}/{name}' to the features of postAgent() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postAgentClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/etc/replication/agents.{runmode}/{name}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("runmode", "example");
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@4eeab3e");
        request.getParameters()
            .add("jcr:content/cq:distribute", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/cq:distribute@TypeHint", "example") // The query parameter format should be 
            .add("jcr:content/cq:name", "example") // The query parameter format should be 
            .add("jcr:content/cq:template", "example") // The query parameter format should be 
            .add("jcr:content/aliasUpdate", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/enabled", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/jcr:description", "example") // The query parameter format should be 
            .add("jcr:content/jcr:lastModified", "example") // The query parameter format should be 
            .add("jcr:content/jcr:lastModifiedBy", "example") // The query parameter format should be 
            .add("jcr:content/jcr:mixinTypes", "example") // The query parameter format should be 
            .add("jcr:content/jcr:title", "example") // The query parameter format should be 
            .add("jcr:content/logLevel", "example") // The query parameter format should be 
            .add("jcr:content/noStatusUpdate", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/noVersioning", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/protocolConnectTimeout", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("jcr:content/protocolHTTPConnectionClosed", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/protocolHTTPExpired", "example") // The query parameter format should be 
            .add("jcr:content/protocolHTTPHeaders", Arrays.asList("example")) // The query format should be multi
            .add("jcr:content/protocolHTTPHeaders@TypeHint", "example") // The query parameter format should be 
            .add("jcr:content/protocolHTTPMethod", "example") // The query parameter format should be 
            .add("jcr:content/protocolHTTPSRelaxed", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/protocolInterface", "example") // The query parameter format should be 
            .add("jcr:content/protocolSocketTimeout", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("jcr:content/protocolVersion", "example") // The query parameter format should be 
            .add("jcr:content/proxyNTLMDomain", "example") // The query parameter format should be 
            .add("jcr:content/proxyNTLMHost", "example") // The query parameter format should be 
            .add("jcr:content/proxyHost", "example") // The query parameter format should be 
            .add("jcr:content/proxyPassword", "example") // The query parameter format should be 
            .add("jcr:content/proxyPort", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("jcr:content/proxyUser", "example") // The query parameter format should be 
            .add("jcr:content/queueBatchMaxSize", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("jcr:content/queueBatchMode", "example") // The query parameter format should be 
            .add("jcr:content/queueBatchWaitTime", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("jcr:content/retryDelay", "example") // The query parameter format should be 
            .add("jcr:content/reverseReplication", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/serializationType", "example") // The query parameter format should be 
            .add("jcr:content/sling:resourceType", "example") // The query parameter format should be 
            .add("jcr:content/ssl", "example") // The query parameter format should be 
            .add("jcr:content/transportNTLMDomain", "example") // The query parameter format should be 
            .add("jcr:content/transportNTLMHost", "example") // The query parameter format should be 
            .add("jcr:content/transportPassword", "example") // The query parameter format should be 
            .add("jcr:content/transportUri", "example") // The query parameter format should be 
            .add("jcr:content/transportUser", "example") // The query parameter format should be 
            .add("jcr:content/triggerDistribute", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/triggerModified", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/triggerOnOffTime", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/triggerReceive", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/triggerSpecific", String.valueOf(false)) // The query parameter format should be 
            .add("jcr:content/userId", "example") // The query parameter format should be 
            .add("jcr:primaryType", "example") // The query parameter format should be 
            .add(":operation", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postAuthorizableKeystore() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postAuthorizableKeystoreMethodTest() {
        // given
        String intermediatePath = "example";
        String authorizableId = "example";
        String operation = "example";
        String currentPassword = "example";
        String newPassword = "example";
        String rePassword = "example";
        String keyPassword = "example";
        String keyStorePass = "example";
        String alias = "example";
        String newAlias = "example";
        String removeAlias = "example";
        CompletedFileUpload certChain = null;
        CompletedFileUpload pk = null;
        CompletedFileUpload keyStore = null;

        // when
        KeystoreInfo result = controller.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{intermediatePath}/{authorizableId}.ks.html' to the features of postAuthorizableKeystore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postAuthorizableKeystoreClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("cert-chain", new FileReader(File.createTempFile("test", ".tmp")));
            put("pk", new FileReader(File.createTempFile("test", ".tmp")));
            put("keyStore", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/{intermediatePath}/{authorizableId}.ks.html").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("intermediatePath", "example");
            put("authorizableId", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@2b6fb197");
        request.getParameters()
            .add(":operation", "example") // The query parameter format should be 
            .add("currentPassword", "example") // The query parameter format should be 
            .add("newPassword", "example") // The query parameter format should be 
            .add("rePassword", "example") // The query parameter format should be 
            .add("keyPassword", "example") // The query parameter format should be 
            .add("keyStorePass", "example") // The query parameter format should be 
            .add("alias", "example") // The query parameter format should be 
            .add("newAlias", "example") // The query parameter format should be 
            .add("removeAlias", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, KeystoreInfo.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postAuthorizables() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postAuthorizablesMethodTest() {
        // given
        String authorizableId = "example";
        String intermediatePath = "example";
        String createUser = "example";
        String createGroup = "example";
        String repPassword = "example";
        String profileGivenName = "example";

        // when
        String result = controller.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/libs/granite/security/post/authorizables' to the features of postAuthorizables() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postAuthorizablesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/libs/granite/security/post/authorizables").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@2eb0cefe");
        request.getParameters()
            .add("authorizableId", "example") // The query parameter format should be 
            .add("intermediatePath", "example") // The query parameter format should be 
            .add("createUser", "example") // The query parameter format should be 
            .add("createGroup", "example") // The query parameter format should be 
            .add("rep:password", "example") // The query parameter format should be 
            .add("profile/givenName", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigAdobeGraniteSamlAuthenticationHandler() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigAdobeGraniteSamlAuthenticationHandlerMethodTest() {
        // given
        String keyStorePassword = "example";
        String keyStorePasswordAtTypeHint = "example";
        Integer serviceRanking = 56;
        String serviceRankingAtTypeHint = "example";
        Boolean idpHttpRedirect = false;
        String idpHttpRedirectAtTypeHint = "example";
        Boolean createUser = false;
        String createUserAtTypeHint = "example";
        String defaultRedirectUrl = "example";
        String defaultRedirectUrlAtTypeHint = "example";
        String userIDAttribute = "example";
        String userIDAttributeAtTypeHint = "example";
        List<String> defaultGroups = Arrays.asList("example");
        String defaultGroupsAtTypeHint = "example";
        String idpCertAlias = "example";
        String idpCertAliasAtTypeHint = "example";
        Boolean addGroupMemberships = false;
        String addGroupMembershipsAtTypeHint = "example";
        List<String> path = Arrays.asList("example");
        String pathAtTypeHint = "example";
        List<String> synchronizeAttributes = Arrays.asList("example");
        String synchronizeAttributesAtTypeHint = "example";
        Integer clockTolerance = 56;
        String clockToleranceAtTypeHint = "example";
        String groupMembershipAttribute = "example";
        String groupMembershipAttributeAtTypeHint = "example";
        String idpUrl = "example";
        String idpUrlAtTypeHint = "example";
        String logoutUrl = "example";
        String logoutUrlAtTypeHint = "example";
        String serviceProviderEntityId = "example";
        String serviceProviderEntityIdAtTypeHint = "example";
        String assertionConsumerServiceURL = "example";
        String assertionConsumerServiceURLAtTypeHint = "example";
        Boolean handleLogout = false;
        String handleLogoutAtTypeHint = "example";
        String spPrivateKeyAlias = "example";
        String spPrivateKeyAliasAtTypeHint = "example";
        Boolean useEncryption = false;
        String useEncryptionAtTypeHint = "example";
        String nameIdFormat = "example";
        String nameIdFormatAtTypeHint = "example";
        String digestMethod = "example";
        String digestMethodAtTypeHint = "example";
        String signatureMethod = "example";
        String signatureMethodAtTypeHint = "example";
        String userIntermediatePath = "example";
        String userIntermediatePathAtTypeHint = "example";

        // when
        controller.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config' to the features of postConfigAdobeGraniteSamlAuthenticationHandler() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigAdobeGraniteSamlAuthenticationHandlerClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@5a2ae1ab");
        request.getParameters()
            .add("keyStorePassword", "example") // The query parameter format should be 
            .add("keyStorePassword@TypeHint", "example") // The query parameter format should be 
            .add("service.ranking", String.valueOf(56)) // The query parameter format should be 
            .add("service.ranking@TypeHint", "example") // The query parameter format should be 
            .add("idpHttpRedirect", String.valueOf(false)) // The query parameter format should be 
            .add("idpHttpRedirect@TypeHint", "example") // The query parameter format should be 
            .add("createUser", String.valueOf(false)) // The query parameter format should be 
            .add("createUser@TypeHint", "example") // The query parameter format should be 
            .add("defaultRedirectUrl", "example") // The query parameter format should be 
            .add("defaultRedirectUrl@TypeHint", "example") // The query parameter format should be 
            .add("userIDAttribute", "example") // The query parameter format should be 
            .add("userIDAttribute@TypeHint", "example") // The query parameter format should be 
            .add("defaultGroups", Arrays.asList("example")) // The query format should be multi
            .add("defaultGroups@TypeHint", "example") // The query parameter format should be 
            .add("idpCertAlias", "example") // The query parameter format should be 
            .add("idpCertAlias@TypeHint", "example") // The query parameter format should be 
            .add("addGroupMemberships", String.valueOf(false)) // The query parameter format should be 
            .add("addGroupMemberships@TypeHint", "example") // The query parameter format should be 
            .add("path", Arrays.asList("example")) // The query format should be multi
            .add("path@TypeHint", "example") // The query parameter format should be 
            .add("synchronizeAttributes", Arrays.asList("example")) // The query format should be multi
            .add("synchronizeAttributes@TypeHint", "example") // The query parameter format should be 
            .add("clockTolerance", String.valueOf(56)) // The query parameter format should be 
            .add("clockTolerance@TypeHint", "example") // The query parameter format should be 
            .add("groupMembershipAttribute", "example") // The query parameter format should be 
            .add("groupMembershipAttribute@TypeHint", "example") // The query parameter format should be 
            .add("idpUrl", "example") // The query parameter format should be 
            .add("idpUrl@TypeHint", "example") // The query parameter format should be 
            .add("logoutUrl", "example") // The query parameter format should be 
            .add("logoutUrl@TypeHint", "example") // The query parameter format should be 
            .add("serviceProviderEntityId", "example") // The query parameter format should be 
            .add("serviceProviderEntityId@TypeHint", "example") // The query parameter format should be 
            .add("assertionConsumerServiceURL", "example") // The query parameter format should be 
            .add("assertionConsumerServiceURL@TypeHint", "example") // The query parameter format should be 
            .add("handleLogout", String.valueOf(false)) // The query parameter format should be 
            .add("handleLogout@TypeHint", "example") // The query parameter format should be 
            .add("spPrivateKeyAlias", "example") // The query parameter format should be 
            .add("spPrivateKeyAlias@TypeHint", "example") // The query parameter format should be 
            .add("useEncryption", String.valueOf(false)) // The query parameter format should be 
            .add("useEncryption@TypeHint", "example") // The query parameter format should be 
            .add("nameIdFormat", "example") // The query parameter format should be 
            .add("nameIdFormat@TypeHint", "example") // The query parameter format should be 
            .add("digestMethod", "example") // The query parameter format should be 
            .add("digestMethod@TypeHint", "example") // The query parameter format should be 
            .add("signatureMethod", "example") // The query parameter format should be 
            .add("signatureMethod@TypeHint", "example") // The query parameter format should be 
            .add("userIntermediatePath", "example") // The query parameter format should be 
            .add("userIntermediatePath@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigApacheFelixJettyBasedHttpService() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheFelixJettyBasedHttpServiceMethodTest() {
        // given
        Boolean orgApacheFelixHttpsNio = false;
        String orgApacheFelixHttpsNioAtTypeHint = "example";
        String orgApacheFelixHttpsKeystore = "example";
        String orgApacheFelixHttpsKeystoreAtTypeHint = "example";
        String orgApacheFelixHttpsKeystorePassword = "example";
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint = "example";
        String orgApacheFelixHttpsKeystoreKey = "example";
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint = "example";
        String orgApacheFelixHttpsKeystoreKeyPassword = "example";
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = "example";
        String orgApacheFelixHttpsTruststore = "example";
        String orgApacheFelixHttpsTruststoreAtTypeHint = "example";
        String orgApacheFelixHttpsTruststorePassword = "example";
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint = "example";
        String orgApacheFelixHttpsClientcertificate = "example";
        String orgApacheFelixHttpsClientcertificateAtTypeHint = "example";
        Boolean orgApacheFelixHttpsEnable = false;
        String orgApacheFelixHttpsEnableAtTypeHint = "example";
        String orgOsgiServiceHttpPortSecure = "example";
        String orgOsgiServiceHttpPortSecureAtTypeHint = "example";

        // when
        controller.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/org.apache.felix.http' to the features of postConfigApacheFelixJettyBasedHttpService() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheFelixJettyBasedHttpServiceClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/org.apache.felix.http").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@2bec068b");
        request.getParameters()
            .add("org.apache.felix.https.nio", String.valueOf(false)) // The query parameter format should be 
            .add("org.apache.felix.https.nio@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore.password", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore.password@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore.key", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore.key@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore.key.password", "example") // The query parameter format should be 
            .add("org.apache.felix.https.keystore.key.password@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.truststore", "example") // The query parameter format should be 
            .add("org.apache.felix.https.truststore@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.truststore.password", "example") // The query parameter format should be 
            .add("org.apache.felix.https.truststore.password@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.clientcertificate", "example") // The query parameter format should be 
            .add("org.apache.felix.https.clientcertificate@TypeHint", "example") // The query parameter format should be 
            .add("org.apache.felix.https.enable", String.valueOf(false)) // The query parameter format should be 
            .add("org.apache.felix.https.enable@TypeHint", "example") // The query parameter format should be 
            .add("org.osgi.service.http.port.secure", "example") // The query parameter format should be 
            .add("org.osgi.service.http.port.secure@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigApacheHttpComponentsProxyConfiguration() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheHttpComponentsProxyConfigurationMethodTest() {
        // given
        String proxyHost = "example";
        String proxyHostAtTypeHint = "example";
        Integer proxyPort = 56;
        String proxyPortAtTypeHint = "example";
        List<String> proxyExceptions = Arrays.asList("example");
        String proxyExceptionsAtTypeHint = "example";
        Boolean proxyEnabled = false;
        String proxyEnabledAtTypeHint = "example";
        String proxyUser = "example";
        String proxyUserAtTypeHint = "example";
        String proxyPassword = "example";
        String proxyPasswordAtTypeHint = "example";

        // when
        controller.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/org.apache.http.proxyconfigurator.config' to the features of postConfigApacheHttpComponentsProxyConfiguration() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheHttpComponentsProxyConfigurationClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/org.apache.http.proxyconfigurator.config").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@7d59e968");
        request.getParameters()
            .add("proxy.host", "example") // The query parameter format should be 
            .add("proxy.host@TypeHint", "example") // The query parameter format should be 
            .add("proxy.port", String.valueOf(56)) // The query parameter format should be 
            .add("proxy.port@TypeHint", "example") // The query parameter format should be 
            .add("proxy.exceptions", Arrays.asList("example")) // The query format should be multi
            .add("proxy.exceptions@TypeHint", "example") // The query parameter format should be 
            .add("proxy.enabled", String.valueOf(false)) // The query parameter format should be 
            .add("proxy.enabled@TypeHint", "example") // The query parameter format should be 
            .add("proxy.user", "example") // The query parameter format should be 
            .add("proxy.user@TypeHint", "example") // The query parameter format should be 
            .add("proxy.password", "example") // The query parameter format should be 
            .add("proxy.password@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigApacheSlingDavExServlet() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheSlingDavExServletMethodTest() {
        // given
        String alias = "example";
        String aliasAtTypeHint = "example";
        Boolean davCreateAbsoluteUri = false;
        String davCreateAbsoluteUriAtTypeHint = "example";

        // when
        controller.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet' to the features of postConfigApacheSlingDavExServlet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheSlingDavExServletClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@55361f03");
        request.getParameters()
            .add("alias", "example") // The query parameter format should be 
            .add("alias@TypeHint", "example") // The query parameter format should be 
            .add("dav.create-absolute-uri", String.valueOf(false)) // The query parameter format should be 
            .add("dav.create-absolute-uri@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigApacheSlingGetServlet() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheSlingGetServletMethodTest() {
        // given
        String jsonMaximumresults = "example";
        String jsonMaximumresultsAtTypeHint = "example";
        Boolean enableHtml = false;
        String enableHtmlAtTypeHint = "example";
        Boolean enableTxt = false;
        String enableTxtAtTypeHint = "example";
        Boolean enableXml = false;
        String enableXmlAtTypeHint = "example";

        // when
        controller.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet' to the features of postConfigApacheSlingGetServlet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheSlingGetServletClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@581c9bb7");
        request.getParameters()
            .add("json.maximumresults", "example") // The query parameter format should be 
            .add("json.maximumresults@TypeHint", "example") // The query parameter format should be 
            .add("enable.html", String.valueOf(false)) // The query parameter format should be 
            .add("enable.html@TypeHint", "example") // The query parameter format should be 
            .add("enable.txt", String.valueOf(false)) // The query parameter format should be 
            .add("enable.txt@TypeHint", "example") // The query parameter format should be 
            .add("enable.xml", String.valueOf(false)) // The query parameter format should be 
            .add("enable.xml@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigApacheSlingReferrerFilter() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheSlingReferrerFilterMethodTest() {
        // given
        Boolean allowEmpty = false;
        String allowEmptyAtTypeHint = "example";
        String allowHosts = "example";
        String allowHostsAtTypeHint = "example";
        String allowHostsRegexp = "example";
        String allowHostsRegexpAtTypeHint = "example";
        String filterMethods = "example";
        String filterMethodsAtTypeHint = "example";

        // when
        controller.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/org.apache.sling.security.impl.ReferrerFilter' to the features of postConfigApacheSlingReferrerFilter() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigApacheSlingReferrerFilterClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@138f0661");
        request.getParameters()
            .add("allow.empty", String.valueOf(false)) // The query parameter format should be 
            .add("allow.empty@TypeHint", "example") // The query parameter format should be 
            .add("allow.hosts", "example") // The query parameter format should be 
            .add("allow.hosts@TypeHint", "example") // The query parameter format should be 
            .add("allow.hosts.regexp", "example") // The query parameter format should be 
            .add("allow.hosts.regexp@TypeHint", "example") // The query parameter format should be 
            .add("filter.methods", "example") // The query parameter format should be 
            .add("filter.methods@TypeHint", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postConfigProperty() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigPropertyMethodTest() {
        // given
        String configNodeName = "example";

        // when
        controller.postConfigProperty(configNodeName).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/apps/system/config/{configNodeName}' to the features of postConfigProperty() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postConfigPropertyClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/apps/system/config/{configNodeName}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("configNodeName", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@212fafd1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postNode() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postNodeMethodTest() {
        // given
        String path = "example";
        String name = "example";
        String operation = "example";
        String deleteAuthorizable = "example";
        CompletedFileUpload _file = null;

        // when
        controller.postNode(path, name, operation, deleteAuthorizable, _file).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{path}/{name}' to the features of postNode() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postNodeClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/{path}/{name}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("path", "example");
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@448462f0");
        request.getParameters()
            .add(":operation", "example") // The query parameter format should be 
            .add("deleteAuthorizable", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postNodeRw() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postNodeRwMethodTest() {
        // given
        String path = "example";
        String name = "example";
        String addMembers = "example";

        // when
        controller.postNodeRw(path, name, addMembers).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{path}/{name}.rw.html' to the features of postNodeRw() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postNodeRwClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/{path}/{name}.rw.html").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("path", "example");
            put("name", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@787988f4");
        request.getParameters()
            .add("addMembers", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postPath() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postPathMethodTest() {
        // given
        String path = "example";
        String jcrPrimaryType = "example";
        String name = "example";

        // when
        controller.postPath(path, jcrPrimaryType, name).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/{path}/' to the features of postPath() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postPathClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/{path}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("path", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@132e3594");
        request.getParameters()
            .add("jcr:primaryType", "example") // The query parameter format should be 
            .add(":name", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postQuery() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postQueryMethodTest() {
        // given
        String path = "example";
        BigDecimal pLimit = new BigDecimal(78);
        String _1property = "example";
        String _1propertyValue = "example";

        // when
        String result = controller.postQuery(path, pLimit, _1property, _1propertyValue).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/bin/querybuilder.json' to the features of postQuery() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postQueryClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/bin/querybuilder.json").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@4f235107");
        request.getParameters()
            .add("path", "example") // The query parameter format should be 
            .add("p.limit", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("1_property", "example") // The query parameter format should be 
            .add("1_property.value", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postTreeActivation() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postTreeActivationMethodTest() {
        // given
        Boolean ignoredeactivated = false;
        Boolean onlymodified = false;
        String path = "example";
        String cmd = "activate";

        // when
        controller.postTreeActivation(ignoredeactivated, onlymodified, path, cmd).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/libs/replication/treeactivation.html' to the features of postTreeActivation() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postTreeActivationClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/libs/replication/treeactivation.html").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@28d739f1");
        request.getParameters()
            .add("ignoredeactivated", String.valueOf(false)) // The query parameter format should be 
            .add("onlymodified", String.valueOf(false)) // The query parameter format should be 
            .add("path", "example") // The query parameter format should be 
            .add("cmd", "activate"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postTruststore() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postTruststoreMethodTest() {
        // given
        String operation = "example";
        String newPassword = "example";
        String rePassword = "example";
        String keyStoreType = "example";
        String removeAlias = "example";
        CompletedFileUpload certificate = null;

        // when
        String result = controller.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/libs/granite/security/post/truststore' to the features of postTruststore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postTruststoreClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("certificate", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/libs/granite/security/post/truststore").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@1c5d3a37");
        request.getParameters()
            .add(":operation", "example") // The query parameter format should be 
            .add("newPassword", "example") // The query parameter format should be 
            .add("rePassword", "example") // The query parameter format should be 
            .add("keyStoreType", "example") // The query parameter format should be 
            .add("removeAlias", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of postTruststorePKCS12() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void postTruststorePKCS12MethodTest() {
        // given
        CompletedFileUpload truststoreP12 = null;

        // when
        String result = controller.postTruststorePKCS12(truststoreP12).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/etc/truststore' to the features of postTruststorePKCS12() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void postTruststorePKCS12ClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("truststore.p12", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/etc/truststore").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@7e3d2ebd");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
