import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { KeystoreInfo, TruststoreInfo,  } from '../models';


@Injectable()
export abstract class SlingApi {

  abstract deleteAgent(runmode: string, name: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract deleteNode(path: string, name: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract getAgent(runmode: string, name: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract getAgents(runmode: string,  request: Request): string | Promise<string> | Observable<string>;


  abstract getAuthorizableKeystore(intermediatePath: string, authorizableId: string,  request: Request): KeystoreInfo | Promise<KeystoreInfo> | Observable<KeystoreInfo>;


  abstract getKeystore(intermediatePath: string, authorizableId: string,  request: Request): Blob | Promise<Blob> | Observable<Blob>;


  abstract getNode(path: string, name: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract getPackage(group: string, name: string, version: string,  request: Request): Blob | Promise<Blob> | Observable<Blob>;


  abstract getPackageFilter(group: string, name: string, version: string,  request: Request): string | Promise<string> | Observable<string>;


  abstract getQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string,  request: Request): string | Promise<string> | Observable<string>;


  abstract getTruststore( request: Request): Blob | Promise<Blob> | Observable<Blob>;


  abstract getTruststoreInfo( request: Request): TruststoreInfo | Promise<TruststoreInfo> | Observable<TruststoreInfo>;


  abstract postAgent(runmode: string, name: string, jcrContentCqDistribute: boolean | undefined, jcrContentCqDistributeTypeHint: string | undefined, jcrContentCqName: string | undefined, jcrContentCqTemplate: string | undefined, jcrContentAliasUpdate: boolean | undefined, jcrContentEnabled: boolean | undefined, jcrContentJcrDescription: string | undefined, jcrContentJcrLastModified: string | undefined, jcrContentJcrLastModifiedBy: string | undefined, jcrContentJcrMixinTypes: string | undefined, jcrContentJcrTitle: string | undefined, jcrContentLogLevel: string | undefined, jcrContentNoStatusUpdate: boolean | undefined, jcrContentNoVersioning: boolean | undefined, jcrContentProtocolConnectTimeout: number | undefined, jcrContentProtocolHTTPConnectionClosed: boolean | undefined, jcrContentProtocolHTTPExpired: string | undefined, jcrContentProtocolHTTPHeaders: Array<string> | undefined, jcrContentProtocolHTTPHeadersTypeHint: string | undefined, jcrContentProtocolHTTPMethod: string | undefined, jcrContentProtocolHTTPSRelaxed: boolean | undefined, jcrContentProtocolInterface: string | undefined, jcrContentProtocolSocketTimeout: number | undefined, jcrContentProtocolVersion: string | undefined, jcrContentProxyNTLMDomain: string | undefined, jcrContentProxyNTLMHost: string | undefined, jcrContentProxyHost: string | undefined, jcrContentProxyPassword: string | undefined, jcrContentProxyPort: number | undefined, jcrContentProxyUser: string | undefined, jcrContentQueueBatchMaxSize: number | undefined, jcrContentQueueBatchMode: string | undefined, jcrContentQueueBatchWaitTime: number | undefined, jcrContentRetryDelay: string | undefined, jcrContentReverseReplication: boolean | undefined, jcrContentSerializationType: string | undefined, jcrContentSlingResourceType: string | undefined, jcrContentSsl: string | undefined, jcrContentTransportNTLMDomain: string | undefined, jcrContentTransportNTLMHost: string | undefined, jcrContentTransportPassword: string | undefined, jcrContentTransportUri: string | undefined, jcrContentTransportUser: string | undefined, jcrContentTriggerDistribute: boolean | undefined, jcrContentTriggerModified: boolean | undefined, jcrContentTriggerOnOffTime: boolean | undefined, jcrContentTriggerReceive: boolean | undefined, jcrContentTriggerSpecific: boolean | undefined, jcrContentUserId: string | undefined, jcrPrimaryType: string | undefined, operation: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postAuthorizableKeystore(intermediatePath: string, authorizableId: string, operation: string | undefined, currentPassword: string | undefined, newPassword: string | undefined, rePassword: string | undefined, keyPassword: string | undefined, keyStorePass: string | undefined, alias: string | undefined, newAlias: string | undefined, removeAlias: string | undefined, certChain: Blob | undefined, pk: Blob | undefined, keyStore: Blob | undefined,  request: Request): KeystoreInfo | Promise<KeystoreInfo> | Observable<KeystoreInfo>;


  abstract postAuthorizables(authorizableId: string, intermediatePath: string, createUser: string | undefined, createGroup: string | undefined, repPassword: string | undefined, profileGivenName: string | undefined,  request: Request): string | Promise<string> | Observable<string>;


  abstract postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: string | undefined, keyStorePasswordTypeHint: string | undefined, serviceRanking: number | undefined, serviceRankingTypeHint: string | undefined, idpHttpRedirect: boolean | undefined, idpHttpRedirectTypeHint: string | undefined, createUser: boolean | undefined, createUserTypeHint: string | undefined, defaultRedirectUrl: string | undefined, defaultRedirectUrlTypeHint: string | undefined, userIDAttribute: string | undefined, userIDAttributeTypeHint: string | undefined, defaultGroups: Array<string> | undefined, defaultGroupsTypeHint: string | undefined, idpCertAlias: string | undefined, idpCertAliasTypeHint: string | undefined, addGroupMemberships: boolean | undefined, addGroupMembershipsTypeHint: string | undefined, path: Array<string> | undefined, pathTypeHint: string | undefined, synchronizeAttributes: Array<string> | undefined, synchronizeAttributesTypeHint: string | undefined, clockTolerance: number | undefined, clockToleranceTypeHint: string | undefined, groupMembershipAttribute: string | undefined, groupMembershipAttributeTypeHint: string | undefined, idpUrl: string | undefined, idpUrlTypeHint: string | undefined, logoutUrl: string | undefined, logoutUrlTypeHint: string | undefined, serviceProviderEntityId: string | undefined, serviceProviderEntityIdTypeHint: string | undefined, assertionConsumerServiceURL: string | undefined, assertionConsumerServiceURLTypeHint: string | undefined, handleLogout: boolean | undefined, handleLogoutTypeHint: string | undefined, spPrivateKeyAlias: string | undefined, spPrivateKeyAliasTypeHint: string | undefined, useEncryption: boolean | undefined, useEncryptionTypeHint: string | undefined, nameIdFormat: string | undefined, nameIdFormatTypeHint: string | undefined, digestMethod: string | undefined, digestMethodTypeHint: string | undefined, signatureMethod: string | undefined, signatureMethodTypeHint: string | undefined, userIntermediatePath: string | undefined, userIntermediatePathTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio: boolean | undefined, orgApacheFelixHttpsNioTypeHint: string | undefined, orgApacheFelixHttpsKeystore: string | undefined, orgApacheFelixHttpsKeystoreTypeHint: string | undefined, orgApacheFelixHttpsKeystorePassword: string | undefined, orgApacheFelixHttpsKeystorePasswordTypeHint: string | undefined, orgApacheFelixHttpsKeystoreKey: string | undefined, orgApacheFelixHttpsKeystoreKeyTypeHint: string | undefined, orgApacheFelixHttpsKeystoreKeyPassword: string | undefined, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: string | undefined, orgApacheFelixHttpsTruststore: string | undefined, orgApacheFelixHttpsTruststoreTypeHint: string | undefined, orgApacheFelixHttpsTruststorePassword: string | undefined, orgApacheFelixHttpsTruststorePasswordTypeHint: string | undefined, orgApacheFelixHttpsClientcertificate: string | undefined, orgApacheFelixHttpsClientcertificateTypeHint: string | undefined, orgApacheFelixHttpsEnable: boolean | undefined, orgApacheFelixHttpsEnableTypeHint: string | undefined, orgOsgiServiceHttpPortSecure: string | undefined, orgOsgiServiceHttpPortSecureTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postConfigApacheHttpComponentsProxyConfiguration(proxyHost: string | undefined, proxyHostTypeHint: string | undefined, proxyPort: number | undefined, proxyPortTypeHint: string | undefined, proxyExceptions: Array<string> | undefined, proxyExceptionsTypeHint: string | undefined, proxyEnabled: boolean | undefined, proxyEnabledTypeHint: string | undefined, proxyUser: string | undefined, proxyUserTypeHint: string | undefined, proxyPassword: string | undefined, proxyPasswordTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postConfigApacheSlingDavExServlet(alias: string | undefined, aliasTypeHint: string | undefined, davCreateAbsoluteUri: boolean | undefined, davCreateAbsoluteUriTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postConfigApacheSlingGetServlet(jsonMaximumresults: string | undefined, jsonMaximumresultsTypeHint: string | undefined, enableHtml: boolean | undefined, enableHtmlTypeHint: string | undefined, enableTxt: boolean | undefined, enableTxtTypeHint: string | undefined, enableXml: boolean | undefined, enableXmlTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postConfigApacheSlingReferrerFilter(allowEmpty: boolean | undefined, allowEmptyTypeHint: string | undefined, allowHosts: string | undefined, allowHostsTypeHint: string | undefined, allowHostsRegexp: string | undefined, allowHostsRegexpTypeHint: string | undefined, filterMethods: string | undefined, filterMethodsTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postConfigProperty(configNodeName: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract postNode(path: string, name: string, operation: string | undefined, deleteAuthorizable: string | undefined, file: Blob | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postNodeRw(path: string, name: string, addMembers: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postPath(path: string, jcrPrimaryType: string, name: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract postQuery(path: string, pLimit: number, _1property: string, _1propertyValue: string,  request: Request): string | Promise<string> | Observable<string>;


  abstract postTreeActivation(ignoredeactivated: boolean, onlymodified: boolean, path: string, cmd: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract postTruststore(operation: string | undefined, newPassword: string | undefined, rePassword: string | undefined, keyStoreType: string | undefined, removeAlias: string | undefined, certificate: Blob | undefined,  request: Request): string | Promise<string> | Observable<string>;


  abstract postTruststorePKCS12(truststoreP12: Blob | undefined,  request: Request): string | Promise<string> | Observable<string>;

} 