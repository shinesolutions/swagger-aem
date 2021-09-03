/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI document version: 3.5.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Methods;

/**
 * The default implementation for {@link HandlerProvider} and {@link PathHandlerInterface}.
 *
 * <p>There are two flavors of {@link HttpHandler}s to choose from, depending on your needs:</p>
 *
 * <ul>
 * <li>
 * <b>Stateless</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is not retained – a different {@link HttpHandler} is instantiated for every new
 * session. This is the default behavior.
 * </li>
 * <li>
 * <b>Stateful</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is retained properly. For example, if you want to keep a class property that counts
 * the number of requests or the last time a request was received.
 * </li>
 * </ul>
 * <p>Note: <b>Stateful</b> flavor is more performant than <b>Stateless</b>.</p>
 */
@SuppressWarnings("TooManyFunctions")
abstract public class PathHandlerProvider implements HandlerProvider, PathHandlerInterface {
    /**
     * Returns the default base path to access this server.
     */
    @javax.annotation.Nonnull
    public String getBasePath() {
        return "";
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
    * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    @Override
    public HttpHandler getHandler() {
        return getHandler(false);
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final boolean withBasePath) {
        return getHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @SuppressWarnings("Convert2Lambda")
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.GET, basePath + "/system/console/status-productinfo.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAemProductInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/system/console/bundles/{name}.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBundleInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/system/console/configMgr", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getConfigMgr().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/bundles/{name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postBundle().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postJmxRepository().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postSamlConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/libs/granite/core/content/login.html", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getLoginPage().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/.cqactions.html", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postCqActions().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/crx/server/crx.default/jcr:root/.1.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCrxdeStatus().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/crx/packmgr/installstatus.jsp", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getInstallStatus().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/crx/packmgr/service/script.html", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPackageManagerServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/crx/packmgr/service.jsp", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postPackageService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/crx/packmgr/service/.json/{path}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postPackageServiceJson().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/crx/packmgr/update.jsp", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postPackageUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/crx/explorer/ui/setpassword.jsp", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postSetPassword().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/system/health", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAemHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigAemHealthCheckServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigAemPasswordReset().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/libs/granite/security/post/sslSetup.html", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sslSetup().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/etc/replication/agents.{runmode}/{name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteAgent().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/{path}/{name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteNode().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/etc/replication/agents.{runmode}/{name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAgent().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/etc/replication/agents.{runmode}.-1.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAgents().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/{intermediatePath}/{authorizableId}.ks.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAuthorizableKeystore().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/{intermediatePath}/{authorizableId}/keystore/store.p12", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getKeystore().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/{path}/{name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getNode().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/etc/packages/{group}/{name}-{version}.zip", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPackage().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPackageFilter().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/bin/querybuilder.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQuery().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/etc/truststore/truststore.p12", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getTruststore().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/libs/granite/security/truststore.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getTruststoreInfo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/etc/replication/agents.{runmode}/{name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postAgent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/{intermediatePath}/{authorizableId}.ks.html", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postAuthorizableKeystore().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/libs/granite/security/post/authorizables", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postAuthorizables().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigAdobeGraniteSamlAuthenticationHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.felix.http", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigApacheFelixJettyBasedHttpService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.http.proxyconfigurator.config", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigApacheHttpComponentsProxyConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigApacheSlingDavExServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigApacheSlingGetServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigApacheSlingReferrerFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/apps/system/config/{configNodeName}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postConfigProperty().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/{path}/{name}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postNode().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/{path}/{name}.rw.html", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postNodeRw().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/{path}/", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postPath().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/bin/querybuilder.json", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postQuery().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/etc/replication/treeactivation.html", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postTreeActivation().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/libs/granite/security/post/truststore", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postTruststore().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/etc/truststore", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    postTruststorePKCS12().handleRequest(exchange);
                }
            })
            ;
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler() {
        return getStatefulHandler(false);
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final boolean withBasePath) {
        return getStatefulHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.GET, basePath + "/system/console/status-productinfo.json", getAemProductInfo())
            .add(Methods.GET, basePath + "/system/console/bundles/{name}.json", getBundleInfo())
            .add(Methods.GET, basePath + "/system/console/configMgr", getConfigMgr())
            .add(Methods.POST, basePath + "/system/console/bundles/{name}", postBundle())
            .add(Methods.POST, basePath + "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}", postJmxRepository())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", postSamlConfiguration())
            .add(Methods.GET, basePath + "/libs/granite/core/content/login.html", getLoginPage())
            .add(Methods.POST, basePath + "/.cqactions.html", postCqActions())
            .add(Methods.GET, basePath + "/crx/server/crx.default/jcr:root/.1.json", getCrxdeStatus())
            .add(Methods.GET, basePath + "/crx/packmgr/installstatus.jsp", getInstallStatus())
            .add(Methods.GET, basePath + "/crx/packmgr/service/script.html", getPackageManagerServlet())
            .add(Methods.POST, basePath + "/crx/packmgr/service.jsp", postPackageService())
            .add(Methods.POST, basePath + "/crx/packmgr/service/.json/{path}", postPackageServiceJson())
            .add(Methods.POST, basePath + "/crx/packmgr/update.jsp", postPackageUpdate())
            .add(Methods.POST, basePath + "/crx/explorer/ui/setpassword.jsp", postSetPassword())
            .add(Methods.GET, basePath + "/system/health", getAemHealthCheck())
            .add(Methods.POST, basePath + "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck", postConfigAemHealthCheckServlet())
            .add(Methods.POST, basePath + "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator", postConfigAemPasswordReset())
            .add(Methods.POST, basePath + "/libs/granite/security/post/sslSetup.html", sslSetup())
            .add(Methods.DELETE, basePath + "/etc/replication/agents.{runmode}/{name}", deleteAgent())
            .add(Methods.DELETE, basePath + "/{path}/{name}", deleteNode())
            .add(Methods.GET, basePath + "/etc/replication/agents.{runmode}/{name}", getAgent())
            .add(Methods.GET, basePath + "/etc/replication/agents.{runmode}.-1.json", getAgents())
            .add(Methods.GET, basePath + "/{intermediatePath}/{authorizableId}.ks.json", getAuthorizableKeystore())
            .add(Methods.GET, basePath + "/{intermediatePath}/{authorizableId}/keystore/store.p12", getKeystore())
            .add(Methods.GET, basePath + "/{path}/{name}", getNode())
            .add(Methods.GET, basePath + "/etc/packages/{group}/{name}-{version}.zip", getPackage())
            .add(Methods.GET, basePath + "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json", getPackageFilter())
            .add(Methods.GET, basePath + "/bin/querybuilder.json", getQuery())
            .add(Methods.GET, basePath + "/etc/truststore/truststore.p12", getTruststore())
            .add(Methods.GET, basePath + "/libs/granite/security/truststore.json", getTruststoreInfo())
            .add(Methods.POST, basePath + "/etc/replication/agents.{runmode}/{name}", postAgent())
            .add(Methods.POST, basePath + "/{intermediatePath}/{authorizableId}.ks.html", postAuthorizableKeystore())
            .add(Methods.POST, basePath + "/libs/granite/security/post/authorizables", postAuthorizables())
            .add(Methods.POST, basePath + "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config", postConfigAdobeGraniteSamlAuthenticationHandler())
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.felix.http", postConfigApacheFelixJettyBasedHttpService())
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.http.proxyconfigurator.config", postConfigApacheHttpComponentsProxyConfiguration())
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", postConfigApacheSlingDavExServlet())
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet", postConfigApacheSlingGetServlet())
            .add(Methods.POST, basePath + "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter", postConfigApacheSlingReferrerFilter())
            .add(Methods.POST, basePath + "/apps/system/config/{configNodeName}", postConfigProperty())
            .add(Methods.POST, basePath + "/{path}/{name}", postNode())
            .add(Methods.POST, basePath + "/{path}/{name}.rw.html", postNodeRw())
            .add(Methods.POST, basePath + "/{path}/", postPath())
            .add(Methods.POST, basePath + "/bin/querybuilder.json", postQuery())
            .add(Methods.POST, basePath + "/etc/replication/treeactivation.html", postTreeActivation())
            .add(Methods.POST, basePath + "/libs/granite/security/post/truststore", postTruststore())
            .add(Methods.POST, basePath + "/etc/truststore", postTruststorePKCS12())
            ;
    }
}
