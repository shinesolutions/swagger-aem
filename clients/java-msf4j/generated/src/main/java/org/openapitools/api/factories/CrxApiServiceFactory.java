package org.openapitools.api.factories;

import org.openapitools.api.CrxApiService;
import org.openapitools.api.impl.CrxApiServiceImpl;

public class CrxApiServiceFactory {
    private static final CrxApiService service = new CrxApiServiceImpl();

    public static CrxApiService getCrxApi() {
        return service;
    }
}
