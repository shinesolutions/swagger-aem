package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SamlConfigurationPropertyItemsLong.
  * @param name property name
  * @param optional True if optional
  * @param isSet True if property is set
  * @param `type` Property type, 1=String, 3=long, 11=boolean, 12=Password
  * @param value Property value
  * @param description Property description
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T07:15:43.105475754Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SamlConfigurationPropertyItemsLong(
  name: Option[String],
  optional: Option[Boolean],
  isSet: Option[Boolean],
  `type`: Option[Int],
  value: Option[Int],
  description: Option[String]
)

object SamlConfigurationPropertyItemsLong {
  implicit lazy val samlConfigurationPropertyItemsLongJsonFormat: Format[SamlConfigurationPropertyItemsLong] = Json.format[SamlConfigurationPropertyItemsLong]
}

