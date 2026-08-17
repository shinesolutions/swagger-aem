// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { BundleInfo } from '../models/BundleInfo';
import { SamlConfigurationInfo } from '../models/SamlConfigurationInfo';

/**
 * no description
 */
export class ConsoleApiRequestFactory extends BaseAPIRequestFactory {

    /**
     */
    public async getAemProductInfo(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/system/console/status-productinfo.json';

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
     * @param name 
     */
    public async getBundleInfo(name: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("ConsoleApi", "getBundleInfo", "name");
        }


        // Path Params
        const localVarPath = '/system/console/bundles/{name}.json'
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
     */
    public async getConfigMgr(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/system/console/configMgr';

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
     * @param name 
     * @param action 
     */
    public async postBundle(name: string, action: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError("ConsoleApi", "postBundle", "name");
        }


        // verify required parameter 'action' is not null or undefined
        if (action === null || action === undefined) {
            throw new RequiredError("ConsoleApi", "postBundle", "action");
        }


        // Path Params
        const localVarPath = '/system/console/bundles/{name}'
            .replace('{name}', encodeURIComponent(String(name)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (action !== undefined) {
            requestContext.setQueryParam("action", ObjectSerializer.serialize(action, "string", ""));
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
     * @param action 
     */
    public async postJmxRepository(action: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'action' is not null or undefined
        if (action === null || action === undefined) {
            throw new RequiredError("ConsoleApi", "postJmxRepository", "action");
        }


        // Path Params
        const localVarPath = '/system/console/jmx/com.adobe.granite:type=Repository/op/{action}'
            .replace('{action}', encodeURIComponent(String(action)));

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
     * @param post 
     * @param apply 
     * @param _delete 
     * @param action 
     * @param location 
     * @param path 
     * @param serviceRanking 
     * @param idpUrl 
     * @param idpCertAlias 
     * @param idpHttpRedirect 
     * @param serviceProviderEntityId 
     * @param assertionConsumerServiceURL 
     * @param spPrivateKeyAlias 
     * @param keyStorePassword 
     * @param defaultRedirectUrl 
     * @param userIDAttribute 
     * @param useEncryption 
     * @param createUser 
     * @param addGroupMemberships 
     * @param groupMembershipAttribute 
     * @param defaultGroups 
     * @param nameIdFormat 
     * @param synchronizeAttributes 
     * @param handleLogout 
     * @param logoutUrl 
     * @param clockTolerance 
     * @param digestMethod 
     * @param signatureMethod 
     * @param userIntermediatePath 
     * @param propertylist 
     */
    public async postSamlConfiguration(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;































        // Path Params
        const localVarPath = '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (post !== undefined) {
            requestContext.setQueryParam("post", ObjectSerializer.serialize(post, "boolean", ""));
        }

        // Query Params
        if (apply !== undefined) {
            requestContext.setQueryParam("apply", ObjectSerializer.serialize(apply, "boolean", ""));
        }

        // Query Params
        if (_delete !== undefined) {
            requestContext.setQueryParam("delete", ObjectSerializer.serialize(_delete, "boolean", ""));
        }

        // Query Params
        if (action !== undefined) {
            requestContext.setQueryParam("action", ObjectSerializer.serialize(action, "string", ""));
        }

        // Query Params
        if (location !== undefined) {
            requestContext.setQueryParam("$location", ObjectSerializer.serialize(location, "string", ""));
        }

        // Query Params
        if (path !== undefined) {
            const serializedParams = ObjectSerializer.serialize(path, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("path", serializedParam);
            }
        }

        // Query Params
        if (serviceRanking !== undefined) {
            requestContext.setQueryParam("service.ranking", ObjectSerializer.serialize(serviceRanking, "number", ""));
        }

        // Query Params
        if (idpUrl !== undefined) {
            requestContext.setQueryParam("idpUrl", ObjectSerializer.serialize(idpUrl, "string", ""));
        }

        // Query Params
        if (idpCertAlias !== undefined) {
            requestContext.setQueryParam("idpCertAlias", ObjectSerializer.serialize(idpCertAlias, "string", ""));
        }

        // Query Params
        if (idpHttpRedirect !== undefined) {
            requestContext.setQueryParam("idpHttpRedirect", ObjectSerializer.serialize(idpHttpRedirect, "boolean", ""));
        }

        // Query Params
        if (serviceProviderEntityId !== undefined) {
            requestContext.setQueryParam("serviceProviderEntityId", ObjectSerializer.serialize(serviceProviderEntityId, "string", ""));
        }

        // Query Params
        if (assertionConsumerServiceURL !== undefined) {
            requestContext.setQueryParam("assertionConsumerServiceURL", ObjectSerializer.serialize(assertionConsumerServiceURL, "string", ""));
        }

        // Query Params
        if (spPrivateKeyAlias !== undefined) {
            requestContext.setQueryParam("spPrivateKeyAlias", ObjectSerializer.serialize(spPrivateKeyAlias, "string", ""));
        }

        // Query Params
        if (keyStorePassword !== undefined) {
            requestContext.setQueryParam("keyStorePassword", ObjectSerializer.serialize(keyStorePassword, "string", ""));
        }

        // Query Params
        if (defaultRedirectUrl !== undefined) {
            requestContext.setQueryParam("defaultRedirectUrl", ObjectSerializer.serialize(defaultRedirectUrl, "string", ""));
        }

        // Query Params
        if (userIDAttribute !== undefined) {
            requestContext.setQueryParam("userIDAttribute", ObjectSerializer.serialize(userIDAttribute, "string", ""));
        }

        // Query Params
        if (useEncryption !== undefined) {
            requestContext.setQueryParam("useEncryption", ObjectSerializer.serialize(useEncryption, "boolean", ""));
        }

        // Query Params
        if (createUser !== undefined) {
            requestContext.setQueryParam("createUser", ObjectSerializer.serialize(createUser, "boolean", ""));
        }

        // Query Params
        if (addGroupMemberships !== undefined) {
            requestContext.setQueryParam("addGroupMemberships", ObjectSerializer.serialize(addGroupMemberships, "boolean", ""));
        }

        // Query Params
        if (groupMembershipAttribute !== undefined) {
            requestContext.setQueryParam("groupMembershipAttribute", ObjectSerializer.serialize(groupMembershipAttribute, "string", ""));
        }

        // Query Params
        if (defaultGroups !== undefined) {
            const serializedParams = ObjectSerializer.serialize(defaultGroups, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("defaultGroups", serializedParam);
            }
        }

        // Query Params
        if (nameIdFormat !== undefined) {
            requestContext.setQueryParam("nameIdFormat", ObjectSerializer.serialize(nameIdFormat, "string", ""));
        }

        // Query Params
        if (synchronizeAttributes !== undefined) {
            const serializedParams = ObjectSerializer.serialize(synchronizeAttributes, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("synchronizeAttributes", serializedParam);
            }
        }

        // Query Params
        if (handleLogout !== undefined) {
            requestContext.setQueryParam("handleLogout", ObjectSerializer.serialize(handleLogout, "boolean", ""));
        }

        // Query Params
        if (logoutUrl !== undefined) {
            requestContext.setQueryParam("logoutUrl", ObjectSerializer.serialize(logoutUrl, "string", ""));
        }

        // Query Params
        if (clockTolerance !== undefined) {
            requestContext.setQueryParam("clockTolerance", ObjectSerializer.serialize(clockTolerance, "number", ""));
        }

        // Query Params
        if (digestMethod !== undefined) {
            requestContext.setQueryParam("digestMethod", ObjectSerializer.serialize(digestMethod, "string", ""));
        }

        // Query Params
        if (signatureMethod !== undefined) {
            requestContext.setQueryParam("signatureMethod", ObjectSerializer.serialize(signatureMethod, "string", ""));
        }

        // Query Params
        if (userIntermediatePath !== undefined) {
            requestContext.setQueryParam("userIntermediatePath", ObjectSerializer.serialize(userIntermediatePath, "string", ""));
        }

        // Query Params
        if (propertylist !== undefined) {
            requestContext.setQueryParam("propertylist", ObjectSerializer.serialize(propertylist, "Array<string>", ""));
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

export class ConsoleApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getAemProductInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getAemProductInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Array<string> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<string>", ""
            ) as Array<string>;
            throw new ApiException<Array<string>>(response.httpStatusCode, "Default response", body, response.headers);
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
     * @params response Response returned by the server for a request to getBundleInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getBundleInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BundleInfo >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BundleInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BundleInfo", ""
            ) as BundleInfo;
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
            const body: BundleInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BundleInfo", ""
            ) as BundleInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getConfigMgr
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getConfigMgrWithHttpInfo(response: ResponseContext): Promise<HttpInfo<string >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("5XX", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unexpected error.", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to postBundle
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postBundleWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
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
     * @params response Response returned by the server for a request to postJmxRepository
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postJmxRepositoryWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
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
     * @params response Response returned by the server for a request to postSamlConfiguration
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async postSamlConfigurationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<SamlConfigurationInfo >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SamlConfigurationInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SamlConfigurationInfo", ""
            ) as SamlConfigurationInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("302", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            throw new ApiException<string>(response.httpStatusCode, "Default response", body, response.headers);
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
            const body: SamlConfigurationInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SamlConfigurationInfo", ""
            ) as SamlConfigurationInfo;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
