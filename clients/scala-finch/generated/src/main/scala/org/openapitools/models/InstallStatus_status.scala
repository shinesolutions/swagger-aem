package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param finished 
 * @param itemCount 
 */
case class InstallStatus_status(finished: Option[Boolean],
                itemCount: Option[Int]
                )

object InstallStatus_status {
    /**
     * Creates the codec for converting InstallStatus_status from and to JSON.
     */
    implicit val decoder: Decoder[InstallStatus_status] = deriveDecoder
    implicit val encoder: ObjectEncoder[InstallStatus_status] = deriveEncoder
}
