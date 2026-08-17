namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeystoreItems

module KeystoreInfo =

  //#region KeystoreInfo

  [<CLIMutable>]
  type KeystoreInfo = {
    [<JsonProperty(PropertyName = "aliases")>]
    Aliases : KeystoreItems[];
    [<JsonProperty(PropertyName = "exists")>]
    Exists : bool;
  }

  //#endregion
