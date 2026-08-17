@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InstallStatusStatus(
    @field:JsonProperty("finished")
    val finished: kotlin.Boolean? = null,

    @field:JsonProperty("itemCount")
    val itemCount: kotlin.Int? = null,

)
