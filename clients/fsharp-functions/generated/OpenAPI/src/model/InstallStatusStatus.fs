namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InstallStatusStatus =

  //#region InstallStatusStatus

  [<CLIMutable>]
  type InstallStatusStatus = {
    [<JsonProperty(PropertyName = "finished")>]
    Finished : bool;
    [<JsonProperty(PropertyName = "itemCount")>]
    ItemCount : int;
  }

  //#endregion
