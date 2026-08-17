package org.openapitools.api.factories;

import org.openapitools.api.LibsApiService;
import org.openapitools.api.impl.LibsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T02:15:33.561165235Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LibsApiServiceFactory {
    private static final LibsApiService service = new LibsApiServiceImpl();

    public static LibsApiService getLibsApi() {
        return service;
    }
}
