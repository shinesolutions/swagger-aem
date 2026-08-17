# Adobe Experience Manager (AEM) API - Jetbrains API Client

## General API description

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

* API basepath : [http://localhost](http://localhost)
* Version : 3.7.1-pre.0

## Documentation for API Endpoints

All URIs are relative to *http://localhost*, but will link to the `.http` file that contains the endpoint definition.
There may be multiple requests for a single endpoint, one for each example described in the OpenAPI specification.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsoleApi* | [**getAemProductInfo**](Apis/ConsoleApi.http#getaemproductinfo) | **GET** /system/console/status-productinfo.json | 
*ConsoleApi* | [**getBundleInfo**](Apis/ConsoleApi.http#getbundleinfo) | **GET** /system/console/bundles/{name}.json | 
*ConsoleApi* | [**getConfigMgr**](Apis/ConsoleApi.http#getconfigmgr) | **GET** /system/console/configMgr | 
*ConsoleApi* | [**postBundle**](Apis/ConsoleApi.http#postbundle) | **POST** /system/console/bundles/{name} | 
*ConsoleApi* | [**postJmxRepository**](Apis/ConsoleApi.http#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
*ConsoleApi* | [**postSamlConfiguration**](Apis/ConsoleApi.http#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*CqApi* | [**getLoginPage**](Apis/CqApi.http#getloginpage) | **GET** /libs/granite/core/content/login.html | 
*CqApi* | [**postCqActions**](Apis/CqApi.http#postcqactions) | **POST** /.cqactions.html | 
*CrxApi* | [**getCrxdeStatus**](Apis/CrxApi.http#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
*CrxApi* | [**getInstallStatus**](Apis/CrxApi.http#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp | 
*CrxApi* | [**getPackageManagerServlet**](Apis/CrxApi.http#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html | 
*CrxApi* | [**postPackageService**](Apis/CrxApi.http#postpackageservice) | **POST** /crx/packmgr/service.jsp | 
*CrxApi* | [**postPackageServiceJson**](Apis/CrxApi.http#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} | 
*CrxApi* | [**postPackageUpdate**](Apis/CrxApi.http#postpackageupdate) | **POST** /crx/packmgr/update.jsp | 
*CrxApi* | [**postSetPassword**](Apis/CrxApi.http#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp | 
*CustomApi* | [**getAemHealthCheck**](Apis/CustomApi.http#getaemhealthcheck) | **GET** /system/health | 
*CustomApi* | [**postConfigAemHealthCheckServlet**](Apis/CustomApi.http#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
*CustomApi* | [**postConfigAemPasswordReset**](Apis/CustomApi.http#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
*GraniteApi* | [**sslSetup**](Apis/GraniteApi.http#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html | 
*SlingApi* | [**deleteAgent**](Apis/SlingApi.http#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**deleteNode**](Apis/SlingApi.http#deletenode) | **DELETE** /{path}/{name} | 
*SlingApi* | [**getAgent**](Apis/SlingApi.http#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**getAgents**](Apis/SlingApi.http#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
*SlingApi* | [**getAuthorizableKeystore**](Apis/SlingApi.http#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
*SlingApi* | [**getKeystore**](Apis/SlingApi.http#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
*SlingApi* | [**getNode**](Apis/SlingApi.http#getnode) | **GET** /{path}/{name} | 
*SlingApi* | [**getPackage**](Apis/SlingApi.http#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
*SlingApi* | [**getPackageFilter**](Apis/SlingApi.http#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
*SlingApi* | [**getQuery**](Apis/SlingApi.http#getquery) | **GET** /bin/querybuilder.json | 
*SlingApi* | [**getTruststore**](Apis/SlingApi.http#gettruststore) | **GET** /etc/truststore/truststore.p12 | 
*SlingApi* | [**getTruststoreInfo**](Apis/SlingApi.http#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | 
*SlingApi* | [**postAgent**](Apis/SlingApi.http#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**postAuthorizableKeystore**](Apis/SlingApi.http#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
*SlingApi* | [**postAuthorizables**](Apis/SlingApi.http#postauthorizables) | **POST** /libs/granite/security/post/authorizables | 
*SlingApi* | [**postConfigAdobeGraniteSamlAuthenticationHandler**](Apis/SlingApi.http#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
*SlingApi* | [**postConfigApacheFelixJettyBasedHttpService**](Apis/SlingApi.http#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | 
*SlingApi* | [**postConfigApacheHttpComponentsProxyConfiguration**](Apis/SlingApi.http#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
*SlingApi* | [**postConfigApacheSlingDavExServlet**](Apis/SlingApi.http#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*SlingApi* | [**postConfigApacheSlingGetServlet**](Apis/SlingApi.http#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
*SlingApi* | [**postConfigApacheSlingReferrerFilter**](Apis/SlingApi.http#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
*SlingApi* | [**postConfigProperty**](Apis/SlingApi.http#postconfigproperty) | **POST** /apps/system/config/{configNodeName} | 
*SlingApi* | [**postNode**](Apis/SlingApi.http#postnode) | **POST** /{path}/{name} | 
*SlingApi* | [**postNodeRw**](Apis/SlingApi.http#postnoderw) | **POST** /{path}/{name}.rw.html | 
*SlingApi* | [**postPath**](Apis/SlingApi.http#postpath) | **POST** /{path}/ | 
*SlingApi* | [**postQuery**](Apis/SlingApi.http#postquery) | **POST** /bin/querybuilder.json | 
*SlingApi* | [**postTreeActivation**](Apis/SlingApi.http#posttreeactivation) | **POST** /libs/replication/treeactivation.html | 
*SlingApi* | [**postTruststore**](Apis/SlingApi.http#posttruststore) | **POST** /libs/granite/security/post/truststore | 
*SlingApi* | [**postTruststorePKCS12**](Apis/SlingApi.http#posttruststorepkcs12) | **POST** /etc/truststore | 


## Usage

### Prerequisites

You need [IntelliJ](https://www.jetbrains.com/idea/) to be able to run those queries. More information can be found [here](https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html).
You may have some luck running queries using the [Code REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) as well, but your mileage may vary.

### Variables and Environment files

* Generally speaking, you want queries to be specific using custom variables. All variables in the `.http` files have the `` format.
* You can create [public or private environment files](https://www.jetbrains.com/help/idea/exploring-http-syntax.html#environment-variables) to dynamically replace the variables at runtime.

_Note: don't commit private environment files! They typically will contain sensitive information like API Keys._

### Customizations

If you have control over the generation of the files here, there are two main things you can do

* Select elements to replace as variables during generation. The process is case-sensitive. For example, API_KEY -> 
    * For this, run the generation with the `bodyVariables` property, followed by a "-" separated list of variables
    * Example: `--additional-properties bodyVariables=YOUR_MERCHANT_ACCOUNT-YOUR_COMPANY_ACCOUNT-YOUR_BALANCE_PLATFORM`
* Add custom headers to _all_ requests. This can be useful for example if your specifications are missing [security schemes](https://github.com/github/rest-api-description/issues/237).
    * For this, run the generation with the `customHeaders` property, followed by a "&" separated list of variables
    * Example : `--additional-properties=customHeaders="Cookie:X-API-KEY="&"Accept-Encoding=gzip"`

_This client was generated by the [jetbrains-http-client](https://openapi-generator.tech/docs/generators/jetbrains-http-client) generator of OpenAPI Generator_