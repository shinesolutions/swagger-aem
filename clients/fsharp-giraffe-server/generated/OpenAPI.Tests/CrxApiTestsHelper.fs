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
open OpenAPI.CrxApiHandler
open OpenAPI.CrxApiHandlerParams

module CrxApiHandlerTestsHelper =

  ()

  ()

  ()

  ()


  let mutable PostPackageServiceJsonExamples = Map.empty
  let mutable PostPackageServiceJsonBody = ""

  let getPostPackageServiceJsonExample mediaType =
    PostPackageServiceJsonExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

