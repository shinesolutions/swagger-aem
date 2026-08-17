namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BundleData

module BundleInfo =

  //#region BundleInfo

  [<CLIMutable>]
  type BundleInfo = {
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "s")>]
    S : int[];
    [<JsonProperty(PropertyName = "data")>]
    Data : BundleData[];
  }

  //#endregion
