@isTest
private class OASSlingApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void deleteAgentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'runmode' => 'null',
            'name' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.deleteAgent(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void deleteNodeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'name' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.deleteNode(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getAgentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'runmode' => 'null',
            'name' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getAgent(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getAgentsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'runmode' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getAgents(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getAuthorizableKeystoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'intermediatePath' => 'null',
            'authorizableId' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        OASKeystoreInfo response;
        OASKeystoreInfo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);

        js = JSON.serialize(OASKeystoreInfo.getExample());
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = OASKeystoreInfo.getExample();
        response = (OASKeystoreInfo) api.getAuthorizableKeystore(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getKeystoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'intermediatePath' => 'null',
            'authorizableId' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getKeystore(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getNodeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'name' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getNode(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getPackageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_group' => 'null',
            'name' => 'null',
            'version' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getPackage(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getPackageFilterTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_group' => 'null',
            'name' => 'null',
            'version' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getPackageFilter(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getQueryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'pLimit' => Double.getExample(),
            'r_1property' => 'null',
            'r_1propertyValue' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getQuery(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getTruststoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASSlingApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.getTruststore();
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getTruststoreInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASSlingApi api;
        OASTruststoreInfo response;
        OASTruststoreInfo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);

        js = JSON.serialize(OASTruststoreInfo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTruststoreInfo.getExample();
        response = (OASTruststoreInfo) api.getTruststoreInfo();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postAgentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'runmode' => 'null',
            'name' => 'null',
            'jcrcontentcqdistribute' => Boolean.getExample(),
            'jcrcontentcqdistributeTypeHint' => 'null',
            'jcrcontentcqname' => 'null',
            'jcrcontentcqtemplate' => 'null',
            'jcrcontentenabled' => Boolean.getExample(),
            'jcrcontentjcrdescription' => 'null',
            'jcrcontentjcrlastModified' => 'null',
            'jcrcontentjcrlastModifiedBy' => 'null',
            'jcrcontentjcrmixinTypes' => 'null',
            'jcrcontentjcrtitle' => 'null',
            'jcrcontentlogLevel' => 'null',
            'jcrcontentnoStatusUpdate' => Boolean.getExample(),
            'jcrcontentnoVersioning' => Boolean.getExample(),
            'jcrcontentprotocolConnectTimeout' => Double.getExample(),
            'jcrcontentprotocolHTTPConnectionClosed' => Boolean.getExample(),
            'jcrcontentprotocolHTTPExpired' => 'null',
            'jcrcontentprotocolHTTPHeaders' => new List<String>{''},
            'jcrcontentprotocolHTTPHeadersTypeHint' => 'null',
            'jcrcontentprotocolHTTPMethod' => 'null',
            'jcrcontentprotocolHTTPSRelaxed' => Boolean.getExample(),
            'jcrcontentprotocolInterface' => 'null',
            'jcrcontentprotocolSocketTimeout' => Double.getExample(),
            'jcrcontentprotocolVersion' => 'null',
            'jcrcontentproxyNTLMDomain' => 'null',
            'jcrcontentproxyNTLMHost' => 'null',
            'jcrcontentproxyHost' => 'null',
            'jcrcontentproxyPassword' => 'null',
            'jcrcontentproxyPort' => Double.getExample(),
            'jcrcontentproxyUser' => 'null',
            'jcrcontentqueueBatchMaxSize' => Double.getExample(),
            'jcrcontentqueueBatchMode' => 'null',
            'jcrcontentqueueBatchWaitTime' => Double.getExample(),
            'jcrcontentretryDelay' => 'null',
            'jcrcontentreverseReplication' => Boolean.getExample(),
            'jcrcontentserializationType' => 'null',
            'jcrcontentslingresourceType' => 'null',
            'jcrcontentssl' => 'null',
            'jcrcontenttransportNTLMDomain' => 'null',
            'jcrcontenttransportNTLMHost' => 'null',
            'jcrcontenttransportPassword' => 'null',
            'jcrcontenttransportUri' => 'null',
            'jcrcontenttransportUser' => 'null',
            'jcrcontenttriggerDistribute' => Boolean.getExample(),
            'jcrcontenttriggerModified' => Boolean.getExample(),
            'jcrcontenttriggerOnOffTime' => Boolean.getExample(),
            'jcrcontenttriggerReceive' => Boolean.getExample(),
            'jcrcontenttriggerSpecific' => Boolean.getExample(),
            'jcrcontentuserId' => 'null',
            'jcrprimaryType' => 'null',
            'operation' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postAgent(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postAuthorizableKeystoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'intermediatePath' => 'null',
            'authorizableId' => 'null',
            'operation' => 'null',
            'currentPassword' => 'null',
            'newPassword' => 'null',
            'rePassword' => 'null',
            'keyPassword' => 'null',
            'keyStorePass' => 'null',
            'alias' => 'null',
            'newAlias' => 'null',
            'removeAlias' => 'null',
            'certChain' => Blob.valueOf('Sample text file\nContents'),
            'pk' => Blob.valueOf('Sample text file\nContents'),
            'keyStore' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASSlingApi api;
        OASKeystoreInfo response;
        OASKeystoreInfo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);

        js = JSON.serialize(OASKeystoreInfo.getExample());
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = OASKeystoreInfo.getExample();
        response = (OASKeystoreInfo) api.postAuthorizableKeystore(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postAuthorizablesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorizableId' => 'null',
            'intermediatePath' => 'null',
            'createUser' => 'null',
            'createGroup' => 'null',
            'reppassword' => 'null',
            'profilegivenName' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postAuthorizables(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigAdobeGraniteSamlAuthenticationHandlerTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'keyStorePassword' => 'null',
            'keyStorePasswordTypeHint' => 'null',
            'serviceRanking' => Integer.getExample(),
            'serviceRankingTypeHint' => 'null',
            'idpHttpRedirect' => Boolean.getExample(),
            'idpHttpRedirectTypeHint' => 'null',
            'createUser' => Boolean.getExample(),
            'createUserTypeHint' => 'null',
            'defaultRedirectUrl' => 'null',
            'defaultRedirectUrlTypeHint' => 'null',
            'userIDAttribute' => 'null',
            'userIDAttributeTypeHint' => 'null',
            'defaultGroups' => new List<String>{''},
            'defaultGroupsTypeHint' => 'null',
            'idpCertAlias' => 'null',
            'idpCertAliasTypeHint' => 'null',
            'addGroupMemberships' => Boolean.getExample(),
            'addGroupMembershipsTypeHint' => 'null',
            'path' => new List<String>{''},
            'pathTypeHint' => 'null',
            'synchronizeAttributes' => new List<String>{''},
            'synchronizeAttributesTypeHint' => 'null',
            'clockTolerance' => Integer.getExample(),
            'clockToleranceTypeHint' => 'null',
            'groupMembershipAttribute' => 'null',
            'groupMembershipAttributeTypeHint' => 'null',
            'idpUrl' => 'null',
            'idpUrlTypeHint' => 'null',
            'logoutUrl' => 'null',
            'logoutUrlTypeHint' => 'null',
            'serviceProviderEntityId' => 'null',
            'serviceProviderEntityIdTypeHint' => 'null',
            'assertionConsumerServiceURL' => 'null',
            'assertionConsumerServiceURLTypeHint' => 'null',
            'handleLogout' => Boolean.getExample(),
            'handleLogoutTypeHint' => 'null',
            'spPrivateKeyAlias' => 'null',
            'spPrivateKeyAliasTypeHint' => 'null',
            'useEncryption' => Boolean.getExample(),
            'useEncryptionTypeHint' => 'null',
            'nameIdFormat' => 'null',
            'nameIdFormatTypeHint' => 'null',
            'digestMethod' => 'null',
            'digestMethodTypeHint' => 'null',
            'signatureMethod' => 'null',
            'signatureMethodTypeHint' => 'null',
            'userIntermediatePath' => 'null',
            'userIntermediatePathTypeHint' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postConfigAdobeGraniteSamlAuthenticationHandler(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigApacheFelixJettyBasedHttpServiceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'orgApacheFelixHttpsNio' => Boolean.getExample(),
            'orgApacheFelixHttpsNioTypeHint' => 'null',
            'orgApacheFelixHttpsKeystore' => 'null',
            'orgApacheFelixHttpsKeystoreTypeHint' => 'null',
            'orgApacheFelixHttpsKeystorePassword' => 'null',
            'orgApacheFelixHttpsKeystorePasswordTypeHint' => 'null',
            'orgApacheFelixHttpsKeystoreKey' => 'null',
            'orgApacheFelixHttpsKeystoreKeyTypeHint' => 'null',
            'orgApacheFelixHttpsKeystoreKeyPassword' => 'null',
            'orgApacheFelixHttpsKeystoreKeyPasswordTypeHint' => 'null',
            'orgApacheFelixHttpsTruststore' => 'null',
            'orgApacheFelixHttpsTruststoreTypeHint' => 'null',
            'orgApacheFelixHttpsTruststorePassword' => 'null',
            'orgApacheFelixHttpsTruststorePasswordTypeHint' => 'null',
            'orgApacheFelixHttpsClientcertificate' => 'null',
            'orgApacheFelixHttpsClientcertificateTypeHint' => 'null',
            'orgApacheFelixHttpsEnable' => Boolean.getExample(),
            'orgApacheFelixHttpsEnableTypeHint' => 'null',
            'orgOsgiServiceHttpPortSecure' => 'null',
            'orgOsgiServiceHttpPortSecureTypeHint' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postConfigApacheFelixJettyBasedHttpService(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigApacheHttpComponentsProxyConfigurationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'proxyHost' => 'null',
            'proxyHostTypeHint' => 'null',
            'proxyPort' => Integer.getExample(),
            'proxyPortTypeHint' => 'null',
            'proxyExceptions' => new List<String>{''},
            'proxyExceptionsTypeHint' => 'null',
            'proxyEnabled' => Boolean.getExample(),
            'proxyEnabledTypeHint' => 'null',
            'proxyUser' => 'null',
            'proxyUserTypeHint' => 'null',
            'proxyPassword' => 'null',
            'proxyPasswordTypeHint' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postConfigApacheHttpComponentsProxyConfiguration(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigApacheSlingDavExServletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'alias' => 'null',
            'aliasTypeHint' => 'null',
            'davCreateAbsoluteUri' => Boolean.getExample(),
            'davCreateAbsoluteUriTypeHint' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postConfigApacheSlingDavExServlet(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigApacheSlingGetServletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jsonMaximumresults' => 'null',
            'jsonMaximumresultsTypeHint' => 'null',
            'enableHtml' => Boolean.getExample(),
            'enableHtmlTypeHint' => 'null',
            'enableTxt' => Boolean.getExample(),
            'enableTxtTypeHint' => 'null',
            'enableXml' => Boolean.getExample(),
            'enableXmlTypeHint' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postConfigApacheSlingGetServlet(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigApacheSlingReferrerFilterTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'allowEmpty' => Boolean.getExample(),
            'allowEmptyTypeHint' => 'null',
            'allowHosts' => 'null',
            'allowHostsTypeHint' => 'null',
            'allowHostsRegexp' => 'null',
            'allowHostsRegexpTypeHint' => 'null',
            'filterMethods' => 'null',
            'filterMethodsTypeHint' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postConfigApacheSlingReferrerFilter(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postNodeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'name' => 'null',
            'operation' => 'null',
            'deleteAuthorizable' => 'null',
            'file' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postNode(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postNodeRwTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'name' => 'null',
            'addMembers' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postNodeRw(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postPathTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'jcrprimaryType' => 'null',
            'name' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postPath(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postQueryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'pLimit' => Double.getExample(),
            'r_1property' => 'null',
            'r_1propertyValue' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postQuery(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postTreeActivationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'ignoredeactivated' => Boolean.getExample(),
            'onlymodified' => Boolean.getExample(),
            'path' => 'null'
        };

        OASClient client;
        OASSlingApi api;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postTreeActivation(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postTruststoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'operation' => 'null',
            'newPassword' => 'null',
            'rePassword' => 'null',
            'keyStoreType' => 'null',
            'removeAlias' => 'null',
            'certificate' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASSlingApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postTruststore(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postTruststorePKCS12Test() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'truststoreP12' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASSlingApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSlingApi(client);
        api.postTruststorePKCS12(params);
    }
}