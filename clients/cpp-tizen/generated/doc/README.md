# Documentation for Adobe Experience Manager (AEM) API 3.5.0-pre.0 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Adobe Experience Manager (AEM) API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to http://localhosthttp://localhost


### ConsoleManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getAemProductInfoSync* | *GET* /system/console/status-productinfo.json | .
*getAemProductInfoASync* | *GET* /system/console/status-productinfo.json | .
*getBundleInfoSync* | *GET* /system/console/bundles/{name}.json | .
*getBundleInfoASync* | *GET* /system/console/bundles/{name}.json | .
*getConfigMgrSync* | *GET* /system/console/configMgr | .
*getConfigMgrASync* | *GET* /system/console/configMgr | .
*postBundleSync* | *POST* /system/console/bundles/{name} | .
*postBundleASync* | *POST* /system/console/bundles/{name} | .
*postJmxRepositorySync* | *POST* /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | .
*postJmxRepositoryASync* | *POST* /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | .
*postSamlConfigurationSync* | *POST* /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | .
*postSamlConfigurationASync* | *POST* /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | .


### CqManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getLoginPageSync* | *GET* /libs/granite/core/content/login.html | .
*getLoginPageASync* | *GET* /libs/granite/core/content/login.html | .
*postCqActionsSync* | *POST* /.cqactions.html | .
*postCqActionsASync* | *POST* /.cqactions.html | .


### CrxManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getCrxdeStatusSync* | *GET* /crx/server/crx.default/jcr:root/.1.json | .
*getCrxdeStatusASync* | *GET* /crx/server/crx.default/jcr:root/.1.json | .
*getInstallStatusSync* | *GET* /crx/packmgr/installstatus.jsp | .
*getInstallStatusASync* | *GET* /crx/packmgr/installstatus.jsp | .
*getPackageManagerServletSync* | *GET* /crx/packmgr/service/script.html | .
*getPackageManagerServletASync* | *GET* /crx/packmgr/service/script.html | .
*postPackageServiceSync* | *POST* /crx/packmgr/service.jsp | .
*postPackageServiceASync* | *POST* /crx/packmgr/service.jsp | .
*postPackageServiceJsonSync* | *POST* /crx/packmgr/service/.json/{path} | .
*postPackageServiceJsonASync* | *POST* /crx/packmgr/service/.json/{path} | .
*postPackageUpdateSync* | *POST* /crx/packmgr/update.jsp | .
*postPackageUpdateASync* | *POST* /crx/packmgr/update.jsp | .
*postSetPasswordSync* | *POST* /crx/explorer/ui/setpassword.jsp | .
*postSetPasswordASync* | *POST* /crx/explorer/ui/setpassword.jsp | .


### CustomManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getAemHealthCheckSync* | *GET* /system/health | .
*getAemHealthCheckASync* | *GET* /system/health | .
*postConfigAemHealthCheckServletSync* | *POST* /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | .
*postConfigAemHealthCheckServletASync* | *POST* /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | .
*postConfigAemPasswordResetSync* | *POST* /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | .
*postConfigAemPasswordResetASync* | *POST* /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | .


### GraniteManager
Method | HTTP request | Description
------------- | ------------- | -------------
*sslSetupSync* | *POST* /libs/granite/security/post/sslSetup.html | .
*sslSetupASync* | *POST* /libs/granite/security/post/sslSetup.html | .


