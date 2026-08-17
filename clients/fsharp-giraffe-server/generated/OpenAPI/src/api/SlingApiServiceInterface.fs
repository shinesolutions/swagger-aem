namespace OpenAPI
open SlingApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module SlingApiServiceInterface =

    //#region Service interface
    type ISlingApiService =
      abstract member DeleteAgent:HttpContext -> DeleteAgentArgs->DeleteAgentResult
      abstract member DeleteNode:HttpContext -> DeleteNodeArgs->DeleteNodeResult
      abstract member GetAgent:HttpContext -> GetAgentArgs->GetAgentResult
      abstract member GetAgents:HttpContext -> GetAgentsArgs->GetAgentsResult
      abstract member GetAuthorizableKeystore:HttpContext -> GetAuthorizableKeystoreArgs->GetAuthorizableKeystoreResult
      abstract member GetKeystore:HttpContext -> GetKeystoreArgs->GetKeystoreResult
      abstract member GetNode:HttpContext -> GetNodeArgs->GetNodeResult
      abstract member GetPackage:HttpContext -> GetPackageArgs->GetPackageResult
      abstract member GetPackageFilter:HttpContext -> GetPackageFilterArgs->GetPackageFilterResult
      abstract member GetQuery:HttpContext -> GetQueryArgs->GetQueryResult
      abstract member GetTruststore:HttpContext ->GetTruststoreResult
      abstract member GetTruststoreInfo:HttpContext ->GetTruststoreInfoResult
      abstract member PostAgent:HttpContext -> PostAgentArgs->PostAgentResult
      abstract member PostAuthorizableKeystore:HttpContext -> PostAuthorizableKeystoreArgs->PostAuthorizableKeystoreResult
      abstract member PostAuthorizables:HttpContext -> PostAuthorizablesArgs->PostAuthorizablesResult
      abstract member PostConfigAdobeGraniteSamlAuthenticationHandler:HttpContext -> PostConfigAdobeGraniteSamlAuthenticationHandlerArgs->PostConfigAdobeGraniteSamlAuthenticationHandlerResult
      abstract member PostConfigApacheFelixJettyBasedHttpService:HttpContext -> PostConfigApacheFelixJettyBasedHttpServiceArgs->PostConfigApacheFelixJettyBasedHttpServiceResult
      abstract member PostConfigApacheHttpComponentsProxyConfiguration:HttpContext -> PostConfigApacheHttpComponentsProxyConfigurationArgs->PostConfigApacheHttpComponentsProxyConfigurationResult
      abstract member PostConfigApacheSlingDavExServlet:HttpContext -> PostConfigApacheSlingDavExServletArgs->PostConfigApacheSlingDavExServletResult
      abstract member PostConfigApacheSlingGetServlet:HttpContext -> PostConfigApacheSlingGetServletArgs->PostConfigApacheSlingGetServletResult
      abstract member PostConfigApacheSlingReferrerFilter:HttpContext -> PostConfigApacheSlingReferrerFilterArgs->PostConfigApacheSlingReferrerFilterResult
      abstract member PostConfigProperty:HttpContext -> PostConfigPropertyArgs->PostConfigPropertyResult
      abstract member PostNode:HttpContext -> PostNodeArgs->PostNodeResult
      abstract member PostNodeRw:HttpContext -> PostNodeRwArgs->PostNodeRwResult
      abstract member PostPath:HttpContext -> PostPathArgs->PostPathResult
      abstract member PostQuery:HttpContext -> PostQueryArgs->PostQueryResult
      abstract member PostTreeActivation:HttpContext -> PostTreeActivationArgs->PostTreeActivationResult
      abstract member PostTruststore:HttpContext -> PostTruststoreArgs->PostTruststoreResult
      abstract member PostTruststorePKCS12:HttpContext -> PostTruststorePKCS12Args->PostTruststorePKCS12Result
    //#endregion