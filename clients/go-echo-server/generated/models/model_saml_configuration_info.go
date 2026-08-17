package models

type SamlConfigurationInfo struct {

	// Persistent Identity (PID)
	Pid string `json:"pid,omitempty"`

	// Title
	Title string `json:"title,omitempty"`

	// Title
	Description string `json:"description,omitempty"`

	// needed for configuration binding
	BundleLocation string `json:"bundle_location,omitempty"`

	// needed for configuraiton binding
	ServiceLocation string `json:"service_location,omitempty"`

	Properties SamlConfigurationProperties `json:"properties,omitempty"`
}
