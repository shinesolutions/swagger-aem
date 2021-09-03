package org.openapitools.api.factories;

import org.openapitools.api.AppsApiService;
import org.openapitools.api.impl.AppsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class AppsApiServiceFactory {
    private static final AppsApiService service = new AppsApiServiceImpl();

    public static AppsApiService getAppsApi() {
        return service;
    }
}
