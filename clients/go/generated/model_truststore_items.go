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

// TruststoreItems struct for TruststoreItems
type TruststoreItems struct {
	// Truststore alias name
	Alias *string `json:"alias,omitempty"`
	EntryType *string `json:"entryType,omitempty"`
	// e.g. \"CN=localhost\"
	Subject *string `json:"subject,omitempty"`
	// e.g. \"CN=Admin\"
	Issuer *string `json:"issuer,omitempty"`
	// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
	NotBefore *string `json:"notBefore,omitempty"`
	// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
	NotAfter *string `json:"notAfter,omitempty"`
	// 18165099476682912368
	SerialNumber *int32 `json:"serialNumber,omitempty"`
}

// NewTruststoreItems instantiates a new TruststoreItems object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTruststoreItems() *TruststoreItems {
	this := TruststoreItems{}
	return &this
}

// NewTruststoreItemsWithDefaults instantiates a new TruststoreItems object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTruststoreItemsWithDefaults() *TruststoreItems {
	this := TruststoreItems{}
	return &this
}

// GetAlias returns the Alias field value if set, zero value otherwise.
func (o *TruststoreItems) GetAlias() string {
	if o == nil || o.Alias == nil {
		var ret string
		return ret
	}
	return *o.Alias
}

// GetAliasOk returns a tuple with the Alias field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreItems) GetAliasOk() (*string, bool) {
	if o == nil || o.Alias == nil {
		return nil, false
	}
	return o.Alias, true
}

// HasAlias returns a boolean if a field has been set.
func (o *TruststoreItems) HasAlias() bool {
	if o != nil && o.Alias != nil {
		return true
	}

	return false
}

// SetAlias gets a reference to the given string and assigns it to the Alias field.
func (o *TruststoreItems) SetAlias(v string) {
	o.Alias = &v
}

// GetEntryType returns the EntryType field value if set, zero value otherwise.
func (o *TruststoreItems) GetEntryType() string {
	if o == nil || o.EntryType == nil {
		var ret string
		return ret
	}
	return *o.EntryType
}

// GetEntryTypeOk returns a tuple with the EntryType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreItems) GetEntryTypeOk() (*string, bool) {
	if o == nil || o.EntryType == nil {
		return nil, false
	}
	return o.EntryType, true
}

// HasEntryType returns a boolean if a field has been set.
func (o *TruststoreItems) HasEntryType() bool {
	if o != nil && o.EntryType != nil {
		return true
	}

	return false
}

// SetEntryType gets a reference to the given string and assigns it to the EntryType field.
func (o *TruststoreItems) SetEntryType(v string) {
	o.EntryType = &v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *TruststoreItems) GetSubject() string {
	if o == nil || o.Subject == nil {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreItems) GetSubjectOk() (*string, bool) {
	if o == nil || o.Subject == nil {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *TruststoreItems) HasSubject() bool {
	if o != nil && o.Subject != nil {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *TruststoreItems) SetSubject(v string) {
	o.Subject = &v
}

// GetIssuer returns the Issuer field value if set, zero value otherwise.
func (o *TruststoreItems) GetIssuer() string {
	if o == nil || o.Issuer == nil {
		var ret string
		return ret
	}
	return *o.Issuer
}

// GetIssuerOk returns a tuple with the Issuer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreItems) GetIssuerOk() (*string, bool) {
	if o == nil || o.Issuer == nil {
		return nil, false
	}
	return o.Issuer, true
}

// HasIssuer returns a boolean if a field has been set.
func (o *TruststoreItems) HasIssuer() bool {
	if o != nil && o.Issuer != nil {
		return true
	}

	return false
}

// SetIssuer gets a reference to the given string and assigns it to the Issuer field.
func (o *TruststoreItems) SetIssuer(v string) {
	o.Issuer = &v
}

// GetNotBefore returns the NotBefore field value if set, zero value otherwise.
func (o *TruststoreItems) GetNotBefore() string {
	if o == nil || o.NotBefore == nil {
		var ret string
		return ret
	}
	return *o.NotBefore
}

// GetNotBeforeOk returns a tuple with the NotBefore field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreItems) GetNotBeforeOk() (*string, bool) {
	if o == nil || o.NotBefore == nil {
		return nil, false
	}
	return o.NotBefore, true
}

// HasNotBefore returns a boolean if a field has been set.
func (o *TruststoreItems) HasNotBefore() bool {
	if o != nil && o.NotBefore != nil {
		return true
	}

	return false
}

// SetNotBefore gets a reference to the given string and assigns it to the NotBefore field.
func (o *TruststoreItems) SetNotBefore(v string) {
	o.NotBefore = &v
}

// GetNotAfter returns the NotAfter field value if set, zero value otherwise.
func (o *TruststoreItems) GetNotAfter() string {
	if o == nil || o.NotAfter == nil {
		var ret string
		return ret
	}
	return *o.NotAfter
}

// GetNotAfterOk returns a tuple with the NotAfter field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreItems) GetNotAfterOk() (*string, bool) {
	if o == nil || o.NotAfter == nil {
		return nil, false
	}
	return o.NotAfter, true
}

