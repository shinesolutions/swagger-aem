package org.openapitools.api.factories;

import org.openapitools.api.IntermediatePathApiService;
import org.openapitools.api.impl.IntermediatePathApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class IntermediatePathApiServiceFactory {
    private final static IntermediatePathApiService service = new IntermediatePathApiServiceImpl();

    public static IntermediatePathApiService getIntermediatePathApi() {
        return service;
    }
}
