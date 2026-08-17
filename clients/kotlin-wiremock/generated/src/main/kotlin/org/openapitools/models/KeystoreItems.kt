@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeystoreItems(
    @field:JsonProperty("alias")
    val alias: kotlin.String? = null,

    @field:JsonProperty("entryType")
    val entryType: kotlin.String? = null,

    @field:JsonProperty("algorithm")
    val algorithm: kotlin.String? = null,

    @field:JsonProperty("format")
    val format: kotlin.String? = null,

    @field:JsonProperty("chain")
    val chain: kotlin.collections.List<KeystoreChainItems>? = null,

)
