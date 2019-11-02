# Org.OpenAPITools - the C# library for the Adobe Experience Manager (AEM) API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.2.0-pre.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen
    For more information, please visit [http://shinesolutions.com](http://shinesolutions.com)

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 4.0 or later
- Windows Phone 7.1 (Mango)

<a name="dependencies"></a>
## Dependencies
- [RestSharp](https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.2.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;
```
<a name="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out Org.OpenAPITools.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {

            // Configure HTTP basic authorization: aemAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConsoleApi();

            try
            {
                List<string> result = apiInstance.GetAemProductInfo();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConsoleApi.GetAemProductInfo: " + e.Message );
            }

        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsoleApi* | [**GetAemProductInfo**](docs/ConsoleApi.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json | 
*ConsoleApi* | [**GetConfigMgr**](docs/ConsoleApi.md#getconfigmgr) | **GET** /system/console/configMgr | 
*ConsoleApi* | [**PostBundle**](docs/ConsoleApi.md#postbundle) | **POST** /system/console/bundles/{name} | 
*ConsoleApi* | [**PostJmxRepository**](docs/ConsoleApi.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
*ConsoleApi* | [**PostSamlConfiguration**](docs/ConsoleApi.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*CqApi* | [**GetLoginPage**](docs/CqApi.md#getloginpage) | **GET** /libs/granite/core/content/login.html | 
*CqApi* | [**PostCqActions**](docs/CqApi.md#postcqactions) | **POST** /.cqactions.html | 
*CrxApi* | [**GetCrxdeStatus**](docs/CrxApi.md#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
*CrxApi* | [**GetInstallStatus**](docs/CrxApi.md#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp | 
*CrxApi* | [**GetPackageManagerServlet**](docs/CrxApi.md#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html | 
*CrxApi* | [**PostPackageService**](docs/CrxApi.md#postpackageservice) | **POST** /crx/packmgr/service.jsp | 
*CrxApi* | [**PostPackageServiceJson**](docs/CrxApi.md#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} | 
*CrxApi* | [**PostPackageUpdate**](docs/CrxApi.md#postpackageupdate) | **POST** /crx/packmgr/update.jsp | 
*CrxApi* | [**PostSetPassword**](docs/CrxApi.md#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp | 
*CustomApi* | [**GetAemHealthCheck**](docs/CustomApi.md#getaemhealthcheck) | **GET** /system/health | 
*CustomApi* | [**PostConfigAemHealthCheckServlet**](docs/CustomApi.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
*CustomApi* | [**PostConfigAemPasswordReset**](docs/CustomApi.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
*SlingApi* | [**DeleteAgent**](docs/SlingApi.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**DeleteNode**](docs/SlingApi.md#deletenode) | **DELETE** /{path}/{name} | 
*SlingApi* | [**GetAgent**](docs/SlingApi.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**GetAgents**](docs/SlingApi.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
*SlingApi* | [**GetAuthorizableKeystore**](docs/SlingApi.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
*SlingApi* | [**GetKeystore**](docs/SlingApi.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
*SlingApi* | [**GetNode**](docs/SlingApi.md#getnode) | **GET** /{path}/{name} | 
*SlingApi* | [**GetPackage**](docs/SlingApi.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
*SlingApi* | [**GetPackageFilter**](docs/SlingApi.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
*SlingApi* | [**GetQuery**](docs/SlingApi.md#getquery) | **GET** /bin/querybuilder.json | 
*SlingApi* | [**GetTruststore**](docs/SlingApi.md#gettruststore) | **GET** /etc/truststore/truststore.p12 | 
*SlingApi* | [**GetTruststoreInfo**](docs/SlingApi.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | 
*SlingApi* | [**PostAgent**](docs/SlingApi.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**PostAuthorizableKeystore**](docs/SlingApi.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
*SlingApi* | [**PostAuthorizables**](docs/SlingApi.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables | 
*SlingApi* | [**PostConfigAdobeGraniteSamlAuthenticationHandler**](docs/SlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
*SlingApi* | [**PostConfigApacheFelixJettyBasedHttpService**](docs/SlingApi.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | 
*SlingApi* | [**PostConfigApacheHttpComponentsProxyConfiguration**](docs/SlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
*SlingApi* | [**PostConfigApacheSlingDavExServlet**](docs/SlingApi.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*SlingApi* | [**PostConfigApacheSlingGetServlet**](docs/SlingApi.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
*SlingApi* | [**PostConfigApacheSlingReferrerFilter**](docs/SlingApi.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
*SlingApi* | [**PostNode**](docs/SlingApi.md#postnode) | **POST** /{path}/{name} | 
*SlingApi* | [**PostNodeRw**](docs/SlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html | 
*SlingApi* | [**PostPath**](docs/SlingApi.md#postpath) | **POST** /{path}/ | 
*SlingApi* | [**PostQuery**](docs/SlingApi.md#postquery) | **POST** /bin/querybuilder.json | 
*SlingApi* | [**PostTreeActivation**](docs/SlingApi.md#posttreeactivation) | **POST** /etc/replication/treeactivation.html | 
*SlingApi* | [**PostTruststore**](docs/SlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore | 
*SlingApi* | [**PostTruststorePKCS12**](docs/SlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.InstallStatus](docs/InstallStatus.md)
 - [Model.InstallStatusStatus](docs/InstallStatusStatus.md)
 - [Model.KeystoreChainItems](docs/KeystoreChainItems.md)
 - [Model.KeystoreInfo](docs/KeystoreInfo.md)
 - [Model.KeystoreItems](docs/KeystoreItems.md)
 - [Model.SamlConfigurationInfo](docs/SamlConfigurationInfo.md)
 - [Model.SamlConfigurationProperties](docs/SamlConfigurationProperties.md)
 - [Model.SamlConfigurationPropertyItemsArray](docs/SamlConfigurationPropertyItemsArray.md)
 - [Model.SamlConfigurationPropertyItemsBoolean](docs/SamlConfigurationPropertyItemsBoolean.md)
 - [Model.SamlConfigurationPropertyItemsLong](docs/SamlConfigurationPropertyItemsLong.md)
 - [Model.SamlConfigurationPropertyItemsString](docs/SamlConfigurationPropertyItemsString.md)
 - [Model.TruststoreInfo](docs/TruststoreInfo.md)
 - [Model.TruststoreItems](docs/TruststoreItems.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="aemAuth"></a>
### aemAuth

- **Type**: HTTP basic authentication
