namespace OpenAPI.Model

open System
open System.Collections.Generic

module TruststoreItems =

  //#region TruststoreItems


  type TruststoreItems = {
    Alias : string;
    EntryType : string;
    Subject : string;
    Issuer : string;
    NotBefore : string;
    NotAfter : string;
    SerialNumber : int;
  }
  //#endregion
