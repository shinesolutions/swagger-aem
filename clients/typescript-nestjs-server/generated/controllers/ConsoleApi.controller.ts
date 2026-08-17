import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ConsoleApi } from '../api';
import { BundleInfo, SamlConfigurationInfo,  } from '../models';

@Controller()
export class ConsoleApiController {
  constructor(private readonly consoleApi: ConsoleApi) {}

  @Get('/system/console/status-productinfo.json')
  getAemProductInfo(@Req() request: Request): Array<string> | Promise<Array<string>> | Observable<Array<string>> {
    return this.consoleApi.getAemProductInfo(request);
  }

  @Get('/system/console/bundles/:name.json')
  getBundleInfo(@Param('name') name: string, @Req() request: Request): BundleInfo | Promise<BundleInfo> | Observable<BundleInfo> {
    return this.consoleApi.getBundleInfo(name, request);
  }

  @Get('/system/console/configMgr')
  getConfigMgr(@Req() request: Request): string | Promise<string> | Observable<string> {
    return this.consoleApi.getConfigMgr(request);
  }

  @Post('/system/console/bundles/:name')
  postBundle(@Param('name') name: string, @Query('action') action: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.consoleApi.postBundle(name, action, request);
  }

  @Post('/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/:action')
  postJmxRepository(@Param('action') action: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.consoleApi.postJmxRepository(action, request);
  }

  @Post('/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler')
  postSamlConfiguration(@Query('post') post: boolean | undefined, @Query('apply') apply: boolean | undefined, @Query('delete') _delete: boolean | undefined, @Query('action') action: string | undefined, @Query('$location') $location: string | undefined, @Query('path') path: Array<string> | undefined, @Query('service.ranking') serviceRanking: number | undefined, @Query('idpUrl') idpUrl: string | undefined, @Query('idpCertAlias') idpCertAlias: string | undefined, @Query('idpHttpRedirect') idpHttpRedirect: boolean | undefined, @Query('serviceProviderEntityId') serviceProviderEntityId: string | undefined, @Query('assertionConsumerServiceURL') assertionConsumerServiceURL: string | undefined, @Query('spPrivateKeyAlias') spPrivateKeyAlias: string | undefined, @Query('keyStorePassword') keyStorePassword: string | undefined, @Query('defaultRedirectUrl') defaultRedirectUrl: string | undefined, @Query('userIDAttribute') userIDAttribute: string | undefined, @Query('useEncryption') useEncryption: boolean | undefined, @Query('createUser') createUser: boolean | undefined, @Query('addGroupMemberships') addGroupMemberships: boolean | undefined, @Query('groupMembershipAttribute') groupMembershipAttribute: string | undefined, @Query('defaultGroups') defaultGroups: Array<string> | undefined, @Query('nameIdFormat') nameIdFormat: string | undefined, @Query('synchronizeAttributes') synchronizeAttributes: Array<string> | undefined, @Query('handleLogout') handleLogout: boolean | undefined, @Query('logoutUrl') logoutUrl: string | undefined, @Query('clockTolerance') clockTolerance: number | undefined, @Query('digestMethod') digestMethod: string | undefined, @Query('signatureMethod') signatureMethod: string | undefined, @Query('userIntermediatePath') userIntermediatePath: string | undefined, @Query('propertylist') propertylist: Array<string> | undefined, @Req() request: Request): SamlConfigurationInfo | Promise<SamlConfigurationInfo> | Observable<SamlConfigurationInfo> {
    return this.consoleApi.postSamlConfiguration(post, apply, _delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, request);
  }

} 