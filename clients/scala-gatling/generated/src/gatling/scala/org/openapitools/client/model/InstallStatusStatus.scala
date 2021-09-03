
package org.openapitools.client.model


case class InstallStatusStatus (
    _finished: Option[Boolean],
    _itemCount: Option[Integer]
)
object InstallStatusStatus {
    def toStringBody(var_finished: Object, var_itemCount: Object) =
        s"""
        | {
        | "finished":$var_finished,"itemCount":$var_itemCount
        | }
        """.stripMargin
}
