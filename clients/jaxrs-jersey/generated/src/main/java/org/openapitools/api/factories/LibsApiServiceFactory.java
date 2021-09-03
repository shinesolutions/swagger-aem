package org.openapitools.api.factories;

import org.openapitools.api.LibsApiService;
import org.openapitools.api.impl.LibsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class LibsApiServiceFactory {
    private static final LibsApiService service = new LibsApiServiceImpl();

    public static LibsApiService getLibsApi() {
        return service;
    }
}
