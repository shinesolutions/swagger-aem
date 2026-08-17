namespace OpenAPI
open GraniteApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module GraniteApiServiceInterface =

    //#region Service interface
    type IGraniteApiService =
      abstract member SslSetup:HttpContext -> SslSetupArgs->SslSetupResult
    //#endregion