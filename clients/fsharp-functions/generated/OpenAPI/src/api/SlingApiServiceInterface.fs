namespace OpenAPI
open SlingApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module SlingApiServiceInterface =

    //#region Service interface
    type ISlingApiService =
      abstract member DeleteAgent : unit -> DeleteAgentResult
      abstract member DeleteNode : unit -> DeleteNodeResult
      abstract member GetAgent : unit -> GetAgentResult
      abstract member GetAgents : unit -> GetAgentsResult
      abstract member GetAuthorizableKeystore : unit -> GetAuthorizableKeystoreResult
      abstract member GetKeystore : unit -> GetKeystoreResult
      abstract member GetNode : unit -> GetNodeResult
      abstract member GetPackage : unit -> GetPackageResult
      abstract member GetPackageFilter : unit -> GetPackageFilterResult
      abstract member GetQuery : unit -> GetQueryResult
      abstract member GetTruststore : unit -> GetTruststoreResult
      abstract member GetTruststoreInfo : unit -> GetTruststoreInfoResult
      abstract member PostAgent : unit -> PostAgentResult
      abstract member PostAuthorizableKeystore : unit -> PostAuthorizableKeystoreResult
      abstract member PostAuthorizables : unit -> PostAuthorizablesResult
      abstract member PostConfigAdobeGraniteSamlAuthenticationHandler : unit -> PostConfigAdobeGraniteSamlAuthenticationHandlerResult
      abstract member PostConfigApacheFelixJettyBasedHttpService : unit -> PostConfigApacheFelixJettyBasedHttpServiceResult
      abstract member PostConfigApacheHttpComponentsProxyConfiguration : unit -> PostConfigApacheHttpComponentsProxyConfigurationResult
      abstract member PostConfigApacheSlingDavExServlet : unit -> PostConfigApacheSlingDavExServletResult
      abstract member PostConfigApacheSlingGetServlet : unit -> PostConfigApacheSlingGetServletResult
      abstract member PostConfigApacheSlingReferrerFilter : unit -> PostConfigApacheSlingReferrerFilterResult
      abstract member PostConfigProperty : unit -> PostConfigPropertyResult
      abstract member PostNode : unit -> PostNodeResult
      abstract member PostNodeRw : unit -> PostNodeRwResult
      abstract member PostPath : unit -> PostPathResult
      abstract member PostQuery : unit -> PostQueryResult
      abstract member PostTreeActivation : unit -> PostTreeActivationResult
      abstract member PostTruststore : unit -> PostTruststoreResult
      abstract member PostTruststorePKCS12 : unit -> PostTruststorePKCS12Result
    //#endregion