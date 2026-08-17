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
open SlingApiHandlerTestsHelper
open OpenAPI.SlingApiHandler
open OpenAPI.SlingApiHandlerParams
open OpenAPI.Model.KeystoreInfo
open OpenAPI.Model.TruststoreInfo

module SlingApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``DeleteAgent -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/replication/agents.{runmode}/{name}".Replace("runmode", "ADDME").Replace("name", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteNode -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{path}/{name}".Replace("path", "ADDME").Replace("name", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAgent -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/replication/agents.{runmode}/{name}".Replace("runmode", "ADDME").Replace("name", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAgents -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/replication/agents.{runmode}.-1.json".Replace("runmode", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAuthorizableKeystore -  returns 200 where Retrieved Authorizable Keystore info`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{intermediatePath}/{authorizableId}.ks.json".Replace("intermediatePath", "ADDME").Replace("authorizableId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAuthorizableKeystore -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{intermediatePath}/{authorizableId}.ks.json".Replace("intermediatePath", "ADDME").Replace("authorizableId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetKeystore -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{intermediatePath}/{authorizableId}/keystore/store.p12".Replace("intermediatePath", "ADDME").Replace("authorizableId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetNode -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{path}/{name}".Replace("path", "ADDME").Replace("name", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPackage -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/packages/{group}/{name}-{version}.zip".Replace("group", "ADDME").Replace("name", "ADDME").Replace("version", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPackageFilter -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".Replace("group", "ADDME").Replace("name", "ADDME").Replace("version", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQuery -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/bin/querybuilder.json" + "?path=ADDME&pLimit=ADDME&_1property=ADDME&_1propertyValue=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetTruststore -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/truststore/truststore.p12"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetTruststoreInfo -  returns 200 where Retrieved AEM Truststore info`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/libs/granite/security/truststore.json"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetTruststoreInfo -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/libs/granite/security/truststore.json"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostAgent -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/replication/agents.{runmode}/{name}".Replace("runmode", "ADDME").Replace("name", "ADDME") + "?jcrContentCqDistribute=ADDME&jcrContentCqDistributeTypeHint=ADDME&jcrContentCqName=ADDME&jcrContentCqTemplate=ADDME&jcrContentAliasUpdate=ADDME&jcrContentEnabled=ADDME&jcrContentJcrDescription=ADDME&jcrContentJcrLastModified=ADDME&jcrContentJcrLastModifiedBy=ADDME&jcrContentJcrMixinTypes=ADDME&jcrContentJcrTitle=ADDME&jcrContentLogLevel=ADDME&jcrContentNoStatusUpdate=ADDME&jcrContentNoVersioning=ADDME&jcrContentProtocolConnectTimeout=ADDME&jcrContentProtocolHTTPConnectionClosed=ADDME&jcrContentProtocolHTTPExpired=ADDME&jcrContentProtocolHTTPHeaders=ADDME&jcrContentProtocolHTTPHeadersTypeHint=ADDME&jcrContentProtocolHTTPMethod=ADDME&jcrContentProtocolHTTPSRelaxed=ADDME&jcrContentProtocolInterface=ADDME&jcrContentProtocolSocketTimeout=ADDME&jcrContentProtocolVersion=ADDME&jcrContentProxyNTLMDomain=ADDME&jcrContentProxyNTLMHost=ADDME&jcrContentProxyHost=ADDME&jcrContentProxyPassword=ADDME&jcrContentProxyPort=ADDME&jcrContentProxyUser=ADDME&jcrContentQueueBatchMaxSize=ADDME&jcrContentQueueBatchMode=ADDME&jcrContentQueueBatchWaitTime=ADDME&jcrContentRetryDelay=ADDME&jcrContentReverseReplication=ADDME&jcrContentSerializationType=ADDME&jcrContentSlingResourceType=ADDME&jcrContentSsl=ADDME&jcrContentTransportNTLMDomain=ADDME&jcrContentTransportNTLMHost=ADDME&jcrContentTransportPassword=ADDME&jcrContentTransportUri=ADDME&jcrContentTransportUser=ADDME&jcrContentTriggerDistribute=ADDME&jcrContentTriggerModified=ADDME&jcrContentTriggerOnOffTime=ADDME&jcrContentTriggerReceive=ADDME&jcrContentTriggerSpecific=ADDME&jcrContentUserId=ADDME&jcrPrimaryType=ADDME&operation=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostAuthorizableKeystore -  returns 200 where Retrieved Authorizable Keystore info`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{intermediatePath}/{authorizableId}.ks.html".Replace("intermediatePath", "ADDME").Replace("authorizableId", "ADDME") + "?operation=ADDME&currentPassword=ADDME&newPassword=ADDME&rePassword=ADDME&keyPassword=ADDME&keyStorePass=ADDME&alias=ADDME&newAlias=ADDME&removeAlias=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getPostAuthorizableKeystoreExample "multipart/form-data")
      // or pass a formformform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PostAuthorizableKeystore -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{intermediatePath}/{authorizableId}.ks.html".Replace("intermediatePath", "ADDME").Replace("authorizableId", "ADDME") + "?operation=ADDME&currentPassword=ADDME&newPassword=ADDME&rePassword=ADDME&keyPassword=ADDME&keyStorePass=ADDME&alias=ADDME&newAlias=ADDME&removeAlias=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getPostAuthorizableKeystoreExample "multipart/form-data")
      // or pass a formformform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PostAuthorizables -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/libs/granite/security/post/authorizables" + "?authorizableId=ADDME&intermediatePath=ADDME&createUser=ADDME&createGroup=ADDME&repPassword=ADDME&profileGivenName=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostConfigAdobeGraniteSamlAuthenticationHandler -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config" + "?keyStorePassword=ADDME&keyStorePasswordTypeHint=ADDME&serviceRanking=ADDME&serviceRankingTypeHint=ADDME&idpHttpRedirect=ADDME&idpHttpRedirectTypeHint=ADDME&createUser=ADDME&createUserTypeHint=ADDME&defaultRedirectUrl=ADDME&defaultRedirectUrlTypeHint=ADDME&userIDAttribute=ADDME&userIDAttributeTypeHint=ADDME&defaultGroups=ADDME&defaultGroupsTypeHint=ADDME&idpCertAlias=ADDME&idpCertAliasTypeHint=ADDME&addGroupMemberships=ADDME&addGroupMembershipsTypeHint=ADDME&path=ADDME&pathTypeHint=ADDME&synchronizeAttributes=ADDME&synchronizeAttributesTypeHint=ADDME&clockTolerance=ADDME&clockToleranceTypeHint=ADDME&groupMembershipAttribute=ADDME&groupMembershipAttributeTypeHint=ADDME&idpUrl=ADDME&idpUrlTypeHint=ADDME&logoutUrl=ADDME&logoutUrlTypeHint=ADDME&serviceProviderEntityId=ADDME&serviceProviderEntityIdTypeHint=ADDME&assertionConsumerServiceURL=ADDME&assertionConsumerServiceURLTypeHint=ADDME&handleLogout=ADDME&handleLogoutTypeHint=ADDME&spPrivateKeyAlias=ADDME&spPrivateKeyAliasTypeHint=ADDME&useEncryption=ADDME&useEncryptionTypeHint=ADDME&nameIdFormat=ADDME&nameIdFormatTypeHint=ADDME&digestMethod=ADDME&digestMethodTypeHint=ADDME&signatureMethod=ADDME&signatureMethodTypeHint=ADDME&userIntermediatePath=ADDME&userIntermediatePathTypeHint=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostConfigApacheFelixJettyBasedHttpService -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/apps/system/config/org.apache.felix.http" + "?orgApacheFelixHttpsNio=ADDME&orgApacheFelixHttpsNioTypeHint=ADDME&orgApacheFelixHttpsKeystore=ADDME&orgApacheFelixHttpsKeystoreTypeHint=ADDME&orgApacheFelixHttpsKeystorePassword=ADDME&orgApacheFelixHttpsKeystorePasswordTypeHint=ADDME&orgApacheFelixHttpsKeystoreKey=ADDME&orgApacheFelixHttpsKeystoreKeyTypeHint=ADDME&orgApacheFelixHttpsKeystoreKeyPassword=ADDME&orgApacheFelixHttpsKeystoreKeyPasswordTypeHint=ADDME&orgApacheFelixHttpsTruststore=ADDME&orgApacheFelixHttpsTruststoreTypeHint=ADDME&orgApacheFelixHttpsTruststorePassword=ADDME&orgApacheFelixHttpsTruststorePasswordTypeHint=ADDME&orgApacheFelixHttpsClientcertificate=ADDME&orgApacheFelixHttpsClientcertificateTypeHint=ADDME&orgApacheFelixHttpsEnable=ADDME&orgApacheFelixHttpsEnableTypeHint=ADDME&orgOsgiServiceHttpPortSecure=ADDME&orgOsgiServiceHttpPortSecureTypeHint=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostConfigApacheHttpComponentsProxyConfiguration -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/apps/system/config/org.apache.http.proxyconfigurator.config" + "?proxyHost=ADDME&proxyHostTypeHint=ADDME&proxyPort=ADDME&proxyPortTypeHint=ADDME&proxyExceptions=ADDME&proxyExceptionsTypeHint=ADDME&proxyEnabled=ADDME&proxyEnabledTypeHint=ADDME&proxyUser=ADDME&proxyUserTypeHint=ADDME&proxyPassword=ADDME&proxyPasswordTypeHint=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostConfigApacheSlingDavExServlet -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" + "?alias=ADDME&aliasTypeHint=ADDME&davCreateAbsoluteUri=ADDME&davCreateAbsoluteUriTypeHint=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostConfigApacheSlingGetServlet -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet" + "?jsonMaximumresults=ADDME&jsonMaximumresultsTypeHint=ADDME&enableHtml=ADDME&enableHtmlTypeHint=ADDME&enableTxt=ADDME&enableTxtTypeHint=ADDME&enableXml=ADDME&enableXmlTypeHint=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostConfigApacheSlingReferrerFilter -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter" + "?allowEmpty=ADDME&allowEmptyTypeHint=ADDME&allowHosts=ADDME&allowHostsTypeHint=ADDME&allowHostsRegexp=ADDME&allowHostsRegexpTypeHint=ADDME&filterMethods=ADDME&filterMethodsTypeHint=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostConfigProperty -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/apps/system/config/{configNodeName}".Replace("configNodeName", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostNode -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{path}/{name}".Replace("path", "ADDME").Replace("name", "ADDME") + "?operation=ADDME&deleteAuthorizable=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getPostNodeExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PostNodeRw -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{path}/{name}.rw.html".Replace("path", "ADDME").Replace("name", "ADDME") + "?addMembers=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostPath -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/{path}/".Replace("path", "ADDME") + "?jcrPrimaryType=ADDME&name=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostQuery -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/bin/querybuilder.json" + "?path=ADDME&pLimit=ADDME&_1property=ADDME&_1propertyValue=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostTreeActivation -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/libs/replication/treeactivation.html" + "?ignoredeactivated=ADDME&onlymodified=ADDME&path=ADDME&cmd=ADDME"

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PostTruststore -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/libs/granite/security/post/truststore" + "?operation=ADDME&newPassword=ADDME&rePassword=ADDME&keyStoreType=ADDME&removeAlias=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getPostTruststoreExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PostTruststorePKCS12 -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/etc/truststore"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getPostTruststorePKCS12Example "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

