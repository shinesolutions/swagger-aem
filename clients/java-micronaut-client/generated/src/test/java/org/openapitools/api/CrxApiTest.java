package org.openapitools.api;

import java.io.File;
import org.openapitools.model.InstallStatus;
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
 * API tests for CrxApi
 */
@MicronautTest
public class CrxApiTest {

    @Inject
    CrxApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCrxdeStatusTest() {
        // given

        // when
        String body = api.getCrxdeStatus().block();

        // then
        // TODO implement the getCrxdeStatusTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getInstallStatusTest() {
        // given

        // when
        InstallStatus body = api.getInstallStatus().block();

        // then
        // TODO implement the getInstallStatusTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPackageManagerServletTest() {
        // given

        // when
        api.getPackageManagerServlet().block();

        // then
        // TODO implement the getPackageManagerServletTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postPackageServiceTest() {
        // given
        String cmd = "example";

        // when
        String body = api.postPackageService(cmd).block();

        // then
        // TODO implement the postPackageServiceTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postPackageServiceJsonTest() {
        // given
        String path = "example";
        String cmd = "example";
        String groupName = "example";
        String packageName = "example";
        String packageVersion = "example";
        String charset = "example";
        Boolean force = false;
        Boolean recursive = false;
        File _package = null;

        // when
        String body = api.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package).block();

        // then
        // TODO implement the postPackageServiceJsonTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postPackageUpdateTest() {
        // given
        String groupName = "example";
        String packageName = "example";
        String version = "example";
        String path = "example";
        String filter = "example";
        String charset = "example";

        // when
        String body = api.postPackageUpdate(groupName, packageName, version, path, filter, charset).block();

        // then
        // TODO implement the postPackageUpdateTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void postSetPasswordTest() {
        // given
        String old = "example";
        String plain = "example";
        String verify = "example";

        // when
        String body = api.postSetPassword(old, plain, verify).block();

        // then
        // TODO implement the postSetPasswordTest()
    }

    
}
