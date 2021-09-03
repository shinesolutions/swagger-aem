
package org.openapitools.client.model


case class TruststoreItems (
    /* Truststore alias name */
    _alias: Option[String],
    _entryType: Option[String],
    /* e.g. \"CN=localhost\" */
    _subject: Option[String],
    /* e.g. \"CN=Admin\" */
    _issuer: Option[String],
    /* e.g. \"Sun Jul 01 12:00:00 AEST 2018\" */
    _notBefore: Option[String],
    /* e.g. \"Sun Jun 30 23:59:50 AEST 2019\" */
    _notAfter: Option[String],
    /* 18165099476682912368 */
    _serialNumber: Option[Integer]
)
object TruststoreItems {
    def toStringBody(var_alias: Object, var_entryType: Object, var_subject: Object, var_issuer: Object, var_notBefore: Object, var_notAfter: Object, var_serialNumber: Object) =
        s"""
        | {
        | "alias":$var_alias,"entryType":$var_entryType,"subject":$var_subject,"issuer":$var_issuer,"notBefore":$var_notBefore,"notAfter":$var_notAfter,"serialNumber":$var_serialNumber
        | }
        """.stripMargin
}
