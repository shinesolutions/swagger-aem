package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InstallStatusStatus._

case class InstallStatusStatus (
  finished: Option[Boolean],
itemCount: Option[Integer])

object InstallStatusStatus {
  import DateTimeCodecs._

  implicit val InstallStatusStatusCodecJson: CodecJson[InstallStatusStatus] = CodecJson.derive[InstallStatusStatus]
  implicit val InstallStatusStatusDecoder: EntityDecoder[InstallStatusStatus] = jsonOf[InstallStatusStatus]
  implicit val InstallStatusStatusEncoder: EntityEncoder[InstallStatusStatus] = jsonEncoderOf[InstallStatusStatus]
}
