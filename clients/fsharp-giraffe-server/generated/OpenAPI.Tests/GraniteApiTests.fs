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
open GraniteApiHandlerTestsHelper
open OpenAPI.GraniteApiHandler
open OpenAPI.GraniteApiHandlerParams

module GraniteApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``SslSetup -  returns 0 where Default response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/libs/granite/security/post/sslSetup.html" + "?keystorePassword=ADDME&keystorePasswordConfirm=ADDME&truststorePassword=ADDME&truststorePasswordConfirm=ADDME&httpsHostname=ADDME&httpsPort=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSslSetupExample "multipart/form-data")
      // or pass a formform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

