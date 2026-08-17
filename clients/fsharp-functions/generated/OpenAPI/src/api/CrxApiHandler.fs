namespace OpenAPI

open CrxApiHandlerParams
open CrxApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module CrxApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetCrxdeStatus
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetCrxdeStatus")>]
    let GetCrxdeStatus
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/crx/server/crx.default/jcr:root/.1.json")>]
        req:HttpRequest ) =

      let result = CrxApiService.GetCrxdeStatus ()
      match result with
      | GetCrxdeStatusStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetCrxdeStatusStatusCode404 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))

    //#region GetInstallStatus
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetInstallStatus")>]
    let GetInstallStatus
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/crx/packmgr/installstatus.jsp")>]
        req:HttpRequest ) =

      let result = CrxApiService.GetInstallStatus ()
      match result with
      | GetInstallStatusStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetInstallStatusDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GetPackageManagerServlet
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetPackageManagerServlet")>]
    let GetPackageManagerServlet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/crx/packmgr/service/script.html")>]
        req:HttpRequest ) =

      let result = CrxApiService.GetPackageManagerServlet ()
      match result with
      | GetPackageManagerServletStatusCode404 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | GetPackageManagerServletStatusCode405 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(405))

    //#region PostPackageService
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostPackageService")>]
    let PostPackageService
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/crx/packmgr/service.jsp")>]
        req:HttpRequest ) =

      let result = CrxApiService.PostPackageService ()
      match result with
      | PostPackageServiceDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostPackageServiceJson
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostPackageServiceJson")>]
    let PostPackageServiceJson
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/crx/packmgr/service/.json/{path}")>]
        req:HttpRequest ) =

      let result = CrxApiService.PostPackageServiceJson ()
      match result with
      | PostPackageServiceJsonDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostPackageUpdate
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostPackageUpdate")>]
    let PostPackageUpdate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/crx/packmgr/update.jsp")>]
        req:HttpRequest ) =

      let result = CrxApiService.PostPackageUpdate ()
      match result with
      | PostPackageUpdateDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostSetPassword
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostSetPassword")>]
    let PostSetPassword
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/crx/explorer/ui/setpassword.jsp")>]
        req:HttpRequest ) =

      let result = CrxApiService.PostSetPassword ()
      match result with
      | PostSetPasswordDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

