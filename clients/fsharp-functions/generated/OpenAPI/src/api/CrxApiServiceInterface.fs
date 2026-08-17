namespace OpenAPI
open CrxApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CrxApiServiceInterface =

    //#region Service interface
    type ICrxApiService =
      abstract member GetCrxdeStatus : unit -> GetCrxdeStatusResult
      abstract member GetInstallStatus : unit -> GetInstallStatusResult
      abstract member GetPackageManagerServlet : unit -> GetPackageManagerServletResult
      abstract member PostPackageService : unit -> PostPackageServiceResult
      abstract member PostPackageServiceJson : unit -> PostPackageServiceJsonResult
      abstract member PostPackageUpdate : unit -> PostPackageUpdateResult
      abstract member PostSetPassword : unit -> PostSetPasswordResult
    //#endregion