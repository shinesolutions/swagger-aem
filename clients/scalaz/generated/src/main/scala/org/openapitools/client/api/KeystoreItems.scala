package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeystoreItems._

case class KeystoreItems (
  /* Keystore alias name */
  alias: Option[String],
/* e.g. \"privateKey\" */
  entryType: Option[String],
/* e.g. \"RSA\" */
  algorithm: Option[String],
/* e.g. \"PKCS#8\" */
  format: Option[String],
chain: Option[List[KeystoreChainItems]])

object KeystoreItems {
  import DateTimeCodecs._

  implicit val KeystoreItemsCodecJson: CodecJson[KeystoreItems] = CodecJson.derive[KeystoreItems]
  implicit val KeystoreItemsDecoder: EntityDecoder[KeystoreItems] = jsonOf[KeystoreItems]
  implicit val KeystoreItemsEncoder: EntityEncoder[KeystoreItems] = jsonEncoderOf[KeystoreItems]
}
