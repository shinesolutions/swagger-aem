package org.openapitools.api.factories;

import org.openapitools.api.CrxApiService;
import org.openapitools.api.impl.CrxApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class CrxApiServiceFactory {
    private static final CrxApiService service = new CrxApiServiceImpl();

    public static CrxApiService getCrxApi() {
        return service;
    }
}
