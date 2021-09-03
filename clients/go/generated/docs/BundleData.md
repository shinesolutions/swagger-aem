# BundleData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | Bundle ID | [optional] 
**Name** | Pointer to **string** | Bundle name | [optional] 
**Fragment** | Pointer to **bool** | Is bundle a fragment | [optional] 
**StateRaw** | Pointer to **int32** | Numeric raw bundle state value | [optional] 
**State** | Pointer to **string** | Bundle state value | [optional] 
**Version** | Pointer to **string** | Bundle version | [optional] 
**SymbolicName** | Pointer to **string** | Bundle symbolic name | [optional] 
**Category** | Pointer to **string** | Bundle category | [optional] 
**Props** | Pointer to [**[]BundleDataProp**](BundleDataProp.md) |  | [optional] 

## Methods

### NewBundleData

`func NewBundleData() *BundleData`

NewBundleData instantiates a new BundleData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBundleDataWithDefaults

`func NewBundleDataWithDefaults() *BundleData`

NewBundleDataWithDefaults instantiates a new BundleData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BundleData) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BundleData) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BundleData) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *BundleData) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *BundleData) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BundleData) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BundleData) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BundleData) HasName() bool`

HasName returns a boolean if a field has been set.

### GetFragment

`func (o *BundleData) GetFragment() bool`

GetFragment returns the Fragment field if non-nil, zero value otherwise.

### GetFragmentOk

`func (o *BundleData) GetFragmentOk() (*bool, bool)`

GetFragmentOk returns a tuple with the Fragment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFragment

`func (o *BundleData) SetFragment(v bool)`

SetFragment sets Fragment field to given value.

### HasFragment

`func (o *BundleData) HasFragment() bool`

HasFragment returns a boolean if a field has been set.

### GetStateRaw

`func (o *BundleData) GetStateRaw() int32`

GetStateRaw returns the StateRaw field if non-nil, zero value otherwise.

### GetStateRawOk

`func (o *BundleData) GetStateRawOk() (*int32, bool)`

GetStateRawOk returns a tuple with the StateRaw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateRaw

`func (o *BundleData) SetStateRaw(v int32)`

SetStateRaw sets StateRaw field to given value.

### HasStateRaw

`func (o *BundleData) HasStateRaw() bool`

HasStateRaw returns a boolean if a field has been set.

### GetState

`func (o *BundleData) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *BundleData) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *BundleData) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *BundleData) HasState() bool`

HasState returns a boolean if a field has been set.

### GetVersion

`func (o *BundleData) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *BundleData) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *BundleData) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *BundleData) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetSymbolicName

`func (o *BundleData) GetSymbolicName() string`

GetSymbolicName returns the SymbolicName field if non-nil, zero value otherwise.

### GetSymbolicNameOk

`func (o *BundleData) GetSymbolicNameOk() (*string, bool)`

GetSymbolicNameOk returns a tuple with the SymbolicName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbolicName

`func (o *BundleData) SetSymbolicName(v string)`

SetSymbolicName sets SymbolicName field to given value.

### HasSymbolicName

`func (o *BundleData) HasSymbolicName() bool`

HasSymbolicName returns a boolean if a field has been set.

### GetCategory

`func (o *BundleData) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *BundleData) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *BundleData) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *BundleData) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetProps

`func (o *BundleData) GetProps() []BundleDataProp`

GetProps returns the Props field if non-nil, zero value otherwise.

### GetPropsOk

`func (o *BundleData) GetPropsOk() (*[]BundleDataProp, bool)`

GetPropsOk returns a tuple with the Props field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProps

`func (o *BundleData) SetProps(v []BundleDataProp)`

SetProps sets Props field to given value.

### HasProps

`func (o *BundleData) HasProps() bool`

HasProps returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


