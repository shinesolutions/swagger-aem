namespace OpenAPI
open CustomApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CustomApiServiceInterface =

    //#region Service interface
    type ICustomApiService =
      abstract member GetAemHealthCheck:HttpContext -> GetAemHealthCheckArgs->GetAemHealthCheckResult
      abstract member PostConfigAemHealthCheckServlet:HttpContext -> PostConfigAemHealthCheckServletArgs->PostConfigAemHealthCheckServletResult
      abstract member PostConfigAemPasswordReset:HttpContext -> PostConfigAemPasswordResetArgs->PostConfigAemPasswordResetResult
    //#endregion