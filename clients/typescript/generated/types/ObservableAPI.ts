import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions, mergeConfiguration } from '../configuration'
import type { Middleware } from '../middleware';
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { BundleData } from '../models/BundleData';
import { BundleDataProp } from '../models/BundleDataProp';
import { BundleInfo } from '../models/BundleInfo';
import { InstallStatus } from '../models/InstallStatus';
import { InstallStatusStatus } from '../models/InstallStatusStatus';
import { KeystoreChainItems } from '../models/KeystoreChainItems';
import { KeystoreInfo } from '../models/KeystoreInfo';
import { KeystoreItems } from '../models/KeystoreItems';
import { SamlConfigurationInfo } from '../models/SamlConfigurationInfo';
import { SamlConfigurationProperties } from '../models/SamlConfigurationProperties';
import { SamlConfigurationPropertyItemsArray } from '../models/SamlConfigurationPropertyItemsArray';
import { SamlConfigurationPropertyItemsBoolean } from '../models/SamlConfigurationPropertyItemsBoolean';
import { SamlConfigurationPropertyItemsLong } from '../models/SamlConfigurationPropertyItemsLong';
import { SamlConfigurationPropertyItemsString } from '../models/SamlConfigurationPropertyItemsString';
import { TruststoreInfo } from '../models/TruststoreInfo';
import { TruststoreItems } from '../models/TruststoreItems';

