package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BundleDataProp
import scala.collection.immutable.Seq

/**
 * 
 * @param id Bundle ID
 * @param name Bundle name
 * @param fragment Is bundle a fragment
 * @param stateRaw Numeric raw bundle state value
 * @param state Bundle state value
 * @param version Bundle version
 * @param symbolicName Bundle symbolic name
 * @param category Bundle category
 * @param props 
 */
case class BundleData(id: Option[Int],
                name: Option[String],
                fragment: Option[Boolean],
                stateRaw: Option[Int],
                state: Option[String],
                version: Option[String],
                symbolicName: Option[String],
                category: Option[String],
                props: Option[Seq[BundleDataProp]]
                )

object BundleData {
    /**
     * Creates the codec for converting BundleData from and to JSON.
     */
    implicit val decoder: Decoder[BundleData] = deriveDecoder
    implicit val encoder: ObjectEncoder[BundleData] = deriveEncoder
}
