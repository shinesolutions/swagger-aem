
package org.openapitools.client.model


case class InstallStatus (
    _status: Option[InstallStatusStatus]
)
object InstallStatus {
    def toStringBody(var_status: Object) =
        s"""
        | {
        | "status":$var_status
        | }
        """.stripMargin
}
