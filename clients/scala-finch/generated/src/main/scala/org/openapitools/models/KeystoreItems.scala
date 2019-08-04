package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.KeystoreChainItems
import scala.collection.immutable.Seq

/**
 * 
 * @param alias Keystore alias name
 * @param entryType e.g. \"privateKey\"
 * @param algorithm e.g. \"RSA\"
 * @param format e.g. \"PKCS#8\"
 * @param chain 
 */
case class KeystoreItems(alias: Option[String],
                entryType: Option[String],
                algorithm: Option[String],
                format: Option[String],
                chain: Option[Seq[KeystoreChainItems]]
                )

object KeystoreItems {
    /**
     * Creates the codec for converting KeystoreItems from and to JSON.
     */
    implicit val decoder: Decoder[KeystoreItems] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeystoreItems] = deriveEncoder
}
