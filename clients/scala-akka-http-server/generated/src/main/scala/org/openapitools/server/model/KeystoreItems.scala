package org.openapitools.server.model


/**
 * @param alias Keystore alias name for example: ''null''
 * @param entryType e.g. \"privateKey\" for example: ''null''
 * @param algorithm e.g. \"RSA\" for example: ''null''
 * @param format e.g. \"PKCS#8\" for example: ''null''
 * @param chain  for example: ''null''
*/
final case class KeystoreItems (
  alias: Option[String] = None,
  entryType: Option[String] = None,
  algorithm: Option[String] = None,
  format: Option[String] = None,
  chain: Option[Seq[KeystoreChainItems]] = None
)

