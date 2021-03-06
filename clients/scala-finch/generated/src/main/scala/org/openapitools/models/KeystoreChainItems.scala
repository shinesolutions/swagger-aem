package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param subject e.g. \"CN=localhost\"
 * @param issuer e.g. \"CN=Admin\"
 * @param notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
 * @param notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
 * @param serialNumber 18165099476682912368
 */
case class KeystoreChainItems(subject: Option[String],
                issuer: Option[String],
                notBefore: Option[String],
                notAfter: Option[String],
                serialNumber: Option[Int]
                )

object KeystoreChainItems {
    /**
     * Creates the codec for converting KeystoreChainItems from and to JSON.
     */
    implicit val decoder: Decoder[KeystoreChainItems] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeystoreChainItems] = deriveEncoder
}
