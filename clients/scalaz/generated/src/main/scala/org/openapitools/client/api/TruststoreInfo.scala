package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TruststoreInfo._

case class TruststoreInfo (
  aliases: Option[List[TruststoreItems]],
/* False if truststore don't exist */
  exists: Option[Boolean])

object TruststoreInfo {
  import DateTimeCodecs._

  implicit val TruststoreInfoCodecJson: CodecJson[TruststoreInfo] = CodecJson.derive[TruststoreInfo]
  implicit val TruststoreInfoDecoder: EntityDecoder[TruststoreInfo] = jsonOf[TruststoreInfo]
  implicit val TruststoreInfoEncoder: EntityEncoder[TruststoreInfo] = jsonEncoderOf[TruststoreInfo]
}
