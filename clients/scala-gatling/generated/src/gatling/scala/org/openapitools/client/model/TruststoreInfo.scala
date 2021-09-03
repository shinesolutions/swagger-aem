
package org.openapitools.client.model


case class TruststoreInfo (
    _aliases: Option[List[TruststoreItems]],
    /* False if truststore don't exist */
    _exists: Option[Boolean]
)
object TruststoreInfo {
    def toStringBody(var_aliases: Object, var_exists: Object) =
        s"""
        | {
        | "aliases":$var_aliases,"exists":$var_exists
        | }
        """.stripMargin
}
