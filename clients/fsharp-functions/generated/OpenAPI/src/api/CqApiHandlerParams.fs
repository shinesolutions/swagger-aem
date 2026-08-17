namespace OpenAPI

open System.Collections.Generic
open System

module CqApiHandlerParams =



    type GetLoginPageDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetLoginPageResult = GetLoginPageDefaultStatusCode of GetLoginPageDefaultStatusCodeResponse


    //#region Query parameters
    [<CLIMutable>]
    type PostCqActionsQueryParams = {
      authorizableId : string ;


      changelog : string ;

    }
    //#endregion


    type PostCqActionsDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostCqActionsResult = PostCqActionsDefaultStatusCode of PostCqActionsDefaultStatusCodeResponse

    type PostCqActionsArgs = {
      queryParams:Result<PostCqActionsQueryParams,string>;
    }
