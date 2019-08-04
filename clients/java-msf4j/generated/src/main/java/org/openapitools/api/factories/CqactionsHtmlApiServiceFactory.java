package org.openapitools.api.factories;

import org.openapitools.api.CqactionsHtmlApiService;
import org.openapitools.api.impl.CqactionsHtmlApiServiceImpl;

public class CqactionsHtmlApiServiceFactory {
    private final static CqactionsHtmlApiService service = new CqactionsHtmlApiServiceImpl();

    public static CqactionsHtmlApiService getCqactionsHtmlApi() {
        return service;
    }
}
