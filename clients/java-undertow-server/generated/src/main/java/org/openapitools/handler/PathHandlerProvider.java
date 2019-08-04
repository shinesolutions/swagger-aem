package org.openapitools.handler;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {

    public HttpHandler getHandler() {
        HttpHandler handler = Handlers.routing()


            .add(Methods.GET, "//system/console/status-productinfo.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAemProductInfo");
                        }
                    })


            .add(Methods.GET, "//system/console/configMgr", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getConfigMgr");
                        }
                    })


            .add(Methods.POST, "//system/console/bundles/{name}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postBundle");
                        }
                    })


            .add(Methods.POST, "//system/console/jmx/com.adobe.granite:type=Repository/op/{action}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postJmxRepository");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postSamlConfiguration");
                        }
                    })


            .add(Methods.GET, "//libs/granite/core/content/login.html", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getLoginPage");
                        }
                    })


            .add(Methods.POST, "//.cqactions.html", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postCqActions");
                        }
                    })


            .add(Methods.GET, "//crx/server/crx.default/jcr:root/.1.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getCrxdeStatus");
                        }
                    })


            .add(Methods.GET, "//crx/packmgr/installstatus.jsp", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getInstallStatus");
                        }
                    })


            .add(Methods.GET, "//crx/packmgr/service/script.html", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPackageManagerServlet");
                        }
                    })


            .add(Methods.POST, "//crx/packmgr/service.jsp", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postPackageService");
                        }
                    })


            .add(Methods.POST, "//crx/packmgr/service/.json/{path}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postPackageServiceJson");
                        }
                    })


            .add(Methods.POST, "//crx/packmgr/update.jsp", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postPackageUpdate");
                        }
                    })


            .add(Methods.POST, "//crx/explorer/ui/setpassword.jsp", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postSetPassword");
                        }
                    })


            .add(Methods.GET, "//system/health", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAemHealthCheck");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigAemHealthCheckServlet");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/com.shinesolutions.aem.passwordreset.Activator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigAemPasswordReset");
                        }
                    })


            .add(Methods.DELETE, "//etc/replication/agents.{runmode}/{name}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteAgent");
                        }
                    })


            .add(Methods.DELETE, "//{path}/{name}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteNode");
                        }
                    })


            .add(Methods.GET, "//etc/replication/agents.{runmode}/{name}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAgent");
                        }
                    })


            .add(Methods.GET, "//etc/replication/agents.{runmode}.-1.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAgents");
                        }
                    })


            .add(Methods.GET, "//{intermediatePath}/{authorizableId}.ks.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAuthorizableKeystore");
                        }
                    })


            .add(Methods.GET, "//{intermediatePath}/{authorizableId}/keystore/store.p12", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getKeystore");
                        }
                    })


            .add(Methods.GET, "//{path}/{name}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getNode");
                        }
                    })


            .add(Methods.GET, "//etc/packages/{group}/{name}-{version}.zip", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPackage");
                        }
                    })


            .add(Methods.GET, "//etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPackageFilter");
                        }
                    })


            .add(Methods.GET, "//bin/querybuilder.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getQuery");
                        }
                    })


            .add(Methods.GET, "//etc/truststore/truststore.p12", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getTruststore");
                        }
                    })


            .add(Methods.GET, "//libs/granite/security/truststore.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getTruststoreInfo");
                        }
                    })


            .add(Methods.POST, "//etc/replication/agents.{runmode}/{name}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postAgent");
                        }
                    })


            .add(Methods.POST, "//{intermediatePath}/{authorizableId}.ks.html", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postAuthorizableKeystore");
                        }
                    })


            .add(Methods.POST, "//libs/granite/security/post/authorizables", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postAuthorizables");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigAdobeGraniteSamlAuthenticationHandler");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/org.apache.felix.http", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigApacheFelixJettyBasedHttpService");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/org.apache.http.proxyconfigurator.config", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigApacheHttpComponentsProxyConfiguration");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigApacheSlingDavExServlet");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigApacheSlingGetServlet");
                        }
                    })


            .add(Methods.POST, "//apps/system/config/org.apache.sling.security.impl.ReferrerFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postConfigApacheSlingReferrerFilter");
                        }
                    })


            .add(Methods.POST, "//{path}/{name}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postNode");
                        }
                    })


            .add(Methods.POST, "//{path}/{name}.rw.html", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postNodeRw");
                        }
                    })


            .add(Methods.POST, "//{path}/", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postPath");
                        }
                    })


            .add(Methods.POST, "//bin/querybuilder.json", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postQuery");
                        }
                    })


            .add(Methods.POST, "//etc/replication/treeactivation.html", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postTreeActivation");
                        }
                    })


            .add(Methods.POST, "//libs/granite/security/post/truststore", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postTruststore");
                        }
                    })


            .add(Methods.POST, "//etc/truststore", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("postTruststorePKCS12");
                        }
                    })

        ;
        return handler;
    }
}

