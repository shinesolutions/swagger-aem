package org.openapitools.server.api.model

import org.openapitools.server.api.model.BundleDataProp
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BundleData(
    /** Bundle ID */
    val id: kotlin.Int? = null,
    /** Bundle name */
    val name: kotlin.String? = null,
    /** Is bundle a fragment */
    val fragment: kotlin.Boolean? = null,
    /** Numeric raw bundle state value */
    val stateRaw: kotlin.Int? = null,
    /** Bundle state value */
    val state: kotlin.String? = null,
    /** Bundle version */
    val version: kotlin.String? = null,
    /** Bundle symbolic name */
    val symbolicName: kotlin.String? = null,
    /** Bundle category */
    val category: kotlin.String? = null,
    val props: kotlin.collections.List<BundleDataProp>? = null
)
