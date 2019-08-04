package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InstallStatus._

case class InstallStatus (
  status: Option[InstallStatusStatus])

object InstallStatus {
  import DateTimeCodecs._

  implicit val InstallStatusCodecJson: CodecJson[InstallStatus] = CodecJson.derive[InstallStatus]
  implicit val InstallStatusDecoder: EntityDecoder[InstallStatus] = jsonOf[InstallStatus]
  implicit val InstallStatusEncoder: EntityEncoder[InstallStatus] = jsonEncoderOf[InstallStatus]
}
