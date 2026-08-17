namespace OpenAPI
open CustomApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CustomApiServiceInterface =

    //#region Service interface
    type ICustomApiService =
      abstract member GetAemHealthCheck : unit -> GetAemHealthCheckResult
      abstract member PostConfigAemHealthCheckServlet : unit -> PostConfigAemHealthCheckServletResult
      abstract member PostConfigAemPasswordReset : unit -> PostConfigAemPasswordResetResult
    //#endregion