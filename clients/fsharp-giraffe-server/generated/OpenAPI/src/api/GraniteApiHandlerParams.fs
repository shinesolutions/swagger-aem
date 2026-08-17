namespace OpenAPI

open System.Collections.Generic
open System

module GraniteApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type SslSetupQueryParams = {
      keystorePassword : string ;


      keystorePasswordConfirm : string ;


      truststorePassword : string ;


      truststorePasswordConfirm : string ;


      httpsHostname : string ;


      httpsPort : string ;

    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type SslSetupFormParams = {
      privatekeyFile : System.IO.Stream option;
    //#endregion

    //#region Form parameters
      certificateFile : System.IO.Stream option;
    }
    //#endregion


    type SslSetupDefaultStatusCodeResponse = {
      content:string;
      
    }
    type SslSetupResult = SslSetupDefaultStatusCode of SslSetupDefaultStatusCodeResponse

    type SslSetupArgs = {
      queryParams:Result<SslSetupQueryParams,string>;
      formParams:Result<SslSetupFormParams,string>
    }
