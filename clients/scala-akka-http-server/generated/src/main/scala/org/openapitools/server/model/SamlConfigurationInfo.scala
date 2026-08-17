package org.openapitools.server.model


/**
 * @param pid Persistent Identity (PID) for example: ''null''
 * @param title Title for example: ''null''
 * @param description Title for example: ''null''
 * @param bundleLocation needed for configuration binding for example: ''null''
 * @param serviceLocation needed for configuraiton binding for example: ''null''
 * @param properties  for example: ''null''
*/
final case class SamlConfigurationInfo (
  pid: Option[String] = None,
  title: Option[String] = None,
  description: Option[String] = None,
  bundleLocation: Option[String] = None,
  serviceLocation: Option[String] = None,
  properties: Option[SamlConfigurationProperties] = None
)

