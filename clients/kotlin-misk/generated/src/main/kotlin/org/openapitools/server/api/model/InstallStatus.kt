package org.openapitools.server.api.model

import org.openapitools.server.api.model.InstallStatusStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InstallStatus(
    val status: InstallStatusStatus? = null
)
