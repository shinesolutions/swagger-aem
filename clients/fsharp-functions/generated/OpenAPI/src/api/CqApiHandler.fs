namespace OpenAPI

open CqApiHandlerParams
open CqApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module CqApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetLoginPage
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetLoginPage")>]
    let GetLoginPage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/libs/granite/core/content/login.html")>]
        req:HttpRequest ) =

      let result = CqApiService.GetLoginPage ()
      match result with
      | GetLoginPageDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostCqActions
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostCqActions")>]
    let PostCqActions
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/.cqactions.html")>]
        req:HttpRequest ) =

      let result = CqApiService.PostCqActions ()
      match result with
      | PostCqActionsDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

