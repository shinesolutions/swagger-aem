
# Table `SamlConfigurationInfo`
(mapped from: SamlConfigurationInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**pid** | pid | text |  | **kotlin.String** | Persistent Identity (PID) |  [optional]
**title** | title | text |  | **kotlin.String** | Title |  [optional]
**description** | description | text |  | **kotlin.String** | Title |  [optional]
**bundleLocation** | bundle_location | text |  | **kotlin.String** | needed for configuration binding |  [optional]
**serviceLocation** | service_location | text |  | **kotlin.String** | needed for configuraiton binding |  [optional]
**properties** | properties | long |  | [**SamlConfigurationProperties**](SamlConfigurationProperties.md) |  |  [optional] [foreignkey]








