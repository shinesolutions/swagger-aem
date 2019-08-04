# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/openapi-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.ConsoleApi;

public class ConsoleApiExample {

    public static void main(String[] args) {
        ConsoleApi apiInstance = new ConsoleApi();
        try {
            List<String> result = apiInstance.getAemProductInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsoleApi#getAemProductInfo");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsoleApi* | [**getAemProductInfo**](docs/ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
*ConsoleApi* | [**getConfigMgr**](docs/ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
*ConsoleApi* | [**postBundle**](docs/ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
*ConsoleApi* | [**postJmxRepository**](docs/ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
*ConsoleApi* | [**postSamlConfiguration**](docs/ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*CqApi* | [**getLoginPage**](docs/CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
*CqApi* | [**postCqActions**](docs/CqApi.md#postCqActions) | **POST** /.cqactions.html | 
*CrxApi* | [**getCrxdeStatus**](docs/CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
*CrxApi* | [**getInstallStatus**](docs/CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
*CrxApi* | [**getPackageManagerServlet**](docs/CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
*CrxApi* | [**postPackageService**](docs/CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
*CrxApi* | [**postPackageServiceJson**](docs/CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
*CrxApi* | [**postPackageUpdate**](docs/CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
*CrxApi* | [**postSetPassword**](docs/CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 
*CustomApi* | [**getAemHealthCheck**](docs/CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
*CustomApi* | [**postConfigAemHealthCheckServlet**](docs/CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
*CustomApi* | [**postConfigAemPasswordReset**](docs/CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
*SlingApi* | [**deleteAgent**](docs/SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**deleteNode**](docs/SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
*SlingApi* | [**getAgent**](docs/SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**getAgents**](docs/SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
*SlingApi* | [**getAuthorizableKeystore**](docs/SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
*SlingApi* | [**getKeystore**](docs/SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
*SlingApi* | [**getNode**](docs/SlingApi.md#getNode) | **GET** /{path}/{name} | 
*SlingApi* | [**getPackage**](docs/SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
*SlingApi* | [**getPackageFilter**](docs/SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
*SlingApi* | [**getQuery**](docs/SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
*SlingApi* | [**getTruststore**](docs/SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
*SlingApi* | [**getTruststoreInfo**](docs/SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
*SlingApi* | [**postAgent**](docs/SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**postAuthorizableKeystore**](docs/SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
*SlingApi* | [**postAuthorizables**](docs/SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
*SlingApi* | [**postConfigAdobeGraniteSamlAuthenticationHandler**](docs/SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
*SlingApi* | [**postConfigApacheFelixJettyBasedHttpService**](docs/SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
*SlingApi* | [**postConfigApacheHttpComponentsProxyConfiguration**](docs/SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
*SlingApi* | [**postConfigApacheSlingDavExServlet**](docs/SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*SlingApi* | [**postConfigApacheSlingGetServlet**](docs/SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
*SlingApi* | [**postConfigApacheSlingReferrerFilter**](docs/SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
*SlingApi* | [**postNode**](docs/SlingApi.md#postNode) | **POST** /{path}/{name} | 
*SlingApi* | [**postNodeRw**](docs/SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
*SlingApi* | [**postPath**](docs/SlingApi.md#postPath) | **POST** /{path}/ | 
*SlingApi* | [**postQuery**](docs/SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
*SlingApi* | [**postTreeActivation**](docs/SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
*SlingApi* | [**postTruststore**](docs/SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
*SlingApi* | [**postTruststorePKCS12**](docs/SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


## Documentation for Models

 - [InstallStatus](docs/InstallStatus.md)
 - [InstallStatusStatus](docs/InstallStatusStatus.md)
 - [KeystoreChainItems](docs/KeystoreChainItems.md)
 - [KeystoreInfo](docs/KeystoreInfo.md)
 - [KeystoreItems](docs/KeystoreItems.md)
 - [SamlConfigurationInfo](docs/SamlConfigurationInfo.md)
 - [SamlConfigurationProperties](docs/SamlConfigurationProperties.md)
 - [SamlConfigurationPropertyItemsArray](docs/SamlConfigurationPropertyItemsArray.md)
 - [SamlConfigurationPropertyItemsBoolean](docs/SamlConfigurationPropertyItemsBoolean.md)
 - [SamlConfigurationPropertyItemsLong](docs/SamlConfigurationPropertyItemsLong.md)
 - [SamlConfigurationPropertyItemsString](docs/SamlConfigurationPropertyItemsString.md)
 - [TruststoreInfo](docs/TruststoreInfo.md)
 - [TruststoreItems](docs/TruststoreItems.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### aemAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

opensource@shinesolutions.com

