# BundleInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to **string** | Status description of all bundles | [optional] 
**S** | Pointer to **[]int32** |  | [optional] 
**Data** | Pointer to [**[]BundleData**](BundleData.md) |  | [optional] 

## Methods

### NewBundleInfo

`func NewBundleInfo() *BundleInfo`

NewBundleInfo instantiates a new BundleInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBundleInfoWithDefaults

`func NewBundleInfoWithDefaults() *BundleInfo`

NewBundleInfoWithDefaults instantiates a new BundleInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *BundleInfo) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *BundleInfo) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *BundleInfo) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *BundleInfo) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetS

`func (o *BundleInfo) GetS() []int32`

GetS returns the S field if non-nil, zero value otherwise.

### GetSOk

`func (o *BundleInfo) GetSOk() (*[]int32, bool)`

GetSOk returns a tuple with the S field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetS

`func (o *BundleInfo) SetS(v []int32)`

SetS sets S field to given value.

### HasS

`func (o *BundleInfo) HasS() bool`

HasS returns a boolean if a field has been set.

### GetData

`func (o *BundleInfo) GetData() []BundleData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *BundleInfo) GetDataOk() (*[]BundleData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *BundleInfo) SetData(v []BundleData)`

SetData sets Data field to given value.

### HasData

`func (o *BundleInfo) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


