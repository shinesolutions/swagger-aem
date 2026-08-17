package models

type KeystoreChainItems struct {

	// e.g. \"CN=localhost\"
	Subject string `json:"subject,omitempty"`

	// e.g. \"CN=Admin\"
	Issuer string `json:"issuer,omitempty"`

	// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
	NotBefore string `json:"notBefore,omitempty"`

	// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
	NotAfter string `json:"notAfter,omitempty"`

	// 18165099476682912368
	SerialNumber int32 `json:"serialNumber,omitempty"`
}
