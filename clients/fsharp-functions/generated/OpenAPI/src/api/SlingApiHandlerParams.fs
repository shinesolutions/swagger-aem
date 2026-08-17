namespace OpenAPI

open OpenAPI.Model.KeystoreInfo
open OpenAPI.Model.TruststoreInfo
open System.Collections.Generic
open System

module SlingApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeleteAgentPathParams = {
      runmode : string ;
    //#endregion
      name : string ;
    }
    //#endregion


    type DeleteAgentDefaultStatusCodeResponse = {
      content:string;
      
    }
    type DeleteAgentResult = DeleteAgentDefaultStatusCode of DeleteAgentDefaultStatusCodeResponse

    type DeleteAgentArgs = {
      pathParams:DeleteAgentPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteNodePathParams = {
      path : string ;
    //#endregion
      name : string ;
    }
    //#endregion


    type DeleteNodeDefaultStatusCodeResponse = {
      content:string;
      
    }
    type DeleteNodeResult = DeleteNodeDefaultStatusCode of DeleteNodeDefaultStatusCodeResponse

    type DeleteNodeArgs = {
      pathParams:DeleteNodePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetAgentPathParams = {
      runmode : string ;
    //#endregion
      name : string ;
    }
    //#endregion


    type GetAgentDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetAgentResult = GetAgentDefaultStatusCode of GetAgentDefaultStatusCodeResponse

    type GetAgentArgs = {
      pathParams:GetAgentPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetAgentsPathParams = {
      runmode : string ;
    }
    //#endregion


    type GetAgentsDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetAgentsResult = GetAgentsDefaultStatusCode of GetAgentsDefaultStatusCodeResponse

    type GetAgentsArgs = {
      pathParams:GetAgentsPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetAuthorizableKeystorePathParams = {
      intermediatePath : string ;
    //#endregion
      authorizableId : string ;
    }
    //#endregion


    type GetAuthorizableKeystoreStatusCode200Response = {
      content:KeystoreInfo;
      
    }

    type GetAuthorizableKeystoreDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetAuthorizableKeystoreResult = GetAuthorizableKeystoreStatusCode200 of GetAuthorizableKeystoreStatusCode200Response|GetAuthorizableKeystoreDefaultStatusCode of GetAuthorizableKeystoreDefaultStatusCodeResponse

    type GetAuthorizableKeystoreArgs = {
      pathParams:GetAuthorizableKeystorePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetKeystorePathParams = {
      intermediatePath : string ;
    //#endregion
      authorizableId : string ;
    }
    //#endregion


    type GetKeystoreDefaultStatusCodeResponse = {
      content:System.IO.Stream;
      
    }
    type GetKeystoreResult = GetKeystoreDefaultStatusCode of GetKeystoreDefaultStatusCodeResponse

    type GetKeystoreArgs = {
      pathParams:GetKeystorePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetNodePathParams = {
      path : string ;
    //#endregion
      name : string ;
    }
    //#endregion


    type GetNodeDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetNodeResult = GetNodeDefaultStatusCode of GetNodeDefaultStatusCodeResponse

    type GetNodeArgs = {
      pathParams:GetNodePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPackagePathParams = {
      group : string ;
    //#endregion
      name : string ;
    //#endregion
      version : string ;
    }
    //#endregion


    type GetPackageDefaultStatusCodeResponse = {
      content:System.IO.Stream;
      
    }
    type GetPackageResult = GetPackageDefaultStatusCode of GetPackageDefaultStatusCodeResponse

    type GetPackageArgs = {
      pathParams:GetPackagePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPackageFilterPathParams = {
      group : string ;
    //#endregion
      name : string ;
    //#endregion
      version : string ;
    }
    //#endregion


    type GetPackageFilterDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetPackageFilterResult = GetPackageFilterDefaultStatusCode of GetPackageFilterDefaultStatusCodeResponse

    type GetPackageFilterArgs = {
      pathParams:GetPackageFilterPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetQueryQueryParams = {
      path : string ;


      pLimit : decimal ;


      _1property : string ;


      _1propertyValue : string ;

    }
    //#endregion


    type GetQueryDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetQueryResult = GetQueryDefaultStatusCode of GetQueryDefaultStatusCodeResponse

    type GetQueryArgs = {
      queryParams:Result<GetQueryQueryParams,string>;
    }


    type GetTruststoreDefaultStatusCodeResponse = {
      content:System.IO.Stream;
      
    }
    type GetTruststoreResult = GetTruststoreDefaultStatusCode of GetTruststoreDefaultStatusCodeResponse



    type GetTruststoreInfoStatusCode200Response = {
      content:TruststoreInfo;
      
    }

    type GetTruststoreInfoDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GetTruststoreInfoResult = GetTruststoreInfoStatusCode200 of GetTruststoreInfoStatusCode200Response|GetTruststoreInfoDefaultStatusCode of GetTruststoreInfoDefaultStatusCodeResponse

    //#region Path parameters
    [<CLIMutable>]
    type PostAgentPathParams = {
      runmode : string ;
    //#endregion
      name : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PostAgentQueryParams = {
      jcrContentCqDistribute : bool option;


      jcrContentCqDistributeTypeHint : string option;


      jcrContentCqName : string option;


      jcrContentCqTemplate : string option;


      jcrContentAliasUpdate : bool option;


      jcrContentEnabled : bool option;


      jcrContentJcrDescription : string option;


      jcrContentJcrLastModified : string option;


      jcrContentJcrLastModifiedBy : string option;


      jcrContentJcrMixinTypes : string option;


      jcrContentJcrTitle : string option;


      jcrContentLogLevel : string option;


      jcrContentNoStatusUpdate : bool option;


      jcrContentNoVersioning : bool option;


      jcrContentProtocolConnectTimeout : decimal option;


      jcrContentProtocolHTTPConnectionClosed : bool option;


      jcrContentProtocolHTTPExpired : string option;


      jcrContentProtocolHTTPHeaders : string[] option;


      jcrContentProtocolHTTPHeadersTypeHint : string option;


      jcrContentProtocolHTTPMethod : string option;


      jcrContentProtocolHTTPSRelaxed : bool option;


      jcrContentProtocolInterface : string option;


      jcrContentProtocolSocketTimeout : decimal option;


      jcrContentProtocolVersion : string option;


      jcrContentProxyNTLMDomain : string option;


      jcrContentProxyNTLMHost : string option;


      jcrContentProxyHost : string option;


      jcrContentProxyPassword : string option;


      jcrContentProxyPort : decimal option;


      jcrContentProxyUser : string option;


      jcrContentQueueBatchMaxSize : decimal option;


      jcrContentQueueBatchMode : string option;


      jcrContentQueueBatchWaitTime : decimal option;


      jcrContentRetryDelay : string option;


      jcrContentReverseReplication : bool option;


      jcrContentSerializationType : string option;


      jcrContentSlingResourceType : string option;


      jcrContentSsl : string option;


      jcrContentTransportNTLMDomain : string option;


      jcrContentTransportNTLMHost : string option;


      jcrContentTransportPassword : string option;


      jcrContentTransportUri : string option;


      jcrContentTransportUser : string option;


      jcrContentTriggerDistribute : bool option;


      jcrContentTriggerModified : bool option;


      jcrContentTriggerOnOffTime : bool option;


      jcrContentTriggerReceive : bool option;


      jcrContentTriggerSpecific : bool option;


      jcrContentUserId : string option;


      jcrPrimaryType : string option;


      operation : string option;

    }
    //#endregion


    type PostAgentDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostAgentResult = PostAgentDefaultStatusCode of PostAgentDefaultStatusCodeResponse

    type PostAgentArgs = {
      pathParams:PostAgentPathParams;
      queryParams:Result<PostAgentQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PostAuthorizableKeystorePathParams = {
      intermediatePath : string ;
    //#endregion
      authorizableId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PostAuthorizableKeystoreQueryParams = {
      operation : string option;


      currentPassword : string option;


      newPassword : string option;


      rePassword : string option;


      keyPassword : string option;


      keyStorePass : string option;


      alias : string option;


      newAlias : string option;


      removeAlias : string option;

    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type PostAuthorizableKeystoreFormParams = {
      certChain : System.IO.Stream option;
    //#endregion

    //#region Form parameters
      pk : System.IO.Stream option;
    //#endregion

    //#region Form parameters
      keyStore : System.IO.Stream option;
    }
    //#endregion


    type PostAuthorizableKeystoreStatusCode200Response = {
      content:KeystoreInfo;
      
    }

    type PostAuthorizableKeystoreDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostAuthorizableKeystoreResult = PostAuthorizableKeystoreStatusCode200 of PostAuthorizableKeystoreStatusCode200Response|PostAuthorizableKeystoreDefaultStatusCode of PostAuthorizableKeystoreDefaultStatusCodeResponse

    type PostAuthorizableKeystoreArgs = {
      pathParams:PostAuthorizableKeystorePathParams;
      queryParams:Result<PostAuthorizableKeystoreQueryParams,string>;
      formParams:Result<PostAuthorizableKeystoreFormParams,string>
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostAuthorizablesQueryParams = {
      authorizableId : string ;


      intermediatePath : string ;


      createUser : string option;


      createGroup : string option;


      repPassword : string option;


      profileGivenName : string option;

    }
    //#endregion


    type PostAuthorizablesDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostAuthorizablesResult = PostAuthorizablesDefaultStatusCode of PostAuthorizablesDefaultStatusCodeResponse

    type PostAuthorizablesArgs = {
      queryParams:Result<PostAuthorizablesQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams = {
      keyStorePassword : string option;


      keyStorePasswordTypeHint : string option;


      serviceRanking : int option;


      serviceRankingTypeHint : string option;


      idpHttpRedirect : bool option;


      idpHttpRedirectTypeHint : string option;


      createUser : bool option;


      createUserTypeHint : string option;


      defaultRedirectUrl : string option;


      defaultRedirectUrlTypeHint : string option;


      userIDAttribute : string option;


      userIDAttributeTypeHint : string option;


      defaultGroups : string[] option;


      defaultGroupsTypeHint : string option;


      idpCertAlias : string option;


      idpCertAliasTypeHint : string option;


      addGroupMemberships : bool option;


      addGroupMembershipsTypeHint : string option;


      path : string[] option;


      pathTypeHint : string option;


      synchronizeAttributes : string[] option;


      synchronizeAttributesTypeHint : string option;


      clockTolerance : int option;


      clockToleranceTypeHint : string option;


      groupMembershipAttribute : string option;


      groupMembershipAttributeTypeHint : string option;


      idpUrl : string option;


      idpUrlTypeHint : string option;


      logoutUrl : string option;


      logoutUrlTypeHint : string option;


      serviceProviderEntityId : string option;


      serviceProviderEntityIdTypeHint : string option;


      assertionConsumerServiceURL : string option;


      assertionConsumerServiceURLTypeHint : string option;


      handleLogout : bool option;


      handleLogoutTypeHint : string option;


      spPrivateKeyAlias : string option;


      spPrivateKeyAliasTypeHint : string option;


      useEncryption : bool option;


      useEncryptionTypeHint : string option;


      nameIdFormat : string option;


      nameIdFormatTypeHint : string option;


      digestMethod : string option;


      digestMethodTypeHint : string option;


      signatureMethod : string option;


      signatureMethodTypeHint : string option;


      userIntermediatePath : string option;


      userIntermediatePathTypeHint : string option;

    }
    //#endregion


    type PostConfigAdobeGraniteSamlAuthenticationHandlerDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigAdobeGraniteSamlAuthenticationHandlerResult = PostConfigAdobeGraniteSamlAuthenticationHandlerDefaultStatusCode of PostConfigAdobeGraniteSamlAuthenticationHandlerDefaultStatusCodeResponse

    type PostConfigAdobeGraniteSamlAuthenticationHandlerArgs = {
      queryParams:Result<PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigApacheFelixJettyBasedHttpServiceQueryParams = {
      orgApacheFelixHttpsNio : bool option;


      orgApacheFelixHttpsNioTypeHint : string option;


      orgApacheFelixHttpsKeystore : string option;


      orgApacheFelixHttpsKeystoreTypeHint : string option;


      orgApacheFelixHttpsKeystorePassword : string option;


      orgApacheFelixHttpsKeystorePasswordTypeHint : string option;


      orgApacheFelixHttpsKeystoreKey : string option;


      orgApacheFelixHttpsKeystoreKeyTypeHint : string option;


      orgApacheFelixHttpsKeystoreKeyPassword : string option;


      orgApacheFelixHttpsKeystoreKeyPasswordTypeHint : string option;


      orgApacheFelixHttpsTruststore : string option;


      orgApacheFelixHttpsTruststoreTypeHint : string option;


      orgApacheFelixHttpsTruststorePassword : string option;


      orgApacheFelixHttpsTruststorePasswordTypeHint : string option;


      orgApacheFelixHttpsClientcertificate : string option;


      orgApacheFelixHttpsClientcertificateTypeHint : string option;


      orgApacheFelixHttpsEnable : bool option;


      orgApacheFelixHttpsEnableTypeHint : string option;


      orgOsgiServiceHttpPortSecure : string option;


      orgOsgiServiceHttpPortSecureTypeHint : string option;

    }
    //#endregion


    type PostConfigApacheFelixJettyBasedHttpServiceDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigApacheFelixJettyBasedHttpServiceResult = PostConfigApacheFelixJettyBasedHttpServiceDefaultStatusCode of PostConfigApacheFelixJettyBasedHttpServiceDefaultStatusCodeResponse

    type PostConfigApacheFelixJettyBasedHttpServiceArgs = {
      queryParams:Result<PostConfigApacheFelixJettyBasedHttpServiceQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigApacheHttpComponentsProxyConfigurationQueryParams = {
      proxyHost : string option;


      proxyHostTypeHint : string option;


      proxyPort : int option;


      proxyPortTypeHint : string option;


      proxyExceptions : string[] option;


      proxyExceptionsTypeHint : string option;


      proxyEnabled : bool option;


      proxyEnabledTypeHint : string option;


      proxyUser : string option;


      proxyUserTypeHint : string option;


      proxyPassword : string option;


      proxyPasswordTypeHint : string option;

    }
    //#endregion


    type PostConfigApacheHttpComponentsProxyConfigurationDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigApacheHttpComponentsProxyConfigurationResult = PostConfigApacheHttpComponentsProxyConfigurationDefaultStatusCode of PostConfigApacheHttpComponentsProxyConfigurationDefaultStatusCodeResponse

    type PostConfigApacheHttpComponentsProxyConfigurationArgs = {
      queryParams:Result<PostConfigApacheHttpComponentsProxyConfigurationQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigApacheSlingDavExServletQueryParams = {
      alias : string option;


      aliasTypeHint : string option;


      davCreateAbsoluteUri : bool option;


      davCreateAbsoluteUriTypeHint : string option;

    }
    //#endregion


    type PostConfigApacheSlingDavExServletDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigApacheSlingDavExServletResult = PostConfigApacheSlingDavExServletDefaultStatusCode of PostConfigApacheSlingDavExServletDefaultStatusCodeResponse

    type PostConfigApacheSlingDavExServletArgs = {
      queryParams:Result<PostConfigApacheSlingDavExServletQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigApacheSlingGetServletQueryParams = {
      jsonMaximumresults : string option;


      jsonMaximumresultsTypeHint : string option;


      enableHtml : bool option;


      enableHtmlTypeHint : string option;


      enableTxt : bool option;


      enableTxtTypeHint : string option;


      enableXml : bool option;


      enableXmlTypeHint : string option;

    }
    //#endregion


    type PostConfigApacheSlingGetServletDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigApacheSlingGetServletResult = PostConfigApacheSlingGetServletDefaultStatusCode of PostConfigApacheSlingGetServletDefaultStatusCodeResponse

    type PostConfigApacheSlingGetServletArgs = {
      queryParams:Result<PostConfigApacheSlingGetServletQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostConfigApacheSlingReferrerFilterQueryParams = {
      allowEmpty : bool option;


      allowEmptyTypeHint : string option;


      allowHosts : string option;


      allowHostsTypeHint : string option;


      allowHostsRegexp : string option;


      allowHostsRegexpTypeHint : string option;


      filterMethods : string option;


      filterMethodsTypeHint : string option;

    }
    //#endregion


    type PostConfigApacheSlingReferrerFilterDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigApacheSlingReferrerFilterResult = PostConfigApacheSlingReferrerFilterDefaultStatusCode of PostConfigApacheSlingReferrerFilterDefaultStatusCodeResponse

    type PostConfigApacheSlingReferrerFilterArgs = {
      queryParams:Result<PostConfigApacheSlingReferrerFilterQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PostConfigPropertyPathParams = {
      configNodeName : string ;
    }
    //#endregion


    type PostConfigPropertyDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostConfigPropertyResult = PostConfigPropertyDefaultStatusCode of PostConfigPropertyDefaultStatusCodeResponse

    type PostConfigPropertyArgs = {
      pathParams:PostConfigPropertyPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PostNodePathParams = {
      path : string ;
    //#endregion
      name : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PostNodeQueryParams = {
      operation : string option;


      deleteAuthorizable : string option;

    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type PostNodeFormParams = {
      file : System.IO.Stream option;
    }
    //#endregion


    type PostNodeDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostNodeResult = PostNodeDefaultStatusCode of PostNodeDefaultStatusCodeResponse

    type PostNodeArgs = {
      pathParams:PostNodePathParams;
      queryParams:Result<PostNodeQueryParams,string>;
      formParams:Result<PostNodeFormParams,string>
    }
    //#region Path parameters
    [<CLIMutable>]
    type PostNodeRwPathParams = {
      path : string ;
    //#endregion
      name : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PostNodeRwQueryParams = {
      addMembers : string option;

    }
    //#endregion


    type PostNodeRwDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostNodeRwResult = PostNodeRwDefaultStatusCode of PostNodeRwDefaultStatusCodeResponse

    type PostNodeRwArgs = {
      pathParams:PostNodeRwPathParams;
      queryParams:Result<PostNodeRwQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PostPathPathParams = {
      path : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PostPathQueryParams = {
      jcrPrimaryType : string ;


      name : string ;

    }
    //#endregion


    type PostPathDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostPathResult = PostPathDefaultStatusCode of PostPathDefaultStatusCodeResponse

    type PostPathArgs = {
      pathParams:PostPathPathParams;
      queryParams:Result<PostPathQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostQueryQueryParams = {
      path : string ;


      pLimit : decimal ;


      _1property : string ;


      _1propertyValue : string ;

    }
    //#endregion


    type PostQueryDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostQueryResult = PostQueryDefaultStatusCode of PostQueryDefaultStatusCodeResponse

    type PostQueryArgs = {
      queryParams:Result<PostQueryQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostTreeActivationQueryParams = {
      ignoredeactivated : bool ;


      onlymodified : bool ;


      path : string ;


      cmd : string ;

    }
    //#endregion


    type PostTreeActivationDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostTreeActivationResult = PostTreeActivationDefaultStatusCode of PostTreeActivationDefaultStatusCodeResponse

    type PostTreeActivationArgs = {
      queryParams:Result<PostTreeActivationQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PostTruststoreQueryParams = {
      operation : string option;


      newPassword : string option;


      rePassword : string option;


      keyStoreType : string option;


      removeAlias : string option;

    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type PostTruststoreFormParams = {
      certificate : System.IO.Stream option;
    }
    //#endregion


    type PostTruststoreDefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostTruststoreResult = PostTruststoreDefaultStatusCode of PostTruststoreDefaultStatusCodeResponse

    type PostTruststoreArgs = {
      queryParams:Result<PostTruststoreQueryParams,string>;
      formParams:Result<PostTruststoreFormParams,string>
    }

    //#region Form parameters
    [<CLIMutable>]
    type PostTruststorePKCS12FormParams = {
      truststoreP12 : System.IO.Stream option;
    }
    //#endregion


    type PostTruststorePKCS12DefaultStatusCodeResponse = {
      content:string;
      
    }
    type PostTruststorePKCS12Result = PostTruststorePKCS12DefaultStatusCode of PostTruststorePKCS12DefaultStatusCodeResponse

    type PostTruststorePKCS12Args = {
      formParams:Result<PostTruststorePKCS12FormParams,string>
    }
