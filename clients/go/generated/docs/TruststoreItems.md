# TruststoreItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alias** | Pointer to **string** | Truststore alias name | [optional] 
**EntryType** | Pointer to **string** |  | [optional] 
**Subject** | Pointer to **string** | e.g. \&quot;CN&#x3D;localhost\&quot; | [optional] 
**Issuer** | Pointer to **string** | e.g. \&quot;CN&#x3D;Admin\&quot; | [optional] 
**NotBefore** | Pointer to **string** | e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot; | [optional] 
**NotAfter** | Pointer to **string** | e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot; | [optional] 
**SerialNumber** | Pointer to **int32** | 18165099476682912368 | [optional] 

## Methods

### NewTruststoreItems

`func NewTruststoreItems() *TruststoreItems`

NewTruststoreItems instantiates a new TruststoreItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTruststoreItemsWithDefaults

`func NewTruststoreItemsWithDefaults() *TruststoreItems`

NewTruststoreItemsWithDefaults instantiates a new TruststoreItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAlias

`func (o *TruststoreItems) GetAlias() string`

GetAlias returns the Alias field if non-nil, zero value otherwise.

### GetAliasOk

`func (o *TruststoreItems) GetAliasOk() (*string, bool)`

GetAliasOk returns a tuple with the Alias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlias

`func (o *TruststoreItems) SetAlias(v string)`

SetAlias sets Alias field to given value.

### HasAlias

`func (o *TruststoreItems) HasAlias() bool`

HasAlias returns a boolean if a field has been set.

### GetEntryType

`func (o *TruststoreItems) GetEntryType() string`

GetEntryType returns the EntryType field if non-nil, zero value otherwise.

### GetEntryTypeOk

`func (o *TruststoreItems) GetEntryTypeOk() (*string, bool)`

GetEntryTypeOk returns a tuple with the EntryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryType

`func (o *TruststoreItems) SetEntryType(v string)`

SetEntryType sets EntryType field to given value.

### HasEntryType

`func (o *TruststoreItems) HasEntryType() bool`

HasEntryType returns a boolean if a field has been set.

### GetSubject

`func (o *TruststoreItems) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *TruststoreItems) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *TruststoreItems) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *TruststoreItems) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetIssuer

`func (o *TruststoreItems) GetIssuer() string`

GetIssuer returns the Issuer field if non-nil, zero value otherwise.

### GetIssuerOk

`func (o *TruststoreItems) GetIssuerOk() (*string, bool)`

GetIssuerOk returns a tuple with the Issuer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuer

`func (o *TruststoreItems) SetIssuer(v string)`

SetIssuer sets Issuer field to given value.

### HasIssuer

`func (o *TruststoreItems) HasIssuer() bool`

HasIssuer returns a boolean if a field has been set.

### GetNotBefore

`func (o *TruststoreItems) GetNotBefore() string`

GetNotBefore returns the NotBefore field if non-nil, zero value otherwise.

### GetNotBeforeOk

`func (o *TruststoreItems) GetNotBeforeOk() (*string, bool)`

GetNotBeforeOk returns a tuple with the NotBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotBefore

`func (o *TruststoreItems) SetNotBefore(v string)`

SetNotBefore sets NotBefore field to given value.

### HasNotBefore

`func (o *TruststoreItems) HasNotBefore() bool`

HasNotBefore returns a boolean if a field has been set.

### GetNotAfter

`func (o *TruststoreItems) GetNotAfter() string`

GetNotAfter returns the NotAfter field if non-nil, zero value otherwise.

### GetNotAfterOk

`func (o *TruststoreItems) GetNotAfterOk() (*string, bool)`

GetNotAfterOk returns a tuple with the NotAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotAfter

`func (o *TruststoreItems) SetNotAfter(v string)`

SetNotAfter sets NotAfter field to given value.

### HasNotAfter

`func (o *TruststoreItems) HasNotAfter() bool`

HasNotAfter returns a boolean if a field has been set.

### GetSerialNumber

`func (o *TruststoreItems) GetSerialNumber() int32`

GetSerialNumber returns the SerialNumber field if non-nil, zero value otherwise.

### GetSerialNumberOk

`func (o *TruststoreItems) GetSerialNumberOk() (*int32, bool)`

GetSerialNumberOk returns a tuple with the SerialNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSerialNumber

`func (o *TruststoreItems) SetSerialNumber(v int32)`

SetSerialNumber sets SerialNumber field to given value.

### HasSerialNumber

`func (o *TruststoreItems) HasSerialNumber() bool`

HasSerialNumber returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


