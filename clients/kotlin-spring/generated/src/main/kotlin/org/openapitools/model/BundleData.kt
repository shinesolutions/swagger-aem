package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BundleDataProp
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
 * @param id Bundle ID
 * @param name Bundle name
 * @param fragment Is bundle a fragment
 * @param stateRaw Numeric raw bundle state value
 * @param state Bundle state value
 * @param version Bundle version
 * @param symbolicName Bundle symbolic name
 * @param category Bundle category
 * @param props 
 */
data class BundleData(

    @Schema(description = "Bundle ID")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.Int? = null,

    @Schema(description = "Bundle name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "Is bundle a fragment")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("fragment")
    @get:JsonProperty("fragment") val fragment: kotlin.Boolean? = null,

    @Schema(description = "Numeric raw bundle state value")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("stateRaw")
    @get:JsonProperty("stateRaw") val stateRaw: kotlin.Int? = null,

    @Schema(description = "Bundle state value")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("state")
    @get:JsonProperty("state") val state: kotlin.String? = null,

    @Schema(description = "Bundle version")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("version")
    @get:JsonProperty("version") val version: kotlin.String? = null,

    @Schema(description = "Bundle symbolic name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("symbolicName")
    @get:JsonProperty("symbolicName") val symbolicName: kotlin.String? = null,

    @Schema(description = "Bundle category")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("category")
    @get:JsonProperty("category") val category: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("props")
    @get:JsonProperty("props") val props: kotlin.collections.List<BundleDataProp>? = null
) {

}

