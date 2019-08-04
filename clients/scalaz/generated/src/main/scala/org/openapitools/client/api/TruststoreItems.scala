package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TruststoreItems._

case class TruststoreItems (
  /* Truststore alias name */
  alias: Option[String],
entryType: Option[String],
/* e.g. \"CN=localhost\" */
  subject: Option[String],
/* e.g. \"CN=Admin\" */
  issuer: Option[String],
/* e.g. \"Sun Jul 01 12:00:00 AEST 2018\" */
  notBefore: Option[String],
/* e.g. \"Sun Jun 30 23:59:50 AEST 2019\" */
  notAfter: Option[String],
/* 18165099476682912368 */
  serialNumber: Option[Integer])

object TruststoreItems {
  import DateTimeCodecs._

  implicit val TruststoreItemsCodecJson: CodecJson[TruststoreItems] = CodecJson.derive[TruststoreItems]
  implicit val TruststoreItemsDecoder: EntityDecoder[TruststoreItems] = jsonOf[TruststoreItems]
  implicit val TruststoreItemsEncoder: EntityEncoder[TruststoreItems] = jsonEncoderOf[TruststoreItems]
}
