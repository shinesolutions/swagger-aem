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

// SamlConfigurationPropertyItemsLong struct for SamlConfigurationPropertyItemsLong
type SamlConfigurationPropertyItemsLong struct {
	// property name
	Name *string `json:"name,omitempty"`
	// True if optional
	Optional *bool `json:"optional,omitempty"`
	// True if property is set
	IsSet *bool `json:"is_set,omitempty"`
	// Property type, 1=String, 3=long, 11=boolean, 12=Password
	Type *int32 `json:"type,omitempty"`
	// Property value
	Value *int32 `json:"value,omitempty"`
	// Property description
	Description *string `json:"description,omitempty"`
}

// NewSamlConfigurationPropertyItemsLong instantiates a new SamlConfigurationPropertyItemsLong object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSamlConfigurationPropertyItemsLong() *SamlConfigurationPropertyItemsLong {
	this := SamlConfigurationPropertyItemsLong{}
	return &this
}

// NewSamlConfigurationPropertyItemsLongWithDefaults instantiates a new SamlConfigurationPropertyItemsLong object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSamlConfigurationPropertyItemsLongWithDefaults() *SamlConfigurationPropertyItemsLong {
	this := SamlConfigurationPropertyItemsLong{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsLong) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsLong) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsLong) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *SamlConfigurationPropertyItemsLong) SetName(v string) {
	o.Name = &v
}

// GetOptional returns the Optional field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsLong) GetOptional() bool {
	if o == nil || o.Optional == nil {
		var ret bool
		return ret
	}
	return *o.Optional
}

// GetOptionalOk returns a tuple with the Optional field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsLong) GetOptionalOk() (*bool, bool) {
	if o == nil || o.Optional == nil {
		return nil, false
	}
	return o.Optional, true
}

// HasOptional returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsLong) HasOptional() bool {
	if o != nil && o.Optional != nil {
		return true
	}

	return false
}

// SetOptional gets a reference to the given bool and assigns it to the Optional field.
func (o *SamlConfigurationPropertyItemsLong) SetOptional(v bool) {
	o.Optional = &v
}

// GetIsSet returns the IsSet field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsLong) GetIsSet() bool {
	if o == nil || o.IsSet == nil {
		var ret bool
		return ret
	}
	return *o.IsSet
}

// GetIsSetOk returns a tuple with the IsSet field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsLong) GetIsSetOk() (*bool, bool) {
	if o == nil || o.IsSet == nil {
		return nil, false
	}
	return o.IsSet, true
}

// HasIsSet returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsLong) HasIsSet() bool {
	if o != nil && o.IsSet != nil {
		return true
	}

	return false
}

// SetIsSet gets a reference to the given bool and assigns it to the IsSet field.
func (o *SamlConfigurationPropertyItemsLong) SetIsSet(v bool) {
	o.IsSet = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsLong) GetType() int32 {
	if o == nil || o.Type == nil {
		var ret int32
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsLong) GetTypeOk() (*int32, bool) {
	if o == nil || o.Type == nil {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsLong) HasType() bool {
	if o != nil && o.Type != nil {
		return true
	}

	return false
}

// SetType gets a reference to the given int32 and assigns it to the Type field.
func (o *SamlConfigurationPropertyItemsLong) SetType(v int32) {
	o.Type = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsLong) GetValue() int32 {
	if o == nil || o.Value == nil {
		var ret int32
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsLong) GetValueOk() (*int32, bool) {
	if o == nil || o.Value == nil {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsLong) HasValue() bool {
	if o != nil && o.Value != nil {
		return true
	}

	return false
}

// SetValue gets a reference to the given int32 and assigns it to the Value field.
func (o *SamlConfigurationPropertyItemsLong) SetValue(v int32) {
	o.Value = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsLong) GetDescription() string {
	if o == nil || o.Description == nil {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsLong) GetDescriptionOk() (*string, bool) {
	if o == nil || o.Description == nil {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsLong) HasDescription() bool {
	if o != nil && o.Description != nil {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *SamlConfigurationPropertyItemsLong) SetDescription(v string) {
	o.Description = &v
}

func (o SamlConfigurationPropertyItemsLong) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.Optional != nil {
		toSerialize["optional"] = o.Optional
	}
	if o.IsSet != nil {
		toSerialize["is_set"] = o.IsSet
	}
	if o.Type != nil {
		toSerialize["type"] = o.Type
	}
	if o.Value != nil {
		toSerialize["value"] = o.Value
	}
	if o.Description != nil {
		toSerialize["description"] = o.Description
	}
	return json.Marshal(toSerialize)
}

type NullableSamlConfigurationPropertyItemsLong struct {
	value *SamlConfigurationPropertyItemsLong
	isSet bool
}

func (v NullableSamlConfigurationPropertyItemsLong) Get() *SamlConfigurationPropertyItemsLong {
	return v.value
}

func (v *NullableSamlConfigurationPropertyItemsLong) Set(val *SamlConfigurationPropertyItemsLong) {
	v.value = val
	v.isSet = true
}

func (v NullableSamlConfigurationPropertyItemsLong) IsSet() bool {
	return v.isSet
}

func (v *NullableSamlConfigurationPropertyItemsLong) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSamlConfigurationPropertyItemsLong(val *SamlConfigurationPropertyItemsLong) *NullableSamlConfigurationPropertyItemsLong {
	return &NullableSamlConfigurationPropertyItemsLong{value: val, isSet: true}
}

func (v NullableSamlConfigurationPropertyItemsLong) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSamlConfigurationPropertyItemsLong) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


