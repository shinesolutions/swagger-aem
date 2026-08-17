package org.openapitools.server.api;

import java.util.stream.Collectors;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Custom'",
                             version = "7.24.0")
public interface CustomService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/system/health", this::getAemHealthCheck);
        rules.post("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck", this::postConfigAemHealthCheckServlet);
        rules.post("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator", this::postConfigAemPasswordReset);
    }


    /**
     * GET /system/health.
     *
     * @param request the server request
     * @param response the server response
     */
    void getAemHealthCheck(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigAemHealthCheckServlet(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigAemPasswordReset(ServerRequest request, ServerResponse response);
}
