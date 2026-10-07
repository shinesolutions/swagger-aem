package org.openapitools.api.factories;

import org.openapitools.api.BinApiService;
import org.openapitools.api.impl.BinApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-10-07T01:21:43.814267163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BinApiServiceFactory {
    private static final BinApiService service = new BinApiServiceImpl();

    public static BinApiService getBinApi() {
        return service;
    }
}
