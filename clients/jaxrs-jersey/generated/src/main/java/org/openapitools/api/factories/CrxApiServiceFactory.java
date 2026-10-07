package org.openapitools.api.factories;

import org.openapitools.api.CrxApiService;
import org.openapitools.api.impl.CrxApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-10-07T01:21:43.814267163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CrxApiServiceFactory {
    private static final CrxApiService service = new CrxApiServiceImpl();

    public static CrxApiService getCrxApi() {
        return service;
    }
}
