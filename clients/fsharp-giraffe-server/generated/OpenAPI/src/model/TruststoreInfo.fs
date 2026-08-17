namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TruststoreItems

module TruststoreInfo =

  //#region TruststoreInfo


  type TruststoreInfo = {
    Aliases : TruststoreItems[];
    Exists : bool;
  }
  //#endregion
