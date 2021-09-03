@isTest
private class OASGraniteApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void sslSetupTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'keystorePassword' => 'null',
            'keystorePasswordConfirm' => 'null',
            'truststorePassword' => 'null',
            'truststorePasswordConfirm' => 'null',
            'httpsHostname' => 'null',
            'httpsPort' => 'null',
            'privatekeyFile' => Blob.valueOf('Sample text file\nContents'),
            'certificateFile' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASGraniteApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGraniteApi(client);
        api.sslSetup(params);
    }
}