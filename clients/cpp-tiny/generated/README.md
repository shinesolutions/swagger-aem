# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Adobe Experience Manager (AEM) API 3.7.1-pre.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to http://localhosthttp://localhost

### ConsoleApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getAemProductInfo* | *GET* /system/console/status-productinfo.json | .|
|*getBundleInfo* | *GET* /system/console/bundles/{name}.json | .|
|*getConfigMgr* | *GET* /system/console/configMgr | .|
|*postBundle* | *POST* /system/console/bundles/{name} | .|
|*postJmxRepository* | *POST* /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | .|
|*postSamlConfiguration* | *POST* /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | .|

### CqApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getLoginPage* | *GET* /libs/granite/core/content/login.html | .|
|*postCqActions* | *POST* /.cqactions.html | .|

### CrxApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getCrxdeStatus* | *GET* /crx/server/crx.default/jcr:root/.1.json | .|
|*getInstallStatus* | *GET* /crx/packmgr/installstatus.jsp | .|
|*getPackageManagerServlet* | *GET* /crx/packmgr/service/script.html | .|
|*postPackageService* | *POST* /crx/packmgr/service.jsp | .|
|*postPackageServiceJson* | *POST* /crx/packmgr/service/.json/{path} | .|
|*postPackageUpdate* | *POST* /crx/packmgr/update.jsp | .|
|*postSetPassword* | *POST* /crx/explorer/ui/setpassword.jsp | .|

### CustomApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getAemHealthCheck* | *GET* /system/health | .|
|*postConfigAemHealthCheckServlet* | *POST* /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | .|
|*postConfigAemPasswordReset* | *POST* /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | .|

### GraniteApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*sslSetup* | *POST* /libs/granite/security/post/sslSetup.html | .|

### SlingApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteAgent* | *DELETE* /etc/replication/agents.{runmode}/{name} | .|
|*deleteNode* | *DELETE* /{path}/{name} | .|
|*getAgent* | *GET* /etc/replication/agents.{runmode}/{name} | .|
|*getAgents* | *GET* /etc/replication/agents.{runmode}.-1.json | .|
|*getAuthorizableKeystore* | *GET* /{intermediatePath}/{authorizableId}.ks.json | .|
|*getKeystore* | *GET* /{intermediatePath}/{authorizableId}/keystore/store.p12 | .|
|*getNode* | *GET* /{path}/{name} | .|
|*getPackage* | *GET* /etc/packages/{group}/{name}-{version}.zip | .|
|*getPackageFilter* | *GET* /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | .|
|*getQuery* | *GET* /bin/querybuilder.json | .|
|*getTruststore* | *GET* /etc/truststore/truststore.p12 | .|
|*getTruststoreInfo* | *GET* /libs/granite/security/truststore.json | .|
|*postAgent* | *POST* /etc/replication/agents.{runmode}/{name} | .|
|*postAuthorizableKeystore* | *POST* /{intermediatePath}/{authorizableId}.ks.html | .|
|*postAuthorizables* | *POST* /libs/granite/security/post/authorizables | .|
|*postConfigAdobeGraniteSamlAuthenticationHandler* | *POST* /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | .|
|*postConfigApacheFelixJettyBasedHttpService* | *POST* /apps/system/config/org.apache.felix.http | .|
|*postConfigApacheHttpComponentsProxyConfiguration* | *POST* /apps/system/config/org.apache.http.proxyconfigurator.config | .|
|*postConfigApacheSlingDavExServlet* | *POST* /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | .|
|*postConfigApacheSlingGetServlet* | *POST* /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | .|
|*postConfigApacheSlingReferrerFilter* | *POST* /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | .|
|*postConfigProperty* | *POST* /apps/system/config/{configNodeName} | .|
|*postNode* | *POST* /{path}/{name} | .|
|*postNodeRw* | *POST* /{path}/{name}.rw.html | .|
|*postPath* | *POST* /{path}/ | .|
|*postQuery* | *POST* /bin/querybuilder.json | .|
|*postTreeActivation* | *POST* /libs/replication/treeactivation.html | .|
|*postTruststore* | *POST* /libs/granite/security/post/truststore | .|
|*postTruststorePKCS12* | *POST* /etc/truststore | .|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*BundleData* | |
|*BundleDataProp* | |
|*BundleInfo* | |
|*InstallStatus* | |
|*InstallStatus_status* | |
|*KeystoreChainItems* | |
|*KeystoreInfo* | |
|*KeystoreItems* | |
|*SamlConfigurationInfo* | |
|*SamlConfigurationProperties* | |
|*SamlConfigurationPropertyItemsArray* | |
|*SamlConfigurationPropertyItemsBoolean* | |
|*SamlConfigurationPropertyItemsLong* | |
|*SamlConfigurationPropertyItemsString* | |
|*TruststoreInfo* | |
|*TruststoreItems* | |

