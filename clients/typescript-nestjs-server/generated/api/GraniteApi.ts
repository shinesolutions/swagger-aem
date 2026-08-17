import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';


@Injectable()
export abstract class GraniteApi {

  abstract sslSetup(keystorePassword: string, keystorePasswordConfirm: string, truststorePassword: string, truststorePasswordConfirm: string, httpsHostname: string, httpsPort: string, privatekeyFile: Blob | undefined, certificateFile: Blob | undefined,  request: Request): string | Promise<string> | Observable<string>;

} 