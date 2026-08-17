import { DynamicModule, Module, Provider } from '@nestjs/common';
import { ApiImplementations } from './api-implementations'
import { ConsoleApi } from './api';
import { ConsoleApiController } from './controllers';
import { CqApi } from './api';
import { CqApiController } from './controllers';
import { CrxApi } from './api';
import { CrxApiController } from './controllers';
import { CustomApi } from './api';
import { CustomApiController } from './controllers';
import { GraniteApi } from './api';
import { GraniteApiController } from './controllers';
import { SlingApi } from './api';
import { SlingApiController } from './controllers';

export type ApiModuleConfiguration = {
  /**
  * your Api implementations
  */
  apiImplementations: ApiImplementations,
  /**
  * additional Providers that may be used by your implementations
  */
  providers?: Provider[],
}

@Module({})
export class ApiModule {
  static forRoot(configuration: ApiModuleConfiguration): DynamicModule {
      const providers: Provider[] = [
        {
          provide: ConsoleApi,
          useClass: configuration.apiImplementations.consoleApi
        },
        {
          provide: CqApi,
          useClass: configuration.apiImplementations.cqApi
        },
        {
          provide: CrxApi,
          useClass: configuration.apiImplementations.crxApi
        },
        {
          provide: CustomApi,
          useClass: configuration.apiImplementations.customApi
        },
        {
          provide: GraniteApi,
          useClass: configuration.apiImplementations.graniteApi
        },
        {
          provide: SlingApi,
          useClass: configuration.apiImplementations.slingApi
        },
        ...(configuration.providers || []),
      ];

      return {
        module: ApiModule,
        controllers: [
          ConsoleApiController,
          CqApiController,
          CrxApiController,
          CustomApiController,
          GraniteApiController,
          SlingApiController,
        ],
        providers: [...providers],
        exports: [...providers]
      }
    }
}