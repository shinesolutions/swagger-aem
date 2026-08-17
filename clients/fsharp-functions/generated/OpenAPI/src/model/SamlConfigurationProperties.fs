namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SamlConfigurationPropertyItemsArray
open OpenAPI.Model.SamlConfigurationPropertyItemsBoolean
open OpenAPI.Model.SamlConfigurationPropertyItemsLong
open OpenAPI.Model.SamlConfigurationPropertyItemsString

module SamlConfigurationProperties =

  //#region SamlConfigurationProperties

  [<CLIMutable>]
  type SamlConfigurationProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : SamlConfigurationPropertyItemsArray;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : SamlConfigurationPropertyItemsLong;
    [<JsonProperty(PropertyName = "idpUrl")>]
    IdpUrl : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "idpCertAlias")>]
    IdpCertAlias : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "idpHttpRedirect")>]
    IdpHttpRedirect : SamlConfigurationPropertyItemsBoolean;
    [<JsonProperty(PropertyName = "serviceProviderEntityId")>]
    ServiceProviderEntityId : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "assertionConsumerServiceURL")>]
    AssertionConsumerServiceURL : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "spPrivateKeyAlias")>]
    SpPrivateKeyAlias : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "keyStorePassword")>]
    KeyStorePassword : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "defaultRedirectUrl")>]
    DefaultRedirectUrl : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "userIDAttribute")>]
    UserIDAttribute : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "useEncryption")>]
    UseEncryption : SamlConfigurationPropertyItemsBoolean;
    [<JsonProperty(PropertyName = "createUser")>]
    CreateUser : SamlConfigurationPropertyItemsBoolean;
    [<JsonProperty(PropertyName = "addGroupMemberships")>]
    AddGroupMemberships : SamlConfigurationPropertyItemsBoolean;
    [<JsonProperty(PropertyName = "groupMembershipAttribute")>]
    GroupMembershipAttribute : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "defaultGroups")>]
    DefaultGroups : SamlConfigurationPropertyItemsArray;
    [<JsonProperty(PropertyName = "nameIdFormat")>]
    NameIdFormat : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "synchronizeAttributes")>]
    SynchronizeAttributes : SamlConfigurationPropertyItemsArray;
    [<JsonProperty(PropertyName = "handleLogout")>]
    HandleLogout : SamlConfigurationPropertyItemsBoolean;
    [<JsonProperty(PropertyName = "logoutUrl")>]
    LogoutUrl : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "clockTolerance")>]
    ClockTolerance : SamlConfigurationPropertyItemsLong;
    [<JsonProperty(PropertyName = "digestMethod")>]
    DigestMethod : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "signatureMethod")>]
    SignatureMethod : SamlConfigurationPropertyItemsString;
    [<JsonProperty(PropertyName = "userIntermediatePath")>]
    UserIntermediatePath : SamlConfigurationPropertyItemsString;
  }

  //#endregion
