package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SamlConfigurationProperties

/**
 * 
 * @param pid Persistent Identity (PID)
 * @param title Title
 * @param description Title
 * @param bundleUnderscorelocation needed for configuration binding
 * @param serviceUnderscorelocation needed for configuraiton binding
 * @param properties 
 */
case class SamlConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String],
                properties: Option[SamlConfigurationProperties]
                )

object SamlConfigurationInfo {
    /**
     * Creates the codec for converting SamlConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[SamlConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[SamlConfigurationInfo] = deriveEncoder
}
