package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BundleDataProp._

case class BundleDataProp (
  /* Bundle data key */
  key: Option[String],
/* Bundle data value */
  value: Option[String])

object BundleDataProp {
  import DateTimeCodecs._

  implicit val BundleDataPropCodecJson: CodecJson[BundleDataProp] = CodecJson.derive[BundleDataProp]
  implicit val BundleDataPropDecoder: EntityDecoder[BundleDataProp] = jsonOf[BundleDataProp]
  implicit val BundleDataPropEncoder: EntityEncoder[BundleDataProp] = jsonEncoderOf[BundleDataProp]
}
