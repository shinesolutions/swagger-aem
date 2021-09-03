package org.openapitools.api.factories;

import org.openapitools.api.CqactionsHtmlApiService;
import org.openapitools.api.impl.CqactionsHtmlApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class CqactionsHtmlApiServiceFactory {
    private static final CqactionsHtmlApiService service = new CqactionsHtmlApiServiceImpl();

    public static CqactionsHtmlApiService getCqactionsHtmlApi() {
        return service;
    }
}
