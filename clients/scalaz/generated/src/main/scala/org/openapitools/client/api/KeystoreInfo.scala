package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import KeystoreInfo._

case class KeystoreInfo (
  aliases: Option[List[KeystoreItems]],
/* False if truststore don't exist */
  exists: Option[Boolean])

object KeystoreInfo {
  import DateTimeCodecs._

  implicit val KeystoreInfoCodecJson: CodecJson[KeystoreInfo] = CodecJson.derive[KeystoreInfo]
  implicit val KeystoreInfoDecoder: EntityDecoder[KeystoreInfo] = jsonOf[KeystoreInfo]
  implicit val KeystoreInfoEncoder: EntityEncoder[KeystoreInfo] = jsonEncoderOf[KeystoreInfo]
}
