@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BundleInfo(
    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("s")
    val s: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<BundleData>? = null,

)
