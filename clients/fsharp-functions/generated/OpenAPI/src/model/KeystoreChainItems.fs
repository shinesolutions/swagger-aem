namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module KeystoreChainItems =

  //#region KeystoreChainItems

  [<CLIMutable>]
  type KeystoreChainItems = {
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
