
package org.openapitools.client.model


case class BundleData (
    /* Bundle ID */
    _id: Option[Integer],
    /* Bundle name */
    _name: Option[String],
    /* Is bundle a fragment */
    _fragment: Option[Boolean],
    /* Numeric raw bundle state value */
    _stateRaw: Option[Integer],
    /* Bundle state value */
    _state: Option[String],
    /* Bundle version */
    _version: Option[String],
    /* Bundle symbolic name */
    _symbolicName: Option[String],
    /* Bundle category */
    _category: Option[String],
    _props: Option[List[BundleDataProp]]
)
object BundleData {
    def toStringBody(var_id: Object, var_name: Object, var_fragment: Object, var_stateRaw: Object, var_state: Object, var_version: Object, var_symbolicName: Object, var_category: Object, var_props: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"fragment":$var_fragment,"stateRaw":$var_stateRaw,"state":$var_state,"version":$var_version,"symbolicName":$var_symbolicName,"category":$var_category,"props":$var_props
        | }
        """.stripMargin
}
