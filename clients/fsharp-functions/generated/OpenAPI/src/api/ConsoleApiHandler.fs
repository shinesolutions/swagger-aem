namespace OpenAPI

open ConsoleApiHandlerParams
open ConsoleApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ConsoleApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetAemProductInfo
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetAemProductInfo")>]
    let GetAemProductInfo
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/system/console/status-productinfo.json")>]
        req:HttpRequest ) =

      let result = ConsoleApiService.GetAemProductInfo ()
      match result with
      | GetAemProductInfoDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetBundleInfo
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetBundleInfo")>]
    let GetBundleInfo
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/system/console/bundles/{name}.json")>]
        req:HttpRequest ) =

      let result = ConsoleApiService.GetBundleInfo ()
      match result with
      | GetBundleInfoStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetBundleInfoDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetConfigMgr
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetConfigMgr")>]
    let GetConfigMgr
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/system/console/configMgr")>]
        req:HttpRequest ) =

      let result = ConsoleApiService.GetConfigMgr ()
      match result with
      | GetConfigMgrStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetConfigMgrStatusCode5XX resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(5XX))

    //#region PostBundle
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostBundle")>]
    let PostBundle
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/system/console/bundles/{name}")>]
        req:HttpRequest ) =

      let result = ConsoleApiService.PostBundle ()
      match result with
      | PostBundleDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostJmxRepository
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostJmxRepository")>]
    let PostJmxRepository
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}")>]
        req:HttpRequest ) =

      let result = ConsoleApiService.PostJmxRepository ()
      match result with
      | PostJmxRepositoryDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostSamlConfiguration
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostSamlConfiguration")>]
    let PostSamlConfiguration
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")>]
        req:HttpRequest ) =

      let result = ConsoleApiService.PostSamlConfiguration ()
      match result with
      | PostSamlConfigurationStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | PostSamlConfigurationStatusCode302 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(302))
      | PostSamlConfigurationDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

