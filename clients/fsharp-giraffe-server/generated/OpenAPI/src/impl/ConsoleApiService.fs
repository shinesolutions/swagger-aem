namespace OpenAPI
open OpenAPI.Model.BundleInfo
open OpenAPI.Model.SamlConfigurationInfo
open ConsoleApiHandlerParams
open ConsoleApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ConsoleApiServiceImplementation =

    //#region Service implementation
    type ConsoleApiServiceImpl() =
      interface IConsoleApiService with

        member this.GetAemProductInfo ctx  =
            let content = "Default response" :> obj :?> string[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAemProductInfoDefaultStatusCode { content = content }

        member this.GetBundleInfo ctx args =
          if true then
            let content = "Retrieved bundle info" :> obj :?> BundleInfo // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBundleInfoStatusCode200 { content = content }
          else
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBundleInfoDefaultStatusCode { content = content }

        member this.GetConfigMgr ctx  =
          if true then
            let content = "OK" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetConfigMgrStatusCode200 { content = content }
          else
            let content = "Unexpected error." 
            GetConfigMgrStatusCode5XX { content = content }

        member this.PostBundle ctx args =
            let content = "Default response" 
            PostBundleDefaultStatusCode { content = content }

        member this.PostJmxRepository ctx args =
            let content = "Default response" 
            PostJmxRepositoryDefaultStatusCode { content = content }

        member this.PostSamlConfiguration ctx args =
          if true then
            let content = "Retrieved AEM SAML Configuration" :> obj :?> SamlConfigurationInfo // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostSamlConfigurationStatusCode200 { content = content }
          else if true then
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostSamlConfigurationStatusCode302 { content = content }
          else
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostSamlConfigurationDefaultStatusCode { content = content }

      //#endregion

    let ConsoleApiService = ConsoleApiServiceImpl() :> IConsoleApiService