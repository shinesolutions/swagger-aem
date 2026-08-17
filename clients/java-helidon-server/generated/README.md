# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```
curl -X GET http://localhost/system/console/status-productinfo.json
curl -X GET http://localhost/system/console/bundles/{name}.json
curl -X GET http://localhost/system/console/configMgr
curl -X POST http://localhost/system/console/bundles/{name}
curl -X POST http://localhost/system/console/jmx/com.adobe.granite:type=Repository/op/{action}
curl -X POST http://localhost/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
curl -X GET http://localhost/libs/granite/core/content/login.html
curl -X POST http://localhost/.cqactions.html
curl -X GET http://localhost/crx/server/crx.default/jcr:root/.1.json
curl -X GET http://localhost/crx/packmgr/installstatus.jsp
curl -X GET http://localhost/crx/packmgr/service/script.html
curl -X POST http://localhost/crx/packmgr/service.jsp
curl -X POST http://localhost/crx/packmgr/service/.json/{path}
curl -X POST http://localhost/crx/packmgr/update.jsp
curl -X POST http://localhost/crx/explorer/ui/setpassword.jsp
curl -X GET http://localhost/system/health
curl -X POST http://localhost/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck
curl -X POST http://localhost/apps/system/config/com.shinesolutions.aem.passwordreset.Activator
curl -X POST http://localhost/libs/granite/security/post/sslSetup.html
curl -X DELETE http://localhost/etc/replication/agents.{runmode}/{name}
curl -X DELETE http://localhost/{path}/{name}
curl -X GET http://localhost/etc/replication/agents.{runmode}/{name}
curl -X GET http://localhost/etc/replication/agents.{runmode}.-1.json
curl -X GET http://localhost/{intermediatePath}/{authorizableId}.ks.json
curl -X GET http://localhost/{intermediatePath}/{authorizableId}/keystore/store.p12
curl -X GET http://localhost/{path}/{name}
curl -X GET http://localhost/etc/packages/{group}/{name}-{version}.zip
curl -X GET http://localhost/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json
curl -X GET http://localhost/bin/querybuilder.json
curl -X GET http://localhost/etc/truststore/truststore.p12
curl -X GET http://localhost/libs/granite/security/truststore.json
curl -X POST http://localhost/etc/replication/agents.{runmode}/{name}
curl -X POST http://localhost/{intermediatePath}/{authorizableId}.ks.html
curl -X POST http://localhost/libs/granite/security/post/authorizables
curl -X POST http://localhost/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config
curl -X POST http://localhost/apps/system/config/org.apache.felix.http
curl -X POST http://localhost/apps/system/config/org.apache.http.proxyconfigurator.config
curl -X POST http://localhost/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
curl -X POST http://localhost/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet
curl -X POST http://localhost/apps/system/config/org.apache.sling.security.impl.ReferrerFilter
curl -X POST http://localhost/apps/system/config/{configNodeName}
curl -X POST http://localhost/{path}/{name}
curl -X POST http://localhost/{path}/{name}.rw.html
curl -X POST http://localhost/{path}/
curl -X POST http://localhost/bin/querybuilder.json
curl -X POST http://localhost/libs/replication/treeactivation.html
curl -X POST http://localhost/libs/granite/security/post/truststore
curl -X POST http://localhost/etc/truststore

```

## Try health and metrics

```
curl -s -X GET http://localhost/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET http://localhost/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET http://localhost/metrics
{"base":...
. . .
```