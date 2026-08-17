package models

type KeystoreItems struct {

	// Keystore alias name
	Alias string `json:"alias,omitempty"`

	// e.g. \"privateKey\"
	EntryType string `json:"entryType,omitempty"`

	// e.g. \"RSA\"
	Algorithm string `json:"algorithm,omitempty"`

	// e.g. \"PKCS#8\"
	Format string `json:"format,omitempty"`

	Chain []KeystoreChainItems `json:"chain,omitempty"`
}
