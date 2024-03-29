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

// SamlConfigurationPropertyItemsString struct for SamlConfigurationPropertyItemsString
type SamlConfigurationPropertyItemsString struct {
	// property name
	Name *string `json:"name,omitempty"`
	// True if optional
	Optional *bool `json:"optional,omitempty"`
	// True if property is set
	IsSet *bool `json:"is_set,omitempty"`
	// Property type, 1=String, 3=long, 11=boolean, 12=Password
	Type *int32 `json:"type,omitempty"`
	// Property value
	Value *string `json:"value,omitempty"`
	// Property description
	Description *string `json:"description,omitempty"`
}

// NewSamlConfigurationPropertyItemsString instantiates a new SamlConfigurationPropertyItemsString object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSamlConfigurationPropertyItemsString() *SamlConfigurationPropertyItemsString {
	this := SamlConfigurationPropertyItemsString{}
	return &this
}

// NewSamlConfigurationPropertyItemsStringWithDefaults instantiates a new SamlConfigurationPropertyItemsString object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSamlConfigurationPropertyItemsStringWithDefaults() *SamlConfigurationPropertyItemsString {
	this := SamlConfigurationPropertyItemsString{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsString) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsString) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsString) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *SamlConfigurationPropertyItemsString) SetName(v string) {
	o.Name = &v
}

// GetOptional returns the Optional field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsString) GetOptional() bool {
	if o == nil || o.Optional == nil {
		var ret bool
		return ret
	}
	return *o.Optional
}

// GetOptionalOk returns a tuple with the Optional field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsString) GetOptionalOk() (*bool, bool) {
	if o == nil || o.Optional == nil {
		return nil, false
	}
	return o.Optional, true
}

// HasOptional returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsString) HasOptional() bool {
	if o != nil && o.Optional != nil {
		return true
	}

	return false
}

// SetOptional gets a reference to the given bool and assigns it to the Optional field.
func (o *SamlConfigurationPropertyItemsString) SetOptional(v bool) {
	o.Optional = &v
}

// GetIsSet returns the IsSet field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsString) GetIsSet() bool {
	if o == nil || o.IsSet == nil {
		var ret bool
		return ret
	}
	return *o.IsSet
}

// GetIsSetOk returns a tuple with the IsSet field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsString) GetIsSetOk() (*bool, bool) {
	if o == nil || o.IsSet == nil {
		return nil, false
	}
	return o.IsSet, true
}

// HasIsSet returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsString) HasIsSet() bool {
	if o != nil && o.IsSet != nil {
		return true
	}

	return false
}

// SetIsSet gets a reference to the given bool and assigns it to the IsSet field.
func (o *SamlConfigurationPropertyItemsString) SetIsSet(v bool) {
	o.IsSet = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsString) GetType() int32 {
	if o == nil || o.Type == nil {
		var ret int32
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsString) GetTypeOk() (*int32, bool) {
	if o == nil || o.Type == nil {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsString) HasType() bool {
	if o != nil && o.Type != nil {
		return true
	}

	return false
}

// SetType gets a reference to the given int32 and assigns it to the Type field.
func (o *SamlConfigurationPropertyItemsString) SetType(v int32) {
	o.Type = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsString) GetValue() string {
	if o == nil || o.Value == nil {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsString) GetValueOk() (*string, bool) {
	if o == nil || o.Value == nil {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsString) HasValue() bool {
	if o != nil && o.Value != nil {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *SamlConfigurationPropertyItemsString) SetValue(v string) {
	o.Value = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *SamlConfigurationPropertyItemsString) GetDescription() string {
	if o == nil || o.Description == nil {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SamlConfigurationPropertyItemsString) GetDescriptionOk() (*string, bool) {
	if o == nil || o.Description == nil {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *SamlConfigurationPropertyItemsString) HasDescription() bool {
	if o != nil && o.Description != nil {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *SamlConfigurationPropertyItemsString) SetDescription(v string) {
	o.Description = &v
}

func (o SamlConfigurationPropertyItemsString) MarshalJSON() ([]byte, error) {
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

type NullableSamlConfigurationPropertyItemsString struct {
	value *SamlConfigurationPropertyItemsString
	isSet bool
}

func (v NullableSamlConfigurationPropertyItemsString) Get() *SamlConfigurationPropertyItemsString {
	return v.value
}

func (v *NullableSamlConfigurationPropertyItemsString) Set(val *SamlConfigurationPropertyItemsString) {
	v.value = val
	v.isSet = true
}

func (v NullableSamlConfigurationPropertyItemsString) IsSet() bool {
	return v.isSet
}

func (v *NullableSamlConfigurationPropertyItemsString) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSamlConfigurationPropertyItemsString(val *SamlConfigurationPropertyItemsString) *NullableSamlConfigurationPropertyItemsString {
	return &NullableSamlConfigurationPropertyItemsString{value: val, isSet: true}
}

func (v NullableSamlConfigurationPropertyItemsString) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSamlConfigurationPropertyItemsString) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


