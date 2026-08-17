import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CrxApi } from '../api';
import { InstallStatus,  } from '../models';

@Controller()
export class CrxApiController {
  constructor(private readonly crxApi: CrxApi) {}

  @Get('/crx/server/crx.default/jcr:root/.1.json')
  getCrxdeStatus(@Req() request: Request): string | Promise<string> | Observable<string> {
    return this.crxApi.getCrxdeStatus(request);
  }

  @Get('/crx/packmgr/installstatus.jsp')
  getInstallStatus(@Req() request: Request): InstallStatus | Promise<InstallStatus> | Observable<InstallStatus> {
    return this.crxApi.getInstallStatus(request);
  }

  @Get('/crx/packmgr/service/script.html')
  getPackageManagerServlet(@Req() request: Request): void | Promise<void> | Observable<void> {
    return this.crxApi.getPackageManagerServlet(request);
  }

  @Post('/crx/packmgr/service.jsp')
  postPackageService(@Query('cmd') cmd: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.crxApi.postPackageService(cmd, request);
  }

  @Post('/crx/packmgr/service/.json/:path')
  postPackageServiceJson(@Param('path') path: string, @Query('cmd') cmd: string, @Query('groupName') groupName: string | undefined, @Query('packageName') packageName: string | undefined, @Query('packageVersion') packageVersion: string | undefined, @Query('_charset_') charset: string | undefined, @Query('force') force: boolean | undefined, @Query('recursive') recursive: boolean | undefined, _package: Blob | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.crxApi.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package, request);
  }

  @Post('/crx/packmgr/update.jsp')
  postPackageUpdate(@Query('groupName') groupName: string, @Query('packageName') packageName: string, @Query('version') version: string, @Query('path') path: string, @Query('filter') filter: string | undefined, @Query('_charset_') charset: string | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.crxApi.postPackageUpdate(groupName, packageName, version, path, filter, charset, request);
  }

  @Post('/crx/explorer/ui/setpassword.jsp')
  postSetPassword(@Query('old') old: string, @Query('plain') plain: string, @Query('verify') verify: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.crxApi.postSetPassword(old, plain, verify, request);
  }

} 