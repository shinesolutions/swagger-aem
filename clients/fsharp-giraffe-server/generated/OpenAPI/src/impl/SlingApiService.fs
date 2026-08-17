namespace OpenAPI
open OpenAPI.Model.KeystoreInfo
open OpenAPI.Model.TruststoreInfo
open SlingApiHandlerParams
open SlingApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module SlingApiServiceImplementation =

    //#region Service implementation
    type SlingApiServiceImpl() =
      interface ISlingApiService with

        member this.DeleteAgent ctx args =
            let content = "Default response" 
            DeleteAgentDefaultStatusCode { content = content }

        member this.DeleteNode ctx args =
            let content = "Default response" 
            DeleteNodeDefaultStatusCode { content = content }

        member this.GetAgent ctx args =
            let content = "Default response" 
            GetAgentDefaultStatusCode { content = content }

        member this.GetAgents ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAgentsDefaultStatusCode { content = content }

        member this.GetAuthorizableKeystore ctx args =
          if true then
            let content = "Retrieved Authorizable Keystore info" :> obj :?> KeystoreInfo // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAuthorizableKeystoreStatusCode200 { content = content }
          else
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAuthorizableKeystoreDefaultStatusCode { content = content }

        member this.GetKeystore ctx args =
            let content = "Default response" :> obj :?> System.IO.Stream // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetKeystoreDefaultStatusCode { content = content }

        member this.GetNode ctx args =
            let content = "Default response" 
            GetNodeDefaultStatusCode { content = content }

        member this.GetPackage ctx args =
            let content = "Default response" :> obj :?> System.IO.Stream // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPackageDefaultStatusCode { content = content }

        member this.GetPackageFilter ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPackageFilterDefaultStatusCode { content = content }

        member this.GetQuery ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQueryDefaultStatusCode { content = content }

        member this.GetTruststore ctx  =
            let content = "Default response" :> obj :?> System.IO.Stream // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetTruststoreDefaultStatusCode { content = content }

        member this.GetTruststoreInfo ctx  =
          if true then
            let content = "Retrieved AEM Truststore info" :> obj :?> TruststoreInfo // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetTruststoreInfoStatusCode200 { content = content }
          else
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetTruststoreInfoDefaultStatusCode { content = content }

        member this.PostAgent ctx args =
            let content = "Default response" 
            PostAgentDefaultStatusCode { content = content }

        member this.PostAuthorizableKeystore ctx args =
          if true then
            let content = "Retrieved Authorizable Keystore info" :> obj :?> KeystoreInfo // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostAuthorizableKeystoreStatusCode200 { content = content }
          else
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostAuthorizableKeystoreDefaultStatusCode { content = content }

        member this.PostAuthorizables ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostAuthorizablesDefaultStatusCode { content = content }

        member this.PostConfigAdobeGraniteSamlAuthenticationHandler ctx args =
            let content = "Default response" 
            PostConfigAdobeGraniteSamlAuthenticationHandlerDefaultStatusCode { content = content }

        member this.PostConfigApacheFelixJettyBasedHttpService ctx args =
            let content = "Default response" 
            PostConfigApacheFelixJettyBasedHttpServiceDefaultStatusCode { content = content }

        member this.PostConfigApacheHttpComponentsProxyConfiguration ctx args =
            let content = "Default response" 
            PostConfigApacheHttpComponentsProxyConfigurationDefaultStatusCode { content = content }

        member this.PostConfigApacheSlingDavExServlet ctx args =
            let content = "Default response" 
            PostConfigApacheSlingDavExServletDefaultStatusCode { content = content }

        member this.PostConfigApacheSlingGetServlet ctx args =
            let content = "Default response" 
            PostConfigApacheSlingGetServletDefaultStatusCode { content = content }

        member this.PostConfigApacheSlingReferrerFilter ctx args =
            let content = "Default response" 
            PostConfigApacheSlingReferrerFilterDefaultStatusCode { content = content }

        member this.PostConfigProperty ctx args =
            let content = "Default response" 
            PostConfigPropertyDefaultStatusCode { content = content }

        member this.PostNode ctx args =
            let content = "Default response" 
            PostNodeDefaultStatusCode { content = content }

        member this.PostNodeRw ctx args =
            let content = "Default response" 
            PostNodeRwDefaultStatusCode { content = content }

        member this.PostPath ctx args =
            let content = "Default response" 
            PostPathDefaultStatusCode { content = content }

        member this.PostQuery ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostQueryDefaultStatusCode { content = content }

        member this.PostTreeActivation ctx args =
            let content = "Default response" 
            PostTreeActivationDefaultStatusCode { content = content }

        member this.PostTruststore ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostTruststoreDefaultStatusCode { content = content }

        member this.PostTruststorePKCS12 ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PostTruststorePKCS12DefaultStatusCode { content = content }

      //#endregion

    let SlingApiService = SlingApiServiceImpl() :> ISlingApiService