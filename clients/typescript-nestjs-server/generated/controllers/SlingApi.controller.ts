import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { SlingApi } from '../api';
import { KeystoreInfo, TruststoreInfo,  } from '../models';

@Controller()
export class SlingApiController {
  constructor(private readonly slingApi: SlingApi) {}

  @Delete('/etc/replication/agents.:runmode/:name')
  deleteAgent(@Param('runmode') runmode: string, @Param('name') name: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.deleteAgent(runmode, name, request);
  }

  @Delete('/:path/:name')
  deleteNode(@Param('path') path: string, @Param('name') name: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.deleteNode(path, name, request);
  }

  @Get('/etc/replication/agents.:runmode/:name')
  getAgent(@Param('runmode') runmode: string, @Param('name') name: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.getAgent(runmode, name, request);
  }

  @Get('/etc/replication/agents.:runmode.-1.json')
  getAgents(@Param('runmode') runmode: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.slingApi.getAgents(runmode, request);
  }

  @Get('/:intermediatePath/:authorizableId.ks.json')
  getAuthorizableKeystore(@Param('intermediatePath') intermediatePath: string, @Param('authorizableId') authorizableId: string, @Req() request: Request): KeystoreInfo | Promise<KeystoreInfo> | Observable<KeystoreInfo> {
    return this.slingApi.getAuthorizableKeystore(intermediatePath, authorizableId, request);
  }

  @Get('/:intermediatePath/:authorizableId/keystore/store.p12')
  getKeystore(@Param('intermediatePath') intermediatePath: string, @Param('authorizableId') authorizableId: string, @Req() request: Request): Blob | Promise<Blob> | Observable<Blob> {
    return this.slingApi.getKeystore(intermediatePath, authorizableId, request);
  }

  @Get('/:path/:name')
  getNode(@Param('path') path: string, @Param('name') name: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.getNode(path, name, request);
  }

  @Get('/etc/packages/:group/:name-:version.zip')
  getPackage(@Param('group') group: string, @Param('name') name: string, @Param('version') version: string, @Req() request: Request): Blob | Promise<Blob> | Observable<Blob> {
    return this.slingApi.getPackage(group, name, version, request);
  }

  @Get('/etc/packages/:group/:name-:version.zip/jcr:content/vlt:definition/filter.tidy.2.json')
  getPackageFilter(@Param('group') group: string, @Param('name') name: string, @Param('version') version: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.slingApi.getPackageFilter(group, name, version, request);
  }

  @Get('/bin/querybuilder.json')
  getQuery(@Query('path') path: string, @Query('p.limit', new ParseIntPipe({optional: true})) pLimit: number, @Query('1_property') _1property: string, @Query('1_property.value') _1propertyValue: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.slingApi.getQuery(path, pLimit, _1property, _1propertyValue, request);
  }

  @Get('/etc/truststore/truststore.p12')
  getTruststore(@Req() request: Request): Blob | Promise<Blob> | Observable<Blob> {
    return this.slingApi.getTruststore(request);
  }

  @Get('/libs/granite/security/truststore.json')
  getTruststoreInfo(@Req() request: Request): TruststoreInfo | Promise<TruststoreInfo> | Observable<TruststoreInfo> {
    return this.slingApi.getTruststoreInfo(request);
  }

