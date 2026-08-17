namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BundleData

module BundleInfo =

  //#region BundleInfo


  type BundleInfo = {
    Status : string;
    S : int[];
    Data : BundleData[];
  }
  //#endregion
