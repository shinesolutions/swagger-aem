import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { GraniteApi } from '../api';

@Controller()
export class GraniteApiController {
  constructor(private readonly graniteApi: GraniteApi) {}

  @Post('/libs/granite/security/post/sslSetup.html')
  sslSetup(@Query('keystorePassword') keystorePassword: string, @Query('keystorePasswordConfirm') keystorePasswordConfirm: string, @Query('truststorePassword') truststorePassword: string, @Query('truststorePasswordConfirm') truststorePasswordConfirm: string, @Query('httpsHostname') httpsHostname: string, @Query('httpsPort') httpsPort: string, privatekeyFile: Blob | undefined, certificateFile: Blob | undefined, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.graniteApi.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, request);
  }

} 