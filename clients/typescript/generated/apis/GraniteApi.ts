// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';



/**
 * no description
 */
export class GraniteApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * @param keystorePassword 
     * @param keystorePasswordConfirm 
     * @param truststorePassword 
     * @param truststorePasswordConfirm 
     * @param httpsHostname 
     * @param httpsPort 
     * @param privatekeyFile 
     * @param certificateFile 
     */
    public async sslSetup(keystorePassword: string, keystorePasswordConfirm: string, truststorePassword: string, truststorePasswordConfirm: string, httpsHostname: string, httpsPort: string, privatekeyFile?: HttpFile, certificateFile?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'keystorePassword' is not null or undefined
        if (keystorePassword === null || keystorePassword === undefined) {
            throw new RequiredError("GraniteApi", "sslSetup", "keystorePassword");
        }


        // verify required parameter 'keystorePasswordConfirm' is not null or undefined
        if (keystorePasswordConfirm === null || keystorePasswordConfirm === undefined) {
            throw new RequiredError("GraniteApi", "sslSetup", "keystorePasswordConfirm");
        }


        // verify required parameter 'truststorePassword' is not null or undefined
        if (truststorePassword === null || truststorePassword === undefined) {
            throw new RequiredError("GraniteApi", "sslSetup", "truststorePassword");
        }


        // verify required parameter 'truststorePasswordConfirm' is not null or undefined
        if (truststorePasswordConfirm === null || truststorePasswordConfirm === undefined) {
            throw new RequiredError("GraniteApi", "sslSetup", "truststorePasswordConfirm");
        }


        // verify required parameter 'httpsHostname' is not null or undefined
        if (httpsHostname === null || httpsHostname === undefined) {
            throw new RequiredError("GraniteApi", "sslSetup", "httpsHostname");
        }


        // verify required parameter 'httpsPort' is not null or undefined
        if (httpsPort === null || httpsPort === undefined) {
            throw new RequiredError("GraniteApi", "sslSetup", "httpsPort");
        }




        // Path Params
        const localVarPath = '/libs/granite/security/post/sslSetup.html';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (keystorePassword !== undefined) {
            requestContext.setQueryParam("keystorePassword", ObjectSerializer.serialize(keystorePassword, "string", ""));
        }

        // Query Params
        if (keystorePasswordConfirm !== undefined) {
            requestContext.setQueryParam("keystorePasswordConfirm", ObjectSerializer.serialize(keystorePasswordConfirm, "string", ""));
        }

        // Query Params
        if (truststorePassword !== undefined) {
            requestContext.setQueryParam("truststorePassword", ObjectSerializer.serialize(truststorePassword, "string", ""));
        }

        // Query Params
        if (truststorePasswordConfirm !== undefined) {
            requestContext.setQueryParam("truststorePasswordConfirm", ObjectSerializer.serialize(truststorePasswordConfirm, "string", ""));
        }

        // Query Params
        if (httpsHostname !== undefined) {
            requestContext.setQueryParam("httpsHostname", ObjectSerializer.serialize(httpsHostname, "string", ""));
        }

        // Query Params
        if (httpsPort !== undefined) {
            requestContext.setQueryParam("httpsPort", ObjectSerializer.serialize(httpsPort, "string", ""));
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

        if (privatekeyFile !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('privatekeyFile', privatekeyFile, privatekeyFile.name);
             }
        }
        if (certificateFile !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('certificateFile', certificateFile, certificateFile.name);
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

export class GraniteApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sslSetup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async sslSetupWithHttpInfo(response: ResponseContext): Promise<HttpInfo< void>> {
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
