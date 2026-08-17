namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BundleDataProp

module BundleData =

  //#region BundleData

  [<CLIMutable>]
  type BundleData = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "fragment")>]
    Fragment : bool;
    [<JsonProperty(PropertyName = "stateRaw")>]
    StateRaw : int;
    [<JsonProperty(PropertyName = "state")>]
    State : string;
    [<JsonProperty(PropertyName = "version")>]
    Version : string;
    [<JsonProperty(PropertyName = "symbolicName")>]
    SymbolicName : string;
    [<JsonProperty(PropertyName = "category")>]
    Category : string;
    [<JsonProperty(PropertyName = "props")>]
    Props : BundleDataProp[];
  }

  //#endregion
