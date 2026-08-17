@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SamlConfigurationInfo(
    @field:JsonProperty("pid")
    val pid: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("bundle_location")
    val bundleLocation: kotlin.String? = null,

    @field:JsonProperty("service_location")
    val serviceLocation: kotlin.String? = null,

    @field:JsonProperty("properties")
    val properties: SamlConfigurationProperties? = null,

)
