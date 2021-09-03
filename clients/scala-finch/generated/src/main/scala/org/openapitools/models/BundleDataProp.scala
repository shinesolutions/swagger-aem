package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param key Bundle data key
 * @param value Bundle data value
 */
case class BundleDataProp(key: Option[String],
                value: Option[String]
                )

object BundleDataProp {
    /**
     * Creates the codec for converting BundleDataProp from and to JSON.
     */
    implicit val decoder: Decoder[BundleDataProp] = deriveDecoder
    implicit val encoder: ObjectEncoder[BundleDataProp] = deriveEncoder
}
