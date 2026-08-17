package org.openapitools.server.model


/**
 * @param aliases  for example: ''null''
 * @param exists False if truststore don't exist for example: ''null''
*/
final case class TruststoreInfo (
  aliases: Option[Seq[TruststoreItems]] = None,
  exists: Option[Boolean] = None
)

