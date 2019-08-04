package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class CustomApi extends OpenApi {
    /**
    * Constructor for the CustomApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function CustomApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_aem_health_check: String = "get_aem_health_check";
        public static const event_post_config_aem_health_check_servlet: String = "post_config_aem_health_check_servlet";
        public static const event_post_config_aem_password_reset: String = "post_config_aem_password_reset";


    /*
     * Returns String 
     */
    public function get_aem_health_check (tags: String, combineTagsOr: Boolean): String {
        // create path and map variables
        var path: String = "/system/health".replace(/{format}/g,"xml");

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

        if("null" != String(tags))
            queryParams["tags"] = toPathValue(tags);
if("null" != String(combineTagsOr))
            queryParams["combineTagsOr"] = toPathValue(combineTagsOr);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_aem_health_check";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_aem_health_check_servlet (bundlesIgnored: Array, bundlesIgnored@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck".replace(/{format}/g,"xml");

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

        if("null" != String(bundlesIgnored))
            queryParams["bundles.ignored"] = toPathValue(bundlesIgnored);
if("null" != String(bundlesIgnored@TypeHint))
            queryParams["bundles.ignored@TypeHint"] = toPathValue(bundlesIgnored@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_aem_health_check_servlet";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_aem_password_reset (pwdresetAuthorizables: Array, pwdresetAuthorizables@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator".replace(/{format}/g,"xml");

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

        if("null" != String(pwdresetAuthorizables))
            queryParams["pwdreset.authorizables"] = toPathValue(pwdresetAuthorizables);
if("null" != String(pwdresetAuthorizables@TypeHint))
            queryParams["pwdreset.authorizables@TypeHint"] = toPathValue(pwdresetAuthorizables@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_aem_password_reset";

        token.returnType = null ;
        return requestId;

    }
}
}
