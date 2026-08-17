namespace OpenAPI
open CrxApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CrxApiServiceInterface =

    //#region Service interface
    type ICrxApiService =
      abstract member GetCrxdeStatus:HttpContext ->GetCrxdeStatusResult
      abstract member GetInstallStatus:HttpContext ->GetInstallStatusResult
      abstract member GetPackageManagerServlet:HttpContext ->GetPackageManagerServletResult
      abstract member PostPackageService:HttpContext -> PostPackageServiceArgs->PostPackageServiceResult
      abstract member PostPackageServiceJson:HttpContext -> PostPackageServiceJsonArgs->PostPackageServiceJsonResult
      abstract member PostPackageUpdate:HttpContext -> PostPackageUpdateArgs->PostPackageUpdateResult
      abstract member PostSetPassword:HttpContext -> PostSetPasswordArgs->PostSetPasswordResult
    //#endregion