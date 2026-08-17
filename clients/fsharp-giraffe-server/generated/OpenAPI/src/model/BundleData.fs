namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BundleDataProp

module BundleData =

  //#region BundleData


  type BundleData = {
    Id : int;
    Name : string;
    Fragment : bool;
    StateRaw : int;
    State : string;
    Version : string;
    SymbolicName : string;
    Category : string;
    Props : BundleDataProp[];
  }
  //#endregion
