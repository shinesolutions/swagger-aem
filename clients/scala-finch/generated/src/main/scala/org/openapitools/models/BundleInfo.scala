package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BundleData
import scala.collection.immutable.Seq

/**
 * 
 * @param status Status description of all bundles
 * @param s 
 * @param data 
 */
case class BundleInfo(status: Option[String],
                s: Option[Seq[Int]],
                data: Option[Seq[BundleData]]
                )

object BundleInfo {
    /**
     * Creates the codec for converting BundleInfo from and to JSON.
     */
    implicit val decoder: Decoder[BundleInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[BundleInfo] = deriveEncoder
}
