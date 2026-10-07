package org.openapitools.api.factories;

import org.openapitools.api.EtcApiService;
import org.openapitools.api.impl.EtcApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-10-07T01:21:43.814267163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EtcApiServiceFactory {
    private static final EtcApiService service = new EtcApiServiceImpl();

    public static EtcApiService getEtcApi() {
        return service;
    }
}
