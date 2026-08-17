package models

type BundleInfo struct {

	// Status description of all bundles
	Status string `json:"status,omitempty"`

	S []int32 `json:"s,omitempty"`

	Data []BundleData `json:"data,omitempty"`
}