  @Post('/etc/replication/agents.:runmode/:name')
  postAgent(@Param('runmode') runmode: string, @Param('name') name: string, @Query('jcr:content/cq:distribute') jcrContentCqDistribute: boolean | undefined, @Query('jcr:content/cq:distribute@TypeHint') jcrContentCqDistributeTypeHint: string | undefined, @Query('jcr:content/cq:name') jcrContentCqName: string | undefined, @Query('jcr:content/cq:template') jcrContentCqTemplate: string | undefined, @Query('jcr:content/aliasUpdate') jcrContentAliasUpdate: boolean | undefined, @Query('jcr:content/enabled') jcrContentEnabled: boolean | undefined, @Query('jcr:content/jcr:description') jcrContentJcrDescription: string | undefined, @Query('jcr:content/jcr:lastModified') jcrContentJcrLastModified: string | undefined, @Query('jcr:content/jcr:lastModifiedBy') jcrContentJcrLastModifiedBy: string | undefined, @Query('jcr:content/jcr:mixinTypes') jcrContentJcrMixinTypes: string | undefined, @Query('jcr:content/jcr:title') jcrContentJcrTitle: string | undefined, @Query('jcr:content/logLevel') jcrContentLogLevel: string | undefined, @Query('jcr:content/noStatusUpdate') jcrContentNoStatusUpdate: boolean | undefined, @Query('jcr:content/noVersioning') jcrContentNoVersioning: boolean | undefined, @Query('jcr:content/protocolConnectTimeout', new ParseIntPipe({optional: true})) jcrContentProtocolConnectTimeout: number | undefined, @Query('jcr:content/protocolHTTPConnectionClosed') jcrContentProtocolHTTPConnectionClosed: boolean | undefined, @Query('jcr:content/protocolHTTPExpired') jcrContentProtocolHTTPExpired: string | undefined, @Query('jcr:content/protocolHTTPHeaders') jcrContentProtocolHTTPHeaders: Array<string> | undefined, @Query('jcr:content/protocolHTTPHeaders@TypeHint') jcrContentProtocolHTTPHeadersTypeHint: string | undefined, @Query('jcr:content/protocolHTTPMethod') jcrContentProtocolHTTPMethod: string | undefined, @Query('jcr:content/protocolHTTPSRelaxed') jcrContentProtocolHTTPSRelaxed: boolean | undefined, @Query('jcr:content/protocolInterface') jcrContentProtocolInterface: string | undefined, @Query('jcr:content/protocolSocketTimeout', new ParseIntPipe({optional: true})) jcrContentProtocolSocketTimeout: number | undefined, @Query('jcr:content/protocolVersion') jcrContentProtocolVersion: string | undefined, @Query('jcr:content/proxyNTLMDomain') jcrContentProxyNTLMDomain: string | undefined, @Query('jcr:content/proxyNTLMHost') jcrContentProxyNTLMHost: string | undefined, @Query('jcr:content/proxyHost') jcrContentProxyHost: string | undefined, @Query('jcr:content/proxyPassword') jcrContentProxyPassword: string | undefined, @Query('jcr:content/proxyPort', new ParseIntPipe({optional: true})) jcrContentProxyPort: number | undefined, @Query('jcr:content/proxyUser') jcrContentProxyUser: string | undefined, @Query('jcr:content/queueBatchMaxSize', new ParseIntPipe({optional: true})) jcrContentQueueBatchMaxSize: number | undefined, @Query('jcr:content/queueBatchMode') jcrContentQueueBatchMode: string | undefined, @Query('jcr:content/queueBatchWaitTime', new ParseIntPipe({optional: true})) jcrContentQueueBatchWaitTime: number | undefined, @Query('jcr:content/retryDelay') jcrContentRetryDelay: string | undefined, @Query('jcr:content/reverseReplication') jcrContentReverseReplication: boolean | undefined, @Query('jcr:content/serializationType') jcrContentSerializationType: string | undefined, @Query('jcr:content/sling:resourceType') jcrContentSlingResourceType: string | undefined, @Query('jcr:content/ssl') jcrContentSsl: string | undefined, @Query('jcr:content/transportNTLMDomain') jcrContentTransportNTLMDomain: string | undefined, @Query('jcr:content/transportNTLMHost') jcrContentTransportNTLMHost: string | undefined, @Query('jcr:content/transportPassword') jcrContentTransportPassword: string | undefined, @Query('jcr:content/transportUri') jcrContentTransportUri: string | undefined, @Query('jcr:content/transportUser') jcrContentTransportUser: string | undefined, @Query('jcr:content/triggerDistribute') jcrContentTriggerDistribute: boolean | undefined, @Query('jcr:content/triggerModified') jcrContentTriggerModified: boolean | undefined, @Query('jcr:content/triggerOnOffTime') jcrContentTriggerOnOffTime: boolean | undefined, @Query('jcr:content/triggerReceive') jcrContentTriggerReceive: boolean | undefined, @Query('jcr:content/triggerSpecific') jcrContentTriggerSpecific: boolean | undefined, @Query('jcr:content/userId') jcrContentUserId: string | undefined, @Query('jcr:primaryType') jcrPrimaryType: string | undefined, @Query(':operation') operation: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation, request);
  }

  @Post('/:intermediatePath/:authorizableId.ks.html')
  postAuthorizableKeystore(@Param('intermediatePath') intermediatePath: string, @Param('authorizableId') authorizableId: string, @Query(':operation') operation: string | undefined, @Query('currentPassword') currentPassword: string | undefined, @Query('newPassword') newPassword: string | undefined, @Query('rePassword') rePassword: string | undefined, @Query('keyPassword') keyPassword: string | undefined, @Query('keyStorePass') keyStorePass: string | undefined, @Query('alias') alias: string | undefined, @Query('newAlias') newAlias: string | undefined, @Query('removeAlias') removeAlias: string | undefined, certChain: Blob | undefined, pk: Blob | undefined, keyStore: Blob | undefined, @Req() request: Request): KeystoreInfo | Promise<KeystoreInfo> | Observable<KeystoreInfo> {
    return this.slingApi.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, request);
  }

  @Post('/libs/granite/security/post/authorizables')
  postAuthorizables(@Query('authorizableId') authorizableId: string, @Query('intermediatePath') intermediatePath: string, @Query('createUser') createUser: string | undefined, @Query('createGroup') createGroup: string | undefined, @Query('rep:password') repPassword: string | undefined, @Query('profile/givenName') profileGivenName: string | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.slingApi.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName, request);
  }

  @Post('/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config')
  postConfigAdobeGraniteSamlAuthenticationHandler(@Query('keyStorePassword') keyStorePassword: string | undefined, @Query('keyStorePassword@TypeHint') keyStorePasswordTypeHint: string | undefined, @Query('service.ranking') serviceRanking: number | undefined, @Query('service.ranking@TypeHint') serviceRankingTypeHint: string | undefined, @Query('idpHttpRedirect') idpHttpRedirect: boolean | undefined, @Query('idpHttpRedirect@TypeHint') idpHttpRedirectTypeHint: string | undefined, @Query('createUser') createUser: boolean | undefined, @Query('createUser@TypeHint') createUserTypeHint: string | undefined, @Query('defaultRedirectUrl') defaultRedirectUrl: string | undefined, @Query('defaultRedirectUrl@TypeHint') defaultRedirectUrlTypeHint: string | undefined, @Query('userIDAttribute') userIDAttribute: string | undefined, @Query('userIDAttribute@TypeHint') userIDAttributeTypeHint: string | undefined, @Query('defaultGroups') defaultGroups: Array<string> | undefined, @Query('defaultGroups@TypeHint') defaultGroupsTypeHint: string | undefined, @Query('idpCertAlias') idpCertAlias: string | undefined, @Query('idpCertAlias@TypeHint') idpCertAliasTypeHint: string | undefined, @Query('addGroupMemberships') addGroupMemberships: boolean | undefined, @Query('addGroupMemberships@TypeHint') addGroupMembershipsTypeHint: string | undefined, @Query('path') path: Array<string> | undefined, @Query('path@TypeHint') pathTypeHint: string | undefined, @Query('synchronizeAttributes') synchronizeAttributes: Array<string> | undefined, @Query('synchronizeAttributes@TypeHint') synchronizeAttributesTypeHint: string | undefined, @Query('clockTolerance') clockTolerance: number | undefined, @Query('clockTolerance@TypeHint') clockToleranceTypeHint: string | undefined, @Query('groupMembershipAttribute') groupMembershipAttribute: string | undefined, @Query('groupMembershipAttribute@TypeHint') groupMembershipAttributeTypeHint: string | undefined, @Query('idpUrl') idpUrl: string | undefined, @Query('idpUrl@TypeHint') idpUrlTypeHint: string | undefined, @Query('logoutUrl') logoutUrl: string | undefined, @Query('logoutUrl@TypeHint') logoutUrlTypeHint: string | undefined, @Query('serviceProviderEntityId') serviceProviderEntityId: string | undefined, @Query('serviceProviderEntityId@TypeHint') serviceProviderEntityIdTypeHint: string | undefined, @Query('assertionConsumerServiceURL') assertionConsumerServiceURL: string | undefined, @Query('assertionConsumerServiceURL@TypeHint') assertionConsumerServiceURLTypeHint: string | undefined, @Query('handleLogout') handleLogout: boolean | undefined, @Query('handleLogout@TypeHint') handleLogoutTypeHint: string | undefined, @Query('spPrivateKeyAlias') spPrivateKeyAlias: string | undefined, @Query('spPrivateKeyAlias@TypeHint') spPrivateKeyAliasTypeHint: string | undefined, @Query('useEncryption') useEncryption: boolean | undefined, @Query('useEncryption@TypeHint') useEncryptionTypeHint: string | undefined, @Query('nameIdFormat') nameIdFormat: string | undefined, @Query('nameIdFormat@TypeHint') nameIdFormatTypeHint: string | undefined, @Query('digestMethod') digestMethod: string | undefined, @Query('digestMethod@TypeHint') digestMethodTypeHint: string | undefined, @Query('signatureMethod') signatureMethod: string | undefined, @Query('signatureMethod@TypeHint') signatureMethodTypeHint: string | undefined, @Query('userIntermediatePath') userIntermediatePath: string | undefined, @Query('userIntermediatePath@TypeHint') userIntermediatePathTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint, request);
  }

  @Post('/apps/system/config/org.apache.felix.http')
  postConfigApacheFelixJettyBasedHttpService(@Query('org.apache.felix.https.nio') orgApacheFelixHttpsNio: boolean | undefined, @Query('org.apache.felix.https.nio@TypeHint') orgApacheFelixHttpsNioTypeHint: string | undefined, @Query('org.apache.felix.https.keystore') orgApacheFelixHttpsKeystore: string | undefined, @Query('org.apache.felix.https.keystore@TypeHint') orgApacheFelixHttpsKeystoreTypeHint: string | undefined, @Query('org.apache.felix.https.keystore.password') orgApacheFelixHttpsKeystorePassword: string | undefined, @Query('org.apache.felix.https.keystore.password@TypeHint') orgApacheFelixHttpsKeystorePasswordTypeHint: string | undefined, @Query('org.apache.felix.https.keystore.key') orgApacheFelixHttpsKeystoreKey: string | undefined, @Query('org.apache.felix.https.keystore.key@TypeHint') orgApacheFelixHttpsKeystoreKeyTypeHint: string | undefined, @Query('org.apache.felix.https.keystore.key.password') orgApacheFelixHttpsKeystoreKeyPassword: string | undefined, @Query('org.apache.felix.https.keystore.key.password@TypeHint') orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: string | undefined, @Query('org.apache.felix.https.truststore') orgApacheFelixHttpsTruststore: string | undefined, @Query('org.apache.felix.https.truststore@TypeHint') orgApacheFelixHttpsTruststoreTypeHint: string | undefined, @Query('org.apache.felix.https.truststore.password') orgApacheFelixHttpsTruststorePassword: string | undefined, @Query('org.apache.felix.https.truststore.password@TypeHint') orgApacheFelixHttpsTruststorePasswordTypeHint: string | undefined, @Query('org.apache.felix.https.clientcertificate') orgApacheFelixHttpsClientcertificate: string | undefined, @Query('org.apache.felix.https.clientcertificate@TypeHint') orgApacheFelixHttpsClientcertificateTypeHint: string | undefined, @Query('org.apache.felix.https.enable') orgApacheFelixHttpsEnable: boolean | undefined, @Query('org.apache.felix.https.enable@TypeHint') orgApacheFelixHttpsEnableTypeHint: string | undefined, @Query('org.osgi.service.http.port.secure') orgOsgiServiceHttpPortSecure: string | undefined, @Query('org.osgi.service.http.port.secure@TypeHint') orgOsgiServiceHttpPortSecureTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint, request);
  }

  @Post('/apps/system/config/org.apache.http.proxyconfigurator.config')
  postConfigApacheHttpComponentsProxyConfiguration(@Query('proxy.host') proxyHost: string | undefined, @Query('proxy.host@TypeHint') proxyHostTypeHint: string | undefined, @Query('proxy.port') proxyPort: number | undefined, @Query('proxy.port@TypeHint') proxyPortTypeHint: string | undefined, @Query('proxy.exceptions') proxyExceptions: Array<string> | undefined, @Query('proxy.exceptions@TypeHint') proxyExceptionsTypeHint: string | undefined, @Query('proxy.enabled') proxyEnabled: boolean | undefined, @Query('proxy.enabled@TypeHint') proxyEnabledTypeHint: string | undefined, @Query('proxy.user') proxyUser: string | undefined, @Query('proxy.user@TypeHint') proxyUserTypeHint: string | undefined, @Query('proxy.password') proxyPassword: string | undefined, @Query('proxy.password@TypeHint') proxyPasswordTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint, request);
  }

  @Post('/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet')
  postConfigApacheSlingDavExServlet(@Query('alias') alias: string | undefined, @Query('alias@TypeHint') aliasTypeHint: string | undefined, @Query('dav.create-absolute-uri') davCreateAbsoluteUri: boolean | undefined, @Query('dav.create-absolute-uri@TypeHint') davCreateAbsoluteUriTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint, request);
  }

  @Post('/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet')
  postConfigApacheSlingGetServlet(@Query('json.maximumresults') jsonMaximumresults: string | undefined, @Query('json.maximumresults@TypeHint') jsonMaximumresultsTypeHint: string | undefined, @Query('enable.html') enableHtml: boolean | undefined, @Query('enable.html@TypeHint') enableHtmlTypeHint: string | undefined, @Query('enable.txt') enableTxt: boolean | undefined, @Query('enable.txt@TypeHint') enableTxtTypeHint: string | undefined, @Query('enable.xml') enableXml: boolean | undefined, @Query('enable.xml@TypeHint') enableXmlTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint, request);
  }

  @Post('/apps/system/config/org.apache.sling.security.impl.ReferrerFilter')
  postConfigApacheSlingReferrerFilter(@Query('allow.empty') allowEmpty: boolean | undefined, @Query('allow.empty@TypeHint') allowEmptyTypeHint: string | undefined, @Query('allow.hosts') allowHosts: string | undefined, @Query('allow.hosts@TypeHint') allowHostsTypeHint: string | undefined, @Query('allow.hosts.regexp') allowHostsRegexp: string | undefined, @Query('allow.hosts.regexp@TypeHint') allowHostsRegexpTypeHint: string | undefined, @Query('filter.methods') filterMethods: string | undefined, @Query('filter.methods@TypeHint') filterMethodsTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint, request);
  }

  @Post('/apps/system/config/:configNodeName')
  postConfigProperty(@Param('configNodeName') configNodeName: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postConfigProperty(configNodeName, request);
  }

  @Post('/:path/:name')
  postNode(@Param('path') path: string, @Param('name') name: string, @Query(':operation') operation: string | undefined, @Query('deleteAuthorizable') deleteAuthorizable: string | undefined, file: Blob | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postNode(path, name, operation, deleteAuthorizable, file, request);
  }

  @Post('/:path/:name.rw.html')
  postNodeRw(@Param('path') path: string, @Param('name') name: string, @Query('addMembers') addMembers: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postNodeRw(path, name, addMembers, request);
  }

  @Post('/:path/')
  postPath(@Param('path') path: string, @Query('jcr:primaryType') jcrPrimaryType: string, @Query(':name') name: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postPath(path, jcrPrimaryType, name, request);
  }

  @Post('/bin/querybuilder.json')
  postQuery(@Query('path') path: string, @Query('p.limit', new ParseIntPipe({optional: true})) pLimit: number, @Query('1_property') _1property: string, @Query('1_property.value') _1propertyValue: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.slingApi.postQuery(path, pLimit, _1property, _1propertyValue, request);
  }

  @Post('/libs/replication/treeactivation.html')
  postTreeActivation(@Query('ignoredeactivated') ignoredeactivated: boolean, @Query('onlymodified') onlymodified: boolean, @Query('path') path: string, @Query('cmd', new DefaultValuePipe('activate')) cmd: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.slingApi.postTreeActivation(ignoredeactivated, onlymodified, path, cmd, request);
  }

  @Post('/libs/granite/security/post/truststore')
  postTruststore(@Query(':operation') operation: string | undefined, @Query('newPassword') newPassword: string | undefined, @Query('rePassword') rePassword: string | undefined, @Query('keyStoreType') keyStoreType: string | undefined, @Query('removeAlias') removeAlias: string | undefined, certificate: Blob | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.slingApi.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate, request);
  }

  @Post('/etc/truststore')
  postTruststorePKCS12(truststoreP12: Blob | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.slingApi.postTruststorePKCS12(truststoreP12, request);
  }

} 