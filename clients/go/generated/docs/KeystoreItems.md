# KeystoreItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alias** | Pointer to **string** | Keystore alias name | [optional] 
**EntryType** | Pointer to **string** | e.g. \&quot;privateKey\&quot; | [optional] 
**Algorithm** | Pointer to **string** | e.g. \&quot;RSA\&quot; | [optional] 
**Format** | Pointer to **string** | e.g. \&quot;PKCS#8\&quot; | [optional] 
**Chain** | Pointer to [**[]KeystoreChainItems**](KeystoreChainItems.md) |  | [optional] 

## Methods

### NewKeystoreItems

`func NewKeystoreItems() *KeystoreItems`

NewKeystoreItems instantiates a new KeystoreItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeystoreItemsWithDefaults

`func NewKeystoreItemsWithDefaults() *KeystoreItems`

NewKeystoreItemsWithDefaults instantiates a new KeystoreItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAlias

`func (o *KeystoreItems) GetAlias() string`

GetAlias returns the Alias field if non-nil, zero value otherwise.

### GetAliasOk

`func (o *KeystoreItems) GetAliasOk() (*string, bool)`

GetAliasOk returns a tuple with the Alias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlias

`func (o *KeystoreItems) SetAlias(v string)`

SetAlias sets Alias field to given value.

### HasAlias

`func (o *KeystoreItems) HasAlias() bool`

HasAlias returns a boolean if a field has been set.

### GetEntryType

`func (o *KeystoreItems) GetEntryType() string`

GetEntryType returns the EntryType field if non-nil, zero value otherwise.

### GetEntryTypeOk

`func (o *KeystoreItems) GetEntryTypeOk() (*string, bool)`

GetEntryTypeOk returns a tuple with the EntryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryType

`func (o *KeystoreItems) SetEntryType(v string)`

SetEntryType sets EntryType field to given value.

### HasEntryType

`func (o *KeystoreItems) HasEntryType() bool`

HasEntryType returns a boolean if a field has been set.

### GetAlgorithm

`func (o *KeystoreItems) GetAlgorithm() string`

GetAlgorithm returns the Algorithm field if non-nil, zero value otherwise.

### GetAlgorithmOk

`func (o *KeystoreItems) GetAlgorithmOk() (*string, bool)`

GetAlgorithmOk returns a tuple with the Algorithm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlgorithm

`func (o *KeystoreItems) SetAlgorithm(v string)`

SetAlgorithm sets Algorithm field to given value.

### HasAlgorithm

`func (o *KeystoreItems) HasAlgorithm() bool`

HasAlgorithm returns a boolean if a field has been set.

### GetFormat

`func (o *KeystoreItems) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *KeystoreItems) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *KeystoreItems) SetFormat(v string)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *KeystoreItems) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetChain

`func (o *KeystoreItems) GetChain() []KeystoreChainItems`

GetChain returns the Chain field if non-nil, zero value otherwise.

### GetChainOk

`func (o *KeystoreItems) GetChainOk() (*[]KeystoreChainItems, bool)`

GetChainOk returns a tuple with the Chain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChain

`func (o *KeystoreItems) SetChain(v []KeystoreChainItems)`

SetChain sets Chain field to given value.

### HasChain

`func (o *KeystoreItems) HasChain() bool`

HasChain returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


