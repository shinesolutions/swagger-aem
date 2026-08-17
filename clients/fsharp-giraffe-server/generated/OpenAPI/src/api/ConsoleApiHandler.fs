namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ConsoleApiHandlerParams
open ConsoleApiServiceInterface
open ConsoleApiServiceImplementation
open OpenAPI.Model.BundleInfo
open OpenAPI.Model.SamlConfigurationInfo

module ConsoleApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetAemProductInfo
    /// <summary>
    /// 
    /// </summary>

    let GetAemProductInfo  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ConsoleApiService.GetAemProductInfo ctx 
          return! (match result with
                      | GetAemProductInfoDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBundleInfo
    /// <summary>
    /// 
    /// </summary>

    let GetBundleInfo (pathParams:GetBundleInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetBundleInfoArgs
          let result = ConsoleApiService.GetBundleInfo ctx serviceArgs
          return! (match result with
                      | GetBundleInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBundleInfoDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetConfigMgr
    /// <summary>
    /// 
    /// </summary>

    let GetConfigMgr  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ConsoleApiService.GetConfigMgr ctx 
          return! (match result with
                      | GetConfigMgrStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GetConfigMgrStatusCode5XX resolved ->
                            setStatusCode 5XX >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostBundle
    /// <summary>
    /// 
    /// </summary>

    let PostBundle (pathParams:PostBundlePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostBundleQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PostBundleArgs
          let result = ConsoleApiService.PostBundle ctx serviceArgs
          return! (match result with
                      | PostBundleDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostJmxRepository
    /// <summary>
    /// 
    /// </summary>

    let PostJmxRepository (pathParams:PostJmxRepositoryPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PostJmxRepositoryArgs
          let result = ConsoleApiService.PostJmxRepository ctx serviceArgs
          return! (match result with
                      | PostJmxRepositoryDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostSamlConfiguration
    /// <summary>
    /// 
    /// </summary>

    let PostSamlConfiguration  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostSamlConfigurationQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostSamlConfigurationArgs
          let result = ConsoleApiService.PostSamlConfiguration ctx serviceArgs
          return! (match result with
                      | PostSamlConfigurationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PostSamlConfigurationStatusCode302 resolved ->
                            setStatusCode 302 >=> text resolved.content
                      | PostSamlConfigurationDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

