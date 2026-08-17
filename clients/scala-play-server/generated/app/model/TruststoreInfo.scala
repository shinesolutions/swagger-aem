package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TruststoreInfo.
  * @param exists False if truststore don't exist
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T07:15:43.105475754Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TruststoreInfo(
  aliases: Option[List[TruststoreItems]],
  exists: Option[Boolean]
)

object TruststoreInfo {
  implicit lazy val truststoreInfoJsonFormat: Format[TruststoreInfo] = Json.format[TruststoreInfo]
}

