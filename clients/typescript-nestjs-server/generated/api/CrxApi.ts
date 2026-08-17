import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { InstallStatus,  } from '../models';


@Injectable()
export abstract class CrxApi {

  abstract getCrxdeStatus( request: Request): string | Promise<string> | Observable<string>;


  abstract getInstallStatus( request: Request): InstallStatus | Promise<InstallStatus> | Observable<InstallStatus>;


  abstract getPackageManagerServlet( request: Request): void | Promise<void> | Observable<void>;


  abstract postPackageService(cmd: string,  request: Request): string | Promise<string> | Observable<string>;


  abstract postPackageServiceJson(path: string, cmd: string, groupName: string | undefined, packageName: string | undefined, packageVersion: string | undefined, charset: string | undefined, force: boolean | undefined, recursive: boolean | undefined, _package: Blob | undefined,  request: Request): string | Promise<string> | Observable<string>;


  abstract postPackageUpdate(groupName: string, packageName: string, version: string, path: string, filter: string | undefined, charset: string | undefined,  request: Request): string | Promise<string> | Observable<string>;


  abstract postSetPassword(old: string, plain: string, verify: string,  request: Request): string | Promise<string> | Observable<string>;

} 