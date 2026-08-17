package org.openapitools.server.model


/**
 * @param id Bundle ID for example: ''null''
 * @param name Bundle name for example: ''null''
 * @param fragment Is bundle a fragment for example: ''null''
 * @param stateRaw Numeric raw bundle state value for example: ''null''
 * @param state Bundle state value for example: ''null''
 * @param version Bundle version for example: ''null''
 * @param symbolicName Bundle symbolic name for example: ''null''
 * @param category Bundle category for example: ''null''
 * @param props  for example: ''null''
*/
final case class BundleData (
  id: Option[Int] = None,
  name: Option[String] = None,
  fragment: Option[Boolean] = None,
  stateRaw: Option[Int] = None,
  state: Option[String] = None,
  version: Option[String] = None,
  symbolicName: Option[String] = None,
  category: Option[String] = None,
  props: Option[Seq[BundleDataProp]] = None
)

