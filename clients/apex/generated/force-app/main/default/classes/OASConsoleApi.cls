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

public class OASConsoleApi {
    OASClient client;

    public OASConsoleApi(OASClient client) {
        this.client = client;
    }

    public OASConsoleApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * 
     * 
     * @return List<String>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<String> getAemProductInfo() {
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (List<String>) client.invoke(
            'GET', '/system/console/status-productinfo.json', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'aemAuth' },
            List<String>.class
        );
    }
    /**
     * 
     * 
     * @param name  (required)
     * @return OASBundleInfo
     * @throws OAS.ApiException if fails to make API call
     */
    public OASBundleInfo getBundleInfo(Map<String, Object> params) {
        client.assertNotNull(params.get('name'), 'name');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASBundleInfo) client.invoke(
            'GET', '/system/console/bundles/{name}.json', '',
            query, form,
            new Map<String, Object>{
                'name' => (String) params.get('name')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'aemAuth' },
            OASBundleInfo.class
        );
    }
    /**
     * 
     * 
     * @return String
     * @throws OAS.ApiException if fails to make API call
     */
    public String getConfigMgr() {
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (String) client.invoke(
            'GET', '/system/console/configMgr', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'text/xml' },
            new List<String>(),
            new List<String> { 'aemAuth' },
            String.class
        );
    }
    /**
     * 
     * 
     * @param name  (required)
     * @param action  (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void postBundle(Map<String, Object> params) {
        client.assertNotNull(params.get('name'), 'name');
        client.assertNotNull(params.get('action'), 'action');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('action', (String) params.get('action')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'POST', '/system/console/bundles/{name}', '',
            query, form,
            new Map<String, Object>{
                'name' => (String) params.get('name')
            },
            new Map<String, Object>(),
            new List<String>(),
            new List<String>(),
            new List<String> { 'aemAuth' },
            null
        );
    }
    /**
     * 
     * 
     * @param action  (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void postJmxRepository(Map<String, Object> params) {
        client.assertNotNull(params.get('action'), 'action');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'POST', '/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}', '',
            query, form,
            new Map<String, Object>{
                'action' => (String) params.get('action')
            },
            new Map<String, Object>(),
            new List<String>(),
            new List<String>(),
            new List<String> { 'aemAuth' },
            null
        );
    }
    /**
     * 
     * 
     * @param post  (optional)
     * @param apply  (optional)
     * @param r_delete  (optional)
     * @param action  (optional)
     * @param location  (optional)
     * @param path  (optional, default to new List<String>())
     * @param serviceRanking  (optional)
     * @param idpUrl  (optional)
     * @param idpCertAlias  (optional)
     * @param idpHttpRedirect  (optional)
     * @param serviceProviderEntityId  (optional)
     * @param assertionConsumerServiceURL  (optional)
     * @param spPrivateKeyAlias  (optional)
     * @param keyStorePassword  (optional)
     * @param defaultRedirectUrl  (optional)
     * @param userIDAttribute  (optional)
     * @param useEncryption  (optional)
     * @param createUser  (optional)
     * @param addGroupMemberships  (optional)
     * @param groupMembershipAttribute  (optional)
     * @param defaultGroups  (optional, default to new List<String>())
     * @param nameIdFormat  (optional)
     * @param synchronizeAttributes  (optional, default to new List<String>())
     * @param handleLogout  (optional)
     * @param logoutUrl  (optional)
     * @param clockTolerance  (optional)
     * @param digestMethod  (optional)
     * @param signatureMethod  (optional)
     * @param userIntermediatePath  (optional)
     * @param propertylist  (optional, default to new List<String>())
     * @return OASSamlConfigurationInfo
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSamlConfigurationInfo postSamlConfiguration(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('post', (Boolean) params.get('post')));
        query.addAll(client.makeParam('apply', (Boolean) params.get('apply')));
        query.addAll(client.makeParam('delete', (Boolean) params.get('r_delete')));
        query.addAll(client.makeParam('action', (String) params.get('action')));
        query.addAll(client.makeParam('$location', (String) params.get('location')));
        query.addAll(client.makeParams('path', (List<String>) params.get('path')));
        query.addAll(client.makeParam('service.ranking', (Integer) params.get('serviceRanking')));
        query.addAll(client.makeParam('idpUrl', (String) params.get('idpUrl')));
        query.addAll(client.makeParam('idpCertAlias', (String) params.get('idpCertAlias')));
        query.addAll(client.makeParam('idpHttpRedirect', (Boolean) params.get('idpHttpRedirect')));
        query.addAll(client.makeParam('serviceProviderEntityId', (String) params.get('serviceProviderEntityId')));
        query.addAll(client.makeParam('assertionConsumerServiceURL', (String) params.get('assertionConsumerServiceURL')));
        query.addAll(client.makeParam('spPrivateKeyAlias', (String) params.get('spPrivateKeyAlias')));
        query.addAll(client.makeParam('keyStorePassword', (String) params.get('keyStorePassword')));
        query.addAll(client.makeParam('defaultRedirectUrl', (String) params.get('defaultRedirectUrl')));
        query.addAll(client.makeParam('userIDAttribute', (String) params.get('userIDAttribute')));
        query.addAll(client.makeParam('useEncryption', (Boolean) params.get('useEncryption')));
        query.addAll(client.makeParam('createUser', (Boolean) params.get('createUser')));
        query.addAll(client.makeParam('addGroupMemberships', (Boolean) params.get('addGroupMemberships')));
        query.addAll(client.makeParam('groupMembershipAttribute', (String) params.get('groupMembershipAttribute')));
        query.addAll(client.makeParams('defaultGroups', (List<String>) params.get('defaultGroups')));
        query.addAll(client.makeParam('nameIdFormat', (String) params.get('nameIdFormat')));
        query.addAll(client.makeParams('synchronizeAttributes', (List<String>) params.get('synchronizeAttributes')));
        query.addAll(client.makeParam('handleLogout', (Boolean) params.get('handleLogout')));
        query.addAll(client.makeParam('logoutUrl', (String) params.get('logoutUrl')));
        query.addAll(client.makeParam('clockTolerance', (Integer) params.get('clockTolerance')));
        query.addAll(client.makeParam('digestMethod', (String) params.get('digestMethod')));
        query.addAll(client.makeParam('signatureMethod', (String) params.get('signatureMethod')));
        query.addAll(client.makeParam('userIntermediatePath', (String) params.get('userIntermediatePath')));
        query.addAll(client.makeParam('propertylist', (List<String>) params.get('propertylist'), 'csv'));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSamlConfigurationInfo) client.invoke(
            'POST', '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'text/plain' },
            new List<String>(),
            new List<String> { 'aemAuth' },
            OASSamlConfigurationInfo.class
        );
    }
}
