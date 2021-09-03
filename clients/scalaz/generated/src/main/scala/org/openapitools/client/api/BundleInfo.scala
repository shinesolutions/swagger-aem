package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BundleInfo._

case class BundleInfo (
  /* Status description of all bundles */
  status: Option[String],
s: Option[List[Integer]],
data: Option[List[BundleData]])

object BundleInfo {
  import DateTimeCodecs._

  implicit val BundleInfoCodecJson: CodecJson[BundleInfo] = CodecJson.derive[BundleInfo]
  implicit val BundleInfoDecoder: EntityDecoder[BundleInfo] = jsonOf[BundleInfo]
  implicit val BundleInfoEncoder: EntityEncoder[BundleInfo] = jsonEncoderOf[BundleInfo]
}
