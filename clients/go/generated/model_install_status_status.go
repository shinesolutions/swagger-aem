/*
Adobe Experience Manager (AEM) API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

API version: 3.5.0-pre.0
Contact: opensource@shinesolutions.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// InstallStatusStatus struct for InstallStatusStatus
type InstallStatusStatus struct {
	Finished *bool `json:"finished,omitempty"`
	ItemCount *int32 `json:"itemCount,omitempty"`
}

// NewInstallStatusStatus instantiates a new InstallStatusStatus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInstallStatusStatus() *InstallStatusStatus {
	this := InstallStatusStatus{}
	return &this
}

// NewInstallStatusStatusWithDefaults instantiates a new InstallStatusStatus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInstallStatusStatusWithDefaults() *InstallStatusStatus {
	this := InstallStatusStatus{}
	return &this
}

// GetFinished returns the Finished field value if set, zero value otherwise.
func (o *InstallStatusStatus) GetFinished() bool {
	if o == nil || o.Finished == nil {
		var ret bool
		return ret
	}
	return *o.Finished
}

// GetFinishedOk returns a tuple with the Finished field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallStatusStatus) GetFinishedOk() (*bool, bool) {
	if o == nil || o.Finished == nil {
		return nil, false
	}
	return o.Finished, true
}

// HasFinished returns a boolean if a field has been set.
func (o *InstallStatusStatus) HasFinished() bool {
	if o != nil && o.Finished != nil {
		return true
	}

	return false
}

// SetFinished gets a reference to the given bool and assigns it to the Finished field.
func (o *InstallStatusStatus) SetFinished(v bool) {
	o.Finished = &v
}

// GetItemCount returns the ItemCount field value if set, zero value otherwise.
func (o *InstallStatusStatus) GetItemCount() int32 {
	if o == nil || o.ItemCount == nil {
		var ret int32
		return ret
	}
	return *o.ItemCount
}

// GetItemCountOk returns a tuple with the ItemCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallStatusStatus) GetItemCountOk() (*int32, bool) {
	if o == nil || o.ItemCount == nil {
		return nil, false
	}
	return o.ItemCount, true
}

// HasItemCount returns a boolean if a field has been set.
func (o *InstallStatusStatus) HasItemCount() bool {
	if o != nil && o.ItemCount != nil {
		return true
	}

	return false
}

// SetItemCount gets a reference to the given int32 and assigns it to the ItemCount field.
func (o *InstallStatusStatus) SetItemCount(v int32) {
	o.ItemCount = &v
}

func (o InstallStatusStatus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Finished != nil {
		toSerialize["finished"] = o.Finished
	}
	if o.ItemCount != nil {
		toSerialize["itemCount"] = o.ItemCount
	}
	return json.Marshal(toSerialize)
}

type NullableInstallStatusStatus struct {
	value *InstallStatusStatus
	isSet bool
}

func (v NullableInstallStatusStatus) Get() *InstallStatusStatus {
	return v.value
}

func (v *NullableInstallStatusStatus) Set(val *InstallStatusStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableInstallStatusStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableInstallStatusStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInstallStatusStatus(val *InstallStatusStatus) *NullableInstallStatusStatus {
	return &NullableInstallStatusStatus{value: val, isSet: true}
}

func (v NullableInstallStatusStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInstallStatusStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


