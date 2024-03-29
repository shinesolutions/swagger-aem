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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  BundleInfo,
  SamlConfigurationInfo,
} from './models';

/**
 * getAemProductInfo - parameters interface
 */
export interface IGetAemProductInfoParams {
}

/**
 * getBundleInfo - parameters interface
 */
export interface IGetBundleInfoParams {
  name: string;
}

/**
 * getConfigMgr - parameters interface
 */
export interface IGetConfigMgrParams {
}

/**
 * postBundle - parameters interface
 */
export interface IPostBundleParams {
  name: string;
  action: string;
}

/**
 * postJmxRepository - parameters interface
 */
export interface IPostJmxRepositoryParams {
  action: string;
}

/**
 * postSamlConfiguration - parameters interface
 */
export interface IPostSamlConfigurationParams {
  post?: boolean;
  apply?: boolean;
  _delete?: boolean;
  action?: string;
  $location?: string;
  path?: Array<string>;
  serviceRanking?: number;
  idpUrl?: string;
  idpCertAlias?: string;
  idpHttpRedirect?: boolean;
  serviceProviderEntityId?: string;
  assertionConsumerServiceURL?: string;
  spPrivateKeyAlias?: string;
  keyStorePassword?: string;
  defaultRedirectUrl?: string;
  userIDAttribute?: string;
  useEncryption?: boolean;
  createUser?: boolean;
  addGroupMemberships?: boolean;
  groupMembershipAttribute?: string;
  defaultGroups?: Array<string>;
  nameIdFormat?: string;
  synchronizeAttributes?: Array<string>;
  handleLogout?: boolean;
  logoutUrl?: string;
  clockTolerance?: number;
  digestMethod?: string;
  signatureMethod?: string;
  userIntermediatePath?: string;
  propertylist?: Array<string>;
}

/**
 * ConsoleApi - API class
 */
@autoinject()
export class ConsoleApi extends Api {

  /**
   * Creates a new ConsoleApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   */
  async getAemProductInfo(): Promise<Array<string>> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/system/console/status-productinfo.json`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'aemAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * @param params.name 
   */
  async getBundleInfo(params: IGetBundleInfoParams): Promise<BundleInfo> {
    // Verify required parameters are set
    this.ensureParamIsSet('getBundleInfo', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/system/console/bundles/{name}.json`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'aemAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   */
  async getConfigMgr(): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/system/console/configMgr`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'aemAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * @param params.name 
   * @param params.action 
   */
  async postBundle(params: IPostBundleParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postBundle', params, 'name');
    this.ensureParamIsSet('postBundle', params, 'action');

    // Create URL to call
    const url = `${this.basePath}/system/console/bundles/{name}`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'action': params['action'],
      })

      // Authentication 'aemAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * @param params.action 
   */
  async postJmxRepository(params: IPostJmxRepositoryParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postJmxRepository', params, 'action');

    // Create URL to call
    const url = `${this.basePath}/system/console/jmx/com.adobe.granite:type=Repository/op/{action}`
      .replace(`{${'action'}}`, encodeURIComponent(`${params['action']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()

      // Authentication 'aemAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * @param params.post 
   * @param params.apply 
   * @param params._delete 
   * @param params.action 
   * @param params.$location 
   * @param params.path 
   * @param params.serviceRanking 
   * @param params.idpUrl 
   * @param params.idpCertAlias 
   * @param params.idpHttpRedirect 
   * @param params.serviceProviderEntityId 
   * @param params.assertionConsumerServiceURL 
   * @param params.spPrivateKeyAlias 
   * @param params.keyStorePassword 
   * @param params.defaultRedirectUrl 
   * @param params.userIDAttribute 
   * @param params.useEncryption 
   * @param params.createUser 
   * @param params.addGroupMemberships 
   * @param params.groupMembershipAttribute 
   * @param params.defaultGroups 
   * @param params.nameIdFormat 
   * @param params.synchronizeAttributes 
   * @param params.handleLogout 
   * @param params.logoutUrl 
   * @param params.clockTolerance 
   * @param params.digestMethod 
   * @param params.signatureMethod 
   * @param params.userIntermediatePath 
   * @param params.propertylist 
   */
  async postSamlConfiguration(params: IPostSamlConfigurationParams): Promise<SamlConfigurationInfo> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'post': params['post'],
        'apply': params['apply'],
        'delete': params['_delete'],
        'action': params['action'],
        '$location': params['$location'],
        'path': params['path'],
        'service.ranking': params['serviceRanking'],
        'idpUrl': params['idpUrl'],
        'idpCertAlias': params['idpCertAlias'],
        'idpHttpRedirect': params['idpHttpRedirect'],
        'serviceProviderEntityId': params['serviceProviderEntityId'],
        'assertionConsumerServiceURL': params['assertionConsumerServiceURL'],
        'spPrivateKeyAlias': params['spPrivateKeyAlias'],
        'keyStorePassword': params['keyStorePassword'],
        'defaultRedirectUrl': params['defaultRedirectUrl'],
        'userIDAttribute': params['userIDAttribute'],
        'useEncryption': params['useEncryption'],
        'createUser': params['createUser'],
        'addGroupMemberships': params['addGroupMemberships'],
        'groupMembershipAttribute': params['groupMembershipAttribute'],
        'defaultGroups': params['defaultGroups'],
        'nameIdFormat': params['nameIdFormat'],
        'synchronizeAttributes': params['synchronizeAttributes'],
        'handleLogout': params['handleLogout'],
        'logoutUrl': params['logoutUrl'],
        'clockTolerance': params['clockTolerance'],
        'digestMethod': params['digestMethod'],
        'signatureMethod': params['signatureMethod'],
        'userIntermediatePath': params['userIntermediatePath'],
        'propertylist': params['propertylist'],
      })

      // Authentication 'aemAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

