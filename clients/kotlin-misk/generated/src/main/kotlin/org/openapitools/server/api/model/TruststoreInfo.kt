package org.openapitools.server.api.model

import org.openapitools.server.api.model.TruststoreItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TruststoreInfo(
    val aliases: kotlin.collections.List<TruststoreItems>? = null,
    /** False if truststore don&#39;t exist */
    val exists: kotlin.Boolean? = null
)
