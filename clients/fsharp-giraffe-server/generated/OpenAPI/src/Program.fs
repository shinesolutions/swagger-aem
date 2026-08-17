namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open ConsoleApiHandlerParams
open CqApiHandlerParams
open CrxApiHandlerParams
open CustomApiHandlerParams
open GraniteApiHandlerParams
open SlingApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler =
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpGet >=> route "/system/console/status-productinfo.json" >=>  >=>  ConsoleApiHandler.GetAemProductInfo;
      HttpGet >=> routeBind<GetBundleInfoPathParams> "/system/console/bundles/{name}.json"  (fun x ->  >=>  ConsoleApiHandler.GetBundleInfo x);
      HttpGet >=> route "/system/console/configMgr" >=>  >=>  ConsoleApiHandler.GetConfigMgr;
      HttpPost >=> routeBind<PostBundlePathParams> "/system/console/bundles/{name}"  (fun x ->  >=>  ConsoleApiHandler.PostBundle x);
      HttpPost >=> routeBind<PostJmxRepositoryPathParams> "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"  (fun x ->  >=>  ConsoleApiHandler.PostJmxRepository x);
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" >=>  >=>  ConsoleApiHandler.PostSamlConfiguration;
      HttpGet >=> route "/libs/granite/core/content/login.html" >=>  CqApiHandler.GetLoginPage;
      HttpPost >=> route "/.cqactions.html" >=>  >=>  CqApiHandler.PostCqActions;
      HttpGet >=> route "/crx/server/crx.default/jcr:root/.1.json" >=>  >=>  CrxApiHandler.GetCrxdeStatus;
      HttpGet >=> route "/crx/packmgr/installstatus.jsp" >=>  >=>  CrxApiHandler.GetInstallStatus;
      HttpGet >=> route "/crx/packmgr/service/script.html" >=>  >=>  CrxApiHandler.GetPackageManagerServlet;
      HttpPost >=> route "/crx/packmgr/service.jsp" >=>  >=>  CrxApiHandler.PostPackageService;
      HttpPost >=> routeBind<PostPackageServiceJsonPathParams> "/crx/packmgr/service/.json/{path}"  (fun x ->  >=>  CrxApiHandler.PostPackageServiceJson x);
      HttpPost >=> route "/crx/packmgr/update.jsp" >=>  >=>  CrxApiHandler.PostPackageUpdate;
      HttpPost >=> route "/crx/explorer/ui/setpassword.jsp" >=>  >=>  CrxApiHandler.PostSetPassword;
      HttpGet >=> route "/system/health" >=>  >=>  CustomApiHandler.GetAemHealthCheck;
      HttpPost >=> route "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck" >=>  >=>  CustomApiHandler.PostConfigAemHealthCheckServlet;
      HttpPost >=> route "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator" >=>  >=>  CustomApiHandler.PostConfigAemPasswordReset;
      HttpPost >=> route "/libs/granite/security/post/sslSetup.html" >=>  >=>  GraniteApiHandler.SslSetup;
      HttpDelete >=> routeBind<DeleteAgentPathParams> "/etc/replication/agents.{runmode}/{name}"  (fun x -> (fun x ->  >=>  SlingApiHandler.DeleteAgent x) x);
      HttpDelete >=> routeBind<DeleteNodePathParams> "/{path}/{name}"  (fun x -> (fun x ->  >=>  SlingApiHandler.DeleteNode x) x);
      HttpGet >=> routeBind<GetAgentPathParams> "/etc/replication/agents.{runmode}/{name}"  (fun x -> (fun x ->  >=>  SlingApiHandler.GetAgent x) x);
      HttpGet >=> routeBind<GetAgentsPathParams> "/etc/replication/agents.{runmode}.-1.json"  (fun x ->  >=>  SlingApiHandler.GetAgents x);
      HttpGet >=> routeBind<GetAuthorizableKeystorePathParams> "/{intermediatePath}/{authorizableId}.ks.json"  (fun x -> (fun x ->  >=>  SlingApiHandler.GetAuthorizableKeystore x) x);
      HttpGet >=> routeBind<GetKeystorePathParams> "/{intermediatePath}/{authorizableId}/keystore/store.p12"  (fun x -> (fun x ->  >=>  SlingApiHandler.GetKeystore x) x);
      HttpGet >=> routeBind<GetNodePathParams> "/{path}/{name}"  (fun x -> (fun x ->  >=>  SlingApiHandler.GetNode x) x);
      HttpGet >=> routeBind<GetPackagePathParams> "/etc/packages/{group}/{name}-{version}.zip"  (fun x -> (fun x -> (fun x ->  >=>  SlingApiHandler.GetPackage x) x) x);
      HttpGet >=> routeBind<GetPackageFilterPathParams> "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"  (fun x -> (fun x -> (fun x ->  >=>  SlingApiHandler.GetPackageFilter x) x) x);
      HttpGet >=> route "/bin/querybuilder.json" >=>  >=>  SlingApiHandler.GetQuery;
      HttpGet >=> route "/etc/truststore/truststore.p12" >=>  >=>  SlingApiHandler.GetTruststore;
      HttpGet >=> route "/libs/granite/security/truststore.json" >=>  >=>  SlingApiHandler.GetTruststoreInfo;
      HttpPost >=> routeBind<PostAgentPathParams> "/etc/replication/agents.{runmode}/{name}"  (fun x -> (fun x ->  >=>  SlingApiHandler.PostAgent x) x);
      HttpPost >=> routeBind<PostAuthorizableKeystorePathParams> "/{intermediatePath}/{authorizableId}.ks.html"  (fun x -> (fun x ->  >=>  SlingApiHandler.PostAuthorizableKeystore x) x);
      HttpPost >=> route "/libs/granite/security/post/authorizables" >=>  >=>  SlingApiHandler.PostAuthorizables;
      HttpPost >=> route "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config" >=>  >=>  SlingApiHandler.PostConfigAdobeGraniteSamlAuthenticationHandler;
      HttpPost >=> route "/apps/system/config/org.apache.felix.http" >=>  >=>  SlingApiHandler.PostConfigApacheFelixJettyBasedHttpService;
      HttpPost >=> route "/apps/system/config/org.apache.http.proxyconfigurator.config" >=>  >=>  SlingApiHandler.PostConfigApacheHttpComponentsProxyConfiguration;
      HttpPost >=> route "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" >=>  >=>  SlingApiHandler.PostConfigApacheSlingDavExServlet;
      HttpPost >=> route "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet" >=>  >=>  SlingApiHandler.PostConfigApacheSlingGetServlet;
      HttpPost >=> route "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter" >=>  >=>  SlingApiHandler.PostConfigApacheSlingReferrerFilter;
      HttpPost >=> routeBind<PostConfigPropertyPathParams> "/apps/system/config/{configNodeName}"  (fun x ->  >=>  SlingApiHandler.PostConfigProperty x);
      HttpPost >=> routeBind<PostNodePathParams> "/{path}/{name}"  (fun x -> (fun x ->  >=>  SlingApiHandler.PostNode x) x);
      HttpPost >=> routeBind<PostNodeRwPathParams> "/{path}/{name}.rw.html"  (fun x -> (fun x ->  >=>  SlingApiHandler.PostNodeRw x) x);
      HttpPost >=> routeBind<PostPathPathParams> "/{path}/"  (fun x ->  >=>  SlingApiHandler.PostPath x);
      HttpPost >=> route "/bin/querybuilder.json" >=>  >=>  SlingApiHandler.PostQuery;
      HttpPost >=> route "/libs/replication/treeactivation.html" >=>  >=>  SlingApiHandler.PostTreeActivation;
      HttpPost >=> route "/libs/granite/security/post/truststore" >=>  >=>  SlingApiHandler.PostTruststore;
      HttpPost >=> route "/etc/truststore" >=>  >=>  SlingApiHandler.PostTruststorePKCS12;
      RequestErrors.notFound (text "Not Found")
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore


  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0