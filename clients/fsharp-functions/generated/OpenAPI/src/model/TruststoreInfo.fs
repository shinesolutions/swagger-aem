namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TruststoreItems

module TruststoreInfo =

  //#region TruststoreInfo

  [<CLIMutable>]
  type TruststoreInfo = {
    [<JsonProperty(PropertyName = "aliases")>]
    Aliases : TruststoreItems[];
    [<JsonProperty(PropertyName = "exists")>]
    Exists : bool;
  }

  //#endregion
