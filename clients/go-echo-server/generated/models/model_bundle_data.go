package models

type BundleData struct {

	// Bundle ID
	Id int32 `json:"id,omitempty"`

	// Bundle name
	Name string `json:"name,omitempty"`

	// Is bundle a fragment
	Fragment bool `json:"fragment,omitempty"`

	// Numeric raw bundle state value
	StateRaw int32 `json:"stateRaw,omitempty"`

	// Bundle state value
	State string `json:"state,omitempty"`

	// Bundle version
	Version string `json:"version,omitempty"`

	// Bundle symbolic name
	SymbolicName string `json:"symbolicName,omitempty"`

	// Bundle category
	Category string `json:"category,omitempty"`

	Props []BundleDataProp `json:"props,omitempty"`
}
