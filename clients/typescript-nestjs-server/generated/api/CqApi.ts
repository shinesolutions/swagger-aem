import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';


@Injectable()
export abstract class CqApi {

  abstract getLoginPage( request: Request): string | Promise<string> | Observable<string>;


  abstract postCqActions(authorizableId: string, changelog: string,  request: Request): void | Promise<void> | Observable<void>;

} 