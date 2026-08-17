@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SamlConfigurationProperties(
    @field:JsonProperty("path")
    val path: SamlConfigurationPropertyItemsArray? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: SamlConfigurationPropertyItemsLong? = null,

    @field:JsonProperty("idpUrl")
    val idpUrl: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("idpCertAlias")
    val idpCertAlias: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("idpHttpRedirect")
    val idpHttpRedirect: SamlConfigurationPropertyItemsBoolean? = null,

    @field:JsonProperty("serviceProviderEntityId")
    val serviceProviderEntityId: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("assertionConsumerServiceURL")
    val assertionConsumerServiceURL: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("spPrivateKeyAlias")
    val spPrivateKeyAlias: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("keyStorePassword")
    val keyStorePassword: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("defaultRedirectUrl")
    val defaultRedirectUrl: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("userIDAttribute")
    val userIDAttribute: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("useEncryption")
    val useEncryption: SamlConfigurationPropertyItemsBoolean? = null,

    @field:JsonProperty("createUser")
    val createUser: SamlConfigurationPropertyItemsBoolean? = null,

    @field:JsonProperty("addGroupMemberships")
    val addGroupMemberships: SamlConfigurationPropertyItemsBoolean? = null,

    @field:JsonProperty("groupMembershipAttribute")
    val groupMembershipAttribute: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("defaultGroups")
    val defaultGroups: SamlConfigurationPropertyItemsArray? = null,

    @field:JsonProperty("nameIdFormat")
    val nameIdFormat: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("synchronizeAttributes")
    val synchronizeAttributes: SamlConfigurationPropertyItemsArray? = null,

    @field:JsonProperty("handleLogout")
    val handleLogout: SamlConfigurationPropertyItemsBoolean? = null,

    @field:JsonProperty("logoutUrl")
    val logoutUrl: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("clockTolerance")
    val clockTolerance: SamlConfigurationPropertyItemsLong? = null,

    @field:JsonProperty("digestMethod")
    val digestMethod: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("signatureMethod")
    val signatureMethod: SamlConfigurationPropertyItemsString? = null,

    @field:JsonProperty("userIntermediatePath")
    val userIntermediatePath: SamlConfigurationPropertyItemsString? = null,

)
