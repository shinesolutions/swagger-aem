import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

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

import { ObservableConsoleApi } from "./ObservableAPI";
import { ConsoleApiRequestFactory, ConsoleApiResponseProcessor} from "../apis/ConsoleApi";

export interface ConsoleApiGetAemProductInfoRequest {
}

export interface ConsoleApiGetBundleInfoRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApigetBundleInfo
     */
    name: string
}

export interface ConsoleApiGetConfigMgrRequest {
}

export interface ConsoleApiPostBundleRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostBundle
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostBundle
     */
    action: string
}

export interface ConsoleApiPostJmxRepositoryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostJmxRepository
     */
    action: string
}

export interface ConsoleApiPostSamlConfigurationRequest {
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    post?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    apply?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    _delete?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    action?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    location?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ConsoleApipostSamlConfiguration
     */
    path?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ConsoleApipostSamlConfiguration
     */
    serviceRanking?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    idpUrl?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    idpCertAlias?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    idpHttpRedirect?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    serviceProviderEntityId?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    assertionConsumerServiceURL?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    spPrivateKeyAlias?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    keyStorePassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    defaultRedirectUrl?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    userIDAttribute?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    useEncryption?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    createUser?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    addGroupMemberships?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    groupMembershipAttribute?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ConsoleApipostSamlConfiguration
     */
    defaultGroups?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    nameIdFormat?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ConsoleApipostSamlConfiguration
     */
    synchronizeAttributes?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof ConsoleApipostSamlConfiguration
     */
    handleLogout?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    logoutUrl?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ConsoleApipostSamlConfiguration
     */
    clockTolerance?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    digestMethod?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    signatureMethod?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ConsoleApipostSamlConfiguration
     */
    userIntermediatePath?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ConsoleApipostSamlConfiguration
     */
    propertylist?: Array<string>
}

export class ObjectConsoleApi {
    private api: ObservableConsoleApi

