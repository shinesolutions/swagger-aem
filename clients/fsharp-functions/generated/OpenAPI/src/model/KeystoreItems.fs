namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeystoreChainItems

module KeystoreItems =

  //#region KeystoreItems

  [<CLIMutable>]
  type KeystoreItems = {
    [<JsonProperty(PropertyName = "alias")>]
    Alias : string;
    [<JsonProperty(PropertyName = "entryType")>]
    EntryType : string;
    [<JsonProperty(PropertyName = "algorithm")>]
    Algorithm : string;
    [<JsonProperty(PropertyName = "format")>]
    Format : string;
    [<JsonProperty(PropertyName = "chain")>]
    Chain : KeystoreChainItems[];
  }

  //#endregion
