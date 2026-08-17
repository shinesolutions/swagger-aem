package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InstallStatus.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T07:15:43.105475754Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InstallStatus(
  status: Option[InstallStatusStatus]
)

object InstallStatus {
  implicit lazy val installStatusJsonFormat: Format[InstallStatus] = Json.format[InstallStatus]
}

