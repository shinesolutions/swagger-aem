// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { KeystoreInfo } from '../models/KeystoreInfo';
import { TruststoreInfo } from '../models/TruststoreInfo';

/**
 * no description
 */
export class SlingApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * @param runmode 
     * @param name 
     */
    public async deleteAgent(runmode: string, name: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'runmode' is not null or undefined
        if (runmode === null || runmode === undefined) {
            throw new RequiredError("SlingApi", "deleteAgent", "runmode");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "deleteAgent", "name");
        }


        // Path Params
        const localVarPath = '/etc/replication/agents.{runmode}/{name}'
            .replace('{runmode}', encodeURIComponent(String(runmode)))
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param path 
     * @param name 
     */
    public async deleteNode(path: string, name: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "deleteNode", "path");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "deleteNode", "name");
        }


        // Path Params
        const localVarPath = '/{path}/{name}'
            .replace('{path}', encodeURIComponent(String(path)))
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param runmode 
     * @param name 
     */
    public async getAgent(runmode: string, name: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'runmode' is not null or undefined
        if (runmode === null || runmode === undefined) {
            throw new RequiredError("SlingApi", "getAgent", "runmode");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "getAgent", "name");
        }


        // Path Params
        const localVarPath = '/etc/replication/agents.{runmode}/{name}'
            .replace('{runmode}', encodeURIComponent(String(runmode)))
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param runmode 
     */
    public async getAgents(runmode: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'runmode' is not null or undefined
        if (runmode === null || runmode === undefined) {
            throw new RequiredError("SlingApi", "getAgents", "runmode");
        }


        // Path Params
        const localVarPath = '/etc/replication/agents.{runmode}.-1.json'
            .replace('{runmode}', encodeURIComponent(String(runmode)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param intermediatePath 
     * @param authorizableId 
     */
    public async getAuthorizableKeystore(intermediatePath: string, authorizableId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'intermediatePath' is not null or undefined
        if (intermediatePath === null || intermediatePath === undefined) {
            throw new RequiredError("SlingApi", "getAuthorizableKeystore", "intermediatePath");
        }


        // verify required parameter 'authorizableId' is not null or undefined
        if (authorizableId === null || authorizableId === undefined) {
            throw new RequiredError("SlingApi", "getAuthorizableKeystore", "authorizableId");
        }


        // Path Params
        const localVarPath = '/{intermediatePath}/{authorizableId}.ks.json'
            .replace('{intermediatePath}', encodeURIComponent(String(intermediatePath)))
            .replace('{authorizableId}', encodeURIComponent(String(authorizableId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param intermediatePath 
     * @param authorizableId 
     */
    public async getKeystore(intermediatePath: string, authorizableId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'intermediatePath' is not null or undefined
        if (intermediatePath === null || intermediatePath === undefined) {
            throw new RequiredError("SlingApi", "getKeystore", "intermediatePath");
        }


        // verify required parameter 'authorizableId' is not null or undefined
        if (authorizableId === null || authorizableId === undefined) {
            throw new RequiredError("SlingApi", "getKeystore", "authorizableId");
        }


        // Path Params
        const localVarPath = '/{intermediatePath}/{authorizableId}/keystore/store.p12'
            .replace('{intermediatePath}', encodeURIComponent(String(intermediatePath)))
            .replace('{authorizableId}', encodeURIComponent(String(authorizableId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param path 
     * @param name 
     */
    public async getNode(path: string, name: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "getNode", "path");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "getNode", "name");
        }


        // Path Params
        const localVarPath = '/{path}/{name}'
            .replace('{path}', encodeURIComponent(String(path)))
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param group 
     * @param name 
     * @param version 
     */
    public async getPackage(group: string, name: string, version: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'group' is not null or undefined
        if (group === null || group === undefined) {
            throw new RequiredError("SlingApi", "getPackage", "group");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "getPackage", "name");
        }


        // verify required parameter 'version' is not null or undefined
        if (version === null || version === undefined) {
            throw new RequiredError("SlingApi", "getPackage", "version");
        }


        // Path Params
        const localVarPath = '/etc/packages/{group}/{name}-{version}.zip'
            .replace('{group}', encodeURIComponent(String(group)))
            .replace('{name}', encodeURIComponent(String(name)))
            .replace('{version}', encodeURIComponent(String(version)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param group 
     * @param name 
     * @param version 
     */
    public async getPackageFilter(group: string, name: string, version: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'group' is not null or undefined
        if (group === null || group === undefined) {
            throw new RequiredError("SlingApi", "getPackageFilter", "group");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "getPackageFilter", "name");
        }


        // verify required parameter 'version' is not null or undefined
        if (version === null || version === undefined) {
            throw new RequiredError("SlingApi", "getPackageFilter", "version");
        }


        // Path Params
        const localVarPath = '/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json'
            .replace('{group}', encodeURIComponent(String(group)))
            .replace('{name}', encodeURIComponent(String(name)))
            .replace('{version}', encodeURIComponent(String(version)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param path 
     * @param pLimit 
     * @param _1property 
     * @param _1propertyValue 
     */
    public async getQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "getQuery", "path");
        }


        // verify required parameter 'pLimit' is not null or undefined
        if (pLimit === null || pLimit === undefined) {
            throw new RequiredError("SlingApi", "getQuery", "pLimit");
        }


        // verify required parameter '_1property' is not null or undefined
        if (_1property === null || _1property === undefined) {
            throw new RequiredError("SlingApi", "getQuery", "_1property");
        }


        // verify required parameter '_1propertyValue' is not null or undefined
        if (_1propertyValue === null || _1propertyValue === undefined) {
            throw new RequiredError("SlingApi", "getQuery", "_1propertyValue");
        }


        // Path Params
        const localVarPath = '/bin/querybuilder.json';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (path !== undefined) {
            requestContext.setQueryParam("path", ObjectSerializer.serialize(path, "string", ""));
        }

        // Query Params
        if (pLimit !== undefined) {
            requestContext.setQueryParam("p.limit", ObjectSerializer.serialize(pLimit, "number", ""));
        }

        // Query Params
        if (_1property !== undefined) {
            requestContext.setQueryParam("1_property", ObjectSerializer.serialize(_1property, "string", ""));
        }

        // Query Params
        if (_1propertyValue !== undefined) {
            requestContext.setQueryParam("1_property.value", ObjectSerializer.serialize(_1propertyValue, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     */
    public async getTruststore(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/etc/truststore/truststore.p12';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     */
    public async getTruststoreInfo(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/libs/granite/security/truststore.json';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param runmode 
     * @param name 
     * @param jcrContentCqDistribute 
     * @param jcrContentCqDistributeTypeHint 
     * @param jcrContentCqName 
     * @param jcrContentCqTemplate 
     * @param jcrContentAliasUpdate 
     * @param jcrContentEnabled 
     * @param jcrContentJcrDescription 
     * @param jcrContentJcrLastModified 
     * @param jcrContentJcrLastModifiedBy 
     * @param jcrContentJcrMixinTypes 
     * @param jcrContentJcrTitle 
     * @param jcrContentLogLevel 
     * @param jcrContentNoStatusUpdate 
     * @param jcrContentNoVersioning 
     * @param jcrContentProtocolConnectTimeout 
     * @param jcrContentProtocolHTTPConnectionClosed 
     * @param jcrContentProtocolHTTPExpired 
     * @param jcrContentProtocolHTTPHeaders 
     * @param jcrContentProtocolHTTPHeadersTypeHint 
     * @param jcrContentProtocolHTTPMethod 
     * @param jcrContentProtocolHTTPSRelaxed 
     * @param jcrContentProtocolInterface 
     * @param jcrContentProtocolSocketTimeout 
     * @param jcrContentProtocolVersion 
     * @param jcrContentProxyNTLMDomain 
     * @param jcrContentProxyNTLMHost 
     * @param jcrContentProxyHost 
     * @param jcrContentProxyPassword 
     * @param jcrContentProxyPort 
     * @param jcrContentProxyUser 
     * @param jcrContentQueueBatchMaxSize 
     * @param jcrContentQueueBatchMode 
     * @param jcrContentQueueBatchWaitTime 
     * @param jcrContentRetryDelay 
     * @param jcrContentReverseReplication 
     * @param jcrContentSerializationType 
     * @param jcrContentSlingResourceType 
     * @param jcrContentSsl 
     * @param jcrContentTransportNTLMDomain 
     * @param jcrContentTransportNTLMHost 
     * @param jcrContentTransportPassword 
     * @param jcrContentTransportUri 
     * @param jcrContentTransportUser 
     * @param jcrContentTriggerDistribute 
     * @param jcrContentTriggerModified 
     * @param jcrContentTriggerOnOffTime 
     * @param jcrContentTriggerReceive 
     * @param jcrContentTriggerSpecific 
     * @param jcrContentUserId 
     * @param jcrPrimaryType 
     * @param operation 
     */
    public async postAgent(runmode: string, name: string, jcrContentCqDistribute?: boolean, jcrContentCqDistributeTypeHint?: string, jcrContentCqName?: string, jcrContentCqTemplate?: string, jcrContentAliasUpdate?: boolean, jcrContentEnabled?: boolean, jcrContentJcrDescription?: string, jcrContentJcrLastModified?: string, jcrContentJcrLastModifiedBy?: string, jcrContentJcrMixinTypes?: string, jcrContentJcrTitle?: string, jcrContentLogLevel?: string, jcrContentNoStatusUpdate?: boolean, jcrContentNoVersioning?: boolean, jcrContentProtocolConnectTimeout?: number, jcrContentProtocolHTTPConnectionClosed?: boolean, jcrContentProtocolHTTPExpired?: string, jcrContentProtocolHTTPHeaders?: Array<string>, jcrContentProtocolHTTPHeadersTypeHint?: string, jcrContentProtocolHTTPMethod?: string, jcrContentProtocolHTTPSRelaxed?: boolean, jcrContentProtocolInterface?: string, jcrContentProtocolSocketTimeout?: number, jcrContentProtocolVersion?: string, jcrContentProxyNTLMDomain?: string, jcrContentProxyNTLMHost?: string, jcrContentProxyHost?: string, jcrContentProxyPassword?: string, jcrContentProxyPort?: number, jcrContentProxyUser?: string, jcrContentQueueBatchMaxSize?: number, jcrContentQueueBatchMode?: string, jcrContentQueueBatchWaitTime?: number, jcrContentRetryDelay?: string, jcrContentReverseReplication?: boolean, jcrContentSerializationType?: string, jcrContentSlingResourceType?: string, jcrContentSsl?: string, jcrContentTransportNTLMDomain?: string, jcrContentTransportNTLMHost?: string, jcrContentTransportPassword?: string, jcrContentTransportUri?: string, jcrContentTransportUser?: string, jcrContentTriggerDistribute?: boolean, jcrContentTriggerModified?: boolean, jcrContentTriggerOnOffTime?: boolean, jcrContentTriggerReceive?: boolean, jcrContentTriggerSpecific?: boolean, jcrContentUserId?: string, jcrPrimaryType?: string, operation?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'runmode' is not null or undefined
        if (runmode === null || runmode === undefined) {
            throw new RequiredError("SlingApi", "postAgent", "runmode");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "postAgent", "name");
        }





















































        // Path Params
        const localVarPath = '/etc/replication/agents.{runmode}/{name}'
            .replace('{runmode}', encodeURIComponent(String(runmode)))
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (jcrContentCqDistribute !== undefined) {
            requestContext.setQueryParam("jcr:content/cq:distribute", ObjectSerializer.serialize(jcrContentCqDistribute, "boolean", ""));
        }

        // Query Params
        if (jcrContentCqDistributeTypeHint !== undefined) {
            requestContext.setQueryParam("jcr:content/cq:distribute@TypeHint", ObjectSerializer.serialize(jcrContentCqDistributeTypeHint, "string", ""));
        }

        // Query Params
        if (jcrContentCqName !== undefined) {
            requestContext.setQueryParam("jcr:content/cq:name", ObjectSerializer.serialize(jcrContentCqName, "string", ""));
        }

        // Query Params
        if (jcrContentCqTemplate !== undefined) {
            requestContext.setQueryParam("jcr:content/cq:template", ObjectSerializer.serialize(jcrContentCqTemplate, "string", ""));
        }

        // Query Params
        if (jcrContentAliasUpdate !== undefined) {
            requestContext.setQueryParam("jcr:content/aliasUpdate", ObjectSerializer.serialize(jcrContentAliasUpdate, "boolean", ""));
        }

        // Query Params
        if (jcrContentEnabled !== undefined) {
            requestContext.setQueryParam("jcr:content/enabled", ObjectSerializer.serialize(jcrContentEnabled, "boolean", ""));
        }

        // Query Params
        if (jcrContentJcrDescription !== undefined) {
            requestContext.setQueryParam("jcr:content/jcr:description", ObjectSerializer.serialize(jcrContentJcrDescription, "string", ""));
        }

        // Query Params
        if (jcrContentJcrLastModified !== undefined) {
            requestContext.setQueryParam("jcr:content/jcr:lastModified", ObjectSerializer.serialize(jcrContentJcrLastModified, "string", ""));
        }

        // Query Params
        if (jcrContentJcrLastModifiedBy !== undefined) {
            requestContext.setQueryParam("jcr:content/jcr:lastModifiedBy", ObjectSerializer.serialize(jcrContentJcrLastModifiedBy, "string", ""));
        }

        // Query Params
        if (jcrContentJcrMixinTypes !== undefined) {
            requestContext.setQueryParam("jcr:content/jcr:mixinTypes", ObjectSerializer.serialize(jcrContentJcrMixinTypes, "string", ""));
        }

        // Query Params
        if (jcrContentJcrTitle !== undefined) {
            requestContext.setQueryParam("jcr:content/jcr:title", ObjectSerializer.serialize(jcrContentJcrTitle, "string", ""));
        }

        // Query Params
        if (jcrContentLogLevel !== undefined) {
            requestContext.setQueryParam("jcr:content/logLevel", ObjectSerializer.serialize(jcrContentLogLevel, "string", ""));
        }

        // Query Params
        if (jcrContentNoStatusUpdate !== undefined) {
            requestContext.setQueryParam("jcr:content/noStatusUpdate", ObjectSerializer.serialize(jcrContentNoStatusUpdate, "boolean", ""));
        }

        // Query Params
        if (jcrContentNoVersioning !== undefined) {
            requestContext.setQueryParam("jcr:content/noVersioning", ObjectSerializer.serialize(jcrContentNoVersioning, "boolean", ""));
        }

        // Query Params
        if (jcrContentProtocolConnectTimeout !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolConnectTimeout", ObjectSerializer.serialize(jcrContentProtocolConnectTimeout, "number", ""));
        }

        // Query Params
        if (jcrContentProtocolHTTPConnectionClosed !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolHTTPConnectionClosed", ObjectSerializer.serialize(jcrContentProtocolHTTPConnectionClosed, "boolean", ""));
        }

        // Query Params
        if (jcrContentProtocolHTTPExpired !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolHTTPExpired", ObjectSerializer.serialize(jcrContentProtocolHTTPExpired, "string", ""));
        }

        // Query Params
        if (jcrContentProtocolHTTPHeaders !== undefined) {
            const serializedParams = ObjectSerializer.serialize(jcrContentProtocolHTTPHeaders, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("jcr:content/protocolHTTPHeaders", serializedParam);
            }
        }

        // Query Params
        if (jcrContentProtocolHTTPHeadersTypeHint !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolHTTPHeaders@TypeHint", ObjectSerializer.serialize(jcrContentProtocolHTTPHeadersTypeHint, "string", ""));
        }

        // Query Params
        if (jcrContentProtocolHTTPMethod !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolHTTPMethod", ObjectSerializer.serialize(jcrContentProtocolHTTPMethod, "string", ""));
        }

        // Query Params
        if (jcrContentProtocolHTTPSRelaxed !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolHTTPSRelaxed", ObjectSerializer.serialize(jcrContentProtocolHTTPSRelaxed, "boolean", ""));
        }

        // Query Params
        if (jcrContentProtocolInterface !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolInterface", ObjectSerializer.serialize(jcrContentProtocolInterface, "string", ""));
        }

        // Query Params
        if (jcrContentProtocolSocketTimeout !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolSocketTimeout", ObjectSerializer.serialize(jcrContentProtocolSocketTimeout, "number", ""));
        }

        // Query Params
        if (jcrContentProtocolVersion !== undefined) {
            requestContext.setQueryParam("jcr:content/protocolVersion", ObjectSerializer.serialize(jcrContentProtocolVersion, "string", ""));
        }

        // Query Params
        if (jcrContentProxyNTLMDomain !== undefined) {
            requestContext.setQueryParam("jcr:content/proxyNTLMDomain", ObjectSerializer.serialize(jcrContentProxyNTLMDomain, "string", ""));
        }

        // Query Params
        if (jcrContentProxyNTLMHost !== undefined) {
            requestContext.setQueryParam("jcr:content/proxyNTLMHost", ObjectSerializer.serialize(jcrContentProxyNTLMHost, "string", ""));
        }

        // Query Params
        if (jcrContentProxyHost !== undefined) {
            requestContext.setQueryParam("jcr:content/proxyHost", ObjectSerializer.serialize(jcrContentProxyHost, "string", ""));
        }

        // Query Params
        if (jcrContentProxyPassword !== undefined) {
            requestContext.setQueryParam("jcr:content/proxyPassword", ObjectSerializer.serialize(jcrContentProxyPassword, "string", ""));
        }

        // Query Params
        if (jcrContentProxyPort !== undefined) {
            requestContext.setQueryParam("jcr:content/proxyPort", ObjectSerializer.serialize(jcrContentProxyPort, "number", ""));
        }

        // Query Params
        if (jcrContentProxyUser !== undefined) {
            requestContext.setQueryParam("jcr:content/proxyUser", ObjectSerializer.serialize(jcrContentProxyUser, "string", ""));
        }

        // Query Params
        if (jcrContentQueueBatchMaxSize !== undefined) {
            requestContext.setQueryParam("jcr:content/queueBatchMaxSize", ObjectSerializer.serialize(jcrContentQueueBatchMaxSize, "number", ""));
        }

        // Query Params
        if (jcrContentQueueBatchMode !== undefined) {
            requestContext.setQueryParam("jcr:content/queueBatchMode", ObjectSerializer.serialize(jcrContentQueueBatchMode, "string", ""));
        }

        // Query Params
        if (jcrContentQueueBatchWaitTime !== undefined) {
            requestContext.setQueryParam("jcr:content/queueBatchWaitTime", ObjectSerializer.serialize(jcrContentQueueBatchWaitTime, "number", ""));
        }

        // Query Params
        if (jcrContentRetryDelay !== undefined) {
            requestContext.setQueryParam("jcr:content/retryDelay", ObjectSerializer.serialize(jcrContentRetryDelay, "string", ""));
        }

        // Query Params
        if (jcrContentReverseReplication !== undefined) {
            requestContext.setQueryParam("jcr:content/reverseReplication", ObjectSerializer.serialize(jcrContentReverseReplication, "boolean", ""));
        }

        // Query Params
        if (jcrContentSerializationType !== undefined) {
            requestContext.setQueryParam("jcr:content/serializationType", ObjectSerializer.serialize(jcrContentSerializationType, "string", ""));
        }

        // Query Params
        if (jcrContentSlingResourceType !== undefined) {
            requestContext.setQueryParam("jcr:content/sling:resourceType", ObjectSerializer.serialize(jcrContentSlingResourceType, "string", ""));
        }

        // Query Params
        if (jcrContentSsl !== undefined) {
            requestContext.setQueryParam("jcr:content/ssl", ObjectSerializer.serialize(jcrContentSsl, "string", ""));
        }

        // Query Params
        if (jcrContentTransportNTLMDomain !== undefined) {
            requestContext.setQueryParam("jcr:content/transportNTLMDomain", ObjectSerializer.serialize(jcrContentTransportNTLMDomain, "string", ""));
        }

        // Query Params
        if (jcrContentTransportNTLMHost !== undefined) {
            requestContext.setQueryParam("jcr:content/transportNTLMHost", ObjectSerializer.serialize(jcrContentTransportNTLMHost, "string", ""));
        }

        // Query Params
        if (jcrContentTransportPassword !== undefined) {
            requestContext.setQueryParam("jcr:content/transportPassword", ObjectSerializer.serialize(jcrContentTransportPassword, "string", ""));
        }

        // Query Params
        if (jcrContentTransportUri !== undefined) {
            requestContext.setQueryParam("jcr:content/transportUri", ObjectSerializer.serialize(jcrContentTransportUri, "string", ""));
        }

        // Query Params
        if (jcrContentTransportUser !== undefined) {
            requestContext.setQueryParam("jcr:content/transportUser", ObjectSerializer.serialize(jcrContentTransportUser, "string", ""));
        }

        // Query Params
        if (jcrContentTriggerDistribute !== undefined) {
            requestContext.setQueryParam("jcr:content/triggerDistribute", ObjectSerializer.serialize(jcrContentTriggerDistribute, "boolean", ""));
        }

        // Query Params
        if (jcrContentTriggerModified !== undefined) {
            requestContext.setQueryParam("jcr:content/triggerModified", ObjectSerializer.serialize(jcrContentTriggerModified, "boolean", ""));
        }

        // Query Params
        if (jcrContentTriggerOnOffTime !== undefined) {
            requestContext.setQueryParam("jcr:content/triggerOnOffTime", ObjectSerializer.serialize(jcrContentTriggerOnOffTime, "boolean", ""));
        }

        // Query Params
        if (jcrContentTriggerReceive !== undefined) {
            requestContext.setQueryParam("jcr:content/triggerReceive", ObjectSerializer.serialize(jcrContentTriggerReceive, "boolean", ""));
        }

        // Query Params
        if (jcrContentTriggerSpecific !== undefined) {
            requestContext.setQueryParam("jcr:content/triggerSpecific", ObjectSerializer.serialize(jcrContentTriggerSpecific, "boolean", ""));
        }

        // Query Params
        if (jcrContentUserId !== undefined) {
            requestContext.setQueryParam("jcr:content/userId", ObjectSerializer.serialize(jcrContentUserId, "string", ""));
        }

        // Query Params
        if (jcrPrimaryType !== undefined) {
            requestContext.setQueryParam("jcr:primaryType", ObjectSerializer.serialize(jcrPrimaryType, "string", ""));
        }

        // Query Params
        if (operation !== undefined) {
            requestContext.setQueryParam(":operation", ObjectSerializer.serialize(operation, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param intermediatePath 
     * @param authorizableId 
     * @param operation 
     * @param currentPassword 
     * @param newPassword 
     * @param rePassword 
     * @param keyPassword 
     * @param keyStorePass 
     * @param alias 
     * @param newAlias 
     * @param removeAlias 
     * @param certChain 
     * @param pk 
     * @param keyStore 
     */
    public async postAuthorizableKeystore(intermediatePath: string, authorizableId: string, operation?: string, currentPassword?: string, newPassword?: string, rePassword?: string, keyPassword?: string, keyStorePass?: string, alias?: string, newAlias?: string, removeAlias?: string, certChain?: HttpFile, pk?: HttpFile, keyStore?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'intermediatePath' is not null or undefined
        if (intermediatePath === null || intermediatePath === undefined) {
            throw new RequiredError("SlingApi", "postAuthorizableKeystore", "intermediatePath");
        }


        // verify required parameter 'authorizableId' is not null or undefined
        if (authorizableId === null || authorizableId === undefined) {
            throw new RequiredError("SlingApi", "postAuthorizableKeystore", "authorizableId");
        }














        // Path Params
        const localVarPath = '/{intermediatePath}/{authorizableId}.ks.html'
            .replace('{intermediatePath}', encodeURIComponent(String(intermediatePath)))
            .replace('{authorizableId}', encodeURIComponent(String(authorizableId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (operation !== undefined) {
            requestContext.setQueryParam(":operation", ObjectSerializer.serialize(operation, "string", ""));
        }

        // Query Params
        if (currentPassword !== undefined) {
            requestContext.setQueryParam("currentPassword", ObjectSerializer.serialize(currentPassword, "string", ""));
        }

        // Query Params
        if (newPassword !== undefined) {
            requestContext.setQueryParam("newPassword", ObjectSerializer.serialize(newPassword, "string", ""));
        }

        // Query Params
        if (rePassword !== undefined) {
            requestContext.setQueryParam("rePassword", ObjectSerializer.serialize(rePassword, "string", ""));
        }

        // Query Params
        if (keyPassword !== undefined) {
            requestContext.setQueryParam("keyPassword", ObjectSerializer.serialize(keyPassword, "string", ""));
        }

        // Query Params
        if (keyStorePass !== undefined) {
            requestContext.setQueryParam("keyStorePass", ObjectSerializer.serialize(keyStorePass, "string", ""));
        }

        // Query Params
        if (alias !== undefined) {
            requestContext.setQueryParam("alias", ObjectSerializer.serialize(alias, "string", ""));
        }

        // Query Params
        if (newAlias !== undefined) {
            requestContext.setQueryParam("newAlias", ObjectSerializer.serialize(newAlias, "string", ""));
        }

        // Query Params
        if (removeAlias !== undefined) {
            requestContext.setQueryParam("removeAlias", ObjectSerializer.serialize(removeAlias, "string", ""));
        }

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (certChain !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('cert-chain', certChain, certChain.name);
             }
        }
        if (pk !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('pk', pk, pk.name);
             }
        }
        if (keyStore !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('keyStore', keyStore, keyStore.name);
             }
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param authorizableId 
     * @param intermediatePath 
     * @param createUser 
     * @param createGroup 
     * @param repPassword 
     * @param profileGivenName 
     */
    public async postAuthorizables(authorizableId: string, intermediatePath: string, createUser?: string, createGroup?: string, repPassword?: string, profileGivenName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'authorizableId' is not null or undefined
        if (authorizableId === null || authorizableId === undefined) {
            throw new RequiredError("SlingApi", "postAuthorizables", "authorizableId");
        }


        // verify required parameter 'intermediatePath' is not null or undefined
        if (intermediatePath === null || intermediatePath === undefined) {
            throw new RequiredError("SlingApi", "postAuthorizables", "intermediatePath");
        }






        // Path Params
        const localVarPath = '/libs/granite/security/post/authorizables';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (authorizableId !== undefined) {
            requestContext.setQueryParam("authorizableId", ObjectSerializer.serialize(authorizableId, "string", ""));
        }

        // Query Params
        if (intermediatePath !== undefined) {
            requestContext.setQueryParam("intermediatePath", ObjectSerializer.serialize(intermediatePath, "string", ""));
        }

        // Query Params
        if (createUser !== undefined) {
            requestContext.setQueryParam("createUser", ObjectSerializer.serialize(createUser, "string", ""));
        }

        // Query Params
        if (createGroup !== undefined) {
            requestContext.setQueryParam("createGroup", ObjectSerializer.serialize(createGroup, "string", ""));
        }

        // Query Params
        if (repPassword !== undefined) {
            requestContext.setQueryParam("rep:password", ObjectSerializer.serialize(repPassword, "string", ""));
        }

        // Query Params
        if (profileGivenName !== undefined) {
            requestContext.setQueryParam("profile/givenName", ObjectSerializer.serialize(profileGivenName, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param keyStorePassword 
     * @param keyStorePasswordTypeHint 
     * @param serviceRanking 
     * @param serviceRankingTypeHint 
     * @param idpHttpRedirect 
     * @param idpHttpRedirectTypeHint 
     * @param createUser 
     * @param createUserTypeHint 
     * @param defaultRedirectUrl 
     * @param defaultRedirectUrlTypeHint 
     * @param userIDAttribute 
     * @param userIDAttributeTypeHint 
     * @param defaultGroups 
     * @param defaultGroupsTypeHint 
     * @param idpCertAlias 
     * @param idpCertAliasTypeHint 
     * @param addGroupMemberships 
     * @param addGroupMembershipsTypeHint 
     * @param path 
     * @param pathTypeHint 
     * @param synchronizeAttributes 
     * @param synchronizeAttributesTypeHint 
     * @param clockTolerance 
     * @param clockToleranceTypeHint 
     * @param groupMembershipAttribute 
     * @param groupMembershipAttributeTypeHint 
     * @param idpUrl 
     * @param idpUrlTypeHint 
     * @param logoutUrl 
     * @param logoutUrlTypeHint 
     * @param serviceProviderEntityId 
     * @param serviceProviderEntityIdTypeHint 
     * @param assertionConsumerServiceURL 
     * @param assertionConsumerServiceURLTypeHint 
     * @param handleLogout 
     * @param handleLogoutTypeHint 
     * @param spPrivateKeyAlias 
     * @param spPrivateKeyAliasTypeHint 
     * @param useEncryption 
     * @param useEncryptionTypeHint 
     * @param nameIdFormat 
     * @param nameIdFormatTypeHint 
     * @param digestMethod 
     * @param digestMethodTypeHint 
     * @param signatureMethod 
     * @param signatureMethodTypeHint 
     * @param userIntermediatePath 
     * @param userIntermediatePathTypeHint 
     */
    public async postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword?: string, keyStorePasswordTypeHint?: string, serviceRanking?: number, serviceRankingTypeHint?: string, idpHttpRedirect?: boolean, idpHttpRedirectTypeHint?: string, createUser?: boolean, createUserTypeHint?: string, defaultRedirectUrl?: string, defaultRedirectUrlTypeHint?: string, userIDAttribute?: string, userIDAttributeTypeHint?: string, defaultGroups?: Array<string>, defaultGroupsTypeHint?: string, idpCertAlias?: string, idpCertAliasTypeHint?: string, addGroupMemberships?: boolean, addGroupMembershipsTypeHint?: string, path?: Array<string>, pathTypeHint?: string, synchronizeAttributes?: Array<string>, synchronizeAttributesTypeHint?: string, clockTolerance?: number, clockToleranceTypeHint?: string, groupMembershipAttribute?: string, groupMembershipAttributeTypeHint?: string, idpUrl?: string, idpUrlTypeHint?: string, logoutUrl?: string, logoutUrlTypeHint?: string, serviceProviderEntityId?: string, serviceProviderEntityIdTypeHint?: string, assertionConsumerServiceURL?: string, assertionConsumerServiceURLTypeHint?: string, handleLogout?: boolean, handleLogoutTypeHint?: string, spPrivateKeyAlias?: string, spPrivateKeyAliasTypeHint?: string, useEncryption?: boolean, useEncryptionTypeHint?: string, nameIdFormat?: string, nameIdFormatTypeHint?: string, digestMethod?: string, digestMethodTypeHint?: string, signatureMethod?: string, signatureMethodTypeHint?: string, userIntermediatePath?: string, userIntermediatePathTypeHint?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

















































        // Path Params
        const localVarPath = '/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (keyStorePassword !== undefined) {
            requestContext.setQueryParam("keyStorePassword", ObjectSerializer.serialize(keyStorePassword, "string", ""));
        }

        // Query Params
        if (keyStorePasswordTypeHint !== undefined) {
            requestContext.setQueryParam("keyStorePassword@TypeHint", ObjectSerializer.serialize(keyStorePasswordTypeHint, "string", ""));
        }

        // Query Params
        if (serviceRanking !== undefined) {
            requestContext.setQueryParam("service.ranking", ObjectSerializer.serialize(serviceRanking, "number", ""));
        }

        // Query Params
        if (serviceRankingTypeHint !== undefined) {
            requestContext.setQueryParam("service.ranking@TypeHint", ObjectSerializer.serialize(serviceRankingTypeHint, "string", ""));
        }

        // Query Params
        if (idpHttpRedirect !== undefined) {
            requestContext.setQueryParam("idpHttpRedirect", ObjectSerializer.serialize(idpHttpRedirect, "boolean", ""));
        }

        // Query Params
        if (idpHttpRedirectTypeHint !== undefined) {
            requestContext.setQueryParam("idpHttpRedirect@TypeHint", ObjectSerializer.serialize(idpHttpRedirectTypeHint, "string", ""));
        }

        // Query Params
        if (createUser !== undefined) {
            requestContext.setQueryParam("createUser", ObjectSerializer.serialize(createUser, "boolean", ""));
        }

        // Query Params
        if (createUserTypeHint !== undefined) {
            requestContext.setQueryParam("createUser@TypeHint", ObjectSerializer.serialize(createUserTypeHint, "string", ""));
        }

        // Query Params
        if (defaultRedirectUrl !== undefined) {
            requestContext.setQueryParam("defaultRedirectUrl", ObjectSerializer.serialize(defaultRedirectUrl, "string", ""));
        }

        // Query Params
        if (defaultRedirectUrlTypeHint !== undefined) {
            requestContext.setQueryParam("defaultRedirectUrl@TypeHint", ObjectSerializer.serialize(defaultRedirectUrlTypeHint, "string", ""));
        }

        // Query Params
        if (userIDAttribute !== undefined) {
            requestContext.setQueryParam("userIDAttribute", ObjectSerializer.serialize(userIDAttribute, "string", ""));
        }

        // Query Params
        if (userIDAttributeTypeHint !== undefined) {
            requestContext.setQueryParam("userIDAttribute@TypeHint", ObjectSerializer.serialize(userIDAttributeTypeHint, "string", ""));
        }

        // Query Params
        if (defaultGroups !== undefined) {
            const serializedParams = ObjectSerializer.serialize(defaultGroups, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("defaultGroups", serializedParam);
            }
        }

        // Query Params
        if (defaultGroupsTypeHint !== undefined) {
            requestContext.setQueryParam("defaultGroups@TypeHint", ObjectSerializer.serialize(defaultGroupsTypeHint, "string", ""));
        }

        // Query Params
        if (idpCertAlias !== undefined) {
            requestContext.setQueryParam("idpCertAlias", ObjectSerializer.serialize(idpCertAlias, "string", ""));
        }

        // Query Params
        if (idpCertAliasTypeHint !== undefined) {
            requestContext.setQueryParam("idpCertAlias@TypeHint", ObjectSerializer.serialize(idpCertAliasTypeHint, "string", ""));
        }

        // Query Params
        if (addGroupMemberships !== undefined) {
            requestContext.setQueryParam("addGroupMemberships", ObjectSerializer.serialize(addGroupMemberships, "boolean", ""));
        }

        // Query Params
        if (addGroupMembershipsTypeHint !== undefined) {
            requestContext.setQueryParam("addGroupMemberships@TypeHint", ObjectSerializer.serialize(addGroupMembershipsTypeHint, "string", ""));
        }

        // Query Params
        if (path !== undefined) {
            const serializedParams = ObjectSerializer.serialize(path, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("path", serializedParam);
            }
        }

        // Query Params
        if (pathTypeHint !== undefined) {
            requestContext.setQueryParam("path@TypeHint", ObjectSerializer.serialize(pathTypeHint, "string", ""));
        }

        // Query Params
        if (synchronizeAttributes !== undefined) {
            const serializedParams = ObjectSerializer.serialize(synchronizeAttributes, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("synchronizeAttributes", serializedParam);
            }
        }

        // Query Params
        if (synchronizeAttributesTypeHint !== undefined) {
            requestContext.setQueryParam("synchronizeAttributes@TypeHint", ObjectSerializer.serialize(synchronizeAttributesTypeHint, "string", ""));
        }

        // Query Params
        if (clockTolerance !== undefined) {
            requestContext.setQueryParam("clockTolerance", ObjectSerializer.serialize(clockTolerance, "number", ""));
        }

        // Query Params
        if (clockToleranceTypeHint !== undefined) {
            requestContext.setQueryParam("clockTolerance@TypeHint", ObjectSerializer.serialize(clockToleranceTypeHint, "string", ""));
        }

        // Query Params
        if (groupMembershipAttribute !== undefined) {
            requestContext.setQueryParam("groupMembershipAttribute", ObjectSerializer.serialize(groupMembershipAttribute, "string", ""));
        }

        // Query Params
        if (groupMembershipAttributeTypeHint !== undefined) {
            requestContext.setQueryParam("groupMembershipAttribute@TypeHint", ObjectSerializer.serialize(groupMembershipAttributeTypeHint, "string", ""));
        }

        // Query Params
        if (idpUrl !== undefined) {
            requestContext.setQueryParam("idpUrl", ObjectSerializer.serialize(idpUrl, "string", ""));
        }

        // Query Params
        if (idpUrlTypeHint !== undefined) {
            requestContext.setQueryParam("idpUrl@TypeHint", ObjectSerializer.serialize(idpUrlTypeHint, "string", ""));
        }

        // Query Params
        if (logoutUrl !== undefined) {
            requestContext.setQueryParam("logoutUrl", ObjectSerializer.serialize(logoutUrl, "string", ""));
        }

        // Query Params
        if (logoutUrlTypeHint !== undefined) {
            requestContext.setQueryParam("logoutUrl@TypeHint", ObjectSerializer.serialize(logoutUrlTypeHint, "string", ""));
        }

        // Query Params
        if (serviceProviderEntityId !== undefined) {
            requestContext.setQueryParam("serviceProviderEntityId", ObjectSerializer.serialize(serviceProviderEntityId, "string", ""));
        }

        // Query Params
        if (serviceProviderEntityIdTypeHint !== undefined) {
            requestContext.setQueryParam("serviceProviderEntityId@TypeHint", ObjectSerializer.serialize(serviceProviderEntityIdTypeHint, "string", ""));
        }

        // Query Params
        if (assertionConsumerServiceURL !== undefined) {
            requestContext.setQueryParam("assertionConsumerServiceURL", ObjectSerializer.serialize(assertionConsumerServiceURL, "string", ""));
        }

        // Query Params
        if (assertionConsumerServiceURLTypeHint !== undefined) {
            requestContext.setQueryParam("assertionConsumerServiceURL@TypeHint", ObjectSerializer.serialize(assertionConsumerServiceURLTypeHint, "string", ""));
        }

        // Query Params
        if (handleLogout !== undefined) {
            requestContext.setQueryParam("handleLogout", ObjectSerializer.serialize(handleLogout, "boolean", ""));
        }

        // Query Params
        if (handleLogoutTypeHint !== undefined) {
            requestContext.setQueryParam("handleLogout@TypeHint", ObjectSerializer.serialize(handleLogoutTypeHint, "string", ""));
        }

        // Query Params
        if (spPrivateKeyAlias !== undefined) {
            requestContext.setQueryParam("spPrivateKeyAlias", ObjectSerializer.serialize(spPrivateKeyAlias, "string", ""));
        }

        // Query Params
        if (spPrivateKeyAliasTypeHint !== undefined) {
            requestContext.setQueryParam("spPrivateKeyAlias@TypeHint", ObjectSerializer.serialize(spPrivateKeyAliasTypeHint, "string", ""));
        }

        // Query Params
        if (useEncryption !== undefined) {
            requestContext.setQueryParam("useEncryption", ObjectSerializer.serialize(useEncryption, "boolean", ""));
        }

        // Query Params
        if (useEncryptionTypeHint !== undefined) {
            requestContext.setQueryParam("useEncryption@TypeHint", ObjectSerializer.serialize(useEncryptionTypeHint, "string", ""));
        }

        // Query Params
        if (nameIdFormat !== undefined) {
            requestContext.setQueryParam("nameIdFormat", ObjectSerializer.serialize(nameIdFormat, "string", ""));
        }

        // Query Params
        if (nameIdFormatTypeHint !== undefined) {
            requestContext.setQueryParam("nameIdFormat@TypeHint", ObjectSerializer.serialize(nameIdFormatTypeHint, "string", ""));
        }

        // Query Params
        if (digestMethod !== undefined) {
            requestContext.setQueryParam("digestMethod", ObjectSerializer.serialize(digestMethod, "string", ""));
        }

        // Query Params
        if (digestMethodTypeHint !== undefined) {
            requestContext.setQueryParam("digestMethod@TypeHint", ObjectSerializer.serialize(digestMethodTypeHint, "string", ""));
        }

        // Query Params
        if (signatureMethod !== undefined) {
            requestContext.setQueryParam("signatureMethod", ObjectSerializer.serialize(signatureMethod, "string", ""));
        }

        // Query Params
        if (signatureMethodTypeHint !== undefined) {
            requestContext.setQueryParam("signatureMethod@TypeHint", ObjectSerializer.serialize(signatureMethodTypeHint, "string", ""));
        }

        // Query Params
        if (userIntermediatePath !== undefined) {
            requestContext.setQueryParam("userIntermediatePath", ObjectSerializer.serialize(userIntermediatePath, "string", ""));
        }

        // Query Params
        if (userIntermediatePathTypeHint !== undefined) {
            requestContext.setQueryParam("userIntermediatePath@TypeHint", ObjectSerializer.serialize(userIntermediatePathTypeHint, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param orgApacheFelixHttpsNio 
     * @param orgApacheFelixHttpsNioTypeHint 
     * @param orgApacheFelixHttpsKeystore 
     * @param orgApacheFelixHttpsKeystoreTypeHint 
     * @param orgApacheFelixHttpsKeystorePassword 
     * @param orgApacheFelixHttpsKeystorePasswordTypeHint 
     * @param orgApacheFelixHttpsKeystoreKey 
     * @param orgApacheFelixHttpsKeystoreKeyTypeHint 
     * @param orgApacheFelixHttpsKeystoreKeyPassword 
     * @param orgApacheFelixHttpsKeystoreKeyPasswordTypeHint 
     * @param orgApacheFelixHttpsTruststore 
     * @param orgApacheFelixHttpsTruststoreTypeHint 
     * @param orgApacheFelixHttpsTruststorePassword 
     * @param orgApacheFelixHttpsTruststorePasswordTypeHint 
     * @param orgApacheFelixHttpsClientcertificate 
     * @param orgApacheFelixHttpsClientcertificateTypeHint 
     * @param orgApacheFelixHttpsEnable 
     * @param orgApacheFelixHttpsEnableTypeHint 
     * @param orgOsgiServiceHttpPortSecure 
     * @param orgOsgiServiceHttpPortSecureTypeHint 
     */
    public async postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio?: boolean, orgApacheFelixHttpsNioTypeHint?: string, orgApacheFelixHttpsKeystore?: string, orgApacheFelixHttpsKeystoreTypeHint?: string, orgApacheFelixHttpsKeystorePassword?: string, orgApacheFelixHttpsKeystorePasswordTypeHint?: string, orgApacheFelixHttpsKeystoreKey?: string, orgApacheFelixHttpsKeystoreKeyTypeHint?: string, orgApacheFelixHttpsKeystoreKeyPassword?: string, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint?: string, orgApacheFelixHttpsTruststore?: string, orgApacheFelixHttpsTruststoreTypeHint?: string, orgApacheFelixHttpsTruststorePassword?: string, orgApacheFelixHttpsTruststorePasswordTypeHint?: string, orgApacheFelixHttpsClientcertificate?: string, orgApacheFelixHttpsClientcertificateTypeHint?: string, orgApacheFelixHttpsEnable?: boolean, orgApacheFelixHttpsEnableTypeHint?: string, orgOsgiServiceHttpPortSecure?: string, orgOsgiServiceHttpPortSecureTypeHint?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





















        // Path Params
        const localVarPath = '/apps/system/config/org.apache.felix.http';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (orgApacheFelixHttpsNio !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.nio", ObjectSerializer.serialize(orgApacheFelixHttpsNio, "boolean", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsNioTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.nio@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsNioTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystore !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore", ObjectSerializer.serialize(orgApacheFelixHttpsKeystore, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystoreTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsKeystoreTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystorePassword !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore.password", ObjectSerializer.serialize(orgApacheFelixHttpsKeystorePassword, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystorePasswordTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore.password@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsKeystorePasswordTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystoreKey !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore.key", ObjectSerializer.serialize(orgApacheFelixHttpsKeystoreKey, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystoreKeyTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore.key@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsKeystoreKeyTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystoreKeyPassword !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore.key.password", ObjectSerializer.serialize(orgApacheFelixHttpsKeystoreKeyPassword, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsKeystoreKeyPasswordTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.keystore.key.password@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsTruststore !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.truststore", ObjectSerializer.serialize(orgApacheFelixHttpsTruststore, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsTruststoreTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.truststore@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsTruststoreTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsTruststorePassword !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.truststore.password", ObjectSerializer.serialize(orgApacheFelixHttpsTruststorePassword, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsTruststorePasswordTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.truststore.password@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsTruststorePasswordTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsClientcertificate !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.clientcertificate", ObjectSerializer.serialize(orgApacheFelixHttpsClientcertificate, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsClientcertificateTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.clientcertificate@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsClientcertificateTypeHint, "string", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsEnable !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.enable", ObjectSerializer.serialize(orgApacheFelixHttpsEnable, "boolean", ""));
        }

        // Query Params
        if (orgApacheFelixHttpsEnableTypeHint !== undefined) {
            requestContext.setQueryParam("org.apache.felix.https.enable@TypeHint", ObjectSerializer.serialize(orgApacheFelixHttpsEnableTypeHint, "string", ""));
        }

        // Query Params
        if (orgOsgiServiceHttpPortSecure !== undefined) {
            requestContext.setQueryParam("org.osgi.service.http.port.secure", ObjectSerializer.serialize(orgOsgiServiceHttpPortSecure, "string", ""));
        }

        // Query Params
        if (orgOsgiServiceHttpPortSecureTypeHint !== undefined) {
            requestContext.setQueryParam("org.osgi.service.http.port.secure@TypeHint", ObjectSerializer.serialize(orgOsgiServiceHttpPortSecureTypeHint, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param proxyHost 
     * @param proxyHostTypeHint 
     * @param proxyPort 
     * @param proxyPortTypeHint 
     * @param proxyExceptions 
     * @param proxyExceptionsTypeHint 
     * @param proxyEnabled 
     * @param proxyEnabledTypeHint 
     * @param proxyUser 
     * @param proxyUserTypeHint 
     * @param proxyPassword 
     * @param proxyPasswordTypeHint 
     */
    public async postConfigApacheHttpComponentsProxyConfiguration(proxyHost?: string, proxyHostTypeHint?: string, proxyPort?: number, proxyPortTypeHint?: string, proxyExceptions?: Array<string>, proxyExceptionsTypeHint?: string, proxyEnabled?: boolean, proxyEnabledTypeHint?: string, proxyUser?: string, proxyUserTypeHint?: string, proxyPassword?: string, proxyPasswordTypeHint?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;













        // Path Params
        const localVarPath = '/apps/system/config/org.apache.http.proxyconfigurator.config';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (proxyHost !== undefined) {
            requestContext.setQueryParam("proxy.host", ObjectSerializer.serialize(proxyHost, "string", ""));
        }

        // Query Params
        if (proxyHostTypeHint !== undefined) {
            requestContext.setQueryParam("proxy.host@TypeHint", ObjectSerializer.serialize(proxyHostTypeHint, "string", ""));
        }

        // Query Params
        if (proxyPort !== undefined) {
            requestContext.setQueryParam("proxy.port", ObjectSerializer.serialize(proxyPort, "number", ""));
        }

        // Query Params
        if (proxyPortTypeHint !== undefined) {
            requestContext.setQueryParam("proxy.port@TypeHint", ObjectSerializer.serialize(proxyPortTypeHint, "string", ""));
        }

        // Query Params
        if (proxyExceptions !== undefined) {
            const serializedParams = ObjectSerializer.serialize(proxyExceptions, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("proxy.exceptions", serializedParam);
            }
        }

        // Query Params
        if (proxyExceptionsTypeHint !== undefined) {
            requestContext.setQueryParam("proxy.exceptions@TypeHint", ObjectSerializer.serialize(proxyExceptionsTypeHint, "string", ""));
        }

        // Query Params
        if (proxyEnabled !== undefined) {
            requestContext.setQueryParam("proxy.enabled", ObjectSerializer.serialize(proxyEnabled, "boolean", ""));
        }

        // Query Params
        if (proxyEnabledTypeHint !== undefined) {
            requestContext.setQueryParam("proxy.enabled@TypeHint", ObjectSerializer.serialize(proxyEnabledTypeHint, "string", ""));
        }

        // Query Params
        if (proxyUser !== undefined) {
            requestContext.setQueryParam("proxy.user", ObjectSerializer.serialize(proxyUser, "string", ""));
        }

        // Query Params
        if (proxyUserTypeHint !== undefined) {
            requestContext.setQueryParam("proxy.user@TypeHint", ObjectSerializer.serialize(proxyUserTypeHint, "string", ""));
        }

        // Query Params
        if (proxyPassword !== undefined) {
            requestContext.setQueryParam("proxy.password", ObjectSerializer.serialize(proxyPassword, "string", ""));
        }

        // Query Params
        if (proxyPasswordTypeHint !== undefined) {
            requestContext.setQueryParam("proxy.password@TypeHint", ObjectSerializer.serialize(proxyPasswordTypeHint, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param alias 
     * @param aliasTypeHint 
     * @param davCreateAbsoluteUri 
     * @param davCreateAbsoluteUriTypeHint 
     */
    public async postConfigApacheSlingDavExServlet(alias?: string, aliasTypeHint?: string, davCreateAbsoluteUri?: boolean, davCreateAbsoluteUriTypeHint?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (alias !== undefined) {
            requestContext.setQueryParam("alias", ObjectSerializer.serialize(alias, "string", ""));
        }

        // Query Params
        if (aliasTypeHint !== undefined) {
            requestContext.setQueryParam("alias@TypeHint", ObjectSerializer.serialize(aliasTypeHint, "string", ""));
        }

        // Query Params
        if (davCreateAbsoluteUri !== undefined) {
            requestContext.setQueryParam("dav.create-absolute-uri", ObjectSerializer.serialize(davCreateAbsoluteUri, "boolean", ""));
        }

        // Query Params
        if (davCreateAbsoluteUriTypeHint !== undefined) {
            requestContext.setQueryParam("dav.create-absolute-uri@TypeHint", ObjectSerializer.serialize(davCreateAbsoluteUriTypeHint, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param jsonMaximumresults 
     * @param jsonMaximumresultsTypeHint 
     * @param enableHtml 
     * @param enableHtmlTypeHint 
     * @param enableTxt 
     * @param enableTxtTypeHint 
     * @param enableXml 
     * @param enableXmlTypeHint 
     */
    public async postConfigApacheSlingGetServlet(jsonMaximumresults?: string, jsonMaximumresultsTypeHint?: string, enableHtml?: boolean, enableHtmlTypeHint?: string, enableTxt?: boolean, enableTxtTypeHint?: string, enableXml?: boolean, enableXmlTypeHint?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;









        // Path Params
        const localVarPath = '/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (jsonMaximumresults !== undefined) {
            requestContext.setQueryParam("json.maximumresults", ObjectSerializer.serialize(jsonMaximumresults, "string", ""));
        }

        // Query Params
        if (jsonMaximumresultsTypeHint !== undefined) {
            requestContext.setQueryParam("json.maximumresults@TypeHint", ObjectSerializer.serialize(jsonMaximumresultsTypeHint, "string", ""));
        }

        // Query Params
        if (enableHtml !== undefined) {
            requestContext.setQueryParam("enable.html", ObjectSerializer.serialize(enableHtml, "boolean", ""));
        }

        // Query Params
        if (enableHtmlTypeHint !== undefined) {
            requestContext.setQueryParam("enable.html@TypeHint", ObjectSerializer.serialize(enableHtmlTypeHint, "string", ""));
        }

        // Query Params
        if (enableTxt !== undefined) {
            requestContext.setQueryParam("enable.txt", ObjectSerializer.serialize(enableTxt, "boolean", ""));
        }

        // Query Params
        if (enableTxtTypeHint !== undefined) {
            requestContext.setQueryParam("enable.txt@TypeHint", ObjectSerializer.serialize(enableTxtTypeHint, "string", ""));
        }

        // Query Params
        if (enableXml !== undefined) {
            requestContext.setQueryParam("enable.xml", ObjectSerializer.serialize(enableXml, "boolean", ""));
        }

        // Query Params
        if (enableXmlTypeHint !== undefined) {
            requestContext.setQueryParam("enable.xml@TypeHint", ObjectSerializer.serialize(enableXmlTypeHint, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param allowEmpty 
     * @param allowEmptyTypeHint 
     * @param allowHosts 
     * @param allowHostsTypeHint 
     * @param allowHostsRegexp 
     * @param allowHostsRegexpTypeHint 
     * @param filterMethods 
     * @param filterMethodsTypeHint 
     */
    public async postConfigApacheSlingReferrerFilter(allowEmpty?: boolean, allowEmptyTypeHint?: string, allowHosts?: string, allowHostsTypeHint?: string, allowHostsRegexp?: string, allowHostsRegexpTypeHint?: string, filterMethods?: string, filterMethodsTypeHint?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;









        // Path Params
        const localVarPath = '/apps/system/config/org.apache.sling.security.impl.ReferrerFilter';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (allowEmpty !== undefined) {
            requestContext.setQueryParam("allow.empty", ObjectSerializer.serialize(allowEmpty, "boolean", ""));
        }

        // Query Params
        if (allowEmptyTypeHint !== undefined) {
            requestContext.setQueryParam("allow.empty@TypeHint", ObjectSerializer.serialize(allowEmptyTypeHint, "string", ""));
        }

        // Query Params
        if (allowHosts !== undefined) {
            requestContext.setQueryParam("allow.hosts", ObjectSerializer.serialize(allowHosts, "string", ""));
        }

        // Query Params
        if (allowHostsTypeHint !== undefined) {
            requestContext.setQueryParam("allow.hosts@TypeHint", ObjectSerializer.serialize(allowHostsTypeHint, "string", ""));
        }

        // Query Params
        if (allowHostsRegexp !== undefined) {
            requestContext.setQueryParam("allow.hosts.regexp", ObjectSerializer.serialize(allowHostsRegexp, "string", ""));
        }

        // Query Params
        if (allowHostsRegexpTypeHint !== undefined) {
            requestContext.setQueryParam("allow.hosts.regexp@TypeHint", ObjectSerializer.serialize(allowHostsRegexpTypeHint, "string", ""));
        }

        // Query Params
        if (filterMethods !== undefined) {
            requestContext.setQueryParam("filter.methods", ObjectSerializer.serialize(filterMethods, "string", ""));
        }

        // Query Params
        if (filterMethodsTypeHint !== undefined) {
            requestContext.setQueryParam("filter.methods@TypeHint", ObjectSerializer.serialize(filterMethodsTypeHint, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param configNodeName 
     */
    public async postConfigProperty(configNodeName: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'configNodeName' is not null or undefined
        if (configNodeName === null || configNodeName === undefined) {
            throw new RequiredError("SlingApi", "postConfigProperty", "configNodeName");
        }


        // Path Params
        const localVarPath = '/apps/system/config/{configNodeName}'
            .replace('{configNodeName}', encodeURIComponent(String(configNodeName)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param path 
     * @param name 
     * @param operation 
     * @param deleteAuthorizable 
     * @param file 
     */
    public async postNode(path: string, name: string, operation?: string, deleteAuthorizable?: string, file?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "postNode", "path");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "postNode", "name");
        }





        // Path Params
        const localVarPath = '/{path}/{name}'
            .replace('{path}', encodeURIComponent(String(path)))
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (operation !== undefined) {
            requestContext.setQueryParam(":operation", ObjectSerializer.serialize(operation, "string", ""));
        }

        // Query Params
        if (deleteAuthorizable !== undefined) {
            requestContext.setQueryParam("deleteAuthorizable", ObjectSerializer.serialize(deleteAuthorizable, "string", ""));
        }

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (file !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('file', file, file.name);
             }
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param path 
     * @param name 
     * @param addMembers 
     */
    public async postNodeRw(path: string, name: string, addMembers?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "postNodeRw", "path");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "postNodeRw", "name");
        }



        // Path Params
        const localVarPath = '/{path}/{name}.rw.html'
            .replace('{path}', encodeURIComponent(String(path)))
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (addMembers !== undefined) {
            requestContext.setQueryParam("addMembers", ObjectSerializer.serialize(addMembers, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param path 
     * @param jcrPrimaryType 
     * @param name 
     */
    public async postPath(path: string, jcrPrimaryType: string, name: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "postPath", "path");
        }


        // verify required parameter 'jcrPrimaryType' is not null or undefined
        if (jcrPrimaryType === null || jcrPrimaryType === undefined) {
            throw new RequiredError("SlingApi", "postPath", "jcrPrimaryType");
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("SlingApi", "postPath", "name");
        }


        // Path Params
        const localVarPath = '/{path}/'
            .replace('{path}', encodeURIComponent(String(path)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (jcrPrimaryType !== undefined) {
            requestContext.setQueryParam("jcr:primaryType", ObjectSerializer.serialize(jcrPrimaryType, "string", ""));
        }

        // Query Params
        if (name !== undefined) {
            requestContext.setQueryParam(":name", ObjectSerializer.serialize(name, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param path 
     * @param pLimit 
     * @param _1property 
     * @param _1propertyValue 
     */
    public async postQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "postQuery", "path");
        }


        // verify required parameter 'pLimit' is not null or undefined
        if (pLimit === null || pLimit === undefined) {
            throw new RequiredError("SlingApi", "postQuery", "pLimit");
        }


        // verify required parameter '_1property' is not null or undefined
        if (_1property === null || _1property === undefined) {
            throw new RequiredError("SlingApi", "postQuery", "_1property");
        }


        // verify required parameter '_1propertyValue' is not null or undefined
        if (_1propertyValue === null || _1propertyValue === undefined) {
            throw new RequiredError("SlingApi", "postQuery", "_1propertyValue");
        }


        // Path Params
        const localVarPath = '/bin/querybuilder.json';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (path !== undefined) {
            requestContext.setQueryParam("path", ObjectSerializer.serialize(path, "string", ""));
        }

        // Query Params
        if (pLimit !== undefined) {
            requestContext.setQueryParam("p.limit", ObjectSerializer.serialize(pLimit, "number", ""));
        }

        // Query Params
        if (_1property !== undefined) {
            requestContext.setQueryParam("1_property", ObjectSerializer.serialize(_1property, "string", ""));
        }

        // Query Params
        if (_1propertyValue !== undefined) {
            requestContext.setQueryParam("1_property.value", ObjectSerializer.serialize(_1propertyValue, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param ignoredeactivated 
     * @param onlymodified 
     * @param path 
     * @param cmd 
     */
    public async postTreeActivation(ignoredeactivated: boolean, onlymodified: boolean, path: string, cmd: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'ignoredeactivated' is not null or undefined
        if (ignoredeactivated === null || ignoredeactivated === undefined) {
            throw new RequiredError("SlingApi", "postTreeActivation", "ignoredeactivated");
        }


        // verify required parameter 'onlymodified' is not null or undefined
        if (onlymodified === null || onlymodified === undefined) {
            throw new RequiredError("SlingApi", "postTreeActivation", "onlymodified");
        }


        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new RequiredError("SlingApi", "postTreeActivation", "path");
        }


        // verify required parameter 'cmd' is not null or undefined
        if (cmd === null || cmd === undefined) {
            throw new RequiredError("SlingApi", "postTreeActivation", "cmd");
        }


        // Path Params
        const localVarPath = '/libs/replication/treeactivation.html';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (ignoredeactivated !== undefined) {
            requestContext.setQueryParam("ignoredeactivated", ObjectSerializer.serialize(ignoredeactivated, "boolean", ""));
        }

        // Query Params
        if (onlymodified !== undefined) {
            requestContext.setQueryParam("onlymodified", ObjectSerializer.serialize(onlymodified, "boolean", ""));
        }

        // Query Params
        if (path !== undefined) {
            requestContext.setQueryParam("path", ObjectSerializer.serialize(path, "string", ""));
        }

        // Query Params
        if (cmd !== undefined) {
            requestContext.setQueryParam("cmd", ObjectSerializer.serialize(cmd, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param operation 
     * @param newPassword 
     * @param rePassword 
     * @param keyStoreType 
     * @param removeAlias 
     * @param certificate 
     */
    public async postTruststore(operation?: string, newPassword?: string, rePassword?: string, keyStoreType?: string, removeAlias?: string, certificate?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;







        // Path Params
        const localVarPath = '/libs/granite/security/post/truststore';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (operation !== undefined) {
            requestContext.setQueryParam(":operation", ObjectSerializer.serialize(operation, "string", ""));
        }

        // Query Params
        if (newPassword !== undefined) {
            requestContext.setQueryParam("newPassword", ObjectSerializer.serialize(newPassword, "string", ""));
        }

        // Query Params
        if (rePassword !== undefined) {
            requestContext.setQueryParam("rePassword", ObjectSerializer.serialize(rePassword, "string", ""));
        }

        // Query Params
        if (keyStoreType !== undefined) {
            requestContext.setQueryParam("keyStoreType", ObjectSerializer.serialize(keyStoreType, "string", ""));
        }

        // Query Params
        if (removeAlias !== undefined) {
            requestContext.setQueryParam("removeAlias", ObjectSerializer.serialize(removeAlias, "string", ""));
        }

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (certificate !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('certificate', certificate, certificate.name);
             }
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @param truststoreP12 
     */
    public async postTruststorePKCS12(truststoreP12?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/etc/truststore';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (truststoreP12 !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('truststore.p12', truststoreP12, truststoreP12.name);
             }
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["aemAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class SlingApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteAgent
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteAgentWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteNode
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteNodeWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getAgent
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getAgentWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getAgents
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getAgentsWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getAuthorizableKeystore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getAuthorizableKeystoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo<KeystoreInfo >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: KeystoreInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "KeystoreInfo", ""
            ) as KeystoreInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: KeystoreInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "KeystoreInfo", ""
            ) as KeystoreInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getKeystore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getKeystoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: HttpFile = await response.getBodyAsFile() as any as ;
            throw new ApiException<HttpFile>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getNode
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getNodeWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getPackage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getPackageWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: HttpFile = await response.getBodyAsFile() as any as ;
            throw new ApiException<HttpFile>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getPackageFilter
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getPackageFilterWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getQueryWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getTruststore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getTruststoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: HttpFile = await response.getBodyAsFile() as any as ;
            throw new ApiException<HttpFile>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getTruststoreInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getTruststoreInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<TruststoreInfo >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: TruststoreInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "TruststoreInfo", ""
            ) as TruststoreInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: TruststoreInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "TruststoreInfo", ""
            ) as TruststoreInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postAgent
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postAgentWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postAuthorizableKeystore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postAuthorizableKeystoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo<KeystoreInfo >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: KeystoreInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "KeystoreInfo", ""
            ) as KeystoreInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: KeystoreInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "KeystoreInfo", ""
            ) as KeystoreInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postAuthorizables
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postAuthorizablesWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postConfigAdobeGraniteSamlAuthenticationHandler
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postConfigApacheFelixJettyBasedHttpService
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postConfigApacheHttpComponentsProxyConfiguration
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postConfigApacheSlingDavExServlet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postConfigApacheSlingDavExServletWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postConfigApacheSlingGetServlet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postConfigApacheSlingGetServletWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postConfigApacheSlingReferrerFilter
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postConfigApacheSlingReferrerFilterWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postConfigProperty
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postConfigPropertyWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postNode
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postNodeWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postNodeRw
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postNodeRwWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postPath
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postPathWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postQueryWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postTreeActivation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postTreeActivationWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Default response", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postTruststore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postTruststoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postTruststorePKCS12
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postTruststorePKCS12WithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
