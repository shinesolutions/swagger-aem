package org.openapitools.api.factories;

import org.openapitools.api.PathApiService;
import org.openapitools.api.impl.PathApiServiceImpl;

public class PathApiServiceFactory {
    private final static PathApiService service = new PathApiServiceImpl();

    public static PathApiService getPathApi() {
        return service;
    }
}
