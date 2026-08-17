package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BundleDataProp(
    /** Bundle data key */
    val key: kotlin.String? = null,
    /** Bundle data value */
    val `value`: kotlin.String? = null
)
