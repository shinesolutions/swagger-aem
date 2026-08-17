package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeystoreInfo.
  * @param exists False if truststore don't exist
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T07:15:43.105475754Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeystoreInfo(
  aliases: Option[List[KeystoreItems]],
  exists: Option[Boolean]
)

object KeystoreInfo {
  implicit lazy val keystoreInfoJsonFormat: Format[KeystoreInfo] = Json.format[KeystoreInfo]
}

