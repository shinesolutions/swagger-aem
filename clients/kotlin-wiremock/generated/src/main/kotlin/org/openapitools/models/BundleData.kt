@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BundleData(
    @field:JsonProperty("id")
    val id: kotlin.Int? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("fragment")
    val fragment: kotlin.Boolean? = null,

    @field:JsonProperty("stateRaw")
    val stateRaw: kotlin.Int? = null,

    @field:JsonProperty("state")
    val state: kotlin.String? = null,

    @field:JsonProperty("version")
    val version: kotlin.String? = null,

    @field:JsonProperty("symbolicName")
    val symbolicName: kotlin.String? = null,

    @field:JsonProperty("category")
    val category: kotlin.String? = null,

    @field:JsonProperty("props")
    val props: kotlin.collections.List<BundleDataProp>? = null,

)
