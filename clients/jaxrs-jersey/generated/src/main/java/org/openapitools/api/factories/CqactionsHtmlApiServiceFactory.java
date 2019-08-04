package org.openapitools.api.factories;

import org.openapitools.api.CqactionsHtmlApiService;
import org.openapitools.api.impl.CqactionsHtmlApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class CqactionsHtmlApiServiceFactory {
    private final static CqactionsHtmlApiService service = new CqactionsHtmlApiServiceImpl();

    public static CqactionsHtmlApiService getCqactionsHtmlApi() {
        return service;
    }
}
