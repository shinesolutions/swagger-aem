package org.openapitools.server.api.model

import org.openapitools.server.api.model.SamlConfigurationPropertyItemsArray
import org.openapitools.server.api.model.SamlConfigurationPropertyItemsBoolean
import org.openapitools.server.api.model.SamlConfigurationPropertyItemsLong
import org.openapitools.server.api.model.SamlConfigurationPropertyItemsString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SamlConfigurationProperties(
    val path: SamlConfigurationPropertyItemsArray? = null,
    val serviceRanking: SamlConfigurationPropertyItemsLong? = null,
    val idpUrl: SamlConfigurationPropertyItemsString? = null,
    val idpCertAlias: SamlConfigurationPropertyItemsString? = null,
    val idpHttpRedirect: SamlConfigurationPropertyItemsBoolean? = null,
    val serviceProviderEntityId: SamlConfigurationPropertyItemsString? = null,
    val assertionConsumerServiceURL: SamlConfigurationPropertyItemsString? = null,
    val spPrivateKeyAlias: SamlConfigurationPropertyItemsString? = null,
    val keyStorePassword: SamlConfigurationPropertyItemsString? = null,
    val defaultRedirectUrl: SamlConfigurationPropertyItemsString? = null,
    val userIDAttribute: SamlConfigurationPropertyItemsString? = null,
    val useEncryption: SamlConfigurationPropertyItemsBoolean? = null,
    val createUser: SamlConfigurationPropertyItemsBoolean? = null,
    val addGroupMemberships: SamlConfigurationPropertyItemsBoolean? = null,
    val groupMembershipAttribute: SamlConfigurationPropertyItemsString? = null,
    val defaultGroups: SamlConfigurationPropertyItemsArray? = null,
    val nameIdFormat: SamlConfigurationPropertyItemsString? = null,
    val synchronizeAttributes: SamlConfigurationPropertyItemsArray? = null,
    val handleLogout: SamlConfigurationPropertyItemsBoolean? = null,
    val logoutUrl: SamlConfigurationPropertyItemsString? = null,
    val clockTolerance: SamlConfigurationPropertyItemsLong? = null,
    val digestMethod: SamlConfigurationPropertyItemsString? = null,
    val signatureMethod: SamlConfigurationPropertyItemsString? = null,
    val userIntermediatePath: SamlConfigurationPropertyItemsString? = null
)
