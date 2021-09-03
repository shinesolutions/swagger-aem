package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SamlConfigurationPropertyItemsArray._

case class SamlConfigurationPropertyItemsArray (
  /* property name */
  name: Option[String],
/* True if optional */
  optional: Option[Boolean],
/* True if property is set */
  isSet: Option[Boolean],
/* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  `type`: Option[Integer],
/* Property value */
  values: Option[List[String]],
/* Property description */
  description: Option[String])

object SamlConfigurationPropertyItemsArray {
  import DateTimeCodecs._

  implicit val SamlConfigurationPropertyItemsArrayCodecJson: CodecJson[SamlConfigurationPropertyItemsArray] = CodecJson.derive[SamlConfigurationPropertyItemsArray]
  implicit val SamlConfigurationPropertyItemsArrayDecoder: EntityDecoder[SamlConfigurationPropertyItemsArray] = jsonOf[SamlConfigurationPropertyItemsArray]
  implicit val SamlConfigurationPropertyItemsArrayEncoder: EntityEncoder[SamlConfigurationPropertyItemsArray] = jsonEncoderOf[SamlConfigurationPropertyItemsArray]
}
