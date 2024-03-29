/* tslint:disable */
/* eslint-disable */
/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import {
    InstallStatus,
    InstallStatusFromJSON,
    InstallStatusToJSON,
} from '../models';

export interface PostPackageServiceRequest {
    cmd: string;
}

export interface PostPackageServiceJsonRequest {
    path: string;
    cmd: string;
    groupName?: string;
    packageName?: string;
    packageVersion?: string;
    charset?: string;
    force?: boolean;
    recursive?: boolean;
    _package?: Blob;
}

export interface PostPackageUpdateRequest {
    groupName: string;
    packageName: string;
    version: string;
    path: string;
    filter?: string;
    charset?: string;
}

export interface PostSetPasswordRequest {
    old: string;
    plain: string;
    verify: string;
}

/**
 * 
 */
export class CrxApi extends runtime.BaseAPI {

    /**
     */
    async getCrxdeStatusRaw(initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/crx/server/crx.default/jcr:root/.1.json`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async getCrxdeStatus(initOverrides?: RequestInit): Promise<string> {
        const response = await this.getCrxdeStatusRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async getInstallStatusRaw(initOverrides?: RequestInit): Promise<runtime.ApiResponse<InstallStatus>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/crx/packmgr/installstatus.jsp`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => InstallStatusFromJSON(jsonValue));
    }

    /**
     */
    async getInstallStatus(initOverrides?: RequestInit): Promise<InstallStatus> {
        const response = await this.getInstallStatusRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async getPackageManagerServletRaw(initOverrides?: RequestInit): Promise<runtime.ApiResponse<void>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/crx/packmgr/service/script.html`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async getPackageManagerServlet(initOverrides?: RequestInit): Promise<void> {
        await this.getPackageManagerServletRaw(initOverrides);
    }

    /**
     */
    async postPackageServiceRaw(requestParameters: PostPackageServiceRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.cmd === null || requestParameters.cmd === undefined) {
            throw new runtime.RequiredError('cmd','Required parameter requestParameters.cmd was null or undefined when calling postPackageService.');
        }

        const queryParameters: any = {};

        if (requestParameters.cmd !== undefined) {
            queryParameters['cmd'] = requestParameters.cmd;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/crx/packmgr/service.jsp`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async postPackageService(requestParameters: PostPackageServiceRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.postPackageServiceRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async postPackageServiceJsonRaw(requestParameters: PostPackageServiceJsonRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.path === null || requestParameters.path === undefined) {
            throw new runtime.RequiredError('path','Required parameter requestParameters.path was null or undefined when calling postPackageServiceJson.');
        }

        if (requestParameters.cmd === null || requestParameters.cmd === undefined) {
            throw new runtime.RequiredError('cmd','Required parameter requestParameters.cmd was null or undefined when calling postPackageServiceJson.');
        }

        const queryParameters: any = {};

        if (requestParameters.cmd !== undefined) {
            queryParameters['cmd'] = requestParameters.cmd;
        }

        if (requestParameters.groupName !== undefined) {
            queryParameters['groupName'] = requestParameters.groupName;
        }

        if (requestParameters.packageName !== undefined) {
            queryParameters['packageName'] = requestParameters.packageName;
        }

        if (requestParameters.packageVersion !== undefined) {
            queryParameters['packageVersion'] = requestParameters.packageVersion;
        }

        if (requestParameters.charset !== undefined) {
            queryParameters['_charset_'] = requestParameters.charset;
        }

        if (requestParameters.force !== undefined) {
            queryParameters['force'] = requestParameters.force;
        }

        if (requestParameters.recursive !== undefined) {
            queryParameters['recursive'] = requestParameters.recursive;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const consumes: runtime.Consume[] = [
            { contentType: 'multipart/form-data' },
        ];
        // @ts-ignore: canConsumeForm may be unused
        const canConsumeForm = runtime.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): any };
        let useForm = false;
        // use FormData to transmit files using content-type "multipart/form-data"
        useForm = canConsumeForm;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new URLSearchParams();
        }

        if (requestParameters._package !== undefined) {
            formParams.append('package', requestParameters._package as any);
        }

        const response = await this.request({
            path: `/crx/packmgr/service/.json/{path}`.replace(`{${"path"}}`, encodeURIComponent(String(requestParameters.path))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: formParams,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async postPackageServiceJson(requestParameters: PostPackageServiceJsonRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.postPackageServiceJsonRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async postPackageUpdateRaw(requestParameters: PostPackageUpdateRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.groupName === null || requestParameters.groupName === undefined) {
            throw new runtime.RequiredError('groupName','Required parameter requestParameters.groupName was null or undefined when calling postPackageUpdate.');
        }

        if (requestParameters.packageName === null || requestParameters.packageName === undefined) {
            throw new runtime.RequiredError('packageName','Required parameter requestParameters.packageName was null or undefined when calling postPackageUpdate.');
        }

        if (requestParameters.version === null || requestParameters.version === undefined) {
            throw new runtime.RequiredError('version','Required parameter requestParameters.version was null or undefined when calling postPackageUpdate.');
        }

        if (requestParameters.path === null || requestParameters.path === undefined) {
            throw new runtime.RequiredError('path','Required parameter requestParameters.path was null or undefined when calling postPackageUpdate.');
        }

        const queryParameters: any = {};

        if (requestParameters.groupName !== undefined) {
            queryParameters['groupName'] = requestParameters.groupName;
        }

        if (requestParameters.packageName !== undefined) {
            queryParameters['packageName'] = requestParameters.packageName;
        }

        if (requestParameters.version !== undefined) {
            queryParameters['version'] = requestParameters.version;
        }

        if (requestParameters.path !== undefined) {
            queryParameters['path'] = requestParameters.path;
        }

        if (requestParameters.filter !== undefined) {
            queryParameters['filter'] = requestParameters.filter;
        }

        if (requestParameters.charset !== undefined) {
            queryParameters['_charset_'] = requestParameters.charset;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/crx/packmgr/update.jsp`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async postPackageUpdate(requestParameters: PostPackageUpdateRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.postPackageUpdateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async postSetPasswordRaw(requestParameters: PostSetPasswordRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.old === null || requestParameters.old === undefined) {
            throw new runtime.RequiredError('old','Required parameter requestParameters.old was null or undefined when calling postSetPassword.');
        }

        if (requestParameters.plain === null || requestParameters.plain === undefined) {
            throw new runtime.RequiredError('plain','Required parameter requestParameters.plain was null or undefined when calling postSetPassword.');
        }

        if (requestParameters.verify === null || requestParameters.verify === undefined) {
            throw new runtime.RequiredError('verify','Required parameter requestParameters.verify was null or undefined when calling postSetPassword.');
        }

        const queryParameters: any = {};

        if (requestParameters.old !== undefined) {
            queryParameters['old'] = requestParameters.old;
        }

        if (requestParameters.plain !== undefined) {
            queryParameters['plain'] = requestParameters.plain;
        }

        if (requestParameters.verify !== undefined) {
            queryParameters['verify'] = requestParameters.verify;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/crx/explorer/ui/setpassword.jsp`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async postSetPassword(requestParameters: PostSetPasswordRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.postSetPasswordRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
