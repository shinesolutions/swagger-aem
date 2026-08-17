namespace OpenAPI
open CqApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CqApiServiceInterface =

    //#region Service interface
    type ICqApiService =
      abstract member GetLoginPage:HttpContext ->GetLoginPageResult
      abstract member PostCqActions:HttpContext -> PostCqActionsArgs->PostCqActionsResult
    //#endregion