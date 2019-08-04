package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SamlConfigurationPropertyItemsArray
import org.openapitools.models.SamlConfigurationPropertyItemsBoolean
import org.openapitools.models.SamlConfigurationPropertyItemsLong
import org.openapitools.models.SamlConfigurationPropertyItemsString

/**
 * 
 * @param path 
 * @param servicePeriodranking 
 * @param idpUrl 
 * @param idpCertAlias 
 * @param idpHttpRedirect 
 * @param serviceProviderEntityId 
 * @param assertionConsumerServiceURL 
 * @param spPrivateKeyAlias 
 * @param keyStorePassword 
 * @param defaultRedirectUrl 
 * @param userIDAttribute 
 * @param useEncryption 
 * @param createUser 
 * @param addGroupMemberships 
 * @param groupMembershipAttribute 
 * @param defaultGroups 
 * @param nameIdFormat 
 * @param synchronizeAttributes 
 * @param handleLogout 
 * @param logoutUrl 
 * @param clockTolerance 
 * @param digestMethod 
 * @param signatureMethod 
 * @param userIntermediatePath 
 */
case class SamlConfigurationProperties(path: Option[SamlConfigurationPropertyItemsArray],
                servicePeriodranking: Option[SamlConfigurationPropertyItemsLong],
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
    /**
     * Creates the codec for converting SamlConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[SamlConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[SamlConfigurationProperties] = deriveEncoder
}
