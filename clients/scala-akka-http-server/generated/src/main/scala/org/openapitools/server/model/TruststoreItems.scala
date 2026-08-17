package org.openapitools.server.model


/**
 * @param alias Truststore alias name for example: ''null''
 * @param entryType  for example: ''null''
 * @param subject e.g. \"CN=localhost\" for example: ''null''
 * @param issuer e.g. \"CN=Admin\" for example: ''null''
 * @param notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\" for example: ''null''
 * @param notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\" for example: ''null''
 * @param serialNumber 18165099476682912368 for example: ''null''
*/
final case class TruststoreItems (
  alias: Option[String] = None,
  entryType: Option[String] = None,
  subject: Option[String] = None,
  issuer: Option[String] = None,
  notBefore: Option[String] = None,
  notAfter: Option[String] = None,
  serialNumber: Option[Int] = None
)

