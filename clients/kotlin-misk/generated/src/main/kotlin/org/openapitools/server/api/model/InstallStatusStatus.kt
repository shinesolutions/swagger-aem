package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InstallStatusStatus(
    val finished: kotlin.Boolean? = null,
    val itemCount: kotlin.Int? = null
)
