package org.openapitools.api.factories;

import org.openapitools.api.EtcApiService;
import org.openapitools.api.impl.EtcApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class EtcApiServiceFactory {
    private static final EtcApiService service = new EtcApiServiceImpl();

    public static EtcApiService getEtcApi() {
        return service;
    }
}
