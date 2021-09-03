package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SamlConfigurationInfo._

case class SamlConfigurationInfo (
  /* Persistent Identity (PID) */
  pid: Option[String],
/* Title */
  title: Option[String],
/* Title */
  description: Option[String],
/* needed for configuration binding */
  bundleLocation: Option[String],
/* needed for configuraiton binding */
  serviceLocation: Option[String],
properties: Option[SamlConfigurationProperties])

object SamlConfigurationInfo {
  import DateTimeCodecs._

  implicit val SamlConfigurationInfoCodecJson: CodecJson[SamlConfigurationInfo] = CodecJson.derive[SamlConfigurationInfo]
  implicit val SamlConfigurationInfoDecoder: EntityDecoder[SamlConfigurationInfo] = jsonOf[SamlConfigurationInfo]
  implicit val SamlConfigurationInfoEncoder: EntityEncoder[SamlConfigurationInfo] = jsonEncoderOf[SamlConfigurationInfo]
}
