# SamlConfigurationInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pid** | Pointer to **string** | Persistent Identity (PID) | [optional] 
**Title** | Pointer to **string** | Title | [optional] 
**Description** | Pointer to **string** | Title | [optional] 
**BundleLocation** | Pointer to **string** | needed for configuration binding | [optional] 
**ServiceLocation** | Pointer to **string** | needed for configuraiton binding | [optional] 
**Properties** | Pointer to [**SamlConfigurationProperties**](SamlConfigurationProperties.md) |  | [optional] 

## Methods

### NewSamlConfigurationInfo

`func NewSamlConfigurationInfo() *SamlConfigurationInfo`

NewSamlConfigurationInfo instantiates a new SamlConfigurationInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSamlConfigurationInfoWithDefaults

`func NewSamlConfigurationInfoWithDefaults() *SamlConfigurationInfo`

NewSamlConfigurationInfoWithDefaults instantiates a new SamlConfigurationInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPid

`func (o *SamlConfigurationInfo) GetPid() string`

GetPid returns the Pid field if non-nil, zero value otherwise.

### GetPidOk

`func (o *SamlConfigurationInfo) GetPidOk() (*string, bool)`

GetPidOk returns a tuple with the Pid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPid

`func (o *SamlConfigurationInfo) SetPid(v string)`

SetPid sets Pid field to given value.

### HasPid

`func (o *SamlConfigurationInfo) HasPid() bool`

HasPid returns a boolean if a field has been set.

### GetTitle

`func (o *SamlConfigurationInfo) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *SamlConfigurationInfo) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *SamlConfigurationInfo) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *SamlConfigurationInfo) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDescription

`func (o *SamlConfigurationInfo) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *SamlConfigurationInfo) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *SamlConfigurationInfo) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *SamlConfigurationInfo) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetBundleLocation

`func (o *SamlConfigurationInfo) GetBundleLocation() string`

GetBundleLocation returns the BundleLocation field if non-nil, zero value otherwise.

### GetBundleLocationOk

`func (o *SamlConfigurationInfo) GetBundleLocationOk() (*string, bool)`

GetBundleLocationOk returns a tuple with the BundleLocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBundleLocation

`func (o *SamlConfigurationInfo) SetBundleLocation(v string)`

SetBundleLocation sets BundleLocation field to given value.

### HasBundleLocation

`func (o *SamlConfigurationInfo) HasBundleLocation() bool`

HasBundleLocation returns a boolean if a field has been set.

### GetServiceLocation

`func (o *SamlConfigurationInfo) GetServiceLocation() string`

GetServiceLocation returns the ServiceLocation field if non-nil, zero value otherwise.

### GetServiceLocationOk

`func (o *SamlConfigurationInfo) GetServiceLocationOk() (*string, bool)`

GetServiceLocationOk returns a tuple with the ServiceLocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceLocation

`func (o *SamlConfigurationInfo) SetServiceLocation(v string)`

SetServiceLocation sets ServiceLocation field to given value.

### HasServiceLocation

`func (o *SamlConfigurationInfo) HasServiceLocation() bool`

HasServiceLocation returns a boolean if a field has been set.

### GetProperties

`func (o *SamlConfigurationInfo) GetProperties() SamlConfigurationProperties`

GetProperties returns the Properties field if non-nil, zero value otherwise.

### GetPropertiesOk

`func (o *SamlConfigurationInfo) GetPropertiesOk() (*SamlConfigurationProperties, bool)`

GetPropertiesOk returns a tuple with the Properties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProperties

`func (o *SamlConfigurationInfo) SetProperties(v SamlConfigurationProperties)`

SetProperties sets Properties field to given value.

### HasProperties

`func (o *SamlConfigurationInfo) HasProperties() bool`

HasProperties returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


