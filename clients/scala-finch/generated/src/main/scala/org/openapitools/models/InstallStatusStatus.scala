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
case class InstallStatusStatus(finished: Option[Boolean],
                itemCount: Option[Int]
                )

object InstallStatusStatus {
    /**
     * Creates the codec for converting InstallStatusStatus from and to JSON.
     */
    implicit val decoder: Decoder[InstallStatusStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[InstallStatusStatus] = deriveEncoder
}
