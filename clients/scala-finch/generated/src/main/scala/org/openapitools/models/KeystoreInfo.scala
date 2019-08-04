package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.KeystoreItems
import scala.collection.immutable.Seq

/**
 * 
 * @param aliases 
 * @param exists False if truststore don't exist
 */
case class KeystoreInfo(aliases: Option[Seq[KeystoreItems]],
                exists: Option[Boolean]
                )

object KeystoreInfo {
    /**
     * Creates the codec for converting KeystoreInfo from and to JSON.
     */
    implicit val decoder: Decoder[KeystoreInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeystoreInfo] = deriveEncoder
}
