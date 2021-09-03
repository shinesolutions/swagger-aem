
package org.openapitools.client.model


case class KeystoreInfo (
    _aliases: Option[List[KeystoreItems]],
    /* False if truststore don't exist */
    _exists: Option[Boolean]
)
object KeystoreInfo {
    def toStringBody(var_aliases: Object, var_exists: Object) =
        s"""
        | {
        | "aliases":$var_aliases,"exists":$var_exists
        | }
        """.stripMargin
}
