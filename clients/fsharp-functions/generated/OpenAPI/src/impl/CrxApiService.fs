namespace OpenAPI
open OpenAPI.Model.InstallStatus
open CrxApiHandlerParams
open CrxApiServiceInterface
open System.Collections.Generic
open System

module CrxApiServiceImplementation =

    //#region Service implementation
    type CrxApiServiceImpl() =
      interface ICrxApiService with

        member this.GetCrxdeStatus () =
          if true then
            let content = "CRXDE is enabled" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCrxdeStatusStatusCode200 { content = content }
          else
            let content = "CRXDE is disabled" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCrxdeStatusStatusCode404 { content = content }

        member this.GetInstallStatus () =
          if true then
            let content = "Retrieved CRX package manager install status" :> obj :?> InstallStatus // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInstallStatusStatusCode200 { content = content }
          else
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInstallStatusDefaultStatusCode { content = content }

        member this.GetPackageManagerServlet () =
          if true then
            let content = "Package Manager Servlet is disabled" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPackageManagerServletStatusCode404 { content = content }
          else
            let content = "Package Manager Servlet is active" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPackageManagerServletStatusCode405 { content = content }

        member this.PostPackageService () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostPackageServiceDefaultStatusCode { content = content }

        member this.PostPackageServiceJson () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostPackageServiceJsonDefaultStatusCode { content = content }

        member this.PostPackageUpdate () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostPackageUpdateDefaultStatusCode { content = content }

        member this.PostSetPassword () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostSetPasswordDefaultStatusCode { content = content }

      //#endregion

    let CrxApiService = CrxApiServiceImpl() :> ICrxApiService