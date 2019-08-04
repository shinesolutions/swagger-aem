import {interfaces} from "inversify";

import { ConsoleService } from './api/console.service';
import { CqService } from './api/cq.service';
import { CrxService } from './api/crx.service';
import { CustomService } from './api/custom.service';
import { SlingService } from './api/sling.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<ConsoleService>("ConsoleService").to(ConsoleService).inSingletonScope();
        container.bind<CqService>("CqService").to(CqService).inSingletonScope();
        container.bind<CrxService>("CrxService").to(CrxService).inSingletonScope();
        container.bind<CustomService>("CustomService").to(CustomService).inSingletonScope();
        container.bind<SlingService>("SlingService").to(SlingService).inSingletonScope();
    }
}
