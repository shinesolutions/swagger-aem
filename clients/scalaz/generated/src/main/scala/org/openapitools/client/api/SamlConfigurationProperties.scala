package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SamlConfigurationProperties._

case class SamlConfigurationProperties (
  `path`: Option[SamlConfigurationPropertyItemsArray],
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
userIntermediatePath: Option[SamlConfigurationPropertyItemsString])

object SamlConfigurationProperties {
  import DateTimeCodecs._

  implicit val SamlConfigurationPropertiesCodecJson: CodecJson[SamlConfigurationProperties] = CodecJson.derive[SamlConfigurationProperties]
  implicit val SamlConfigurationPropertiesDecoder: EntityDecoder[SamlConfigurationProperties] = jsonOf[SamlConfigurationProperties]
  implicit val SamlConfigurationPropertiesEncoder: EntityEncoder[SamlConfigurationProperties] = jsonEncoderOf[SamlConfigurationProperties]
}
