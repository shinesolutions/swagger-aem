package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeystoreItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeystoreInfo(
    val aliases: kotlin.collections.List<KeystoreItems>? = null,
    /** False if truststore don&#39;t exist */
    val exists: kotlin.Boolean? = null
)
