namespace OpenAPI

open OpenAPI.Model.BundleInfo
open OpenAPI.Model.SamlConfigurationInfo
open System.Collections.Generic
open System

module ConsoleApiHandlerParams =



    type GetAemProductInfoDefaultStatusCodeResponse = {
      content:string[];
      
    }
    type GetAemProductInfoResult = GetAemProductInfoDefaultStatusCode of GetAemProductInfoDefaultStatusCodeResponse

    //#region Path parameters
    [<CLIMutable>]
    type GetBundleInfoPathParams = {
      name : string ;
    }
    //#endregion


    type GetBundleInfoStatusCode200Response = {
      content:BundleInfo;
      
    }

    type GetBundleInfoDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetBundleInfoResult = GetBundleInfoStatusCode200 of GetBundleInfoStatusCode200Response|GetBundleInfoDefaultStatusCode of GetBundleInfoDefaultStatusCodeResponse

    type GetBundleInfoArgs = {
      pathParams:GetBundleInfoPathParams;
    }


    type GetConfigMgrStatusCode200Response = {
      content:string;
      
    }

    type GetConfigMgrStatusCode5XXResponse = {
      content:string;
      
    }
    type GetConfigMgrResult = GetConfigMgrStatusCode200 of GetConfigMgrStatusCode200Response|GetConfigMgrStatusCode5XX of GetConfigMgrStatusCode5XXResponse

    //#region Path parameters
    [<CLIMutable>]
    type PostBundlePathParams = {
      name : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PostBundleQueryParams = {
      action : string ;

    }
    //#endregion


    type PostBundleDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostBundleResult = PostBundleDefaultStatusCode of PostBundleDefaultStatusCodeResponse

    type PostBundleArgs = {
      pathParams:PostBundlePathParams;
      queryParams:Result<PostBundleQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PostJmxRepositoryPathParams = {
      action : string ;
    }
    //#endregion


    type PostJmxRepositoryDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostJmxRepositoryResult = PostJmxRepositoryDefaultStatusCode of PostJmxRepositoryDefaultStatusCodeResponse

    type PostJmxRepositoryArgs = {
      pathParams:PostJmxRepositoryPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostSamlConfigurationQueryParams = {
      post : bool option;


      apply : bool option;


      delete : bool option;


      action : string option;


      location : string option;


      path : string[] option;


      serviceRanking : int option;


      idpUrl : string option;


      idpCertAlias : string option;


      idpHttpRedirect : bool option;


      serviceProviderEntityId : string option;


      assertionConsumerServiceURL : string option;


      spPrivateKeyAlias : string option;


      keyStorePassword : string option;


      defaultRedirectUrl : string option;


      userIDAttribute : string option;


      useEncryption : bool option;


      createUser : bool option;


      addGroupMemberships : bool option;


      groupMembershipAttribute : string option;


      defaultGroups : string[] option;


      nameIdFormat : string option;


      synchronizeAttributes : string[] option;


      handleLogout : bool option;


      logoutUrl : string option;


      clockTolerance : int option;


      digestMethod : string option;


      signatureMethod : string option;


      userIntermediatePath : string option;


      propertylist : string[] option;

    }
    //#endregion


    type PostSamlConfigurationStatusCode200Response = {
      content:SamlConfigurationInfo;
      
    }

    type PostSamlConfigurationStatusCode302Response = {
      content:string;
      
    }

    type PostSamlConfigurationDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostSamlConfigurationResult = PostSamlConfigurationStatusCode200 of PostSamlConfigurationStatusCode200Response|PostSamlConfigurationStatusCode302 of PostSamlConfigurationStatusCode302Response|PostSamlConfigurationDefaultStatusCode of PostSamlConfigurationDefaultStatusCodeResponse

    type PostSamlConfigurationArgs = {
      queryParams:Result<PostSamlConfigurationQueryParams,string>;
    }
