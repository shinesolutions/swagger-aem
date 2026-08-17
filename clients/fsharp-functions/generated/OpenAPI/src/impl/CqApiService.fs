namespace OpenAPI
open CqApiHandlerParams
open CqApiServiceInterface
open System.Collections.Generic
open System

module CqApiServiceImplementation =

    //#region Service implementation
    type CqApiServiceImpl() =
      interface ICqApiService with

        member this.GetLoginPage () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetLoginPageDefaultStatusCode { content = content }

        member this.PostCqActions () =
            let content = "Default response" 
            PostCqActionsDefaultStatusCode { content = content }

      //#endregion

    let CqApiService = CqApiServiceImpl() :> ICqApiService