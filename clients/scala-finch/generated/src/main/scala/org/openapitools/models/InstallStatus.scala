package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InstallStatus_status

/**
 * 
 * @param status 
 */
case class InstallStatus(status: Option[InstallStatus_status]
                )

object InstallStatus {
    /**
     * Creates the codec for converting InstallStatus from and to JSON.
     */
    implicit val decoder: Decoder[InstallStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[InstallStatus] = deriveEncoder
}
