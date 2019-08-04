@isTest
private class OASCqApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void getLoginPageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASCqApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASCqApi(new OASClient());

        api.getLoginPage();
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void postCqActionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorizableId' => 'null',
            'changelog' => 'null'
        };

        OASClient client;
        OASCqApi api;
        String js = '';

        client = new OASClient();
        api = new OASCqApi(client);
        api.postCqActions(params);
    }
}