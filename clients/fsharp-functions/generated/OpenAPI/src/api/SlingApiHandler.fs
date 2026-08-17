namespace OpenAPI

open SlingApiHandlerParams
open SlingApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module SlingApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteAgent
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("DeleteAgent")>]
    let DeleteAgent
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/etc/replication/agents.{runmode}/{name}")>]
        req:HttpRequest ) =

      let result = SlingApiService.DeleteAgent ()
      match result with
      | DeleteAgentDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region DeleteNode
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("DeleteNode")>]
    let DeleteNode
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/{path}/{name}")>]
        req:HttpRequest ) =

      let result = SlingApiService.DeleteNode ()
      match result with
      | DeleteNodeDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetAgent
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetAgent")>]
    let GetAgent
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/etc/replication/agents.{runmode}/{name}")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetAgent ()
      match result with
      | GetAgentDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetAgents
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetAgents")>]
    let GetAgents
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/etc/replication/agents.{runmode}.-1.json")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetAgents ()
      match result with
      | GetAgentsDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetAuthorizableKeystore
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetAuthorizableKeystore")>]
    let GetAuthorizableKeystore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/{intermediatePath}/{authorizableId}.ks.json")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetAuthorizableKeystore ()
      match result with
      | GetAuthorizableKeystoreStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetAuthorizableKeystoreDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetKeystore
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetKeystore")>]
    let GetKeystore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/{intermediatePath}/{authorizableId}/keystore/store.p12")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetKeystore ()
      match result with
      | GetKeystoreDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetNode
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetNode")>]
    let GetNode
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/{path}/{name}")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetNode ()
      match result with
      | GetNodeDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetPackage
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetPackage")>]
    let GetPackage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/etc/packages/{group}/{name}-{version}.zip")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetPackage ()
      match result with
      | GetPackageDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetPackageFilter
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetPackageFilter")>]
    let GetPackageFilter
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetPackageFilter ()
      match result with
      | GetPackageFilterDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetQuery
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetQuery")>]
    let GetQuery
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/bin/querybuilder.json")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetQuery ()
      match result with
      | GetQueryDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetTruststore
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetTruststore")>]
    let GetTruststore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/etc/truststore/truststore.p12")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetTruststore ()
      match result with
      | GetTruststoreDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetTruststoreInfo
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetTruststoreInfo")>]
    let GetTruststoreInfo
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/libs/granite/security/truststore.json")>]
        req:HttpRequest ) =

      let result = SlingApiService.GetTruststoreInfo ()
      match result with
      | GetTruststoreInfoStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetTruststoreInfoDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostAgent
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostAgent")>]
    let PostAgent
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/etc/replication/agents.{runmode}/{name}")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostAgent ()
      match result with
      | PostAgentDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostAuthorizableKeystore
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostAuthorizableKeystore")>]
    let PostAuthorizableKeystore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/{intermediatePath}/{authorizableId}.ks.html")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostAuthorizableKeystore ()
      match result with
      | PostAuthorizableKeystoreStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | PostAuthorizableKeystoreDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostAuthorizables
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostAuthorizables")>]
    let PostAuthorizables
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/libs/granite/security/post/authorizables")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostAuthorizables ()
      match result with
      | PostAuthorizablesDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigAdobeGraniteSamlAuthenticationHandler
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigAdobeGraniteSamlAuthenticationHandler")>]
    let PostConfigAdobeGraniteSamlAuthenticationHandler
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostConfigAdobeGraniteSamlAuthenticationHandler ()
      match result with
      | PostConfigAdobeGraniteSamlAuthenticationHandlerDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigApacheFelixJettyBasedHttpService
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigApacheFelixJettyBasedHttpService")>]
    let PostConfigApacheFelixJettyBasedHttpService
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/org.apache.felix.http")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostConfigApacheFelixJettyBasedHttpService ()
      match result with
      | PostConfigApacheFelixJettyBasedHttpServiceDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigApacheHttpComponentsProxyConfiguration
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigApacheHttpComponentsProxyConfiguration")>]
    let PostConfigApacheHttpComponentsProxyConfiguration
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/org.apache.http.proxyconfigurator.config")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostConfigApacheHttpComponentsProxyConfiguration ()
      match result with
      | PostConfigApacheHttpComponentsProxyConfigurationDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigApacheSlingDavExServlet
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigApacheSlingDavExServlet")>]
    let PostConfigApacheSlingDavExServlet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostConfigApacheSlingDavExServlet ()
      match result with
      | PostConfigApacheSlingDavExServletDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigApacheSlingGetServlet
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigApacheSlingGetServlet")>]
    let PostConfigApacheSlingGetServlet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostConfigApacheSlingGetServlet ()
      match result with
      | PostConfigApacheSlingGetServletDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigApacheSlingReferrerFilter
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigApacheSlingReferrerFilter")>]
    let PostConfigApacheSlingReferrerFilter
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostConfigApacheSlingReferrerFilter ()
      match result with
      | PostConfigApacheSlingReferrerFilterDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigProperty
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigProperty")>]
    let PostConfigProperty
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/{configNodeName}")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostConfigProperty ()
      match result with
      | PostConfigPropertyDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostNode
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostNode")>]
    let PostNode
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/{path}/{name}")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostNode ()
      match result with
      | PostNodeDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostNodeRw
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostNodeRw")>]
    let PostNodeRw
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/{path}/{name}.rw.html")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostNodeRw ()
      match result with
      | PostNodeRwDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostPath
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostPath")>]
    let PostPath
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/{path}/")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostPath ()
      match result with
      | PostPathDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostQuery
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostQuery")>]
    let PostQuery
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/bin/querybuilder.json")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostQuery ()
      match result with
      | PostQueryDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostTreeActivation
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostTreeActivation")>]
    let PostTreeActivation
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/libs/replication/treeactivation.html")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostTreeActivation ()
      match result with
      | PostTreeActivationDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostTruststore
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostTruststore")>]
    let PostTruststore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/libs/granite/security/post/truststore")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostTruststore ()
      match result with
      | PostTruststoreDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostTruststorePKCS12
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostTruststorePKCS12")>]
    let PostTruststorePKCS12
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/etc/truststore")>]
        req:HttpRequest ) =

      let result = SlingApiService.PostTruststorePKCS12 ()
      match result with
      | PostTruststorePKCS12DefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

