package org.openapitools.api.factories;

import org.openapitools.api.AppsApiService;
import org.openapitools.api.impl.AppsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T02:15:33.561165235Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AppsApiServiceFactory {
    private static final AppsApiService service = new AppsApiServiceImpl();

    public static AppsApiService getAppsApi() {
        return service;
    }
}
