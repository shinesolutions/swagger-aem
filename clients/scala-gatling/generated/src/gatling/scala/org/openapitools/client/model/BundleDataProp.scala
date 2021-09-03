
package org.openapitools.client.model


case class BundleDataProp (
    /* Bundle data key */
    _key: Option[String],
    /* Bundle data value */
    _value: Option[String]
)
object BundleDataProp {
    def toStringBody(var_key: Object, var_value: Object) =
        s"""
        | {
        | "key":$var_key,"value":$var_value
        | }
        """.stripMargin
}
