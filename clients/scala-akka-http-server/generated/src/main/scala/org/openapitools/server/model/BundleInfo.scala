package org.openapitools.server.model


/**
 * @param status Status description of all bundles for example: ''null''
 * @param s  for example: ''null''
 * @param data  for example: ''null''
*/
final case class BundleInfo (
  status: Option[String] = None,
  s: Option[Seq[Int]] = None,
  data: Option[Seq[BundleData]] = None
)

