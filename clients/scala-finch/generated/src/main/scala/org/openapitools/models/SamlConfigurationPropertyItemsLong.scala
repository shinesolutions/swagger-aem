package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name property name
 * @param optional True if optional
 * @param isUnderscoreset True if property is set
 * @param _type Property type, 1=String, 3=long, 11=boolean, 12=Password
 * @param value Property value
 * @param description Property description
 */
case class SamlConfigurationPropertyItemsLong(name: Option[String],
                optional: Option[Boolean],
                isUnderscoreset: Option[Boolean],
                _type: Option[Int],
                value: Option[Int],
                description: Option[String]
                )

object SamlConfigurationPropertyItemsLong {
    /**
     * Creates the codec for converting SamlConfigurationPropertyItemsLong from and to JSON.
     */
    implicit val decoder: Decoder[SamlConfigurationPropertyItemsLong] = deriveDecoder
    implicit val encoder: ObjectEncoder[SamlConfigurationPropertyItemsLong] = deriveEncoder
}
