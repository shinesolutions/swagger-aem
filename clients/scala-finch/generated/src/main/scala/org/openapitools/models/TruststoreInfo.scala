package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TruststoreItems
import scala.collection.immutable.Seq

/**
 * 
 * @param aliases 
 * @param exists False if truststore don't exist
 */
case class TruststoreInfo(aliases: Option[Seq[TruststoreItems]],
                exists: Option[Boolean]
                )

object TruststoreInfo {
    /**
     * Creates the codec for converting TruststoreInfo from and to JSON.
     */
    implicit val decoder: Decoder[TruststoreInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[TruststoreInfo] = deriveEncoder
}
