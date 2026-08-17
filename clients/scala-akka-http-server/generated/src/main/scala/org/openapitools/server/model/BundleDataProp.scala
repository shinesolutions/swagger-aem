package org.openapitools.server.model


/**
 * @param key Bundle data key for example: ''null''
 * @param value Bundle data value for example: ''null''
*/
final case class BundleDataProp (
  key: Option[String] = None,
  value: Option[String] = None
)

