package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SamlConfigurationProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SamlConfigurationProperties(
  path: Option[SamlConfigurationPropertyItemsArray],
  serviceRanking: Option[SamlConfigurationPropertyItemsLong],
  idpUrl: Option[SamlConfigurationPropertyItemsString],
  idpCertAlias: Option[SamlConfigurationPropertyItemsString],
  idpHttpRedirect: Option[SamlConfigurationPropertyItemsBoolean],
  serviceProviderEntityId: Option[SamlConfigurationPropertyItemsString],
  assertionConsumerServiceURL: Option[SamlConfigurationPropertyItemsString],
  spPrivateKeyAlias: Option[SamlConfigurationPropertyItemsString],
  keyStorePassword: Option[SamlConfigurationPropertyItemsString],
  defaultRedirectUrl: Option[SamlConfigurationPropertyItemsString],
  userIDAttribute: Option[SamlConfigurationPropertyItemsString],
  useEncryption: Option[SamlConfigurationPropertyItemsBoolean],
  createUser: Option[SamlConfigurationPropertyItemsBoolean],
  addGroupMemberships: Option[SamlConfigurationPropertyItemsBoolean],
  groupMembershipAttribute: Option[SamlConfigurationPropertyItemsString],
  defaultGroups: Option[SamlConfigurationPropertyItemsArray],
  nameIdFormat: Option[SamlConfigurationPropertyItemsString],
  synchronizeAttributes: Option[SamlConfigurationPropertyItemsArray],
  handleLogout: Option[SamlConfigurationPropertyItemsBoolean],
  logoutUrl: Option[SamlConfigurationPropertyItemsString],
  clockTolerance: Option[SamlConfigurationPropertyItemsLong],
  digestMethod: Option[SamlConfigurationPropertyItemsString],
  signatureMethod: Option[SamlConfigurationPropertyItemsString],
  userIntermediatePath: Option[SamlConfigurationPropertyItemsString]
)

object SamlConfigurationProperties {
  implicit lazy val samlConfigurationPropertiesJsonFormat: Format[SamlConfigurationProperties] = Json.format[SamlConfigurationProperties]
}

