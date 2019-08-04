@isTest
private class OASCrxApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void getCrxdeStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASCrxApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCrxApi(client);
        api.getCrxdeStatus();
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getInstallStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASCrxApi api;
        OASInstallStatus response;
        OASInstallStatus expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCrxApi(client);

        js = JSON.serialize(OASInstallStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInstallStatus.getExample();
        response = (OASInstallStatus) api.getInstallStatus();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void getPackageManagerServletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASCrxApi api;
        String js = '';

        client = new OASClient();
        api = new OASCrxApi(client);
        api.getPackageManagerServlet();
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postPackageServiceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'cmd' => 'null'
        };

        OASClient client;
        OASCrxApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCrxApi(client);
        api.postPackageService(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postPackageServiceJsonTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'path' => 'null',
            'cmd' => 'null',
            'groupName' => 'null',
            'packageName' => 'null',
            'packageVersion' => 'null',
            'charset' => 'null',
            'force' => Boolean.getExample(),
            'recursive' => Boolean.getExample(),
            'r_package' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASCrxApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCrxApi(client);
        api.postPackageServiceJson(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postPackageUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'groupName' => 'null',
            'packageName' => 'null',
            'version' => 'null',
            'path' => 'null',
            'filter' => 'null',
            'charset' => 'null'
        };

        OASClient client;
        OASCrxApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCrxApi(client);
        api.postPackageUpdate(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postSetPasswordTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'old' => 'null',
            'plain' => 'null',
            'verify' => 'null'
        };

        OASClient client;
        OASCrxApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCrxApi(client);
        api.postSetPassword(params);
    }
}