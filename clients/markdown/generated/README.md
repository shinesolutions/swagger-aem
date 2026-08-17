# Documentation for Adobe Experience Manager (AEM) API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *ConsoleApi* | [**getAemProductInfo**](Apis/ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json |  |
*ConsoleApi* | [**getBundleInfo**](Apis/ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json |  |
*ConsoleApi* | [**getConfigMgr**](Apis/ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr |  |
*ConsoleApi* | [**postBundle**](Apis/ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} |  |
*ConsoleApi* | [**postJmxRepository**](Apis/ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} |  |
*ConsoleApi* | [**postSamlConfiguration**](Apis/ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler |  |
| *CqApi* | [**getLoginPage**](Apis/CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html |  |
*CqApi* | [**postCqActions**](Apis/CqApi.md#postCqActions) | **POST** /.cqactions.html |  |
| *CrxApi* | [**getCrxdeStatus**](Apis/CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json |  |
*CrxApi* | [**getInstallStatus**](Apis/CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp |  |
*CrxApi* | [**getPackageManagerServlet**](Apis/CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html |  |
*CrxApi* | [**postPackageService**](Apis/CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp |  |
*CrxApi* | [**postPackageServiceJson**](Apis/CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} |  |
*CrxApi* | [**postPackageUpdate**](Apis/CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp |  |
*CrxApi* | [**postSetPassword**](Apis/CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp |  |
| *CustomApi* | [**getAemHealthCheck**](Apis/CustomApi.md#getAemHealthCheck) | **GET** /system/health |  |
*CustomApi* | [**postConfigAemHealthCheckServlet**](Apis/CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck |  |
*CustomApi* | [**postConfigAemPasswordReset**](Apis/CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator |  |
| *GraniteApi* | [**sslSetup**](Apis/GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html |  |
| *SlingApi* | [**deleteAgent**](Apis/SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} |  |
*SlingApi* | [**deleteNode**](Apis/SlingApi.md#deleteNode) | **DELETE** /{path}/{name} |  |
*SlingApi* | [**getAgent**](Apis/SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} |  |
*SlingApi* | [**getAgents**](Apis/SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json |  |
*SlingApi* | [**getAuthorizableKeystore**](Apis/SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json |  |
*SlingApi* | [**getKeystore**](Apis/SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 |  |
*SlingApi* | [**getNode**](Apis/SlingApi.md#getNode) | **GET** /{path}/{name} |  |
*SlingApi* | [**getPackage**](Apis/SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip |  |
*SlingApi* | [**getPackageFilter**](Apis/SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json |  |
*SlingApi* | [**getQuery**](Apis/SlingApi.md#getQuery) | **GET** /bin/querybuilder.json |  |
*SlingApi* | [**getTruststore**](Apis/SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 |  |
*SlingApi* | [**getTruststoreInfo**](Apis/SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json |  |
*SlingApi* | [**postAgent**](Apis/SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} |  |
*SlingApi* | [**postAuthorizableKeystore**](Apis/SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html |  |
*SlingApi* | [**postAuthorizables**](Apis/SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables |  |
*SlingApi* | [**postConfigAdobeGraniteSamlAuthenticationHandler**](Apis/SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config |  |
*SlingApi* | [**postConfigApacheFelixJettyBasedHttpService**](Apis/SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http |  |
*SlingApi* | [**postConfigApacheHttpComponentsProxyConfiguration**](Apis/SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config |  |
*SlingApi* | [**postConfigApacheSlingDavExServlet**](Apis/SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet |  |
*SlingApi* | [**postConfigApacheSlingGetServlet**](Apis/SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet |  |
*SlingApi* | [**postConfigApacheSlingReferrerFilter**](Apis/SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter |  |
*SlingApi* | [**postConfigProperty**](Apis/SlingApi.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} |  |
*SlingApi* | [**postNode**](Apis/SlingApi.md#postNode) | **POST** /{path}/{name} |  |
*SlingApi* | [**postNodeRw**](Apis/SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html |  |
*SlingApi* | [**postPath**](Apis/SlingApi.md#postPath) | **POST** /{path}/ |  |
*SlingApi* | [**postQuery**](Apis/SlingApi.md#postQuery) | **POST** /bin/querybuilder.json |  |
*SlingApi* | [**postTreeActivation**](Apis/SlingApi.md#postTreeActivation) | **POST** /libs/replication/treeactivation.html |  |
*SlingApi* | [**postTruststore**](Apis/SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore |  |
*SlingApi* | [**postTruststorePKCS12**](Apis/SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore |  |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [BundleData](./Models/BundleData.md)
 - [BundleDataProp](./Models/BundleDataProp.md)
 - [BundleInfo](./Models/BundleInfo.md)
 - [InstallStatus](./Models/InstallStatus.md)
 - [InstallStatus_status](./Models/InstallStatus_status.md)
 - [KeystoreChainItems](./Models/KeystoreChainItems.md)
 - [KeystoreInfo](./Models/KeystoreInfo.md)
 - [KeystoreItems](./Models/KeystoreItems.md)
 - [SamlConfigurationInfo](./Models/SamlConfigurationInfo.md)
 - [SamlConfigurationProperties](./Models/SamlConfigurationProperties.md)
 - [SamlConfigurationPropertyItemsArray](./Models/SamlConfigurationPropertyItemsArray.md)
 - [SamlConfigurationPropertyItemsBoolean](./Models/SamlConfigurationPropertyItemsBoolean.md)
 - [SamlConfigurationPropertyItemsLong](./Models/SamlConfigurationPropertyItemsLong.md)
 - [SamlConfigurationPropertyItemsString](./Models/SamlConfigurationPropertyItemsString.md)
 - [TruststoreInfo](./Models/TruststoreInfo.md)
 - [TruststoreItems](./Models/TruststoreItems.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="aemAuth"></a>
### aemAuth

- **Type**: HTTP basic authentication

