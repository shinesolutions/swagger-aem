package org.openapitools.api.factories;

import org.openapitools.api.CqactionsHtmlApiService;
import org.openapitools.api.impl.CqactionsHtmlApiServiceImpl;

public class CqactionsHtmlApiServiceFactory {
    private static final CqactionsHtmlApiService service = new CqactionsHtmlApiServiceImpl();

    public static CqactionsHtmlApiService getCqactionsHtmlApi() {
        return service;
    }
}
