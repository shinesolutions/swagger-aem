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

type InstallStatus struct {

	Status InstallStatusStatus `json:"status,omitempty"`
}

// AssertInstallStatusRequired checks if the required fields are not zero-ed
func AssertInstallStatusRequired(obj InstallStatus) error {
	if err := AssertInstallStatusStatusRequired(obj.Status); err != nil {
		return err
	}
	return nil
}

// AssertRecurseInstallStatusRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of InstallStatus (e.g. [][]InstallStatus), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseInstallStatusRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aInstallStatus, ok := obj.(InstallStatus)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertInstallStatusRequired(aInstallStatus)
	})
}
