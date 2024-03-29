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


import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class CqService {
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
    public getLoginPage(observe?: 'body', headers?: Headers): Observable<string>;
    public getLoginPage(observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public getLoginPage(observe: any = 'body', headers: Headers = {}): Observable<any> {
        headers['Accept'] = 'text/html';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.basePath}/libs/granite/core/content/login.html`, headers);
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
     * @param authorizableId 
     * @param changelog 
     
     */
    public postCqActions(authorizableId: string, changelog: string, observe?: 'body', headers?: Headers): Observable<any>;
    public postCqActions(authorizableId: string, changelog: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public postCqActions(authorizableId: string, changelog: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (authorizableId === null || authorizableId === undefined){
            throw new Error('Required parameter authorizableId was null or undefined when calling postCqActions.');
        }

        if (changelog === null || changelog === undefined){
            throw new Error('Required parameter changelog was null or undefined when calling postCqActions.');
        }

        let queryParameters: string[] = [];
        if (authorizableId !== undefined) {
            queryParameters.push('authorizableId='+encodeURIComponent(String(authorizableId)));
        }
        if (changelog !== undefined) {
            queryParameters.push('changelog='+encodeURIComponent(String(changelog)));
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/.cqactions.html?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <any>(httpResponse.response))
               );
        }
        return response;
    }

}