// HasNotAfter returns a boolean if a field has been set.
func (o *TruststoreItems) HasNotAfter() bool {
	if o != nil && o.NotAfter != nil {
		return true
	}

	return false
}

// SetNotAfter gets a reference to the given string and assigns it to the NotAfter field.
func (o *TruststoreItems) SetNotAfter(v string) {
	o.NotAfter = &v
}

// GetSerialNumber returns the SerialNumber field value if set, zero value otherwise.
func (o *TruststoreItems) GetSerialNumber() int32 {
	if o == nil || o.SerialNumber == nil {
		var ret int32
		return ret
	}
	return *o.SerialNumber
}

// GetSerialNumberOk returns a tuple with the SerialNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreItems) GetSerialNumberOk() (*int32, bool) {
	if o == nil || o.SerialNumber == nil {
		return nil, false
	}
	return o.SerialNumber, true
}

// HasSerialNumber returns a boolean if a field has been set.
func (o *TruststoreItems) HasSerialNumber() bool {
	if o != nil && o.SerialNumber != nil {
		return true
	}

	return false
}

// SetSerialNumber gets a reference to the given int32 and assigns it to the SerialNumber field.
func (o *TruststoreItems) SetSerialNumber(v int32) {
	o.SerialNumber = &v
}

func (o TruststoreItems) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Alias != nil {
		toSerialize["alias"] = o.Alias
	}
	if o.EntryType != nil {
		toSerialize["entryType"] = o.EntryType
	}
	if o.Subject != nil {
		toSerialize["subject"] = o.Subject
	}
	if o.Issuer != nil {
		toSerialize["issuer"] = o.Issuer
	}
	if o.NotBefore != nil {
		toSerialize["notBefore"] = o.NotBefore
	}
	if o.NotAfter != nil {
		toSerialize["notAfter"] = o.NotAfter
	}
	if o.SerialNumber != nil {
		toSerialize["serialNumber"] = o.SerialNumber
	}
	return json.Marshal(toSerialize)
}

type NullableTruststoreItems struct {
	value *TruststoreItems
	isSet bool
}

func (v NullableTruststoreItems) Get() *TruststoreItems {
	return v.value
}

func (v *NullableTruststoreItems) Set(val *TruststoreItems) {
	v.value = val
	v.isSet = true
}

func (v NullableTruststoreItems) IsSet() bool {
	return v.isSet
}

func (v *NullableTruststoreItems) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTruststoreItems(val *TruststoreItems) *NullableTruststoreItems {
	return &NullableTruststoreItems{value: val, isSet: true}
}

func (v NullableTruststoreItems) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTruststoreItems) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


