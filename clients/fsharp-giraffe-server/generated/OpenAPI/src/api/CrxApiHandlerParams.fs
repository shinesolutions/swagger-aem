namespace OpenAPI

open OpenAPI.Model.InstallStatus
open System.Collections.Generic
open System

module CrxApiHandlerParams =



    type GetCrxdeStatusStatusCode200Response = {
      content:string;
      
    }

    type GetCrxdeStatusStatusCode404Response = {
      content:string;
      
    }
    type GetCrxdeStatusResult = GetCrxdeStatusStatusCode200 of GetCrxdeStatusStatusCode200Response|GetCrxdeStatusStatusCode404 of GetCrxdeStatusStatusCode404Response



    type GetInstallStatusStatusCode200Response = {
      content:InstallStatus;
      
    }

    type GetInstallStatusDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetInstallStatusResult = GetInstallStatusStatusCode200 of GetInstallStatusStatusCode200Response|GetInstallStatusDefaultStatusCode of GetInstallStatusDefaultStatusCodeResponse



    type GetPackageManagerServletStatusCode404Response = {
      content:string;
      
    }

    type GetPackageManagerServletStatusCode405Response = {
      content:string;
      
    }
    type GetPackageManagerServletResult = GetPackageManagerServletStatusCode404 of GetPackageManagerServletStatusCode404Response|GetPackageManagerServletStatusCode405 of GetPackageManagerServletStatusCode405Response


    //#region Query parameters
    [<CLIMutable>]
    type PostPackageServiceQueryParams = {
      cmd : string ;

    }
    //#endregion


    type PostPackageServiceDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostPackageServiceResult = PostPackageServiceDefaultStatusCode of PostPackageServiceDefaultStatusCodeResponse

    type PostPackageServiceArgs = {
      queryParams:Result<PostPackageServiceQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PostPackageServiceJsonPathParams = {
      path : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PostPackageServiceJsonQueryParams = {
      cmd : string ;


      groupName : string option;


      packageName : string option;


      packageVersion : string option;


      charset : string option;


      force : bool option;


      recursive : bool option;

    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type PostPackageServiceJsonFormParams = {
      package : System.IO.Stream option;
    }
    //#endregion


    type PostPackageServiceJsonDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostPackageServiceJsonResult = PostPackageServiceJsonDefaultStatusCode of PostPackageServiceJsonDefaultStatusCodeResponse

    type PostPackageServiceJsonArgs = {
      pathParams:PostPackageServiceJsonPathParams;
      queryParams:Result<PostPackageServiceJsonQueryParams,string>;
      formParams:Result<PostPackageServiceJsonFormParams,string>
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostPackageUpdateQueryParams = {
      groupName : string ;


      packageName : string ;


      version : string ;


      path : string ;


      filter : string option;


      charset : string option;

    }
    //#endregion


    type PostPackageUpdateDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostPackageUpdateResult = PostPackageUpdateDefaultStatusCode of PostPackageUpdateDefaultStatusCodeResponse

    type PostPackageUpdateArgs = {
      queryParams:Result<PostPackageUpdateQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostSetPasswordQueryParams = {
      old : string ;


      plain : string ;


      verify : string ;

    }
    //#endregion


    type PostSetPasswordDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostSetPasswordResult = PostSetPasswordDefaultStatusCode of PostSetPasswordDefaultStatusCodeResponse

    type PostSetPasswordArgs = {
      queryParams:Result<PostSetPasswordQueryParams,string>;
    }
