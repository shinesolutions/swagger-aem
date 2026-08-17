namespace OpenAPI
open CqApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CqApiServiceInterface =

    //#region Service interface
    type ICqApiService =
      abstract member GetLoginPage : unit -> GetLoginPageResult
      abstract member PostCqActions : unit -> PostCqActionsResult
    //#endregion