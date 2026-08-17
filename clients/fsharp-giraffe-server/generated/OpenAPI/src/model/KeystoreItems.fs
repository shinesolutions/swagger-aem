namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.KeystoreChainItems

module KeystoreItems =

  //#region KeystoreItems


  type KeystoreItems = {
    Alias : string;
    EntryType : string;
    Algorithm : string;
    Format : string;
    Chain : KeystoreChainItems[];
  }
  //#endregion
