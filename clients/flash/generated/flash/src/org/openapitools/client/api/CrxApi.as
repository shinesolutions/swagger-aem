package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import flash.filesystem.File;
import org.openapitools.client.model.InstallStatus;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class CrxApi extends OpenApi {
    /**
    * Constructor for the CrxApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function CrxApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_crxde_status: String = "get_crxde_status";
        public static const event_get_install_status: String = "get_install_status";
        public static const event_get_package_manager_servlet: String = "get_package_manager_servlet";
        public static const event_post_package_service: String = "post_package_service";
        public static const event_post_package_service_json: String = "post_package_service_json";
        public static const event_post_package_update: String = "post_package_update";
        public static const event_post_set_password: String = "post_set_password";


    /*
     * Returns String 
     */
    public function get_crxde_status (): String {
        // create path and map variables
        var path: String = "/crx/server/crx.default/jcr:root/.1.json".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_crxde_status";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns InstallStatus 
     */
    public function get_install_status (): String {
        // create path and map variables
        var path: String = "/crx/packmgr/installstatus.jsp".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_install_status";

        token.returnType = InstallStatus;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function get_package_manager_servlet (): String {
        // create path and map variables
        var path: String = "/crx/packmgr/service/script.html".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_package_manager_servlet";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_package_service (cmd: String): String {
        // create path and map variables
        var path: String = "/crx/packmgr/service.jsp".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(cmd))
            queryParams["cmd"] = toPathValue(cmd);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_package_service";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_package_service_json (path: String, cmd: String, groupName: String, packageName: String, packageVersion: String, charset: String, force: Boolean, recursive: Boolean, package: File): String {
        // create path and map variables
        var path: String = "/crx/packmgr/service/.json/{path}".replace(/{format}/g,"xml").replace("{" + "path" + "}", getApiInvoker().escapeString(path));

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

        if("null" != String(cmd))
            queryParams["cmd"] = toPathValue(cmd);
if("null" != String(groupName))
            queryParams["groupName"] = toPathValue(groupName);
if("null" != String(packageName))
            queryParams["packageName"] = toPathValue(packageName);
if("null" != String(packageVersion))
            queryParams["packageVersion"] = toPathValue(packageVersion);
if("null" != String(charset))
            queryParams["_charset_"] = toPathValue(charset);
if("null" != String(force))
            queryParams["force"] = toPathValue(force);
if("null" != String(recursive))
            queryParams["recursive"] = toPathValue(recursive);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_package_service_json";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_package_update (groupName: String, packageName: String, version: String, path: String, filter: String, charset: String): String {
        // create path and map variables
        var path: String = "/crx/packmgr/update.jsp".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(groupName))
            queryParams["groupName"] = toPathValue(groupName);
if("null" != String(packageName))
            queryParams["packageName"] = toPathValue(packageName);
if("null" != String(version))
            queryParams["version"] = toPathValue(version);
if("null" != String(path))
            queryParams["path"] = toPathValue(path);
if("null" != String(filter))
            queryParams["filter"] = toPathValue(filter);
if("null" != String(charset))
            queryParams["_charset_"] = toPathValue(charset);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_package_update";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_set_password (old: String, plain: String, verify: String): String {
        // create path and map variables
        var path: String = "/crx/explorer/ui/setpassword.jsp".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(old))
            queryParams["old"] = toPathValue(old);
if("null" != String(plain))
            queryParams["plain"] = toPathValue(plain);
if("null" != String(verify))
            queryParams["verify"] = toPathValue(verify);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_set_password";

        token.returnType = String;
        return requestId;

    }
}
}
