namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CustomApiHandlerParams
open CustomApiServiceInterface
open CustomApiServiceImplementation

module CustomApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetAemHealthCheck
    /// <summary>
    /// 
    /// </summary>

    let GetAemHealthCheck  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetAemHealthCheckQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetAemHealthCheckArgs
          let result = CustomApiService.GetAemHealthCheck ctx serviceArgs
          return! (match result with
                      | GetAemHealthCheckDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigAemHealthCheckServlet
    /// <summary>
    /// 
    /// </summary>

    let PostConfigAemHealthCheckServlet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigAemHealthCheckServletQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigAemHealthCheckServletArgs
          let result = CustomApiService.PostConfigAemHealthCheckServlet ctx serviceArgs
          return! (match result with
                      | PostConfigAemHealthCheckServletDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigAemPasswordReset
    /// <summary>
    /// 
    /// </summary>

    let PostConfigAemPasswordReset  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigAemPasswordResetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigAemPasswordResetArgs
          let result = CustomApiService.PostConfigAemPasswordReset ctx serviceArgs
          return! (match result with
                      | PostConfigAemPasswordResetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

