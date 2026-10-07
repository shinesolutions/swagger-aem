package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SamlConfigurationInfo.
  * @param pid Persistent Identity (PID)
  * @param title Title
  * @param description Title
  * @param bundleLocation needed for configuration binding
  * @param serviceLocation needed for configuraiton binding
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T01:24:15.341341283Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SamlConfigurationInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  bundleLocation: Option[String],
  serviceLocation: Option[String],
  properties: Option[SamlConfigurationProperties]
)

object SamlConfigurationInfo {
  implicit lazy val samlConfigurationInfoJsonFormat: Format[SamlConfigurationInfo] = Json.format[SamlConfigurationInfo]
}

