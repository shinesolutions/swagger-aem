package org.openapitools.api.factories;

import org.openapitools.api.LibsApiService;
import org.openapitools.api.impl.LibsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class LibsApiServiceFactory {
    private final static LibsApiService service = new LibsApiServiceImpl();

    public static LibsApiService getLibsApi() {
        return service;
    }
}
