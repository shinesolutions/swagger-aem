package org.openapitools.api.factories;

import org.openapitools.api.LibsApiService;
import org.openapitools.api.impl.LibsApiServiceImpl;

public class LibsApiServiceFactory {
    private static final LibsApiService service = new LibsApiServiceImpl();

    public static LibsApiService getLibsApi() {
        return service;
    }
}
