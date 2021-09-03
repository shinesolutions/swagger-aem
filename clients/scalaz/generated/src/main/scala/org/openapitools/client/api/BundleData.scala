package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BundleData._

case class BundleData (
  /* Bundle ID */
  id: Option[Integer],
/* Bundle name */
  name: Option[String],
/* Is bundle a fragment */
  fragment: Option[Boolean],
/* Numeric raw bundle state value */
  stateRaw: Option[Integer],
/* Bundle state value */
  state: Option[String],
/* Bundle version */
  version: Option[String],
/* Bundle symbolic name */
  symbolicName: Option[String],
/* Bundle category */
  category: Option[String],
props: Option[List[BundleDataProp]])

object BundleData {
  import DateTimeCodecs._

  implicit val BundleDataCodecJson: CodecJson[BundleData] = CodecJson.derive[BundleData]
  implicit val BundleDataDecoder: EntityDecoder[BundleData] = jsonOf[BundleData]
  implicit val BundleDataEncoder: EntityEncoder[BundleData] = jsonEncoderOf[BundleData]
}
