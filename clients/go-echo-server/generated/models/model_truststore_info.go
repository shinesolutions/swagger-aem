package models

type TruststoreInfo struct {

	Aliases []TruststoreItems `json:"aliases,omitempty"`

	// False if truststore don't exist
	Exists bool `json:"exists,omitempty"`
}
