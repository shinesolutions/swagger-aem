package org.openapitools.api.factories;

import org.openapitools.api.CrxApiService;
import org.openapitools.api.impl.CrxApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class CrxApiServiceFactory {
    private final static CrxApiService service = new CrxApiServiceImpl();

    public static CrxApiService getCrxApi() {
        return service;
    }
}
