export * from './consoleApi';
import { ConsoleApi } from './consoleApi';
export * from './cqApi';
import { CqApi } from './cqApi';
export * from './crxApi';
import { CrxApi } from './crxApi';
export * from './customApi';
import { CustomApi } from './customApi';
export * from './graniteApi';
import { GraniteApi } from './graniteApi';
export * from './slingApi';
import { SlingApi } from './slingApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [ConsoleApi, CqApi, CrxApi, CustomApi, GraniteApi, SlingApi];
