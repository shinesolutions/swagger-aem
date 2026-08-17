namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SamlConfigurationPropertyItemsString =

  //#region SamlConfigurationPropertyItemsString

  [<CLIMutable>]
  type SamlConfigurationPropertyItemsString = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "optional")>]
    Optional : bool;
    [<JsonProperty(PropertyName = "is_set")>]
    IsSet : bool;
    [<JsonProperty(PropertyName = "type")>]
    Type : int;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
