package org.openapitools.api;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;
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
 * API tests for ConsoleApi
 */
@MicronautTest
public class ConsoleApiTest {

    @Inject
    ConsoleApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getAemProductInfoTest() {
        // given

        // when
        List<String> body = api.getAemProductInfo().block();

        // then
        // TODO implement the getAemProductInfoTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getBundleInfoTest() {
        // given
        String name = "example";

        // when
        BundleInfo body = api.getBundleInfo(name).block();

        // then
        // TODO implement the getBundleInfoTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getConfigMgrTest() {
        // given

        // when
        String body = api.getConfigMgr().block();

        // then
        // TODO implement the getConfigMgrTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postBundleTest() {
        // given
        String name = "example";
        String action = "example";

        // when
        api.postBundle(name, action).block();

        // then
        // TODO implement the postBundleTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postJmxRepositoryTest() {
        // given
        String action = "example";

        // when
        api.postJmxRepository(action).block();

        // then
        // TODO implement the postJmxRepositoryTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postSamlConfigurationTest() {
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
        SamlConfigurationInfo body = api.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist).block();

        // then
        // TODO implement the postSamlConfigurationTest()
    }

    
}
