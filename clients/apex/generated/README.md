# Adobe Experience Manager (AEM) API API Client

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)


If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```


## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
   $ sfdx force:source:push
   ```
3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

    ```bash
    $ sfdx sfdx force:apex:test:run
    ```
5. Retrieve the job id from the console and check the test results.

  ```bash
  $ sfdx force:apex:test:report -i theJobId
  ```


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASConsoleApi api = new OASConsoleApi();
OASClient client = api.getClient();


try {
    // cross your fingers
    List<String> result = api.getAemProductInfo();
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASConsoleApi* | [**getAemProductInfo**](OASConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
*OASConsoleApi* | [**getConfigMgr**](OASConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
*OASConsoleApi* | [**postBundle**](OASConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
*OASConsoleApi* | [**postJmxRepository**](OASConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
*OASConsoleApi* | [**postSamlConfiguration**](OASConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*OASCqApi* | [**getLoginPage**](OASCqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
*OASCqApi* | [**postCqActions**](OASCqApi.md#postCqActions) | **POST** /.cqactions.html | 
*OASCrxApi* | [**getCrxdeStatus**](OASCrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
*OASCrxApi* | [**getInstallStatus**](OASCrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
*OASCrxApi* | [**getPackageManagerServlet**](OASCrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
*OASCrxApi* | [**postPackageService**](OASCrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
*OASCrxApi* | [**postPackageServiceJson**](OASCrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
*OASCrxApi* | [**postPackageUpdate**](OASCrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
*OASCrxApi* | [**postSetPassword**](OASCrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 
*OASCustomApi* | [**getAemHealthCheck**](OASCustomApi.md#getAemHealthCheck) | **GET** /system/health | 
*OASCustomApi* | [**postConfigAemHealthCheckServlet**](OASCustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
*OASCustomApi* | [**postConfigAemPasswordReset**](OASCustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
*OASSlingApi* | [**deleteAgent**](OASSlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
*OASSlingApi* | [**deleteNode**](OASSlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
*OASSlingApi* | [**getAgent**](OASSlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
*OASSlingApi* | [**getAgents**](OASSlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
*OASSlingApi* | [**getAuthorizableKeystore**](OASSlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
*OASSlingApi* | [**getKeystore**](OASSlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
*OASSlingApi* | [**getNode**](OASSlingApi.md#getNode) | **GET** /{path}/{name} | 
*OASSlingApi* | [**getPackage**](OASSlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
*OASSlingApi* | [**getPackageFilter**](OASSlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
*OASSlingApi* | [**getQuery**](OASSlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
*OASSlingApi* | [**getTruststore**](OASSlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
*OASSlingApi* | [**getTruststoreInfo**](OASSlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
*OASSlingApi* | [**postAgent**](OASSlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
*OASSlingApi* | [**postAuthorizableKeystore**](OASSlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
*OASSlingApi* | [**postAuthorizables**](OASSlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
*OASSlingApi* | [**postConfigAdobeGraniteSamlAuthenticationHandler**](OASSlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
*OASSlingApi* | [**postConfigApacheFelixJettyBasedHttpService**](OASSlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
*OASSlingApi* | [**postConfigApacheHttpComponentsProxyConfiguration**](OASSlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
*OASSlingApi* | [**postConfigApacheSlingDavExServlet**](OASSlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*OASSlingApi* | [**postConfigApacheSlingGetServlet**](OASSlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
*OASSlingApi* | [**postConfigApacheSlingReferrerFilter**](OASSlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
*OASSlingApi* | [**postNode**](OASSlingApi.md#postNode) | **POST** /{path}/{name} | 
*OASSlingApi* | [**postNodeRw**](OASSlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
*OASSlingApi* | [**postPath**](OASSlingApi.md#postPath) | **POST** /{path}/ | 
*OASSlingApi* | [**postQuery**](OASSlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
*OASSlingApi* | [**postTreeActivation**](OASSlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
*OASSlingApi* | [**postTruststore**](OASSlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
*OASSlingApi* | [**postTruststorePKCS12**](OASSlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


## Documentation for Models

 - [OASInstallStatus](OASInstallStatus.md)
 - [OASInstallStatusStatus](OASInstallStatusStatus.md)
 - [OASKeystoreChainItems](OASKeystoreChainItems.md)
 - [OASKeystoreInfo](OASKeystoreInfo.md)
 - [OASKeystoreItems](OASKeystoreItems.md)
 - [OASSamlConfigurationInfo](OASSamlConfigurationInfo.md)
 - [OASSamlConfigurationProperties](OASSamlConfigurationProperties.md)
 - [OASSamlConfigurationPropertyItemsArr](OASSamlConfigurationPropertyItemsArr.md)
 - [OASSamlConfigurationPropertyItemsBoo](OASSamlConfigurationPropertyItemsBoo.md)
 - [OASSamlConfigurationPropertyItemsLon](OASSamlConfigurationPropertyItemsLon.md)
 - [OASSamlConfigurationPropertyItemsStr](OASSamlConfigurationPropertyItemsStr.md)
 - [OASTruststoreInfo](OASTruststoreInfo.md)
 - [OASTruststoreItems](OASTruststoreItems.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### aemAuth

- **Type**: HTTP basic authentication


## Author

opensource@shinesolutions.com

