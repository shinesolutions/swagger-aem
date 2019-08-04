@isTest
private class OASCustomApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void getAemHealthCheckTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'tags' => 'null',
            'combineTagsOr' => Boolean.getExample()
        };

        OASClient client;
        OASCustomApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomApi(client);
        api.getAemHealthCheck(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigAemHealthCheckServletTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bundlesIgnored' => new List<String>{''},
            'bundlesIgnoredTypeHint' => 'null'
        };

        OASClient client;
        OASCustomApi api;
        String js = '';

        client = new OASClient();
        api = new OASCustomApi(client);
        api.postConfigAemHealthCheckServlet(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postConfigAemPasswordResetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pwdresetAuthorizables' => new List<String>{''},
            'pwdresetAuthorizablesTypeHint' => 'null'
        };

        OASClient client;
        OASCustomApi api;
        String js = '';

        client = new OASClient();
        api = new OASCustomApi(client);
        api.postConfigAemPasswordReset(params);
    }
}