
package org.openapitools.client.model


case class BundleInfo (
    /* Status description of all bundles */
    _status: Option[String],
    _s: Option[List[Integer]],
    _data: Option[List[BundleData]]
)
object BundleInfo {
    def toStringBody(var_status: Object, var_s: Object, var_data: Object) =
        s"""
        | {
        | "status":$var_status,"s":$var_s,"data":$var_data
        | }
        """.stripMargin
}
