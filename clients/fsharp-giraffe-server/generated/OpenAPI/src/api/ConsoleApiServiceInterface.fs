namespace OpenAPI
open ConsoleApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ConsoleApiServiceInterface =

    //#region Service interface
    type IConsoleApiService =
      abstract member GetAemProductInfo:HttpContext ->GetAemProductInfoResult
      abstract member GetBundleInfo:HttpContext -> GetBundleInfoArgs->GetBundleInfoResult
      abstract member GetConfigMgr:HttpContext ->GetConfigMgrResult
      abstract member PostBundle:HttpContext -> PostBundleArgs->PostBundleResult
      abstract member PostJmxRepository:HttpContext -> PostJmxRepositoryArgs->PostJmxRepositoryResult
      abstract member PostSamlConfiguration:HttpContext -> PostSamlConfigurationArgs->PostSamlConfigurationResult
    //#endregion