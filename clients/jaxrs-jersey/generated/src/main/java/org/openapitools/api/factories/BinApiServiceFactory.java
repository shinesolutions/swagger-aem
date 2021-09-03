package org.openapitools.api.factories;

import org.openapitools.api.BinApiService;
import org.openapitools.api.impl.BinApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class BinApiServiceFactory {
    private static final BinApiService service = new BinApiServiceImpl();

    public static BinApiService getBinApi() {
        return service;
    }
}
