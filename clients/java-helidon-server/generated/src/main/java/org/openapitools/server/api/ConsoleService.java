package org.openapitools.server.api;

import org.openapitools.server.model.BundleInfo;
import java.util.stream.Collectors;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.SamlConfigurationInfo;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Console'",
                             version = "7.24.0")
public interface ConsoleService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/status-productinfo.json", this::getAemProductInfo);
        rules.get("/bundles/{name}.json", this::getBundleInfo);
        rules.get("/configMgr", this::getConfigMgr);
        rules.post("/bundles/{name}", this::postBundle);
        rules.post("/jmx/com.adobe.granite:type=Repository/op/{action}", this::postJmxRepository);
        rules.post("/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", this::postSamlConfiguration);
    }


    /**
     * GET /system/console/status-productinfo.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getAemProductInfo(ServerRequest request, ServerResponse response);
    /**
     * GET /system/console/bundles/{name}.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBundleInfo(ServerRequest request, ServerResponse response);
    /**
     * GET /system/console/configMgr.
     *
     * @param request the server request
     * @param response the server response
     */
    void getConfigMgr(ServerRequest request, ServerResponse response);
    /**
     * POST /system/console/bundles/{name}.
     *
     * @param request the server request
     * @param response the server response
     */
    void postBundle(ServerRequest request, ServerResponse response);
    /**
     * POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}.
     *
     * @param request the server request
     * @param response the server response
     */
    void postJmxRepository(ServerRequest request, ServerResponse response);
    /**
     * POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler.
     *
     * @param request the server request
     * @param response the server response
     */
    void postSamlConfiguration(ServerRequest request, ServerResponse response);
}
