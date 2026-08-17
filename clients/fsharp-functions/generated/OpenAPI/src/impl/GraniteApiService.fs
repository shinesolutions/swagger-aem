namespace OpenAPI
open GraniteApiHandlerParams
open GraniteApiServiceInterface
open System.Collections.Generic
open System

module GraniteApiServiceImplementation =

    //#region Service implementation
    type GraniteApiServiceImpl() =
      interface IGraniteApiService with

        member this.SslSetup () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SslSetupDefaultStatusCode { content = content }

      //#endregion

    let GraniteApiService = GraniteApiServiceImpl() :> IGraniteApiService