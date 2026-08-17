namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.KeystoreItems

module KeystoreInfo =

  //#region KeystoreInfo


  type KeystoreInfo = {
    Aliases : KeystoreItems[];
    Exists : bool;
  }
  //#endregion
