package models

type InstallStatusStatus struct {

	Finished bool `json:"finished,omitempty"`

	ItemCount int32 `json:"itemCount,omitempty"`
}
