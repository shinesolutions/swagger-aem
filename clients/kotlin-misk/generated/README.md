# Documentation for Adobe Experience Manager (AEM) API

    <a id="documentation-for-api-endpoints"></a>
    ## Documentation for API Endpoints

    All URIs are relative to *http://localhost*

    Class | Method | HTTP request | Description
    ------------ | ------------- | ------------- | -------------
    *ConsoleApi* | [**getAemProductInfo**](Apis/docs/ConsoleApi.md#getaemproductinfo) | **Get** /system/console/status-productinfo.json | 
    *ConsoleApi* | [**getBundleInfo**](Apis/docs/ConsoleApi.md#getbundleinfo) | **Get** /system/console/bundles/{name}.json | 
    *ConsoleApi* | [**getConfigMgr**](Apis/docs/ConsoleApi.md#getconfigmgr) | **Get** /system/console/configMgr | 
    *ConsoleApi* | [**postBundle**](Apis/docs/ConsoleApi.md#postbundle) | **Post** /system/console/bundles/{name} | 
    *ConsoleApi* | [**postJmxRepository**](Apis/docs/ConsoleApi.md#postjmxrepository) | **Post** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
    *ConsoleApi* | [**postSamlConfiguration**](Apis/docs/ConsoleApi.md#postsamlconfiguration) | **Post** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
    *CqApi* | [**getLoginPage**](Apis/docs/CqApi.md#getloginpage) | **Get** /libs/granite/core/content/login.html | 
    *CqApi* | [**postCqActions**](Apis/docs/CqApi.md#postcqactions) | **Post** /.cqactions.html | 
    *CrxApi* | [**getCrxdeStatus**](Apis/docs/CrxApi.md#getcrxdestatus) | **Get** /crx/server/crx.default/jcr:root/.1.json | 
    *CrxApi* | [**getInstallStatus**](Apis/docs/CrxApi.md#getinstallstatus) | **Get** /crx/packmgr/installstatus.jsp | 
    *CrxApi* | [**getPackageManagerServlet**](Apis/docs/CrxApi.md#getpackagemanagerservlet) | **Get** /crx/packmgr/service/script.html | 
    *CrxApi* | [**postPackageService**](Apis/docs/CrxApi.md#postpackageservice) | **Post** /crx/packmgr/service.jsp | 
    *CrxApi* | [**postPackageServiceJson**](Apis/docs/CrxApi.md#postpackageservicejson) | **Post** /crx/packmgr/service/.json/{path} | 
    *CrxApi* | [**postPackageUpdate**](Apis/docs/CrxApi.md#postpackageupdate) | **Post** /crx/packmgr/update.jsp | 
    *CrxApi* | [**postSetPassword**](Apis/docs/CrxApi.md#postsetpassword) | **Post** /crx/explorer/ui/setpassword.jsp | 
    *CustomApi* | [**getAemHealthCheck**](Apis/docs/CustomApi.md#getaemhealthcheck) | **Get** /system/health | 
    *CustomApi* | [**postConfigAemHealthCheckServlet**](Apis/docs/CustomApi.md#postconfigaemhealthcheckservlet) | **Post** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
    *CustomApi* | [**postConfigAemPasswordReset**](Apis/docs/CustomApi.md#postconfigaempasswordreset) | **Post** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
    *GraniteApi* | [**sslSetup**](Apis/docs/GraniteApi.md#sslsetup) | **Post** /libs/granite/security/post/sslSetup.html | 
    *SlingApi* | [**deleteAgent**](Apis/docs/SlingApi.md#deleteagent) | **Delete** /etc/replication/agents.{runmode}/{name} | 
    *SlingApi* | [**deleteNode**](Apis/docs/SlingApi.md#deletenode) | **Delete** /{path}/{name} | 
    *SlingApi* | [**getAgent**](Apis/docs/SlingApi.md#getagent) | **Get** /etc/replication/agents.{runmode}/{name} | 
    *SlingApi* | [**getAgents**](Apis/docs/SlingApi.md#getagents) | **Get** /etc/replication/agents.{runmode}.-1.json | 
    *SlingApi* | [**getAuthorizableKeystore**](Apis/docs/SlingApi.md#getauthorizablekeystore) | **Get** /{intermediatePath}/{authorizableId}.ks.json | 
    *SlingApi* | [**getKeystore**](Apis/docs/SlingApi.md#getkeystore) | **Get** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
    *SlingApi* | [**getNode**](Apis/docs/SlingApi.md#getnode) | **Get** /{path}/{name} | 
    *SlingApi* | [**getPackage**](Apis/docs/SlingApi.md#getpackage) | **Get** /etc/packages/{group}/{name}-{version}.zip | 
    *SlingApi* | [**getPackageFilter**](Apis/docs/SlingApi.md#getpackagefilter) | **Get** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
    *SlingApi* | [**getQuery**](Apis/docs/SlingApi.md#getquery) | **Get** /bin/querybuilder.json | 
    *SlingApi* | [**getTruststore**](Apis/docs/SlingApi.md#gettruststore) | **Get** /etc/truststore/truststore.p12 | 
    *SlingApi* | [**getTruststoreInfo**](Apis/docs/SlingApi.md#gettruststoreinfo) | **Get** /libs/granite/security/truststore.json | 
    *SlingApi* | [**postAgent**](Apis/docs/SlingApi.md#postagent) | **Post** /etc/replication/agents.{runmode}/{name} | 
    *SlingApi* | [**postAuthorizableKeystore**](Apis/docs/SlingApi.md#postauthorizablekeystore) | **Post** /{intermediatePath}/{authorizableId}.ks.html | 
    *SlingApi* | [**postAuthorizables**](Apis/docs/SlingApi.md#postauthorizables) | **Post** /libs/granite/security/post/authorizables | 
    *SlingApi* | [**postConfigAdobeGraniteSamlAuthenticationHandler**](Apis/docs/SlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **Post** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
    *SlingApi* | [**postConfigApacheFelixJettyBasedHttpService**](Apis/docs/SlingApi.md#postconfigapachefelixjettybasedhttpservice) | **Post** /apps/system/config/org.apache.felix.http | 
    *SlingApi* | [**postConfigApacheHttpComponentsProxyConfiguration**](Apis/docs/SlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **Post** /apps/system/config/org.apache.http.proxyconfigurator.config | 
    *SlingApi* | [**postConfigApacheSlingDavExServlet**](Apis/docs/SlingApi.md#postconfigapacheslingdavexservlet) | **Post** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
    *SlingApi* | [**postConfigApacheSlingGetServlet**](Apis/docs/SlingApi.md#postconfigapacheslinggetservlet) | **Post** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
    *SlingApi* | [**postConfigApacheSlingReferrerFilter**](Apis/docs/SlingApi.md#postconfigapacheslingreferrerfilter) | **Post** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
    *SlingApi* | [**postConfigProperty**](Apis/docs/SlingApi.md#postconfigproperty) | **Post** /apps/system/config/{configNodeName} | 
    *SlingApi* | [**postNode**](Apis/docs/SlingApi.md#postnode) | **Post** /{path}/{name} | 
    *SlingApi* | [**postNodeRw**](Apis/docs/SlingApi.md#postnoderw) | **Post** /{path}/{name}.rw.html | 
    *SlingApi* | [**postPath**](Apis/docs/SlingApi.md#postpath) | **Post** /{path}/ | 
    *SlingApi* | [**postQuery**](Apis/docs/SlingApi.md#postquery) | **Post** /bin/querybuilder.json | 
    *SlingApi* | [**postTreeActivation**](Apis/docs/SlingApi.md#posttreeactivation) | **Post** /libs/replication/treeactivation.html | 
    *SlingApi* | [**postTruststore**](Apis/docs/SlingApi.md#posttruststore) | **Post** /libs/granite/security/post/truststore | 
    *SlingApi* | [**postTruststorePKCS12**](Apis/docs/SlingApi.md#posttruststorepkcs12) | **Post** /etc/truststore | 
    

    <a id="documentation-for-models"></a>
    ## Documentation for Models

         - [org.openapitools.server.api.model.BundleData](Models/docs/BundleData.md)
         - [org.openapitools.server.api.model.BundleDataProp](Models/docs/BundleDataProp.md)
         - [org.openapitools.server.api.model.BundleInfo](Models/docs/BundleInfo.md)
         - [org.openapitools.server.api.model.InstallStatus](Models/docs/InstallStatus.md)
         - [org.openapitools.server.api.model.InstallStatusStatus](Models/docs/InstallStatusStatus.md)
         - [org.openapitools.server.api.model.KeystoreChainItems](Models/docs/KeystoreChainItems.md)
         - [org.openapitools.server.api.model.KeystoreInfo](Models/docs/KeystoreInfo.md)
         - [org.openapitools.server.api.model.KeystoreItems](Models/docs/KeystoreItems.md)
         - [org.openapitools.server.api.model.SamlConfigurationInfo](Models/docs/SamlConfigurationInfo.md)
         - [org.openapitools.server.api.model.SamlConfigurationProperties](Models/docs/SamlConfigurationProperties.md)
         - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsArray](Models/docs/SamlConfigurationPropertyItemsArray.md)
         - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsBoolean](Models/docs/SamlConfigurationPropertyItemsBoolean.md)
         - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsLong](Models/docs/SamlConfigurationPropertyItemsLong.md)
         - [org.openapitools.server.api.model.SamlConfigurationPropertyItemsString](Models/docs/SamlConfigurationPropertyItemsString.md)
         - [org.openapitools.server.api.model.TruststoreInfo](Models/docs/TruststoreInfo.md)
         - [org.openapitools.server.api.model.TruststoreItems](Models/docs/TruststoreItems.md)
        

<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
    <a id="aemAuth"></a>
    ### aemAuth

        - **Type**: HTTP basic authentication
                
