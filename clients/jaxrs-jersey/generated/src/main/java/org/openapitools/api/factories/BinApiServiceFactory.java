package org.openapitools.api.factories;

import org.openapitools.api.BinApiService;
import org.openapitools.api.impl.BinApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class BinApiServiceFactory {
    private final static BinApiService service = new BinApiServiceImpl();

    public static BinApiService getBinApi() {
        return service;
    }
}
