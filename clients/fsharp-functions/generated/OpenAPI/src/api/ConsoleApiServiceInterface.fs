namespace OpenAPI
open ConsoleApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ConsoleApiServiceInterface =

    //#region Service interface
    type IConsoleApiService =
      abstract member GetAemProductInfo : unit -> GetAemProductInfoResult
      abstract member GetBundleInfo : unit -> GetBundleInfoResult
      abstract member GetConfigMgr : unit -> GetConfigMgrResult
      abstract member PostBundle : unit -> PostBundleResult
      abstract member PostJmxRepository : unit -> PostJmxRepositoryResult
      abstract member PostSamlConfiguration : unit -> PostSamlConfigurationResult
    //#endregion