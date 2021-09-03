# SamlConfigurationProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | Pointer to [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**ServiceRanking** | Pointer to [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] 
**IdpUrl** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**IdpCertAlias** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**IdpHttpRedirect** | Pointer to [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**ServiceProviderEntityId** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**AssertionConsumerServiceURL** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**SpPrivateKeyAlias** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**KeyStorePassword** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**DefaultRedirectUrl** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**UserIDAttribute** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**UseEncryption** | Pointer to [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**CreateUser** | Pointer to [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**AddGroupMemberships** | Pointer to [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**GroupMembershipAttribute** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**DefaultGroups** | Pointer to [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**NameIdFormat** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**SynchronizeAttributes** | Pointer to [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**HandleLogout** | Pointer to [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**LogoutUrl** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**ClockTolerance** | Pointer to [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] 
**DigestMethod** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**SignatureMethod** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**UserIntermediatePath** | Pointer to [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 

## Methods

### NewSamlConfigurationProperties

`func NewSamlConfigurationProperties() *SamlConfigurationProperties`

NewSamlConfigurationProperties instantiates a new SamlConfigurationProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSamlConfigurationPropertiesWithDefaults

`func NewSamlConfigurationPropertiesWithDefaults() *SamlConfigurationProperties`

NewSamlConfigurationPropertiesWithDefaults instantiates a new SamlConfigurationProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPath

`func (o *SamlConfigurationProperties) GetPath() SamlConfigurationPropertyItemsArray`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *SamlConfigurationProperties) GetPathOk() (*SamlConfigurationPropertyItemsArray, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *SamlConfigurationProperties) SetPath(v SamlConfigurationPropertyItemsArray)`

SetPath sets Path field to given value.

### HasPath

`func (o *SamlConfigurationProperties) HasPath() bool`

HasPath returns a boolean if a field has been set.

### GetServiceRanking

`func (o *SamlConfigurationProperties) GetServiceRanking() SamlConfigurationPropertyItemsLong`

GetServiceRanking returns the ServiceRanking field if non-nil, zero value otherwise.

### GetServiceRankingOk

`func (o *SamlConfigurationProperties) GetServiceRankingOk() (*SamlConfigurationPropertyItemsLong, bool)`

GetServiceRankingOk returns a tuple with the ServiceRanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceRanking

`func (o *SamlConfigurationProperties) SetServiceRanking(v SamlConfigurationPropertyItemsLong)`

SetServiceRanking sets ServiceRanking field to given value.

### HasServiceRanking

`func (o *SamlConfigurationProperties) HasServiceRanking() bool`

HasServiceRanking returns a boolean if a field has been set.

### GetIdpUrl

`func (o *SamlConfigurationProperties) GetIdpUrl() SamlConfigurationPropertyItemsString`

GetIdpUrl returns the IdpUrl field if non-nil, zero value otherwise.

### GetIdpUrlOk

`func (o *SamlConfigurationProperties) GetIdpUrlOk() (*SamlConfigurationPropertyItemsString, bool)`

GetIdpUrlOk returns a tuple with the IdpUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpUrl

`func (o *SamlConfigurationProperties) SetIdpUrl(v SamlConfigurationPropertyItemsString)`

SetIdpUrl sets IdpUrl field to given value.

### HasIdpUrl

`func (o *SamlConfigurationProperties) HasIdpUrl() bool`

HasIdpUrl returns a boolean if a field has been set.

### GetIdpCertAlias

`func (o *SamlConfigurationProperties) GetIdpCertAlias() SamlConfigurationPropertyItemsString`

GetIdpCertAlias returns the IdpCertAlias field if non-nil, zero value otherwise.

### GetIdpCertAliasOk

`func (o *SamlConfigurationProperties) GetIdpCertAliasOk() (*SamlConfigurationPropertyItemsString, bool)`

GetIdpCertAliasOk returns a tuple with the IdpCertAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpCertAlias

`func (o *SamlConfigurationProperties) SetIdpCertAlias(v SamlConfigurationPropertyItemsString)`

SetIdpCertAlias sets IdpCertAlias field to given value.

### HasIdpCertAlias

`func (o *SamlConfigurationProperties) HasIdpCertAlias() bool`

HasIdpCertAlias returns a boolean if a field has been set.

### GetIdpHttpRedirect

`func (o *SamlConfigurationProperties) GetIdpHttpRedirect() SamlConfigurationPropertyItemsBoolean`

GetIdpHttpRedirect returns the IdpHttpRedirect field if non-nil, zero value otherwise.

### GetIdpHttpRedirectOk

`func (o *SamlConfigurationProperties) GetIdpHttpRedirectOk() (*SamlConfigurationPropertyItemsBoolean, bool)`

GetIdpHttpRedirectOk returns a tuple with the IdpHttpRedirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpHttpRedirect

`func (o *SamlConfigurationProperties) SetIdpHttpRedirect(v SamlConfigurationPropertyItemsBoolean)`

SetIdpHttpRedirect sets IdpHttpRedirect field to given value.

### HasIdpHttpRedirect

`func (o *SamlConfigurationProperties) HasIdpHttpRedirect() bool`

HasIdpHttpRedirect returns a boolean if a field has been set.

### GetServiceProviderEntityId

`func (o *SamlConfigurationProperties) GetServiceProviderEntityId() SamlConfigurationPropertyItemsString`

GetServiceProviderEntityId returns the ServiceProviderEntityId field if non-nil, zero value otherwise.

### GetServiceProviderEntityIdOk

`func (o *SamlConfigurationProperties) GetServiceProviderEntityIdOk() (*SamlConfigurationPropertyItemsString, bool)`

GetServiceProviderEntityIdOk returns a tuple with the ServiceProviderEntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceProviderEntityId

`func (o *SamlConfigurationProperties) SetServiceProviderEntityId(v SamlConfigurationPropertyItemsString)`

SetServiceProviderEntityId sets ServiceProviderEntityId field to given value.

### HasServiceProviderEntityId

`func (o *SamlConfigurationProperties) HasServiceProviderEntityId() bool`

HasServiceProviderEntityId returns a boolean if a field has been set.

### GetAssertionConsumerServiceURL

`func (o *SamlConfigurationProperties) GetAssertionConsumerServiceURL() SamlConfigurationPropertyItemsString`

GetAssertionConsumerServiceURL returns the AssertionConsumerServiceURL field if non-nil, zero value otherwise.

### GetAssertionConsumerServiceURLOk

`func (o *SamlConfigurationProperties) GetAssertionConsumerServiceURLOk() (*SamlConfigurationPropertyItemsString, bool)`

GetAssertionConsumerServiceURLOk returns a tuple with the AssertionConsumerServiceURL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssertionConsumerServiceURL

`func (o *SamlConfigurationProperties) SetAssertionConsumerServiceURL(v SamlConfigurationPropertyItemsString)`

SetAssertionConsumerServiceURL sets AssertionConsumerServiceURL field to given value.

### HasAssertionConsumerServiceURL

`func (o *SamlConfigurationProperties) HasAssertionConsumerServiceURL() bool`

HasAssertionConsumerServiceURL returns a boolean if a field has been set.

### GetSpPrivateKeyAlias

`func (o *SamlConfigurationProperties) GetSpPrivateKeyAlias() SamlConfigurationPropertyItemsString`

GetSpPrivateKeyAlias returns the SpPrivateKeyAlias field if non-nil, zero value otherwise.

### GetSpPrivateKeyAliasOk

`func (o *SamlConfigurationProperties) GetSpPrivateKeyAliasOk() (*SamlConfigurationPropertyItemsString, bool)`

GetSpPrivateKeyAliasOk returns a tuple with the SpPrivateKeyAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpPrivateKeyAlias

`func (o *SamlConfigurationProperties) SetSpPrivateKeyAlias(v SamlConfigurationPropertyItemsString)`

SetSpPrivateKeyAlias sets SpPrivateKeyAlias field to given value.

### HasSpPrivateKeyAlias

`func (o *SamlConfigurationProperties) HasSpPrivateKeyAlias() bool`

HasSpPrivateKeyAlias returns a boolean if a field has been set.

### GetKeyStorePassword

`func (o *SamlConfigurationProperties) GetKeyStorePassword() SamlConfigurationPropertyItemsString`

GetKeyStorePassword returns the KeyStorePassword field if non-nil, zero value otherwise.

### GetKeyStorePasswordOk

`func (o *SamlConfigurationProperties) GetKeyStorePasswordOk() (*SamlConfigurationPropertyItemsString, bool)`

GetKeyStorePasswordOk returns a tuple with the KeyStorePassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyStorePassword

`func (o *SamlConfigurationProperties) SetKeyStorePassword(v SamlConfigurationPropertyItemsString)`

SetKeyStorePassword sets KeyStorePassword field to given value.

### HasKeyStorePassword

`func (o *SamlConfigurationProperties) HasKeyStorePassword() bool`

HasKeyStorePassword returns a boolean if a field has been set.

### GetDefaultRedirectUrl

`func (o *SamlConfigurationProperties) GetDefaultRedirectUrl() SamlConfigurationPropertyItemsString`

GetDefaultRedirectUrl returns the DefaultRedirectUrl field if non-nil, zero value otherwise.

### GetDefaultRedirectUrlOk

`func (o *SamlConfigurationProperties) GetDefaultRedirectUrlOk() (*SamlConfigurationPropertyItemsString, bool)`

GetDefaultRedirectUrlOk returns a tuple with the DefaultRedirectUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultRedirectUrl

`func (o *SamlConfigurationProperties) SetDefaultRedirectUrl(v SamlConfigurationPropertyItemsString)`

SetDefaultRedirectUrl sets DefaultRedirectUrl field to given value.

### HasDefaultRedirectUrl

`func (o *SamlConfigurationProperties) HasDefaultRedirectUrl() bool`

HasDefaultRedirectUrl returns a boolean if a field has been set.

### GetUserIDAttribute

`func (o *SamlConfigurationProperties) GetUserIDAttribute() SamlConfigurationPropertyItemsString`

GetUserIDAttribute returns the UserIDAttribute field if non-nil, zero value otherwise.

### GetUserIDAttributeOk

`func (o *SamlConfigurationProperties) GetUserIDAttributeOk() (*SamlConfigurationPropertyItemsString, bool)`

GetUserIDAttributeOk returns a tuple with the UserIDAttribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserIDAttribute

`func (o *SamlConfigurationProperties) SetUserIDAttribute(v SamlConfigurationPropertyItemsString)`

SetUserIDAttribute sets UserIDAttribute field to given value.

### HasUserIDAttribute

`func (o *SamlConfigurationProperties) HasUserIDAttribute() bool`

HasUserIDAttribute returns a boolean if a field has been set.

### GetUseEncryption

`func (o *SamlConfigurationProperties) GetUseEncryption() SamlConfigurationPropertyItemsBoolean`

GetUseEncryption returns the UseEncryption field if non-nil, zero value otherwise.

### GetUseEncryptionOk

`func (o *SamlConfigurationProperties) GetUseEncryptionOk() (*SamlConfigurationPropertyItemsBoolean, bool)`

GetUseEncryptionOk returns a tuple with the UseEncryption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseEncryption

`func (o *SamlConfigurationProperties) SetUseEncryption(v SamlConfigurationPropertyItemsBoolean)`

SetUseEncryption sets UseEncryption field to given value.

### HasUseEncryption

`func (o *SamlConfigurationProperties) HasUseEncryption() bool`

HasUseEncryption returns a boolean if a field has been set.

### GetCreateUser

`func (o *SamlConfigurationProperties) GetCreateUser() SamlConfigurationPropertyItemsBoolean`

GetCreateUser returns the CreateUser field if non-nil, zero value otherwise.

### GetCreateUserOk

`func (o *SamlConfigurationProperties) GetCreateUserOk() (*SamlConfigurationPropertyItemsBoolean, bool)`

GetCreateUserOk returns a tuple with the CreateUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreateUser

`func (o *SamlConfigurationProperties) SetCreateUser(v SamlConfigurationPropertyItemsBoolean)`

SetCreateUser sets CreateUser field to given value.

### HasCreateUser

`func (o *SamlConfigurationProperties) HasCreateUser() bool`

HasCreateUser returns a boolean if a field has been set.

### GetAddGroupMemberships

`func (o *SamlConfigurationProperties) GetAddGroupMemberships() SamlConfigurationPropertyItemsBoolean`

GetAddGroupMemberships returns the AddGroupMemberships field if non-nil, zero value otherwise.

### GetAddGroupMembershipsOk

`func (o *SamlConfigurationProperties) GetAddGroupMembershipsOk() (*SamlConfigurationPropertyItemsBoolean, bool)`

GetAddGroupMembershipsOk returns a tuple with the AddGroupMemberships field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddGroupMemberships

`func (o *SamlConfigurationProperties) SetAddGroupMemberships(v SamlConfigurationPropertyItemsBoolean)`

SetAddGroupMemberships sets AddGroupMemberships field to given value.

### HasAddGroupMemberships

`func (o *SamlConfigurationProperties) HasAddGroupMemberships() bool`

HasAddGroupMemberships returns a boolean if a field has been set.

### GetGroupMembershipAttribute

`func (o *SamlConfigurationProperties) GetGroupMembershipAttribute() SamlConfigurationPropertyItemsString`

GetGroupMembershipAttribute returns the GroupMembershipAttribute field if non-nil, zero value otherwise.

### GetGroupMembershipAttributeOk

`func (o *SamlConfigurationProperties) GetGroupMembershipAttributeOk() (*SamlConfigurationPropertyItemsString, bool)`

GetGroupMembershipAttributeOk returns a tuple with the GroupMembershipAttribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupMembershipAttribute

`func (o *SamlConfigurationProperties) SetGroupMembershipAttribute(v SamlConfigurationPropertyItemsString)`

SetGroupMembershipAttribute sets GroupMembershipAttribute field to given value.

### HasGroupMembershipAttribute

`func (o *SamlConfigurationProperties) HasGroupMembershipAttribute() bool`

HasGroupMembershipAttribute returns a boolean if a field has been set.

### GetDefaultGroups

`func (o *SamlConfigurationProperties) GetDefaultGroups() SamlConfigurationPropertyItemsArray`

GetDefaultGroups returns the DefaultGroups field if non-nil, zero value otherwise.

### GetDefaultGroupsOk

`func (o *SamlConfigurationProperties) GetDefaultGroupsOk() (*SamlConfigurationPropertyItemsArray, bool)`

GetDefaultGroupsOk returns a tuple with the DefaultGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultGroups

`func (o *SamlConfigurationProperties) SetDefaultGroups(v SamlConfigurationPropertyItemsArray)`

SetDefaultGroups sets DefaultGroups field to given value.

### HasDefaultGroups

`func (o *SamlConfigurationProperties) HasDefaultGroups() bool`

HasDefaultGroups returns a boolean if a field has been set.

### GetNameIdFormat

`func (o *SamlConfigurationProperties) GetNameIdFormat() SamlConfigurationPropertyItemsString`

GetNameIdFormat returns the NameIdFormat field if non-nil, zero value otherwise.

### GetNameIdFormatOk

`func (o *SamlConfigurationProperties) GetNameIdFormatOk() (*SamlConfigurationPropertyItemsString, bool)`

GetNameIdFormatOk returns a tuple with the NameIdFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameIdFormat

`func (o *SamlConfigurationProperties) SetNameIdFormat(v SamlConfigurationPropertyItemsString)`

SetNameIdFormat sets NameIdFormat field to given value.

### HasNameIdFormat

`func (o *SamlConfigurationProperties) HasNameIdFormat() bool`

HasNameIdFormat returns a boolean if a field has been set.

### GetSynchronizeAttributes

`func (o *SamlConfigurationProperties) GetSynchronizeAttributes() SamlConfigurationPropertyItemsArray`

GetSynchronizeAttributes returns the SynchronizeAttributes field if non-nil, zero value otherwise.

### GetSynchronizeAttributesOk

`func (o *SamlConfigurationProperties) GetSynchronizeAttributesOk() (*SamlConfigurationPropertyItemsArray, bool)`

GetSynchronizeAttributesOk returns a tuple with the SynchronizeAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSynchronizeAttributes

`func (o *SamlConfigurationProperties) SetSynchronizeAttributes(v SamlConfigurationPropertyItemsArray)`

SetSynchronizeAttributes sets SynchronizeAttributes field to given value.

### HasSynchronizeAttributes

`func (o *SamlConfigurationProperties) HasSynchronizeAttributes() bool`

HasSynchronizeAttributes returns a boolean if a field has been set.

### GetHandleLogout

`func (o *SamlConfigurationProperties) GetHandleLogout() SamlConfigurationPropertyItemsBoolean`

GetHandleLogout returns the HandleLogout field if non-nil, zero value otherwise.

### GetHandleLogoutOk

`func (o *SamlConfigurationProperties) GetHandleLogoutOk() (*SamlConfigurationPropertyItemsBoolean, bool)`

GetHandleLogoutOk returns a tuple with the HandleLogout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHandleLogout

`func (o *SamlConfigurationProperties) SetHandleLogout(v SamlConfigurationPropertyItemsBoolean)`

SetHandleLogout sets HandleLogout field to given value.

### HasHandleLogout

`func (o *SamlConfigurationProperties) HasHandleLogout() bool`

HasHandleLogout returns a boolean if a field has been set.

### GetLogoutUrl

`func (o *SamlConfigurationProperties) GetLogoutUrl() SamlConfigurationPropertyItemsString`

GetLogoutUrl returns the LogoutUrl field if non-nil, zero value otherwise.

### GetLogoutUrlOk

`func (o *SamlConfigurationProperties) GetLogoutUrlOk() (*SamlConfigurationPropertyItemsString, bool)`

GetLogoutUrlOk returns a tuple with the LogoutUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogoutUrl

`func (o *SamlConfigurationProperties) SetLogoutUrl(v SamlConfigurationPropertyItemsString)`

SetLogoutUrl sets LogoutUrl field to given value.

### HasLogoutUrl

`func (o *SamlConfigurationProperties) HasLogoutUrl() bool`

HasLogoutUrl returns a boolean if a field has been set.

### GetClockTolerance

`func (o *SamlConfigurationProperties) GetClockTolerance() SamlConfigurationPropertyItemsLong`

GetClockTolerance returns the ClockTolerance field if non-nil, zero value otherwise.

### GetClockToleranceOk

`func (o *SamlConfigurationProperties) GetClockToleranceOk() (*SamlConfigurationPropertyItemsLong, bool)`

GetClockToleranceOk returns a tuple with the ClockTolerance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClockTolerance

`func (o *SamlConfigurationProperties) SetClockTolerance(v SamlConfigurationPropertyItemsLong)`

SetClockTolerance sets ClockTolerance field to given value.

### HasClockTolerance

`func (o *SamlConfigurationProperties) HasClockTolerance() bool`

HasClockTolerance returns a boolean if a field has been set.

### GetDigestMethod

`func (o *SamlConfigurationProperties) GetDigestMethod() SamlConfigurationPropertyItemsString`

GetDigestMethod returns the DigestMethod field if non-nil, zero value otherwise.

### GetDigestMethodOk

`func (o *SamlConfigurationProperties) GetDigestMethodOk() (*SamlConfigurationPropertyItemsString, bool)`

GetDigestMethodOk returns a tuple with the DigestMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDigestMethod

`func (o *SamlConfigurationProperties) SetDigestMethod(v SamlConfigurationPropertyItemsString)`

SetDigestMethod sets DigestMethod field to given value.

### HasDigestMethod

`func (o *SamlConfigurationProperties) HasDigestMethod() bool`

HasDigestMethod returns a boolean if a field has been set.

### GetSignatureMethod

`func (o *SamlConfigurationProperties) GetSignatureMethod() SamlConfigurationPropertyItemsString`

GetSignatureMethod returns the SignatureMethod field if non-nil, zero value otherwise.

### GetSignatureMethodOk

`func (o *SamlConfigurationProperties) GetSignatureMethodOk() (*SamlConfigurationPropertyItemsString, bool)`

GetSignatureMethodOk returns a tuple with the SignatureMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSignatureMethod

`func (o *SamlConfigurationProperties) SetSignatureMethod(v SamlConfigurationPropertyItemsString)`

SetSignatureMethod sets SignatureMethod field to given value.

### HasSignatureMethod

`func (o *SamlConfigurationProperties) HasSignatureMethod() bool`

HasSignatureMethod returns a boolean if a field has been set.

### GetUserIntermediatePath

`func (o *SamlConfigurationProperties) GetUserIntermediatePath() SamlConfigurationPropertyItemsString`

GetUserIntermediatePath returns the UserIntermediatePath field if non-nil, zero value otherwise.

### GetUserIntermediatePathOk

`func (o *SamlConfigurationProperties) GetUserIntermediatePathOk() (*SamlConfigurationPropertyItemsString, bool)`

GetUserIntermediatePathOk returns a tuple with the UserIntermediatePath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserIntermediatePath

`func (o *SamlConfigurationProperties) SetUserIntermediatePath(v SamlConfigurationPropertyItemsString)`

SetUserIntermediatePath sets UserIntermediatePath field to given value.

### HasUserIntermediatePath

`func (o *SamlConfigurationProperties) HasUserIntermediatePath() bool`

HasUserIntermediatePath returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


