namespace OpenAPI
open CustomApiHandlerParams
open CustomApiServiceInterface
open System.Collections.Generic
open System

module CustomApiServiceImplementation =

    //#region Service implementation
    type CustomApiServiceImpl() =
      interface ICustomApiService with

        member this.GetAemHealthCheck () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAemHealthCheckDefaultStatusCode { content = content }

        member this.PostConfigAemHealthCheckServlet () =
            let content = "Default response" 
            PostConfigAemHealthCheckServletDefaultStatusCode { content = content }

        member this.PostConfigAemPasswordReset () =
            let content = "Default response" 
            PostConfigAemPasswordResetDefaultStatusCode { content = content }

      //#endregion

    let CustomApiService = CustomApiServiceImpl() :> ICustomApiService