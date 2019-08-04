package org.openapitools.api.factories;

import org.openapitools.api.EtcApiService;
import org.openapitools.api.impl.EtcApiServiceImpl;

public class EtcApiServiceFactory {
    private final static EtcApiService service = new EtcApiServiceImpl();

    public static EtcApiService getEtcApi() {
        return service;
    }
}
