package org.openapitools.api;

import java.io.File;
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
 * API tests for GraniteApi
 */
@MicronautTest
public class GraniteApiTest {

    @Inject
    GraniteApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void sslSetupTest() {
        // given
        String keystorePassword = "example";
        String keystorePasswordConfirm = "example";
        String truststorePassword = "example";
        String truststorePasswordConfirm = "example";
        String httpsHostname = "example";
        String httpsPort = "example";
        File privatekeyFile = null;
        File certificateFile = null;

        // when
        String body = api.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile).block();

        // then
        // TODO implement the sslSetupTest()
    }

    
}
