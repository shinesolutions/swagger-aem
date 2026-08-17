@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TruststoreInfo(
    @field:JsonProperty("aliases")
    val aliases: kotlin.collections.List<TruststoreItems>? = null,

    @field:JsonProperty("exists")
    val exists: kotlin.Boolean? = null,

)
