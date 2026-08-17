namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SamlConfigurationPropertyItemsArray
open OpenAPI.Model.SamlConfigurationPropertyItemsBoolean
open OpenAPI.Model.SamlConfigurationPropertyItemsLong
open OpenAPI.Model.SamlConfigurationPropertyItemsString

module SamlConfigurationProperties =

  //#region SamlConfigurationProperties


  type SamlConfigurationProperties = {
    Path : SamlConfigurationPropertyItemsArray;
    ServiceRanking : SamlConfigurationPropertyItemsLong;
    IdpUrl : SamlConfigurationPropertyItemsString;
    IdpCertAlias : SamlConfigurationPropertyItemsString;
    IdpHttpRedirect : SamlConfigurationPropertyItemsBoolean;
    ServiceProviderEntityId : SamlConfigurationPropertyItemsString;
    AssertionConsumerServiceURL : SamlConfigurationPropertyItemsString;
    SpPrivateKeyAlias : SamlConfigurationPropertyItemsString;
    KeyStorePassword : SamlConfigurationPropertyItemsString;
    DefaultRedirectUrl : SamlConfigurationPropertyItemsString;
    UserIDAttribute : SamlConfigurationPropertyItemsString;
    UseEncryption : SamlConfigurationPropertyItemsBoolean;
    CreateUser : SamlConfigurationPropertyItemsBoolean;
    AddGroupMemberships : SamlConfigurationPropertyItemsBoolean;
    GroupMembershipAttribute : SamlConfigurationPropertyItemsString;
    DefaultGroups : SamlConfigurationPropertyItemsArray;
    NameIdFormat : SamlConfigurationPropertyItemsString;
    SynchronizeAttributes : SamlConfigurationPropertyItemsArray;
    HandleLogout : SamlConfigurationPropertyItemsBoolean;
    LogoutUrl : SamlConfigurationPropertyItemsString;
    ClockTolerance : SamlConfigurationPropertyItemsLong;
    DigestMethod : SamlConfigurationPropertyItemsString;
    SignatureMethod : SamlConfigurationPropertyItemsString;
    UserIntermediatePath : SamlConfigurationPropertyItemsString;
  }
  //#endregion
