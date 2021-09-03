package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SamlConfigurationPropertyItemsBoolean._

case class SamlConfigurationPropertyItemsBoolean (
  /* property name */
  name: Option[String],
/* True if optional */
  optional: Option[Boolean],
/* True if property is set */
  isSet: Option[Boolean],
/* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  `type`: Option[Integer],
/* Property value */
  value: Option[Boolean],
/* Property description */
  description: Option[String])

object SamlConfigurationPropertyItemsBoolean {
  import DateTimeCodecs._

  implicit val SamlConfigurationPropertyItemsBooleanCodecJson: CodecJson[SamlConfigurationPropertyItemsBoolean] = CodecJson.derive[SamlConfigurationPropertyItemsBoolean]
  implicit val SamlConfigurationPropertyItemsBooleanDecoder: EntityDecoder[SamlConfigurationPropertyItemsBoolean] = jsonOf[SamlConfigurationPropertyItemsBoolean]
  implicit val SamlConfigurationPropertyItemsBooleanEncoder: EntityEncoder[SamlConfigurationPropertyItemsBoolean] = jsonEncoderOf[SamlConfigurationPropertyItemsBoolean]
}
