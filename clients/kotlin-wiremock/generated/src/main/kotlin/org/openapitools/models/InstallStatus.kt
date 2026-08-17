@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InstallStatus(
    @field:JsonProperty("status")
    val status: InstallStatusStatus? = null,

)
