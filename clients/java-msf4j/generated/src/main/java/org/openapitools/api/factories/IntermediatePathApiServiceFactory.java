package org.openapitools.api.factories;

import org.openapitools.api.IntermediatePathApiService;
import org.openapitools.api.impl.IntermediatePathApiServiceImpl;

public class IntermediatePathApiServiceFactory {
    private final static IntermediatePathApiService service = new IntermediatePathApiServiceImpl();

    public static IntermediatePathApiService getIntermediatePathApi() {
        return service;
    }
}
