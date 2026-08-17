import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(ConsoleApiControllerImpInterface.class).to(ConsoleApiControllerImp.class);
        bind(CqApiControllerImpInterface.class).to(CqApiControllerImp.class);
        bind(CrxApiControllerImpInterface.class).to(CrxApiControllerImp.class);
        bind(CustomApiControllerImpInterface.class).to(CustomApiControllerImp.class);
        bind(GraniteApiControllerImpInterface.class).to(GraniteApiControllerImp.class);
        bind(SlingApiControllerImpInterface.class).to(SlingApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}