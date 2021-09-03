# KeystoreChainItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Subject** | Pointer to **string** | e.g. \&quot;CN&#x3D;localhost\&quot; | [optional] 
**Issuer** | Pointer to **string** | e.g. \&quot;CN&#x3D;Admin\&quot; | [optional] 
**NotBefore** | Pointer to **string** | e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot; | [optional] 
**NotAfter** | Pointer to **string** | e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot; | [optional] 
**SerialNumber** | Pointer to **int32** | 18165099476682912368 | [optional] 

## Methods

### NewKeystoreChainItems

`func NewKeystoreChainItems() *KeystoreChainItems`

NewKeystoreChainItems instantiates a new KeystoreChainItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeystoreChainItemsWithDefaults

`func NewKeystoreChainItemsWithDefaults() *KeystoreChainItems`

NewKeystoreChainItemsWithDefaults instantiates a new KeystoreChainItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubject

`func (o *KeystoreChainItems) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *KeystoreChainItems) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *KeystoreChainItems) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *KeystoreChainItems) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetIssuer

`func (o *KeystoreChainItems) GetIssuer() string`

GetIssuer returns the Issuer field if non-nil, zero value otherwise.

### GetIssuerOk

`func (o *KeystoreChainItems) GetIssuerOk() (*string, bool)`

GetIssuerOk returns a tuple with the Issuer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuer

`func (o *KeystoreChainItems) SetIssuer(v string)`

SetIssuer sets Issuer field to given value.

### HasIssuer

`func (o *KeystoreChainItems) HasIssuer() bool`

HasIssuer returns a boolean if a field has been set.

### GetNotBefore

`func (o *KeystoreChainItems) GetNotBefore() string`

GetNotBefore returns the NotBefore field if non-nil, zero value otherwise.

### GetNotBeforeOk

`func (o *KeystoreChainItems) GetNotBeforeOk() (*string, bool)`

GetNotBeforeOk returns a tuple with the NotBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotBefore

`func (o *KeystoreChainItems) SetNotBefore(v string)`

SetNotBefore sets NotBefore field to given value.

### HasNotBefore

`func (o *KeystoreChainItems) HasNotBefore() bool`

HasNotBefore returns a boolean if a field has been set.

### GetNotAfter

`func (o *KeystoreChainItems) GetNotAfter() string`

GetNotAfter returns the NotAfter field if non-nil, zero value otherwise.

### GetNotAfterOk

`func (o *KeystoreChainItems) GetNotAfterOk() (*string, bool)`

GetNotAfterOk returns a tuple with the NotAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotAfter

`func (o *KeystoreChainItems) SetNotAfter(v string)`

SetNotAfter sets NotAfter field to given value.

### HasNotAfter

`func (o *KeystoreChainItems) HasNotAfter() bool`

HasNotAfter returns a boolean if a field has been set.

### GetSerialNumber

`func (o *KeystoreChainItems) GetSerialNumber() int32`

GetSerialNumber returns the SerialNumber field if non-nil, zero value otherwise.

### GetSerialNumberOk

`func (o *KeystoreChainItems) GetSerialNumberOk() (*int32, bool)`

GetSerialNumberOk returns a tuple with the SerialNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSerialNumber

`func (o *KeystoreChainItems) SetSerialNumber(v int32)`

SetSerialNumber sets SerialNumber field to given value.

### HasSerialNumber

`func (o *KeystoreChainItems) HasSerialNumber() bool`

HasSerialNumber returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


