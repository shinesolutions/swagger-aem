namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BundleDataProp =

  //#region BundleDataProp

  [<CLIMutable>]
  type BundleDataProp = {
    [<JsonProperty(PropertyName = "key")>]
    Key : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
