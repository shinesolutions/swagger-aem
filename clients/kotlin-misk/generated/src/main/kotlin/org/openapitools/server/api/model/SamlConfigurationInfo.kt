package org.openapitools.server.api.model

import org.openapitools.server.api.model.SamlConfigurationProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SamlConfigurationInfo(
    /** Persistent Identity (PID) */
    val pid: kotlin.String? = null,
    /** Title */
    val title: kotlin.String? = null,
    /** Title */
    val description: kotlin.String? = null,
    /** needed for configuration binding */
    val bundleLocation: kotlin.String? = null,
    /** needed for configuraiton binding */
    val serviceLocation: kotlin.String? = null,
    val properties: SamlConfigurationProperties? = null
)
