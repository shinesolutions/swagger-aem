package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TruststoreItems.
  * @param alias Truststore alias name
  * @param subject e.g. \"CN=localhost\"
  * @param issuer e.g. \"CN=Admin\"
  * @param notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  * @param notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  * @param serialNumber 18165099476682912368
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TruststoreItems(
  alias: Option[String],
  entryType: Option[String],
  subject: Option[String],
  issuer: Option[String],
  notBefore: Option[String],
  notAfter: Option[String],
  serialNumber: Option[Int]
)

object TruststoreItems {
  implicit lazy val truststoreItemsJsonFormat: Format[TruststoreItems] = Json.format[TruststoreItems]
}

