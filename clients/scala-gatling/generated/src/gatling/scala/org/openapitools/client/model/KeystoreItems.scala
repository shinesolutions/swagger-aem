
package org.openapitools.client.model


case class KeystoreItems (
    /* Keystore alias name */
    _alias: Option[String],
    /* e.g. \"privateKey\" */
    _entryType: Option[String],
    /* e.g. \"RSA\" */
    _algorithm: Option[String],
    /* e.g. \"PKCS#8\" */
    _format: Option[String],
    _chain: Option[List[KeystoreChainItems]]
)
object KeystoreItems {
    def toStringBody(var_alias: Object, var_entryType: Object, var_algorithm: Object, var_format: Object, var_chain: Object) =
        s"""
        | {
        | "alias":$var_alias,"entryType":$var_entryType,"algorithm":$var_algorithm,"format":$var_format,"chain":$var_chain
        | }
        """.stripMargin
}
