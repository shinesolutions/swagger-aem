package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SamlConfigurationPropertyItemsLong._

case class SamlConfigurationPropertyItemsLong (
  /* property name */
  name: Option[String],
/* True if optional */
  optional: Option[Boolean],
/* True if property is set */
  isSet: Option[Boolean],
/* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  `type`: Option[Integer],
/* Property value */
  value: Option[Integer],
/* Property description */
  description: Option[String])

object SamlConfigurationPropertyItemsLong {
  import DateTimeCodecs._

  implicit val SamlConfigurationPropertyItemsLongCodecJson: CodecJson[SamlConfigurationPropertyItemsLong] = CodecJson.derive[SamlConfigurationPropertyItemsLong]
  implicit val SamlConfigurationPropertyItemsLongDecoder: EntityDecoder[SamlConfigurationPropertyItemsLong] = jsonOf[SamlConfigurationPropertyItemsLong]
  implicit val SamlConfigurationPropertyItemsLongEncoder: EntityEncoder[SamlConfigurationPropertyItemsLong] = jsonEncoderOf[SamlConfigurationPropertyItemsLong]
}
