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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { InstallStatus } from '../model/installStatus';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class CrxService {
    private basePath: string = 'http://localhost';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * 
     * 
     
     */
    public getCrxdeStatus(observe?: 'body', headers?: Headers): Observable<string>;
    public getCrxdeStatus(observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public getCrxdeStatus(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'plain/text';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.basePath}/crx/server/crx.default/jcr:root/.1.json`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <string>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * 
     * 
     
     */
    public getInstallStatus(observe?: 'body', headers?: Headers): Observable<InstallStatus>;
    public getInstallStatus(observe?: 'response', headers?: Headers): Observable<HttpResponse<InstallStatus>>;
    public getInstallStatus(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<InstallStatus>> = this.httpClient.get(`${this.basePath}/crx/packmgr/installstatus.jsp`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <InstallStatus>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * 
     * 
     
     */
    public getPackageManagerServlet(observe?: 'body', headers?: Headers): Observable<any>;
    public getPackageManagerServlet(observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public getPackageManagerServlet(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'text/html';

        const response: Observable<HttpResponse<any>> = this.httpClient.get(`${this.basePath}/crx/packmgr/service/script.html`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <any>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * 
     * 
     * @param cmd 
     
     */
    public postPackageService(cmd: string, observe?: 'body', headers?: Headers): Observable<string>;
    public postPackageService(cmd: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public postPackageService(cmd: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (cmd === null || cmd === undefined){
            throw new Error('Required parameter cmd was null or undefined when calling postPackageService.');
        }

        let queryParameters: string[] = [];
        if (cmd !== undefined) {
            queryParameters.push('cmd='+encodeURIComponent(String(cmd)));
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'text/xml';

        const response: Observable<HttpResponse<string>> = this.httpClient.post(`${this.basePath}/crx/packmgr/service.jsp?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <string>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * 
     * 
     * @param path 
     * @param cmd 
     * @param groupName 
     * @param packageName 
     * @param packageVersion 
     * @param charset 
     * @param force 
     * @param recursive 
     * @param _package 
     
     */
    public postPackageServiceJson(path: string, cmd: string, groupName?: string, packageName?: string, packageVersion?: string, charset?: string, force?: boolean, recursive?: boolean, _package?: Blob, observe?: 'body', headers?: Headers): Observable<string>;
    public postPackageServiceJson(path: string, cmd: string, groupName?: string, packageName?: string, packageVersion?: string, charset?: string, force?: boolean, recursive?: boolean, _package?: Blob, observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public postPackageServiceJson(path: string, cmd: string, groupName?: string, packageName?: string, packageVersion?: string, charset?: string, force?: boolean, recursive?: boolean, _package?: Blob, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (path === null || path === undefined){
            throw new Error('Required parameter path was null or undefined when calling postPackageServiceJson.');
        }

        if (cmd === null || cmd === undefined){
            throw new Error('Required parameter cmd was null or undefined when calling postPackageServiceJson.');
        }

        let queryParameters: string[] = [];
        if (cmd !== undefined) {
            queryParameters.push('cmd='+encodeURIComponent(String(cmd)));
        }
        if (groupName !== undefined) {
            queryParameters.push('groupName='+encodeURIComponent(String(groupName)));
        }
        if (packageName !== undefined) {
            queryParameters.push('packageName='+encodeURIComponent(String(packageName)));
        }
        if (packageVersion !== undefined) {
            queryParameters.push('packageVersion='+encodeURIComponent(String(packageVersion)));
        }
        if (charset !== undefined) {
            queryParameters.push('charset='+encodeURIComponent(String(charset)));
        }
        if (force !== undefined) {
            queryParameters.push('force='+encodeURIComponent(String(force)));
        }
        if (recursive !== undefined) {
            queryParameters.push('recursive='+encodeURIComponent(String(recursive)));
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'application/json';

        let formData: FormData = new FormData();
        headers['Content-Type'] = 'multipart/form-data';
        if (_package !== undefined) {
            formData.append('package', <any>_package);
        }

        const response: Observable<HttpResponse<string>> = this.httpClient.post(`${this.basePath}/crx/packmgr/service/.json/${encodeURIComponent(String(path))}?${queryParameters.join('&')}`, formData, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <string>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * 
     * 
     * @param groupName 
     * @param packageName 
     * @param version 
     * @param path 
     * @param filter 
     * @param charset 
     
     */
    public postPackageUpdate(groupName: string, packageName: string, version: string, path: string, filter?: string, charset?: string, observe?: 'body', headers?: Headers): Observable<string>;
    public postPackageUpdate(groupName: string, packageName: string, version: string, path: string, filter?: string, charset?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public postPackageUpdate(groupName: string, packageName: string, version: string, path: string, filter?: string, charset?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (groupName === null || groupName === undefined){
            throw new Error('Required parameter groupName was null or undefined when calling postPackageUpdate.');
        }

        if (packageName === null || packageName === undefined){
            throw new Error('Required parameter packageName was null or undefined when calling postPackageUpdate.');
        }

        if (version === null || version === undefined){
            throw new Error('Required parameter version was null or undefined when calling postPackageUpdate.');
        }

        if (path === null || path === undefined){
            throw new Error('Required parameter path was null or undefined when calling postPackageUpdate.');
        }

        let queryParameters: string[] = [];
        if (groupName !== undefined) {
            queryParameters.push('groupName='+encodeURIComponent(String(groupName)));
        }
        if (packageName !== undefined) {
            queryParameters.push('packageName='+encodeURIComponent(String(packageName)));
        }
        if (version !== undefined) {
            queryParameters.push('version='+encodeURIComponent(String(version)));
        }
        if (path !== undefined) {
            queryParameters.push('path='+encodeURIComponent(String(path)));
        }
        if (filter !== undefined) {
            queryParameters.push('filter='+encodeURIComponent(String(filter)));
        }
        if (charset !== undefined) {
            queryParameters.push('charset='+encodeURIComponent(String(charset)));
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<string>> = this.httpClient.post(`${this.basePath}/crx/packmgr/update.jsp?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <string>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * 
     * 
     * @param old 
     * @param plain 
     * @param verify 
     
     */
    public postSetPassword(old: string, plain: string, verify: string, observe?: 'body', headers?: Headers): Observable<string>;
    public postSetPassword(old: string, plain: string, verify: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public postSetPassword(old: string, plain: string, verify: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (old === null || old === undefined){
            throw new Error('Required parameter old was null or undefined when calling postSetPassword.');
        }

        if (plain === null || plain === undefined){
            throw new Error('Required parameter plain was null or undefined when calling postSetPassword.');
        }

        if (verify === null || verify === undefined){
            throw new Error('Required parameter verify was null or undefined when calling postSetPassword.');
        }

        let queryParameters: string[] = [];
        if (old !== undefined) {
            queryParameters.push('old='+encodeURIComponent(String(old)));
        }
        if (plain !== undefined) {
            queryParameters.push('plain='+encodeURIComponent(String(plain)));
        }
        if (verify !== undefined) {
            queryParameters.push('verify='+encodeURIComponent(String(verify)));
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'text/plain';

        const response: Observable<HttpResponse<string>> = this.httpClient.post(`${this.basePath}/crx/explorer/ui/setpassword.jsp?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <string>(httpResponse.response))
               );
        }
        return response;
    }

}
