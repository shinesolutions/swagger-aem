package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeystoreItems.
  * @param alias Keystore alias name
  * @param entryType e.g. \"privateKey\"
  * @param algorithm e.g. \"RSA\"
  * @param format e.g. \"PKCS#8\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T07:15:43.105475754Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeystoreItems(
  alias: Option[String],
  entryType: Option[String],
  algorithm: Option[String],
  format: Option[String],
  chain: Option[List[KeystoreChainItems]]
)

object KeystoreItems {
  implicit lazy val keystoreItemsJsonFormat: Format[KeystoreItems] = Json.format[KeystoreItems]
}

