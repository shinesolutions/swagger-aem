import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, PromiseConfigurationOptions, wrapOptions } from '../configuration'
import { PromiseMiddleware, Middleware, PromiseMiddlewareWrapper } from '../middleware';

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
import { ObservableConsoleApi } from './ObservableAPI';

import { ConsoleApiRequestFactory, ConsoleApiResponseProcessor} from "../apis/ConsoleApi";
export class PromiseConsoleApi {
    private api: ObservableConsoleApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ConsoleApiRequestFactory,
        responseProcessor?: ConsoleApiResponseProcessor
    ) {
        this.api = new ObservableConsoleApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public getAemProductInfoWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAemProductInfoWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getAemProductInfo(_options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAemProductInfo(observableOptions);
        return result.toPromise();
    }

    /**
     * @param name
     */
    public getBundleInfoWithHttpInfo(name: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<BundleInfo>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getBundleInfoWithHttpInfo(name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param name
     */
    public getBundleInfo(name: string, _options?: PromiseConfigurationOptions): Promise<BundleInfo> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getBundleInfo(name, observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getConfigMgrWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<string>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getConfigMgrWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getConfigMgr(_options?: PromiseConfigurationOptions): Promise<string> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getConfigMgr(observableOptions);
        return result.toPromise();
    }

    /**
     * @param name
     * @param action
     */
    public postBundleWithHttpInfo(name: string, action: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postBundleWithHttpInfo(name, action, observableOptions);
        return result.toPromise();
    }

    /**
     * @param name
     * @param action
     */
    public postBundle(name: string, action: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postBundle(name, action, observableOptions);
        return result.toPromise();
    }

    /**
     * @param action
     */
    public postJmxRepositoryWithHttpInfo(action: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postJmxRepositoryWithHttpInfo(action, observableOptions);
        return result.toPromise();
    }

    /**
     * @param action
     */
    public postJmxRepository(action: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postJmxRepository(action, observableOptions);
        return result.toPromise();
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
    public postSamlConfigurationWithHttpInfo(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, _options?: PromiseConfigurationOptions): Promise<HttpInfo<SamlConfigurationInfo>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postSamlConfigurationWithHttpInfo(post, apply, _delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, observableOptions);
        return result.toPromise();
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
    public postSamlConfiguration(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, _options?: PromiseConfigurationOptions): Promise<SamlConfigurationInfo> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postSamlConfiguration(post, apply, _delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, observableOptions);
        return result.toPromise();
    }


}



import { ObservableCqApi } from './ObservableAPI';

import { CqApiRequestFactory, CqApiResponseProcessor} from "../apis/CqApi";
export class PromiseCqApi {
    private api: ObservableCqApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CqApiRequestFactory,
        responseProcessor?: CqApiResponseProcessor
    ) {
        this.api = new ObservableCqApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public getLoginPageWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getLoginPageWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getLoginPage(_options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getLoginPage(observableOptions);
        return result.toPromise();
    }

    /**
     * @param authorizableId
     * @param changelog
     */
    public postCqActionsWithHttpInfo(authorizableId: string, changelog: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postCqActionsWithHttpInfo(authorizableId, changelog, observableOptions);
        return result.toPromise();
    }

    /**
     * @param authorizableId
     * @param changelog
     */
    public postCqActions(authorizableId: string, changelog: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postCqActions(authorizableId, changelog, observableOptions);
        return result.toPromise();
    }


}



import { ObservableCrxApi } from './ObservableAPI';

import { CrxApiRequestFactory, CrxApiResponseProcessor} from "../apis/CrxApi";
export class PromiseCrxApi {
    private api: ObservableCrxApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CrxApiRequestFactory,
        responseProcessor?: CrxApiResponseProcessor
    ) {
        this.api = new ObservableCrxApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public getCrxdeStatusWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<string>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getCrxdeStatusWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getCrxdeStatus(_options?: PromiseConfigurationOptions): Promise<string> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getCrxdeStatus(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getInstallStatusWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<InstallStatus>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getInstallStatusWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getInstallStatus(_options?: PromiseConfigurationOptions): Promise<InstallStatus> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getInstallStatus(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getPackageManagerServletWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getPackageManagerServletWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getPackageManagerServlet(_options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getPackageManagerServlet(observableOptions);
        return result.toPromise();
    }

    /**
     * @param cmd
     */
    public postPackageServiceWithHttpInfo(cmd: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPackageServiceWithHttpInfo(cmd, observableOptions);
        return result.toPromise();
    }

    /**
     * @param cmd
     */
    public postPackageService(cmd: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPackageService(cmd, observableOptions);
        return result.toPromise();
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
    public postPackageServiceJsonWithHttpInfo(path: string, cmd: string, groupName?: string, packageName?: string, packageVersion?: string, charset?: string, force?: boolean, recursive?: boolean, _package?: HttpFile, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPackageServiceJsonWithHttpInfo(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package, observableOptions);
        return result.toPromise();
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
    public postPackageServiceJson(path: string, cmd: string, groupName?: string, packageName?: string, packageVersion?: string, charset?: string, force?: boolean, recursive?: boolean, _package?: HttpFile, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package, observableOptions);
        return result.toPromise();
    }

    /**
     * @param groupName
     * @param packageName
     * @param version
     * @param path
     * @param [filter]
     * @param [charset]
     */
    public postPackageUpdateWithHttpInfo(groupName: string, packageName: string, version: string, path: string, filter?: string, charset?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPackageUpdateWithHttpInfo(groupName, packageName, version, path, filter, charset, observableOptions);
        return result.toPromise();
    }

    /**
     * @param groupName
     * @param packageName
     * @param version
     * @param path
     * @param [filter]
     * @param [charset]
     */
    public postPackageUpdate(groupName: string, packageName: string, version: string, path: string, filter?: string, charset?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPackageUpdate(groupName, packageName, version, path, filter, charset, observableOptions);
        return result.toPromise();
    }

    /**
     * @param old
     * @param plain
     * @param verify
     */
    public postSetPasswordWithHttpInfo(old: string, plain: string, verify: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postSetPasswordWithHttpInfo(old, plain, verify, observableOptions);
        return result.toPromise();
    }

    /**
     * @param old
     * @param plain
     * @param verify
     */
    public postSetPassword(old: string, plain: string, verify: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postSetPassword(old, plain, verify, observableOptions);
        return result.toPromise();
    }


}



import { ObservableCustomApi } from './ObservableAPI';

import { CustomApiRequestFactory, CustomApiResponseProcessor} from "../apis/CustomApi";
export class PromiseCustomApi {
    private api: ObservableCustomApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CustomApiRequestFactory,
        responseProcessor?: CustomApiResponseProcessor
    ) {
        this.api = new ObservableCustomApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param [tags]
     * @param [combineTagsOr]
     */
    public getAemHealthCheckWithHttpInfo(tags?: string, combineTagsOr?: boolean, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAemHealthCheckWithHttpInfo(tags, combineTagsOr, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [tags]
     * @param [combineTagsOr]
     */
    public getAemHealthCheck(tags?: string, combineTagsOr?: boolean, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAemHealthCheck(tags, combineTagsOr, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [bundlesIgnored]
     * @param [bundlesIgnoredTypeHint]
     */
    public postConfigAemHealthCheckServletWithHttpInfo(bundlesIgnored?: Array<string>, bundlesIgnoredTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigAemHealthCheckServletWithHttpInfo(bundlesIgnored, bundlesIgnoredTypeHint, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [bundlesIgnored]
     * @param [bundlesIgnoredTypeHint]
     */
    public postConfigAemHealthCheckServlet(bundlesIgnored?: Array<string>, bundlesIgnoredTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [pwdresetAuthorizables]
     * @param [pwdresetAuthorizablesTypeHint]
     */
    public postConfigAemPasswordResetWithHttpInfo(pwdresetAuthorizables?: Array<string>, pwdresetAuthorizablesTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigAemPasswordResetWithHttpInfo(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [pwdresetAuthorizables]
     * @param [pwdresetAuthorizablesTypeHint]
     */
    public postConfigAemPasswordReset(pwdresetAuthorizables?: Array<string>, pwdresetAuthorizablesTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, observableOptions);
        return result.toPromise();
    }


}



import { ObservableGraniteApi } from './ObservableAPI';

import { GraniteApiRequestFactory, GraniteApiResponseProcessor} from "../apis/GraniteApi";
export class PromiseGraniteApi {
    private api: ObservableGraniteApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GraniteApiRequestFactory,
        responseProcessor?: GraniteApiResponseProcessor
    ) {
        this.api = new ObservableGraniteApi(configuration, requestFactory, responseProcessor);
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
    public sslSetupWithHttpInfo(keystorePassword: string, keystorePasswordConfirm: string, truststorePassword: string, truststorePasswordConfirm: string, httpsHostname: string, httpsPort: string, privatekeyFile?: HttpFile, certificateFile?: HttpFile, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.sslSetupWithHttpInfo(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, observableOptions);
        return result.toPromise();
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
    public sslSetup(keystorePassword: string, keystorePasswordConfirm: string, truststorePassword: string, truststorePasswordConfirm: string, httpsHostname: string, httpsPort: string, privatekeyFile?: HttpFile, certificateFile?: HttpFile, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, observableOptions);
        return result.toPromise();
    }


}



import { ObservableSlingApi } from './ObservableAPI';

import { SlingApiRequestFactory, SlingApiResponseProcessor} from "../apis/SlingApi";
export class PromiseSlingApi {
    private api: ObservableSlingApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SlingApiRequestFactory,
        responseProcessor?: SlingApiResponseProcessor
    ) {
        this.api = new ObservableSlingApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param runmode
     * @param name
     */
    public deleteAgentWithHttpInfo(runmode: string, name: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.deleteAgentWithHttpInfo(runmode, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param runmode
     * @param name
     */
    public deleteAgent(runmode: string, name: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.deleteAgent(runmode, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     */
    public deleteNodeWithHttpInfo(path: string, name: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.deleteNodeWithHttpInfo(path, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     */
    public deleteNode(path: string, name: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.deleteNode(path, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param runmode
     * @param name
     */
    public getAgentWithHttpInfo(runmode: string, name: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAgentWithHttpInfo(runmode, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param runmode
     * @param name
     */
    public getAgent(runmode: string, name: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAgent(runmode, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param runmode
     */
    public getAgentsWithHttpInfo(runmode: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAgentsWithHttpInfo(runmode, observableOptions);
        return result.toPromise();
    }

    /**
     * @param runmode
     */
    public getAgents(runmode: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAgents(runmode, observableOptions);
        return result.toPromise();
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getAuthorizableKeystoreWithHttpInfo(intermediatePath: string, authorizableId: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<KeystoreInfo>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId, observableOptions);
        return result.toPromise();
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getAuthorizableKeystore(intermediatePath: string, authorizableId: string, _options?: PromiseConfigurationOptions): Promise<KeystoreInfo> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getAuthorizableKeystore(intermediatePath, authorizableId, observableOptions);
        return result.toPromise();
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getKeystoreWithHttpInfo(intermediatePath: string, authorizableId: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getKeystoreWithHttpInfo(intermediatePath, authorizableId, observableOptions);
        return result.toPromise();
    }

    /**
     * @param intermediatePath
     * @param authorizableId
     */
    public getKeystore(intermediatePath: string, authorizableId: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getKeystore(intermediatePath, authorizableId, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     */
    public getNodeWithHttpInfo(path: string, name: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getNodeWithHttpInfo(path, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     */
    public getNode(path: string, name: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getNode(path, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackageWithHttpInfo(group: string, name: string, version: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getPackageWithHttpInfo(group, name, version, observableOptions);
        return result.toPromise();
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackage(group: string, name: string, version: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getPackage(group, name, version, observableOptions);
        return result.toPromise();
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackageFilterWithHttpInfo(group: string, name: string, version: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getPackageFilterWithHttpInfo(group, name, version, observableOptions);
        return result.toPromise();
    }

    /**
     * @param group
     * @param name
     * @param version
     */
    public getPackageFilter(group: string, name: string, version: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getPackageFilter(group, name, version, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public getQueryWithHttpInfo(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getQueryWithHttpInfo(path, pLimit, _1property, _1propertyValue, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public getQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getQuery(path, pLimit, _1property, _1propertyValue, observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getTruststoreWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getTruststoreWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getTruststore(_options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getTruststore(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getTruststoreInfoWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<TruststoreInfo>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getTruststoreInfoWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     */
    public getTruststoreInfo(_options?: PromiseConfigurationOptions): Promise<TruststoreInfo> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getTruststoreInfo(observableOptions);
        return result.toPromise();
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
    public postAgentWithHttpInfo(runmode: string, name: string, jcrContentCqDistribute?: boolean, jcrContentCqDistributeTypeHint?: string, jcrContentCqName?: string, jcrContentCqTemplate?: string, jcrContentAliasUpdate?: boolean, jcrContentEnabled?: boolean, jcrContentJcrDescription?: string, jcrContentJcrLastModified?: string, jcrContentJcrLastModifiedBy?: string, jcrContentJcrMixinTypes?: string, jcrContentJcrTitle?: string, jcrContentLogLevel?: string, jcrContentNoStatusUpdate?: boolean, jcrContentNoVersioning?: boolean, jcrContentProtocolConnectTimeout?: number, jcrContentProtocolHTTPConnectionClosed?: boolean, jcrContentProtocolHTTPExpired?: string, jcrContentProtocolHTTPHeaders?: Array<string>, jcrContentProtocolHTTPHeadersTypeHint?: string, jcrContentProtocolHTTPMethod?: string, jcrContentProtocolHTTPSRelaxed?: boolean, jcrContentProtocolInterface?: string, jcrContentProtocolSocketTimeout?: number, jcrContentProtocolVersion?: string, jcrContentProxyNTLMDomain?: string, jcrContentProxyNTLMHost?: string, jcrContentProxyHost?: string, jcrContentProxyPassword?: string, jcrContentProxyPort?: number, jcrContentProxyUser?: string, jcrContentQueueBatchMaxSize?: number, jcrContentQueueBatchMode?: string, jcrContentQueueBatchWaitTime?: number, jcrContentRetryDelay?: string, jcrContentReverseReplication?: boolean, jcrContentSerializationType?: string, jcrContentSlingResourceType?: string, jcrContentSsl?: string, jcrContentTransportNTLMDomain?: string, jcrContentTransportNTLMHost?: string, jcrContentTransportPassword?: string, jcrContentTransportUri?: string, jcrContentTransportUser?: string, jcrContentTriggerDistribute?: boolean, jcrContentTriggerModified?: boolean, jcrContentTriggerOnOffTime?: boolean, jcrContentTriggerReceive?: boolean, jcrContentTriggerSpecific?: boolean, jcrContentUserId?: string, jcrPrimaryType?: string, operation?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postAgentWithHttpInfo(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation, observableOptions);
        return result.toPromise();
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
    public postAgent(runmode: string, name: string, jcrContentCqDistribute?: boolean, jcrContentCqDistributeTypeHint?: string, jcrContentCqName?: string, jcrContentCqTemplate?: string, jcrContentAliasUpdate?: boolean, jcrContentEnabled?: boolean, jcrContentJcrDescription?: string, jcrContentJcrLastModified?: string, jcrContentJcrLastModifiedBy?: string, jcrContentJcrMixinTypes?: string, jcrContentJcrTitle?: string, jcrContentLogLevel?: string, jcrContentNoStatusUpdate?: boolean, jcrContentNoVersioning?: boolean, jcrContentProtocolConnectTimeout?: number, jcrContentProtocolHTTPConnectionClosed?: boolean, jcrContentProtocolHTTPExpired?: string, jcrContentProtocolHTTPHeaders?: Array<string>, jcrContentProtocolHTTPHeadersTypeHint?: string, jcrContentProtocolHTTPMethod?: string, jcrContentProtocolHTTPSRelaxed?: boolean, jcrContentProtocolInterface?: string, jcrContentProtocolSocketTimeout?: number, jcrContentProtocolVersion?: string, jcrContentProxyNTLMDomain?: string, jcrContentProxyNTLMHost?: string, jcrContentProxyHost?: string, jcrContentProxyPassword?: string, jcrContentProxyPort?: number, jcrContentProxyUser?: string, jcrContentQueueBatchMaxSize?: number, jcrContentQueueBatchMode?: string, jcrContentQueueBatchWaitTime?: number, jcrContentRetryDelay?: string, jcrContentReverseReplication?: boolean, jcrContentSerializationType?: string, jcrContentSlingResourceType?: string, jcrContentSsl?: string, jcrContentTransportNTLMDomain?: string, jcrContentTransportNTLMHost?: string, jcrContentTransportPassword?: string, jcrContentTransportUri?: string, jcrContentTransportUser?: string, jcrContentTriggerDistribute?: boolean, jcrContentTriggerModified?: boolean, jcrContentTriggerOnOffTime?: boolean, jcrContentTriggerReceive?: boolean, jcrContentTriggerSpecific?: boolean, jcrContentUserId?: string, jcrPrimaryType?: string, operation?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation, observableOptions);
        return result.toPromise();
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
    public postAuthorizableKeystoreWithHttpInfo(intermediatePath: string, authorizableId: string, operation?: string, currentPassword?: string, newPassword?: string, rePassword?: string, keyPassword?: string, keyStorePass?: string, alias?: string, newAlias?: string, removeAlias?: string, certChain?: HttpFile, pk?: HttpFile, keyStore?: HttpFile, _options?: PromiseConfigurationOptions): Promise<HttpInfo<KeystoreInfo>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, observableOptions);
        return result.toPromise();
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
    public postAuthorizableKeystore(intermediatePath: string, authorizableId: string, operation?: string, currentPassword?: string, newPassword?: string, rePassword?: string, keyPassword?: string, keyStorePass?: string, alias?: string, newAlias?: string, removeAlias?: string, certChain?: HttpFile, pk?: HttpFile, keyStore?: HttpFile, _options?: PromiseConfigurationOptions): Promise<KeystoreInfo> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, observableOptions);
        return result.toPromise();
    }

    /**
     * @param authorizableId
     * @param intermediatePath
     * @param [createUser]
     * @param [createGroup]
     * @param [repPassword]
     * @param [profileGivenName]
     */
    public postAuthorizablesWithHttpInfo(authorizableId: string, intermediatePath: string, createUser?: string, createGroup?: string, repPassword?: string, profileGivenName?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postAuthorizablesWithHttpInfo(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName, observableOptions);
        return result.toPromise();
    }

    /**
     * @param authorizableId
     * @param intermediatePath
     * @param [createUser]
     * @param [createGroup]
     * @param [repPassword]
     * @param [profileGivenName]
     */
    public postAuthorizables(authorizableId: string, intermediatePath: string, createUser?: string, createGroup?: string, repPassword?: string, profileGivenName?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName, observableOptions);
        return result.toPromise();
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
    public postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(keyStorePassword?: string, keyStorePasswordTypeHint?: string, serviceRanking?: number, serviceRankingTypeHint?: string, idpHttpRedirect?: boolean, idpHttpRedirectTypeHint?: string, createUser?: boolean, createUserTypeHint?: string, defaultRedirectUrl?: string, defaultRedirectUrlTypeHint?: string, userIDAttribute?: string, userIDAttributeTypeHint?: string, defaultGroups?: Array<string>, defaultGroupsTypeHint?: string, idpCertAlias?: string, idpCertAliasTypeHint?: string, addGroupMemberships?: boolean, addGroupMembershipsTypeHint?: string, path?: Array<string>, pathTypeHint?: string, synchronizeAttributes?: Array<string>, synchronizeAttributesTypeHint?: string, clockTolerance?: number, clockToleranceTypeHint?: string, groupMembershipAttribute?: string, groupMembershipAttributeTypeHint?: string, idpUrl?: string, idpUrlTypeHint?: string, logoutUrl?: string, logoutUrlTypeHint?: string, serviceProviderEntityId?: string, serviceProviderEntityIdTypeHint?: string, assertionConsumerServiceURL?: string, assertionConsumerServiceURLTypeHint?: string, handleLogout?: boolean, handleLogoutTypeHint?: string, spPrivateKeyAlias?: string, spPrivateKeyAliasTypeHint?: string, useEncryption?: boolean, useEncryptionTypeHint?: string, nameIdFormat?: string, nameIdFormatTypeHint?: string, digestMethod?: string, digestMethodTypeHint?: string, signatureMethod?: string, signatureMethodTypeHint?: string, userIntermediatePath?: string, userIntermediatePathTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword?: string, keyStorePasswordTypeHint?: string, serviceRanking?: number, serviceRankingTypeHint?: string, idpHttpRedirect?: boolean, idpHttpRedirectTypeHint?: string, createUser?: boolean, createUserTypeHint?: string, defaultRedirectUrl?: string, defaultRedirectUrlTypeHint?: string, userIDAttribute?: string, userIDAttributeTypeHint?: string, defaultGroups?: Array<string>, defaultGroupsTypeHint?: string, idpCertAlias?: string, idpCertAliasTypeHint?: string, addGroupMemberships?: boolean, addGroupMembershipsTypeHint?: string, path?: Array<string>, pathTypeHint?: string, synchronizeAttributes?: Array<string>, synchronizeAttributesTypeHint?: string, clockTolerance?: number, clockToleranceTypeHint?: string, groupMembershipAttribute?: string, groupMembershipAttributeTypeHint?: string, idpUrl?: string, idpUrlTypeHint?: string, logoutUrl?: string, logoutUrlTypeHint?: string, serviceProviderEntityId?: string, serviceProviderEntityIdTypeHint?: string, assertionConsumerServiceURL?: string, assertionConsumerServiceURLTypeHint?: string, handleLogout?: boolean, handleLogoutTypeHint?: string, spPrivateKeyAlias?: string, spPrivateKeyAliasTypeHint?: string, useEncryption?: boolean, useEncryptionTypeHint?: string, nameIdFormat?: string, nameIdFormatTypeHint?: string, digestMethod?: string, digestMethodTypeHint?: string, signatureMethod?: string, signatureMethodTypeHint?: string, userIntermediatePath?: string, userIntermediatePathTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(orgApacheFelixHttpsNio?: boolean, orgApacheFelixHttpsNioTypeHint?: string, orgApacheFelixHttpsKeystore?: string, orgApacheFelixHttpsKeystoreTypeHint?: string, orgApacheFelixHttpsKeystorePassword?: string, orgApacheFelixHttpsKeystorePasswordTypeHint?: string, orgApacheFelixHttpsKeystoreKey?: string, orgApacheFelixHttpsKeystoreKeyTypeHint?: string, orgApacheFelixHttpsKeystoreKeyPassword?: string, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint?: string, orgApacheFelixHttpsTruststore?: string, orgApacheFelixHttpsTruststoreTypeHint?: string, orgApacheFelixHttpsTruststorePassword?: string, orgApacheFelixHttpsTruststorePasswordTypeHint?: string, orgApacheFelixHttpsClientcertificate?: string, orgApacheFelixHttpsClientcertificateTypeHint?: string, orgApacheFelixHttpsEnable?: boolean, orgApacheFelixHttpsEnableTypeHint?: string, orgOsgiServiceHttpPortSecure?: string, orgOsgiServiceHttpPortSecureTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio?: boolean, orgApacheFelixHttpsNioTypeHint?: string, orgApacheFelixHttpsKeystore?: string, orgApacheFelixHttpsKeystoreTypeHint?: string, orgApacheFelixHttpsKeystorePassword?: string, orgApacheFelixHttpsKeystorePasswordTypeHint?: string, orgApacheFelixHttpsKeystoreKey?: string, orgApacheFelixHttpsKeystoreKeyTypeHint?: string, orgApacheFelixHttpsKeystoreKeyPassword?: string, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint?: string, orgApacheFelixHttpsTruststore?: string, orgApacheFelixHttpsTruststoreTypeHint?: string, orgApacheFelixHttpsTruststorePassword?: string, orgApacheFelixHttpsTruststorePasswordTypeHint?: string, orgApacheFelixHttpsClientcertificate?: string, orgApacheFelixHttpsClientcertificateTypeHint?: string, orgApacheFelixHttpsEnable?: boolean, orgApacheFelixHttpsEnableTypeHint?: string, orgOsgiServiceHttpPortSecure?: string, orgOsgiServiceHttpPortSecureTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(proxyHost?: string, proxyHostTypeHint?: string, proxyPort?: number, proxyPortTypeHint?: string, proxyExceptions?: Array<string>, proxyExceptionsTypeHint?: string, proxyEnabled?: boolean, proxyEnabledTypeHint?: string, proxyUser?: string, proxyUserTypeHint?: string, proxyPassword?: string, proxyPasswordTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheHttpComponentsProxyConfiguration(proxyHost?: string, proxyHostTypeHint?: string, proxyPort?: number, proxyPortTypeHint?: string, proxyExceptions?: Array<string>, proxyExceptionsTypeHint?: string, proxyEnabled?: boolean, proxyEnabledTypeHint?: string, proxyUser?: string, proxyUserTypeHint?: string, proxyPassword?: string, proxyPasswordTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [alias]
     * @param [aliasTypeHint]
     * @param [davCreateAbsoluteUri]
     * @param [davCreateAbsoluteUriTypeHint]
     */
    public postConfigApacheSlingDavExServletWithHttpInfo(alias?: string, aliasTypeHint?: string, davCreateAbsoluteUri?: boolean, davCreateAbsoluteUriTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheSlingDavExServletWithHttpInfo(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [alias]
     * @param [aliasTypeHint]
     * @param [davCreateAbsoluteUri]
     * @param [davCreateAbsoluteUriTypeHint]
     */
    public postConfigApacheSlingDavExServlet(alias?: string, aliasTypeHint?: string, davCreateAbsoluteUri?: boolean, davCreateAbsoluteUriTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheSlingGetServletWithHttpInfo(jsonMaximumresults?: string, jsonMaximumresultsTypeHint?: string, enableHtml?: boolean, enableHtmlTypeHint?: string, enableTxt?: boolean, enableTxtTypeHint?: string, enableXml?: boolean, enableXmlTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheSlingGetServletWithHttpInfo(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheSlingGetServlet(jsonMaximumresults?: string, jsonMaximumresultsTypeHint?: string, enableHtml?: boolean, enableHtmlTypeHint?: string, enableTxt?: boolean, enableTxtTypeHint?: string, enableXml?: boolean, enableXmlTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheSlingReferrerFilterWithHttpInfo(allowEmpty?: boolean, allowEmptyTypeHint?: string, allowHosts?: string, allowHostsTypeHint?: string, allowHostsRegexp?: string, allowHostsRegexpTypeHint?: string, filterMethods?: string, filterMethodsTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheSlingReferrerFilterWithHttpInfo(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint, observableOptions);
        return result.toPromise();
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
    public postConfigApacheSlingReferrerFilter(allowEmpty?: boolean, allowEmptyTypeHint?: string, allowHosts?: string, allowHostsTypeHint?: string, allowHostsRegexp?: string, allowHostsRegexpTypeHint?: string, filterMethods?: string, filterMethodsTypeHint?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint, observableOptions);
        return result.toPromise();
    }

    /**
     * @param configNodeName
     */
    public postConfigPropertyWithHttpInfo(configNodeName: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigPropertyWithHttpInfo(configNodeName, observableOptions);
        return result.toPromise();
    }

    /**
     * @param configNodeName
     */
    public postConfigProperty(configNodeName: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postConfigProperty(configNodeName, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     * @param [operation]
     * @param [deleteAuthorizable]
     * @param [file]
     */
    public postNodeWithHttpInfo(path: string, name: string, operation?: string, deleteAuthorizable?: string, file?: HttpFile, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postNodeWithHttpInfo(path, name, operation, deleteAuthorizable, file, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     * @param [operation]
     * @param [deleteAuthorizable]
     * @param [file]
     */
    public postNode(path: string, name: string, operation?: string, deleteAuthorizable?: string, file?: HttpFile, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postNode(path, name, operation, deleteAuthorizable, file, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     * @param [addMembers]
     */
    public postNodeRwWithHttpInfo(path: string, name: string, addMembers?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postNodeRwWithHttpInfo(path, name, addMembers, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param name
     * @param [addMembers]
     */
    public postNodeRw(path: string, name: string, addMembers?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postNodeRw(path, name, addMembers, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param jcrPrimaryType
     * @param name
     */
    public postPathWithHttpInfo(path: string, jcrPrimaryType: string, name: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPathWithHttpInfo(path, jcrPrimaryType, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param jcrPrimaryType
     * @param name
     */
    public postPath(path: string, jcrPrimaryType: string, name: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postPath(path, jcrPrimaryType, name, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public postQueryWithHttpInfo(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postQueryWithHttpInfo(path, pLimit, _1property, _1propertyValue, observableOptions);
        return result.toPromise();
    }

    /**
     * @param path
     * @param pLimit
     * @param _1property
     * @param _1propertyValue
     */
    public postQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postQuery(path, pLimit, _1property, _1propertyValue, observableOptions);
        return result.toPromise();
    }

    /**
     * @param ignoredeactivated
     * @param onlymodified
     * @param path
     * @param cmd
     */
    public postTreeActivationWithHttpInfo(ignoredeactivated: boolean, onlymodified: boolean, path: string, cmd: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postTreeActivationWithHttpInfo(ignoredeactivated, onlymodified, path, cmd, observableOptions);
        return result.toPromise();
    }

    /**
     * @param ignoredeactivated
     * @param onlymodified
     * @param path
     * @param cmd
     */
    public postTreeActivation(ignoredeactivated: boolean, onlymodified: boolean, path: string, cmd: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postTreeActivation(ignoredeactivated, onlymodified, path, cmd, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [operation]
     * @param [newPassword]
     * @param [rePassword]
     * @param [keyStoreType]
     * @param [removeAlias]
     * @param [certificate]
     */
    public postTruststoreWithHttpInfo(operation?: string, newPassword?: string, rePassword?: string, keyStoreType?: string, removeAlias?: string, certificate?: HttpFile, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postTruststoreWithHttpInfo(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [operation]
     * @param [newPassword]
     * @param [rePassword]
     * @param [keyStoreType]
     * @param [removeAlias]
     * @param [certificate]
     */
    public postTruststore(operation?: string, newPassword?: string, rePassword?: string, keyStoreType?: string, removeAlias?: string, certificate?: HttpFile, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [truststoreP12]
     */
    public postTruststorePKCS12WithHttpInfo(truststoreP12?: HttpFile, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postTruststorePKCS12WithHttpInfo(truststoreP12, observableOptions);
        return result.toPromise();
    }

    /**
     * @param [truststoreP12]
     */
    public postTruststorePKCS12(truststoreP12?: HttpFile, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.postTruststorePKCS12(truststoreP12, observableOptions);
        return result.toPromise();
    }


}



