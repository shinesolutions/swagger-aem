package models

type KeystoreInfo struct {

	Aliases []KeystoreItems `json:"aliases,omitempty"`

	// False if truststore don't exist
	Exists bool `json:"exists,omitempty"`
}
