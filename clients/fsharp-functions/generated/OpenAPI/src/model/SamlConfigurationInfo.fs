namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SamlConfigurationProperties

module SamlConfigurationInfo =

  //#region SamlConfigurationInfo

  [<CLIMutable>]
  type SamlConfigurationInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : SamlConfigurationProperties;
  }

  //#endregion