### SlingManager
Method | HTTP request | Description
------------- | ------------- | -------------
*deleteAgentSync* | *DELETE* /etc/replication/agents.{runmode}/{name} | .
*deleteAgentASync* | *DELETE* /etc/replication/agents.{runmode}/{name} | .
*deleteNodeSync* | *DELETE* /{path}/{name} | .
*deleteNodeASync* | *DELETE* /{path}/{name} | .
*getAgentSync* | *GET* /etc/replication/agents.{runmode}/{name} | .
*getAgentASync* | *GET* /etc/replication/agents.{runmode}/{name} | .
*getAgentsSync* | *GET* /etc/replication/agents.{runmode}.-1.json | .
*getAgentsASync* | *GET* /etc/replication/agents.{runmode}.-1.json | .
*getAuthorizableKeystoreSync* | *GET* /{intermediatePath}/{authorizableId}.ks.json | .
*getAuthorizableKeystoreASync* | *GET* /{intermediatePath}/{authorizableId}.ks.json | .
*getKeystoreSync* | *GET* /{intermediatePath}/{authorizableId}/keystore/store.p12 | .
*getKeystoreASync* | *GET* /{intermediatePath}/{authorizableId}/keystore/store.p12 | .
*getNodeSync* | *GET* /{path}/{name} | .
*getNodeASync* | *GET* /{path}/{name} | .
*getPackageSync* | *GET* /etc/packages/{group}/{name}-{version}.zip | .
*getPackageASync* | *GET* /etc/packages/{group}/{name}-{version}.zip | .
*getPackageFilterSync* | *GET* /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | .
*getPackageFilterASync* | *GET* /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | .
*getQuerySync* | *GET* /bin/querybuilder.json | .
*getQueryASync* | *GET* /bin/querybuilder.json | .
*getTruststoreSync* | *GET* /etc/truststore/truststore.p12 | .
*getTruststoreASync* | *GET* /etc/truststore/truststore.p12 | .
*getTruststoreInfoSync* | *GET* /libs/granite/security/truststore.json | .
*getTruststoreInfoASync* | *GET* /libs/granite/security/truststore.json | .
*postAgentSync* | *POST* /etc/replication/agents.{runmode}/{name} | .
*postAgentASync* | *POST* /etc/replication/agents.{runmode}/{name} | .
*postAuthorizableKeystoreSync* | *POST* /{intermediatePath}/{authorizableId}.ks.html | .
*postAuthorizableKeystoreASync* | *POST* /{intermediatePath}/{authorizableId}.ks.html | .
*postAuthorizablesSync* | *POST* /libs/granite/security/post/authorizables | .
*postAuthorizablesASync* | *POST* /libs/granite/security/post/authorizables | .
*postConfigAdobeGraniteSamlAuthenticationHandlerSync* | *POST* /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | .
*postConfigAdobeGraniteSamlAuthenticationHandlerASync* | *POST* /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | .
*postConfigApacheFelixJettyBasedHttpServiceSync* | *POST* /apps/system/config/org.apache.felix.http | .
*postConfigApacheFelixJettyBasedHttpServiceASync* | *POST* /apps/system/config/org.apache.felix.http | .
*postConfigApacheHttpComponentsProxyConfigurationSync* | *POST* /apps/system/config/org.apache.http.proxyconfigurator.config | .
*postConfigApacheHttpComponentsProxyConfigurationASync* | *POST* /apps/system/config/org.apache.http.proxyconfigurator.config | .
*postConfigApacheSlingDavExServletSync* | *POST* /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | .
*postConfigApacheSlingDavExServletASync* | *POST* /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | .
*postConfigApacheSlingGetServletSync* | *POST* /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | .
*postConfigApacheSlingGetServletASync* | *POST* /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | .
*postConfigApacheSlingReferrerFilterSync* | *POST* /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | .
*postConfigApacheSlingReferrerFilterASync* | *POST* /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | .
*postConfigPropertySync* | *POST* /apps/system/config/{configNodeName} | .
*postConfigPropertyASync* | *POST* /apps/system/config/{configNodeName} | .
*postNodeSync* | *POST* /{path}/{name} | .
*postNodeASync* | *POST* /{path}/{name} | .
*postNodeRwSync* | *POST* /{path}/{name}.rw.html | .
*postNodeRwASync* | *POST* /{path}/{name}.rw.html | .
*postPathSync* | *POST* /{path}/ | .
*postPathASync* | *POST* /{path}/ | .
*postQuerySync* | *POST* /bin/querybuilder.json | .
*postQueryASync* | *POST* /bin/querybuilder.json | .
*postTreeActivationSync* | *POST* /etc/replication/treeactivation.html | .
*postTreeActivationASync* | *POST* /etc/replication/treeactivation.html | .
*postTruststoreSync* | *POST* /libs/granite/security/post/truststore | .
*postTruststoreASync* | *POST* /libs/granite/security/post/truststore | .
*postTruststorePKCS12Sync* | *POST* /etc/truststore | .
*postTruststorePKCS12ASync* | *POST* /etc/truststore | .


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *BundleData* | 
 *BundleDataProp* | 
 *BundleInfo* | 
 *InstallStatus* | 
 *InstallStatus_status* | 
 *KeystoreChainItems* | 
 *KeystoreInfo* | 
 *KeystoreItems* | 
 *SamlConfigurationInfo* | 
 *SamlConfigurationProperties* | 
 *SamlConfigurationPropertyItemsArray* | 
 *SamlConfigurationPropertyItemsBoolean* | 
 *SamlConfigurationPropertyItemsLong* | 
 *SamlConfigurationPropertyItemsString* | 
 *TruststoreInfo* | 
 *TruststoreItems* | 

