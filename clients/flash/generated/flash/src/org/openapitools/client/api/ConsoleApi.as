package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.SamlConfigurationInfo;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ConsoleApi extends OpenApi {
    /**
    * Constructor for the ConsoleApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ConsoleApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_aem_product_info: String = "get_aem_product_info";
        public static const event_get_config_mgr: String = "get_config_mgr";
        public static const event_post_bundle: String = "post_bundle";
        public static const event_post_jmx_repository: String = "post_jmx_repository";
        public static const event_post_saml_configuration: String = "post_saml_configuration";


    /*
     * Returns Array 
     */
    public function get_aem_product_info (): String {
        // create path and map variables
        var path: String = "/system/console/status-productinfo.json".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_aem_product_info";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function get_config_mgr (): String {
        // create path and map variables
        var path: String = "/system/console/configMgr".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_config_mgr";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_bundle (name: String, action: String): String {
        // create path and map variables
        var path: String = "/system/console/bundles/{name}".replace(/{format}/g,"xml").replace("{" + "name" + "}", getApiInvoker().escapeString(name));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(action))
            queryParams["action"] = toPathValue(action);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_bundle";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_jmx_repository (action: String): String {
        // create path and map variables
        var path: String = "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}".replace(/{format}/g,"xml").replace("{" + "action" + "}", getApiInvoker().escapeString(action));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_jmx_repository";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns SamlConfigurationInfo 
     */
    public function post_saml_configuration (post: Boolean, apply: Boolean, _delete: Boolean, action: String, $location: String, path: Array, serviceRanking: Number, idpUrl: String, idpCertAlias: String, idpHttpRedirect: Boolean, serviceProviderEntityId: String, assertionConsumerServiceURL: String, spPrivateKeyAlias: String, keyStorePassword: String, defaultRedirectUrl: String, userIDAttribute: String, useEncryption: Boolean, createUser: Boolean, addGroupMemberships: Boolean, groupMembershipAttribute: String, defaultGroups: Array, nameIdFormat: String, synchronizeAttributes: Array, handleLogout: Boolean, logoutUrl: String, clockTolerance: Number, digestMethod: String, signatureMethod: String, userIntermediatePath: String, propertylist: Array): String {
        // create path and map variables
        var path: String = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(post))
            queryParams["post"] = toPathValue(post);
if("null" != String(apply))
            queryParams["apply"] = toPathValue(apply);
if("null" != String(_delete))
            queryParams["delete"] = toPathValue(_delete);
if("null" != String(action))
            queryParams["action"] = toPathValue(action);
if("null" != String($location))
            queryParams["$location"] = toPathValue($location);
if("null" != String(path))
            queryParams["path"] = toPathValue(path);
if("null" != String(serviceRanking))
            queryParams["service.ranking"] = toPathValue(serviceRanking);
if("null" != String(idpUrl))
            queryParams["idpUrl"] = toPathValue(idpUrl);
if("null" != String(idpCertAlias))
            queryParams["idpCertAlias"] = toPathValue(idpCertAlias);
if("null" != String(idpHttpRedirect))
            queryParams["idpHttpRedirect"] = toPathValue(idpHttpRedirect);
if("null" != String(serviceProviderEntityId))
            queryParams["serviceProviderEntityId"] = toPathValue(serviceProviderEntityId);
if("null" != String(assertionConsumerServiceURL))
            queryParams["assertionConsumerServiceURL"] = toPathValue(assertionConsumerServiceURL);
if("null" != String(spPrivateKeyAlias))
            queryParams["spPrivateKeyAlias"] = toPathValue(spPrivateKeyAlias);
if("null" != String(keyStorePassword))
            queryParams["keyStorePassword"] = toPathValue(keyStorePassword);
if("null" != String(defaultRedirectUrl))
            queryParams["defaultRedirectUrl"] = toPathValue(defaultRedirectUrl);
if("null" != String(userIDAttribute))
            queryParams["userIDAttribute"] = toPathValue(userIDAttribute);
if("null" != String(useEncryption))
            queryParams["useEncryption"] = toPathValue(useEncryption);
if("null" != String(createUser))
            queryParams["createUser"] = toPathValue(createUser);
if("null" != String(addGroupMemberships))
            queryParams["addGroupMemberships"] = toPathValue(addGroupMemberships);
if("null" != String(groupMembershipAttribute))
            queryParams["groupMembershipAttribute"] = toPathValue(groupMembershipAttribute);
if("null" != String(defaultGroups))
            queryParams["defaultGroups"] = toPathValue(defaultGroups);
if("null" != String(nameIdFormat))
            queryParams["nameIdFormat"] = toPathValue(nameIdFormat);
if("null" != String(synchronizeAttributes))
            queryParams["synchronizeAttributes"] = toPathValue(synchronizeAttributes);
if("null" != String(handleLogout))
            queryParams["handleLogout"] = toPathValue(handleLogout);
if("null" != String(logoutUrl))
            queryParams["logoutUrl"] = toPathValue(logoutUrl);
if("null" != String(clockTolerance))
            queryParams["clockTolerance"] = toPathValue(clockTolerance);
if("null" != String(digestMethod))
            queryParams["digestMethod"] = toPathValue(digestMethod);
if("null" != String(signatureMethod))
            queryParams["signatureMethod"] = toPathValue(signatureMethod);
if("null" != String(userIntermediatePath))
            queryParams["userIntermediatePath"] = toPathValue(userIntermediatePath);
if("null" != String(propertylist))
            queryParams["propertylist"] = toPathValue(propertylist);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_saml_configuration";

        token.returnType = SamlConfigurationInfo;
        return requestId;

    }
}
}
