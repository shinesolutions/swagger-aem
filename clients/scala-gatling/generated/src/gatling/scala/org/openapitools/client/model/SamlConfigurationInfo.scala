
package org.openapitools.client.model


case class SamlConfigurationInfo (
    /* Persistent Identity (PID) */
    _pid: Option[String],
    /* Title */
    _title: Option[String],
    /* Title */
    _description: Option[String],
    /* needed for configuration binding */
    _bundleLocation: Option[String],
    /* needed for configuraiton binding */
    _serviceLocation: Option[String],
    _properties: Option[SamlConfigurationProperties]
)
object SamlConfigurationInfo {
    def toStringBody(var_pid: Object, var_title: Object, var_description: Object, var_bundleLocation: Object, var_serviceLocation: Object, var_properties: Object) =
        s"""
        | {
        | "pid":$var_pid,"title":$var_title,"description":$var_description,"bundleLocation":$var_bundleLocation,"serviceLocation":$var_serviceLocation,"properties":$var_properties
        | }
        """.stripMargin
}
