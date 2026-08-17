namespace OpenAPI

open System.Collections.Generic
open System

module CustomApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type GetAemHealthCheckQueryParams = {
      tags : string option;


      combineTagsOr : bool option;

    }
    //#endregion


    type GetAemHealthCheckDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetAemHealthCheckResult = GetAemHealthCheckDefaultStatusCode of GetAemHealthCheckDefaultStatusCodeResponse

    type GetAemHealthCheckArgs = {
      queryParams:Result<GetAemHealthCheckQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigAemHealthCheckServletQueryParams = {
      bundlesIgnored : string[] option;


      bundlesIgnoredTypeHint : string option;

    }
    //#endregion


    type PostConfigAemHealthCheckServletDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigAemHealthCheckServletResult = PostConfigAemHealthCheckServletDefaultStatusCode of PostConfigAemHealthCheckServletDefaultStatusCodeResponse

    type PostConfigAemHealthCheckServletArgs = {
      queryParams:Result<PostConfigAemHealthCheckServletQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigAemPasswordResetQueryParams = {
      pwdresetAuthorizables : string[] option;


      pwdresetAuthorizablesTypeHint : string option;

    }
    //#endregion


    type PostConfigAemPasswordResetDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigAemPasswordResetResult = PostConfigAemPasswordResetDefaultStatusCode of PostConfigAemPasswordResetDefaultStatusCodeResponse

    type PostConfigAemPasswordResetArgs = {
      queryParams:Result<PostConfigAemPasswordResetQueryParams,string>;
    }
