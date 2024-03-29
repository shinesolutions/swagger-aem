/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * API version: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type TruststoreItems struct {

	// Truststore alias name
	Alias string `json:"alias,omitempty"`

	EntryType string `json:"entryType,omitempty"`

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

// AssertTruststoreItemsRequired checks if the required fields are not zero-ed
func AssertTruststoreItemsRequired(obj TruststoreItems) error {
	return nil
}

// AssertRecurseTruststoreItemsRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of TruststoreItems (e.g. [][]TruststoreItems), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseTruststoreItemsRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aTruststoreItems, ok := obj.(TruststoreItems)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertTruststoreItemsRequired(aTruststoreItems)
	})
}
