package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InstallStatus_status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InstallStatusStatus(
  finished: Option[Boolean],
  itemCount: Option[Int]
)

object InstallStatusStatus {
  implicit lazy val installStatusStatusJsonFormat: Format[InstallStatusStatus] = Json.format[InstallStatusStatus]
}

