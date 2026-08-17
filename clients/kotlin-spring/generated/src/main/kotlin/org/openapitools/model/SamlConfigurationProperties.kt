package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.SamlConfigurationPropertyItemsArray
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean
import org.openapitools.model.SamlConfigurationPropertyItemsLong
import org.openapitools.model.SamlConfigurationPropertyItemsString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param path 
 * @param serviceRanking 
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
data class SamlConfigurationProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("path")
    @get:JsonProperty("path") val path: SamlConfigurationPropertyItemsArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service.ranking")
    @get:JsonProperty("service.ranking") val serviceRanking: SamlConfigurationPropertyItemsLong? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("idpUrl")
    @get:JsonProperty("idpUrl") val idpUrl: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("idpCertAlias")
    @get:JsonProperty("idpCertAlias") val idpCertAlias: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("idpHttpRedirect")
    @get:JsonProperty("idpHttpRedirect") val idpHttpRedirect: SamlConfigurationPropertyItemsBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("serviceProviderEntityId")
    @get:JsonProperty("serviceProviderEntityId") val serviceProviderEntityId: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("assertionConsumerServiceURL")
    @get:JsonProperty("assertionConsumerServiceURL") val assertionConsumerServiceURL: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("spPrivateKeyAlias")
    @get:JsonProperty("spPrivateKeyAlias") val spPrivateKeyAlias: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("keyStorePassword")
    @get:JsonProperty("keyStorePassword") val keyStorePassword: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("defaultRedirectUrl")
    @get:JsonProperty("defaultRedirectUrl") val defaultRedirectUrl: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("userIDAttribute")
    @get:JsonProperty("userIDAttribute") val userIDAttribute: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("useEncryption")
    @get:JsonProperty("useEncryption") val useEncryption: SamlConfigurationPropertyItemsBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("createUser")
    @get:JsonProperty("createUser") val createUser: SamlConfigurationPropertyItemsBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addGroupMemberships")
    @get:JsonProperty("addGroupMemberships") val addGroupMemberships: SamlConfigurationPropertyItemsBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("groupMembershipAttribute")
    @get:JsonProperty("groupMembershipAttribute") val groupMembershipAttribute: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("defaultGroups")
    @get:JsonProperty("defaultGroups") val defaultGroups: SamlConfigurationPropertyItemsArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("nameIdFormat")
    @get:JsonProperty("nameIdFormat") val nameIdFormat: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("synchronizeAttributes")
    @get:JsonProperty("synchronizeAttributes") val synchronizeAttributes: SamlConfigurationPropertyItemsArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("handleLogout")
    @get:JsonProperty("handleLogout") val handleLogout: SamlConfigurationPropertyItemsBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("logoutUrl")
    @get:JsonProperty("logoutUrl") val logoutUrl: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("clockTolerance")
    @get:JsonProperty("clockTolerance") val clockTolerance: SamlConfigurationPropertyItemsLong? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("digestMethod")
    @get:JsonProperty("digestMethod") val digestMethod: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("signatureMethod")
    @get:JsonProperty("signatureMethod") val signatureMethod: SamlConfigurationPropertyItemsString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("userIntermediatePath")
    @get:JsonProperty("userIntermediatePath") val userIntermediatePath: SamlConfigurationPropertyItemsString? = null
) {

}

