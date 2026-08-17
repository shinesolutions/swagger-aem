@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeystoreChainItems(
    @field:JsonProperty("subject")
    val subject: kotlin.String? = null,

    @field:JsonProperty("issuer")
    val issuer: kotlin.String? = null,

    @field:JsonProperty("notBefore")
    val notBefore: kotlin.String? = null,

    @field:JsonProperty("notAfter")
    val notAfter: kotlin.String? = null,

    @field:JsonProperty("serialNumber")
    val serialNumber: kotlin.Int? = null,

)
