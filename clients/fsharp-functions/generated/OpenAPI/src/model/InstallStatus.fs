namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InstallStatusStatus

module InstallStatus =

  //#region InstallStatus

  [<CLIMutable>]
  type InstallStatus = {
    [<JsonProperty(PropertyName = "status")>]
    Status : InstallStatusStatus;
  }

  //#endregion
