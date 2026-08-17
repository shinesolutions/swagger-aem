package org.openapitools.server.api;

import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Cq'",
                             version = "7.24.0")
public interface CqService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/libs/granite/core/content/login.html", this::getLoginPage);
        rules.post("/.cqactions.html", this::postCqActions);
    }


    /**
     * GET /libs/granite/core/content/login.html.
     *
     * @param request the server request
     * @param response the server response
     */
    void getLoginPage(ServerRequest request, ServerResponse response);
    /**
     * POST /.cqactions.html.
     *
     * @param request the server request
     * @param response the server response
     */
    void postCqActions(ServerRequest request, ServerResponse response);
}
