/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

public class OASCqApi {
    OASClient client;

    public OASCqApi(OASClient client) {
        this.client = client;
    }

    public OASCqApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * 
     * 
     * @return String
     * @throws OAS.ApiException if fails to make API call
     */
    public String getLoginPage() {
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (String) client.invoke(
            'GET', '/libs/granite/core/content/login.html', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'text/html' },
            new List<String>(),
            new List<String>(),
            String.class
        );
    }
    /**
     * 
     * 
     * @param authorizableId  (required)
     * @param changelog  (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void postCqActions(Map<String, Object> params) {
        client.assertNotNull(params.get('authorizableId'), 'authorizableId');
        client.assertNotNull(params.get('changelog'), 'changelog');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('authorizableId', (String) params.get('authorizableId')));
        query.addAll(client.makeParam('changelog', (String) params.get('changelog')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'POST', '/.cqactions.html', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>(),
            new List<String>(),
            new List<String> { 'aemAuth' },
            null
        );
    }
}
