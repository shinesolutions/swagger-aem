namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open SlingApiHandlerParams
open SlingApiServiceInterface
open SlingApiServiceImplementation
open OpenAPI.Model.KeystoreInfo
open OpenAPI.Model.TruststoreInfo

module SlingApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteAgent
    /// <summary>
    /// 
    /// </summary>

    let DeleteAgent (pathParams:DeleteAgentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteAgentArgs
          let result = SlingApiService.DeleteAgent ctx serviceArgs
          return! (match result with
                      | DeleteAgentDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteNode
    /// <summary>
    /// 
    /// </summary>

    let DeleteNode (pathParams:DeleteNodePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteNodeArgs
          let result = SlingApiService.DeleteNode ctx serviceArgs
          return! (match result with
                      | DeleteNodeDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAgent
    /// <summary>
    /// 
    /// </summary>

    let GetAgent (pathParams:GetAgentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetAgentArgs
          let result = SlingApiService.GetAgent ctx serviceArgs
          return! (match result with
                      | GetAgentDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAgents
    /// <summary>
    /// 
    /// </summary>

    let GetAgents (pathParams:GetAgentsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetAgentsArgs
          let result = SlingApiService.GetAgents ctx serviceArgs
          return! (match result with
                      | GetAgentsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAuthorizableKeystore
    /// <summary>
    /// 
    /// </summary>

    let GetAuthorizableKeystore (pathParams:GetAuthorizableKeystorePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetAuthorizableKeystoreArgs
          let result = SlingApiService.GetAuthorizableKeystore ctx serviceArgs
          return! (match result with
                      | GetAuthorizableKeystoreStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetAuthorizableKeystoreDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetKeystore
    /// <summary>
    /// 
    /// </summary>

    let GetKeystore (pathParams:GetKeystorePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetKeystoreArgs
          let result = SlingApiService.GetKeystore ctx serviceArgs
          return! (match result with
                      | GetKeystoreDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetNode
    /// <summary>
    /// 
    /// </summary>

    let GetNode (pathParams:GetNodePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetNodeArgs
          let result = SlingApiService.GetNode ctx serviceArgs
          return! (match result with
                      | GetNodeDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPackage
    /// <summary>
    /// 
    /// </summary>

    let GetPackage (pathParams:GetPackagePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetPackageArgs
          let result = SlingApiService.GetPackage ctx serviceArgs
          return! (match result with
                      | GetPackageDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPackageFilter
    /// <summary>
    /// 
    /// </summary>

    let GetPackageFilter (pathParams:GetPackageFilterPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetPackageFilterArgs
          let result = SlingApiService.GetPackageFilter ctx serviceArgs
          return! (match result with
                      | GetPackageFilterDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetQuery
    /// <summary>
    /// 
    /// </summary>

    let GetQuery  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetQueryQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetQueryArgs
          let result = SlingApiService.GetQuery ctx serviceArgs
          return! (match result with
                      | GetQueryDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetTruststore
    /// <summary>
    /// 
    /// </summary>

    let GetTruststore  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = SlingApiService.GetTruststore ctx 
          return! (match result with
                      | GetTruststoreDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetTruststoreInfo
    /// <summary>
    /// 
    /// </summary>

    let GetTruststoreInfo  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = SlingApiService.GetTruststoreInfo ctx 
          return! (match result with
                      | GetTruststoreInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetTruststoreInfoDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostAgent
    /// <summary>
    /// 
    /// </summary>

    let PostAgent (pathParams:PostAgentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostAgentQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PostAgentArgs
          let result = SlingApiService.PostAgent ctx serviceArgs
          return! (match result with
                      | PostAgentDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostAuthorizableKeystore
    /// <summary>
    /// 
    /// </summary>

    let PostAuthorizableKeystore (pathParams:PostAuthorizableKeystorePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostAuthorizableKeystoreQueryParams>()
          let! formParams = ctx.TryBindFormAsync<PostAuthorizableKeystoreFormParams>()
          let serviceArgs = {  queryParams=queryParams; formParams=formParams; pathParams=pathParams;  } : PostAuthorizableKeystoreArgs
          let result = SlingApiService.PostAuthorizableKeystore ctx serviceArgs
          return! (match result with
                      | PostAuthorizableKeystoreStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PostAuthorizableKeystoreDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostAuthorizables
    /// <summary>
    /// 
    /// </summary>

    let PostAuthorizables  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostAuthorizablesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostAuthorizablesArgs
          let result = SlingApiService.PostAuthorizables ctx serviceArgs
          return! (match result with
                      | PostAuthorizablesDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigAdobeGraniteSamlAuthenticationHandler
    /// <summary>
    /// 
    /// </summary>

    let PostConfigAdobeGraniteSamlAuthenticationHandler  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigAdobeGraniteSamlAuthenticationHandlerArgs
          let result = SlingApiService.PostConfigAdobeGraniteSamlAuthenticationHandler ctx serviceArgs
          return! (match result with
                      | PostConfigAdobeGraniteSamlAuthenticationHandlerDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigApacheFelixJettyBasedHttpService
    /// <summary>
    /// 
    /// </summary>

    let PostConfigApacheFelixJettyBasedHttpService  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigApacheFelixJettyBasedHttpServiceQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigApacheFelixJettyBasedHttpServiceArgs
          let result = SlingApiService.PostConfigApacheFelixJettyBasedHttpService ctx serviceArgs
          return! (match result with
                      | PostConfigApacheFelixJettyBasedHttpServiceDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigApacheHttpComponentsProxyConfiguration
    /// <summary>
    /// 
    /// </summary>

    let PostConfigApacheHttpComponentsProxyConfiguration  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigApacheHttpComponentsProxyConfigurationQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigApacheHttpComponentsProxyConfigurationArgs
          let result = SlingApiService.PostConfigApacheHttpComponentsProxyConfiguration ctx serviceArgs
          return! (match result with
                      | PostConfigApacheHttpComponentsProxyConfigurationDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigApacheSlingDavExServlet
    /// <summary>
    /// 
    /// </summary>

    let PostConfigApacheSlingDavExServlet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigApacheSlingDavExServletQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigApacheSlingDavExServletArgs
          let result = SlingApiService.PostConfigApacheSlingDavExServlet ctx serviceArgs
          return! (match result with
                      | PostConfigApacheSlingDavExServletDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigApacheSlingGetServlet
    /// <summary>
    /// 
    /// </summary>

    let PostConfigApacheSlingGetServlet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigApacheSlingGetServletQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigApacheSlingGetServletArgs
          let result = SlingApiService.PostConfigApacheSlingGetServlet ctx serviceArgs
          return! (match result with
                      | PostConfigApacheSlingGetServletDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigApacheSlingReferrerFilter
    /// <summary>
    /// 
    /// </summary>

    let PostConfigApacheSlingReferrerFilter  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostConfigApacheSlingReferrerFilterQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostConfigApacheSlingReferrerFilterArgs
          let result = SlingApiService.PostConfigApacheSlingReferrerFilter ctx serviceArgs
          return! (match result with
                      | PostConfigApacheSlingReferrerFilterDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostConfigProperty
    /// <summary>
    /// 
    /// </summary>

    let PostConfigProperty (pathParams:PostConfigPropertyPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PostConfigPropertyArgs
          let result = SlingApiService.PostConfigProperty ctx serviceArgs
          return! (match result with
                      | PostConfigPropertyDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostNode
    /// <summary>
    /// 
    /// </summary>

    let PostNode (pathParams:PostNodePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostNodeQueryParams>()
          let! formParams = ctx.TryBindFormAsync<PostNodeFormParams>()
          let serviceArgs = {  queryParams=queryParams; formParams=formParams; pathParams=pathParams;  } : PostNodeArgs
          let result = SlingApiService.PostNode ctx serviceArgs
          return! (match result with
                      | PostNodeDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostNodeRw
    /// <summary>
    /// 
    /// </summary>

    let PostNodeRw (pathParams:PostNodeRwPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostNodeRwQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PostNodeRwArgs
          let result = SlingApiService.PostNodeRw ctx serviceArgs
          return! (match result with
                      | PostNodeRwDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostPath
    /// <summary>
    /// 
    /// </summary>

    let PostPath (pathParams:PostPathPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostPathQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PostPathArgs
          let result = SlingApiService.PostPath ctx serviceArgs
          return! (match result with
                      | PostPathDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostQuery
    /// <summary>
    /// 
    /// </summary>

    let PostQuery  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostQueryQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostQueryArgs
          let result = SlingApiService.PostQuery ctx serviceArgs
          return! (match result with
                      | PostQueryDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostTreeActivation
    /// <summary>
    /// 
    /// </summary>

    let PostTreeActivation  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostTreeActivationQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PostTreeActivationArgs
          let result = SlingApiService.PostTreeActivation ctx serviceArgs
          return! (match result with
                      | PostTreeActivationDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostTruststore
    /// <summary>
    /// 
    /// </summary>

    let PostTruststore  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PostTruststoreQueryParams>()
          let! formParams = ctx.TryBindFormAsync<PostTruststoreFormParams>()
          let serviceArgs = {  queryParams=queryParams; formParams=formParams;   } : PostTruststoreArgs
          let result = SlingApiService.PostTruststore ctx serviceArgs
          return! (match result with
                      | PostTruststoreDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PostTruststorePKCS12
    /// <summary>
    /// 
    /// </summary>

    let PostTruststorePKCS12  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<PostTruststorePKCS12FormParams>()
          let serviceArgs = {   formParams=formParams;   } : PostTruststorePKCS12Args
          let result = SlingApiService.PostTruststorePKCS12 ctx serviceArgs
          return! (match result with
                      | PostTruststorePKCS12DefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

