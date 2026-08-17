namespace OpenAPI
open GraniteApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module GraniteApiServiceInterface =

    //#region Service interface
    type IGraniteApiService =
      abstract member SslSetup : unit -> SslSetupResult
    //#endregion