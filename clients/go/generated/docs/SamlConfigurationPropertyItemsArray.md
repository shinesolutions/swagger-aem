# SamlConfigurationPropertyItemsArray

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | property name | [optional] 
**Optional** | Pointer to **bool** | True if optional | [optional] 
**IsSet** | Pointer to **bool** | True if property is set | [optional] 
**Type** | Pointer to **int32** | Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password | [optional] 
**Values** | Pointer to **[]string** | Property value | [optional] 
**Description** | Pointer to **string** | Property description | [optional] 

## Methods

### NewSamlConfigurationPropertyItemsArray

`func NewSamlConfigurationPropertyItemsArray() *SamlConfigurationPropertyItemsArray`

NewSamlConfigurationPropertyItemsArray instantiates a new SamlConfigurationPropertyItemsArray object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSamlConfigurationPropertyItemsArrayWithDefaults

`func NewSamlConfigurationPropertyItemsArrayWithDefaults() *SamlConfigurationPropertyItemsArray`

NewSamlConfigurationPropertyItemsArrayWithDefaults instantiates a new SamlConfigurationPropertyItemsArray object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *SamlConfigurationPropertyItemsArray) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *SamlConfigurationPropertyItemsArray) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *SamlConfigurationPropertyItemsArray) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *SamlConfigurationPropertyItemsArray) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptional

`func (o *SamlConfigurationPropertyItemsArray) GetOptional() bool`

GetOptional returns the Optional field if non-nil, zero value otherwise.

### GetOptionalOk

`func (o *SamlConfigurationPropertyItemsArray) GetOptionalOk() (*bool, bool)`

GetOptionalOk returns a tuple with the Optional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptional

`func (o *SamlConfigurationPropertyItemsArray) SetOptional(v bool)`

SetOptional sets Optional field to given value.

### HasOptional

`func (o *SamlConfigurationPropertyItemsArray) HasOptional() bool`

HasOptional returns a boolean if a field has been set.

### GetIsSet

`func (o *SamlConfigurationPropertyItemsArray) GetIsSet() bool`

GetIsSet returns the IsSet field if non-nil, zero value otherwise.

### GetIsSetOk

`func (o *SamlConfigurationPropertyItemsArray) GetIsSetOk() (*bool, bool)`

GetIsSetOk returns a tuple with the IsSet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSet

`func (o *SamlConfigurationPropertyItemsArray) SetIsSet(v bool)`

SetIsSet sets IsSet field to given value.

### HasIsSet

`func (o *SamlConfigurationPropertyItemsArray) HasIsSet() bool`

HasIsSet returns a boolean if a field has been set.

### GetType

`func (o *SamlConfigurationPropertyItemsArray) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *SamlConfigurationPropertyItemsArray) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *SamlConfigurationPropertyItemsArray) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *SamlConfigurationPropertyItemsArray) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValues

`func (o *SamlConfigurationPropertyItemsArray) GetValues() []string`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *SamlConfigurationPropertyItemsArray) GetValuesOk() (*[]string, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *SamlConfigurationPropertyItemsArray) SetValues(v []string)`

SetValues sets Values field to given value.

### HasValues

`func (o *SamlConfigurationPropertyItemsArray) HasValues() bool`

HasValues returns a boolean if a field has been set.

### GetDescription

`func (o *SamlConfigurationPropertyItemsArray) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *SamlConfigurationPropertyItemsArray) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *SamlConfigurationPropertyItemsArray) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *SamlConfigurationPropertyItemsArray) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


