package org.openapitools.server.api.model

import org.openapitools.server.api.model.BundleData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BundleInfo(
    /** Status description of all bundles */
    val status: kotlin.String? = null,
    val s: kotlin.collections.List<kotlin.Int>? = null,
    val `data`: kotlin.collections.List<BundleData>? = null
)
