package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SamlConfigurationPropertyItemsString._

case class SamlConfigurationPropertyItemsString (
  /* property name */
  name: Option[String],
/* True if optional */
  optional: Option[Boolean],
/* True if property is set */
  isSet: Option[Boolean],
/* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  `type`: Option[Integer],
/* Property value */
  value: Option[String],
/* Property description */
  description: Option[String])

object SamlConfigurationPropertyItemsString {
  import DateTimeCodecs._

  implicit val SamlConfigurationPropertyItemsStringCodecJson: CodecJson[SamlConfigurationPropertyItemsString] = CodecJson.derive[SamlConfigurationPropertyItemsString]
  implicit val SamlConfigurationPropertyItemsStringDecoder: EntityDecoder[SamlConfigurationPropertyItemsString] = jsonOf[SamlConfigurationPropertyItemsString]
  implicit val SamlConfigurationPropertyItemsStringEncoder: EntityEncoder[SamlConfigurationPropertyItemsString] = jsonEncoderOf[SamlConfigurationPropertyItemsString]
}
