namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open ConsoleApiHandlerTestsHelper
open OpenAPI.ConsoleApiHandler
open OpenAPI.ConsoleApiHandlerParams
open OpenAPI.Model.BundleInfo
open OpenAPI.Model.SamlConfigurationInfo

module ConsoleApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetAemProductInfo -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/status-productinfo.json"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBundleInfo -  returns 200 where Retrieved bundle info`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/bundles/{name}.json".Replace("name", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBundleInfo -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/bundles/{name}.json".Replace("name", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetConfigMgr -  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/configMgr"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetConfigMgr -  returns 5XX where Unexpected error.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/configMgr"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(5XX))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostBundle -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/bundles/{name}".Replace("name", "ADDME") + "?action=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostJmxRepository -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}".Replace("action", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostSamlConfiguration -  returns 200 where Retrieved AEM SAML Configuration`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" + "?post=ADDME&apply=ADDME&delete=ADDME&action=ADDME&location=ADDME&path=ADDME&serviceRanking=ADDME&idpUrl=ADDME&idpCertAlias=ADDME&idpHttpRedirect=ADDME&serviceProviderEntityId=ADDME&assertionConsumerServiceURL=ADDME&spPrivateKeyAlias=ADDME&keyStorePassword=ADDME&defaultRedirectUrl=ADDME&userIDAttribute=ADDME&useEncryption=ADDME&createUser=ADDME&addGroupMemberships=ADDME&groupMembershipAttribute=ADDME&defaultGroups=ADDME&nameIdFormat=ADDME&synchronizeAttributes=ADDME&handleLogout=ADDME&logoutUrl=ADDME&clockTolerance=ADDME&digestMethod=ADDME&signatureMethod=ADDME&userIntermediatePath=ADDME&propertylist=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostSamlConfiguration -  returns 302 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" + "?post=ADDME&apply=ADDME&delete=ADDME&action=ADDME&location=ADDME&path=ADDME&serviceRanking=ADDME&idpUrl=ADDME&idpCertAlias=ADDME&idpHttpRedirect=ADDME&serviceProviderEntityId=ADDME&assertionConsumerServiceURL=ADDME&spPrivateKeyAlias=ADDME&keyStorePassword=ADDME&defaultRedirectUrl=ADDME&userIDAttribute=ADDME&useEncryption=ADDME&createUser=ADDME&addGroupMemberships=ADDME&groupMembershipAttribute=ADDME&defaultGroups=ADDME&nameIdFormat=ADDME&synchronizeAttributes=ADDME&handleLogout=ADDME&logoutUrl=ADDME&clockTolerance=ADDME&digestMethod=ADDME&signatureMethod=ADDME&userIntermediatePath=ADDME&propertylist=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(302))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostSamlConfiguration -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" + "?post=ADDME&apply=ADDME&delete=ADDME&action=ADDME&location=ADDME&path=ADDME&serviceRanking=ADDME&idpUrl=ADDME&idpCertAlias=ADDME&idpHttpRedirect=ADDME&serviceProviderEntityId=ADDME&assertionConsumerServiceURL=ADDME&spPrivateKeyAlias=ADDME&keyStorePassword=ADDME&defaultRedirectUrl=ADDME&userIDAttribute=ADDME&useEncryption=ADDME&createUser=ADDME&addGroupMemberships=ADDME&groupMembershipAttribute=ADDME&defaultGroups=ADDME&nameIdFormat=ADDME&synchronizeAttributes=ADDME&handleLogout=ADDME&logoutUrl=ADDME&clockTolerance=ADDME&digestMethod=ADDME&signatureMethod=ADDME&userIntermediatePath=ADDME&propertylist=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

