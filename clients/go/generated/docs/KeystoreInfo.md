# KeystoreInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aliases** | Pointer to [**[]KeystoreItems**](KeystoreItems.md) |  | [optional] 
**Exists** | Pointer to **bool** | False if truststore don&#39;t exist | [optional] 

## Methods

### NewKeystoreInfo

`func NewKeystoreInfo() *KeystoreInfo`

NewKeystoreInfo instantiates a new KeystoreInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeystoreInfoWithDefaults

`func NewKeystoreInfoWithDefaults() *KeystoreInfo`

NewKeystoreInfoWithDefaults instantiates a new KeystoreInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAliases

`func (o *KeystoreInfo) GetAliases() []KeystoreItems`

GetAliases returns the Aliases field if non-nil, zero value otherwise.

### GetAliasesOk

`func (o *KeystoreInfo) GetAliasesOk() (*[]KeystoreItems, bool)`

GetAliasesOk returns a tuple with the Aliases field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAliases

`func (o *KeystoreInfo) SetAliases(v []KeystoreItems)`

SetAliases sets Aliases field to given value.

### HasAliases

`func (o *KeystoreInfo) HasAliases() bool`

HasAliases returns a boolean if a field has been set.

### GetExists

`func (o *KeystoreInfo) GetExists() bool`

GetExists returns the Exists field if non-nil, zero value otherwise.

### GetExistsOk

`func (o *KeystoreInfo) GetExistsOk() (*bool, bool)`

GetExistsOk returns a tuple with the Exists field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExists

`func (o *KeystoreInfo) SetExists(v bool)`

SetExists sets Exists field to given value.

### HasExists

`func (o *KeystoreInfo) HasExists() bool`

HasExists returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


