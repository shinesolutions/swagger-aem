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
open OpenAPI.GraniteApiHandler
open OpenAPI.GraniteApiHandlerParams

module GraniteApiHandlerTestsHelper =


  let mutable SslSetupExamples = Map.empty
  let mutable SslSetupBody = ""

  let getSslSetupExample mediaType =
    SslSetupExamples.[mediaType]
      |> getConverter mediaType
