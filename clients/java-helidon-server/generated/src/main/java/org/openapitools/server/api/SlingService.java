package org.openapitools.server.api;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.io.File;
import java.util.HexFormat;
import org.openapitools.server.model.KeystoreInfo;
import java.util.List;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.common.parameters.Parameters;
import io.helidon.http.media.multipart.ReadablePart;
import io.helidon.http.Status;
import org.openapitools.server.model.TruststoreInfo;
import io.helidon.common.mapper.Value;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Sling'",
                             version = "7.24.0")
public interface SlingService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.delete("/etc/replication/agents.{runmode}/{name}", this::deleteAgent);
        rules.delete("/{path}/{name}", this::deleteNode);
        rules.get("/etc/replication/agents.{runmode}/{name}", this::getAgent);
        rules.get("/etc/replication/agents.{runmode}.-1.json", this::getAgents);
        rules.get("/{intermediatePath}/{authorizableId}.ks.json", this::getAuthorizableKeystore);
        rules.get("/{intermediatePath}/{authorizableId}/keystore/store.p12", this::getKeystore);
        rules.get("/{path}/{name}", this::getNode);
        rules.get("/etc/packages/{group}/{name}-{version}.zip", this::getPackage);
        rules.get("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json", this::getPackageFilter);
        rules.get("/bin/querybuilder.json", this::getQuery);
        rules.get("/etc/truststore/truststore.p12", this::getTruststore);
        rules.get("/libs/granite/security/truststore.json", this::getTruststoreInfo);
        rules.post("/etc/replication/agents.{runmode}/{name}", this::postAgent);
        rules.post("/{intermediatePath}/{authorizableId}.ks.html", this::postAuthorizableKeystore);
        rules.post("/libs/granite/security/post/authorizables", this::postAuthorizables);
        rules.post("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config", this::postConfigAdobeGraniteSamlAuthenticationHandler);
        rules.post("/apps/system/config/org.apache.felix.http", this::postConfigApacheFelixJettyBasedHttpService);
        rules.post("/apps/system/config/org.apache.http.proxyconfigurator.config", this::postConfigApacheHttpComponentsProxyConfiguration);
        rules.post("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", this::postConfigApacheSlingDavExServlet);
        rules.post("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet", this::postConfigApacheSlingGetServlet);
        rules.post("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter", this::postConfigApacheSlingReferrerFilter);
        rules.post("/apps/system/config/{configNodeName}", this::postConfigProperty);
        rules.post("/{path}/{name}", this::postNode);
        rules.post("/{path}/{name}.rw.html", this::postNodeRw);
        rules.post("/{path}/", this::postPath);
        rules.post("/bin/querybuilder.json", this::postQuery);
        rules.post("/libs/replication/treeactivation.html", this::postTreeActivation);
        rules.post("/libs/granite/security/post/truststore", this::postTruststore);
        rules.post("/etc/truststore", this::postTruststorePKCS12);
    }


    /**
     * DELETE /etc/replication/agents.{runmode}/{name}.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteAgent(ServerRequest request, ServerResponse response);
    /**
     * DELETE /{path}/{name}.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteNode(ServerRequest request, ServerResponse response);
    /**
     * GET /etc/replication/agents.{runmode}/{name}.
     *
     * @param request the server request
     * @param response the server response
     */
    void getAgent(ServerRequest request, ServerResponse response);
    /**
     * GET /etc/replication/agents.{runmode}.-1.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getAgents(ServerRequest request, ServerResponse response);
    /**
     * GET /{intermediatePath}/{authorizableId}.ks.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getAuthorizableKeystore(ServerRequest request, ServerResponse response);
    /**
     * GET /{intermediatePath}/{authorizableId}/keystore/store.p12.
     *
     * @param request the server request
     * @param response the server response
     */
    void getKeystore(ServerRequest request, ServerResponse response);
    /**
     * GET /{path}/{name}.
     *
     * @param request the server request
     * @param response the server response
     */
    void getNode(ServerRequest request, ServerResponse response);
    /**
     * GET /etc/packages/{group}/{name}-{version}.zip.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPackage(ServerRequest request, ServerResponse response);
    /**
     * GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPackageFilter(ServerRequest request, ServerResponse response);
    /**
     * GET /bin/querybuilder.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getQuery(ServerRequest request, ServerResponse response);
    /**
     * GET /etc/truststore/truststore.p12.
     *
     * @param request the server request
     * @param response the server response
     */
    void getTruststore(ServerRequest request, ServerResponse response);
    /**
     * GET /libs/granite/security/truststore.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void getTruststoreInfo(ServerRequest request, ServerResponse response);
    /**
     * POST /etc/replication/agents.{runmode}/{name}.
     *
     * @param request the server request
     * @param response the server response
     */
    void postAgent(ServerRequest request, ServerResponse response);
    /**
     * POST /{intermediatePath}/{authorizableId}.ks.html.
     *
     * @param request the server request
     * @param response the server response
     */
    void postAuthorizableKeystore(ServerRequest request, ServerResponse response);
    /**
     * POST /libs/granite/security/post/authorizables.
     *
     * @param request the server request
     * @param response the server response
     */
    void postAuthorizables(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigAdobeGraniteSamlAuthenticationHandler(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/org.apache.felix.http.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigApacheFelixJettyBasedHttpService(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/org.apache.http.proxyconfigurator.config.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigApacheHttpComponentsProxyConfiguration(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigApacheSlingDavExServlet(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigApacheSlingGetServlet(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigApacheSlingReferrerFilter(ServerRequest request, ServerResponse response);
    /**
     * POST /apps/system/config/{configNodeName}.
     *
     * @param request the server request
     * @param response the server response
     */
    void postConfigProperty(ServerRequest request, ServerResponse response);
    /**
     * POST /{path}/{name}.
     *
     * @param request the server request
     * @param response the server response
     */
    void postNode(ServerRequest request, ServerResponse response);
    /**
     * POST /{path}/{name}.rw.html.
     *
     * @param request the server request
     * @param response the server response
     */
    void postNodeRw(ServerRequest request, ServerResponse response);
    /**
     * POST /{path}/.
     *
     * @param request the server request
     * @param response the server response
     */
    void postPath(ServerRequest request, ServerResponse response);
    /**
     * POST /bin/querybuilder.json.
     *
     * @param request the server request
     * @param response the server response
     */
    void postQuery(ServerRequest request, ServerResponse response);
    /**
     * POST /libs/replication/treeactivation.html.
     *
     * @param request the server request
     * @param response the server response
     */
    void postTreeActivation(ServerRequest request, ServerResponse response);
    /**
     * POST /libs/granite/security/post/truststore.
     *
     * @param request the server request
     * @param response the server response
     */
    void postTruststore(ServerRequest request, ServerResponse response);
    /**
     * POST /etc/truststore.
     *
     * @param request the server request
     * @param response the server response
     */
    void postTruststorePKCS12(ServerRequest request, ServerResponse response);
}
