namespace OpenAPI

open GraniteApiHandlerParams
open GraniteApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module GraniteApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region SslSetup
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("SslSetup")>]
    let SslSetup
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/libs/granite/security/post/sslSetup.html")>]
        req:HttpRequest ) =

      let result = GraniteApiService.SslSetup ()
      match result with
      | SslSetupDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

