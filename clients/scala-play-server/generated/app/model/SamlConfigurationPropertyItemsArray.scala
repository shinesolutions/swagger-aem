package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SamlConfigurationPropertyItemsArray.
  * @param name property name
  * @param optional True if optional
  * @param isSet True if property is set
  * @param `type` Property type, 1=String, 3=long, 11=boolean, 12=Password
  * @param values Property value
  * @param description Property description
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SamlConfigurationPropertyItemsArray(
  name: Option[String],
  optional: Option[Boolean],
  isSet: Option[Boolean],
  `type`: Option[Int],
  values: Option[List[String]],
  description: Option[String]
)

object SamlConfigurationPropertyItemsArray {
  implicit lazy val samlConfigurationPropertyItemsArrayJsonFormat: Format[SamlConfigurationPropertyItemsArray] = Json.format[SamlConfigurationPropertyItemsArray]
}

