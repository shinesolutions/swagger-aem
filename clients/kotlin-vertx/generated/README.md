# org.openapitools - Kotlin Server library for Adobe Experience Manager (AEM) API

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsoleApi* | [**getAemProductInfo**](docs/ConsoleApi.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json | 
*ConsoleApi* | [**getBundleInfo**](docs/ConsoleApi.md#getbundleinfo) | **GET** /system/console/bundles/{name}.json | 
*ConsoleApi* | [**getConfigMgr**](docs/ConsoleApi.md#getconfigmgr) | **GET** /system/console/configMgr | 
*ConsoleApi* | [**postBundle**](docs/ConsoleApi.md#postbundle) | **POST** /system/console/bundles/{name} | 
*ConsoleApi* | [**postJmxRepository**](docs/ConsoleApi.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
*ConsoleApi* | [**postSamlConfiguration**](docs/ConsoleApi.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*CqApi* | [**getLoginPage**](docs/CqApi.md#getloginpage) | **GET** /libs/granite/core/content/login.html | 
*CqApi* | [**postCqActions**](docs/CqApi.md#postcqactions) | **POST** /.cqactions.html | 
*CrxApi* | [**getCrxdeStatus**](docs/CrxApi.md#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
*CrxApi* | [**getInstallStatus**](docs/CrxApi.md#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp | 
*CrxApi* | [**getPackageManagerServlet**](docs/CrxApi.md#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html | 
*CrxApi* | [**postPackageService**](docs/CrxApi.md#postpackageservice) | **POST** /crx/packmgr/service.jsp | 
*CrxApi* | [**postPackageServiceJson**](docs/CrxApi.md#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} | 
*CrxApi* | [**postPackageUpdate**](docs/CrxApi.md#postpackageupdate) | **POST** /crx/packmgr/update.jsp | 
*CrxApi* | [**postSetPassword**](docs/CrxApi.md#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp | 
*CustomApi* | [**getAemHealthCheck**](docs/CustomApi.md#getaemhealthcheck) | **GET** /system/health | 
*CustomApi* | [**postConfigAemHealthCheckServlet**](docs/CustomApi.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
*CustomApi* | [**postConfigAemPasswordReset**](docs/CustomApi.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
*GraniteApi* | [**sslSetup**](docs/GraniteApi.md#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html | 
*SlingApi* | [**deleteAgent**](docs/SlingApi.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**deleteNode**](docs/SlingApi.md#deletenode) | **DELETE** /{path}/{name} | 
*SlingApi* | [**getAgent**](docs/SlingApi.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**getAgents**](docs/SlingApi.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
*SlingApi* | [**getAuthorizableKeystore**](docs/SlingApi.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
*SlingApi* | [**getKeystore**](docs/SlingApi.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
*SlingApi* | [**getNode**](docs/SlingApi.md#getnode) | **GET** /{path}/{name} | 
*SlingApi* | [**getPackage**](docs/SlingApi.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
*SlingApi* | [**getPackageFilter**](docs/SlingApi.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
*SlingApi* | [**getQuery**](docs/SlingApi.md#getquery) | **GET** /bin/querybuilder.json | 
*SlingApi* | [**getTruststore**](docs/SlingApi.md#gettruststore) | **GET** /etc/truststore/truststore.p12 | 
*SlingApi* | [**getTruststoreInfo**](docs/SlingApi.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | 
*SlingApi* | [**postAgent**](docs/SlingApi.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**postAuthorizableKeystore**](docs/SlingApi.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
*SlingApi* | [**postAuthorizables**](docs/SlingApi.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables | 
*SlingApi* | [**postConfigAdobeGraniteSamlAuthenticationHandler**](docs/SlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
*SlingApi* | [**postConfigApacheFelixJettyBasedHttpService**](docs/SlingApi.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | 
*SlingApi* | [**postConfigApacheHttpComponentsProxyConfiguration**](docs/SlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
*SlingApi* | [**postConfigApacheSlingDavExServlet**](docs/SlingApi.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*SlingApi* | [**postConfigApacheSlingGetServlet**](docs/SlingApi.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
*SlingApi* | [**postConfigApacheSlingReferrerFilter**](docs/SlingApi.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
*SlingApi* | [**postConfigProperty**](docs/SlingApi.md#postconfigproperty) | **POST** /apps/system/config/{configNodeName} | 
*SlingApi* | [**postNode**](docs/SlingApi.md#postnode) | **POST** /{path}/{name} | 
*SlingApi* | [**postNodeRw**](docs/SlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html | 
*SlingApi* | [**postPath**](docs/SlingApi.md#postpath) | **POST** /{path}/ | 
*SlingApi* | [**postQuery**](docs/SlingApi.md#postquery) | **POST** /bin/querybuilder.json | 
*SlingApi* | [**postTreeActivation**](docs/SlingApi.md#posttreeactivation) | **POST** /libs/replication/treeactivation.html | 
*SlingApi* | [**postTruststore**](docs/SlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore | 
*SlingApi* | [**postTruststorePKCS12**](docs/SlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore | 


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.BundleData](docs/BundleData.md)
 - [org.openapitools.server.api.model.BundleDataProp](docs/BundleDataProp.md)
 - [org.openapitools.server.api.model.BundleInfo](docs/BundleInfo.md)
 - [org.openapitools.server.api.model.InstallStatus](docs/InstallStatus.md)
 - [org.openapitools.server.api.model.InstallStatusStatus](docs/InstallStatusStatus.md)
 - [org.openapitools.server.api.model.KeystoreChainItems](docs/KeystoreChainItems.md)
 - [org.openapitools.server.api.model.KeystoreInfo](docs/KeystoreInfo.md)
 - [org.openapitools.server.api.model.KeystoreItems](docs/KeystoreItems.md)
 - [org.openapitools.server.api.model.SamlConfigurationInfo](docs/SamlConfigurationInfo.md)
 - [org.openapitools.server.api.model.SamlConfigurationProperties](docs/SamlConfigurationProperties.md)
 - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsArray](docs/SamlConfigurationPropertyItemsArray.md)
 - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsBoolean](docs/SamlConfigurationPropertyItemsBoolean.md)
 - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsLong](docs/SamlConfigurationPropertyItemsLong.md)
 - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsString](docs/SamlConfigurationPropertyItemsString.md)
 - [org.openapitools.server.api.model.TruststoreInfo](docs/TruststoreInfo.md)
 - [org.openapitools.server.api.model.TruststoreItems](docs/TruststoreItems.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="aemAuth"></a>
### aemAuth

- **Type**: HTTP basic authentication

