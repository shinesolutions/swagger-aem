package org.openapitools.server.model


/**
 * @param name property name for example: ''null''
 * @param optional True if optional for example: ''null''
 * @param isSet True if property is set for example: ''null''
 * @param `type` Property type, 1=String, 3=long, 11=boolean, 12=Password for example: ''null''
 * @param value Property value for example: ''null''
 * @param description Property description for example: ''null''
*/
final case class SamlConfigurationPropertyItemsString (
  name: Option[String] = None,
  optional: Option[Boolean] = None,
  isSet: Option[Boolean] = None,
  `type`: Option[Int] = None,
  value: Option[String] = None,
  description: Option[String] = None
)

