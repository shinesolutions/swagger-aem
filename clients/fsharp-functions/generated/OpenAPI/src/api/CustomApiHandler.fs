namespace OpenAPI

open CustomApiHandlerParams
open CustomApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module CustomApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetAemHealthCheck
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GetAemHealthCheck")>]
    let GetAemHealthCheck
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/system/health")>]
        req:HttpRequest ) =

      let result = CustomApiService.GetAemHealthCheck ()
      match result with
      | GetAemHealthCheckDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigAemHealthCheckServlet
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigAemHealthCheckServlet")>]
    let PostConfigAemHealthCheckServlet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")>]
        req:HttpRequest ) =

      let result = CustomApiService.PostConfigAemHealthCheckServlet ()
      match result with
      | PostConfigAemHealthCheckServletDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PostConfigAemPasswordReset
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PostConfigAemPasswordReset")>]
    let PostConfigAemPasswordReset
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator")>]
        req:HttpRequest ) =

      let result = CustomApiService.PostConfigAemPasswordReset ()
      match result with
      | PostConfigAemPasswordResetDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

