namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CqApiHandlerParams
open CqApiServiceInterface
open CqApiServiceImplementation

module CqApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetLoginPage
    /// <summary>
    /// 
    /// </summary>

    let GetLoginPage  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = CqApiService.GetLoginPage ctx 
          return! (match result with
                      | GetLoginPageDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostCqActions
    /// <summary>
    /// 
    /// </summary>

    let PostCqActions  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostCqActionsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostCqActionsArgs
          let result = CqApiService.PostCqActions ctx serviceArgs
          return! (match result with
                      | PostCqActionsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

