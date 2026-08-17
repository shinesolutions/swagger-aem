@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SamlConfigurationPropertyItemsBoolean(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("optional")
    val optional: kotlin.Boolean? = null,

    @field:JsonProperty("is_set")
    val isSet: kotlin.Boolean? = null,

    @field:JsonProperty("type")
    val type: kotlin.Int? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.Boolean? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
