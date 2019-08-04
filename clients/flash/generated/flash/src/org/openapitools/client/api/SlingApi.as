package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import flash.filesystem.File;
import org.openapitools.client.model.KeystoreInfo;
import org.openapitools.client.model.TruststoreInfo;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class SlingApi extends OpenApi {
    /**
    * Constructor for the SlingApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function SlingApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_delete_agent: String = "delete_agent";
        public static const event_delete_node: String = "delete_node";
        public static const event_get_agent: String = "get_agent";
        public static const event_get_agents: String = "get_agents";
        public static const event_get_authorizable_keystore: String = "get_authorizable_keystore";
        public static const event_get_keystore: String = "get_keystore";
        public static const event_get_node: String = "get_node";
        public static const event_get_package: String = "get_package";
        public static const event_get_package_filter: String = "get_package_filter";
        public static const event_get_query: String = "get_query";
        public static const event_get_truststore: String = "get_truststore";
        public static const event_get_truststore_info: String = "get_truststore_info";
        public static const event_post_agent: String = "post_agent";
        public static const event_post_authorizable_keystore: String = "post_authorizable_keystore";
        public static const event_post_authorizables: String = "post_authorizables";
        public static const event_post_config_adobe_granite_saml_authentication_handler: String = "post_config_adobe_granite_saml_authentication_handler";
        public static const event_post_config_apache_felix_jetty_based_http_service: String = "post_config_apache_felix_jetty_based_http_service";
        public static const event_post_config_apache_http_components_proxy_configuration: String = "post_config_apache_http_components_proxy_configuration";
        public static const event_post_config_apache_sling_dav_ex_servlet: String = "post_config_apache_sling_dav_ex_servlet";
        public static const event_post_config_apache_sling_get_servlet: String = "post_config_apache_sling_get_servlet";
        public static const event_post_config_apache_sling_referrer_filter: String = "post_config_apache_sling_referrer_filter";
        public static const event_post_node: String = "post_node";
        public static const event_post_node_rw: String = "post_node_rw";
        public static const event_post_path: String = "post_path";
        public static const event_post_query: String = "post_query";
        public static const event_post_tree_activation: String = "post_tree_activation";
        public static const event_post_truststore: String = "post_truststore";
        public static const event_post_truststore_pkcs12: String = "post_truststore_pkcs12";


    /*
     * Returns void 
     */
    public function delete_agent (runmode: String, name: String): String {
        // create path and map variables
        var path: String = "/etc/replication/agents.{runmode}/{name}".replace(/{format}/g,"xml").replace("{" + "runmode" + "}", getApiInvoker().escapeString(runmode)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_agent";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_node (path: String, name: String): String {
        // create path and map variables
        var path: String = "/{path}/{name}".replace(/{format}/g,"xml").replace("{" + "path" + "}", getApiInvoker().escapeString(path)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_node";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function get_agent (runmode: String, name: String): String {
        // create path and map variables
        var path: String = "/etc/replication/agents.{runmode}/{name}".replace(/{format}/g,"xml").replace("{" + "runmode" + "}", getApiInvoker().escapeString(runmode)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_agent";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function get_agents (runmode: String): String {
        // create path and map variables
        var path: String = "/etc/replication/agents.{runmode}.-1.json".replace(/{format}/g,"xml").replace("{" + "runmode" + "}", getApiInvoker().escapeString(runmode));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_agents";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns KeystoreInfo 
     */
    public function get_authorizable_keystore (intermediatePath: String, authorizableId: String): String {
        // create path and map variables
        var path: String = "/{intermediatePath}/{authorizableId}.ks.json".replace(/{format}/g,"xml").replace("{" + "intermediatePath" + "}", getApiInvoker().escapeString(intermediatePath)).replace("{" + "authorizableId" + "}", getApiInvoker().escapeString(authorizableId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_authorizable_keystore";

        token.returnType = KeystoreInfo;
        return requestId;

    }

    /*
     * Returns File 
     */
    public function get_keystore (intermediatePath: String, authorizableId: String): String {
        // create path and map variables
        var path: String = "/{intermediatePath}/{authorizableId}/keystore/store.p12".replace(/{format}/g,"xml").replace("{" + "intermediatePath" + "}", getApiInvoker().escapeString(intermediatePath)).replace("{" + "authorizableId" + "}", getApiInvoker().escapeString(authorizableId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_keystore";

        token.returnType = File;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function get_node (path: String, name: String): String {
        // create path and map variables
        var path: String = "/{path}/{name}".replace(/{format}/g,"xml").replace("{" + "path" + "}", getApiInvoker().escapeString(path)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_node";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns File 
     */
    public function get_package (group: String, name: String, version: String): String {
        // create path and map variables
        var path: String = "/etc/packages/{group}/{name}-{version}.zip".replace(/{format}/g,"xml").replace("{" + "group" + "}", getApiInvoker().escapeString(group)).replace("{" + "name" + "}", getApiInvoker().escapeString(name)).replace("{" + "version" + "}", getApiInvoker().escapeString(version));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_package";

        token.returnType = File;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function get_package_filter (group: String, name: String, version: String): String {
        // create path and map variables
        var path: String = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".replace(/{format}/g,"xml").replace("{" + "group" + "}", getApiInvoker().escapeString(group)).replace("{" + "name" + "}", getApiInvoker().escapeString(name)).replace("{" + "version" + "}", getApiInvoker().escapeString(version));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_package_filter";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function get_query (path: String, pLimit: Number, _1property: String, _1propertyValue: String): String {
        // create path and map variables
        var path: String = "/bin/querybuilder.json".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(path))
            queryParams["path"] = toPathValue(path);
if("null" != String(pLimit))
            queryParams["p.limit"] = toPathValue(pLimit);
if("null" != String(_1property))
            queryParams["1_property"] = toPathValue(_1property);
if("null" != String(_1propertyValue))
            queryParams["1_property.value"] = toPathValue(_1propertyValue);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_query";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns File 
     */
    public function get_truststore (): String {
        // create path and map variables
        var path: String = "/etc/truststore/truststore.p12".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_truststore";

        token.returnType = File;
        return requestId;

    }

    /*
     * Returns TruststoreInfo 
     */
    public function get_truststore_info (): String {
        // create path and map variables
        var path: String = "/libs/granite/security/truststore.json".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_truststore_info";

        token.returnType = TruststoreInfo;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_agent (runmode: String, name: String, jcr:contentCq:distribute: Boolean, jcr:contentCq:distribute@TypeHint: String, jcr:contentCq:name: String, jcr:contentCq:template: String, jcr:contentEnabled: Boolean, jcr:contentJcr:description: String, jcr:contentJcr:lastModified: String, jcr:contentJcr:lastModifiedBy: String, jcr:contentJcr:mixinTypes: String, jcr:contentJcr:title: String, jcr:contentLogLevel: String, jcr:contentNoStatusUpdate: Boolean, jcr:contentNoVersioning: Boolean, jcr:contentProtocolConnectTimeout: Number, jcr:contentProtocolHTTPConnectionClosed: Boolean, jcr:contentProtocolHTTPExpired: String, jcr:contentProtocolHTTPHeaders: Array, jcr:contentProtocolHTTPHeaders@TypeHint: String, jcr:contentProtocolHTTPMethod: String, jcr:contentProtocolHTTPSRelaxed: Boolean, jcr:contentProtocolInterface: String, jcr:contentProtocolSocketTimeout: Number, jcr:contentProtocolVersion: String, jcr:contentProxyNTLMDomain: String, jcr:contentProxyNTLMHost: String, jcr:contentProxyHost: String, jcr:contentProxyPassword: String, jcr:contentProxyPort: Number, jcr:contentProxyUser: String, jcr:contentQueueBatchMaxSize: Number, jcr:contentQueueBatchMode: String, jcr:contentQueueBatchWaitTime: Number, jcr:contentRetryDelay: String, jcr:contentReverseReplication: Boolean, jcr:contentSerializationType: String, jcr:contentSling:resourceType: String, jcr:contentSsl: String, jcr:contentTransportNTLMDomain: String, jcr:contentTransportNTLMHost: String, jcr:contentTransportPassword: String, jcr:contentTransportUri: String, jcr:contentTransportUser: String, jcr:contentTriggerDistribute: Boolean, jcr:contentTriggerModified: Boolean, jcr:contentTriggerOnOffTime: Boolean, jcr:contentTriggerReceive: Boolean, jcr:contentTriggerSpecific: Boolean, jcr:contentUserId: String, jcr:primaryType: String, :operation: String): String {
        // create path and map variables
        var path: String = "/etc/replication/agents.{runmode}/{name}".replace(/{format}/g,"xml").replace("{" + "runmode" + "}", getApiInvoker().escapeString(runmode)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

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

        if("null" != String(jcr:contentCq:distribute))
            queryParams["jcr:content/cq:distribute"] = toPathValue(jcr:contentCq:distribute);
if("null" != String(jcr:contentCq:distribute@TypeHint))
            queryParams["jcr:content/cq:distribute@TypeHint"] = toPathValue(jcr:contentCq:distribute@TypeHint);
if("null" != String(jcr:contentCq:name))
            queryParams["jcr:content/cq:name"] = toPathValue(jcr:contentCq:name);
if("null" != String(jcr:contentCq:template))
            queryParams["jcr:content/cq:template"] = toPathValue(jcr:contentCq:template);
if("null" != String(jcr:contentEnabled))
            queryParams["jcr:content/enabled"] = toPathValue(jcr:contentEnabled);
if("null" != String(jcr:contentJcr:description))
            queryParams["jcr:content/jcr:description"] = toPathValue(jcr:contentJcr:description);
if("null" != String(jcr:contentJcr:lastModified))
            queryParams["jcr:content/jcr:lastModified"] = toPathValue(jcr:contentJcr:lastModified);
if("null" != String(jcr:contentJcr:lastModifiedBy))
            queryParams["jcr:content/jcr:lastModifiedBy"] = toPathValue(jcr:contentJcr:lastModifiedBy);
if("null" != String(jcr:contentJcr:mixinTypes))
            queryParams["jcr:content/jcr:mixinTypes"] = toPathValue(jcr:contentJcr:mixinTypes);
if("null" != String(jcr:contentJcr:title))
            queryParams["jcr:content/jcr:title"] = toPathValue(jcr:contentJcr:title);
if("null" != String(jcr:contentLogLevel))
            queryParams["jcr:content/logLevel"] = toPathValue(jcr:contentLogLevel);
if("null" != String(jcr:contentNoStatusUpdate))
            queryParams["jcr:content/noStatusUpdate"] = toPathValue(jcr:contentNoStatusUpdate);
if("null" != String(jcr:contentNoVersioning))
            queryParams["jcr:content/noVersioning"] = toPathValue(jcr:contentNoVersioning);
if("null" != String(jcr:contentProtocolConnectTimeout))
            queryParams["jcr:content/protocolConnectTimeout"] = toPathValue(jcr:contentProtocolConnectTimeout);
if("null" != String(jcr:contentProtocolHTTPConnectionClosed))
            queryParams["jcr:content/protocolHTTPConnectionClosed"] = toPathValue(jcr:contentProtocolHTTPConnectionClosed);
if("null" != String(jcr:contentProtocolHTTPExpired))
            queryParams["jcr:content/protocolHTTPExpired"] = toPathValue(jcr:contentProtocolHTTPExpired);
if("null" != String(jcr:contentProtocolHTTPHeaders))
            queryParams["jcr:content/protocolHTTPHeaders"] = toPathValue(jcr:contentProtocolHTTPHeaders);
if("null" != String(jcr:contentProtocolHTTPHeaders@TypeHint))
            queryParams["jcr:content/protocolHTTPHeaders@TypeHint"] = toPathValue(jcr:contentProtocolHTTPHeaders@TypeHint);
if("null" != String(jcr:contentProtocolHTTPMethod))
            queryParams["jcr:content/protocolHTTPMethod"] = toPathValue(jcr:contentProtocolHTTPMethod);
if("null" != String(jcr:contentProtocolHTTPSRelaxed))
            queryParams["jcr:content/protocolHTTPSRelaxed"] = toPathValue(jcr:contentProtocolHTTPSRelaxed);
if("null" != String(jcr:contentProtocolInterface))
            queryParams["jcr:content/protocolInterface"] = toPathValue(jcr:contentProtocolInterface);
if("null" != String(jcr:contentProtocolSocketTimeout))
            queryParams["jcr:content/protocolSocketTimeout"] = toPathValue(jcr:contentProtocolSocketTimeout);
if("null" != String(jcr:contentProtocolVersion))
            queryParams["jcr:content/protocolVersion"] = toPathValue(jcr:contentProtocolVersion);
if("null" != String(jcr:contentProxyNTLMDomain))
            queryParams["jcr:content/proxyNTLMDomain"] = toPathValue(jcr:contentProxyNTLMDomain);
if("null" != String(jcr:contentProxyNTLMHost))
            queryParams["jcr:content/proxyNTLMHost"] = toPathValue(jcr:contentProxyNTLMHost);
if("null" != String(jcr:contentProxyHost))
            queryParams["jcr:content/proxyHost"] = toPathValue(jcr:contentProxyHost);
if("null" != String(jcr:contentProxyPassword))
            queryParams["jcr:content/proxyPassword"] = toPathValue(jcr:contentProxyPassword);
if("null" != String(jcr:contentProxyPort))
            queryParams["jcr:content/proxyPort"] = toPathValue(jcr:contentProxyPort);
if("null" != String(jcr:contentProxyUser))
            queryParams["jcr:content/proxyUser"] = toPathValue(jcr:contentProxyUser);
if("null" != String(jcr:contentQueueBatchMaxSize))
            queryParams["jcr:content/queueBatchMaxSize"] = toPathValue(jcr:contentQueueBatchMaxSize);
if("null" != String(jcr:contentQueueBatchMode))
            queryParams["jcr:content/queueBatchMode"] = toPathValue(jcr:contentQueueBatchMode);
if("null" != String(jcr:contentQueueBatchWaitTime))
            queryParams["jcr:content/queueBatchWaitTime"] = toPathValue(jcr:contentQueueBatchWaitTime);
if("null" != String(jcr:contentRetryDelay))
            queryParams["jcr:content/retryDelay"] = toPathValue(jcr:contentRetryDelay);
if("null" != String(jcr:contentReverseReplication))
            queryParams["jcr:content/reverseReplication"] = toPathValue(jcr:contentReverseReplication);
if("null" != String(jcr:contentSerializationType))
            queryParams["jcr:content/serializationType"] = toPathValue(jcr:contentSerializationType);
if("null" != String(jcr:contentSling:resourceType))
            queryParams["jcr:content/sling:resourceType"] = toPathValue(jcr:contentSling:resourceType);
if("null" != String(jcr:contentSsl))
            queryParams["jcr:content/ssl"] = toPathValue(jcr:contentSsl);
if("null" != String(jcr:contentTransportNTLMDomain))
            queryParams["jcr:content/transportNTLMDomain"] = toPathValue(jcr:contentTransportNTLMDomain);
if("null" != String(jcr:contentTransportNTLMHost))
            queryParams["jcr:content/transportNTLMHost"] = toPathValue(jcr:contentTransportNTLMHost);
if("null" != String(jcr:contentTransportPassword))
            queryParams["jcr:content/transportPassword"] = toPathValue(jcr:contentTransportPassword);
if("null" != String(jcr:contentTransportUri))
            queryParams["jcr:content/transportUri"] = toPathValue(jcr:contentTransportUri);
if("null" != String(jcr:contentTransportUser))
            queryParams["jcr:content/transportUser"] = toPathValue(jcr:contentTransportUser);
if("null" != String(jcr:contentTriggerDistribute))
            queryParams["jcr:content/triggerDistribute"] = toPathValue(jcr:contentTriggerDistribute);
if("null" != String(jcr:contentTriggerModified))
            queryParams["jcr:content/triggerModified"] = toPathValue(jcr:contentTriggerModified);
if("null" != String(jcr:contentTriggerOnOffTime))
            queryParams["jcr:content/triggerOnOffTime"] = toPathValue(jcr:contentTriggerOnOffTime);
if("null" != String(jcr:contentTriggerReceive))
            queryParams["jcr:content/triggerReceive"] = toPathValue(jcr:contentTriggerReceive);
if("null" != String(jcr:contentTriggerSpecific))
            queryParams["jcr:content/triggerSpecific"] = toPathValue(jcr:contentTriggerSpecific);
if("null" != String(jcr:contentUserId))
            queryParams["jcr:content/userId"] = toPathValue(jcr:contentUserId);
if("null" != String(jcr:primaryType))
            queryParams["jcr:primaryType"] = toPathValue(jcr:primaryType);
if("null" != String(:operation))
            queryParams[":operation"] = toPathValue(:operation);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_agent";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns KeystoreInfo 
     */
    public function post_authorizable_keystore (intermediatePath: String, authorizableId: String, :operation: String, currentPassword: String, newPassword: String, rePassword: String, keyPassword: String, keyStorePass: String, alias: String, newAlias: String, removeAlias: String, certChain: File, pk: File, keyStore: File): String {
        // create path and map variables
        var path: String = "/{intermediatePath}/{authorizableId}.ks.html".replace(/{format}/g,"xml").replace("{" + "intermediatePath" + "}", getApiInvoker().escapeString(intermediatePath)).replace("{" + "authorizableId" + "}", getApiInvoker().escapeString(authorizableId));

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

        if("null" != String(:operation))
            queryParams[":operation"] = toPathValue(:operation);
if("null" != String(currentPassword))
            queryParams["currentPassword"] = toPathValue(currentPassword);
if("null" != String(newPassword))
            queryParams["newPassword"] = toPathValue(newPassword);
if("null" != String(rePassword))
            queryParams["rePassword"] = toPathValue(rePassword);
if("null" != String(keyPassword))
            queryParams["keyPassword"] = toPathValue(keyPassword);
if("null" != String(keyStorePass))
            queryParams["keyStorePass"] = toPathValue(keyStorePass);
if("null" != String(alias))
            queryParams["alias"] = toPathValue(alias);
if("null" != String(newAlias))
            queryParams["newAlias"] = toPathValue(newAlias);
if("null" != String(removeAlias))
            queryParams["removeAlias"] = toPathValue(removeAlias);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_authorizable_keystore";

        token.returnType = KeystoreInfo;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_authorizables (authorizableId: String, intermediatePath: String, createUser: String, createGroup: String, rep:password: String, profileGivenName: String): String {
        // create path and map variables
        var path: String = "/libs/granite/security/post/authorizables".replace(/{format}/g,"xml");

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

        if("null" != String(authorizableId))
            queryParams["authorizableId"] = toPathValue(authorizableId);
if("null" != String(intermediatePath))
            queryParams["intermediatePath"] = toPathValue(intermediatePath);
if("null" != String(createUser))
            queryParams["createUser"] = toPathValue(createUser);
if("null" != String(createGroup))
            queryParams["createGroup"] = toPathValue(createGroup);
if("null" != String(rep:password))
            queryParams["rep:password"] = toPathValue(rep:password);
if("null" != String(profileGivenName))
            queryParams["profile/givenName"] = toPathValue(profileGivenName);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_authorizables";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_adobe_granite_saml_authentication_handler (keyStorePassword: String, keyStorePassword@TypeHint: String, serviceRanking: Number, serviceRanking@TypeHint: String, idpHttpRedirect: Boolean, idpHttpRedirect@TypeHint: String, createUser: Boolean, createUser@TypeHint: String, defaultRedirectUrl: String, defaultRedirectUrl@TypeHint: String, userIDAttribute: String, userIDAttribute@TypeHint: String, defaultGroups: Array, defaultGroups@TypeHint: String, idpCertAlias: String, idpCertAlias@TypeHint: String, addGroupMemberships: Boolean, addGroupMemberships@TypeHint: String, path: Array, path@TypeHint: String, synchronizeAttributes: Array, synchronizeAttributes@TypeHint: String, clockTolerance: Number, clockTolerance@TypeHint: String, groupMembershipAttribute: String, groupMembershipAttribute@TypeHint: String, idpUrl: String, idpUrl@TypeHint: String, logoutUrl: String, logoutUrl@TypeHint: String, serviceProviderEntityId: String, serviceProviderEntityId@TypeHint: String, assertionConsumerServiceURL: String, assertionConsumerServiceURL@TypeHint: String, handleLogout: Boolean, handleLogout@TypeHint: String, spPrivateKeyAlias: String, spPrivateKeyAlias@TypeHint: String, useEncryption: Boolean, useEncryption@TypeHint: String, nameIdFormat: String, nameIdFormat@TypeHint: String, digestMethod: String, digestMethod@TypeHint: String, signatureMethod: String, signatureMethod@TypeHint: String, userIntermediatePath: String, userIntermediatePath@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config".replace(/{format}/g,"xml");

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

        if("null" != String(keyStorePassword))
            queryParams["keyStorePassword"] = toPathValue(keyStorePassword);
if("null" != String(keyStorePassword@TypeHint))
            queryParams["keyStorePassword@TypeHint"] = toPathValue(keyStorePassword@TypeHint);
if("null" != String(serviceRanking))
            queryParams["service.ranking"] = toPathValue(serviceRanking);
if("null" != String(serviceRanking@TypeHint))
            queryParams["service.ranking@TypeHint"] = toPathValue(serviceRanking@TypeHint);
if("null" != String(idpHttpRedirect))
            queryParams["idpHttpRedirect"] = toPathValue(idpHttpRedirect);
if("null" != String(idpHttpRedirect@TypeHint))
            queryParams["idpHttpRedirect@TypeHint"] = toPathValue(idpHttpRedirect@TypeHint);
if("null" != String(createUser))
            queryParams["createUser"] = toPathValue(createUser);
if("null" != String(createUser@TypeHint))
            queryParams["createUser@TypeHint"] = toPathValue(createUser@TypeHint);
if("null" != String(defaultRedirectUrl))
            queryParams["defaultRedirectUrl"] = toPathValue(defaultRedirectUrl);
if("null" != String(defaultRedirectUrl@TypeHint))
            queryParams["defaultRedirectUrl@TypeHint"] = toPathValue(defaultRedirectUrl@TypeHint);
if("null" != String(userIDAttribute))
            queryParams["userIDAttribute"] = toPathValue(userIDAttribute);
if("null" != String(userIDAttribute@TypeHint))
            queryParams["userIDAttribute@TypeHint"] = toPathValue(userIDAttribute@TypeHint);
if("null" != String(defaultGroups))
            queryParams["defaultGroups"] = toPathValue(defaultGroups);
if("null" != String(defaultGroups@TypeHint))
            queryParams["defaultGroups@TypeHint"] = toPathValue(defaultGroups@TypeHint);
if("null" != String(idpCertAlias))
            queryParams["idpCertAlias"] = toPathValue(idpCertAlias);
if("null" != String(idpCertAlias@TypeHint))
            queryParams["idpCertAlias@TypeHint"] = toPathValue(idpCertAlias@TypeHint);
if("null" != String(addGroupMemberships))
            queryParams["addGroupMemberships"] = toPathValue(addGroupMemberships);
if("null" != String(addGroupMemberships@TypeHint))
            queryParams["addGroupMemberships@TypeHint"] = toPathValue(addGroupMemberships@TypeHint);
if("null" != String(path))
            queryParams["path"] = toPathValue(path);
if("null" != String(path@TypeHint))
            queryParams["path@TypeHint"] = toPathValue(path@TypeHint);
if("null" != String(synchronizeAttributes))
            queryParams["synchronizeAttributes"] = toPathValue(synchronizeAttributes);
if("null" != String(synchronizeAttributes@TypeHint))
            queryParams["synchronizeAttributes@TypeHint"] = toPathValue(synchronizeAttributes@TypeHint);
if("null" != String(clockTolerance))
            queryParams["clockTolerance"] = toPathValue(clockTolerance);
if("null" != String(clockTolerance@TypeHint))
            queryParams["clockTolerance@TypeHint"] = toPathValue(clockTolerance@TypeHint);
if("null" != String(groupMembershipAttribute))
            queryParams["groupMembershipAttribute"] = toPathValue(groupMembershipAttribute);
if("null" != String(groupMembershipAttribute@TypeHint))
            queryParams["groupMembershipAttribute@TypeHint"] = toPathValue(groupMembershipAttribute@TypeHint);
if("null" != String(idpUrl))
            queryParams["idpUrl"] = toPathValue(idpUrl);
if("null" != String(idpUrl@TypeHint))
            queryParams["idpUrl@TypeHint"] = toPathValue(idpUrl@TypeHint);
if("null" != String(logoutUrl))
            queryParams["logoutUrl"] = toPathValue(logoutUrl);
if("null" != String(logoutUrl@TypeHint))
            queryParams["logoutUrl@TypeHint"] = toPathValue(logoutUrl@TypeHint);
if("null" != String(serviceProviderEntityId))
            queryParams["serviceProviderEntityId"] = toPathValue(serviceProviderEntityId);
if("null" != String(serviceProviderEntityId@TypeHint))
            queryParams["serviceProviderEntityId@TypeHint"] = toPathValue(serviceProviderEntityId@TypeHint);
if("null" != String(assertionConsumerServiceURL))
            queryParams["assertionConsumerServiceURL"] = toPathValue(assertionConsumerServiceURL);
if("null" != String(assertionConsumerServiceURL@TypeHint))
            queryParams["assertionConsumerServiceURL@TypeHint"] = toPathValue(assertionConsumerServiceURL@TypeHint);
if("null" != String(handleLogout))
            queryParams["handleLogout"] = toPathValue(handleLogout);
if("null" != String(handleLogout@TypeHint))
            queryParams["handleLogout@TypeHint"] = toPathValue(handleLogout@TypeHint);
if("null" != String(spPrivateKeyAlias))
            queryParams["spPrivateKeyAlias"] = toPathValue(spPrivateKeyAlias);
if("null" != String(spPrivateKeyAlias@TypeHint))
            queryParams["spPrivateKeyAlias@TypeHint"] = toPathValue(spPrivateKeyAlias@TypeHint);
if("null" != String(useEncryption))
            queryParams["useEncryption"] = toPathValue(useEncryption);
if("null" != String(useEncryption@TypeHint))
            queryParams["useEncryption@TypeHint"] = toPathValue(useEncryption@TypeHint);
if("null" != String(nameIdFormat))
            queryParams["nameIdFormat"] = toPathValue(nameIdFormat);
if("null" != String(nameIdFormat@TypeHint))
            queryParams["nameIdFormat@TypeHint"] = toPathValue(nameIdFormat@TypeHint);
if("null" != String(digestMethod))
            queryParams["digestMethod"] = toPathValue(digestMethod);
if("null" != String(digestMethod@TypeHint))
            queryParams["digestMethod@TypeHint"] = toPathValue(digestMethod@TypeHint);
if("null" != String(signatureMethod))
            queryParams["signatureMethod"] = toPathValue(signatureMethod);
if("null" != String(signatureMethod@TypeHint))
            queryParams["signatureMethod@TypeHint"] = toPathValue(signatureMethod@TypeHint);
if("null" != String(userIntermediatePath))
            queryParams["userIntermediatePath"] = toPathValue(userIntermediatePath);
if("null" != String(userIntermediatePath@TypeHint))
            queryParams["userIntermediatePath@TypeHint"] = toPathValue(userIntermediatePath@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_adobe_granite_saml_authentication_handler";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_apache_felix_jetty_based_http_service (orgApacheFelixHttpsNio: Boolean, orgApacheFelixHttpsNio@TypeHint: String, orgApacheFelixHttpsKeystore: String, orgApacheFelixHttpsKeystore@TypeHint: String, orgApacheFelixHttpsKeystorePassword: String, orgApacheFelixHttpsKeystorePassword@TypeHint: String, orgApacheFelixHttpsKeystoreKey: String, orgApacheFelixHttpsKeystoreKey@TypeHint: String, orgApacheFelixHttpsKeystoreKeyPassword: String, orgApacheFelixHttpsKeystoreKeyPassword@TypeHint: String, orgApacheFelixHttpsTruststore: String, orgApacheFelixHttpsTruststore@TypeHint: String, orgApacheFelixHttpsTruststorePassword: String, orgApacheFelixHttpsTruststorePassword@TypeHint: String, orgApacheFelixHttpsClientcertificate: String, orgApacheFelixHttpsClientcertificate@TypeHint: String, orgApacheFelixHttpsEnable: Boolean, orgApacheFelixHttpsEnable@TypeHint: String, orgOsgiServiceHttpPortSecure: String, orgOsgiServiceHttpPortSecure@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/org.apache.felix.http".replace(/{format}/g,"xml");

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

        if("null" != String(orgApacheFelixHttpsNio))
            queryParams["org.apache.felix.https.nio"] = toPathValue(orgApacheFelixHttpsNio);
if("null" != String(orgApacheFelixHttpsNio@TypeHint))
            queryParams["org.apache.felix.https.nio@TypeHint"] = toPathValue(orgApacheFelixHttpsNio@TypeHint);
if("null" != String(orgApacheFelixHttpsKeystore))
            queryParams["org.apache.felix.https.keystore"] = toPathValue(orgApacheFelixHttpsKeystore);
if("null" != String(orgApacheFelixHttpsKeystore@TypeHint))
            queryParams["org.apache.felix.https.keystore@TypeHint"] = toPathValue(orgApacheFelixHttpsKeystore@TypeHint);
if("null" != String(orgApacheFelixHttpsKeystorePassword))
            queryParams["org.apache.felix.https.keystore.password"] = toPathValue(orgApacheFelixHttpsKeystorePassword);
if("null" != String(orgApacheFelixHttpsKeystorePassword@TypeHint))
            queryParams["org.apache.felix.https.keystore.password@TypeHint"] = toPathValue(orgApacheFelixHttpsKeystorePassword@TypeHint);
if("null" != String(orgApacheFelixHttpsKeystoreKey))
            queryParams["org.apache.felix.https.keystore.key"] = toPathValue(orgApacheFelixHttpsKeystoreKey);
if("null" != String(orgApacheFelixHttpsKeystoreKey@TypeHint))
            queryParams["org.apache.felix.https.keystore.key@TypeHint"] = toPathValue(orgApacheFelixHttpsKeystoreKey@TypeHint);
if("null" != String(orgApacheFelixHttpsKeystoreKeyPassword))
            queryParams["org.apache.felix.https.keystore.key.password"] = toPathValue(orgApacheFelixHttpsKeystoreKeyPassword);
if("null" != String(orgApacheFelixHttpsKeystoreKeyPassword@TypeHint))
            queryParams["org.apache.felix.https.keystore.key.password@TypeHint"] = toPathValue(orgApacheFelixHttpsKeystoreKeyPassword@TypeHint);
if("null" != String(orgApacheFelixHttpsTruststore))
            queryParams["org.apache.felix.https.truststore"] = toPathValue(orgApacheFelixHttpsTruststore);
if("null" != String(orgApacheFelixHttpsTruststore@TypeHint))
            queryParams["org.apache.felix.https.truststore@TypeHint"] = toPathValue(orgApacheFelixHttpsTruststore@TypeHint);
if("null" != String(orgApacheFelixHttpsTruststorePassword))
            queryParams["org.apache.felix.https.truststore.password"] = toPathValue(orgApacheFelixHttpsTruststorePassword);
if("null" != String(orgApacheFelixHttpsTruststorePassword@TypeHint))
            queryParams["org.apache.felix.https.truststore.password@TypeHint"] = toPathValue(orgApacheFelixHttpsTruststorePassword@TypeHint);
if("null" != String(orgApacheFelixHttpsClientcertificate))
            queryParams["org.apache.felix.https.clientcertificate"] = toPathValue(orgApacheFelixHttpsClientcertificate);
if("null" != String(orgApacheFelixHttpsClientcertificate@TypeHint))
            queryParams["org.apache.felix.https.clientcertificate@TypeHint"] = toPathValue(orgApacheFelixHttpsClientcertificate@TypeHint);
if("null" != String(orgApacheFelixHttpsEnable))
            queryParams["org.apache.felix.https.enable"] = toPathValue(orgApacheFelixHttpsEnable);
if("null" != String(orgApacheFelixHttpsEnable@TypeHint))
            queryParams["org.apache.felix.https.enable@TypeHint"] = toPathValue(orgApacheFelixHttpsEnable@TypeHint);
if("null" != String(orgOsgiServiceHttpPortSecure))
            queryParams["org.osgi.service.http.port.secure"] = toPathValue(orgOsgiServiceHttpPortSecure);
if("null" != String(orgOsgiServiceHttpPortSecure@TypeHint))
            queryParams["org.osgi.service.http.port.secure@TypeHint"] = toPathValue(orgOsgiServiceHttpPortSecure@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_apache_felix_jetty_based_http_service";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_apache_http_components_proxy_configuration (proxyHost: String, proxyHost@TypeHint: String, proxyPort: Number, proxyPort@TypeHint: String, proxyExceptions: Array, proxyExceptions@TypeHint: String, proxyEnabled: Boolean, proxyEnabled@TypeHint: String, proxyUser: String, proxyUser@TypeHint: String, proxyPassword: String, proxyPassword@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/org.apache.http.proxyconfigurator.config".replace(/{format}/g,"xml");

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

        if("null" != String(proxyHost))
            queryParams["proxy.host"] = toPathValue(proxyHost);
if("null" != String(proxyHost@TypeHint))
            queryParams["proxy.host@TypeHint"] = toPathValue(proxyHost@TypeHint);
if("null" != String(proxyPort))
            queryParams["proxy.port"] = toPathValue(proxyPort);
if("null" != String(proxyPort@TypeHint))
            queryParams["proxy.port@TypeHint"] = toPathValue(proxyPort@TypeHint);
if("null" != String(proxyExceptions))
            queryParams["proxy.exceptions"] = toPathValue(proxyExceptions);
if("null" != String(proxyExceptions@TypeHint))
            queryParams["proxy.exceptions@TypeHint"] = toPathValue(proxyExceptions@TypeHint);
if("null" != String(proxyEnabled))
            queryParams["proxy.enabled"] = toPathValue(proxyEnabled);
if("null" != String(proxyEnabled@TypeHint))
            queryParams["proxy.enabled@TypeHint"] = toPathValue(proxyEnabled@TypeHint);
if("null" != String(proxyUser))
            queryParams["proxy.user"] = toPathValue(proxyUser);
if("null" != String(proxyUser@TypeHint))
            queryParams["proxy.user@TypeHint"] = toPathValue(proxyUser@TypeHint);
if("null" != String(proxyPassword))
            queryParams["proxy.password"] = toPathValue(proxyPassword);
if("null" != String(proxyPassword@TypeHint))
            queryParams["proxy.password@TypeHint"] = toPathValue(proxyPassword@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_apache_http_components_proxy_configuration";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_apache_sling_dav_ex_servlet (alias: String, alias@TypeHint: String, davCreateAbsoluteUri: Boolean, davCreateAbsoluteUri@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(alias))
            queryParams["alias"] = toPathValue(alias);
if("null" != String(alias@TypeHint))
            queryParams["alias@TypeHint"] = toPathValue(alias@TypeHint);
if("null" != String(davCreateAbsoluteUri))
            queryParams["dav.create-absolute-uri"] = toPathValue(davCreateAbsoluteUri);
if("null" != String(davCreateAbsoluteUri@TypeHint))
            queryParams["dav.create-absolute-uri@TypeHint"] = toPathValue(davCreateAbsoluteUri@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_apache_sling_dav_ex_servlet";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_apache_sling_get_servlet (jsonMaximumresults: String, jsonMaximumresults@TypeHint: String, enableHtml: Boolean, enableHtml@TypeHint: String, enableTxt: Boolean, enableTxt@TypeHint: String, enableXml: Boolean, enableXml@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet".replace(/{format}/g,"xml");

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

        if("null" != String(jsonMaximumresults))
            queryParams["json.maximumresults"] = toPathValue(jsonMaximumresults);
if("null" != String(jsonMaximumresults@TypeHint))
            queryParams["json.maximumresults@TypeHint"] = toPathValue(jsonMaximumresults@TypeHint);
if("null" != String(enableHtml))
            queryParams["enable.html"] = toPathValue(enableHtml);
if("null" != String(enableHtml@TypeHint))
            queryParams["enable.html@TypeHint"] = toPathValue(enableHtml@TypeHint);
if("null" != String(enableTxt))
            queryParams["enable.txt"] = toPathValue(enableTxt);
if("null" != String(enableTxt@TypeHint))
            queryParams["enable.txt@TypeHint"] = toPathValue(enableTxt@TypeHint);
if("null" != String(enableXml))
            queryParams["enable.xml"] = toPathValue(enableXml);
if("null" != String(enableXml@TypeHint))
            queryParams["enable.xml@TypeHint"] = toPathValue(enableXml@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_apache_sling_get_servlet";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_config_apache_sling_referrer_filter (allowEmpty: Boolean, allowEmpty@TypeHint: String, allowHosts: String, allowHosts@TypeHint: String, allowHostsRegexp: String, allowHostsRegexp@TypeHint: String, filterMethods: String, filterMethods@TypeHint: String): String {
        // create path and map variables
        var path: String = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter".replace(/{format}/g,"xml");

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

        if("null" != String(allowEmpty))
            queryParams["allow.empty"] = toPathValue(allowEmpty);
if("null" != String(allowEmpty@TypeHint))
            queryParams["allow.empty@TypeHint"] = toPathValue(allowEmpty@TypeHint);
if("null" != String(allowHosts))
            queryParams["allow.hosts"] = toPathValue(allowHosts);
if("null" != String(allowHosts@TypeHint))
            queryParams["allow.hosts@TypeHint"] = toPathValue(allowHosts@TypeHint);
if("null" != String(allowHostsRegexp))
            queryParams["allow.hosts.regexp"] = toPathValue(allowHostsRegexp);
if("null" != String(allowHostsRegexp@TypeHint))
            queryParams["allow.hosts.regexp@TypeHint"] = toPathValue(allowHostsRegexp@TypeHint);
if("null" != String(filterMethods))
            queryParams["filter.methods"] = toPathValue(filterMethods);
if("null" != String(filterMethods@TypeHint))
            queryParams["filter.methods@TypeHint"] = toPathValue(filterMethods@TypeHint);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_config_apache_sling_referrer_filter";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_node (path: String, name: String, :operation: String, deleteAuthorizable: String, file: File): String {
        // create path and map variables
        var path: String = "/{path}/{name}".replace(/{format}/g,"xml").replace("{" + "path" + "}", getApiInvoker().escapeString(path)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(:operation))
            queryParams[":operation"] = toPathValue(:operation);
if("null" != String(deleteAuthorizable))
            queryParams["deleteAuthorizable"] = toPathValue(deleteAuthorizable);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_node";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_node_rw (path: String, name: String, addMembers: String): String {
        // create path and map variables
        var path: String = "/{path}/{name}.rw.html".replace(/{format}/g,"xml").replace("{" + "path" + "}", getApiInvoker().escapeString(path)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

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

        if("null" != String(addMembers))
            queryParams["addMembers"] = toPathValue(addMembers);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_node_rw";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_path (path: String, jcr:primaryType: String, :name: String): String {
        // create path and map variables
        var path: String = "/{path}/".replace(/{format}/g,"xml").replace("{" + "path" + "}", getApiInvoker().escapeString(path));

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

        if("null" != String(jcr:primaryType))
            queryParams["jcr:primaryType"] = toPathValue(jcr:primaryType);
if("null" != String(:name))
            queryParams[":name"] = toPathValue(:name);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_path";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_query (path: String, pLimit: Number, _1property: String, _1propertyValue: String): String {
        // create path and map variables
        var path: String = "/bin/querybuilder.json".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(path))
            queryParams["path"] = toPathValue(path);
if("null" != String(pLimit))
            queryParams["p.limit"] = toPathValue(pLimit);
if("null" != String(_1property))
            queryParams["1_property"] = toPathValue(_1property);
if("null" != String(_1propertyValue))
            queryParams["1_property.value"] = toPathValue(_1propertyValue);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_query";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function post_tree_activation (ignoredeactivated: Boolean, onlymodified: Boolean, path: String): String {
        // create path and map variables
        var path: String = "/etc/replication/treeactivation.html".replace(/{format}/g,"xml");

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

        if("null" != String(ignoredeactivated))
            queryParams["ignoredeactivated"] = toPathValue(ignoredeactivated);
if("null" != String(onlymodified))
            queryParams["onlymodified"] = toPathValue(onlymodified);
if("null" != String(path))
            queryParams["path"] = toPathValue(path);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_tree_activation";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_truststore (:operation: String, newPassword: String, rePassword: String, keyStoreType: String, removeAlias: String, certificate: File): String {
        // create path and map variables
        var path: String = "/libs/granite/security/post/truststore".replace(/{format}/g,"xml");

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

        if("null" != String(:operation))
            queryParams[":operation"] = toPathValue(:operation);
if("null" != String(newPassword))
            queryParams["newPassword"] = toPathValue(newPassword);
if("null" != String(rePassword))
            queryParams["rePassword"] = toPathValue(rePassword);
if("null" != String(keyStoreType))
            queryParams["keyStoreType"] = toPathValue(keyStoreType);
if("null" != String(removeAlias))
            queryParams["removeAlias"] = toPathValue(removeAlias);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "post_truststore";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function post_truststore_pkcs12 (truststoreP12: File): String {
        // create path and map variables
        var path: String = "/etc/truststore".replace(/{format}/g,"xml");

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
        token.completionEventType = "post_truststore_pkcs12";

        token.returnType = String;
        return requestId;

    }
}
}
