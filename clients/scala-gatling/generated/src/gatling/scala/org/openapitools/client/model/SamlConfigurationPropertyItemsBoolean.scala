
package org.openapitools.client.model


case class SamlConfigurationPropertyItemsBoolean (
    /* property name */
    _name: Option[String],
    /* True if optional */
    _optional: Option[Boolean],
    /* True if property is set */
    _isSet: Option[Boolean],
    /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
    _type: Option[Integer],
    /* Property value */
    _value: Option[Boolean],
    /* Property description */
    _description: Option[String]
)
object SamlConfigurationPropertyItemsBoolean {
    def toStringBody(var_name: Object, var_optional: Object, var_isSet: Object, var_type: Object, var_value: Object, var_description: Object) =
        s"""
        | {
        | "name":$var_name,"optional":$var_optional,"isSet":$var_isSet,"type":$var_type,"value":$var_value,"description":$var_description
        | }
        """.stripMargin
}
