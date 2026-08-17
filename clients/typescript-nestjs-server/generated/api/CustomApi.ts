import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';


@Injectable()
export abstract class CustomApi {

  abstract getAemHealthCheck(tags: string | undefined, combineTagsOr: boolean | undefined,  request: Request): string | Promise<string> | Observable<string>;


  abstract postConfigAemHealthCheckServlet(bundlesIgnored: Array<string> | undefined, bundlesIgnoredTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract postConfigAemPasswordReset(pwdresetAuthorizables: Array<string> | undefined, pwdresetAuthorizablesTypeHint: string | undefined,  request: Request): void | Promise<void> | Observable<void>;

} 