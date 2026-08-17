namespace OpenAPI.Model

open System
open System.Collections.Generic

module KeystoreChainItems =

  //#region KeystoreChainItems


  type KeystoreChainItems = {
    Subject : string;
    Issuer : string;
    NotBefore : string;
    NotAfter : string;
    SerialNumber : int;
  }
  //#endregion
