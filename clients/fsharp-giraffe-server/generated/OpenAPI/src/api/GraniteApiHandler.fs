namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open GraniteApiHandlerParams
open GraniteApiServiceInterface
open GraniteApiServiceImplementation

module GraniteApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region SslSetup
    /// <summary>
    /// 
    /// </summary>

    let SslSetup  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SslSetupQueryParams>()
          let! formParams = ctx.TryBindFormAsync<SslSetupFormParams>()
          let serviceArgs = {  queryParams=queryParams; formParams=formParams;   } : SslSetupArgs
          let result = GraniteApiService.SslSetup ctx serviceArgs
          return! (match result with
                      | SslSetupDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

