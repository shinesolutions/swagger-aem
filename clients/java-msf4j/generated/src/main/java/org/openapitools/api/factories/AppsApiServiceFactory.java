package org.openapitools.api.factories;

import org.openapitools.api.AppsApiService;
import org.openapitools.api.impl.AppsApiServiceImpl;

public class AppsApiServiceFactory {
    private static final AppsApiService service = new AppsApiServiceImpl();

    public static AppsApiService getAppsApi() {
        return service;
    }
}
