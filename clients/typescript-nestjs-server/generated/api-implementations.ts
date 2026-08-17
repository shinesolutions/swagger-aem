import { Type } from '@nestjs/common';
import { ConsoleApi } from './api';
import { CqApi } from './api';
import { CrxApi } from './api';
import { CustomApi } from './api';
import { GraniteApi } from './api';
import { SlingApi } from './api';

/**
 * Provide this type to {@link ApiModule} to provide your API implementations
**/
export type ApiImplementations = {
  consoleApi: Type<ConsoleApi>
  cqApi: Type<CqApi>
  crxApi: Type<CrxApi>
  customApi: Type<CustomApi>
  graniteApi: Type<GraniteApi>
  slingApi: Type<SlingApi>
};
