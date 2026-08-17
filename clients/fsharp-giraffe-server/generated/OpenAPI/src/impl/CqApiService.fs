namespace OpenAPI
open CqApiHandlerParams
open CqApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CqApiServiceImplementation =

    //#region Service implementation
    type CqApiServiceImpl() =
      interface ICqApiService with

        member this.GetLoginPage ctx  =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetLoginPageDefaultStatusCode { content = content }

        member this.PostCqActions ctx args =
            let content = "Default response" 
            PostCqActionsDefaultStatusCode { content = content }

      //#endregion

    let CqApiService = CqApiServiceImpl() :> ICqApiService