import { ConsoleApiRequestFactory, ConsoleApiResponseProcessor} from "../apis/ConsoleApi";
export class ObservableConsoleApi {
    private requestFactory: ConsoleApiRequestFactory;
    private responseProcessor: ConsoleApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ConsoleApiRequestFactory,
        responseProcessor?: ConsoleApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ConsoleApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ConsoleApiResponseProcessor();
    }

    /**
     */
    public getAemProductInfoWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getAemProductInfo(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAemProductInfoWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getAemProductInfo(_options?: ConfigurationOptions): Observable<void> {
        return this.getAemProductInfoWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param name
     */
    public getBundleInfoWithHttpInfo(name: string, _options?: ConfigurationOptions): Observable<HttpInfo<BundleInfo>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getBundleInfo(name, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getBundleInfoWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param name
     */
    public getBundleInfo(name: string, _options?: ConfigurationOptions): Observable<BundleInfo> {
        return this.getBundleInfoWithHttpInfo(name, _options).pipe(map((apiResponse: HttpInfo<BundleInfo>) => apiResponse.data));
    }

    /**
     */
    public getConfigMgrWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<string>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getConfigMgr(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getConfigMgrWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getConfigMgr(_options?: ConfigurationOptions): Observable<string> {
        return this.getConfigMgrWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<string>) => apiResponse.data));
    }

    /**
     * @param name
     * @param action
     */
    public postBundleWithHttpInfo(name: string, action: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postBundle(name, action, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postBundleWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param name
     * @param action
     */
    public postBundle(name: string, action: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postBundleWithHttpInfo(name, action, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param action
     */
    public postJmxRepositoryWithHttpInfo(action: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postJmxRepository(action, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postJmxRepositoryWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param action
     */
    public postJmxRepository(action: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postJmxRepositoryWithHttpInfo(action, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [post]
     * @param [apply]
     * @param [_delete]
     * @param [action]
     * @param [location]
     * @param [path]
     * @param [serviceRanking]
     * @param [idpUrl]
     * @param [idpCertAlias]
     * @param [idpHttpRedirect]
     * @param [serviceProviderEntityId]
     * @param [assertionConsumerServiceURL]
     * @param [spPrivateKeyAlias]
     * @param [keyStorePassword]
     * @param [defaultRedirectUrl]
     * @param [userIDAttribute]
     * @param [useEncryption]
     * @param [createUser]
     * @param [addGroupMemberships]
     * @param [groupMembershipAttribute]
     * @param [defaultGroups]
     * @param [nameIdFormat]
     * @param [synchronizeAttributes]
     * @param [handleLogout]
     * @param [logoutUrl]
     * @param [clockTolerance]
     * @param [digestMethod]
     * @param [signatureMethod]
     * @param [userIntermediatePath]
     * @param [propertylist]
     */
    public postSamlConfigurationWithHttpInfo(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, _options?: ConfigurationOptions): Observable<HttpInfo<SamlConfigurationInfo>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postSamlConfiguration(post, apply, _delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postSamlConfigurationWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [post]
     * @param [apply]
     * @param [_delete]
     * @param [action]
     * @param [location]
     * @param [path]
     * @param [serviceRanking]
     * @param [idpUrl]
     * @param [idpCertAlias]
     * @param [idpHttpRedirect]
     * @param [serviceProviderEntityId]
     * @param [assertionConsumerServiceURL]
     * @param [spPrivateKeyAlias]
     * @param [keyStorePassword]
     * @param [defaultRedirectUrl]
     * @param [userIDAttribute]
     * @param [useEncryption]
     * @param [createUser]
     * @param [addGroupMemberships]
     * @param [groupMembershipAttribute]
     * @param [defaultGroups]
     * @param [nameIdFormat]
     * @param [synchronizeAttributes]
     * @param [handleLogout]
     * @param [logoutUrl]
     * @param [clockTolerance]
     * @param [digestMethod]
     * @param [signatureMethod]
     * @param [userIntermediatePath]
     * @param [propertylist]
     */
    public postSamlConfiguration(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, _options?: ConfigurationOptions): Observable<SamlConfigurationInfo> {
        return this.postSamlConfigurationWithHttpInfo(post, apply, _delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, _options).pipe(map((apiResponse: HttpInfo<SamlConfigurationInfo>) => apiResponse.data));
    }

}

import { CqApiRequestFactory, CqApiResponseProcessor} from "../apis/CqApi";
export class ObservableCqApi {
    private requestFactory: CqApiRequestFactory;
    private responseProcessor: CqApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CqApiRequestFactory,
        responseProcessor?: CqApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CqApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CqApiResponseProcessor();
    }

    /**
     */
    public getLoginPageWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getLoginPage(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getLoginPageWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getLoginPage(_options?: ConfigurationOptions): Observable<void> {
        return this.getLoginPageWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param authorizableId
     * @param changelog
     */
    public postCqActionsWithHttpInfo(authorizableId: string, changelog: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postCqActions(authorizableId, changelog, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postCqActionsWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param authorizableId
     * @param changelog
     */
    public postCqActions(authorizableId: string, changelog: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postCqActionsWithHttpInfo(authorizableId, changelog, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { CrxApiRequestFactory, CrxApiResponseProcessor} from "../apis/CrxApi";
export class ObservableCrxApi {
    private requestFactory: CrxApiRequestFactory;
    private responseProcessor: CrxApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CrxApiRequestFactory,
        responseProcessor?: CrxApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CrxApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CrxApiResponseProcessor();
    }

    /**
     */
    public getCrxdeStatusWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<string>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getCrxdeStatus(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getCrxdeStatusWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getCrxdeStatus(_options?: ConfigurationOptions): Observable<string> {
        return this.getCrxdeStatusWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<string>) => apiResponse.data));
    }

    /**
     */
    public getInstallStatusWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<InstallStatus>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getInstallStatus(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getInstallStatusWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getInstallStatus(_options?: ConfigurationOptions): Observable<InstallStatus> {
        return this.getInstallStatusWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<InstallStatus>) => apiResponse.data));
    }

    /**
     */
    public getPackageManagerServletWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getPackageManagerServlet(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getPackageManagerServletWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getPackageManagerServlet(_options?: ConfigurationOptions): Observable<void> {
        return this.getPackageManagerServletWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param cmd
     */
    public postPackageServiceWithHttpInfo(cmd: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postPackageService(cmd, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postPackageServiceWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param cmd
     */
    public postPackageService(cmd: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postPackageServiceWithHttpInfo(cmd, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param cmd
     * @param [groupName]
     * @param [packageName]
     * @param [packageVersion]
     * @param [charset]
     * @param [force]
     * @param [recursive]
     * @param [_package]
     */
    public postPackageServiceJsonWithHttpInfo(path: string, cmd: string, groupName?: string, packageName?: string, packageVersion?: string, charset?: string, force?: boolean, recursive?: boolean, _package?: HttpFile, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postPackageServiceJsonWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param cmd
     * @param [groupName]
     * @param [packageName]
     * @param [packageVersion]
     * @param [charset]
     * @param [force]
     * @param [recursive]
     * @param [_package]
     */
    public postPackageServiceJson(path: string, cmd: string, groupName?: string, packageName?: string, packageVersion?: string, charset?: string, force?: boolean, recursive?: boolean, _package?: HttpFile, _options?: ConfigurationOptions): Observable<void> {
        return this.postPackageServiceJsonWithHttpInfo(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param groupName
     * @param packageName
     * @param version
     * @param path
     * @param [filter]
     * @param [charset]
     */
    public postPackageUpdateWithHttpInfo(groupName: string, packageName: string, version: string, path: string, filter?: string, charset?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postPackageUpdate(groupName, packageName, version, path, filter, charset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postPackageUpdateWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param groupName
     * @param packageName
     * @param version
     * @param path
     * @param [filter]
     * @param [charset]
     */
    public postPackageUpdate(groupName: string, packageName: string, version: string, path: string, filter?: string, charset?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postPackageUpdateWithHttpInfo(groupName, packageName, version, path, filter, charset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param old
     * @param plain
     * @param verify
     */
    public postSetPasswordWithHttpInfo(old: string, plain: string, verify: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postSetPassword(old, plain, verify, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postSetPasswordWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param old
     * @param plain
     * @param verify
     */
    public postSetPassword(old: string, plain: string, verify: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postSetPasswordWithHttpInfo(old, plain, verify, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { CustomApiRequestFactory, CustomApiResponseProcessor} from "../apis/CustomApi";
export class ObservableCustomApi {
    private requestFactory: CustomApiRequestFactory;
    private responseProcessor: CustomApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CustomApiRequestFactory,
        responseProcessor?: CustomApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CustomApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CustomApiResponseProcessor();
    }

    /**
     * @param [tags]
     * @param [combineTagsOr]
     */
    public getAemHealthCheckWithHttpInfo(tags?: string, combineTagsOr?: boolean, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getAemHealthCheck(tags, combineTagsOr, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAemHealthCheckWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [tags]
     * @param [combineTagsOr]
     */
    public getAemHealthCheck(tags?: string, combineTagsOr?: boolean, _options?: ConfigurationOptions): Observable<void> {
        return this.getAemHealthCheckWithHttpInfo(tags, combineTagsOr, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [bundlesIgnored]
     * @param [bundlesIgnoredTypeHint]
     */
    public postConfigAemHealthCheckServletWithHttpInfo(bundlesIgnored?: Array<string>, bundlesIgnoredTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigAemHealthCheckServletWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [bundlesIgnored]
     * @param [bundlesIgnoredTypeHint]
     */
    public postConfigAemHealthCheckServlet(bundlesIgnored?: Array<string>, bundlesIgnoredTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigAemHealthCheckServletWithHttpInfo(bundlesIgnored, bundlesIgnoredTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [pwdresetAuthorizables]
     * @param [pwdresetAuthorizablesTypeHint]
     */
    public postConfigAemPasswordResetWithHttpInfo(pwdresetAuthorizables?: Array<string>, pwdresetAuthorizablesTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigAemPasswordResetWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [pwdresetAuthorizables]
     * @param [pwdresetAuthorizablesTypeHint]
     */
    public postConfigAemPasswordReset(pwdresetAuthorizables?: Array<string>, pwdresetAuthorizablesTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigAemPasswordResetWithHttpInfo(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { GraniteApiRequestFactory, GraniteApiResponseProcessor} from "../apis/GraniteApi";
export class ObservableGraniteApi {
    private requestFactory: GraniteApiRequestFactory;
    private responseProcessor: GraniteApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: GraniteApiRequestFactory,
        responseProcessor?: GraniteApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new GraniteApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new GraniteApiResponseProcessor();
    }

    /**
     * @param keystorePassword
     * @param keystorePasswordConfirm
     * @param truststorePassword
     * @param truststorePasswordConfirm
     * @param httpsHostname
     * @param httpsPort
     * @param [privatekeyFile]
     * @param [certificateFile]
     */
    public sslSetupWithHttpInfo(keystorePassword: string, keystorePasswordConfirm: string, truststorePassword: string, truststorePasswordConfirm: string, httpsHostname: string, httpsPort: string, privatekeyFile?: HttpFile, certificateFile?: HttpFile, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.sslSetupWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param keystorePassword
     * @param keystorePasswordConfirm
     * @param truststorePassword
     * @param truststorePasswordConfirm
     * @param httpsHostname
     * @param httpsPort
     * @param [privatekeyFile]
     * @param [certificateFile]
     */
    public sslSetup(keystorePassword: string, keystorePasswordConfirm: string, truststorePassword: string, truststorePasswordConfirm: string, httpsHostname: string, httpsPort: string, privatekeyFile?: HttpFile, certificateFile?: HttpFile, _options?: ConfigurationOptions): Observable<void> {
        return this.sslSetupWithHttpInfo(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { SlingApiRequestFactory, SlingApiResponseProcessor} from "../apis/SlingApi";
export class ObservableSlingApi {
    private requestFactory: SlingApiRequestFactory;
    private responseProcessor: SlingApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: SlingApiRequestFactory,
        responseProcessor?: SlingApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new SlingApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new SlingApiResponseProcessor();
    }

    /**
     * @param runmode
     * @param name
     */
    public deleteAgentWithHttpInfo(runmode: string, name: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteAgent(runmode, name, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteAgentWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param runmode
     * @param name
     */
    public deleteAgent(runmode: string, name: string, _options?: ConfigurationOptions): Observable<void> {
        return this.deleteAgentWithHttpInfo(runmode, name, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param name
     */
    public deleteNodeWithHttpInfo(path: string, name: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteNode(path, name, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteNodeWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param name
     */
    public deleteNode(path: string, name: string, _options?: ConfigurationOptions): Observable<void> {
        return this.deleteNodeWithHttpInfo(path, name, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param runmode
     * @param name
     */
    public getAgentWithHttpInfo(runmode: string, name: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getAgent(runmode, name, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAgentWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param runmode
     * @param name
     */
    public getAgent(runmode: string, name: string, _options?: ConfigurationOptions): Observable<void> {
        return this.getAgentWithHttpInfo(runmode, name, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param runmode
     */
    public getAgentsWithHttpInfo(runmode: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getAgents(runmode, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAgentsWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param runmode
     */
    public getAgents(runmode: string, _options?: ConfigurationOptions): Observable<void> {
        return this.getAgentsWithHttpInfo(runmode, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getAuthorizableKeystoreWithHttpInfo(intermediatePath: string, authorizableId: string, _options?: ConfigurationOptions): Observable<HttpInfo<KeystoreInfo>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getAuthorizableKeystore(intermediatePath, authorizableId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAuthorizableKeystoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getAuthorizableKeystore(intermediatePath: string, authorizableId: string, _options?: ConfigurationOptions): Observable<KeystoreInfo> {
        return this.getAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId, _options).pipe(map((apiResponse: HttpInfo<KeystoreInfo>) => apiResponse.data));
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getKeystoreWithHttpInfo(intermediatePath: string, authorizableId: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getKeystore(intermediatePath, authorizableId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getKeystoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getKeystore(intermediatePath: string, authorizableId: string, _options?: ConfigurationOptions): Observable<void> {
        return this.getKeystoreWithHttpInfo(intermediatePath, authorizableId, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param name
     */
    public getNodeWithHttpInfo(path: string, name: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getNode(path, name, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getNodeWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param name
     */
    public getNode(path: string, name: string, _options?: ConfigurationOptions): Observable<void> {
        return this.getNodeWithHttpInfo(path, name, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackageWithHttpInfo(group: string, name: string, version: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getPackage(group, name, version, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getPackageWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackage(group: string, name: string, version: string, _options?: ConfigurationOptions): Observable<void> {
        return this.getPackageWithHttpInfo(group, name, version, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackageFilterWithHttpInfo(group: string, name: string, version: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getPackageFilter(group, name, version, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getPackageFilterWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackageFilter(group: string, name: string, version: string, _options?: ConfigurationOptions): Observable<void> {
        return this.getPackageFilterWithHttpInfo(group, name, version, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public getQueryWithHttpInfo(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getQuery(path, pLimit, _1property, _1propertyValue, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getQueryWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public getQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: ConfigurationOptions): Observable<void> {
        return this.getQueryWithHttpInfo(path, pLimit, _1property, _1propertyValue, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     */
    public getTruststoreWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getTruststore(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getTruststoreWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getTruststore(_options?: ConfigurationOptions): Observable<void> {
        return this.getTruststoreWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     */
    public getTruststoreInfoWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<TruststoreInfo>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getTruststoreInfo(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getTruststoreInfoWithHttpInfo(rsp)));
            }));
    }

    /**
     */
    public getTruststoreInfo(_options?: ConfigurationOptions): Observable<TruststoreInfo> {
        return this.getTruststoreInfoWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<TruststoreInfo>) => apiResponse.data));
    }

    /**
     * @param runmode
     * @param name
     * @param [jcrContentCqDistribute]
     * @param [jcrContentCqDistributeTypeHint]
     * @param [jcrContentCqName]
     * @param [jcrContentCqTemplate]
     * @param [jcrContentAliasUpdate]
     * @param [jcrContentEnabled]
     * @param [jcrContentJcrDescription]
     * @param [jcrContentJcrLastModified]
     * @param [jcrContentJcrLastModifiedBy]
     * @param [jcrContentJcrMixinTypes]
     * @param [jcrContentJcrTitle]
     * @param [jcrContentLogLevel]
     * @param [jcrContentNoStatusUpdate]
     * @param [jcrContentNoVersioning]
     * @param [jcrContentProtocolConnectTimeout]
     * @param [jcrContentProtocolHTTPConnectionClosed]
     * @param [jcrContentProtocolHTTPExpired]
     * @param [jcrContentProtocolHTTPHeaders]
     * @param [jcrContentProtocolHTTPHeadersTypeHint]
     * @param [jcrContentProtocolHTTPMethod]
     * @param [jcrContentProtocolHTTPSRelaxed]
     * @param [jcrContentProtocolInterface]
     * @param [jcrContentProtocolSocketTimeout]
     * @param [jcrContentProtocolVersion]
     * @param [jcrContentProxyNTLMDomain]
     * @param [jcrContentProxyNTLMHost]
     * @param [jcrContentProxyHost]
     * @param [jcrContentProxyPassword]
     * @param [jcrContentProxyPort]
     * @param [jcrContentProxyUser]
     * @param [jcrContentQueueBatchMaxSize]
     * @param [jcrContentQueueBatchMode]
     * @param [jcrContentQueueBatchWaitTime]
     * @param [jcrContentRetryDelay]
     * @param [jcrContentReverseReplication]
     * @param [jcrContentSerializationType]
     * @param [jcrContentSlingResourceType]
     * @param [jcrContentSsl]
     * @param [jcrContentTransportNTLMDomain]
     * @param [jcrContentTransportNTLMHost]
     * @param [jcrContentTransportPassword]
     * @param [jcrContentTransportUri]
     * @param [jcrContentTransportUser]
     * @param [jcrContentTriggerDistribute]
     * @param [jcrContentTriggerModified]
     * @param [jcrContentTriggerOnOffTime]
     * @param [jcrContentTriggerReceive]
     * @param [jcrContentTriggerSpecific]
     * @param [jcrContentUserId]
     * @param [jcrPrimaryType]
     * @param [operation]
     */
    public postAgentWithHttpInfo(runmode: string, name: string, jcrContentCqDistribute?: boolean, jcrContentCqDistributeTypeHint?: string, jcrContentCqName?: string, jcrContentCqTemplate?: string, jcrContentAliasUpdate?: boolean, jcrContentEnabled?: boolean, jcrContentJcrDescription?: string, jcrContentJcrLastModified?: string, jcrContentJcrLastModifiedBy?: string, jcrContentJcrMixinTypes?: string, jcrContentJcrTitle?: string, jcrContentLogLevel?: string, jcrContentNoStatusUpdate?: boolean, jcrContentNoVersioning?: boolean, jcrContentProtocolConnectTimeout?: number, jcrContentProtocolHTTPConnectionClosed?: boolean, jcrContentProtocolHTTPExpired?: string, jcrContentProtocolHTTPHeaders?: Array<string>, jcrContentProtocolHTTPHeadersTypeHint?: string, jcrContentProtocolHTTPMethod?: string, jcrContentProtocolHTTPSRelaxed?: boolean, jcrContentProtocolInterface?: string, jcrContentProtocolSocketTimeout?: number, jcrContentProtocolVersion?: string, jcrContentProxyNTLMDomain?: string, jcrContentProxyNTLMHost?: string, jcrContentProxyHost?: string, jcrContentProxyPassword?: string, jcrContentProxyPort?: number, jcrContentProxyUser?: string, jcrContentQueueBatchMaxSize?: number, jcrContentQueueBatchMode?: string, jcrContentQueueBatchWaitTime?: number, jcrContentRetryDelay?: string, jcrContentReverseReplication?: boolean, jcrContentSerializationType?: string, jcrContentSlingResourceType?: string, jcrContentSsl?: string, jcrContentTransportNTLMDomain?: string, jcrContentTransportNTLMHost?: string, jcrContentTransportPassword?: string, jcrContentTransportUri?: string, jcrContentTransportUser?: string, jcrContentTriggerDistribute?: boolean, jcrContentTriggerModified?: boolean, jcrContentTriggerOnOffTime?: boolean, jcrContentTriggerReceive?: boolean, jcrContentTriggerSpecific?: boolean, jcrContentUserId?: string, jcrPrimaryType?: string, operation?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postAgentWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param runmode
     * @param name
     * @param [jcrContentCqDistribute]
     * @param [jcrContentCqDistributeTypeHint]
     * @param [jcrContentCqName]
     * @param [jcrContentCqTemplate]
     * @param [jcrContentAliasUpdate]
     * @param [jcrContentEnabled]
     * @param [jcrContentJcrDescription]
     * @param [jcrContentJcrLastModified]
     * @param [jcrContentJcrLastModifiedBy]
     * @param [jcrContentJcrMixinTypes]
     * @param [jcrContentJcrTitle]
     * @param [jcrContentLogLevel]
     * @param [jcrContentNoStatusUpdate]
     * @param [jcrContentNoVersioning]
     * @param [jcrContentProtocolConnectTimeout]
     * @param [jcrContentProtocolHTTPConnectionClosed]
     * @param [jcrContentProtocolHTTPExpired]
     * @param [jcrContentProtocolHTTPHeaders]
     * @param [jcrContentProtocolHTTPHeadersTypeHint]
     * @param [jcrContentProtocolHTTPMethod]
     * @param [jcrContentProtocolHTTPSRelaxed]
     * @param [jcrContentProtocolInterface]
     * @param [jcrContentProtocolSocketTimeout]
     * @param [jcrContentProtocolVersion]
     * @param [jcrContentProxyNTLMDomain]
     * @param [jcrContentProxyNTLMHost]
     * @param [jcrContentProxyHost]
     * @param [jcrContentProxyPassword]
     * @param [jcrContentProxyPort]
     * @param [jcrContentProxyUser]
     * @param [jcrContentQueueBatchMaxSize]
     * @param [jcrContentQueueBatchMode]
     * @param [jcrContentQueueBatchWaitTime]
     * @param [jcrContentRetryDelay]
     * @param [jcrContentReverseReplication]
     * @param [jcrContentSerializationType]
     * @param [jcrContentSlingResourceType]
     * @param [jcrContentSsl]
     * @param [jcrContentTransportNTLMDomain]
     * @param [jcrContentTransportNTLMHost]
     * @param [jcrContentTransportPassword]
     * @param [jcrContentTransportUri]
     * @param [jcrContentTransportUser]
     * @param [jcrContentTriggerDistribute]
     * @param [jcrContentTriggerModified]
     * @param [jcrContentTriggerOnOffTime]
     * @param [jcrContentTriggerReceive]
     * @param [jcrContentTriggerSpecific]
     * @param [jcrContentUserId]
     * @param [jcrPrimaryType]
     * @param [operation]
     */
    public postAgent(runmode: string, name: string, jcrContentCqDistribute?: boolean, jcrContentCqDistributeTypeHint?: string, jcrContentCqName?: string, jcrContentCqTemplate?: string, jcrContentAliasUpdate?: boolean, jcrContentEnabled?: boolean, jcrContentJcrDescription?: string, jcrContentJcrLastModified?: string, jcrContentJcrLastModifiedBy?: string, jcrContentJcrMixinTypes?: string, jcrContentJcrTitle?: string, jcrContentLogLevel?: string, jcrContentNoStatusUpdate?: boolean, jcrContentNoVersioning?: boolean, jcrContentProtocolConnectTimeout?: number, jcrContentProtocolHTTPConnectionClosed?: boolean, jcrContentProtocolHTTPExpired?: string, jcrContentProtocolHTTPHeaders?: Array<string>, jcrContentProtocolHTTPHeadersTypeHint?: string, jcrContentProtocolHTTPMethod?: string, jcrContentProtocolHTTPSRelaxed?: boolean, jcrContentProtocolInterface?: string, jcrContentProtocolSocketTimeout?: number, jcrContentProtocolVersion?: string, jcrContentProxyNTLMDomain?: string, jcrContentProxyNTLMHost?: string, jcrContentProxyHost?: string, jcrContentProxyPassword?: string, jcrContentProxyPort?: number, jcrContentProxyUser?: string, jcrContentQueueBatchMaxSize?: number, jcrContentQueueBatchMode?: string, jcrContentQueueBatchWaitTime?: number, jcrContentRetryDelay?: string, jcrContentReverseReplication?: boolean, jcrContentSerializationType?: string, jcrContentSlingResourceType?: string, jcrContentSsl?: string, jcrContentTransportNTLMDomain?: string, jcrContentTransportNTLMHost?: string, jcrContentTransportPassword?: string, jcrContentTransportUri?: string, jcrContentTransportUser?: string, jcrContentTriggerDistribute?: boolean, jcrContentTriggerModified?: boolean, jcrContentTriggerOnOffTime?: boolean, jcrContentTriggerReceive?: boolean, jcrContentTriggerSpecific?: boolean, jcrContentUserId?: string, jcrPrimaryType?: string, operation?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postAgentWithHttpInfo(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     * @param [operation]
     * @param [currentPassword]
     * @param [newPassword]
     * @param [rePassword]
     * @param [keyPassword]
     * @param [keyStorePass]
     * @param [alias]
     * @param [newAlias]
     * @param [removeAlias]
     * @param [certChain]
     * @param [pk]
     * @param [keyStore]
     */
    public postAuthorizableKeystoreWithHttpInfo(intermediatePath: string, authorizableId: string, operation?: string, currentPassword?: string, newPassword?: string, rePassword?: string, keyPassword?: string, keyStorePass?: string, alias?: string, newAlias?: string, removeAlias?: string, certChain?: HttpFile, pk?: HttpFile, keyStore?: HttpFile, _options?: ConfigurationOptions): Observable<HttpInfo<KeystoreInfo>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postAuthorizableKeystoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     * @param [operation]
     * @param [currentPassword]
     * @param [newPassword]
     * @param [rePassword]
     * @param [keyPassword]
     * @param [keyStorePass]
     * @param [alias]
     * @param [newAlias]
     * @param [removeAlias]
     * @param [certChain]
     * @param [pk]
     * @param [keyStore]
     */
    public postAuthorizableKeystore(intermediatePath: string, authorizableId: string, operation?: string, currentPassword?: string, newPassword?: string, rePassword?: string, keyPassword?: string, keyStorePass?: string, alias?: string, newAlias?: string, removeAlias?: string, certChain?: HttpFile, pk?: HttpFile, keyStore?: HttpFile, _options?: ConfigurationOptions): Observable<KeystoreInfo> {
        return this.postAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, _options).pipe(map((apiResponse: HttpInfo<KeystoreInfo>) => apiResponse.data));
    }

    /**
     * @param authorizableId
     * @param intermediatePath
     * @param [createUser]
     * @param [createGroup]
     * @param [repPassword]
     * @param [profileGivenName]
     */
    public postAuthorizablesWithHttpInfo(authorizableId: string, intermediatePath: string, createUser?: string, createGroup?: string, repPassword?: string, profileGivenName?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postAuthorizablesWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param authorizableId
     * @param intermediatePath
     * @param [createUser]
     * @param [createGroup]
     * @param [repPassword]
     * @param [profileGivenName]
     */
    public postAuthorizables(authorizableId: string, intermediatePath: string, createUser?: string, createGroup?: string, repPassword?: string, profileGivenName?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postAuthorizablesWithHttpInfo(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [keyStorePassword]
     * @param [keyStorePasswordTypeHint]
     * @param [serviceRanking]
     * @param [serviceRankingTypeHint]
     * @param [idpHttpRedirect]
     * @param [idpHttpRedirectTypeHint]
     * @param [createUser]
     * @param [createUserTypeHint]
     * @param [defaultRedirectUrl]
     * @param [defaultRedirectUrlTypeHint]
     * @param [userIDAttribute]
     * @param [userIDAttributeTypeHint]
     * @param [defaultGroups]
     * @param [defaultGroupsTypeHint]
     * @param [idpCertAlias]
     * @param [idpCertAliasTypeHint]
     * @param [addGroupMemberships]
     * @param [addGroupMembershipsTypeHint]
     * @param [path]
     * @param [pathTypeHint]
     * @param [synchronizeAttributes]
     * @param [synchronizeAttributesTypeHint]
     * @param [clockTolerance]
     * @param [clockToleranceTypeHint]
     * @param [groupMembershipAttribute]
     * @param [groupMembershipAttributeTypeHint]
     * @param [idpUrl]
     * @param [idpUrlTypeHint]
     * @param [logoutUrl]
     * @param [logoutUrlTypeHint]
     * @param [serviceProviderEntityId]
     * @param [serviceProviderEntityIdTypeHint]
     * @param [assertionConsumerServiceURL]
     * @param [assertionConsumerServiceURLTypeHint]
     * @param [handleLogout]
     * @param [handleLogoutTypeHint]
     * @param [spPrivateKeyAlias]
     * @param [spPrivateKeyAliasTypeHint]
     * @param [useEncryption]
     * @param [useEncryptionTypeHint]
     * @param [nameIdFormat]
     * @param [nameIdFormatTypeHint]
     * @param [digestMethod]
     * @param [digestMethodTypeHint]
     * @param [signatureMethod]
     * @param [signatureMethodTypeHint]
     * @param [userIntermediatePath]
     * @param [userIntermediatePathTypeHint]
     */
    public postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(keyStorePassword?: string, keyStorePasswordTypeHint?: string, serviceRanking?: number, serviceRankingTypeHint?: string, idpHttpRedirect?: boolean, idpHttpRedirectTypeHint?: string, createUser?: boolean, createUserTypeHint?: string, defaultRedirectUrl?: string, defaultRedirectUrlTypeHint?: string, userIDAttribute?: string, userIDAttributeTypeHint?: string, defaultGroups?: Array<string>, defaultGroupsTypeHint?: string, idpCertAlias?: string, idpCertAliasTypeHint?: string, addGroupMemberships?: boolean, addGroupMembershipsTypeHint?: string, path?: Array<string>, pathTypeHint?: string, synchronizeAttributes?: Array<string>, synchronizeAttributesTypeHint?: string, clockTolerance?: number, clockToleranceTypeHint?: string, groupMembershipAttribute?: string, groupMembershipAttributeTypeHint?: string, idpUrl?: string, idpUrlTypeHint?: string, logoutUrl?: string, logoutUrlTypeHint?: string, serviceProviderEntityId?: string, serviceProviderEntityIdTypeHint?: string, assertionConsumerServiceURL?: string, assertionConsumerServiceURLTypeHint?: string, handleLogout?: boolean, handleLogoutTypeHint?: string, spPrivateKeyAlias?: string, spPrivateKeyAliasTypeHint?: string, useEncryption?: boolean, useEncryptionTypeHint?: string, nameIdFormat?: string, nameIdFormatTypeHint?: string, digestMethod?: string, digestMethodTypeHint?: string, signatureMethod?: string, signatureMethodTypeHint?: string, userIntermediatePath?: string, userIntermediatePathTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [keyStorePassword]
     * @param [keyStorePasswordTypeHint]
     * @param [serviceRanking]
     * @param [serviceRankingTypeHint]
     * @param [idpHttpRedirect]
     * @param [idpHttpRedirectTypeHint]
     * @param [createUser]
     * @param [createUserTypeHint]
     * @param [defaultRedirectUrl]
     * @param [defaultRedirectUrlTypeHint]
     * @param [userIDAttribute]
     * @param [userIDAttributeTypeHint]
     * @param [defaultGroups]
     * @param [defaultGroupsTypeHint]
     * @param [idpCertAlias]
     * @param [idpCertAliasTypeHint]
     * @param [addGroupMemberships]
     * @param [addGroupMembershipsTypeHint]
     * @param [path]
     * @param [pathTypeHint]
     * @param [synchronizeAttributes]
     * @param [synchronizeAttributesTypeHint]
     * @param [clockTolerance]
     * @param [clockToleranceTypeHint]
     * @param [groupMembershipAttribute]
     * @param [groupMembershipAttributeTypeHint]
     * @param [idpUrl]
     * @param [idpUrlTypeHint]
     * @param [logoutUrl]
     * @param [logoutUrlTypeHint]
     * @param [serviceProviderEntityId]
     * @param [serviceProviderEntityIdTypeHint]
     * @param [assertionConsumerServiceURL]
     * @param [assertionConsumerServiceURLTypeHint]
     * @param [handleLogout]
     * @param [handleLogoutTypeHint]
     * @param [spPrivateKeyAlias]
     * @param [spPrivateKeyAliasTypeHint]
     * @param [useEncryption]
     * @param [useEncryptionTypeHint]
     * @param [nameIdFormat]
     * @param [nameIdFormatTypeHint]
     * @param [digestMethod]
     * @param [digestMethodTypeHint]
     * @param [signatureMethod]
     * @param [signatureMethodTypeHint]
     * @param [userIntermediatePath]
     * @param [userIntermediatePathTypeHint]
     */
    public postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword?: string, keyStorePasswordTypeHint?: string, serviceRanking?: number, serviceRankingTypeHint?: string, idpHttpRedirect?: boolean, idpHttpRedirectTypeHint?: string, createUser?: boolean, createUserTypeHint?: string, defaultRedirectUrl?: string, defaultRedirectUrlTypeHint?: string, userIDAttribute?: string, userIDAttributeTypeHint?: string, defaultGroups?: Array<string>, defaultGroupsTypeHint?: string, idpCertAlias?: string, idpCertAliasTypeHint?: string, addGroupMemberships?: boolean, addGroupMembershipsTypeHint?: string, path?: Array<string>, pathTypeHint?: string, synchronizeAttributes?: Array<string>, synchronizeAttributesTypeHint?: string, clockTolerance?: number, clockToleranceTypeHint?: string, groupMembershipAttribute?: string, groupMembershipAttributeTypeHint?: string, idpUrl?: string, idpUrlTypeHint?: string, logoutUrl?: string, logoutUrlTypeHint?: string, serviceProviderEntityId?: string, serviceProviderEntityIdTypeHint?: string, assertionConsumerServiceURL?: string, assertionConsumerServiceURLTypeHint?: string, handleLogout?: boolean, handleLogoutTypeHint?: string, spPrivateKeyAlias?: string, spPrivateKeyAliasTypeHint?: string, useEncryption?: boolean, useEncryptionTypeHint?: string, nameIdFormat?: string, nameIdFormatTypeHint?: string, digestMethod?: string, digestMethodTypeHint?: string, signatureMethod?: string, signatureMethodTypeHint?: string, userIntermediatePath?: string, userIntermediatePathTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [orgApacheFelixHttpsNio]
     * @param [orgApacheFelixHttpsNioTypeHint]
     * @param [orgApacheFelixHttpsKeystore]
     * @param [orgApacheFelixHttpsKeystoreTypeHint]
     * @param [orgApacheFelixHttpsKeystorePassword]
     * @param [orgApacheFelixHttpsKeystorePasswordTypeHint]
     * @param [orgApacheFelixHttpsKeystoreKey]
     * @param [orgApacheFelixHttpsKeystoreKeyTypeHint]
     * @param [orgApacheFelixHttpsKeystoreKeyPassword]
     * @param [orgApacheFelixHttpsKeystoreKeyPasswordTypeHint]
     * @param [orgApacheFelixHttpsTruststore]
     * @param [orgApacheFelixHttpsTruststoreTypeHint]
     * @param [orgApacheFelixHttpsTruststorePassword]
     * @param [orgApacheFelixHttpsTruststorePasswordTypeHint]
     * @param [orgApacheFelixHttpsClientcertificate]
     * @param [orgApacheFelixHttpsClientcertificateTypeHint]
     * @param [orgApacheFelixHttpsEnable]
     * @param [orgApacheFelixHttpsEnableTypeHint]
     * @param [orgOsgiServiceHttpPortSecure]
     * @param [orgOsgiServiceHttpPortSecureTypeHint]
     */
    public postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(orgApacheFelixHttpsNio?: boolean, orgApacheFelixHttpsNioTypeHint?: string, orgApacheFelixHttpsKeystore?: string, orgApacheFelixHttpsKeystoreTypeHint?: string, orgApacheFelixHttpsKeystorePassword?: string, orgApacheFelixHttpsKeystorePasswordTypeHint?: string, orgApacheFelixHttpsKeystoreKey?: string, orgApacheFelixHttpsKeystoreKeyTypeHint?: string, orgApacheFelixHttpsKeystoreKeyPassword?: string, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint?: string, orgApacheFelixHttpsTruststore?: string, orgApacheFelixHttpsTruststoreTypeHint?: string, orgApacheFelixHttpsTruststorePassword?: string, orgApacheFelixHttpsTruststorePasswordTypeHint?: string, orgApacheFelixHttpsClientcertificate?: string, orgApacheFelixHttpsClientcertificateTypeHint?: string, orgApacheFelixHttpsEnable?: boolean, orgApacheFelixHttpsEnableTypeHint?: string, orgOsgiServiceHttpPortSecure?: string, orgOsgiServiceHttpPortSecureTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [orgApacheFelixHttpsNio]
     * @param [orgApacheFelixHttpsNioTypeHint]
     * @param [orgApacheFelixHttpsKeystore]
     * @param [orgApacheFelixHttpsKeystoreTypeHint]
     * @param [orgApacheFelixHttpsKeystorePassword]
     * @param [orgApacheFelixHttpsKeystorePasswordTypeHint]
     * @param [orgApacheFelixHttpsKeystoreKey]
     * @param [orgApacheFelixHttpsKeystoreKeyTypeHint]
     * @param [orgApacheFelixHttpsKeystoreKeyPassword]
     * @param [orgApacheFelixHttpsKeystoreKeyPasswordTypeHint]
     * @param [orgApacheFelixHttpsTruststore]
     * @param [orgApacheFelixHttpsTruststoreTypeHint]
     * @param [orgApacheFelixHttpsTruststorePassword]
     * @param [orgApacheFelixHttpsTruststorePasswordTypeHint]
     * @param [orgApacheFelixHttpsClientcertificate]
     * @param [orgApacheFelixHttpsClientcertificateTypeHint]
     * @param [orgApacheFelixHttpsEnable]
     * @param [orgApacheFelixHttpsEnableTypeHint]
     * @param [orgOsgiServiceHttpPortSecure]
     * @param [orgOsgiServiceHttpPortSecureTypeHint]
     */
    public postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio?: boolean, orgApacheFelixHttpsNioTypeHint?: string, orgApacheFelixHttpsKeystore?: string, orgApacheFelixHttpsKeystoreTypeHint?: string, orgApacheFelixHttpsKeystorePassword?: string, orgApacheFelixHttpsKeystorePasswordTypeHint?: string, orgApacheFelixHttpsKeystoreKey?: string, orgApacheFelixHttpsKeystoreKeyTypeHint?: string, orgApacheFelixHttpsKeystoreKeyPassword?: string, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint?: string, orgApacheFelixHttpsTruststore?: string, orgApacheFelixHttpsTruststoreTypeHint?: string, orgApacheFelixHttpsTruststorePassword?: string, orgApacheFelixHttpsTruststorePasswordTypeHint?: string, orgApacheFelixHttpsClientcertificate?: string, orgApacheFelixHttpsClientcertificateTypeHint?: string, orgApacheFelixHttpsEnable?: boolean, orgApacheFelixHttpsEnableTypeHint?: string, orgOsgiServiceHttpPortSecure?: string, orgOsgiServiceHttpPortSecureTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [proxyHost]
     * @param [proxyHostTypeHint]
     * @param [proxyPort]
     * @param [proxyPortTypeHint]
     * @param [proxyExceptions]
     * @param [proxyExceptionsTypeHint]
     * @param [proxyEnabled]
     * @param [proxyEnabledTypeHint]
     * @param [proxyUser]
     * @param [proxyUserTypeHint]
     * @param [proxyPassword]
     * @param [proxyPasswordTypeHint]
     */
    public postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(proxyHost?: string, proxyHostTypeHint?: string, proxyPort?: number, proxyPortTypeHint?: string, proxyExceptions?: Array<string>, proxyExceptionsTypeHint?: string, proxyEnabled?: boolean, proxyEnabledTypeHint?: string, proxyUser?: string, proxyUserTypeHint?: string, proxyPassword?: string, proxyPasswordTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [proxyHost]
     * @param [proxyHostTypeHint]
     * @param [proxyPort]
     * @param [proxyPortTypeHint]
     * @param [proxyExceptions]
     * @param [proxyExceptionsTypeHint]
     * @param [proxyEnabled]
     * @param [proxyEnabledTypeHint]
     * @param [proxyUser]
     * @param [proxyUserTypeHint]
     * @param [proxyPassword]
     * @param [proxyPasswordTypeHint]
     */
    public postConfigApacheHttpComponentsProxyConfiguration(proxyHost?: string, proxyHostTypeHint?: string, proxyPort?: number, proxyPortTypeHint?: string, proxyExceptions?: Array<string>, proxyExceptionsTypeHint?: string, proxyEnabled?: boolean, proxyEnabledTypeHint?: string, proxyUser?: string, proxyUserTypeHint?: string, proxyPassword?: string, proxyPasswordTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [alias]
     * @param [aliasTypeHint]
     * @param [davCreateAbsoluteUri]
     * @param [davCreateAbsoluteUriTypeHint]
     */
    public postConfigApacheSlingDavExServletWithHttpInfo(alias?: string, aliasTypeHint?: string, davCreateAbsoluteUri?: boolean, davCreateAbsoluteUriTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigApacheSlingDavExServletWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [alias]
     * @param [aliasTypeHint]
     * @param [davCreateAbsoluteUri]
     * @param [davCreateAbsoluteUriTypeHint]
     */
    public postConfigApacheSlingDavExServlet(alias?: string, aliasTypeHint?: string, davCreateAbsoluteUri?: boolean, davCreateAbsoluteUriTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigApacheSlingDavExServletWithHttpInfo(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [jsonMaximumresults]
     * @param [jsonMaximumresultsTypeHint]
     * @param [enableHtml]
     * @param [enableHtmlTypeHint]
     * @param [enableTxt]
     * @param [enableTxtTypeHint]
     * @param [enableXml]
     * @param [enableXmlTypeHint]
     */
    public postConfigApacheSlingGetServletWithHttpInfo(jsonMaximumresults?: string, jsonMaximumresultsTypeHint?: string, enableHtml?: boolean, enableHtmlTypeHint?: string, enableTxt?: boolean, enableTxtTypeHint?: string, enableXml?: boolean, enableXmlTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigApacheSlingGetServletWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [jsonMaximumresults]
     * @param [jsonMaximumresultsTypeHint]
     * @param [enableHtml]
     * @param [enableHtmlTypeHint]
     * @param [enableTxt]
     * @param [enableTxtTypeHint]
     * @param [enableXml]
     * @param [enableXmlTypeHint]
     */
    public postConfigApacheSlingGetServlet(jsonMaximumresults?: string, jsonMaximumresultsTypeHint?: string, enableHtml?: boolean, enableHtmlTypeHint?: string, enableTxt?: boolean, enableTxtTypeHint?: string, enableXml?: boolean, enableXmlTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigApacheSlingGetServletWithHttpInfo(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [allowEmpty]
     * @param [allowEmptyTypeHint]
     * @param [allowHosts]
     * @param [allowHostsTypeHint]
     * @param [allowHostsRegexp]
     * @param [allowHostsRegexpTypeHint]
     * @param [filterMethods]
     * @param [filterMethodsTypeHint]
     */
    public postConfigApacheSlingReferrerFilterWithHttpInfo(allowEmpty?: boolean, allowEmptyTypeHint?: string, allowHosts?: string, allowHostsTypeHint?: string, allowHostsRegexp?: string, allowHostsRegexpTypeHint?: string, filterMethods?: string, filterMethodsTypeHint?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigApacheSlingReferrerFilterWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [allowEmpty]
     * @param [allowEmptyTypeHint]
     * @param [allowHosts]
     * @param [allowHostsTypeHint]
     * @param [allowHostsRegexp]
     * @param [allowHostsRegexpTypeHint]
     * @param [filterMethods]
     * @param [filterMethodsTypeHint]
     */
    public postConfigApacheSlingReferrerFilter(allowEmpty?: boolean, allowEmptyTypeHint?: string, allowHosts?: string, allowHostsTypeHint?: string, allowHostsRegexp?: string, allowHostsRegexpTypeHint?: string, filterMethods?: string, filterMethodsTypeHint?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigApacheSlingReferrerFilterWithHttpInfo(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param configNodeName
     */
    public postConfigPropertyWithHttpInfo(configNodeName: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postConfigProperty(configNodeName, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postConfigPropertyWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param configNodeName
     */
    public postConfigProperty(configNodeName: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postConfigPropertyWithHttpInfo(configNodeName, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param name
     * @param [operation]
     * @param [deleteAuthorizable]
     * @param [file]
     */
    public postNodeWithHttpInfo(path: string, name: string, operation?: string, deleteAuthorizable?: string, file?: HttpFile, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postNode(path, name, operation, deleteAuthorizable, file, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postNodeWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param name
     * @param [operation]
     * @param [deleteAuthorizable]
     * @param [file]
     */
    public postNode(path: string, name: string, operation?: string, deleteAuthorizable?: string, file?: HttpFile, _options?: ConfigurationOptions): Observable<void> {
        return this.postNodeWithHttpInfo(path, name, operation, deleteAuthorizable, file, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param name
     * @param [addMembers]
     */
    public postNodeRwWithHttpInfo(path: string, name: string, addMembers?: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postNodeRw(path, name, addMembers, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postNodeRwWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param name
     * @param [addMembers]
     */
    public postNodeRw(path: string, name: string, addMembers?: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postNodeRwWithHttpInfo(path, name, addMembers, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param jcrPrimaryType
     * @param name
     */
    public postPathWithHttpInfo(path: string, jcrPrimaryType: string, name: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postPath(path, jcrPrimaryType, name, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postPathWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param jcrPrimaryType
     * @param name
     */
    public postPath(path: string, jcrPrimaryType: string, name: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postPathWithHttpInfo(path, jcrPrimaryType, name, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public postQueryWithHttpInfo(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postQuery(path, pLimit, _1property, _1propertyValue, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postQueryWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public postQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postQueryWithHttpInfo(path, pLimit, _1property, _1propertyValue, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param ignoredeactivated
     * @param onlymodified
     * @param path
     * @param cmd
     */
    public postTreeActivationWithHttpInfo(ignoredeactivated: boolean, onlymodified: boolean, path: string, cmd: string, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postTreeActivation(ignoredeactivated, onlymodified, path, cmd, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postTreeActivationWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param ignoredeactivated
     * @param onlymodified
     * @param path
     * @param cmd
     */
    public postTreeActivation(ignoredeactivated: boolean, onlymodified: boolean, path: string, cmd: string, _options?: ConfigurationOptions): Observable<void> {
        return this.postTreeActivationWithHttpInfo(ignoredeactivated, onlymodified, path, cmd, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [operation]
     * @param [newPassword]
     * @param [rePassword]
     * @param [keyStoreType]
     * @param [removeAlias]
     * @param [certificate]
     */
    public postTruststoreWithHttpInfo(operation?: string, newPassword?: string, rePassword?: string, keyStoreType?: string, removeAlias?: string, certificate?: HttpFile, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postTruststoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [operation]
     * @param [newPassword]
     * @param [rePassword]
     * @param [keyStoreType]
     * @param [removeAlias]
     * @param [certificate]
     */
    public postTruststore(operation?: string, newPassword?: string, rePassword?: string, keyStoreType?: string, removeAlias?: string, certificate?: HttpFile, _options?: ConfigurationOptions): Observable<void> {
        return this.postTruststoreWithHttpInfo(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param [truststoreP12]
     */
    public postTruststorePKCS12WithHttpInfo(truststoreP12?: HttpFile, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.postTruststorePKCS12(truststoreP12, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.postTruststorePKCS12WithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [truststoreP12]
     */
    public postTruststorePKCS12(truststoreP12?: HttpFile, _options?: ConfigurationOptions): Observable<void> {
        return this.postTruststorePKCS12WithHttpInfo(truststoreP12, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}
