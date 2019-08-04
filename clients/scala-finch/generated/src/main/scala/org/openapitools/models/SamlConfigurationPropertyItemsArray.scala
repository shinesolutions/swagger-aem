package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param name property name
 * @param optional True if optional
 * @param isUnderscoreset True if property is set
 * @param _type Property type, 1=String, 3=long, 11=boolean, 12=Password
 * @param values Property value
 * @param description Property description
 */
case class SamlConfigurationPropertyItemsArray(name: Option[String],
                optional: Option[Boolean],
                isUnderscoreset: Option[Boolean],
                _type: Option[Int],
                values: Option[Seq[String]],
                description: Option[String]
                )

object SamlConfigurationPropertyItemsArray {
    /**
     * Creates the codec for converting SamlConfigurationPropertyItemsArray from and to JSON.
     */
    implicit val decoder: Decoder[SamlConfigurationPropertyItemsArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[SamlConfigurationPropertyItemsArray] = deriveEncoder
}
