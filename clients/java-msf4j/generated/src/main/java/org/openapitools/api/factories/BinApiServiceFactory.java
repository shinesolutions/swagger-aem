package org.openapitools.api.factories;

import org.openapitools.api.BinApiService;
import org.openapitools.api.impl.BinApiServiceImpl;

public class BinApiServiceFactory {
    private static final BinApiService service = new BinApiServiceImpl();

    public static BinApiService getBinApi() {
        return service;
    }
}
