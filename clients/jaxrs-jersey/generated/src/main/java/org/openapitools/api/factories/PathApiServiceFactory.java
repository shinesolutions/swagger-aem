package org.openapitools.api.factories;

import org.openapitools.api.PathApiService;
import org.openapitools.api.impl.PathApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class PathApiServiceFactory {
    private final static PathApiService service = new PathApiServiceImpl();

    public static PathApiService getPathApi() {
        return service;
    }
}
