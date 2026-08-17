package org.openapitools.server.api;

import java.io.File;
import java.util.HexFormat;
import org.openapitools.server.model.InstallStatus;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.common.parameters.Parameters;
import io.helidon.http.media.multipart.ReadablePart;
import io.helidon.http.Status;
import io.helidon.common.mapper.Value;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Crx'",
                             version = "7.24.0")
public interface CrxService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/server/crx.default/jcr:root/.1.json", this::getCrxdeStatus);
        rules.get("/packmgr/installstatus.jsp", this::getInstallStatus);
        rules.get("/packmgr/service/script.html", this::getPackageManagerServlet);
        rules.post("/packmgr/service.jsp", this::postPackageService);
        rules.post("/packmgr/service/.json/{path}", this::postPackageServiceJson);
        rules.post("/packmgr/update.jsp", this::postPackageUpdate);
        rules.post("/explorer/ui/setpassword.jsp", this::postSetPassword);
    }


    /**
     * GET /crx/server/crx.default/jcr:root/.1.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCrxdeStatus(ServerRequest request, ServerResponse response);
    /**
     * GET /crx/packmgr/installstatus.jsp.
     *
     * @param request the server request
     * @param response the server response
     */
    void getInstallStatus(ServerRequest request, ServerResponse response);
    /**
     * GET /crx/packmgr/service/script.html.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPackageManagerServlet(ServerRequest request, ServerResponse response);
    /**
     * POST /crx/packmgr/service.jsp.
     *
     * @param request the server request
     * @param response the server response
     */
    void postPackageService(ServerRequest request, ServerResponse response);
    /**
     * POST /crx/packmgr/service/.json/{path}.
     *
     * @param request the server request
     * @param response the server response
     */
    void postPackageServiceJson(ServerRequest request, ServerResponse response);
    /**
     * POST /crx/packmgr/update.jsp.
     *
     * @param request the server request
     * @param response the server response
     */
    void postPackageUpdate(ServerRequest request, ServerResponse response);
    /**
     * POST /crx/explorer/ui/setpassword.jsp.
     *
     * @param request the server request
     * @param response the server response
     */
    void postSetPassword(ServerRequest request, ServerResponse response);
}
