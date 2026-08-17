namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CrxApiHandlerParams
open CrxApiServiceInterface
open CrxApiServiceImplementation
open OpenAPI.Model.InstallStatus

module CrxApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetCrxdeStatus
    /// <summary>
    /// 
    /// </summary>

    let GetCrxdeStatus  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = CrxApiService.GetCrxdeStatus ctx 
          return! (match result with
                      | GetCrxdeStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GetCrxdeStatusStatusCode404 resolved ->
                            setStatusCode 404 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetInstallStatus
    /// <summary>
    /// 
    /// </summary>

    let GetInstallStatus  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = CrxApiService.GetInstallStatus ctx 
          return! (match result with
                      | GetInstallStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetInstallStatusDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPackageManagerServlet
    /// <summary>
    /// 
    /// </summary>

    let GetPackageManagerServlet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = CrxApiService.GetPackageManagerServlet ctx 
          return! (match result with
                      | GetPackageManagerServletStatusCode404 resolved ->
                            setStatusCode 404 >=> text resolved.content
                      | GetPackageManagerServletStatusCode405 resolved ->
                            setStatusCode 405 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostPackageService
    /// <summary>
    /// 
    /// </summary>

    let PostPackageService  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostPackageServiceQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostPackageServiceArgs
          let result = CrxApiService.PostPackageService ctx serviceArgs
          return! (match result with
                      | PostPackageServiceDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostPackageServiceJson
    /// <summary>
    /// 
    /// </summary>

    let PostPackageServiceJson (pathParams:PostPackageServiceJsonPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostPackageServiceJsonQueryParams>()
          let! formParams = ctx.TryBindFormAsync<PostPackageServiceJsonFormParams>()
          let serviceArgs = {  queryParams=queryParams; formParams=formParams; pathParams=pathParams;  } : PostPackageServiceJsonArgs
          let result = CrxApiService.PostPackageServiceJson ctx serviceArgs
          return! (match result with
                      | PostPackageServiceJsonDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostPackageUpdate
    /// <summary>
    /// 
    /// </summary>

    let PostPackageUpdate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostPackageUpdateQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostPackageUpdateArgs
          let result = CrxApiService.PostPackageUpdate ctx serviceArgs
          return! (match result with
                      | PostPackageUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostSetPassword
    /// <summary>
    /// 
    /// </summary>

    let PostSetPassword  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostSetPasswordQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostSetPasswordArgs
          let result = CrxApiService.PostSetPassword ctx serviceArgs
          return! (match result with
                      | PostSetPasswordDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

