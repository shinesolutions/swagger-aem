namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TruststoreItems =

  //#region TruststoreItems

  [<CLIMutable>]
  type TruststoreItems = {
    [<JsonProperty(PropertyName = "alias")>]
    Alias : string;
    [<JsonProperty(PropertyName = "entryType")>]
    EntryType : string;
    [<JsonProperty(PropertyName = "subject")>]
    Subject : string;
    [<JsonProperty(PropertyName = "issuer")>]
    Issuer : string;
    [<JsonProperty(PropertyName = "notBefore")>]
    NotBefore : string;
    [<JsonProperty(PropertyName = "notAfter")>]
    NotAfter : string;
    [<JsonProperty(PropertyName = "serialNumber")>]
    SerialNumber : int;
  }

  //#endregion
