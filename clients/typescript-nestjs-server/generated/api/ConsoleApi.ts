import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { BundleInfo, SamlConfigurationInfo,  } from '../models';


@Injectable()
export abstract class ConsoleApi {

  abstract getAemProductInfo( request: Request): Array<string> | Promise<Array<string>> | Observable<Array<string>>;


  abstract getBundleInfo(name: string,  request: Request): BundleInfo | Promise<BundleInfo> | Observable<BundleInfo>;


  abstract getConfigMgr( request: Request): string | Promise<string> | Observable<string>;


  abstract postBundle(name: string, action: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract postJmxRepository(action: string,  request: Request): void | Promise<void> | Observable<void>;


  abstract postSamlConfiguration(post: boolean | undefined, apply: boolean | undefined, _delete: boolean | undefined, action: string | undefined, $location: string | undefined, path: Array<string> | undefined, serviceRanking: number | undefined, idpUrl: string | undefined, idpCertAlias: string | undefined, idpHttpRedirect: boolean | undefined, serviceProviderEntityId: string | undefined, assertionConsumerServiceURL: string | undefined, spPrivateKeyAlias: string | undefined, keyStorePassword: string | undefined, defaultRedirectUrl: string | undefined, userIDAttribute: string | undefined, useEncryption: boolean | undefined, createUser: boolean | undefined, addGroupMemberships: boolean | undefined, groupMembershipAttribute: string | undefined, defaultGroups: Array<string> | undefined, nameIdFormat: string | undefined, synchronizeAttributes: Array<string> | undefined, handleLogout: boolean | undefined, logoutUrl: string | undefined, clockTolerance: number | undefined, digestMethod: string | undefined, signatureMethod: string | undefined, userIntermediatePath: string | undefined, propertylist: Array<string> | undefined,  request: Request): SamlConfigurationInfo | Promise<SamlConfigurationInfo> | Observable<SamlConfigurationInfo>;

} 