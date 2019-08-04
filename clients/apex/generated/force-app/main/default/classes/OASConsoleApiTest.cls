@isTest
private class OASConsoleApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void getAemProductInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASConsoleApi api;
        List<String> response;
        List<String> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConsoleApi(client);

        js = JSON.serialize(new List<String>{''});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{''};
        response = (List<String>) api.getAemProductInfo();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getConfigMgrTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASConsoleApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConsoleApi(client);
        api.getConfigMgr();
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postBundleTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'name' => 'null',
            'action' => 'null'
        };

        OASClient client;
        OASConsoleApi api;
        String js = '';

        client = new OASClient();
        api = new OASConsoleApi(client);
        api.postBundle(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postJmxRepositoryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'action' => 'null'
        };

        OASClient client;
        OASConsoleApi api;
        String js = '';

        client = new OASClient();
        api = new OASConsoleApi(client);
        api.postJmxRepository(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postSamlConfigurationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'post' => Boolean.getExample(),
            'apply' => Boolean.getExample(),
            'r_delete' => Boolean.getExample(),
            'action' => 'null',
            'location' => 'null',
            'path' => new List<String>{''},
            'serviceRanking' => Integer.getExample(),
            'idpUrl' => 'null',
            'idpCertAlias' => 'null',
            'idpHttpRedirect' => Boolean.getExample(),
            'serviceProviderEntityId' => 'null',
            'assertionConsumerServiceURL' => 'null',
            'spPrivateKeyAlias' => 'null',
            'keyStorePassword' => 'null',
            'defaultRedirectUrl' => 'null',
            'userIDAttribute' => 'null',
            'useEncryption' => Boolean.getExample(),
            'createUser' => Boolean.getExample(),
            'addGroupMemberships' => Boolean.getExample(),
            'groupMembershipAttribute' => 'null',
            'defaultGroups' => new List<String>{''},
            'nameIdFormat' => 'null',
            'synchronizeAttributes' => new List<String>{''},
            'handleLogout' => Boolean.getExample(),
            'logoutUrl' => 'null',
            'clockTolerance' => Integer.getExample(),
            'digestMethod' => 'null',
            'signatureMethod' => 'null',
            'userIntermediatePath' => 'null',
            'propertylist' => new List<String>{''}
        };

        OASClient client;
        OASConsoleApi api;
        OASSamlConfigurationInfo response;
        OASSamlConfigurationInfo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConsoleApi(client);

        js = JSON.serialize(OASSamlConfigurationInfo.getExample());
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = OASSamlConfigurationInfo.getExample();
        response = (OASSamlConfigurationInfo) api.postSamlConfiguration(params);
        System.assertEquals(expectedResponse, response);
    }
}