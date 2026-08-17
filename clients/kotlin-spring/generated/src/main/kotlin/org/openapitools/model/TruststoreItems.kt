package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param alias Truststore alias name
 * @param entryType 
 * @param subject e.g. \"CN=localhost\"
 * @param issuer e.g. \"CN=Admin\"
 * @param notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
 * @param notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
 * @param serialNumber 18165099476682912368
 */
data class TruststoreItems(

    @Schema(description = "Truststore alias name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("alias")
    @get:JsonProperty("alias") val alias: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("entryType")
    @get:JsonProperty("entryType") val entryType: kotlin.String? = null,

    @Schema(description = "e.g. \"CN=localhost\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("subject")
    @get:JsonProperty("subject") val subject: kotlin.String? = null,

    @Schema(description = "e.g. \"CN=Admin\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("issuer")
    @get:JsonProperty("issuer") val issuer: kotlin.String? = null,

    @Schema(description = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("notBefore")
    @get:JsonProperty("notBefore") val notBefore: kotlin.String? = null,

    @Schema(description = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("notAfter")
    @get:JsonProperty("notAfter") val notAfter: kotlin.String? = null,

    @Schema(description = "18165099476682912368")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("serialNumber")
    @get:JsonProperty("serialNumber") val serialNumber: kotlin.Int? = null
) {

}

