package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.KeystoreChainItems
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
 * @param alias Keystore alias name
 * @param entryType e.g. \"privateKey\"
 * @param algorithm e.g. \"RSA\"
 * @param format e.g. \"PKCS#8\"
 * @param chain 
 */
data class KeystoreItems(

    @Schema(description = "Keystore alias name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("alias")
    @get:JsonProperty("alias") val alias: kotlin.String? = null,

    @Schema(description = "e.g. \"privateKey\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("entryType")
    @get:JsonProperty("entryType") val entryType: kotlin.String? = null,

    @Schema(description = "e.g. \"RSA\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("algorithm")
    @get:JsonProperty("algorithm") val algorithm: kotlin.String? = null,

    @Schema(description = "e.g. \"PKCS#8\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("format")
    @get:JsonProperty("format") val format: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("chain")
    @get:JsonProperty("chain") val chain: kotlin.collections.List<KeystoreChainItems>? = null
) {

}

