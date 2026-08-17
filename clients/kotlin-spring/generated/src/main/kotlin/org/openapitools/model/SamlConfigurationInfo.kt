package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.SamlConfigurationProperties
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
 * @param pid Persistent Identity (PID)
 * @param title Title
 * @param description Title
 * @param bundleLocation needed for configuration binding
 * @param serviceLocation needed for configuraiton binding
 * @param properties 
 */
data class SamlConfigurationInfo(

    @Schema(description = "Persistent Identity (PID)")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pid")
    @get:JsonProperty("pid") val pid: kotlin.String? = null,

    @Schema(description = "Title")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(description = "Title")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(description = "needed for configuration binding")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bundle_location")
    @get:JsonProperty("bundle_location") val bundleLocation: kotlin.String? = null,

    @Schema(description = "needed for configuraiton binding")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service_location")
    @get:JsonProperty("service_location") val serviceLocation: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("properties")
    @get:JsonProperty("properties") val properties: SamlConfigurationProperties? = null
) {

}

