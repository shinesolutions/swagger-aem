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
open TestHelper
open OpenAPI.SlingApiHandler
open OpenAPI.SlingApiHandlerParams

module SlingApiHandlerTestsHelper =

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable PostAuthorizableKeystoreExamples = Map.empty
  let mutable PostAuthorizableKeystoreBody = ""

  let getPostAuthorizableKeystoreExample mediaType =
    PostAuthorizableKeystoreExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable PostNodeExamples = Map.empty
  let mutable PostNodeBody = ""

  let getPostNodeExample mediaType =
    PostNodeExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable PostTruststoreExamples = Map.empty
  let mutable PostTruststoreBody = ""

  let getPostTruststoreExample mediaType =
    PostTruststoreExamples.[mediaType]
      |> getConverter mediaType

  let mutable PostTruststorePKCS12Examples = Map.empty
  let mutable PostTruststorePKCS12Body = ""

  let getPostTruststorePKCS12Example mediaType =
    PostTruststorePKCS12Examples.[mediaType]
      |> getConverter mediaType
