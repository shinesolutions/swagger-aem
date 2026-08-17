import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CustomApi } from '../api';

@Controller()
export class CustomApiController {
  constructor(private readonly customApi: CustomApi) {}

  @Get('/system/health')
  getAemHealthCheck(@Query('tags') tags: string | undefined, @Query('combineTagsOr') combineTagsOr: boolean | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.customApi.getAemHealthCheck(tags, combineTagsOr, request);
  }

  @Post('/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck')
  postConfigAemHealthCheckServlet(@Query('bundles.ignored') bundlesIgnored: Array<string> | undefined, @Query('bundles.ignored@TypeHint') bundlesIgnoredTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.customApi.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint, request);
  }

  @Post('/apps/system/config/com.shinesolutions.aem.passwordreset.Activator')
  postConfigAemPasswordReset(@Query('pwdreset.authorizables') pwdresetAuthorizables: Array<string> | undefined, @Query('pwdreset.authorizables@TypeHint') pwdresetAuthorizablesTypeHint: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.customApi.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, request);
  }

} 