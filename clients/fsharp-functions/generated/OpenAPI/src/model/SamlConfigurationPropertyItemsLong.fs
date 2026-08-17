namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SamlConfigurationPropertyItemsLong =

  //#region SamlConfigurationPropertyItemsLong

  [<CLIMutable>]
  type SamlConfigurationPropertyItemsLong = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "optional")>]
    Optional : bool;
    [<JsonProperty(PropertyName = "is_set")>]
    IsSet : bool;
    [<JsonProperty(PropertyName = "type")>]
    Type : int;
    [<JsonProperty(PropertyName = "value")>]
    Value : int;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
