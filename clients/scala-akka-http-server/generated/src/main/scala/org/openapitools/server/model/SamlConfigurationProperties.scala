package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param serviceRanking  for example: ''null''
 * @param idpUrl  for example: ''null''
 * @param idpCertAlias  for example: ''null''
 * @param idpHttpRedirect  for example: ''null''
 * @param serviceProviderEntityId  for example: ''null''
 * @param assertionConsumerServiceURL  for example: ''null''
 * @param spPrivateKeyAlias  for example: ''null''
 * @param keyStorePassword  for example: ''null''
 * @param defaultRedirectUrl  for example: ''null''
 * @param userIDAttribute  for example: ''null''
 * @param useEncryption  for example: ''null''
 * @param createUser  for example: ''null''
 * @param addGroupMemberships  for example: ''null''
 * @param groupMembershipAttribute  for example: ''null''
 * @param defaultGroups  for example: ''null''
 * @param nameIdFormat  for example: ''null''
 * @param synchronizeAttributes  for example: ''null''
 * @param handleLogout  for example: ''null''
 * @param logoutUrl  for example: ''null''
 * @param clockTolerance  for example: ''null''
 * @param digestMethod  for example: ''null''
 * @param signatureMethod  for example: ''null''
 * @param userIntermediatePath  for example: ''null''
*/
final case class SamlConfigurationProperties (
  path: Option[SamlConfigurationPropertyItemsArray] = None,
  serviceRanking: Option[SamlConfigurationPropertyItemsLong] = None,
  idpUrl: Option[SamlConfigurationPropertyItemsString] = None,
  idpCertAlias: Option[SamlConfigurationPropertyItemsString] = None,
  idpHttpRedirect: Option[SamlConfigurationPropertyItemsBoolean] = None,
  serviceProviderEntityId: Option[SamlConfigurationPropertyItemsString] = None,
  assertionConsumerServiceURL: Option[SamlConfigurationPropertyItemsString] = None,
  spPrivateKeyAlias: Option[SamlConfigurationPropertyItemsString] = None,
  keyStorePassword: Option[SamlConfigurationPropertyItemsString] = None,
  defaultRedirectUrl: Option[SamlConfigurationPropertyItemsString] = None,
  userIDAttribute: Option[SamlConfigurationPropertyItemsString] = None,
  useEncryption: Option[SamlConfigurationPropertyItemsBoolean] = None,
  createUser: Option[SamlConfigurationPropertyItemsBoolean] = None,
  addGroupMemberships: Option[SamlConfigurationPropertyItemsBoolean] = None,
  groupMembershipAttribute: Option[SamlConfigurationPropertyItemsString] = None,
  defaultGroups: Option[SamlConfigurationPropertyItemsArray] = None,
  nameIdFormat: Option[SamlConfigurationPropertyItemsString] = None,
  synchronizeAttributes: Option[SamlConfigurationPropertyItemsArray] = None,
  handleLogout: Option[SamlConfigurationPropertyItemsBoolean] = None,
  logoutUrl: Option[SamlConfigurationPropertyItemsString] = None,
  clockTolerance: Option[SamlConfigurationPropertyItemsLong] = None,
  digestMethod: Option[SamlConfigurationPropertyItemsString] = None,
  signatureMethod: Option[SamlConfigurationPropertyItemsString] = None,
  userIntermediatePath: Option[SamlConfigurationPropertyItemsString] = None
)

