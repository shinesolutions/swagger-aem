package org.openapitools.server.model


/**
 * @param finished  for example: ''null''
 * @param itemCount  for example: ''null''
*/
final case class InstallStatusStatus (
  finished: Option[Boolean] = None,
  itemCount: Option[Int] = None
)

