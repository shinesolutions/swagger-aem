package org.openapitools.api.factories;

import org.openapitools.api.AppsApiService;
import org.openapitools.api.impl.AppsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class AppsApiServiceFactory {
    private final static AppsApiService service = new AppsApiServiceImpl();

    public static AppsApiService getAppsApi() {
        return service;
    }
}
