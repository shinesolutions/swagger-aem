package models

type SamlConfigurationPropertyItemsBoolean struct {

	// property name
	Name string `json:"name,omitempty"`

	// True if optional
	Optional bool `json:"optional,omitempty"`

	// True if property is set
	IsSet bool `json:"is_set,omitempty"`

	// Property type, 1=String, 3=long, 11=boolean, 12=Password
	Type int32 `json:"type,omitempty"`

	// Property value
	Value bool `json:"value,omitempty"`

	// Property description
	Description string `json:"description,omitempty"`
}