    public constructor(configuration: Configuration, requestFactory?: ConsoleApiRequestFactory, responseProcessor?: ConsoleApiResponseProcessor) {
        this.api = new ObservableConsoleApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public getAemProductInfoWithHttpInfo(param: ConsoleApiGetAemProductInfoRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getAemProductInfoWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAemProductInfo(param: ConsoleApiGetAemProductInfoRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.getAemProductInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getBundleInfoWithHttpInfo(param: ConsoleApiGetBundleInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<BundleInfo>> {
        return this.api.getBundleInfoWithHttpInfo(param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getBundleInfo(param: ConsoleApiGetBundleInfoRequest, options?: ConfigurationOptions): Promise<BundleInfo> {
        return this.api.getBundleInfo(param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getConfigMgrWithHttpInfo(param: ConsoleApiGetConfigMgrRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<string>> {
        return this.api.getConfigMgrWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getConfigMgr(param: ConsoleApiGetConfigMgrRequest = {}, options?: ConfigurationOptions): Promise<string> {
        return this.api.getConfigMgr( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postBundleWithHttpInfo(param: ConsoleApiPostBundleRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postBundleWithHttpInfo(param.name, param.action,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postBundle(param: ConsoleApiPostBundleRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postBundle(param.name, param.action,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postJmxRepositoryWithHttpInfo(param: ConsoleApiPostJmxRepositoryRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postJmxRepositoryWithHttpInfo(param.action,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postJmxRepository(param: ConsoleApiPostJmxRepositoryRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postJmxRepository(param.action,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postSamlConfigurationWithHttpInfo(param: ConsoleApiPostSamlConfigurationRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<SamlConfigurationInfo>> {
        return this.api.postSamlConfigurationWithHttpInfo(param.post, param.apply, param._delete, param.action, param.location, param.path, param.serviceRanking, param.idpUrl, param.idpCertAlias, param.idpHttpRedirect, param.serviceProviderEntityId, param.assertionConsumerServiceURL, param.spPrivateKeyAlias, param.keyStorePassword, param.defaultRedirectUrl, param.userIDAttribute, param.useEncryption, param.createUser, param.addGroupMemberships, param.groupMembershipAttribute, param.defaultGroups, param.nameIdFormat, param.synchronizeAttributes, param.handleLogout, param.logoutUrl, param.clockTolerance, param.digestMethod, param.signatureMethod, param.userIntermediatePath, param.propertylist,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postSamlConfiguration(param: ConsoleApiPostSamlConfigurationRequest = {}, options?: ConfigurationOptions): Promise<SamlConfigurationInfo> {
        return this.api.postSamlConfiguration(param.post, param.apply, param._delete, param.action, param.location, param.path, param.serviceRanking, param.idpUrl, param.idpCertAlias, param.idpHttpRedirect, param.serviceProviderEntityId, param.assertionConsumerServiceURL, param.spPrivateKeyAlias, param.keyStorePassword, param.defaultRedirectUrl, param.userIDAttribute, param.useEncryption, param.createUser, param.addGroupMemberships, param.groupMembershipAttribute, param.defaultGroups, param.nameIdFormat, param.synchronizeAttributes, param.handleLogout, param.logoutUrl, param.clockTolerance, param.digestMethod, param.signatureMethod, param.userIntermediatePath, param.propertylist,  options).toPromise();
    }

}

import { ObservableCqApi } from "./ObservableAPI";
import { CqApiRequestFactory, CqApiResponseProcessor} from "../apis/CqApi";

export interface CqApiGetLoginPageRequest {
}

export interface CqApiPostCqActionsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CqApipostCqActions
     */
    authorizableId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CqApipostCqActions
     */
    changelog: string
}

export class ObjectCqApi {
    private api: ObservableCqApi

    public constructor(configuration: Configuration, requestFactory?: CqApiRequestFactory, responseProcessor?: CqApiResponseProcessor) {
        this.api = new ObservableCqApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public getLoginPageWithHttpInfo(param: CqApiGetLoginPageRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getLoginPageWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getLoginPage(param: CqApiGetLoginPageRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.getLoginPage( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postCqActionsWithHttpInfo(param: CqApiPostCqActionsRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postCqActionsWithHttpInfo(param.authorizableId, param.changelog,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postCqActions(param: CqApiPostCqActionsRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postCqActions(param.authorizableId, param.changelog,  options).toPromise();
    }

}

import { ObservableCrxApi } from "./ObservableAPI";
import { CrxApiRequestFactory, CrxApiResponseProcessor} from "../apis/CrxApi";

export interface CrxApiGetCrxdeStatusRequest {
}

export interface CrxApiGetInstallStatusRequest {
}

export interface CrxApiGetPackageManagerServletRequest {
}

export interface CrxApiPostPackageServiceRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageService
     */
    cmd: string
}

export interface CrxApiPostPackageServiceJsonRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageServiceJson
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageServiceJson
     */
    cmd: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageServiceJson
     */
    groupName?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageServiceJson
     */
    packageName?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageServiceJson
     */
    packageVersion?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageServiceJson
     */
    charset?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof CrxApipostPackageServiceJson
     */
    force?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof CrxApipostPackageServiceJson
     */
    recursive?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof CrxApipostPackageServiceJson
     */
    _package?: HttpFile
}

export interface CrxApiPostPackageUpdateRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageUpdate
     */
    groupName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageUpdate
     */
    packageName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageUpdate
     */
    version: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageUpdate
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageUpdate
     */
    filter?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostPackageUpdate
     */
    charset?: string
}

export interface CrxApiPostSetPasswordRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostSetPassword
     */
    old: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostSetPassword
     */
    plain: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CrxApipostSetPassword
     */
    verify: string
}

export class ObjectCrxApi {
    private api: ObservableCrxApi

    public constructor(configuration: Configuration, requestFactory?: CrxApiRequestFactory, responseProcessor?: CrxApiResponseProcessor) {
        this.api = new ObservableCrxApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public getCrxdeStatusWithHttpInfo(param: CrxApiGetCrxdeStatusRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<string>> {
        return this.api.getCrxdeStatusWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getCrxdeStatus(param: CrxApiGetCrxdeStatusRequest = {}, options?: ConfigurationOptions): Promise<string> {
        return this.api.getCrxdeStatus( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getInstallStatusWithHttpInfo(param: CrxApiGetInstallStatusRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<InstallStatus>> {
        return this.api.getInstallStatusWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getInstallStatus(param: CrxApiGetInstallStatusRequest = {}, options?: ConfigurationOptions): Promise<InstallStatus> {
        return this.api.getInstallStatus( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getPackageManagerServletWithHttpInfo(param: CrxApiGetPackageManagerServletRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getPackageManagerServletWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getPackageManagerServlet(param: CrxApiGetPackageManagerServletRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.getPackageManagerServlet( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPackageServiceWithHttpInfo(param: CrxApiPostPackageServiceRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postPackageServiceWithHttpInfo(param.cmd,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPackageService(param: CrxApiPostPackageServiceRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postPackageService(param.cmd,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPackageServiceJsonWithHttpInfo(param: CrxApiPostPackageServiceJsonRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postPackageServiceJsonWithHttpInfo(param.path, param.cmd, param.groupName, param.packageName, param.packageVersion, param.charset, param.force, param.recursive, param._package,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPackageServiceJson(param: CrxApiPostPackageServiceJsonRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postPackageServiceJson(param.path, param.cmd, param.groupName, param.packageName, param.packageVersion, param.charset, param.force, param.recursive, param._package,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPackageUpdateWithHttpInfo(param: CrxApiPostPackageUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postPackageUpdateWithHttpInfo(param.groupName, param.packageName, param.version, param.path, param.filter, param.charset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPackageUpdate(param: CrxApiPostPackageUpdateRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postPackageUpdate(param.groupName, param.packageName, param.version, param.path, param.filter, param.charset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postSetPasswordWithHttpInfo(param: CrxApiPostSetPasswordRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postSetPasswordWithHttpInfo(param.old, param.plain, param.verify,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postSetPassword(param: CrxApiPostSetPasswordRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postSetPassword(param.old, param.plain, param.verify,  options).toPromise();
    }

}

import { ObservableCustomApi } from "./ObservableAPI";
import { CustomApiRequestFactory, CustomApiResponseProcessor} from "../apis/CustomApi";

export interface CustomApiGetAemHealthCheckRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CustomApigetAemHealthCheck
     */
    tags?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof CustomApigetAemHealthCheck
     */
    combineTagsOr?: boolean
}

export interface CustomApiPostConfigAemHealthCheckServletRequest {
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CustomApipostConfigAemHealthCheckServlet
     */
    bundlesIgnored?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CustomApipostConfigAemHealthCheckServlet
     */
    bundlesIgnoredTypeHint?: string
}

export interface CustomApiPostConfigAemPasswordResetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CustomApipostConfigAemPasswordReset
     */
    pwdresetAuthorizables?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof CustomApipostConfigAemPasswordReset
     */
    pwdresetAuthorizablesTypeHint?: string
}

export class ObjectCustomApi {
    private api: ObservableCustomApi

    public constructor(configuration: Configuration, requestFactory?: CustomApiRequestFactory, responseProcessor?: CustomApiResponseProcessor) {
        this.api = new ObservableCustomApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public getAemHealthCheckWithHttpInfo(param: CustomApiGetAemHealthCheckRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getAemHealthCheckWithHttpInfo(param.tags, param.combineTagsOr,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAemHealthCheck(param: CustomApiGetAemHealthCheckRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.getAemHealthCheck(param.tags, param.combineTagsOr,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigAemHealthCheckServletWithHttpInfo(param: CustomApiPostConfigAemHealthCheckServletRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigAemHealthCheckServletWithHttpInfo(param.bundlesIgnored, param.bundlesIgnoredTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigAemHealthCheckServlet(param: CustomApiPostConfigAemHealthCheckServletRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigAemHealthCheckServlet(param.bundlesIgnored, param.bundlesIgnoredTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigAemPasswordResetWithHttpInfo(param: CustomApiPostConfigAemPasswordResetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigAemPasswordResetWithHttpInfo(param.pwdresetAuthorizables, param.pwdresetAuthorizablesTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigAemPasswordReset(param: CustomApiPostConfigAemPasswordResetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigAemPasswordReset(param.pwdresetAuthorizables, param.pwdresetAuthorizablesTypeHint,  options).toPromise();
    }

}

import { ObservableGraniteApi } from "./ObservableAPI";
import { GraniteApiRequestFactory, GraniteApiResponseProcessor} from "../apis/GraniteApi";

export interface GraniteApiSslSetupRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof GraniteApisslSetup
     */
    keystorePassword: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof GraniteApisslSetup
     */
    keystorePasswordConfirm: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof GraniteApisslSetup
     */
    truststorePassword: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof GraniteApisslSetup
     */
    truststorePasswordConfirm: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof GraniteApisslSetup
     */
    httpsHostname: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof GraniteApisslSetup
     */
    httpsPort: string
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof GraniteApisslSetup
     */
    privatekeyFile?: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof GraniteApisslSetup
     */
    certificateFile?: HttpFile
}

export class ObjectGraniteApi {
    private api: ObservableGraniteApi

    public constructor(configuration: Configuration, requestFactory?: GraniteApiRequestFactory, responseProcessor?: GraniteApiResponseProcessor) {
        this.api = new ObservableGraniteApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public sslSetupWithHttpInfo(param: GraniteApiSslSetupRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.sslSetupWithHttpInfo(param.keystorePassword, param.keystorePasswordConfirm, param.truststorePassword, param.truststorePasswordConfirm, param.httpsHostname, param.httpsPort, param.privatekeyFile, param.certificateFile,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public sslSetup(param: GraniteApiSslSetupRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.sslSetup(param.keystorePassword, param.keystorePasswordConfirm, param.truststorePassword, param.truststorePasswordConfirm, param.httpsHostname, param.httpsPort, param.privatekeyFile, param.certificateFile,  options).toPromise();
    }

}

import { ObservableSlingApi } from "./ObservableAPI";
import { SlingApiRequestFactory, SlingApiResponseProcessor} from "../apis/SlingApi";

export interface SlingApiDeleteAgentRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApideleteAgent
     */
    runmode: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApideleteAgent
     */
    name: string
}

export interface SlingApiDeleteNodeRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApideleteNode
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApideleteNode
     */
    name: string
}

export interface SlingApiGetAgentRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetAgent
     */
    runmode: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetAgent
     */
    name: string
}

export interface SlingApiGetAgentsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetAgents
     */
    runmode: string
}

export interface SlingApiGetAuthorizableKeystoreRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetAuthorizableKeystore
     */
    intermediatePath: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetAuthorizableKeystore
     */
    authorizableId: string
}

export interface SlingApiGetKeystoreRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetKeystore
     */
    intermediatePath: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetKeystore
     */
    authorizableId: string
}

export interface SlingApiGetNodeRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetNode
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetNode
     */
    name: string
}

export interface SlingApiGetPackageRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetPackage
     */
    group: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetPackage
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetPackage
     */
    version: string
}

export interface SlingApiGetPackageFilterRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetPackageFilter
     */
    group: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetPackageFilter
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetPackageFilter
     */
    version: string
}

export interface SlingApiGetQueryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetQuery
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApigetQuery
     */
    pLimit: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetQuery
     */
    _1property: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApigetQuery
     */
    _1propertyValue: string
}

export interface SlingApiGetTruststoreRequest {
}

export interface SlingApiGetTruststoreInfoRequest {
}

export interface SlingApiPostAgentRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    runmode: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentCqDistribute?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentCqDistributeTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentCqName?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentCqTemplate?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentAliasUpdate?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentEnabled?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentJcrDescription?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentJcrLastModified?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentJcrLastModifiedBy?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentJcrMixinTypes?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentJcrTitle?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentLogLevel?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentNoStatusUpdate?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentNoVersioning?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolConnectTimeout?: number
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolHTTPConnectionClosed?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolHTTPExpired?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolHTTPHeaders?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolHTTPHeadersTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolHTTPMethod?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolHTTPSRelaxed?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolInterface?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolSocketTimeout?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProtocolVersion?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProxyNTLMDomain?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProxyNTLMHost?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProxyHost?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProxyPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostAgent
     */
    jcrContentProxyPort?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentProxyUser?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostAgent
     */
    jcrContentQueueBatchMaxSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentQueueBatchMode?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostAgent
     */
    jcrContentQueueBatchWaitTime?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentRetryDelay?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentReverseReplication?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentSerializationType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentSlingResourceType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentSsl?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentTransportNTLMDomain?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentTransportNTLMHost?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentTransportPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentTransportUri?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentTransportUser?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentTriggerDistribute?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentTriggerModified?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentTriggerOnOffTime?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentTriggerReceive?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostAgent
     */
    jcrContentTriggerSpecific?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrContentUserId?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    jcrPrimaryType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAgent
     */
    operation?: string
}

export interface SlingApiPostAuthorizableKeystoreRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    intermediatePath: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    authorizableId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    operation?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    currentPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    newPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    rePassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    keyPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    keyStorePass?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    alias?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    newAlias?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizableKeystore
     */
    removeAlias?: string
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof SlingApipostAuthorizableKeystore
     */
    certChain?: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof SlingApipostAuthorizableKeystore
     */
    pk?: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof SlingApipostAuthorizableKeystore
     */
    keyStore?: HttpFile
}

export interface SlingApiPostAuthorizablesRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizables
     */
    authorizableId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizables
     */
    intermediatePath: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizables
     */
    createUser?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizables
     */
    createGroup?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizables
     */
    repPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostAuthorizables
     */
    profileGivenName?: string
}

export interface SlingApiPostConfigAdobeGraniteSamlAuthenticationHandlerRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    keyStorePassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    keyStorePasswordTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    serviceRanking?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    serviceRankingTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    idpHttpRedirect?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    idpHttpRedirectTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    createUser?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    createUserTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    defaultRedirectUrl?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    defaultRedirectUrlTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    userIDAttribute?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    userIDAttributeTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    defaultGroups?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    defaultGroupsTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    idpCertAlias?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    idpCertAliasTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    addGroupMemberships?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    addGroupMembershipsTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    path?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    pathTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    synchronizeAttributes?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    synchronizeAttributesTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    clockTolerance?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    clockToleranceTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    groupMembershipAttribute?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    groupMembershipAttributeTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    idpUrl?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    idpUrlTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    logoutUrl?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    logoutUrlTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    serviceProviderEntityId?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    serviceProviderEntityIdTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    assertionConsumerServiceURL?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    assertionConsumerServiceURLTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    handleLogout?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    handleLogoutTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    spPrivateKeyAlias?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    spPrivateKeyAliasTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    useEncryption?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    useEncryptionTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    nameIdFormat?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    nameIdFormatTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    digestMethod?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    digestMethodTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    signatureMethod?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    signatureMethodTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    userIntermediatePath?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigAdobeGraniteSamlAuthenticationHandler
     */
    userIntermediatePathTypeHint?: string
}

export interface SlingApiPostConfigApacheFelixJettyBasedHttpServiceRequest {
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsNio?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsNioTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystore?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystoreTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystorePassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystorePasswordTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystoreKey?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystoreKeyTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystoreKeyPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsKeystoreKeyPasswordTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsTruststore?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsTruststoreTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsTruststorePassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsTruststorePasswordTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsClientcertificate?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsClientcertificateTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsEnable?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgApacheFelixHttpsEnableTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgOsgiServiceHttpPortSecure?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheFelixJettyBasedHttpService
     */
    orgOsgiServiceHttpPortSecureTypeHint?: string
}

export interface SlingApiPostConfigApacheHttpComponentsProxyConfigurationRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyHost?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyHostTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyPort?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyPortTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyExceptions?: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyExceptionsTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyEnabled?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyEnabledTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyUser?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyUserTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheHttpComponentsProxyConfiguration
     */
    proxyPasswordTypeHint?: string
}

export interface SlingApiPostConfigApacheSlingDavExServletRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingDavExServlet
     */
    alias?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingDavExServlet
     */
    aliasTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheSlingDavExServlet
     */
    davCreateAbsoluteUri?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingDavExServlet
     */
    davCreateAbsoluteUriTypeHint?: string
}

export interface SlingApiPostConfigApacheSlingGetServletRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    jsonMaximumresults?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    jsonMaximumresultsTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    enableHtml?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    enableHtmlTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    enableTxt?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    enableTxtTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    enableXml?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingGetServlet
     */
    enableXmlTypeHint?: string
}

export interface SlingApiPostConfigApacheSlingReferrerFilterRequest {
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    allowEmpty?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    allowEmptyTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    allowHosts?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    allowHostsTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    allowHostsRegexp?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    allowHostsRegexpTypeHint?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    filterMethods?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigApacheSlingReferrerFilter
     */
    filterMethodsTypeHint?: string
}

export interface SlingApiPostConfigPropertyRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostConfigProperty
     */
    configNodeName: string
}

export interface SlingApiPostNodeRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostNode
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostNode
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostNode
     */
    operation?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostNode
     */
    deleteAuthorizable?: string
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof SlingApipostNode
     */
    file?: HttpFile
}

export interface SlingApiPostNodeRwRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostNodeRw
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostNodeRw
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostNodeRw
     */
    addMembers?: string
}

export interface SlingApiPostPathRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostPath
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostPath
     */
    jcrPrimaryType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostPath
     */
    name: string
}

export interface SlingApiPostQueryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostQuery
     */
    path: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SlingApipostQuery
     */
    pLimit: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostQuery
     */
    _1property: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostQuery
     */
    _1propertyValue: string
}

export interface SlingApiPostTreeActivationRequest {
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostTreeActivation
     */
    ignoredeactivated: boolean
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof SlingApipostTreeActivation
     */
    onlymodified: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostTreeActivation
     */
    path: string
    /**
     * 
     * Defaults to: &#39;activate&#39;
     * @type string
     * @memberof SlingApipostTreeActivation
     */
    cmd: string
}

export interface SlingApiPostTruststoreRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostTruststore
     */
    operation?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostTruststore
     */
    newPassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostTruststore
     */
    rePassword?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostTruststore
     */
    keyStoreType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof SlingApipostTruststore
     */
    removeAlias?: string
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof SlingApipostTruststore
     */
    certificate?: HttpFile
}

export interface SlingApiPostTruststorePKCS12Request {
    /**
     * 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof SlingApipostTruststorePKCS12
     */
    truststoreP12?: HttpFile
}

export class ObjectSlingApi {
    private api: ObservableSlingApi

    public constructor(configuration: Configuration, requestFactory?: SlingApiRequestFactory, responseProcessor?: SlingApiResponseProcessor) {
        this.api = new ObservableSlingApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public deleteAgentWithHttpInfo(param: SlingApiDeleteAgentRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.deleteAgentWithHttpInfo(param.runmode, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public deleteAgent(param: SlingApiDeleteAgentRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.deleteAgent(param.runmode, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public deleteNodeWithHttpInfo(param: SlingApiDeleteNodeRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.deleteNodeWithHttpInfo(param.path, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public deleteNode(param: SlingApiDeleteNodeRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.deleteNode(param.path, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAgentWithHttpInfo(param: SlingApiGetAgentRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getAgentWithHttpInfo(param.runmode, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAgent(param: SlingApiGetAgentRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.getAgent(param.runmode, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAgentsWithHttpInfo(param: SlingApiGetAgentsRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getAgentsWithHttpInfo(param.runmode,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAgents(param: SlingApiGetAgentsRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.getAgents(param.runmode,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAuthorizableKeystoreWithHttpInfo(param: SlingApiGetAuthorizableKeystoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<KeystoreInfo>> {
        return this.api.getAuthorizableKeystoreWithHttpInfo(param.intermediatePath, param.authorizableId,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getAuthorizableKeystore(param: SlingApiGetAuthorizableKeystoreRequest, options?: ConfigurationOptions): Promise<KeystoreInfo> {
        return this.api.getAuthorizableKeystore(param.intermediatePath, param.authorizableId,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getKeystoreWithHttpInfo(param: SlingApiGetKeystoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getKeystoreWithHttpInfo(param.intermediatePath, param.authorizableId,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getKeystore(param: SlingApiGetKeystoreRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.getKeystore(param.intermediatePath, param.authorizableId,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getNodeWithHttpInfo(param: SlingApiGetNodeRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getNodeWithHttpInfo(param.path, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getNode(param: SlingApiGetNodeRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.getNode(param.path, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getPackageWithHttpInfo(param: SlingApiGetPackageRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getPackageWithHttpInfo(param.group, param.name, param.version,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getPackage(param: SlingApiGetPackageRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.getPackage(param.group, param.name, param.version,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getPackageFilterWithHttpInfo(param: SlingApiGetPackageFilterRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getPackageFilterWithHttpInfo(param.group, param.name, param.version,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getPackageFilter(param: SlingApiGetPackageFilterRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.getPackageFilter(param.group, param.name, param.version,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getQueryWithHttpInfo(param: SlingApiGetQueryRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getQueryWithHttpInfo(param.path, param.pLimit, param._1property, param._1propertyValue,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getQuery(param: SlingApiGetQueryRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.getQuery(param.path, param.pLimit, param._1property, param._1propertyValue,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getTruststoreWithHttpInfo(param: SlingApiGetTruststoreRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.getTruststoreWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getTruststore(param: SlingApiGetTruststoreRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.getTruststore( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getTruststoreInfoWithHttpInfo(param: SlingApiGetTruststoreInfoRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<TruststoreInfo>> {
        return this.api.getTruststoreInfoWithHttpInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public getTruststoreInfo(param: SlingApiGetTruststoreInfoRequest = {}, options?: ConfigurationOptions): Promise<TruststoreInfo> {
        return this.api.getTruststoreInfo( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postAgentWithHttpInfo(param: SlingApiPostAgentRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postAgentWithHttpInfo(param.runmode, param.name, param.jcrContentCqDistribute, param.jcrContentCqDistributeTypeHint, param.jcrContentCqName, param.jcrContentCqTemplate, param.jcrContentAliasUpdate, param.jcrContentEnabled, param.jcrContentJcrDescription, param.jcrContentJcrLastModified, param.jcrContentJcrLastModifiedBy, param.jcrContentJcrMixinTypes, param.jcrContentJcrTitle, param.jcrContentLogLevel, param.jcrContentNoStatusUpdate, param.jcrContentNoVersioning, param.jcrContentProtocolConnectTimeout, param.jcrContentProtocolHTTPConnectionClosed, param.jcrContentProtocolHTTPExpired, param.jcrContentProtocolHTTPHeaders, param.jcrContentProtocolHTTPHeadersTypeHint, param.jcrContentProtocolHTTPMethod, param.jcrContentProtocolHTTPSRelaxed, param.jcrContentProtocolInterface, param.jcrContentProtocolSocketTimeout, param.jcrContentProtocolVersion, param.jcrContentProxyNTLMDomain, param.jcrContentProxyNTLMHost, param.jcrContentProxyHost, param.jcrContentProxyPassword, param.jcrContentProxyPort, param.jcrContentProxyUser, param.jcrContentQueueBatchMaxSize, param.jcrContentQueueBatchMode, param.jcrContentQueueBatchWaitTime, param.jcrContentRetryDelay, param.jcrContentReverseReplication, param.jcrContentSerializationType, param.jcrContentSlingResourceType, param.jcrContentSsl, param.jcrContentTransportNTLMDomain, param.jcrContentTransportNTLMHost, param.jcrContentTransportPassword, param.jcrContentTransportUri, param.jcrContentTransportUser, param.jcrContentTriggerDistribute, param.jcrContentTriggerModified, param.jcrContentTriggerOnOffTime, param.jcrContentTriggerReceive, param.jcrContentTriggerSpecific, param.jcrContentUserId, param.jcrPrimaryType, param.operation,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postAgent(param: SlingApiPostAgentRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postAgent(param.runmode, param.name, param.jcrContentCqDistribute, param.jcrContentCqDistributeTypeHint, param.jcrContentCqName, param.jcrContentCqTemplate, param.jcrContentAliasUpdate, param.jcrContentEnabled, param.jcrContentJcrDescription, param.jcrContentJcrLastModified, param.jcrContentJcrLastModifiedBy, param.jcrContentJcrMixinTypes, param.jcrContentJcrTitle, param.jcrContentLogLevel, param.jcrContentNoStatusUpdate, param.jcrContentNoVersioning, param.jcrContentProtocolConnectTimeout, param.jcrContentProtocolHTTPConnectionClosed, param.jcrContentProtocolHTTPExpired, param.jcrContentProtocolHTTPHeaders, param.jcrContentProtocolHTTPHeadersTypeHint, param.jcrContentProtocolHTTPMethod, param.jcrContentProtocolHTTPSRelaxed, param.jcrContentProtocolInterface, param.jcrContentProtocolSocketTimeout, param.jcrContentProtocolVersion, param.jcrContentProxyNTLMDomain, param.jcrContentProxyNTLMHost, param.jcrContentProxyHost, param.jcrContentProxyPassword, param.jcrContentProxyPort, param.jcrContentProxyUser, param.jcrContentQueueBatchMaxSize, param.jcrContentQueueBatchMode, param.jcrContentQueueBatchWaitTime, param.jcrContentRetryDelay, param.jcrContentReverseReplication, param.jcrContentSerializationType, param.jcrContentSlingResourceType, param.jcrContentSsl, param.jcrContentTransportNTLMDomain, param.jcrContentTransportNTLMHost, param.jcrContentTransportPassword, param.jcrContentTransportUri, param.jcrContentTransportUser, param.jcrContentTriggerDistribute, param.jcrContentTriggerModified, param.jcrContentTriggerOnOffTime, param.jcrContentTriggerReceive, param.jcrContentTriggerSpecific, param.jcrContentUserId, param.jcrPrimaryType, param.operation,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postAuthorizableKeystoreWithHttpInfo(param: SlingApiPostAuthorizableKeystoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<KeystoreInfo>> {
        return this.api.postAuthorizableKeystoreWithHttpInfo(param.intermediatePath, param.authorizableId, param.operation, param.currentPassword, param.newPassword, param.rePassword, param.keyPassword, param.keyStorePass, param.alias, param.newAlias, param.removeAlias, param.certChain, param.pk, param.keyStore,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postAuthorizableKeystore(param: SlingApiPostAuthorizableKeystoreRequest, options?: ConfigurationOptions): Promise<KeystoreInfo> {
        return this.api.postAuthorizableKeystore(param.intermediatePath, param.authorizableId, param.operation, param.currentPassword, param.newPassword, param.rePassword, param.keyPassword, param.keyStorePass, param.alias, param.newAlias, param.removeAlias, param.certChain, param.pk, param.keyStore,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postAuthorizablesWithHttpInfo(param: SlingApiPostAuthorizablesRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postAuthorizablesWithHttpInfo(param.authorizableId, param.intermediatePath, param.createUser, param.createGroup, param.repPassword, param.profileGivenName,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postAuthorizables(param: SlingApiPostAuthorizablesRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postAuthorizables(param.authorizableId, param.intermediatePath, param.createUser, param.createGroup, param.repPassword, param.profileGivenName,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(param: SlingApiPostConfigAdobeGraniteSamlAuthenticationHandlerRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(param.keyStorePassword, param.keyStorePasswordTypeHint, param.serviceRanking, param.serviceRankingTypeHint, param.idpHttpRedirect, param.idpHttpRedirectTypeHint, param.createUser, param.createUserTypeHint, param.defaultRedirectUrl, param.defaultRedirectUrlTypeHint, param.userIDAttribute, param.userIDAttributeTypeHint, param.defaultGroups, param.defaultGroupsTypeHint, param.idpCertAlias, param.idpCertAliasTypeHint, param.addGroupMemberships, param.addGroupMembershipsTypeHint, param.path, param.pathTypeHint, param.synchronizeAttributes, param.synchronizeAttributesTypeHint, param.clockTolerance, param.clockToleranceTypeHint, param.groupMembershipAttribute, param.groupMembershipAttributeTypeHint, param.idpUrl, param.idpUrlTypeHint, param.logoutUrl, param.logoutUrlTypeHint, param.serviceProviderEntityId, param.serviceProviderEntityIdTypeHint, param.assertionConsumerServiceURL, param.assertionConsumerServiceURLTypeHint, param.handleLogout, param.handleLogoutTypeHint, param.spPrivateKeyAlias, param.spPrivateKeyAliasTypeHint, param.useEncryption, param.useEncryptionTypeHint, param.nameIdFormat, param.nameIdFormatTypeHint, param.digestMethod, param.digestMethodTypeHint, param.signatureMethod, param.signatureMethodTypeHint, param.userIntermediatePath, param.userIntermediatePathTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigAdobeGraniteSamlAuthenticationHandler(param: SlingApiPostConfigAdobeGraniteSamlAuthenticationHandlerRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigAdobeGraniteSamlAuthenticationHandler(param.keyStorePassword, param.keyStorePasswordTypeHint, param.serviceRanking, param.serviceRankingTypeHint, param.idpHttpRedirect, param.idpHttpRedirectTypeHint, param.createUser, param.createUserTypeHint, param.defaultRedirectUrl, param.defaultRedirectUrlTypeHint, param.userIDAttribute, param.userIDAttributeTypeHint, param.defaultGroups, param.defaultGroupsTypeHint, param.idpCertAlias, param.idpCertAliasTypeHint, param.addGroupMemberships, param.addGroupMembershipsTypeHint, param.path, param.pathTypeHint, param.synchronizeAttributes, param.synchronizeAttributesTypeHint, param.clockTolerance, param.clockToleranceTypeHint, param.groupMembershipAttribute, param.groupMembershipAttributeTypeHint, param.idpUrl, param.idpUrlTypeHint, param.logoutUrl, param.logoutUrlTypeHint, param.serviceProviderEntityId, param.serviceProviderEntityIdTypeHint, param.assertionConsumerServiceURL, param.assertionConsumerServiceURLTypeHint, param.handleLogout, param.handleLogoutTypeHint, param.spPrivateKeyAlias, param.spPrivateKeyAliasTypeHint, param.useEncryption, param.useEncryptionTypeHint, param.nameIdFormat, param.nameIdFormatTypeHint, param.digestMethod, param.digestMethodTypeHint, param.signatureMethod, param.signatureMethodTypeHint, param.userIntermediatePath, param.userIntermediatePathTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(param: SlingApiPostConfigApacheFelixJettyBasedHttpServiceRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(param.orgApacheFelixHttpsNio, param.orgApacheFelixHttpsNioTypeHint, param.orgApacheFelixHttpsKeystore, param.orgApacheFelixHttpsKeystoreTypeHint, param.orgApacheFelixHttpsKeystorePassword, param.orgApacheFelixHttpsKeystorePasswordTypeHint, param.orgApacheFelixHttpsKeystoreKey, param.orgApacheFelixHttpsKeystoreKeyTypeHint, param.orgApacheFelixHttpsKeystoreKeyPassword, param.orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, param.orgApacheFelixHttpsTruststore, param.orgApacheFelixHttpsTruststoreTypeHint, param.orgApacheFelixHttpsTruststorePassword, param.orgApacheFelixHttpsTruststorePasswordTypeHint, param.orgApacheFelixHttpsClientcertificate, param.orgApacheFelixHttpsClientcertificateTypeHint, param.orgApacheFelixHttpsEnable, param.orgApacheFelixHttpsEnableTypeHint, param.orgOsgiServiceHttpPortSecure, param.orgOsgiServiceHttpPortSecureTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheFelixJettyBasedHttpService(param: SlingApiPostConfigApacheFelixJettyBasedHttpServiceRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigApacheFelixJettyBasedHttpService(param.orgApacheFelixHttpsNio, param.orgApacheFelixHttpsNioTypeHint, param.orgApacheFelixHttpsKeystore, param.orgApacheFelixHttpsKeystoreTypeHint, param.orgApacheFelixHttpsKeystorePassword, param.orgApacheFelixHttpsKeystorePasswordTypeHint, param.orgApacheFelixHttpsKeystoreKey, param.orgApacheFelixHttpsKeystoreKeyTypeHint, param.orgApacheFelixHttpsKeystoreKeyPassword, param.orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, param.orgApacheFelixHttpsTruststore, param.orgApacheFelixHttpsTruststoreTypeHint, param.orgApacheFelixHttpsTruststorePassword, param.orgApacheFelixHttpsTruststorePasswordTypeHint, param.orgApacheFelixHttpsClientcertificate, param.orgApacheFelixHttpsClientcertificateTypeHint, param.orgApacheFelixHttpsEnable, param.orgApacheFelixHttpsEnableTypeHint, param.orgOsgiServiceHttpPortSecure, param.orgOsgiServiceHttpPortSecureTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(param: SlingApiPostConfigApacheHttpComponentsProxyConfigurationRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(param.proxyHost, param.proxyHostTypeHint, param.proxyPort, param.proxyPortTypeHint, param.proxyExceptions, param.proxyExceptionsTypeHint, param.proxyEnabled, param.proxyEnabledTypeHint, param.proxyUser, param.proxyUserTypeHint, param.proxyPassword, param.proxyPasswordTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheHttpComponentsProxyConfiguration(param: SlingApiPostConfigApacheHttpComponentsProxyConfigurationRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigApacheHttpComponentsProxyConfiguration(param.proxyHost, param.proxyHostTypeHint, param.proxyPort, param.proxyPortTypeHint, param.proxyExceptions, param.proxyExceptionsTypeHint, param.proxyEnabled, param.proxyEnabledTypeHint, param.proxyUser, param.proxyUserTypeHint, param.proxyPassword, param.proxyPasswordTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheSlingDavExServletWithHttpInfo(param: SlingApiPostConfigApacheSlingDavExServletRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigApacheSlingDavExServletWithHttpInfo(param.alias, param.aliasTypeHint, param.davCreateAbsoluteUri, param.davCreateAbsoluteUriTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheSlingDavExServlet(param: SlingApiPostConfigApacheSlingDavExServletRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigApacheSlingDavExServlet(param.alias, param.aliasTypeHint, param.davCreateAbsoluteUri, param.davCreateAbsoluteUriTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheSlingGetServletWithHttpInfo(param: SlingApiPostConfigApacheSlingGetServletRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigApacheSlingGetServletWithHttpInfo(param.jsonMaximumresults, param.jsonMaximumresultsTypeHint, param.enableHtml, param.enableHtmlTypeHint, param.enableTxt, param.enableTxtTypeHint, param.enableXml, param.enableXmlTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheSlingGetServlet(param: SlingApiPostConfigApacheSlingGetServletRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigApacheSlingGetServlet(param.jsonMaximumresults, param.jsonMaximumresultsTypeHint, param.enableHtml, param.enableHtmlTypeHint, param.enableTxt, param.enableTxtTypeHint, param.enableXml, param.enableXmlTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheSlingReferrerFilterWithHttpInfo(param: SlingApiPostConfigApacheSlingReferrerFilterRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigApacheSlingReferrerFilterWithHttpInfo(param.allowEmpty, param.allowEmptyTypeHint, param.allowHosts, param.allowHostsTypeHint, param.allowHostsRegexp, param.allowHostsRegexpTypeHint, param.filterMethods, param.filterMethodsTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigApacheSlingReferrerFilter(param: SlingApiPostConfigApacheSlingReferrerFilterRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigApacheSlingReferrerFilter(param.allowEmpty, param.allowEmptyTypeHint, param.allowHosts, param.allowHostsTypeHint, param.allowHostsRegexp, param.allowHostsRegexpTypeHint, param.filterMethods, param.filterMethodsTypeHint,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigPropertyWithHttpInfo(param: SlingApiPostConfigPropertyRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postConfigPropertyWithHttpInfo(param.configNodeName,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postConfigProperty(param: SlingApiPostConfigPropertyRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postConfigProperty(param.configNodeName,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postNodeWithHttpInfo(param: SlingApiPostNodeRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postNodeWithHttpInfo(param.path, param.name, param.operation, param.deleteAuthorizable, param.file,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postNode(param: SlingApiPostNodeRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postNode(param.path, param.name, param.operation, param.deleteAuthorizable, param.file,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postNodeRwWithHttpInfo(param: SlingApiPostNodeRwRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postNodeRwWithHttpInfo(param.path, param.name, param.addMembers,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postNodeRw(param: SlingApiPostNodeRwRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postNodeRw(param.path, param.name, param.addMembers,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPathWithHttpInfo(param: SlingApiPostPathRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postPathWithHttpInfo(param.path, param.jcrPrimaryType, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postPath(param: SlingApiPostPathRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postPath(param.path, param.jcrPrimaryType, param.name,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postQueryWithHttpInfo(param: SlingApiPostQueryRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postQueryWithHttpInfo(param.path, param.pLimit, param._1property, param._1propertyValue,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postQuery(param: SlingApiPostQueryRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postQuery(param.path, param.pLimit, param._1property, param._1propertyValue,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postTreeActivationWithHttpInfo(param: SlingApiPostTreeActivationRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postTreeActivationWithHttpInfo(param.ignoredeactivated, param.onlymodified, param.path, param.cmd,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postTreeActivation(param: SlingApiPostTreeActivationRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.postTreeActivation(param.ignoredeactivated, param.onlymodified, param.path, param.cmd,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postTruststoreWithHttpInfo(param: SlingApiPostTruststoreRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postTruststoreWithHttpInfo(param.operation, param.newPassword, param.rePassword, param.keyStoreType, param.removeAlias, param.certificate,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postTruststore(param: SlingApiPostTruststoreRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postTruststore(param.operation, param.newPassword, param.rePassword, param.keyStoreType, param.removeAlias, param.certificate,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postTruststorePKCS12WithHttpInfo(param: SlingApiPostTruststorePKCS12Request = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.postTruststorePKCS12WithHttpInfo(param.truststoreP12,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public postTruststorePKCS12(param: SlingApiPostTruststorePKCS12Request = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.postTruststorePKCS12(param.truststoreP12,  options).toPromise();
    }

}
