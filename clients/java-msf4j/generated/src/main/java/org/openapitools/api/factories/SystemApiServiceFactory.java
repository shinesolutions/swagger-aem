package org.openapitools.api.factories;

import org.openapitools.api.SystemApiService;
import org.openapitools.api.impl.SystemApiServiceImpl;

public class SystemApiServiceFactory {
    private final static SystemApiService service = new SystemApiServiceImpl();

    public static SystemApiService getSystemApi() {
        return service;
    }
}
