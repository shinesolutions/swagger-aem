namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SamlConfigurationProperties

module SamlConfigurationInfo =

  //#region SamlConfigurationInfo


  type SamlConfigurationInfo = {
    Pid : string;
    Title : string;
    Description : string;
    BundleLocation : string;
    ServiceLocation : string;
    Properties : SamlConfigurationProperties;
  }
  //#endregion
