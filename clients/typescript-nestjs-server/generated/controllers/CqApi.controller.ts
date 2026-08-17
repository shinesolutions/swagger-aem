import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CqApi } from '../api';

@Controller()
export class CqApiController {
  constructor(private readonly cqApi: CqApi) {}

  @Get('/libs/granite/core/content/login.html')
  getLoginPage(@Req() request: Request): string | Promise<string> | Observable<string> {
    return this.cqApi.getLoginPage(request);
  }

  @Post('/.cqactions.html')
  postCqActions(@Query('authorizableId') authorizableId: string, @Query('changelog') changelog: string, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.cqApi.postCqActions(authorizableId, changelog, request);
  }

} 