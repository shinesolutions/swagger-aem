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

public class CqApi extends OpenApi {
    /**
    * Constructor for the CqApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function CqApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_login_page: String = "get_login_page";
        public static const event_post_cq_actions: String = "post_cq_actions";


    /*
     * Returns String 
     */
    public function get_login_page (): String {
        // create path and map variables
        var path: String = "/libs/granite/core/content/login.html".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_login_page";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_cq_actions (authorizableId: String, changelog: String): String {
        // create path and map variables
        var path: String = "/.cqactions.html".replace(/{format}/g,"xml");

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

        if("null" != String(authorizableId))
            queryParams["authorizableId"] = toPathValue(authorizableId);
if("null" != String(changelog))
            queryParams["changelog"] = toPathValue(changelog);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_cq_actions";

        token.returnType = null ;
        return requestId;

    }
}
}
